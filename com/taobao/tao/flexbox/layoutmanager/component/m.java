package com.taobao.tao.flexbox.layoutmanager.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.l;
import com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ad;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import tb.apz;
import tb.kge;
import tb.odx;
import tb.oeb;
import tb.oec;
import tb.ofn;
import tb.ofo;
import tb.ofq;
import tb.ofr;
import tb.ofs;
import tb.ogg;
import tb.ogh;
import tb.ogl;
import tb.ogs;
import tb.ohc;
import tb.ohd;
import tb.ohl;
import tb.ohy;
import tb.ohz;
import tb.oib;
import tb.oid;
import tb.sjx;
import tb.tqu;

/* loaded from: classes8.dex */
public class m extends Component<TNodeRecyclerView, b> implements RecyclerView.RecyclerListener, BottomSheetComponentInterface.a, com.taobao.tao.flexbox.layoutmanager.core.g, com.taobao.tao.flexbox.layoutmanager.core.s, com.taobao.tao.flexbox.layoutmanager.core.z, com.taobao.tao.flexbox.layoutmanager.module.element.a, ofo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<com.taobao.tao.flexbox.layoutmanager.core.aa> F;
    private String I;
    private sjx J;
    private boolean L;
    public ofn b;
    private ItemTouchHelper.Callback c;
    private ItemTouchHelper d;
    private DragToRefreshFeature g;
    private GridLayoutManager.SpanSizeLookup h;
    private String[] k;
    private BottomSheetComponentInterface m;
    private ofs n;
    private List<ScrollChangeListener> o;
    private int p;
    private int q;
    private c.a r;
    private RecyclerView.ItemAnimator v;
    private ViewTreeObserver.OnGlobalLayoutListener w;
    private int x;
    private c z;
    private int e = -1;
    private int f = -1;
    private SparseIntArray i = new SparseIntArray();
    private SparseIntArray j = new SparseIntArray();
    private HashSet<com.taobao.tao.flexbox.layoutmanager.core.aa> l = new HashSet<>();
    private Handler s = new Handler(Looper.getMainLooper());
    private int t = oeb.aK();
    private l u = null;

    /* renamed from: a  reason: collision with root package name */
    public ofr f20143a = new ofr(this);
    private float K = Float.NaN;
    private Handler y = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.taobao.tao.flexbox.layoutmanager.event.b b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (m.a(m.this) == null) {
            } else {
                int i = message.what;
                if ((i != 0 && i != 1) || (b2 = m.b(m.this).b((String) message.obj)) == null) {
                    return;
                }
                b2.a(null);
            }
        }
    };
    private int A = 0;
    private int B = 0;
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private boolean G = true;
    private ArrayList<ofq> H = new ArrayList<>();
    private tqu M = new tqu();

    static {
        kge.a(-637584321);
        kge.a(-1300391530);
        kge.a(328095190);
        kge.a(-1353647536);
        kge.a(-1420926486);
        kge.a(-1132940067);
        kge.a(-2089696438);
        kge.a(-1400481039);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((View) objArr[0], (ogl) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -613926416:
                super.onLayout();
                return null;
            case 258418204:
                return new Boolean(super.invoke((g.c) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (g.d) objArr[3]));
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 1015965122:
                super.onLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1123088784:
                return new Boolean(super.onPrepareComponent((Context) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollTo(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ void applyAttrForView(TNodeRecyclerView tNodeRecyclerView, b bVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805910c7", new Object[]{this, tNodeRecyclerView, bVar, map, new Boolean(z)});
        } else {
            a(tNodeRecyclerView, bVar, map, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.tao.flexbox.layoutmanager.component.m$b, tb.ogl] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public /* synthetic */ b mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : b();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView, android.view.View] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public /* synthetic */ TNodeRecyclerView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : a(context);
    }

    public static /* synthetic */ ogl A(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("f3af0acd", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl B(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("87ed7a6c", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl C(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("1c2bea0b", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl D(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b06a59aa", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl E(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("44a8c949", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl F(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d8e738e8", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl G(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("6d25a887", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl H(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("1641826", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl I(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("95a287c5", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl J(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("29e0f764", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl K(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("be1f6703", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl L(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("525dd6a2", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl M(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("e69c4641", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl N(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("7adab5e0", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl O(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("f19257f", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl P(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("a357951e", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl Q(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("379604bd", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl R(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("cbd4745c", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl S(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("6012e3fb", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl T(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("f451539a", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl U(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("888fc339", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl V(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("1cce32d8", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl W(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b10ca277", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl X(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("454b1216", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ SparseIntArray Y(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseIntArray) ipChange.ipc$dispatch("3c91b397", new Object[]{mVar}) : mVar.j;
    }

    public static /* synthetic */ ogl Z(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("6dc7f154", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ int a(m mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c50ede71", new Object[]{mVar, new Integer(i)})).intValue();
        }
        mVar.e = i;
        return i;
    }

    public static /* synthetic */ int a(m mVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed42ba40", new Object[]{mVar, aaVar})).intValue() : mVar.c(aaVar);
    }

    public static /* synthetic */ View a(m mVar, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("77db0a8f", new Object[]{mVar, view}) : mVar.a(view);
    }

    public static /* synthetic */ c.a a(m mVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("792df71", new Object[]{mVar, aVar});
        }
        mVar.r = aVar;
        return aVar;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("bf2d70b9", new Object[]{mVar}) : mVar.node;
    }

    public static /* synthetic */ void a(m mVar, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccd5902", new Object[]{mVar, new Integer(i), new Float(f)});
        } else {
            mVar.a(i, f);
        }
    }

    public static /* synthetic */ void a(m mVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccd6445", new Object[]{mVar, new Integer(i), new Integer(i2)});
        } else {
            mVar.c(i, i2);
        }
    }

    public static /* synthetic */ void a(m mVar, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64b36cb8", new Object[]{mVar, cls});
        } else {
            mVar.a(cls);
        }
    }

    public static /* synthetic */ boolean a(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50f1e53", new Object[]{mVar, new Boolean(z)})).booleanValue();
        }
        mVar.E = z;
        return z;
    }

    public static /* synthetic */ View aA(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("701cb6c6", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa aB(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("2369c119", new Object[]{mVar}) : mVar.node;
    }

    public static /* synthetic */ ogl aC(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("658d06ac", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl aD(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("f9cb764b", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl aE(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("8e09e5ea", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ View aF(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("535839cb", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ ogl aG(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b686c528", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl aH(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("4ac534c7", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ItemTouchHelper aI(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ItemTouchHelper) ipChange.ipc$dispatch("72a1f083", new Object[]{mVar}) : mVar.d;
    }

    public static /* synthetic */ ogl aJ(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("73421405", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl aK(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("78083a4", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ View aL(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fd9fa3d1", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View aM(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c4ab8ad2", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ Handler aN(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("88b60755", new Object[]{mVar}) : mVar.s;
    }

    public static /* synthetic */ int aO(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b02105", new Object[]{mVar})).intValue() : mVar.t;
    }

    public static /* synthetic */ View aP(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("19cf3fd5", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ ogl aQ(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("80f7215e", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ l aR(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("c9ce6dff", new Object[]{mVar}) : mVar.i();
    }

    public static /* synthetic */ View aS(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6ef2f4d8", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View aT(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("35fedbd9", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ boolean aU(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41aa209c", new Object[]{mVar})).booleanValue() : mVar.D;
    }

    public static /* synthetic */ boolean[] aV(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boolean[]) ipChange.ipc$dispatch("f4d0463c", new Object[]{mVar}) : mVar.k();
    }

    public static /* synthetic */ ogl aW(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("fa6dbf18", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ int aX(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bda7204e", new Object[]{mVar})).intValue();
        }
        int i = mVar.p;
        mVar.p = i - 1;
        return i;
    }

    public static /* synthetic */ ogl aY(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("22ea9e56", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl aZ(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b7290df5", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl aa(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("c4de1b4e", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl ab(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("591c8aed", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl ac(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("ed5afa8c", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl ad(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("81996a2b", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl ae(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("15d7d9ca", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl af(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("aa164969", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ Handler ag(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1dbe5b5c", new Object[]{mVar}) : mVar.y;
    }

    public static /* synthetic */ ogl ah(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("d29328a7", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl ai(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("66d19846", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ DragToRefreshFeature aj(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DragToRefreshFeature) ipChange.ipc$dispatch("5bd97325", new Object[]{mVar}) : mVar.g;
    }

    public static /* synthetic */ View ak(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("18109cf0", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View al(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("df1c83f1", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ c.a am(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("dbc1b67", new Object[]{mVar}) : mVar.r;
    }

    public static /* synthetic */ int an(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ae673e4", new Object[]{mVar})).intValue() : mVar.q;
    }

    public static /* synthetic */ View ao(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("344038f4", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View ap(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fb4c1ff5", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View aq(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c25806f6", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ ogl ar(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("9d0384dd", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ View as(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("506fd4f8", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View at(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("177bbbf9", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View au(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("de87a2fa", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View av(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a59389fb", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View aw(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6c9f70fc", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa ax(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("111a5523", new Object[]{mVar}) : mVar.node;
    }

    public static /* synthetic */ View ay(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fab73efe", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ View az(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c1c325ff", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ int b(m mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6453150", new Object[]{mVar, new Integer(i)})).intValue();
        }
        mVar.f = i;
        return i;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("77ba3118", new Object[]{mVar}) : mVar.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa b(m mVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("8f0022b0", new Object[]{mVar, aaVar}) : mVar.b(aaVar);
    }

    public static /* synthetic */ boolean b(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6457132", new Object[]{mVar, new Boolean(z)})).booleanValue();
        }
        mVar.D = z;
        return z;
    }

    public static /* synthetic */ BottomSheetComponentInterface ba(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BottomSheetComponentInterface) ipChange.ipc$dispatch("c0530c8b", new Object[]{mVar}) : mVar.m;
    }

    public static /* synthetic */ ogl bb(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("4cac0f2e", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ HashSet bc(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("9f41c4e2", new Object[]{mVar}) : mVar.l;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa bd(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("ff269938", new Object[]{mVar}) : mVar.node;
    }

    public static /* synthetic */ View c(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("dae30029", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ void c(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77bc40d", new Object[]{mVar, new Boolean(z)});
        } else {
            mVar.b(z);
        }
    }

    public static /* synthetic */ View d(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a1eee72a", new Object[]{mVar}) : mVar.view;
    }

    public static /* synthetic */ c e(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5ebbaeab", new Object[]{mVar}) : mVar.z;
    }

    public static /* synthetic */ int f(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8aae635d", new Object[]{mVar})).intValue() : mVar.A;
    }

    public static /* synthetic */ ogl g(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("f4f39c67", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ int h(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd570ddf", new Object[]{mVar})).intValue() : mVar.e;
    }

    public static /* synthetic */ int i(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ab6320", new Object[]{mVar})).intValue() : mVar.f;
    }

    public static /* synthetic */ ogl j(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("b1aeeb44", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa k(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("f4acf46f", new Object[]{mVar}) : mVar.node;
    }

    public static /* synthetic */ SparseIntArray l(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseIntArray) ipChange.ipc$dispatch("aac2dcea", new Object[]{mVar}) : mVar.i;
    }

    public static /* synthetic */ ogl m(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("6e6a3a21", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl n(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("2a8a9c0", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl o(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("96e7195f", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ int p(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27f9b7e7", new Object[]{mVar})).intValue() : mVar.p;
    }

    public static /* synthetic */ int q(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("514e0d28", new Object[]{mVar})).intValue();
        }
        int i = mVar.p;
        mVar.p = i + 1;
        return i;
    }

    public static /* synthetic */ JSONArray r(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("3a7d907a", new Object[]{mVar}) : mVar.p();
    }

    public static /* synthetic */ ogl s(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("e7e0d7db", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ sjx t(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjx) ipChange.ipc$dispatch("7c2125ad", new Object[]{mVar}) : mVar.J;
    }

    public static /* synthetic */ ogl u(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("105db719", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl v(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("a49c26b8", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl w(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("38da9657", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ ogl x(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("cd1905f6", new Object[]{mVar}) : mVar.viewParams;
    }

    public static /* synthetic */ GridLayoutManager.SpanSizeLookup y(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GridLayoutManager.SpanSizeLookup) ipChange.ipc$dispatch("4e955f7f", new Object[]{mVar}) : mVar.h;
    }

    public static /* synthetic */ ogl z(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("f595e534", new Object[]{mVar}) : mVar.viewParams;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (str != null) {
            char c2 = 65535;
            if (str.hashCode() == 741331860 && str.equals(sjx.KEY_RECORD_EXTRA)) {
                c2 = 0;
            }
            if (c2 == 0) {
                return this.M;
            }
        }
        return super.getAttributeHandler(str);
    }

    public sjx r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sjx) ipChange.ipc$dispatch("91d6838c", new Object[]{this}) : this.J;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.BottomSheetComponentInterface.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str != "large" && str != BottomSheetComponentInterface.State.HALF) {
        } else {
            Iterator<com.taobao.tao.flexbox.layoutmanager.core.aa> it = this.l.iterator();
            while (it.hasNext()) {
                com.taobao.tao.flexbox.layoutmanager.core.aa next = it.next();
                if (!next.d.isEmpty() && oec.c(next.d.get(0).x())) {
                    c.a(this.z, next);
                    it.remove();
                }
            }
        }
    }

    public void a(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc6b6ab9", new Object[]{this, scrollChangeListener});
        } else if (this.view == 0) {
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(scrollChangeListener);
        } else {
            ((TNodeRecyclerView) this.view).addScrollChangeListener(scrollChangeListener);
        }
    }

    public void b(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3944cfa", new Object[]{this, scrollChangeListener});
            return;
        }
        List<ScrollChangeListener> list = this.o;
        if (list != null) {
            list.remove(scrollChangeListener);
        }
        if (this.view == 0) {
            return;
        }
        ((TNodeRecyclerView) this.view).removeScrollChangeListener(scrollChangeListener);
    }

    public void a(oid oidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f4ce", new Object[]{this, oidVar});
        } else if (this.view == 0) {
        } else {
            ((TNodeRecyclerView) this.view).addVelocityChangeListener(oidVar);
        }
    }

    public void b(oid oidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e677fb4f", new Object[]{this, oidVar});
        } else if (this.view == 0) {
        } else {
            ((TNodeRecyclerView) this.view).removeVelocityChangeListener(oidVar);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (((b) this.viewParams).u) {
            if (this.n != null) {
                return;
            }
            this.n = new ofs();
            this.n.a(((b) this.viewParams).v);
            this.n.e(((b) this.viewParams).y);
            this.n.f(((b) this.viewParams).z);
            this.n.d(((b) this.viewParams).x);
            this.n.c(((b) this.viewParams).w);
            if (((b) this.viewParams).A == 0) {
                ((b) this.viewParams).A = this.node.G().b / 3;
            }
            this.n.b(((b) this.viewParams).A);
            this.n.a((RecyclerView) this.view);
        } else {
            ofs ofsVar = this.n;
            if (ofsVar == null) {
                return;
            }
            ofsVar.a();
            this.n = null;
        }
    }

    public View a(int i) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        c cVar = this.z;
        if (cVar != null && (a2 = cVar.a(i)) != null && a2.x() != null) {
            return (View) a2.x().getParent();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r0.equals("onpagescrollstatechanged") != false) goto L11;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa.e r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            r1[r3] = r8
            java.lang.String r8 = "4492e532"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            java.lang.String r0 = r8.c
            r1 = -1
            int r5 = r0.hashCode()
            java.lang.String r6 = "onwillappear"
            switch(r5) {
                case -1055330882: goto L69;
                case -654012496: goto L5e;
                case -552345454: goto L53;
                case 209131304: goto L48;
                case 238360901: goto L3d;
                case 1729966319: goto L32;
                case 2122668806: goto L2a;
                default: goto L29;
            }
        L29:
            goto L73
        L2a:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L73
            r2 = 1
            goto L74
        L32:
            java.lang.String r2 = "onforcerefresh"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L73
            r2 = 0
            goto L74
        L3d:
            java.lang.String r2 = "onrefreshchangestate"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L73
            r2 = 4
            goto L74
        L48:
            java.lang.String r2 = "scroll_state_idle_internal"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L73
            r2 = 5
            goto L74
        L53:
            java.lang.String r2 = "onwilldisappear"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L73
            r2 = 6
            goto L74
        L5e:
            java.lang.String r2 = "onpagerefreshstatechanged"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L73
            r2 = 3
            goto L74
        L69:
            java.lang.String r5 = "onpagescrollstatechanged"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L73
            goto L74
        L73:
            r2 = -1
        L74:
            r0 = 130(0x82, float:1.82E-43)
            switch(r2) {
                case 0: goto Lb2;
                case 1: goto L98;
                case 2: goto L98;
                case 3: goto L98;
                case 4: goto L98;
                case 5: goto L8b;
                case 6: goto L7a;
                default: goto L79;
            }
        L79:
            goto Lcc
        L7a:
            java.lang.String r0 = r8.c
            java.util.Map r8 = r8.d
            r1 = 386(0x182, float:5.41E-43)
            r7.a(r0, r8, r4, r1)
            tb.sjx r8 = r7.J
            if (r8 == 0) goto L8a
            r8.disappear()
        L8a:
            return r4
        L8b:
            java.lang.String r1 = r8.c
            java.util.Map r2 = r8.d
            r7.a(r1, r2, r3, r0)
            r0 = 2048(0x800, float:2.87E-42)
            r8.b(r0)
            return r4
        L98:
            java.lang.String r1 = r8.c
            java.util.Map r2 = r8.d
            r7.a(r1, r2, r3, r0)
            java.lang.String r8 = r8.c
            boolean r8 = android.text.TextUtils.equals(r8, r6)
            if (r8 == 0) goto Lb1
            r7.q()
            tb.sjx r8 = r7.J
            if (r8 == 0) goto Lb1
            r8.appear()
        Lb1:
            return r4
        Lb2:
            com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature r0 = r7.g
            if (r0 == 0) goto Lcc
            V extends android.view.View r0 = r7.view
            if (r0 == 0) goto Lcc
            com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature r0 = r7.g
            r0.setIsPositiveRefreshing()
            V extends android.view.View r0 = r7.view
            com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView r0 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView) r0
            r0.scrollToPosition(r4)
            java.util.Map r8 = r8.d
            r7.a(r8)
            return r3
        Lcc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.m.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa$e):boolean");
    }

    private void a(final String str, final Map map, boolean z, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c188702", new Object[]{this, str, map, new Boolean(z), new Integer(i)});
        } else if (this.view != 0) {
            int[] findVisibleItemPositionRange = ((TNodeRecyclerView) this.view).findVisibleItemPositionRange(true);
            if (findVisibleItemPositionRange[0] < 0 && findVisibleItemPositionRange[1] < 0 && z) {
                oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (m.c(m.this) != null) {
                            int[] findVisibleItemPositionRange2 = ((TNodeRecyclerView) m.d(m.this)).findVisibleItemPositionRange(true);
                            for (int i2 = findVisibleItemPositionRange2[0]; i2 <= findVisibleItemPositionRange2[1] && i2 >= 0; i2++) {
                                m mVar = m.this;
                                mVar.sendMessage(i, m.e(mVar).a(i2), str, null, map, null);
                            }
                        }
                    }
                });
                return;
            }
            for (int i2 = findVisibleItemPositionRange[0]; i2 <= findVisibleItemPositionRange[1] && i2 >= 0; i2++) {
                sendMessage(i, this.z.a(i2), str, null, map, null);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.y.removeCallbacksAndMessages(null);
        }
    }

    private l i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("a4e0dbc4", new Object[]{this});
        }
        if (this.u == null) {
            this.u = l.c(getNode());
        }
        return this.u;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        i().a();
        if (this.view != 0 && this.w != null) {
            ohl.a(this.view, this.w);
            this.w = null;
        }
        a("onwilldisappear", (Map) new HashMap(), false, 34);
        if (oeb.ao() && this.view != 0) {
            ((TNodeRecyclerView) this.view).setAdapter(null);
            this.z = null;
        }
        super.detach(z);
        BottomSheetComponentInterface bottomSheetComponentInterface = this.m;
        if (bottomSheetComponentInterface != null) {
            bottomSheetComponentInterface.removeBottomSheetStateChangedListener(this);
            this.m = null;
        }
        List<ScrollChangeListener> list = this.o;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public TNodeRecyclerView a(Context context) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (TNodeRecyclerView) ipChange.ipc$dispatch("86069bf8", new Object[]{this, context});
        }
        final TNodeRecyclerView tNodeRecyclerView = new TNodeRecyclerView(context);
        this.b = new ofn("list", tNodeRecyclerView);
        int i = ((b) this.viewParams).av == YogaFlexDirection.COLUMN ? 1 : 0;
        if (i != 0 && (a2 = this.node.a("scrollView", 1)) != null && (a2.x() instanceof TBSwipeRefreshLayout)) {
            ((b) this.viewParams).B = false;
        }
        this.q = oeb.a(((b) this.viewParams).K);
        if (((b) this.viewParams).p) {
            ((b) this.viewParams).B = false;
        }
        if (((b) this.viewParams).B) {
            tNodeRecyclerView.enableEdgeEffect(((b) this.viewParams).av == YogaFlexDirection.COLUMN ? 1 : 0);
        }
        tNodeRecyclerView.setKeyBoardDismissMode(((b) this.viewParams).C);
        tNodeRecyclerView.setKeyBoardDismissListener(this);
        tNodeRecyclerView.setComponent(this);
        tNodeRecyclerView.setRecyclerListener(this);
        this.v = tNodeRecyclerView.getItemAnimator();
        if (ogs.a() || ((b) this.viewParams).J) {
            tNodeRecyclerView.setItemAnimator(null);
        }
        if (tNodeRecyclerView.getItemAnimator() != null) {
            tNodeRecyclerView.getItemAnimator().setChangeDuration(0L);
        }
        if (i != 0) {
            com.taobao.tao.flexbox.layoutmanager.core.aa a3 = this.node.a("TabBarController", 1);
            if (a3 != null && a3.I() != null) {
                this.k = ((TabBarControllerComponent) a3.I()).getViewParams().c;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa a4 = this.node.a(BottomSheetComponentInterface.class, (aa.c) null, true);
            if (a4 != null && oeb.c()) {
                this.m = (BottomSheetComponentInterface) a4.I();
                this.m.addBottomSheetStateChangedListener(this);
            }
        }
        if (((b) this.viewParams).p) {
            this.c = new ItemTouchHelper.Callback() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -1750195729:
                            return new Integer(super.interpolateOutOfBoundsScroll((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).longValue()));
                        case -1744814362:
                            super.clearView((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]);
                            return null;
                        case -298668841:
                            super.onSelectedChanged((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                            return null;
                        case 1142860821:
                            super.onMoved((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1], ((Number) objArr[2]).intValue(), (RecyclerView.ViewHolder) objArr[3], ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue());
                            return null;
                        default:
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public boolean isLongPressDragEnabled() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue();
                    }
                    return false;
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("16312429", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
                    }
                    return true;
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public void onSwiped(RecyclerView.ViewHolder viewHolder, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ed1ecf46", new Object[]{this, viewHolder, new Integer(i2)});
                    }
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("35ad4c09", new Object[]{this, recyclerView, viewHolder})).intValue() : makeMovementFlags(15, 0);
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i2, RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("441eac15", new Object[]{this, recyclerView, viewHolder, new Integer(i2), viewHolder2, new Integer(i3), new Integer(i4), new Integer(i5)});
                        return;
                    }
                    super.onMoved(recyclerView, viewHolder, i2, viewHolder2, i3, i4, i5);
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) viewHolder2.itemView.getTag(R.id.layout_manager_cell_tag_id);
                    if (aaVar == null || !oec.a(aaVar.e("enabled-drag"), false)) {
                        return;
                    }
                    m.e(m.this).notifyItemMoved(adapterPosition, adapterPosition2);
                    m.a(m.this, adapterPosition - (m.f(m.this) + tNodeRecyclerView.getHeaderViewsCount()), adapterPosition2 - (m.f(m.this) + tNodeRecyclerView.getHeaderViewsCount()));
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98003ee6", new Object[]{this, recyclerView, viewHolder});
                        return;
                    }
                    super.clearView(recyclerView, viewHolder);
                    viewHolder.itemView.setAlpha(1.0f);
                    ((TNodeRecyclerView) recyclerView).setHookTouchEvent(true);
                    if (Build.VERSION.SDK_INT < 21) {
                        return;
                    }
                    m mVar = m.this;
                    View a5 = m.a(mVar, mVar.getView());
                    if (a5 == null) {
                        return;
                    }
                    a5.setZ(0.0f);
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee32acd7", new Object[]{this, viewHolder, new Integer(i2)});
                        return;
                    }
                    if (i2 == 2) {
                        if (((b) m.g(m.this)).s) {
                            viewHolder.itemView.setAlpha(0.9f);
                        }
                    } else if (i2 == 0 && m.h(m.this) != m.i(m.this) && !TextUtils.isEmpty(((b) m.j(m.this)).q)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("source", Integer.valueOf(m.h(m.this)));
                        hashMap.put("dest", Integer.valueOf(m.i(m.this)));
                        m mVar = m.this;
                        mVar.postMessage(m.k(mVar), "ondrag", null, hashMap, null);
                    }
                    super.onSelectedChanged(viewHolder, i2);
                }

                @Override // android.support.v7.widget.helper.ItemTouchHelper.Callback
                public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i2, int i3, int i4, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("97ae21ef", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3), new Integer(i4), new Long(j)})).intValue();
                    }
                    int interpolateOutOfBoundsScroll = super.interpolateOutOfBoundsScroll(recyclerView, i2, i3, i4, j);
                    if (interpolateOutOfBoundsScroll != 1 && interpolateOutOfBoundsScroll != -1) {
                        return interpolateOutOfBoundsScroll;
                    }
                    return 0;
                }
            };
            this.d = new ItemTouchHelper(this.c);
            this.d.attachToRecyclerView(tNodeRecyclerView);
        }
        if (((b) this.viewParams).f20158a == 1) {
            ohz ohzVar = new ohz(context);
            if (((b) this.viewParams).av == YogaFlexDirection.ROW) {
                ohzVar.setOrientation(0);
            }
            tNodeRecyclerView.setLayoutManager(ohzVar);
        } else {
            if (!((b) this.viewParams).E) {
                tNodeRecyclerView.addItemDecoration(new a());
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i2)})).intValue();
                    }
                    int i3 = m.l(m.this).get(i2, -1);
                    if (i3 != -1) {
                        return i3;
                    }
                    com.taobao.tao.flexbox.layoutmanager.core.aa a5 = m.e(m.this).a(i2);
                    if (a5 == null) {
                        return ((b) m.m(m.this)).f20158a;
                    }
                    if (m.this.d(a5)) {
                        m.l(m.this).put(i2, ((b) m.o(m.this)).f20158a);
                        return ((b) m.n(m.this)).f20158a;
                    }
                    m.l(m.this).put(i2, 1);
                    return 1;
                }
            };
            spanSizeLookup.setSpanIndexCacheEnabled(true);
            this.h = spanSizeLookup;
            if (((b) this.viewParams).l) {
                oib oibVar = new oib(((b) this.viewParams).f20158a, i, tNodeRecyclerView);
                oibVar.a(spanSizeLookup);
                if (((b) this.viewParams).E) {
                    tNodeRecyclerView.setDisableTouch(true);
                    oibVar.b(((b) this.viewParams).F);
                }
                tNodeRecyclerView.setLayoutManager(oibVar);
            } else {
                ohy ohyVar = new ohy(context, ((b) this.viewParams).f20158a);
                ohyVar.setSpanSizeLookup(spanSizeLookup);
                tNodeRecyclerView.setLayoutManager(ohyVar);
            }
        }
        if (i != 0) {
            DragToRefreshFeature dragToRefreshFeature = this.g;
            if (dragToRefreshFeature == null || dragToRefreshFeature.getContext() != context) {
                this.g = new DragToRefreshFeature(context, 1);
                a(true);
                tNodeRecyclerView.addFeature(this.g);
            }
            DragToRefreshFeature dragToRefreshFeature2 = this.g;
            if (((b) this.viewParams).j != null) {
                z = true;
            }
            dragToRefreshFeature2.enablePositiveDrag(z);
            this.g.setMaxPullDistance(((b) this.viewParams).n);
            if (((b) this.viewParams).k != null) {
                DragToRefreshFeature dragToRefreshFeature3 = this.g;
                if (dragToRefreshFeature3 == null || dragToRefreshFeature3.getContext() != context) {
                    this.g = new DragToRefreshFeature(context, 1);
                    a(true);
                    tNodeRecyclerView.addFeature(this.g);
                }
                this.g.enableNegativeDrag(true, R.string.tnode_uik_refresh_arrow, null, ((b) this.viewParams).L);
                this.g.setNegativeTips(new String[]{"上拉加载更多内容", "松开加载...", "正在加载...", "数据加载完毕"});
                this.g.setNegativeDragAuto(true);
                b(true);
            }
        }
        if (!oec.a()) {
            tNodeRecyclerView.setOverScrollMode(1);
        }
        List<ScrollChangeListener> list = this.o;
        if (list != null) {
            for (ScrollChangeListener scrollChangeListener : list) {
                tNodeRecyclerView.addScrollChangeListener(scrollChangeListener);
            }
            this.o.clear();
        }
        tNodeRecyclerView.addVelocityChangeListener(new oid() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.oid
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                }
            }

            @Override // tb.oid
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                }
            }

            @Override // tb.oid
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                } else if (i2 < oeb.b(TBPlayerConst.TBPlayerPropertyFloatReadOnlyBorder) || m.p(m.this) != 0) {
                } else {
                    m.q(m.this);
                }
            }
        });
        return tNodeRecyclerView;
    }

    private org.json.JSONObject a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("262593e", new Object[]{this, aaVar});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa b2 = b(aaVar);
        if (b2 == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.taobao.tao.flexbox.layoutmanager.core.r G = b2.G();
        if (G != null) {
            jSONObject.put("width", ohd.b(this.node, ((TNodeRecyclerView) this.view).getContext(), G.f20361a));
            jSONObject.put("height", ohd.b(this.node, ((TNodeRecyclerView) this.view).getContext(), G.b));
        }
        jSONObject.put("id", b2.e("record-id"));
        jSONObject.put("type", b2.e("record-type"));
        jSONObject.put("title", b2.e("record-title"));
        jSONObject.put("pic", b2.e("record-pic"));
        return jSONObject;
    }

    private JSONArray p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("310ec59", new Object[]{this});
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa[] e = e(this.node.d.get(0));
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = e[0];
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = e[1];
        JSONArray jSONArray = new JSONArray();
        if (aaVar != null) {
            try {
                jSONArray.put(a(aaVar));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (aaVar2 != null) {
            for (com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3 : aaVar2.d) {
                jSONArray.put(a(aaVar3));
            }
        }
        return jSONArray;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!oec.a(this.node.e("enable-recorder"), false) || this.L) {
        } else {
            this.L = true;
            com.alibaba.flexa.compat.c.a("com.taobao.record.Recorder$Builder", new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(final Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    } else {
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.9.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    m.a(m.this, cls);
                                }
                            }
                        }, true);
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    } else {
                        ogg.a("ListViewComponent", "Recorder classNotFound");
                    }
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
        }
    }

    private void a(Class<?> cls) {
        try {
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            apz.a(newInstance, "targetRecycleView", new Object[]{this.view}, RecyclerView.class);
            apz.a(newInstance, "context", new Object[]{((TNodeRecyclerView) this.view).getContext()}, Context.class);
            this.J = (sjx) apz.a(newInstance, CartRecommendRefreshScene.build);
            this.node.k().a(R.id.layout_manager_recorder_tag, this.J);
            this.J.start();
            this.J.appear();
            this.J.refresh(p());
            this.M.a(this);
        } catch (Throwable th) {
            ogg.a("ListViewComponent", "create Recorder instance fail " + th.getMessage());
        }
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e79ce0cc", new Object[]{this}) : new b();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.i.clear();
        this.j.clear();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        int totalX = ((TNodeRecyclerView) this.view).getTotalX();
        int totalY = ((TNodeRecyclerView) this.view).getTotalY();
        hashMap.put("totalX", Integer.valueOf(totalX));
        hashMap.put("totalY", Integer.valueOf(totalY));
        hashMap.put("offsetX", Integer.valueOf(ohd.b(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalX)));
        hashMap.put("offsetY", Integer.valueOf(ohd.b(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalY)));
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            int[] findVisibleItemPositionRange = ((TNodeRecyclerView) this.view).findVisibleItemPositionRange(true);
            for (int i3 = findVisibleItemPositionRange[0]; i3 <= findVisibleItemPositionRange[1] && i3 >= 0; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
            hashMap.put("indexs", arrayList);
            int totalY2 = ((TNodeRecyclerView) this.view).getTotalY() - this.B;
            if (totalY2 == 0) {
                i2 = 0;
            } else if (totalY2 > 0) {
                i2 = 1;
            }
            hashMap.put("slide", Integer.valueOf(i2));
            this.C = ((TNodeRecyclerView) this.view).getTotalX();
            this.B = ((TNodeRecyclerView) this.view).getTotalY();
        }
        postMessage(this.node, "onscrollstatechanged", null, hashMap, null);
        if (i == 0) {
            if (((b) this.viewParams).g != null) {
                postMessage(this.node, "onenddragging", null, null, null);
            }
            if (!oeb.e("idlestate")) {
                return;
            }
            sendMessage(2, this.node, "scroll_state_idle_internal", null, null, null);
        } else if (i == 1 && ((b) this.viewParams).f != null) {
            postMessage(this.node, "onbegindragging", null, null, null);
        }
    }

    public void a(int i, int i2, int i3, float f, int i4, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff685c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f), new Integer(i4), new Float(f2)});
            return;
        }
        if (!this.G) {
            int totalX = ((TNodeRecyclerView) this.view).getTotalX();
            int totalY = ((TNodeRecyclerView) this.view).getTotalY();
            HashMap hashMap = new HashMap();
            hashMap.put("firstIndex", Integer.valueOf(i));
            hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_lastIndex, Integer.valueOf(i2));
            hashMap.put("totalX", Integer.valueOf(totalX));
            hashMap.put("totalY", Integer.valueOf(totalY));
            hashMap.put("dy", Integer.valueOf(i3));
            hashMap.put("mDy", Float.valueOf(f));
            hashMap.put("scrollState", Integer.valueOf(i4));
            hashMap.put("group", this.k);
            hashMap.put("moveY", Float.valueOf(f2));
            hashMap.put("offsetX", Integer.valueOf(ohd.b(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalX)));
            hashMap.put("offsetY", Integer.valueOf(ohd.b(getNode(), ((TNodeRecyclerView) this.view).getContext(), totalY)));
            if (((b) this.viewParams).h != null && oeb.D()) {
                sendMessage(getNode(), "onscroll", null, hashMap, null);
            } else {
                sendMessage(512, getNode(), "onscroll", null, hashMap, null);
            }
        }
        this.G = false;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nestY", Integer.valueOf(i));
        hashMap.put("maxNestY", Integer.valueOf(i2));
        hashMap.put("group", this.k);
        sendMessage(getNode(), "onnestscroll", null, hashMap, null);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TabBarControllerComponent a2 = x.a(this.node);
        if (a2 == null) {
            return;
        }
        a2.g();
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("canScrollVertically", "-1");
        hashMap.put("mDy", Float.valueOf(f));
        hashMap.put("group", this.k);
        sendMessage(getNode(), "canscrollvertical", null, hashMap, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8e65c2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onLayoutChanged(i, i2, i3, i4, z);
        if (this.view == 0 || i == i3 || z) {
            return;
        }
        try {
            RecyclerView.ItemDecoration itemDecorationAt = ((TNodeRecyclerView) this.view).getItemDecorationAt(0);
            if (!(itemDecorationAt instanceof a)) {
                return;
            }
            a.a((a) itemDecorationAt, -1);
        } catch (Throwable th) {
            ogg.c("ListViewComponent", "onLayoutChanged error " + th.getMessage());
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onPrepareComponent(Context context) {
        ArrayList<com.taobao.tao.flexbox.layoutmanager.core.aa> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42f0f990", new Object[]{this, context})).booleanValue();
        }
        boolean onPrepareComponent = super.onPrepareComponent(context);
        if (onPrepareComponent && (arrayList = this.F) != null) {
            Iterator<com.taobao.tao.flexbox.layoutmanager.core.aa> it = arrayList.iterator();
            while (it.hasNext()) {
                a(it.next(), context);
            }
            this.F.clear();
        }
        return onPrepareComponent;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (this.node.d.isEmpty()) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.node.d.get(0);
        if (((b) this.viewParams).N) {
            this.K = n();
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa[] e = e(aaVar);
        i().a(e[0], e[1], new l.d() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.component.l.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (m.t(m.this) == null) {
                } else {
                    m.t(m.this).updateRefreshData(m.r(m.this));
                }
            }
        });
        aaVar.j();
        int size = aaVar.d.size();
        if (size != 1) {
            if (size <= 1) {
                return;
            }
            aaVar.d.get(1).j();
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = aaVar.d.get(0);
        if (!aaVar2.d().f().equals("cells")) {
            return;
        }
        aaVar2.j();
    }

    private void c(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        final com.taobao.tao.flexbox.layoutmanager.core.aa a2 = c.a(this.z);
        if (a2 == null) {
            return;
        }
        oec.a(a2.d, i, i2);
        this.node.k().a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    oec.a(a2.d().c(), i, i2);
                }
            }
        });
        if (this.e == -1) {
            this.e = i;
        }
        this.f = i2;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayout() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6839f0", new Object[]{this});
            return;
        }
        super.onLayout();
        if (this.node.d.isEmpty()) {
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.node.d.get(0);
        aaVar.a(Float.NaN, Float.NaN);
        this.A = 0;
        if (e(aaVar)[0] == null) {
            i = 0;
        }
        this.A = i;
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa[] e(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa[]) ipChange.ipc$dispatch("4eb458c1", new Object[]{this, aaVar});
        }
        int size = aaVar.d.size();
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar3 = null;
        if (size == 1) {
            aaVar2 = aaVar.d.get(0);
            if (!aaVar2.d().f().equals("cells")) {
                this.A = 1;
                aaVar3 = aaVar2;
                aaVar2 = null;
            }
        } else if (size > 1) {
            aaVar3 = aaVar.d.get(0);
            aaVar2 = aaVar.d.get(1);
            this.A = 1;
        } else {
            aaVar2 = null;
        }
        return new com.taobao.tao.flexbox.layoutmanager.core.aa[]{aaVar3, aaVar2};
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa b(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("dd04eb4d", new Object[]{this, aaVar});
        }
        if (aaVar == null) {
            return aaVar;
        }
        if (!aaVar.K().equals("header")) {
            return !aaVar.d.isEmpty() ? aaVar.d.get(0) : aaVar;
        } else if (aaVar.d.isEmpty()) {
            return null;
        } else {
            return aaVar.d.get(0);
        }
    }

    public float l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee3", new Object[]{this})).floatValue() : this.K;
    }

    private float n() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de5", new Object[]{this})).floatValue();
        }
        if (!((b) this.viewParams).N) {
            return Float.NaN;
        }
        int m = m();
        boolean a2 = oeb.a("fixComputeColumnCount", true);
        if (((b) this.viewParams).O > 0) {
            if (a2) {
                if (((b) this.viewParams).c > 0 || ((b) this.viewParams).d == null) {
                    i2 = ((b) this.viewParams).c + m;
                } else if (TextUtils.equals(((b) this.viewParams).d, "average")) {
                    i2 = m - ((b) this.viewParams).c;
                }
                ((b) this.viewParams).f20158a = Math.min(i2 / (((b) this.viewParams).O + ((b) this.viewParams).c), ((b) this.viewParams).P);
            }
            i2 = m;
            ((b) this.viewParams).f20158a = Math.min(i2 / (((b) this.viewParams).O + ((b) this.viewParams).c), ((b) this.viewParams).P);
        }
        if (((b) this.viewParams).c > 0 || ((b) this.viewParams).d == null) {
            i = (m - ((((b) this.viewParams).f20158a - 1) * ((b) this.viewParams).c)) / ((b) this.viewParams).f20158a;
        } else if (!TextUtils.equals(((b) this.viewParams).d, "average")) {
            return Float.NaN;
        } else {
            i = (m - ((((b) this.viewParams).f20158a + 1) * ((b) this.viewParams).c)) / ((b) this.viewParams).f20158a;
        }
        return i;
    }

    private static void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Context context) {
        com.taobao.tao.flexbox.layoutmanager.core.aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b15578", new Object[]{aaVar, context});
        } else if (aaVar == null || (a2 = l.a(aaVar, true, true)) == null) {
        } else {
            a2.a(context);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.I = str;
        }
    }

    @Override // tb.ofo
    public void a(int i, int i2, int i3, boolean z, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7abcf21", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), aaVar});
            return;
        }
        this.f20143a.a(i, i2, i3, z);
        if ((i & 1) == 0) {
            if ((i & 2) == 0) {
                return;
            }
            i().a(aaVar, i2);
            return;
        }
        l i4 = i();
        if ((i & 16) != 0) {
            z2 = true;
        }
        i4.a(aaVar, i2, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView r6, com.taobao.tao.flexbox.layoutmanager.component.m.b r7, java.util.Map r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.m.a(com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView, com.taobao.tao.flexbox.layoutmanager.component.m$b, java.util.Map, boolean):void");
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.view == 0) {
        } else {
            RecyclerView.LayoutManager layoutManager = ((TNodeRecyclerView) this.view).getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).setSpanCount(((b) this.viewParams).f20158a);
            } else if (!(layoutManager instanceof GridLayoutManager)) {
            } else {
                ((GridLayoutManager) layoutManager).setSpanCount(((b) this.viewParams).f20158a);
            }
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.node.b() == null || !this.node.b().f20297a;
    }

    @Override // tb.ofp
    public void a(int i, int i2, int i3, boolean z) {
        int headerViewsCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = null;
        updateAPMToken(this.view, null);
        if (((b) this.viewParams).J) {
            if (i3 <= 1 || !j()) {
                itemAnimator = this.v;
            }
            ((TNodeRecyclerView) this.view).setItemAnimator(itemAnimator);
        }
        if (z || (i2 == 0 && this.A == 1)) {
            c();
        }
        if ((i & 16) != 0) {
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            i2 += this.A;
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        int i4 = i2 + headerViewsCount;
        if (i4 == 1 && this.x > 0) {
            ((TNodeRecyclerView) this.view).canScrollVertically(-1);
        }
        ofn ofnVar = this.b;
        if (ofnVar == null) {
            return;
        }
        ofnVar.a(i, i4, i3, z);
    }

    @Override // tb.ofp
    public void a(int i, int i2, int i3) {
        int headerViewsCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (((b) this.viewParams).J) {
            ((TNodeRecyclerView) this.view).setItemAnimator((i3 <= 1 || !j()) ? this.v : null);
        }
        c();
        updateAPMToken(this.view, null);
        if ((i & 16) != 0) {
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            i2 += this.A;
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        int i4 = i2 + headerViewsCount;
        ofn ofnVar = this.b;
        if (ofnVar == null) {
            return;
        }
        ofnVar.a(i, i4, i3);
    }

    @Override // tb.ofp
    public void b(int i, int i2, int i3) {
        int headerViewsCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfaa61a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (((b) this.viewParams).J) {
            ((TNodeRecyclerView) this.view).setItemAnimator((i3 - i2 <= 1 || !j()) ? this.v : null);
        }
        c();
        updateAPMToken(this.view, null);
        if ((i & 16) != 0) {
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            headerViewsCount = this.A + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        ofn ofnVar = this.b;
        if (ofnVar == null) {
            return;
        }
        ofnVar.b(i, i2 + headerViewsCount, i3 + headerViewsCount);
    }

    @Override // tb.ofp
    public void b(int i, int i2) {
        int headerViewsCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (((b) this.viewParams).J) {
            ((TNodeRecyclerView) this.view).setItemAnimator(null);
        }
        updateAPMToken(this.view, null);
        if ((i & 16) != 0) {
            headerViewsCount = ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        } else {
            headerViewsCount = this.A + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
        }
        ofn ofnVar = this.b;
        if (ofnVar == null) {
            return;
        }
        ofnVar.b(i, i2 + headerViewsCount);
    }

    private int c(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0336bc5", new Object[]{this, aaVar})).intValue();
        }
        if (aaVar.G() != null && aaVar.G().f20361a > 0) {
            i = aaVar.G().f20361a;
        }
        return i > 0 ? i : ad.k(aaVar);
    }

    public boolean d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33be8997", new Object[]{this, aaVar})).booleanValue();
        }
        int c2 = c(aaVar);
        return c2 > m() / 2 || (!YogaConstants.isUndefined(this.K) && ((double) c2) > ((double) this.K) * 1.5d);
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        int i = this.measureResult.f20361a;
        if (i <= 0) {
            i = ohd.b(this.node.N());
        }
        return (i - ((b) this.viewParams).ag) - ((b) this.viewParams).ah;
    }

    @Override // tb.ofo
    public int a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aa35e2b", new Object[]{this, aaVar, aaVar2})).intValue();
        }
        if (aaVar != null) {
            aaVar = aaVar.J();
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa a2 = c.a(this.z);
        if (aaVar != null && a2 != null && !a2.d.isEmpty()) {
            return a2.d.indexOf(aaVar);
        }
        return -1;
    }

    /* loaded from: classes8.dex */
    public class a extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;
        private int d;

        static {
            kge.a(-1904922808);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private a() {
            this.b = -1;
            this.c = -1;
            this.d = -1;
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("96ebf7ee", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.d = i;
            return i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
            if ((r13.getChildAt(0) instanceof com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.FakeHeaderView) == false) goto L14;
         */
        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getItemOffsets(android.graphics.Rect r10, android.view.View r11, android.support.v7.widget.RecyclerView r12, android.support.v7.widget.RecyclerView.State r13) {
            /*
                Method dump skipped, instructions count: 854
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.m.a.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
        }

        private int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            int i2 = m.Y(m.this).get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = i - 1;
            for (int i4 = i3; i4 >= 0; i4--) {
                if (m.l(m.this).get(i4) == ((b) m.ad(m.this)).f20158a) {
                    int i5 = (i3 - i4) % ((b) m.ae(m.this)).f20158a;
                    if (i5 == ((b) m.ac(m.this)).f20158a - 1) {
                        m.Y(m.this).put(i, 2);
                        return 2;
                    } else if (i5 == 0) {
                        m.Y(m.this).put(i, 0);
                        return 0;
                    } else {
                        m.Y(m.this).put(i, 1);
                        return 1;
                    }
                }
            }
            int i6 = i % ((b) m.ah(m.this)).f20158a;
            if (i6 == ((b) m.ai(m.this)).f20158a - 1) {
                m.Y(m.this).put(i, 2);
                return 2;
            } else if (i6 == 0) {
                m.Y(m.this).put(i, 0);
                return 0;
            } else {
                m.Y(m.this).put(i, 1);
                return 1;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.RecyclerListener
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
        boolean a2 = oec.a(this.node.e("enabled-drag"), false);
        if (aaVar == null || a2 || a(viewHolder)) {
            return;
        }
        Object tag = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_task_id);
        if (tag instanceof MessageQueue.IdleHandler) {
            Looper.myQueue().removeIdleHandler((MessageQueue.IdleHandler) tag);
        }
        Object tag2 = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_timeout_task_id);
        if (tag2 instanceof Runnable) {
            this.s.removeCallbacks((Runnable) tag2);
        }
        aaVar.d(false);
    }

    private boolean a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6090f29", new Object[]{this, viewHolder})).booleanValue();
        }
        try {
            return (((Integer) ohc.a("mFlags", viewHolder)).intValue() & 4) != 0;
        } catch (Exception e) {
            ogg.b("isViewHolderInvalid:" + e.getMessage());
            return false;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g.setOnDragToRefreshListener(new DragToRefreshFeature.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        m.this.a((Map) null);
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.uikit.feature.DragToRefreshFeature.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        m.this.e();
                    }
                }
            });
        }
    }

    private boolean[] k() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("b93197c3", new Object[]{this});
        }
        Object e = this.node.e("hasMore");
        if (e == null) {
            e = this.node.e("hasmore");
        }
        if (e != null) {
            z2 = oec.a(e, true);
            z = true;
        } else {
            z = false;
            z2 = true;
        }
        return new boolean[]{z, z2};
    }

    private void b(boolean z) {
        DragToRefreshFeature dragToRefreshFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean[] k = k();
        if (z) {
            if (this.node.D() == null || !k[0] || (dragToRefreshFeature = this.g) == null) {
                return;
            }
            dragToRefreshFeature.setNegativeRefreshFinish(!k[1]);
            return;
        }
        DragToRefreshFeature dragToRefreshFeature2 = this.g;
        if (dragToRefreshFeature2 == null) {
            return;
        }
        dragToRefreshFeature2.setNegativeRefreshFinish(!k[1]);
    }

    public void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (this.E) {
        } else {
            String str = (String) this.node.e("onrefresh");
            if (str != null) {
                this.E = true;
                sendMessage(this.node, "onrefresh", str, map, new com.taobao.tao.flexbox.layoutmanager.event.b() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.event.b
                    public void a(Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                            return;
                        }
                        m.ag(m.this).removeMessages(0);
                        m.a(m.this, false);
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    m.aj(m.this).onDragRefreshComplete();
                                }
                            }
                        }, 150L);
                    }
                });
                this.y.removeMessages(0);
                if (str.startsWith("$://")) {
                    str = str.substring(4);
                }
                this.y.sendMessageDelayed(Message.obtain(this.y, 0, str), 5000L);
            }
            ((TNodeRecyclerView) this.view).resetTotal();
        }
    }

    public void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.D || (str = (String) this.node.e("onloading")) == null) {
        } else {
            this.D = true;
            sendMessage(this.node, "onloading", str, null, new com.taobao.tao.flexbox.layoutmanager.event.b() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.event.b
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    m.ag(m.this).removeMessages(1);
                    m.b(m.this, false);
                    m.aj(m.this).onDragRefreshComplete();
                    m.c(m.this, false);
                    if (m.ak(m.this) == null || ((TNodeRecyclerView) m.al(m.this)).isInSLowScroll() || m.am(m.this) == null || m.an(m.this) <= 0) {
                        return;
                    }
                    m.am(m.this).run();
                }
            });
            this.y.removeMessages(1);
            if (str.startsWith("$://")) {
                str = str.substring(4);
            }
            this.y.sendMessageDelayed(Message.obtain(this.y, 1, str), 5000L);
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        if (this.view == 0) {
            return 0;
        }
        return ((TNodeRecyclerView) this.view).getScrollState();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        int f = f();
        return f == 0 || f == 1 || (this.view != 0 ? ((TNodeRecyclerView) this.view).isInSLowScroll() : true);
    }

    /* loaded from: classes8.dex */
    public class d extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f20170a;
        private int b;
        private int c;
        private boolean e;

        static {
            kge.a(-457549011);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 188604040) {
                super.onStop();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public d(Context context, int i) {
            super(context);
            this.f20170a = i;
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("75f19bf9", new Object[]{this})).intValue() : this.f20170a == 2 ? 1 : -1;
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue() : this.f20170a == 2 ? 1 : -1;
        }

        @Override // android.support.v7.widget.LinearSmoothScroller, android.support.v7.widget.RecyclerView.SmoothScroller
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            super.onStop();
            if (this.f20170a != 1) {
                return;
            }
            if (this.b <= 0 && this.c <= 0) {
                return;
            }
            m.this.scrollBy(this.b, this.c, this.e);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPosition(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        } else {
            scrollToPositionWithNumber(i, z, i2, 0);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPositionWithNumber(int i, boolean z, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (this.view == 0 || this.z.a(i) == null) {
        } else {
            d dVar = new d(((TNodeRecyclerView) this.view).getContext(), i2) { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1207374993) {
                        if (hashCode != -1142219598) {
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }
                        return new Float(super.calculateSpeedPerPixel((DisplayMetrics) objArr[0]));
                    }
                    return new Integer(super.calculateDtToFit(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public int calculateDtToFit(int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)})).intValue();
                    }
                    if (i2 == 1) {
                        return (i6 + ((i7 - i6) / 2)) - (i4 + ((i5 - i4) / 2));
                    }
                    return super.calculateDtToFit(i4, i5, i6, i7, i8);
                }

                @Override // android.support.v7.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
                    }
                    int i4 = i3;
                    if (i4 == 0) {
                        return super.calculateSpeedPerPixel(displayMetrics);
                    }
                    return (25.0f / i4) / displayMetrics.densityDpi;
                }
            };
            final int headerViewsCount = i + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
            dVar.setTargetPosition(headerViewsCount);
            if (z) {
                ((TNodeRecyclerView) this.view).getLayoutManager().startSmoothScroll(dVar);
                return;
            }
            if (this.w != null) {
                ohl.a(this.view, this.w);
            }
            this.w = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    View findViewByPosition;
                    int height;
                    int height2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    } else if (m.ap(m.this) == null || (findViewByPosition = ((TNodeRecyclerView) m.ao(m.this)).getLayoutManager().findViewByPosition(headerViewsCount)) == null) {
                    } else {
                        ohl.a(m.aq(m.this), this);
                        if (((b) m.ar(m.this)).av == YogaFlexDirection.ROW) {
                            height = ((TNodeRecyclerView) m.as(m.this)).getWidth();
                            height2 = findViewByPosition.getWidth();
                        } else {
                            height = ((TNodeRecyclerView) m.au(m.this)).getHeight();
                            height2 = findViewByPosition.getHeight();
                        }
                        int i4 = (height - height2) / 2;
                        if (((TNodeRecyclerView) m.at(m.this)).getLayoutManager() instanceof StaggeredGridLayoutManager) {
                            ((StaggeredGridLayoutManager) ((TNodeRecyclerView) m.av(m.this)).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, i4);
                        } else if (((TNodeRecyclerView) m.aw(m.this)).getLayoutManager() instanceof LinearLayoutManager) {
                            ((LinearLayoutManager) ((TNodeRecyclerView) m.ay(m.this)).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, i4);
                        } else if (!(((TNodeRecyclerView) m.az(m.this)).getLayoutManager() instanceof GridLayoutManager)) {
                        } else {
                            ((GridLayoutManager) ((TNodeRecyclerView) m.aA(m.this)).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, i4);
                        }
                    }
                }
            };
            ((TNodeRecyclerView) this.view).getViewTreeObserver().addOnGlobalLayoutListener(this.w);
            ((TNodeRecyclerView) this.view).getLayoutManager().scrollToPosition(headerViewsCount);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollBy(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.view == 0) {
        } else {
            if (z) {
                ((TNodeRecyclerView) this.view).smoothScrollBy(i, i2);
            } else {
                ((TNodeRecyclerView) this.view).scrollBy(i, i2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        c cVar = this.z;
        if (cVar == null) {
            return 0;
        }
        return cVar.getItemCount();
    }

    private View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        View view2 = view;
        while (view2 != null) {
            ViewParent parent = view2.getParent();
            if (!(parent instanceof TNodeRecyclerView)) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                view2 = (View) parent;
            } else {
                return view2;
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.g.c r9, java.lang.String r10, com.alibaba.fastjson.JSONObject r11, com.taobao.tao.flexbox.layoutmanager.ac.g.d r12) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.m.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r9 = 2
            r1[r9] = r10
            r9 = 3
            r1[r9] = r11
            r9 = 4
            r1[r9] = r12
            java.lang.String r9 = "f67261c"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L25:
            V extends android.view.View r0 = r8.view
            if (r0 == 0) goto L8f
            int r0 = r10.hashCode()
            r1 = -980170895(0xffffffffc593c771, float:-4728.93)
            r4 = -1
            if (r0 == r1) goto L34
            goto L3f
        L34:
            java.lang.String r0 = "scrollToPosition"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L3f:
            r0 = -1
        L40:
            if (r0 == 0) goto L43
            goto L8f
        L43:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L69
            java.lang.String r1 = "position"
            int r3 = r11.getIntValue(r1)
            java.lang.String r1 = "animated"
            boolean r1 = r11.getBooleanValue(r1)
            java.lang.String r5 = "speedRatio"
            float r5 = r11.getFloatValue(r5)
            java.lang.String r6 = "stage"
            boolean r7 = r11.containsKey(r6)
            if (r7 == 0) goto L6c
            int r4 = r11.getIntValue(r6)
            goto L6c
        L69:
            r1 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
        L6c:
            r6 = 0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L72
            goto L73
        L72:
            r0 = r5
        L73:
            if (r1 == 0) goto L8b
            if (r4 < 0) goto L87
            r8.c(r4)
            V extends android.view.View r1 = r8.view
            com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView r1 = (com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView) r1
            com.taobao.tao.flexbox.layoutmanager.component.m$14 r4 = new com.taobao.tao.flexbox.layoutmanager.component.m$14
            r4.<init>()
            r1.post(r4)
            goto L90
        L87:
            r8.a(r3, r0)
            goto L90
        L8b:
            r8.c(r3)
            goto L90
        L8f:
            r2 = 0
        L90:
            if (r2 != 0) goto L96
            boolean r2 = super.invoke(r9, r10, r11, r12)
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.m.invoke(com.taobao.tao.flexbox.layoutmanager.ac.g$c, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.g$d):boolean");
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (this.view == 0) {
        } else {
            int headerViewsCount = i + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
            if (((TNodeRecyclerView) this.view).getLayoutManager() == null) {
                return;
            }
            if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
            } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof LinearLayoutManager) {
                ((LinearLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
            } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof GridLayoutManager) {
                ((GridLayoutManager) ((TNodeRecyclerView) this.view).getLayoutManager()).scrollToPositionWithOffset(headerViewsCount, 0);
            } else {
                ((TNodeRecyclerView) this.view).scrollToPosition(headerViewsCount);
            }
        }
    }

    private void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        } else if (this.view == 0) {
        } else {
            int headerViewsCount = i + ((TNodeRecyclerView) this.view).getHeaderViewsCount();
            if (((TNodeRecyclerView) this.view).getLayoutManager() != null) {
                if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof oib) {
                    ((oib) ((TNodeRecyclerView) this.view).getLayoutManager()).a(f);
                } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof ohz) {
                    ((ohz) ((TNodeRecyclerView) this.view).getLayoutManager()).a(f);
                } else if (((TNodeRecyclerView) this.view).getLayoutManager() instanceof ohy) {
                    ((ohy) ((TNodeRecyclerView) this.view).getLayoutManager()).a(f);
                }
            }
            ((TNodeRecyclerView) this.view).smoothScrollToPosition(headerViewsCount);
        }
    }

    /* loaded from: classes8.dex */
    public class c extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private com.taobao.tao.flexbox.layoutmanager.core.aa b;
        private int c = 0;

        /* loaded from: classes8.dex */
        public class b extends RecyclerView.ViewHolder {
            static {
                kge.a(-1837166418);
            }

            public b(View view) {
                super(view);
            }
        }

        static {
            kge.a(1454422822);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -955520525) {
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            } else if (hashCode != 1216347414) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("2c1b36b8", new Object[]{cVar}) : cVar.b();
        }

        public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa a(c cVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("9abaa1e1", new Object[]{cVar, new Integer(i)}) : cVar.c(i);
        }

        public static /* synthetic */ void a(c cVar, FrameLayout frameLayout, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1589353a", new Object[]{cVar, frameLayout, new Integer(i), new Boolean(z)});
            } else {
                cVar.a(frameLayout, i, z);
            }
        }

        public static /* synthetic */ void a(c cVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e0db42e", new Object[]{cVar, aaVar});
            } else {
                cVar.c(aaVar);
            }
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("128edba", new Object[]{cVar})).intValue();
            }
            int i = cVar.c;
            cVar.c = i + 1;
            return i;
        }

        public static /* synthetic */ int b(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23f53e0f", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.c = i;
            return i;
        }

        public static /* synthetic */ FrameLayout.LayoutParams b(c cVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FrameLayout.LayoutParams) ipChange.ipc$dispatch("fb118bb8", new Object[]{cVar, aaVar}) : cVar.a(aaVar);
        }

        public static /* synthetic */ void c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26bcf6c8", new Object[]{cVar});
            } else {
                cVar.a();
            }
        }

        public static /* synthetic */ boolean c(c cVar, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b0e2553f", new Object[]{cVar, new Integer(i)})).booleanValue() : cVar.b(i);
        }

        public static /* synthetic */ int d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c50ffbc", new Object[]{cVar})).intValue() : cVar.c;
        }

        public c() {
            if (!m.ax(m.this).d.isEmpty()) {
                this.b = m.aB(m.this).d.get(0);
            }
        }

        private FrameLayout.LayoutParams a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("80846399", new Object[]{this, aaVar});
            }
            if (((b) m.aC(m.this)).E) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, aaVar.G().b);
                ogl viewParams = aaVar.I().getViewParams();
                layoutParams.leftMargin = viewParams.ak;
                layoutParams.rightMargin = viewParams.al;
                layoutParams.topMargin = viewParams.am;
                layoutParams.bottomMargin = viewParams.an;
                return layoutParams;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((b) m.aD(m.this)).c > 0 ? aaVar.G().f20361a : -1, aaVar.G().b);
            ogl viewParams2 = aaVar.I().getViewParams();
            layoutParams2.leftMargin = viewParams2.ak;
            layoutParams2.rightMargin = viewParams2.al;
            layoutParams2.topMargin = viewParams2.am;
            layoutParams2.bottomMargin = viewParams2.an;
            return layoutParams2;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new b(new FrameLayout(viewGroup.getContext()));
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61bdb19b", new Object[]{this, viewHolder, new Integer(i), list});
            } else {
                onBindViewHolder(viewHolder, i);
            }
        }

        private void a(FrameLayout frameLayout, int i, boolean z) {
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa09355c", new Object[]{this, frameLayout, new Integer(i), new Boolean(z)});
            } else if (((b) m.aE(m.this)).E || m.this.getView() == null || !((b) m.aG(m.this)).l) {
            } else {
                StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) frameLayout.getLayoutParams();
                if (((oib) m.this.getView().getLayoutManager()).a(i) != ((b) m.aH(m.this)).f20158a) {
                    z2 = false;
                }
                if (layoutParams != null) {
                    layoutParams.setFullSpan(z2);
                    if (z) {
                        layoutParams.height = 0;
                        layoutParams.width = 0;
                        return;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    return;
                }
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                layoutParams2.setFullSpan(z2);
                if (z) {
                    layoutParams2.height = 0;
                    layoutParams2.width = 0;
                }
                frameLayout.setLayoutParams(layoutParams2);
            }
        }

        private void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
                return;
            }
            view.setTag(R.id.layout_manager_cell_tag_detach_id, null);
            view.setTag(R.id.layout_manager_cell_tag_task_id, null);
            view.setTag(R.id.layout_manager_cell_tag_timeout_task_id, null);
        }

        private void a(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, ViewGroup viewGroup, final RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15cf139e", new Object[]{this, aaVar, viewGroup, viewHolder});
            } else if (oec.a(aaVar.e("enabled-drag"), false)) {
                viewGroup.setClipChildren(false);
                aaVar.a(2, new View.OnLongClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                        View a2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                        }
                        ((TNodeRecyclerView) m.aF(m.this)).setHookTouchEvent(false);
                        m.a(m.this, m.b(m.this, -1));
                        if (Build.VERSION.SDK_INT >= 21 && (a2 = m.a(m.this, m.this.getView())) != null) {
                            a2.setZ(1.0f);
                        }
                        m.aI(m.this).startDrag(viewHolder);
                        return true;
                    }
                });
            } else {
                viewGroup.setClipChildren(oec.a(aaVar.e("clip-children"), true));
            }
        }

        private Runnable a(final com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, final FrameLayout frameLayout, final int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("9344ea04", new Object[]{this, aaVar, frameLayout, new Integer(i)}) : new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ogh.a("onBindViewHolderRender");
                    if (m.this.getView() == null) {
                        return;
                    }
                    if (!aaVar.w() || aaVar.s() || aaVar.r()) {
                        c.b(c.this);
                        aaVar.b(frameLayout.getContext());
                    }
                    if (aaVar.x() != null) {
                        ViewParent parent = aaVar.x().getParent();
                        FrameLayout frameLayout2 = frameLayout;
                        if (parent != frameLayout2) {
                            frameLayout2.removeAllViews();
                            if (aaVar.x().getParent() != null) {
                                ((ViewGroup) aaVar.x().getParent()).removeAllViews();
                            }
                            c.a(c.this, frameLayout, i, false);
                            frameLayout.addView(aaVar.x(), c.b(c.this, aaVar));
                        }
                    }
                    ogh.b();
                }
            };
        }

        private boolean a(long j, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e9794d3", new Object[]{this, new Long(j), new Integer(i), aaVar})).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis() - j;
            int U = oeb.U();
            return U > 0 && i > U && aaVar.x() == null && ((b) m.aJ(m.this)).I != null && currentTimeMillis > 5;
        }

        private void a(FrameLayout frameLayout, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, final RecyclerView.ViewHolder viewHolder, final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eda7862b", new Object[]{this, frameLayout, new Integer(i), aaVar, viewHolder, runnable});
                return;
            }
            frameLayout.removeAllViews();
            a(frameLayout, i, false);
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            frameLayout2.setBackgroundColor(-1);
            frameLayout2.setBackgroundDrawable(((b) m.aK(m.this)).I);
            frameLayout.addView(frameLayout2, a(aaVar));
            if (((TNodeRecyclerView) m.aL(m.this)).isInSLowScroll()) {
                oec.a(runnable);
                this.c = 0;
                return;
            }
            MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    Object tag = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_detach_id);
                    if (tag != null && ((Boolean) tag).booleanValue()) {
                        c.c(c.this);
                        return false;
                    } else if (((TNodeRecyclerView) m.aM(m.this)).isInSLowScroll() && c.d(c.this) <= 0) {
                        runnable.run();
                        return false;
                    } else {
                        c.c(c.this);
                        return true;
                    }
                }
            };
            Runnable runnable2 = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Object tag = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_detach_id);
                    if ((tag != null && ((Boolean) tag).booleanValue()) || !((TNodeRecyclerView) m.aP(m.this)).isInSLowScroll()) {
                        return;
                    }
                    if (c.d(c.this) <= 0) {
                        runnable.run();
                        return;
                    }
                    c.c(c.this);
                    m.aN(m.this).post(this);
                }
            };
            Looper.myQueue().addIdleHandler(idleHandler);
            frameLayout.setTag(R.id.layout_manager_cell_tag_task_id, idleHandler);
            if (!oeb.aL()) {
                return;
            }
            m.aN(m.this).postDelayed(runnable2, m.aO(m.this));
            frameLayout.setTag(R.id.layout_manager_cell_tag_timeout_task_id, runnable2);
        }

        private void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
                return;
            }
            if (m.am(m.this) != null) {
                m.ag(m.this).removeCallbacks(m.am(m.this));
            }
            m.a(m.this, new a(i));
            if (m.an(m.this) > 0 && m.p(m.this) > 0) {
                m.am(m.this).run();
                m.a(m.this, (a) null);
                return;
            }
            m.ag(m.this).post(m.am(m.this));
        }

        private void e(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            } else if (!((b) m.aQ(m.this)).u) {
            } else {
                m.ag(m.this).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            com.taobao.tao.flexbox.layoutmanager.core.aa a2 = c.a(c.this, i + 1);
                            if (a2 == null) {
                                return;
                            }
                            m.aR(m.this);
                            l.a(m.aR(m.this), a2);
                            com.taobao.tao.flexbox.layoutmanager.core.aa b2 = m.b(m.this, a2);
                            if (b2 == null) {
                                return;
                            }
                            try {
                                if (b2.n()) {
                                    b2.l();
                                }
                                if (b2.w() && !b2.s()) {
                                    return;
                                }
                                b2.b(((TNodeRecyclerView) m.aS(m.this)).getContext());
                            } catch (Exception unused) {
                            }
                        } catch (Exception e) {
                            ogg.a("TNode", e.getMessage());
                        }
                    }
                });
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            FrameLayout frameLayout = (FrameLayout) viewHolder.itemView;
            com.taobao.tao.flexbox.layoutmanager.core.aa c = c(i);
            if (c == null) {
                return;
            }
            m.aR(m.this);
            l.a(m.aR(m.this), c);
            com.taobao.tao.flexbox.layoutmanager.core.aa b2 = m.b(m.this, c);
            if (b2 == null) {
                return;
            }
            a(frameLayout);
            if (b2.K().equals("cell")) {
                frameLayout.removeAllViews();
                frameLayout.setTag(R.id.layout_manager_cell_tag_id, null);
                if (b2.d.isEmpty()) {
                    a(frameLayout, i, true);
                    return;
                }
                aaVar = b2.d.get(0);
            } else {
                aaVar = b2;
            }
            try {
                if (aaVar.n()) {
                    aaVar.l();
                }
                a(aaVar, frameLayout, viewHolder);
                Runnable a2 = a(aaVar, frameLayout, i);
                if (a(currentTimeMillis, i, aaVar)) {
                    a(frameLayout, i, aaVar, viewHolder, a2);
                } else {
                    a2.run();
                    this.c = 0;
                }
                frameLayout.setTag(R.id.layout_manager_cell_tag_id, aaVar);
            } catch (Exception e) {
                ogg.a("TNode", e.getMessage());
            }
            d(i);
            e(i);
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.c <= 0) {
            } else {
                m.ag(m.this).post(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            c.b(c.this, 0);
                        }
                    }
                });
            }
        }

        /* loaded from: classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f20168a;

            static {
                kge.a(838503562);
                kge.a(-1390502639);
            }

            public a(int i) {
                this.f20168a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ogh.a("checkLoadMore");
                    if (c.c(c.this, this.f20168a)) {
                        m.this.e();
                    }
                    ogh.b();
                } catch (Exception e) {
                    ogg.a("TNode", e.getMessage());
                }
            }
        }

        private boolean b(int i) {
            com.taobao.tao.flexbox.layoutmanager.core.aa b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if ((((TNodeRecyclerView) m.aT(m.this)).isScrollUp() || m.an(m.this) != 0) && !m.aU(m.this) && m.aV(m.this)[1] && ((b) m.aW(m.this)).i > 0 && (b2 = b()) != null) {
                int size = b2.d.size() + m.f(m.this);
                int an = size - ((m.an(m.this) + 3) * ((b) m.aY(m.this)).f20158a);
                if (m.an(m.this) == 0) {
                    if (i == Math.max(0, an)) {
                        return true;
                    }
                } else if (m.an(m.this) > 0) {
                    if (i >= Math.max(0, an)) {
                        return true;
                    }
                    if (m.p(m.this) > 0) {
                        m.aX(m.this);
                        return true;
                    }
                }
                int i2 = 0;
                for (int i3 = i + 1; i3 < size; i3++) {
                    com.taobao.tao.flexbox.layoutmanager.core.aa a2 = l.a(b2.d.get(i3 - m.f(m.this)), false, true);
                    if (a2.G() == null || (i2 = i2 + a2.G().b) > ((b) m.aZ(m.this)).i) {
                        return false;
                    }
                }
                if (i2 <= ((b) m.bb(m.this)).i) {
                    return true;
                }
            }
            return false;
        }

        private com.taobao.tao.flexbox.layoutmanager.core.aa b() {
            int size;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("eea45475", new Object[]{this});
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.b;
            if (aaVar != null && (size = aaVar.d.size()) > 0) {
                if (m.f(m.this) == 0) {
                    return this.b.d.get(0);
                }
                if (size > 1) {
                    return this.b.d.get(1);
                }
            }
            return null;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa b2 = b();
            if (b2 != null) {
                return b2.d.size() + m.f(m.this);
            }
            return m.f(m.this);
        }

        private com.taobao.tao.flexbox.layoutmanager.core.aa c(int i) {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6ce05985", new Object[]{this, new Integer(i)});
            }
            if (i < 0) {
                return null;
            }
            if (this.b == null) {
                ogg.c("ListViewComponent", "section is null");
                return null;
            } else if (i == 0 && m.f(m.this) == 1) {
                return this.b.d.get(0);
            } else {
                if (m.f(m.this) == 0) {
                    aaVar = this.b.d.get(0);
                } else {
                    aaVar = this.b.d.get(1);
                }
                if (i - m.f(m.this) < aaVar.d.size()) {
                    return aaVar.d.get(i - m.f(m.this));
                }
                return null;
            }
        }

        public com.taobao.tao.flexbox.layoutmanager.core.aa a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("e5ca1e03", new Object[]{this, new Integer(i)}) : m.b(m.this, c(i));
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(final RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
                return;
            }
            super.onViewAttachedToWindow(viewHolder);
            Object tag = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_detach_id);
            if (tag != null && ((Boolean) tag).booleanValue()) {
                viewHolder.itemView.setTag(R.id.layout_manager_cell_tag_detach_id, null);
                Object tag2 = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_task_id);
                viewHolder.itemView.setTag(R.id.layout_manager_cell_tag_task_id, null);
                if (tag2 instanceof MessageQueue.IdleHandler) {
                    Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler) tag2);
                }
                Object tag3 = viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_timeout_task_id);
                viewHolder.itemView.setTag(R.id.layout_manager_cell_tag_timeout_task_id, null);
                if (tag3 instanceof Runnable) {
                    m.aN(m.this).postDelayed((Runnable) tag3, m.aO(m.this));
                }
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
            if (aaVar == null) {
                return;
            }
            final com.taobao.tao.flexbox.layoutmanager.core.aa J = aaVar.J();
            if (m.ba(m.this) != null) {
                if (m.ba(m.this).isInIdle()) {
                    oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (oec.c(viewHolder.itemView)) {
                                c.a(c.this, J);
                            } else {
                                m.bc(m.this).add(J);
                            }
                        }
                    });
                    return;
                } else {
                    m.bc(m.this).add(J);
                    return;
                }
            }
            if (oeb.az()) {
                z = m.bd(m.this).o();
            }
            if (!z) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.m.c.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this, J);
                    }
                }
            });
        }

        private void c(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0336bd2", new Object[]{this, aaVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", Integer.valueOf(m.this.f()));
            hashMap.put("type", "item");
            m.this.sendMessage(130, aaVar, "onwillappear", null, hashMap, null);
        }

        private void d(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33be8993", new Object[]{this, aaVar});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", Integer.valueOf(m.this.f()));
            hashMap.put("type", "item");
            m.this.sendMessage(Component.MSG_FLAG_DISAPPEAR, aaVar, "onwilldisappear", null, hashMap, null);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
                return;
            }
            super.onViewDetachedFromWindow(viewHolder);
            viewHolder.itemView.setTag(R.id.layout_manager_cell_tag_detach_id, true);
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = (com.taobao.tao.flexbox.layoutmanager.core.aa) viewHolder.itemView.getTag(R.id.layout_manager_cell_tag_id);
            if (aaVar == null) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.core.aa J = aaVar.J();
            if (m.ba(m.this) != null) {
                if (m.bc(m.this).contains(J)) {
                    m.bc(m.this).remove(J);
                    return;
                } else {
                    d(J);
                    return;
                }
            }
            d(J);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.a
    public void onKeyBoardNeedDismiss(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f037a573", new Object[]{this, context});
        } else {
            oec.f(context);
        }
    }

    /* loaded from: classes8.dex */
    public static class b extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int A;
        public String C;
        public boolean E;
        public int F;
        public String G;
        public Drawable I;
        public boolean J;
        public boolean K;
        public float L;
        public boolean N;
        public int O;
        public int b;
        public int c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public int i;
        public String j;
        public String k;
        public boolean l;
        public int n;
        public String q;
        public String r;
        public boolean s;
        public String t;
        public boolean u;
        public int v;
        public int w;
        public int x;

        /* renamed from: a  reason: collision with root package name */
        public int f20158a = 1;
        public int P = Integer.MAX_VALUE;
        public int m = 1;
        public boolean o = true;
        public boolean p = false;
        public int y = 5000;
        public int z = 0;
        public boolean B = true;
        public boolean H = false;
        public boolean M = true;

        static {
            kge.a(1051532649);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            a(context, (Map) hashMap);
            this.i = ohd.a(h(), context, oec.a(hashMap.get("preLoadHeight"), 0));
            if (this.i <= 0) {
                this.i = ohd.a(h(), context, oec.a(hashMap.get("preload-height"), 0));
            }
            this.e = oec.a(hashMap.get("onscrollstatechanged"), (String) null);
            this.f = oec.a(hashMap.get("onbegindragging"), (String) null);
            this.g = oec.a(hashMap.get("onenddragging"), (String) null);
            this.h = oec.a(hashMap.get("onscroll"), (String) null);
            this.j = oec.a(hashMap.get("onrefresh"), (String) null);
            this.k = oec.a(hashMap.get("onloading"), (String) null);
            int a2 = ohd.a(h(), context, oec.a(hashMap.get("space"), 0));
            this.c = a2;
            this.b = a2;
            int a3 = oec.a(hashMap.get("row-space"), 0);
            if (a3 > 0) {
                this.b = ohd.a(h(), context, a3);
            }
            int a4 = oec.a(hashMap.get("column-space"), 0);
            if (a4 > 0) {
                this.c = ohd.a(h(), context, a4);
            }
            this.d = (String) hashMap.get("mode");
            this.l = oec.a(hashMap.get("staggered"), false);
            this.m = hashMap.containsKey("refresh-text-color") ? odx.a(context, 0, hashMap.get("refresh-text-color")) : 1;
            this.L = oec.b(hashMap.get("refresh-triggle-percent"), 0);
            this.p = oec.a(hashMap.get("enabled-drag"), false);
            this.q = oec.a(hashMap.get("ondrag"), (String) null);
            this.r = oec.a(hashMap.get("onselectchanged"), (String) null);
            this.s = oec.a(hashMap.get("enabled-drag-alpha"), false);
            this.o = oec.a(hashMap.get("clip-padding"), true);
            this.t = oec.a(hashMap.get("reload-animation"), (String) null);
            this.u = oec.a(hashMap.get("custom-page-enabled"), false);
            this.v = a(h(), context, hashMap.get("min-page-offset"));
            this.w = a(h(), context, hashMap.get("min-pageup-offset"));
            this.x = a(h(), context, hashMap.get("min-pagedown-offset"));
            this.y = oec.a(hashMap.get("min-page-speed"), 5000);
            this.z = a(h(), context, hashMap.get("cell-offset"));
            this.A = a(h(), context, hashMap.get("slide-distance"));
            this.n = a(h(), context, hashMap.get(ScrollViewComponent.c.MAX_REFRESH_DISTANCE));
            this.B = oec.a(hashMap.get("bounces"), true);
            this.C = oec.a(hashMap.get("keyboard-dismiss-mode"), (String) null);
            this.K = oec.a(hashMap.get("listPreload"), false);
            this.E = oec.a(hashMap.get("barrage"), false);
            this.F = oec.a(hashMap.get("speed-per-width"), 0);
            this.G = oec.a(hashMap.get("barrage-state"), (String) null);
            this.H = oec.a(hashMap.get("nested-slide"), false);
            this.J = oec.a(hashMap.get("ignore-item-animator"), false);
            this.M = oec.a(hashMap.get("scroll"), true);
            String a5 = oec.a(hashMap.get("placeholder"), (String) null);
            if (TextUtils.isEmpty(a5) || oeb.U() <= 0) {
                return;
            }
            try {
                int identifier = context.getResources().getIdentifier(a5, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName());
                if (identifier <= 0) {
                    return;
                }
                this.I = context.getResources().getDrawable(identifier);
            } catch (Throwable unused) {
            }
        }

        private void a(Context context, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
                return;
            }
            Object obj = map.get("columns");
            if (obj == null) {
                return;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.startsWith("auto")) {
                    this.N = true;
                    String[] split = str.split(" ");
                    if (str.contains("minsize")) {
                        if (split.length > 1) {
                            String[] split2 = split[1].split(":");
                            if (split2.length == 2) {
                                this.O = ohd.a(h(), context, split2[1]);
                            }
                        }
                        if (split.length <= 2) {
                            return;
                        }
                        this.P = oec.a((Object) split[2], Integer.MAX_VALUE);
                        return;
                    }
                    IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
                    if (!(context instanceof Activity)) {
                        context = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a();
                    }
                    int b = w.b((Activity) context);
                    if (split.length == 1) {
                        this.f20158a = new int[]{2, 2, 4, 5, 5}[b];
                        return;
                    } else if (split.length != 6) {
                        return;
                    } else {
                        this.f20158a = oec.a((Object) split[b + 1], 1);
                        return;
                    }
                }
            }
            this.N = false;
            this.O = 0;
            this.f20158a = oec.a(obj, 1);
        }
    }
}
