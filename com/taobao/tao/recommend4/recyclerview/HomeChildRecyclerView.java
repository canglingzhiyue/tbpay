package com.taobao.tao.recommend4.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ksk;
import tb.myb;
import tb.myd;
import tb.oof;

/* loaded from: classes8.dex */
public class HomeChildRecyclerView extends ChildRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HomeChildRecyclerView";
    private int childAttachCount;
    private boolean isDataSetChange;
    private RecyclerView.Adapter<?> mAdapter;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private final List<a> mDispatchTouchEventListenerList;
    private k mExposureListener;
    private List<b> mOnChildRecyclerViewLayoutListeners;
    private oof mRecyclerScrollStateChangeListener;
    private i mStayTimeListener;
    private final List<a> mTouchEventListeners;

    /* loaded from: classes8.dex */
    public interface a {
        void a(MotionEvent motionEvent);
    }

    static {
        kge.a(349697037);
    }

    public static /* synthetic */ Object ipc$super(HomeChildRecyclerView homeChildRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -814383425:
                super.onChildAttachedToWindow((View) objArr[0]);
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
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
            case 1643954692:
                super.onScrolledByNestedParent((myb) objArr[0]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$002(HomeChildRecyclerView homeChildRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1483d", new Object[]{homeChildRecyclerView, new Boolean(z)})).booleanValue();
        }
        homeChildRecyclerView.isDataSetChange = z;
        return z;
    }

    public HomeChildRecyclerView(Context context) {
        super(context);
        this.mRecyclerScrollStateChangeListener = new oof();
        this.childAttachCount = 0;
        this.isDataSetChange = false;
        this.mDispatchTouchEventListenerList = new CopyOnWriteArrayList();
        this.mTouchEventListeners = new CopyOnWriteArrayList();
    }

    public HomeChildRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRecyclerScrollStateChangeListener = new oof();
        this.childAttachCount = 0;
        this.isDataSetChange = false;
        this.mDispatchTouchEventListenerList = new CopyOnWriteArrayList();
        this.mTouchEventListeners = new CopyOnWriteArrayList();
    }

    public HomeChildRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRecyclerScrollStateChangeListener = new oof();
        this.childAttachCount = 0;
        this.isDataSetChange = false;
        this.mDispatchTouchEventListenerList = new CopyOnWriteArrayList();
        this.mTouchEventListeners = new CopyOnWriteArrayList();
    }

    public void attachExposureListener(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b8ca9f", new Object[]{this, kVar});
        } else {
            this.mExposureListener = kVar;
        }
    }

    public void attachStayTimeListener(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6676b860", new Object[]{this, iVar});
        } else {
            this.mStayTimeListener = iVar;
        }
    }

    public void updateContainerType(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c219726", new Object[]{this, kskVar});
            return;
        }
        i iVar = this.mStayTimeListener;
        if (iVar == null) {
            return;
        }
        iVar.a(kskVar);
    }

    @Override // com.taobao.nestedscroll.recyclerview.ChildRecyclerView, com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, tb.mya
    public void onScrolledByNestedParent(myb mybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fcc204", new Object[]{this, mybVar});
            return;
        }
        super.onScrolledByNestedParent(mybVar);
        k kVar = this.mExposureListener;
        if (kVar != null) {
            kVar.onScrollStateChanged(this, 0);
        }
        onScrolledByNestedParentEach(mybVar);
    }

    public void onScrolledByNestedParentEach(myb mybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7b525", new Object[]{this, mybVar});
            return;
        }
        i iVar = this.mStayTimeListener;
        if (iVar == null) {
            return;
        }
        iVar.onScrollStateChanged(this, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        notifyDispatchTouchEvent(motionEvent);
        myb nestedScrollParent = getNestedScrollParent();
        if (nestedScrollParent != null && (nestedScrollParent instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) nestedScrollParent;
            if (myd.a(recyclerView)) {
                recyclerView.requestDisallowInterceptTouchEvent(false);
            } else {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        notifyTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    private void notifyTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0da3a0", new Object[]{this, motionEvent});
        } else if (!this.mTouchEventListeners.isEmpty()) {
            for (a aVar : this.mTouchEventListeners) {
                aVar.a(motionEvent);
            }
        }
    }

    public void addOnTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a758db", new Object[]{this, aVar});
        } else {
            this.mTouchEventListeners.add(aVar);
        }
    }

    public void removeOnTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d38f87be", new Object[]{this, aVar});
        } else {
            this.mTouchEventListeners.remove(aVar);
        }
    }

    public void addDispatchTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f96c76", new Object[]{this, aVar});
        } else {
            this.mDispatchTouchEventListenerList.add(aVar);
        }
    }

    public void removeDispatchTouchEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cada519", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.mDispatchTouchEventListenerList;
        if (list == null || list.isEmpty() || aVar == null) {
            return;
        }
        this.mDispatchTouchEventListenerList.remove(aVar);
    }

    public void notifyDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427cd13a", new Object[]{this, motionEvent});
            return;
        }
        List<a> list = this.mDispatchTouchEventListenerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (a aVar : this.mDispatchTouchEventListenerList) {
            aVar.a(motionEvent);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        checkCallbackOnLayoutFinish();
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onChildAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf757ebf", new Object[]{this, view});
            return;
        }
        super.onChildAttachedToWindow(view);
        checkCallbackOnLayoutStart();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        i iVar = this.mStayTimeListener;
        if (iVar == null) {
            return;
        }
        iVar.a((RecyclerView) this, i);
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        i iVar = this.mStayTimeListener;
        if (iVar == null) {
            return;
        }
        iVar.a((ChildRecyclerView) this);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        i iVar = this.mStayTimeListener;
        if (iVar == null) {
            return;
        }
        iVar.a();
    }

    @Override // com.taobao.nestedscroll.recyclerview.AbstractRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            resetScroll();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        this.mRecyclerScrollStateChangeListener.onScrollStateChanged(this, i);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        super.setAdapter(adapter);
        registerAdapterDataObserver(adapter);
    }

    public void addLayoutListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486436c7", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (this.mOnChildRecyclerViewLayoutListeners == null) {
                this.mOnChildRecyclerViewLayoutListeners = new CopyOnWriteArrayList();
            }
            this.mOnChildRecyclerViewLayoutListeners.add(bVar);
        }
    }

    public void removeLayoutListener(b bVar) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861a882a", new Object[]{this, bVar});
        } else if (bVar == null || (list = this.mOnChildRecyclerViewLayoutListeners) == null) {
        } else {
            list.remove(bVar);
        }
    }

    public k getExposureListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("2b4b7d96", new Object[]{this}) : this.mExposureListener;
    }

    private void registerAdapterDataObserver(RecyclerView.Adapter<?> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c32b36", new Object[]{this, adapter});
        } else if (adapter == null) {
        } else {
            try {
                if (this.mAdapter != null && this.mAdapterDataObserver != null) {
                    this.mAdapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
                }
            } catch (IllegalStateException e) {
                com.taobao.android.home.component.utils.e.a(TAG, "unregisterAdapterDataObserver ", e);
            }
            if (this.mAdapterDataObserver == null) {
                this.mAdapterDataObserver = createAdapterDataObserver();
            }
            try {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            } catch (IllegalStateException e2) {
                com.taobao.android.home.component.utils.e.a(TAG, "registerAdapterDataObserver ", e2);
            }
            this.mAdapter = adapter;
        }
    }

    private void checkCallbackOnLayoutFinish() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f669aab0", new Object[]{this});
            return;
        }
        if (this.childAttachCount != 0 || getChildCount() != 0) {
            z = false;
        }
        if (this.childAttachCount < getChildCount() || z) {
            return;
        }
        List<b> list = this.mOnChildRecyclerViewLayoutListeners;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.mOnChildRecyclerViewLayoutListeners.size(); i++) {
                b bVar = this.mOnChildRecyclerViewLayoutListeners.get(i);
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
        this.isDataSetChange = false;
        this.childAttachCount = 0;
    }

    private void checkCallbackOnLayoutStart() {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44af7213", new Object[]{this});
        } else if (this.isDataSetChange) {
            if (this.childAttachCount == 1 && (list = this.mOnChildRecyclerViewLayoutListeners) != null && list.size() > 0) {
                for (int i = 0; i < this.mOnChildRecyclerViewLayoutListeners.size(); i++) {
                    this.mOnChildRecyclerViewLayoutListeners.get(i);
                }
            }
            this.childAttachCount++;
        }
    }

    private RecyclerView.AdapterDataObserver createAdapterDataObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.AdapterDataObserver) ipChange.ipc$dispatch("d31569f", new Object[]{this}) : new RecyclerView.AdapterDataObserver() { // from class: com.taobao.tao.recommend4.recyclerview.HomeChildRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                } else {
                    HomeChildRecyclerView.access$002(HomeChildRecyclerView.this, true);
                }
            }
        };
    }
}
