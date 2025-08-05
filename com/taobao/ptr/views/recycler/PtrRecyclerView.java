package com.taobao.ptr.views.recycler;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.c;
import com.taobao.ptr.d;
import com.taobao.ptr.e;
import com.taobao.ptr.f;
import com.taobao.ptr.g;
import com.taobao.ptr.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nkj;
import tb.nkk;
import tb.nkl;
import tb.nkm;
import tb.nkn;

/* loaded from: classes7.dex */
public class PtrRecyclerView extends RecyclerView implements d, g, h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter mAdapter;
    private e mDelegate;
    private boolean mEdgeViewSafeMode;
    private View mEndView;
    private ArrayList<nkk> mEndViewInfos;
    private GestureDetector mGestureDetector;
    private boolean mIsDisable;
    private a mItemClickListener;
    private b mItemLongClickListener;
    private Drawable mLoadingDrawable;
    private f mLoadingHelper;
    private c mOnLastItemVisibleListener;
    private ArrayList<nkk> mStartViewInfos;
    private ColorStateList mTextColor;
    private RecyclerView.OnScrollListener onScrollListener;

    /* renamed from: com.taobao.ptr.views.recycler.PtrRecyclerView$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18965a = new int[PullBase.Mode.values().length];

        static {
            try {
                f18965a[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface a {
        boolean a(RecyclerView recyclerView, View view, int i, long j);
    }

    /* loaded from: classes7.dex */
    public interface b {
        boolean a(RecyclerView recyclerView, View view, int i, long j);
    }

    static {
        kge.a(-1295902505);
        kge.a(-1419130634);
        kge.a(959043519);
        kge.a(-1161140236);
    }

    public static /* synthetic */ Object ipc$super(PtrRecyclerView ptrRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -133698345) {
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            } else if (hashCode != 249482071) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ a access$000(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("2066ec50", new Object[]{ptrRecyclerView}) : ptrRecyclerView.mItemClickListener;
    }

    public static /* synthetic */ b access$100(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e8c5110e", new Object[]{ptrRecyclerView}) : ptrRecyclerView.mItemLongClickListener;
    }

    public static /* synthetic */ RecyclerView.Adapter access$200(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("f16949c8", new Object[]{ptrRecyclerView}) : ptrRecyclerView.mAdapter;
    }

    public static /* synthetic */ c access$300(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("5385c866", new Object[]{ptrRecyclerView}) : ptrRecyclerView.mOnLastItemVisibleListener;
    }

    public PtrRecyclerView(Context context) {
        super(context);
        this.mStartViewInfos = new ArrayList<>();
        this.mEndViewInfos = new ArrayList<>();
    }

    public PtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStartViewInfos = new ArrayList<>();
        this.mEndViewInfos = new ArrayList<>();
    }

    private boolean removeFixedViewInfo(View view, ArrayList<nkk> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1c5f86", new Object[]{this, view, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nkk nkkVar = arrayList.get(i);
            if (nkkVar.a() == view) {
                if (view.getParent() == this) {
                    removeView(view);
                }
                if (arrayList.remove(i) == nkkVar) {
                    return true;
                }
            }
        }
        return false;
    }

    private int indexOfFixedInfos(List<nkk> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c08fb73", new Object[]{this, list, view})).intValue();
        }
        if (list != null && view != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).b() == view.hashCode()) {
                    return i;
                }
            }
        }
        return 0;
    }

    public int getStartViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue() : this.mStartViewInfos.size();
    }

    public int getEndViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue() : this.mEndViewInfos.size();
    }

    public boolean hasStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476981a2", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<nkk> it = this.mStartViewInfos.iterator();
        while (it.hasNext()) {
            nkk next = it.next();
            if (next != null && view == next.a()) {
                return true;
            }
        }
        return false;
    }

    public void addStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf378ba5", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mStartViewInfos.add(new nkk(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof nkj)) {
                this.mAdapter = new nkj(this.mStartViewInfos, this.mEndViewInfos, adapter).a(this.mEdgeViewSafeMode);
                super.setAdapter(this.mAdapter);
                return;
            }
            adapter.notifyItemInserted(this.mStartViewInfos.size() - 1);
        }
    }

    public boolean removeStartView(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d010bf8c", new Object[]{this, view})).booleanValue();
        }
        if (this.mStartViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int indexOfFixedInfos = indexOfFixedInfos(this.mStartViewInfos, view);
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter == null || !((nkj) adapter).a(view)) {
            z = false;
        } else {
            this.mAdapter.notifyItemRemoved(indexOfFixedInfos);
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        return removeFixedViewInfo(view, this.mStartViewInfos) | z;
    }

    public boolean removeAllStartViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22d71994", new Object[]{this})).booleanValue();
        }
        int size = this.mStartViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && ((nkj) adapter).d()) {
            this.mAdapter.notifyItemRangeRemoved(0, size);
            Iterator<nkk> it = this.mStartViewInfos.iterator();
            while (it.hasNext()) {
                nkk next = it.next();
                if (next != null && next.a() != null && next.a().getParent() == this) {
                    removeView(next.a());
                }
            }
        }
        this.mStartViewInfos.clear();
        return true;
    }

    public boolean hasEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86952009", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<nkk> it = this.mEndViewInfos.iterator();
        while (it.hasNext()) {
            nkk next = it.next();
            if (next != null && view == next.a()) {
                return true;
            }
        }
        return false;
    }

    public void addEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749bffcc", new Object[]{this, view});
        } else if (view == null) {
        } else {
            nkk nkkVar = new nkk(view);
            int max = Math.max(this.mEndViewInfos.size(), 0);
            if (this.mEndView != null) {
                max = Math.max(max - 1, 0);
            }
            this.mEndViewInfos.add(max, nkkVar);
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof nkj)) {
                this.mAdapter = new nkj(this.mStartViewInfos, this.mEndViewInfos, adapter).a(this.mEdgeViewSafeMode);
                super.setAdapter(this.mAdapter);
                return;
            }
            int itemCount = adapter.getItemCount() - 1;
            if (this.mEndView != null) {
                itemCount = Math.max(itemCount - 1, 0);
            }
            this.mAdapter.notifyItemInserted(itemCount);
        }
    }

    public boolean removeEndView(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce6d073", new Object[]{this, view})).booleanValue();
        }
        if (this.mEndViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int size = this.mEndViewInfos.size();
        int indexOfFixedInfos = indexOfFixedInfos(this.mEndViewInfos, view);
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((nkj) this.mAdapter).b(view)) {
                this.mAdapter.notifyItemRemoved(itemCount - (size - indexOfFixedInfos));
                if (view.getParent() == this) {
                    removeView(view);
                }
                return removeFixedViewInfo(view, this.mEndViewInfos) | z;
            }
        }
        z = false;
        return removeFixedViewInfo(view, this.mEndViewInfos) | z;
    }

    public boolean removeAllEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a9a07b", new Object[]{this})).booleanValue();
        }
        int size = this.mEndViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((nkj) this.mAdapter).e()) {
                this.mAdapter.notifyItemRangeRemoved(itemCount - size, size);
                Iterator<nkk> it = this.mEndViewInfos.iterator();
                while (it.hasNext()) {
                    nkk next = it.next();
                    if (next != null && next.a() != null && next.a().getParent() == this) {
                        removeView(next.a());
                    }
                }
            }
        }
        this.mEndViewInfos.clear();
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f807ecd7", new Object[]{this, layoutManager});
            return;
        }
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new nkl(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
        applyStyle();
        onUpdateDirection(getPullDirection());
    }

    public void enableSafeModeWhenAddEdgeViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512f8104", new Object[]{this});
        } else {
            this.mEdgeViewSafeMode = true;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        this.mAdapter = new nkj(this.mStartViewInfos, this.mEndViewInfos, adapter).a(this.mEdgeViewSafeMode);
        super.setAdapter(this.mAdapter);
    }

    private void spanStaggeredGridStartEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7420474", new Object[]{this});
            return;
        }
        spanStaggeredGridViews(this.mStartViewInfos);
        spanStaggeredGridViews(this.mEndViewInfos);
    }

    private void spanStaggeredGridViews(List<nkk> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb6fc7e", new Object[]{this, list});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (list == null || !(layoutManager instanceof StaggeredGridLayoutManager)) {
            return;
        }
        for (nkk nkkVar : list) {
            View a2 = nkkVar.a();
            if (a2 != null) {
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                } else {
                    StaggeredGridLayoutManager.LayoutParams layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
                    layoutParams2.setFullSpan(true);
                    a2.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.mGestureDetector;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : onTouchEvent;
    }

    private void addGestureDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddf3248", new Object[]{this});
        } else if (this.mGestureDetector != null) {
        } else {
            this.mGestureDetector = new GestureDetector(getContext(), new nkm(this) { // from class: com.taobao.ptr.views.recycler.PtrRecyclerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nkm
                public boolean a(RecyclerView recyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("7f9e44a1", new Object[]{this, recyclerView, view, new Integer(i), new Long(j)})).booleanValue() : PtrRecyclerView.access$000(PtrRecyclerView.this) != null && PtrRecyclerView.access$000(PtrRecyclerView.this).a(recyclerView, view, i, j);
                }

                @Override // tb.nkm
                public boolean b(RecyclerView recyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("e9cdccc0", new Object[]{this, recyclerView, view, new Integer(i), new Long(j)})).booleanValue() : PtrRecyclerView.access$100(PtrRecyclerView.this) != null && PtrRecyclerView.access$100(PtrRecyclerView.this).a(recyclerView, view, i, j);
                }
            });
        }
    }

    private void addScrollDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37be2e", new Object[]{this});
        } else if (this.onScrollListener != null) {
        } else {
            this.onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.ptr.views.recycler.PtrRecyclerView.2
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
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i != 0 || PtrRecyclerView.access$200(PtrRecyclerView.this) == null || PtrRecyclerView.access$200(PtrRecyclerView.this).getItemCount() <= 0 || PtrRecyclerView.access$300(PtrRecyclerView.this) == null || nkn.d(PtrRecyclerView.this) != PtrRecyclerView.access$200(PtrRecyclerView.this).getItemCount() - 1) {
                        return;
                    }
                    PtrRecyclerView.access$300(PtrRecyclerView.this);
                }

                @Override // android.support.v7.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else {
                        super.onScrolled(recyclerView, i, i2);
                    }
                }
            };
            addOnScrollListener(this.onScrollListener);
        }
    }

    public final void setOnLastItemVisibleListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc7e343", new Object[]{this, cVar});
            return;
        }
        this.mOnLastItemVisibleListener = cVar;
        if (cVar == null) {
            return;
        }
        addScrollDetectorIfNeed();
    }

    public final void setOnItemLongClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce30d499", new Object[]{this, bVar});
            return;
        }
        this.mItemLongClickListener = bVar;
        if (bVar == null) {
            return;
        }
        addGestureDetectorIfNeed();
    }

    public final void setOnItemClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b9269e", new Object[]{this, aVar});
            return;
        }
        this.mItemClickListener = aVar;
        if (aVar == null) {
            return;
        }
        addGestureDetectorIfNeed();
    }

    public final void setEndLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eb5018", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColor = colorStateList;
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(colorStateList);
    }

    public final void setEndLoadingDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba8e6cc", new Object[]{this, drawable});
            return;
        }
        this.mLoadingDrawable = drawable;
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(drawable);
    }

    public final void setEndLoadingDelegate(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f092f96d", new Object[]{this, eVar});
            return;
        }
        this.mDelegate = eVar;
        f fVar = this.mLoadingHelper;
        if (fVar == null) {
            return;
        }
        fVar.a(eVar);
        onUpdateDirection(getPullDirection());
    }

    public final void disableEndPullFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a378d3cf", new Object[]{this, new Boolean(z)});
        } else if (z) {
            onDisable();
        } else {
            onEnable();
        }
    }

    public boolean isDisableIntrinsicPullFeature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155fa1b5", new Object[]{this})).booleanValue() : isDisable();
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue() : this.mIsDisable;
    }

    public final View getEndView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("16948b73", new Object[]{this}) : this.mEndView;
    }

    private void applyStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7640f9ea", new Object[]{this});
        } else if (getLayoutManager() == null) {
        } else {
            setEndLoadingTextColor(this.mTextColor);
            setEndLoadingDrawable(this.mLoadingDrawable);
            setEndLoadingDelegate(this.mDelegate);
        }
    }

    @Override // com.taobao.ptr.d
    public int getReadyToRefreshingValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985a7f7", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (AnonymousClass3.f18965a[mode.ordinal()] != 1) {
            return -1;
        }
        if (i != 1) {
            View view = this.mEndView;
            if (view == null) {
                return -1;
            }
            return view.getHeight();
        }
        View view2 = this.mEndView;
        if (view2 == null) {
            return -1;
        }
        return view2.getWidth();
    }

    @Override // com.taobao.ptr.d
    public int getReleaseTargetValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c4b782a", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue() : AnonymousClass3.f18965a[mode.ordinal()] != 1 ? -1 : 0;
    }

    @Override // com.taobao.ptr.g
    public void onUpdateDirection(int i) {
        f fVar;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else if (getLayoutManager() == null || (fVar = this.mLoadingHelper) == null) {
        } else {
            if (fVar != null) {
                fVar.b(i);
            }
            if (isDisable()) {
                return;
            }
            removeEndView(this.mEndView);
            this.mEndView = null;
            f fVar2 = this.mLoadingHelper;
            if (fVar2 == null || (a2 = fVar2.a(this)) == null) {
                return;
            }
            addEndView(a2);
            this.mEndView = a2;
        }
    }

    @Override // com.taobao.ptr.g
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a(f);
        }
    }

    @Override // com.taobao.ptr.g
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.b(f);
        }
    }

    @Override // com.taobao.ptr.g
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a();
        }
    }

    @Override // com.taobao.ptr.g
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a(charSequence);
        }
    }

    @Override // com.taobao.ptr.g
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.b();
        }
    }

    @Override // com.taobao.ptr.g
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (this.mLoadingHelper == null || isDisable()) {
        } else {
            this.mLoadingHelper.a(z, charSequence);
        }
    }

    @Override // com.taobao.ptr.g
    public void onDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d267c10", new Object[]{this});
            return;
        }
        this.mIsDisable = true;
        removeEndView(this.mEndView);
        this.mEndView = null;
    }

    @Override // com.taobao.ptr.g
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        onUpdateDirection(getPullDirection());
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue() : nkn.a(this) != 0 ? 0 : 1;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue() : nkn.c(this);
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue() : nkn.e(this);
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.addEndPtrProxy(this);
            PtrLayout mo1211getEndLayout = ptrBase.mo1211getEndLayout();
            if (mo1211getEndLayout != null) {
                mo1211getEndLayout.disableIntrinsicPullFeature(true);
            }
            if (pullBase.getMode() == PullBase.Mode.PULL_FROM_START || pullBase.getMode() == PullBase.Mode.DISABLED) {
                this.mIsDisable = true;
            }
            this.mLoadingHelper = new f(mo1211getEndLayout);
            applyStyle();
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.removeEndPtrProxy(this);
            removeEndView(this.mEndView);
            this.mEndView = null;
            this.mLoadingHelper = null;
            this.mIsDisable = true;
            ptrBase.mo1211getEndLayout().disableIntrinsicPullFeature(false);
        }
    }
}
