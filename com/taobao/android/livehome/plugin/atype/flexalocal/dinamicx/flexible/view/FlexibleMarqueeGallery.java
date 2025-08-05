package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleContainerView;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.mfj;

/* loaded from: classes6.dex */
public class FlexibleMarqueeGallery extends AbsFlexibleMarqueeGallery {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float FLOAT_PRECISION_FIX_FACTOR = 10000.0f;
    private static final float SCALE_ANIM_axis = 0.8f;
    private static final String TAG;
    public float[] bezierFactors;
    private boolean hasRegisterReceiver;
    public int lastScrollStopX;
    public Rect[] mCardRectArray;
    private com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c mGallery2Runner;
    public int mIdleStateScrollOffset;
    private final BroadcastReceiver mReceiver;
    public ValueAnimator magnatePositionAnimator;
    public TimeInterpolator moveAnimatorInterpolator;
    public int moveAnimeDelayDistance;
    public float moveAnimeDelayDistanceRate;
    private boolean muteOnScrollChanged;
    public OverScroller myScroller;
    public boolean notifyOnSwitch;
    public boolean returnScroll;
    public float scaleFactorA;
    public float scaleFactorK;
    public Runnable setVisibleIndexTask;
    public Set<Integer> tempResetItems;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public float f14164a;
        public boolean b;
        public int c;
        public int d;

        static {
            kge.a(-646961656);
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends AbsFlexibleMarqueeGallery.c {
        public Rect d = new Rect();
        public TypeEvaluator<Rect> e = new c(this.d);
        public ValueAnimator f;
        public a g;

        static {
            kge.a(-1576367178);
        }
    }

    public static /* synthetic */ Object ipc$super(FlexibleMarqueeGallery flexibleMarqueeGallery, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 711821702:
                super.onOverScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1937889544:
                super.setGalleryDisplayWidth(((Number) objArr[0]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void autoScrollToPrevious() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f81a95", new Object[]{this});
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setVisibleIndexes(Set<Integer> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c08c28", new Object[]{this, set});
        }
    }

    public static /* synthetic */ boolean access$000(FlexibleMarqueeGallery flexibleMarqueeGallery) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aabbd34", new Object[]{flexibleMarqueeGallery})).booleanValue() : flexibleMarqueeGallery.muteOnScrollChanged;
    }

    public static /* synthetic */ com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c access$100(FlexibleMarqueeGallery flexibleMarqueeGallery) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c) ipChange.ipc$dispatch("8891c932", new Object[]{flexibleMarqueeGallery}) : flexibleMarqueeGallery.mGallery2Runner;
    }

    static {
        kge.a(1105877818);
        TAG = FlexibleMarqueeGallery.class.getSimpleName();
    }

    /* loaded from: classes6.dex */
    public static class c implements TypeEvaluator<Rect> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Rect f14165a;

        static {
            kge.a(356468385);
            kge.a(-738482422);
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.Rect, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public /* synthetic */ Rect evaluate(float f, Rect rect, Rect rect2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6810f25a", new Object[]{this, new Float(f), rect, rect2}) : a(f, rect, rect2);
        }

        public c(Rect rect) {
            this.f14165a = rect;
        }

        public Rect a(float f, Rect rect, Rect rect2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("fbb5a981", new Object[]{this, new Float(f), rect, rect2});
            }
            int i = rect.left + ((int) ((rect2.left - rect.left) * f));
            int i2 = rect.top + ((int) ((rect2.top - rect.top) * f));
            int i3 = rect.right + ((int) ((rect2.right - rect.right) * f));
            int i4 = rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f));
            Rect rect3 = this.f14165a;
            if (rect3 == null) {
                return new Rect(i, i2, i3, i4);
            }
            rect3.set(i, i2, i3, i4);
            return this.f14165a;
        }
    }

    public FlexibleMarqueeGallery(Context context) {
        this(context, null);
    }

    public FlexibleMarqueeGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mGallery2Runner = null;
        this.mIdleStateScrollOffset = 1000;
        this.bezierFactors = null;
        this.scaleFactorA = 0.8f;
        this.scaleFactorK = 0.0f;
        this.moveAnimeDelayDistance = 0;
        this.moveAnimeDelayDistanceRate = 0.0f;
        this.magnatePositionAnimator = null;
        this.returnScroll = false;
        this.lastScrollStopX = this.mIdleStateScrollOffset;
        this.tempResetItems = new HashSet();
        this.setVisibleIndexTask = null;
        this.muteOnScrollChanged = false;
        this.notifyOnSwitch = false;
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this) == null) {
                } else {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this).b();
                    } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                    } else {
                        if (FlexibleMarqueeGallery.this.isShown()) {
                            FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this).a(false);
                        } else {
                            FlexibleMarqueeGallery.access$100(FlexibleMarqueeGallery.this).b();
                        }
                    }
                }
            }
        };
        this.mFlingFactor = 0.3f;
        this.myScroller = new OverScroller(context);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public ScrollerCompat createScroller(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollerCompat) ipChange.ipc$dispatch("a4eb1fe4", new Object[]{this, context}) : ScrollerCompat.create(context);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public Runnable createScrollerTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("287f9752", new Object[]{this}) : new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!FlexibleMarqueeGallery.this.myScroller.isFinished() && FlexibleMarqueeGallery.this.myScroller.computeScrollOffset()) {
                    int currX = FlexibleMarqueeGallery.this.myScroller.getCurrX();
                    FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
                    flexibleMarqueeGallery.scrollTo(currX, flexibleMarqueeGallery.myScroller.getCurrY());
                    FlexibleMarqueeGallery.this.removeCallbacks(this);
                    FlexibleMarqueeGallery.this.postDelayed(this, 16L);
                    FlexibleMarqueeGallery.this.getScrollX();
                } else {
                    int round = Math.round(FlexibleMarqueeGallery.this.getScrollLimit() / 3.0f);
                    int scrollX = FlexibleMarqueeGallery.this.getScrollX() - FlexibleMarqueeGallery.this.mIdleStateScrollOffset;
                    if (Math.abs(scrollX) <= round) {
                        FlexibleMarqueeGallery flexibleMarqueeGallery2 = FlexibleMarqueeGallery.this;
                        flexibleMarqueeGallery2.smoothScrollToRect(flexibleMarqueeGallery2.mIdleStateScrollOffset);
                    } else if (scrollX > 0) {
                        FlexibleMarqueeGallery flexibleMarqueeGallery3 = FlexibleMarqueeGallery.this;
                        flexibleMarqueeGallery3.smoothScrollToRect(flexibleMarqueeGallery3.mIdleStateScrollOffset + FlexibleMarqueeGallery.this.getScrollLimit());
                    } else if (scrollX >= 0) {
                    } else {
                        FlexibleMarqueeGallery flexibleMarqueeGallery4 = FlexibleMarqueeGallery.this;
                        flexibleMarqueeGallery4.smoothScrollToRect(flexibleMarqueeGallery4.mIdleStateScrollOffset - FlexibleMarqueeGallery.this.getScrollLimit());
                    }
                }
            }
        };
    }

    public TimeInterpolator getMoveAnimatorInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("5821d98a", new Object[]{this});
        }
        if (this.moveAnimatorInterpolator == null) {
            float[] fArr = this.bezierFactors;
            if (fArr != null) {
                this.moveAnimatorInterpolator = new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.a(fArr[0], fArr[1], fArr[2], fArr[3]);
            } else {
                this.moveAnimatorInterpolator = new TimeInterpolator() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.TimeInterpolator
                    public float getInterpolation(float f) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue() : f;
                    }
                };
            }
        }
        return this.moveAnimatorInterpolator;
    }

    public static float floatPrecisionFix(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1ff08b6", new Object[]{new Float(f)})).floatValue() : Math.round(f * 10000.0f) / 10000.0f;
    }

    public void setBezierFactors(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36d449ea", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        this.bezierFactors = new float[]{f, f2, f3, f4};
        if (this.moveAnimatorInterpolator == null) {
            return;
        }
        this.moveAnimatorInterpolator = null;
    }

    public void setScaleAnimeMinValue(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bd854e", new Object[]{this, new Float(f)});
            return;
        }
        this.scaleFactorK = f;
        this.scaleFactorA = (1.0f - f) / 0.25f;
    }

    public void setMoveAnimeDelayDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd84e85", new Object[]{this, new Integer(i)});
        } else {
            this.moveAnimeDelayDistance = i;
        }
    }

    public void setMoveAnimeDelayDistanceRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60465c2", new Object[]{this, new Float(f)});
        } else {
            this.moveAnimeDelayDistanceRate = f;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setGalleryDisplayWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7381d908", new Object[]{this, new Integer(i)});
            return;
        }
        super.setGalleryDisplayWidth(i);
        if (this.mIdleStateScrollOffset >= this.mGalleryDisplayWidth) {
            return;
        }
        this.mIdleStateScrollOffset = ((int) Math.ceil(this.mGalleryDisplayWidth / 1000.0f)) * 1000;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setAutoRunner(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c52853", new Object[]{this, cVar});
        } else {
            this.mGallery2Runner = cVar;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c getAutoRunner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c) ipChange.ipc$dispatch("90a3e0e5", new Object[]{this}) : this.mGallery2Runner;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void updateCurrentSelected(int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809011e3", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.mScrollContent.getWidth() <= 0) {
        } else {
            int viewIndexForVirtualIndex = viewIndexForVirtualIndex(i);
            if (this.mCurrentItem != viewIndexForVirtualIndex) {
                this.lastSelectedItem = this.mCurrentItem;
                this.mCurrentItem = viewIndexForVirtualIndex;
                if (getAutoRunner() != null) {
                    getAutoRunner().b(this.mCurrentItem);
                }
                if (this.notifyOnSwitch) {
                    post(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (FlexibleMarqueeGallery.this.mOnGalleryScrollListener == null) {
                            } else {
                                FlexibleMarqueeGallery.this.mOnGalleryScrollListener.a(FlexibleMarqueeGallery.this.mCurrentItem, FlexibleMarqueeGallery.this.lastSelectedItem, z);
                            }
                        }
                    });
                }
            }
            this.notifyOnSwitch = true;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void smoothScrollToRectWithAnim(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86944d49", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (z) {
            ValueAnimator valueAnimator = this.magnatePositionAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.myScroller.abortAnimation();
            this.mAutoScrollAnimationOnStart = getScrollX();
            int i2 = i - this.mAutoScrollAnimationOnStart;
            if (i2 == 0) {
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, i2);
            ofInt.setDuration(Math.max(400, Math.round(((float) this.animationDuration) * (Math.abs(i2) / getScrollLimit()))));
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (FlexibleMarqueeGallery.access$000(FlexibleMarqueeGallery.this)) {
                    } else {
                        int intValue = FlexibleMarqueeGallery.this.mAutoScrollAnimationOnStart + ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                        FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
                        flexibleMarqueeGallery.scrollTo(intValue, flexibleMarqueeGallery.getScrollY());
                    }
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        FlexibleMarqueeGallery.this.magnatePositionAnimator = null;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        FlexibleMarqueeGallery.this.magnatePositionAnimator = null;
                    }
                }
            });
            this.magnatePositionAnimator = ofInt;
            ofInt.start();
        } else {
            smoothScrollTo(i, getScrollY());
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void smoothScrollToRect(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efe6aa2", new Object[]{this, new Integer(i)});
        } else {
            smoothScrollToRectWithAnim(i, true);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int getScrollLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5e6dc32", new Object[]{this})).intValue() : Math.round(this.mGalleryDisplayWidth - 100);
    }

    private int getScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512138b4", new Object[]{this})).intValue();
        }
        if (getChildCount() <= 0) {
            return 0;
        }
        return Math.max(0, this.mScrollContent.getWidth() - this.mGalleryDisplayWidth);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (!this.myScroller.computeScrollOffset()) {
        } else {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.myScroller.getCurrX();
            int currY = this.myScroller.getCurrY();
            if (scrollX == currX && scrollY == currY) {
                return;
            }
            int scrollRange = getScrollRange();
            getOverScrollMode();
            overScrollBy(currX - scrollX, currY - scrollY, scrollX, scrollY, scrollRange, 0, 0, 0, false);
            onScrollChanged(currX, currY, scrollX, scrollY);
        }
    }

    private int getFlingThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc66555f", new Object[]{this})).intValue() : this.mGalleryDisplayWidth / 2;
    }

    private int getMinimumFlingVelocityLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad922254", new Object[]{this})).intValue() : this.mGalleryDisplayWidth << 2;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac96b80", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mGalleryDisplayWidth;
        int width = this.mScrollContent.getWidth();
        getScrollX();
        float f = i;
        if (Math.abs((int) (this.mFlingFactor * f)) < getFlingThreshold()) {
            return;
        }
        this.myScroller.fling(getScrollX(), getScrollY(), Math.max(getMinimumFlingVelocityLimit(), (int) (this.mFlingFactor * f)) * ((int) Math.signum(f)), 0, 0, width - i2, 0, 0, 0, 0);
        removeCallbacks(this.mScrollerTask);
        postDelayed(this.mScrollerTask, 16L);
        this.mIsFling = true;
    }

    public int moveDelayFunction(int i, int i2, int i3, int i4) {
        int round;
        int round2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95a015e4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        int i5 = this.mActualVisibleCardCount;
        if (i > 0) {
            int max = Math.max(i3, Math.min(i5, i2 - 2));
            int i6 = this.moveAnimeDelayDistance;
            if (i6 > 0) {
                round2 = max * i6;
            } else {
                float f = this.moveAnimeDelayDistanceRate;
                round2 = f > 0.0f ? Math.round(i4 * f * max) : 0;
            }
            return Math.max(0, Math.abs(i) - round2);
        } else if (i >= 0) {
            return 0;
        } else {
            int max2 = Math.max(i3, Math.min(i5 - 1, i5 - i2));
            int i7 = this.moveAnimeDelayDistance;
            if (i7 > 0) {
                round = max2 * i7;
            } else {
                float f2 = this.moveAnimeDelayDistanceRate;
                round = f2 > 0.0f ? Math.round(i4 * f2 * max2) : 0;
            }
            return Math.max(0, Math.abs(i) - round);
        }
    }

    public int getScrollLimitWithDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f308eaea", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = this.moveAnimeDelayDistance;
        float f = 0.0f;
        if (i2 > 0) {
            f = i2 * i;
        } else if (this.moveAnimeDelayDistanceRate > 0.0f) {
            f = getScrollLimit() * this.moveAnimeDelayDistanceRate * i;
        }
        return Math.round(getScrollLimit() - f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0241  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrollChanged(int r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.onScrollChanged(int, int, int, int):void");
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public boolean checkViewHasInVisibleRect(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36f3d3eb", new Object[]{this, view})).booleanValue() : checkViewHasInVisibleRect(view, true);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public boolean checkViewHasInVisibleRect(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7875bd1", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        if (view != null && view.getLayoutParams() != null && view.getParent() != null) {
            int i = z ? this.mCardSpacing : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams instanceof FlexibleContainerView.LayoutParams) {
                FlexibleContainerView.LayoutParams layoutParams2 = (FlexibleContainerView.LayoutParams) layoutParams;
                return layoutParams2.right + i > getScrollX() && (getScrollX() + getWidth()) + i > layoutParams2.left;
            } else if (layoutParams.leftMargin + layoutParams.width + i > getScrollX() && getScrollX() + getWidth() + i > layoutParams.leftMargin) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int viewIndexForVirtualIndex(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d3a6a2c", new Object[]{this, new Integer(i)})).intValue() : this.loopScrollEnable ? (((this.mCurrentItem + i) - 1) + this.mExpectedAdapterCount) % this.mExpectedAdapterCount : i;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int virtualIndexForViewIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ef851a4", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.loopScrollEnable) {
            if (!this.init) {
                return i + 1;
            }
            if (i == this.mCurrentItem) {
                return 1;
            }
            int scrollX = getScrollX();
            int i2 = i - this.mCurrentItem;
            if (i2 == -1 || i2 == this.mExpectedAdapterCount - 1) {
                int i3 = this.mIdleStateScrollOffset;
                if (scrollX > i3) {
                    if (this.mCurrentItem + this.mActualVisibleCardCount >= this.mExpectedAdapterCount) {
                        return ((i + this.mExpectedAdapterCount) - this.mCurrentItem) + 1;
                    }
                    return (i - this.mCurrentItem) + 1;
                } else if (scrollX < i3) {
                    return 0;
                }
            } else {
                int i4 = (i - this.mCurrentItem) + 1;
                return i4 < 0 ? i4 + this.mExpectedAdapterCount : i4;
            }
        }
        return i;
    }

    public void scrollToAndMuteOnScrollChanged(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e545c847", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.muteOnScrollChanged = true;
        super.scrollTo(i, i2);
        this.muteOnScrollChanged = false;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void reloadViews(int i, ViewGroup viewGroup) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa71366", new Object[]{this, new Integer(i), viewGroup});
            return;
        }
        this.mLastContentOffset = 0;
        this.mCurrentItem = 0;
        this.mSetVisibleIndexedHandler.removeCallbacksAndMessages(null);
        this.init = false;
        this.childrenCount = i;
        if (viewGroup != null) {
            this.mScrollContent = viewGroup;
            this.mScrollContent.removeAllViews();
            z = true;
        } else {
            this.mScrollContent = new FlexibleContainerView(getContext());
            z = false;
        }
        this.mActualVisibleCardCount = this.mExpectedAdapterCount > 2 ? this.mFoldedCardVisibleCount + 1 : 1;
        this.mExpandedCardWidth = this.mGalleryDisplayWidth - ((this.mFoldedCardWidth + this.mCardSpacing) * Math.min(Math.max(0, this.mExpectedAdapterCount - 1), this.mFoldedCardVisibleCount));
        scrollToAndMuteOnScrollChanged(this.mIdleStateScrollOffset, 0);
        if (getChildCount() > 0 && this.mScrollContent.getParent() == this) {
            this.init = z;
        } else {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            if (this.mScrollContent.getParent() != null) {
                ((ViewGroup) this.mScrollContent.getParent()).removeView(this.mScrollContent);
            }
        }
        int i2 = this.mCardHeight > 0 ? this.mCardHeight : getLayoutParams().height;
        this.mainContentWidth = (this.mIdleStateScrollOffset << 1) + this.mGalleryDisplayWidth;
        this.mScrollContent.setMinimumWidth(this.mainContentWidth);
        addView(this.mScrollContent, new FlexibleContainerView.LayoutParams(this.mainContentWidth, i2));
        this.mCardRectArray = initCardRectArray(this.mCardHeight, this.mExpandedCardWidth, this.mFoldedCardWidth, this.mCardSpacing, this.mActualVisibleCardCount);
        Rect rect = new Rect();
        this.backwardsLoopSpacing = this.mActualVisibleCardCount > 1 ? this.mGalleryDisplayWidth + this.mFoldedCardWidth + (this.mCardSpacing << 1) : this.mExpandedCardWidth;
        this.forwardsLoopSpacing = this.mActualVisibleCardCount > 1 ? (this.mFoldedCardWidth + this.mCardSpacing) * (this.mActualVisibleCardCount + 1) : this.mExpandedCardWidth;
        String str = TAG;
        mfj.c(str, "MarqueeGallery >> screen=" + this.mGalleryDisplayWidth + " expandedCard.w=" + this.mExpandedCardWidth + " foldedCard.w=" + this.mFoldedCardWidth + " cardSpacing=" + this.mCardSpacing + " total=" + this.mExpectedAdapterCount + " visible=" + this.mActualVisibleCardCount);
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("MarqueeGallery >> backwardsSpacing=");
        sb.append(this.backwardsLoopSpacing);
        sb.append(" forwardsLoopSpacing=");
        sb.append(this.forwardsLoopSpacing);
        mfj.c(str2, sb.toString());
        for (int i3 = 0; i3 < this.mExpectedAdapterCount; i3++) {
            b bVar = new b();
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setFocusable(true);
            frameLayout.setFocusableInTouchMode(true);
            frameLayout.setImportantForAccessibility(1);
            frameLayout.setTag("item_" + i3);
            if (Build.VERSION.SDK_INT >= 21 && this.mCardCornerRadius > 0.0f) {
                frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                        } else {
                            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), FlexibleMarqueeGallery.this.mCardCornerRadius);
                        }
                    }
                });
                frameLayout.setClipToOutline(true);
            }
            bVar.f14155a = frameLayout;
            bVar.f14155a.setBackgroundColor(-1);
            bVar.b = this.mAdapter.instantiateItem((ViewGroup) frameLayout, i3);
            if (bVar.b instanceof View) {
                View view = (View) bVar.b;
                if (view.getParent() == null) {
                    frameLayout.addView(view, new FrameLayout.LayoutParams(this.mExpandedCardWidth, this.mCardHeight));
                } else if (view.getParent() != frameLayout) {
                    ((ViewGroup) view.getParent()).removeView(view);
                    frameLayout.addView(view, new FrameLayout.LayoutParams(this.mExpandedCardWidth, this.mCardHeight));
                }
            } else {
                TextView textView = new TextView(getContext());
                textView.setText("item-" + i3);
                textView.setTextSize(1, 16.0f);
                frameLayout.addView(textView, new FrameLayout.LayoutParams(this.mExpandedCardWidth, this.mCardHeight));
            }
            this.mItems.add(bVar);
            if (this.mOnCardAnimatePerformListener != null) {
                if (i3 == this.mCurrentItem) {
                    triggerOnCardAnimatePerform(frameLayout, i3, 1.0f, true, this.mExpandedCardWidth, this.mCardHeight);
                } else {
                    triggerOnCardAnimatePerform(frameLayout, i3, 0.0f, true, this.mFoldedCardWidth, this.mCardHeight);
                }
            }
            if (i3 <= this.mActualVisibleCardCount) {
                rectForIndex(virtualIndexForViewIndex(i3), virtualIndexForViewIndex(this.mCurrentItem), true, rect);
                rect.offset(this.mIdleStateScrollOffset, 0);
                FlexibleContainerView.LayoutParams layoutParams = new FlexibleContainerView.LayoutParams(rect.width(), rect.height());
                layoutParams.fillLayoutResult(rect);
                this.mScrollContent.addView(bVar.f14155a, layoutParams);
            }
        }
        this.mCurrentVisibleVirtualIndexes.clear();
        this.mCurrentVisibleViewIndexes.clear();
        this.lastVirtualStart = virtualIndexForViewIndex(this.mCurrentItem);
        this.lastVirtualEnd = (this.lastVirtualStart + this.mActualVisibleCardCount) - 1;
        if (this.mOnGalleryScrollListener == null) {
            return;
        }
        for (int i4 = this.lastVirtualStart; i4 <= this.lastVirtualEnd; i4++) {
            int viewIndexForVirtualIndex = viewIndexForVirtualIndex(i4);
            this.mCurrentVisibleVirtualIndexes.add(Integer.valueOf(i4));
            this.mCurrentVisibleViewIndexes.add(Integer.valueOf(viewIndexForVirtualIndex));
            getItemInfo(viewIndexForVirtualIndex, b.class);
        }
    }

    public Rect[] initCardRectArray(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect[]) ipChange.ipc$dispatch("7d051c53", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        }
        int i6 = i5 + 2;
        Rect[] rectArr = new Rect[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 == 0) {
                rectArr[i7] = new Rect((-i2) - i4, 0, -i4, i);
            } else {
                int i8 = i7 - 1;
                if (i8 == 0) {
                    rectArr[i7] = new Rect(0, 0, i2, i);
                } else {
                    int i9 = ((i4 + i3) * (i8 - 1)) + i2 + i4;
                    rectArr[i7] = new Rect(i9, 0, i9 + i3, i);
                }
            }
        }
        return rectArr;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public Rect rectForIndex(int i, int i2, boolean z, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c5a782c2", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), rect});
        }
        if (rect == null) {
            rect = new Rect();
        }
        rect.set(this.mCardRectArray[i]);
        return rect;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void setCurrentSelected(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d9af7ea", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.notifyOnSwitch = z;
        this.mCurrentItem = i;
        if (getWidth() == 0) {
            post(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.FlexibleMarqueeGallery.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FlexibleMarqueeGallery flexibleMarqueeGallery = FlexibleMarqueeGallery.this;
                    flexibleMarqueeGallery.scrollTo(flexibleMarqueeGallery.mIdleStateScrollOffset, FlexibleMarqueeGallery.this.getScrollY());
                }
            });
        } else {
            scrollTo(this.mIdleStateScrollOffset, getScrollY());
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public int getGalleryDisplayWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3375fda", new Object[]{this})).intValue();
        }
        if (this.mGalleryDisplayWidth == 0) {
            if (getWidth() != 0) {
                return getWidth();
            }
            return getLayoutParams().width;
        }
        return this.mGalleryDisplayWidth;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery
    public void autoScrollToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8c7011", new Object[]{this});
        } else if (this.mIsTouching || !this.myScroller.isFinished()) {
        } else {
            ValueAnimator valueAnimator = this.magnatePositionAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            if (this.mOnGalleryScrollListener != null) {
                this.mIsRunnerScrollStarted = true;
                getScrollX();
            }
            smoothScrollToRectWithAnim(this.mIdleStateScrollOffset + getScrollLimit(), true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6d8986", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
        } else if (Math.abs(i - getScrollX()) >= getScrollLimit()) {
        } else {
            onOverScrolledMod(i, i2, z, z2);
        }
    }

    public void onOverScrolledMod(int i, int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674ae2ca", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
        } else if (Math.abs(i - getScrollX()) >= this.mGalleryDisplayWidth) {
        } else {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar = this.mGallery2Runner;
            if (cVar != null) {
                cVar.b();
            }
            ValueAnimator valueAnimator = this.magnatePositionAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.magnatePositionAnimator.cancel();
            }
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.mIsTouching = false;
            com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar2 = this.mGallery2Runner;
            if (cVar2 != null) {
                cVar2.a(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void triggerOnCardAnimatePerform(View view, int i, float f, boolean z, int i2, int i3) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b257f3", new Object[]{this, view, new Integer(i), new Float(f), new Boolean(z), new Integer(i2), new Integer(i3)});
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (this.mOnCardAnimatePerformListener == null || (bVar = (b) getItemInfo(i, b.class)) == null) {
            return;
        }
        a aVar = bVar.g;
        if (aVar == null) {
            this.mOnCardAnimatePerformListener.onAnimatePerform(view, i, max, z, i2, i3);
            a aVar2 = new a();
            aVar2.f14164a = max;
            aVar2.b = z;
            aVar2.c = i2;
            aVar2.d = i3;
            bVar.g = aVar2;
        } else if (Float.compare(aVar.f14164a, max) == 0 && Float.compare(aVar.c, i2) == 0 && Float.compare(aVar.d, i3) == 0 && aVar.b == z) {
        } else {
            this.mOnCardAnimatePerformListener.onAnimatePerform(view, i, max, z, i2, i3);
            aVar.f14164a = max;
            aVar.b = z;
            aVar.c = i2;
            aVar.d = i3;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar = this.mGallery2Runner;
        if (cVar != null) {
            cVar.a(false);
        }
        if (this.hasRegisterReceiver) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        getContext().registerReceiver(this.mReceiver, intentFilter);
        this.hasRegisterReceiver = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar = this.mGallery2Runner;
        if (cVar != null) {
            cVar.b();
        }
        try {
            getContext().unregisterReceiver(this.mReceiver);
            this.hasRegisterReceiver = false;
        } catch (Exception unused) {
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
        com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c cVar = this.mGallery2Runner;
        if (cVar == null) {
            return;
        }
        if (i == 0) {
            cVar.a(false);
        } else {
            cVar.b();
        }
    }
}
