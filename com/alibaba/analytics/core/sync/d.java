package com.alibaba.analytics.core.sync;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import tb.apr;
import tb.kge;

/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2099a = -1;
        public byte[] b = null;
        public long c = 0;

        static {
            kge.a(-471563737);
        }
    }

    static {
        kge.a(437863391);
        System.setProperty("http.keepAlive", "true");
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b3e7bcb0", new Object[]{this, str});
        }
        a aVar = new a();
        if (TextUtils.isEmpty(str)) {
            return aVar;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (httpURLConnection != null) {
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setDoInput(true);
                try {
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        httpURLConnection.connect();
                        try {
                            aVar.f2099a = httpURLConnection.getResponseCode();
                        } catch (IOException e) {
                            apr.b("HttpsUtil", e);
                        }
                        aVar.c = System.currentTimeMillis() - currentTimeMillis;
                        DataInputStream dataInputStream = null;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            try {
                                DataInputStream dataInputStream2 = new DataInputStream(httpURLConnection.getInputStream());
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int read = dataInputStream2.read(bArr, 0, 2048);
                                        if (read != -1) {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                        } else {
                                            try {
                                                break;
                                            } catch (Exception e2) {
                                                apr.b("HttpsUtil", e2);
                                            }
                                        }
                                    }
                                    dataInputStream2.close();
                                    if (byteArrayOutputStream.size() > 0) {
                                        aVar.b = byteArrayOutputStream.toByteArray();
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    dataInputStream = dataInputStream2;
                                    apr.b("HttpsUtil", e, new Object[0]);
                                    if (dataInputStream != null) {
                                        try {
                                            dataInputStream.close();
                                        } catch (Exception e4) {
                                            apr.b("HttpsUtil", e4);
                                        }
                                    }
                                    return aVar;
                                } catch (Throwable th) {
                                    th = th;
                                    dataInputStream = dataInputStream2;
                                    if (dataInputStream != null) {
                                        try {
                                            dataInputStream.close();
                                        } catch (Exception e5) {
                                            apr.b("HttpsUtil", e5);
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (IOException e6) {
                            e = e6;
                        }
                    } catch (Exception e7) {
                        apr.b("HttpsUtil", e7, new Object[0]);
                        aVar.c = System.currentTimeMillis() - currentTimeMillis;
                        return aVar;
                    }
                } catch (ProtocolException e8) {
                    apr.b("HttpsUtil", e8, new Object[0]);
                }
            }
            return aVar;
        } catch (MalformedURLException e9) {
            apr.b("HttpsUtil", e9, new Object[0]);
            return aVar;
        } catch (IOException e10) {
            apr.b("HttpsUtil", e10, new Object[0]);
            return aVar;
        }
    }
}
