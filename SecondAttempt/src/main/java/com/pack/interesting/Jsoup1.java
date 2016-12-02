package com.pack.interesting;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * Created by 10108701 on 2016/11/18.
 */
public class Jsoup1 {
    public static void main(String[] args) {
        //网址
        String url2 = "http://www.cnblogs.com/lindp/p/4484390.html";
        Set<String> set = getImgUrls(url2);
        downImg(set);
    }
    /*
    * 获取图片地址
    */
    public static Set<String> getImgUrls(String url) {
        Set<String> set = new HashSet<String>();
        try {
            //获取文本对象
            Document dom = Jsoup.parse(new URL(url), 500000);
            //根据标签名获取
            Elements es3 = dom.getElementsByTag("img");
            System.out.println(es3.size());
            for (Element e : es3) {
            //获取图片地址
                String img_url = e.attr("src");
                System.out.println(img_url);
            //筛选出以.jpg格式的图片
                if (img_url.endsWith(".png")) {
                    set.add(img_url);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return set;
    }

    /*
    * 下载图片
    */
    public static void downImg(Set<String> set) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        File file = new File("D:\\pic");
        try {

            if (set.size() != 0) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    //1.获取网址
                    URL u = new URL(it.next());
                    //2.打开连接
                    URLConnection conn = u.openConnection();
                    //3.获取输入流与写出流
                    inputStream = conn.getInputStream();
                    //判断文件是否存在
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    outputStream = new FileOutputStream(new File("D:\\pic\\" + new Date().getTime() + ".jpg"));
                    //4.将源代码写入内存(设置编码)
                    byte[] b = new byte[2048];
                    int len = 0;
                    while ((len = inputStream.read(b)) != -1) {
                        outputStream.write(b, 0, len);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭I/o
            try {
                if (outputStream != null) outputStream.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
