package demo;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * Created by maogou on 2017/5/7.
 */
public class Demo {
    public static void main(String[] args){
        System.out.println("某视的视频加密破解方法尝试");
        String md5 = toMd5("64586592,1494142553,bh65OzqYYYmHRQ");
        System.out.println(md5);
    }

    public static String toHexString(byte[] paramArrayOfByte){
        StringBuilder localStringBuilder = new StringBuilder();
        int m = paramArrayOfByte.length;
        int i= 0;
        for(;;){
            if (i >= m){
                return localStringBuilder.toString();
            }
            int k = paramArrayOfByte[i];
            int j = k;
            if (k < 0 ){
                j = k + 256;
            }

            if (j < 16) {
                localStringBuilder.append("0");
            }
            localStringBuilder.append(Integer.toHexString(j));
            i += 1;
        }
    }

    public static String toMd5(String paramString){
        try{
            MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
            localMessageDigest.reset();
            localMessageDigest.update(paramString.getBytes("utf-8"));
            paramString = toHexString(localMessageDigest.digest());
            return paramString;
        } catch (NoSuchAlgorithmException exceptionMsg){
            throw new RuntimeException(exceptionMsg);
        } catch (UnsupportedEncodingException exceptionMsg){
            exceptionMsg.printStackTrace();
        }
        return  "";
    }
}
