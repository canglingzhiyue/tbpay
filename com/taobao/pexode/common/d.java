package com.taobao.pexode.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.bgy;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Context f18686a;

    static {
        kge.a(1042329868);
        f18686a = null;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f18686a = context;
        }
    }

    public static boolean a(String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{str, new Integer(i)})).booleanValue();
        }
        String b = b(str, i);
        File file = new File(b);
        if (file.exists()) {
            try {
                System.load(b);
            } catch (Throwable unused) {
                file.delete();
            }
            if (!z || NdkCore.a("mips") || NdkCore.a("x86")) {
                return z;
            }
            try {
                return c(str, i);
            } catch (IOException e) {
                e.printStackTrace();
                return z;
            }
        }
        z = false;
        return !z ? z : z;
    }

    public static String b(String str, int i) {
        String path;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29616b0", new Object[]{str, new Integer(i)});
        }
        Context context = f18686a;
        if (context == null) {
            return "";
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            path = "/data/data/" + f18686a.getPackageName() + "/files";
        } else {
            path = filesDir.getPath();
        }
        return path + "/lib" + str + "_bk_" + i + bgy.SO_EXTENSION;
    }

    public static boolean c(String str, int i) throws IOException {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7926cad3", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (f18686a == null) {
            return false;
        }
        String str2 = "lib/armeabi/lib" + str + bgy.SO_EXTENSION;
        String b = b(str, i);
        ApplicationInfo applicationInfo = f18686a.getApplicationInfo();
        ZipFile zipFile = new ZipFile(applicationInfo != null ? applicationInfo.sourceDir : "");
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            if (nextElement.getName().startsWith(str2)) {
                InputStream inputStream = null;
                try {
                    File file = new File(b);
                    if (file.exists()) {
                        file.delete();
                    }
                    InputStream inputStream2 = zipFile.getInputStream(nextElement);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = null;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        int i2 = 0;
                        while (true) {
                            int read = inputStream2.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            i2 += read;
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            fileOutputStream.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            zipFile.close();
                        } catch (Exception unused3) {
                        }
                        if (i2 > 0) {
                            try {
                                System.load(b);
                                return true;
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused5) {
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (Exception unused6) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            }
        }
        return false;
    }
}
