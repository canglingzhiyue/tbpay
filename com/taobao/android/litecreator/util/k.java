package com.taobao.android.litecreator.util;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import tb.kge;

/* loaded from: classes5.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FileUtil";

    static {
        kge.a(195534631);
    }

    public static float a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821974c", new Object[]{new Long(j)})).floatValue() : (float) (j / 1048576.0d);
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        if (a(str)) {
            return false;
        }
        return new File(str).mkdirs();
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.length() > 0;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return new File(str).exists();
        }
        return false;
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public static boolean a(String str, String str2) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        FileOutputStream fileOutputStream = null;
        try {
            if (!new File(str).exists()) {
                u.d(TAG, "copyFile 复制单个文件出错, 文件不存在");
                a((Object) null);
                a((Object) null);
                return false;
            }
            fileInputStream = new FileInputStream(str);
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                    try {
                        byte[] bArr = new byte[1444];
                        int i = 0;
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                u.d(TAG, "copyFile 复制文件成功 " + str2);
                                a(fileOutputStream2);
                                a(fileInputStream);
                                return true;
                            }
                            i += read;
                            System.out.println(i);
                            fileOutputStream2.write(bArr, 0, read);
                        }
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        u.d(TAG, "copyFile 复制单个文件出错 " + e.getMessage());
                        a(fileOutputStream);
                        a(fileInputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        a(fileOutputStream);
                        a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f3f1e42", new Object[]{context, str, str2, str3})).booleanValue();
        }
        if (s.H() && str != null && Build.VERSION.SDK_INT >= 33) {
            return b(context, Uri.parse(str), str3);
        }
        return a(str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.io.InputStream] */
    public static boolean a(Context context, Uri uri, String str) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("420ddaf5", new Object[]{context, uri, str})).booleanValue();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!ax.b(context, uri)) {
                    a((Object) null);
                    a((Object) null);
                    return false;
                }
                context = ax.a(context, uri);
                try {
                    fileOutputStream = new FileOutputStream(str);
                    try {
                        byte[] bArr = new byte[1444];
                        while (true) {
                            int read = context.read(bArr);
                            if (read == -1) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                context.close();
                                u.d(TAG, "复制文件成功 " + str);
                                a(fileOutputStream);
                                a((Object) context);
                                return true;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        u.d(TAG, "复制单个文件出错 " + e.getMessage());
                        a(fileOutputStream2);
                        a(context);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        a(fileOutputStream);
                        a(context);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                context = 0;
            } catch (Throwable th2) {
                th = th2;
                context = 0;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean b(Context context, Uri uri, String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fcd52f6", new Object[]{context, uri, str})).booleanValue();
        }
        FileChannel fileChannel3 = 0;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            fileChannel = new FileInputStream(openFileDescriptor.getFileDescriptor()).getChannel();
            try {
                fileChannel3 = new FileOutputStream(new File(str)).getChannel();
                fileChannel3.transferFrom(fileChannel, 0L, fileChannel.size());
                openFileDescriptor.close();
                u.d(TAG, "copyFileNio 复制成功,path = " + str);
                a(fileChannel);
                a(fileChannel3);
                return true;
            } catch (Exception e) {
                e = e;
                FileChannel fileChannel4 = fileChannel3;
                fileChannel3 = fileChannel;
                fileChannel2 = fileChannel4;
                try {
                    u.d(TAG, "copyFileNio 复制单个文件出错，error = " + e.getMessage());
                    a(fileChannel3);
                    a(fileChannel2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    FileChannel fileChannel5 = fileChannel3;
                    fileChannel3 = fileChannel2;
                    fileChannel = fileChannel5;
                    a(fileChannel);
                    a(fileChannel3);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                a(fileChannel);
                a(fileChannel3);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileChannel2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else if (obj == null) {
        } else {
            if (!(obj instanceof Closeable)) {
                u.c(TAG, "FileUtil.safelyClose. the obj is not closeable, close reflectly");
                b(obj);
                return;
            }
            try {
                ((Closeable) obj).close();
            } catch (Throwable th) {
                u.d(TAG, "FileUtil.safelyClose failed. msg:" + Log.getStackTraceString(th));
            }
        }
    }

    private static void b(Object obj) {
        try {
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
        } catch (Throwable th) {
            u.d(TAG, "FileUtil.reflectToClose failed. msg:" + Log.getStackTraceString(th));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
        file.delete();
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue() : a(Globals.getApplication(), str);
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue() : a(context, Uri.parse(str));
    }

    public static int a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd717cda", new Object[]{context, uri})).intValue();
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return 0;
            }
            InputStream a2 = ax.a(context, uri);
            if (a2 == null) {
                a2 = ax.a(context, Uri.fromFile(new File(uri.toString())));
            }
            int attributeInt = new ExifInterface(a2).getAttributeInt(android.support.media.ExifInterface.TAG_ORIENTATION, 0);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            return attributeInt != 8 ? 0 : 270;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String f(String str) {
        FileReader fileReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                            sb.append('\n');
                        } else {
                            a(bufferedReader2);
                            a(fileReader);
                            return sb.toString();
                        }
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        a(bufferedReader);
                        a(fileReader);
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        a(bufferedReader);
                        a(fileReader);
                        throw th;
                    }
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            fileReader = null;
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
        }
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(str2);
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter2.write(str);
                bufferedWriter2.close();
                return true;
            } catch (Exception unused) {
                bufferedWriter = bufferedWriter2;
                a(bufferedWriter);
                return false;
            }
        } catch (Exception unused2) {
        }
    }

    public static byte[] b(File file) {
        FileInputStream fileInputStream;
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("affe333d", new Object[]{file});
        }
        FileChannel fileChannel2 = null;
        try {
            if (!file.exists()) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                fileChannel = fileInputStream.getChannel();
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) fileChannel.size());
                    fileChannel.read(allocate);
                    byte[] array = allocate.array();
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return array;
                } catch (Exception unused3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    fileChannel2 = fileChannel;
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (fileChannel2 != null) {
                        try {
                            fileChannel2.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused8) {
                fileChannel = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused9) {
            fileChannel = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.nio.channels.FileChannel] */
    public static boolean a(File e, String str) {
        FileChannel fileChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fbe2fed", new Object[]{e, str})).booleanValue();
        }
        if (e == 0 || str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        FileChannel fileChannel2 = null;
        try {
            try {
                try {
                    fileChannel = new FileInputStream(e).getChannel();
                } catch (FileNotFoundException e3) {
                    e = e3;
                    e = 0;
                } catch (IOException e4) {
                    e = e4;
                    e = 0;
                } catch (Throwable th) {
                    th = th;
                    fileChannel = null;
                }
                try {
                    fileChannel2 = new FileOutputStream(file).getChannel();
                    fileChannel.transferTo(0L, fileChannel.size(), fileChannel2);
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            return true;
                        }
                    }
                    if (fileChannel2 == null) {
                        return true;
                    }
                    fileChannel2.close();
                    return true;
                } catch (FileNotFoundException e6) {
                    e = e6;
                    FileChannel fileChannel3 = fileChannel2;
                    fileChannel2 = fileChannel;
                    e = fileChannel3;
                    e.printStackTrace();
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (e != 0) {
                        e.close();
                    }
                    return false;
                } catch (IOException e7) {
                    e = e7;
                    FileChannel fileChannel4 = fileChannel2;
                    fileChannel2 = fileChannel;
                    e = fileChannel4;
                    e.printStackTrace();
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (e != 0) {
                        e.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                e.printStackTrace();
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            FileChannel fileChannel5 = fileChannel2;
            fileChannel2 = e;
            fileChannel = fileChannel5;
        }
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
                String path = listFiles[i].getPath();
                c(path, file2.getPath() + "/" + listFiles[i].getName());
            } else {
                File file3 = new File(listFiles[i].getPath());
                a(file3, file2.getPath() + "/" + listFiles[i].getName());
            }
        }
        return true;
    }

    public static boolean a(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3abf71a", new Object[]{file, file2})).booleanValue();
        }
        if (file == file2) {
            return true;
        }
        return file != null && file2 != null && a(file.getAbsolutePath()) && a(file2.getAbsolutePath()) && file.length() == file2.length();
    }
}
