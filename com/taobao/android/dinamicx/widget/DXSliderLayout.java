package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.expression.event.DXSetPageIndexEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView;
import com.taobao.android.dinamicx.view.DXNativeProgressIndicator;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.widget.x;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fxe;
import tb.fxy;
import tb.fym;
import tb.gbf;
import tb.kge;

/* loaded from: classes.dex */
public class DXSliderLayout extends x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXSLIDERLAYOUT_AVOIDINCESSANTSCROLL = 6175561478597347134L;
    public static final long DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGEFIRST_ANDROID = -546983449460568482L;
    public static final long DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGE_ANDROID = 4501425988663277281L;
    public static final long DXSLIDERLAYOUT_DISABLEPAGESELECTANDSTARTTIMEONPRERENDER = -5411074322938787347L;
    public static final long DXSLIDERLAYOUT_ENABLEINFINITYEDGECHECK = -7668517989997933541L;
    public static final long DXSLIDERLAYOUT_ENABLEPRERENDER = 6042404229400734461L;
    public static final long DXSLIDERLAYOUT_IGNOREPLAYCONTROL = -5610109432173134324L;
    public static final long DXSLIDERLAYOUT_INTERCEPTTOUCHEVENT = -3458159313298372122L;
    public static final int DXSLIDERLAYOUT_INTERCEPTTOUCHEVENT_NONE = 0;
    public static final long DXSLIDERLAYOUT_ISCANPARENTTOUCHWHENEDGE_ANDROID = 2244805349756585284L;
    public static final long DXSLIDERLAYOUT_ISCORRECTIONSLIDEOFFSET_ANDROID = 3230619470895835019L;
    public static final long DXSLIDERLAYOUT_ISENABLEEDGECHECK_ANDROID = -7293179166348573521L;
    public static final long DXSLIDERLAYOUT_ISINTERCEPTMULTIPOINTTOUCH = -4985343460365605412L;
    public static final long DXSLIDERLAYOUT_NEEDMANUALSTOPLOOP = -8807003443392417972L;
    public static final long DXSLIDERLAYOUT_NEEDMANUALSTOPLOOPONMOVE = 1470866451661440934L;
    public static final long DXSLIDERLAYOUT_OVERRIDECANSCROLLHORIZONTALLY = 2622876492584549901L;
    public static final long DXSLIDERLAYOUT_SCROLLWITHPOSTMSG = -7857363928666175735L;
    public static final long DXSLIDERLAYOUT_USERSCROLLTOPOSITIONWHENRENDER_ANDROID = 3751416681290120446L;
    public static final long DX_SLIDER_LAYOUT = 7645421793448373229L;
    public static final long DX_SLIDER_LAYOUT_AUTO_SCROLL = 2618773720063865426L;
    public static final long DX_SLIDER_LAYOUT_AUTO_SCROLL_INTERVAL = 5501313022839937951L;
    public static final long DX_SLIDER_LAYOUT_IS_INFINITE = -3537170322378136036L;
    public static final long DX_SLIDER_LAYOUT_MANUAL_SWITCH_ENABLED = -7107533083539416402L;
    public static final long DX_SLIDER_LAYOUT_ON_PAGE_CHANGE = -8975195222378757716L;
    public static final long DX_SLIDER_LAYOUT_ON_SET_PAGE_INDEX = -3492248032330035060L;
    public static final long DX_SLIDER_LAYOUT_PAGE_INDEX = 7816489696776271262L;
    private static final String TAG = "DXSliderLayout";
    private boolean autoScroll;
    private gbf dxRecyclerViewCacheExtension;
    private boolean isCanParentTouchWhenEdge_Android;
    private boolean isInfinite;
    private int pageIndex;
    private boolean needManualStopLoopOnMove = false;
    private boolean manualSwitchEnabled = true;
    private int autoScrollInterval = 1000;
    private int interceptTouchEvent = 0;
    private boolean avoidIncessantScroll = false;
    private boolean disablePageSelectAndstartTimeOnPreRender = false;
    private boolean avoidIndexDeltaToLarge_Android = false;
    private boolean avoidIndexDeltaToLargeFirst_Android = false;
    private boolean enablePreRender = false;
    private boolean needManualStopLoop = false;
    private boolean enableInfinityEdgeCheck = false;
    private boolean useDefaultScrollFinite = false;
    private boolean isInterceptMultipointTouch = true;
    private boolean scrollWithPostMsg = false;
    private boolean overrideCanScrollHorizontal = false;
    private boolean isEnableEdgeCheck_Android = false;
    private boolean ignorePlayControl = false;
    private boolean isCorrectionSlideOffset_Android = false;

    static {
        kge.a(1661212503);
    }

    public static /* synthetic */ Object ipc$super(DXSliderLayout dXSliderLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1653756745:
                super.stopVideoPlayControl();
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -467598483:
                super.triggerVideoPlayControl();
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 905060413:
                super.setLayoutManager((Context) objArr[0], (x) objArr[1], (RecyclerView) objArr[2]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1524202196:
                return super.getNodePropByKey((String) objArr[0]);
            case 1808481279:
                super.onCanPlay((fxy) objArr[0], (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v
    public int measureSpecForChild(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e582946", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : i2;
    }

    public static /* synthetic */ boolean access$000(DXSliderLayout dXSliderLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cadbbf7", new Object[]{dXSliderLayout})).booleanValue() : dXSliderLayout.isInfinite;
    }

    public static /* synthetic */ gbf access$100(DXSliderLayout dXSliderLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbf) ipChange.ipc$dispatch("3e7f99a9", new Object[]{dXSliderLayout}) : dXSliderLayout.dxRecyclerViewCacheExtension;
    }

    public int getPageIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("913ddec7", new Object[]{this})).intValue() : this.pageIndex;
    }

    public void setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e74d6bb", new Object[]{this, new Integer(i)});
        } else {
            this.pageIndex = i;
        }
    }

    public void setInterceptMultipointTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdf4545", new Object[]{this, new Boolean(z)});
        } else {
            this.isInterceptMultipointTouch = z;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1260017874);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXSliderLayout();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXSliderLayout();
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof DXSliderLayout)) {
            return;
        }
        DXSliderLayout dXSliderLayout = (DXSliderLayout) dXWidgetNode;
        this.isInfinite = dXSliderLayout.isInfinite;
        this.pageIndex = dXSliderLayout.pageIndex;
        this.autoScrollInterval = dXSliderLayout.autoScrollInterval;
        this.autoScroll = dXSliderLayout.autoScroll;
        this.manualSwitchEnabled = dXSliderLayout.manualSwitchEnabled;
        this.disablePageSelectAndstartTimeOnPreRender = dXSliderLayout.disablePageSelectAndstartTimeOnPreRender;
        this.interceptTouchEvent = dXSliderLayout.interceptTouchEvent;
        this.avoidIncessantScroll = dXSliderLayout.avoidIncessantScroll;
        this.isInterceptMultipointTouch = dXSliderLayout.isInterceptMultipointTouch;
        this.avoidIndexDeltaToLarge_Android = dXSliderLayout.avoidIndexDeltaToLarge_Android;
        this.avoidIndexDeltaToLargeFirst_Android = dXSliderLayout.avoidIndexDeltaToLargeFirst_Android;
        this.scrollWithPostMsg = dXSliderLayout.scrollWithPostMsg;
        this.overrideCanScrollHorizontal = dXSliderLayout.overrideCanScrollHorizontal;
        this.isCorrectionSlideOffset_Android = dXSliderLayout.isCorrectionSlideOffset_Android;
        this.isEnableEdgeCheck_Android = dXSliderLayout.isEnableEdgeCheck_Android;
        this.dxRecyclerViewCacheExtension = dXSliderLayout.dxRecyclerViewCacheExtension;
        this.enablePreRender = dXSliderLayout.enablePreRender;
        this.needManualStopLoop = dXSliderLayout.needManualStopLoop;
        this.enableInfinityEdgeCheck = dXSliderLayout.enableInfinityEdgeCheck;
        this.useDefaultScrollFinite = dXSliderLayout.useDefaultScrollFinite;
        this.isCanParentTouchWhenEdge_Android = dXSliderLayout.isCanParentTouchWhenEdge_Android;
        this.ignorePlayControl = dXSliderLayout.ignorePlayControl;
        this.needManualStopLoopOnMove = dXSliderLayout.needManualStopLoopOnMove;
    }

    @Override // com.taobao.android.dinamicx.widget.v, tb.fyx
    public void triggerVideoPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        super.triggerVideoPlayControl();
        if (!canAutoPlay() || !isEnableNestedPlayControl()) {
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d(TAG, "startTimer by triggerVideoPlayControl");
        }
        startTimer();
    }

    @Override // com.taobao.android.dinamicx.widget.v, tb.fyx
    public void stopVideoPlayControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        super.stopVideoPlayControl();
        if (!isEnableNestedPlayControl() || !this.autoScroll) {
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d(TAG, "stopTimer by stopVideoPlayControl");
        }
        stopTimer();
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        if (isEnablePagingPreRender()) {
            this.dxRecyclerViewCacheExtension = new gbf(getDXRuntimeContext().A());
        } else {
            this.dxRecyclerViewCacheExtension = null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeAutoLoopRecyclerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXSliderLayout dXSliderLayout;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof DXNativeAutoLoopRecyclerView) || (dXSliderLayout = (DXSliderLayout) getDXRuntimeContext().d()) == null) {
            return;
        }
        final DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) view;
        dXNativeAutoLoopRecyclerView.setOverrideCanScrollHorizontal(this.overrideCanScrollHorizontal);
        dXNativeAutoLoopRecyclerView.setEnableHorizontalEdgeCheck(this.isEnableEdgeCheck_Android);
        dXNativeAutoLoopRecyclerView.setDinamicXEngine(getDXRuntimeContext().C().b());
        dXNativeAutoLoopRecyclerView.setNeedManualStopLoopOnMove(this.needManualStopLoopOnMove);
        dXNativeAutoLoopRecyclerView.setEnabled(getEnabled() == 1);
        dXNativeAutoLoopRecyclerView.setNestedType(this.interceptTouchEvent);
        dXNativeAutoLoopRecyclerView.setInterceptMultipointTouch(this.isInterceptMultipointTouch);
        dXNativeAutoLoopRecyclerView.setIsCanParentTouchWhenEdge_Android(this.isCanParentTouchWhenEdge_Android);
        final int calculateTargetIndex = calculateTargetIndex(dXSliderLayout, dXSliderLayout.pageIndex);
        if (dXSliderLayout.getMeasuredWidth() != 0 && getOrientation() == 0 && this.isCorrectionSlideOffset_Android) {
            x.b bVar = (x.b) dXNativeAutoLoopRecyclerView.getTag(DX_TAG_HAS_SCROLL_LISTENER);
            int measuredWidth = ((bVar == null || bVar.a() == null || bVar.a().itemWidgetNodes == null || (size = bVar.a().itemWidgetNodes.size()) <= 0 || calculateTargetIndex <= 100) ? calculateTargetIndex : calculateTargetIndex % size) * dXSliderLayout.getMeasuredWidth();
            dXNativeAutoLoopRecyclerView.setScrolledX(measuredWidth);
            dXNativeAutoLoopRecyclerView.setScrolledY(0);
            bVar.a(measuredWidth);
            bVar.b(0);
        }
        DXRootView s = getDXRuntimeContext().s();
        if (s == null) {
            return;
        }
        dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(!s.hasDXRootViewLifeCycle());
        fux.b(TAG, TAG, "onRenderView oldIndex = " + dXNativeAutoLoopRecyclerView.getCurrentIndex() + ";newIndex = " + calculateTargetIndex + ";delta = " + (calculateTargetIndex - dXNativeAutoLoopRecyclerView.getCurrentIndex()));
        dXNativeAutoLoopRecyclerView.setCurrentIndex(calculateTargetIndex);
        gbf.a(dXNativeAutoLoopRecyclerView, this.dxRecyclerViewCacheExtension, calculateTargetIndex);
        if (dXSliderLayout.isInfinite) {
            boolean b2 = fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dXNativeAutoLoopRecyclerView.scrollToPosition(calculateTargetIndex);
                    }
                }
            });
            dXNativeAutoLoopRecyclerView.setEnableInfinityEdgeCheck(this.enableInfinityEdgeCheck);
            if (this.avoidIndexDeltaToLarge_Android && !b2) {
                fux.b(TAG, TAG, "onRenderView scrollToPosition failed, targetIndex = " + calculateTargetIndex);
                com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s("dinamicx");
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_ERROR, 200003);
                aVar.e = "onRenderView scrollToPosition failed, targetIndex = " + calculateTargetIndex;
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
        } else {
            scrollToIndexOnIsNotInfinite(dXNativeAutoLoopRecyclerView, dXSliderLayout, calculateTargetIndex);
        }
        final int size2 = dXSliderLayout.itemWidgetNodes != null ? dXSliderLayout.itemWidgetNodes.size() : 0;
        dXNativeAutoLoopRecyclerView.setActualCount(size2);
        d dVar = new d(dXSliderLayout, size2);
        dXNativeAutoLoopRecyclerView.setOnPageChangeListener(dVar);
        if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
            dVar.a(calculateTargetIndex);
        }
        dXNativeAutoLoopRecyclerView.setManualSwitchEnabled(this.manualSwitchEnabled);
        dXNativeAutoLoopRecyclerView.setAvoidIncessantScroll(this.avoidIncessantScroll);
        dXNativeAutoLoopRecyclerView.setAvoidFirstIncessantScroll(this.avoidIndexDeltaToLargeFirst_Android);
        if (dXSliderLayout.canAutoPlay()) {
            dXNativeAutoLoopRecyclerView.setAutoPlay(true);
            if (isEnableNestedPlayControl()) {
                dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(false);
                dXNativeAutoLoopRecyclerView.stopTimer();
            } else {
                dXNativeAutoLoopRecyclerView.setInterval(dXSliderLayout.autoScrollInterval);
                if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                    dXNativeAutoLoopRecyclerView.startTimer();
                }
                dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(!s.hasDXRootViewLifeCycle());
            }
            if (this.indicatorWidgetNode instanceof u) {
                ((u) this.indicatorWidgetNode).a(this.autoScrollInterval);
            }
            dXNativeAutoLoopRecyclerView.setNeedManualStop(this.needManualStopLoop);
            dXNativeAutoLoopRecyclerView.setTouched(false);
            dXNativeAutoLoopRecyclerView.setOnAutoLoopTimerListener(new DXNativeAutoLoopRecyclerView.b() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final int c;

                {
                    this.c = size2;
                }

                @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.b
                public void a(int i, DXNativeProgressIndicator dXNativeProgressIndicator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("344289ca", new Object[]{this, new Integer(i), dXNativeProgressIndicator});
                        return;
                    }
                    DXNativeProgressIndicator a2 = a(dXNativeProgressIndicator, dXNativeAutoLoopRecyclerView);
                    if (a2 == null) {
                        return;
                    }
                    a2.setIndexWithAnimation(i % this.c);
                }

                @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.b
                public void b(int i, DXNativeProgressIndicator dXNativeProgressIndicator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9e7211e9", new Object[]{this, new Integer(i), dXNativeProgressIndicator});
                        return;
                    }
                    DXNativeProgressIndicator a2 = a(dXNativeProgressIndicator, dXNativeAutoLoopRecyclerView);
                    if (a2 == null) {
                        return;
                    }
                    a2.setIndex((i % this.c) + 1);
                }

                private DXNativeProgressIndicator a(DXNativeProgressIndicator dXNativeProgressIndicator, DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (DXNativeProgressIndicator) ipChange2.ipc$dispatch("98191334", new Object[]{this, dXNativeProgressIndicator, dXNativeAutoLoopRecyclerView2});
                    }
                    if (dXNativeProgressIndicator != null) {
                        return dXNativeProgressIndicator;
                    }
                    DXSliderLayout dXSliderLayout2 = DXSliderLayout.this;
                    dXSliderLayout2.indicatorWidgetNode = dXSliderLayout2.queryIndicatorNodeByUserId(dXSliderLayout2.indicatorId);
                    if (DXSliderLayout.this.indicatorWidgetNode == null) {
                        return dXNativeProgressIndicator;
                    }
                    View v = DXSliderLayout.this.indicatorWidgetNode.getDXRuntimeContext().v();
                    if (!(v instanceof DXNativeProgressIndicator)) {
                        return dXNativeProgressIndicator;
                    }
                    DXNativeProgressIndicator dXNativeProgressIndicator2 = (DXNativeProgressIndicator) v;
                    dXNativeAutoLoopRecyclerView2.setIndicator(dXNativeProgressIndicator2);
                    return dXNativeProgressIndicator2;
                }
            });
        } else {
            dXNativeAutoLoopRecyclerView.stopTimer();
            dXNativeAutoLoopRecyclerView.setAutoPlay(false);
            dXNativeAutoLoopRecyclerView.setOnAutoLoopTimerListener(null);
            dXNativeAutoLoopRecyclerView.setIndicator(null);
        }
        setViewMatrixChanged(false);
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, tb.fym
    public void onCanPlay(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, fxyVar, str});
        } else if (this.ignorePlayControl) {
            fxyVar.d(this, str);
        } else {
            super.onCanPlay(fxyVar, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public x.b newScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (x.b) ipChange.ipc$dispatch("be81c0df", new Object[]{this}) : new e(this.isCorrectionSlideOffset_Android, this.avoidIndexDeltaToLarge_Android);
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public com.taobao.android.dinamicx.view.c newLinearLayoutManager(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.c) ipChange.ipc$dispatch("3b5fc876", new Object[]{this, context}) : new com.taobao.android.dinamicx.view.d(context, getOrientation(), false);
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public void setLayoutManager(Context context, x xVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f2203d", new Object[]{this, context, xVar, recyclerView});
            return;
        }
        super.setLayoutManager(context, xVar, recyclerView);
        com.taobao.android.dinamicx.view.d dVar = (com.taobao.android.dinamicx.view.d) recyclerView.getLayoutManager();
        if (getOrientation() == 1) {
            dVar.a(getHeight());
        } else {
            dVar.a(getWidth());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (!isViewMatrixChanged() || this.itemWidgetNodes == null || this.itemWidgetNodes.isEmpty()) {
            return;
        }
        Iterator<DXWidgetNode> it = this.itemWidgetNodes.iterator();
        while (it.hasNext()) {
            it.next().setViewMatrixChanged(true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x
    public void setAdapter(x xVar, RecyclerView recyclerView, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287fbdf7", new Object[]{this, xVar, recyclerView, context});
            return;
        }
        DXSliderLayout dXSliderLayout = (DXSliderLayout) xVar;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (dXSliderLayout.isInfinite) {
            if (adapter instanceof a) {
                a aVar = (a) adapter;
                aVar.a(xVar.itemWidgetNodes);
                aVar.a((x) dXSliderLayout);
                aVar.notifyDataSetChanged();
                return;
            }
            a aVar2 = new a(context, xVar);
            aVar2.a(xVar.itemWidgetNodes);
            recyclerView.setAdapter(aVar2);
            return;
        }
        if (adapter instanceof a) {
            recyclerView.setAdapter(null);
            c cVar = new c(context, xVar);
            cVar.setHasStableIds(true);
            cVar.a(xVar.itemWidgetNodes);
            recyclerView.setAdapter(cVar);
        } else if (adapter == null) {
            c cVar2 = new c(context, xVar);
            cVar2.setHasStableIds(true);
            cVar2.a(xVar.itemWidgetNodes);
            recyclerView.setAdapter(cVar2);
        } else {
            x.c cVar3 = (x.c) recyclerView.getAdapter();
            cVar3.a(xVar.itemWidgetNodes);
            cVar3.a(xVar);
            if (this.pageIndex == 0) {
                ((DXNativeRecyclerView) recyclerView).needScrollAfterLayout(0, 0, xVar.contentHorizontalLength, xVar.contentVerticalLength, this.scrollWithPostMsg);
            }
            Parcelable saveInstanceState = ((DXNativeAutoLoopRecyclerView) recyclerView).getSaveInstanceState();
            if (saveInstanceState != null) {
                recyclerView.getLayoutManager().onRestoreInstanceState(saveInstanceState);
            }
            adapter.notifyDataSetChanged();
        }
        ((x.c) recyclerView.getAdapter()).a(false);
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.al
    public Object getNodePropByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ad97ad4", new Object[]{this, str});
        }
        if (MtopModule.KEY_PAGE_INDEX.equals(str)) {
            return Integer.valueOf(this.pageIndex);
        }
        return super.getNodePropByKey(str);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        DXRootView s;
        final DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView;
        int measuredWidth;
        int scrolledX;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent) || (s = getDXRuntimeContext().s()) == null) {
            return true;
        }
        if (!s.hasDXRootViewLifeCycle() || (dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().v()) == null) {
            return false;
        }
        dXNativeAutoLoopRecyclerView.setNeedProcessViewLifeCycle(false);
        long eventId = dXEvent.getEventId();
        if (5288671110273408574L != eventId) {
            if (5388973340095122049L == eventId) {
                try {
                    dXNativeAutoLoopRecyclerView.stopTimer();
                    dXNativeAutoLoopRecyclerView.setSaveInstanceState(dXNativeAutoLoopRecyclerView.getLayoutManager().onSaveInstanceState());
                    return true;
                } catch (Throwable th) {
                    com.taobao.android.dinamicx.exception.a.b(th);
                }
            }
            return false;
        }
        if (dXNativeAutoLoopRecyclerView.canStartPlay()) {
            dXNativeAutoLoopRecyclerView.startTimer();
        }
        if (!dXNativeAutoLoopRecyclerView.isAutoPlay() && getOrientation() == 0 && !dXNativeAutoLoopRecyclerView.isNeedScrollAfterLayout() && (measuredWidth = getMeasuredWidth()) != 0 && (scrolledX = dXNativeAutoLoopRecyclerView.getScrolledX() % measuredWidth) != 0) {
            int measuredWidth2 = getMeasuredWidth() / 2;
            final int scrolledX2 = dXNativeAutoLoopRecyclerView.getScrolledX() / measuredWidth;
            if (scrolledX > measuredWidth2) {
                dXNativeAutoLoopRecyclerView.scrollBy(measuredWidth - scrolledX, 0);
                scrolledX2++;
            } else {
                dXNativeAutoLoopRecyclerView.scrollBy(-scrolledX, 0);
            }
            fux.b(TAG, TAG, "onAppear correct index。  oldIndex = " + dXNativeAutoLoopRecyclerView.getCurrentIndex() + ";newIndex = " + scrolledX2 + ";delta = " + (scrolledX2 - dXNativeAutoLoopRecyclerView.getCurrentIndex()));
            dXNativeAutoLoopRecyclerView.setCurrentIndex(scrolledX2);
            if (this.avoidIndexDeltaToLarge_Android && !fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dXNativeAutoLoopRecyclerView.scrollToPosition(scrolledX2);
                    }
                }
            })) {
                fux.b(TAG, TAG, "onAppear correct index scrollToPosition failed, position =  " + scrolledX2);
                com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s("dinamicx");
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_ERROR, com.taobao.android.dinamicx.s.DX_ERROR_CODE_SLIDER_LAYOUT_APPEAR_SCROLL_TO_FAILED);
                aVar.e = "onAppear correct index scrollToPosition failed, position =  " + scrolledX2;
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
            if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() != null) {
                dXNativeAutoLoopRecyclerView.getOnPageChangeListener().a(scrolledX2);
            }
            final x.b bVar = (x.b) dXNativeAutoLoopRecyclerView.getTag(DX_TAG_HAS_SCROLL_LISTENER);
            fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (scrolledX2 == 0) {
                        bVar.a(1);
                        bVar.a(com.taobao.android.detail.ttdetail.bizmessage.o.SCROLLING);
                        bVar.a(0);
                    }
                    bVar.a(com.taobao.android.detail.ttdetail.bizmessage.o.SCROLLING);
                }
            });
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DX_SLIDER_LAYOUT_AUTO_SCROLL) {
            if (i == 0) {
                z = false;
            }
            this.autoScroll = z;
        } else if (j == DX_SLIDER_LAYOUT_AUTO_SCROLL_INTERVAL) {
            this.autoScrollInterval = Math.max(0, i);
        } else if (j == DX_SLIDER_LAYOUT_PAGE_INDEX) {
            this.pageIndex = Math.max(0, i);
        } else if (j == -3537170322378136036L) {
            if (i == 0) {
                z = false;
            }
            this.isInfinite = z;
        } else if (j == DX_SLIDER_LAYOUT_MANUAL_SWITCH_ENABLED) {
            if (i == 0) {
                z = false;
            }
            this.manualSwitchEnabled = z;
        } else if (j == DXSLIDERLAYOUT_DISABLEPAGESELECTANDSTARTTIMEONPRERENDER) {
            if (i == 0) {
                z = false;
            }
            this.disablePageSelectAndstartTimeOnPreRender = z;
        } else if (j == DXSLIDERLAYOUT_INTERCEPTTOUCHEVENT) {
            this.interceptTouchEvent = i;
        } else if (j == DXSLIDERLAYOUT_AVOIDINCESSANTSCROLL) {
            if (i == 0) {
                z = false;
            }
            this.avoidIncessantScroll = z;
        } else if (j == DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGE_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.avoidIndexDeltaToLarge_Android = z;
        } else if (j == DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGEFIRST_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.avoidIndexDeltaToLargeFirst_Android = z;
        } else if (j == DXSLIDERLAYOUT_ISINTERCEPTMULTIPOINTTOUCH) {
            if (i == 0) {
                z = false;
            }
            this.isInterceptMultipointTouch = z;
        } else if (j == DXSLIDERLAYOUT_SCROLLWITHPOSTMSG) {
            if (i == 0) {
                z = false;
            }
            this.scrollWithPostMsg = z;
        } else if (j == DXSLIDERLAYOUT_OVERRIDECANSCROLLHORIZONTALLY) {
            if (i == 0) {
                z = false;
            }
            this.overrideCanScrollHorizontal = z;
        } else if (j == DXSLIDERLAYOUT_ISCORRECTIONSLIDEOFFSET_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.isCorrectionSlideOffset_Android = z;
        } else if (j == DXSLIDERLAYOUT_ISENABLEEDGECHECK_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.isEnableEdgeCheck_Android = z;
        } else if (j == 6042404229400734461L) {
            if (i == 0) {
                z = false;
            }
            this.enablePreRender = z;
        } else if (j == DXSLIDERLAYOUT_NEEDMANUALSTOPLOOP) {
            if (i == 0) {
                z = false;
            }
            this.needManualStopLoop = z;
        } else if (j == DXSLIDERLAYOUT_ENABLEINFINITYEDGECHECK) {
            if (i == 0) {
                z = false;
            }
            this.enableInfinityEdgeCheck = z;
        } else if (j == DXSLIDERLAYOUT_USERSCROLLTOPOSITIONWHENRENDER_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.useDefaultScrollFinite = z;
        } else if (j == DXSLIDERLAYOUT_ISCANPARENTTOUCHWHENEDGE_ANDROID) {
            if (i == 0) {
                z = false;
            }
            this.isCanParentTouchWhenEdge_Android = z;
        } else if (j == DXSLIDERLAYOUT_IGNOREPLAYCONTROL) {
            if (i == 0) {
                z = false;
            }
            this.ignorePlayControl = z;
        } else if (j == DXSLIDERLAYOUT_NEEDMANUALSTOPLOOPONMOVE) {
            if (i == 0) {
                z = false;
            }
            this.needManualStopLoopOnMove = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DX_SLIDER_LAYOUT_AUTO_SCROLL) {
            return 0;
        }
        if (j == DX_SLIDER_LAYOUT_AUTO_SCROLL_INTERVAL) {
            return 1000;
        }
        if (j == -3537170322378136036L) {
            return 0;
        }
        if (j == DX_SLIDER_LAYOUT_MANUAL_SWITCH_ENABLED) {
            return 1;
        }
        if (j == DXSLIDERLAYOUT_DISABLEPAGESELECTANDSTARTTIMEONPRERENDER || j == DX_SLIDER_LAYOUT_PAGE_INDEX) {
            return 0;
        }
        if (j == DXSLIDERLAYOUT_ISINTERCEPTMULTIPOINTTOUCH) {
            return 1;
        }
        if (j != DXSLIDERLAYOUT_AVOIDINDEXDELTATOLARGE_ANDROID && j != DXSLIDERLAYOUT_SCROLLWITHPOSTMSG && j != DXSLIDERLAYOUT_ISCORRECTIONSLIDEOFFSET_ANDROID && j != DXSLIDERLAYOUT_ISENABLEEDGECHECK_ANDROID) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    /* loaded from: classes5.dex */
    public static class e extends x.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean e;
        private boolean f;

        static {
            kge.a(1305217327);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 2142696127) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public e(boolean z, boolean z2) {
            this.e = z2;
            this.f = z;
        }

        @Override // com.taobao.android.dinamicx.widget.x.b, android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int size;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            final int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            final DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) recyclerView;
            if (i != 0) {
                if (findFirstVisibleItemPosition != 0 || findLastVisibleItemPosition != 1 || i != 1) {
                    return;
                }
                fux.b(DXSliderLayout.TAG, DXSliderLayout.TAG, "first = 0 && last = 1 protect index。set current index = " + findFirstVisibleItemPosition);
                dXNativeAutoLoopRecyclerView.setCurrentIndex(findFirstVisibleItemPosition);
                if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() == null) {
                    return;
                }
                dXNativeAutoLoopRecyclerView.getOnPageChangeListener().a(findFirstVisibleItemPosition);
            } else if (dXNativeAutoLoopRecyclerView.getCurrentIndex() != findFirstVisibleItemPosition && findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                fux.b(DXSliderLayout.TAG, DXSliderLayout.TAG, "onScrollStateChanged state idle。 currentIndex = " + dXNativeAutoLoopRecyclerView.getCurrentIndex() + ";firstVisiblePosition = " + findFirstVisibleItemPosition + ";delta = " + (findFirstVisibleItemPosition - dXNativeAutoLoopRecyclerView.getCurrentIndex()));
                dXNativeAutoLoopRecyclerView.setCurrentIndex(findFirstVisibleItemPosition);
                if (this.e && !fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            dXNativeAutoLoopRecyclerView.scrollToPosition(findFirstVisibleItemPosition);
                        }
                    }
                })) {
                    fux.b(DXSliderLayout.TAG, DXSliderLayout.TAG, "onScrollStateChanged state idle scrollToPosition failed, position =  " + findFirstVisibleItemPosition);
                    com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s("dinamicx");
                    s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_ERROR, com.taobao.android.dinamicx.s.DX_ERROR_CODE_SLIDER_LAYOUT_IDLE_SCROLL_TO_FAILED);
                    aVar.e = "onScrollStateChanged state idle scrollToPosition failed, position =  " + findFirstVisibleItemPosition;
                    sVar.c.add(aVar);
                    com.taobao.android.dinamicx.monitor.b.a(sVar);
                }
                if (dXNativeAutoLoopRecyclerView.getOnPageChangeListener() != null) {
                    dXNativeAutoLoopRecyclerView.getOnPageChangeListener().a(findFirstVisibleItemPosition);
                }
                if (a().getOrientation() != 0) {
                    return;
                }
                x.b bVar = (x.b) dXNativeAutoLoopRecyclerView.getTag(x.DX_TAG_HAS_SCROLL_LISTENER);
                int measuredWidth = a().getMeasuredWidth();
                if (measuredWidth == 0 || bVar.b % measuredWidth == 0) {
                    return;
                }
                if (bVar != null && bVar.a() != null && bVar.a().itemWidgetNodes != null && this.f && (size = bVar.a().itemWidgetNodes.size()) > 0 && findFirstVisibleItemPosition > 100) {
                    findFirstVisibleItemPosition %= size;
                }
                int measuredWidth2 = findFirstVisibleItemPosition * a().getMeasuredWidth();
                dXNativeAutoLoopRecyclerView.setScrolledX(measuredWidth2);
                dXNativeAutoLoopRecyclerView.setScrolledY(0);
                bVar.a(measuredWidth2);
                bVar.b(0);
                a(recyclerView, this.f12211a);
                a("scroll_end");
            } else if (!this.f) {
            } else {
                int measuredWidth3 = a().getMeasuredWidth();
                x.b bVar2 = (x.b) dXNativeAutoLoopRecyclerView.getTag(x.DX_TAG_HAS_SCROLL_LISTENER);
                if ((bVar2.b % measuredWidth3 == 0 || findFirstVisibleItemPosition != findLastVisibleItemPosition) && ((bVar2.b / measuredWidth3) % 4 == dXNativeAutoLoopRecyclerView.getCurrentIndex() % 4 || findFirstVisibleItemPosition != findLastVisibleItemPosition)) {
                    return;
                }
                int currentIndex = (dXNativeAutoLoopRecyclerView.getCurrentIndex() % 4) * a().getMeasuredWidth();
                dXNativeAutoLoopRecyclerView.setScrolledX(currentIndex);
                dXNativeAutoLoopRecyclerView.setScrolledY(0);
                bVar2.a(currentIndex);
                bVar2.b(0);
                a(recyclerView, this.f12211a);
                a("scroll_end");
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class d implements DXNativeAutoLoopRecyclerView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private DXSliderLayout f12026a;
        private int b;
        private DXPageChangeEvent c = new DXPageChangeEvent(DXSliderLayout.DX_SLIDER_LAYOUT_ON_PAGE_CHANGE);

        static {
            kge.a(1359852673);
            kge.a(-908686115);
        }

        public d(DXSliderLayout dXSliderLayout, int i) {
            this.f12026a = dXSliderLayout;
            this.b = i;
        }

        @Override // com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (this.b == 0) {
                DXRuntimeContext dXRuntimeContext = this.f12026a.getDXRuntimeContext();
                com.taobao.android.dinamicx.s sVar = new com.taobao.android.dinamicx.s(dXRuntimeContext.A());
                sVar.b = dXRuntimeContext.c();
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, com.taobao.android.dinamicx.s.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0);
                aVar.e = "position=" + i;
                sVar.c.add(aVar);
            } else {
                DXRuntimeContext dXRuntimeContext2 = this.f12026a.getDXRuntimeContext();
                if (dXRuntimeContext2 == null) {
                    return;
                }
                DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) dXRuntimeContext2.v();
                WeakReference<View> weakReference = null;
                if (dXNativeAutoLoopRecyclerView == null) {
                    com.taobao.android.dinamicx.s sVar2 = new com.taobao.android.dinamicx.s(dXRuntimeContext2.A());
                    sVar2.b = dXRuntimeContext2.c();
                    s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, 200001);
                    aVar2.g = false;
                    DXWidgetNode referenceNode = this.f12026a.getReferenceNode();
                    if (referenceNode != null) {
                        weakReference = referenceNode.getWRView();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("flattenWidgetNode is");
                    String str = "null";
                    sb.append(referenceNode == null ? str : "notNull");
                    sb.append("weakReferenceView is");
                    if (weakReference != null) {
                        str = "notNull";
                    }
                    sb.append(str);
                    aVar2.e = sb.toString();
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("thread info:");
                        sb2.append(Thread.currentThread().getName());
                        DXWidgetNode d = dXRuntimeContext2.d();
                        if (d != null) {
                            sb2.append("expandedWT != null\n ");
                            if (d.getReferenceNode() == null) {
                                sb2.append("flatten == null");
                            }
                        } else {
                            sb2.append("expandedWT == null\n ");
                        }
                        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                        if (stackTrace != null) {
                            for (int i2 = 0; i2 < stackTrace.length; i2++) {
                                sb2.append(stackTrace[i2].getClassName() + "#" + stackTrace[i2].getMethodName() + " #" + stackTrace[i2].getLineNumber() + "\n");
                            }
                        }
                        fux.b(sb2.toString());
                        aVar2.e += sb2.toString();
                        return;
                    } catch (Throwable th) {
                        try {
                            com.taobao.android.dinamicx.exception.a.b(th);
                            return;
                        } finally {
                            sVar2.c.add(aVar2);
                            com.taobao.android.dinamicx.monitor.b.a(sVar2);
                        }
                    }
                }
                dXNativeAutoLoopRecyclerView.setSaveInstanceState(null);
                if (DXSliderLayout.access$000(this.f12026a)) {
                    this.c.setPageIndex(i % this.b, dXNativeAutoLoopRecyclerView.isTouched());
                } else {
                    this.c.setPageIndex(i, dXNativeAutoLoopRecyclerView.isTouched());
                }
                if (this.f12026a.indicatorWidgetNode != null) {
                    this.f12026a.indicatorWidgetNode.postEvent(this.c);
                }
                this.f12026a.setPageIndex(this.c.pageIndex);
                this.f12026a.postEvent(this.c);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2059095509);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1437011289) {
                return super.b(((Number) objArr[0]).intValue());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, x xVar) {
            super(context, xVar);
        }

        @Override // com.taobao.android.dinamicx.widget.x.c, android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : (this.b == null || this.b.size() == 0) ? 0 : Integer.MAX_VALUE;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.b;
            return arrayList.get(i % arrayList.size()).getAutoId();
        }

        @Override // com.taobao.android.dinamicx.widget.x.c
        public DXWidgetNode b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("55a70d59", new Object[]{this, new Integer(i)}) : super.b(i % this.b.size());
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends x.c implements gbf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1054429055);
            kge.a(1251810611);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1933644911) {
                super.c((DXWidgetNode) objArr[0], ((Number) objArr[1]).intValue(), (x.c.a) objArr[2]);
                return null;
            } else if (hashCode == -1522145154) {
                return super.a((ViewGroup) objArr[0], ((Number) objArr[1]).intValue());
            } else {
                if (hashCode != 1560786832) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.b((DXWidgetNode) objArr[0], ((Number) objArr[1]).intValue(), (x.c.a) objArr[2]);
                return null;
            }
        }

        public c(Context context, x xVar) {
            super(context, xVar);
        }

        @Override // com.taobao.android.dinamicx.widget.x.c
        public View a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("a545e87e", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (!(this.c instanceof DXSliderLayout)) {
                return super.a(viewGroup, i);
            }
            gbf access$100 = DXSliderLayout.access$100((DXSliderLayout) this.c);
            if (access$100 == null) {
                return super.a(viewGroup, i);
            }
            View a2 = access$100.a(i);
            return a2 != null ? a2 : super.a(viewGroup, i);
        }

        @Override // com.taobao.android.dinamicx.widget.x.c
        public void c(DXWidgetNode dXWidgetNode, int i, x.c.a aVar) {
            gbf access$100;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cbeeb91", new Object[]{this, dXWidgetNode, new Integer(i), aVar});
                return;
            }
            super.c(dXWidgetNode, i, aVar);
            if (!(this.c instanceof DXSliderLayout) || (access$100 = DXSliderLayout.access$100((DXSliderLayout) this.c)) == null) {
                return;
            }
            access$100.b(i);
        }

        @Override // tb.gbf.a
        public boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
            }
            DXWidgetNode b = b(i);
            return b != null && b.getDXRuntimeContext().v() == null;
        }

        @Override // tb.gbf.a
        public View a(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("8b6e872f", new Object[]{this, recyclerView, new Integer(i)});
            }
            x.c.a aVar = (x.c.a) mo1596onCreateViewHolder(recyclerView, getItemViewType(i));
            super.b(b(i), i, aVar);
            return aVar.itemView;
        }
    }

    public void startTimer() {
        DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else if (!(getDXRuntimeContext().v() instanceof DXNativeAutoLoopRecyclerView) || (dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().v()) == null || !this.isInfinite || this.autoScrollInterval <= 0 || !this.autoScroll || !this.scrollEnabled) {
        } else {
            dXNativeAutoLoopRecyclerView.setInterval(this.autoScrollInterval);
            dXNativeAutoLoopRecyclerView.setAutoPlay(true);
            if (!this.disablePageSelectAndstartTimeOnPreRender || !isPreRender()) {
                dXNativeAutoLoopRecyclerView.startTimer();
            }
            dXNativeAutoLoopRecyclerView.setTouched(false);
        }
    }

    public void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
        } else if (!(getDXRuntimeContext().v() instanceof DXNativeAutoLoopRecyclerView)) {
        } else {
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().v();
            dXNativeAutoLoopRecyclerView.stopTimer();
            dXNativeAutoLoopRecyclerView.setAutoPlay(false);
        }
    }

    public void scrollToPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8dfa01", new Object[]{this, new Integer(i)});
        } else if (!(getDXRuntimeContext().v() instanceof DXNativeAutoLoopRecyclerView)) {
        } else {
            final DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().v();
            DXSliderLayout dXSliderLayout = (DXSliderLayout) getDXRuntimeContext().d();
            final int calculateTargetIndex = calculateTargetIndex(dXSliderLayout, i);
            if (dXSliderLayout.isInfinite) {
                fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        dXNativeAutoLoopRecyclerView.scrollToPosition(calculateTargetIndex);
                        dXNativeAutoLoopRecyclerView.setCurrentIndex(calculateTargetIndex);
                    }
                });
            } else {
                scrollToIndexOnIsNotInfinite(dXNativeAutoLoopRecyclerView, dXSliderLayout, calculateTargetIndex);
            }
            DXNativeAutoLoopRecyclerView.c onPageChangeListener = dXNativeAutoLoopRecyclerView.getOnPageChangeListener();
            if (this.disablePageSelectAndstartTimeOnPreRender && isPreRender()) {
                return;
            }
            onPageChangeListener.a(calculateTargetIndex);
        }
    }

    public void smoothScrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i)});
        } else if (!(getDXRuntimeContext().v() instanceof DXNativeAutoLoopRecyclerView)) {
        } else {
            final DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = (DXNativeAutoLoopRecyclerView) getDXRuntimeContext().v();
            final int calculateTargetIndex = calculateTargetIndex((DXSliderLayout) getDXRuntimeContext().d(), i);
            fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    dXNativeAutoLoopRecyclerView.smoothScrollToPosition(calculateTargetIndex);
                    dXNativeAutoLoopRecyclerView.setCurrentIndex(calculateTargetIndex);
                }
            });
            DXNativeAutoLoopRecyclerView.c onPageChangeListener = dXNativeAutoLoopRecyclerView.getOnPageChangeListener();
            if (this.disablePageSelectAndstartTimeOnPreRender && isPreRender()) {
                return;
            }
            onPageChangeListener.a(calculateTargetIndex);
        }
    }

    private int calculateTargetIndex(DXSliderLayout dXSliderLayout, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf1e5fee", new Object[]{this, dXSliderLayout, new Integer(i)})).intValue();
        }
        int size = dXSliderLayout.itemWidgetNodes != null ? dXSliderLayout.itemWidgetNodes.size() : 0;
        if (!dXSliderLayout.isInfinite || this.enableInfinityEdgeCheck) {
            i2 = i;
        } else {
            i2 = size != 0 ? ((536870911 / size) * size) + i : 0;
        }
        fux.b(TAG, TAG, "calculateTargetIndex = " + i2 + ";pageIndex = " + i + ";itemCount = " + size);
        return i2;
    }

    private void scrollToIndexOnIsNotInfinite(final DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, DXSliderLayout dXSliderLayout, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9429de46", new Object[]{this, dXNativeAutoLoopRecyclerView, dXSliderLayout, new Integer(i)});
            return;
        }
        this.useDefaultScrollFinite = true;
        if (i <= 0 && !this.useDefaultScrollFinite) {
            return;
        }
        if (getOrientation() == 0 && !this.useDefaultScrollFinite) {
            final x.b bVar = (x.b) dXNativeAutoLoopRecyclerView.getTag(DX_TAG_HAS_SCROLL_LISTENER);
            dXNativeAutoLoopRecyclerView.needScrollAfterLayout(i * getMeasuredWidth(), 0, dXSliderLayout.contentHorizontalLength, dXSliderLayout.contentVerticalLength);
            bVar.a(dXNativeAutoLoopRecyclerView, new DXSetPageIndexEvent(DX_SLIDER_LAYOUT_ON_SET_PAGE_INDEX));
            fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        bVar.a(com.taobao.android.detail.ttdetail.bizmessage.o.SCROLLING);
                    }
                }
            });
            return;
        }
        fxe.b(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXSliderLayout.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    dXNativeAutoLoopRecyclerView.scrollToPosition(i);
                }
            }
        });
    }

    private boolean isPreRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3d4411a", new Object[]{this})).booleanValue() : fqi.aW() ? Thread.currentThread() != Looper.getMainLooper().getThread() : getDXRuntimeContext().x() == 2;
    }

    public boolean isEnablePagingPreRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3857716b", new Object[]{this})).booleanValue() : this.enablePreRender;
    }

    public boolean canAutoPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4088147e", new Object[]{this})).booleanValue() : this.isInfinite && this.autoScrollInterval > 0 && this.autoScroll && this.scrollEnabled;
    }
}
