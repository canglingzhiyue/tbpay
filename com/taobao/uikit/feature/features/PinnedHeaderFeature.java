package com.taobao.uikit.feature.features;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.FocusCallback;
import com.taobao.uikit.feature.callback.InterceptTouchEventCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.view.ViewGroupHelper;
import tb.kge;

/* loaded from: classes9.dex */
public class PinnedHeaderFeature extends AbsFeature<ListView> implements AbsListView.OnScrollListener, CanvasCallback, FocusCallback, InterceptTouchEventCallback, LayoutCallback, MeasureCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_ALPHA = 255;
    private static final String TAG = "PinnedHeaderFeature";
    private SectionAdapter mAdapter;
    private View mHeaderView;
    private int mHeaderViewHeight;
    private int mHeaderViewWidth;
    private int mHeightMeasureSpec;
    private PinnedHeaderAdapterInternal mInternalAdapter;
    private int mWidthMeasureSpec;
    private boolean mHeaderViewVisible = false;
    private boolean mLastHeaderDown = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public interface PinnedHeaderAdapterInternal {
        public static final int PINNED_HEADER_GONE = 0;
        public static final int PINNED_HEADER_PUSHED_UP = 2;
        public static final int PINNED_HEADER_VISIBLE = 1;

        void configurePinnedHeader(View view, int i, int i2);

        int getPinnedHeaderState(int i);
    }

    /* loaded from: classes9.dex */
    public interface SectionAdapter {
        void bindSection(View view, int i);

        int firstSection();

        int getSection(int i);
    }

    static {
        kge.a(909844184);
        kge.a(-418144398);
        kge.a(1233363345);
        kge.a(-980398080);
        kge.a(-396248018);
        kge.a(-1176742740);
        kge.a(1480088762);
    }

    public static /* synthetic */ Object ipc$super(PinnedHeaderFeature pinnedHeaderFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PinnedHeaderFeature) ((View) objArr[0]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void afterOnFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ca48c", new Object[]{this, new Boolean(z), new Integer(i), rect});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void beforeOnFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c46e309", new Object[]{this, new Boolean(z), new Integer(i), rect});
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void beforeOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381b14e7", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void beforeOnWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688ab043", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
        }
    }

    public static /* synthetic */ SectionAdapter access$000(PinnedHeaderFeature pinnedHeaderFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SectionAdapter) ipChange.ipc$dispatch("5f89f41d", new Object[]{pinnedHeaderFeature}) : pinnedHeaderFeature.mAdapter;
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((PinnedHeaderFeature) listView);
        getHost().setFadingEdgeLength(0);
        getHost().setOnScrollListener(this);
    }

    @Override // com.taobao.uikit.feature.callback.InterceptTouchEventCallback
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mHeaderViewVisible) {
            Rect rect = new Rect(0, 0, this.mHeaderViewWidth, this.mHeaderView.getBottom());
            boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            if (contains) {
                z = this.mHeaderView.dispatchTouchEvent(motionEvent);
                getHost().invalidate(rect);
            } else if (this.mLastHeaderDown) {
                this.mHeaderView.dispatchWindowFocusChanged(false);
                this.mHeaderView.setPressed(false);
                getHost().invalidate(rect);
                this.mLastHeaderDown = false;
            }
            if (motionEvent.getAction() == 0) {
                this.mLastHeaderDown = contains;
            }
        }
        return z;
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void afterOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a728ea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mHeaderView == null) {
        } else {
            if (getHost() instanceof ViewGroupHelper) {
                ((ViewGroupHelper) getHost()).measureChild(this.mHeaderView, i, i2, 0);
            }
            this.mWidthMeasureSpec = i;
            this.mHeightMeasureSpec = i2;
            this.mHeaderViewWidth = this.mHeaderView.getMeasuredWidth();
            this.mHeaderViewHeight = this.mHeaderView.getMeasuredHeight();
        }
    }

    public void setPinnedHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c248a1f", new Object[]{this, view});
            return;
        }
        this.mHeaderView = view;
        if (this.mHeaderView == null || getHost() == null) {
            return;
        }
        getHost().setFadingEdgeLength(0);
    }

    public void setSectionAdapter(SectionAdapter sectionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8f8b8c", new Object[]{this, sectionAdapter});
            return;
        }
        this.mAdapter = sectionAdapter;
        if (this.mAdapter == null) {
            return;
        }
        this.mInternalAdapter = new PinnedHeaderAdapterInternal() { // from class: com.taobao.uikit.feature.features.PinnedHeaderFeature.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.feature.features.PinnedHeaderFeature.PinnedHeaderAdapterInternal
            public int getPinnedHeaderState(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("c7debeb9", new Object[]{this, new Integer(i)})).intValue();
                }
                if (i < 0 || i >= PinnedHeaderFeature.this.getHost().getCount() || PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).firstSection() > i) {
                    return 0;
                }
                int i2 = i + 1;
                return (PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).getSection(i2) != i2 || PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).firstSection() == i2) ? 1 : 2;
            }

            @Override // com.taobao.uikit.feature.features.PinnedHeaderFeature.PinnedHeaderAdapterInternal
            public void configurePinnedHeader(View view, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b734660", new Object[]{this, view, new Integer(i), new Integer(i2)});
                } else {
                    PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).bindSection(view, PinnedHeaderFeature.access$000(PinnedHeaderFeature.this).getSection(i));
                }
            }
        };
    }

    private void measureHeadView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718a132a", new Object[]{this});
        } else if (this.mHeaderView == null) {
        } else {
            if (getHost() instanceof ViewGroupHelper) {
                ((ViewGroupHelper) getHost()).measureChild(this.mHeaderView, this.mWidthMeasureSpec, this.mHeightMeasureSpec, 0);
            }
            this.mHeaderViewWidth = this.mHeaderView.getMeasuredWidth();
            this.mHeaderViewHeight = this.mHeaderView.getMeasuredHeight();
        }
    }

    private void configureHeaderView(int i) {
        View childAt;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55595c04", new Object[]{this, new Integer(i)});
            return;
        }
        int headerViewsCount = i + (-1) >= 0 ? i - getHost().getHeaderViewsCount() : 0;
        if (this.mHeaderView == null) {
            return;
        }
        int pinnedHeaderState = this.mInternalAdapter.getPinnedHeaderState(headerViewsCount);
        if (pinnedHeaderState == 0) {
            this.mHeaderViewVisible = false;
            return;
        }
        int i3 = 255;
        if (pinnedHeaderState == 1) {
            this.mInternalAdapter.configurePinnedHeader(this.mHeaderView, headerViewsCount, 255);
            measureHeadView();
            if (this.mHeaderView.getTop() != 0) {
                this.mHeaderView.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
            }
            this.mHeaderViewVisible = true;
        } else if (pinnedHeaderState != 2 || (childAt = getHost().getChildAt(0)) == null) {
        } else {
            int bottom = childAt.getBottom();
            int height = this.mHeaderView.getHeight();
            if (bottom >= height || height <= 0) {
                i2 = 0;
            } else {
                i2 = bottom - height;
                i3 = ((height + i2) * 255) / height;
            }
            this.mInternalAdapter.configurePinnedHeader(this.mHeaderView, headerViewsCount, i3);
            measureHeadView();
            if (this.mHeaderView.getTop() != i2) {
                this.mHeaderView.layout(0, i2, this.mHeaderViewWidth, this.mHeaderViewHeight + i2);
            }
            this.mHeaderViewVisible = true;
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mHeaderView;
        if (view == null) {
            return;
        }
        view.layout(0, 0, this.mHeaderViewWidth, this.mHeaderViewHeight);
        configureHeaderView(getHost().getFirstVisiblePosition());
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        } else if (!this.mHeaderViewVisible || !(getHost() instanceof ViewGroupHelper)) {
        } else {
            ((ViewGroupHelper) getHost()).drawChild(canvas, this.mHeaderView, getHost().getDrawingTime(), 0);
        }
    }

    @Override // com.taobao.uikit.feature.callback.FocusCallback
    public void afterOnWindowFocusChanged(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bbdc86", new Object[]{this, new Boolean(z)});
        } else if (z || (view = this.mHeaderView) == null) {
        } else {
            view.dispatchWindowFocusChanged(false);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mHeaderView == null) {
        } else {
            configureHeaderView(i);
        }
    }
}
