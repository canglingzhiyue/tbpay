package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Map;
import tb.fxy;
import tb.fym;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class x extends v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSCROLLERLAYOUT_ANDROIDFIXSCROLLVERTICALCONFLICT = 3042866685285795334L;
    public static final long DXSCROLLERLAYOUT_DISABLECONTENTOFFSETRESET = -7541569833091285454L;
    public static final long DXSCROLLERLAYOUT_ENABLESMOOTHSCROLL = 7492731803194590965L;
    public static final long DXSCROLLERLAYOUT_IGNOREREPEATRENDER = -1510047720479239593L;
    public static final long DXSCROLLERLAYOUT_NESTEDSCROLLINGENABLED = 601161579145018097L;
    public static final long DXSCROLLERLAYOUT_OPENSCROLLERANIMATION = -7123870390816445523L;
    public static final long DXSCROLLERLAYOUT_VELOCITYSPEED = -8777566321444773011L;
    public static final long DX_SCROLLER_LAYOUT = 5192418215958133202L;
    public static final long DX_SCROLLER_LAYOUT_CONTENT_OFFSET = 1750803361827314031L;
    public static final long DX_SCROLLER_LAYOUT_ITEM_PREFETCH = 3722067687195294700L;
    public static final int DX_TAG_HAS_SCROLL_LISTENER;
    private fxy<?, fym> dxVideoController;
    private boolean itemPrefetch = true;
    public int contentOffset = -1;
    private boolean openScrollerAnimation = false;
    private boolean ignoreRepeatRender = false;
    private boolean androidFixScrollVerticalConflict = false;
    private boolean disableContentOffsetReset = false;
    private double velocitySpeed = -1.0d;
    private int nestedScrollingEnabled = -1;
    private boolean enableSmoothScroll = false;
    public boolean hasResetScrollerListener = false;
    public boolean needCheck = false;

    public static /* synthetic */ Object ipc$super(x xVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$100(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e65ff1eb", new Object[]{xVar})).booleanValue() : xVar.ignoreRepeatRender;
    }

    public static /* synthetic */ boolean access$200(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8100b46c", new Object[]{xVar})).booleanValue() : xVar.openScrollerAnimation;
    }

    static {
        kge.a(-1980489488);
        DX_TAG_HAS_SCROLL_LISTENER = R.id.dx_recycler_view_has_scroll_listener;
    }

    public int getContentOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("77777c30", new Object[]{this})).intValue() : this.contentOffset;
    }

    public void setContentOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea40072", new Object[]{this, new Integer(i)});
        } else {
            this.contentOffset = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v, tb.fym
    public void onCanPlay(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, fxyVar, str});
            return;
        }
        this.dxVideoController = fxyVar;
        triggerVideoPlayControl();
    }

    @Override // com.taobao.android.dinamicx.widget.v, tb.fym
    public void onShouldStop(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198f0e", new Object[]{this, fxyVar, str});
            return;
        }
        this.dxVideoController = null;
        stopVideoPlayControl();
    }

    @Override // com.taobao.android.dinamicx.widget.v, tb.fyl
    public void onDidFinishPlayingLastItem(int i, boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2206a3f", new Object[]{this, new Integer(i), new Boolean(z), str, map});
            return;
        }
        fxy<?, fym> fxyVar = this.dxVideoController;
        if (fxyVar == null) {
            return;
        }
        fxyVar.c(this, str);
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-257751097);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new x();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new x();
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof x)) {
            return;
        }
        x xVar = (x) dXWidgetNode;
        this.contentOffset = xVar.contentOffset;
        this.itemPrefetch = xVar.itemPrefetch;
        this.openScrollerAnimation = xVar.openScrollerAnimation;
        this.ignoreRepeatRender = xVar.ignoreRepeatRender;
        this.disableContentOffsetReset = xVar.disableContentOffsetReset;
        this.androidFixScrollVerticalConflict = xVar.androidFixScrollVerticalConflict;
        this.velocitySpeed = xVar.velocitySpeed;
        this.nestedScrollingEnabled = xVar.nestedScrollingEnabled;
        this.hasResetScrollerListener = xVar.hasResetScrollerListener;
        this.needCheck = xVar.needCheck;
        this.enableSmoothScroll = xVar.enableSmoothScroll;
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DX_SCROLLER_LAYOUT_CONTENT_OFFSET) {
            this.contentOffset = i;
        } else if (j == DX_SCROLLER_LAYOUT_ITEM_PREFETCH) {
            if (i != 0) {
                z = true;
            }
            this.itemPrefetch = z;
        } else if (j == DXSCROLLERLAYOUT_OPENSCROLLERANIMATION) {
            if (i == 1) {
                z = true;
            }
            this.openScrollerAnimation = z;
        } else if (j == DXSCROLLERLAYOUT_IGNOREREPEATRENDER) {
            if (i != 0) {
                z = true;
            }
            this.ignoreRepeatRender = z;
        } else if (j == DXSCROLLERLAYOUT_DISABLECONTENTOFFSETRESET) {
            if (i == 1) {
                z = true;
            }
            this.disableContentOffsetReset = z;
        } else if (j == DXSCROLLERLAYOUT_ANDROIDFIXSCROLLVERTICALCONFLICT) {
            if (i == 1) {
                z = true;
            }
            this.androidFixScrollVerticalConflict = z;
        } else if (j == DXSCROLLERLAYOUT_NESTEDSCROLLINGENABLED) {
            this.nestedScrollingEnabled = i;
        } else if (j == DXSCROLLERLAYOUT_ENABLESMOOTHSCROLL) {
            if (i != 0) {
                z = true;
            }
            this.enableSmoothScroll = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeRecyclerView dXNativeRecyclerView = new DXNativeRecyclerView(context);
        closeDefaultAnimator(dXNativeRecyclerView);
        dXNativeRecyclerView.setEnableSmoothScroll(this.enableSmoothScroll);
        return dXNativeRecyclerView;
    }

    public void closeDefaultAnimator(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("149169e5", new Object[]{this, recyclerView});
            return;
        }
        try {
            recyclerView.getItemAnimator().setAddDuration(0L);
            recyclerView.getItemAnimator().setChangeDuration(0L);
            recyclerView.getItemAnimator().setMoveDuration(0L);
            recyclerView.getItemAnimator().setRemoveDuration(0L);
            ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.al
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (Constants.Name.CONTENT_OFFSET.equals(str)) {
            return Integer.valueOf(this.contentOffset);
        }
        return super.getNodePropByKey(str);
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        x xVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        this.needCheck = true;
        if (!(view instanceof RecyclerView) || (xVar = (x) getDXRuntimeContext().d()) == null) {
            return;
        }
        DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) view;
        setLayoutManager(context, xVar, dXNativeRecyclerView);
        int i = xVar.contentOffset;
        if (i >= 0) {
            if (getOrientation() == 1) {
                dXNativeRecyclerView.needScrollAfterLayout(0, i, xVar.contentHorizontalLength, xVar.contentVerticalLength);
            } else {
                dXNativeRecyclerView.needScrollAfterLayout(i, 0, xVar.contentHorizontalLength, xVar.contentVerticalLength);
            }
        }
        dXNativeRecyclerView.setNeedFixScrollConflict(this.androidFixScrollVerticalConflict ? 1 : 0);
        setAdapter(xVar, dXNativeRecyclerView, context);
        setScrollListener(xVar, dXNativeRecyclerView);
        double d = this.velocitySpeed;
        if (d > mto.a.GEO_NOT_SUPPORT) {
            dXNativeRecyclerView.setVelocitySpeed(d);
        }
        int i2 = this.nestedScrollingEnabled;
        if (i2 < 0) {
            return;
        }
        if (i2 == 1) {
            z = true;
        }
        if (z == dXNativeRecyclerView.isNestedScrollingEnabled()) {
            return;
        }
        dXNativeRecyclerView.setNestedScrollingEnabled(z);
    }

    public void setLayoutManager(Context context, x xVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f2203d", new Object[]{this, context, xVar, recyclerView});
            return;
        }
        com.taobao.android.dinamicx.view.c cVar = (com.taobao.android.dinamicx.view.c) recyclerView.getLayoutManager();
        if (cVar == null) {
            cVar = newLinearLayoutManager(context);
            recyclerView.setLayoutManager(cVar);
        }
        if (getOrientation() == 1) {
            cVar.setOrientation(1);
        } else {
            cVar.setOrientation(0);
        }
        cVar.setItemPrefetchEnabled(xVar.itemPrefetch);
        cVar.a(xVar.scrollEnabled);
    }

    public com.taobao.android.dinamicx.view.c newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.c) ipChange.ipc$dispatch("3b5fc876", new Object[]{this, context}) : new com.taobao.android.dinamicx.view.c(context);
    }

    public void setScrollListener(x xVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd4c087", new Object[]{this, xVar, recyclerView});
            return;
        }
        b bVar = (b) recyclerView.getTag(DX_TAG_HAS_SCROLL_LISTENER);
        if (bVar == null) {
            b newScrollListener = newScrollListener();
            newScrollListener.a(xVar, recyclerView);
            recyclerView.addOnScrollListener(newScrollListener);
            recyclerView.setTag(DX_TAG_HAS_SCROLL_LISTENER, newScrollListener);
            newScrollListener.a(recyclerView);
            b.a(newScrollListener);
            return;
        }
        bVar.a(xVar, recyclerView);
        bVar.a(recyclerView);
        b.a(bVar);
    }

    public void resetScrollerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06ba484", new Object[]{this});
            return;
        }
        View v = getDXRuntimeContext().v();
        if (v == null || !(v.getTag(DX_TAG_HAS_SCROLL_LISTENER) instanceof b)) {
            return;
        }
        this.hasResetScrollerListener = true;
    }

    public b newScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("be81c0df", new Object[]{this}) : new b();
    }

    public void setAdapter(x xVar, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287fbdf7", new Object[]{this, xVar, recyclerView, context});
            return;
        }
        c cVar = (c) recyclerView.getAdapter();
        if (cVar == null) {
            c cVar2 = new c(context, xVar);
            cVar2.setHasStableIds(true);
            cVar2.a(xVar.itemWidgetNodes);
            recyclerView.setAdapter(cVar2);
            return;
        }
        cVar.a(xVar.itemWidgetNodes);
        cVar.a(xVar);
        if (!this.disableContentOffsetReset && this.contentOffset < 0) {
            ((DXNativeRecyclerView) recyclerView).needScrollAfterLayout(0, 0, xVar.contentHorizontalLength, xVar.contentVerticalLength);
        }
        cVar.notifyDataSetChanged();
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f12213a;
        public x c;
        private com.taobao.android.dinamicx.as d;
        public ArrayList<DXWidgetNode> b = new ArrayList<>();
        private boolean e = true;
        private DXViewEvent f = new DXViewEvent(-8975334121118753601L);
        private DXViewEvent g = new DXViewEvent(-5201408949358043646L);

        /* loaded from: classes5.dex */
        public static class a extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public DXWidgetNode f12214a;

            static {
                kge.a(-709295769);
            }

            public a(View view) {
                super(view);
            }
        }

        static {
            kge.a(2082577889);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public c(Context context, x xVar) {
            this.d = xVar.pipeline;
            this.f12213a = context;
            this.c = xVar;
        }

        public void a(ArrayList<DXWidgetNode> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            } else {
                this.b = arrayList;
            }
        }

        public void a(x xVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e535797", new Object[]{this, xVar});
                return;
            }
            this.c = xVar;
            this.d = xVar.pipeline;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new a(a(viewGroup, i));
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            } else {
                a(viewHolder, i);
            }
        }

        public void a(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb19487e", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            DXWidgetNode b = b(i);
            a aVar = (a) viewHolder;
            if (!b.isViewMatrixChanged() && a(b, i, aVar)) {
                return;
            }
            b(b, i, aVar);
            c(b, i, aVar);
            b.setViewMatrixChanged(false);
        }

        public View a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("a545e87e", new Object[]{this, viewGroup, new Integer(i)});
            }
            com.taobao.android.dinamicx.as asVar = this.d;
            if (asVar == null) {
                return new DXNativeFrameLayout(this.f12213a);
            }
            return asVar.a(this.f12213a);
        }

        public boolean a(DXWidgetNode dXWidgetNode, int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2d508393", new Object[]{this, dXWidgetNode, new Integer(i), aVar})).booleanValue();
            }
            this.c.removeAppearWidget(aVar.f12214a);
            if (this.e) {
                ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
                if (layoutParams instanceof RecyclerView.LayoutParams) {
                    a(i, (RecyclerView.LayoutParams) layoutParams);
                } else {
                    RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
                    aVar.itemView.setLayoutParams(layoutParams2);
                    a(i, layoutParams2);
                }
            }
            if (aVar.f12214a != dXWidgetNode || x.access$100(this.c)) {
                return false;
            }
            this.f.setItemIndex(i);
            if (dXWidgetNode.getBindingXExecutingMap() != null) {
                dXWidgetNode.getBindingXExecutingMap().clear();
            }
            dXWidgetNode.sendBroadcastEvent(this.f);
            this.c.postEvent(this.f);
            this.c.addAppearWidget(dXWidgetNode);
            return true;
        }

        public void b(DXWidgetNode dXWidgetNode, int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d07b790", new Object[]{this, dXWidgetNode, new Integer(i), aVar});
                return;
            }
            DXRuntimeContext a2 = a(dXWidgetNode);
            this.d.a(dXWidgetNode, null, aVar.itemView, a2, 2, 9, this.c.getOldWidthMeasureSpec(), this.c.getOldHeightMeasureSpec(), i);
            if (!a2.o()) {
                return;
            }
            com.taobao.android.dinamicx.monitor.b.a(a2.n(), true);
        }

        public void c(DXWidgetNode dXWidgetNode, int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cbeeb91", new Object[]{this, dXWidgetNode, new Integer(i), aVar});
                return;
            }
            aVar.f12214a = dXWidgetNode;
            this.f.setItemIndex(i);
            if (dXWidgetNode.getBindingXExecutingMap() != null) {
                dXWidgetNode.getBindingXExecutingMap().clear();
            }
            dXWidgetNode.sendBroadcastEvent(this.f);
            this.c.postEvent(this.f);
            this.c.addAppearWidget(dXWidgetNode);
        }

        private DXRuntimeContext a(DXWidgetNode dXWidgetNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXRuntimeContext) ipChange.ipc$dispatch("49858920", new Object[]{this, dXWidgetNode});
            }
            DXRuntimeContext a2 = dXWidgetNode.getDXRuntimeContext().a(dXWidgetNode);
            com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s(a2.A());
            sVar.b = a2.c();
            a2.a(sVar);
            return a2;
        }

        private void a(int i, RecyclerView.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb73a153", new Object[]{this, new Integer(i), layoutParams});
            } else if (this.c.getOrientation() == 0) {
                if (i == 0) {
                    layoutParams.setMargins(this.c.getPaddingLeft(), this.c.getPaddingTop(), 0, this.c.getPaddingBottom());
                } else if (i == this.b.size() - 1) {
                    layoutParams.setMargins(0, this.c.getPaddingTop(), this.c.getPaddingRight(), this.c.getPaddingBottom());
                } else {
                    layoutParams.setMargins(0, this.c.getPaddingTop(), 0, this.c.getPaddingBottom());
                }
            } else if (i == 0) {
                layoutParams.setMargins(this.c.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), 0);
            } else if (i == this.b.size() - 1) {
                layoutParams.setMargins(this.c.getPaddingLeft(), 0, this.c.getPaddingRight(), this.c.getPaddingBottom());
            } else {
                layoutParams.setMargins(this.c.getPaddingLeft(), 0, this.c.getPaddingRight(), 0);
            }
        }

        public DXWidgetNode b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("55a70d59", new Object[]{this, new Integer(i)}) : this.b.get(i);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.b;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
                return;
            }
            this.g.setItemIndex(viewHolder.getAdapterPosition());
            this.c.postEvent(this.g);
            a aVar = (a) viewHolder;
            if (aVar == null || aVar.f12214a == null) {
                return;
            }
            aVar.f12214a.sendBroadcastEvent(this.g);
            this.c.removeAppearWidget(aVar.f12214a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
            return;
        }
        super.onSetDoubleAttribute(j, d);
        if (j != DXSCROLLERLAYOUT_VELOCITYSPEED) {
            return;
        }
        this.velocitySpeed = d;
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int b;
        public int c;
        public DXRootView d;
        private x e;
        private JSONObject j;
        private JSONObject k;
        private com.taobao.android.dinamicx.r l;

        /* renamed from: a  reason: collision with root package name */
        public DXScrollEvent f12211a = new DXScrollEvent(5288751146867425108L);
        private DXScrollEvent f = new DXScrollEvent(9144262755562405950L);
        private DXScrollEvent g = new DXScrollEvent(2691126191158604142L);
        private com.taobao.android.dinamicx.bq h = new com.taobao.android.dinamicx.bq();
        private com.taobao.android.dinamicx.bq i = new com.taobao.android.dinamicx.bq();

        static {
            kge.a(-1968336651);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5b13a59", new Object[]{bVar});
            } else {
                bVar.b();
            }
        }

        public static /* synthetic */ x b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("35936d2b", new Object[]{bVar}) : bVar.e;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!x.access$200(this.e)) {
            } else {
                this.j = new JSONObject();
                this.j.put("type", (Object) "BNDX");
                this.k = new JSONObject();
                this.j.put("params", (Object) this.k);
                this.k.put("widget", (Object) this.e);
                this.d = this.e.getDXRuntimeContext().s();
                this.l = this.e.getDXRuntimeContext().C();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            this.b += i;
            this.c += i2;
            if (this.e.needCheck && this.e.hasResetScrollerListener && this.e.itemWidgetNodes != null && this.e.itemWidgetNodes.size() > 0 && this.b >= this.e.itemWidgetNodes.get(0).getMeasuredWidth()) {
                this.b = 0;
                this.b += i;
            }
            x xVar = this.e;
            xVar.needCheck = false;
            xVar.hasResetScrollerListener = false;
            a(recyclerView, this.f12211a);
            a(com.taobao.android.detail.ttdetail.bizmessage.o.SCROLLING);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            } else if (i == 1) {
                a(recyclerView, this.f);
                a("scroll_beigin");
            } else if (i != 0) {
            } else {
                a(recyclerView, this.g);
                a("scroll_end");
            }
        }

        public void a(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            } else if ((this.e.needCheck && this.e.hasResetScrollerListener) || !(recyclerView instanceof DXNativeRecyclerView)) {
            } else {
                DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) recyclerView;
                a(dXNativeRecyclerView.getScrolledX());
                b(dXNativeRecyclerView.getScrolledY());
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.dinamicx.widget.x.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.this.f12211a.setOffsetX(b.this.b);
                        b.this.f12211a.setOffsetY(b.this.c);
                        if (b.b(b.this).indicatorWidgetNode != null) {
                            b.b(b.this).indicatorWidgetNode.postEvent(b.this.f12211a);
                        }
                        b.b(b.this).postEvent(b.this.f12211a);
                    }
                });
            }
        }

        public void a(RecyclerView recyclerView, DXScrollEvent dXScrollEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1aca845", new Object[]{this, recyclerView, dXScrollEvent});
                return;
            }
            dXScrollEvent.setOffsetX(this.b);
            dXScrollEvent.setOffsetY(this.c);
            if (this.e.getOrientation() == 0) {
                this.e.contentOffset = this.b;
            } else {
                this.e.contentOffset = this.c;
            }
            if (this.e.indicatorWidgetNode != null) {
                this.e.indicatorWidgetNode.postEvent(dXScrollEvent);
            }
            this.e.postEvent(dXScrollEvent);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (!x.access$200(this.e)) {
            } else {
                this.k.put("offsetX", (Object) Integer.valueOf(this.b));
                this.k.put("offsetY", (Object) Integer.valueOf(this.c));
                this.k.put("action", (Object) str);
                this.k.put("sourceId", (Object) this.e.getUserId());
                this.l.a(this.d, this.j);
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        public x a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (x) ipChange.ipc$dispatch("66753e5d", new Object[]{this}) : this.e;
        }

        public void a(x xVar, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca2835c5", new Object[]{this, xVar, recyclerView});
                return;
            }
            this.e = xVar;
            if (xVar.getOrientation() == 0) {
                this.i.f11827a = xVar.contentHorizontalLength;
                this.i.b = xVar.getMeasuredHeight();
                this.f12211a.setContentSize(this.i);
                this.f.setContentSize(this.i);
                this.g.setContentSize(this.i);
            } else {
                this.i.f11827a = xVar.getMeasuredWidth();
                this.i.b = xVar.contentVerticalLength;
                this.f12211a.setContentSize(this.i);
                this.f.setContentSize(this.i);
                this.g.setContentSize(this.i);
            }
            this.h.f11827a = xVar.getMeasuredWidth();
            this.h.b = xVar.getMeasuredHeight();
            this.f12211a.setScrollerSize(this.h);
            this.f.setScrollerSize(this.h);
            this.g.setScrollerSize(this.h);
            this.f12211a.setRecyclerView(recyclerView);
            this.f.setRecyclerView(recyclerView);
            this.g.setRecyclerView(recyclerView);
        }
    }

    public boolean isItemPrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf4baff", new Object[]{this})).booleanValue() : this.itemPrefetch;
    }

    public void setItemPrefetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3eff01", new Object[]{this, new Boolean(z)});
        } else {
            this.itemPrefetch = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXSCROLLERLAYOUT_DISABLECONTENTOFFSETRESET && j != DXSCROLLERLAYOUT_ANDROIDFIXSCROLLVERTICALCONFLICT) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}
