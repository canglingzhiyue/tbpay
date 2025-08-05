package com.xiaomi.push;

import android.text.TextUtils;
import com.alipay.zoloz.toyger.blob.BlobManager;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import tb.kin;

/* loaded from: classes9.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f24735a = {com.taobao.android.litecreator.comprehension.f.FILE_TYPE_IMAGE_JPG, "png", "bmp", kin.GIF_MODE, BlobManager.UPLOAD_IMAGE_TYPE_WEBP};

    public static String a(File file) {
        InputStreamReader inputStreamReader;
        StringWriter stringWriter = new StringWriter();
        try {
            try {
                inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            } catch (IOException e) {
                e = e;
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                a((Closeable) null);
                a(stringWriter);
                throw th;
            }
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        String stringWriter2 = stringWriter.toString();
                        a(inputStreamReader);
                        a(stringWriter);
                        return stringWriter2;
                    }
                    stringWriter.write(cArr, 0, read);
                }
            } catch (IOException e2) {
                e = e2;
                com.xiaomi.channel.commonutils.logger.b.c("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                a(inputStreamReader);
                a(stringWriter);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) null);
            a(stringWriter);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void a(File file, File file2) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                zipOutputStream = new ZipOutputStream(new FileOutputStream(file, false));
            } catch (FileNotFoundException unused) {
                zipOutputStream = null;
            } catch (IOException e) {
                e = e;
            }
            try {
                a(zipOutputStream, file2, null, null);
                a(zipOutputStream);
            } catch (FileNotFoundException unused2) {
                a(zipOutputStream);
            } catch (IOException e2) {
                e = e2;
                zipOutputStream2 = zipOutputStream;
                com.xiaomi.channel.commonutils.logger.b.m1616a("zip file failure + " + e.getMessage());
                a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream2 = zipOutputStream;
                a(zipOutputStream2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(File file, String str) {
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.c("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write(str);
                    a(bufferedWriter2);
                } catch (IOException e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    com.xiaomi.channel.commonutils.logger.b.c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    a(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    a(bufferedWriter);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) {
        ZipEntry zipEntry;
        FileInputStream fileInputStream;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                if (file.isDirectory()) {
                    File[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    zipOutputStream.putNextEntry(new ZipEntry(str + File.separator));
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str + File.separator;
                    }
                    for (int i = 0; i < listFiles.length; i++) {
                        a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName(), null);
                    }
                    File[] listFiles2 = file.listFiles(new y());
                    if (listFiles2 != null) {
                        for (File file2 : listFiles2) {
                            a(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                    fileInputStream = null;
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        zipEntry = new ZipEntry(str);
                    } else {
                        Date date = new Date();
                        zipEntry = new ZipEntry(String.valueOf(date.getTime()) + ".txt");
                    }
                    zipOutputStream.putNextEntry(zipEntry);
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                    } catch (IOException e) {
                        e = e;
                        fileInputStream2 = fileInputStream;
                        com.xiaomi.channel.commonutils.logger.b.d("zipFiction failed with exception:" + e.toString());
                        a((Closeable) fileInputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        a((Closeable) fileInputStream2);
                        throw th;
                    }
                }
                a((Closeable) fileInputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2368a(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return false;
            }
            return file.createNewFile();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static byte[] a(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[8192];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr2, 0, 8192);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                } catch (Exception e) {
                    e.printStackTrace();
                    bArr = null;
                }
            } finally {
                a((Closeable) inputStream);
                a(byteArrayOutputStream);
            }
        }
        bArr = byteArrayOutputStream.toByteArray();
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    public static void b(File file, File file2) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }
}
