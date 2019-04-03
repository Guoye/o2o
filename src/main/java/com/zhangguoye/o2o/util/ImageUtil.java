package com.zhangguoye.o2o.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
//	获取资源路径
	public static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//	simpleDateFormat
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

	/**
	 * 
	 * @param commonsMultipartFile 上传的文件
	 * @param targetPath           生成文件的目标子路径（相对基础路径）
	 * @return
	 */
	public static String generateThumbnailator(CommonsMultipartFile commonsMultipartFile, String targetPath) {
		String imageName = getRandomFileName();
		String extensionName = getExtensionName(commonsMultipartFile);
		
		makeDirPath(targetPath);
		String destPath = PathUtil.getImgBasePath() + targetPath + imageName + extensionName;
		
		try {
			Thumbnails.of(commonsMultipartFile.getInputStream()).size(1000, 1000).outputQuality(0.8)
					.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/Guoye.png")), 0.9f)
					.toFile(new File(destPath));
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

		return destPath;
	}

	/**
	 * 创建目标目录
	 * @param targetPath
	 */
	private static void makeDirPath(String targetPath) {
		File filePath = new File(PathUtil.getImgBasePath()+targetPath);
		if (!filePath.exists()) {
			filePath.mkdirs();
		}
	}

	/**
	 * 获取文件名的扩展名
	 * 
	 * @param commonsMultipartFile
	 * @return
	 */
	private static String getExtensionName(CommonsMultipartFile commonsMultipartFile) {
		String fileName = commonsMultipartFile.getOriginalFilename();
		return fileName.substring(fileName.lastIndexOf("."));
	}

	/**
	 * 生成随机名字 当前时间+5位随机数
	 * 
	 * @return
	 */
	private static String getRandomFileName() {
		String name = (Math.random() * 89999 + 10000) + simpleDateFormat.format(new Date());
		return name;
	}

//	测试方法
	public static void main(String[] args) {
		basePath = basePath.replace("%20", " ");
		System.out.println(basePath);
		try {
			Thumbnails.of(new File("/Users/zhangguoye/Desktop/博客图片资源/ssm.jpeg")).size(1000, 1000).outputQuality(0.8)
					.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/Guoye.png")), 0.9f)
					.toFile(new File("/Users/zhangguoye/Desktop/博客图片资源/thumbnail.jpg"));
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
