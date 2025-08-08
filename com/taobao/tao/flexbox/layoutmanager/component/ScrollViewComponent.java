package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaNode;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.c;
import com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.ComponentInfoDef;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.uikit.view.TNodeRefreshHeader;
import com.taobao.tao.flexbox.layoutmanager.view.AbsTNodeScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableHorizontalScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.ObservableScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeNestScrollView;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.view.swipeRefresh.TNodeTBSwipeRefreshLayout;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogh;
import tb.ogl;
import tb.ogu;
import tb.ohd;

/* loaded from: classes8.dex */
public class ScrollViewComponent extends Component<View, c> implements com.taobao.tao.flexbox.layoutmanager.core.s, com.taobao.tao.flexbox.layoutmanager.core.z, ScrollChangeListener, com.taobao.tao.flexbox.layoutmanager.module.element.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_ITEM_ADD = 1;
    public static final int FLAG_ITEM_CHANGED = 4;
    public static final int FLAG_ITEM_MOVE = 8;
    public static final int FLAG_ITEM_REMOVED = 2;
    private static final int MSG_RESET_LOADMORE = 1;
    private static final int MSG_RESET_REFRESH = 0;
    private HashMap<com.taobao.tao.flexbox.layoutmanager.core.aa, Boolean> childrenStateMap;
    private com.taobao.tao.flexbox.layoutmanager.core.m contentFlexBoxNode;
    private com.taobao.tao.flexbox.layoutmanager.core.r contentMeasureResult;
    private YogaNode contentNode;
    private ViewGroup contentView;
    private AbsTNodeScrollView nestedScrollView;
    private List<ScrollChangeListener> pendingListeners;
    private Map pendingRefreshArgs;
    private TBSwipeRefreshLayout refreshLayout;
    private Rect scrollBounds;
    private Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.taobao.tao.flexbox.layoutmanager.event.b b2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (ScrollViewComponent.access$000(ScrollViewComponent.this) == null) {
            } else {
                int i = message.what;
                if ((i != 0 && i != 1) || (b2 = ScrollViewComponent.access$100(ScrollViewComponent.this).b((String) message.obj)) == null) {
                    return;
                }
                b2.a(null);
            }
        }
    };
    private a exposureRunnable = new a();
    private b event = new b();
    private boolean onLoading = false;
    private boolean shouldSendRefreshStateIdleMsg = false;
    private c.a scroll = new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.9
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.c
        public void a(com.taobao.tao.flexbox.layoutmanager.core.f fVar, Object obj, ogl oglVar, aa.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b59bada", new Object[]{this, fVar, obj, oglVar, dVar});
                return;
            }
            Boolean bool = (Boolean) ScrollViewComponent.access$1500(ScrollViewComponent.this).e(Constants.Name.SCROLLABLE);
            if (bool == null || !(ScrollViewComponent.access$1600(ScrollViewComponent.this) instanceof TNodeNestScrollView)) {
                return;
            }
            ((TNodeNestScrollView) ScrollViewComponent.access$1600(ScrollViewComponent.this)).setScrollable(bool.booleanValue());
        }
    };
    private String preMaxScrollOffsetViewID = "";
    private int maxScrollOffsetFromView = 0;
    private com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.a maxScrollOffsetFromViewObserver = new com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b.a
        public void a(Component component, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6de8774", new Object[]{this, component, num});
                return;
            }
            ScrollViewComponent.access$1702(ScrollViewComponent.this, num.intValue());
            ScrollViewComponent.access$1800(ScrollViewComponent.this);
        }
    };
    private int currMaxScrollOffset = 0;
    private com.taobao.tao.flexbox.layoutmanager.core.aa currFillPortNode = null;
    private String currFillPortOffsetViewId = "";
    private int currFillPortOffset = 0;
    private int currFillPortHeight = 0;
    private com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.a fillPortOffsetFromViewObserver = new com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.11
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.tao.flexbox.layoutmanager.databinding.componentbind.componentinfo.b.a
        public void a(Component component, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6de8774", new Object[]{this, component, num});
            } else if (ScrollViewComponent.access$1900(ScrollViewComponent.this) == num.intValue()) {
            } else {
                ScrollViewComponent.access$1902(ScrollViewComponent.this, num.intValue());
                ScrollViewComponent.access$2000(ScrollViewComponent.this);
            }
        }
    };

    static {
        kge.a(-475708112);
        kge.a(771458270);
        kge.a(-1420926486);
        kge.a(-1353647536);
        kge.a(-2089696438);
    }

    public static /* synthetic */ Object ipc$super(ScrollViewComponent scrollViewComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2141646649:
                super.applyAttrForView((ScrollViewComponent) ((View) objArr[0]), (View) ((ogl) objArr[1]), (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1926757943:
                super.onLayoutComplete();
                return null;
            case -1664931440:
                super.handleChildAdded((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -1439184512:
                super.onRealLayoutChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Boolean) objArr[4]).booleanValue());
                return null;
            case -670057321:
                super.handleChildDeleted((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[2]);
                return null;
            case -486998538:
                super.handleChildMoved((com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (com.taobao.tao.flexbox.layoutmanager.core.aa) objArr[3]);
                return null;
            case 505817802:
                return super.getAttributeHandler((String) objArr[0]);
            case 747088936:
                return new Boolean(super.isTransitionChildComponent((Component) objArr[0]));
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1964402429:
                super.onRenderCompleted();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onNestScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a7e84b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$000(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6ffb7d88", new Object[]{scrollViewComponent}) : scrollViewComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$100(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("cf6b5867", new Object[]{scrollViewComponent}) : scrollViewComponent.node;
    }

    public static /* synthetic */ Handler access$1000(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("f92ce901", new Object[]{scrollViewComponent}) : scrollViewComponent.handler;
    }

    public static /* synthetic */ boolean access$1102(ScrollViewComponent scrollViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb9b570", new Object[]{scrollViewComponent, new Boolean(z)})).booleanValue();
        }
        scrollViewComponent.onLoading = z;
        return z;
    }

    public static /* synthetic */ TBSwipeRefreshLayout access$1200(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("1c9529aa", new Object[]{scrollViewComponent}) : scrollViewComponent.refreshLayout;
    }

    public static /* synthetic */ void access$1300(ScrollViewComponent scrollViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc061dec", new Object[]{scrollViewComponent, new Boolean(z)});
        } else {
            scrollViewComponent.setupPullUpStatus(z);
        }
    }

    public static /* synthetic */ ogl access$1400(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("16dc7ea9", new Object[]{scrollViewComponent}) : scrollViewComponent.viewParams;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$1500(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("9258ee94", new Object[]{scrollViewComponent}) : scrollViewComponent.node;
    }

    public static /* synthetic */ AbsTNodeScrollView access$1600(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsTNodeScrollView) ipChange.ipc$dispatch("1ce70ec3", new Object[]{scrollViewComponent}) : scrollViewComponent.nestedScrollView;
    }

    public static /* synthetic */ int access$1702(ScrollViewComponent scrollViewComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("394485c8", new Object[]{scrollViewComponent, new Integer(i)})).intValue();
        }
        scrollViewComponent.maxScrollOffsetFromView = i;
        return i;
    }

    public static /* synthetic */ void access$1800(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fba7ad", new Object[]{scrollViewComponent});
        } else {
            scrollViewComponent.checkMaxScrollOffsetChange();
        }
    }

    public static /* synthetic */ int access$1900(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca9d261", new Object[]{scrollViewComponent})).intValue() : scrollViewComponent.currFillPortOffset;
    }

    public static /* synthetic */ int access$1902(ScrollViewComponent scrollViewComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd72e086", new Object[]{scrollViewComponent, new Integer(i)})).intValue();
        }
        scrollViewComponent.currFillPortOffset = i;
        return i;
    }

    public static /* synthetic */ void access$200(ScrollViewComponent scrollViewComponent, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f4db0d", new Object[]{scrollViewComponent, map});
        } else {
            scrollViewComponent.refreshScrollViewExposure(map);
        }
    }

    public static /* synthetic */ void access$2000(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da17f04", new Object[]{scrollViewComponent});
        } else {
            scrollViewComponent.tryRelayoutFillPortNode();
        }
    }

    public static /* synthetic */ View access$400(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6c1bc4bc", new Object[]{scrollViewComponent}) : scrollViewComponent.view;
    }

    public static /* synthetic */ View access$500(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("51c7213d", new Object[]{scrollViewComponent}) : scrollViewComponent.view;
    }

    public static /* synthetic */ boolean access$600(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62b78c80", new Object[]{scrollViewComponent})).booleanValue() : scrollViewComponent.shouldSendRefreshStateIdleMsg;
    }

    public static /* synthetic */ boolean access$602(ScrollViewComponent scrollViewComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("291ca81a", new Object[]{scrollViewComponent, new Boolean(z)})).booleanValue();
        }
        scrollViewComponent.shouldSendRefreshStateIdleMsg = z;
        return z;
    }

    public static /* synthetic */ void access$700(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9665b73d", new Object[]{scrollViewComponent});
        } else {
            scrollViewComponent.sendRefreshStateIdleMsg();
        }
    }

    public static /* synthetic */ void access$800(ScrollViewComponent scrollViewComponent, TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58c3ba6", new Object[]{scrollViewComponent, refreshState, refreshState2});
        } else {
            scrollViewComponent.senRefreshStateMsg(refreshState, refreshState2);
        }
    }

    public static /* synthetic */ Map access$900(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8ba364b4", new Object[]{scrollViewComponent}) : scrollViewComponent.pendingRefreshArgs;
    }

    public static /* synthetic */ Map access$902(ScrollViewComponent scrollViewComponent, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a40a9d9", new Object[]{scrollViewComponent, map});
        }
        scrollViewComponent.pendingRefreshArgs = map;
        return map;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onChildLayoutChanged(Component component, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bb51d", new Object[]{this, component, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (z) {
        } else {
            boolean z3 = i <= 0 || i2 <= 0;
            if (i3 > 0 && i4 > 0) {
                z2 = false;
            }
            if (z3 == z2 || !z3) {
                return;
            }
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ScrollViewComponent.this.trackScrollViewChildrenExposure(false, null);
                    }
                }
            });
        }
    }

    /* loaded from: classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map f20046a;

        static {
            kge.a(-444663208);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScrollViewComponent.access$200(ScrollViewComponent.this, this.f20046a);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, com.taobao.tao.flexbox.layoutmanager.core.b
    public boolean sendViewAppearForAdd(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfadc3ad", new Object[]{this, aaVar})).booleanValue();
        }
        if (getNode().x() == null || aaVar.x() == null) {
            return false;
        }
        Rect rect = new Rect();
        getNode().x().getHitRect(rect);
        return aaVar.x().getLocalVisibleRect(rect);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f20047a = 0;
        public int b = -1;
        public int c = 0;
        public int d = -1;
        public int e = 0;
        public Set f = new HashSet();

        static {
            kge.a(2015826217);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f20047a = 0;
            this.b = -1;
            this.c = 0;
            this.d = -1;
            this.e = 0;
            this.f.clear();
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f20047a != 0;
        }
    }

    public void updateScrollChangedEvent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f1fe83", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.event.f20047a |= i;
        if ((i & 1) != 0) {
            if (this.event.b == -1) {
                this.event.b = i2;
            }
            this.event.c++;
        } else if ((i & 2) == 0) {
            if ((i & 4) == 0) {
                return;
            }
            this.event.f.add(Integer.valueOf(i2));
        } else {
            if (this.event.d == -1) {
                this.event.d = i2;
            }
            this.event.e++;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutTreeBuilt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4163a9e", new Object[]{this});
            return;
        }
        if (this.contentFlexBoxNode == null) {
            this.contentFlexBoxNode = com.taobao.tao.flexbox.layoutmanager.core.m.a();
        }
        this.contentFlexBoxNode.a(((c) this.viewParams).av);
        this.contentFlexBoxNode.c(((c) this.viewParams).ar);
        this.contentFlexBoxNode.a(YogaEdge.LEFT, ((c) this.viewParams).ag);
        this.contentFlexBoxNode.a(YogaEdge.TOP, ((c) this.viewParams).ai);
        this.contentFlexBoxNode.a(YogaEdge.RIGHT, ((c) this.viewParams).ah);
        this.contentFlexBoxNode.a(YogaEdge.BOTTOM, ((c) this.viewParams).aj);
        getFlexBoxNode().a(YogaEdge.LEFT, 0.0f);
        getFlexBoxNode().a(YogaEdge.TOP, 0.0f);
        getFlexBoxNode().a(YogaEdge.RIGHT, 0.0f);
        getFlexBoxNode().a(YogaEdge.BOTTOM, 0.0f);
        List<com.taobao.tao.flexbox.layoutmanager.core.m> p = getFlexBoxNode().p();
        for (int i = 0; i < p.size(); i++) {
            p.get(i).a(this.contentFlexBoxNode, i);
        }
        this.contentFlexBoxNode.a(getFlexBoxNode(), 0);
        dealFillPort();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2801c9", new Object[]{this});
            return;
        }
        super.onLayoutComplete();
        if (this.contentMeasureResult == null) {
            this.contentMeasureResult = new com.taobao.tao.flexbox.layoutmanager.core.r();
        }
        float h = this.contentFlexBoxNode.h();
        float j = this.contentFlexBoxNode.j() + h;
        float i = this.contentFlexBoxNode.i();
        float k = this.contentFlexBoxNode.k() + i;
        if (this.node.H() != null) {
            for (int i2 = 0; i2 < this.node.H().size(); i2++) {
                com.taobao.tao.flexbox.layoutmanager.core.r G = this.node.b(i2).G();
                if (G != null) {
                    h = Math.min(h, G.c);
                    j = Math.max(j, G.c + G.f20361a);
                    i = Math.min(i, G.d);
                    k = Math.max(k, G.d + G.b);
                }
            }
        }
        this.contentMeasureResult.a((int) (j - h), (int) (k - i), (int) h, (int) i);
        ViewGroup viewGroup = this.contentView;
        if (viewGroup != null) {
            ((FlatViewGroup) viewGroup).setMeasure(this.contentMeasureResult);
        }
        if (getFlexBoxNode().m() != null) {
            return;
        }
        this.contentFlexBoxNode.d();
        this.contentFlexBoxNode = null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void addOrUpdateView(boolean z, View view, com.taobao.tao.flexbox.layoutmanager.core.r rVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1854fc7", new Object[]{this, new Boolean(z), view, rVar, aaVar});
        } else if (z) {
            ((FlatViewGroup) this.contentView).addView(view, rVar.c, rVar.d, rVar.f20361a, rVar.b, aaVar);
        } else {
            ((FlatViewGroup) this.contentView).updateNewPositionForView(view, rVar.c, rVar.d, rVar.f20361a, rVar.b);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isTransitionChildComponent(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c87ac28", new Object[]{this, component})).booleanValue();
        }
        View view = component.getView();
        if (view != null && view.getParent() == this.contentView) {
            return true;
        }
        return super.isTransitionChildComponent(component);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void sortChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a97c4", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.contentView;
        if (viewGroup == null) {
            return;
        }
        ((FlatViewGroup) viewGroup).sortChildren(this.node);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        View view;
        ObservableHorizontalScrollView observableHorizontalScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.contentView = ogu.e(context);
        ((FlatViewGroup) this.contentView).setMeasure(this.contentMeasureResult);
        if (((c) this.viewParams).av == YogaFlexDirection.ROW) {
            ObservableHorizontalScrollView c2 = ogu.c(context);
            ObservableHorizontalScrollView observableHorizontalScrollView2 = c2;
            observableHorizontalScrollView2.setScrollViewComponent(this);
            if (((c) this.viewParams).v) {
                observableHorizontalScrollView2.enableEdgeEffect();
            } else {
                c2.setOverScrollMode(2);
            }
            observableHorizontalScrollView2.setKeyBoardDismissMode(((c) this.viewParams).w);
            observableHorizontalScrollView2.setKeyBoardDismissListener(this);
            observableHorizontalScrollView2.addScrollChangedListener(this);
            view = c2;
            observableHorizontalScrollView = c2;
        } else if (!StringUtils.isEmpty(((c) this.viewParams).s) || !StringUtils.isEmpty(((c) this.viewParams).t) || this.node.d(c.MAX_SCROLL_OFFSET)) {
            this.refreshLayout = new TNodeTBSwipeRefreshLayout(context);
            try {
                if (((c) this.viewParams).u > 0) {
                    this.refreshLayout.setMaxPullDistance(((c) this.viewParams).u);
                }
            } catch (Throwable unused) {
            }
            this.refreshLayout.setHeaderView(new TNodeRefreshHeader(context, ((c) this.viewParams).x, ((c) this.viewParams).y));
            AbsTNodeScrollView createScrollView = createScrollView(context);
            this.nestedScrollView = createScrollView;
            if (((c) this.viewParams).v) {
                createScrollView.enableEdgeEffect();
            }
            AbsTNodeScrollView absTNodeScrollView = createScrollView;
            absTNodeScrollView.setKeyBoardDismissMode(((c) this.viewParams).w);
            absTNodeScrollView.setKeyBoardDismissListener(this);
            absTNodeScrollView.addScrollChangedListener(this);
            absTNodeScrollView.setScrollComponent(this);
            this.refreshLayout.addView(createScrollView);
            if (!StringUtils.isEmpty(((c) this.viewParams).s)) {
                this.refreshLayout.enablePullRefresh(true);
                this.refreshLayout.getRefresHeader().setBackgroundColor(0);
                this.refreshLayout.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
                    public void onRefresh() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
                    public void onPullDistance(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                        } else if (ScrollViewComponent.access$400(ScrollViewComponent.this) == null) {
                        } else {
                            if (oeb.l()) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("totalY", Integer.valueOf(-i));
                                hashMap.put("offsetY", Integer.valueOf(-ohd.b(ScrollViewComponent.this.getNode(), ScrollViewComponent.access$500(ScrollViewComponent.this).getContext(), i)));
                                ScrollViewComponent scrollViewComponent = ScrollViewComponent.this;
                                scrollViewComponent.sendMessage(scrollViewComponent.getNode(), "onscroll", null, hashMap, null);
                            }
                            if (!oeb.J() || !ScrollViewComponent.access$600(ScrollViewComponent.this) || i != 0) {
                                return;
                            }
                            ScrollViewComponent.access$602(ScrollViewComponent.this, false);
                            ScrollViewComponent.access$700(ScrollViewComponent.this);
                        }
                    }

                    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
                    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                            return;
                        }
                        ScrollViewComponent.access$800(ScrollViewComponent.this, refreshState, refreshState2);
                        if (refreshState2 == TBRefreshHeader.RefreshState.REFRESHING) {
                            ScrollViewComponent scrollViewComponent = ScrollViewComponent.this;
                            scrollViewComponent.pullRefresh(ScrollViewComponent.access$900(scrollViewComponent));
                            ScrollViewComponent.access$902(ScrollViewComponent.this, null);
                        } else if (refreshState == refreshState2 || refreshState2 != TBRefreshHeader.RefreshState.NONE) {
                        } else {
                            ScrollViewComponent.access$602(ScrollViewComponent.this, true);
                        }
                    }
                });
            }
            if (!StringUtils.isEmpty(((c) this.viewParams).t)) {
                this.refreshLayout.enableLoadMore(true);
                this.refreshLayout.setOnPushLoadMoreListener(new TBSwipeRefreshLayout.OnPushLoadMoreListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
                    public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
                        }
                    }

                    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
                    public void onPushDistance(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i)});
                        }
                    }

                    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
                    public void onLoadMore() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b4a87be1", new Object[]{this});
                        } else {
                            ScrollViewComponent.this.loadMore();
                        }
                    }
                });
            }
            view = this.refreshLayout;
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ScrollViewComponent.this.trackScrollViewChildrenExposure(false, null);
                    }
                }
            });
            observableHorizontalScrollView = createScrollView;
        } else {
            view = new ObservableScrollView(context);
            if (((c) this.viewParams).v) {
                ((ObservableScrollView) view).enableEdgeEffect();
            }
            ObservableScrollView observableScrollView = (ObservableScrollView) view;
            observableScrollView.setKeyBoardDismissMode(((c) this.viewParams).w);
            observableScrollView.setKeyBoardDismissListener(this);
            observableScrollView.addScrollChangedListener(this);
            observableHorizontalScrollView = view;
        }
        observableHorizontalScrollView.setVerticalScrollBarEnabled(((c) this.viewParams).o);
        observableHorizontalScrollView.setHorizontalScrollBarEnabled(((c) this.viewParams).p);
        observableHorizontalScrollView.addView(this.contentView);
        this.childrenStateMap = new HashMap<>();
        addPendingScrolledListeners(view);
        return view;
    }

    private void senRefreshStateMsg(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2699b7de", new Object[]{this, refreshState, refreshState2});
            return;
        }
        try {
            if (!oeb.G()) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", refreshState2);
            hashMap.put("oldState", refreshState);
            sendMsgToChildListViewResolver("onrefreshchangestate", hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void sendRefreshStateIdleMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99020416", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", TBRefreshHeader.RefreshState.NONE);
        sendMsgToChildListViewResolver("onpagerefreshstatechanged", hashMap);
    }

    private void sendMsgToChildListViewResolver(String str, HashMap hashMap) {
        com.taobao.tao.flexbox.layoutmanager.core.aa b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4beeab1", new Object[]{this, str, hashMap});
            return;
        }
        int size = this.node.d.size();
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = null;
        if (size == 1) {
            aaVar = this.node.d.get(0);
        } else if (size > 1) {
            aaVar = this.node;
        }
        if (aaVar == null) {
            return;
        }
        for (int i = 0; i < aaVar.d.size(); i++) {
            com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2 = aaVar.d.get(i);
            if (aaVar2.x() != null && containListViewComponent(aaVar2) && (b2 = aaVar2.b(m.class)) != null) {
                postMessage(b2, str, null, hashMap, null);
            }
        }
    }

    public void loadMore() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f65f062", new Object[]{this});
        } else if (this.onLoading || (str = (String) this.node.e("onloading")) == null) {
        } else {
            this.onLoading = true;
            sendMessage(this.node, "onloading", str, null, new com.taobao.tao.flexbox.layoutmanager.event.b() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.event.b
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    ScrollViewComponent.access$1000(ScrollViewComponent.this).removeMessages(1);
                    ScrollViewComponent.access$1102(ScrollViewComponent.this, false);
                    ScrollViewComponent.access$1200(ScrollViewComponent.this).setLoadMore(false);
                    ScrollViewComponent.access$1300(ScrollViewComponent.this, false);
                }
            });
            this.handler.removeMessages(1);
            if (str.startsWith("$://")) {
                str = str.substring(4);
            }
            this.handler.sendMessageDelayed(Message.obtain(this.handler, 1, str), 5000L);
        }
    }

    private boolean[] checkHasMoreStatus() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("68a0a735", new Object[]{this});
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

    private void setupPullUpStatus(boolean z) {
        TBSwipeRefreshLayout tBSwipeRefreshLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9403599e", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean[] checkHasMoreStatus = checkHasMoreStatus();
        if (z) {
            if (this.node.D() == null || !checkHasMoreStatus[0] || (tBSwipeRefreshLayout = this.refreshLayout) == null) {
                return;
            }
            tBSwipeRefreshLayout.enableLoadMore(checkHasMoreStatus[1]);
            return;
        }
        TBSwipeRefreshLayout tBSwipeRefreshLayout2 = this.refreshLayout;
        if (tBSwipeRefreshLayout2 == null) {
            return;
        }
        tBSwipeRefreshLayout2.enableLoadMore(checkHasMoreStatus[1]);
    }

    public void pullRefresh(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff8b788", new Object[]{this, map});
            return;
        }
        ogh.a("scrollView startPullRefresh");
        String str = (String) this.node.e("onrefresh");
        if (str != null) {
            sendMessage(this.node, "onrefresh", str, map, new com.taobao.tao.flexbox.layoutmanager.event.b() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.event.b
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    ogh.a("scrollView pullrefresh success");
                    ScrollViewComponent.access$1000(ScrollViewComponent.this).removeMessages(0);
                    if (((c) ScrollViewComponent.access$1400(ScrollViewComponent.this)).z) {
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.8.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ScrollViewComponent.access$1200(ScrollViewComponent.this).setRefreshing(false);
                                }
                            }
                        }, 150L);
                    } else {
                        ScrollViewComponent.access$1200(ScrollViewComponent.this).setRefreshing(false);
                    }
                    ogh.b();
                }
            });
            this.handler.removeMessages(0);
            if (str.startsWith("$://")) {
                str = str.substring(4);
            }
            this.handler.sendMessageDelayed(Message.obtain(this.handler, 0, str), (map == null || !map.containsKey("fakeRefresh")) ? 5000L : 500L);
        }
        ogh.b();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public com.taobao.tao.flexbox.layoutmanager.core.c getAttributeHandler(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.c) ipChange.ipc$dispatch("1e262aca", new Object[]{this, str});
        }
        if (oeb.a("optScrollable", true) && StringUtils.equals(str, Constants.Name.SCROLLABLE)) {
            return this.scroll;
        }
        return super.getAttributeHandler(str);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void applyAttrForView(View view, c cVar, Map map, boolean z) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37b608b", new Object[]{this, view, cVar, map, new Boolean(z)});
            return;
        }
        dealMaxScrollOffsetView(cVar);
        checkMaxScrollOffsetChange();
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.refreshLayout;
        if (tBSwipeRefreshLayout != null && (tBSwipeRefreshLayout.getRefresHeader() instanceof TNodeRefreshHeader) && ((c) this.viewParams).y != 1) {
            ((TNodeRefreshHeader) this.refreshLayout.getRefresHeader()).setRefreshColor(((c) this.viewParams).y);
        }
        if (map != null && (bool = (Boolean) map.get(Constants.Name.SCROLLABLE)) != null) {
            AbsTNodeScrollView absTNodeScrollView = this.nestedScrollView;
            if (absTNodeScrollView instanceof TNodeNestScrollView) {
                ((TNodeNestScrollView) absTNodeScrollView).setScrollable(bool.booleanValue());
            }
        }
        super.applyAttrForView((ScrollViewComponent) view, (View) cVar, map, z);
        if (this.event.b()) {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ScrollViewComponent.this.trackScrollViewChildrenExposure(false, null);
                    }
                }
            });
        }
        this.event.a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildAdded(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc32990", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        super.handleChildAdded(aaVar, i, aaVar2);
        updateScrollChangedEvent(1, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildDeleted(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80fbc97", new Object[]{this, aaVar, new Integer(i), aaVar2});
            return;
        }
        super.handleChildDeleted(aaVar, i, aaVar2);
        updateScrollChangedEvent(2, i);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void handleChildMoved(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, int i, int i2, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8fdf6", new Object[]{this, aaVar, new Integer(i), new Integer(i2), aaVar2});
            return;
        }
        super.handleChildMoved(aaVar, i, i2, aaVar2);
        updateScrollChangedEvent(8, i);
    }

    private LinearLayout.LayoutParams createChildLayoutParams(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        com.taobao.tao.flexbox.layoutmanager.core.r G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("1b50c94c", new Object[]{this, aaVar});
        }
        if (aaVar == null || (G = aaVar.G()) == null) {
            return null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(G.f20361a, G.b);
        if (aaVar.I() != null) {
            ogl viewParams = aaVar.I().getViewParams();
            layoutParams.leftMargin = viewParams.ak;
            layoutParams.rightMargin = viewParams.al;
            layoutParams.topMargin = viewParams.am;
            layoutParams.bottomMargin = viewParams.an;
        }
        return layoutParams;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9628353", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("totalX", Integer.valueOf(i));
        hashMap.put("totalY", Integer.valueOf(i2));
        hashMap.put("offsetX", Integer.valueOf(ohd.b(getNode(), this.view.getContext(), i)));
        hashMap.put("offsetY", Integer.valueOf(ohd.b(getNode(), this.view.getContext(), i2)));
        int realMaxScrollOffset = getRealMaxScrollOffset();
        hashMap.put("maxScrollOffsetPixel", Integer.valueOf(realMaxScrollOffset));
        hashMap.put("maxScrollOffset", Integer.valueOf(ohd.b(getNode(), this.view.getContext(), realMaxScrollOffset)));
        sendMessage(getNode(), "onscroll", null, hashMap, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener
    public void onScrollStateChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf93876", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", Integer.valueOf(i));
        hashMap.put("totalX", Integer.valueOf(this.view.getScrollX()));
        hashMap.put("totalY", Integer.valueOf(this.view.getScrollY()));
        hashMap.put("offsetX", Integer.valueOf(ohd.b(getNode(), this.view.getContext(), this.view.getScrollX())));
        hashMap.put("offsetY", Integer.valueOf(ohd.b(getNode(), this.view.getContext(), this.view.getScrollY())));
        int realMaxScrollOffset = getRealMaxScrollOffset();
        hashMap.put("maxScrollOffset", Integer.valueOf(ohd.b(getNode(), this.view.getContext(), realMaxScrollOffset)));
        hashMap.put("maxScrollOffsetPixel", Integer.valueOf(realMaxScrollOffset));
        sendMessage(getNode(), "onscrollstatechanged", null, hashMap, null);
        if (i != 0) {
            return;
        }
        trackScrollViewChildrenExposure(false, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollTo(int i, int i2, boolean z) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0b0965", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.view instanceof ScrollView) {
            if (i2 == 0) {
                return;
            }
            if (z) {
                ((ScrollView) this.view).smoothScrollTo(0, i2);
            } else {
                ((ScrollView) this.view).scrollTo(0, i2);
            }
        } else if (this.view instanceof HorizontalScrollView) {
            if (i == 0) {
                return;
            }
            if (z) {
                ((HorizontalScrollView) this.view).smoothScrollTo(i, 0);
            } else {
                ((HorizontalScrollView) this.view).scrollTo(i, 0);
            }
        } else if (!(this.view instanceof TBSwipeRefreshLayout) || (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view)) == null) {
        } else {
            if (z) {
                findNestScrollView.smoothScrollTo(0, i2);
            } else {
                findNestScrollView.scrollTo(0, i2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPosition(int i, boolean z, int i2) {
        AbsTNodeScrollView findNestScrollView;
        int height;
        int width;
        int height2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d225a7a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = null;
        com.taobao.tao.flexbox.layoutmanager.core.aa parentNode = getParentNode();
        if (parentNode != null && i >= 0 && i < parentNode.d.size()) {
            aaVar = parentNode.d.get(i);
        }
        if (aaVar == null || aaVar.x() == null) {
            return;
        }
        if (this.view instanceof ScrollView) {
            int top = aaVar.x().getTop();
            if (i2 == 1) {
                height2 = aaVar.x().getHeight() / 2;
            } else {
                if (i2 == 2) {
                    height2 = aaVar.x().getHeight();
                }
                this.view.scrollTo(0, top);
            }
            top += height2;
            this.view.scrollTo(0, top);
        } else if (this.view instanceof HorizontalScrollView) {
            int left = aaVar.x().getLeft();
            if (i2 == 1) {
                width = aaVar.x().getWidth() / 2;
            } else {
                if (i2 == 2) {
                    width = aaVar.x().getWidth();
                }
                this.view.scrollTo(left, 0);
            }
            left += width;
            this.view.scrollTo(left, 0);
        } else if (!(this.view instanceof TBSwipeRefreshLayout) || (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view)) == null) {
        } else {
            int top2 = aaVar.x().getTop();
            if (i2 == 1) {
                height = aaVar.x().getHeight() / 2;
            } else {
                if (i2 == 2) {
                    height = aaVar.x().getHeight();
                }
                findNestScrollView.scrollTo(0, top2);
            }
            top2 += height;
            findNestScrollView.scrollTo(0, top2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollToPositionWithNumber(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb0b758", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else {
            scrollToPosition(i, z, i2);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public void scrollBy(int i, int i2, boolean z) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f06fc09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.view instanceof ScrollView) {
            if (i2 == 0) {
                return;
            }
            if (z) {
                ((ScrollView) this.view).smoothScrollBy(0, i2);
            } else {
                ((ScrollView) this.view).scrollBy(0, i2);
            }
        } else if (this.view instanceof HorizontalScrollView) {
            if (i == 0) {
                return;
            }
            if (z) {
                ((HorizontalScrollView) this.view).smoothScrollBy(i, 0);
            } else {
                ((HorizontalScrollView) this.view).scrollBy(i, 0);
            }
        } else if (!(this.view instanceof TBSwipeRefreshLayout) || (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view)) == null) {
        } else {
            if (z) {
                findNestScrollView.smoothScrollBy(0, i2);
            } else {
                findNestScrollView.scrollBy(0, i2);
            }
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.z
    public int getScrollCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce801786", new Object[]{this})).intValue();
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa parentNode = getParentNode();
        if (parentNode == null) {
            return 0;
        }
        return parentNode.R();
    }

    public void addScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23b6572", new Object[]{this, scrollChangeListener});
        } else if (this.view == 0) {
            if (this.pendingListeners == null) {
                this.pendingListeners = new ArrayList();
            }
            this.pendingListeners.add(scrollChangeListener);
        } else {
            addScrollChangedListenerInternal(this.view, scrollChangeListener);
        }
    }

    private void addPendingScrolledListeners(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5281f7ee", new Object[]{this, view});
            return;
        }
        List<ScrollChangeListener> list = this.pendingListeners;
        if (list == null) {
            return;
        }
        for (ScrollChangeListener scrollChangeListener : list) {
            addScrollChangedListenerInternal(view, scrollChangeListener);
        }
        this.pendingListeners.clear();
    }

    private void addScrollChangedListenerInternal(View view, ScrollChangeListener scrollChangeListener) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250e2ea5", new Object[]{this, view, scrollChangeListener});
        } else if (view instanceof ObservableScrollView) {
            ((ObservableScrollView) view).addScrollChangedListener(scrollChangeListener);
        } else if (view instanceof ObservableHorizontalScrollView) {
            ((ObservableHorizontalScrollView) view).addScrollChangedListener(scrollChangeListener);
        } else if (!(view instanceof TBSwipeRefreshLayout) || (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) view)) == null) {
        } else {
            findNestScrollView.addScrollChangedListener(scrollChangeListener);
        }
    }

    public void removeScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d901aaf", new Object[]{this, scrollChangeListener});
            return;
        }
        List<ScrollChangeListener> list = this.pendingListeners;
        if (list != null) {
            list.remove(scrollChangeListener);
        }
        if (this.view instanceof ObservableScrollView) {
            ((ObservableScrollView) this.view).removeScrollChangedListener(scrollChangeListener);
        } else if (this.view instanceof ObservableHorizontalScrollView) {
            ((ObservableHorizontalScrollView) this.view).removeScrollChangedListener(scrollChangeListener);
        } else if (!(this.view instanceof TBSwipeRefreshLayout) || (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view)) == null) {
        } else {
            findNestScrollView.removeScrollChangedListener(scrollChangeListener);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRenderCompleted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751666fd", new Object[]{this});
            return;
        }
        super.onRenderCompleted();
        if (((c) this.viewParams).ba) {
            return;
        }
        View scrollView = getScrollView();
        if (scrollView instanceof ViewGroup) {
            ((ViewGroup) scrollView).setClipChildren(false);
        }
        ViewGroup viewGroup = this.contentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setClipChildren(false);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.view instanceof ObservableScrollView) {
            ((ObservableScrollView) this.view).removeScrollChangedListener(this);
        } else if (this.view instanceof ObservableHorizontalScrollView) {
            if (!oeb.ci()) {
                ((ObservableHorizontalScrollView) this.view).removeScrollChangedListener(this);
                ((ObservableHorizontalScrollView) this.view).setScrollViewComponent(null);
            }
            ogu.a((ObservableHorizontalScrollView) this.view);
        } else if ((this.view instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view)) != null) {
            findNestScrollView.removeScrollChangedListener(this);
        }
        ViewGroup viewGroup = this.contentView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            ogu.a((FlatViewGroup) this.contentView);
            this.contentView = null;
        }
        YogaNode yogaNode = this.contentNode;
        if (yogaNode != null) {
            ogu.a(yogaNode);
            this.contentNode = null;
        }
        this.handler.removeCallbacksAndMessages(null);
        List<ScrollChangeListener> list = this.pendingListeners;
        if (list != null) {
            list.clear();
        }
        this.nestedScrollView = null;
        super.detach(z);
    }

    private boolean isChildVisible(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c3100b", new Object[]{this, view, view2})).booleanValue();
        }
        int width = view.getWidth();
        int left = view2.getLeft() - view.getScrollX();
        return (left >= 0 && left < width) || (left < 0 && view2.getWidth() + left > 0);
    }

    public void trackScrollViewChildrenExposure(boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1caea3b", new Object[]{this, new Boolean(z), map});
        } else if (this.view != 0) {
            if (this.scrollBounds == null) {
                this.scrollBounds = new Rect();
            }
            this.view.getHitRect(this.scrollBounds);
            com.taobao.tao.flexbox.layoutmanager.core.aa parentNode = getParentNode();
            if (parentNode == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("state", Integer.valueOf(getScrollState()));
            if (map != null && map.containsKey("type")) {
                hashMap.put("type", map.get("type"));
            } else {
                hashMap.put("type", "item");
            }
            for (int i = 0; i < parentNode.R(); i++) {
                com.taobao.tao.flexbox.layoutmanager.core.aa b2 = parentNode.b(i);
                if (b2.x() != null) {
                    boolean localVisibleRect = b2.x().getLocalVisibleRect(this.scrollBounds);
                    if (this.refreshLayout != null && localVisibleRect && this.scrollBounds.height() <= 1) {
                        localVisibleRect = false;
                    }
                    if (!localVisibleRect && ((c) this.viewParams).av == YogaFlexDirection.ROW) {
                        localVisibleRect = isChildVisible(this.view, b2.x());
                    }
                    com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = this.node;
                    if (this.node.J() != null) {
                        aaVar = this.node.J();
                    }
                    boolean o = localVisibleRect & aaVar.o() & (!z);
                    if (oeb.e("disappearflag")) {
                        o &= !z;
                    }
                    boolean z2 = o;
                    Boolean bool = this.childrenStateMap.get(b2);
                    if (z2 && (bool == null || !bool.booleanValue())) {
                        sendMessage(130, b2, "onwillappear", null, hashMap, null);
                    } else if (bool != null && bool.booleanValue() && !z2) {
                        sendMessage(Component.MSG_FLAG_DISAPPEAR, b2, "onwilldisappear", null, hashMap, null);
                    }
                    this.childrenStateMap.put(b2, Boolean.valueOf(z2));
                }
            }
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.core.aa getParentNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("69b7c315", new Object[]{this});
        }
        int size = this.node.d.size();
        if (size == 1) {
            return this.node.d.get(0);
        }
        if (size <= 1) {
            return null;
        }
        return this.node;
    }

    public List<com.taobao.tao.flexbox.layoutmanager.core.aa> findVisibleItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6a0038b9", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        com.taobao.tao.flexbox.layoutmanager.core.aa parentNode = getParentNode();
        if (parentNode != null && this.childrenStateMap != null) {
            for (int i = 0; i < parentNode.R(); i++) {
                com.taobao.tao.flexbox.layoutmanager.core.aa b2 = parentNode.b(i);
                if (oec.a((Object) this.childrenStateMap.get(b2), false)) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    private boolean containListViewComponent(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("279b7e19", new Object[]{this, aaVar})).booleanValue() : aaVar.b(m.class) != null;
    }

    public AbsTNodeScrollView findNestScrollView(TBSwipeRefreshLayout tBSwipeRefreshLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsTNodeScrollView) ipChange.ipc$dispatch("771716a9", new Object[]{this, tBSwipeRefreshLayout});
        }
        for (int i = 0; i < tBSwipeRefreshLayout.getChildCount(); i++) {
            if (tBSwipeRefreshLayout.getChildAt(i) instanceof AbsTNodeScrollView) {
                return (AbsTNodeScrollView) tBSwipeRefreshLayout.getChildAt(i);
            }
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.c.equals("onforcerefresh") && (this.view instanceof TBSwipeRefreshLayout)) {
            this.pendingRefreshArgs = eVar.d;
            ((TBSwipeRefreshLayout) this.view).setAutoRefreshing(true);
            AbsTNodeScrollView findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view);
            if (findNestScrollView != null) {
                findNestScrollView.scrollTo(0, 0);
                TNodeRecyclerView findTargetRecyclerView = findNestScrollView.findTargetRecyclerView(findNestScrollView);
                if (findTargetRecyclerView != null) {
                    findTargetRecyclerView.scrollToPosition(0);
                }
            }
            return true;
        } else if (eVar.c.equals("onwillappear") || eVar.c.equals("scroll_state_idle_internal")) {
            if (this.view != 0) {
                if (ViewCompat.isAttachedToWindow(this.view)) {
                    refreshScrollViewExposure(eVar.d);
                } else {
                    this.exposureRunnable.f20046a = eVar.d;
                    this.view.post(this.exposureRunnable);
                }
            }
            return false;
        } else if (eVar.c.equals("onwilldisappear")) {
            if (this.view != 0) {
                trackScrollViewChildrenExposure(true, eVar.d);
            }
            return false;
        } else {
            if (eVar.c.equals("onpagescrollstatechanged") && oeb.a("fixScrollViewPageState", true) && this.view != 0 && this.node.o() && oec.a(eVar.d.get("state"), 0) == 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "tab");
                if (ViewCompat.isAttachedToWindow(this.view)) {
                    refreshScrollViewExposure(hashMap);
                } else {
                    this.exposureRunnable.f20046a = hashMap;
                    this.view.post(this.exposureRunnable);
                }
            }
            return false;
        }
    }

    private void refreshScrollViewExposure(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9bf72a", new Object[]{this, map});
            return;
        }
        this.childrenStateMap.clear();
        trackScrollViewChildrenExposure(false, map);
    }

    public int getScrollState() {
        AbsTNodeScrollView findNestScrollView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        if (this.view instanceof ObservableScrollView) {
            ((ObservableScrollView) this.view).getScrollState();
        } else if (this.view instanceof ObservableHorizontalScrollView) {
            ((ObservableHorizontalScrollView) this.view).getScrollState();
        } else if ((this.view instanceof TBSwipeRefreshLayout) && (findNestScrollView = findNestScrollView((TBSwipeRefreshLayout) this.view)) != null) {
            findNestScrollView.getScrollState();
        }
        return 0;
    }

    public View getScrollView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7c255211", new Object[]{this});
        }
        if (this.view instanceof TBSwipeRefreshLayout) {
            return findNestScrollView((TBSwipeRefreshLayout) this.view);
        }
        return this.view;
    }

    public void cleanPendingExposureEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70257b6c", new Object[]{this});
        } else {
            this.view.removeCallbacks(this.exposureRunnable);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public c mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fcf551ef", new Object[]{this}) : new c();
    }

    /* loaded from: classes8.dex */
    public static class c extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FILL_PORT_OFFSET_VIEW = "fill-port-offset-view";
        public static final String MAX_REFRESH_DISTANCE = "max-refresh-distance";
        public static final String MAX_SCROLL_OFFSET = "max-scroll-offset";
        public static final String MAX_SCROLL_OFFSET_VIEW = "max-scroll-offset-view";
        public static final String MSG_ON_MAX_SCROLL_OFFSET_CHANGE = "onmaxscrolloffsetchange";
        public static final String SMOOTH_REFRESH = "smooth-refresh";
        public int m;
        public String n;
        public String s;
        public String t;
        public int u;
        public String w;
        public float x;
        public int y;
        public boolean z;
        public boolean o = false;
        public boolean p = false;
        public boolean q = false;
        public boolean r = false;
        public boolean v = true;

        static {
            kge.a(-1292209076);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
            if (r9.equals("horizontal-indicator") != false) goto L11;
         */
        @Override // tb.ogl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 406
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent.c.a(android.content.Context, java.lang.String, java.lang.Object):void");
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

    private void dealMaxScrollOffsetView(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f98e24", new Object[]{this, cVar});
        } else if (StringUtils.equals(cVar.n, this.preMaxScrollOffsetViewID)) {
        } else {
            removeComponentInfoChangeObserver(this.preMaxScrollOffsetViewID, ComponentInfoDef.HEIGHT, this.maxScrollOffsetFromViewObserver);
            this.preMaxScrollOffsetViewID = cVar.n;
            if (StringUtils.isEmpty(cVar.n)) {
                return;
            }
            registerComponentInfoChangeObserver(cVar.n, ComponentInfoDef.HEIGHT, this.maxScrollOffsetFromViewObserver);
        }
    }

    public int getMaxScrollOffsetFromParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9718cf8", new Object[]{this})).intValue();
        }
        if (!StringUtils.isEmpty(getViewParams().n)) {
            return this.maxScrollOffsetFromView;
        }
        return getViewParams().m;
    }

    private int getRealMaxScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d344f50a", new Object[]{this})).intValue();
        }
        AbsTNodeScrollView absTNodeScrollView = this.nestedScrollView;
        if (absTNodeScrollView != null) {
            return absTNodeScrollView.getMaxScrollOffset();
        }
        return getMaxScrollOffsetFromParams();
    }

    private void checkMaxScrollOffsetChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf83873", new Object[]{this});
            return;
        }
        int realMaxScrollOffset = getRealMaxScrollOffset();
        if (realMaxScrollOffset == this.currMaxScrollOffset) {
            return;
        }
        this.currMaxScrollOffset = realMaxScrollOffset;
        if (StringUtils.isEmpty(oec.a(this.node.e(c.MSG_ON_MAX_SCROLL_OFFSET_CHANGE), (String) null))) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("maxScrollOffset", Integer.valueOf(ohd.b(getNode(), this.node.N(), this.currMaxScrollOffset)));
        hashMap.put("maxScrollOffsetPixel", Integer.valueOf(this.currMaxScrollOffset));
        sendMessage(this.node, c.MSG_ON_MAX_SCROLL_OFFSET_CHANGE, null, hashMap, null);
    }

    private void dealFillPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4929b7", new Object[]{this});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.aa aaVar = null;
        String str = "";
        if (this.node.d != null) {
            Iterator<com.taobao.tao.flexbox.layoutmanager.core.aa> it = this.node.d.iterator();
            String str2 = str;
            while (true) {
                if (!it.hasNext()) {
                    str = str2;
                    break;
                }
                com.taobao.tao.flexbox.layoutmanager.core.aa next = it.next();
                String a2 = oec.a(next.e(c.FILL_PORT_OFFSET_VIEW), str);
                if (!StringUtils.isEmpty(a2)) {
                    aaVar = next;
                    str = a2;
                    break;
                }
                str2 = a2;
            }
        }
        String str3 = this.currFillPortOffsetViewId;
        this.currFillPortNode = aaVar;
        this.currFillPortOffsetViewId = str;
        if (StringUtils.equals(str3, this.currFillPortOffsetViewId)) {
            return;
        }
        removeComponentInfoChangeObserver(str3, ComponentInfoDef.HEIGHT, this.fillPortOffsetFromViewObserver);
        if (StringUtils.isEmpty(this.currFillPortOffsetViewId)) {
            return;
        }
        registerComponentInfoChangeObserver(this.currFillPortOffsetViewId, ComponentInfoDef.HEIGHT, this.fillPortOffsetFromViewObserver);
    }

    private void tryRelayoutFillPortNode() {
        int layoutHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da15065", new Object[]{this});
        } else if (this.currFillPortNode == null || (layoutHeight = getLayoutHeight() - this.currFillPortOffset) == this.currFillPortHeight) {
        } else {
            this.currFillPortHeight = layoutHeight;
            this.currFillPortNode.a("height", (Object) Integer.valueOf(ohd.b(getNode(), getNode().N(), this.currFillPortHeight)), true);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onRealLayoutChanged(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37c980", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        super.onRealLayoutChanged(i, i2, i3, i4, z);
        if (i4 == i2) {
            return;
        }
        tryRelayoutFillPortNode();
    }

    private AbsTNodeScrollView createScrollView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsTNodeScrollView) ipChange.ipc$dispatch("a464b33b", new Object[]{this, context}) : new TNodeNestScrollView(context);
    }
}
