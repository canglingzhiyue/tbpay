package com.taobao.orange.sync;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.f;
import java.util.List;
import java.util.Map;
import tb.cpe;
import tb.kge;
import tb.mzw;
import tb.mzx;
import tb.mzy;
import tb.mzz;
import tb.naa;
import tb.nab;

/* loaded from: classes7.dex */
public abstract class a<T> extends c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f18589a;
    private String b;
    private boolean c;
    private String g;
    private long h;
    private long i;
    private String j;
    private nab k;

    static {
        kge.a(1616050128);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract Map<String, String> a();

    public abstract T b(String str);

    public abstract String b();

    public a(String str, boolean z, String str2) {
        this.b = str;
        this.c = z;
        this.f18589a = this.c ? com.taobao.orange.a.M : com.taobao.orange.a.K;
        this.g = str2;
        g();
        if (StringUtils.isEmpty(com.taobao.orange.a.i)) {
            this.k = new mzy();
        } else {
            this.k = new mzw();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.i = System.currentTimeMillis() / 1000;
        this.h = (System.currentTimeMillis() / 1000) + com.taobao.orange.a.P;
        this.j = com.taobao.orange.a.k + "_" + this.h;
    }

    @Override // com.taobao.orange.sync.c
    public T c() {
        String str;
        String str2;
        if (OLog.isPrintLog(1)) {
            OLog.d("AuthRequest", "syncRequest start", "isAckReq", Boolean.valueOf(this.c), "reqType", this.g);
        }
        if (StringUtils.isEmpty(com.taobao.orange.a.k)) {
            this.d = -6;
            this.e = "utdid is null";
            OLog.e("AuthRequest", "syncRequest fail", "code", Integer.valueOf(this.d), "message", this.e);
            return null;
        }
        try {
            naa newInstance = com.taobao.orange.a.f.newInstance();
            if (newInstance instanceof mzx) {
                List<String> a2 = f.a(this.c ? com.taobao.orange.a.N : com.taobao.orange.a.L);
                a2.add(0, this.f18589a);
                for (String str3 : a2) {
                    try {
                        a(newInstance, a(str3, this.g));
                        this.d = newInstance.b();
                    } finally {
                        try {
                            if (OLog.isPrintLog(3)) {
                                OLog.w("AuthRequest", "syncRequest fail", th, "host", str3);
                            }
                            newInstance.e();
                        } finally {
                        }
                    }
                    if (this.d == 200) {
                        a(newInstance.a());
                        str2 = newInstance.c();
                        break;
                    }
                    this.f = this.d;
                    newInstance.e();
                }
                str2 = null;
            } else {
                try {
                    a(newInstance, a(this.f18589a, this.g));
                    this.d = newInstance.b();
                    if (this.d == 200) {
                        a(newInstance.a());
                        str = newInstance.c();
                    } else {
                        str = null;
                    }
                    newInstance.e();
                    str2 = str;
                } catch (Throwable th) {
                    try {
                        if (OLog.isPrintLog(r4)) {
                            OLog.w("AuthRequest", "syncRequest fail", th, "host", this.f18589a);
                        }
                        this.e = th.getMessage();
                    } finally {
                    }
                }
            }
            if (this.c) {
                return null;
            }
            if (StringUtils.isEmpty(str2)) {
                this.d = -2;
                this.e = "content is empty";
                OLog.e("AuthRequest", "syncRequest fail", "code", Integer.valueOf(this.d), "message", this.e);
                return null;
            } else if (!StringUtils.isEmpty(this.b) && !this.b.equals(com.taobao.orange.util.c.a(str2))) {
                this.d = -3;
                this.e = "content is broken";
                OLog.e("AuthRequest", "syncRequest fail", "code", Integer.valueOf(this.d), "message", this.e);
                return null;
            } else {
                try {
                    return b(str2);
                } catch (Throwable th2) {
                    this.d = -4;
                    this.e = th2.getMessage();
                    OLog.e("AuthRequest", "syncRequest fail", th2, new Object[0]);
                    return null;
                }
            }
        } catch (Throwable th3) {
            OLog.e("AuthRequest", "syncRequest", th3, new Object[0]);
            this.e = th3.getMessage();
            return null;
        }
    }

    private void a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty() || !"10002".equals(f.c(map.get("o-code").get(0)))) {
        } else {
            OLog.w("AuthRequest", "checkResposeHeads", "expired, correct timestamp");
            long a2 = f.a(f.c(map.get("o-server-timestamp").get(0)));
            if (a2 == 0) {
                return;
            }
            long j = this.i;
            if (j == 0) {
                return;
            }
            long j2 = a2 - j;
            OLog.w("AuthRequest", "checkResposeHeads update global", "reqTimestampOffset(s)", Long.valueOf(j2), "server", Long.valueOf(a2), cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, Long.valueOf(this.h), "relClient", Long.valueOf(this.i));
            com.taobao.orange.a.P = j2;
            g();
        }
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(com.taobao.orange.a.J == OConstant.ENV.ONLINE ? "https" : "http");
        sb.append(HttpConstant.SCHEME_SPLIT);
        sb.append(str);
        if (!StringUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        return sb.toString();
    }

    private void a(naa naaVar, String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e03e54", new Object[]{this, naaVar, str});
            return;
        }
        String b = f.b(com.taobao.orange.a.h);
        String b2 = f.b(com.taobao.orange.a.j);
        String b3 = f.b(com.taobao.orange.a.k);
        String b4 = b();
        String b5 = f.b(a(b4));
        if (StringUtils.isEmpty(b) || StringUtils.isEmpty(b3) || StringUtils.isEmpty(b2) || StringUtils.isEmpty(b5)) {
            OLog.e("AuthRequest", "getRequestImpl error", "signInfo", b5, "appKey", b, "appVersion", b2, "deviceId", b3);
            return;
        }
        naaVar.a(a());
        naaVar.a(str);
        if (this.c) {
            naaVar.a("o-request-unique", f.b(this.j));
        }
        naaVar.a("o-timestamp", f.b(String.valueOf(this.h)));
        naaVar.a("o-sign-version", f.b("1.0"));
        naaVar.a("o-sdk-version", f.b(OConstant.SDK_VERSION));
        naaVar.a("o-app-key", b);
        naaVar.a("o-app-version", b2);
        naaVar.a("o-device-id", b3);
        naaVar.a("o-sign", b5);
        if (naaVar instanceof mzz) {
            naaVar.a("f-refer", "orange");
        }
        String str2 = com.taobao.orange.a.l;
        if (!StringUtils.isEmpty(str2)) {
            naaVar.a("o-user-info", str2);
        }
        naaVar.a("host", f.b(this.f18589a));
        if (!StringUtils.isEmpty(b4)) {
            naaVar.b("POST");
            naaVar.a(b4.getBytes());
        } else {
            naaVar.b("GET");
        }
        naaVar.d();
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(this.g);
        sb.append("&");
        sb.append(com.taobao.orange.a.h);
        sb.append("&");
        sb.append(com.taobao.orange.a.j);
        sb.append("&");
        sb.append(com.taobao.orange.a.k);
        sb.append("&");
        sb.append(this.h);
        if (this.c) {
            sb.append("&");
            sb.append(this.j);
            if (!StringUtils.isEmpty(str)) {
                sb.append("&");
                sb.append(str);
            }
        }
        return this.k.a(com.taobao.orange.a.g, com.taobao.orange.a.h, com.taobao.orange.a.i, sb.toString(), com.taobao.orange.a.m);
    }
}
