package com.taobao.uikit.feature.features;

import android.content.Context;
import android.graphics.Canvas;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.view.TListView;
import tb.kge;

/* loaded from: classes9.dex */
public class PageNumberFeature extends AbsFeature<ListView> implements AbsListView.OnScrollListener, CanvasCallback, LayoutCallback, MeasureCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PAGETIP_MARGIN_BOTTOM = 20;
    private static final int PAGETIP_MARGIN_RIGHT = 25;
    public static final int SHOW_ALWAYS = 100;
    public static final int SHOW_NONE = 102;
    public static final int SHOW_SCROLLING = 101;
    private int mCurrentPage;
    private int mLastVisibleItemIndex;
    private int mPageSize;
    private PageTip mPageTip;
    private int mScrollState = 0;
    private int mShowType = 101;
    private int mTotalCount;

    static {
        kge.a(676563717);
        kge.a(1480088762);
        kge.a(-418144398);
        kge.a(-980398080);
        kge.a(-396248018);
    }

    public static /* synthetic */ Object ipc$super(PageNumberFeature pageNumberFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((PageNumberFeature) ((View) objArr[0]));
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

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public static /* synthetic */ int access$002(PageNumberFeature pageNumberFeature, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c5b1c13", new Object[]{pageNumberFeature, new Integer(i)})).intValue();
        }
        pageNumberFeature.mCurrentPage = i;
        return i;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPageTip = new PageTip(getHost().getContext());
        getHost().setOnScrollListener(this);
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ListView listView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f215e22", new Object[]{this, listView});
            return;
        }
        super.setHost((PageNumberFeature) listView);
        init();
    }

    public int getPageSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2822d620", new Object[]{this})).intValue() : this.mPageSize;
    }

    public void setShowType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bd8a3", new Object[]{this, new Integer(i)});
        } else {
            this.mShowType = i;
        }
    }

    public void setPageSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0ec8ea", new Object[]{this, new Integer(i)});
        } else {
            this.mPageSize = i;
        }
    }

    public int getCurrentPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue() : this.mCurrentPage;
    }

    public void setTotalCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
        } else {
            this.mTotalCount = i;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
        } else {
            this.mScrollState = i;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.mLastVisibleItemIndex == getHost().getLastVisiblePosition()) {
        } else {
            this.mLastVisibleItemIndex = getHost().getLastVisiblePosition();
            this.mPageTip.updatePageIndex(this.mLastVisibleItemIndex - getHost().getHeaderViewsCount(), this.mPageSize, this.mTotalCount, i);
        }
    }

    @Override // com.taobao.uikit.feature.callback.MeasureCallback
    public void afterOnMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a728ea", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            ((TListView) getHost()).measureChild(this.mPageTip, i, i2, 0);
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.mPageTip.layout((getHost().getWidth() - this.mPageTip.getMeasuredWidth()) - this.mPageTip.mMarginRight, (getHost().getHeight() - this.mPageTip.getMeasuredHeight()) - this.mPageTip.mMarginBottom, getHost().getWidth() - this.mPageTip.mMarginRight, getHost().getHeight() - this.mPageTip.mMarginBottom);
        }
    }

    private boolean showPageTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb182da", new Object[]{this})).booleanValue();
        }
        int i = this.mShowType;
        return i == 101 ? this.mScrollState != 0 : i == 100;
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        } else if (!showPageTip()) {
        } else {
            ((TListView) getHost()).drawChild(canvas, this.mPageTip, getHost().getDrawingTime(), 0);
        }
    }

    /* loaded from: classes9.dex */
    public class PageTip extends TextView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mMarginBottom;
        public int mMarginRight;

        static {
            kge.a(32261325);
        }

        public PageTip(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            init();
        }

        public PageTip(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            init();
        }

        public PageTip(Context context) {
            super(context);
            init();
        }

        private void init() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[]{this});
                return;
            }
            int i = (int) (getContext().getResources().getDisplayMetrics().density * 5.0f);
            setPadding(i, 0, i, 0);
            setTextSize(17.0f);
            setBackgroundColor(-7829368);
            setGravity(17);
            setText("0/0");
            setTextColor(-1);
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            new DisplayMetrics();
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            this.mMarginRight = (int) (displayMetrics.density * 25.0f);
            this.mMarginBottom = (int) (displayMetrics.density * 20.0f);
        }

        public void updatePageIndex(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee618881", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (i2 == 0) {
            } else {
                int i5 = i4 == 0 ? 1 : (i / i2) + 1;
                int i6 = ((i3 + i2) - 1) / i2;
                if (i5 > i6) {
                    i5 = i6;
                }
                String format = i3 > 0 ? String.format("%s/%s", Integer.valueOf(i5), Integer.valueOf(i6)) : String.format("%s", Integer.valueOf(i5));
                PageNumberFeature.access$002(PageNumberFeature.this, i5);
                if (StringUtils.equals(getText(), format)) {
                    return;
                }
                setText(format);
                measure(0, 0);
                layout(getRight() - getMeasuredWidth(), getBottom() - getMeasuredHeight(), getRight(), getBottom());
            }
        }
    }
}
