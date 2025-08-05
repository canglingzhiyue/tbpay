package com.uc.webview.base.io;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.bgy;
import tb.iju;

/* loaded from: classes9.dex */
public final class PathUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f23784a = new HashMap();

    public static b a(Context context, String str) {
        return new b(new File(d(context), "lckdlb"), false, str);
    }

    public static c a(File file) {
        return a(file, ".unz");
    }

    private static c a(File file, String str) {
        return new c(file, str);
    }

    public static File a(Context context) {
        return new File(d(context), "stsdt");
    }

    public static File a(Context context, File file) {
        return d.a(e(context), generateName(file));
    }

    public static File a(Context context, String str, long j, long j2) {
        return d.a(e(context), generateName(str, j, j2));
    }

    public static File a(String str) {
        return new File(str, "libkernelu4_7z_uc.so");
    }

    public static Object a() {
        return "lckdlb";
    }

    public static c b(File file) {
        return a(file, ".wvf" + EnvInfo.d());
    }

    public static File b(Context context) {
        return new File(d(context), EnvInfo.is64Bit() ? "lci64" : "lci");
    }

    public static String b() {
        return ".ncd" + EnvInfo.d();
    }

    public static String b(String str) {
        return String.valueOf(str.hashCode()).replace('-', '_');
    }

    public static c c(File file) {
        return a(file, ".fc");
    }

    public static File c(Context context) {
        return a(context.getApplicationInfo().nativeLibraryDir);
    }

    public static File d(Context context) {
        return d.a(new File(getDirRoot(context), ".inner"));
    }

    public static File d(File file) {
        if (file == null) {
            return null;
        }
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.endsWith(bgy.SO_EXTENSION)) {
            try {
                File parentFile = file.getParentFile().getParentFile().getParentFile();
                if (parentFile != null) {
                    return parentFile;
                }
            } catch (Throwable unused) {
            }
        }
        return file.getParentFile();
    }

    public static File e(Context context) {
        return d.a(new File(getDirRoot(context), "dlibs"));
    }

    public static File f(Context context) {
        return d.a(new File(getDirRoot(context), "player"));
    }

    public static File g(Context context) {
        return d.a(new File(getDirRoot(context), "cpn"));
    }

    public static String generateName(File file) {
        return generateName(file.getAbsolutePath(), file.length(), file.lastModified());
    }

    public static String generateName(String str, long j, long j2) {
        String b = b(str.hashCode() + "_" + j + "_" + j2);
        if (!f23784a.containsKey(b)) {
            Map<String, String> map = f23784a;
            map.put(b, str + "`" + j + "`" + j2);
        }
        return b;
    }

    public static File getDirCache(Context context) {
        return d.a(new File(getDirRoot(context), ".cache"));
    }

    public static File getDirCacheUpdate(Context context) {
        return d.a(getDirCache(context), "upd");
    }

    public static File getDirCoreLib(File file) {
        return new File(new File(file, "lib"), EnvInfo.is64Bit() ? iju.ABI_ARM64 : iju.ABI_ARM);
    }

    public static File getDirRoot(Context context) {
        return d.a(context.getDir("u4sdk", 0));
    }

    public static File getFileCoreDex(File file) {
        return new File(file, "core.jar");
    }

    public static File getFileCoreLib(File file) {
        return new File(file, "libwebviewuc.so");
    }

    public static File getFileJsiLib(File file) {
        return new File(file, "libjsi.so");
    }

    public static File h(Context context) {
        return new File(getDirRoot(context), ".u4patch");
    }

    public static File i(Context context) {
        return d.a(getDirCache(context), "unz");
    }
}
