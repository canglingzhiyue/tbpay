package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.kge;
import tb.ldf;
import tb.ldj;
import tb.lks;
import tb.llo;
import tb.tbs;

/* loaded from: classes7.dex */
public class InfoFlowRecyclerView extends TRecyclerView implements ViewTreeObserver.OnGlobalLayoutListener, llo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InfoFlowRecyclerView";
    private int childAttachCount;
    private boolean isDataSetChange;
    private boolean isInterceptTouch;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private lks.e mFirstScreenDiffRefreshListener;
    private tbs mGestureDetectorCallback;
    private lks.b mOnFeedsLayoutListener;
    private lks.d mWindowVisibilityChangedListener;

    static {
        kge.a(1409390711);
        kge.a(-866155262);
        kge.a(300785761);
    }

    public static /* synthetic */ Object ipc$super(InfoFlowRecyclerView infoFlowRecyclerView, String str, Object... objArr) {
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
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$002(InfoFlowRecyclerView infoFlowRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76eef067", new Object[]{infoFlowRecyclerView, new Boolean(z)})).booleanValue();
        }
        infoFlowRecyclerView.isDataSetChange = z;
        return z;
    }

    public static /* synthetic */ void access$100(InfoFlowRecyclerView infoFlowRecyclerView, int i, InfoFlowRecyclerView infoFlowRecyclerView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a32ff9", new Object[]{infoFlowRecyclerView, new Integer(i), infoFlowRecyclerView2});
        } else {
            infoFlowRecyclerView.registerDiffFirstScreenRefreshListener(i, infoFlowRecyclerView2);
        }
    }

    public InfoFlowRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.childAttachCount = 1;
        this.isDataSetChange = false;
    }

    public InfoFlowRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.childAttachCount = 1;
        this.isDataSetChange = false;
    }

    public InfoFlowRecyclerView(Context context) {
        super(context);
        this.childAttachCount = 1;
        this.isDataSetChange = false;
    }

    @Override // tb.llo
    public boolean isInterceptTouch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("214f872", new Object[]{this})).booleanValue() : this.isInterceptTouch;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        this.isInterceptTouch = super.onInterceptTouchEvent(motionEvent);
        return this.isInterceptTouch;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        tbs tbsVar = this.mGestureDetectorCallback;
        if (tbsVar != null) {
            tbsVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        lks.d dVar = this.mWindowVisibilityChangedListener;
        if (dVar == null) {
            return;
        }
        if (i != 0) {
            z = false;
        }
        dVar.a(z);
    }

    public void setOnWindowVisibilityChangedListener(lks.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ea3648", new Object[]{this, dVar});
        } else {
            this.mWindowVisibilityChangedListener = dVar;
        }
    }

    public void setOnFeedsLayoutListener(lks.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d78f537", new Object[]{this, bVar});
        } else {
            this.mOnFeedsLayoutListener = bVar;
        }
    }

    public void setFirstScreenDiffRefreshListener(lks.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e1d392", new Object[]{this, eVar});
        } else {
            this.mFirstScreenDiffRefreshListener = eVar;
        }
    }

    public void setGestureDetectorCallback(tbs tbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5685ede4", new Object[]{this, tbsVar});
        } else {
            this.mGestureDetectorCallback = tbsVar;
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edecb57", new Object[]{this, adapter});
            return;
        }
        super.setAdapter(adapter);
        registerAdapterDataObserver(adapter);
    }

    private void checkCallbackOnLayoutFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f669aab0", new Object[]{this});
        } else if (this.childAttachCount < getChildCount()) {
        } else {
            lks.b bVar = this.mOnFeedsLayoutListener;
            if (bVar != null) {
                bVar.dT_();
            }
            this.isDataSetChange = false;
            this.childAttachCount = 0;
        }
    }

    private void checkCallbackOnLayoutStart() {
        lks.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44af7213", new Object[]{this});
        } else if (!this.isDataSetChange) {
        } else {
            if (this.childAttachCount == 1 && (bVar = this.mOnFeedsLayoutListener) != null) {
                bVar.dM_();
            }
            this.childAttachCount++;
        }
    }

    private void registerAdapterDataObserver(RecyclerView.Adapter adapter) {
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
                ldf.a(TAG, "unregisterAdapterDataObserver ", e);
            }
            if (this.mAdapterDataObserver == null) {
                this.mAdapterDataObserver = createAdapterDataObserver(this);
            }
            try {
                adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            } catch (IllegalStateException e2) {
                ldf.a(TAG, "registerAdapterDataObserver ", e2);
            }
            this.mAdapter = adapter;
        }
    }

    private RecyclerView.AdapterDataObserver createAdapterDataObserver(final InfoFlowRecyclerView infoFlowRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.AdapterDataObserver) ipChange.ipc$dispatch("b78db0a9", new Object[]{this, infoFlowRecyclerView}) : new RecyclerView.AdapterDataObserver() { // from class: com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view.InfoFlowRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1882209744) {
                    super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                InfoFlowRecyclerView.access$002(InfoFlowRecyclerView.this, true);
                ldf.d(InfoFlowRecyclerView.TAG, "onChanged");
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                super.onItemRangeChanged(i, i2);
                InfoFlowRecyclerView.access$100(InfoFlowRecyclerView.this, i, infoFlowRecyclerView);
            }
        };
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
            return;
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ldf.d(TAG, "onGlobalLayout");
        if (ldj.a("disableNotifyDiffRefresh", false) || this.mFirstScreenDiffRefreshListener == null) {
            return;
        }
        ldf.d(TAG, "差量刷新完成通知");
        this.mFirstScreenDiffRefreshListener.a();
    }

    private void registerDiffFirstScreenRefreshListener(int i, InfoFlowRecyclerView infoFlowRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c07d09", new Object[]{this, new Integer(i), infoFlowRecyclerView});
        } else if (i != 0) {
        } else {
            infoFlowRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }
}
