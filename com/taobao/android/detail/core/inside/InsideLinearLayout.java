package com.taobao.android.detail.core.inside;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.eip;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class InsideLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DETAIL_ORANGE_NAMESPACE = "android_detail";
    private static final String MINI_WINDOW_OPT_ORANGE = "mini_window_opt";
    private static final String TAG = "InsideLinearLayout";
    private Boolean hasInterceptMoveEvent;
    private int mCurrentY;
    private IDetailAdapter mDetailAdapter;
    private InsideDetailState mDetailState;
    private int mFirstX;
    private int mFirstY;
    private SimpleGestureType mGestureType;
    private InsideScrollListener mInsideScrollListener;
    private List<a> mInsideStateChangedListeners;
    private int mScrollDirectionMinPix;
    private int mStartTopHeight;
    private VelocityTracker mTracker;
    private View tempTopView;
    private ObjectAnimator transparentHeaderViewAnimator;
    private final ValueAnimator.AnimatorUpdateListener transparentHeaderViewAnimatorListener;

    /* loaded from: classes4.dex */
    public interface IDetailAdapter extends a {
        boolean canExpandDetail();

        void finishActivity();

        boolean isInTopState();
    }

    /* loaded from: classes4.dex */
    public enum InsideDetailState {
        INSIDE_CREATE,
        HALF_SCREEN,
        FULL_SCREEN,
        INSIDE_DESTROY
    }

    /* loaded from: classes4.dex */
    public interface InsideScrollListener {
        void insideViewScroll(int i);
    }

    /* loaded from: classes4.dex */
    public enum SimpleGestureType {
        GESTURE_UNKNOWN,
        GESTURE_VERTICAL,
        GESTURE_MOVE_UP,
        GESTURE_MOVE_DOWN,
        GESTURE_HORIZONTAL
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a(InsideDetailState insideDetailState);

        void b(InsideDetailState insideDetailState);
    }

    static {
        kge.a(-1223548423);
    }

    public static /* synthetic */ Object ipc$super(InsideLinearLayout insideLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -436676516) {
                super.onFinishInflate();
                return null;
            } else if (hashCode != 2075560917) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ void access$000(InsideLinearLayout insideLinearLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1762896", new Object[]{insideLinearLayout, new Integer(i)});
        } else {
            insideLinearLayout.notifyScrollListener(i);
        }
    }

    public static /* synthetic */ InsideDetailState access$100(InsideLinearLayout insideLinearLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InsideDetailState) ipChange.ipc$dispatch("6835c9be", new Object[]{insideLinearLayout}) : insideLinearLayout.mDetailState;
    }

    public static /* synthetic */ IDetailAdapter access$200(InsideLinearLayout insideLinearLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDetailAdapter) ipChange.ipc$dispatch("421fd40", new Object[]{insideLinearLayout}) : insideLinearLayout.mDetailAdapter;
    }

    public InsideLinearLayout(Context context) {
        super(context);
        this.mScrollDirectionMinPix = 10;
        this.mFirstY = 0;
        this.mFirstX = 0;
        this.mCurrentY = 0;
        this.mGestureType = SimpleGestureType.GESTURE_UNKNOWN;
        this.mInsideStateChangedListeners = new ArrayList();
        this.transparentHeaderViewAnimatorListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.inside.InsideLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    InsideLinearLayout.access$000(InsideLinearLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        };
        init(context);
    }

    public InsideLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mScrollDirectionMinPix = 10;
        this.mFirstY = 0;
        this.mFirstX = 0;
        this.mCurrentY = 0;
        this.mGestureType = SimpleGestureType.GESTURE_UNKNOWN;
        this.mInsideStateChangedListeners = new ArrayList();
        this.transparentHeaderViewAnimatorListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.inside.InsideLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    InsideLinearLayout.access$000(InsideLinearLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        };
        init(context);
    }

    public InsideLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollDirectionMinPix = 10;
        this.mFirstY = 0;
        this.mFirstX = 0;
        this.mCurrentY = 0;
        this.mGestureType = SimpleGestureType.GESTURE_UNKNOWN;
        this.mInsideStateChangedListeners = new ArrayList();
        this.transparentHeaderViewAnimatorListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.inside.InsideLinearLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else {
                    InsideLinearLayout.access$000(InsideLinearLayout.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            }
        };
        init(context);
    }

    public void setDetailAdapter(IDetailAdapter iDetailAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c398b51e", new Object[]{this, iDetailAdapter});
        } else {
            this.mDetailAdapter = iDetailAdapter;
        }
    }

    public void addOnInsideStateChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b410953", new Object[]{this, aVar});
        } else if (this.mInsideStateChangedListeners.contains(aVar)) {
        } else {
            this.mInsideStateChangedListeners.add(aVar);
        }
    }

    public void removeOnInsideStateChangedListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de10eb6", new Object[]{this, aVar});
        } else {
            this.mInsideStateChangedListeners.remove(aVar);
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mScrollDirectionMinPix = ViewConfiguration.get(context).getScaledTouchSlop();
        emu.a("com.taobao.android.detail.core.inside.InsideLinearLayout");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IDetailAdapter iDetailAdapter;
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hasInterceptMoveEvent = null;
        } else if (action != 1) {
            if (action != 2) {
                return true;
            }
            Boolean bool = this.hasInterceptMoveEvent;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (this.tempTopView.getLayoutParams().height == 0 || !isVerticalMove()) {
                if (motionEvent.getY() - this.mFirstY > 0.0f && (iDetailAdapter = this.mDetailAdapter) != null && iDetailAdapter.isInTopState() && isVerticalMove()) {
                    z = true;
                }
                z2 = z;
            }
            if (!isVerticalMove()) {
                return z2;
            }
            this.hasInterceptMoveEvent = Boolean.valueOf(z2);
            return z2;
        }
        Boolean bool2 = this.hasInterceptMoveEvent;
        return bool2 != null && bool2.booleanValue();
    }

    private boolean isVerticalMove() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("956822bc", new Object[]{this})).booleanValue() : this.mGestureType == SimpleGestureType.GESTURE_VERTICAL || this.mGestureType == SimpleGestureType.GESTURE_MOVE_UP || this.mGestureType == SimpleGestureType.GESTURE_MOVE_DOWN;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(false);
        if (motionEvent.getAction() == 0) {
            this.mFirstY = 0;
            this.mCurrentY = 0;
            this.mGestureType = SimpleGestureType.GESTURE_UNKNOWN;
            this.mFirstY = (int) motionEvent.getY();
            this.mFirstX = (int) motionEvent.getX();
        } else if (motionEvent.getAction() == 2) {
            int abs = Math.abs(((int) motionEvent.getX()) - this.mFirstX);
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.mFirstY);
            if (this.mGestureType == SimpleGestureType.GESTURE_UNKNOWN && (abs > (i = this.mScrollDirectionMinPix) || abs2 > i)) {
                this.mGestureType = abs > abs2 ? SimpleGestureType.GESTURE_HORIZONTAL : SimpleGestureType.GESTURE_VERTICAL;
            }
        }
        return dispatchTouchEvent;
    }

    public void setInsideScrollListener(InsideScrollListener insideScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc50c453", new Object[]{this, insideScrollListener});
        } else {
            this.mInsideScrollListener = insideScrollListener;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.inside.InsideLinearLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            r1[r4] = r6
            java.lang.String r6 = "a9b14c3a"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            super.onTouchEvent(r6)
            android.view.VelocityTracker r0 = r5.mTracker
            if (r0 != 0) goto L29
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.mTracker = r0
        L29:
            android.view.VelocityTracker r0 = r5.mTracker
            r0.addMovement(r6)
            int r0 = r6.getAction()
            if (r0 == r4) goto L6b
            if (r0 == r3) goto L3a
            r6 = 3
            if (r0 == r6) goto L6b
            goto L78
        L3a:
            int r0 = r5.mCurrentY
            if (r0 != 0) goto L40
            int r0 = r5.mFirstY
        L40:
            float r6 = r6.getY()
            int r6 = (int) r6
            r5.mCurrentY = r6
            int r6 = r5.mCurrentY
            int r6 = r6 - r0
            com.taobao.android.detail.core.inside.InsideLinearLayout$IDetailAdapter r0 = r5.mDetailAdapter
            if (r0 == 0) goto L6a
            boolean r0 = r0.canExpandDetail()
            if (r0 != 0) goto L55
            goto L6a
        L55:
            if (r6 <= 0) goto L5f
            com.taobao.android.detail.core.inside.InsideLinearLayout$SimpleGestureType r0 = com.taobao.android.detail.core.inside.InsideLinearLayout.SimpleGestureType.GESTURE_MOVE_DOWN
            r5.mGestureType = r0
            r5.handleDownScroll(r6)
            goto L78
        L5f:
            if (r6 >= 0) goto L78
            com.taobao.android.detail.core.inside.InsideLinearLayout$SimpleGestureType r0 = com.taobao.android.detail.core.inside.InsideLinearLayout.SimpleGestureType.GESTURE_MOVE_UP
            r5.mGestureType = r0
            int r6 = -r6
            r5.handleUpScroll(r6)
            goto L78
        L6a:
            return r2
        L6b:
            r5.autoToEndState()
            android.view.VelocityTracker r6 = r5.mTracker
            if (r6 == 0) goto L78
            r6.recycle()
            r6 = 0
            r5.mTracker = r6
        L78:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.inside.InsideLinearLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void handleUpScroll(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e71cdcc", new Object[]{this, new Integer(i)});
            return;
        }
        int i3 = this.tempTopView.getLayoutParams().height;
        int i4 = i3 - i;
        if (i4 < 0) {
            i4 = 0;
        }
        if (!eip.T && i3 > (i2 = this.mScrollDirectionMinPix) && i4 < i2) {
            for (a aVar : this.mInsideStateChangedListeners) {
                aVar.b(InsideDetailState.FULL_SCREEN);
            }
        }
        this.tempTopView.getLayoutParams().height = i4;
        this.tempTopView.requestLayout();
        notifyScrollListener(i4);
    }

    private void handleDownScroll(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73eaf65", new Object[]{this, new Integer(i)});
            return;
        }
        int i3 = this.tempTopView.getLayoutParams().height;
        int i4 = i + i3;
        if (!eip.T && i3 < (i2 = this.mScrollDirectionMinPix) && i4 > i2) {
            for (a aVar : this.mInsideStateChangedListeners) {
                aVar.b(InsideDetailState.HALF_SCREEN);
            }
        }
        this.tempTopView.getLayoutParams().height = i4;
        this.tempTopView.requestLayout();
        notifyScrollListener(i4);
    }

    private void notifyScrollListener(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5ffb52", new Object[]{this, new Integer(i)});
            return;
        }
        InsideScrollListener insideScrollListener = this.mInsideScrollListener;
        if (insideScrollListener == null) {
            return;
        }
        insideScrollListener.insideViewScroll(i);
    }

    private void autoToEndState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819d03a7", new Object[]{this});
            return;
        }
        int topViewHeight = getTopViewHeight();
        if (expandPage(topViewHeight)) {
            shrinkTopView(topViewHeight);
        } else if (closePage(topViewHeight)) {
            expandTopView(topViewHeight);
        } else {
            resetTopView(topViewHeight);
        }
    }

    private boolean expandPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a76a6cb7", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mGestureType == SimpleGestureType.GESTURE_MOVE_UP && this.mDetailState == InsideDetailState.HALF_SCREEN) {
            this.mTracker.computeCurrentVelocity(1000);
            if (this.mTracker.getYVelocity() < -1000.0f || (this.mStartTopHeight - i) / getHeight() > 0.05f) {
                return true;
            }
        }
        return false;
    }

    private boolean closePage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b13d719", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mGestureType != SimpleGestureType.GESTURE_MOVE_DOWN) {
            return false;
        }
        this.mTracker.computeCurrentVelocity(1000);
        if (this.mTracker.getYVelocity() > 1000.0f) {
            return true;
        }
        return ((float) (i - (this.mDetailState == InsideDetailState.HALF_SCREEN ? this.mStartTopHeight : 0))) / ((float) getHeight()) > 0.05f;
    }

    private void resetTopView(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841124f1", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mDetailState != InsideDetailState.FULL_SCREEN) {
            i2 = this.mStartTopHeight;
        }
        doAnim(this.tempTopView, "Height", i, i2);
    }

    public InsideDetailState getDetailState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InsideDetailState) ipChange.ipc$dispatch("dde5b8db", new Object[]{this}) : this.mDetailState;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        this.tempTopView = findViewById(R.id.x_detail_temp_view);
    }

    private void expandTopView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0d4dbc", new Object[]{this, new Integer(i)});
        } else {
            doAnim(this.tempTopView, "Height", i, getHeight());
        }
    }

    private void shrinkTopView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2afe06ab", new Object[]{this, new Integer(i)});
        } else {
            doAnim(this.tempTopView, "Height", i, 0);
        }
    }

    private int getTopViewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c1a492a5", new Object[]{this})).intValue() : this.tempTopView.getLayoutParams().height;
    }

    public void doAnim(View view, String str, int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebbea59", new Object[]{this, view, str, new Integer(i), new Integer(i2)});
            return;
        }
        ViewWrapper viewWrapper = new ViewWrapper(view);
        ObjectAnimator objectAnimator = this.transparentHeaderViewAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.transparentHeaderViewAnimator.removeAllUpdateListeners();
        }
        this.transparentHeaderViewAnimator = ObjectAnimator.ofInt(viewWrapper, str, i, i2).setDuration(250L);
        this.transparentHeaderViewAnimator.setInterpolator(new LinearInterpolator());
        this.transparentHeaderViewAnimator.addUpdateListener(this.transparentHeaderViewAnimatorListener);
        this.transparentHeaderViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.detail.core.inside.InsideLinearLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (i2 == 0 && InsideLinearLayout.access$100(InsideLinearLayout.this) != InsideDetailState.FULL_SCREEN) {
                    InsideLinearLayout.this.notifyInsideDetailState(InsideDetailState.FULL_SCREEN);
                } else if (i2 != InsideLinearLayout.this.getHeight() || InsideLinearLayout.access$200(InsideLinearLayout.this) == null) {
                } else {
                    InsideLinearLayout.access$200(InsideLinearLayout.this).finishActivity();
                }
            }
        });
        this.transparentHeaderViewAnimator.start();
    }

    public void setHalfScreenTopViewHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4f12fc", new Object[]{this, new Integer(i)});
        } else if (this.mDetailState == InsideDetailState.FULL_SCREEN) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.tempTopView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = i;
            this.mStartTopHeight = i;
            this.tempTopView.setLayoutParams(layoutParams);
        }
    }

    public void notifyInsideDetailState(InsideDetailState insideDetailState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbed758", new Object[]{this, insideDetailState});
        } else if (insideDetailState != this.mDetailState) {
            this.mDetailState = insideDetailState;
            for (a aVar : this.mInsideStateChangedListeners) {
                aVar.a(this.mDetailState);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class ViewWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View rView;

        static {
            kge.a(1682336739);
        }

        public ViewWrapper(View view) {
            this.rView = view;
        }

        public int getWidth() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue() : this.rView.getLayoutParams().width;
        }

        public void setWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
                return;
            }
            this.rView.getLayoutParams().width = i;
            this.rView.requestLayout();
        }

        public int getHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue() : this.rView.getLayoutParams().height;
        }

        public void setHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
                return;
            }
            this.rView.getLayoutParams().height = i;
            this.rView.requestLayout();
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mInsideScrollListener = null;
        this.mDetailAdapter = null;
        this.mInsideStateChangedListeners.clear();
        ObjectAnimator objectAnimator = this.transparentHeaderViewAnimator;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.cancel();
        this.transparentHeaderViewAnimator.removeAllUpdateListeners();
    }
}
