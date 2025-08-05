package com.taobao.android.icart.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.PullBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bbz;
import tb.bei;
import tb.bek;
import tb.kge;
import tb.nkj;
import tb.nkk;
import tb.nkn;

/* loaded from: classes5.dex */
public class CartRecyclerView extends ParentRecyclerView implements com.taobao.ptr.d, com.taobao.ptr.g, com.taobao.ptr.h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter mAdapter;
    private bbz mCartPresenter;
    private com.taobao.android.icart.recommend.b mCartRecommend;
    private com.taobao.ptr.e mDelegate;
    private View mEndView;
    private ArrayList<nkk> mEndViewInfos;
    public ViewGroup mFooterView;
    private boolean mIsDisable;
    private com.taobao.android.icart.widget.refresh.b mLoadingHelper;
    private a mOnEndViewExposure;
    private PtrBase mParent;
    private ArrayList<nkk> mStartViewInfos;
    private ColorStateList mTextColor;

    /* renamed from: com.taobao.android.icart.widget.CartRecyclerView$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12869a = new int[PullBase.Mode.values().length];

        static {
            try {
                f12869a[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-1389350826);
        kge.a(-1419130634);
        kge.a(959043519);
        kge.a(-1161140236);
    }

    public static /* synthetic */ Object ipc$super(CartRecyclerView cartRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -133698345:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 249482071:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public CartRecyclerView(Context context) {
        super(context);
        this.mStartViewInfos = new ArrayList<>();
        this.mEndViewInfos = new ArrayList<>();
    }

    public CartRecyclerView(Context context, AttributeSet attributeSet) {
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

    public void setOnEndViewExposure(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f628f8e9", new Object[]{this, aVar});
        } else {
            this.mOnEndViewExposure = aVar;
        }
    }

    public int getStartViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue() : this.mStartViewInfos.size();
    }

    public int getEndViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue() : this.mEndViewInfos.size();
    }

    public void setFooterView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98ea9a8", new Object[]{this, viewGroup});
        } else {
            this.mFooterView = viewGroup;
        }
    }

    public void setCartRecommend(com.taobao.android.icart.recommend.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f32d5a", new Object[]{this, bVar});
        } else {
            this.mCartRecommend = bVar;
        }
    }

    public void setCartPresenter(bbz bbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a45ea3", new Object[]{this, bbzVar});
        } else {
            this.mCartPresenter = bbzVar;
        }
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
            this.mEndViewInfos.add(new nkk(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof nkj)) {
                this.mAdapter = new nkj(this.mStartViewInfos, this.mEndViewInfos, adapter);
                super.setAdapter(this.mAdapter);
                return;
            }
            adapter.notifyItemInserted(adapter.getItemCount() - 1);
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

    public boolean isEndViewExists(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669eab1d", new Object[]{this, view})).booleanValue();
        }
        ArrayList<nkk> arrayList = this.mEndViewInfos;
        if (arrayList != null && view != null) {
            Iterator<nkk> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().a() == view) {
                    return true;
                }
            }
        }
        return false;
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
                gridLayoutManager.setSpanSizeLookup(new com.taobao.android.icart.widget.refresh.a(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
        applyStyle();
        onUpdateDirection(getPullDirection());
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        this.mAdapter = new nkj(this.mStartViewInfos, this.mEndViewInfos, adapter);
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

    public final void setEndLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eb5018", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColor = colorStateList;
        com.taobao.android.icart.widget.refresh.b bVar = this.mLoadingHelper;
        if (bVar == null) {
            return;
        }
        bVar.a(colorStateList);
    }

    public final void setEndLoadingDelegate(com.taobao.ptr.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f092f96d", new Object[]{this, eVar});
            return;
        }
        this.mDelegate = eVar;
        com.taobao.android.icart.widget.refresh.b bVar = this.mLoadingHelper;
        if (bVar == null) {
            return;
        }
        bVar.a(eVar);
        onUpdateDirection(getPullDirection());
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue() : this.mIsDisable;
    }

    private void applyStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7640f9ea", new Object[]{this});
        } else if (getLayoutManager() == null) {
        } else {
            setEndLoadingTextColor(this.mTextColor);
            setEndLoadingDelegate(this.mDelegate);
        }
    }

    @Override // com.taobao.ptr.d
    public int getReadyToRefreshingValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985a7f7", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (AnonymousClass2.f12869a[mode.ordinal()] != 1) {
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c4b782a", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue() : AnonymousClass2.f12869a[mode.ordinal()] != 1 ? -1 : 0;
    }

    @Override // com.taobao.ptr.g
    public void onUpdateDirection(int i) {
        com.taobao.android.icart.widget.refresh.b bVar;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else if (getLayoutManager() == null || (bVar = this.mLoadingHelper) == null) {
        } else {
            if (bVar != null) {
                bVar.b(i);
            }
            if (isDisable()) {
                return;
            }
            removeEndView(this.mEndView);
            this.mEndView = null;
            com.taobao.android.icart.widget.refresh.b bVar2 = this.mLoadingHelper;
            if (bVar2 == null || (a2 = bVar2.a((ViewGroup) this)) == null) {
                return;
            }
            addEndView(a2);
            this.mEndView = a2;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        int findLastVisibleItemPosition = getLayoutManager() instanceof LinearLayoutManager ? ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition() : -1;
        if (findLastVisibleItemPosition == -1 || getLayoutManager().findViewByPosition(findLastVisibleItemPosition) != this.mEndView || (aVar = this.mOnEndViewExposure) == null) {
            return;
        }
        aVar.a();
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

    private PtrLayout disableIntrinsicPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrLayout) ipChange.ipc$dispatch("1429f4d8", new Object[]{this});
        }
        PtrBase ptrBase = this.mParent;
        if (ptrBase == null) {
            return null;
        }
        PtrLayout mo1211getEndLayout = ptrBase.mo1211getEndLayout();
        if (mo1211getEndLayout != null) {
            mo1211getEndLayout.disableIntrinsicPullFeature(true);
        }
        return mo1211getEndLayout;
    }

    @Override // com.taobao.ptr.g
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        disableIntrinsicPull();
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue() : isAttachedToWindow() && this.mDisabledDirection < 0;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue() : isAttachedToWindow() && this.mDisabledDirection > 0;
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (!(pullBase instanceof PtrBase)) {
        } else {
            PtrBase ptrBase = (PtrBase) pullBase;
            this.mParent = ptrBase;
            ptrBase.addEndPtrProxy(this);
            PtrLayout disableIntrinsicPull = disableIntrinsicPull();
            if (pullBase.getMode() == PullBase.Mode.PULL_FROM_START || pullBase.getMode() == PullBase.Mode.DISABLED) {
                this.mIsDisable = true;
            }
            this.mLoadingHelper = new com.taobao.android.icart.widget.refresh.b(disableIntrinsicPull);
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
            this.mParent = null;
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.removeEndPtrProxy(this);
            removeEndView(this.mEndView);
            this.mEndView = null;
            this.mLoadingHelper = null;
            this.mIsDisable = true;
            ptrBase.mo1211getEndLayout().disableIntrinsicPullFeature(false);
        }
    }

    public void updatePaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50409a5a", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mFooterView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new Runnable() { // from class: com.taobao.android.icart.widget.CartRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int recyclerViewPaddingBottom = CartRecyclerView.this.getRecyclerViewPaddingBottom();
                CartRecyclerView cartRecyclerView = CartRecyclerView.this;
                cartRecyclerView.setPadding(cartRecyclerView.getPaddingLeft(), CartRecyclerView.this.getPaddingTop(), CartRecyclerView.this.getPaddingRight(), recyclerViewPaddingBottom);
            }
        });
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.android.icart.recommend.b bVar = this.mCartRecommend;
        if (bVar != null && bVar.i()) {
            setPadding(0, 0, 0, 0);
        } else {
            updatePaddingBottom();
        }
        super.onMeasure(i, i2);
    }

    public int getRecyclerViewPaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d1f513c", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.mFooterView;
        if (viewGroup == null) {
            return 0;
        }
        DXRootView a2 = bek.a(viewGroup, "submit");
        return Math.max(bei.b(this.mCartPresenter) + (a2 != null ? a2.getMeasuredHeight() : 0), 0);
    }
}
