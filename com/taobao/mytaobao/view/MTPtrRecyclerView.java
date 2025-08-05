package com.taobao.mytaobao.view;

import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.ultron.i;
import com.taobao.ptr.views.recycler.PtrRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class MTPtrRecyclerView extends PtrRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View.OnTouchListener afterTouchListener;
    private int cacheVerticalScrollOffset;
    private float deltaPx;
    private FrameLayout flEndViewContainer;
    private boolean isOnTouch;
    private View mBasementView;
    private final List<RecyclerView.OnFlingListener> mOnFlingListenerList;
    private final List<View.OnTouchListener> mOnTouchListenerList;
    public b nestedScrollHook;
    public a onScrollEnableChangeListener;
    public boolean v2;

    static {
        kge.a(-1218598077);
    }

    public static /* synthetic */ Object ipc$super(MTPtrRecyclerView mTPtrRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1708092539:
                return new Boolean(super.dispatchNestedPreScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (int[]) objArr[2], (int[]) objArr[3], ((Number) objArr[4]).intValue()));
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -848676619:
                return new Boolean(super.dispatchNestedPreFling(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue()));
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public MTPtrRecyclerView(Context context) {
        this(context, null);
    }

    public MTPtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnTouchListenerList = new ArrayList(4);
        this.v2 = false;
        this.mOnFlingListenerList = new ArrayList(4);
        this.cacheVerticalScrollOffset = 0;
        this.deltaPx = 0.0f;
        this.isOnTouch = false;
        disableItemAnim();
    }

    private void disableItemAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fb4d53", new Object[]{this});
        } else if (c.u()) {
            setItemAnimator(null);
        } else {
            getItemAnimator().setChangeDuration(0L);
        }
    }

    public void registerOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ed5eca", new Object[]{this, onTouchListener});
        } else {
            this.mOnTouchListenerList.add(onTouchListener);
        }
    }

    public void unregisterOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edeef7a3", new Object[]{this, onTouchListener});
        } else {
            this.mOnTouchListenerList.remove(onTouchListener);
        }
    }

    public void registerOnFlingListener(RecyclerView.OnFlingListener onFlingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87546436", new Object[]{this, onFlingListener});
        } else {
            this.mOnFlingListenerList.add(onFlingListener);
        }
    }

    public void unregisterOnFlingListener(RecyclerView.OnFlingListener onFlingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861cfcfd", new Object[]{this, onFlingListener});
        } else {
            this.mOnFlingListenerList.remove(onFlingListener);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        for (RecyclerView.OnFlingListener onFlingListener : this.mOnFlingListenerList) {
            onFlingListener.onFling(i, i2);
        }
        return super.fling(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a309385", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
        }
        b bVar = this.nestedScrollHook;
        if (bVar != null && bVar.a(i, i2, iArr, iArr2, i3)) {
            return true;
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd6a38f5", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        b bVar = this.nestedScrollHook;
        if (bVar != null && bVar.a(f, f2)) {
            return true;
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // com.taobao.ptr.views.recycler.PtrRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean z2 = false;
        for (View.OnTouchListener onTouchListener : this.mOnTouchListenerList) {
            if (onTouchListener.onTouch(this, motionEvent)) {
                z2 = true;
            }
        }
        if (motionEvent.getAction() == 2) {
            z = true;
        }
        this.isOnTouch = z;
        if (!isScrollEnable() && !this.v2 && ((frameLayout = this.flEndViewContainer) == null || frameLayout.getBottom() > getBottom())) {
            StringBuilder sb = new StringBuilder();
            sb.append("杜绝一屏滑不动，scrollEnable=true， endViewBottom=");
            FrameLayout frameLayout2 = this.flEndViewContainer;
            sb.append(frameLayout2 == null ? "null" : Integer.valueOf(frameLayout2.getBottom()));
            sb.append(",rvBottom=");
            sb.append(getBottom());
            TLog.loge(BasementConstants.WEEX_TAG, sb.toString());
            setScrollEnable(true);
        }
        if (z2) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            View.OnTouchListener onTouchListener2 = this.afterTouchListener;
            if (onTouchListener2 != null) {
                onTouchListener2.onTouch(this, motionEvent);
            }
            return onTouchEvent;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBasementView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87af83b5", new Object[]{this, view});
        } else {
            this.mBasementView = view;
        }
    }

    public void resetBasementData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf3036f", new Object[]{this});
            return;
        }
        safeRemoveEndView(this.mBasementView);
        this.mBasementView = null;
    }

    public boolean isCloseToTheBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4deb88fe", new Object[]{this})).booleanValue();
        }
        if (this.deltaPx == 0.0f) {
            this.deltaPx = DensityUtil.dip2px(getContext(), 30.0f);
        }
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        return computeVerticalScrollRange == 0 || ((float) (computeVerticalScrollRange - computeVerticalScrollOffset)) <= this.deltaPx;
    }

    public void safeAddEndView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a53c4f5", new Object[]{this, view, new Boolean(z)});
            return;
        }
        TLog.loge(BasementConstants.TAG, "safeAddEndView, id=" + view);
        if (view == null) {
            return;
        }
        FrameLayout frameLayout = this.flEndViewContainer;
        if (frameLayout == null) {
            removeAllEndViews();
            this.flEndViewContainer = new FrameLayout(getContext());
            if (c.d()) {
                this.flEndViewContainer.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            } else if (!c.k()) {
                this.flEndViewContainer.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
            }
            this.flEndViewContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.flEndViewContainer.addView(view);
            addEndView(this.flEndViewContainer);
            return;
        }
        if (z) {
            frameLayout.removeAllViews();
        }
        this.flEndViewContainer.addView(view);
    }

    public void considerMarkBasementAPMComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424e5fc9", new Object[]{this});
        } else if (c.d() || !c.k()) {
        } else {
            FrameLayout frameLayout = this.flEndViewContainer;
            if (frameLayout != null) {
                frameLayout.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            }
            View view = this.mBasementView;
            if (view == null) {
                return;
            }
            view.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
        }
    }

    public void safeRemoveEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f1819c", new Object[]{this, view});
            return;
        }
        TLog.loge(BasementConstants.TAG, "safeRemoveEndView, id=" + view);
        FrameLayout frameLayout = this.flEndViewContainer;
        if (frameLayout == null || view == null) {
            return;
        }
        frameLayout.removeView(view);
    }

    public FrameLayout getFlEndViewContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("8cf19f35", new Object[]{this}) : this.flEndViewContainer;
    }

    public boolean isScrollEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4e25485", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof i)) {
            return true;
        }
        return ((LinearLayoutManager) layoutManager).canScrollVertically();
    }

    public void setScrollEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8304963b", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof i)) {
            return;
        }
        i iVar = (i) layoutManager;
        if (!iVar.canScrollVertically() && z && this.isOnTouch) {
            iVar.c(true);
        }
        if (!z) {
            this.cacheVerticalScrollOffset = computeVerticalScrollOffset();
        }
        iVar.a(z);
        a aVar = this.onScrollEnableChangeListener;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public int calcVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("981cfd45", new Object[]{this})).intValue();
        }
        if (isScrollEnable()) {
            return computeVerticalScrollOffset();
        }
        return this.cacheVerticalScrollOffset;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        if (c.u() && Looper.getMainLooper() != Looper.myLooper()) {
            TLog.loge("mtbMainLink", "Rv error: 子线程addView, view=" + view + " thread=" + Thread.currentThread().getName());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        if (c.u() && Looper.getMainLooper() != Looper.myLooper()) {
            TLog.loge("mtbMainLink", "Rv error: 子线程removeView, view=" + view + " thread=" + Thread.currentThread().getName());
        }
        super.removeView(view);
    }
}
