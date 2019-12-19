package 应用.url连接;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
/**
 *  根据图片的地址，下载图片，然后获取图片的宽高比。
 */
public class ImageDownLoad {
	public static void main(String[] args) {
		String imageUrl="http://wx.topcang.cn/statics/attachment/cms/201609291146108093_thumbnail.jpg";
		float scale=downLoad(imageUrl);
		System.out.println("scale="+scale);
	}
	private static float downLoad(String imageUrl){
		float scale = 0;
		try {
			URL url=new URL(imageUrl);
			URLConnection connection=url.openConnection();
			InputStream input=connection.getInputStream();
			BufferedImage bufferedImage=ImageIO.read(input);
			float srcW = bufferedImage.getWidth();
			float srcH = bufferedImage.getHeight();
			scale=srcW/srcH;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scale;
		
	}
}
