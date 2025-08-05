package com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ebn;
import tb.ebo;
import tb.ebp;
import tb.ebq;
import tb.ebr;
import tb.ebt;
import tb.ebv;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class CommonNavigator extends FrameLayout implements ebp, ebt.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ebr mAdapter;
    private boolean mAdjustMode;
    private Context mContext;
    private int mCurrentPosition;
    private boolean mEnablePivotScroll;
    private boolean mFollowTouch;
    private ebn mIndicatorBackground;
    private LinearLayout mIndicatorContainer;
    private boolean mIndicatorOnTop;
    private int mLastVisiblePostion;
    private int mLeftPadding;
    private ebt mNavigatorHelper;
    private DataSetObserver mObserver;
    private List<ebv> mPositionDataList;
    private boolean mReselectWhenLayout;
    private int mRightPadding;
    private float mScrollPivotX;
    private HorizontalScrollView mScrollView;
    private boolean mSkimOver;
    private boolean mSmoothScroll;
    private LinearLayout mTitleContainer;

    static {
        kge.a(-288677739);
        kge.a(1120256483);
        kge.a(-2068675408);
    }

    public static /* synthetic */ Object ipc$super(CommonNavigator commonNavigator, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ebp
    public void onDetachFromDetailIndicator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e331f89", new Object[]{this});
        }
    }

    public static /* synthetic */ ebr access$000(CommonNavigator commonNavigator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ebr) ipChange.ipc$dispatch("c0938820", new Object[]{commonNavigator}) : commonNavigator.mAdapter;
    }

    public static /* synthetic */ ebt access$100(CommonNavigator commonNavigator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ebt) ipChange.ipc$dispatch("378277d", new Object[]{commonNavigator}) : commonNavigator.mNavigatorHelper;
    }

    public static /* synthetic */ void access$200(CommonNavigator commonNavigator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f5aff3", new Object[]{commonNavigator});
        } else {
            commonNavigator.init();
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.mLastVisiblePostion = 0;
        this.mScrollPivotX = 0.5f;
        this.mSmoothScroll = true;
        this.mFollowTouch = true;
        this.mReselectWhenLayout = true;
        this.mPositionDataList = new ArrayList();
        this.mObserver = new DataSetObserver() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.CommonNavigator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61d25eb1", new Object[]{this});
                }
            }

            @Override // android.database.DataSetObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                CommonNavigator.access$100(CommonNavigator.this).c(CommonNavigator.access$000(CommonNavigator.this).a());
                CommonNavigator.access$200(CommonNavigator.this);
            }
        };
        this.mContext = context;
        this.mNavigatorHelper = new ebt();
        this.mNavigatorHelper.a(this);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.CommonNavigator");
    }

    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
            return;
        }
        ebr ebrVar = this.mAdapter;
        if (ebrVar == null) {
            return;
        }
        ebrVar.b();
    }

    public void setAdapter(ebr ebrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e56816f", new Object[]{this, ebrVar});
            return;
        }
        ebr ebrVar2 = this.mAdapter;
        if (ebrVar2 == ebrVar) {
            return;
        }
        if (ebrVar2 != null) {
            ebrVar2.b(this.mObserver);
        }
        this.mAdapter = ebrVar;
        ebr ebrVar3 = this.mAdapter;
        if (ebrVar3 != null) {
            ebrVar3.a(this.mObserver);
            this.mNavigatorHelper.c(this.mAdapter.a());
            if (this.mTitleContainer == null) {
                return;
            }
            this.mAdapter.b();
            return;
        }
        this.mNavigatorHelper.c(0);
        init();
    }

    private void init() {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        removeAllViews();
        if (this.mAdjustMode) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.x_detail_indicator_bar_navigator_layout_no_scroll, this);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.x_detail_indicator_bar_navigator_layout, this);
        }
        this.mScrollView = (HorizontalScrollView) inflate.findViewById(R.id.scroll_view);
        this.mTitleContainer = (LinearLayout) inflate.findViewById(R.id.title_container);
        this.mTitleContainer.setPadding(this.mLeftPadding, 0, this.mRightPadding, 0);
        this.mIndicatorContainer = (LinearLayout) inflate.findViewById(R.id.indicator_container);
        if (this.mIndicatorOnTop) {
            this.mIndicatorContainer.getParent().bringChildToFront(this.mIndicatorContainer);
        }
        initTitlesAndIndicator();
    }

    private void initTitlesAndIndicator() {
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94af0aea", new Object[]{this});
            return;
        }
        int a2 = this.mNavigatorHelper.a();
        for (int i = 0; i < a2; i++) {
            ebq a3 = this.mAdapter.a(getContext(), i);
            if (a3 instanceof View) {
                View view = (View) a3;
                if (this.mAdjustMode) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.mAdapter.b(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                view.invalidate();
                this.mTitleContainer.addView(view, layoutParams);
            }
        }
        ebr ebrVar = this.mAdapter;
        if (ebrVar != null) {
            this.mIndicatorBackground = ebrVar.a(getContext());
            if (this.mIndicatorBackground instanceof View) {
                this.mIndicatorContainer.addView((View) this.mIndicatorBackground, new FrameLayout.LayoutParams(-1, -1));
            }
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mAdapter == null) {
            return;
        }
        preparePositionData();
        ebn ebnVar = this.mIndicatorBackground;
        if (ebnVar != null) {
            ebnVar.onPositionDataProvide(this.mPositionDataList);
        }
        if (!this.mReselectWhenLayout || this.mNavigatorHelper.c() != 0) {
            return;
        }
        onPageSelected(this.mNavigatorHelper.b());
        onPageScrolled(this.mNavigatorHelper.b(), 0.0f, 0);
    }

    private void preparePositionData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ffb6a1", new Object[]{this});
            return;
        }
        this.mPositionDataList.clear();
        int a2 = this.mNavigatorHelper.a();
        for (int i = 0; i < a2; i++) {
            ebv ebvVar = new ebv();
            View childAt = this.mTitleContainer.getChildAt(i);
            if (childAt != null) {
                ebvVar.f27179a = childAt.getLeft();
                ebvVar.b = childAt.getTop();
                ebvVar.c = childAt.getRight();
                ebvVar.d = childAt.getBottom();
                if (childAt instanceof ebo) {
                    ebo eboVar = (ebo) childAt;
                    ebvVar.e = eboVar.getContentLeft();
                    ebvVar.f = eboVar.getContentTop();
                    ebvVar.g = eboVar.getContentRight();
                    ebvVar.h = eboVar.getContentBottom();
                } else {
                    ebvVar.e = ebvVar.f27179a;
                    ebvVar.f = ebvVar.b;
                    ebvVar.g = ebvVar.c;
                    ebvVar.h = ebvVar.d;
                }
            }
            this.mPositionDataList.add(ebvVar);
        }
    }

    @Override // tb.ebp
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.mAdapter == null) {
        } else {
            this.mNavigatorHelper.a(i, f, i2);
            ebn ebnVar = this.mIndicatorBackground;
            if (ebnVar != null) {
                ebnVar.onPageScrolled(i, f, i2);
            }
            if (this.mScrollView == null || this.mPositionDataList.size() <= 0 || i < 0 || i >= this.mPositionDataList.size() || !this.mFollowTouch) {
                return;
            }
            int min = Math.min(this.mPositionDataList.size() - 1, i);
            int min2 = Math.min(this.mPositionDataList.size() - 1, i + 1);
            float b = this.mPositionDataList.get(min).b() - (this.mScrollView.getWidth() * this.mScrollPivotX);
            this.mScrollView.scrollTo((int) (b + (((this.mPositionDataList.get(min2).b() - (this.mScrollView.getWidth() * this.mScrollPivotX)) - b) * f)), 0);
        }
    }

    @Override // tb.ebp
    public void onPageScrolled(int i, int i2, float f, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
        } else if (this.mAdapter == null) {
        } else {
            this.mNavigatorHelper.a(i, i2, f, i3, this.mPositionDataList);
            ebn ebnVar = this.mIndicatorBackground;
            if (ebnVar != null) {
                ebnVar.onPageScrolled(i, i2, f, i3);
            }
            if (this.mScrollView == null || this.mPositionDataList.size() <= 0 || i < 0 || i >= this.mPositionDataList.size() || !this.mFollowTouch) {
                return;
            }
            int min = Math.min(this.mPositionDataList.size() - 1, i);
            int min2 = Math.min(this.mPositionDataList.size() - 1, i + 1);
            float b = this.mPositionDataList.get(min).b() - (this.mScrollView.getWidth() * this.mScrollPivotX);
            this.mScrollView.scrollTo((int) (b + (((this.mPositionDataList.get(min2).b() - (this.mScrollView.getWidth() * this.mScrollPivotX)) - b) * f)), 0);
        }
    }

    @Override // tb.ebp
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (this.mAdapter == null) {
        } else {
            this.mNavigatorHelper.a(i);
            ebn ebnVar = this.mIndicatorBackground;
            if (ebnVar != null) {
                ebnVar.onPageSelected(i);
            }
            int i2 = this.mCurrentPosition;
            if (i2 >= 0 && i2 < this.mNavigatorHelper.a()) {
                this.mLastVisiblePostion = this.mCurrentPosition;
            }
            this.mCurrentPosition = i;
        }
    }

    @Override // tb.ebp
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        } else if (this.mAdapter == null) {
        } else {
            this.mNavigatorHelper.b(i);
            ebn ebnVar = this.mIndicatorBackground;
            if (ebnVar == null) {
                return;
            }
            ebnVar.onPageScrollStateChanged(i);
        }
    }

    @Override // tb.ebp
    public void onAttachToDetailIndicator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87831526", new Object[]{this});
        } else {
            init();
        }
    }

    @Override // tb.ebt.a
    public void onEnter(int i, int i2, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95087b4", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mTitleContainer;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (!(childAt instanceof ebq)) {
            return;
        }
        ((ebq) childAt).onEnter(i, i2, f, z);
    }

    @Override // tb.ebt.a
    public void onLeave(int i, int i2, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce148093", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mTitleContainer;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (!(childAt instanceof ebq)) {
            return;
        }
        ((ebq) childAt).onLeave(i, i2, f, z);
    }

    @Override // tb.ebt.a
    public void onSelected(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a50d941", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        LinearLayout linearLayout = this.mTitleContainer;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (childAt instanceof ebq) {
            ((ebq) childAt).onSelected(i, i2);
        }
        if (this.mAdjustMode || this.mFollowTouch || this.mScrollView == null || this.mPositionDataList.size() <= 0) {
            return;
        }
        ebv ebvVar = this.mPositionDataList.get(Math.min(this.mPositionDataList.size() - 1, i));
        if (this.mEnablePivotScroll) {
            float b = ebvVar.b() - (this.mScrollView.getWidth() * this.mScrollPivotX);
            if (this.mSmoothScroll) {
                this.mScrollView.smoothScrollTo((int) b, 0);
            } else {
                this.mScrollView.scrollTo((int) b, 0);
            }
        } else if (this.mScrollView.getScrollX() > ebvVar.f27179a) {
            if (this.mSmoothScroll) {
                this.mScrollView.smoothScrollTo(ebvVar.f27179a, 0);
            } else {
                this.mScrollView.scrollTo(ebvVar.f27179a, 0);
            }
        } else if (this.mScrollView.getScrollX() + getWidth() >= ebvVar.c) {
        } else {
            if (this.mSmoothScroll) {
                this.mScrollView.smoothScrollTo(ebvVar.c - getWidth(), 0);
            } else {
                this.mScrollView.scrollTo(ebvVar.c - getWidth(), 0);
            }
        }
    }

    @Override // tb.ebt.a
    public void onDeselected(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e117c42", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        LinearLayout linearLayout = this.mTitleContainer;
        if (linearLayout == null) {
            return;
        }
        View childAt = linearLayout.getChildAt(i);
        if (!(childAt instanceof ebq)) {
            return;
        }
        ((ebq) childAt).onDeselected(i, i2);
    }

    public void setSkimOver(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8472f7b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mSkimOver = z;
        this.mNavigatorHelper.a(z);
    }

    @Override // tb.ebp
    public void setCurrentPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            onPageSelected(i);
        } else {
            onPageSelected(0);
        }
    }

    public int getCurrentPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue() : this.mCurrentPosition;
    }

    @Override // tb.ebp
    public void setNoItemSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0fa99c", new Object[]{this, new Boolean(z)});
        } else if (this.mContext == null || !z) {
        } else {
            setCurrentPosition(this.mPositionDataList.size());
        }
    }

    public int getLastPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("73467e4f", new Object[]{this})).intValue() : this.mLastVisiblePostion;
    }

    @Override // tb.ebp
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContext = null;
        this.mIndicatorBackground = null;
        this.mAdapter = null;
        this.mNavigatorHelper = null;
    }
}
