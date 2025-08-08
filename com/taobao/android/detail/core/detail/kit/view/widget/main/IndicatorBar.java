package com.taobao.android.detail.core.detail.kit.view.widget.main;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.CommonNavigator;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.indicator_backgrounds.LineIndicatorBackground;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.title_views.ClipableTitleView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ebn;
import tb.ebp;
import tb.ebq;
import tb.ebr;
import tb.ebu;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes4.dex */
public class IndicatorBar extends RelativeLayout implements DetailIndicator.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_END_COLOR = -43776;
    public static final int DEFAULT_EXTRA_BTN_SELECTED_COLOR = -1;
    public static final int DEFAULT_EXTRA_BTN_UNSELECTED_COLOR = -16777216;
    public static final int DEFAULT_INDICATOR_HEIGHT_DIP = 24;
    public static final int DEFAULT_INDICATOR_ROUND_RADIUS_DIP = 13;
    public static final int DEFAULT_NORMAL_CLIP_TEXT_COLOR = -1;
    public static final int DEFAULT_NORMAL_TEXT_COLOR = -13421773;
    public static final int DEFAULT_START_COLOR = -26368;
    public static final int DEFAULT_TEXT_SIZE_DIP = 10;
    public static final int MSG_TYPE_MOVE = 10086;
    private static final String TAG;
    private int extraButtonSelectedColor;
    private int extraButtonUnselectedColor;
    private boolean hasLeftInit;
    private boolean hasRightInit;
    private boolean isRightVideoSelected;
    private boolean isScrolling;
    public List<ItemNode.VideoItem.AnchorInfo> mAnchors;
    private List<String> mClipTextList;
    private a mCommonNavigatorAdapter;
    private View mContainer;
    private Context mContext;
    private int mCurrentPicIndex;
    private DetailIndicator mDetailIndicator;
    private int mEndColor;
    private Button mExtraButton;
    private LinearLayout mGalleryLeftContainer;
    private LinearLayout mGalleryRightContainer;
    private boolean mHasInitialized;
    private Typeface mIconFont;
    private int mIndicatorBarBottomMargin;
    private b mIndicatorBarClickListener;
    private LinearLayout mIndicatorContainer;
    private int mIndicatorHeight;
    private boolean mIsExtraButtonSelected;
    private boolean mIsPopupMode;
    private ebp mNavigator;
    private TextView mPicDesText;
    private TextView mPicIndexText;
    private TextView mPicIndexTextBelow;
    private int mStartColor;
    private List<String> mTextList;
    private int mTextSize;
    private int mTitleViewClipTextColor;
    private int mTitleViewTextColor;
    private int mTotalPicNum;
    private View tmpContainer;

    /* loaded from: classes4.dex */
    public interface b {
        int a(int i, int i2);

        void a();

        void a(Button button, boolean z);
    }

    public static /* synthetic */ Object ipc$super(IndicatorBar indicatorBar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator.a
    public void onDetailIndicatorPageScrolled(int i, int i2, float f, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7ed504", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
        }
    }

    public static /* synthetic */ b access$000(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e9873e0f", new Object[]{indicatorBar}) : indicatorBar.mIndicatorBarClickListener;
    }

    public static /* synthetic */ boolean access$100(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7caaad86", new Object[]{indicatorBar})).booleanValue() : indicatorBar.isScrolling;
    }

    public static /* synthetic */ boolean access$1000(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1d82b758", new Object[]{indicatorBar})).booleanValue() : indicatorBar.mIsPopupMode;
    }

    public static /* synthetic */ boolean access$102(IndicatorBar indicatorBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26fd7a18", new Object[]{indicatorBar, new Boolean(z)})).booleanValue();
        }
        indicatorBar.isScrolling = z;
        return z;
    }

    public static /* synthetic */ TextView access$1100(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("80d71ca7", new Object[]{indicatorBar}) : indicatorBar.mPicIndexTextBelow;
    }

    public static /* synthetic */ DetailIndicator access$1200(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailIndicator) ipChange.ipc$dispatch("af818189", new Object[]{indicatorBar}) : indicatorBar.mDetailIndicator;
    }

    public static /* synthetic */ void access$1300(IndicatorBar indicatorBar, int i, int i2, DetailIndicator detailIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf4bf96", new Object[]{indicatorBar, new Integer(i), new Integer(i2), detailIndicator});
        } else {
            indicatorBar.computeScroll(i, i2, detailIndicator);
        }
    }

    public static /* synthetic */ void access$1400(IndicatorBar indicatorBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ba3e04", new Object[]{indicatorBar, new Boolean(z)});
        } else {
            indicatorBar.changeExtraButtonStyle(z);
        }
    }

    public static /* synthetic */ Context access$1500(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cd78b6a7", new Object[]{indicatorBar}) : indicatorBar.mContext;
    }

    public static /* synthetic */ int access$1600(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("51371a81", new Object[]{indicatorBar})).intValue() : indicatorBar.mIndicatorHeight;
    }

    public static /* synthetic */ int access$1700(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2f2a8060", new Object[]{indicatorBar})).intValue() : indicatorBar.mStartColor;
    }

    public static /* synthetic */ int access$1800(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1de63f", new Object[]{indicatorBar})).intValue() : indicatorBar.mEndColor;
    }

    public static /* synthetic */ boolean access$200(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a9e1365", new Object[]{indicatorBar})).booleanValue() : indicatorBar.mIsExtraButtonSelected;
    }

    public static /* synthetic */ boolean access$202(IndicatorBar indicatorBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("776d019", new Object[]{indicatorBar, new Boolean(z)})).booleanValue();
        }
        indicatorBar.mIsExtraButtonSelected = z;
        return z;
    }

    public static /* synthetic */ void access$300(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38917940", new Object[]{indicatorBar});
        } else {
            indicatorBar.reverseExtraButtonSelected();
        }
    }

    public static /* synthetic */ Button access$400(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("15ef5b53", new Object[]{indicatorBar}) : indicatorBar.mExtraButton;
    }

    public static /* synthetic */ void access$500(IndicatorBar indicatorBar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1caa714", new Object[]{indicatorBar, view});
        } else {
            indicatorBar.extraButtonClickCallBack(view);
        }
    }

    public static /* synthetic */ List access$600(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("82fd71ca", new Object[]{indicatorBar}) : indicatorBar.mTextList;
    }

    public static /* synthetic */ List access$700(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ab43b20b", new Object[]{indicatorBar}) : indicatorBar.mClipTextList;
    }

    public static /* synthetic */ Typeface access$800(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("a4975ad1", new Object[]{indicatorBar}) : indicatorBar.mIconFont;
    }

    public static /* synthetic */ int access$900(IndicatorBar indicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c45dc6d", new Object[]{indicatorBar})).intValue() : indicatorBar.mTextSize;
    }

    static {
        kge.a(1891804199);
        kge.a(-1148150875);
        TAG = IndicatorBar.class.getSimpleName();
    }

    public IndicatorBar(Context context) {
        super(context);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mTitleViewClipTextColor = -1;
        this.mStartColor = -26368;
        this.mEndColor = DEFAULT_END_COLOR;
        this.mIndicatorBarBottomMargin = 0;
        this.mIsExtraButtonSelected = false;
        this.isRightVideoSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = -16777216;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.mContext = context;
        initCommon();
    }

    public IndicatorBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mTitleViewClipTextColor = -1;
        this.mStartColor = -26368;
        this.mEndColor = DEFAULT_END_COLOR;
        this.mIndicatorBarBottomMargin = 0;
        this.mIsExtraButtonSelected = false;
        this.isRightVideoSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = -16777216;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.mContext = context;
        initCommon();
    }

    public IndicatorBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mTitleViewClipTextColor = -1;
        this.mStartColor = -26368;
        this.mEndColor = DEFAULT_END_COLOR;
        this.mIndicatorBarBottomMargin = 0;
        this.mIsExtraButtonSelected = false;
        this.isRightVideoSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = -16777216;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.mContext = context;
        initCommon();
    }

    public IndicatorBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewTextColor = DEFAULT_NORMAL_TEXT_COLOR;
        this.mTitleViewClipTextColor = -1;
        this.mStartColor = -26368;
        this.mEndColor = DEFAULT_END_COLOR;
        this.mIndicatorBarBottomMargin = 0;
        this.mIsExtraButtonSelected = false;
        this.isRightVideoSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = -16777216;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.mContext = context;
        initCommon();
    }

    private void initCommon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d1bee22", new Object[]{this});
            return;
        }
        initData();
        this.tmpContainer = LayoutInflater.from(this.mContext).inflate(R.layout.x_detail_indicator_bar_container, (ViewGroup) this, false);
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar");
    }

    public void setCurrentPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
            return;
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null || this.isScrolling) {
            return;
        }
        computeScroll(detailIndicator.getCurrentPosition(), i, this.mDetailIndicator);
    }

    public int getCurrrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7cde1a4", new Object[]{this})).intValue();
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null) {
            return 0;
        }
        return detailIndicator.getCurrentPosition();
    }

    public int getLastPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73467e4f", new Object[]{this})).intValue();
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null) {
            return 0;
        }
        return detailIndicator.getLastPosition();
    }

    public void setExtraButtonSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7473b2", new Object[]{this, new Boolean(z)});
            return;
        }
        Button button = this.mExtraButton;
        if (button == null) {
            return;
        }
        if (z) {
            extraButtonClickCallBack(button);
            updateRightIndicatorState(false);
        }
        changeExtraButtonStyle(z);
        this.mIsExtraButtonSelected = z;
    }

    public void updateRightIndicatorState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18e3cad8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isRightVideoSelected = z;
        this.mGalleryRightContainer.setSelected(this.isRightVideoSelected);
        if (!this.isRightVideoSelected) {
            return;
        }
        setExtraButtonSelected(false);
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null) {
            return;
        }
        computeScroll(detailIndicator.getCurrentPosition(), getTotalAnchorNum(), this.mDetailIndicator);
        this.mDetailIndicator.setNoItemSelected(this.isRightVideoSelected);
    }

    public void setExtraButtonVisiblity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe30481", new Object[]{this, new Integer(i)});
        } else if (this.mExtraButton == null) {
        } else {
            if (i == 8 || i == 0 || i == 4) {
                this.mExtraButton.setVisibility(i);
            } else {
                i.b(TAG, "IndicatorBar visiblity is illegal");
            }
        }
    }

    public void setBottomMarginByDIP(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2631a2c3", new Object[]{this, new Integer(i)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        Context context = this.mContext;
        if (context != null) {
            paddingBottom = ebu.a(context, i);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public void setBottomMarginByPixel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67855928", new Object[]{this, new Integer(i)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        setPadding(paddingLeft, paddingTop, getPaddingRight(), i);
    }

    public void setPicIndexText(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4993da1e", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i >= 0) {
            this.mCurrentPicIndex = i;
        }
        if (i2 > 0) {
            this.mTotalPicNum = i2;
        }
        String str = "" + this.mCurrentPicIndex + "/" + this.mTotalPicNum;
        TextView textView = this.mPicIndexText;
        if (textView != null) {
            textView.setText(str);
        }
        if (this.mPicIndexTextBelow == null) {
            return;
        }
        if (this.mIsPopupMode && this.mIsExtraButtonSelected && this.mExtraButton.getVisibility() == 0) {
            this.mPicIndexTextBelow.setText(str);
        } else if (this.mIsPopupMode && this.mExtraButton.getVisibility() != 0) {
            this.mPicIndexTextBelow.setText(str);
        } else {
            this.mPicIndexTextBelow.setVisibility(8);
        }
    }

    public void setPicIndexTextVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0b5a53", new Object[]{this, new Integer(i)});
        } else if (this.mPicIndexText == null) {
        } else {
            if (i == 8 || i == 0 || i == 4) {
                this.mPicIndexText.setVisibility(i);
            } else {
                i.b(TAG, "visiblity is illegal");
            }
        }
    }

    public void setPicIndexTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb25f970", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mPicIndexText;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public void setAnchorsAndStartInit(List<ItemNode.VideoItem.AnchorInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64a2e2f", new Object[]{this, list});
            return;
        }
        if (list != null && list.size() != 0) {
            this.mAnchors = list;
            for (int i = 0; i < list.size(); i++) {
                this.mTextList.add(list.get(i).desc);
            }
            this.mClipTextList = this.mTextList;
        }
        initIndicatorBar();
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContext = null;
        this.mIndicatorBarClickListener = null;
        try {
            if (this.mTextList != null) {
                this.mTextList.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null) {
            return;
        }
        detailIndicator.onDestroy();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator.a
    public void onDetailIndicatorPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281b8805", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (i >= this.mTextList.size()) {
        } else {
            if (this.mIsExtraButtonSelected) {
                reverseExtraButtonSelected();
            }
            updateRightIndicatorState(false);
        }
    }

    public int getTotalAnchorNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2a0719d", new Object[]{this})).intValue();
        }
        List<ItemNode.VideoItem.AnchorInfo> list = this.mAnchors;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void updateRightVideoVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ba70d3", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mGalleryRightContainer.setVisibility(0);
        } else {
            this.mGalleryRightContainer.setVisibility(8);
        }
    }

    public List<ItemNode.VideoItem.AnchorInfo> getAnchors() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("13f87db8", new Object[]{this}) : this.mAnchors;
    }

    public boolean getHasInitialized() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8222615b", new Object[]{this})).booleanValue() : this.mHasInitialized;
    }

    public void setHasInitialized(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106f3bd1", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasInitialized = z;
        }
    }

    public boolean getExtraButtonSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7291c5f2", new Object[]{this})).booleanValue() : this.mIsExtraButtonSelected;
    }

    public void setIndicatorBarClickListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b52a9f", new Object[]{this, bVar});
        } else {
            this.mIndicatorBarClickListener = bVar;
        }
    }

    public boolean getIsPopupMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b61c63a", new Object[]{this})).booleanValue() : this.mIsPopupMode;
    }

    public void setIsPopupMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d4486a", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsPopupMode = z;
        if (z) {
            DetailIndicator detailIndicator = this.mDetailIndicator;
            if (detailIndicator != null) {
                detailIndicator.setBackgroundResource(R.drawable.detail_indicator_bar_round_container_bg_transparent);
            }
            a aVar = this.mCommonNavigatorAdapter;
            if (aVar != null) {
                aVar.a(-1);
            }
            changeExtraButtonStyle(this.mIsExtraButtonSelected);
            updateRightVideoVisibility(false);
        } else {
            DetailIndicator detailIndicator2 = this.mDetailIndicator;
            if (detailIndicator2 != null) {
                detailIndicator2.setBackgroundResource(R.drawable.detail_indicator_bar_round_container_bg);
            }
            a aVar2 = this.mCommonNavigatorAdapter;
            if (aVar2 != null) {
                aVar2.a(DEFAULT_NORMAL_TEXT_COLOR);
            }
            changeExtraButtonStyle(this.mIsExtraButtonSelected);
        }
        setPicIndexText(this.mCurrentPicIndex, this.mTotalPicNum);
        DetailIndicator detailIndicator3 = this.mDetailIndicator;
        if (detailIndicator3 == null) {
            return;
        }
        detailIndicator3.postInvalidate();
    }

    public void hideGalleryLeftAndRightContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c48fe6c", new Object[]{this});
            return;
        }
        this.mGalleryLeftContainer.setVisibility(8);
        this.mGalleryRightContainer.setVisibility(8);
    }

    private void initIndicatorBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b77033b", new Object[]{this});
            return;
        }
        initViews();
        initNavigator();
        bindDetailIndicatorToNavigator();
        setHasInitialized(true);
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mTextSize = 10;
        this.mIndicatorHeight = 24;
        if (this.mContext == null) {
            return;
        }
        try {
            this.mIconFont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
        } catch (Exception e) {
            i.a(TAG, "Fail to get iconFont from asset", e);
        }
    }

    public static void preloadTypeface(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8711c361", new Object[]{context});
            return;
        }
        try {
            Typeface.createFromAsset(context.getAssets(), "uik_iconfont.ttf");
        } catch (Throwable th) {
            i.a(TAG, "preloadTypeface", th);
        }
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        if (this.mContainer == null) {
            View view = this.tmpContainer;
            if (view != null && view.getParent() == null) {
                addView(this.tmpContainer);
                this.mContainer = this.tmpContainer;
                this.tmpContainer = null;
            } else {
                this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.x_detail_indicator_bar_container, this);
            }
        }
        View view2 = this.mContainer;
        if (view2 == null) {
            return;
        }
        this.mIndicatorContainer = (LinearLayout) view2.findViewById(R.id.indicator_bar_center_container);
        this.mGalleryLeftContainer = (LinearLayout) this.mContainer.findViewById(R.id.ll_open_url_container);
        this.mGalleryRightContainer = (LinearLayout) this.mContainer.findViewById(R.id.ll_right_video_container);
        this.mDetailIndicator = (DetailIndicator) this.mContainer.findViewById(R.id.customed_indicator);
        this.mExtraButton = (Button) this.mContainer.findViewById(R.id.btn_customed_indicator_extra);
        this.mPicDesText = (TextView) this.mContainer.findViewById(R.id.text_pic_desc);
        this.mPicIndexText = (TextView) this.mContainer.findViewById(R.id.text_pic_index);
        this.mPicIndexTextBelow = (TextView) this.mContainer.findViewById(R.id.text_pic_index_below);
        if (this.mDetailIndicator == null || this.mExtraButton == null || this.mPicIndexText == null || this.mPicIndexTextBelow == null) {
            return;
        }
        initExtraButton();
        List<String> list = this.mTextList;
        if (list == null || list.size() == 0) {
            if (this.mExtraButton != null) {
                setExtraButtonSelected(true);
                this.mExtraButton.setVisibility(8);
            }
            DetailIndicator detailIndicator = this.mDetailIndicator;
            if (detailIndicator != null) {
                detailIndicator.setVisibility(8);
            }
            this.mPicIndexText.setVisibility(4);
        }
        TextView textView = this.mPicDesText;
        if (textView != null) {
            textView.setVisibility(4);
        }
        if (this.mPicIndexText == null || this.mPicIndexTextBelow == null) {
            return;
        }
        setPicIndexText(1, this.mTextList.size());
    }

    public void updateGalleryLeftContainerState(GalleryNode.GalleryItemNode galleryItemNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eeb88cc", new Object[]{this, galleryItemNode});
        } else if (galleryItemNode == null || galleryItemNode.getContentType() != 3 || galleryItemNode.getIndicatorType() != 1) {
        } else {
            this.mGalleryLeftContainer.setVisibility(0);
        }
    }

    public void updateGalleryRightContainerState(GalleryNode.GalleryItemNode galleryItemNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9639ef", new Object[]{this, galleryItemNode});
        } else if (galleryItemNode == null || galleryItemNode.getContentType() != 2 || galleryItemNode.getIndicatorType() != 1) {
        } else {
            this.mGalleryRightContainer.setVisibility(0);
        }
    }

    public void setGalleryLeftData(GalleryNode.GalleryItemNode galleryItemNode) {
        final GalleryNode.ContentOpenUrl openUrlContentData;
        GalleryNode.IndicatorImage imageIndicatorData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad04f82d", new Object[]{this, galleryItemNode});
        } else if (galleryItemNode == null || galleryItemNode.getContentType() != 3 || galleryItemNode.getIndicatorType() != 1 || (openUrlContentData = galleryItemNode.content.getOpenUrlContentData()) == null || (imageIndicatorData = galleryItemNode.indicator.getImageIndicatorData()) == null || this.hasLeftInit) {
        } else {
            this.hasLeftInit = true;
            this.mGalleryLeftContainer.setVisibility(0);
            setExtraButtonVisiblity(0);
            DetailImageView detailImageView = (DetailImageView) this.mGalleryLeftContainer.findViewById(R.id.iv_open_url_icon);
            TextView textView = (TextView) this.mGalleryLeftContainer.findViewById(R.id.tv_open_url_text);
            c b2 = epj.b();
            if (b2 != null && !StringUtils.isEmpty(imageIndicatorData.icon)) {
                detailImageView.setVisibility(0);
                b2.a(imageIndicatorData.icon, detailImageView);
            } else {
                detailImageView.setVisibility(8);
            }
            textView.setText(imageIndicatorData.text);
            this.mGalleryLeftContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    INavAdapter f = epj.f();
                    if (f == null || StringUtils.isEmpty(openUrlContentData.url)) {
                        return;
                    }
                    f.navigateTo(view.getContext(), openUrlContentData.url, null);
                }
            });
        }
    }

    public void updateRightVideoData(GalleryNode.GalleryItemNode galleryItemNode) {
        GalleryNode.IndicatorImage imageIndicatorData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990615e", new Object[]{this, galleryItemNode});
        } else if (galleryItemNode == null || galleryItemNode.getContentType() != 2 || galleryItemNode.getIndicatorType() != 1 || galleryItemNode.content.getVideoContentData() == null || (imageIndicatorData = galleryItemNode.indicator.getImageIndicatorData()) == null || this.hasRightInit) {
        } else {
            this.hasRightInit = true;
            this.mGalleryRightContainer.setVisibility(0);
            setExtraButtonVisiblity(0);
            DetailImageView detailImageView = (DetailImageView) this.mGalleryRightContainer.findViewById(R.id.iv_right_video_icon);
            TextView textView = (TextView) this.mGalleryRightContainer.findViewById(R.id.tv_right_video_text);
            c b2 = epj.b();
            if (b2 != null && !StringUtils.isEmpty(imageIndicatorData.icon)) {
                detailImageView.setVisibility(0);
                b2.a(imageIndicatorData.icon, detailImageView);
            } else {
                detailImageView.setVisibility(8);
            }
            textView.setText(imageIndicatorData.text);
            this.mGalleryRightContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    IndicatorBar.this.updateRightIndicatorState(true);
                    if (IndicatorBar.access$000(IndicatorBar.this) == null) {
                        return;
                    }
                    IndicatorBar.access$000(IndicatorBar.this).a();
                }
            });
        }
    }

    public void setIndicatorVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1856cbfd", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.mIndicatorContainer.setVisibility(0);
            this.mPicIndexText.setVisibility(0);
        } else if (this.mContainer == null) {
        } else {
            this.mIndicatorContainer.setVisibility(8);
            this.mPicIndexText.setVisibility(0);
        }
    }

    private void initExtraButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb0efb9", new Object[]{this});
            return;
        }
        Button button = this.mExtraButton;
        if (button == null || this.mContext == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (IndicatorBar.access$100(IndicatorBar.this) || IndicatorBar.access$200(IndicatorBar.this)) {
                } else {
                    IndicatorBar.access$300(IndicatorBar.this);
                    if (IndicatorBar.access$000(IndicatorBar.this) != null) {
                        IndicatorBar.access$000(IndicatorBar.this).a(IndicatorBar.access$400(IndicatorBar.this), IndicatorBar.access$200(IndicatorBar.this));
                    }
                    IndicatorBar.access$500(IndicatorBar.this, view);
                }
            }
        });
    }

    private void initNavigator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f90302e", new Object[]{this});
            return;
        }
        List<String> list = this.mTextList;
        if (list == null || list.size() == 0) {
            return;
        }
        CommonNavigator commonNavigator = new CommonNavigator(this.mContext);
        commonNavigator.setAdapter(createRoundRecNaviAdapter());
        commonNavigator.setSkimOver(true);
        this.mNavigator = commonNavigator;
    }

    private void bindDetailIndicatorToNavigator() {
        ebp ebpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941ca7a2", new Object[]{this});
            return;
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null || (ebpVar = this.mNavigator) == null) {
            return;
        }
        detailIndicator.setNavigator(ebpVar);
        this.mDetailIndicator.setBackgroundResource(R.drawable.detail_indicator_bar_round_container_bg);
        this.mDetailIndicator.addDetailIndicatorListener(this);
    }

    private void reverseExtraButtonSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3433c4e2", new Object[]{this});
            return;
        }
        if (this.mIsExtraButtonSelected) {
            this.mIsExtraButtonSelected = false;
        } else {
            this.mIsExtraButtonSelected = true;
        }
        changeExtraButtonStyle(this.mIsExtraButtonSelected);
    }

    private void changeExtraButtonStyle(boolean z) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb54d74e", new Object[]{this, new Boolean(z)});
        } else if (this.mExtraButton == null) {
        } else {
            if (z) {
                this.mExtraButton.setBackgroundDrawable(ContextCompat.getDrawable(this.mContext, R.drawable.detail_indicator_bar_extra_btn_pressed));
                this.mExtraButton.setTextColor(this.extraButtonSelectedColor);
                return;
            }
            if (!this.mIsPopupMode) {
                drawable = ContextCompat.getDrawable(this.mContext, R.drawable.detail_indicator_bar_extra_btn_unpressed);
                this.mExtraButton.setTextColor(DEFAULT_NORMAL_TEXT_COLOR);
            } else {
                drawable = ContextCompat.getDrawable(this.mContext, R.drawable.detail_indicator_bar_extra_btn_unpressed_transparent);
                this.mExtraButton.setTextColor(-1);
            }
            this.mExtraButton.setBackgroundDrawable(drawable);
        }
    }

    private void extraButtonClickCallBack(View view) {
        DetailIndicator detailIndicator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43852c0", new Object[]{this, view});
        } else if (this.isScrolling || (detailIndicator = this.mDetailIndicator) == null) {
        } else {
            computeScroll(detailIndicator.getCurrentPosition(), getTotalAnchorNum(), this.mDetailIndicator);
            this.mDetailIndicator.setNoItemSelected(this.mIsExtraButtonSelected);
        }
    }

    private ebr createRoundRecNaviAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebr) ipChange.ipc$dispatch("9c4491bf", new Object[]{this});
        }
        this.mCommonNavigatorAdapter = new a();
        return this.mCommonNavigatorAdapter;
    }

    private void computeScroll(final int i, final int i2, final DetailIndicator detailIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0d3d90", new Object[]{this, new Integer(i), new Integer(i2), detailIndicator});
        } else if (i < i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 30);
            ofInt.setDuration(180L);
            detailIndicator.onPageScrollStateChanged(2);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    detailIndicator.onPageScrolled(i, i2, (intValue * 1.0f) / 30.0f, 0);
                    if (intValue < 30) {
                        return;
                    }
                    detailIndicator.onPageScrollStateChanged(0);
                    detailIndicator.onPageSelected(i2);
                    IndicatorBar.access$102(IndicatorBar.this, false);
                }
            });
            ofInt.start();
            this.isScrolling = true;
        } else {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 30);
            ofInt2.setDuration(180L);
            detailIndicator.onPageScrollStateChanged(2);
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    detailIndicator.onPageScrolled(i, i2, 1.0f - ((intValue * 1.0f) / 30.0f), 0);
                    if (intValue < 30) {
                        return;
                    }
                    detailIndicator.onPageScrollStateChanged(0);
                    detailIndicator.onPageSelected(i2);
                    IndicatorBar.access$102(IndicatorBar.this, false);
                }
            });
            ofInt2.start();
            this.isScrolling = true;
        }
    }

    /* loaded from: classes4.dex */
    public class a extends ebr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-225126272);
        }

        public a() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            Iterator<ebq> it = c().iterator();
            while (it.hasNext()) {
                ebq next = it.next();
                if (next != null && (next instanceof ClipableTitleView)) {
                    ((ClipableTitleView) next).setTextColor(i);
                }
            }
        }

        @Override // tb.ebr
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            if (IndicatorBar.access$600(IndicatorBar.this) != null) {
                return IndicatorBar.access$600(IndicatorBar.this).size();
            }
            return 0;
        }

        @Override // tb.ebr
        public ebq a(Context context, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ebq) ipChange.ipc$dispatch("7876758f", new Object[]{this, context, new Integer(i)});
            }
            if (IndicatorBar.access$600(IndicatorBar.this) == null || IndicatorBar.access$600(IndicatorBar.this).size() == 0) {
                return null;
            }
            if (this.c != null && i < this.c.size()) {
                return this.c.get(i);
            }
            ClipableTitleView clipableTitleView = new ClipableTitleView(context);
            clipableTitleView.setText((String) IndicatorBar.access$600(IndicatorBar.this).get(i));
            if (IndicatorBar.access$700(IndicatorBar.this) != null && IndicatorBar.access$700(IndicatorBar.this).size() == IndicatorBar.access$600(IndicatorBar.this).size()) {
                clipableTitleView.setClipText((String) IndicatorBar.access$700(IndicatorBar.this).get(i));
            }
            clipableTitleView.setIconFont(IndicatorBar.access$800(IndicatorBar.this));
            clipableTitleView.setTextSize(IndicatorBar.access$900(IndicatorBar.this));
            if (IndicatorBar.access$1000(IndicatorBar.this)) {
                clipableTitleView.setTextColor(-1);
                clipableTitleView.setClipTextColor(-1);
            } else {
                clipableTitleView.setTextColor(IndicatorBar.DEFAULT_NORMAL_TEXT_COLOR);
                clipableTitleView.setClipTextColor(-1);
            }
            clipableTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (IndicatorBar.access$100(IndicatorBar.this)) {
                    } else {
                        if (IndicatorBar.access$1100(IndicatorBar.this) != null) {
                            IndicatorBar.access$1100(IndicatorBar.this).setVisibility(8);
                        }
                        int currentPosition = IndicatorBar.access$1200(IndicatorBar.this).getCurrentPosition();
                        int i2 = i;
                        if (IndicatorBar.access$000(IndicatorBar.this) != null) {
                            i2 = IndicatorBar.access$000(IndicatorBar.this).a(currentPosition, i2);
                        }
                        IndicatorBar.access$1300(IndicatorBar.this, currentPosition, i2, IndicatorBar.access$1200(IndicatorBar.this));
                        if (!IndicatorBar.access$200(IndicatorBar.this)) {
                            return;
                        }
                        IndicatorBar.access$202(IndicatorBar.this, false);
                        IndicatorBar.access$1400(IndicatorBar.this, IndicatorBar.access$200(IndicatorBar.this));
                        IndicatorBar.access$1200(IndicatorBar.this).setNoItemSelected(IndicatorBar.access$200(IndicatorBar.this));
                        if (!IndicatorBar.access$1000(IndicatorBar.this) || IndicatorBar.access$1100(IndicatorBar.this) == null) {
                            return;
                        }
                        IndicatorBar.access$1100(IndicatorBar.this).setVisibility(8);
                    }
                }
            });
            this.c.add(clipableTitleView);
            return clipableTitleView;
        }

        @Override // tb.ebr
        public ebn a(Context context) {
            int a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ebn) ipChange.ipc$dispatch("34c2acd5", new Object[]{this, context});
            }
            LineIndicatorBackground lineIndicatorBackground = new LineIndicatorBackground(context);
            if (IndicatorBar.access$1200(IndicatorBar.this).getLayoutParams().height > 0) {
                a2 = IndicatorBar.access$1200(IndicatorBar.this).getLayoutParams().height;
            } else {
                a2 = ebu.a(IndicatorBar.access$1500(IndicatorBar.this), IndicatorBar.access$1600(IndicatorBar.this));
            }
            lineIndicatorBackground.setLineHeight(a2);
            lineIndicatorBackground.setRoundRadius(ebu.a(IndicatorBar.access$1500(IndicatorBar.this), 13.0d));
            lineIndicatorBackground.setLeftRightPadding(0.0f);
            lineIndicatorBackground.setTopBottomPadding(1.0f);
            lineIndicatorBackground.setLinearGradientColors(IndicatorBar.access$1700(IndicatorBar.this), IndicatorBar.access$1800(IndicatorBar.this));
            return lineIndicatorBackground;
        }
    }

    public void hideIndicatorAndExtraButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a459df", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.mGalleryLeftContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator != null) {
            detailIndicator.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.mGalleryRightContainer;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        setExtraButtonVisiblity(8);
    }

    public void showIndicator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd57b19", new Object[]{this});
            return;
        }
        DetailIndicator detailIndicator = this.mDetailIndicator;
        if (detailIndicator == null) {
            return;
        }
        detailIndicator.setVisibility(0);
    }

    public void hidePicDescText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47fe21ed", new Object[]{this});
            return;
        }
        TextView textView = this.mPicDesText;
        if (textView == null) {
            return;
        }
        textView.setVisibility(4);
    }

    public void showPicDescText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801c701c", new Object[]{this, str});
            return;
        }
        TextView textView = this.mPicDesText;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        if (str == null) {
            return;
        }
        this.mPicDesText.setText(str);
    }
}
