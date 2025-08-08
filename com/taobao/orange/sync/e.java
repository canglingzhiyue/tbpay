package com.taobao.orange.sync;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.f;
import tb.kge;
import tb.naa;

/* loaded from: classes7.dex */
public abstract class e<T> extends c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f18596a = new a();
    public boolean b = false;

    /* loaded from: classes7.dex */
    public static class a {
        public String e;
        public long g = 0;
        public long h = 0;

        /* renamed from: a  reason: collision with root package name */
        public long f18597a = 0;
        public long b = 0;
        public long c = 0;
        public long d = 0;
        public long i = 0;
        public boolean f = false;

        static {
            kge.a(535477593);
        }
    }

    static {
        kge.a(1042046329);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract T b(String str);

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("77137a01", new Object[]{this}) : this.f18596a;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0209  */
    @Override // com.taobao.orange.sync.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T c() {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.sync.e.c():java.lang.Object");
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : OConstant.CRITICAL_TAOBAO_HOSTS[com.taobao.orange.a.J.getEnvMode()];
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return (com.taobao.orange.a.J != OConstant.ENV.TEST ? "https" : "http") + HttpConstant.SCHEME_SPLIT + g() + OConstant.CRITICAL_QUERY_PATH;
    }

    private void a(naa naaVar, String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e03e54", new Object[]{this, naaVar, str});
            return;
        }
        String str2 = com.taobao.orange.a.h;
        String str3 = com.taobao.orange.a.j;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        String str4 = Build.BRAND;
        String str5 = Build.MODEL;
        String utdid = UTDevice.getUtdid(com.taobao.orange.a.g);
        String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
        String a2 = com.taobao.orange.util.c.a(valueOf2 + utdid);
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3) || StringUtils.isEmpty(valueOf) || StringUtils.isEmpty(str4) || StringUtils.isEmpty(str5) || StringUtils.isEmpty(utdid) || StringUtils.isEmpty(valueOf2) || StringUtils.isEmpty(a2)) {
            OLog.e("BaseCriticalRequest", "formatNetConnection get request params error", "appKey", str2, "appVersion", str3, "osVersion", valueOf, "brand", str4, "model", str5, "deviceId", utdid, "timestamp", valueOf2, "sign", a2);
            return;
        }
        naaVar.a(str);
        naaVar.b("GET");
        naaVar.a(0);
        naaVar.a(false);
        naaVar.f();
        naaVar.a("o-app-key", f.b(str2));
        naaVar.a("o-app-version", f.b(str3));
        naaVar.a("o-os-version", f.b(valueOf));
        naaVar.a("o-mobile-brand", f.b(str4));
        naaVar.a("o-mobile-model", f.b(str5));
        naaVar.a("o-device-id", f.b(utdid));
        naaVar.a("o-timestamp", f.b(valueOf2));
        naaVar.a("o-sign", f.b(a2));
        naaVar.a("o-startup-type", this.b ? "1" : "0");
        OLog.e("BaseCriticalRequest", "net start connect", new Object[0]);
        naaVar.d();
    }
}
