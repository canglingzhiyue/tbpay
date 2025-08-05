package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.taobao.android.litecreator.util.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f7581a = false;
    private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f7582a;
        final /* synthetic */ long b;
        final /* synthetic */ String c;

        a(File file, long j, String str) {
            this.f7582a = file;
            this.b = j;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IOException iOException;
            RandomAccessFile randomAccessFile;
            Throwable th;
            File file = this.f7582a;
            if (file == null) {
                str = "In writeFile Failed to get local file.";
            } else {
                File parentFile = file.getParentFile();
                if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
                    str = "In writeFile, Failed to create directory.";
                } else {
                    RandomAccessFile randomAccessFile2 = null;
                    try {
                        try {
                            long length = this.f7582a.length();
                            if (length > this.b) {
                                String canonicalPath = this.f7582a.getCanonicalPath();
                                if (!this.f7582a.delete()) {
                                    HMSLog.e(k.TAG, "last file delete failed.");
                                }
                                randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                            } else {
                                randomAccessFile = new RandomAccessFile(this.f7582a, "rw");
                                try {
                                    randomAccessFile.seek(length);
                                    randomAccessFile2 = randomAccessFile;
                                } catch (IOException e) {
                                    iOException = e;
                                    randomAccessFile2 = randomAccessFile;
                                    HMSLog.e(k.TAG, "writeFile exception:", iOException);
                                    IOUtils.closeQuietly(randomAccessFile2);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    IOUtils.closeQuietly(randomAccessFile);
                                    throw th;
                                }
                            }
                            randomAccessFile2.writeBytes(this.c + System.getProperty("line.separator"));
                        } catch (IOException e2) {
                            iOException = e2;
                            randomAccessFile2 = randomAccessFile2;
                        }
                        IOUtils.closeQuietly(randomAccessFile2);
                        return;
                    } catch (Throwable th3) {
                        randomAccessFile = null;
                        th = th3;
                    }
                }
            }
            HMSLog.e(k.TAG, str);
        }
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        return digest != null && HEX.encodeHexString(digest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j) {
        b.execute(new a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file == null || !file.isFile() || !file.exists()) {
            return;
        }
        if (!f7581a) {
            if (file2 != null && file2.exists() && !file2.delete()) {
                HMSLog.e(k.TAG, "file delete failed.");
            }
            f7581a = true;
        }
        writeFile(file2, str + "|" + j + "|" + i, LOCAL_REPORT_FILE_MAX_SIZE);
    }
}
