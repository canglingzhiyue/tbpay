package com.taobao.android.detail2.core.framework.view.feeds;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.j;
import com.taobao.android.detail2.core.framework.o;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.fjp;
import tb.fjt;
import tb.hnj;
import tb.ipa;
import tb.kge;
import tb.nkn;
import tb.thr;

/* loaded from: classes5.dex */
public class DetailVerticalRecyclerView extends RecyclerView implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PAGE_SCROLL_DIRECTION_DOWN = 1;
    private static final int PAGE_SCROLL_DIRECTION_UP = -1;
    private float downX;
    private float downY;
    public boolean enableScroll;
    public boolean isSettling;
    private int mBeforeScrollPosition;
    private int mBeforeWillAppearPosition;
    private List<a> mCardScrollListeners;
    public Context mContext;
    private boolean mEnableAlignTop;
    private boolean mEnablePinchConflict;
    private boolean mForbidNotifyPageChange;
    private boolean mHasScrollStart;
    private boolean mHasSendIdleTaskRunnable;
    private boolean mHasStartFrozenOnScroll;
    private boolean mIsHoverMode;
    private long mLastSendIdleToken;
    public LinearLayoutManager mLinearLayoutManager;
    private com.taobao.android.detail2.core.framework.b mNewDetailContext;
    private List<b> mOnPageChangedListeners;
    public PagerSnapHelper mPageSnapHelper;
    private Map<Integer, RecyclerView.ViewHolder> mPositionHolders;
    private d mScrollWillChangeListener;
    private int mSmoothScrollTargetPosition;
    private int mTouchSlop;

    /* loaded from: classes5.dex */
    public enum ScrollSpeed {
        FAST(120.0f),
        NORMAL(0.0f),
        SLOW(60.0f);
        
        private float speedCoefficient;

        ScrollSpeed(float f) {
            this.speedCoefficient = f;
        }

        public float getSpeedCoefficient() {
            return this.speedCoefficient;
        }
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a(float f);

        void a(RecyclerView recyclerView, int i);

        void a(RecyclerView recyclerView, int i, int i2);

        void a(MotionEvent motionEvent);

        void a(String str);

        void b(MotionEvent motionEvent);
    }

    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, int i2);
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(int i, int i2);
    }

    static {
        kge.a(1314877423);
        kge.a(-1419130634);
    }

    public static /* synthetic */ Object ipc$super(DetailVerticalRecyclerView detailVerticalRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -429946499:
                super.smoothScrollToPosition(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.ptr.h
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.ptr.h
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.b access$000(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.b) ipChange.ipc$dispatch("e293a18a", new Object[]{detailVerticalRecyclerView}) : detailVerticalRecyclerView.mNewDetailContext;
    }

    public static /* synthetic */ boolean access$100(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f51d1bbe", new Object[]{detailVerticalRecyclerView})).booleanValue() : detailVerticalRecyclerView.mIsHoverMode;
    }

    public static /* synthetic */ boolean access$102(DetailVerticalRecyclerView detailVerticalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b9530e0", new Object[]{detailVerticalRecyclerView, new Boolean(z)})).booleanValue();
        }
        detailVerticalRecyclerView.mIsHoverMode = z;
        return z;
    }

    public static /* synthetic */ void access$200(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57783299", new Object[]{detailVerticalRecyclerView});
        } else {
            detailVerticalRecyclerView.notifyPageChange();
        }
    }

    public static /* synthetic */ void access$300(DetailVerticalRecyclerView detailVerticalRecyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb094c5a", new Object[]{detailVerticalRecyclerView, view});
        } else {
            detailVerticalRecyclerView.notifyWillAppear(view);
        }
    }

    public static /* synthetic */ boolean access$400(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c2e605b", new Object[]{detailVerticalRecyclerView})).booleanValue() : detailVerticalRecyclerView.mEnableAlignTop;
    }

    public static /* synthetic */ boolean access$500(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e89773a", new Object[]{detailVerticalRecyclerView})).booleanValue() : detailVerticalRecyclerView.mHasScrollStart;
    }

    public static /* synthetic */ void access$600(DetailVerticalRecyclerView detailVerticalRecyclerView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7abca44", new Object[]{detailVerticalRecyclerView, str, new Integer(i)});
        } else {
            detailVerticalRecyclerView.sendIdleTaskToWeex(str, i);
        }
    }

    public static /* synthetic */ void access$700(DetailVerticalRecyclerView detailVerticalRecyclerView, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943d261a", new Object[]{detailVerticalRecyclerView, new Long(j), str});
        } else {
            detailVerticalRecyclerView.ifMainIdleThenPreloadForWeex(j, str);
        }
    }

    public static /* synthetic */ boolean access$802(DetailVerticalRecyclerView detailVerticalRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eacb93e7", new Object[]{detailVerticalRecyclerView, new Boolean(z)})).booleanValue();
        }
        detailVerticalRecyclerView.mHasSendIdleTaskRunnable = z;
        return z;
    }

    public static /* synthetic */ long access$900(DetailVerticalRecyclerView detailVerticalRecyclerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f5d2a6", new Object[]{detailVerticalRecyclerView})).longValue() : detailVerticalRecyclerView.mLastSendIdleToken;
    }

    public DetailVerticalRecyclerView(Context context) {
        super(context);
        this.enableScroll = true;
        this.isSettling = false;
        this.mSmoothScrollTargetPosition = 0;
        this.mBeforeScrollPosition = -1;
        this.mBeforeWillAppearPosition = 0;
        this.mOnPageChangedListeners = new ArrayList();
        this.mPositionHolders = new HashMap();
        this.mCardScrollListeners = new CopyOnWriteArrayList();
        this.mLastSendIdleToken = 0L;
        this.mHasSendIdleTaskRunnable = false;
        this.mHasScrollStart = false;
        init(context);
    }

    public DetailVerticalRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.enableScroll = true;
        this.isSettling = false;
        this.mSmoothScrollTargetPosition = 0;
        this.mBeforeScrollPosition = -1;
        this.mBeforeWillAppearPosition = 0;
        this.mOnPageChangedListeners = new ArrayList();
        this.mPositionHolders = new HashMap();
        this.mCardScrollListeners = new CopyOnWriteArrayList();
        this.mLastSendIdleToken = 0L;
        this.mHasSendIdleTaskRunnable = false;
        this.mHasScrollStart = false;
        init(context);
    }

    public DetailVerticalRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableScroll = true;
        this.isSettling = false;
        this.mSmoothScrollTargetPosition = 0;
        this.mBeforeScrollPosition = -1;
        this.mBeforeWillAppearPosition = 0;
        this.mOnPageChangedListeners = new ArrayList();
        this.mPositionHolders = new HashMap();
        this.mCardScrollListeners = new CopyOnWriteArrayList();
        this.mLastSendIdleToken = 0L;
        this.mHasSendIdleTaskRunnable = false;
        this.mHasScrollStart = false;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setItemViewCacheSize(0);
        setHasFixedSize(true);
        disableAnimator();
        this.mLinearLayoutManager = new LinearLayoutManager(this.mContext, 1, false) { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode != 514551467) {
                    if (hashCode != 1626618577) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                    super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                    return null;
                }
                return new Boolean(super.canScrollVertically());
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : DetailVerticalRecyclerView.this.enableScroll && super.canScrollVertically();
            }

            @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
                    return;
                }
                try {
                    super.onLayoutChildren(recycler, state);
                } catch (Throwable th) {
                    if (DetailVerticalRecyclerView.access$000(DetailVerticalRecyclerView.this) != null) {
                        fjp.a("main", fjp.ERROR_CODE_COMMON_ADAPTER_BIND_DATA_ERROR, "recyclerview onLayoutChildren执行异常: ", DetailVerticalRecyclerView.access$000(DetailVerticalRecyclerView.this).h().T(), th);
                    }
                    fjt.a(fjt.TAG_RENDER, "recyclerview onLayoutChildren执行异常", th);
                }
            }
        };
        setLayoutManager(this.mLinearLayoutManager);
        this.mPageSnapHelper = new PagerSnapHelper() { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1700525134) {
                    return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.PagerSnapHelper, android.support.v7.widget.SnapHelper
            public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
                DetailVerticalRecyclerView detailVerticalRecyclerView;
                int aw;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (int[]) ipChange2.ipc$dispatch("9aa40bb2", new Object[]{this, layoutManager, view});
                }
                if (DetailVerticalRecyclerView.access$100(DetailVerticalRecyclerView.this)) {
                    DetailVerticalRecyclerView.access$102(DetailVerticalRecyclerView.this, false);
                    return new int[2];
                }
                DetailVerticalRecyclerView.access$200(DetailVerticalRecyclerView.this);
                DetailVerticalRecyclerView.access$300(DetailVerticalRecyclerView.this, view);
                int[] calculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, view);
                if (DetailVerticalRecyclerView.access$400(DetailVerticalRecyclerView.this)) {
                    calculateDistanceToFinalSnap[1] = view.getTop();
                }
                if (ipa.T()) {
                    hnj.b(DetailVerticalRecyclerView.this.mContext);
                }
                if (ipa.aj()) {
                    if (DetailVerticalRecyclerView.access$500(DetailVerticalRecyclerView.this)) {
                        detailVerticalRecyclerView = DetailVerticalRecyclerView.this;
                        aw = ipa.av();
                        str = thr.DX_RECYCLER_LAYOUT_SCROLL_STATE_END;
                    } else {
                        detailVerticalRecyclerView = DetailVerticalRecyclerView.this;
                        aw = ipa.aw();
                        str = "onPageInit";
                    }
                    DetailVerticalRecyclerView.access$600(detailVerticalRecyclerView, str, aw);
                }
                return calculateDistanceToFinalSnap;
            }
        };
        this.mPageSnapHelper.attachToRecyclerView(this);
    }

    public void setEnablePinchConflict(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0da966", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnablePinchConflict = z;
        }
    }

    public void setForbidNotifyPageChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3a7ef", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidNotifyPageChange = z;
        }
    }

    private void disableAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce463ef6", new Object[]{this});
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        if (!(itemAnimator instanceof SimpleItemAnimator)) {
            return;
        }
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        itemAnimator.setChangeDuration(0L);
    }

    @Override // com.taobao.ptr.h
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || adapter.getItemCount() == 0) {
            return true;
        }
        int itemCount = adapter.getItemCount() - 1;
        int d2 = nkn.d(this);
        if (d2 == -1 || d2 < itemCount) {
            return false;
        }
        int b2 = d2 - nkn.b(this);
        int a2 = nkn.a(this);
        if (a2 == 0) {
            return isChildRightVisible(this, b2);
        }
        if (a2 == 1) {
            return isChildBottomVisible(this, b2);
        }
        return false;
    }

    public void scrollSmoothByHover(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9acb71", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mIsHoverMode = true;
        smoothScrollBy(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void smoothScrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65f897d", new Object[]{this, new Integer(i)});
            return;
        }
        super.smoothScrollToPosition(i);
        notifyWillAppear(i);
    }

    public void smoothScrollToPosition(int i, final ScrollSpeed scrollSpeed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b07a59f", new Object[]{this, new Integer(i), scrollSpeed});
        } else if (scrollSpeed == ScrollSpeed.NORMAL || scrollSpeed == null) {
            smoothScrollToPosition(i);
        } else {
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(this.mContext) { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v7.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue() : scrollSpeed.getSpeedCoefficient() / displayMetrics.densityDpi;
                }
            };
            linearSmoothScroller.setTargetPosition(i);
            this.mLinearLayoutManager.startSmoothScroll(linearSmoothScroller);
            notifyWillAppear(i);
        }
    }

    private static boolean isChildBottomVisible(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b11fa3d", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getBottom() > recyclerView.getHeight()) ? false : true;
    }

    private static boolean isChildRightVisible(RecyclerView recyclerView, int i) {
        View childAt;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3c4360a", new Object[]{recyclerView, new Integer(i)})).booleanValue() : (recyclerView == null || (childAt = recyclerView.getChildAt(i)) == null || childAt.getRight() > recyclerView.getWidth()) ? false : true;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (Math.abs((y - this.downY) / (x - this.downX)) >= 1.0f) {
                float f = this.downY;
                int i = this.mTouchSlop;
                if (y - f >= i) {
                    notifyScrollStatus(-1, y - f);
                } else if (y - f < i) {
                    notifyScrollStatus(1, y - f);
                }
            }
        }
        for (a aVar : this.mCardScrollListeners) {
            if (aVar != null) {
                aVar.a(motionEvent);
            }
        }
        if (!this.isSettling) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private boolean checkPinchConflictProcess(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59183deb", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (this.mEnablePinchConflict && this.mNewDetailContext.h().b().ac()) {
                if (this.mNewDetailContext != null && motionEvent != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    fjt.a(fjt.TAG_GESTURE, "checkPinchConflictProcess: " + motionEvent.getActionMasked() + " pointCount = " + pointerCount);
                    return pointerCount > 1;
                }
                fjt.a(fjt.TAG_GESTURE, "checkPinchConflictProcess: Null Error. ");
            }
        } catch (Throwable th) {
            fjt.a(fjt.TAG_GESTURE, "checkPinchConflictProcess error. 未知异常.", th);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[ADDED_TO_REGION] */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r6
            r1[r3] = r7
            java.lang.String r7 = "e7b587fe"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1c:
            boolean r0 = r6.checkPinchConflictProcess(r7)
            if (r0 == 0) goto L23
            return r4
        L23:
            int r0 = r7.getActionMasked()
            if (r0 == 0) goto L5d
            if (r0 == r2) goto L2c
            goto L69
        L2c:
            float r0 = r7.getX()
            float r1 = r6.downX
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r7.getY()
            float r2 = r6.downY
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L4f
            int r2 = r6.mTouchSlop
            float r2 = (float) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L4f
            r0 = 1
            goto L6a
        L4f:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L69
            int r0 = r6.mTouchSlop
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L69
            r0 = 0
            r1 = 1
            goto L6b
        L5d:
            float r0 = r7.getX()
            r6.downX = r0
            float r0 = r7.getY()
            r6.downY = r0
        L69:
            r0 = 0
        L6a:
            r1 = 0
        L6b:
            java.util.List<com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView$a> r2 = r6.mCardScrollListeners
            java.util.Iterator r2 = r2.iterator()
        L71:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r2.next()
            com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView$a r5 = (com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a) r5
            if (r5 == 0) goto L71
            r5.b(r7)
            goto L71
        L83:
            boolean r2 = r6.isSettling
            if (r2 != 0) goto L92
            if (r0 == 0) goto L8a
            goto L92
        L8a:
            if (r1 == 0) goto L8d
            return r3
        L8d:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEnableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScroll = z;
        }
    }

    public void addOnPageChangedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361654f4", new Object[]{this, bVar});
            return;
        }
        if (this.mOnPageChangedListeners == null) {
            this.mOnPageChangedListeners = new ArrayList();
        }
        this.mOnPageChangedListeners.add(bVar);
    }

    public void addOnScrollWillStatusListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320c6746", new Object[]{this, dVar});
        } else {
            this.mScrollWillChangeListener = dVar;
        }
    }

    public boolean isScrolling() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue() : getScrollState() != 0;
    }

    public void setEnableAlignTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70aa498", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableAlignTop = z;
        }
    }

    public void setNewDetailContext(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e58cb8", new Object[]{this, bVar});
        } else {
            this.mNewDetailContext = bVar;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        for (a aVar : this.mCardScrollListeners) {
            aVar.a(this, i);
        }
        if (i == 0) {
            this.isSettling = false;
        } else if (i == 1) {
            this.isSettling = false;
        } else if (i == 2) {
            this.isSettling = true;
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
        if (i == 0 && i2 == 0) {
            notifyPageChange();
            setBeforeWillAppearPosition(getPositionIdle());
            if (ipa.T() && this.mHasStartFrozenOnScroll) {
                hnj.b(getContext());
            }
            if (!ipa.aj()) {
                return;
            }
            if (this.mHasScrollStart) {
                sendIdleTaskToWeex(thr.DX_RECYCLER_LAYOUT_SCROLL_STATE_END, ipa.av());
                return;
            } else {
                sendIdleTaskToWeex("onPageInit", ipa.aw());
                return;
            }
        }
        for (a aVar : this.mCardScrollListeners) {
            aVar.a(this, i, i2);
        }
        if (ipa.T() && !hnj.a()) {
            this.mHasStartFrozenOnScroll = true;
            hnj.a(getContext());
        }
        if (!ipa.aj()) {
            return;
        }
        this.mHasScrollStart = true;
        if (!this.mHasSendIdleTaskRunnable) {
            return;
        }
        this.mLastSendIdleToken = System.currentTimeMillis();
    }

    private void sendIdleTaskToWeex(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e428255", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.mHasSendIdleTaskRunnable = true;
        ipa.d dVar = new ipa.d() { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ipa.c
            public String b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "sendIdleTaskToWeex";
            }

            @Override // tb.ipa.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    DetailVerticalRecyclerView.access$700(DetailVerticalRecyclerView.this, d(), str);
                }
            }

            @Override // tb.ipa.c
            public int c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : i;
            }
        };
        this.mLastSendIdleToken = dVar.d();
        ipa.c(dVar);
    }

    private void ifMainIdleThenPreloadForWeex(final long j, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d85dff", new Object[]{this, new Long(j), str});
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    List<com.taobao.android.detail2.core.framework.base.weex.c> e;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    DetailVerticalRecyclerView.access$802(DetailVerticalRecyclerView.this, false);
                    if (j < DetailVerticalRecyclerView.access$900(DetailVerticalRecyclerView.this)) {
                        return false;
                    }
                    Context context = DetailVerticalRecyclerView.this.getContext();
                    if ((!(context instanceof j) || !((j) context).c()) && (context instanceof o) && (e = ((o) context).e()) != null && !e.isEmpty()) {
                        for (com.taobao.android.detail2.core.framework.base.weex.c cVar : e) {
                            if (cVar != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("idleTaskType", (Object) str);
                                cVar.a("ndIdleTaskStart", jSONObject);
                                fjt.a(fjt.TAG_TIP, "hasSendIdleTaskToWeex ndIdleTaskStart , idleTaskType:" + str);
                            }
                        }
                    }
                    return false;
                }
            });
        }
    }

    private void setBeforeWillAppearPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d2d274b", new Object[]{this, new Integer(i)});
        } else {
            this.mBeforeWillAppearPosition = i;
        }
    }

    private int getPositionIdle() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cecce60d", new Object[]{this})).intValue();
        }
        View findSnapView = this.mPageSnapHelper.findSnapView(getLayoutManager());
        if (findSnapView != null && (layoutManager = getLayoutManager()) != null) {
            return layoutManager.getPosition(findSnapView);
        }
        return 0;
    }

    private void notifyWillAppear(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfabad2c", new Object[]{this, new Integer(i)});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "notifyWillAppear" + i);
        int i2 = this.mBeforeWillAppearPosition;
        if (i == i2) {
            fjt.a(fjt.TAG_RENDER, "notifyWillAppear失败，位置相同");
            return;
        }
        d dVar = this.mScrollWillChangeListener;
        if (dVar != null) {
            dVar.a(i2, i);
        }
        this.mBeforeWillAppearPosition = i;
    }

    private void notifyWillAppear(View view) {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf191abb", new Object[]{this, view});
        } else if (view == null || (layoutManager = getLayoutManager()) == null) {
        } else {
            notifyWillAppear(layoutManager.getPosition(view));
        }
    }

    private void notifyPageChange() {
        RecyclerView.LayoutManager layoutManager;
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f85a47cf", new Object[]{this});
            return;
        }
        View findSnapView = this.mPageSnapHelper.findSnapView(getLayoutManager());
        if (findSnapView == null || (layoutManager = getLayoutManager()) == null) {
            return;
        }
        int position = layoutManager.getPosition(findSnapView);
        this.mBeforeScrollPosition = this.mSmoothScrollTargetPosition;
        this.mSmoothScrollTargetPosition = position;
        if (this.mForbidNotifyPageChange) {
            this.mForbidNotifyPageChange = false;
        } else if (this.mSmoothScrollTargetPosition != this.mBeforeScrollPosition && (list = this.mOnPageChangedListeners) != null) {
            for (b bVar : list) {
                if (bVar != null) {
                    bVar.a(this.mBeforeScrollPosition, this.mSmoothScrollTargetPosition);
                }
            }
        }
    }

    private void notifyScrollStatus(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ad48ec", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        List<a> list = this.mCardScrollListeners;
        if (list == null || list.size() == 0 || canScrollVertically(i)) {
            return;
        }
        for (a aVar : this.mCardScrollListeners) {
            if (aVar != null && i == -1) {
                aVar.a(f);
            }
        }
    }

    public RecyclerView.ViewHolder getHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("5c979437", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            return null;
        }
        try {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition == null) {
                return this.mPositionHolders.get(Integer.valueOf(i));
            }
            this.mPositionHolders.put(Integer.valueOf(i), findViewHolderForAdapterPosition);
            return findViewHolderForAdapterPosition;
        } catch (Exception e) {
            fjp.a("main", fjp.ERROR_CODE_COMMON_GET_HOLDER_ERROR, "getHolder调用异常", (Map<String, String>) null, e);
            return null;
        }
    }

    public int getScrollYDistance() {
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6688d005", new Object[]{this})).intValue();
        }
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) != null) {
                return (findFirstVisibleItemPosition * findViewByPosition.getHeight()) - findViewByPosition.getTop();
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public int getRemainScrollYDistance() {
        int findFirstVisibleItemPosition;
        View findViewByPosition;
        int itemCount;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6c2c679", new Object[]{this})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager == null || (findViewByPosition = linearLayoutManager.findViewByPosition((findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null) {
            return -1;
        }
        int height = findViewByPosition.getHeight();
        if (getAdapter() == null || (itemCount = getAdapter().getItemCount() - 1) <= 0 || (i = itemCount - findFirstVisibleItemPosition) <= 0) {
            return -1;
        }
        return (i * height) - (height - findViewByPosition.getBottom());
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mCardScrollListeners.clear();
        this.mScrollWillChangeListener = null;
        this.mOnPageChangedListeners.clear();
    }

    public void addCardScrollListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a771029c", new Object[]{this, aVar});
        } else {
            this.mCardScrollListeners.add(aVar);
        }
    }

    public void notifyCardScrollBeforeDelete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84656de1", new Object[]{this, str});
            return;
        }
        for (a aVar : this.mCardScrollListeners) {
            aVar.a(str);
        }
    }

    public int getCurrentDisplayPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a76604c2", new Object[]{this})).intValue() : this.mSmoothScrollTargetPosition;
    }
}
