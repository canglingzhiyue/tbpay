package com.taobao.android.detail.core.detail.kit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1719975003);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.HttpImageUtil");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:59:0x0080). Please submit an issue!!! */
    public static byte[] a(URL url) {
        ?? r1;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        boolean z = ipChange instanceof IpChange;
        if (z) {
            return (byte[]) ipChange.ipc$dispatch("777165d6", new Object[]{url});
        }
        byte[] bArr = null;
        bArr = null;
        bArr = null;
        InputStream inputStream2 = null;
        try {
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                inputStream = httpURLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    inputStream2 = inputStream;
                    th = th;
                    r1 = 0;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (r1 != 0) {
                        try {
                            r1.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                inputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                r1 = 0;
            }
            try {
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr2, 0, 100);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                byteArrayOutputStream.close();
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return bArr;
            }
            return bArr;
        } catch (Throwable th3) {
            inputStream2 = url;
            th = th3;
            r1 = z;
        }
    }

    public static byte[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        try {
            return a(new URL(str));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
