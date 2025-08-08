package com.alibaba.analytics.core.logbuilder;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.search.common.util.k;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import org.json.JSONObject;
import tb.aob;
import tb.apn;
import tb.apr;
import tb.aqb;
import tb.aqe;
import tb.cew;
import tb.kge;
import tb.rqd;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_TIME_ADJUST_HOST_PORT = "time_adjust_host";

    /* renamed from: a  reason: collision with root package name */
    private static g f2087a;
    private long b = 0;
    private String c = k.HTTPS_PREFIX;
    private String d = MtopUnitStrategy.CENTER_ONLINE_DOMAIN;
    private String e = "/gw/mtop.common.getTimestamp/*";
    private boolean f = false;

    public static /* synthetic */ long a(g gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860a8894", new Object[]{gVar, new Long(j)})).longValue();
        }
        gVar.b = j;
        return j;
    }

    public static /* synthetic */ String a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14fcce7c", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("860ac4b4", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.f = z;
        return z;
    }

    public static /* synthetic */ String b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88c52bd", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ String c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc1bd6fe", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ long d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de24eb75", new Object[]{gVar})).longValue() : gVar.b;
    }

    public static /* synthetic */ boolean e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("979c7924", new Object[]{gVar})).booleanValue() : gVar.f;
    }

    static {
        kge.a(-44416667);
        f2087a = new g();
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("6fb8f8a4", new Object[0]) : f2087a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        apr.b("TimeStampAdjustMgr", "bTimeStampAdjust", Boolean.valueOf(rqd.bTimeStampAdjust));
        if (!rqd.bTimeStampAdjust) {
            return;
        }
        aqe.a().a(null, new Runnable() { // from class: com.alibaba.analytics.core.logbuilder.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = g.a(g.this);
                String a3 = aqb.a(aob.a().k(), g.TAG_TIME_ADJUST_HOST_PORT);
                if (!StringUtils.isEmpty(a3)) {
                    a2 = a3;
                }
                String str = g.b(g.this) + a2 + g.c(g.this);
                apn.a a4 = apn.a(1, str, null, false);
                apr.b("TimeStampAdjustMgr", "url", str, InputFrame3.TYPE_RESPONSE, a4);
                if (a4 == null || a4.b == null) {
                    return;
                }
                try {
                    JSONObject optJSONObject = new JSONObject(new String(a4.b, 0, a4.b.length)).optJSONObject("data");
                    if (optJSONObject == null) {
                        return;
                    }
                    String optString = optJSONObject.optString("t");
                    if (StringUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        long parseLong = Long.parseLong(optString);
                        long j = parseLong - currentTimeMillis;
                        if (j > cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT || currentTimeMillis - parseLong > cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT) {
                            g.a(g.this, j);
                            g.a(g.this, true);
                        }
                        apr.b("TimeStampAdjustMgr", "t", optString, com.taobao.android.weex_framework.util.a.ATOM_EXT_now, Long.valueOf(currentTimeMillis), "diff", Long.valueOf(g.d(g.this)), "flag", Boolean.valueOf(g.e(g.this)));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 0L);
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : System.currentTimeMillis() + this.b;
    }

    public long a(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        try {
            j = Long.parseLong(str);
        } catch (Exception e) {
            apr.b("TimeStampAdjustMgr", e);
            j = 0;
        }
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        return j + this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }
}
