package com.taobao.android.tbsku.image;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jcw;
import tb.jcx;
import tb.jcy;
import tb.kge;

/* loaded from: classes6.dex */
public class RecyclerViewFixed extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter mAdapter;
    private boolean mAsTargetView;
    private ArrayList<jcx> mEndViewInfos;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private float mLastMotionX;
    private float mLastMotionY;
    private ArrayList<jcx> mStartViewInfos;
    private a mWindowStateListener;

    /* loaded from: classes6.dex */
    public interface a {
    }

    static {
        kge.a(-553821591);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewFixed recyclerViewFixed, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -133698345:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 249482071:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public RecyclerViewFixed(Context context) {
        super(context);
        this.mStartViewInfos = new ArrayList<>();
        this.mEndViewInfos = new ArrayList<>();
    }

    public RecyclerViewFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStartViewInfos = new ArrayList<>();
        this.mEndViewInfos = new ArrayList<>();
    }

    public RecyclerViewFixed(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStartViewInfos = new ArrayList<>();
        this.mEndViewInfos = new ArrayList<>();
    }

    private boolean removeFixedViewInfo(View view, ArrayList<jcx> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1c5f86", new Object[]{this, view, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jcx jcxVar = arrayList.get(i);
            if (jcxVar.a() == view) {
                if (view.getParent() == this) {
                    removeView(view);
                }
                if (arrayList.remove(i) == jcxVar) {
                    return true;
                }
            }
        }
        return false;
    }

    private int indexOfFixedInfos(List<jcx> list, View view) {
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
        Iterator<jcx> it = this.mStartViewInfos.iterator();
        while (it.hasNext()) {
            jcx next = it.next();
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
            this.mStartViewInfos.add(new jcx(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof jcw)) {
                this.mAdapter = new jcw(this.mStartViewInfos, this.mEndViewInfos, adapter);
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
        if (adapter == null || !((jcw) adapter).a(view)) {
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
        if (adapter != null && ((jcw) adapter).c()) {
            this.mAdapter.notifyItemRangeRemoved(0, size);
            Iterator<jcx> it = this.mStartViewInfos.iterator();
            while (it.hasNext()) {
                jcx next = it.next();
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
        Iterator<jcx> it = this.mEndViewInfos.iterator();
        while (it.hasNext()) {
            jcx next = it.next();
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
            this.mEndViewInfos.add(Math.max(this.mEndViewInfos.size(), 0), new jcx(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof jcw)) {
                this.mAdapter = new jcw(this.mStartViewInfos, this.mEndViewInfos, adapter);
                super.setAdapter(this.mAdapter);
                return;
            }
            this.mAdapter.notifyItemInserted(adapter.getItemCount() - 1);
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
            if (((jcw) this.mAdapter).b(view)) {
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
            if (((jcw) this.mAdapter).d()) {
                this.mAdapter.notifyItemRangeRemoved(itemCount - size, size);
                Iterator<jcx> it = this.mEndViewInfos.iterator();
                while (it.hasNext()) {
                    jcx next = it.next();
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
                gridLayoutManager.setSpanSizeLookup(new jcy(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        this.mAdapter = new jcw(this.mStartViewInfos, this.mEndViewInfos, adapter);
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

    private void spanStaggeredGridViews(List<jcx> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb6fc7e", new Object[]{this, list});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (list == null || !(layoutManager instanceof StaggeredGridLayoutManager)) {
            return;
        }
        for (jcx jcxVar : list) {
            View a2 = jcxVar.a();
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

    public void setWindowStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831ea323", new Object[]{this, aVar});
        } else {
            this.mWindowStateListener = aVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }

    public void treatAsTargetView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a917fd8b", new Object[]{this, new Boolean(z)});
        } else {
            this.mAsTargetView = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0 != 3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[RETURN] */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbsku.image.RecyclerViewFixed.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r9
            r1[r4] = r10
            java.lang.String r10 = "a9b14c3a"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L1c:
            int r0 = r10.getActionMasked()
            if (r0 == r4) goto L70
            if (r0 == r2) goto L28
            r1 = 3
            if (r0 == r1) goto L70
            goto L79
        L28:
            float r0 = r10.getY()
            float r1 = r10.getX()
            float r2 = r9.mLastMotionX
            float r2 = r1 - r2
            float r5 = r9.mLastMotionY
            float r5 = r0 - r5
            float r6 = r9.mInitialMotionX
            float r6 = r1 - r6
            float r6 = java.lang.Math.abs(r6)
            float r7 = r9.mInitialMotionY
            float r7 = r0 - r7
            float r7 = java.lang.Math.abs(r7)
            boolean r8 = r9.mAsTargetView
            if (r8 == 0) goto L6b
            float r2 = java.lang.Math.abs(r2)
            float r5 = java.lang.Math.abs(r5)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            int r2 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r2 >= 0) goto L5d
            goto L5f
        L5d:
            r2 = 0
            goto L60
        L5f:
            r2 = 1
        L60:
            if (r2 != 0) goto L6b
            android.view.ViewParent r2 = r9.getParent()
            if (r2 == 0) goto L6b
            r2.requestDisallowInterceptTouchEvent(r3)
        L6b:
            r9.mLastMotionY = r0
            r9.mLastMotionX = r1
            goto L79
        L70:
            r0 = 0
            r9.mInitialMotionY = r0
            r9.mLastMotionY = r0
            r9.mInitialMotionX = r0
            r9.mLastMotionX = r0
        L79:
            boolean r10 = super.onTouchEvent(r10)
            boolean r0 = r9.mAsTargetView
            if (r0 == 0) goto L82
            return r4
        L82:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.RecyclerViewFixed.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != 3) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[RETURN] */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.tbsku.image.RecyclerViewFixed.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r5
            r1[r4] = r6
            java.lang.String r6 = "e7b587fe"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            int r0 = r6.getActionMasked()
            if (r0 == 0) goto L41
            if (r0 == r4) goto L37
            if (r0 == r2) goto L2a
            r1 = 3
            if (r0 == r1) goto L37
            goto L60
        L2a:
            float r0 = r6.getY()
            r5.mLastMotionY = r0
            float r0 = r6.getX()
            r5.mLastMotionX = r0
            goto L60
        L37:
            r0 = 0
            r5.mInitialMotionY = r0
            r5.mLastMotionY = r0
            r5.mInitialMotionX = r0
            r5.mLastMotionX = r0
            goto L60
        L41:
            float r0 = r6.getY()
            r5.mInitialMotionY = r0
            r5.mLastMotionY = r0
            float r0 = r6.getX()
            r5.mInitialMotionX = r0
            r5.mLastMotionX = r0
            boolean r0 = r5.mAsTargetView
            if (r0 == 0) goto L60
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L5e
            r0.requestDisallowInterceptTouchEvent(r4)
        L5e:
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            boolean r1 = r5.childFirstIntercept(r5)
            r1 = r1 ^ r4
            if (r1 == 0) goto L73
            boolean r6 = super.onInterceptTouchEvent(r6)
            boolean r1 = r5.mAsTargetView
            r0 = r0 & r1
            if (r0 == 0) goto L72
            return r4
        L72:
            return r6
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.RecyclerViewFixed.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean childFirstIntercept(ViewGroup viewGroup) {
        boolean childInterceptValue;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1082eef8", new Object[]{this, viewGroup})).booleanValue();
        }
        if (viewGroup == null) {
            return false;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                childInterceptValue = childFirstIntercept((ViewGroup) childAt);
            } else {
                childInterceptValue = getChildInterceptValue(childAt);
            }
            z = childInterceptValue | z;
        }
        return getChildInterceptValue(viewGroup) | z;
    }

    private boolean getChildInterceptValue(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eecba7a", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Object tag = view.getTag(R.id.sku_child_first_intercept);
        if (!(tag instanceof Boolean)) {
            return false;
        }
        return ((Boolean) tag).booleanValue();
    }
}
