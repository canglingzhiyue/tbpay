package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.mnn.utils.d;
import com.etao.feimagesearch.util.i;
import com.etao.feimagesearch.util.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class cst {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLT_CACHE_DIR = "image_search";

    static {
        kge.a(1924169207);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str}) : a(context, str, "");
    }

    private static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            File b = b(context, r.a(str) + str2);
            if (b != null && b.exists() && b.length() > 0) {
                cot.c("LocalCacheFileManager", "find file " + b.getAbsolutePath());
                return b.getAbsolutePath();
            }
        }
        return "";
    }

    public static String a(Application application, String str, String str2) {
        File b;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2476d6f5", new Object[]{application, str, str2});
        }
        if (application == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (b = b(application, r.a(str))) == null || !b.exists() || b.length() == 0) {
            return "";
        }
        BufferedInputStream bufferedInputStream2 = null;
        int length = (int) b.length();
        byte[] bArr = new byte[length];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(b));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedInputStream.read(bArr, 0, length);
            d.a(bufferedInputStream);
            if (!TextUtils.equals(r.b(bArr), str2)) {
                i.a(b);
                return "";
            }
            cot.c("LocalCacheFileManager", "findModelFileWithMd5: " + b.getAbsolutePath());
            return b.getAbsolutePath();
        } catch (Exception unused2) {
            bufferedInputStream2 = bufferedInputStream;
            d.a(bufferedInputStream2);
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            d.a(bufferedInputStream2);
            throw th;
        }
    }

    public static String a(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a0ffc4f", new Object[]{context, str, bArr}) : a(context, str, bArr, "");
    }

    private static String a(Context context, String str, byte[] bArr, String str2) {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e37205", new Object[]{context, str, bArr, str2});
        }
        if (context != null && !TextUtils.isEmpty(str) && bArr != null && bArr.length != 0) {
            String str3 = r.a(str) + str2;
            String a2 = a(context);
            File file = new File(a2);
            if (!file.exists() && !file.mkdirs()) {
                return "";
            }
            File file2 = new File(a2, str3);
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    bufferedOutputStream.write(bArr, 0, bArr.length);
                    cot.c("LocalCacheFileManager", "saveFile: " + file2.getAbsolutePath());
                    String absolutePath = file2.getAbsolutePath();
                    d.a(bufferedOutputStream);
                    return absolutePath;
                } catch (IOException unused) {
                    bufferedOutputStream2 = bufferedOutputStream;
                    d.a(bufferedOutputStream2);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    d.a(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                bufferedOutputStream = null;
                th = th3;
            }
        }
        return "";
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        File cacheDir = context.getCacheDir();
        if (b.dg()) {
            return cacheDir.getAbsolutePath() + File.separator + "image_search";
        }
        return cacheDir.getAbsolutePath();
    }

    private static File b(Context context, String str) {
        File cacheDir;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4a8e03a4", new Object[]{context, str});
        }
        File file = new File(context.getCacheDir().getAbsolutePath(), str);
        if (b.dg()) {
            String str2 = cacheDir.getAbsolutePath() + File.separator + "image_search";
            File file2 = new File(str2);
            if ((!file2.exists() || !file2.isDirectory()) && !file2.mkdirs()) {
                cot.c("LocalCacheFileManager", "create parent file failed " + file2.getAbsolutePath());
                return null;
            }
            File file3 = new File(str2, str);
            if (file3.exists()) {
                if (file.exists()) {
                    cot.c("LocalCacheFileManager", "target file exist, old file delete " + file.getAbsolutePath());
                    file.delete();
                }
                return file3;
            } else if (file.exists() && i.a(file.getAbsolutePath(), file3)) {
                cot.c("LocalCacheFileManager", "target file not exist, copy old file success");
                file.delete();
                return file3;
            } else {
                cot.c("LocalCacheFileManager", "old file not exist or copy failed");
                return null;
            }
        } else if (file.exists()) {
            cot.c("LocalCacheFileManager", "use old file " + file.getAbsolutePath());
            return file;
        } else {
            cot.c("LocalCacheFileManager", "old file not exist");
            return null;
        }
    }
}
