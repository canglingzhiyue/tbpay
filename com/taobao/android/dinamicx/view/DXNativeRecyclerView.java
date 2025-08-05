package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder;
import com.taobao.android.dinamicx.widget.recycler.stacklayoutmanager.StackLayoutManager;
import tb.fqi;
import tb.ftu;
import tb.fxe;
import tb.fzr;
import tb.fzs;
import tb.fzw;
import tb.gbh;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class DXNativeRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.android.dinamicx.view.a cLipRadiusHandler;
    private int contentHorizontalLength;
    private int contentOffsetX;
    private int contentOffsetY;
    private int contentVerticalLength;
    private boolean enableSmoothScroll;
    private long exposeTime;
    private int lastX;
    private int lastY;
    private float mActionDownX;
    private float mActionDownY;
    private com.taobao.android.dinamicx.widget.recycler.expose.c mExposeHelper;
    private int mScrolledX;
    private int mScrolledY;
    private int needFixScrollConflict;
    private boolean needScrollAfterLayout;
    private Parcelable saveInstanceState;
    private Parcelable state;
    private double velocitySpeed;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void b(int i);

        void c(int i);
    }

    static {
        kge.a(-1836312154);
    }

    public static /* synthetic */ Object ipc$super(DXNativeRecyclerView dXNativeRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public double getValidScrollAngle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5985855", new Object[]{this})).doubleValue();
        }
        return 1.0471975511965976d;
    }

    public boolean isSlider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c347a1b6", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public DXNativeRecyclerView(Context context) {
        super(context);
        this.exposeTime = 0L;
        this.needFixScrollConflict = 0;
        this.velocitySpeed = -1.0d;
        this.enableSmoothScroll = false;
        this.lastX = 0;
        this.lastY = 0;
    }

    public DXNativeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.exposeTime = 0L;
        this.needFixScrollConflict = 0;
        this.velocitySpeed = -1.0d;
        this.enableSmoothScroll = false;
        this.lastX = 0;
        this.lastY = 0;
    }

    public DXNativeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.exposeTime = 0L;
        this.needFixScrollConflict = 0;
        this.velocitySpeed = -1.0d;
        this.enableSmoothScroll = false;
        this.lastX = 0;
        this.lastY = 0;
    }

    public void initExposeHelper(JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb99417", new Object[]{this, jSONObject, aVar});
            return;
        }
        int i = 300;
        float f = 0.5f;
        if (jSONObject != null) {
            if (jSONObject.getInteger(ftu.PLAY_DELAY) != null) {
                i = jSONObject.getInteger(ftu.PLAY_DELAY).intValue();
            }
            if (jSONObject.getFloat(ftu.VIEW_AREA_PERCENT) != null) {
                f = jSONObject.getFloat(ftu.VIEW_AREA_PERCENT).floatValue();
            }
        }
        com.taobao.android.dinamicx.widget.recycler.expose.c cVar = this.mExposeHelper;
        if (cVar != null) {
            cVar.e();
        }
        this.mExposeHelper = new ExposeHelperBuilder(this, new fzr() { // from class: com.taobao.android.dinamicx.view.DXNativeRecyclerView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzr
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(i2);
            }
        }).a(ExposeHelperBuilder.REPEAT_MODE.CELL_REPEAT, new fzw() { // from class: com.taobao.android.dinamicx.view.DXNativeRecyclerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzw
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.b(i2);
            }

            @Override // tb.fzw
            public void b(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.c(i2);
            }
        }).a(new fzs() { // from class: com.taobao.android.dinamicx.view.DXNativeRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzs
            public String a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i2)});
                }
                return i2 + "";
            }
        }).a(f).a(i).a();
    }

    public void clearExposeCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e1a998", new Object[]{this});
            return;
        }
        com.taobao.android.dinamicx.widget.recycler.expose.c cVar = this.mExposeHelper;
        if (cVar == null) {
            return;
        }
        cVar.f();
    }

    public void triggerExpose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce68223", new Object[]{this});
            return;
        }
        com.taobao.android.dinamicx.widget.recycler.expose.c cVar = this.mExposeHelper;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }

    public void setClipRadiusHandler(com.taobao.android.dinamicx.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32bf7192", new Object[]{this, aVar});
        } else {
            this.cLipRadiusHandler = aVar;
        }
    }

    public com.taobao.android.dinamicx.view.a getCLipRadiusHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.a) ipChange.ipc$dispatch("d24e3242", new Object[]{this}) : this.cLipRadiusHandler;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            super.onAttachedToWindow();
            this.state = onSaveInstanceState();
            if (this.mExposeHelper == null) {
                return;
            }
            this.mExposeHelper.d();
        } catch (Throwable unused) {
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
        Parcelable parcelable = this.state;
        if (parcelable != null) {
            onRestoreInstanceState(parcelable);
        }
        com.taobao.android.dinamicx.widget.recycler.expose.c cVar = this.mExposeHelper;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        com.taobao.android.dinamicx.view.a aVar = this.cLipRadiusHandler;
        if (aVar == null) {
            super.dispatchDraw(canvas);
        } else if (aVar.a()) {
            super.dispatchDraw(canvas);
        } else {
            this.cLipRadiusHandler.a(this, canvas);
            super.dispatchDraw(canvas);
            this.cLipRadiusHandler.b(this, canvas);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (this.needScrollAfterLayout) {
                if (this.enableSmoothScroll) {
                    smoothScrollBy(this.contentOffsetX, this.contentOffsetY, new DecelerateInterpolator());
                } else {
                    scrollBy(this.contentOffsetX, this.contentOffsetY);
                }
                this.contentOffsetX = 0;
                this.contentOffsetY = 0;
                this.needScrollAfterLayout = false;
            }
            if (this.mExposeHelper == null) {
                return;
            }
            this.mExposeHelper.g();
        } catch (Throwable unused) {
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (this.mExposeHelper != null) {
            if (System.currentTimeMillis() - this.exposeTime > 500) {
                this.mExposeHelper.g();
            }
            this.exposeTime = System.currentTimeMillis();
        }
        this.mScrolledX += i;
        this.mScrolledY += i2;
    }

    public int getScrolledX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e39c70", new Object[]{this})).intValue() : this.mScrolledX;
    }

    public int getScrolledY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f1b3f1", new Object[]{this})).intValue() : this.mScrolledY;
    }

    public void setScrolledX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4086ce32", new Object[]{this, new Integer(i)});
        } else {
            this.mScrolledX = i;
        }
    }

    public void setScrolledY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ba6d1", new Object[]{this, new Integer(i)});
        } else {
            this.mScrolledY = i;
        }
    }

    public Parcelable getSaveInstanceState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Parcelable) ipChange.ipc$dispatch("27f8ecd3", new Object[]{this}) : this.saveInstanceState;
    }

    public void setSaveInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95f2990f", new Object[]{this, parcelable});
        } else {
            this.saveInstanceState = parcelable;
        }
    }

    public boolean isNeedScrollAfterLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c028e24", new Object[]{this})).booleanValue() : this.needScrollAfterLayout;
    }

    public void setEnableSmoothScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34747ed", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSmoothScroll = z;
        }
    }

    public void needScrollAfterLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc5fbea", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            needScrollAfterLayout(i, i2, i3, i4, false);
        }
    }

    public void needScrollAfterLayout(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfa342a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        this.needScrollAfterLayout = true;
        if (i3 < this.contentHorizontalLength) {
            this.contentOffsetX = i;
            this.mScrolledX = 0;
            if (z) {
                fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.view.DXNativeRecyclerView.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            DXNativeRecyclerView.this.scrollToPosition(0);
                        }
                    }
                });
            } else {
                scrollToPosition(0);
            }
        } else {
            this.contentOffsetX = i - this.mScrolledX;
        }
        if (i4 < this.contentVerticalLength) {
            this.contentOffsetY = i2;
            this.mScrolledY = 0;
            scrollToPosition(0);
        } else {
            this.contentOffsetY = i2 - this.mScrolledY;
        }
        this.contentHorizontalLength = i3;
        this.contentVerticalLength = i4;
    }

    public void setContentHorizontalLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa481bfb", new Object[]{this, new Integer(i)});
        } else {
            this.contentHorizontalLength = i;
        }
    }

    public void setContentVerticalLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0867a9", new Object[]{this, new Integer(i)});
        } else {
            this.contentVerticalLength = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.needFixScrollConflict != 0) {
            if (checkHandleScrollConflictWithAngle()) {
                handleScrollConflictWithAngle(motionEvent);
            } else {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action == 2) {
                    int abs = Math.abs(rawX - this.lastX) + 0;
                    int abs2 = Math.abs(rawY - this.lastY) + 0;
                    if (this.needFixScrollConflict == 1) {
                        RecyclerView.LayoutManager layoutManager = getLayoutManager();
                        if (layoutManager instanceof StackLayoutManager) {
                            boolean z2 = ((StackLayoutManager) layoutManager).a() != 0.0f;
                            ViewParent parent = getParent();
                            if (abs < abs2 && !z2) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        } else {
                            ViewParent parent2 = getParent();
                            if (abs < abs2) {
                                z = false;
                            }
                            parent2.requestDisallowInterceptTouchEvent(z);
                        }
                    }
                    this.lastX = rawX;
                    this.lastY = rawY;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setNeedFixScrollConflict(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dc78e0", new Object[]{this, new Integer(i)});
        } else {
            this.needFixScrollConflict = i;
        }
    }

    public void setVelocitySpeed(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3dcd6f", new Object[]{this, new Double(d)});
        } else {
            this.velocitySpeed = d;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (fqi.P() && this.needFixScrollConflict == 1 && (getLayoutManager() instanceof c) && ((c) getLayoutManager()).getOrientation() == 0) {
            if (i > 0 && !canScrollHorizontally(1)) {
                return false;
            }
            if (i < 0 && !canScrollHorizontally(-1)) {
                return false;
            }
        }
        double d = this.velocitySpeed;
        if (d > mto.a.GEO_NOT_SUPPORT) {
            return super.fling((int) (i * d), (int) (i2 * d));
        }
        return super.fling(i, i2);
    }

    public void handleScrollConflictWithAngle(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821e8ac2", new Object[]{this, motionEvent});
            return;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.mActionDownX = motionEvent.getX();
            this.mActionDownY = motionEvent.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (motionEvent.getX() - this.mActionDownX == 0.0f) {
                    return;
                }
                boolean z2 = Math.atan((double) Math.abs((motionEvent.getY() - this.mActionDownY) / (motionEvent.getX() - this.mActionDownX))) < getValidScrollAngle();
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                if (layoutManager instanceof StackLayoutManager) {
                    boolean z3 = ((StackLayoutManager) layoutManager).a() != 0.0f;
                    ViewParent parent = getParent();
                    if (z2 || z3) {
                        z = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z);
                    return;
                }
                callParentDisallowInterceptTouchEvent(z2 & canScrollHorizontally((int) (this.mActionDownX - motionEvent.getX())), motionEvent.getX() - this.mActionDownX, motionEvent.getY() - this.mActionDownY);
                return;
            } else if (action != 3) {
                return;
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    public void callParentDisallowInterceptTouchEvent(boolean z, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02266f3", new Object[]{this, new Boolean(z), new Float(f), new Float(f2)});
        } else {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean checkHandleScrollConflictWithAngle() {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("448f6ac9", new Object[]{this})).booleanValue();
        }
        DXWidgetNode b = gbh.b(this);
        if ((b instanceof DXWidgetNode) && (dXRuntimeContext = b.getDXRuntimeContext()) != null) {
            return dXRuntimeContext.C().r();
        }
        return false;
    }
}
