package com.alibaba.analytics.core.sync;

import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.config.f;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aob;
import tb.apg;
import tb.aqb;
import tb.kge;

/* loaded from: classes.dex */
public class i implements f.a, e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_TNET_HOST_PORT = "utanalytics_tnet_host_port";

    /* renamed from: a  reason: collision with root package name */
    private static i f2102a;
    private h b;
    private boolean c;
    private int d = 0;
    private int e = 10;
    private boolean f = false;

    static {
        kge.a(1942216056);
        kge.a(-2114741388);
        kge.a(1578308352);
    }

    public static synchronized i a() {
        synchronized (i.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("165ef99e", new Object[0]);
            }
            if (f2102a == null) {
                f2102a = new i();
            }
            return f2102a;
        }
    }

    private i() {
        this.c = false;
        try {
            this.b = new h();
            this.b.a("adashx.m.taobao.com");
            String a2 = apg.a(aob.a().k(), TAG_TNET_HOST_PORT);
            if (!StringUtils.isEmpty(a2)) {
                this.c = true;
            }
            a(a2);
            String a3 = aqb.a(aob.a().k(), TAG_TNET_HOST_PORT);
            if (!StringUtils.isEmpty(a3)) {
                this.c = true;
            }
            a(a3);
            a(com.alibaba.analytics.core.config.f.a().a(TAG_TNET_HOST_PORT));
            com.alibaba.analytics.core.config.f.a().a(TAG_TNET_HOST_PORT, this);
        } catch (Throwable unused) {
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // com.alibaba.analytics.core.sync.e
    public h e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("3a62d683", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(str2);
        }
    }

    private void a(String str) {
        String trim;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (indexOf = (trim = str.trim()).indexOf(":")) == -1) {
        } else {
            String substring = trim.substring(0, indexOf);
            int parseInt = Integer.parseInt(trim.substring(indexOf + 1, trim.length()));
            if (StringUtils.isEmpty(substring) || parseInt <= 0) {
                return;
            }
            this.b.a(substring);
            this.b.a(parseInt);
        }
    }

    @Override // com.alibaba.analytics.core.sync.e
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617dc0c5", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            c();
            if (bVar.a()) {
                this.d = 0;
                return;
            }
            this.d++;
            if (this.d <= this.e) {
                return;
            }
            aob.a().a(true);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        f();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f) {
        } else {
            String a2 = apg.a(aob.a().k(), "utanalytics_tnet_downgrade");
            if (!StringUtils.isEmpty(a2)) {
                try {
                    int intValue = Integer.valueOf(a2).intValue();
                    if (intValue > 0 && intValue <= 10) {
                        this.e = intValue;
                    }
                } catch (Throwable unused) {
                }
            }
            this.f = true;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        int b = com.alibaba.analytics.core.config.f.a().b("tnet_downgrade");
        if (b <= 0 || b > 10) {
            return;
        }
        this.e = b;
    }
}
