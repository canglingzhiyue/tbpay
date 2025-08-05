package com.alibaba.android.ultron.trade.presenter;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.ultron.trade.event.model.OpenPopupWindowEventModel;
import com.alibaba.android.ultron.trade.utils.d;
import com.alibaba.android.ultron.trade.utils.f;
import com.alibaba.android.ultron.vfw.popupwindow.b;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.exception.DinamicException;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.bmi;
import tb.bmz;
import tb.bna;
import tb.bnj;
import tb.bnm;
import tb.bnn;
import tb.bnv;
import tb.bny;
import tb.boc;
import tb.boe;
import tb.bol;
import tb.bpb;
import tb.brx;
import tb.fnl;
import tb.fut;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseViewManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXPOSURE_ONCE = 1;
    public static final int EXPOSURE_REPEAT = 0;

    /* renamed from: a  reason: collision with root package name */
    public Activity f2672a;
    public c b;
    public bny c;
    public com.alibaba.android.ultron.vfw.popupwindow.b d;
    public bnj e;
    public Pair<IDMComponent, com.taobao.android.ultron.common.model.b> f;
    private ViewGroup g;
    private ViewGroup h;
    private RecyclerView i;
    private ViewGroup j;
    private boolean o;
    private HandlerThread p;
    private Handler q;
    private String k = "";
    private String l = "";
    private String m = "";
    private int n = 0;
    private boe r = null;

    /* loaded from: classes2.dex */
    public @interface ExposureStrategy {
    }

    static {
        kge.a(-986732501);
    }

    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boe a(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boe) ipChange.ipc$dispatch("aaa49bc2", new Object[]{baseViewManager}) : baseViewManager.r;
    }

    public static /* synthetic */ void a(BaseViewManager baseViewManager, IDMComponent iDMComponent, List list, bna bnaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce060f4", new Object[]{baseViewManager, iDMComponent, list, bnaVar});
        } else {
            baseViewManager.a(iDMComponent, list, bnaVar);
        }
    }

    public static /* synthetic */ int b(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e943680", new Object[]{baseViewManager})).intValue() : baseViewManager.n;
    }

    public static /* synthetic */ boolean c(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c53ae92", new Object[]{baseViewManager})).booleanValue() : baseViewManager.o;
    }

    public static /* synthetic */ void d(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea13268f", new Object[]{baseViewManager});
        } else {
            baseViewManager.b();
        }
    }

    public static /* synthetic */ Handler e(BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7518e636", new Object[]{baseViewManager}) : baseViewManager.q;
    }

    public BaseViewManager(c cVar, boc bocVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("param presenter can not be null");
        }
        this.b = cVar;
        this.f2672a = cVar.m();
        if (cVar instanceof b) {
            this.c = new bny(this.f2672a, cVar.s(), ((b) cVar).L(), bocVar);
        } else {
            this.c = new bny(this.f2672a, cVar.s(), (bpb.a) null, bocVar);
        }
        c();
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a(new boe() { // from class: com.alibaba.android.ultron.trade.presenter.BaseViewManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.boe
                public void a(h hVar, final IDMComponent iDMComponent, Map<String, Object> map) {
                    List<com.taobao.android.ultron.common.model.b> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa110afe", new Object[]{this, hVar, iDMComponent, map});
                        return;
                    }
                    if (BaseViewManager.a(BaseViewManager.this) != null) {
                        BaseViewManager.a(BaseViewManager.this).a(hVar, iDMComponent, map);
                    }
                    if (iDMComponent == null || !BaseViewManager.this.x()) {
                        return;
                    }
                    if (BaseViewManager.this.b instanceof b) {
                        ((b) BaseViewManager.this.b).a(iDMComponent, AURAEventKey.exposureItem);
                    }
                    Map<String, List<com.taobao.android.ultron.common.model.b>> eventMap = iDMComponent.getEventMap();
                    if (eventMap == null || (list = eventMap.get(AURAEventKey.exposureItem)) == null) {
                        return;
                    }
                    if (BaseViewManager.b(BaseViewManager.this) == 1 && iDMComponent.getExtMap() != null) {
                        if (iDMComponent.getExtMap().get("exposureCount") != null) {
                            return;
                        }
                        iDMComponent.getExtMap().put("exposureCount", 1);
                    }
                    final bna F = BaseViewManager.this.b.F();
                    if (BaseViewManager.c(BaseViewManager.this)) {
                        final ArrayList arrayList = new ArrayList(list);
                        BaseViewManager.d(BaseViewManager.this);
                        BaseViewManager.e(BaseViewManager.this).post(new Runnable() { // from class: com.alibaba.android.ultron.trade.presenter.BaseViewManager.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    BaseViewManager.a(BaseViewManager.this, iDMComponent, arrayList, F);
                                }
                            }
                        });
                        return;
                    }
                    BaseViewManager.a(BaseViewManager.this, iDMComponent, list, F);
                }

                @Override // tb.boe
                public void a(ViewGroup viewGroup, int i, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1fdad4c9", new Object[]{this, viewGroup, new Integer(i), map});
                    } else if (BaseViewManager.a(BaseViewManager.this) == null) {
                    } else {
                        BaseViewManager.a(BaseViewManager.this).a(viewGroup, i, map);
                    }
                }
            });
        }
    }

    private void a(IDMComponent iDMComponent, List<com.taobao.android.ultron.common.model.b> list, bna bnaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef3f898", new Object[]{this, iDMComponent, list, bnaVar});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            try {
                com.taobao.android.ultron.common.model.b bVar = list.get(i);
                if (bVar != null) {
                    String type = bVar.getType();
                    if (!TextUtils.isEmpty(type)) {
                        bnaVar.a(a(bnaVar, iDMComponent, bVar, type));
                    }
                }
            } catch (Exception e) {
                String str = this.m;
                if (str == null) {
                    str = "UltronTrade";
                }
                jqg.a(str, "ExposureAsyncException", e.getMessage());
                return;
            }
        }
    }

    private bmz a(bna bnaVar, IDMComponent iDMComponent, com.taobao.android.ultron.common.model.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bmz) ipChange.ipc$dispatch("cfc7a86d", new Object[]{this, bnaVar, iDMComponent, bVar, str});
        }
        bmz a2 = bnaVar.a().a(str);
        a2.a(iDMComponent);
        a2.c(AURAEventKey.exposureItem);
        a2.a(bVar);
        return a2;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.q != null) {
        } else {
            this.p = new HandlerThread("BaseViewManager");
            this.p.start();
            this.q = new Handler(this.p.getLooper());
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.p == null) {
        } else {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.p.quitSafely();
                } else {
                    this.p.quit();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c.a(b.DINAMIC_CONTEXT_KEY_PRESENTER, this.b);
        }
    }

    public void a(bol bolVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21e24b9", new Object[]{this, bolVar});
        } else {
            this.c.a(bolVar);
        }
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
            return;
        }
        bny bnyVar = this.c;
        if (bnyVar == null) {
            throw new IllegalArgumentException("initView method did not invoked");
        }
        bnyVar.a(str, eVar);
    }

    public void a(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926eae27", new Object[]{this, new Long(j), futVar});
        } else {
            this.c.e().a().a(j, futVar);
        }
    }

    public void a(long j, ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a2b983", new Object[]{this, new Long(j), akVar});
        } else {
            this.c.e().a().a(j, akVar);
        }
    }

    public void a(String str, fnl fnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cde57e", new Object[]{this, str, fnlVar});
            return;
        }
        try {
            this.c.e().a().a(str, fnlVar);
        } catch (DinamicException unused) {
        }
    }

    public void a(String str, com.taobao.android.dinamic.dinamic.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a51e58c", new Object[]{this, str, hVar});
            return;
        }
        try {
            this.c.e().a().a(str, hVar);
        } catch (DinamicException unused) {
        }
    }

    public void a(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e200989a", new Object[]{this, bmiVar});
        } else {
            a(bmiVar, (brx) null);
        }
    }

    public void a(bmi bmiVar, brx brxVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a353b9e2", new Object[]{this, bmiVar, brxVar});
        } else if (bmiVar == null) {
        } else {
            IDMComponent iDMComponent = null;
            List<IDMComponent> a2 = bmiVar.a();
            if (a2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= a2.size()) {
                        break;
                    }
                    IDMComponent iDMComponent2 = bmiVar.a().get(i2);
                    if (this.k.equals(iDMComponent2.getTag())) {
                        iDMComponent = iDMComponent2;
                        break;
                    }
                    i2++;
                }
            }
            List<IDMComponent> b = bmiVar.b();
            if (b != null) {
                while (true) {
                    if (i < b.size()) {
                        if (this.l.equals(bmiVar.b().get(i).getTag()) && iDMComponent != null) {
                            this.c.a(i, iDMComponent);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(bmiVar.a());
            arrayList.addAll(bmiVar.b());
            arrayList.addAll(bmiVar.c());
            if (bmiVar.d() != null) {
                arrayList.addAll(bmiVar.d());
            }
            if (bmiVar.e() != null) {
                arrayList.addAll(bmiVar.e());
            }
            bnv bnvVar = new bnv();
            bnvVar.b(bmiVar.b());
            bnvVar.a(bmiVar.a());
            bnvVar.e(bmiVar.c());
            bnvVar.c(bmiVar.d());
            bnvVar.d(bmiVar.e());
            bnvVar.a(bmiVar.f());
            this.c.a(bnvVar);
            bnvVar.h(this.b.H().d());
            this.c.a(127, brxVar);
            d.a(this.f2672a);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.c.j();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.c.i();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.popupwindow.b bVar = this.d;
        if (bVar != null && bVar.c()) {
            this.d.b();
            return;
        }
        bnj bnjVar = this.e;
        if (bnjVar != null && bnjVar.a()) {
            this.e.a(this.b.H());
        } else {
            n();
        }
    }

    public void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        bny bnyVar = this.c;
        if (bnyVar == null) {
            return;
        }
        bnyVar.a(list);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.popupwindow.b bVar = this.d;
        if (bVar != null && bVar.c()) {
            this.d.b();
        }
        bnj bnjVar = this.e;
        if (bnjVar == null || !bnjVar.a()) {
            return;
        }
        this.e.a(this.b.H());
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            b(127);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c.b(i);
        }
    }

    public void a(List<IDMComponent> list, OpenPopupWindowEventModel openPopupWindowEventModel, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210ca9ac", new Object[]{this, list, openPopupWindowEventModel, aVar});
        } else if (list == null || list.isEmpty()) {
        } else {
            a(a(list), openPopupWindowEventModel, aVar);
        }
    }

    public void a(bnv bnvVar, OpenPopupWindowEventModel openPopupWindowEventModel, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3d2e41", new Object[]{this, bnvVar, openPopupWindowEventModel, aVar});
        } else if (bnvVar == null) {
        } else {
            if (openPopupWindowEventModel == null) {
                openPopupWindowEventModel = new OpenPopupWindowEventModel();
            }
            this.d = new com.alibaba.android.ultron.vfw.popupwindow.b(this.c);
            this.d.a(bnvVar);
            this.d.a(a(openPopupWindowEventModel));
            this.d.a(aVar);
        }
    }

    public void a(List<IDMComponent> list, OpenPopupWindowEventModel openPopupWindowEventModel, b.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88fed7", new Object[]{this, list, openPopupWindowEventModel, aVar, new Integer(i)});
        } else if (list == null || list.isEmpty()) {
        } else {
            if (this.e == null) {
                this.e = new bnj(this.c);
            }
            if (this.e.a()) {
                return;
            }
            a(a(list), openPopupWindowEventModel, aVar, i);
        }
    }

    public void a(bnv bnvVar, OpenPopupWindowEventModel openPopupWindowEventModel, b.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8690ce2", new Object[]{this, bnvVar, openPopupWindowEventModel, aVar, new Integer(i)});
        } else if (bnvVar == null || this.j == null) {
        } else {
            if (openPopupWindowEventModel == null) {
                openPopupWindowEventModel = new OpenPopupWindowEventModel();
            }
            if (this.e == null) {
                this.e = new bnj(this.c);
            }
            this.e.a(bnvVar);
            b.C0102b a2 = a(openPopupWindowEventModel);
            if (this.j.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.j.getLayoutParams();
                layoutParams.bottomMargin = i;
                this.j.setLayoutParams(layoutParams);
            }
            this.j.setVisibility(0);
            this.e.a(a2, this.j);
            this.e.a(aVar);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.alibaba.android.ultron.vfw.popupwindow.b bVar = this.d;
        if (bVar != null && bVar.c()) {
            this.d.a(z);
        }
        bnj bnjVar = this.e;
        if (bnjVar == null || !bnjVar.a()) {
            return;
        }
        this.e.a(z);
    }

    public bny p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bny) ipChange.ipc$dispatch("826b8da2", new Object[]{this}) : this.c;
    }

    public boolean f() {
        bnj bnjVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.ultron.vfw.popupwindow.b bVar = this.d;
        return (bVar != null && bVar.c()) || ((bnjVar = this.e) != null && bnjVar.a());
    }

    public void a(Pair<IDMComponent, com.taobao.android.ultron.common.model.b> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a82db72", new Object[]{this, pair});
        } else {
            this.f = pair;
        }
    }

    public Pair<IDMComponent, com.taobao.android.ultron.common.model.b> q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("8068a8c2", new Object[]{this}) : this.f;
    }

    public void b(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0ea79b", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.g = linearLayout;
        this.i = recyclerView;
        this.h = linearLayout2;
        this.c.a(linearLayout, recyclerView, linearLayout2);
    }

    public void a(bnn bnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e210f5f6", new Object[]{this, bnnVar});
        } else {
            this.c.a(bnnVar);
        }
    }

    public ViewGroup r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8a52b5fc", new Object[]{this}) : this.h;
    }

    public ViewGroup s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7b23bd5b", new Object[]{this}) : this.i;
    }

    public ViewGroup t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6bf4c4ba", new Object[]{this}) : this.g;
    }

    public void a(String str, com.alibaba.android.ultron.vfw.web.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b81c1d", new Object[]{this, str, aVar});
        } else {
            this.c.a(str, aVar);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.c.c(i);
        }
    }

    public bnv e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnv) ipChange.ipc$dispatch("2dc97230", new Object[]{this});
        }
        com.alibaba.android.ultron.vfw.popupwindow.b bVar = this.d;
        if (bVar == null) {
            return null;
        }
        return bVar.a();
    }

    public ViewGroup u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5cc5cc19", new Object[]{this}) : this.h;
    }

    private b.C0102b a(OpenPopupWindowEventModel openPopupWindowEventModel) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (b.C0102b) ipChange.ipc$dispatch("5efa8a44", new Object[]{this, openPopupWindowEventModel});
        }
        b.C0102b c0102b = new b.C0102b();
        c0102b.a(-1);
        OpenPopupWindowEventModel.Css css = openPopupWindowEventModel.getCss();
        if (css != null) {
            try {
                c0102b.a(Float.parseFloat(css.getHeight()));
            } catch (Exception unused) {
            }
        } else {
            c0102b.a(0.6f);
        }
        OpenPopupWindowEventModel.Options options = openPopupWindowEventModel.getOptions();
        if (options != null) {
            if ("true".equals(options.getNeedCloseButton())) {
                c0102b.a(this.f2672a.getResources().getDrawable(R.drawable.popup_close_btn));
            }
        } else {
            c0102b.a(this.f2672a.getResources().getDrawable(R.drawable.popup_close_btn));
        }
        c0102b.b(80);
        bnm G = this.b.G();
        List<String> a2 = G.a("popupWindowTopRadius");
        int a3 = (a2 == null || a2.size() <= 0) ? 0 : com.alibaba.android.ultron.trade.utils.h.a(a2.get(0));
        List<String> a4 = G.a("popupWindowBottomRadius");
        if (a4 != null && a4.size() > 0) {
            i = com.alibaba.android.ultron.trade.utils.h.a(a4.get(0));
        }
        c0102b.a(f.a(this.f2672a, a3), f.a(this.f2672a, i));
        return c0102b;
    }

    private bnv a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnv) ipChange.ipc$dispatch("fa59dea3", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            String b = com.taobao.android.ultron.datamodel.imp.f.b(iDMComponent);
            if ("footer".equals(b)) {
                arrayList.add(iDMComponent);
            } else if ("header".equals(b)) {
                arrayList3.add(iDMComponent);
            } else {
                arrayList2.add(iDMComponent);
            }
        }
        bnv bnvVar = new bnv();
        bnvVar.b(arrayList2);
        bnvVar.a(arrayList3);
        bnvVar.e(arrayList);
        return bnvVar;
    }
}
