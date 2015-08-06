package br.com.alexpfx.android.lib.base.tag;

/**
 * Created by alexandre on 06/08/15.
 */
public class Tags {
    public static String className() {
        return Thread.currentThread().getStackTrace()[3].getFileName();
    }

    public static String methodName() {
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }


}
