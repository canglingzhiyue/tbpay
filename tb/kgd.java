package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okio.c;
import okio.e;

/* loaded from: classes7.dex */
public class kgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context.getExternalCacheDir() == null) {
            str = context.getCacheDir().getAbsolutePath() + File.separator + kga.MODULE_NAME;
        } else {
            str = context.getExternalCacheDir().getAbsolutePath() + File.separator + kga.MODULE_NAME;
        }
        a(str);
        return str;
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                return;
            }
            file.mkdirs();
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str2);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (!file.exists() && !file.createNewFile()) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    fileOutputStream2.write(str.getBytes());
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        Log.e("CodeTrack_FileUtil", e.toString());
                    }
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("CodeTrack_FileUtil", e.toString());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            Log.e("CodeTrack_FileUtil", e3.toString());
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Log.e("CodeTrack_FileUtil", e4.toString());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static File b(Context context) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{context});
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || !cacheDir.isDirectory()) {
            Log.e("CodeTrack_FileUtil", "context.getCacheDir() not available");
            throw new IllegalStateException("context.getCacheDir() not available");
        }
        File file = new File(cacheDir, String.valueOf(System.nanoTime()));
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            String str = "parentFile.mkdirs() == " + parentFile.mkdirs();
        }
        String str2 = "targetFile.createNewFile() == " + file.createNewFile();
        String str3 = "targetFile.getPath() == " + file.getPath();
        return file;
    }

    public static void a(byte[] bArr, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e396b266", new Object[]{bArr, file});
            return;
        }
        c cVar = null;
        try {
            cVar = e.a(e.a(file));
            cVar.c(bArr);
            cVar.flush();
            if (cVar == null) {
                return;
            }
            try {
                cVar.close();
            } catch (IOException e) {
                Log.e("CodeTrack_FileUtil", "close sink error", e);
            }
        } catch (Throwable th) {
            try {
                Log.e("CodeTrack_FileUtil", "write sink error", th);
                if (cVar == null) {
                    return;
                }
                try {
                    cVar.close();
                } catch (IOException e2) {
                    Log.e("CodeTrack_FileUtil", "close sink error", e2);
                }
            } catch (Throwable th2) {
                if (cVar != null) {
                    try {
                        cVar.close();
                    } catch (IOException e3) {
                        Log.e("CodeTrack_FileUtil", "close sink error", e3);
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }
}
