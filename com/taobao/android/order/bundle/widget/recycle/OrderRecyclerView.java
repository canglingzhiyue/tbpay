package com.taobao.android.order.bundle.widget.recycle;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.nkj;
import tb.nkk;

/* loaded from: classes6.dex */
public class OrderRecyclerView extends ParentRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter adapter;
    public OrderConfigs.BizNameType bizType;
    private boolean enableWeexNestedScroll;
    private View endView;
    private ArrayList<nkk> endViewInfos;
    private boolean isDisable;
    private boolean isLastMotionInWeex;
    private boolean isRecyclerViewTouchDown;
    private boolean isWeexTouchDown;
    private boolean needDispatchTouchEventToWeex;
    private RecyclerView.OnFlingListener onFlingListener;
    private View.OnTouchListener onTouchListener;
    private ArrayList<nkk> startViewInfos;
    private ColorStateList textColor;
    private View weexContainer;

    static {
        kge.a(922603396);
    }

    public static /* synthetic */ Object ipc$super(OrderRecyclerView orderRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1228744384:
                return new Boolean(super.canScrollVertically(((Number) objArr[0]).intValue()));
            case -133698345:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 249482071:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public OrderRecyclerView(Context context) {
        super(context);
        this.startViewInfos = new ArrayList<>();
        this.endViewInfos = new ArrayList<>();
        this.enableWeexNestedScroll = false;
    }

    public OrderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.startViewInfos = new ArrayList<>();
        this.endViewInfos = new ArrayList<>();
        this.enableWeexNestedScroll = false;
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue() : this.startViewInfos.size();
    }

    public int getEndViewsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue() : this.endViewInfos.size();
    }

    public boolean hasStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476981a2", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<nkk> it = this.startViewInfos.iterator();
        while (it.hasNext()) {
            nkk next = it.next();
            if (next != null && view == next.a()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86952009", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<nkk> it = this.endViewInfos.iterator();
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
            this.endViewInfos.add(new nkk(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.adapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof nkj)) {
                this.adapter = new c(this.startViewInfos, this.endViewInfos, adapter, this.bizType);
                super.setAdapter(this.adapter);
                return;
            }
            adapter.notifyItemInserted(adapter.getItemCount() - 1);
        }
    }

    public boolean removeEndView(View view) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce6d073", new Object[]{this, view})).booleanValue();
        }
        if (this.endViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int size = this.endViewInfos.size();
        int indexOfFixedInfos = indexOfFixedInfos(this.endViewInfos, view);
        RecyclerView.Adapter adapter = this.adapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((nkj) this.adapter).b(view)) {
                this.adapter.notifyItemRemoved(itemCount - (size - indexOfFixedInfos));
                if (view.getParent() == this) {
                    removeView(view);
                }
                z = true;
                return !z || removeFixedViewInfo(view, this.endViewInfos);
            }
        }
        z = false;
        if (!z) {
        }
    }

    public boolean removeAllEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a9a07b", new Object[]{this})).booleanValue();
        }
        int size = this.endViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.adapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((nkj) this.adapter).e()) {
                this.adapter.notifyItemRangeRemoved(itemCount - size, size);
                Iterator<nkk> it = this.endViewInfos.iterator();
                while (it.hasNext()) {
                    nkk next = it.next();
                    if (next != null && next.a() != null && next.a().getParent() == this) {
                        removeView(next.a());
                    }
                }
            }
        }
        this.endViewInfos.clear();
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
                gridLayoutManager.setSpanSizeLookup(new d(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() != 0) {
                return super.canScrollVertically(i);
            }
            View findViewByPosition = layoutManager.findViewByPosition(0);
            if (findViewByPosition != null && findViewByPosition.getHeight() == 0) {
                return false;
            }
            return super.canScrollVertically(i);
        }
        return super.canScrollVertically(i);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        this.adapter = new c(this.startViewInfos, this.endViewInfos, adapter, this.bizType);
        super.setAdapter(this.adapter);
    }

    private void spanStaggeredGridStartEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7420474", new Object[]{this});
            return;
        }
        spanStaggeredGridViews(this.startViewInfos);
        spanStaggeredGridViews(this.endViewInfos);
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

    public boolean isDisableIntrinsicPullFeature() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("155fa1b5", new Object[]{this})).booleanValue() : isDisable();
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue() : this.isDisable;
    }

    public final View getEndView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("16948b73", new Object[]{this}) : this.endView;
    }

    public void registerOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ed5eca", new Object[]{this, onTouchListener});
        } else {
            this.onTouchListener = onTouchListener;
        }
    }

    public void unregisterOnTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c313da1f", new Object[]{this});
        } else {
            this.onTouchListener = null;
        }
    }

    public void registerOnFlingListener(RecyclerView.OnFlingListener onFlingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87546436", new Object[]{this, onFlingListener});
        } else {
            this.onFlingListener = onFlingListener;
        }
    }

    public void unregisterOnFlingListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44cfc4bc", new Object[]{this});
        } else {
            this.onFlingListener = null;
        }
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        RecyclerView.OnFlingListener onFlingListener = this.onFlingListener;
        if (onFlingListener != null) {
            onFlingListener.onFling(i, i2);
        }
        return super.fling(i, i2);
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.onTouchListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        if (!this.enableWeexNestedScroll) {
            return super.onTouchEvent(motionEvent);
        }
        boolean isInWeexContainer = isInWeexContainer();
        int action = motionEvent.getAction();
        if (this.weexContainer != null && isInWeexContainer) {
            if (!this.isLastMotionInWeex) {
                this.isRecyclerViewTouchDown = false;
                this.isLastMotionInWeex = true;
            }
            if (action == 0) {
                this.isWeexTouchDown = true;
            } else if (action == 2 && !this.isWeexTouchDown) {
                this.needDispatchTouchEventToWeex = true;
                motionEvent.setAction(0);
                this.weexContainer.dispatchTouchEvent(motionEvent);
                this.isWeexTouchDown = true;
                motionEvent.setAction(2);
            } else if (action == 1 || action == 3) {
                this.isWeexTouchDown = false;
                this.needDispatchTouchEventToWeex = false;
                super.onTouchEvent(motionEvent);
                return this.weexContainer.dispatchTouchEvent(motionEvent);
            }
            if (this.needDispatchTouchEventToWeex) {
                return this.weexContainer.dispatchTouchEvent(motionEvent);
            }
        }
        if (this.isLastMotionInWeex && !isInWeexContainer) {
            this.isWeexTouchDown = false;
            if (action == 0) {
                this.isRecyclerViewTouchDown = true;
            } else if (action == 2 && !this.isRecyclerViewTouchDown) {
                this.isRecyclerViewTouchDown = true;
                motionEvent.setAction(1);
                super.onTouchEvent(motionEvent);
                motionEvent.setAction(0);
                super.onTouchEvent(motionEvent);
                motionEvent.setAction(2);
            }
        }
        if (!isInWeexContainer) {
            this.isLastMotionInWeex = false;
        }
        if (action == 1 || action == 3) {
            this.isWeexTouchDown = false;
            this.needDispatchTouchEventToWeex = false;
            this.isRecyclerViewTouchDown = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void addWeexContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cec3ac", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.weexContainer = view;
            this.enableWeexNestedScroll = true;
        }
    }

    public void removeWeexContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d4e1e3", new Object[]{this});
            return;
        }
        this.enableWeexNestedScroll = false;
        this.weexContainer = null;
    }

    private boolean isInWeexContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54d49dc", new Object[]{this})).booleanValue();
        }
        return this.weexContainer != null && !(getLayoutManager() instanceof e ? ((e) getLayoutManager()).canScrollVertically() : true);
    }
}
