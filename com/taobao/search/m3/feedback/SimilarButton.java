package com.taobao.search.m3.feedback;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class SimilarButton extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int arrowHeight;
    public static final String arrowIcon2024 = "https://gw.alicdn.com/imgextra/i1/O1CN01fPZatB1M97uibx7LX_!!6000000001391-2-tps-19-32.png";
    public static final String arrowIconNor2024 = "https://img.alicdn.com/imgextra/i4/O1CN01tXqqlE1kundFVDkRM_!!6000000004744-2-tps-17-27.png";
    private static final int arrowWidth;
    private static final int listArrowMarginRight;
    private static final int listImgMarginLeft;
    private static final int listImgSize;
    private static final int listOffset;
    private static final int listTextMarginLeft;
    private static final int secondColor;
    private static final int thirdColor;
    private static final float wfImageRadius;
    private static final int wfImgMarginLeft;
    private static final int wfImgSize;
    private static final float wfRadius;
    private static final int wfSecondOffset;
    private static final int wfTextColorLight;
    private static final float wfTextSize = 15.0f;
    private static final int wfThirdOffset;
    private final TUrlImageView arrow;
    private Animator enterAnim;
    private final TUrlImageView img;
    private Float radius;
    private final PlaceHolderView secondView;
    private final TextView text;
    private final PlaceHolderView thirdView;
    private final boolean waterfall;

    public static /* synthetic */ Object ipc$super(SimilarButton similarButton, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(288082032);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : SimilarButton.access$getWfImageRadius$cp();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarButton(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.waterfall = z;
        this.img = new TUrlImageView(context);
        this.secondView = new PlaceHolderView(context, !this.waterfall, secondColor);
        this.thirdView = new PlaceHolderView(context, !this.waterfall, thirdColor);
        this.text = new TextView(context);
        this.arrow = new TUrlImageView(context);
        this.img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int i = this.waterfall ? wfImgSize : listImgSize;
        addView(this.thirdView, new ViewGroup.LayoutParams(i, i));
        addView(this.secondView, new ViewGroup.LayoutParams(i, i));
        addView(this.img, new ViewGroup.LayoutParams(i, i));
        this.img.setClipToOutline(true);
        this.img.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.feedback.SimilarButton.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                q.c(view, "view");
                q.c(outline, "outline");
                Float access$getRadius$p = SimilarButton.access$getRadius$p(SimilarButton.this);
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), access$getRadius$p != null ? access$getRadius$p.floatValue() : !SimilarButton.access$getWaterfall$p(SimilarButton.this) ? view.getHeight() / 2.0f : SimilarButton.Companion.a());
            }
        });
        addView(this.text);
        addView(this.arrow, new ViewGroup.LayoutParams(arrowWidth, arrowHeight));
        this.text.setText(com.alibaba.ability.localization.b.a(R.string.app_find_similar));
        this.text.setTextColor(wfTextColorLight);
        TextPaint paint = this.text.getPaint();
        q.a((Object) paint, "text.paint");
        paint.setFakeBoldText(true);
        this.text.setTextSize(1, wfTextSize);
        setBackgroundColor(-1);
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.feedback.SimilarButton.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                q.c(view, "view");
                q.c(outline, "outline");
                Float access$getRadius$p = SimilarButton.access$getRadius$p(SimilarButton.this);
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), access$getRadius$p != null ? access$getRadius$p.floatValue() : SimilarButton.access$getWaterfall$p(SimilarButton.this) ? SimilarButton.access$getWfRadius$cp() : view.getHeight() / 2.0f);
            }
        });
    }

    public static final /* synthetic */ Float access$getRadius$p(SimilarButton similarButton) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("abf594a7", new Object[]{similarButton}) : similarButton.radius;
    }

    public static final /* synthetic */ boolean access$getWaterfall$p(SimilarButton similarButton) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b99e28e", new Object[]{similarButton})).booleanValue() : similarButton.waterfall;
    }

    public static final /* synthetic */ float access$getWfImageRadius$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("464d5780", new Object[0])).floatValue() : wfImageRadius;
    }

    public static final /* synthetic */ float access$getWfRadius$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d1b0f531", new Object[0])).floatValue() : wfRadius;
    }

    public static final /* synthetic */ void access$setRadius$p(SimilarButton similarButton, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597e1d47", new Object[]{similarButton, f});
        } else {
            similarButton.radius = f;
        }
    }

    static {
        kge.a(-1691439320);
        Companion = new a(null);
        wfRadius = l.a(12.0f);
        wfImgSize = l.a(35.0f);
        listImgSize = l.a(27.0f);
        arrowWidth = l.a(5.5f);
        arrowHeight = l.a(9.0f);
        wfTextColorLight = Color.parseColor("#111111");
        wfImageRadius = l.a(3.0f);
        wfSecondOffset = l.a(7.0f);
        wfThirdOffset = l.a(13.0f);
        listOffset = l.a(5.0f);
        secondColor = Color.parseColor("#CACFD7");
        thirdColor = Color.parseColor("#F3F6F8");
        listImgMarginLeft = l.a(4.0f);
        wfImgMarginLeft = l.a(6.0f);
        listTextMarginLeft = l.a(5.0f);
        listArrowMarginRight = l.a(12.0f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.img.getLayoutParams().width, 1073741824);
        this.img.measure(makeMeasureSpec, makeMeasureSpec);
        this.secondView.measure(makeMeasureSpec, makeMeasureSpec);
        this.thirdView.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.text.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.arrow.measure(View.MeasureSpec.makeMeasureSpec(arrowWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(arrowHeight, 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.waterfall) {
            layoutWaterfall();
        } else {
            layoutList();
        }
    }

    private final void layoutList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e74b6f", new Object[]{this});
            return;
        }
        int i = listImgMarginLeft;
        layoutView(this.img, i);
        layoutView(this.secondView, listOffset + i);
        layoutView(this.thirdView, i + (listOffset * 2));
        layoutView(this.text, this.thirdView.getRight() + listTextMarginLeft);
        layoutView(this.arrow, (getMeasuredWidth() - listArrowMarginRight) - this.arrow.getMeasuredWidth());
    }

    private final void layoutView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7997b767", new Object[]{this, view, new Integer(i)});
        } else {
            view.layout(i, (getMeasuredHeight() - view.getMeasuredHeight()) / 2, view.getMeasuredWidth() + i, (getMeasuredHeight() + view.getMeasuredHeight()) / 2);
        }
    }

    private final void layoutWaterfall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caa0d8f", new Object[]{this});
            return;
        }
        int i = wfImgMarginLeft;
        layoutView(this.img, i);
        layoutView(this.secondView, listOffset + i);
        layoutView(this.thirdView, i + (listOffset * 2));
        layoutView(this.text, this.thirdView.getRight() + listTextMarginLeft);
        layoutView(this.arrow, (getMeasuredWidth() - listArrowMarginRight) - this.arrow.getMeasuredWidth());
    }

    public final void update(String str, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c8cb2e", new Object[]{this, str, new Float(f), new Boolean(z)});
            return;
        }
        this.radius = Float.valueOf(f);
        this.img.setImageUrl(str);
        this.arrow.setImageUrl(z ? arrowIcon2024 : arrowIconNor2024);
        this.secondView.updateRadius(f);
        this.thirdView.updateRadius(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        Animator animator = this.enterAnim;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        Animator animator2 = this.enterAnim;
        if (animator2 == null) {
            q.a();
        }
        animator2.end();
    }

    public final void startEnterAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1103ce", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.img, View.TRANSLATION_X, wfThirdOffset, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.secondView, View.TRANSLATION_X, wfThirdOffset - wfSecondOffset, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.text, View.TRANSLATION_X, -l.a(10.0f), 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.arrow, View.TRANSLATION_X, -l.a(10.0f), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
        this.enterAnim = animatorSet;
    }
}
