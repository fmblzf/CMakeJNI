package fmblzf.cmakejni.ndk;

/**
 * Created by Administrator on 2017/5/25.
 */

public class CMakeNative {

    /**
     * 静态加载.so文件
     * 注意加载的so文件名称和build.gradle中的moduleName保持一致
     * 即没有lib前缀的文件名
     */
    static {
        System.loadLibrary("fm");
    }
    /**
     * 测试.so文件链接成功
     * @param str
     * @return
     */
    public static native String test(String str);
}
