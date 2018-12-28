package lgrass.com.lgrassservice;

import android.util.Log;

public class LogUtil {
    public   static final String TAG_LSERVICE  = "LGRASS";

    public  static  void  LogV(String tag, String msg) {
        Log.v(tag,msg);
    }

    public  static  void  LogI(String tag,String msg){
        Log.i(tag,msg);
    }

    public  static  void  LogD(String tag,String msg) {
        Log.d(tag,msg);
    }

    public  static  void  LogW(String tag,String msg) {
        Log.w(tag,msg);
    }

    public  static  void  LogE(String tag,String msg) {
        Log.e(tag,msg);
    }
}
