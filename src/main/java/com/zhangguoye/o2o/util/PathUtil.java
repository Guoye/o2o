package com.zhangguoye.o2o.util;

public class PathUtil {
//	获取当前系统使用的文件夹名分隔符号 win: \  , linux/Mac /
	private static String seperator = System.getProperty("file.separator");

	/**
	 * 获取图片存放在基础路径
	 * 
	 * @return
	 */
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/projects/upload";
		} else {
			basePath = "/Users/zhangguoye/Documents/Porject/Eclipse Project/o2o/uploads";
		}
		// 替换分隔符
		basePath = basePath.replace("/", seperator);
		// 处理空格
		basePath = basePath.replace("%20", " ");
		return basePath;
	}

	/**
	 * 获取商铺图片存放的子路径（相对基础路径）
	 * 
	 * @param shopId
	 * @return
	 */
	public static String getShopImgPath(Long shopId) {
		String imagePath = "/shop/" + shopId + "/";
		return imagePath;
	}

	public static void main(String[] args) {
		System.out.println(System.getProperty("os.name"));
	}
}
