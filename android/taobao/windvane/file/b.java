package android.taobao.windvane.file;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.taobao.windvane.config.j;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNZIP_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private static File f1612a;

    static {
        kge.a(-22737374);
    }

    public static File a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("90186323", new Object[]{context, str});
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (!TextUtils.isEmpty(str)) {
            absolutePath = absolutePath + File.separator + str;
        }
        File file = new File(absolutePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str != null && str2 != null) {
            try {
                return a(new FileInputStream(str), str2);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(InputStream inputStream, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("725e8439", new Object[]{inputStream, str})).booleanValue();
        }
        if (inputStream == null || str == null) {
            return false;
        }
        boolean endsWith = str.endsWith("/");
        ZipInputStream zipInputStream = endsWith;
        if (!endsWith) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            str = sb.toString();
            zipInputStream = sb;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                zipInputStream = new ZipInputStream(inputStream);
                try {
                    byte[] bArr = new byte[1024];
                    StringBuffer stringBuffer = new StringBuffer(200);
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        stringBuffer.append(nextEntry.getName());
                        if (!stringBuffer.toString().contains("../")) {
                            File file = new File(str + stringBuffer.toString());
                            stringBuffer.delete(0, stringBuffer.length());
                            if (nextEntry.isDirectory()) {
                                file.mkdirs();
                            } else {
                                if (!file.getParentFile().exists()) {
                                    file.getParentFile().mkdirs();
                                }
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                while (true) {
                                    try {
                                        int read = zipInputStream.read(bArr, 0, 1024);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, read);
                                    } catch (Exception e) {
                                        e = e;
                                        fileOutputStream = fileOutputStream2;
                                        m.e("FileManager", "unzip: IOException:" + e.getMessage());
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e2) {
                                                m.e("FileManager", "close Stream Exception:" + e2.getMessage());
                                                return false;
                                            }
                                        }
                                        if (zipInputStream != 0) {
                                            zipInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return false;
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e3) {
                                                m.e("FileManager", "close Stream Exception:" + e3.getMessage());
                                                throw th;
                                            }
                                        }
                                        if (zipInputStream != 0) {
                                            zipInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                fileOutputStream2.close();
                                fileOutputStream = fileOutputStream2;
                            }
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            m.e("FileManager", "close Stream Exception:" + e4.getMessage());
                        }
                    }
                    zipInputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return true;
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Exception e6) {
                e = e6;
                zipInputStream = 0;
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a(InputStream inputStream, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34da5162", new Object[]{inputStream, file});
        } else if (inputStream == null || file == null) {
        } else {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    file.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 2048);
                            if (read == -1) {
                                try {
                                    fileOutputStream2.close();
                                    return;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        m.e("FileManager", "copyFile: dest FileNotFoundException:" + e.getMessage());
                        if (fileOutputStream == null) {
                            return;
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        m.e("FileManager", "copyFile: write IOException:" + e.getMessage());
                        if (fileOutputStream == null) {
                            return;
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e7) {
                    e = e7;
                } catch (IOException e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static String a(Application application, String str, String str2, boolean z) {
        File externalCacheDir;
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da22c97", new Object[]{application, str, str2, new Boolean(z)});
        }
        String str3 = null;
        if (z) {
            if (j.commonConfig.aC && Build.VERSION.SDK_INT >= 29) {
                externalCacheDir = application.getExternalFilesDir("apk");
            } else {
                j.a();
                if (j.commonConfig.br) {
                    if (f1612a == null) {
                        f1612a = application.getExternalCacheDir();
                    }
                    externalCacheDir = f1612a;
                } else {
                    externalCacheDir = application.getExternalCacheDir();
                }
            }
            if (externalCacheDir != null) {
                sb = new StringBuilder();
                sb.append(externalCacheDir.getAbsolutePath());
                sb.append(File.separator);
            } else {
                File a2 = android.taobao.windvane.util.a.a(application);
                if (a2 != null) {
                    sb = new StringBuilder();
                    sb.append(a2.getAbsolutePath());
                    sb.append(File.separator);
                } else {
                    sb = null;
                }
            }
            if (!TextUtils.isEmpty(str) && sb != null) {
                sb.append(str);
                sb.append(File.separator);
                sb.append(str2);
                str3 = sb.toString();
            }
        }
        if (str3 == null) {
            str3 = a(application, str, str2);
        }
        m.b("FileManager", "createBaseDir path:" + str3);
        return str3;
    }

    public static String a(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2476d6f5", new Object[]{application, str, str2});
        }
        if (application.getFilesDir() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(application.getCacheDir().getAbsolutePath());
        if (!TextUtils.isEmpty(str)) {
            sb.append(File.separator);
            sb.append(str);
        }
        sb.append(File.separator);
        sb.append(str2);
        String sb2 = sb.toString();
        m.b("FileManager", "createInnerCacheStorage path:" + sb2);
        return sb2;
    }

    public static String b(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbf2b0b6", new Object[]{application, str, str2});
        }
        if (application.getFilesDir() == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(application.getFilesDir().getAbsolutePath());
        if (!TextUtils.isEmpty(str)) {
            sb.append(File.separator);
            sb.append(str);
        }
        sb.append(File.separator);
        sb.append(str2);
        String sb2 = sb.toString();
        m.b("FileManager", "createInnerfileStorage path:" + sb2);
        return sb2;
    }

    public static boolean a(File file, File file2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue() : a(file, file2, (byte[]) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r7.length < 10) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r5, java.io.File r6, byte[] r7) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.file.b.a(java.io.File, java.io.File, byte[]):boolean");
    }
}
