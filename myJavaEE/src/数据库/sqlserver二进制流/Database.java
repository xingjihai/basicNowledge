package 数据库.sqlserver二进制流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import 高级应用.文件.AccessRTF;
import 高级应用.文件.OfficeFileParserUtils;

public class Database {
       
    public static void main(String[] args) {
//        byte[] MyData = new byte[0];
//        using (SqlConnection conn = new SqlConnection(sqlconnstr))
//        {
//            conn.Open();
//            SqlCommand cmd = new SqlCommand();
//            cmd.Connection = conn;
//            cmd.CommandText = "select * from T_img";
//            SqlDataReader sdr = cmd.ExecuteReader();
//            sdr.Read();
//            MyData = (byte[])sdr["ImgFile"];//读取第一个图片的位流
//            int ArraySize= MyData.GetUpperBound(0);//获得数据库中存储的位流数组的维度上限，用作读取流的上限
//
//            FileStream fs = new FileStream(@"c:\00.jpg", FileMode.OpenOrCreate, FileAccess.Write);
//            fs.Write(MyData, 0, ArraySize);
//            fs.Close();   //-- 写入到c:\00.jpg。
//            conn.Close();
//            Console.WriteLine("读取成功");//查看硬盘上的文件
//        }
        String URL = "jdbc:sqlserver://localhost:1433;databasename=sf148";
        String USER = "sa";
        String PASSWORD = "123456";
        try {
            //1.加载驱动程序
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. 获得数据库连接
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.操作数据库，实现增删改查
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT user_name, age FROM imooc_goddess");
            //如果有数据，rs.next()返回true
            while(rs.next()){
                System.out.println(rs.getString("user_name")+" 年龄："+rs.getInt("age"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void mysql(){
        String URL = "jdbc:mysql://localhost:3306/12348sjf";
        String USER = "root";
        String PASSWORD = "123456";
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获得数据库连接
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.操作数据库，实现增删改查
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DOCDESCRIBE FROM DOCUMENT");
            //如果有数据，rs.next()返回true
            while(rs.next()){
                System.out.println(rs.getString("user_name")+" 年龄："+rs.getInt("age"));
            }
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 读取sqlserver中的image 转二进制流 然后输出文件
     */
    @Test
    public void sqlserver(){
        String URL = "jdbc:sqlserver://127.0.0.1:1433;databasename=sf148";
        String USER = "sa";
        String PASSWORD = "123456";
        try {
            //1.加载驱动程序
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. 获得数据库连接
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.操作数据库，实现增删改查
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT  DOCDESCRIBE FROM DOCUMENT where DOCID like '18%' ORDER BY DOCID ASC");
            //如果有数据，rs.next()返回true
            int id = 0;
            while(rs.next()){
                id++;
                InputStream is = null;
                FileOutputStream fiso = null;
                try {
                    File file = new File("D:/test");
                    if(!file.exists()){
                        file.mkdirs();
                    }
                     is=rs.getBinaryStream("DOCDESCRIBE");          /**二进制流！！！*/
                     if(is == null || is.available() == 0){
                         continue;
                     }
                     
                     fiso=new FileOutputStream("D://test/" + id+".doc");
                    int l=0;
                    byte b[] = new byte[1024000];
                    while ((l=is.read(b))!=-1) {
                        fiso.write(b,0,l);
                    }
                    
                    fiso.flush();
                   
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally{
                    try {
                        if(fiso != null)
                        fiso.close();
                        if(is != null)
                        is.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    @Test
    public void readDocument(){
        String URL = "jdbc:sqlserver://127.0.0.1:1433;databasename=sf148";
        String USER = "sa";
        String PASSWORD = "123456";
        try {
            //1.加载驱动程序
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. 获得数据库连接
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //3.操作数据库，实现增删改查
            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT top 1 DOCDESCRIBE FROM DOCUMENT ORDER BY DOCID ASC");
            ResultSet rs = stmt.executeQuery("SELECT DOCDESCRIBE FROM DOCUMENT where DOCID='0101' ORDER BY DOCID ASC");
            //如果有数据，rs.next()返回true
            while(rs.next()){
                InputStream is = null;
                try {
                    File file = new File("D:/test");
                    if(!file.exists()){
                        file.mkdirs();
                    }
                     is=rs.getBinaryStream("DOCDESCRIBE");          /**二进制流！！！*/
                     if(is == null || is.available() == 0){
                         continue;
                     }
                     AccessRTF.readRtf(is);
//                     OfficeFileParserUtils.reaDoc2(is);
                     
                   
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally{
                    try {
                        if(is != null)
                        is.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
