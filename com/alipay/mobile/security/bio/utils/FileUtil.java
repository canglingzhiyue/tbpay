package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/* loaded from: classes3.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STREAM_BUFFER_SIZE = 8192;

    public static synchronized byte[] toByteArray(String str) throws IOException {
        synchronized (FileUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("91b291b6", new Object[]{str});
            }
            File file = new File(str);
            if (!file.exists()) {
                throw new FileNotFoundException(str);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            BufferedInputStream bufferedInputStream = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr, 0, 1024);
                            if (-1 != read) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                InputStreamUtils.close(bufferedInputStream2);
                                OutputStreamUtils.close(byteArrayOutputStream);
                                return byteArray;
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        BioLog.e(e.toString());
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        InputStreamUtils.close(bufferedInputStream);
                        OutputStreamUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8c5305da", new Object[]{bitmap, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void bitmap2File(Bitmap bitmap, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b17be5f", new Object[]{bitmap, file});
            return;
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            BioLog.w(e);
        } catch (IOException e2) {
            BioLog.w(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.InputStream] */
    public static byte[] getAssetsData(Context context, String str) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("db959955", new Object[]{context, str});
        }
        byte[] bArr = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
            } catch (IOException e) {
                e = e;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                context = 0;
                InputStreamUtils.close(context);
                throw th;
            }
            try {
                bArr = InputStreamUtils.input2byte(inputStream);
                context = inputStream;
            } catch (IOException e2) {
                e = e2;
                BioLog.e(e);
                context = inputStream;
                InputStreamUtils.close(context);
                return bArr;
            }
            InputStreamUtils.close(context);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            InputStreamUtils.close(context);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.InputStream] */
    public static byte[] getAssetsData(Resources resources, String str) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f240b79c", new Object[]{resources, str});
        }
        byte[] bArr = null;
        try {
            try {
                inputStream = resources.getAssets().open(str);
            } catch (IOException e) {
                e = e;
                inputStream = null;
            } catch (Throwable th) {
                th = th;
                resources = 0;
                InputStreamUtils.close(resources);
                throw th;
            }
            try {
                bArr = InputStreamUtils.input2byte(inputStream);
                resources = inputStream;
            } catch (IOException e2) {
                e = e2;
                BioLog.e(e);
                resources = inputStream;
                InputStreamUtils.close(resources);
                return bArr;
            }
            InputStreamUtils.close(resources);
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            InputStreamUtils.close(resources);
            throw th;
        }
    }

    public static byte[] getRawData(Context context, int i) {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bce30bdf", new Object[]{context, new Integer(i)});
        }
        byte[] bArr = null;
        try {
            inputStream = context.getResources().openRawResource(i);
        } catch (IOException e) {
            e = e;
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
            InputStreamUtils.close(inputStream);
            throw th;
        }
        try {
            try {
                bArr = InputStreamUtils.input2byte(inputStream);
            } catch (Throwable th2) {
                th = th2;
                InputStreamUtils.close(inputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            BioLog.e(e.toString());
            InputStreamUtils.close(inputStream);
            return bArr;
        }
        InputStreamUtils.close(inputStream);
        return bArr;
    }

    public static synchronized boolean save(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        synchronized (FileUtil.class) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c8cbb406", new Object[]{file, bArr})).booleanValue();
            }
            if (file != null && bArr != null) {
                if (file.exists()) {
                    file.delete();
                } else {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        BioLog.e(e.toString());
                    }
                }
                BufferedOutputStream bufferedOutputStream = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                            try {
                                bufferedOutputStream2.write(bArr);
                                bufferedOutputStream2.flush();
                                OutputStreamUtils.close(bufferedOutputStream2);
                                OutputStreamUtils.close(fileOutputStream);
                            } catch (IOException e2) {
                                e = e2;
                                bufferedOutputStream = bufferedOutputStream2;
                                BioLog.e(e.toString());
                                OutputStreamUtils.close(bufferedOutputStream);
                                OutputStreamUtils.close(fileOutputStream);
                                z = false;
                                return z;
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                OutputStreamUtils.close(bufferedOutputStream);
                                OutputStreamUtils.close(fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
                return z;
            }
            z = false;
            return z;
        }
    }

    public static synchronized void saveContent(File file, String str, boolean z) {
        synchronized (FileUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78a8910", new Object[]{file, str, new Boolean(z)});
            } else if (file == null && str == null) {
                throw new BioIllegalArgumentException();
            } else {
                if (!file.exists()) {
                    try {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    } catch (IOException e) {
                        BioLog.e(e.toString());
                    }
                }
                BufferedWriter bufferedWriter = null;
                try {
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z)));
                        try {
                            bufferedWriter2.write(str);
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e2) {
                                BioLog.e(e2.toString());
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bufferedWriter = bufferedWriter2;
                            BioLog.e(e.toString());
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e4) {
                                    BioLog.e(e4.toString());
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e5) {
                                    BioLog.e(e5.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            }
        }
    }

    public static void recursionDeleteFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc9e447", new Object[]{file});
        } else if (file != null) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File file2 : listFiles) {
                    recursionDeleteFile(file2);
                }
                file.delete();
            }
        }
    }

    public static void copyDirectory(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fda8c93", new Object[]{str, str2});
            return;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                String str3 = str + File.separator + listFiles[i].getName();
                String str4 = str2 + File.separator + listFiles[i].getName();
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                copyDirectory(str3, str4);
            }
        } else if (file.isFile()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(str)));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            byte[] bArr = new byte[524288];
            while (dataInputStream.read(bArr) != -1) {
                dataOutputStream.write(bArr);
            }
            dataInputStream.close();
            dataOutputStream.close();
        } else {
            BioLog.e("please input correct path!");
        }
    }

    public static File extractAssets(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f97bdba6", new Object[]{context, str});
        }
        AssetManager assets = context.getAssets();
        File file = new File(context.getFilesDir().getAbsolutePath());
        file.mkdirs();
        File file2 = new File(file, str);
        try {
            if (assets.list(str) != null) {
                streamToStream(assets.open(str), new FileOutputStream(file2));
            }
        } catch (IOException e) {
            BioLog.w("ZCAuth", "extractAssets: ", e);
        }
        return file2;
    }

    public static boolean streamToStream(InputStream inputStream, OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8c8687", new Object[]{inputStream, outputStream})).booleanValue();
        }
        try {
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return true;
                    }
                }
            } catch (Exception e) {
                BioLog.w("ContentValues", "streamToStream(InputStream, OutputStream): Exception occur.", e);
                closeSafely(outputStream);
                closeSafely(inputStream);
                return false;
            }
        } finally {
            closeSafely(outputStream);
            closeSafely(inputStream);
        }
    }

    public static void closeSafely(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8df152", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception e) {
                BioLog.w("ContentValues", "closeSafely(Closeable): Exception occur.", e);
            }
        }
    }

    public static String assetsToString(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("683c1e64", new Object[]{context, str});
        }
        try {
            Scanner useDelimiter = new Scanner(context.getAssets().open(str)).useDelimiter("\\A");
            return useDelimiter.hasNext() ? useDelimiter.next() : "";
        } catch (IOException e) {
            BioLog.w("ZCAuth", "extractAssets: ", e);
            return null;
        }
    }
}
