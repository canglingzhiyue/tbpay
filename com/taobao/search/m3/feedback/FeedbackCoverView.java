package com.taobao.search.m3.feedback;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class FeedbackCoverView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int bgColor;
    private static final int commonTextColor;
    private static final float commonTextSize = 15.0f;
    private static final int descTextColor;
    private static final float descTextSize = 14.0f;
    private static final int imgSize;
    private static final int textMargin;
    private final TextView commonText;
    private final TextView desc;
    private final TUrlImageView img;

    /* renamed from: com.taobao.search.m3.feedback.FeedbackCoverView$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    public FeedbackCoverView(Context context) {
        super(context);
        this.commonText = new TextView(context);
        this.desc = new TextView(context);
        this.img = new TUrlImageView(context);
        addView(this.commonText);
        int i = imgSize;
        addView(this.img, new ViewGroup.LayoutParams(i, i));
        addView(this.desc);
        this.commonText.setTextSize(1, commonTextSize);
        this.desc.setTextSize(1, descTextSize);
        this.commonText.setTextColor(commonTextColor);
        TextPaint paint = this.commonText.getPaint();
        q.a((Object) paint, "commonText.paint");
        paint.setFakeBoldText(true);
        this.desc.setTextColor(descTextColor);
        setBackgroundColor(bgColor);
        setOnClickListener(AnonymousClass1.INSTANCE);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1699510678);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1829585502);
        Companion = new a(null);
        textMargin = l.a(4.5f);
        commonTextColor = Color.parseColor("#111111");
        imgSize = l.a((float) commonTextSize);
        descTextColor = Color.parseColor("#111111");
        bgColor = Color.parseColor("#F2F2F2");
    }

    public final void bind(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94832922", new Object[]{this, str, str2, str3});
            return;
        }
        this.commonText.setText(str);
        this.img.setImageUrl(str2);
        this.desc.setText(str3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int height = (getHeight() - ((rwf.c(this.commonText.getMeasuredHeight(), this.img.getMeasuredHeight()) + textMargin) + this.desc.getMeasuredHeight())) >> 1;
        int c = rwf.c(this.commonText.getMeasuredHeight(), this.img.getMeasuredHeight());
        int width = (getWidth() - (this.commonText.getMeasuredWidth() + this.img.getMeasuredWidth())) >> 1;
        TextView textView = this.commonText;
        textView.layout(width, ((c - textView.getMeasuredHeight()) >> 1) + height, this.commonText.getMeasuredWidth() + width, ((this.commonText.getMeasuredHeight() + c) >> 1) + height);
        this.img.layout(this.commonText.getMeasuredWidth() + width, ((c - this.img.getMeasuredHeight()) >> 1) + height, width + this.commonText.getMeasuredWidth() + this.img.getMeasuredWidth(), ((this.img.getMeasuredHeight() + c) >> 1) + height);
        int i5 = height + c + textMargin;
        int width2 = (getWidth() - this.desc.getMeasuredWidth()) >> 1;
        TextView textView2 = this.desc;
        textView2.layout(width2, i5, textView2.getMeasuredWidth() + width2, this.desc.getMeasuredHeight() + i5);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.commonText.measure(makeMeasureSpec, makeMeasureSpec);
        ViewGroup.LayoutParams layoutParams = this.img.getLayoutParams();
        this.img.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        this.desc.measure(makeMeasureSpec, makeMeasureSpec);
    }
}
