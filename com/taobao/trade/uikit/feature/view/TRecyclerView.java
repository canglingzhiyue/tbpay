package com.taobao.trade.uikit.feature.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trade.uikit.feature.utils.FeatureList;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.quv;
import tb.quw;
import tb.qux;
import tb.quy;

/* loaded from: classes9.dex */
public class TRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ITEM_VIEW_TYPE_HEADER_FOOTER = Integer.MIN_VALUE;
    private FeatureList<RecyclerView> mFeatureList;
    private ArrayList<View> mFooterViews;
    private GestureDetector mGestureDetector;
    private ArrayList<View> mHeaderViews;
    private e mItemClickListener;
    private f mItemLongClickListener;
    private List<RecyclerView.OnScrollListener> mOnScrollListeners;
    private List<RecyclerView.RecyclerListener> mRecyclerListeners;

    /* loaded from: classes9.dex */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final FrameLayout f22997a;

        static {
            kge.a(399102000);
        }

        public a(View view) {
            super(view);
            this.f22997a = (FrameLayout) view;
        }
    }

    /* loaded from: classes9.dex */
    public interface e {
    }

    /* loaded from: classes9.dex */
    public interface f {
        boolean a(TRecyclerView tRecyclerView, View view, int i, long j);
    }

    static {
        kge.a(1753699698);
        kge.a(-1205469799);
        kge.a(-248912894);
        kge.a(-674440531);
    }

    public static /* synthetic */ Object ipc$super(TRecyclerView tRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
            case -658988465:
                super.setRecyclerListener((RecyclerView.RecyclerListener) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -133698345:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 232961461:
                super.setOnScrollListener((RecyclerView.OnScrollListener) objArr[0]);
                return null;
            case 249482071:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 320377877:
                return new Integer(super.computeHorizontalScrollOffset());
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 637394958:
                super.swapAdapter((RecyclerView.Adapter) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 678958088:
                super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1545798951:
                return new Integer(super.computeVerticalScrollOffset());
            case 1560169965:
                super.measureChild((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ List access$000(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8e285f4f", new Object[]{tRecyclerView}) : tRecyclerView.mOnScrollListeners;
    }

    public static /* synthetic */ List access$100(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("55344650", new Object[]{tRecyclerView}) : tRecyclerView.mRecyclerListeners;
    }

    public static /* synthetic */ boolean access$200(TRecyclerView tRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21a68791", new Object[]{tRecyclerView, new Integer(i)})).booleanValue() : tRecyclerView.isHeaderOrFooter(i);
    }

    public static /* synthetic */ e access$300(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("d48dbab3", new Object[]{tRecyclerView}) : tRecyclerView.mItemClickListener;
    }

    public static /* synthetic */ f access$400(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("1508d071", new Object[]{tRecyclerView}) : tRecyclerView.mItemLongClickListener;
    }

    public TRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFeatureList = new FeatureList<>(this);
        this.mOnScrollListeners = new ArrayList();
        this.mRecyclerListeners = new ArrayList();
        this.mHeaderViews = new ArrayList<>();
        this.mFooterViews = new ArrayList<>();
        super.setOnScrollListener(new b());
        super.setRecyclerListener(new c());
        this.mFeatureList.init(context, attributeSet, i);
    }

    public TRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TRecyclerView(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2b5b5", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListeners.add(onScrollListener);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, com.alilive.adapter.uikit.b
    public void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d87d0d3", new Object[]{this, onScrollListener});
        } else if (onScrollListener == null) {
        } else {
            this.mOnScrollListeners.remove(onScrollListener);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.RecyclerListener recyclerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b8a24f", new Object[]{this, recyclerListener});
        } else {
            this.mRecyclerListeners.add(recyclerListener);
        }
    }

    public void removeRecyclerListener(RecyclerView.RecyclerListener recyclerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85dbd6d", new Object[]{this, recyclerListener});
        } else if (recyclerListener == null) {
        } else {
            this.mRecyclerListeners.remove(recyclerListener);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.mFeatureList.get(i3);
        }
        super.onMeasure(i, i2);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            this.mFeatureList.get(i4);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mFeatureList.get(i5);
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            this.mFeatureList.get(i6);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            this.mFeatureList.get(i);
        }
        super.draw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            this.mFeatureList.get(i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            this.mFeatureList.get(i);
        }
        super.dispatchDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            this.mFeatureList.get(i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            this.mFeatureList.get(i);
        }
        super.onDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            this.mFeatureList.get(i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            com.taobao.trade.uikit.feature.features.a aVar = this.mFeatureList.get(i);
            if (aVar instanceof quy) {
                ((quy) aVar).beforeOnTouchEvent(motionEvent);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            com.taobao.trade.uikit.feature.features.a aVar2 = this.mFeatureList.get(i2);
            if (aVar2 instanceof quy) {
                ((quy) aVar2).afterOnTouchEvent(motionEvent);
            }
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            com.taobao.trade.uikit.feature.features.a aVar = this.mFeatureList.get(i);
            if (aVar instanceof quy) {
                ((quy) aVar).beforeDispatchTouchEvent(motionEvent);
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            com.taobao.trade.uikit.feature.features.a aVar2 = this.mFeatureList.get(i2);
            if (aVar2 instanceof quy) {
                ((quy) aVar2).afterDispatchTouchEvent(motionEvent);
            }
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mFeatureList.get(i2);
        }
        super.onFocusChanged(z, i, rect);
        for (int i3 = size - 1; i3 >= 0; i3--) {
            this.mFeatureList.get(i3);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            this.mFeatureList.get(i);
        }
        super.onWindowFocusChanged(z);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            this.mFeatureList.get(i2);
        }
    }

    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    public void measureChild(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbe2b6", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            super.measureChild(view, i, i2);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9105d4f", new Object[]{this, canvas, view, new Long(j), new Integer(i)})).booleanValue() : super.drawChild(canvas, view, j);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            com.taobao.trade.uikit.feature.features.a aVar = this.mFeatureList.get(size);
            if (aVar instanceof quv) {
                onInterceptTouchEvent |= ((quv) aVar).a(motionEvent);
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            com.taobao.trade.uikit.feature.features.a aVar = this.mFeatureList.get(i);
            if (aVar instanceof qux) {
                ((qux) aVar).beforeComputeScroll();
            }
        }
        super.computeScroll();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            com.taobao.trade.uikit.feature.features.a aVar2 = this.mFeatureList.get(i2);
            if (aVar2 instanceof qux) {
                ((qux) aVar2).afterComputeScroll();
            }
        }
    }

    public boolean addFeature(com.taobao.trade.uikit.feature.features.a<? super RecyclerView> aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6efb3c96", new Object[]{this, aVar})).booleanValue() : this.mFeatureList.addFeature(aVar);
    }

    public com.taobao.trade.uikit.feature.features.a<? super RecyclerView> findFeature(Class<? extends com.taobao.trade.uikit.feature.features.a<? super RecyclerView>> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.trade.uikit.feature.features.a) ipChange.ipc$dispatch("bb36da17", new Object[]{this, cls}) : this.mFeatureList.findFeature(cls);
    }

    public boolean removeFeature(Class<? extends com.taobao.trade.uikit.feature.features.a<? super RecyclerView>> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue() : this.mFeatureList.removeFeature(cls);
    }

    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
        } else {
            this.mFeatureList.clearFeatures();
        }
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mFeatureList.init(context, attributeSet, i);
        }
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 1;
        }
        return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
    }

    /* loaded from: classes9.dex */
    public class b extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(968172292);
        }

        public b() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            int size = TRecyclerView.access$000(TRecyclerView.this).size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.OnScrollListener onScrollListener = (RecyclerView.OnScrollListener) TRecyclerView.access$000(TRecyclerView.this).get(i2);
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(recyclerView, i);
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            int size = TRecyclerView.access$000(TRecyclerView.this).size();
            for (int i3 = 0; i3 < size; i3++) {
                ((RecyclerView.OnScrollListener) TRecyclerView.access$000(TRecyclerView.this).get(i3)).onScrolled(recyclerView, i, i2);
            }
        }
    }

    /* loaded from: classes9.dex */
    public class c implements RecyclerView.RecyclerListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-329981257);
            kge.a(-1300391530);
        }

        public c() {
        }

        @Override // android.support.v7.widget.RecyclerView.RecyclerListener
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b10b5391", new Object[]{this, viewHolder});
                return;
            }
            int size = TRecyclerView.access$100(TRecyclerView.this).size();
            for (int i = 0; i < size; i++) {
                RecyclerView.RecyclerListener recyclerListener = (RecyclerView.RecyclerListener) TRecyclerView.access$100(TRecyclerView.this).get(i);
                if (recyclerListener != null) {
                    recyclerListener.onViewRecycled(viewHolder);
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class HeaderViewAdapter extends RecyclerView.Adapter implements Filterable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ArrayList<View> EMPTY_INFO_LIST;
        private final RecyclerView.Adapter mAdapter;
        public ArrayList<View> mFooterViews;
        public ArrayList<View> mHeaderViews;
        private final boolean mIsFilterable;
        private final RecyclerView mRecyclerView;

        public static /* synthetic */ Object ipc$super(HeaderViewAdapter headerViewAdapter, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1026650762) {
                super.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            } else if (hashCode != 1555132221) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            }
        }

        static {
            kge.a(1539961163);
            kge.a(723419645);
            EMPTY_INFO_LIST = new ArrayList<>();
        }

        public HeaderViewAdapter(ArrayList<View> arrayList, ArrayList<View> arrayList2, RecyclerView.Adapter adapter, RecyclerView recyclerView) {
            this.mAdapter = adapter;
            this.mRecyclerView = recyclerView;
            this.mIsFilterable = adapter instanceof Filterable;
            if (arrayList == null) {
                this.mHeaderViews = EMPTY_INFO_LIST;
            } else {
                this.mHeaderViews = arrayList;
            }
            if (arrayList2 == null) {
                this.mFooterViews = EMPTY_INFO_LIST;
            } else {
                this.mFooterViews = arrayList2;
            }
        }

        public int getHeadersCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ac0e499", new Object[]{this})).intValue() : this.mHeaderViews.size();
        }

        public int getFootersCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c80be27", new Object[]{this})).intValue() : this.mFooterViews.size();
        }

        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            return adapter == null || adapter.getItemCount() == 0;
        }

        public boolean removeHeader(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fcf7459e", new Object[]{this, view})).booleanValue();
            }
            int size = this.mHeaderViews.size();
            for (int i = 0; i < size; i++) {
                if (this.mHeaderViews.get(i) == view) {
                    this.mHeaderViews.remove(i);
                    return true;
                }
            }
            return false;
        }

        public boolean removeFooter(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5285e2d0", new Object[]{this, view})).booleanValue();
            }
            int size = this.mFooterViews.size();
            for (int i = 0; i < size; i++) {
                if (this.mFooterViews.get(i) == view) {
                    this.mFooterViews.remove(i);
                    return true;
                }
            }
            return false;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            int headersCount = getHeadersCount();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null && i >= headersCount && (i2 = i - headersCount) < adapter.getItemCount()) {
                return this.mAdapter.getItemId(i2);
            }
            return -1L;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            if (this.mAdapter != null) {
                return getFootersCount() + getHeadersCount() + this.mAdapter.getItemCount();
            }
            return getFootersCount() + getHeadersCount();
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (i != Integer.MIN_VALUE) {
                RecyclerView.Adapter adapter = this.mAdapter;
                if (adapter == null) {
                    return null;
                }
                return adapter.mo1596onCreateViewHolder(viewGroup, i);
            }
            return new a(new FrameLayout(this.mRecyclerView.getContext()));
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            int headersCount = getHeadersCount();
            int footersCount = getFootersCount();
            if (i < headersCount || i >= getItemCount() - footersCount) {
                a aVar = (a) viewHolder;
                aVar.f22997a.removeAllViews();
                if (i < headersCount) {
                    View view = this.mHeaderViews.get(i);
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    aVar.f22997a.addView(view);
                } else {
                    int i3 = i - headersCount;
                    RecyclerView.Adapter adapter = this.mAdapter;
                    if (adapter != null) {
                        i2 = adapter.getItemCount();
                    }
                    View view2 = this.mFooterViews.get(i3 - i2);
                    if (view2.getParent() != null) {
                        ((ViewGroup) view2.getParent()).removeView(view2);
                    }
                    aVar.f22997a.addView(view2);
                }
                ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = this.mRecyclerView.getLayoutManager().generateDefaultLayoutParams();
                    aVar.itemView.setLayoutParams(layoutParams);
                }
                if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                    return;
                } else if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
                    return;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    return;
                }
            }
            int i4 = i - headersCount;
            RecyclerView.Adapter adapter2 = this.mAdapter;
            if (adapter2 == null) {
                return;
            }
            adapter2.onBindViewHolder(viewHolder, i4);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            int headersCount = getHeadersCount();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null && i >= headersCount && (i2 = i - headersCount) < adapter.getItemCount()) {
                return this.mAdapter.getItemViewType(i2);
            }
            return Integer.MIN_VALUE;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2ce8d76", new Object[]{this, adapterDataObserver});
                return;
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                adapter.registerAdapterDataObserver(adapterDataObserver);
            }
            super.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb16f3d", new Object[]{this, adapterDataObserver});
                return;
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(adapterDataObserver);
            }
            super.unregisterAdapterDataObserver(adapterDataObserver);
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Filter) ipChange.ipc$dispatch("2ce20823", new Object[]{this});
            }
            if (!this.mIsFilterable) {
                return null;
            }
            return ((Filterable) this.mAdapter).getFilter();
        }

        public RecyclerView.Adapter getWrappedAdapter() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("b9986b32", new Object[]{this}) : this.mAdapter;
        }
    }

    public final void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
        } else {
            addHeaderView(this.mHeaderViews.size(), view);
        }
    }

    public final void addHeaderView(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5a1d49", new Object[]{this, new Integer(i), view});
            return;
        }
        this.mHeaderViews.add(i, view);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof HeaderViewAdapter)) {
                setAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this));
            } else {
                adapter.notifyDataSetChanged();
            }
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        setLayoutManager(layoutManager);
    }

    public final void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else {
            addFooterView(this.mFooterViews.size(), view);
        }
    }

    public final void addFooterView(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7ef57", new Object[]{this, new Integer(i), view});
            return;
        }
        this.mFooterViews.add(i, view);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof HeaderViewAdapter)) {
                setAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this));
            } else {
                adapter.notifyDataSetChanged();
            }
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        setLayoutManager(layoutManager);
    }

    public final boolean removeHeaderView(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ddd9b9", new Object[]{this, view})).booleanValue();
        }
        if (this.mHeaderViews.size() <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || !((HeaderViewAdapter) adapter).removeHeader(view)) {
            z = false;
        } else {
            adapter.notifyDataSetChanged();
        }
        removeFixedViewInfo(view, this.mHeaderViews);
        return z;
    }

    public final boolean removeFooterView(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9968deb", new Object[]{this, view})).booleanValue();
        }
        if (this.mFooterViews.size() <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || !((HeaderViewAdapter) adapter).removeFooter(view)) {
            z = false;
        } else {
            adapter.notifyDataSetChanged();
        }
        removeFixedViewInfo(view, this.mFooterViews);
        return z;
    }

    private void removeFixedViewInfo(View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1c5f82", new Object[]{this, view, arrayList});
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == view) {
                arrayList.remove(i);
                return;
            }
        }
    }

    public int getHeaderViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("643b079e", new Object[]{this})).intValue() : this.mHeaderViews.size();
    }

    public int getFooterViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68376a2c", new Object[]{this})).intValue() : this.mFooterViews.size();
    }

    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : (getTotalCount() - getHeaderViewsCount()) - getFooterViewsCount();
    }

    public int getTotalCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            com.taobao.trade.uikit.feature.features.a aVar = this.mFeatureList.get(i);
            if (aVar instanceof quw) {
                if (adapter instanceof HeaderViewAdapter) {
                    adapter = ((quw) aVar).a(((HeaderViewAdapter) adapter).getWrappedAdapter());
                } else {
                    adapter = ((quw) aVar).a(adapter);
                }
            }
        }
        if (adapter != null && !(adapter instanceof HeaderViewAdapter) && (this.mHeaderViews.size() > 0 || this.mFooterViews.size() > 0)) {
            super.setAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this));
        } else {
            super.setAdapter(adapter);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25fde00e", new Object[]{this, adapter, new Boolean(z)});
        } else if (adapter != null && !(adapter instanceof HeaderViewAdapter) && (this.mHeaderViews.size() > 0 || this.mFooterViews.size() > 0)) {
            super.swapAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this), z);
        } else {
            super.swapAdapter(adapter, z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        GridLayoutManager gridLayoutManager;
        GridLayoutManager.SpanSizeLookup spanSizeLookup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f807ecd7", new Object[]{this, layoutManager});
            return;
        }
        if ((layoutManager instanceof GridLayoutManager) && ((this.mHeaderViews.size() > 0 || this.mFooterViews.size() > 0) && ((spanSizeLookup = (gridLayoutManager = (GridLayoutManager) layoutManager).getSpanSizeLookup()) == null || !(spanSizeLookup instanceof g)))) {
            gridLayoutManager.setSpanSizeLookup(new g(spanSizeLookup));
        }
        super.setLayoutManager(layoutManager);
    }

    private boolean isHeaderOrFooter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2f91ab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return getAdapter() == null || i < getHeaderViewsCount() || i >= getAdapter().getItemCount() - getFooterViewsCount();
    }

    /* loaded from: classes9.dex */
    public class g extends GridLayoutManager.SpanSizeLookup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final GridLayoutManager.SpanSizeLookup b;

        static {
            kge.a(-596342855);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1691818968) {
                if (hashCode == -823858072) {
                    super.setSpanIndexCacheEnabled(((Boolean) objArr[0]).booleanValue());
                    return null;
                } else if (hashCode != 418174172) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.invalidateSpanIndexCache();
                    return null;
                }
            }
            return new Boolean(super.isSpanIndexCacheEnabled());
        }

        public g(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.b = spanSizeLookup;
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
            }
            if (TRecyclerView.access$200(TRecyclerView.this, i)) {
                return ((GridLayoutManager) TRecyclerView.this.getLayoutManager()).getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.b;
            if (spanSizeLookup == null) {
                return 1;
            }
            return spanSizeLookup.getSpanSize(i - TRecyclerView.this.getHeaderViewsCount());
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public void setSpanIndexCacheEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cee4ec68", new Object[]{this, new Boolean(z)});
                return;
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.b;
            if (spanSizeLookup != null) {
                spanSizeLookup.setSpanIndexCacheEnabled(z);
            } else {
                super.setSpanIndexCacheEnabled(z);
            }
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public void invalidateSpanIndexCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18ecd4dc", new Object[]{this});
                return;
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.b;
            if (spanSizeLookup != null) {
                spanSizeLookup.invalidateSpanIndexCache();
            } else {
                super.invalidateSpanIndexCache();
            }
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public boolean isSpanIndexCacheEnabled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9b28e428", new Object[]{this})).booleanValue();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.b;
            if (spanSizeLookup != null) {
                return spanSizeLookup.isSpanIndexCacheEnabled();
            }
            return super.isSpanIndexCacheEnabled();
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i, int i2) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("310d928c", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (!TRecyclerView.access$200(TRecyclerView.this, i) && (spanSizeLookup = this.b) != null) {
                return spanSizeLookup.getSpanIndex(i - TRecyclerView.this.getHeaderViewsCount(), i2);
            }
            return 0;
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanGroupIndex(int i, int i2) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c54c24d", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (!TRecyclerView.access$200(TRecyclerView.this, i) && (spanSizeLookup = this.b) != null) {
                return spanSizeLookup.getSpanGroupIndex(i - TRecyclerView.this.getHeaderViewsCount(), i2);
            }
            return 0;
        }
    }

    public void setOnItemClickListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb663f5f", new Object[]{this, eVar});
            return;
        }
        this.mItemClickListener = eVar;
        if (eVar == null) {
            return;
        }
        addGestureDetectorIfNeed();
    }

    public void setOnItemLongClickListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212fbf5a", new Object[]{this, fVar});
            return;
        }
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.mItemLongClickListener = fVar;
        if (fVar == null) {
            return;
        }
        addGestureDetectorIfNeed();
    }

    private void addGestureDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddf3248", new Object[]{this});
        } else if (this.mGestureDetector != null) {
        } else {
            this.mGestureDetector = new GestureDetector(getContext(), new d(this) { // from class: com.taobao.trade.uikit.feature.view.TRecyclerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.trade.uikit.feature.view.TRecyclerView.d
                public boolean a(TRecyclerView tRecyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("a1ffb370", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)})).booleanValue();
                    }
                    if (TRecyclerView.access$300(TRecyclerView.this) == null) {
                        return false;
                    }
                    TRecyclerView.access$300(TRecyclerView.this);
                    return true;
                }

                @Override // com.taobao.trade.uikit.feature.view.TRecyclerView.d
                public boolean b(TRecyclerView tRecyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a2ce31f1", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)})).booleanValue() : TRecyclerView.access$400(TRecyclerView.this) != null && TRecyclerView.access$400(TRecyclerView.this).a(tRecyclerView, view, i, j);
                }
            });
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
        this.mItemClickListener = null;
        this.mItemLongClickListener = null;
    }

    /* loaded from: classes9.dex */
    public static abstract class d extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final TRecyclerView f23000a;
        private View b;

        static {
            kge.a(-1189868230);
        }

        public abstract boolean a(TRecyclerView tRecyclerView, View view, int i, long j);

        public abstract boolean b(TRecyclerView tRecyclerView, View view, int i, long j);

        public d(TRecyclerView tRecyclerView) {
            this.f23000a = tRecyclerView;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
            }
            this.b = this.f23000a.findChildViewUnder((int) motionEvent.getX(), (int) motionEvent.getY());
            return this.b != null;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
                return;
            }
            View view = this.b;
            if (view == null) {
                return;
            }
            view.setPressed(true);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            View view = this.b;
            if (view != null) {
                view.setPressed(false);
                int childPosition = this.f23000a.getChildPosition(this.b);
                long itemId = this.f23000a.getAdapter().getItemId(childPosition);
                int headerViewsCount = childPosition - this.f23000a.getHeaderViewsCount();
                if (!TRecyclerView.access$200(this.f23000a, childPosition)) {
                    z = a(this.f23000a, this.b, headerViewsCount, itemId);
                }
                this.b = null;
            }
            return z;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            View view = this.b;
            if (view == null) {
                return false;
            }
            view.setPressed(false);
            this.b = null;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            View view = this.b;
            if (view == null) {
                return;
            }
            int childPosition = this.f23000a.getChildPosition(view);
            if (!(!TRecyclerView.access$200(this.f23000a, childPosition) ? b(this.f23000a, this.b, childPosition - this.f23000a.getHeaderViewsCount(), this.f23000a.getAdapter().getItemId(childPosition)) : false)) {
                return;
            }
            this.b.setPressed(false);
            this.b = null;
        }
    }

    public int getVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("89715f46", new Object[]{this})).intValue() : super.computeVerticalScrollOffset();
    }

    public int getHorizontalScrollOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2638e274", new Object[]{this})).intValue() : super.computeHorizontalScrollOffset();
    }
}
