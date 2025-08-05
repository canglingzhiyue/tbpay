package com.taobao.android.searchbaseframe.business.srp.list.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.kge;

/* loaded from: classes6.dex */
public class PartnerRecyclerView extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PartnerRecyclerView";
    private boolean disableScrollListener;
    private int mAccumulated;
    private View mBlankView;
    private Path mClipPath;
    private int mDrawOffset;
    private float mExposeFactor;
    private boolean mFirstScrollChanged;
    private boolean mFixConfiged;
    private boolean mFixPagingProblem;
    private boolean mFixTrigger;
    private float mFlingFactor;
    private FrameLayout mFooterFrame;
    private FrameLayout mHeaderFrame;
    private boolean mHeaderFrameAdded;
    private boolean mIsScrolling;
    private boolean mIsTabOut;
    private b mLayoutCompleteListener;
    private a mListEventListener;
    private int mPreRequestCellThreshold;
    private boolean mScrollDown;
    private int mScrollSpeed;
    private boolean mStopWhenCantScroll;
    private int[] mTmpArray;
    private int mTopRadius;
    private int mTotalScrollY;
    private float mTouchRawX;
    private float mTouchRawY;
    private int mTriggerScrollDistance;
    private boolean mUsingBlank;
    private boolean mUsingHeader;

    /* loaded from: classes6.dex */
    public interface a {
        void ao_();

        void aq_();

        void b(int i);

        void c(int i);

        void k();

        void n();

        void o();
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(265840941);
    }

    public static /* synthetic */ Object ipc$super(PartnerRecyclerView partnerRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -548846230:
                super.addFooterView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1502646584:
                super.addHeaderView((View) objArr[0]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1943919033:
                return new Boolean(super.removeHeaderView((View) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public PartnerRecyclerView(Context context) {
        super(context);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        init(true);
    }

    public Path getClipPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Path) ipChange.ipc$dispatch("f3e86dba", new Object[]{this}) : this.mClipPath;
    }

    public void restrainFirstScrollChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603f012c", new Object[]{this});
        } else {
            this.mFirstScrollChanged = true;
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mFirstScrollChanged) {
            this.mFirstScrollChanged = false;
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    public int getTopRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccbccb8b", new Object[]{this})).intValue() : this.mTopRadius;
    }

    public PartnerRecyclerView(Context context, boolean z) {
        super(context);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        init(z);
    }

    public PartnerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        init(true);
    }

    public PartnerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAccumulated = 0;
        this.mIsScrolling = false;
        this.mTmpArray = new int[2];
        this.mPreRequestCellThreshold = 0;
        this.mFixPagingProblem = false;
        this.mFixConfiged = false;
        this.mIsTabOut = false;
        this.mFlingFactor = 1.0f;
        this.mExposeFactor = 0.0f;
        this.mUsingHeader = true;
        this.mScrollDown = true;
        this.mScrollSpeed = 0;
        this.mStopWhenCantScroll = false;
        this.mDrawOffset = 0;
        this.mTopRadius = 0;
        this.mClipPath = null;
        this.mHeaderFrameAdded = true;
        this.mFixTrigger = false;
        this.mFirstScrollChanged = false;
        init(true);
    }

    public void setLayoutCompleteListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe8afc4", new Object[]{this, bVar});
        } else {
            this.mLayoutCompleteListener = bVar;
        }
    }

    public void setFixTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77641068", new Object[]{this, new Boolean(z)});
        } else {
            this.mFixTrigger = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        updatePath();
    }

    private void updatePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5f1215", new Object[]{this});
        } else if (this.mTopRadius == 0 && this.mDrawOffset == 0) {
            this.mClipPath = null;
        } else if (getWidth() == 0 || getHeight() == 0) {
        } else {
            Path path = this.mClipPath;
            if (path == null) {
                this.mClipPath = new Path();
            } else {
                path.reset();
            }
            if (this.mTopRadius != 0) {
                Path path2 = this.mClipPath;
                RectF rectF = new RectF(0.0f, this.mDrawOffset, getWidth(), getHeight());
                int i = this.mTopRadius;
                path2.addRoundRect(rectF, new float[]{i, i, i, i, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                return;
            }
            this.mClipPath.addRect(new RectF(0.0f, this.mDrawOffset, getWidth(), getHeight()), Path.Direction.CW);
        }
    }

    public void notifyLayoutComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24bc4b3", new Object[]{this});
            return;
        }
        b bVar = this.mLayoutCompleteListener;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void setDrawOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698fb203", new Object[]{this, new Integer(i)});
        } else if (this.mDrawOffset == i) {
        } else {
            this.mDrawOffset = i;
            updatePath();
            invalidate();
        }
    }

    public void setTopRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d38277", new Object[]{this, new Integer(i)});
        } else if (this.mTopRadius == i) {
        } else {
            this.mTopRadius = i;
            updatePath();
            invalidate();
        }
    }

    public void disableScrollFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d24d68", new Object[]{this});
        } else {
            removeFeature(SmoothRecyclerScrollFeature.class);
        }
    }

    private void init(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        setRecycledViewPool(new com.taobao.android.searchbaseframe.business.srp.list.uikit.b());
        this.mUsingBlank = z;
        if (this.mUsingBlank) {
            this.mBlankView = new View(getContext());
            this.mBlankView.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            this.mBlankView.setId(R.id.libsf_srp_list_blank);
            super.addHeaderView(this.mBlankView);
        }
        this.mHeaderFrame = new FrameLayout(getContext());
        this.mHeaderFrame.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mHeaderFrame.setId(R.id.libsf_srp_list_header_container);
        super.addHeaderView(this.mHeaderFrame);
        this.mFooterFrame = new FrameLayout(getContext());
        this.mFooterFrame.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.mFooterFrame.setId(R.id.libsf_srp_list_footer_container);
        super.addFooterView(this.mFooterFrame);
        try {
            addFeature(new SmoothRecyclerScrollFeature());
        } catch (Throwable unused) {
            k.c(TAG, "No SmoothRecyclerScrollFeature for TRecyclerView");
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView
    public void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
        } else {
            this.mHeaderFrame.addView(view);
        }
    }

    public void removeHeaderFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa9a243", new Object[]{this});
        } else if (!this.mHeaderFrameAdded) {
        } else {
            super.removeHeaderView(this.mHeaderFrame);
            this.mHeaderFrameAdded = false;
        }
    }

    public void addHeaderFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fca94486", new Object[]{this});
        } else if (this.mHeaderFrameAdded) {
        } else {
            super.addHeaderView(this.mHeaderFrame);
            this.mHeaderFrameAdded = true;
        }
    }

    public FrameLayout getHeaderFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("f7560508", new Object[]{this}) : this.mHeaderFrame;
    }

    public View getBlankView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("73a8942c", new Object[]{this}) : this.mBlankView;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView
    public void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else {
            this.mFooterFrame.addView(view);
        }
    }

    public FrameLayout getFooterFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ba7fe916", new Object[]{this}) : this.mFooterFrame;
    }

    public void setBlankHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9df4523", new Object[]{this, new Integer(i)});
        } else if (!this.mUsingBlank) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.mBlankView.getLayoutParams();
            if (i <= 0) {
                i = 1;
            }
            if (i == layoutParams.height) {
                return;
            }
            layoutParams.height = i;
            this.mBlankView.setLayoutParams(layoutParams);
        }
    }

    public void setBlankViewVisibility(int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8102beb3", new Object[]{this, new Integer(i)});
        } else if (!this.mUsingBlank || (view = this.mBlankView) == null) {
        } else {
            view.setVisibility(i);
        }
    }

    public boolean isScrolling() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad3ffaf6", new Object[]{this})).booleanValue() : this.mIsScrolling;
    }

    public void setListEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790feb7a", new Object[]{this, aVar});
        } else {
            this.mListEventListener = aVar;
        }
    }

    public void setPreRequestCellThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdad4e1", new Object[]{this, new Integer(i)});
        } else {
            this.mPreRequestCellThreshold = i;
        }
    }

    public int getPreRequestCellThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686adee1", new Object[]{this})).intValue() : this.mPreRequestCellThreshold;
    }

    public void setTriggerScrollDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c2cbe4", new Object[]{this, new Integer(i)});
        } else {
            this.mTriggerScrollDistance = i;
        }
    }

    public void backToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e79b3a", new Object[]{this});
        } else {
            scrollToPosition(0);
        }
    }

    public void goToBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f5a315", new Object[]{this});
        } else {
            scrollToPosition(getAdapter().getItemCount() - 1);
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (MotionEventCompat.getActionMasked(motionEvent) == 0) {
            this.mAccumulated = 0;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0 != 2) goto L10;
     */
    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r4
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "a9b14c3a"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L1c:
            int r0 = android.support.v4.view.MotionEventCompat.getActionMasked(r5)
            if (r0 == 0) goto L25
            if (r0 == r2) goto L27
            goto L33
        L25:
            r4.mAccumulated = r3
        L27:
            float r0 = r5.getRawX()
            r4.mTouchRawX = r0
            float r0 = r5.getRawY()
            r4.mTouchRawY = r0
        L33:
            boolean r5 = super.onTouchEvent(r5)     // Catch: java.lang.Exception -> L38
            return r5
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setScrollListenerEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbe33cf", new Object[]{this, new Boolean(z)});
        } else {
            this.disableScrollListener = !z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        if (this.disableScrollListener) {
            return;
        }
        int findCompletelyLastVisibleItemPosition = findCompletelyLastVisibleItemPosition();
        if (i == 1) {
            this.mIsScrolling = true;
            a aVar2 = this.mListEventListener;
            if (aVar2 == null) {
                return;
            }
            aVar2.n();
        } else if (i != 0) {
        } else {
            this.mIsScrolling = false;
            this.mAccumulated = 0;
            if (findCompletelyLastVisibleItemPosition >= (getLayoutManager().getItemCount() - this.mPreRequestCellThreshold) - 2 && (aVar = this.mListEventListener) != null) {
                aVar.k();
            }
            a aVar3 = this.mListEventListener;
            if (aVar3 == null) {
                return;
            }
            aVar3.o();
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.support.v7.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        if (this.mClipPath != null) {
            canvas.save();
            canvas.clipPath(this.mClipPath);
        }
        super.draw(canvas);
        if (this.mClipPath == null) {
            return;
        }
        canvas.restore();
    }

    public int getTotalScrollOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2555b7e8", new Object[]{this})).intValue() : this.mTotalScrollY;
    }

    public void setTotalScrollOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a555ba", new Object[]{this, new Integer(i)});
        } else {
            this.mTotalScrollY = i;
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
        if (this.disableScrollListener) {
            return;
        }
        if (i2 != 0) {
            this.mScrollDown = i2 > 0;
        }
        this.mScrollSpeed = Math.abs(i2);
        a aVar = this.mListEventListener;
        if (aVar != null) {
            aVar.aq_();
        }
        this.mTotalScrollY += i2;
        int i3 = -1;
        if (this.mTotalScrollY <= 0) {
            this.mTotalScrollY = 0;
        } else if (!canScrollVertically(-1)) {
            this.mTotalScrollY = 0;
        }
        this.mAccumulated += i2;
        int findCompletelyLastVisibleItemPosition = findCompletelyLastVisibleItemPosition();
        if (findCompletelyLastVisibleItemPosition < 0) {
            findCompletelyLastVisibleItemPosition = -1;
        }
        int leadingItemOffset = getLeadingItemOffset();
        if (!this.mFixTrigger || getScrollState() != 0) {
            if (leadingItemOffset == Integer.MAX_VALUE || leadingItemOffset < (-this.mTriggerScrollDistance)) {
                a aVar2 = this.mListEventListener;
                if (aVar2 != null) {
                    aVar2.c(leadingItemOffset);
                }
            } else {
                a aVar3 = this.mListEventListener;
                if (aVar3 != null) {
                    aVar3.ao_();
                }
            }
        }
        if (this.mListEventListener != null) {
            int itemCount = getAdapter().getItemCount();
            int footerViewsCount = findCompletelyLastVisibleItemPosition >= itemCount - getFooterViewsCount() ? (itemCount - getFooterViewsCount()) - 1 : findCompletelyLastVisibleItemPosition - getHeaderViewsCount();
            if (footerViewsCount >= -1) {
                i3 = footerViewsCount;
            }
            this.mListEventListener.b(i3);
        }
        if (this.mFixPagingProblem && !canScrollVertically(1)) {
            stopScroll();
        }
        if (!this.mStopWhenCantScroll || i2 <= 0 || canScrollVertically(i2)) {
            return;
        }
        stopScroll();
    }

    public void invalidateScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e6da2", new Object[]{this});
            return;
        }
        int leadingItemOffset = getLeadingItemOffset();
        if (leadingItemOffset == Integer.MAX_VALUE || leadingItemOffset < (-this.mTriggerScrollDistance)) {
            a aVar = this.mListEventListener;
            if (aVar == null) {
                return;
            }
            aVar.c(leadingItemOffset);
            return;
        }
        a aVar2 = this.mListEventListener;
        if (aVar2 == null) {
            return;
        }
        aVar2.ao_();
    }

    public boolean isScrollDown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4af03de4", new Object[]{this})).booleanValue() : this.mScrollDown;
    }

    public int getScrollSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c076abe", new Object[]{this})).intValue() : this.mScrollSpeed;
    }

    public void getCurrentDisplayedPositions(int i, SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a3592", new Object[]{this, new Integer(i), sparseArrayCompat});
        } else {
            getCurrentDisplayedPositions(0, i, sparseArrayCompat);
        }
    }

    public void getCurrentDisplayedPositions(int i, int i2, SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0acac0f", new Object[]{this, new Integer(i), new Integer(i2), sparseArrayCompat});
            return;
        }
        sparseArrayCompat.clear();
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            int position = layoutManager.getPosition(childAt);
            int headerViewsCount = getHeaderViewsCount();
            if (position >= headerViewsCount && position < layoutManager.getItemCount() - getFooterViewsCount()) {
                int i4 = position - headerViewsCount;
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                float height = childAt.getHeight();
                float f = this.mExposeFactor;
                if (top + (height * f) < i2 && bottom - (height * f) > i) {
                    sparseArrayCompat.put(i4, true);
                }
            }
        }
    }

    public void setExposeFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1dd984", new Object[]{this, new Float(f)});
        } else {
            this.mExposeFactor = f;
        }
    }

    public int findFirstCompletelyVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cd99b4b", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 < i) {
                i = i2;
            }
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return -1;
    }

    public int findFirstPartlyVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85b9a51", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findFirstVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 < i) {
                i = i2;
            }
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return -1;
    }

    public int findCompletelyLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53b95253", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 > i) {
                i = i2;
            }
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return -1;
    }

    public int findPartlyLastVisibleItemPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b60d59", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (spanCount >= this.mTmpArray.length) {
            this.mTmpArray = new int[spanCount];
        }
        staggeredGridLayoutManager.findLastVisibleItemPositions(this.mTmpArray);
        int[] iArr = this.mTmpArray;
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 != -1 && i2 > i) {
                i = i2;
            }
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return -1;
    }

    public int getLeadingItemOffset() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d93189f0", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && (childAt = layoutManager.getChildAt(0)) != null && layoutManager.getPosition(childAt) == 0) {
            return childAt.getTop();
        }
        return Integer.MAX_VALUE;
    }

    public int getBlankHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d17d05f", new Object[]{this})).intValue() : this.mBlankView.getHeight();
    }

    public int getBlankVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eddb65ca", new Object[]{this})).intValue();
        }
        View view = this.mBlankView;
        if (view != null) {
            return view.getVisibility();
        }
        return 8;
    }

    public void setStopWhenCantScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a009a7e", new Object[]{this, new Boolean(z)});
        } else {
            this.mStopWhenCantScroll = z;
        }
    }

    public void setFixPagingProblem(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6c134d", new Object[]{this, new Boolean(z)});
        } else if (this.mFixConfiged) {
        } else {
            this.mFixConfiged = true;
            this.mFixPagingProblem = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = (int) (i2 * this.mFlingFactor);
        if (this.mStopWhenCantScroll && i3 > 0 && !canScrollVertically(i3)) {
            stopScroll();
            return false;
        }
        return super.fling(i, i3);
    }

    public void setFlingFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b115d9b0", new Object[]{this, new Float(f)});
        } else {
            this.mFlingFactor = f;
        }
    }

    public DefaultItemAnimator setDefaultAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultItemAnimator) ipChange.ipc$dispatch("283721c0", new Object[]{this});
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() { // from class: com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 469305220) {
                    super.onMoveFinished((RecyclerView.ViewHolder) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.SimpleItemAnimator
            public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1bf90784", new Object[]{this, viewHolder});
                    return;
                }
                super.onMoveFinished(viewHolder);
                PartnerRecyclerView partnerRecyclerView = PartnerRecyclerView.this;
                partnerRecyclerView.onScrollChanged(partnerRecyclerView.getScrollX(), PartnerRecyclerView.this.getScrollY(), PartnerRecyclerView.this.getScrollX(), PartnerRecyclerView.this.getScrollY());
            }
        };
        setItemAnimator(defaultItemAnimator);
        return defaultItemAnimator;
    }
}
