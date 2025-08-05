package com.alibaba.analytics.core.sync;

import android.os.SystemClock;
import anet.channel.Constants;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.sync.UploadLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.aob;
import tb.aor;
import tb.apb;
import tb.apf;
import tb.apr;
import tb.apu;
import tb.kge;

/* loaded from: classes.dex */
public class o extends UploadLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static o l;
    private volatile boolean e = false;
    private int f = -1;
    private int g = 0;
    private float h = 200.0f;
    private int i = 0;
    private long j = 0;
    private boolean k = false;
    public int d = -1;
    private boolean m = true;
    private boolean n = true;

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-662082595);
        l = null;
    }

    public static o b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("df5ff199", new Object[0]);
        }
        if (l == null) {
            synchronized (o.class) {
                if (l == null) {
                    l = new o();
                }
            }
        }
        return l;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (!aob.a().e()) {
                f();
            } else {
                apr.c("UploadLogFromDB", "isAllServiceClosed");
            }
        } catch (Throwable th) {
            apr.b("UploadLogFromDB", th, new Object[0]);
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.a(this.j);
        } catch (Throwable th2) {
            apr.b("UploadLogFromDB", th2, new Object[0]);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        apr.c();
        if (!NetworkUtil.a(aob.a().k())) {
            apr.b("UploadLogFromDB", "Network is Disconnected");
        } else if (UploadLog.NetworkStatus.ALL != this.c && this.c != a()) {
            apr.c("UploadLogFromDB", "current networkstatus", a(), "mAllowedNetworkStatus", this.c);
        } else if (this.e) {
        } else {
            this.e = true;
            try {
                this.j = 0L;
                if (!apu.a(aob.a().k())) {
                    apr.b("UploadLogFromDB", "Other Process is Uploading, break");
                    return;
                }
                List<com.alibaba.analytics.core.model.a> a2 = apf.a().a(d());
                if (a2 != null && a2.size() != 0) {
                    if (this.d <= 0) {
                        this.d = this.f2095a;
                    }
                    apr.b("UploadLogFromDB", "mUploadIndex", Integer.valueOf(this.d), "mMaxUploadTimes", Integer.valueOf(this.f2095a));
                    if (a(a2, this.d == this.f2095a)) {
                        this.d = this.f2095a;
                    } else {
                        this.d--;
                        if (this.d > 0) {
                            q.a().a(q.MSGTYPE_INTERVAL);
                        } else {
                            this.d = this.f2095a;
                        }
                    }
                    return;
                }
                apr.b("UploadLogFromDB", "logs is null");
                this.d = this.f2095a;
                this.e = false;
            } catch (Throwable th) {
                try {
                    apr.b("UploadLogFromDB", th, new Object[0]);
                } finally {
                    this.e = false;
                    apu.a();
                }
            }
        }
    }

    private boolean a(List<com.alibaba.analytics.core.model.a> list, boolean z) throws Exception {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19a0b49f", new Object[]{this, list, new Boolean(z)})).booleanValue();
        }
        apr.b("UploadLogFromDB", "firstRequest", Boolean.valueOf(z), "firstLaunch", Boolean.valueOf(this.m));
        this.m = false;
        Map<String, String> a3 = a(list);
        if (a3 == null || a3.size() == 0) {
            apr.b("UploadLogFromDB", "postDataMap is null");
            this.e = false;
            return true;
        }
        if (!aob.a().d()) {
            if (this.n && z && j.a().d() == 2 && j.a().e() == 0 && apb.a().e() == 0 && apb.a().f() > 0) {
                apr.b("UploadLogFromDB", "forceCloseSession");
                l.b();
                this.n = false;
            }
            if (l.a()) {
                h c = j.a().c();
                apr.b("UploadLogFromDB", "CreateSession tnet host", c.a(), "port", Integer.valueOf(c.b()), "type", Integer.valueOf(c.c()));
                if (c.c() == 1) {
                    aor.a().a(true);
                } else {
                    aor.a().a(false);
                }
            } else {
                h b = j.a().b();
                apr.b("UploadLogFromDB", "TempSession tnet host", b.a(), "port", Integer.valueOf(b.b()), "type", Integer.valueOf(b.c()));
            }
        } else {
            aor.a().a(false);
        }
        byte[] bArr = null;
        try {
            bArr = a.a(a3, z);
        } catch (Exception e) {
            apr.e(null, e.toString());
        }
        if (bArr == null) {
            g();
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aob.a().d()) {
            a2 = s.a(bArr);
        } else {
            a2 = l.a(bArr);
            a2.f = z;
        }
        boolean a4 = a2.a();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j = elapsedRealtime2 - elapsedRealtime;
        a(Boolean.valueOf(a4), j);
        j.a().a(a2);
        if (a4) {
            aob.a().c();
            this.k = true;
            this.j += apf.a().a(list);
            try {
                a(a2.e);
            } catch (Exception unused) {
            }
        }
        apr.d("UploadLogFromDB", "isSendSuccess", Boolean.valueOf(a4), "upload log count", Integer.valueOf(list.size()), "upload consume", Long.valueOf(j), "delete consume", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime2));
        try {
            Thread.sleep(100L);
        } catch (Throwable th) {
            apr.a("UploadLogFromDB", th, new Object[0]);
        }
        return false;
    }

    private Map<String, String> a(List<com.alibaba.analytics.core.model.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        HashMap hashMap = null;
        if (list != null && list.size() != 0) {
            HashMap hashMap2 = new HashMap();
            List<com.alibaba.analytics.core.model.a> list2 = null;
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.alibaba.analytics.core.model.a aVar = list.get(i2);
                if (i > 5242880) {
                    list2 = a(list2, aVar);
                    apr.b("UploadLogFromDB", "log delay to upload because totalUploadSize Exceed. log", aVar, "totalUploadSize", Integer.valueOf(i));
                } else if (com.alibaba.analytics.core.config.f.a().c() && com.alibaba.analytics.core.config.f.a().a(com.alibaba.analytics.core.logbuilder.b.a(aVar.a()))) {
                    list2 = a(list2, aVar);
                    if (list.get(i2).b.compareToIgnoreCase("3") >= 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(list.get(i2));
                    }
                    apr.b("UploadLogFromDB", "log delay to upload because delay config. log", aVar);
                } else {
                    StringBuilder sb = (StringBuilder) hashMap2.get(aVar.f2089a);
                    if (sb == null) {
                        sb = new StringBuilder();
                        hashMap2.put(aVar.f2089a, sb);
                    } else {
                        sb.append((char) 1);
                        i++;
                    }
                    String a2 = list.get(i2).a();
                    sb.append(a2);
                    i += a2.length();
                }
            }
            if (list2 != null) {
                list.removeAll(list2);
            }
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((com.alibaba.analytics.core.model.a) arrayList.get(i3)).b = "2";
                }
                apf.a().b(arrayList);
            }
            hashMap = new HashMap();
            this.i = i;
            for (String str : hashMap2.keySet()) {
                hashMap.put(str, ((StringBuilder) hashMap2.get(str)).toString());
            }
            if (list.size() > 0) {
                this.h = this.i / list.size();
            }
            apr.b("UploadLogFromDB", "averagePackageSize", Float.valueOf(this.h), "mUploadByteSize", Integer.valueOf(this.i), "count", Integer.valueOf(list.size()));
        }
        return hashMap;
    }

    private List<com.alibaba.analytics.core.model.a> a(List<com.alibaba.analytics.core.model.a> list, com.alibaba.analytics.core.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6ba4cd4", new Object[]{this, list, aVar});
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(aVar);
        return list;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f /= 2;
        int i = this.f;
        if (i <= 0) {
            this.f = 1;
            this.g = 0;
        } else if (i > 350) {
            this.f = 350;
        }
        apr.b("UploadLogFromDB", "winsize", Integer.valueOf(this.f));
    }

    private int a(Boolean bool, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91fcb972", new Object[]{this, bool, new Long(j)})).intValue();
        }
        if (j < 0) {
            return this.f;
        }
        float f = this.i / ((float) j);
        if (!bool.booleanValue()) {
            this.f /= 2;
            this.g++;
        } else if (j > Constants.MAX_SESSION_IDLE_TIME) {
            return this.f;
        } else {
            this.f = (int) (((f * 45000.0f) / this.h) - this.g);
        }
        int i = this.f;
        if (i <= 0) {
            this.f = 1;
            this.g = 0;
        } else if (i > 350) {
            this.f = 350;
        }
        apr.b("UploadLogFromDB", "winsize", Integer.valueOf(this.f));
        return this.f;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        if (this.f == -1) {
            e();
        }
        return this.f;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = NetworkUtil.a();
        if ("Wi-Fi".equalsIgnoreCase(a2)) {
            this.f = 50;
        } else if ("4G".equalsIgnoreCase(a2)) {
            this.f = 40;
        } else if ("3G".equalsIgnoreCase(a2)) {
            this.f = 30;
        } else {
            this.f = 40;
        }
        this.g = 0;
    }
}
