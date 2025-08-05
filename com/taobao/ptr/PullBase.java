package com.taobao.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes7.dex */
public class PullBase extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_POINTER_ID = -1;
    private static final float MAX_PULL_SCROLL_FRICTION = 1.0f;
    private static final int SMOOTH_SCROLL_DURATION_MS = 350;
    private static final String STATE_SUPER = "pull_super";
    private int mActivePointerId;
    private int mActivePointerIndex;
    private h mContentView;
    private Mode mCurrentMode;
    private d mCurrentSmoothScrollRunnable;
    private PullLayout mEndLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    private float mLastMotionX;
    private float mLastMotionY;
    private Mode mMode;
    private List<b> mOnPullListeners;
    private Interpolator mPullInterpolator;
    private Interpolator mReleaseInterpolator;
    private List<a> mScrollListeners;
    private PullLayout mStartLayout;
    private int mTouchSlop;

    /* renamed from: com.taobao.ptr.PullBase$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18956a = new int[Mode.values().length];

        static {
            try {
                f18956a[Mode.PULL_FROM_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18956a[Mode.PULL_FROM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18956a[Mode.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18956a[Mode.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum Mode {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3);
        
        private int mIntValue;

        Mode(int i) {
            this.mIntValue = i;
        }

        public static Mode getDefault() {
            return DISABLED;
        }

        public static Mode mapIntToValue(int i) {
            Mode[] values;
            for (Mode mode : values()) {
                if (i == mode.getIntValue()) {
                    return mode;
                }
            }
            return getDefault();
        }

        int getIntValue() {
            return this.mIntValue;
        }

        public boolean isUnderPermit(Mode mode) {
            if (mode != null) {
                int i = AnonymousClass4.f18956a[ordinal()];
                if (i == 1 || i == 2) {
                    if (this != mode && mode != DISABLED) {
                        return false;
                    }
                } else if (i != 3 && i != 4) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public boolean permitsPullEnd() {
            return this == PULL_FROM_END || this == BOTH;
        }

        public boolean permitsPullStart() {
            return this == PULL_FROM_START || this == BOTH;
        }
    }

    /* loaded from: classes7.dex */
    public interface a {
        void a(PullBase pullBase, int i);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(PullBase pullBase, Mode mode, float f, int i);

        void b(PullBase pullBase, Mode mode, float f, int i);

        void c(PullBase pullBase, Mode mode, float f, int i);
    }

    /* loaded from: classes7.dex */
    public interface c {
        void a();
    }

    static {
        kge.a(-420996470);
    }

    private int getPullScrollDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a91196", new Object[]{this})).intValue() : SMOOTH_SCROLL_DURATION_MS;
    }

    public static /* synthetic */ Object ipc$super(PullBase pullBase, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public boolean allowCatchPullEndTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1eda6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean allowCatchPullStartTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c983f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean allowCheckPullWhenRollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c341ac2d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void onContentViewAdded(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c22744b", new Object[]{this, viewGroup, view});
        }
    }

    public void onContentViewRemoved(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d98d2b", new Object[]{this, viewGroup, view});
        }
    }

    public void onDirectionUpdated(Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f21a0f", new Object[]{this, mode, new Integer(i)});
        }
    }

    public void onModeUpdated(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff9f2", new Object[]{this, mode});
        }
    }

    public void onPull(Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665d0dc0", new Object[]{this, mode, new Float(f), new Integer(i)});
        }
    }

    public void onPullRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadf80bb", new Object[]{this, bundle});
        }
    }

    public void onPullSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd473072", new Object[]{this, bundle});
        }
    }

    public int onRelease(Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d074ac17", new Object[]{this, mode, new Float(f), new Integer(i)})).intValue();
        }
        return 0;
    }

    public static /* synthetic */ void access$100(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a25e3f", new Object[]{pullBase});
        } else {
            pullBase.callOnReset();
        }
    }

    public static /* synthetic */ void access$200(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d29e1e", new Object[]{pullBase});
        } else {
            pullBase.releaseEvent();
        }
    }

    public static /* synthetic */ void access$300(PullBase pullBase, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d1f2ee", new Object[]{pullBase, new Integer(i), new Boolean(z)});
        } else {
            pullBase.scrollPullLayoutTo(i, z);
        }
    }

    public PullBase(Context context) {
        super(context);
        this.mMode = Mode.getDefault();
        this.mCurrentMode = Mode.getDefault();
        this.mActivePointerId = -1;
        init(context, null);
    }

    public PullBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = Mode.getDefault();
        this.mCurrentMode = Mode.getDefault();
        this.mActivePointerId = -1;
        init(context, attributeSet);
    }

    public PullBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMode = Mode.getDefault();
        this.mCurrentMode = Mode.getDefault();
        this.mActivePointerId = -1;
        init(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        checkChild(view);
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        checkChild(view);
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, i, layoutParams);
    }

    private void checkChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24376977", new Object[]{this, view});
        } else if (view == this.mStartLayout || view == this.mEndLayout) {
        } else {
            if (getChildCount() <= 0 && (view instanceof h)) {
                return;
            }
            throw new IllegalStateException("PullBase can host only one direct and PullAdapter child");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        if (!(view instanceof h)) {
            return;
        }
        contentViewAdded(view);
    }

    private void contentViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78869c9", new Object[]{this, view});
            return;
        }
        h hVar = (h) view;
        this.mContentView = hVar;
        onContentViewAdded(this, view);
        if (view instanceof h) {
            hVar.onPullAdapterAdded(this);
        }
        updateDirection();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        if (!(view instanceof h)) {
            return;
        }
        contentViewRemoved(view);
    }

    private void contentViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fee6e9", new Object[]{this, view});
            return;
        }
        this.mContentView = null;
        removeAllPullLayout();
        onContentViewRemoved(this, view);
        if (!(view instanceof h)) {
            return;
        }
        ((h) view).onPullAdapterRemoved(this);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.mOnPullListeners = new ArrayList();
        this.mScrollListeners = new ArrayList();
        setGravity(17);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Pull);
        if (obtainStyledAttributes.hasValue(R.styleable.Pull_pullMode)) {
            this.mMode = Mode.mapIntToValue(obtainStyledAttributes.getInteger(R.styleable.Pull_pullMode, Mode.getDefault().getIntValue()));
        }
        this.mStartLayout = mo1210createStartPullLayout(context, Mode.PULL_FROM_START, attributeSet);
        this.mEndLayout = mo1209createEndPullLayout(context, Mode.PULL_FROM_END, attributeSet);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: createStartPullLayout */
    public PullLayout mo1210createStartPullLayout(Context context, Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullLayout) ipChange.ipc$dispatch("f7b4a0fe", new Object[]{this, context, mode, attributeSet}) : new PullLayout(context, mode, getPullDirectionInternal(), attributeSet);
    }

    /* renamed from: createEndPullLayout */
    public PullLayout mo1209createEndPullLayout(Context context, Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullLayout) ipChange.ipc$dispatch("aca86d37", new Object[]{this, context, mode, attributeSet}) : new PullLayout(context, mode, getPullDirectionInternal(), attributeSet);
    }

    public final void updateDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd34fa3d", new Object[]{this});
        } else if (isContentInvalid()) {
        } else {
            forceStopCurrentSmoothScrollTask();
            if (getPullDirectionInternal() == 1) {
                setOrientation(0);
            } else {
                setOrientation(1);
            }
            if (isInEditMode()) {
                clipPaddingForEditMode();
            } else {
                resetPullLayout();
            }
            if (this.mMode.permitsPullStart()) {
                this.mStartLayout.updateScrollDirection(this.mMode, getPullDirectionInternal());
            }
            if (this.mMode.permitsPullEnd()) {
                this.mEndLayout.updateScrollDirection(this.mMode, getPullDirectionInternal());
            }
            onDirectionUpdated(this.mMode, getPullDirectionInternal());
        }
    }

    private void removeAllPullLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2334ab3", new Object[]{this});
            return;
        }
        if (this == this.mStartLayout.getParent()) {
            removeView(this.mStartLayout);
        }
        if (this != this.mEndLayout.getParent()) {
            return;
        }
        removeView(this.mEndLayout);
    }

    public final boolean updateCurrentMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29528f70", new Object[]{this, mode})).booleanValue();
        }
        boolean isUnderPermit = this.mMode.isUnderPermit(mode);
        if (isUnderPermit) {
            if (mode == Mode.BOTH) {
                mode = Mode.PULL_FROM_START;
            }
            this.mCurrentMode = mode;
        }
        return isUnderPermit;
    }

    private LinearLayout.LayoutParams getPullLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout.LayoutParams) ipChange.ipc$dispatch("4c0e0d19", new Object[]{this});
        }
        if (getPullDirectionInternal() == 1) {
            return new LinearLayout.LayoutParams(-2, -1);
        }
        return new LinearLayout.LayoutParams(-1, -2);
    }

    private void updateMode(Mode mode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376dee6f", new Object[]{this, mode, new Boolean(z)});
        } else if ((this.mMode == mode && !z) || mode == null) {
        } else {
            this.mMode = mode;
            updateCurrentMode(mode);
            if (isContentInvalid()) {
                return;
            }
            if (isInEditMode()) {
                clipPaddingForEditMode();
            } else {
                resetPullLayout();
            }
            onModeUpdated(mode);
        }
    }

    private void resetPullLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47700605", new Object[]{this});
            return;
        }
        removeAllPullLayout();
        LinearLayout.LayoutParams pullLayoutParams = getPullLayoutParams();
        if (this.mMode.permitsPullStart()) {
            super.addView(this.mStartLayout, 0, pullLayoutParams);
        }
        if (this.mMode.permitsPullEnd()) {
            super.addView(this.mEndLayout, pullLayoutParams);
        }
        refreshPullViewsSize();
    }

    private void clipPaddingForEditMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7e035c", new Object[]{this});
        } else {
            setPadding(0, 0, 0, 0);
        }
    }

    private void refreshPullViewsSize() {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3972a4b6", new Object[]{this});
            return;
        }
        int maximumPullScroll = getMaximumPullScroll();
        int pullDirectionInternal = getPullDirectionInternal();
        if (pullDirectionInternal != 0) {
            if (pullDirectionInternal == 1) {
                if (this.mMode.permitsPullStart()) {
                    this.mStartLayout.setWidth(maximumPullScroll);
                    i4 = -maximumPullScroll;
                } else {
                    i4 = 0;
                }
                if (this.mMode.permitsPullEnd()) {
                    this.mEndLayout.setWidth(maximumPullScroll);
                    i2 = -maximumPullScroll;
                    i5 = i4;
                    i = 0;
                } else {
                    i5 = i4;
                }
            }
            i2 = 0;
            i = 0;
        } else {
            if (this.mMode.permitsPullStart()) {
                this.mStartLayout.setHeight(maximumPullScroll);
                i = -maximumPullScroll;
            } else {
                i = 0;
            }
            if (this.mMode.permitsPullEnd()) {
                this.mEndLayout.setHeight(maximumPullScroll);
                i3 = -maximumPullScroll;
                i2 = 0;
                setPadding(i5, i, i2, i3);
            }
            i2 = 0;
        }
        i3 = 0;
        setPadding(i5, i, i2, i3);
    }

    public final boolean isRunnableScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e32ab8d9", new Object[]{this})).booleanValue();
        }
        d dVar = this.mCurrentSmoothScrollRunnable;
        if (dVar == null) {
            return false;
        }
        return d.a(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r0 != 3) goto L27;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.ptr.PullBase.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private float getActiveX(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71acc8a8", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getX(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float getActiveY(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("869590e9", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getY(this.mActivePointerIndex);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isContentInvalid()) {
            return super.onTouchEvent(motionEvent);
        }
        if (isRunnableScrolling()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.mIsBeingDragged) {
            requestDisallowInterceptTouchEvent(true);
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (actionMasked == 0) {
            if (isReadyForPull()) {
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mActivePointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                float y = motionEvent.getY(0);
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                float x = motionEvent.getX(0);
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                return true;
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            adjustNewPointer(motionEvent, MotionEventCompat.getActionIndex(motionEvent));
                            return true;
                        } else if (actionMasked == 6) {
                            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                            if (motionEvent.getPointerId(actionIndex) != this.mActivePointerId) {
                                return true;
                            }
                            if (actionIndex == 0) {
                                i = 1;
                            }
                            adjustNewPointer(motionEvent, i);
                            return true;
                        }
                    }
                } else if (this.mIsBeingDragged) {
                    this.mLastMotionY = getActiveY(motionEvent);
                    this.mLastMotionX = getActiveX(motionEvent);
                    pullEvent();
                    return true;
                }
            }
            this.mIsBeingDragged = false;
            resetMotionData();
            releaseEvent();
        }
        return false;
    }

    private void resetMotionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e319036", new Object[]{this});
            return;
        }
        this.mActivePointerId = -1;
        this.mActivePointerIndex = 0;
        this.mInitialMotionY = 0.0f;
        this.mLastMotionY = 0.0f;
        this.mInitialMotionX = 0.0f;
        this.mLastMotionX = 0.0f;
    }

    private void adjustNewPointer(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0527bb", new Object[]{this, motionEvent, new Integer(i)});
            return;
        }
        this.mActivePointerId = motionEvent.getPointerId(i);
        this.mActivePointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        this.mInitialMotionX += motionEvent.getX(i) - this.mLastMotionX;
        this.mInitialMotionY += motionEvent.getY(i) - this.mLastMotionY;
        this.mLastMotionX = motionEvent.getX(i);
        this.mLastMotionY = motionEvent.getY(i);
    }

    private int generateDragValue() {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ed8e322", new Object[]{this})).intValue();
        }
        if (getPullDirectionInternal() == 1) {
            f = this.mInitialMotionX;
            f2 = this.mLastMotionX;
        } else {
            f = this.mInitialMotionY;
            f2 = this.mLastMotionY;
        }
        return Math.round(getInterpolation(f - f2));
    }

    private float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
        }
        Interpolator interpolator = this.mPullInterpolator;
        if (interpolator != null) {
            return interpolator.getInterpolation(f);
        }
        return defaultInterpolation(f);
    }

    private float defaultInterpolation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c07c0506", new Object[]{this, new Float(f)})).floatValue();
        }
        if (f < 0.0f) {
            return -((float) Math.pow(-f, 0.9090909090909091d));
        }
        return (float) Math.pow(f, 0.9090909090909091d);
    }

    private void pullEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3639c95c", new Object[]{this});
            return;
        }
        int generateDragValue = generateDragValue();
        int i = AnonymousClass4.f18956a[this.mCurrentMode.ordinal()];
        if (i == 1) {
            generateDragValue = Math.min(0, generateDragValue);
        } else if (i == 2) {
            generateDragValue = Math.max(0, generateDragValue);
        }
        scrollPullLayoutTo(generateDragValue, true);
    }

    private void releaseEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f10d29da", new Object[]{this});
        } else {
            smoothScrollTo(callOnRelease(), allowCheckPullWhenRollBack(), new c() { // from class: com.taobao.ptr.PullBase.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.ptr.PullBase.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        PullBase.access$100(PullBase.this);
                    }
                }
            });
        }
    }

    private int callOnRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ead7e4", new Object[]{this})).intValue();
        }
        int scrollValue = getScrollValue();
        float maximumPullScroll = (scrollValue * 1.0f) / getMaximumPullScroll();
        int onRelease = onRelease(this.mCurrentMode, maximumPullScroll, scrollValue);
        for (b bVar : this.mOnPullListeners) {
            bVar.a(this, this.mCurrentMode, maximumPullScroll, scrollValue);
        }
        return onRelease;
    }

    public void onReset(Mode mode, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4151ac", new Object[]{this, mode, new Float(f), new Integer(i)});
        } else {
            updateCurrentMode(Mode.DISABLED);
        }
    }

    private void callOnReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e45f9", new Object[]{this});
            return;
        }
        int scrollValue = getScrollValue();
        float maximumPullScroll = (scrollValue * 1.0f) / getMaximumPullScroll();
        for (b bVar : this.mOnPullListeners) {
            bVar.c(this, this.mCurrentMode, maximumPullScroll, scrollValue);
        }
        onReset(this.mCurrentMode, maximumPullScroll, scrollValue);
    }

    public final void simulateDrag(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bb8e4", new Object[]{this, new Integer(i)});
        } else if (isContentInvalid()) {
        } else {
            if (i < 0) {
                z = updateCurrentMode(Mode.PULL_FROM_START);
            } else if (i > 0) {
                z = updateCurrentMode(Mode.PULL_FROM_END);
            }
            if (!z) {
                return;
            }
            smoothScrollTo(i, true, new c() { // from class: com.taobao.ptr.PullBase.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.ptr.PullBase.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        PullBase.access$200(PullBase.this);
                    }
                }
            });
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        onPullSaveInstanceState(bundle);
        bundle.putParcelable(STATE_SUPER, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
            onPullRestoreInstanceState(bundle);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (isContentInvalid()) {
            return;
        }
        if (isInEditMode()) {
            clipPaddingForEditMode();
        } else {
            refreshPullViewsSize();
        }
        refreshContentViewSize(i, i2);
        post(new Runnable() { // from class: com.taobao.ptr.PullBase.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PullBase.this.requestLayout();
                }
            }
        });
    }

    private void refreshContentViewSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2785a3ab", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        h hVar = this.mContentView;
        if (hVar == null || (layoutParams = ((View) hVar).getLayoutParams()) == null || !(layoutParams instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i > 0 && layoutParams2.width != i) {
            layoutParams2.width = (i - layoutParams2.leftMargin) - layoutParams2.rightMargin;
            z = true;
        }
        if (i2 > 0 && layoutParams2.height != i2) {
            layoutParams2.height = (i2 - layoutParams2.topMargin) - layoutParams2.bottomMargin;
            z = true;
        }
        if (!z) {
            return;
        }
        ((View) this.mContentView).setLayoutParams(layoutParams2);
    }

    public final int getPullSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9d4f0bd6", new Object[]{this})).intValue() : getMaximumPullScroll();
    }

    private int getMaximumPullScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88d9176", new Object[]{this})).intValue();
        }
        if (getPullDirectionInternal() == 1) {
            return Math.round(getWidth());
        }
        return Math.round(getHeight());
    }

    private int checkScrollValue(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b775ac53", new Object[]{this, new Integer(i)})).intValue();
        }
        int maximumPullScroll = getMaximumPullScroll();
        return Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i));
    }

    private void callOnPull(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f891d7da", new Object[]{this, new Integer(i)});
            return;
        }
        float maximumPullScroll = (i * 1.0f) / getMaximumPullScroll();
        onPull(this.mCurrentMode, maximumPullScroll, i);
        for (b bVar : this.mOnPullListeners) {
            bVar.b(this, this.mCurrentMode, maximumPullScroll, i);
        }
    }

    private void scrollPullLayoutTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f8c1cf", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int checkScrollValue = checkScrollValue(i);
        if (z) {
            callOnPull(checkScrollValue);
        }
        callOnScroll(checkScrollValue);
        int pullDirectionInternal = getPullDirectionInternal();
        if (pullDirectionInternal == 0) {
            scrollTo(0, checkScrollValue);
        } else if (pullDirectionInternal != 1) {
        } else {
            scrollTo(checkScrollValue, 0);
        }
    }

    private void callOnScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08c5792", new Object[]{this, new Integer(i)});
            return;
        }
        for (a aVar : this.mScrollListeners) {
            aVar.a(this, i);
        }
    }

    public void setPullInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9140a890", new Object[]{this, interpolator});
        } else {
            this.mPullInterpolator = interpolator;
        }
    }

    public void setReleaseInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3607d2", new Object[]{this, interpolator});
        } else {
            this.mReleaseInterpolator = interpolator;
        }
    }

    public void setMode(Mode mode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da6dde", new Object[]{this, mode});
        } else {
            updateMode(mode, false);
        }
    }

    public final Mode getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mode) ipChange.ipc$dispatch("c0b499e8", new Object[]{this}) : this.mMode;
    }

    public final Mode getCurrentMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mode) ipChange.ipc$dispatch("59d5d01b", new Object[]{this}) : this.mCurrentMode;
    }

    /* renamed from: getEndLayout */
    public PullLayout mo1211getEndLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullLayout) ipChange.ipc$dispatch("5855d724", new Object[]{this}) : this.mEndLayout;
    }

    /* renamed from: getStartLayout */
    public PullLayout mo1212getStartLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullLayout) ipChange.ipc$dispatch("710850ab", new Object[]{this}) : this.mStartLayout;
    }

    public final h getPullAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("7816916", new Object[]{this}) : this.mContentView;
    }

    public final boolean isContentInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ad5393", new Object[]{this})).booleanValue();
        }
        h hVar = this.mContentView;
        return hVar == null || !(hVar instanceof h);
    }

    public final void addOnPullListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0879419", new Object[]{this, bVar});
        } else {
            this.mOnPullListeners.add(bVar);
        }
    }

    public final void removeOnPullListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff230916", new Object[]{this, bVar});
        } else {
            this.mOnPullListeners.remove(bVar);
        }
    }

    public void addOnScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d417e32", new Object[]{this, aVar});
        } else {
            this.mScrollListeners.add(aVar);
        }
    }

    public void removeOnScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d3a7ef", new Object[]{this, aVar});
        } else {
            this.mScrollListeners.remove(aVar);
        }
    }

    private boolean isReadyForPull() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe61d7e0", new Object[]{this})).booleanValue() : isReadyForPullEndInternal() || isReadyForPullStartInternal();
    }

    private boolean isReadyForPullStartInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a9cf8f5", new Object[]{this})).booleanValue();
        }
        h hVar = this.mContentView;
        if (hVar == null) {
            return false;
        }
        return hVar.isReadyForPullStart();
    }

    private boolean isReadyForPullEndInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6617eae", new Object[]{this})).booleanValue();
        }
        h hVar = this.mContentView;
        if (hVar == null) {
            return false;
        }
        return hVar.isReadyForPullEnd();
    }

    public final int getPullDirectionInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("115905db", new Object[]{this})).intValue();
        }
        h hVar = this.mContentView;
        if (hVar == null) {
            return 0;
        }
        return hVar.getPullDirection();
    }

    private Interpolator checkReleaseInterpolator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("244d9b62", new Object[]{this});
        }
        if (this.mReleaseInterpolator == null) {
            this.mReleaseInterpolator = new DecelerateInterpolator();
        }
        return this.mReleaseInterpolator;
    }

    public final int getScrollValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("504a56e8", new Object[]{this})).intValue();
        }
        if (getPullDirectionInternal() == 1) {
            return getScrollX();
        }
        return getScrollY();
    }

    public final void smoothScrollTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a600b26", new Object[]{this, new Integer(i)});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), 0L, false, null);
        }
    }

    public final void smoothScrollTo(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196a0e32", new Object[]{this, new Integer(i), cVar});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), 0L, false, cVar);
        }
    }

    public final void smoothScrollTo(int i, long j, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89eec5fa", new Object[]{this, new Integer(i), new Long(j), cVar});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), j, false, cVar);
        }
    }

    public final void smoothScrollTo(int i, boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b97fea", new Object[]{this, new Integer(i), new Boolean(z), cVar});
        } else {
            smoothScrollTo(i, checkReleaseInterpolator(), getPullScrollDuration(), 0L, z, cVar);
        }
    }

    private void smoothScrollTo(int i, Interpolator interpolator, long j, long j2, boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c36fc3", new Object[]{this, new Integer(i), interpolator, new Long(j), new Long(j2), new Boolean(z), cVar});
        } else if (isContentInvalid()) {
        } else {
            d dVar = this.mCurrentSmoothScrollRunnable;
            if (dVar != null) {
                if (!dVar.b() && this.mCurrentSmoothScrollRunnable.a() == i) {
                    this.mCurrentSmoothScrollRunnable.a(cVar);
                    return;
                }
                this.mCurrentSmoothScrollRunnable.c();
            }
            int scrollValue = getScrollValue();
            if (scrollValue == i) {
                if (cVar == null) {
                    return;
                }
                cVar.a();
                return;
            }
            this.mCurrentSmoothScrollRunnable = new d(this, interpolator, scrollValue, i, j, z, cVar);
            if (j2 > 0) {
                postDelayed(this.mCurrentSmoothScrollRunnable, j2);
            } else {
                post(this.mCurrentSmoothScrollRunnable);
            }
        }
    }

    private void forceStopCurrentSmoothScrollTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adc9013", new Object[]{this});
            return;
        }
        d dVar = this.mCurrentSmoothScrollRunnable;
        if (dVar == null) {
            return;
        }
        dVar.c();
        scrollPullLayoutTo(0, false);
    }

    /* loaded from: classes7.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<c> f18957a = new ArrayList();
        private c b;
        private Interpolator c;
        private PullBase d;
        private Lock e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private long j;
        private long k;
        private boolean l;

        static {
            kge.a(-1261751214);
            kge.a(-1390502639);
        }

        public static /* synthetic */ boolean a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("308d6813", new Object[]{dVar})).booleanValue() : dVar.l;
        }

        public d(PullBase pullBase, Interpolator interpolator, int i, int i2, long j, boolean z, c cVar) {
            if (pullBase == null || interpolator == null) {
                throw new IllegalArgumentException("view and interpolator param can not be null");
            }
            this.d = pullBase;
            this.c = interpolator;
            this.g = i;
            this.h = i2;
            this.k = j;
            this.f = z;
            this.b = cVar;
            this.l = true;
            this.e = new ReentrantLock();
            this.i = -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.l) {
            } else {
                if (this.j == 0) {
                    this.j = System.currentTimeMillis();
                } else {
                    this.i = this.g - Math.round((this.g - this.h) * this.c.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.j) * 1000) / this.k, 1000L), 0L)) / 1000.0f));
                    PullBase.access$300(this.d, this.i, this.f);
                }
                if (this.h != this.i) {
                    i.a(this.d, this);
                } else {
                    c();
                }
            }
        }

        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("308cf3b0", new Object[]{this, cVar});
            } else if (cVar == null) {
            } else {
                this.f18957a.add(cVar);
            }
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.h;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !this.l;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.l) {
                this.l = false;
                c cVar = this.b;
                if (cVar != null) {
                    cVar.a();
                }
                for (c cVar2 : this.f18957a) {
                    cVar2.a();
                }
            }
        }
    }
}
