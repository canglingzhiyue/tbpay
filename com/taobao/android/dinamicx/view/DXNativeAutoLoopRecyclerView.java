package com.taobao.android.dinamicx.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import tb.fqi;
import tb.fux;
import tb.fxf;
import tb.gbh;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeAutoLoopRecyclerView extends DXNativeRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_NESTED_HORIZONTAL = 1;
    public static final int TYPE_NESTED_NONE = 0;
    public static final int TYPE_NESTED_VERTICAL = 2;
    private final int MIN_SCROLL_INSTANCE;
    private int actualCount;
    private boolean autoPlay;
    private boolean avoidFirstIncessantScroll;
    private boolean avoidIncessantScroll;
    private int currentIndex;
    private DinamicXEngine dinamicXEngine;
    private boolean enableInfinityEdgeCheck;
    private int interval;
    private boolean isAnimationPlay;
    private boolean isCanParentTouchWhenEdge_Android;
    private boolean isEnableHorizontalEdgeCheck;
    private boolean isInterceptMultipointLock;
    private boolean isInterceptMultipointTouch;
    private boolean isTouched;
    private float mCurrentX;
    private float mCurrentY;
    private DXNativeProgressIndicator mIndicator;
    private Boolean mIsHorizontalScroll;
    private int mNestedDirection;
    private b mOnAutoLoopTimerListener;
    private final BroadcastReceiver mReceiver;
    private boolean manualSwitchEnabled;
    private boolean needManualStop;
    private boolean needManualStopLoopOnMove;
    private boolean needProcessViewLifeCycle;
    private c onPageChangeListener;
    private boolean overrideCanScrollHorizontal;
    private a runnable;
    private boolean scrollAble;
    private boolean stopDispatchUp;
    private int x;

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, DXNativeProgressIndicator dXNativeProgressIndicator);

        void b(int i, DXNativeProgressIndicator dXNativeProgressIndicator);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(int i);
    }

    static {
        kge.a(913113145);
    }

    public static /* synthetic */ Object ipc$super(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1339922701:
                super.callParentDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                return null;
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView
    public boolean isSlider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c347a1b6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int access$000(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("29c1ccc4", new Object[]{dXNativeAutoLoopRecyclerView})).intValue() : dXNativeAutoLoopRecyclerView.actualCount;
    }

    public static /* synthetic */ int access$100(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62a22d63", new Object[]{dXNativeAutoLoopRecyclerView})).intValue() : dXNativeAutoLoopRecyclerView.interval;
    }

    public static /* synthetic */ boolean access$200(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b828e13", new Object[]{dXNativeAutoLoopRecyclerView})).booleanValue() : dXNativeAutoLoopRecyclerView.needProcessViewLifeCycle;
    }

    public b getOnAutoLoopTimerListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("28138072", new Object[]{this}) : this.mOnAutoLoopTimerListener;
    }

    public void setNeedManualStopLoopOnMove(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314dba59", new Object[]{this, new Boolean(z)});
        } else {
            this.needManualStopLoopOnMove = z;
        }
    }

    public void setOnAutoLoopTimerListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30fcfb9e", new Object[]{this, bVar});
        } else {
            this.mOnAutoLoopTimerListener = bVar;
        }
    }

    public void setEnableInfinityEdgeCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac44d7ef", new Object[]{this, new Boolean(z)});
        } else {
            this.enableInfinityEdgeCheck = z;
        }
    }

    public void setDinamicXEngine(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8ed1c5", new Object[]{this, dinamicXEngine});
        } else {
            this.dinamicXEngine = dinamicXEngine;
        }
    }

    public void setIsCanParentTouchWhenEdge_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45adad5", new Object[]{this, new Boolean(z)});
        } else {
            this.isCanParentTouchWhenEdge_Android = z;
        }
    }

    public void setNeedManualStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f27cc0d", new Object[]{this, new Boolean(z)});
        } else {
            this.needManualStop = z;
        }
    }

    public void setActualCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf69e85d", new Object[]{this, new Integer(i)});
        } else {
            this.actualCount = i;
        }
    }

    public boolean isTouched() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e40fa1f", new Object[]{this})).booleanValue() : this.isTouched;
    }

    public void setTouched(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7b9751", new Object[]{this, new Boolean(z)});
        } else {
            this.isTouched = z;
        }
    }

    private DinamicXEngine getDinamicXEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this}) : this.dinamicXEngine;
    }

    public void setIndicator(DXNativeProgressIndicator dXNativeProgressIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454a7883", new Object[]{this, dXNativeProgressIndicator});
        } else {
            this.mIndicator = dXNativeProgressIndicator;
        }
    }

    public DXNativeAutoLoopRecyclerView(Context context) {
        super(context);
        this.MIN_SCROLL_INSTANCE = 10;
        this.manualSwitchEnabled = true;
        this.needProcessViewLifeCycle = true;
        this.enableInfinityEdgeCheck = false;
        this.mCurrentX = 0.0f;
        this.mCurrentY = 0.0f;
        this.mIsHorizontalScroll = null;
        this.mNestedDirection = 0;
        this.avoidIncessantScroll = false;
        this.avoidFirstIncessantScroll = false;
        this.needManualStop = false;
        this.isTouched = false;
        this.actualCount = 0;
        this.isInterceptMultipointTouch = true;
        this.isInterceptMultipointLock = false;
        this.scrollAble = true;
        this.needManualStopLoopOnMove = false;
        this.overrideCanScrollHorizontal = false;
        this.isEnableHorizontalEdgeCheck = false;
        this.isAnimationPlay = false;
        this.x = 0;
        this.stopDispatchUp = false;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.view.DXNativeAutoLoopRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    DXNativeAutoLoopRecyclerView.this.stopTimer();
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    if (DXNativeAutoLoopRecyclerView.this.isShown()) {
                        DXNativeAutoLoopRecyclerView.this.startTimer();
                    } else {
                        DXNativeAutoLoopRecyclerView.this.stopTimer();
                    }
                }
            }
        };
        new PagerSnapHelper().attachToRecyclerView(this);
        this.mNestedDirection = 1;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isInfiniteSlider() && this.enableInfinityEdgeCheck) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.stopDispatchUp = false;
                this.x = (int) motionEvent.getX();
                handleScrollConflictWithAngle(motionEvent);
            } else if (action != 1) {
                if (action == 2 && this.isTouched && this.needManualStop) {
                    int x = (int) motionEvent.getX();
                    if (this.x - x > 10) {
                        int i = this.currentIndex;
                        int i2 = this.actualCount;
                        if (i % i2 == i2 - 1) {
                            if (this.isCanParentTouchWhenEdge_Android) {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            this.stopDispatchUp = true;
                            return false;
                        }
                    }
                    if (x - this.x > 10 && this.currentIndex % this.actualCount == 0) {
                        this.stopDispatchUp = true;
                        handleScrollConflictWithAngle(motionEvent);
                        return false;
                    }
                }
            } else if (this.stopDispatchUp) {
                handleScrollConflictWithAngle(motionEvent);
                return false;
            }
        }
        if (!isEnabled()) {
            return false;
        }
        if (!this.scrollAble) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.isInterceptMultipointTouch) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                this.isInterceptMultipointLock = false;
            } else if (actionMasked == 5) {
                this.isInterceptMultipointLock = true;
            }
            return super.dispatchTouchEvent(motionEvent);
        } else if (!this.autoPlay) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (!this.manualSwitchEnabled) {
                return dispatchTouchEvent;
            }
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                this.mCurrentX = motionEvent.getX();
                this.mCurrentY = motionEvent.getY();
                this.mIsHorizontalScroll = null;
                if (this.needManualStopLoopOnMove) {
                    return dispatchTouchEvent;
                }
                stopTimer();
                this.isTouched = true;
                if (!this.needManualStop) {
                    return dispatchTouchEvent;
                }
                stopTimer();
                return dispatchTouchEvent;
            }
            if (action2 != 1) {
                if (action2 == 2) {
                    if (this.mNestedDirection == 0) {
                        return dispatchTouchEvent;
                    }
                    Boolean bool = this.mIsHorizontalScroll;
                    if ((bool != null && bool.booleanValue()) || (this.mIsHorizontalScroll == null && Math.abs(motionEvent.getX() - this.mCurrentX) > 10.0f)) {
                        this.mIsHorizontalScroll = true;
                        if (this.mNestedDirection == 1) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            dispatchTouchEvent = true;
                        } else {
                            dispatchTouchEvent = false;
                        }
                    }
                    Boolean bool2 = this.mIsHorizontalScroll;
                    if ((bool2 == null || bool2.booleanValue()) && (this.mIsHorizontalScroll != null || Math.abs(motionEvent.getY() - this.mCurrentY) <= 10.0f)) {
                        return dispatchTouchEvent;
                    }
                    this.mIsHorizontalScroll = false;
                    if (this.mNestedDirection != 2) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (action2 != 3) {
                    return dispatchTouchEvent;
                }
            }
            this.mCurrentX = 0.0f;
            this.mCurrentY = 0.0f;
            this.mIsHorizontalScroll = null;
            if (!this.needManualStop) {
                startTimer();
                return dispatchTouchEvent;
            } else if (!this.isTouched || (bVar = this.mOnAutoLoopTimerListener) == null) {
                return dispatchTouchEvent;
            } else {
                bVar.b(getCurrentIndex(), this.mIndicator);
                return dispatchTouchEvent;
            }
        }
    }

    public void setNestedType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d7b469", new Object[]{this, new Integer(i)});
        } else {
            this.mNestedDirection = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollAble || !this.manualSwitchEnabled) {
            return true;
        }
        if (this.needManualStopLoopOnMove && motionEvent.getAction() != 0) {
            this.isTouched = true;
            stopTimer();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollAble) {
            return false;
        }
        if (this.isInterceptMultipointTouch) {
            return this.manualSwitchEnabled && super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.isInterceptMultipointLock = false;
        } else if (actionMasked == 5) {
            this.isInterceptMultipointLock = true;
        }
        if (!this.isInterceptMultipointLock) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void stopTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
        } else if (!this.autoPlay) {
        } else {
            if (this.dinamicXEngine != null) {
                fux.b("DXNativeAutoLoopRecyclerView stopTimer" + getCurrentIndex());
                this.dinamicXEngine.a(this.runnable);
                this.runnable = null;
            }
            try {
                fux.b("DXNativeAutoLoopRecyclerView stopTimer   scrollToPosition(getCurrentIndex())" + getCurrentIndex());
                if (this.isAnimationPlay) {
                    scrollToPosition(getCurrentIndex());
                }
                if (this.mOnAutoLoopTimerListener != null) {
                    this.mOnAutoLoopTimerListener.b(getCurrentIndex(), this.mIndicator);
                }
                this.isAnimationPlay = false;
            } catch (Throwable unused) {
                fux.b("DXNativeAutoLoopRecyclerView exception method=stopTimer,action=scrollToPosition,position=" + getCurrentIndex());
            }
        }
    }

    public void startTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else if (!this.autoPlay) {
        } else {
            if (this.runnable == null) {
                this.runnable = new a(this);
                DXWidgetNode b2 = gbh.b(this);
                if (b2 instanceof DXWidgetNode) {
                    DXWidgetNode dXWidgetNode = b2;
                    if (dXWidgetNode.getDXRuntimeContext() != null) {
                        this.runnable.a(dXWidgetNode.getDXRuntimeContext().K());
                    }
                }
            }
            if (this.dinamicXEngine == null) {
                return;
            }
            fux.b("DXNativeAutoLoopRecyclerView startTimer");
            this.dinamicXEngine.a(this.runnable, this.interval);
            b bVar = this.mOnAutoLoopTimerListener;
            if (bVar != null) {
                bVar.a(getCurrentIndex(), this.mIndicator);
            }
            this.isAnimationPlay = true;
        }
    }

    public void setAvoidIncessantScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdda4b93", new Object[]{this, new Boolean(z)});
        } else {
            this.avoidIncessantScroll = z;
        }
    }

    public boolean getAvoidIncessantScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a740a59", new Object[]{this})).booleanValue() : this.avoidIncessantScroll;
    }

    public boolean getAvoidFirstIncessantScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3a91ea7", new Object[]{this})).booleanValue() : this.avoidFirstIncessantScroll;
    }

    public void setAvoidFirstIncessantScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a798389d", new Object[]{this, new Boolean(z)});
        } else {
            this.avoidFirstIncessantScroll = z;
        }
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            super.onAttachedToWindow();
            fux.b("DXNativeAutoLoopRecyclerView onAttachedToWindow" + getCurrentIndex());
            if (!this.needProcessViewLifeCycle || !this.autoPlay) {
                return;
            }
            if (canStartPlay()) {
                startTimer();
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            getContext().registerReceiver(this.mReceiver, intentFilter);
            fux.b("DXNativeAutoLoopRecyclerView registerReceiver mReceiver" + this.mReceiver);
        } catch (Throwable unused) {
        }
    }

    public boolean canStartPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbf4de51", new Object[]{this})).booleanValue() : !this.needManualStop || !this.isTouched;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
            fux.b("DXNativeAutoLoopRecyclerView onDetachedFromWindow" + getCurrentIndex());
            if (!this.needProcessViewLifeCycle || !this.autoPlay) {
                return;
            }
            stopTimer();
            getContext().unregisterReceiver(this.mReceiver);
            fux.b("DXNativeAutoLoopRecyclerView unregisterReceiver mReceiver" + this.mReceiver);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        fux.b("DXNativeAutoLoopRecyclerView onWindowVisibilityChanged visibility" + i);
        if (!this.needProcessViewLifeCycle || !this.autoPlay) {
            return;
        }
        if (i == 0) {
            b bVar = this.mOnAutoLoopTimerListener;
            if (bVar != null) {
                bVar.a(this.currentIndex, this.mIndicator);
            }
            startTimer();
            return;
        }
        b bVar2 = this.mOnAutoLoopTimerListener;
        if (bVar2 != null) {
            bVar2.b(this.currentIndex, this.mIndicator);
        }
        stopTimer();
    }

    public int getInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue() : this.interval;
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.interval = i;
        }
    }

    public int getCurrentIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue() : this.currentIndex;
    }

    public void setCurrentIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        } else {
            this.currentIndex = i;
        }
    }

    public boolean isAutoPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue() : this.autoPlay;
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.autoPlay = z;
        }
    }

    public void setManualSwitchEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a3cac8", new Object[]{this, new Boolean(z)});
        } else {
            this.manualSwitchEnabled = z;
        }
    }

    public int increaseCurrentIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("322f6d35", new Object[]{this})).intValue();
        }
        int i = this.currentIndex + 1;
        this.currentIndex = i;
        return i;
    }

    public c getOnPageChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a07746a8", new Object[]{this}) : this.onPageChangeListener;
    }

    public void setOnPageChangeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d796222e", new Object[]{this, cVar});
        } else {
            this.onPageChangeListener = cVar;
        }
    }

    public void setNeedProcessViewLifeCycle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f95f7bf", new Object[]{this, new Boolean(z)});
        } else {
            this.needProcessViewLifeCycle = z;
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

    public boolean isInterceptMultipointTouch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc8db03b", new Object[]{this})).booleanValue() : this.isInterceptMultipointTouch;
    }

    public void setScrollAble(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70e6d04", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollAble = z;
        }
    }

    public void setOverrideCanScrollHorizontal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57d0d7a", new Object[]{this, new Boolean(z)});
        } else {
            this.overrideCanScrollHorizontal = z;
        }
    }

    public void setEnableHorizontalEdgeCheck(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c0abab", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnableHorizontalEdgeCheck = z;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements fxf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DXNativeAutoLoopRecyclerView> f11943a;
        private long b = System.currentTimeMillis();
        private String c = "";

        static {
            kge.a(-306039687);
            kge.a(1357191720);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public a(DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView) {
            this.f11943a = new WeakReference<>(dXNativeAutoLoopRecyclerView);
        }

        @Override // tb.fxf
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            if (currentTimeMillis > 10800000 && fqi.aY()) {
                s sVar = new s("dinamicx");
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_WRANING, 200006);
                aVar.e = "duration " + currentTimeMillis + " tpl " + this.c;
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
                return;
            }
            DXNativeAutoLoopRecyclerView dXNativeAutoLoopRecyclerView = this.f11943a.get();
            if (dXNativeAutoLoopRecyclerView == null) {
                return;
            }
            if (dXNativeAutoLoopRecyclerView.getAvoidIncessantScroll()) {
                try {
                    int increaseCurrentIndex = dXNativeAutoLoopRecyclerView.increaseCurrentIndex();
                    int a2 = a(dXNativeAutoLoopRecyclerView);
                    int i = increaseCurrentIndex - a2;
                    if (Math.abs(i) > 10) {
                        if (a2 == 0 && DXNativeAutoLoopRecyclerView.access$000(dXNativeAutoLoopRecyclerView) > 0 && dXNativeAutoLoopRecyclerView.getAvoidFirstIncessantScroll()) {
                            dXNativeAutoLoopRecyclerView.smoothScrollToPosition(increaseCurrentIndex % DXNativeAutoLoopRecyclerView.access$000(dXNativeAutoLoopRecyclerView));
                        } else {
                            dXNativeAutoLoopRecyclerView.scrollToPosition(increaseCurrentIndex);
                        }
                        s sVar2 = new s("dinamicx");
                        s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_ERROR, 200002);
                        aVar2.e = "nextPosition = " + increaseCurrentIndex + ";nowPosition = " + a2 + ";Math.abs(nextPosition - nowPosition) > ： " + i + ";interval = " + DXNativeAutoLoopRecyclerView.access$100(dXNativeAutoLoopRecyclerView) + ";needProcessViewLifeCycle = " + DXNativeAutoLoopRecyclerView.access$200(dXNativeAutoLoopRecyclerView);
                        sVar2.c.add(aVar2);
                    } else {
                        dXNativeAutoLoopRecyclerView.smoothScrollToPosition(increaseCurrentIndex);
                    }
                } catch (Throwable th) {
                    fux.b("DXNativeAutoLoopRecyclerView", "DXNativeAutoLoopRecyclerView", "unexpected exception." + th.getMessage());
                }
            } else {
                dXNativeAutoLoopRecyclerView.smoothScrollToPosition(dXNativeAutoLoopRecyclerView.increaseCurrentIndex());
            }
            c onPageChangeListener = dXNativeAutoLoopRecyclerView.getOnPageChangeListener();
            if (onPageChangeListener == null) {
                return;
            }
            onPageChangeListener.a(dXNativeAutoLoopRecyclerView.getCurrentIndex());
        }

        private int a(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("46606589", new Object[]{this, recyclerView})).intValue() : ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean canScrollHorizontally = super.canScrollHorizontally(i);
        if (!this.overrideCanScrollHorizontal) {
            return canScrollHorizontally;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!isInfiniteSlider() || layoutManager == null) {
            z = canScrollHorizontally;
        } else if (!this.enableInfinityEdgeCheck || !this.stopDispatchUp) {
            z = layoutManager.canScrollHorizontally();
        }
        return this.manualSwitchEnabled & z;
    }

    private boolean isInfiniteSlider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab10f4ea", new Object[]{this})).booleanValue() : getAdapter() instanceof DXSliderLayout.a;
    }

    @Override // com.taobao.android.dinamicx.view.DXNativeRecyclerView
    public void callParentDisallowInterceptTouchEvent(boolean z, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02266f3", new Object[]{this, new Boolean(z), new Float(f), new Float(f2)});
            return;
        }
        if (z && this.isEnableHorizontalEdgeCheck && f > 0.0f) {
            if (isInfiniteSlider()) {
                if (this.isEnableHorizontalEdgeCheck && this.stopDispatchUp) {
                    z = false;
                }
            } else {
                z &= canScrollHorizontally((int) (-f));
            }
        }
        super.callParentDisallowInterceptTouchEvent(z, f, f2);
    }
}
