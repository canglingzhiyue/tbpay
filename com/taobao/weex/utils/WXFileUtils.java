package com.taobao.weex.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.weex.WXEnvironment;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes9.dex */
public class WXFileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(590169531);
    }

    public static String loadFileOrAsset(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69d2e814", new Object[]{str, context});
        }
        String str2 = "weex loadFileOrAsset path " + str;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                return readStreamToString(new FileInputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "";
            }
        }
        return loadAsset(str, context);
    }

    public static String loadAsset(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6777ecd3", new Object[]{str, context});
        }
        String str2 = "weex loadAsset path " + str;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return readStreamToString(AssetsDelegate.proxy_open(context.getAssets(), str));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String readStreamToString(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d6ca476", new Object[]{inputStream});
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                StringBuilder sb = new StringBuilder(inputStream.available() + 10);
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    char[] cArr = new char[4096];
                    while (true) {
                        int read = bufferedReader2.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedReader2.close();
                    } catch (IOException e) {
                        WXLogUtils.e("WXFileUtils loadAsset: ", e);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            WXLogUtils.e("WXFileUtils loadAsset: ", e2);
                        }
                    }
                    return sb2;
                } catch (IOException e3) {
                    e = e3;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    WXLogUtils.e("", e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            WXLogUtils.e("WXFileUtils loadAsset: ", e4);
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                            WXLogUtils.e("WXFileUtils loadAsset: ", e5);
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                            WXLogUtils.e("WXFileUtils loadAsset: ", e6);
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e7) {
                            WXLogUtils.e("WXFileUtils loadAsset: ", e7);
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] readBytesFromAssets(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("22b8bb88", new Object[]{str, context});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
                byte[] bArr = new byte[4096];
                int read = proxy_open.read(bArr);
                byte[] bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
                return bArr2;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static boolean saveFile(String str, byte[] bArr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe988c3b", new Object[]{str, bArr, context})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || bArr == null || context == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    WXLogUtils.e("WXFileUtils saveFile: " + WXLogUtils.getStackTrace(e));
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
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
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String md5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return md5(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String md5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6725db94", new Object[]{bArr});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String base64Md5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcf43da0", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        try {
            return base64Md5(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String base64Md5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("454d0043", new Object[]{bArr});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static void extractSo(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a2cbd8", new Object[]{str, str2});
            return;
        }
        ZipFile zipFile = new ZipFile(str);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                if (!nextEntry.isDirectory() && !nextEntry.getName().contains("../")) {
                    String name = nextEntry.getName();
                    if (name.contains("lib/" + WXEnvironment._cpuType() + "/") && (nextEntry.getName().contains("weex") || nextEntry.getName().equals("libJavaScriptCore.so"))) {
                        String[] split = nextEntry.getName().split("/");
                        String str3 = split[split.length - 1];
                        InputStream inputStream = zipFile.getInputStream(nextEntry);
                        byte[] bArr = new byte[1024];
                        File file = new File(str2 + "/" + str3);
                        if (file.exists()) {
                            file.delete();
                        }
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        while (inputStream.read(bArr) != -1) {
                            fileOutputStream.write(bArr);
                        }
                        fileOutputStream.close();
                    }
                }
            } else {
                zipInputStream.closeEntry();
                return;
            }
        }
    }

    public static void copyFile(File file, File file2) {
        FileOutputStream fileOutputStream;
        Exception e;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13188d46", new Object[]{file, file2});
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                fileOutputStream = new FileOutputStream(file2);
                while (fileInputStream.read(bArr) != -1) {
                    try {
                        fileOutputStream.write(bArr);
                    } catch (Exception e2) {
                        e = e2;
                        WXLogUtils.e("copyFile " + e.getMessage() + ResponseProtocolType.COMMENT + file.getAbsolutePath() + ResponseProtocolType.COMMENT + file2.getAbsolutePath());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            return;
                        }
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return;
                        }
                    }
                }
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Exception e5) {
                fileOutputStream = null;
                e = e5;
            }
        } catch (Exception e6) {
            fileOutputStream = null;
            e = e6;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static void copyFileWithException(File file, File file2) throws Exception {
        FileInputStream fileInputStream;
        ?? r2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201e5cd", new Object[]{file, file2});
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                r2 = new FileOutputStream(file2);
                while (fileInputStream.read(bArr) != -1) {
                    try {
                        r2.write(bArr);
                    } catch (Exception e) {
                        e = e;
                        fileInputStream2 = fileInputStream;
                        r2 = r2;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            fileInputStream2 = r2;
                            closeIo(fileInputStream);
                            closeIo(fileInputStream2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = r2;
                        closeIo(fileInputStream);
                        closeIo(fileInputStream2);
                        throw th;
                    }
                }
                closeIo(fileInputStream);
                closeIo(r2);
            } catch (Exception e2) {
                e = e2;
                r2 = 0;
            } catch (Throwable th3) {
                th = th3;
                closeIo(fileInputStream);
                closeIo(fileInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            r2 = 0;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public static void closeIo(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21a4086", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
