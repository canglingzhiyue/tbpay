package com.taobao.uikit.feature.features;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class BinaryPageFeature extends AbsFeature<ListView> implements AbsListView.OnScrollListener, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_PERCENT = "Home.PagerDivider.ACTION_PERCENT";
    public static final String EXTRA_HALF = "EXTRA_HALF";
    public static final String EXTRA_PERCENT = "EXTRA_PERCENT";
    public static final String EXTRA_TOUCH = "EXTRA_TOUCH";
    private int mFirstPageBottomOffset;
    private OnPageChangedListener mOnPageChangedListener;
    private int mPagePosition;
    private int mScrollState;
    private TouchOffset mTouchOffset;
    private Page mTouchPage = Page.NONE;
    private PageState mPageState = PageState.Wait;
    private int mAnimationDuration = 600;

    /* loaded from: classes9.dex */
    public interface OnPageChangedListener {
        void onPageSelected(BinaryPageFeature binaryPageFeature, Page page);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public enum Page {
        NONE(-1, "分界处"),
        FIRST(0, "第一页"),
        LAST(1, "第二页");
        
        private final String desc;
        private final int value;

        Page(int i, String str) {
            this.value = i;
            this.desc = str;
        }

        public String getDesc() {
            return this.desc;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes9.dex */
    public enum PageState {
        Wait(0, "待调整"),
        Asjusting(1, "调整中"),
        Complete(2, "系统完成");
        
        private final String desc;
        private final int value;

        PageState(int i, String str) {
            this.value = i;
            this.desc = str;
        }

        public String getDesc() {
            return this.desc;
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        kge.a(1916566669);
        kge.a(1480088762);
        kge.a(1440744945);
    }

    public static /* synthetic */ Object ipc$super(BinaryPageFeature binaryPageFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((BinaryPageFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void sendLocalBroadcastManager(float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6829df7e", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    public static /* synthetic */ int access$000(BinaryPageFeature binaryPageFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e565270", new Object[]{binaryPageFeature})).intValue() : binaryPageFeature.mPagePosition;
    }

    public static /* synthetic */ PageState access$100(BinaryPageFeature binaryPageFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageState) ipChange.ipc$dispatch("cd71a822", new Object[]{binaryPageFeature}) : binaryPageFeature.mPageState;
    }

    public static /* synthetic */ PageState access$102(BinaryPageFeature binaryPageFeature, PageState pageState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageState) ipChange.ipc$dispatch("eb71a542", new Object[]{binaryPageFeature, pageState});
        }
        binaryPageFeature.mPageState = pageState;
        return pageState;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mTouchOffset = new TouchOffset();
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((BinaryPageFeature) listView);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            ((ListView) this.mHost).setOnScrollListener(this);
        }
    }

    public void setPagePosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17f7942", new Object[]{this, new Integer(i)});
        } else {
            this.mPagePosition = i;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        this.mScrollState = i;
        computeScroll();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            computeScroll();
        }
    }

    private boolean onTouch(View view, MotionEvent motionEvent) {
        Page page;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (view == this.mHost && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2)) {
            this.mPageState = PageState.Wait;
            int lastVisiblePosition = ((ListView) this.mHost).getLastVisiblePosition();
            int firstVisiblePosition = ((ListView) this.mHost).getFirstVisiblePosition();
            int i = this.mPagePosition;
            if (i < firstVisiblePosition || i >= lastVisiblePosition) {
                this.mTouchOffset.reset();
            } else {
                View childAt = ((ListView) this.mHost).getChildAt(i - firstVisiblePosition);
                if (!this.mTouchOffset.isRecord()) {
                    Page page2 = Page.NONE;
                    if (childAt.getTop() / ((ListView) this.mHost).getHeight() > (1.0f - ((childAt.getHeight() + this.mFirstPageBottomOffset) / ((ListView) this.mHost).getHeight())) / 2.0f) {
                        page = Page.FIRST;
                    } else {
                        page = Page.LAST;
                    }
                    this.mTouchOffset.startRecord(motionEvent.getRawY(), page);
                    return false;
                }
                this.mTouchOffset.setEndY(motionEvent.getRawY());
                scrollLikePullToFresh(childAt, true);
            }
        }
        return false;
    }

    private void computeScroll() {
        OnPageChangedListener onPageChangedListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mPageState == PageState.Asjusting) {
        } else {
            int lastVisiblePosition = ((ListView) this.mHost).getLastVisiblePosition();
            int firstVisiblePosition = ((ListView) this.mHost).getFirstVisiblePosition();
            if (this.mScrollState == 1) {
                int i = this.mPagePosition;
                if (i > lastVisiblePosition) {
                    this.mTouchPage = Page.FIRST;
                } else if (i < firstVisiblePosition) {
                    this.mTouchPage = Page.LAST;
                } else {
                    this.mTouchPage = Page.NONE;
                }
                this.mPageState = PageState.Wait;
                return;
            }
            int i2 = this.mPagePosition;
            if (i2 < firstVisiblePosition || i2 >= lastVisiblePosition || this.mPageState != PageState.Wait) {
                return;
            }
            this.mPageState = PageState.Asjusting;
            MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 4, 0.0f, 0.0f, 0);
            ((ListView) this.mHost).dispatchTouchEvent(obtain);
            ((ListView) this.mHost).onTouchEvent(obtain);
            View childAt = ((ListView) this.mHost).getChildAt(this.mPagePosition - firstVisiblePosition);
            if (this.mTouchPage == Page.NONE) {
                if (this.mTouchOffset.getCurrentPage() != this.mTouchOffset.getStartPage() && (onPageChangedListener = this.mOnPageChangedListener) != null) {
                    onPageChangedListener.onPageSelected(this, this.mTouchOffset.getCurrentPage());
                }
                if (this.mTouchOffset.getCurrentPage() == Page.FIRST && this.mTouchOffset.getStartPage() == Page.FIRST && this.mTouchOffset.getOffset() > 0.0f) {
                    return;
                }
                scrollLikePullToFresh(childAt, false);
            } else if (this.mTouchPage == Page.FIRST) {
                scrollToFirstPageBottom(childAt);
                this.mTouchPage = Page.NONE;
            } else if (this.mTouchPage == Page.LAST) {
                scrollToLastPageTop(childAt);
                this.mTouchPage = Page.NONE;
            }
            this.mTouchOffset.reset();
            obtain.recycle();
        }
    }

    private void scrollLikePullToFresh(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c158413", new Object[]{this, view, new Boolean(z)});
        } else if (this.mTouchOffset.getOffset() == 0.0f) {
        } else {
            if (this.mTouchOffset.getCurrentPage() == Page.FIRST) {
                if (z) {
                    sendLocalBroadcastManager(1.0f, 0.5f, true);
                    return;
                }
                sendLocalBroadcastManager(1.0f, 0.5f, false);
                scrollToFirstPageBottom(view);
            } else if (this.mTouchOffset.getCurrentPage() != Page.LAST) {
            } else {
                if (z) {
                    sendLocalBroadcastManager(0.1f, 0.5f, true);
                    return;
                }
                scrollToLastPageTop(view);
                sendLocalBroadcastManager(0.1f, 0.5f, false);
            }
        }
    }

    private void scrollToLastPageTop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc878263", new Object[]{this, view});
            return;
        }
        final int bottom = (int) ((view.getBottom() * this.mAnimationDuration) / ((ListView) this.mHost).getHeight());
        ((ListView) this.mHost).post(new Runnable() { // from class: com.taobao.uikit.feature.features.BinaryPageFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (Build.VERSION.SDK_INT >= 11) {
                    ((ListView) BinaryPageFeature.this.mHost).smoothScrollToPositionFromTop(BinaryPageFeature.access$000(BinaryPageFeature.this) + 1, 0, bottom);
                    ((ListView) BinaryPageFeature.this.mHost).postDelayed(new Runnable() { // from class: com.taobao.uikit.feature.features.BinaryPageFeature.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (BinaryPageFeature.access$100(BinaryPageFeature.this) != PageState.Asjusting) {
                            } else {
                                BinaryPageFeature.access$102(BinaryPageFeature.this, PageState.Complete);
                            }
                        }
                    }, bottom);
                } else {
                    ((ListView) BinaryPageFeature.this.mHost).setSelectionFromTop(BinaryPageFeature.access$000(BinaryPageFeature.this) + 1, 0);
                    if (BinaryPageFeature.access$100(BinaryPageFeature.this) != PageState.Asjusting) {
                        return;
                    }
                    BinaryPageFeature.access$102(BinaryPageFeature.this, PageState.Complete);
                }
            }
        });
    }

    private void scrollToFirstPageBottom(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950d589", new Object[]{this, view});
            return;
        }
        float bottom = view.getBottom() + this.mFirstPageBottomOffset;
        if (bottom == view.getHeight()) {
            return;
        }
        final int abs = (int) ((Math.abs(bottom - ((ListView) this.mHost).getHeight()) * this.mAnimationDuration) / ((ListView) this.mHost).getHeight());
        final int height = (((ListView) this.mHost).getHeight() - view.getHeight()) - this.mFirstPageBottomOffset;
        ((ListView) this.mHost).post(new Runnable() { // from class: com.taobao.uikit.feature.features.BinaryPageFeature.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (Build.VERSION.SDK_INT >= 11) {
                    ((ListView) BinaryPageFeature.this.mHost).smoothScrollToPositionFromTop(BinaryPageFeature.access$000(BinaryPageFeature.this), height, abs);
                    ((ListView) BinaryPageFeature.this.mHost).postDelayed(new Runnable() { // from class: com.taobao.uikit.feature.features.BinaryPageFeature.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (BinaryPageFeature.access$100(BinaryPageFeature.this) != PageState.Asjusting) {
                            } else {
                                BinaryPageFeature.access$102(BinaryPageFeature.this, PageState.Complete);
                            }
                        }
                    }, abs);
                } else {
                    ((ListView) BinaryPageFeature.this.mHost).setSelectionFromTop(BinaryPageFeature.access$000(BinaryPageFeature.this), height);
                    if (BinaryPageFeature.access$100(BinaryPageFeature.this) != PageState.Asjusting) {
                        return;
                    }
                    BinaryPageFeature.access$102(BinaryPageFeature.this, PageState.Complete);
                }
            }
        });
    }

    public void setFirstPageBottomOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2dcde1", new Object[]{this, new Integer(i)});
        } else {
            this.mFirstPageBottomOffset = i;
        }
    }

    public void setAnimationDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57128c26", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimationDuration = i;
        }
    }

    public void setTouchOffsetLimit(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a1744e", new Object[]{this, new Float(f)});
        } else {
            this.mTouchOffset.setOffsetLimit(f);
        }
    }

    public void setOnPageChangedListener(OnPageChangedListener onPageChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a396bf", new Object[]{this, onPageChangedListener});
        } else {
            this.mOnPageChangedListener = onPageChangedListener;
        }
    }

    /* loaded from: classes9.dex */
    public class TouchOffset {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float endY;
        private float startY;
        private boolean record = false;
        private Page startPage = Page.NONE;
        private float offsetLimit = 160.0f;

        static {
            kge.a(-1561690373);
        }

        public TouchOffset() {
        }

        public void startRecord(float f, Page page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e3556ef", new Object[]{this, new Float(f), page});
                return;
            }
            this.record = true;
            this.startY = f;
            this.startPage = page;
        }

        public void setEndY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1ec2db9", new Object[]{this, new Float(f)});
            } else {
                this.endY = f;
            }
        }

        public Page getStartPage() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Page) ipChange.ipc$dispatch("d4195d3d", new Object[]{this}) : this.startPage;
        }

        public Page getCurrentPage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Page) ipChange.ipc$dispatch("c1d3d986", new Object[]{this});
            }
            float offset = getOffset();
            float abs = Math.abs(offset);
            float f = this.offsetLimit;
            if (abs <= f) {
                return this.startPage;
            }
            if (offset > f) {
                return Page.FIRST;
            }
            return Page.LAST;
        }

        public boolean isUpDown() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dc42cb2", new Object[]{this})).booleanValue() : getOffset() < 0.0f;
        }

        public boolean isUp() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f613bf70", new Object[]{this})).booleanValue() : getOffset() < 0.0f;
        }

        public boolean isDown() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25b52f77", new Object[]{this})).booleanValue() : getOffset() >= 0.0f;
        }

        public float getOffset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c7531f80", new Object[]{this})).floatValue();
            }
            if (!this.record) {
                return 0.0f;
            }
            return this.endY - this.startY;
        }

        public float getOffsetLimit() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4bf7d29", new Object[]{this})).floatValue() : this.offsetLimit;
        }

        public void setOffsetLimit(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("972d26b3", new Object[]{this, new Float(f)});
            } else {
                this.offsetLimit = f;
            }
        }

        public boolean isRecord() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad265d26", new Object[]{this})).booleanValue() : this.record;
        }

        public void setRecord(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbed17ba", new Object[]{this, new Boolean(z)});
            } else {
                this.record = z;
            }
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.record = false;
            this.startPage = Page.NONE;
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
        } else {
            onTouch(this.mHost, motionEvent);
        }
    }
}
