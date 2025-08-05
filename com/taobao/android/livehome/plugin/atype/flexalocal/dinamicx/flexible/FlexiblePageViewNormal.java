package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible;

import android.content.Context;
import android.graphics.Color;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.mfj;

/* loaded from: classes6.dex */
public class FlexiblePageViewNormal extends RelativeLayout implements AbsFlexibleMarqueeGallery.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG;
    private static final float end_progress = 0.6f;
    private static final int goods_img_bottom_margin_expend = 6;
    private static final int goods_img_bottom_margin_folded = 5;
    private static final int goods_img_right_margin_expend = 5;
    private static final int goods_img_wh_expend = 80;
    private static final int goods_img_wh_folded = 50;
    private static final float stat_progress = 0.6f;
    private static final int subtitle_top_margin = 0;
    private static final int title_height = 22;
    private static final int title_left_margin = 12;
    private static final int title_top_margin = 8;
    public boolean enableAutoJellyMarquee;
    private boolean enableWhenNullClearImgJellyMarquee;
    private float lastProgress;
    private TUrlImageView mBgExpend;
    private TUrlImageView mBgFolded;
    private TUrlImageView mButtonBgExpend;
    public TextView mButtonExpend;
    private TUrlImageView mButtonIconExpend;
    public ViewGroup mButtonLayoutExpend;
    private TUrlImageView mGoodImg;
    public FlexiblePageViewEntity mPageViewEntity;
    private TextView mSubTitleExpend;
    private TextView mSubTitleFolded;
    private TextView mTitleExpend;
    private TextView mTitleFolded;
    private RelativeLayout mTitleFoldedLayout;

    public static /* synthetic */ Object ipc$super(FlexiblePageViewNormal flexiblePageViewNormal, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void dismissExpendViewAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("262364c5", new Object[]{this});
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.d
    public void onAnimateUpdate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178e8f8e", new Object[]{this, new Float(f)});
        }
    }

    static {
        kge.a(1637023889);
        kge.a(-2045386471);
        TAG = FlexiblePageViewNormal.class.getSimpleName();
    }

    public FlexiblePageViewNormal(Context context) {
        this(context, null);
    }

    public FlexiblePageViewNormal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexiblePageViewNormal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableAutoJellyMarquee = true;
        this.enableWhenNullClearImgJellyMarquee = false;
        this.lastProgress = -1.0f;
        this.enableWhenNullClearImgJellyMarquee = i.E();
        initView(context);
    }

    public void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
        } else if (i.F()) {
            inflateView(context);
        } else {
            instanceView(context);
        }
    }

    public void instanceView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9979287", new Object[]{this, context});
            return;
        }
        this.mBgExpend = new TUrlImageView(context);
        addView(this.mBgExpend, new RelativeLayout.LayoutParams(-1, -1));
        this.mBgFolded = new TUrlImageView(context);
        addView(this.mBgFolded, new RelativeLayout.LayoutParams(-1, -1));
        this.mGoodImg = new TUrlImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.mGoodImg, layoutParams);
        this.mTitleExpend = new TextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        updateTextViewParams(this.mTitleExpend, "#000000");
        this.mTitleExpend.setTypeface(null, 1);
        this.mTitleExpend.setGravity(19);
        addView(this.mTitleExpend, layoutParams2);
        this.mSubTitleExpend = new TextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(10);
        updateTextViewParams(this.mSubTitleExpend, "#FF265C");
        this.mSubTitleExpend.setGravity(19);
        addView(this.mSubTitleExpend, layoutParams3);
        this.mTitleFoldedLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(c.a(context, 83.0f), -2);
        layoutParams4.addRule(11);
        layoutParams4.addRule(10);
        addView(this.mTitleFoldedLayout, layoutParams4);
        this.mTitleFolded = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(14);
        layoutParams5.addRule(10);
        updateTextViewParams(this.mTitleFolded, "#000000");
        this.mTitleFolded.setTypeface(null, 1);
        this.mTitleFolded.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
        this.mTitleFolded.setTextAlignment(4);
        this.mTitleFolded.setGravity(17);
        this.mTitleFoldedLayout.addView(this.mTitleFolded, layoutParams5);
        this.mSubTitleFolded = new TextView(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(14);
        layoutParams6.addRule(10);
        updateTextViewParams(this.mSubTitleFolded, "#A95900");
        this.mSubTitleFolded.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        this.mSubTitleFolded.setGravity(17);
        this.mSubTitleFolded.setTextAlignment(4);
        this.mTitleFoldedLayout.addView(this.mSubTitleFolded, layoutParams6);
        instanceLeftBottomView(context);
    }

    public void instanceLeftBottomView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30be8dd5", new Object[]{this, context});
            return;
        }
        this.mButtonLayoutExpend = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        addView(this.mButtonLayoutExpend, layoutParams);
        this.mButtonBgExpend = new TUrlImageView(context);
        this.mButtonLayoutExpend.addView(this.mButtonBgExpend, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.mButtonLayoutExpend.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        this.mButtonExpend = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        updateTextViewParams(this.mButtonExpend, "#FF3333");
        this.mButtonExpend.setGravity(17);
        linearLayout.addView(this.mButtonExpend, layoutParams2);
        this.mButtonIconExpend = new TUrlImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        linearLayout.addView(this.mButtonIconExpend, layoutParams3);
    }

    public void updateTextViewParams(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef854f46", new Object[]{this, textView, str});
            return;
        }
        textView.setTextColor(Color.parseColor(str));
        textView.setSingleLine(true);
        textView.setEllipsize(null);
        textView.setIncludeFontPadding(false);
        textView.setLineSpacing(0.0f, 1.0f);
    }

    private void inflateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2bcb55", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.live_home_faxian_top_pager_view_normal_flexalocal, this);
        this.mBgExpend = (TUrlImageView) findViewById(R.id.page_view_normal_bg_expend);
        this.mTitleExpend = (TextView) findViewById(R.id.page_view_normal_title_expend);
        this.mSubTitleExpend = (TextView) findViewById(R.id.page_view_normal_subtitle_expend);
        this.mButtonLayoutExpend = (ViewGroup) findViewById(R.id.page_view_normal_button_layout_expend);
        this.mButtonBgExpend = (TUrlImageView) findViewById(R.id.page_view_normal_button_bg_expend);
        this.mButtonExpend = (TextView) findViewById(R.id.page_view_normal_button_expend);
        this.mButtonIconExpend = (TUrlImageView) findViewById(R.id.page_view_normal_button_icon_expend);
        this.mBgFolded = (TUrlImageView) findViewById(R.id.page_view_normal_bg_folded);
        this.mTitleFoldedLayout = (RelativeLayout) findViewById(R.id.page_view_normal_title_folded_layout);
        this.mTitleFolded = (TextView) findViewById(R.id.page_view_normal_title_folded);
        this.mSubTitleFolded = (TextView) findViewById(R.id.page_view_normal_subtitle_folded);
        this.mGoodImg = (TUrlImageView) findViewById(R.id.page_view_normal_good_img);
    }

    public void setEnableAutoJellyMarquee(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4b39d5", new Object[]{this, new Boolean(z)});
        } else {
            this.enableAutoJellyMarquee = z;
        }
    }

    public void setPageViewEntity(FlexiblePageViewEntity flexiblePageViewEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a704a1a2", new Object[]{this, flexiblePageViewEntity});
        } else {
            this.mPageViewEntity = flexiblePageViewEntity;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.d
    public void onAnimatePerform(View view, int i, float f, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2167426b", new Object[]{this, view, new Integer(i), new Float(f), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else {
            updateViewProgress(f, i2, i3);
        }
    }

    public void updateViewProgress(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd327e", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        float interpolationShow = getInterpolationShow(f);
        float interpolationDismiss = getInterpolationDismiss(f);
        this.mBgExpend.setAlpha(f);
        this.mTitleExpend.setAlpha(interpolationShow);
        this.mSubTitleExpend.setAlpha(interpolationShow);
        updateLeftBottomProgress(interpolationShow, interpolationDismiss, f);
        float f2 = 1.0f - f;
        this.mBgFolded.setAlpha(f2);
        this.mTitleFolded.setAlpha(interpolationDismiss);
        this.mSubTitleFolded.setAlpha(interpolationDismiss);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(i, i2);
        } else {
            layoutParams.width = i;
            layoutParams.height = i2;
        }
        setLayoutParams(layoutParams);
        float adjustDP = adjustDP(i2, 50);
        float adjustDP2 = adjustDP(i2, 80);
        float adjustDP3 = adjustDP(i2, 5);
        float adjustDP4 = adjustDP(i2, 6);
        float adjustDP5 = adjustDP(i2, 5);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mGoodImg.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        }
        int round = Math.round(adjustDP + ((adjustDP2 - adjustDP) * interpolationShow));
        layoutParams2.height = round;
        layoutParams2.width = round;
        layoutParams2.rightMargin = Math.round((((i - layoutParams2.width) / 2.0f) * interpolationDismiss) + (adjustDP3 * (1.0f - interpolationDismiss)));
        layoutParams2.bottomMargin = Math.round((adjustDP5 * f2) + (adjustDP4 * f));
        this.mGoodImg.setLayoutParams(layoutParams2);
        float f3 = this.lastProgress;
        if (f3 >= 0.0f) {
            if (f3 < 1.0f && f == 1.0f) {
                showExpendViewAnim();
            } else if (this.lastProgress > 0.0f && f == 0.0f) {
                dismissExpendViewAnim();
            }
        }
        this.lastProgress = f;
    }

    public void updateLeftBottomProgress(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbe02d1", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else {
            this.mButtonLayoutExpend.setAlpha(f);
        }
    }

    public void showExpendViewAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85057678", new Object[]{this});
        } else {
            this.mGoodImg.reload();
        }
    }

    public void updateView(boolean z, int i, int i2, int i3) {
        int parseColor;
        int parseColor2;
        int parseColor3;
        int parseColor4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cbae164", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        FlexiblePageViewEntity flexiblePageViewEntity = this.mPageViewEntity;
        if (flexiblePageViewEntity == null) {
            return;
        }
        if (checkIsNotEmpty(this.mBgExpend, flexiblePageViewEntity.backgroudImgExpend)) {
            this.mBgExpend.setImageUrl(this.mPageViewEntity.backgroudImgExpend);
            this.mBgExpend.setSkipAutoSize(this.enableAutoJellyMarquee);
            this.mBgExpend.setWhenNullClearImg(this.enableWhenNullClearImgJellyMarquee);
            this.mBgExpend.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (checkIsNotEmpty(this.mBgFolded, this.mPageViewEntity.backgroudImgFolded)) {
            this.mBgFolded.setImageUrl(this.mPageViewEntity.backgroudImgFolded);
            this.mBgFolded.setSkipAutoSize(this.enableAutoJellyMarquee);
            this.mBgFolded.setWhenNullClearImg(this.enableWhenNullClearImgJellyMarquee);
            this.mBgFolded.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (checkIsNotEmpty(this.mTitleExpend, this.mPageViewEntity.titleExpend)) {
            this.mTitleExpend.setText(this.mPageViewEntity.titleExpend);
            this.mTitleExpend.setTextSize(0, adjustDP(i3, 15));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTitleExpend.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = -2;
            layoutParams.height = adjustDP(i3, 22);
            layoutParams.leftMargin = adjustDP(i3, 12);
            layoutParams.topMargin = adjustDP(i3, 8);
            this.mTitleExpend.setLayoutParams(layoutParams);
            if (!TextUtils.isEmpty(this.mPageViewEntity.titleExpendColor) && (parseColor4 = parseColor(this.mPageViewEntity.titleExpendColor)) != 0) {
                this.mTitleExpend.setTextColor(parseColor4);
            }
        }
        if (checkIsNotEmpty(this.mSubTitleExpend, this.mPageViewEntity.subtitleExpend)) {
            this.mSubTitleExpend.setText(this.mPageViewEntity.subtitleExpend);
            this.mSubTitleExpend.setTextSize(0, adjustDP(i3, 12));
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mSubTitleExpend.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams2.width = -2;
            layoutParams2.topMargin = adjustDP(i3, 30);
            layoutParams2.leftMargin = adjustDP(i3, 12);
            this.mSubTitleExpend.setLayoutParams(layoutParams2);
            if (!TextUtils.isEmpty(this.mPageViewEntity.subtitleExpendColor) && (parseColor3 = parseColor(this.mPageViewEntity.subtitleExpendColor)) != 0) {
                this.mSubTitleExpend.setTextColor(parseColor3);
            }
        }
        updateLeftBottomLayout(i3);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.mTitleFoldedLayout.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams3.width = i2;
        this.mTitleFoldedLayout.setLayoutParams(layoutParams3);
        if (checkIsNotEmpty(this.mTitleFolded, this.mPageViewEntity.titleFolded)) {
            this.mTitleFolded.setText(this.mPageViewEntity.titleFolded);
            this.mTitleFolded.setTextSize(0, adjustDP(i3, 15));
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.mTitleFolded.getLayoutParams();
            if (layoutParams4 == null) {
                layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams4.width = i2 - adjustDP(i3, 6);
            layoutParams4.height = adjustDP(i3, 22);
            layoutParams4.topMargin = adjustDP(i3, 8);
            this.mTitleFolded.setLayoutParams(layoutParams4);
            if (!TextUtils.isEmpty(this.mPageViewEntity.titleFoldedColor) && (parseColor2 = parseColor(this.mPageViewEntity.titleFoldedColor)) != 0) {
                this.mTitleFolded.setTextColor(parseColor2);
            }
        }
        if (checkIsNotEmpty(this.mSubTitleFolded, this.mPageViewEntity.subtitleFolded)) {
            this.mSubTitleFolded.setText(this.mPageViewEntity.subtitleFolded);
            this.mSubTitleFolded.setTextSize(0, adjustDP(i3, 12));
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.mSubTitleFolded.getLayoutParams();
            if (layoutParams5 == null) {
                layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams5.width = i2 - adjustDP(i3, 6);
            layoutParams5.topMargin = adjustDP(i3, 30);
            this.mSubTitleFolded.setLayoutParams(layoutParams5);
            if (!TextUtils.isEmpty(this.mPageViewEntity.subtitleFoldedColor) && (parseColor = parseColor(this.mPageViewEntity.subtitleFoldedColor)) != 0) {
                this.mSubTitleFolded.setTextColor(parseColor);
            }
        }
        if (!checkIsNotEmpty(this.mGoodImg, this.mPageViewEntity.poster)) {
            return;
        }
        this.mGoodImg.setSkipAutoSize(this.enableAutoJellyMarquee);
        this.mGoodImg.setWhenNullClearImg(this.enableWhenNullClearImgJellyMarquee);
        this.mGoodImg.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.mGoodImg.getLayoutParams();
        if (layoutParams6 == null) {
            layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        }
        int adjustDP = adjustDP(i3, z ? 80 : 50);
        layoutParams6.height = adjustDP;
        layoutParams6.width = adjustDP;
        layoutParams6.bottomMargin = z ? adjustDP(i3, 6) : adjustDP(i3, 5);
        layoutParams6.rightMargin = z ? (i - adjustDP(i3, 50)) / 2 : adjustDP(i3, 5);
        this.mGoodImg.setLayoutParams(layoutParams6);
        this.mGoodImg.setImageUrl(this.mPageViewEntity.poster, new PhenixOptions().bitmapProcessors(new RoundedCornersBitmapProcessor(adjustDP(i3, 6), 0)).scaleFromLarge(false));
    }

    public void updateLeftBottomLayout(int i) {
        int parseColor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f5f0b7", new Object[]{this, new Integer(i)});
        } else if (!TextUtils.isEmpty(this.mPageViewEntity.buttonTitle) || !TextUtils.isEmpty(this.mPageViewEntity.buttonBackgourdImg)) {
            this.mButtonLayoutExpend.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mButtonLayoutExpend.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = adjustDP(i, 65);
            layoutParams.height = adjustDP(i, 29);
            layoutParams.leftMargin = adjustDP(i, 12);
            layoutParams.bottomMargin = adjustDP(i, 9);
            this.mButtonLayoutExpend.setLayoutParams(layoutParams);
            if (checkIsNotEmpty(this.mButtonBgExpend, this.mPageViewEntity.buttonBackgourdImg)) {
                this.mButtonBgExpend.setImageUrl(this.mPageViewEntity.buttonBackgourdImg);
                this.mButtonBgExpend.setSkipAutoSize(this.enableAutoJellyMarquee);
                this.mButtonBgExpend.setWhenNullClearImg(this.enableWhenNullClearImgJellyMarquee);
                this.mButtonBgExpend.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            if (checkIsNotEmpty(this.mButtonExpend, this.mPageViewEntity.buttonTitle)) {
                this.mButtonExpend.setText(this.mPageViewEntity.buttonTitle);
                this.mButtonExpend.setTextSize(0, adjustDP(i, 12));
                if (!TextUtils.isEmpty(this.mPageViewEntity.buttonTitleColor) && (parseColor = parseColor(this.mPageViewEntity.buttonTitleColor)) != 0) {
                    this.mButtonExpend.setTextColor(parseColor);
                }
            }
            if (!checkIsNotEmpty(this.mButtonIconExpend, this.mPageViewEntity.buttonSuffixIcon)) {
                return;
            }
            this.mButtonIconExpend.setImageUrl(this.mPageViewEntity.buttonSuffixIcon);
            this.mButtonIconExpend.setSkipAutoSize(this.enableAutoJellyMarquee);
            this.mButtonIconExpend.setWhenNullClearImg(this.enableWhenNullClearImgJellyMarquee);
            this.mButtonIconExpend.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mButtonIconExpend.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            }
            layoutParams2.width = adjustDP(i, 9);
            layoutParams2.height = adjustDP(i, 12);
            this.mButtonIconExpend.setLayoutParams(layoutParams2);
        } else {
            this.mButtonLayoutExpend.setVisibility(4);
        }
    }

    public int parseColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{this, str})).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            String str2 = TAG;
            mfj.c(str2, "error parseColor " + str);
            return 0;
        }
    }

    public boolean checkIsNotEmpty(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("735a62cd", new Object[]{this, view, str})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(4);
            return false;
        }
        view.setVisibility(0);
        return true;
    }

    public float getInterpolationShow(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fe2e64de", new Object[]{this, new Float(f)})).floatValue() : Math.max(f - 0.6f, 0.0f) / 0.39999998f;
    }

    public float getInterpolationDismiss(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e3e1ccd", new Object[]{this, new Float(f)})).floatValue() : 1.0f - (Math.min(f, 0.6f) / 0.6f);
    }

    public int adjustDP(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58e38735", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : ((i * i2) << 1) / 210;
    }
}
