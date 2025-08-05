package tb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.datamodel.pop.PopPositionData;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostapp.IHostAppService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import java.util.List;
import tb.sht;

/* loaded from: classes5.dex */
public abstract class psw implements dlx, psx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public rha af;
    private final ICardService b;
    private final ITrackService c;
    private final ILifecycleService d;
    public final FluidContext e;
    public final shl f;
    public final shp g;
    public final kzb h;
    public final ptd j;
    public final pte k;
    public Context m;
    public View n;
    public snp o;
    public a p;
    public a.c q;
    public boolean r;
    public String s;
    private final IMessageService t;
    private final IQuickOpenService u;
    private final IDataService v;
    private final IUsePreloadService w;
    private final IFeedsListService x;
    private final IHostAppService y;
    public final boolean l = true;

    /* renamed from: a  reason: collision with root package name */
    private final shz f32868a = new shz(this);

    static {
        kge.a(-1577401378);
        kge.a(1812182269);
        kge.a(478546929);
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ ICardService a(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ICardService) ipChange.ipc$dispatch("7b71ba2f", new Object[]{pswVar}) : pswVar.b;
    }

    public static /* synthetic */ IFeedsListService b(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFeedsListService) ipChange.ipc$dispatch("173eddd3", new Object[]{pswVar}) : pswVar.x;
    }

    public static /* synthetic */ ITrackService c(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrackService) ipChange.ipc$dispatch("52e5de0a", new Object[]{pswVar}) : pswVar.c;
    }

    public psw(FluidContext fluidContext) {
        this.e = fluidContext;
        this.d = (ILifecycleService) this.e.getService(ILifecycleService.class);
        this.t = (IMessageService) this.e.getService(IMessageService.class);
        this.c = (ITrackService) this.e.getService(ITrackService.class);
        this.b = (ICardService) this.e.getService(ICardService.class);
        this.u = (IQuickOpenService) this.e.getService(IQuickOpenService.class);
        this.w = (IUsePreloadService) this.e.getService(IUsePreloadService.class);
        this.x = (IFeedsListService) this.e.getService(IFeedsListService.class);
        this.y = (IHostAppService) this.e.getService(IHostAppService.class);
        this.v = (IDataService) this.e.getService(IDataService.class);
        this.f = new shl(this.e);
        this.g = new shp(this.e);
        this.h = new kzb(this.e, this);
        this.j = new ptd(this.e, this);
        this.k = new pte(this.e, this);
        e();
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
        }
        snp G = G();
        if (G == null) {
            return -1;
        }
        return G.getAdapterPosition();
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : r();
    }

    public View b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("70dee36a", new Object[]{this, viewGroup}) : LayoutInflater.from(viewGroup.getContext()).inflate(d(), viewGroup, false);
    }

    public shl t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shl) ipChange.ipc$dispatch("a139c554", new Object[]{this}) : this.f;
    }

    public shp u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shp) ipChange.ipc$dispatch("a8eb6b2f", new Object[]{this}) : this.g;
    }

    public kzb v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kzb) ipChange.ipc$dispatch("b099af76", new Object[]{this}) : this.h;
    }

    public String w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f74eee2", new Object[]{this}) : this.s;
    }

    public Context y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("55117f78", new Object[]{this}) : this.m;
    }

    public FluidContext z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("2e9927a7", new Object[]{this}) : this.e;
    }

    public pte A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pte) ipChange.ipc$dispatch("18d4a27d", new Object[]{this}) : this.k;
    }

    public View B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("1d5e2bcb", new Object[]{this}) : this.n;
    }

    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec4b0696", new Object[]{this});
        }
        return riy.ARRAY_START_STR + this.e.getInstanceId() + "_第" + s() + "卡_" + b() + "_" + this.s + "] ";
    }

    public a.c D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.c) ipChange.ipc$dispatch("cb4c97e8", new Object[]{this}) : this.q;
    }

    public a E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("58efc0c8", new Object[]{this}) : this.p;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.q.c;
    }

    public shz F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shz) ipChange.ipc$dispatch("3f4e0ff4", new Object[]{this}) : this.f32868a;
    }

    public snp G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snp) ipChange.ipc$dispatch("46ffcaa3", new Object[]{this}) : this.o;
    }

    public final boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.o.f33749a.e();
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.o.f33749a.f();
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.r;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : s() == 0;
    }

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onCreate 回调方法");
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onStart 回调方法");
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onResume 回调方法");
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onPause 回调方法");
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onStop 回调方法");
    }

    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onDestroy 回调方法");
    }

    @Override // tb.dlx
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a(b(jSONObject));
        }
    }

    @Override // tb.dlx
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            a(str, b(jSONObject));
        }
    }

    public void a(com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5554e2", new Object[]{this, aVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("评论联动onPopStateChanged:");
        sb.append(aVar != null ? aVar.toString() : null);
        spz.c("FluidCard", sb.toString());
    }

    public void a(String str, com.taobao.android.fluid.framework.data.datamodel.pop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e749458", new Object[]{this, str, aVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("评论联动onPopStateChanged:");
        sb.append(aVar != null ? aVar.toString() : null);
        sb.append(",state:");
        sb.append(str);
        spz.c("FluidCard", sb.toString());
    }

    private com.taobao.android.fluid.framework.data.datamodel.pop.a b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.framework.data.datamodel.pop.a) ipChange.ipc$dispatch("61dbab21", new Object[]{this, jSONObject}) : new com.taobao.android.fluid.framework.data.datamodel.pop.a((PopPositionData) JSON.toJavaObject(jSONObject, PopPositionData.class));
    }

    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
            return;
        }
        this.o = snpVar;
        this.n = snpVar.itemView;
        this.m = snpVar.itemView.getContext();
        this.f.onCreateView(this, snpVar);
        this.b.onCreateView(this, snpVar);
        cw_();
        if (this.n instanceof FscrmidFavorFrameLayout) {
            skl j = ((IDataService) this.e.getService(IDataService.class)).getConfig().j();
            if (j == null || j.a("enableNativeDoubleLike", true)) {
                z = true;
            }
            spz.c("FluidCard", "enableNativeDoubleLike = " + z);
            ((FscrmidFavorFrameLayout) this.n).setEnableFavor(z);
        }
        if (s() != 1) {
            return;
        }
        ((IAnalysisService) this.e.getService(IAnalysisService.class)).getFluidInstanceAnalysis().c(FluidInstanceAnalysis.Stage.FIST_CARD.name());
    }

    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        this.p = aVar;
        this.q = this.p.a();
        a.c cVar = this.q;
        this.r = cVar != null && cVar.w() && this.q.v();
        a.c cVar2 = this.q;
        this.s = cVar2 != null ? cVar2.g() : "";
        spz.c("FluidCard", C() + "执行 onBindData 回调方法");
        if (this.u.isQuickOpenMode()) {
            this.b.incrementSessionId(this.p, false);
        } else {
            this.b.incrementSessionId(this.p, true);
        }
        this.f.onBindData(this, this.p, i);
        this.b.onBindData(this, this.p, i);
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
            return;
        }
        this.p = aVar;
        this.q = this.p.a();
        a.c cVar = this.q;
        this.r = cVar != null && cVar.w() && this.q.v();
        a.c cVar2 = this.q;
        this.s = cVar2 != null ? cVar2.g() : "";
        spz.c("FluidCard", C() + "执行 onBindData 回调方法");
        if (this.u.isInQuickOpenMode() && list != null && list.size() == 1 && (list.get(0) instanceof Long) && Long.valueOf(this.v.getQuickSecondRefreshMd5()).equals((Long) list.get(0))) {
            this.b.incrementSessionId(this.p, true);
        }
        this.f.onBindData(this, this.p, i, list);
        this.b.onBindData(this, this.p, i, list);
    }

    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onAppear 回调方法");
        this.f.onAppear(this);
        this.b.onAppear(this);
    }

    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onDisAppear 回调方法");
        this.f.onDisAppear(this);
        this.b.onDisAppear(this);
    }

    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onWillActive 回调方法");
        sme.b(this);
        this.f.onWillActive(this);
        this.b.onWillActive(this);
    }

    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onWillDisActive 回调方法");
        this.f.onWillDisActive(this);
        this.b.onWillDisActive(this);
    }

    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onActive 回调方法");
        int r = r();
        this.b.setActiveCard(this);
        this.b.setCurrentActiveCellPosition(r);
        if (!this.q.i().hasExposed && !this.q.w()) {
            shk.INSTANCE.a(this.e, this.p);
        }
        if (this.w.enableTab3UseCacheData()) {
            sou.a(this.q.g());
        }
        IPreCacheService iPreCacheService = (IPreCacheService) this.e.getService(IPreCacheService.class);
        if (iPreCacheService != null && iPreCacheService.enablePreCache()) {
            iPreCacheService.exposedDeleteCacheData(this.q.g());
        }
        this.f.onActive(this);
        this.b.onActive(this);
        this.q.i().hasExposed = true;
        if (r != 0) {
            ap();
        }
        if ((this instanceof sii) || (this instanceof sic)) {
            return;
        }
        a(this.n);
    }

    public void ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc5e136", new Object[]{this});
        } else {
            a(1001, r());
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!son.q() || i2 < 0 || this.o.b() == null) {
        } else {
            this.o.b().a(i2, i);
        }
    }

    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onDisActive 回调方法");
        a.c cVar = this.q;
        if (cVar != null) {
            cVar.b(false);
        }
        this.f.onDisActive(this);
        this.b.onDisActive(this);
    }

    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
            return;
        }
        spz.c("FluidCard", C() + "执行 onRecyclePlayer 回调方法");
        this.f.onRecycle(this);
        this.b.onRecycle(this);
    }

    public void onTabSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ab5df8", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onTabSelected 回调方法");
    }

    public void onTabUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a6e5b1", new Object[]{this});
            return;
        }
        spz.c("FluidCard", C() + "执行 onTabUnSelected 回调方法");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : C();
    }

    private void cw_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4569d972", new Object[]{this});
            return;
        }
        shr shrVar = new shr(new sht.a() { // from class: tb.psw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1387239154) {
                    super.onTripleClick(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.sht.a, tb.sht
            public void onDoubleClick(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                    return;
                }
                psw.a(psw.this).getConfig().c(false);
                psw.b(psw.this).setAutoLock(false);
                psw.this.g.onDoubleClick(f, f2);
                if (spj.a(psw.this.e)) {
                    return;
                }
                b.d(psw.c(psw.this).getActiveCardCommonTrack());
            }

            @Override // tb.sht.a, tb.sht
            public void onTripleClick(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
                    return;
                }
                super.onTripleClick(f, f2);
                psw.this.g.onTripleClick(f, f2);
            }

            @Override // tb.sht.a, tb.sht
            public boolean onLongClick(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
                }
                psw.this.g.onLongClick(z);
                return true;
            }

            @Override // tb.sht.a, tb.sht
            public void onLongClickCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("70b73f2e", new Object[]{this});
                } else {
                    psw.this.g.onLongClickCancel();
                }
            }

            @Override // tb.sht.a, tb.sht
            public void onPendingClick() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7bcd6a37", new Object[]{this});
                    return;
                }
                psw.b(psw.this).setAutoLock(true);
                psw.a(psw.this).getConfig().c(true);
                psw.this.g.onPendingClick();
            }

            @Override // tb.sht.a, tb.sht
            public void onSingleClick(float f, float f2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
                    return;
                }
                psw.b(psw.this).setAutoLock(false);
                psw.a(psw.this).getConfig().c(false);
                psw.this.g.onSingleClick(f, f2);
            }
        });
        this.n.setTag(shrVar);
        this.n.setOnClickListener(shrVar);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.d.addPageLifecycleListener(this);
        this.d.addTabLifecycleListener(this);
    }

    public final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        if (view != null) {
            pio.a(view);
        }
        View view2 = this.n;
        if (view2 == view) {
            return;
        }
        pio.a(view2);
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        pte pteVar = this.k;
        if (pteVar == null || pteVar.c() == null) {
            return;
        }
        this.k.c().a(f);
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else if (!sjt.D()) {
        } else {
            if (this.af == null) {
                this.af = new rha(this);
                this.af.a(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.psw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        } else {
                            psw.this.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    }
                });
            }
            rha rhaVar = this.af;
            if (rhaVar != null) {
                rhaVar.a(z);
                spz.c("FluidCard", "doAlphaAnimation, setTransparent = " + z);
                return;
            }
            spz.c("FluidCard", "doAlphaAnimation, animator is null ");
        }
    }
}
