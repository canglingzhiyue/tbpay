package com.taobao.android.detail.core.detail.widget.container;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.f;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.arc;
import tb.ard;
import tb.bau;
import tb.ecg;
import tb.ecr;
import tb.eir;
import tb.eis;
import tb.emu;
import tb.eps;
import tb.fpz;
import tb.kge;

/* loaded from: classes4.dex */
public class NestedScrollContainer extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_OFFSET = 3;
    private static final String TAG = "ScrollContainer";
    private boolean isSelfScrollEnabled;
    public int mAdditionalHeight;
    private Context mContext;
    private int mCurrentIndex;
    private float mDirectionRatio;
    private int mDispatchXDistance;
    private int mDispatchYDistance;
    private int mFirstVisibleIndex;
    private boolean mHorizontalMove;
    private int mInitialVelocity;
    private boolean mIsScrollEnabled;
    private int mLastDispatchX;
    private int mLastDispatchY;
    private float mLastInterceptY;
    private int mLastMoveScrollY;
    private int mLastScrollerY;
    private int mLastVisibleIndex;
    private LinearLayout mLinearLayout;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedNotify;
    private List<c> mNestedScrollChildList;
    public a mOnLoadListener;
    private b mOnScrollListener;
    private int mScrollHeight;
    private d mScrollIndexListener;
    private List<d> mScrollIndexListeners;
    private float mScrollRange;
    private Scroller mScroller;
    private int mStatusBarHeight;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private boolean reachEdge;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, c cVar);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a(int i);
    }

    static {
        kge.a(-1809344675);
    }

    public static /* synthetic */ Object ipc$super(NestedScrollContainer nestedScrollContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5a1129", new Object[]{nestedScrollContainer});
        } else {
            nestedScrollContainer.checkLayoutParams();
        }
    }

    public static /* synthetic */ void access$100(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4467eaa", new Object[]{nestedScrollContainer});
        } else {
            nestedScrollContainer.notifyCurrentIndex();
        }
    }

    public static /* synthetic */ void access$1000(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc65c818", new Object[]{nestedScrollContainer});
        } else {
            nestedScrollContainer.realRefreshHeight();
        }
    }

    public static /* synthetic */ void access$1100(NestedScrollContainer nestedScrollContainer, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e093c5", new Object[]{nestedScrollContainer, cVar});
        } else {
            nestedScrollContainer.resize(cVar);
        }
    }

    public static /* synthetic */ List access$1200(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("99d57ed", new Object[]{nestedScrollContainer}) : nestedScrollContainer.mNestedScrollChildList;
    }

    public static /* synthetic */ LinearLayout access$1300(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("550e5b72", new Object[]{nestedScrollContainer}) : nestedScrollContainer.mLinearLayout;
    }

    public static /* synthetic */ void access$200(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c32ec2b", new Object[]{nestedScrollContainer});
        } else {
            nestedScrollContainer.updateChildScrollY();
        }
    }

    public static /* synthetic */ b access$300(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7fb9e0de", new Object[]{nestedScrollContainer}) : nestedScrollContainer.mOnScrollListener;
    }

    public static /* synthetic */ boolean access$400(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0bc731", new Object[]{nestedScrollContainer})).booleanValue() : nestedScrollContainer.mNeedNotify;
    }

    public static /* synthetic */ boolean access$402(NestedScrollContainer nestedScrollContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c8e09", new Object[]{nestedScrollContainer, new Boolean(z)})).booleanValue();
        }
        nestedScrollContainer.mNeedNotify = z;
        return z;
    }

    public static /* synthetic */ int access$500(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c3f834a1", new Object[]{nestedScrollContainer})).intValue() : nestedScrollContainer.mFirstVisibleIndex;
    }

    public static /* synthetic */ int access$502(NestedScrollContainer nestedScrollContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b0d90c6", new Object[]{nestedScrollContainer, new Integer(i)})).intValue();
        }
        nestedScrollContainer.mFirstVisibleIndex = i;
        return i;
    }

    public static /* synthetic */ int access$600(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7be4a222", new Object[]{nestedScrollContainer})).intValue() : nestedScrollContainer.mLastVisibleIndex;
    }

    public static /* synthetic */ int access$602(NestedScrollContainer nestedScrollContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90aed365", new Object[]{nestedScrollContainer, new Integer(i)})).intValue();
        }
        nestedScrollContainer.mLastVisibleIndex = i;
        return i;
    }

    public static /* synthetic */ int access$700(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33d10fa3", new Object[]{nestedScrollContainer})).intValue() : nestedScrollContainer.calFirstVisibleIndex();
    }

    public static /* synthetic */ int access$800(NestedScrollContainer nestedScrollContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ebbd7d24", new Object[]{nestedScrollContainer})).intValue() : nestedScrollContainer.calLastVisibleIndex();
    }

    public static /* synthetic */ void access$900(NestedScrollContainer nestedScrollContainer, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8776a72", new Object[]{nestedScrollContainer, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            nestedScrollContainer.notifyLifecycle(i, i2, i3, i4);
        }
    }

    public NestedScrollContainer(Context context) {
        this(context, null);
    }

    public NestedScrollContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isSelfScrollEnabled = true;
        this.mIsScrollEnabled = true;
        this.mLastInterceptY = -1.0f;
        this.mInitialVelocity = 0;
        this.mLastScrollerY = 0;
        this.mCurrentIndex = -1;
        this.mFirstVisibleIndex = -1;
        this.mLastVisibleIndex = -1;
        this.mDirectionRatio = 1.3f;
        this.mHorizontalMove = false;
        this.mNeedNotify = true;
        this.mOnLoadListener = new a() { // from class: com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.a
            public void a(boolean z, c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9959b3d8", new Object[]{this, new Boolean(z), cVar});
                    return;
                }
                if (z) {
                    NestedScrollContainer.access$1100(NestedScrollContainer.this, cVar);
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= NestedScrollContainer.access$1200(NestedScrollContainer.this).size()) {
                        i2 = -1;
                        break;
                    } else if (((c) NestedScrollContainer.access$1200(NestedScrollContainer.this).get(i2)).equals(cVar)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    return;
                }
                if (i2 < NestedScrollContainer.access$500(NestedScrollContainer.this)) {
                    cVar.a(Integer.MAX_VALUE, false);
                } else if (i2 != NestedScrollContainer.access$500(NestedScrollContainer.this) || i2 == 0 || NestedScrollContainer.this.getScrollY() <= NestedScrollContainer.access$1300(NestedScrollContainer.this).getChildAt(i2).getTop() - NestedScrollContainer.this.mAdditionalHeight) {
                } else {
                    cVar.a(Integer.MAX_VALUE, false);
                }
            }
        };
        this.mContext = context;
        init();
        emu.a("com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer");
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.mContext);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        updateStatusBarHeight();
        this.mLinearLayout = new LinearLayout(this.mContext);
        this.mLinearLayout.setOrientation(1);
        this.mLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        super.addView(this.mLinearLayout, 0);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    NestedScrollContainer.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    NestedScrollContainer.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                NestedScrollContainer.access$000(NestedScrollContainer.this);
            }
        });
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFocusable(true);
        setDescendantFocusability(131072);
        setWillNotDraw(false);
        this.mScroller = new Scroller(getContext());
        this.mNestedScrollChildList = new ArrayList();
        getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d815a80f", new Object[]{this});
                    return;
                }
                int scrollY = NestedScrollContainer.this.getScrollY();
                NestedScrollContainer.access$100(NestedScrollContainer.this);
                NestedScrollContainer.access$200(NestedScrollContainer.this);
                if (NestedScrollContainer.access$300(NestedScrollContainer.this) != null) {
                    NestedScrollContainer.access$300(NestedScrollContainer.this).a(scrollY);
                }
                if (!NestedScrollContainer.access$400(NestedScrollContainer.this)) {
                    return;
                }
                int access$500 = NestedScrollContainer.access$500(NestedScrollContainer.this);
                int access$600 = NestedScrollContainer.access$600(NestedScrollContainer.this);
                NestedScrollContainer nestedScrollContainer = NestedScrollContainer.this;
                NestedScrollContainer.access$502(nestedScrollContainer, NestedScrollContainer.access$700(nestedScrollContainer));
                NestedScrollContainer nestedScrollContainer2 = NestedScrollContainer.this;
                NestedScrollContainer.access$602(nestedScrollContainer2, NestedScrollContainer.access$800(nestedScrollContainer2));
                NestedScrollContainer nestedScrollContainer3 = NestedScrollContainer.this;
                NestedScrollContainer.access$900(nestedScrollContainer3, NestedScrollContainer.access$500(nestedScrollContainer3), NestedScrollContainer.access$600(NestedScrollContainer.this), access$500, access$600);
            }
        });
    }

    public void updateStatusBarHeight() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b310046", new Object[]{this});
            return;
        }
        try {
            if (((DetailCoreActivity) fpz.b(this.mContext)).c) {
                i = ecr.b(this.mContext);
            }
            this.mStatusBarHeight = i;
            this.mAdditionalHeight = ((DetailCoreActivity) fpz.b(this.mContext)).r().getActionBarHeight() + this.mStatusBarHeight;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addScrollChild(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03b7a1", new Object[]{this, cVar});
            return;
        }
        this.mNestedScrollChildList.add(cVar);
        View k = cVar.k();
        k.setOverScrollMode(2);
        this.mLinearLayout.addView(k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        if (cVar.j()) {
            int i = this.mScrollHeight;
            if (i == 0) {
                i = getHeight();
            }
            layoutParams.height = i;
        }
        k.setLayoutParams(layoutParams);
        this.mScrollRange = 0.0f;
    }

    public void removeScrollChild(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9dff1e", new Object[]{this, cVar});
            return;
        }
        List<c> list = this.mNestedScrollChildList;
        if (list != null) {
            list.remove(cVar);
        }
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout != null) {
            linearLayout.removeView(cVar.k());
        }
        this.mScrollRange = 0.0f;
    }

    public void clearScrollChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ca1949", new Object[]{this});
            return;
        }
        List<c> list = this.mNestedScrollChildList;
        if (list != null) {
            list.clear();
        }
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.mScrollRange = 0.0f;
    }

    public List<c> getScrollChildList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fee5fc29", new Object[]{this}) : this.mNestedScrollChildList;
    }

    public void setScrollIndexListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85920d69", new Object[]{this, dVar});
        } else {
            this.mScrollIndexListener = dVar;
        }
    }

    public void addScrollIndexListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30aef0a", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            if (this.mScrollIndexListeners == null) {
                this.mScrollIndexListeners = new ArrayList();
            }
            if (this.mScrollIndexListeners.contains(dVar)) {
                return;
            }
            this.mScrollIndexListeners.add(dVar);
        }
    }

    public void removeScrollIndexListener(d dVar) {
        List<d> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8d86987", new Object[]{this, dVar});
        } else if (dVar == null || (list = this.mScrollIndexListeners) == null) {
        } else {
            list.remove(dVar);
        }
    }

    public void removeScrollIndexListener(Class<? extends d> cls) {
        List<d> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02a0e01", new Object[]{this, cls});
        } else if (cls == null || (list = this.mScrollIndexListeners) == null) {
        } else {
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getClass() == cls) {
                    it.remove();
                }
            }
        }
    }

    public void setNeedNotify(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ccbe4c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mNeedNotify = z;
        postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NestedScrollContainer.access$402(NestedScrollContainer.this, true);
                }
            }
        }, 500L);
    }

    public void onResume() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        List<c> list = this.mNestedScrollChildList;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this.mNestedScrollChildList.size();
        int i2 = this.mFirstVisibleIndex;
        while (true) {
            i = this.mLastVisibleIndex;
            if (i2 > i) {
                break;
            }
            if (i2 >= 0 && i2 < size) {
                this.mNestedScrollChildList.get(i2).b();
            }
            i2++;
        }
        if (i >= 4) {
            return;
        }
        eps.a(this.mContext, "Page_Detail", 19999, "resume_recommend", null, null, new String[0]);
    }

    private void checkLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973dceff", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mLinearLayout.getChildCount(); i++) {
            View childAt = this.mLinearLayout.getChildAt(i);
            if (i >= this.mNestedScrollChildList.size()) {
                return;
            }
            if (this.mNestedScrollChildList.get(i).j()) {
                int i2 = this.mScrollHeight;
                if (i2 == 0) {
                    i2 = getHeight();
                }
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, i2));
            }
        }
    }

    public void refreshHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275e0369", new Object[]{this});
        } else {
            postDelayed(new Runnable() { // from class: com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NestedScrollContainer.access$1000(NestedScrollContainer.this);
                    }
                }
            }, 50L);
        }
    }

    private void realRefreshHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec33996b", new Object[]{this});
            return;
        }
        int min = Math.min(this.mLinearLayout.getChildCount(), this.mNestedScrollChildList.size());
        for (int i = 0; i < min; i++) {
            try {
                View childAt = this.mLinearLayout.getChildAt(i);
                if (this.mNestedScrollChildList.get(i).j()) {
                    childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, this.mScrollHeight == 0 ? getHeight() : this.mScrollHeight));
                } else {
                    childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                }
            } catch (Throwable th) {
                UnifyLog.d(TAG, "refreshHeight error", th.getMessage());
            }
        }
    }

    public void setOnScrollListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72caf65d", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.mOnScrollListener = bVar;
        }
    }

    private void resize(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465856e7", new Object[]{this, cVar});
            return;
        }
        View k = cVar.k();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) k.getLayoutParams();
        if (cVar.j()) {
            int i = this.mScrollHeight;
            if (i == 0) {
                i = getHeight();
            }
            layoutParams.height = i;
        } else {
            layoutParams.height = -1;
        }
        k.setLayoutParams(layoutParams);
    }

    private int getScrollingChildIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bee363af", new Object[]{this})).intValue();
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return -1;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mLinearLayout.getChildAt(i);
            if (childAt.getVisibility() != 8 && Math.abs(getScrollY() - childAt.getTop()) <= 3 && i < this.mNestedScrollChildList.size() && this.mNestedScrollChildList.get(i).j()) {
                return i;
            }
        }
        return -1;
    }

    private int getArriveScrollingChildIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d451e78", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return -1;
        }
        if (i >= i2) {
            for (int i3 = 0; i3 < childCount && i3 < this.mNestedScrollChildList.size(); i3++) {
                View childAt = this.mLinearLayout.getChildAt(i3);
                if (this.mNestedScrollChildList.get(i3).j() && childAt.getVisibility() != 8 && ((childAt.getTop() > i && childAt.getTop() <= i2) || (childAt.getTop() <= i && childAt.getTop() > i2))) {
                    return i3;
                }
            }
        } else {
            for (int i4 = childCount - 1; i4 >= 0 && i4 < this.mNestedScrollChildList.size(); i4--) {
                View childAt2 = this.mLinearLayout.getChildAt(i4);
                if (this.mNestedScrollChildList.get(i4).j() && childAt2.getVisibility() != 8 && ((childAt2.getTop() > i && childAt2.getTop() <= i2) || (childAt2.getTop() <= i && childAt2.getTop() > i2))) {
                    return i4;
                }
            }
        }
        return -1;
    }

    private void notifyCurrentIndex() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7db9849", new Object[]{this});
            return;
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.mLinearLayout.getChildAt(i2);
            if (i2 == 0) {
                if (getScrollY() >= childAt.getTop() && getScrollY() < childAt.getBottom() - this.mAdditionalHeight) {
                    this.mCurrentIndex = i2;
                    if (this.mScrollIndexListener != null && this.mCurrentIndex < this.mNestedScrollChildList.size()) {
                        this.mScrollIndexListener.a(this.mCurrentIndex, this.mNestedScrollChildList.get(this.mCurrentIndex).f(), getScrollY());
                    }
                    dispatchScrollIndexListener();
                }
            } else if (getScrollY() >= childAt.getTop() - this.mAdditionalHeight && getScrollY() < childAt.getBottom() - this.mAdditionalHeight) {
                this.mCurrentIndex = i2;
                if (this.mScrollIndexListener != null && this.mCurrentIndex < this.mNestedScrollChildList.size()) {
                    String f = this.mNestedScrollChildList.get(this.mCurrentIndex).f();
                    if (StringUtils.isEmpty(f) && (i = this.mCurrentIndex) > 0) {
                        f = this.mNestedScrollChildList.get(i - 1).f();
                    }
                    this.mScrollIndexListener.a(this.mCurrentIndex, f, getScrollY());
                }
                dispatchScrollIndexListener();
            }
        }
    }

    private void dispatchScrollIndexListener() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dadcf806", new Object[]{this});
        } else if (!f.j()) {
            arc.a().a(TAG, "dispatchScrollIndexListener", "enableNestedScrollDispatch=false");
        } else if (!bau.a(this.mScrollIndexListeners)) {
            List<c> list = this.mNestedScrollChildList;
            if (list != null) {
                int size = list.size();
                int i2 = this.mCurrentIndex;
                if (size > i2) {
                    c cVar = this.mNestedScrollChildList.get(i2);
                    if (cVar == null) {
                        arc.a().c(TAG, "dispatchScrollIndexListener", "scrollChild is null");
                        return;
                    }
                    String f = cVar.f();
                    if (StringUtils.isEmpty(f) && (i = this.mCurrentIndex) > 0) {
                        f = this.mNestedScrollChildList.get(i - 1).f();
                    }
                    for (d dVar : this.mScrollIndexListeners) {
                        dVar.a(this.mCurrentIndex, f, getScrollY());
                    }
                    return;
                }
            }
            ard a2 = arc.a();
            a2.c(TAG, "dispatchScrollIndexListener", "mNestedScrollChildList size is not valid,mCurrentIndex=" + this.mCurrentIndex);
        }
    }

    private void updateChildScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f375e0", new Object[]{this});
            return;
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mLinearLayout.getChildAt(i);
            if (getScrollY() >= childAt.getTop() && getScrollY() < childAt.getBottom() && i < this.mNestedScrollChildList.size()) {
                this.mNestedScrollChildList.get(i).a(childAt.getTop() - getScrollY());
            }
            if (getScrollY() + getMeasuredHeight() >= childAt.getTop() && getScrollY() + getMeasuredHeight() < childAt.getBottom() && i < this.mNestedScrollChildList.size()) {
                this.mNestedScrollChildList.get(i).a(childAt.getTop() - getScrollY());
            }
        }
    }

    private int calFirstVisibleIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c77979c", new Object[]{this})).intValue();
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return -1;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mLinearLayout.getChildAt(i);
            if (i == 0) {
                if (getScrollY() >= childAt.getTop() && getScrollY() < childAt.getBottom() - this.mAdditionalHeight) {
                    return i;
                }
            } else if (getScrollY() >= childAt.getTop() - this.mAdditionalHeight && getScrollY() < childAt.getBottom() - this.mAdditionalHeight) {
                return i;
            }
        }
        return -1;
    }

    private int calLastVisibleIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd902f9e", new Object[]{this})).intValue();
        }
        int childCount = this.mLinearLayout.getChildCount();
        if (childCount == 0) {
            return -1;
        }
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = this.mLinearLayout.getChildAt(i);
            if (getScrollY() + getHeight() > childAt.getTop() && getScrollY() + getHeight() <= childAt.getBottom()) {
                return i;
            }
        }
        return -1;
    }

    private void notifyLifecycle(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9938f2e8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (int i5 = i; i5 <= i2; i5++) {
            if (i5 > i4 || i5 < i3) {
                if (i5 < 0 || i5 >= this.mNestedScrollChildList.size()) {
                    return;
                }
                this.mNestedScrollChildList.get(i5).b();
            }
        }
        if (i4 > i2) {
            z = true;
        }
        while (i3 <= i4) {
            if (i3 < i || i3 > i2) {
                if (i3 < 0 || i3 >= this.mNestedScrollChildList.size()) {
                    return;
                }
                this.mNestedScrollChildList.get(i3).a(true, z);
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int arriveScrollingChildIndex;
        int arriveScrollingChildIndex2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.reachEdge = false;
        if (!this.isSelfScrollEnabled) {
            requestDisallowInterceptTouchEvent(true);
            return super.dispatchTouchEvent(motionEvent);
        }
        obtainVelocityTracker(motionEvent);
        VelocityTracker velocityTracker = this.mVelocityTracker;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
            }
            this.mDispatchYDistance = 0;
            this.mDispatchXDistance = 0;
            this.mLastDispatchX = (int) motionEvent.getX();
            this.mLastDispatchY = (int) motionEvent.getY();
            this.mLastMoveScrollY = 0;
            this.mHorizontalMove = false;
        } else if (action == 1) {
            if (getScrollingChildIndex() < 0 && this.mLastMoveScrollY != 0 && getScrollY() != 0 && (arriveScrollingChildIndex = getArriveScrollingChildIndex(getScrollY(), this.mLastMoveScrollY)) > 0 && arriveScrollingChildIndex < this.mNestedScrollChildList.size()) {
                View childAt = this.mLinearLayout.getChildAt(arriveScrollingChildIndex);
                if (this.mNestedScrollChildList.get(arriveScrollingChildIndex).j() && childAt.getTop() != this.mLastMoveScrollY && childAt.getTop() != getScrollY()) {
                    scrollTo(0, childAt.getTop());
                }
            }
            this.mLastMoveScrollY = 0;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            this.mInitialVelocity = (int) velocityTracker.getYVelocity(0);
            if (Math.abs(this.mInitialVelocity) > this.mMinimumVelocity && !this.mHorizontalMove) {
                fling(-this.mInitialVelocity);
            }
            this.mHorizontalMove = false;
            releaseVelocityTracker();
        } else if (action == 2) {
            int scrollingChildIndex = getScrollingChildIndex();
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            this.mDispatchXDistance += Math.abs(x - this.mLastDispatchX);
            this.mDispatchYDistance += Math.abs(y - this.mLastDispatchY);
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            this.mLastDispatchX = x;
            if (this.mDispatchXDistance > this.mDispatchYDistance * this.mDirectionRatio) {
                this.mLastDispatchY = y;
                requestDisallowInterceptTouchEvent(true);
                if (eis.c) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.mHorizontalMove = true;
                return super.dispatchTouchEvent(motionEvent);
            }
            requestDisallowInterceptTouchEvent(false);
            this.mHorizontalMove = false;
            if (scrollingChildIndex < 0) {
                if (this.mLastMoveScrollY != 0 && getScrollY() != 0 && (arriveScrollingChildIndex2 = getArriveScrollingChildIndex(getScrollY(), this.mLastMoveScrollY)) > 0 && arriveScrollingChildIndex2 < this.mNestedScrollChildList.size()) {
                    View childAt2 = this.mLinearLayout.getChildAt(arriveScrollingChildIndex2);
                    if (this.mNestedScrollChildList.get(arriveScrollingChildIndex2).j() && childAt2.getTop() != this.mLastMoveScrollY && childAt2.getTop() != getScrollY()) {
                        scrollTo(0, childAt2.getTop());
                        this.mLastDispatchY = y;
                        this.mLastMoveScrollY = childAt2.getTop();
                        return false;
                    }
                }
                if (this.mIsScrollEnabled) {
                    requestDisallowInterceptTouchEvent(false);
                } else {
                    requestDisallowInterceptTouchEvent(true);
                }
                this.mLastDispatchY = y;
                this.mLastMoveScrollY = getScrollY();
                return super.dispatchTouchEvent(motionEvent);
            }
            this.mLinearLayout.getChildAt(scrollingChildIndex);
            if (scrollingChildIndex < this.mNestedScrollChildList.size()) {
                c cVar = this.mNestedScrollChildList.get(scrollingChildIndex);
                int i = this.mLastDispatchY;
                if (i < y) {
                    if (cVar.g() && scrollingChildIndex != 0) {
                        this.reachEdge = true;
                        requestDisallowInterceptTouchEvent(false);
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                    }
                } else if (i > y) {
                    if (cVar.h()) {
                        this.reachEdge = true;
                        requestDisallowInterceptTouchEvent(false);
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                    }
                } else if (cVar.h() && cVar.g()) {
                    this.reachEdge = true;
                    requestDisallowInterceptTouchEvent(false);
                } else {
                    requestDisallowInterceptTouchEvent(true);
                }
            }
            this.mLastDispatchY = y;
            this.mLastMoveScrollY = getScrollY();
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.mLastInterceptY = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && getScrollingChildIndex() < 0 && Math.abs(motionEvent.getY() - this.mLastInterceptY) >= this.mTouchSlop) {
            return true;
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int scrollingChildIndex = getScrollingChildIndex();
            if (!this.reachEdge && scrollingChildIndex >= 0 && scrollingChildIndex < this.mNestedScrollChildList.size()) {
                View childAt = this.mLinearLayout.getChildAt(scrollingChildIndex);
                c cVar = this.mNestedScrollChildList.get(scrollingChildIndex);
                if (cVar != null && ((!cVar.g() || !cVar.h()) && childAt != null)) {
                    childAt.onTouchEvent(motionEvent);
                    return false;
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac96b80", new Object[]{this, new Integer(i)});
            return;
        }
        this.mScrollRange = 0.0f;
        for (int i2 = 0; i2 < this.mLinearLayout.getChildCount() && i2 < this.mNestedScrollChildList.size(); i2++) {
            if (this.mLinearLayout.getChildAt(i2).getVisibility() != 8) {
                this.mScrollRange += this.mNestedScrollChildList.get(i2).i();
            }
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.computeScrollOffset()) {
            this.mLastScrollerY = 0;
            Scroller scroller2 = this.mScroller;
            int scrollX = getScrollX();
            float f = this.mScrollRange;
            scroller2.fling(scrollX, (int) f, 0, i, 0, 0, 0, ((int) f) * 2);
        }
        invalidate();
    }

    private void obtainVelocityTracker(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd91992", new Object[]{this, motionEvent});
            return;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
    }

    private void releaseVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d82b1b", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.mVelocityTracker = null;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void computeScroll() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScroller == null) {
        } else {
            if (eir.d()) {
                try {
                    if (this.mScroller.timePassed() < 0) {
                        i.a("DetailScroll", "computeScroll mScroller.timePassed():" + this.mScroller.timePassed() + "," + Thread.currentThread().toString());
                    }
                    z = this.mScroller.computeScrollOffset();
                } catch (Throwable th) {
                    ecg.c(getContext(), th);
                    z = false;
                }
            } else {
                z = this.mScroller.computeScrollOffset();
            }
            if (z) {
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                int scrollingChildIndex = getScrollingChildIndex();
                int i = this.mLastScrollerY;
                int i2 = i != 0 ? currY - i : 0;
                if (scrollingChildIndex < 0) {
                    if (this.mInitialVelocity < 0) {
                        if (!reachContainerBottom()) {
                            int arriveScrollingChildIndex = getArriveScrollingChildIndex(getScrollY() + i2, getScrollY());
                            if (arriveScrollingChildIndex < 0) {
                                scrollTo(currX, i2 + getScrollY());
                            } else {
                                View childAt = this.mLinearLayout.getChildAt(arriveScrollingChildIndex);
                                if (arriveScrollingChildIndex < this.mNestedScrollChildList.size()) {
                                    c cVar = this.mNestedScrollChildList.get(arriveScrollingChildIndex);
                                    if (cVar.j()) {
                                        scrollTo(currX, childAt.getTop());
                                        cVar.a(0, (i2 + getScrollY()) - childAt.getTop());
                                    } else {
                                        scrollTo(currX, i2 + getScrollY());
                                    }
                                }
                            }
                        } else {
                            this.mScroller.abortAnimation();
                            return;
                        }
                    } else if (!reachContainerTop()) {
                        int arriveScrollingChildIndex2 = getArriveScrollingChildIndex(getScrollY() + i2, getScrollY());
                        if (arriveScrollingChildIndex2 < 0) {
                            scrollTo(currX, i2 + getScrollY());
                        } else {
                            View childAt2 = this.mLinearLayout.getChildAt(arriveScrollingChildIndex2);
                            if (arriveScrollingChildIndex2 < this.mNestedScrollChildList.size()) {
                                c cVar2 = this.mNestedScrollChildList.get(arriveScrollingChildIndex2);
                                if (cVar2.j()) {
                                    scrollTo(currX, childAt2.getTop());
                                    cVar2.a(0, (i2 + getScrollY()) - childAt2.getTop());
                                } else {
                                    scrollTo(currX, i2 + getScrollY());
                                }
                            }
                        }
                    } else {
                        this.mScroller.abortAnimation();
                        return;
                    }
                } else {
                    this.mLinearLayout.getChildAt(scrollingChildIndex);
                    if (scrollingChildIndex < this.mNestedScrollChildList.size()) {
                        c cVar3 = this.mNestedScrollChildList.get(scrollingChildIndex);
                        if (this.mInitialVelocity < 0 && cVar3.h()) {
                            if (scrollingChildIndex == this.mLinearLayout.getChildCount() - 1 || this.mLinearLayout.getChildAt(scrollingChildIndex).getBottom() == this.mLinearLayout.getMeasuredHeight()) {
                                this.mScroller.abortAnimation();
                                return;
                            }
                            scrollTo(currX, getScrollY() + i2);
                        } else if (this.mInitialVelocity <= 0 || !cVar3.g()) {
                            if (i2 != 0) {
                                cVar3.a(0, i2);
                            }
                        } else if (scrollingChildIndex == 0 || this.mLinearLayout.getChildAt(scrollingChildIndex).getTop() < 3) {
                            this.mScroller.abortAnimation();
                            return;
                        } else {
                            scrollTo(currX, getScrollY() + i2);
                        }
                    }
                }
                this.mLastScrollerY = currY;
                postInvalidate();
                return;
            }
            this.mLastScrollerY = 0;
        }
    }

    public boolean isOnTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51dfd677", new Object[]{this})).booleanValue();
        }
        List<c> list = this.mNestedScrollChildList;
        if (list != null && !list.isEmpty() && this.mNestedScrollChildList.get(0).g()) {
            return reachContainerTop();
        }
        return false;
    }

    private boolean reachContainerTop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa14d332", new Object[]{this})).booleanValue() : getScrollY() == 0;
    }

    private boolean reachContainerBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f38ee824", new Object[]{this})).booleanValue() : getScrollY() + getMeasuredHeight() >= this.mLinearLayout.getMeasuredHeight();
    }

    public void enableSelfScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de41d91", new Object[]{this, new Boolean(z)});
        } else {
            this.isSelfScrollEnabled = z;
        }
    }

    public void enableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ca12fd", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsScrollEnabled = z;
        }
    }

    public void stopScrolling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95325f1a", new Object[]{this});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            return;
        }
        this.mLastScrollerY = 0;
        this.mScroller.abortAnimation();
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.mIsScrollEnabled) {
        } else {
            super.scrollTo(i, i2);
        }
    }

    public void scrollToPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2314fd0", new Object[]{this, new Integer(i)});
        } else {
            scrollToPos(i, true, true);
        }
    }

    public void scrollToPos(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb32f650", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        LinearLayout linearLayout = this.mLinearLayout;
        if (linearLayout == null || linearLayout.getChildCount() <= i) {
            return;
        }
        if (this.mCurrentIndex < i) {
            View childAt = this.mLinearLayout.getChildAt(i);
            for (int i2 = 0; i2 < i && i2 < this.mNestedScrollChildList.size(); i2++) {
                this.mNestedScrollChildList.get(i2).a(Integer.MAX_VALUE, false);
            }
            if (z && i < this.mNestedScrollChildList.size()) {
                this.mNestedScrollChildList.get(i).a(0, false);
            }
            for (int i3 = i + 1; i3 < this.mLinearLayout.getChildCount() && i3 < this.mNestedScrollChildList.size(); i3++) {
                this.mNestedScrollChildList.get(i3).a(0, false);
            }
            if (i == 0 || !z2) {
                scrollTo(0, childAt.getTop());
                return;
            } else {
                scrollTo(0, childAt.getTop() - this.mAdditionalHeight);
                return;
            }
        }
        View childAt2 = this.mLinearLayout.getChildAt(i);
        if (z && i < this.mNestedScrollChildList.size()) {
            this.mNestedScrollChildList.get(i).a(0, false);
        }
        for (int i4 = i + 1; i4 < this.mLinearLayout.getChildCount() && i4 < this.mNestedScrollChildList.size(); i4++) {
            this.mNestedScrollChildList.get(i4).a(0, false);
        }
        for (int i5 = 0; i5 < i && i5 < this.mNestedScrollChildList.size(); i5++) {
            this.mNestedScrollChildList.get(i5).a(Integer.MAX_VALUE, false);
        }
        if (i == 0 || !z2) {
            scrollTo(0, childAt2.getTop());
        } else {
            scrollTo(0, childAt2.getTop() - this.mAdditionalHeight);
        }
    }

    public void setChildHeight(int i, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24a3c07", new Object[]{this, new Integer(i), cVar});
            return;
        }
        this.mScrollHeight = i;
        if (cVar == null || this.mLinearLayout.getChildCount() <= 0 || this.mNestedScrollChildList.size() <= 0) {
            return;
        }
        int min = Math.min(this.mLinearLayout.getChildCount(), this.mNestedScrollChildList.size());
        for (int i2 = 0; i2 < min; i2++) {
            View childAt = this.mLinearLayout.getChildAt(i2);
            if (this.mNestedScrollChildList.get(i2) == cVar) {
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
                return;
            }
        }
    }
}
