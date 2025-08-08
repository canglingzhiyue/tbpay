package com.taobao.search.m3.feedback;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class FeedbackButton extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int bgColor = -1;
    private static final int imgMargin;
    private static final int imgSize;
    private static final int padding;
    private static final int textColor;
    private static final float textSize = 14.0f;
    private final TUrlImageView img;
    private Float radius;
    private final TextView text;

    public static /* synthetic */ Object ipc$super(FeedbackButton feedbackButton, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(1678911124);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public FeedbackButton(Context context) {
        super(context);
        this.img = new TUrlImageView(context);
        this.text = new TextView(context);
        setOrientation(0);
        setGravity(16);
        int i = imgSize;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = imgMargin;
        layoutParams.leftMargin = padding;
        addView(this.img, layoutParams);
        addView(this.text, new LinearLayout.LayoutParams(-2, -2));
        this.text.setTextSize(1, textSize);
        this.text.setTextColor(textColor);
        this.text.setMaxLines(1);
        this.text.setEllipsize(StringUtils.TruncateAt.END);
        setBackgroundColor(-1);
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.feedback.FeedbackButton.1
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
                Float access$getRadius$p = FeedbackButton.access$getRadius$p(FeedbackButton.this);
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), access$getRadius$p != null ? access$getRadius$p.floatValue() : view.getHeight() / 2.0f);
            }
        });
    }

    public static final /* synthetic */ Float access$getRadius$p(FeedbackButton feedbackButton) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("2b6b5b47", new Object[]{feedbackButton}) : feedbackButton.radius;
    }

    public static final /* synthetic */ void access$setRadius$p(FeedbackButton feedbackButton, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb23100f", new Object[]{feedbackButton, f});
        } else {
            feedbackButton.radius = f;
        }
    }

    static {
        kge.a(-215373236);
        Companion = new a(null);
        imgSize = l.a(18.0f);
        imgMargin = l.a(6.0f);
        padding = l.a(9.0f);
        textColor = Color.parseColor("#333333");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.text.setMaxWidth(((View.MeasureSpec.getSize(i) - (padding * 2)) - imgMargin) - imgSize);
        super.onMeasure(i, i2);
    }

    public final void update(JSONObject data, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f387a0", new Object[]{this, data, new Float(f)});
            return;
        }
        q.c(data, "data");
        this.radius = Float.valueOf(f);
        this.img.setImageUrl(data.getString("icon"));
        this.text.setText(data.getString("text"));
    }
}
