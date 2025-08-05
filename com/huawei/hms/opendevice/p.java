package com.huawei.hms.opendevice;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
public abstract class p {
    public static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (-1 == read) {
                String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                a((Closeable) inputStream);
                com.huawei.secure.android.common.util.a.a((OutputStream) byteArrayOutputStream);
                return byteArrayOutputStream2;
            }
            byteArrayOutputStream.write(read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    public static String a(String str) {
        InputStreamReader inputStreamReader;
        String str2;
        BufferedReader bufferedReader;
        String readLine;
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = 0;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            readLine = bufferedReader3.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        } catch (FileNotFoundException unused) {
                            bufferedReader2 = bufferedReader3;
                            str2 = "file not exist.";
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", str2);
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            bufferedReader2 = bufferedReader;
                            return sb.toString();
                        } catch (IOException unused2) {
                            bufferedReader2 = bufferedReader3;
                            str2 = "read value IOException.";
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", str2);
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            bufferedReader2 = bufferedReader;
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader3;
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader2);
                            throw th;
                        }
                    }
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    IOUtils.closeQuietly((Reader) bufferedReader3);
                    bufferedReader2 = readLine;
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                }
            } catch (FileNotFoundException unused5) {
                inputStreamReader = null;
            } catch (IOException unused6) {
                inputStreamReader = null;
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
            }
            return sb.toString();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HMSLog.w("StreamUtil", "close IOException");
            }
        }
    }

    public static void a(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() == null) {
            HMSLog.e("StreamUtil", "parent file is null.");
            throw new IOException("parent file is null");
        } else if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            HMSLog.e("StreamUtil", "make parent dirs failed.");
            throw new IOException("make parent dirs failed");
        } else if (file.createNewFile()) {
        } else {
            HMSLog.e("StreamUtil", "create file failed.");
            throw new IOException("create file failed");
        }
    }

    public static void a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
                HMSLog.w("StreamUtil", "close HttpsURLConnection Exception");
            }
        }
    }
}
