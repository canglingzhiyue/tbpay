package com.taobao.android.detail2.core.framework;

import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.volume.VolumeChangeManager;
import com.taobao.android.detail2.core.framework.base.windvane.NewDetailWVLocalWeexBranch;
import com.taobao.android.detail2.core.framework.base.windvane.NewDetailWVPlugin;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.framework.view.manager.NavBarViewManager;
import com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.global.setting.SettingStateWVApiPlugin;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.livephoto.weex.LivePhotoWeexView;
import com.taobao.utils.Global;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cri;
import tb.ctu;
import tb.egm;
import tb.fhd;
import tb.fhe;
import tb.fhf;
import tb.fhg;
import tb.fhv;
import tb.fhw;
import tb.fic;
import tb.fid;
import tb.fif;
import tb.fig;
import tb.fil;
import tb.fim;
import tb.fio;
import tb.fip;
import tb.fjp;
import tb.fjr;
import tb.fjt;
import tb.fkb;
import tb.fkr;
import tb.fkt;
import tb.flg;
import tb.fli;
import tb.flj;
import tb.fll;
import tb.flr;
import tb.fls;
import tb.fmd;
import tb.ipa;
import tb.kge;
import tb.kuh;
import tb.kxs;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fmd f11531a;
    private DetailDataManager b;
    private com.taobao.android.detail2.core.framework.view.manager.b c;
    private VolumeChangeManager d;
    private List<flr> e = new ArrayList();
    private HashMap<String, List<Object>> f = new HashMap<>();
    private b g;
    private com.taobao.android.detail2.core.framework.internallistener.detail.a h;
    private boolean i;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(com.taobao.android.detail2.core.framework.view.feeds.d dVar, JSONObject jSONObject);
    }

    static {
        kge.a(-1286880378);
    }

    public static /* synthetic */ b a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7b2929a3", new Object[]{eVar}) : eVar.g;
    }

    public static /* synthetic */ void a(e eVar, com.taobao.android.detail2.core.framework.a aVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27a70d7", new Object[]{eVar, aVar, new Integer(i), new Long(j), new Long(j2)});
        } else {
            eVar.a(aVar, i, j, j2);
        }
    }

    public static /* synthetic */ void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1367493", new Object[]{eVar});
        } else {
            eVar.m();
        }
    }

    public static /* synthetic */ fkr c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("bdc82ce7", new Object[]{eVar}) : eVar.p();
    }

    public static /* synthetic */ fmd d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fmd) ipChange.ipc$dispatch("e35c3bb8", new Object[]{eVar}) : eVar.f11531a;
    }

    public e(com.taobao.android.detail2.core.framework.a aVar, FrameLayout frameLayout, Intent intent, NewDetailMaskFrameLayout.d dVar) {
        this.g = new b(aVar, intent);
        if (dVar != null) {
            this.g.a(dVar);
        }
        this.d = new VolumeChangeManager(this.g);
        this.f11531a = new fmd(this.g, frameLayout, this.d);
        this.b = new DetailDataManager(this.g);
        if (!ipa.c()) {
            this.c = new com.taobao.android.detail2.core.framework.view.manager.b(this.g, this.f11531a, this.b);
        }
        l();
        n();
        if (ipa.a("fast_key_delay_init_wind_vane")) {
            ipa.b(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "initWindVane";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (ipa.a(e.a(e.this).g())) {
                    } else {
                        e.b(e.this);
                    }
                }
            });
        } else if (dVar != null) {
            dVar.a(new NewDetailMaskFrameLayout.b() { // from class: com.taobao.android.detail2.core.framework.e.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "initWindVane";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        e.b(e.this);
                    }
                }
            });
        } else {
            m();
        }
        a(this.f11531a);
        fif.a(aVar);
        for (fic ficVar : fid.f27966a) {
            ficVar.a(this);
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this.g.g());
        if (!fig.j) {
            MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
            MUSEngine.registerPlatformView("livephotoview", LivePhotoWeexView.class);
            fig.j = true;
        }
        if (!TextUtils.isEmpty(p().k().J)) {
            UTAnalytics.getInstance().getDefaultTracker().addTPKCache(kuh.ALI_TRACK_ID, p().k().J);
        }
        if (ipa.a("fast_key_delay_init_plt_mus")) {
            ipa.b(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "PltMusModuleUtils.initModules";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (ipa.a(e.a(e.this).g())) {
                    } else {
                        cri.a();
                    }
                }
            });
        } else if (this.g.k() != null) {
            this.g.k().a(new NewDetailMaskFrameLayout.b() { // from class: com.taobao.android.detail2.core.framework.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "PltMusModuleUtils.initModules";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        cri.a();
                    } catch (Exception e) {
                        fjt.a("new_detail异常", "拍立淘初始化失败", e);
                    }
                }
            });
        } else {
            try {
                cri.a();
            } catch (Exception e) {
                fjt.a("new_detail异常", "拍立淘初始化失败", e);
            }
        }
        com.taobao.android.preload.h a2 = com.taobao.android.preload.i.a("new_detail");
        if (a2 != null) {
            a2.b(fkt.b(Global.getApplication()));
        }
        if (ipa.a()) {
            b(aVar);
        } else {
            a(aVar);
        }
    }

    private void a(fmd fmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d1b53b", new Object[]{this, fmdVar});
            return;
        }
        b bVar = this.g;
        if (bVar == null || !bVar.h().b().af()) {
            return;
        }
        this.h = new com.taobao.android.detail2.core.framework.internallistener.detail.a(this, fmdVar);
        String k = k();
        String ag = this.g.h().b().ag();
        if (!TextUtils.isEmpty(ag)) {
            k = ag;
        }
        fjt.a(fjt.TAG_INSIDE_DETAIL, "initDetailListener 注册详情半屏生命周期。" + k);
        egm.a(k, this.h);
    }

    private void b(final com.taobao.android.detail2.core.framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134a317", new Object[]{this, aVar});
            return;
        }
        final int i = fig.f27971a;
        fig.f27971a++;
        final long a2 = fkb.a(fig.b);
        final long uptimeMillis = SystemClock.uptimeMillis();
        if (ipa.u()) {
            ipa.a(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.e.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "doTraceNDEntryTime";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        e.a(e.this, aVar, i, a2, uptimeMillis);
                    }
                }
            });
        } else {
            a(aVar, i, a2, uptimeMillis);
        }
    }

    private void a(com.taobao.android.detail2.core.framework.a aVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f2d6cb", new Object[]{this, aVar, new Integer(i), new Long(j), new Long(j2)});
            return;
        }
        try {
            if (ipa.a("sjs_apm_param", 1) > 0) {
                fjp.a(aVar, "ndSjsYhApmParam", (Object) ipa.ba());
                fjp.a(aVar, "ndTppYhApmParam", (Object) ipa.bb());
            }
        } catch (Exception e) {
            fjt.a(fjt.TAG_TIP, "ndSjsYhApmParam error", e);
        }
        fjp.a(aVar, "enterNDNum", Integer.valueOf(i));
        fjp.a(aVar, "NDAppLauncherStartTime", j);
        fjp.a(aVar, "enterNDTime", j2);
        fjp.a(aVar, "NDIdleTaskExecute", Boolean.valueOf(fig.c));
        fjp.a(aVar, "NDIdleTaskPreloadWeexExecute", Boolean.valueOf(fig.d));
        fjp.a(aVar, "NDReadBucketFromInfoFlow", Boolean.valueOf(fig.f));
        fjp.a(aVar, "NDReadBucketFromCache", Boolean.valueOf(fig.g));
        fjp.a(aVar, "NDReadBucketTrueFromInfoFlow", Boolean.valueOf(fig.h));
        fjp.a(aVar, "NDReadBucketTrueFromCache", Boolean.valueOf(fig.i));
        fjp.a(aVar, "NDIdleTaskGetTBMainActivity", Boolean.valueOf(fig.e));
        fjp.a(aVar, "enterNDTimeGap", Long.valueOf(j2 - j));
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_ENTER_PAGE_INIT, (Map<String, String>) null);
    }

    @Deprecated
    private void a(com.taobao.android.detail2.core.framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8afcf8", new Object[]{this, aVar});
            return;
        }
        try {
            if (ipa.a("sjs_apm_param", 1) > 0) {
                fjp.a(aVar, "ndSjsYhApmParam", (Object) ipa.ba());
                fjp.a(aVar, "ndTppYhApmParam", (Object) ipa.bb());
            }
        } catch (Exception unused) {
            fjt.a(fjt.TAG_TIP, "ndSjsYhApmParam error old.");
        }
        fjp.a(aVar, "enterNDNum", Integer.valueOf(fig.f27971a));
        fig.f27971a++;
        long a2 = fkb.a(fig.b);
        fjp.a(aVar, "NDAppLauncherStartTime", a2);
        long uptimeMillis = SystemClock.uptimeMillis();
        fjp.a(aVar, "enterNDTime", uptimeMillis);
        fjp.a(aVar, "NDIdleTaskExecute", Boolean.valueOf(fig.c));
        fjp.a(aVar, "NDIdleTaskPreloadWeexExecute", Boolean.valueOf(fig.d));
        fjp.a(aVar, "NDReadBucketFromInfoFlow", Boolean.valueOf(fig.f));
        fjp.a(aVar, "NDReadBucketFromCache", Boolean.valueOf(fig.g));
        fjp.a(aVar, "NDReadBucketTrueFromInfoFlow", Boolean.valueOf(fig.h));
        fjp.a(aVar, "NDReadBucketTrueFromCache", Boolean.valueOf(fig.i));
        fjp.a(aVar, "NDIdleTaskGetTBMainActivity", Boolean.valueOf(fig.e));
        fjp.a(aVar, "enterNDTimeGap", Long.valueOf(uptimeMillis - a2));
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_ENTER_PAGE_INIT, (Map<String, String>) null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ctu.a("render_initData");
        this.b.a();
        ctu.a();
        if (ipa.a("fast_key_force_delay_atmosphere")) {
            ipa.c(new ipa.c() { // from class: com.taobao.android.detail2.core.framework.e.6
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final int b;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "mDetailViewEngine.renderAtmosView";
                }

                {
                    int a2;
                    if (NavBarViewManager.c(e.c(e.this).G())) {
                        a2 = ipa.a("atm_high_delay", 850);
                    } else {
                        a2 = ipa.a("atm_delay_time", -1);
                    }
                    this.b = a2;
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (ipa.w() || ipa.a(e.a(e.this).g())) {
                    } else {
                        e.d(e.this).u();
                    }
                }

                @Override // tb.ipa.c
                public int c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
                }
            });
            return;
        }
        b bVar = this.g;
        if (bVar != null && bVar.k() != null && this.g.k().c() && !NavBarViewManager.c(p().G())) {
            this.g.k().a(new NewDetailMaskFrameLayout.b() { // from class: com.taobao.android.detail2.core.framework.e.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "mDetailViewEngine.renderAtmosView";
                }

                @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        e.d(e.this).u();
                    }
                }
            });
        } else {
            this.f11531a.u();
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f11531a.a(new fli(this.g, this.f11531a, this.b));
        this.f11531a.a(new flj(this, this.f11531a));
        this.f11531a.a(new fll(this.g, this.f11531a, this.b, this.c, this.e));
        this.b.a(new flg(this.g, this.f11531a, this.b));
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        q.a(NewDetailWVPlugin.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) NewDetailWVPlugin.class);
        q.a(NewDetailWVLocalWeexBranch.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) NewDetailWVLocalWeexBranch.class);
        q.a("TBMyTaobaoSettingStateWVApiPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) SettingStateWVApiPlugin.class);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        fim.a(this.g.f(), this.g.h().y(), fil.a(fhf.class, ""), new fhg(this.g.g()));
        fim.a(this.g.f(), this.g.h().y(), fil.a(fhd.class, ""), new fhe(this.g.g()));
        fim.a(this.g.f(), this.g.h().y(), fil.a(fhv.class, ""), new fhw(Global.getApplication()));
        fim.a(this.g.f(), this.g.h().y(), fil.a(fio.class, ""), new fip(this.f11531a.y()));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar == null) {
            return false;
        }
        return fmdVar.p();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.i = true;
        }
    }

    public void c() {
        com.taobao.android.detail2.core.framework.view.manager.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.g.h().b().ae()) {
            fjr.b(this.g.g());
        }
        com.taobao.android.detail2.core.framework.internallistener.detail.a aVar = this.h;
        if (aVar != null) {
            aVar.g();
        }
        if (this.g.h().b().af()) {
            String k = k();
            String ag = this.g.h().b().ag();
            if (!TextUtils.isEmpty(ag)) {
                k = ag;
            }
            fjt.a(fjt.TAG_INSIDE_DETAIL, "initDetailListener 反注册详情半屏生命周期。" + k);
            egm.a(k);
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar != null) {
            fmdVar.o();
        }
        DetailDataManager detailDataManager = this.b;
        if (detailDataManager != null) {
            detailDataManager.b();
        }
        fim.a(this.g.f(), this.g.h().y());
        fif.b(this.g.f());
        if (!ipa.c() && (bVar = this.c) != null) {
            bVar.a();
        }
        VolumeChangeManager volumeChangeManager = this.d;
        if (volumeChangeManager != null) {
            volumeChangeManager.a();
        }
        NavPreRequestManager.a().c(p().aq());
        fjt.a(fjt.TAG_RENDER, "NewDetailInstance: " + this + "destroy");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar == null) {
            return;
        }
        fmdVar.d(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar == null) {
            return;
        }
        fmdVar.c(str);
    }

    public void a(String str, boolean z) {
        com.taobao.android.detail2.core.framework.view.manager.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar != null) {
            fmdVar.a(str, z, this.i);
        }
        if (!ipa.c() && str.equals("NewDetail") && (bVar = this.c) != null) {
            bVar.b();
        }
        b bVar2 = this.g;
        if (bVar2 != null && bVar2.h().b().af()) {
            this.g.b();
        }
        this.i = false;
    }

    public void c(String str) {
        com.taobao.android.detail2.core.framework.view.manager.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        ctu.a("NewDetailInstanceResume");
        b bVar2 = this.g;
        if (bVar2 != null && bVar2.h().b().af()) {
            this.g.b();
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar != null) {
            fmdVar.e(str);
        }
        if (str.equals("NewDetail")) {
            fif.b(this.g.f());
            fif.a(this.g.f());
            if (!ipa.c() && (bVar = this.c) != null) {
                bVar.c();
            }
        }
        ctu.a();
        kxs.a(this.g);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        fmd fmdVar = this.f11531a;
        return fmdVar != null ? fmdVar.r() : "NewDetail";
    }

    public void a(flr flrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c9faec", new Object[]{this, flrVar});
        } else {
            this.e.add(flrVar);
        }
    }

    public void a(fls flsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ca6f4b", new Object[]{this, flsVar});
        } else {
            this.f11531a.a(flsVar);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        DetailDataManager detailDataManager = this.b;
        if (detailDataManager == null) {
            return;
        }
        detailDataManager.a(j);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.g.h().w();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : p().J();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : p().q();
    }

    private fkr p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("826d5302", new Object[]{this}) : this.g.h();
    }

    public void a(fmd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0ebefd", new Object[]{this, bVar});
        } else if (!q()) {
        } else {
            this.f11531a.a(bVar);
        }
    }

    public void a(String str, fmd.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e932ea47", new Object[]{this, str, bVar});
        } else if (!q()) {
        } else {
            this.f11531a.a(str, bVar);
        }
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, r() + " 回调非主线程, 不响应");
            return false;
        }
        com.taobao.android.detail2.core.framework.data.model.d d = this.f11531a.d();
        if (d == null) {
            fjt.a(fjt.TAG_VIDEO_ZOOM, r() + " getCurrentDisplayNode为空, 不响应");
            return false;
        } else if (d.R()) {
            return true;
        } else {
            fjt.a(fjt.TAG_VIDEO_ZOOM, r() + " node.enableHalfScreenZoom为false, 不响应");
            return false;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.data.model.d d = this.f11531a.d();
        return d != null && d.R();
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.g.h().y();
    }

    private String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.g.h().y();
    }

    public List<com.taobao.android.detail2.core.framework.base.weex.c> s() {
        com.taobao.android.detail2.core.framework.view.feeds.d K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("abd71b8d", new Object[]{this});
        }
        fmd fmdVar = this.f11531a;
        if (fmdVar != null && (K = fmdVar.K()) != null) {
            return K.Y();
        }
        return null;
    }
}
