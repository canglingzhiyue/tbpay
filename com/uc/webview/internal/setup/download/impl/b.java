package com.uc.webview.internal.setup.download.impl;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.uc.webview.base.Log;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    int f23953a = 5000;
    int b = 5000;
    Map<String, String> c = null;
    int d = 0;
    long e = 0;
    long f = 0;
    private String g;
    private a h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public interface a {
        void a(InputStream inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, a aVar) {
        this.g = str;
        this.h = aVar;
    }

    private HttpURLConnection a(String str, URL url, boolean z) throws Exception {
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url, str).openConnection();
        if (z) {
            httpURLConnection.setInstanceFollowRedirects(false);
            str2 = "HEAD";
        } else {
            httpURLConnection.setInstanceFollowRedirects(true);
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(this.f23953a);
        httpURLConnection.setReadTimeout(this.b);
        Map<String, String> map = this.c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return httpURLConnection;
    }

    private boolean a(String str) {
        Log.d("UpdRequest", "start url:".concat(String.valueOf(str)));
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a2 = a(str, null, false);
            a2.connect();
            this.d = a2.getResponseCode();
            if (!b()) {
                Log.d("UpdRequest", "start failed, error httpCode:" + this.d);
                if (a2 != null) {
                    try {
                        a2.disconnect();
                    } catch (Throwable unused) {
                    }
                }
                return false;
            }
            this.e = a2.getContentLength();
            this.f = a2.getLastModified();
            this.h.a(a2.getInputStream());
            if (a2 == null) {
                return true;
            }
            try {
                a2.disconnect();
                return true;
            } catch (Throwable unused2) {
                return true;
            }
        } catch (Throwable th) {
            try {
                Log.d("UpdRequest", "start failed", th);
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused3) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused4) {
                    }
                }
                throw th2;
            }
        }
    }

    private boolean a(String str, URL url) {
        boolean z;
        Log.d("UpdRequest", "startHead url:" + str + ", ref:" + url);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a2 = a(str, url, true);
            a2.connect();
            this.d = a2.getResponseCode();
            if (!b()) {
                Log.d("UpdRequest", "startHead failed, httpCode:" + this.d);
                if (a2 != null) {
                    try {
                        a2.disconnect();
                    } catch (Throwable unused) {
                    }
                }
                return false;
            }
            switch (this.d) {
                case 300:
                case 301:
                case 302:
                case 303:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                String headerField = a2.getHeaderField(HttpConstant.LOCATION);
                if (TextUtils.isEmpty(headerField)) {
                    Log.d("UpdRequest", "startHead failed, location is empty");
                    if (a2 != null) {
                        try {
                            a2.disconnect();
                        } catch (Throwable unused2) {
                        }
                    }
                    return false;
                }
                boolean a3 = a(headerField, new URL(url, str));
                if (a2 != null) {
                    try {
                        a2.disconnect();
                    } catch (Throwable unused3) {
                    }
                }
                return a3;
            }
            this.e = a2.getContentLength();
            if (this.e > 0) {
                this.f = a2.getLastModified();
                if (a2 != null) {
                    try {
                        a2.disconnect();
                    } catch (Throwable unused4) {
                    }
                }
                return true;
            }
            Log.d("UpdRequest", "startHead failed, invalid size:" + this.e);
            if (a2 != null) {
                try {
                    a2.disconnect();
                } catch (Throwable unused5) {
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                Log.d("UpdRequest", "startHead failed", th);
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused6) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused7) {
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.h == null ? a(this.g, null) : a(this.g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        int i = this.d;
        return i >= 200 && i <= 303;
    }
}
