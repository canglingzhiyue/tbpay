package tb;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.detail.ext.view.widget.base.MultiMediaPopupWindow;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.o;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.q;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.datasdk.model.datamodel.node.VerticalNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.YxgDataNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.tao.adapter.biz.taomoment.DetailTaoMomentViewService;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class dya implements Handler.Callback, TStudioHelper.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout A;
    private eif B;
    private com.taobao.android.detail.core.detail.kit.view.holder.c C;
    private SkuPageModel D;
    private f F;
    private c G;
    private boolean I;
    private boolean J;
    private eiz L;
    private dyn O;
    private dyk P;
    private lcq T;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f27083a;
    public FrameLayout b;
    public TIconFontTextView c;
    public View d;
    public FrameLayout e;
    public ebx f;
    public Handler g;
    public end h;
    public FragmentManager i;
    public MultiMediaPopupWindow j;
    public com.taobao.android.detail.core.detail.activity.b k;
    public Fragment m;
    private d n;
    public com.taobao.android.detail.core.detail.widget.b o;
    public com.taobao.android.detail.datasdk.model.datamodel.node.c t;
    public HashMap u;
    public com.taobao.android.detail.core.async.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> x;
    public long y;
    public e.c z;
    public final int p = 108;
    public final int q = 109;
    public final int s = 110;
    public Map<String, String> v = null;
    public String w = null;
    private final List<b> E = new ArrayList();
    private boolean r = false;
    private boolean H = false;
    private long K = 0;
    private long S = 0;
    private boolean l = false;
    private Map<String, String> M = new ConcurrentHashMap();
    private dyh N = new a();
    private dyl Q = new dyl();
    private boolean R = true;

    /* loaded from: classes4.dex */
    public interface b {
        void a(end endVar, boolean z);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(f fVar);
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(Map<String, String> map);
    }

    static {
        kge.a(1788221063);
        kge.a(-1043440182);
        kge.a(1278367353);
    }

    public static /* synthetic */ SkuPageModel a(dya dyaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkuPageModel) ipChange.ipc$dispatch("d4f6114a", new Object[]{dyaVar}) : dyaVar.D;
    }

    public static /* synthetic */ eiz a(dya dyaVar, eiz eizVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eiz) ipChange.ipc$dispatch("c2942eea", new Object[]{dyaVar, eizVar});
        }
        dyaVar.L = eizVar;
        return eizVar;
    }

    public static /* synthetic */ void b(dya dyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d492c76d", new Object[]{dyaVar});
        } else {
            dyaVar.D();
        }
    }

    public static /* synthetic */ eiz c(dya dyaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eiz) ipChange.ipc$dispatch("3192342", new Object[]{dyaVar}) : dyaVar.L;
    }

    public static /* synthetic */ dyk d(dya dyaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyk) ipChange.ipc$dispatch("eababf81", new Object[]{dyaVar}) : dyaVar.P;
    }

    public dya(DetailCoreActivity detailCoreActivity, ebx ebxVar) {
        this.f27083a = detailCoreActivity;
        this.f = ebxVar;
        if (this.g == null) {
            this.g = new Handler(Looper.getMainLooper(), this);
        }
        if (ebxVar != null) {
            i.d("DetailController", "queryParams.kvs = " + ebxVar.b().toString());
        }
        if (epv.c) {
            this.x = new com.taobao.android.detail.core.async.c<>();
        }
        TStudioHelper.a().a((TStudioHelper.a) this);
        emu.a("com.taobao.android.detail.core.detail.controller.DetailController");
        if (com.taobao.android.detail.core.utils.e.e()) {
            DetailCoreActivity detailCoreActivity2 = this.f27083a;
            if (detailCoreActivity2 == null || detailCoreActivity2.isFinishing() || this.F != null) {
                return;
            }
            a(new f(this.f27083a, null));
        }
        if (s.a()) {
            this.T = new lcq(this.f27083a);
        }
    }

    public void a(dyh dyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e612ef85", new Object[]{this, dyhVar});
        } else {
            this.N = dyhVar;
        }
    }

    public void a(dyn dynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e615a9bf", new Object[]{this, dynVar});
        } else {
            this.O = dynVar;
        }
    }

    public dyn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyn) ipChange.ipc$dispatch("f03edc5", new Object[]{this}) : this.O;
    }

    public dyl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyl) ipChange.ipc$dispatch("16b592e6", new Object[]{this}) : this.Q;
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.I;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.K;
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.K = j;
        }
    }

    public long H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("40c20c3", new Object[]{this})).longValue() : this.S;
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.S = j;
        }
    }

    /* loaded from: classes4.dex */
    public class a implements dyh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-494936866);
            kge.a(-1434163575);
        }

        private a() {
        }

        @Override // tb.dyh
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                com.taobao.android.detail.core.perf.c.a(dya.this.f27083a, oqd.MTOP_STAGE_NETWORKREQUEST);
            }
        }

        @Override // tb.dyh
        public void a(boolean z, dya dyaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd7fe3f0", new Object[]{this, new Boolean(z), dyaVar});
                return;
            }
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            if (z) {
                concurrentHashMap.put("isInit", "true");
            }
            i.d(com.taobao.android.detail.core.performance.i.a("DetailController", BTags.MainRequestTag), "DefaultDetailControllerHandleCallback startRequest");
            concurrentHashMap.put("preload_v", "industry");
            dya.this.a(new dym(dyaVar), concurrentHashMap);
            if (!z) {
                return;
            }
            dya.this.g();
            View o = dya.this.f27083a.o();
            if (o == null) {
                return;
            }
            o.setVisibility(0);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.H = true;
        this.y = SystemClock.uptimeMillis();
        this.N.a();
        eqc.b(this.f27083a, eqc.TAG_SDK_INIT);
        if (this.f.v != 0) {
            eqc.a(this.f27083a, "mInit", this.f.v, System.currentTimeMillis() - this.f.v, "初始化");
        }
        eqc.a(this.f27083a, "mReq", "网络+数据解析");
        if (this.g == null) {
            this.g = new Handler(Looper.getMainLooper(), this);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("init", z ? "true" : "false");
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "sendMtopRequest", null, hashMap);
        this.N.a(z, this);
    }

    private boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        ebx ebxVar = this.f;
        if (ebxVar == null) {
            return false;
        }
        ebxVar.a();
        return true;
    }

    private e b(e.c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("b681745d", new Object[]{this, cVar, map});
        }
        B();
        g a2 = n.a(this.f27083a);
        if (a2 == null) {
            i.a(com.taobao.android.detail.core.performance.i.a("DetailController", BTags.MainRequestTag), "detailRequestWithFullyCustomizedApi error DetailSdk NOT CREATE");
            ecg.c(this.f27083a, "customized_api", "customized_api_crash", "detailSdkGetFailed", (Map<String, Object>) null);
            throw new IllegalArgumentException("DetailSdk NOT CREATE");
        }
        this.z = cVar;
        com.taobao.android.detail.core.open.e c2 = ((h) a2).c();
        e eVar = new e(this.f27083a, epo.f(), this.z);
        c2.a(map, eVar);
        return eVar;
    }

    private e c(e.c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("4337ce9e", new Object[]{this, cVar, map});
        }
        if (!this.H) {
            B();
        }
        this.H = false;
        g a2 = n.a(this.f27083a);
        if (a2 == null) {
            i.a(com.taobao.android.detail.core.performance.i.a("DetailController", BTags.MainRequestTag), "detailRequestNormally error DetailSdk NOT CREATE");
            throw new IllegalArgumentException("DetailSdk NOT CREATE");
        }
        this.z = cVar;
        HashMap hashMap = new HashMap();
        ebx ebxVar = this.f;
        if ((ebxVar != null && !ebxVar.b().containsKey(com.taobao.android.detail.wrapper.nav.c.KEY_DETAIL_NAV)) || !eip.c) {
            hashMap.putAll(this.f.b());
            if (epv.g && this.R) {
                hashMap.put("supportV7", "true");
            }
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        c(StringUtils.equals((CharSequence) hashMap.get("isInit"), "true"));
        com.taobao.android.detail.core.open.e c2 = ((h) a2).c();
        e eVar = new e(this.f27083a, epo.f(), cVar);
        c2.a(hashMap, eVar);
        return eVar;
    }

    public e a(e.c cVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("29cb1a1c", new Object[]{this, cVar, map});
        }
        a(this.f27083a, map);
        if (map != null && Boolean.parseBoolean(map.get("updateWithCustomApi"))) {
            return b(cVar, map);
        }
        return c(cVar, map);
    }

    public f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1efc048c", new Object[]{this}) : this.F;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        eqc.a(this.f27083a, "mLoad", "页面打底");
        long currentTimeMillis = System.currentTimeMillis();
        com.taobao.android.detail.core.event.b.a(this.f27083a);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.P = new dyk(this.f27083a);
        String a2 = j.a("DetailController");
        i.d(a2, "t2 " + (currentTimeMillis2 - currentTimeMillis));
        this.A = (RelativeLayout) this.f27083a.findViewById(R.id.pagegroup);
        this.e = (FrameLayout) this.f27083a.findViewById(R.id.pagecontent);
        this.b = (FrameLayout) this.f27083a.findViewById(R.id.fl_error_view_container);
        G();
        this.i = this.f27083a.getSupportFragmentManager();
        long currentTimeMillis3 = System.currentTimeMillis();
        this.k = new com.taobao.android.detail.core.detail.activity.b(this.f27083a, this.e);
        this.k.e = this.F;
        this.o = new com.taobao.android.detail.core.detail.widget.b((FrameLayout) this.f27083a.findViewById(R.id.float_view_layout), this.f27083a);
        if (ecu.y) {
            this.k.c();
        } else {
            eng engVar = new emy(this.f27083a).a(new epb(this.f.e, this.f.c, this.f.d)).b;
            long currentTimeMillis4 = System.currentTimeMillis();
            String a3 = j.a("DetailController");
            i.d(a3, "t3 " + (currentTimeMillis4 - currentTimeMillis3));
            long currentTimeMillis5 = System.currentTimeMillis();
            this.k.a(engVar);
            long currentTimeMillis6 = System.currentTimeMillis();
            String a4 = j.a("DetailController");
            i.d(a4, "t4 " + (currentTimeMillis6 - currentTimeMillis5));
        }
        eqc.b(this.f27083a, "mLoad");
    }

    public SkuPageModel h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuPageModel) ipChange.ipc$dispatch("d4feb667", new Object[]{this});
        }
        if (this.D == null || this.J) {
            a(this.t.f10055a);
            this.J = false;
        }
        return this.D;
    }

    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.D = new SkuPageModel(bVar, this.f.b);
            this.D.registerPropValueChangedListener(new SkuPageModel.c() { // from class: tb.dya.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel.c
                public void a(List<String> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    } else if (dya.a(dya.this).isChildrecBundleItem()) {
                    } else {
                        com.taobao.android.trade.event.f.a(dya.this.f27083a, new eog(dya.a(dya.this).getSkuChoiceVO()));
                    }
                }
            });
            this.D.registerServiceIdChangedListener(new SkuPageModel.d() { // from class: tb.dya.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel.d
                public void a(List<String> list) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    } else if (dya.a(dya.this).isChildrecBundleItem()) {
                    } else {
                        com.taobao.android.trade.event.f.a(dya.this.f27083a, new eog(dya.a(dya.this).getSkuChoiceVO()));
                    }
                }
            });
            if (!this.D.isChildrecBundleItem()) {
                com.taobao.android.trade.event.f.a(this.f27083a, new eog(this.D.getSkuChoiceVO()));
            }
            if (!"sku".equals(this.f.j)) {
                return;
            }
            com.taobao.android.trade.event.f.a(this.f27083a, new OpenSkuEvent(SkuBottomBarStyleDTO.ADD_CART_AND_BUY));
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.DowngradeTag, BTags.MainRequestTag), String.format("downgradeToH5 for url : %s, reason : %s", str2, str3));
        try {
            a(str, str2);
            eca.a(this.f27083a, str, str3);
        } catch (Exception e) {
            eca.a(this.f27083a, str, e.getMessage(), "H5");
            String a2 = com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.DowngradeTag, BTags.MainRequestTag);
            i.d(a2, "open browser error " + Log.getStackTraceString(e));
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        i.c("DetailController", String.format("open browser for url : %s", str2));
        Bundle bundle = new Bundle();
        bundle.putString("myBrowserUrl", str2);
        bundle.putString("ItemIdForceH5", str);
        epq.a(this.f27083a, str2, bundle);
        ehm a2 = ehk.a();
        if (a2 != null) {
            ehr a3 = a2.a();
            if (a3 == null) {
                return;
            }
            this.f27083a.finish();
            this.f27083a.overridePendingTransition(a3.a(), a3.b());
            return;
        }
        throw new IllegalArgumentException("IDependAdapter is null");
    }

    private void b(egq egqVar) {
        DetailCoreActivity detailCoreActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5513eea", new Object[]{this, egqVar});
        } else if (egqVar == null || (detailCoreActivity = this.f27083a) == null || detailCoreActivity.isFinishing()) {
            i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "bottomBar or mActivity is null");
        } else {
            RelativeLayout relativeLayout = (RelativeLayout) this.f27083a.findViewById(R.id.bottombar_layout);
            com.taobao.android.detail.core.detail.kit.view.holder.c cVar = this.C;
            if (cVar != null) {
                cVar.a();
            }
            if (relativeLayout == null) {
                i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "bottomBarContainer is null");
                return;
            }
            if (relativeLayout.getChildCount() > 0) {
                relativeLayout.removeAllViews();
            }
            if (this.f27083a.F()) {
                i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "aura detail addBottomBar");
                a(relativeLayout);
                return;
            }
            this.C = com.taobao.android.detail.core.open.j.a(this.f27083a).a((Activity) this.f27083a, egqVar);
            if (this.C == null) {
                i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "old detail bottomBarViewHolder is null");
                return;
            }
            i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "old detai addBottomBar");
            View a2 = this.C.a((com.taobao.android.detail.core.detail.kit.view.holder.c) egqVar, (ViewGroup) relativeLayout);
            this.C.b(egqVar);
            relativeLayout.addView(a2, new RelativeLayout.LayoutParams(-1, -2));
            com.taobao.android.detail.core.detail.activity.b bVar = this.k;
            if (bVar != null) {
                bVar.e();
            }
            q.a(relativeLayout, Switch.class);
            q.a(relativeLayout, SwitchCompat.class);
            i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "old detai addBottomBar addView");
        }
    }

    private void a(RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b473c38", new Object[]{this, relativeLayout});
            return;
        }
        dwk G = this.f27083a.G();
        if (G == null) {
            i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "refreshAuraBottomBar aliDetailAuraController null");
            return;
        }
        relativeLayout.addView(G.b(), new RelativeLayout.LayoutParams(-1, -2));
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.e();
        }
        i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "refreshAuraBottomBar addView");
    }

    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            if (ecu.a("Page_Detail_Button-Back")) {
                ecf.b(this.f27083a);
            }
            dyk dykVar = this.P;
            if (dykVar != null && dykVar.f()) {
                this.P.a(0);
                return true;
            }
            com.taobao.android.detail.core.event.video.c.e(this.f27083a, null);
            MultiMediaPopupWindow multiMediaPopupWindow = this.j;
            if (multiMediaPopupWindow != null && multiMediaPopupWindow.mModel.isPopupMode) {
                this.j.dismissGalleryPopupWindow();
                return true;
            } else if (this.f.m) {
                this.f27083a.finish();
                return true;
            } else {
                FragmentManager fragmentManager = this.i;
                if (fragmentManager != null && fragmentManager.getBackStackEntryCount() > 0) {
                    try {
                        this.i.popBackStack();
                    } catch (IllegalStateException unused) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.c i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("72c71e1f", new Object[]{this}) : this.t;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.h();
        }
        com.taobao.android.detail.core.detail.kit.utils.f.a(this.f27083a).a();
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(this.f27083a);
        if (a2 != null) {
            a2.a(new edw());
        }
        lcq lcqVar = this.T;
        if (lcqVar == null) {
            return;
        }
        lcqVar.b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.g();
        }
        lcq lcqVar = this.T;
        if (lcqVar == null) {
            return;
        }
        lcqVar.c();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            if (this.B != null && this.B.isShowing()) {
                this.B.dismiss();
            }
        } catch (Exception unused) {
        }
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.f();
        }
        com.taobao.android.detail.core.detail.kit.utils.f.a(this.f27083a).b();
    }

    public void m() {
        com.taobao.android.detail.core.async.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Handler handler = this.g;
        if (handler != null) {
            try {
                handler.removeCallbacksAndMessages(null);
            } catch (Throwable th) {
                i.a("DetailController", "removeCallbacksAndMessages Throwable" + th.toString());
            }
        }
        TStudioHelper.a().b((TStudioHelper.a) this);
        com.taobao.android.detail.core.detail.activity.b bVar = this.k;
        if (bVar != null) {
            bVar.i();
        }
        dyk dykVar = this.P;
        if (dykVar != null) {
            dykVar.i();
        }
        com.taobao.android.detail.core.detail.kit.view.holder.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.a();
        }
        SkuPageModel skuPageModel = this.D;
        if (skuPageModel != null) {
            skuPageModel.destroy();
        }
        try {
            if (this.e != null) {
                this.e.removeAllViews();
            }
            if (this.A != null) {
                this.A.removeAllViews();
            }
        } catch (Throwable th2) {
            i.a("DetailController", "destroy removeAllViews", th2);
        }
        com.taobao.android.trade.event.f.b(this.f27083a);
        com.taobao.android.detail.core.detail.kit.utils.f.a().b(this.f27083a);
        if (epv.c && (cVar = this.x) != null) {
            cVar.a();
        }
        lcq lcqVar = this.T;
        if (lcqVar != null) {
            lcqVar.d();
        }
        com.taobao.android.detail.core.performance.h.a(this.f27083a).c();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [tb.dya$3] */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message == null) {
            return false;
        }
        DetailCoreActivity detailCoreActivity = this.f27083a;
        if (detailCoreActivity != null && detailCoreActivity.isFinishing()) {
            return false;
        }
        switch (message.what) {
            case 108:
                DetailCoreActivity detailCoreActivity2 = this.f27083a;
                if (detailCoreActivity2 != null) {
                    detailCoreActivity2.finish();
                    break;
                }
                break;
            case 109:
                new AsyncTask<Void, Void, Void>() { // from class: tb.dya.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                    @Override // android.os.AsyncTask
                    public /* synthetic */ Void doInBackground(Void[] voidArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                    }

                    public Void a(Void... voidArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                        }
                        dya.b(dya.this);
                        return null;
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                DetailCoreActivity detailCoreActivity3 = this.f27083a;
                if (detailCoreActivity3 != null) {
                    detailCoreActivity3.D().b("renderTime");
                    this.f27083a.D().b(com.taobao.android.detail.core.ultronengine.c.STAGE_PAGE_TOTAL);
                    this.f27083a.D().a();
                    break;
                }
                break;
            case 110:
                C();
                J();
                K();
                break;
        }
        return true;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.g.post(new Runnable() { // from class: tb.dya.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (dya.c(dya.this) == null) {
                        dya.a(dya.this, new eiz());
                    }
                    dya.c(dya.this).a(dya.this.f27083a);
                }
            });
        }
    }

    private void J() {
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (this.l || !god.p || (cVar = this.t) == null || cVar.f10055a == null || !eqb.f(this.t.f10055a).openDetailAndNewBuy) {
        } else {
            com.taobao.android.trade.event.f.a(this.f27083a, new OpenSkuEvent(SkuBottomBarStyleDTO.CONFIRM_BUY));
            this.l = true;
        }
    }

    private void K() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        } else if (!god.v || this.r || (dVar = this.n) == null) {
        } else {
            dVar.a(null);
            this.r = true;
        }
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        if (this.f.v != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f.v;
            eqc.a(this.f27083a, "load", this.f.v, currentTimeMillis, "详情加载时间");
            HashMap hashMap = new HashMap();
            hashMap.put("load", currentTimeMillis + "");
            eps.a((Activity) this.f27083a, (String) null, (Map<String, String>) hashMap);
        } else {
            eqc.b(this.f27083a, "load");
        }
        eqc.b(this.f27083a, eqc.TAG_CREAT_VIEW);
        Map<String, String> a2 = eqc.a(this.f27083a);
        o.a().a(a2);
        com.taobao.android.detail.core.utils.n.b(a2);
    }

    private void b(end endVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0120bf6", new Object[]{this, endVar, new Boolean(z)});
            return;
        }
        i.d(j.a("DetailController"), "refreshLayout start");
        DetailCoreActivity detailCoreActivity = this.f27083a;
        if (detailCoreActivity == null || detailCoreActivity.Y() || this.k == null) {
            i.d(j.a("DetailController"), "refreshLayout activity null return");
            return;
        }
        if (endVar != null) {
            this.h = endVar;
            if (z) {
                i.d(j.a("DetailController"), "refreshLayout onlyRefreshDetail start");
                this.k.b(endVar);
                i.d(j.a("DetailController"), "refreshLayout onlyRefreshDetail end");
            } else {
                i.d(j.a("DetailController"), "refreshLayout 1 ");
                this.k.a(endVar);
                i.d(j.a("DetailController"), "refreshLayout 2 ");
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.h.f != null) {
                    this.f27083a.a(this.h.f);
                    this.k.a(this.f27083a.r());
                    i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.TTNavBar), "refreshLayout 3 refreshActionBar TtNavBarViewMode");
                    z2 = true;
                } else {
                    if (this.h.c != null) {
                        this.f27083a.a(this.h.c);
                        this.k.a(this.f27083a.r());
                        i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.TTNavBar), "refreshLayout 3 refreshActionBar NavBarViewModel");
                    }
                    z2 = false;
                }
                com.taobao.android.detail.core.utils.h.b(this.f27083a, SystemClock.uptimeMillis() - uptimeMillis, z2);
            }
            if (endVar.b == null || endVar.b.d == null) {
                i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "refreshLayout 4 no bottom bar data ");
            } else {
                i.d(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.BtBar), "refreshLayout 4 addBottomBar");
                b((egq) endVar.b.d);
            }
        }
        if (this.T != null) {
            i.d(j.a("DetailController"), "mPageManagerFactory.buildLayout start");
            this.T.a();
            i.d(j.a("DetailController"), "mPageManagerFactory.buildLayout end");
        }
        i.d(j.a("DetailController"), "refreshLayout end");
    }

    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
        } else if (epeVar == null) {
        } else {
            this.f27083a.a(epeVar);
            this.k.a(this.f27083a.r());
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.h.f != null) {
            a(this.h.f);
        } else {
            a(this.h.c);
        }
    }

    public void a(egq egqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ce3869", new Object[]{this, egqVar});
        } else if (egqVar == null) {
        } else {
            i.d(com.taobao.android.detail.core.performance.i.a("DetailController", BTags.BtBar), "refreshBottomBar addBottomBar");
            b(egqVar);
        }
    }

    public void a(f fVar) {
        f fVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06a2ac7", new Object[]{this, fVar});
        } else if (this.F == fVar) {
        } else {
            this.F = fVar;
            DetailCoreActivity detailCoreActivity = this.f27083a;
            if (detailCoreActivity != null) {
                detailCoreActivity.v();
            }
            c cVar = this.G;
            if (cVar != null && (fVar2 = this.F) != null) {
                cVar.a(fVar2);
            }
            if (com.taobao.android.detail.core.utils.e.i()) {
                f fVar3 = this.F;
                if (fVar3 == null) {
                    return;
                }
                fVar3.c().a(new RecyclerView.OnScrollListener() { // from class: tb.dya.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                        if (str.hashCode() == 806944192) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        if (dya.this.k == null || i2 <= 0) {
                            return;
                        }
                        i.a(com.taobao.android.detail.core.utils.g.TAG, "DetailController.onScrolled preloadDetailDescContent");
                        dya.this.k.a();
                    }
                });
            }
            if (this.F == null || !com.taobao.android.detail.core.utils.e.l()) {
                return;
            }
            dyc.a(this, this.F);
        }
    }

    public void a(end endVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe344257", new Object[]{this, endVar, new Boolean(z)});
            return;
        }
        i.d(j.a("DetailController"), "refresh start");
        if (!this.f27083a.F()) {
            com.taobao.android.detail.core.detail.activity.b bVar = this.k;
            f fVar = this.F;
            bVar.e = fVar;
            if (fVar != null && fVar.a()) {
                DetailCoreActivity detailCoreActivity = this.f27083a;
                if (detailCoreActivity != null) {
                    detailCoreActivity.D().a(com.taobao.android.detail.core.ultronengine.c.STAGE_RENDER_ULTRON);
                }
                com.taobao.android.detail.core.perf.c.a(this.f27083a, "ultronRenderView");
                this.F.g();
                com.taobao.android.detail.core.perf.c.b(this.f27083a, "ultronRenderView");
                DetailCoreActivity detailCoreActivity2 = this.f27083a;
                if (detailCoreActivity2 != null) {
                    detailCoreActivity2.D().b(com.taobao.android.detail.core.ultronengine.c.STAGE_RENDER_ULTRON);
                }
            }
        }
        if (this.f27083a.isFinishing()) {
            i.d(j.a("DetailController"), "refresh mActivity.isFinishing()");
        } else if (((h) n.a(this.f27083a)) == null) {
            i.d(j.a("DetailController"), "refresh SdkManager.getInstance null");
        } else {
            com.taobao.android.detail.core.open.f f = ((h) n.a(this.f27083a)).f();
            if (f != null) {
                f.a(com.taobao.android.detail.core.open.f.LIFE_MAIN_REFRESH_BEFORE);
            }
            this.h = endVar;
            this.t = endVar.f27459a;
            this.J = true;
            this.f27083a.a(this.t);
            dzj.a().a(this.t.v());
            long uptimeMillis = SystemClock.uptimeMillis();
            com.taobao.android.detail.core.perf.c.a(this.f27083a, "detailRefreshLayout");
            b(endVar, z);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            com.taobao.android.detail.core.perf.c.b(this.f27083a, "detailRefreshLayout");
            com.taobao.android.detail.core.utils.h.d(this.f27083a, uptimeMillis2 - uptimeMillis);
            a(eqb.s(this.t.f10055a));
            E();
            if (!com.taobao.android.detail.core.utils.e.d()) {
                F();
            }
            if (f != null && !a(this.t)) {
                f.a(com.taobao.android.detail.core.open.f.LIFE_MAIN_REFRESH_AFTER);
            }
            for (b bVar2 : this.E) {
                bVar2.a(endVar, z);
            }
            dya dyaVar = this.f27083a.b;
            ViewPager z2 = dyaVar == null ? null : dyaVar.z();
            if (z2 != null && !a(this.t)) {
                if (eis.d) {
                    z2.post(new Runnable() { // from class: tb.dya.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dya.d(dya.this).a();
                            }
                        }
                    });
                } else {
                    this.P.a();
                }
            }
            if (this.k.y != null) {
                this.k.y.a(this.t);
            }
            i.d(j.a("DetailController"), "refresh end");
        }
    }

    private boolean a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c45d765", new Object[]{this, cVar})).booleanValue() : (cVar == null || cVar.f10055a == null || !cVar.f10055a.n()) ? false : true;
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else if (this.f27083a == null || this.t == null) {
        } else {
            new DetailTaoMomentViewService().a(this.f27083a, b(this.t));
        }
    }

    private JSONObject b(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar;
        VerticalNode g;
        JSONObject data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f66cfec2", new Object[]{this, cVar});
        }
        if (cVar != null && (bVar = cVar.f10055a) != null && (g = eqb.g(bVar)) != null && (data = g.getData()) != null) {
            return data.getJSONObject("taoMoments");
        }
        return null;
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        TLog.loge("DetailController", "refresh sku module");
        SkuPageModel skuPageModel = this.D;
        if (skuPageModel == null) {
            return;
        }
        skuPageModel.reset(this.t.f10055a);
    }

    private void a(YxgDataNode yxgDataNode) {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab51930", new Object[]{this, yxgDataNode});
        } else if (!"true".equals(epj.h().a("android_detail", "yxg_enable", "true")) || (relativeLayout = (RelativeLayout) this.f27083a.findViewById(R.id.rl_yxg_banner_container)) == null) {
        } else {
            if (yxgDataNode != null && yxgDataNode.isShowYxgBar) {
                relativeLayout.setVisibility(8);
            } else {
                relativeLayout.setVisibility(8);
            }
        }
    }

    public void a(eng engVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72c513a", new Object[]{this, engVar});
        } else {
            a(engVar, true);
        }
    }

    public void a(eng engVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5e88da", new Object[]{this, engVar, new Boolean(z)});
            return;
        }
        end endVar = this.h;
        if (endVar == null || engVar == null) {
            return;
        }
        endVar.b = engVar;
        endVar.f27459a = engVar.b;
        this.f27083a.a(engVar.b);
        a(this.h, z);
    }

    public void a(eif eifVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e56756", new Object[]{this, eifVar});
        } else {
            this.B = eifVar;
        }
    }

    public eif o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eif) ipChange.ipc$dispatch("7abb304e", new Object[]{this}) : this.B;
    }

    public View p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7247b579", new Object[]{this}) : this.e;
    }

    public View q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bc794eba", new Object[]{this}) : this.b;
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (this.d != null) {
        } else {
            eho c2 = ehk.c();
            if (c2 != null) {
                this.d = c2.a(this.f27083a);
            }
            if (this.d == null) {
                return;
            }
            this.b.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.f27083a == null) {
        } else {
            r();
            FrameLayout frameLayout = this.e;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.b;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            TIconFontTextView tIconFontTextView = this.c;
            if (tIconFontTextView != null) {
                tIconFontTextView.setVisibility(0);
            }
            if (this.f27083a.k()) {
                this.f27083a.n();
            } else {
                this.f27083a.j();
            }
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        if (ehk.c() != null) {
            r();
        }
        View view = this.d;
        if (!(view instanceof TBErrorView)) {
            return;
        }
        ((TBErrorView) view).setButton(TBErrorView.ButtonType.BUTTON_LEFT, com.alibaba.ability.localization.b.a(R.string.x_detail_app_refresh), new View.OnClickListener() { // from class: tb.dya.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (view2 != null) {
                    com.taobao.android.detail.core.perf.b.b(view2.getContext(), "retryRequest", "详情错误页面用户点击重试");
                }
                dya.this.a(false);
            }
        });
        ((TBErrorView) this.d).setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        s();
        i.a(com.taobao.android.detail.core.performance.i.a(j.a("DetailController"), BTags.MainRequestTag), "降级至错误页");
    }

    public View t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9b0e1a7d", new Object[]{this}) : this.c;
    }

    private void G() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        this.c = (TIconFontTextView) this.f27083a.findViewById(R.id.go_back);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        if (this.f27083a.c) {
            i = ecr.b(this.f27083a);
        }
        layoutParams.topMargin = i;
        this.c.setLayoutParams(layoutParams);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: tb.dya.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    dya.this.f27083a.finish();
                }
            }
        });
    }

    public com.taobao.android.detail.core.async.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.async.c) ipChange.ipc$dispatch("54bf087e", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new com.taobao.android.detail.core.async.c<>();
        }
        return this.x;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff916cd", new Object[]{this, cVar});
            return;
        }
        this.G = cVar;
        f fVar = this.F;
        if (fVar == null || cVar == null) {
            return;
        }
        cVar.a(fVar);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff8a26e", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.E.add(bVar);
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff98b2c", new Object[]{this, dVar});
        } else {
            this.n = dVar;
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.R;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.R = z;
        }
    }

    public end w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (end) ipChange.ipc$dispatch("b8486dcd", new Object[]{this}) : this.h;
    }

    public RelativeLayout x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("cc559dcf", new Object[]{this}) : this.A;
    }

    public dyk y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyk) ipChange.ipc$dispatch("c7ab6e50", new Object[]{this}) : this.P;
    }

    public lcq I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lcq) ipChange.ipc$dispatch("565fbd9c", new Object[]{this}) : this.T;
    }

    public ViewPager z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("2abe6c2d", new Object[]{this});
        }
        if (y() != null) {
            return y().c();
        }
        return null;
    }

    public Map<String, String> A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("eac8707d", new Object[]{this}) : this.M;
    }

    private void a(DetailCoreActivity detailCoreActivity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17452432", new Object[]{this, detailCoreActivity, map});
        } else if (detailCoreActivity != null && detailCoreActivity.I()) {
            this.M.clear();
            if (map == null) {
                return;
            }
            for (String str : map.keySet()) {
                if (!StringUtils.isEmpty(str)) {
                    String str2 = map.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    this.M.put(str, str2);
                }
            }
        }
    }
}
