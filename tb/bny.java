package tb;

import android.content.Context;
import android.os.MessageQueue;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.instance.c;
import com.alibaba.android.ultron.vfw.perf.rebuilddelay.UltronViewRebuildDelayType;
import com.alibaba.android.ultron.vfw.template.d;
import com.alibaba.android.ultron.vfw.template.f;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.alibaba.android.ultron.vfw.viewholder.j;
import com.alibaba.android.ultron.vfw.web.a;
import com.alibaba.android.ultron.vfw.weex2.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.uc.webview.export.media.CommandID;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.bpb;

/* loaded from: classes2.dex */
public class bny {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 127;
    public static final int BACKGROUND = 32;
    public static final int BODY = 2;
    public static final int FOOTER = 4;
    public static final int FOREGROUND = 64;
    public static final int HEADER = 1;
    private static boolean I = false;
    public static final String KEY_VIEW_ENGINE = "ViewEngine";
    public static final int STICKY_BOTTOM = 16;
    public static final int STICKY_TOP = 8;
    public static final String TAG = "ViewEngine";
    public static final int TYPE_REFRESH_AFTER_DOWNLOAD = 2;
    public static final int TYPE_REFRESH_NEXT_CREATE = 1;
    private static boolean ah;
    private h A;
    private String B;
    private final Map<String, Object> C;
    private d D;
    private final bob E;
    private Map<String, a> F;
    private String G;
    private int H;
    private int J;
    private bpb K;
    private int L;
    private int M;
    private final jpl N;
    private final Map<String, bmb> O;
    private Set<RecyclerView.OnScrollListener> P;
    private List<bmc> Q;
    private c R;
    private boz S;
    private com.alibaba.android.ultron.vfw.perf.rebuilddelay.a T;
    private boolean U;
    private int V;
    private String W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public d f26011a;
    private boolean aa;
    private boolean ab;
    private bnq ac;
    private boolean ae;
    private ixl af;
    private boolean ag;
    private final bnz ai;
    private int al;
    private int am;
    private com.alibaba.android.ultron.vfw.weex2.h an;
    private boolean ao;
    private final int b;
    private Context c;
    private boc d;
    private bnn e;
    private RecyclerView f;
    private ViewGroup g;
    private ViewGroup h;
    private ViewGroup i;
    private ViewGroup j;
    private bnv k;
    private final j l;
    private final f m;
    private final Map<Class<?>, Object> n;
    private final List<h> o;
    private final List<h> p;
    private h q;
    private h r;
    private IDMComponent s;
    private IDMComponent t;
    private bpm u;
    private bpm v;
    private boolean w;
    private int x;
    private int y;
    private h z;

    static {
        kge.a(-415454859);
        kge.a(1086017683);
    }

    public static /* synthetic */ String a(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d55375f5", new Object[]{bnyVar}) : bnyVar.G;
    }

    public static /* synthetic */ void a(bny bnyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a93e58", new Object[]{bnyVar, new Integer(i)});
        } else {
            bnyVar.i(i);
        }
    }

    public static /* synthetic */ void a(bny bnyVar, int i, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2051c1a0", new Object[]{bnyVar, new Integer(i), brxVar});
        } else {
            bnyVar.b(i, brxVar);
        }
    }

    public static /* synthetic */ void a(bny bnyVar, LinearLayoutManager linearLayoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("242d66ae", new Object[]{bnyVar, linearLayoutManager, new Integer(i)});
        } else {
            bnyVar.a(linearLayoutManager, i);
        }
    }

    public static /* synthetic */ void a(bny bnyVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351d7f0a", new Object[]{bnyVar, hVar});
        } else {
            bnyVar.a(hVar);
        }
    }

    public static /* synthetic */ Set b(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("7ce2f37b", new Object[]{bnyVar}) : bnyVar.P;
    }

    public static /* synthetic */ void b(bny bnyVar, int i, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d77c3f", new Object[]{bnyVar, new Integer(i), brxVar});
        } else {
            bnyVar.c(i, brxVar);
        }
    }

    public static /* synthetic */ void b(bny bnyVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20a9629", new Object[]{bnyVar, hVar});
        } else {
            bnyVar.b(hVar);
        }
    }

    public static /* synthetic */ boolean c(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf1c0311", new Object[]{bnyVar})).booleanValue() : bnyVar.w;
    }

    public static /* synthetic */ int d(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad9f0981", new Object[]{bnyVar})).intValue() : bnyVar.x;
    }

    public static /* synthetic */ h e(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("42649eb4", new Object[]{bnyVar}) : bnyVar.z;
    }

    public static /* synthetic */ int f(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8aa51683", new Object[]{bnyVar})).intValue() : bnyVar.y;
    }

    public static /* synthetic */ h g(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("8d8cb0b6", new Object[]{bnyVar}) : bnyVar.A;
    }

    public static /* synthetic */ boolean h(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67ab2396", new Object[]{bnyVar})).booleanValue() : bnyVar.ag;
    }

    public static /* synthetic */ RecyclerView i(bny bnyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("8a1d2f51", new Object[]{bnyVar}) : bnyVar.f;
    }

    public static /* synthetic */ void j(bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b13094", new Object[]{bnyVar});
        } else {
            bnyVar.I();
        }
    }

    public bny(Context context) {
        this(context, "ultron");
    }

    public bny(Context context, String str) {
        this(context, str, null);
    }

    public bny(Context context, String str, bpb.a aVar) {
        this(context, str, aVar, false);
    }

    public bny(Context context, String str, bpb.a aVar, boolean z) {
        this(context, str, aVar, z, null);
    }

    public bny(Context context, String str, bpb.a aVar, boc bocVar) {
        this(context, str, aVar, false, bocVar);
    }

    public bny(Context context, String str, bpb.a aVar, boolean z, boc bocVar) {
        this.b = 0;
        this.n = new HashMap();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = null;
        this.r = null;
        this.w = false;
        this.x = -1;
        this.y = -1;
        this.B = "ultron";
        this.G = "default";
        this.J = 1;
        this.N = new jpl();
        this.O = new HashMap();
        this.P = null;
        this.Q = null;
        this.U = false;
        this.ae = false;
        this.V = 0;
        this.al = -1;
        this.am = -1;
        this.ag = true;
        this.ao = true;
        this.T = null;
        this.f26011a = null;
        this.ac = null;
        this.ai = new bnz(str);
        ah = jqi.a(str, bpd.KEY_SCROLL_VISIBILITY_CHECK, false);
        this.c = context;
        this.d = bocVar;
        this.aa = z;
        if (aVar != null) {
            this.K = new bpb(this, aVar);
        }
        if (!TextUtils.isEmpty(str)) {
            this.B = str;
            this.G = str;
        }
        a(bocVar);
        this.E = bob.a(this);
        this.l = new j(this);
        com.alibaba.android.ultron.vfw.viewholder.f a2 = this.l.a("weex2");
        if (a2 instanceof com.alibaba.android.ultron.vfw.weex2.h) {
            this.an = (com.alibaba.android.ultron.vfw.weex2.h) a2;
        }
        a((Class<Class>) j.class, (Class) this.l);
        this.m = new f(this);
        a((Class<Class>) f.class, (Class) this.m);
        this.C = new HashMap();
        this.C.put("ViewEngine", this);
        this.k = new bnv();
        G();
        try {
            T();
        } catch (Throwable th) {
            UnifyLog.a(r(), "ViewEngine", "registerIDMComponentChangedListeners", th.getMessage());
        }
        this.S = new boy();
        jqh.a(new MessageQueue.IdleHandler() { // from class: tb.bny.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                if (jqh.a()) {
                    jqh.b(new Runnable() { // from class: tb.bny.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache.a.a(bny.a(bny.this));
                            }
                        }
                    }, jqi.a("newUltron_container", "ultronZCachePrefetchDelayMills", 1000L));
                } else {
                    com.alibaba.android.ultron.vfw.core.TradeHybrid.ZCache.a.a(bny.a(bny.this));
                }
                return false;
            }
        });
    }

    private void a(boc bocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21a0d62", new Object[]{this, bocVar});
        } else if (bocVar == null) {
        } else {
            this.Y = bocVar.a();
            this.W = bocVar.c();
            this.X = bocVar.d();
            this.ab = bocVar.b();
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        if (bpd.a(this.c)) {
            i = 2;
        }
        this.J = i;
    }

    public void a(boz bozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e22481eb", new Object[]{this, bozVar});
            return;
        }
        this.S = bozVar;
        boz bozVar2 = this.S;
        if (bozVar2 == null) {
            return;
        }
        bozVar2.a(this);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c1c2e", new Object[]{this, cVar});
        } else {
            this.R = cVar;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.ao = z;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.ao;
    }

    public c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a2357d6e", new Object[]{this}) : this.R;
    }

    public void a(boe boeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21af620", new Object[]{this, boeVar});
        } else {
            this.l.a(boeVar);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b497d115", new Object[]{this, bVar});
        } else {
            this.l.a(bVar);
        }
    }

    public void a(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b4c96", new Object[]{this, onScrollListener});
            return;
        }
        if (this.P == null) {
            this.P = new HashSet();
        }
        this.P.add(onScrollListener);
    }

    public void a(bon bonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21f0d77", new Object[]{this, bonVar});
        } else {
            a((Class<Class>) bon.class, (Class) bonVar);
        }
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b81c1d", new Object[]{this, str, aVar});
            return;
        }
        if (this.F == null) {
            this.F = new HashMap();
        }
        this.F.put(str, aVar);
    }

    public a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("21cf400f", new Object[]{this, str});
        }
        Map<String, a> map = this.F;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.j = viewGroup;
        }
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            this.i = viewGroup;
        }
    }

    private boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.f;
        return (recyclerView == null || recyclerView.getScrollState() == 0) ? false : true;
    }

    public void a(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a8385a", new Object[]{this, linearLayout, recyclerView, linearLayout2});
            return;
        }
        this.g = linearLayout;
        this.f = recyclerView;
        boz bozVar = this.S;
        if (bozVar != null && bozVar.a()) {
            this.f.setLayoutManager(this.S.a(this.c));
        }
        this.f.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.bny.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i);
                if (bny.b(bny.this) == null) {
                    return;
                }
                for (RecyclerView.OnScrollListener onScrollListener : bny.b(bny.this)) {
                    onScrollListener.onScrollStateChanged(recyclerView2, i);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onScrolled(recyclerView2, i, i2);
                if (bny.b(bny.this) != null) {
                    for (RecyclerView.OnScrollListener onScrollListener : bny.b(bny.this)) {
                        onScrollListener.onScrolled(recyclerView2, i, i2);
                    }
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (!bny.c(bny.this)) {
                    if (findFirstVisibleItemPosition > bny.d(bny.this)) {
                        bny bnyVar = bny.this;
                        bny.a(bnyVar, bny.e(bnyVar));
                    } else {
                        bny bnyVar2 = bny.this;
                        bny.b(bnyVar2, bny.e(bnyVar2));
                    }
                }
                if (findFirstVisibleItemPosition > bny.f(bny.this)) {
                    bny bnyVar3 = bny.this;
                    bny.a(bnyVar3, bny.g(bnyVar3));
                } else {
                    bny bnyVar4 = bny.this;
                    bny.b(bnyVar4, bny.g(bnyVar4));
                }
                if (!bny.h(bny.this)) {
                    return;
                }
                try {
                    bny.a(bny.this, linearLayoutManager, i2);
                } catch (Throwable th) {
                    UnifyLog.a(bny.this.r(), "ViewEngine", "组件隐藏展示通知", th.getMessage());
                }
            }
        });
        this.h = linearLayout2;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.ag = z;
        }
    }

    private void a(LinearLayoutManager linearLayoutManager, int i) {
        List<IDMComponent> f;
        ArrayList<IDMComponent> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("457ccf0b", new Object[]{this, linearLayoutManager, new Integer(i)});
        } else if (!ah && (f = this.k.f()) != null) {
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i2 = this.L;
            ArrayList<IDMComponent> arrayList2 = null;
            if (i2 > findFirstVisibleItemPosition) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = findFirstVisibleItemPosition; i3 < this.L; i3++) {
                    if (i3 >= 0 && i3 < f.size()) {
                        arrayList3.add(f.get(i3));
                    }
                }
                arrayList2 = arrayList3;
                arrayList = null;
            } else if (i2 < findFirstVisibleItemPosition) {
                arrayList = new ArrayList();
                for (int i4 = this.L; i4 < findFirstVisibleItemPosition; i4++) {
                    if (i4 >= 0 && i4 < f.size()) {
                        arrayList.add(f.get(i4));
                    }
                }
            } else {
                arrayList = null;
            }
            int i5 = this.M;
            if (i5 < findLastVisibleItemPosition) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                for (int i6 = this.M; i6 < findLastVisibleItemPosition; i6++) {
                    if (i6 >= 0 && i6 < f.size()) {
                        arrayList2.add(f.get(i6));
                    }
                }
            } else if (i5 > findLastVisibleItemPosition) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (int i7 = findLastVisibleItemPosition; i7 < this.M; i7++) {
                    if (i7 >= 0 && i7 < f.size()) {
                        arrayList.add(f.get(i7));
                    }
                }
            }
            if (arrayList2 != null) {
                for (IDMComponent iDMComponent : arrayList2) {
                    b(iDMComponent);
                }
            }
            if (arrayList != null) {
                for (IDMComponent iDMComponent2 : arrayList) {
                    c(iDMComponent2);
                }
            }
            this.L = findFirstVisibleItemPosition;
            this.M = findLastVisibleItemPosition;
        }
    }

    private void I() {
        List<IDMComponent> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (!ah && (this.f.getLayoutManager() instanceof LinearLayoutManager) && (f = this.k.f()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int i = 0; i < f.size(); i++) {
                if (i >= findFirstVisibleItemPosition && i <= findLastVisibleItemPosition) {
                    b(f.get(i));
                } else {
                    c(f.get(i));
                }
            }
        }
    }

    private void b(IDMComponent iDMComponent) {
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73527f0b", new Object[]{this, iDMComponent});
        } else if (iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("display")) != null) {
            for (com.taobao.android.ultron.common.model.b bVar : list) {
                JSONObject fields = bVar.getFields();
                if (fields != null) {
                    this.N.a(fields.getString("target"), fields);
                }
            }
        }
    }

    private void c(IDMComponent iDMComponent) {
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f962a", new Object[]{this, iDMComponent});
        } else if (iDMComponent.getEventMap() != null && (list = iDMComponent.getEventMap().get("dismiss")) != null) {
            for (com.taobao.android.ultron.common.model.b bVar : list) {
                JSONObject fields = bVar.getFields();
                if (fields != null) {
                    this.N.a(fields.getString("target"), fields);
                }
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.h hVar = this.an;
        if (hVar == null) {
            return;
        }
        hVar.a();
    }

    public void a(bnn bnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e210f5f6", new Object[]{this, bnnVar});
        } else if (this.f == null) {
            throw new NullPointerException("The bindViewTree method must be called before setAdapter method.");
        } else {
            boz bozVar = this.S;
            if (bozVar != null && bozVar.a()) {
                this.e = this.S.b();
            } else {
                this.e = bnnVar;
            }
            this.f.setAdapter(this.e);
        }
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.C.put(str, obj);
        }
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.C;
    }

    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
            return;
        }
        this.k = bnvVar;
        try {
            c(bnvVar.c());
        } catch (Throwable th) {
            UnifyLog.a(r(), "ViewEngine", CommandID.setDataSource, th.getMessage());
        }
    }

    public bnv d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnv) ipChange.ipc$dispatch("2617ccd1", new Object[]{this}) : this.k;
    }

    public bob e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bob) ipChange.ipc$dispatch("2dc97385", new Object[]{this}) : this.E;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a(i, (brx) null);
        }
    }

    public void a(final int i, final brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68e23e3", new Object[]{this, new Integer(i), brxVar});
        } else if (brxVar != null && brxVar.c() && L()) {
            jqg.a(r(), "ViewEngine", "#延迟执行rebuild");
            jpo.b(k()).b((String) null, true, (Map<String, String>) null);
            C().a(UltronViewRebuildDelayType.rebuildWhenIdleOrLastItemVisible, new Runnable() { // from class: tb.bny.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bny.a(bny.this, i, brxVar);
                    }
                }
            });
        } else {
            com.alibaba.android.ultron.vfw.perf.rebuilddelay.a aVar = this.T;
            if (aVar != null) {
                aVar.a();
            }
            b(i, brxVar);
        }
    }

    private void b(final int i, final brx brxVar) {
        bpm bpmVar;
        bpm bpmVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86bed82", new Object[]{this, new Integer(i), brxVar});
            return;
        }
        jqg.a(r(), "ViewEngine", "#rebuild start");
        List<IDMComponent> f = this.k.f();
        String valueOf = String.valueOf(System.currentTimeMillis());
        boolean z = brxVar != null && brxVar.b() && H();
        if (z) {
            a(f, valueOf, brxVar);
        }
        jpo b = jpo.b(this.c);
        b.a("downloadTemplates", System.currentTimeMillis(), "apmClientAfterNetworkLogicProcess", true);
        b(brxVar);
        b.a("downloadTemplates", false, (Map<String, String>) null);
        b.a("apmClientAfterNetworkLogicProcess", false, (Map<String, String>) null);
        b.a("apmClientContainerRender", (String) null);
        if (jqi.a(r(), "enableDelayRenderHeaderAndFooterWhenIdle", false) && L()) {
            jqg.a(r(), "ViewEngine", "#正在滚动，延迟更新Header和Footer");
            b.b((String) null, true, (Map<String, String>) null);
            C().a(UltronViewRebuildDelayType.rebuildWhenIdle, new Runnable() { // from class: tb.bny.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    bny.b(bny.this, i, brxVar);
                    bny.a(bny.this, i);
                    jqg.a(bny.this.r(), "ViewEngine", "#滚动停止，恢复更新Header和Footer");
                }
            });
            a(i, f, z, valueOf, brxVar);
        } else {
            b.a("rebuildHeader", System.currentTimeMillis(), "apmClientContainerRender", true);
            c(i, brxVar);
            b.a("rebuildHeader", false, (Map<String, String>) null);
            a(i, f, z, valueOf, brxVar);
            b.a("rebuildFooter", System.currentTimeMillis(), "apmClientContainerRender", true);
            i(i);
            b.a("rebuildFooter", false, (Map<String, String>) null);
        }
        if ((i & 64) != 0) {
            M();
        }
        if ((i & 32) != 0) {
            N();
        }
        if ((i & 8) != 0 && (bpmVar2 = this.u) != null) {
            bpmVar2.b();
        }
        if ((i & 16) != 0 && (bpmVar = this.v) != null) {
            bpmVar.b();
        }
        RecyclerView recyclerView = this.f;
        if (recyclerView != null && recyclerView.getViewTreeObserver() != null) {
            this.f.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: tb.bny.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    try {
                        if (bny.i(bny.this).getViewTreeObserver() != null) {
                            bny.i(bny.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                        bny.j(bny.this);
                    } catch (Throwable th) {
                        UnifyLog.a(bny.this.r(), "ViewEngine", "组件是否显示初始化", th.getMessage());
                    }
                }
            });
        }
        jqg.a(r(), "ViewEngine", "#rebuild end");
    }

    private void a(int i, List<IDMComponent> list, boolean z, String str, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9a6ada", new Object[]{this, new Integer(i), list, new Boolean(z), str, brxVar});
        } else if ((i & 2) == 0 || list == null) {
        } else {
            if (z) {
                b(list, str, brxVar);
            } else {
                d(list);
            }
        }
    }

    private void a(List<IDMComponent> list, String str, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136ed72b", new Object[]{this, list, str, brxVar});
        } else if (!jqi.a(this.G, "enableAsyncCalculateDiffOfRecyclerView", true)) {
        } else {
            F().a(this.e, list, str, a(brxVar));
        }
    }

    private bnq F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bnq) ipChange.ipc$dispatch("3f466b14", new Object[]{this});
        }
        bnq bnqVar = this.ac;
        if (bnqVar != null) {
            return bnqVar;
        }
        this.ac = new bnq(r());
        return this.ac;
    }

    private void c(int i, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba49b721", new Object[]{this, new Integer(i), brxVar});
        } else if ((i & 1) != 0 && this.g != null) {
            List<IDMComponent> e = this.k.e();
            if (J().a(e, brxVar)) {
                jqg.b(r(), "数据未变更，不需要刷新头部");
                return;
            }
            if (this.g.getChildCount() > 0) {
                this.g.removeAllViews();
            }
            if (this.o.size() > 0) {
                this.o.clear();
            }
            if (e == null || e.isEmpty()) {
                return;
            }
            for (IDMComponent iDMComponent : e) {
                h a2 = this.l.a(this.g, this.l.a(iDMComponent));
                View view = a2.itemView;
                if (!bpd.f()) {
                    if (view != null) {
                        this.g.addView(view);
                        this.o.add(a2);
                    }
                    this.l.a(a2, iDMComponent);
                } else if (view != null) {
                    this.o.add(a2);
                    this.l.a(a2, iDMComponent);
                    a(view, iDMComponent);
                    this.g.addView(view);
                }
                if (iDMComponent == this.s) {
                    this.z = a2;
                    if (iDMComponent.getStatus() == 0) {
                        d(iDMComponent);
                        b(a2);
                    } else {
                        this.w = true;
                    }
                }
            }
            jqg.b(r(), "rebuildHeader");
        }
    }

    private void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else if ((i & 4) != 0 && this.h != null) {
            List<IDMComponent> g = this.k.g();
            if (this.h.getChildCount() > 0) {
                this.h.removeAllViews();
            }
            if (this.p.size() > 0) {
                this.p.clear();
            }
            if (g == null || g.size() == 0) {
                return;
            }
            for (IDMComponent iDMComponent : g) {
                h a2 = this.l.a(this.h, this.l.a(iDMComponent));
                View view = a2.itemView;
                if (view != null) {
                    this.h.addView(view);
                    this.p.add(a2);
                }
                this.l.a(a2, iDMComponent);
                b(view, iDMComponent);
                if (iDMComponent == this.t) {
                    this.A = a2;
                    b(a2);
                }
                jqg.b("ViewEngine", "rebuildFooter#" + iDMComponent.getKey());
            }
            jqg.b(r(), "rebuildFooter");
        }
    }

    private void a(View view, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66034e2a", new Object[]{this, view, iDMComponent});
        } else if (b(view, iDMComponent)) {
        } else {
            view.getLayoutParams().height = -2;
        }
    }

    private boolean b(View view, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d1ccaf", new Object[]{this, view, iDMComponent})).booleanValue();
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (iDMComponent != null && iDMComponent.getFields() != null && iDMComponent.getFields().containsKey("dxStyleClipsToBounds")) {
            z = iDMComponent.getFields().getBooleanValue("dxStyleClipsToBounds");
        }
        viewGroup.setClipChildren(z);
        viewGroup.setClipToPadding(z);
        return z;
    }

    private void d(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2cad49", new Object[]{this, iDMComponent});
            return;
        }
        iDMComponent.getData().put("status", "normal");
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDMComponent);
        a(arrayList);
    }

    private void d(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
            return;
        }
        bnn bnnVar = this.e;
        if (bnnVar != null) {
            i = bnnVar.getItemCount();
        }
        boz bozVar = this.S;
        if (bozVar != null && bozVar.a()) {
            this.S.a(this.k);
            boz bozVar2 = this.S;
            if ((bozVar2 instanceof hii) && ((hii) bozVar2).c()) {
                return;
            }
        } else {
            bnn bnnVar2 = this.e;
            if (bnnVar2 != null) {
                bnnVar2.b(list);
            }
        }
        bnn bnnVar3 = this.e;
        if (bnnVar3 == null) {
            return;
        }
        if (this.ae) {
            bnnVar3.notifyItemRangeInserted(i, list.size() - i);
            jqg.b("OrderDiffRender", "item range insert");
            return;
        }
        bnnVar3.notifyDataSetChanged();
    }

    private void b(List<IDMComponent> list, String str, brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e8fd6c", new Object[]{this, list, str, brxVar});
            return;
        }
        F().a(this.c, this.f, this.e, list, str, a(brxVar));
        jqg.a(r(), "ViewEngine", "#body差量渲染");
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup == null || this.k == null) {
            return;
        }
        viewGroup.removeAllViews();
        h hVar = this.q;
        if (hVar != null && hVar.b() != null) {
            this.q.b().d();
        }
        this.q = null;
        IDMComponent j = this.k.j();
        if (j == null) {
            return;
        }
        h a2 = this.l.a(this.j, this.l.a(j));
        View view = a2.itemView;
        if (view != null) {
            this.j.addView(view);
            this.q = a2;
        }
        this.l.a(a2, j);
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup == null || this.k == null) {
            return;
        }
        viewGroup.removeAllViews();
        this.r = null;
        IDMComponent k = this.k.k();
        if (k == null) {
            return;
        }
        h a2 = this.l.a(this.i, this.l.a(k));
        View view = a2.itemView;
        if (view != null) {
            this.i.addView(view);
            this.r = a2;
        }
        this.l.a(a2, k);
    }

    public void b(int i) {
        bpm bpmVar;
        bpm bpmVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if ((i & 1) != 0) {
            P();
        }
        if ((i & 2) != 0) {
            Q();
        }
        if ((i & 4) != 0) {
            R();
        }
        if ((i & 64) != 0) {
            f();
        }
        if ((i & 32) != 0) {
            S();
        }
        if ((i & 8) != 0 && (bpmVar2 = this.u) != null) {
            bpmVar2.c();
        }
        if ((i & 16) != 0 && (bpmVar = this.v) != null) {
            bpmVar.c();
        }
        jqg.b(r(), "ViewEngine#refresh end");
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        List<IDMComponent> e = this.k.e();
        for (int i = 0; i < e.size(); i++) {
            if (bpd.a() && this.o.size() <= i) {
                return;
            }
            this.l.a(this.o.get(i), e.get(i));
        }
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
        } else {
            this.e.notifyDataSetChanged();
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        List<IDMComponent> g = this.k.g();
        for (int i = 0; i < g.size(); i++) {
            if (bpd.a() && this.p.size() <= i) {
                return;
            }
            this.l.a(this.p.get(i), g.get(i));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IDMComponent j = this.k.j();
        h hVar = this.q;
        if (j == null || hVar == null) {
            return;
        }
        this.l.a(hVar, j);
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
            return;
        }
        IDMComponent k = this.k.k();
        h hVar = this.r;
        if (k == null || hVar == null) {
            return;
        }
        this.l.a(hVar, k);
    }

    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
        } else {
            this.l.a(str, eVar);
        }
    }

    public void a(int i, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e94da99", new Object[]{this, new Integer(i), iDMComponent});
            return;
        }
        this.x = i;
        this.s = iDMComponent;
    }

    private void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d3bcd", new Object[]{this, hVar});
        } else if (hVar == null || hVar.itemView == null) {
        } else {
            hVar.itemView.setVisibility(0);
        }
    }

    private void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e6e1ec", new Object[]{this, hVar});
        } else if (hVar == null || hVar.itemView == null) {
        } else {
            hVar.itemView.setVisibility(8);
        }
    }

    public void a(bol bolVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21e24b9", new Object[]{this, bolVar});
        } else {
            a((Class<Class>) bol.class, (Class) bolVar);
        }
    }

    public void b(brx brxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0d0e631", new Object[]{this, brxVar});
            return;
        }
        try {
            jqg.b(r(), "start downloadTemplates");
            boolean a2 = jqi.a(r(), "checkDXMemoCacheBeforeDownload", false);
            HashMap hashMap = new HashMap();
            for (com.taobao.android.ultron.common.model.a aVar : this.k.d()) {
                if (aVar != null && (!a2 || !this.m.a(aVar.c, aVar.e))) {
                    String str = aVar.b;
                    if (!TextUtils.equals("native", str)) {
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            list.add(aVar);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar);
                            hashMap.put(str, arrayList);
                        }
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                if (this.f26011a == null) {
                    this.f26011a = new iph(r(), this.D);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.m.a((String) entry.getKey(), (List) entry.getValue(), this.f26011a, brxVar);
                }
            }
            jqg.b(r(), "end downloadTemplates");
        } catch (Throwable th) {
            jqg.a("ViewEngine", "downloadTemplatesException", th.getMessage());
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            b((brx) null);
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.J;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.h hVar = this.an;
        if (hVar == null) {
            return;
        }
        hVar.d();
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.h hVar = this.an;
        if (hVar == null) {
            return;
        }
        hVar.e();
    }

    public void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.h hVar = this.an;
        if (hVar == null) {
            return;
        }
        hVar.b();
    }

    public void ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab009828", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.h hVar = this.an;
        if (hVar == null) {
            return;
        }
        hVar.c();
    }

    public void j() {
        bob bobVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        j jVar = this.l;
        if (jVar != null) {
            jVar.a();
        }
        bpb bpbVar = this.K;
        if (bpbVar != null) {
            bpbVar.b();
        }
        f fVar = this.m;
        if (fVar != null) {
            fVar.a();
        }
        if (bpd.i() && (bobVar = this.E) != null) {
            bobVar.b();
        }
        com.alibaba.android.ultron.vfw.perf.rebuilddelay.a aVar = this.T;
        if (aVar != null) {
            aVar.b();
        }
        abk.b(this.G, this.c);
    }

    public Context k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("12b3006a", new Object[]{this}) : this.c;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public bnn l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnn) ipChange.ipc$dispatch("63a4f6d1", new Object[]{this}) : this.e;
    }

    public <T> void a(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dcc71", new Object[]{this, cls, t});
        } else {
            this.n.put(cls, t);
        }
    }

    public <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        Object obj = this.n.get(cls);
        if (obj == null) {
            return null;
        }
        return cls.cast(obj);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.H = i;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            I = z;
        }
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.H;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.f.getLayoutManager().scrollToPosition(i);
        }
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        List<IDMComponent> f = this.k.f();
        if (iDMComponent == null || f == null || !f.contains(iDMComponent)) {
            return;
        }
        d(f.indexOf(iDMComponent));
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.B;
    }

    public RecyclerView p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("6203d3ed", new Object[]{this}) : this.f;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.G;
    }

    public int K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366745", new Object[]{this})).intValue() : this.am;
    }

    public int X() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ed98d2", new Object[]{this})).intValue() : this.al;
    }

    public void a(List<IDMComponent> list) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && (this.f.getLayoutManager() instanceof LinearLayoutManager)) {
            List<IDMComponent> f = this.k.f();
            if (this.e.a().size() != f.size()) {
                UnifyLog.a(r(), "ViewEngine", "refreshComponents，差量刷新容器数据与最新数据源数据不匹配！", new String[0]);
                a(127);
                return;
            }
            this.e.b(f);
            List<IDMComponent> e = this.k.e();
            List<IDMComponent> g = this.k.g();
            List<IDMComponent> h = this.k.h();
            List<IDMComponent> i2 = this.k.i();
            IDMComponent k = this.k.k();
            IDMComponent j = this.k.j();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (IDMComponent iDMComponent : list) {
                if (f.contains(iDMComponent)) {
                    arrayList.add(Integer.valueOf(f.indexOf(iDMComponent)));
                }
                if (e.contains(iDMComponent)) {
                    i3 = 1;
                }
                if (g.contains(iDMComponent)) {
                    z = true;
                }
                if (k != null && iDMComponent == k) {
                    z4 = true;
                }
                if (j != null && iDMComponent == j) {
                    z5 = true;
                }
                if (h != null && h.contains(iDMComponent)) {
                    z2 = true;
                }
                if (i2 != null && i2.contains(iDMComponent)) {
                    z3 = true;
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                i = 0;
                int intValue = ((Integer) arrayList.get(0)).intValue();
                int intValue2 = (((Integer) arrayList.get(arrayList.size() - 1)).intValue() - intValue) + 1;
                if (this.V > 0) {
                    int i4 = intValue + intValue2;
                    int size = f.size();
                    int i5 = this.V;
                    if (i4 < size + i5) {
                        this.e.notifyItemRangeChanged(intValue, intValue2 + i5);
                    }
                }
                this.e.notifyItemRangeChanged(intValue, intValue2);
            } else {
                i = 0;
            }
            int i6 = i3 | (z ? 4 : 0) | (z2 ? 8 : 0) | (z3 ? 16 : 0) | (z4 ? 32 : 0);
            if (z5) {
                i = 64;
            }
            b(i6 | i);
            adh.c(this.G);
        }
    }

    public void b(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null && list.size() != 0) {
            List<IDMComponent> f = this.k.f();
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                int indexOf = f.indexOf(list.get(i2));
                if (i == -1 || (indexOf < i && indexOf >= 0)) {
                    i = indexOf;
                }
            }
            if (i == -1) {
                return;
            }
            int i3 = i + this.V;
            this.e.notifyItemRangeRemoved(i3, list.size());
            f.removeAll(list);
            this.e.b(f);
            int size = (f.size() - i3) + 1;
            if (size <= 0) {
                return;
            }
            this.e.notifyItemRangeChanged(i3 - 1, size);
        }
    }

    public void a(List<IDMComponent> list, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ac5f9b", new Object[]{this, list, iDMComponent});
        } else if (list == null || list.size() == 0) {
        } else {
            List<IDMComponent> f = this.k.f();
            if (iDMComponent != null) {
                i = f.indexOf(iDMComponent) + 1 + this.V;
            }
            this.e.notifyItemRangeInserted(i, list.size());
            f.addAll(i, list);
            this.e.b(f);
            this.e.notifyItemRangeChanged(i, this.k.f().size() - 1);
        }
    }

    public bpb s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bpb) ipChange.ipc$dispatch("99808278", new Object[]{this}) : this.K;
    }

    public void a(String str, com.alibaba.android.ultron.vfw.viewholder.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8569385", new Object[]{this, str, fVar});
        } else {
            this.l.a(str, fVar);
        }
    }

    private void c(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                String key = iDMComponent.getKey();
                if (!TextUtils.isEmpty(key)) {
                    bnx bnxVar = new bnx(key, this.N, r(), iDMComponent, this.O, this);
                    iDMComponent.setMessageChannel(bnxVar);
                    this.N.a(bnxVar);
                }
            }
        }
    }

    public void a(String str, bmb bmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e7dfcb", new Object[]{this, str, bmbVar});
        } else if (TextUtils.isEmpty(str) || bmbVar == null) {
        } else {
            this.O.put(str, bmbVar);
        }
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        a("check_mutex", (bmb) new bma());
        a("check_hidden", (bmb) new blz());
    }

    public void a(bmc bmcVar) {
        List<bmc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1fdde60", new Object[]{this, bmcVar});
        } else if (bmcVar == null || (list = this.Q) == null) {
        } else {
            list.add(bmcVar);
        }
    }

    public void b(bmc bmcVar) {
        List<bmc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d080e4e1", new Object[]{this, bmcVar});
        } else if (bmcVar == null || (list = this.Q) == null) {
        } else {
            list.remove(bmcVar);
        }
    }

    public jpl t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpl) ipChange.ipc$dispatch("a135cc05", new Object[]{this}) : this.N;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.U;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.ae = z;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.V = i;
        }
    }

    public j v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("e2c23be0", new Object[]{this}) : this.l;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        this.X = i;
        this.W = str;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : this.X;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this}) : this.W;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.Y;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.ab;
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.Z;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.am = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.al = i;
        }
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.aa;
    }

    private boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : jqi.a(r(), "enableDiffRefreshRecyclerView", true);
    }

    private com.alibaba.android.ultron.vfw.perf.rebuilddelay.a C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.perf.rebuilddelay.a) ipChange.ipc$dispatch("6bec9ddd", new Object[]{this});
        }
        com.alibaba.android.ultron.vfw.perf.rebuilddelay.a aVar = this.T;
        if (aVar != null) {
            return aVar;
        }
        this.T = new com.alibaba.android.ultron.vfw.perf.rebuilddelay.a(r(), this.f);
        return this.T;
    }

    public boc E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boc) ipChange.ipc$dispatch("3794c7c4", new Object[]{this}) : this.d;
    }

    private boolean a(brx brxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e24ddfb4", new Object[]{this, brxVar})).booleanValue() : brxVar != null && brxVar.d();
    }

    private ixl J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixl) ipChange.ipc$dispatch("5e105418", new Object[]{this});
        }
        if (this.af == null) {
            this.af = new ixl(r());
        }
        return this.af;
    }
}
