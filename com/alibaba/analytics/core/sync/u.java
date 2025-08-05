package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamDeflater;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import tb.apf;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static u c;
    private boolean d = false;
    private boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public ByteArrayOutputStream f2116a = null;
    public com.android.taobao.zstd.c b = null;
    private ZstdStreamDeflater f = null;

    static {
        kge.a(-576387391);
    }

    public static synchronized u a() {
        synchronized (u.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u) ipChange.ipc$dispatch("165efb12", new Object[0]);
            }
            if (c == null) {
                c = new u();
            }
            return c;
        }
    }

    private u() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        apr.b("", "initZstd zstdDowngradeByClient", Boolean.valueOf(this.e), "zstdDowngradeByServer", Boolean.valueOf(this.d));
        if (this.e || this.d) {
            return;
        }
        try {
            this.f = new ZstdStreamDeflater();
            this.f.setLevel(7);
            this.f2116a = new ByteArrayOutputStream();
            this.b = new com.android.taobao.zstd.c(this.f2116a, this.f, true);
        } catch (NoClassDefFoundError unused) {
            this.e = true;
        } catch (Throwable unused2) {
            this.e = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        apr.b("", "closeOutputStream zstd");
        a(this.b);
        a(this.f2116a);
        if (this.f == null) {
            return;
        }
        try {
            apr.b("", "closeOutputStream deflater");
            this.f.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f = null;
    }

    private void a(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16f4ac5a", new Object[]{this, outputStream});
        } else if (outputStream == null) {
        } else {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d = true;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        boolean b = t.a().b();
        Object[] objArr = new Object[8];
        objArr[0] = "zstdDowngradeByServer";
        objArr[1] = Boolean.valueOf(this.d);
        objArr[2] = "zstdDowngradeByClient";
        objArr[3] = Boolean.valueOf(this.e);
        objArr[4] = "isEnableZstdConfig";
        objArr[5] = Boolean.valueOf(b);
        objArr[6] = "zstdOutputStream";
        objArr[7] = Boolean.valueOf(this.b != null);
        apr.b("ZstdMgr", objArr);
        return !this.d && !this.e && b && this.b != null;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !this.d && !this.e && t.a().c() && this.b != null;
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!g() || i <= 0 || i2 <= 0 || i3 <= 0 || !com.alibaba.analytics.core.config.q.a().a(19997, "_ut_zstd")) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("base", "" + i);
            hashMap.put("gzip", "" + i2);
            hashMap.put("zstd", "" + i3);
            apf.a().a(new com.alibaba.analytics.core.model.a("UT", "19997", "_ut_zstd", "", "", hashMap));
        }
    }
}
