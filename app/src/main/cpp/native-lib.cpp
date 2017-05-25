#include <jni.h>
#include <string>

extern "C"

JNIEXPORT jstring JNICALL
Java_fmblzf_cmakejni_ndk_CMakeNative_test(
        JNIEnv *env,
        jobject /* this */,jstring str) {
    std::string hello = "测试连接是否成功？已经成功！";
    return env->NewStringUTF(hello.c_str());
}
