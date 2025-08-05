package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.uploader.implement.a;
import com.uploader.implement.d;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes9.dex */
public class roj extends roe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile SSLSocketFactory f;
    public HttpURLConnection e;
    public boolean g;

    public static /* synthetic */ Object ipc$super(roj rojVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.rop
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.rop
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.rop
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void a(roj rojVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6ac5eb", new Object[]{rojVar});
        } else {
            rojVar.g();
        }
    }

    public static /* synthetic */ void a(roj rojVar, HttpURLConnection httpURLConnection, rom romVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34bfc0b4", new Object[]{rojVar, httpURLConnection, romVar});
        } else {
            rojVar.a(httpURLConnection, romVar);
        }
    }

    public roj(d dVar, rol rolVar) {
        super(dVar, rolVar);
        this.e = null;
        this.g = rolVar.f.startsWith(k.HTTPS_PREFIX);
    }

    @Override // tb.rop
    public void a(final roq roqVar, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0510eff", new Object[]{this, roqVar, new Integer(i)});
        } else {
            rpa.a(new Runnable() { // from class: tb.roj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rom b = roj.this.b();
                    try {
                        roj.a(roj.this);
                        if (roqVar.f33271a != null) {
                            for (Map.Entry<String, String> entry : roqVar.f33271a.entrySet()) {
                                roj.this.e.addRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        if (a.a(4)) {
                            a.a(4, "ShortLivedConnection", roj.this.c + " URL:" + roj.this.e.getURL().toString() + " RequestHeaders:" + roj.this.e.getRequestProperties());
                        }
                        try {
                            roj.this.e.connect();
                            if (b != null) {
                                b.a(roj.this, i);
                            }
                            if (roqVar.b != null) {
                                OutputStream outputStream = null;
                                try {
                                    try {
                                        outputStream = roj.this.e.getOutputStream();
                                        outputStream.write(roqVar.b, roqVar.c, roqVar.d);
                                        if (a.a(4)) {
                                            a.a(4, "ShortLivedConnection", roj.this.c + " BODY:" + new String(roqVar.b));
                                        }
                                    } catch (Exception e) {
                                        if (a.a(16)) {
                                            a.a(16, "ShortLivedConnection", roj.this.c + " send data error.", e);
                                        }
                                        roj.this.e.disconnect();
                                        rov rovVar = new rov("100", "5", "send data error", true);
                                        if (b != null) {
                                            b.a(roj.this, rovVar);
                                        }
                                        if (outputStream == null) {
                                            return;
                                        }
                                        try {
                                            outputStream.close();
                                            return;
                                        } catch (IOException e2) {
                                            if (!a.a(8)) {
                                                return;
                                            }
                                            a.a(8, "ShortLivedConnection", e2.toString());
                                            return;
                                        }
                                    }
                                } finally {
                                    if (outputStream != null) {
                                        try {
                                            outputStream.close();
                                        } catch (IOException e3) {
                                            if (a.a(8)) {
                                                a.a(8, "ShortLivedConnection", e3.toString());
                                            }
                                        }
                                    }
                                }
                            }
                            if (b != null) {
                                b.b(roj.this, i);
                            }
                            roj rojVar = roj.this;
                            roj.a(rojVar, rojVar.e, b);
                        } catch (Exception e4) {
                            if (a.a(16)) {
                                a.a(16, "ShortLivedConnection", "connect error.", e4);
                            }
                            rov rovVar2 = new rov("100", "4", "connect error", true);
                            if (b == null) {
                                return;
                            }
                            b.a(roj.this, rovVar2);
                        }
                    } catch (Exception e5) {
                        if (a.a(16)) {
                            a.a(16, "ShortLivedConnection", roj.this.c + " open connection error, ", e5);
                        }
                        rov rovVar3 = new rov("100", "3", "open connection error", true);
                        if (b == null) {
                            return;
                        }
                        b.a(roj.this, rovVar3);
                    }
                }
            });
        }
    }

    private void g() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.e != null) {
        } else {
            rol rolVar = (rol) this.f33258a;
            URL url = new URL(rolVar.f);
            if (this.g) {
                this.e = (HttpURLConnection) url.openConnection();
                a(this.e, rolVar.g);
            } else {
                Proxy proxy = null;
                if (!TextUtils.isEmpty(rolVar.c) && rolVar.d > 0) {
                    proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(rolVar.c, rolVar.d));
                }
                if (proxy != null) {
                    this.e = (HttpURLConnection) url.openConnection(proxy);
                } else {
                    this.e = (HttpURLConnection) url.openConnection();
                }
            }
            this.e.setConnectTimeout(10000);
            this.e.setConnectTimeout(10000);
            this.e.setRequestMethod("POST");
            this.e.setDoOutput(true);
            this.e.setDoInput(true);
        }
    }

    private void a(HttpURLConnection httpURLConnection, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a35969b", new Object[]{this, httpURLConnection, str});
        } else {
            ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: tb.roj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str2, SSLSession sSLSession) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str2, sSLSession})).booleanValue() : HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.net.HttpURLConnection r17, tb.rom r18) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.roj.a(java.net.HttpURLConnection, tb.rom):void");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            this.e.disconnect();
        } catch (Exception unused) {
        }
    }
}
