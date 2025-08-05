package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.extra.IPerformanceListener;
import android.taobao.windvane.extra.WVPerformanceListenerManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.collector.b;
import com.taobao.android.diagnose.model.AbnormalInfo;
import com.taobao.android.diagnose.model.PageInfo;
import com.taobao.android.diagnose.v;
import java.util.Map;
import java.util.concurrent.Executor;
import mtopsdk.mtop.common.MtopStatsListener;
import mtopsdk.mtop.intf.MtopSetting;
import tb.arz;
import tb.fmx;
import tb.kge;
import tb.myr;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public final Application f11688a;
    public final com.taobao.android.diagnose.model.a b;
    public final Executor c;
    private com.taobao.android.diagnose.scene.a d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final b f11690a;

        static {
            kge.a(-259092648);
            f11690a = new b(null);
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("210ab2f7", new Object[0]) : f11690a;
        }
    }

    static {
        kge.a(752259205);
    }

    /* renamed from: lambda$DhEd_masSSLsV6Dc-mGZOcYCnzM */
    public static /* synthetic */ void m905lambda$DhEd_masSSLsV6DcmGZOcYCnzM(b bVar, Map map) {
        bVar.c(map);
    }

    public static /* synthetic */ void lambda$O1JZxRAFTLp2LHL1aIdDk6QkP70(b bVar, Map map) {
        bVar.b(map);
    }

    public static /* synthetic */ void lambda$RRTVXSBHsn4mmFKzNT8UnVBvDI0(b bVar, myr myrVar) {
        bVar.b(myrVar);
    }

    public static /* synthetic */ void lambda$YvQBCk8rbiUybn4o0gLdDgBNEB0(b bVar, myr myrVar) {
        bVar.a(myrVar);
    }

    public static /* synthetic */ void lambda$b9j_woFNvLFAogN0KpWkTmSYInw(b bVar, String str, Map map) {
        bVar.b(str, map);
    }

    public static /* synthetic */ void lambda$xUf6s6xnbFL2b5i9KY4FuLdrGps(b bVar, Map map) {
        bVar.a(map);
    }

    public static /* synthetic */ void lambda$yMtFlglJExZNMFxgL59oBsc0DVI(b bVar, Map map) {
        bVar.d(map);
    }

    public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static /* synthetic */ com.taobao.android.diagnose.scene.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.diagnose.scene.a) ipChange.ipc$dispatch("63f3acc8", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ void a(b bVar, AbnormalInfo abnormalInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256e850c", new Object[]{bVar, abnormalInfo});
        } else {
            bVar.a(abnormalInfo);
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("210ab2f7", new Object[0]) : a.a();
    }

    private b() {
        this.f11688a = com.taobao.android.diagnose.c.a().c();
        this.b = com.taobao.android.diagnose.c.a().d();
        this.c = com.taobao.android.diagnose.common.c.a().b();
    }

    public void a(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc45ab9", new Object[]{this, aVar});
        } else {
            this.d = aVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        v.a("AbnormalCollector", "init");
        try {
            c();
            d();
            e();
            f();
            g();
            h();
        } catch (Exception e) {
            v.a("AbnormalCollector", "init exception", e);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!com.taobao.android.diagnose.config.a.m.monitorMtopError) {
        } else {
            v.a("AbnormalCollector", "initMtopErrorListener");
            MtopSetting.addMtopStatisListener("", new MtopStatsListener() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$DhEd_masSSLsV6Dc-mGZOcYCnzM
                @Override // mtopsdk.mtop.common.MtopStatsListener
                public final void onStats(Map map) {
                    b.m905lambda$DhEd_masSSLsV6DcmGZOcYCnzM(b.this, map);
                }
            });
        }
    }

    public /* synthetic */ void c(final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$yMtFlglJExZNMFxgL59oBsc0DVI
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$yMtFlglJExZNMFxgL59oBsc0DVI(b.this, map);
                }
            });
        }
    }

    public /* synthetic */ void d(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (map == null) {
        } else {
            try {
                String str = (String) map.get("api");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                AbnormalInfo addInfo = new AbnormalInfo(12).addInfo("api", str).addInfo("retType", (String) map.get("retType")).addInfo(com.taobao.mtop.wvplugin.a.RESULT_KEY, (String) map.get(com.taobao.mtop.wvplugin.a.RESULT_KEY)).addInfo(arz.KEY_MAPPING_CODE, (String) map.get(arz.KEY_MAPPING_CODE)).addInfo("httpResponseStatus", (String) map.get("httpResponseStatus"));
                a(addInfo);
                v.a("AbnormalCollector", "Mtop Error Event:" + addInfo.info.toString());
                if (!com.taobao.android.diagnose.scene.a.a("scene_mtop_error") || this.d == null) {
                    return;
                }
                fmx fmxVar = new fmx();
                fmxVar.a("fact_mtop_api_name", str);
                fmxVar.a("fact_mtop_err_type", map.get("retType"));
                fmxVar.a("fact_mtop_err_code", map.get(com.taobao.mtop.wvplugin.a.RESULT_KEY));
                fmxVar.a("fact_mtop_mapping_code", map.get(arz.KEY_MAPPING_CODE));
                fmxVar.a("fact_mtop_res_code", map.get("httpResponseStatus"));
                this.d.a("scene_mtop_error", fmxVar);
            } catch (Exception e) {
                v.a("AbnormalCollector", "Mtop Error Event Exception", e);
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!com.taobao.android.diagnose.config.a.m.monitorMtopTime) {
        } else {
            v.a("AbnormalCollector", "initMtopListener");
            com.taobao.tao.log.interceptor.g.a(this.f11688a, new com.taobao.tao.log.interceptor.a() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$YvQBCk8rbiUybn4o0gLdDgBNEB0
                @Override // com.taobao.tao.log.interceptor.a
                public final void onSpanFinish(myr myrVar) {
                    b.lambda$YvQBCk8rbiUybn4o0gLdDgBNEB0(b.this, myrVar);
                }
            });
        }
    }

    public /* synthetic */ void a(final myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57318d2", new Object[]{this, myrVar});
        } else if (myrVar == null || !"mtop".equals(myrVar.i())) {
        } else {
            this.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$RRTVXSBHsn4mmFKzNT8UnVBvDI0
                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$RRTVXSBHsn4mmFKzNT8UnVBvDI0(b.this, myrVar);
                }
            });
        }
    }

    public /* synthetic */ void b(myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f61f53", new Object[]{this, myrVar});
            return;
        }
        String str = (String) com.taobao.android.diagnose.common.d.a(myrVar.j(), "apiName", "");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long l = myrVar.l() - myrVar.k();
        Map<String, Long> map = com.taobao.android.diagnose.config.a.m.mtopFilterMap;
        if (l <= com.taobao.android.diagnose.config.a.m.mtopTimeout && (!map.containsKey(str) || l <= map.get(str).longValue())) {
            return;
        }
        AbnormalInfo addInfo = new AbnormalInfo(13).addInfo("api", str).addInfo("cost", String.valueOf(l));
        a(addInfo);
        v.a("AbnormalCollector", "Mtop Timeout Event: " + addInfo.info.toString());
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!com.taobao.android.diagnose.config.a.m.monitorLag) {
        } else {
            v.a("AbnormalCollector", "registerLagEvent");
            com.taobao.application.common.c.a(new com.taobao.application.common.f() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$xUf6s6xnbFL2b5i9KY4FuLdrGps
                @Override // com.taobao.application.common.f
                public final void onBlock(Map map) {
                    b.lambda$xUf6s6xnbFL2b5i9KY4FuLdrGps(b.this, map);
                }
            });
        }
    }

    public /* synthetic */ void a(final Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$O1JZxRAFTLp2LHL1aIdDk6QkP70
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$O1JZxRAFTLp2LHL1aIdDk6QkP70(b.this, map);
                }
            });
        }
    }

    public /* synthetic */ void b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        try {
            AbnormalInfo abnormalInfo = new AbnormalInfo(11);
            for (Map.Entry entry : map.entrySet()) {
                abnormalInfo.addInfo((String) entry.getKey(), entry.getValue().toString());
            }
            a(abnormalInfo);
            v.a("AbnormalCollector", "Lag Event: " + abnormalInfo.info.toString());
        } catch (Exception e) {
            v.a("AbnormalCollector", "Lag Event Exception", e);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!com.taobao.android.diagnose.config.a.m.monitorH5White) {
        } else {
            v.a("AbnormalCollector", "registerH5WhiteEvent");
            WVPerformanceListenerManager.getInstance().addPerformanceListener(new AnonymousClass1());
        }
    }

    /* renamed from: com.taobao.android.diagnose.collector.b$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements IPerformanceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: lambda$-WagNZfPoBNj8UJdd6t-G6n0yk4 */
        public static /* synthetic */ void m906lambda$WagNZfPoBNj8UJdd6tG6n0yk4(AnonymousClass1 anonymousClass1, int i, Map map) {
            anonymousClass1.a(i, map);
        }

        @Override // android.taobao.windvane.extra.IPerformanceListener
        public int getFlag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dbfa2b5c", new Object[]{this})).intValue();
            }
            return 1;
        }

        public AnonymousClass1() {
            b.this = r1;
        }

        @Override // android.taobao.windvane.extra.IPerformanceListener
        public void onPerformanceEventOccur(final int i, final Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de678e4c", new Object[]{this, new Integer(i), map});
            } else {
                b.this.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$1$-WagNZfPoBNj8UJdd6t-G6n0yk4
                    {
                        b.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        b.AnonymousClass1.m906lambda$WagNZfPoBNj8UJdd6tG6n0yk4(b.AnonymousClass1.this, i, map);
                    }
                });
            }
        }

        public /* synthetic */ void a(int i, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            } else if (i != 1) {
            } else {
                try {
                    AbnormalInfo abnormalInfo = new AbnormalInfo(9);
                    abnormalInfo.addInfo(map);
                    b.a(b.this, abnormalInfo);
                    v.a("AbnormalCollector", "H5 White Page Event: " + abnormalInfo.info.toString());
                    if (b.this.b.i().isInner) {
                        com.taobao.android.diagnose.common.b.a(abnormalInfo.type);
                    }
                    if (b.a(b.this) == null) {
                        return;
                    }
                    b.a(b.this).a("scene_white_h5", (fmx) null);
                } catch (Exception e) {
                    v.a("AbnormalCollector", "H5 White Page Event Exception", e);
                }
            }
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            if (!com.taobao.android.diagnose.config.a.m.monitorNativeWhite) {
            }
        }
    }

    public void a(final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!com.taobao.android.diagnose.config.a.m.abnormalEnable || !com.taobao.android.diagnose.config.a.m.monitorBizError) {
        } else {
            this.c.execute(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$b$b9j_woFNvLFAogN0KpWkTmSYInw
                {
                    b.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.lambda$b9j_woFNvLFAogN0KpWkTmSYInw(b.this, str, map);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        try {
            AbnormalInfo addInfo = new AbnormalInfo(4).addInfo("bizName", str).addInfo(map);
            a(addInfo);
            v.a("AbnormalCollector", "Biz Error Event: " + addInfo.info.toString());
        } catch (Exception e) {
            v.a("AbnormalCollector", "Biz Error Event Exception", e);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!com.taobao.android.diagnose.config.a.m.monitorWeexWhite) {
        } else {
            v.a("AbnormalCollector", "registerWeexWhiteEvent");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.android.abnormal.action.weex.white");
            LocalBroadcastManager.getInstance(this.f11688a).registerReceiver(new AbnormalCollector$2(this), intentFilter);
        }
    }

    private void a(AbnormalInfo abnormalInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff56b73d", new Object[]{this, abnormalInfo});
        } else if (abnormalInfo == null || !com.taobao.android.diagnose.config.a.m.abnormalEnable) {
        } else {
            try {
                PageInfo d = this.b.d();
                if (d != null) {
                    d.addAbnormalInfo(abnormalInfo);
                }
                abnormalInfo.writeToLog();
            } catch (Exception e) {
                v.a("AbnormalCollector", "onAbnormal", e);
            }
        }
    }
}
