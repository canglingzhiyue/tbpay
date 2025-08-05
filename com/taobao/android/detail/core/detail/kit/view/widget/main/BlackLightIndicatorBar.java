package com.taobao.android.detail.core.detail.kit.view.widget.main;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator;
import com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.commonnavigator.LineNavigator;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ebp;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class BlackLightIndicatorBar extends RelativeLayout implements DetailIndicator.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_SELECTED_TEXT_COLOR = -1;
    public static final int DEFAULT_UNSELECTED_TEXT_COLOR = -2130706433;
    public static final int MSG_TYPE_MOVE = 10086;
    private static final String TAG;
    private int extraButtonSelectedColor;
    private int extraButtonUnselectedColor;
    public boolean isAnimPlaying;
    private boolean isScrolling;
    public boolean isShown;
    public List<ItemNode.VideoItem.AnchorInfo> mAnchors;
    private List<String> mClipTextList;
    private View mContainer;
    private View mContainerBg;
    private Context mContext;
    private int mCurrentPicIndex;
    private boolean mHasInitialized;
    private Typeface mIconFont;
    private a mIndicatorBarClickListener;
    private int mIndicatorHeight;
    private boolean mIsExtraButtonSelected;
    private boolean mIsPopupMode;
    private ebp mNavigator;
    private View mPicIndicator;
    private LinearLayout mPicIndicatorContainer;
    private TextView mPicTitleText;
    private List<String> mTextList;
    private int mTextSize;
    private int mTitleViewSelectedColor;
    private int mTitleViewUnselectedColor;
    private LinearLayout mTotalContainer;
    private int mTotalPicNum;
    private DetailIndicator mVideoIndicator;
    private LinearLayout mVideoIndicatorContainer;
    private TextView mVideoTitleText;

    /* loaded from: classes4.dex */
    public interface a {
        int a(int i, int i2);

        void a(TextView textView, boolean z);
    }

    private void fitForCutoutScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544b40f7", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(BlackLightIndicatorBar blackLightIndicatorBar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ View access$000(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("75f48cce", new Object[]{blackLightIndicatorBar}) : blackLightIndicatorBar.mContainerBg;
    }

    public static /* synthetic */ boolean access$100(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("98ab1aaf", new Object[]{blackLightIndicatorBar})).booleanValue() : blackLightIndicatorBar.isScrolling;
    }

    public static /* synthetic */ boolean access$102(BlackLightIndicatorBar blackLightIndicatorBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ec8778f", new Object[]{blackLightIndicatorBar, new Boolean(z)})).booleanValue();
        }
        blackLightIndicatorBar.isScrolling = z;
        return z;
    }

    public static /* synthetic */ boolean access$200(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d09bf5ce", new Object[]{blackLightIndicatorBar})).booleanValue() : blackLightIndicatorBar.mIsExtraButtonSelected;
    }

    public static /* synthetic */ a access$300(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8af5675f", new Object[]{blackLightIndicatorBar}) : blackLightIndicatorBar.mIndicatorBarClickListener;
    }

    public static /* synthetic */ TextView access$400(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("a7c4bc7c", new Object[]{blackLightIndicatorBar}) : blackLightIndicatorBar.mPicTitleText;
    }

    public static /* synthetic */ void access$500(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786e8727", new Object[]{blackLightIndicatorBar});
        } else {
            blackLightIndicatorBar.extraButtonClickCallBack();
        }
    }

    public static /* synthetic */ void access$600(BlackLightIndicatorBar blackLightIndicatorBar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8d994e", new Object[]{blackLightIndicatorBar, new Boolean(z)});
        } else {
            blackLightIndicatorBar.changeExtraButtonStyle(z);
        }
    }

    public static /* synthetic */ TextView access$700(BlackLightIndicatorBar blackLightIndicatorBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("dac046d9", new Object[]{blackLightIndicatorBar}) : blackLightIndicatorBar.mVideoTitleText;
    }

    static {
        kge.a(-983049634);
        kge.a(-1148150875);
        TAG = IndicatorBar.class.getSimpleName();
    }

    public BlackLightIndicatorBar(Context context) {
        super(context);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewSelectedColor = -1;
        this.mTitleViewUnselectedColor = DEFAULT_UNSELECTED_TEXT_COLOR;
        this.mIsExtraButtonSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = DEFAULT_UNSELECTED_TEXT_COLOR;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.isAnimPlaying = true;
        this.isShown = false;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar");
    }

    public BlackLightIndicatorBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewSelectedColor = -1;
        this.mTitleViewUnselectedColor = DEFAULT_UNSELECTED_TEXT_COLOR;
        this.mIsExtraButtonSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = DEFAULT_UNSELECTED_TEXT_COLOR;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.isAnimPlaying = true;
        this.isShown = false;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar");
    }

    public BlackLightIndicatorBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHasInitialized = false;
        this.mTextList = new ArrayList();
        this.mClipTextList = new ArrayList();
        this.mTitleViewSelectedColor = -1;
        this.mTitleViewUnselectedColor = DEFAULT_UNSELECTED_TEXT_COLOR;
        this.mIsExtraButtonSelected = false;
        this.extraButtonSelectedColor = -1;
        this.extraButtonUnselectedColor = DEFAULT_UNSELECTED_TEXT_COLOR;
        this.isScrolling = false;
        this.mIsPopupMode = false;
        this.isAnimPlaying = true;
        this.isShown = false;
        this.mContext = context;
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar");
    }

    public void setCurrentPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
            return;
        }
        DetailIndicator detailIndicator = this.mVideoIndicator;
        if (detailIndicator == null || this.isScrolling) {
            return;
        }
        computeScroll(detailIndicator.getCurrentPosition(), i, this.mVideoIndicator);
    }

    public int getCurrrentPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7cde1a4", new Object[]{this})).intValue();
        }
        DetailIndicator detailIndicator = this.mVideoIndicator;
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
        DetailIndicator detailIndicator = this.mVideoIndicator;
        if (detailIndicator == null) {
            return 0;
        }
        return detailIndicator.getLastPosition();
    }

    public void setExtraButtonSelected(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7473b2", new Object[]{this, new Boolean(z)});
        } else if (this.mPicTitleText == null || this.mIsExtraButtonSelected == z) {
        } else {
            if (z) {
                extraButtonClickCallBack();
            }
            changeExtraButtonStyle(z);
            this.mIsExtraButtonSelected = z;
        }
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

    public void setExtraButtonVisiblity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe30481", new Object[]{this, new Integer(i)});
        } else if (this.mPicIndicatorContainer == null) {
        } else {
            if (i == 8 || i == 0 || i == 4) {
                this.mPicIndicatorContainer.setVisibility(i);
            } else {
                i.b(TAG, "visiblity is illegal");
            }
        }
    }

    public void setIndicatorAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7071d28", new Object[]{this, new Float(f)});
            return;
        }
        this.mVideoIndicatorContainer.setAlpha(f);
        this.mPicIndicatorContainer.setAlpha(f);
        this.mContainerBg.setAlpha(1.0f - f);
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
        DetailIndicator detailIndicator = this.mVideoIndicator;
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
        } else if (i >= this.mTextList.size() || !this.mIsExtraButtonSelected) {
        } else {
            reverseExtraButtonSelected();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.widget.main.detailIndicator.DetailIndicator.a
    public void onDetailIndicatorPageScrolled(int i, int i2, float f, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7ed504", new Object[]{this, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
        } else if (i2 < this.mTextList.size()) {
            this.mIsExtraButtonSelected = false;
            changeExtraButtonStyle(this.mIsExtraButtonSelected);
        } else {
            this.mIsExtraButtonSelected = true;
            changeExtraButtonStyle(this.mIsExtraButtonSelected);
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

    public void setIndicatorBarClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53e1769", new Object[]{this, aVar});
        } else {
            this.mIndicatorBarClickListener = aVar;
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
        changeExtraButtonStyle(this.mIsExtraButtonSelected);
        DetailIndicator detailIndicator = this.mVideoIndicator;
        if (detailIndicator == null) {
            return;
        }
        detailIndicator.postInvalidate();
    }

    private void initIndicatorBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b77033b", new Object[]{this});
            return;
        }
        initData();
        initViews();
        initNavigator();
        setHasInitialized(true);
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else if (this.mContext == null) {
        } else {
            try {
                this.mIconFont = Typeface.createFromAsset(getContext().getAssets(), "uik_iconfont.ttf");
            } catch (Exception e) {
                i.a(TAG, "Fail to get iconFont from asset", e);
            }
        }
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.mContainer = LayoutInflater.from(this.mContext).inflate(R.layout.x_detail_blacklight_indicator_bar_container, this);
        View view = this.mContainer;
        if (view == null) {
            return;
        }
        this.mContainerBg = view.findViewById(R.id.bg_blacklight_indicator);
        this.mTotalContainer = (LinearLayout) this.mContainer.findViewById(R.id.line_indicator_total_container);
        this.mVideoIndicatorContainer = (LinearLayout) this.mContainer.findViewById(R.id.line_indicator_video_container);
        this.mVideoIndicator = (DetailIndicator) this.mContainer.findViewById(R.id.popu_video_indicator);
        this.mVideoTitleText = (TextView) this.mContainer.findViewById(R.id.popu_video_title);
        this.mPicIndicatorContainer = (LinearLayout) this.mContainer.findViewById(R.id.line_indicator_pic_container);
        this.mPicTitleText = (TextView) this.mContainer.findViewById(R.id.popu_pic_title);
        this.mPicIndicator = this.mContainer.findViewById(R.id.popu_pic_indicator);
        if (this.mVideoIndicator == null || this.mPicTitleText == null || this.mVideoTitleText == null || this.mPicIndicator == null) {
            return;
        }
        initExtraButton();
        changeExtraButtonStyle(false);
        List<String> list = this.mTextList;
        if (list == null || list.size() == 0) {
            LinearLayout linearLayout = this.mVideoIndicatorContainer;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.mPicIndicatorContainer;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(4);
                this.mVideoTitleText.setVisibility(8);
            }
        }
        fitForCutoutScreen();
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        View view = this.mContainerBg;
        if (view == null || this.isShown || this.isAnimPlaying) {
            return;
        }
        this.isShown = true;
        this.isAnimPlaying = true;
        try {
            view.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mContainerBg, "translationY", 0.0f, dip2px(getContext(), 100.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500L);
            animatorSet.playTogether(ofFloat);
            animatorSet.start();
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        BlackLightIndicatorBar.this.isAnimPlaying = false;
                    }
                }
            });
        } catch (Exception e) {
            e.toString();
        }
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.mContainerBg == null || !this.isShown || this.isAnimPlaying) {
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mContainerBg, "translationY", 0.0f, dip2px(getContext(), 100.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(500L);
            animatorSet.playTogether(ofFloat);
            animatorSet.start();
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (BlackLightIndicatorBar.access$000(BlackLightIndicatorBar.this) == null) {
                    } else {
                        BlackLightIndicatorBar.access$000(BlackLightIndicatorBar.this).setVisibility(0);
                    }
                }
            });
            this.isShown = false;
        }
    }

    private void initExtraButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb0efb9", new Object[]{this});
            return;
        }
        TextView textView = this.mPicTitleText;
        if (textView != null && this.mContext != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (BlackLightIndicatorBar.access$100(BlackLightIndicatorBar.this) || BlackLightIndicatorBar.access$200(BlackLightIndicatorBar.this)) {
                    } else {
                        if (BlackLightIndicatorBar.access$300(BlackLightIndicatorBar.this) != null) {
                            BlackLightIndicatorBar.access$300(BlackLightIndicatorBar.this).a(BlackLightIndicatorBar.access$400(BlackLightIndicatorBar.this), BlackLightIndicatorBar.access$200(BlackLightIndicatorBar.this));
                        }
                        BlackLightIndicatorBar.access$500(BlackLightIndicatorBar.this);
                    }
                }
            });
        }
        TextView textView2 = this.mVideoTitleText;
        if (textView2 == null) {
            return;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                BlackLightIndicatorBar.access$300(BlackLightIndicatorBar.this).a(1, 0);
                BlackLightIndicatorBar.access$600(BlackLightIndicatorBar.this, false);
                if (BlackLightIndicatorBar.access$700(BlackLightIndicatorBar.this) == null) {
                    return;
                }
                BlackLightIndicatorBar.access$700(BlackLightIndicatorBar.this).setTextColor(-1);
            }
        });
    }

    private void initNavigator() {
        ebp ebpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f90302e", new Object[]{this});
            return;
        }
        List<String> list = this.mTextList;
        if (list == null || list.size() == 0) {
            return;
        }
        LineNavigator lineNavigator = new LineNavigator(this.mContext);
        lineNavigator.setIndicatorCount(this.mTextList.size(), false);
        this.mNavigator = lineNavigator;
        DetailIndicator detailIndicator = this.mVideoIndicator;
        if (detailIndicator == null || (ebpVar = this.mNavigator) == null) {
            return;
        }
        detailIndicator.setNavigator(ebpVar);
        this.mVideoIndicator.addDetailIndicatorListener(this);
    }

    private void computeScroll(final int i, final int i2, final DetailIndicator detailIndicator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0d3d90", new Object[]{this, new Integer(i), new Integer(i2), detailIndicator});
            return;
        }
        this.mVideoTitleText.setTextColor(-1);
        this.mVideoIndicator.setVisibility(0);
        if (i < i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 30);
            ofInt.setDuration(180L);
            detailIndicator.onPageScrollStateChanged(2);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.5
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
                    BlackLightIndicatorBar.access$102(BlackLightIndicatorBar.this, false);
                }
            });
            ofInt.start();
            this.isScrolling = true;
            return;
        }
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 30);
        ofInt2.setDuration(180L);
        detailIndicator.onPageScrollStateChanged(2);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar.6
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
                BlackLightIndicatorBar.access$102(BlackLightIndicatorBar.this, false);
            }
        });
        ofInt2.start();
        this.isScrolling = true;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb54d74e", new Object[]{this, new Boolean(z)});
            return;
        }
        TextView textView = this.mPicTitleText;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setTextColor(this.extraButtonSelectedColor);
            this.mPicIndicator.setVisibility(0);
            return;
        }
        textView.setTextColor(this.extraButtonUnselectedColor);
        this.mPicIndicator.setVisibility(8);
    }

    private void extraButtonClickCallBack() {
        DetailIndicator detailIndicator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e040d2", new Object[]{this});
        } else if (this.isScrolling || (detailIndicator = this.mVideoIndicator) == null) {
        } else {
            detailIndicator.getCurrentPosition();
            getTotalAnchorNum();
            this.mVideoTitleText.setTextColor(DEFAULT_UNSELECTED_TEXT_COLOR);
            this.mVideoIndicator.setVisibility(8);
        }
    }
}
