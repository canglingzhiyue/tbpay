package com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class XRichTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int ascent;
    private Drawable drawable;
    private int imageTextSpace;
    private int lineSpacingExtra;
    private int linesNum;
    private boolean mHasJoinedIconAndText;
    private String mSpanColor;
    private SpannableStringBuilder mSpannableStringBuilder;
    private final int textMarginLeft;
    private TextPaint textPaint;

    static {
        kge.a(1027359890);
    }

    public static /* synthetic */ Object ipc$super(XRichTextView xRichTextView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -260017868:
                super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -58656792:
                super.setTextColor(((Number) objArr[0]).intValue());
                return null;
            case 362446068:
                super.setLineSpacing(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 835841791:
                super.setMaxLines(((Number) objArr[0]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public XRichTextView(Context context) {
        super(context);
        this.linesNum = 2;
        this.ascent = 0;
        this.imageTextSpace = epo.b(5);
        this.mHasJoinedIconAndText = false;
        this.textMarginLeft = 0;
        init(context, null);
    }

    public XRichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.linesNum = 2;
        this.ascent = 0;
        this.imageTextSpace = epo.b(5);
        this.mHasJoinedIconAndText = false;
        this.textMarginLeft = 0;
        init(context, attributeSet);
    }

    public XRichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.linesNum = 2;
        this.ascent = 0;
        this.imageTextSpace = epo.b(5);
        this.mHasJoinedIconAndText = false;
        this.textMarginLeft = 0;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.textPaint = new TextPaint(1);
        this.lineSpacingExtra = 3;
        this.textPaint.setTextSize(getTextSize());
        this.textPaint.setColor(getTextColors().getColorForState(getDrawableState(), 0));
        this.textPaint.setAntiAlias(true);
        setLineSpacing(this.lineSpacingExtra, 1.0f);
        this.ascent = (int) this.textPaint.ascent();
        emu.a("com.taobao.android.detail.core.detail.kit.view.dinamic_ext.view.XRichTextView");
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setTextColor(i);
        this.textPaint.setColor(i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        super.setTextSize(i, f);
        this.textPaint.setTextSize(f);
        requestLayout();
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable == drawable) {
        } else {
            this.drawable = drawable;
            if (this.drawable == null || this.mHasJoinedIconAndText) {
                return;
            }
            joinIconAndTextInner();
        }
    }

    public void setImageTextSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5480a59c", new Object[]{this, new Integer(i)});
            return;
        }
        this.imageTextSpace = epo.b(i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        this.linesNum = i;
        super.setMaxLines(i);
        requestLayout();
        invalidate();
    }

    public void setLineSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727ca22c", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.lineSpacingExtra = i;
            super.setLineSpacing(i, 1.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resizeDrawableByHeight(int i, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af14690", new Object[]{this, new Integer(i), drawable});
        } else if (drawable == null || i <= 0) {
        } else {
            double intrinsicWidth = drawable.getIntrinsicWidth();
            double intrinsicHeight = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, intrinsicHeight != mto.a.GEO_NOT_SUPPORT ? (int) Math.ceil(i * (intrinsicWidth / intrinsicHeight)) : 0, i);
        }
    }

    private void joinIconAndTextInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26d077c", new Object[]{this});
            return;
        }
        if (this.mSpannableStringBuilder == null) {
            if (!TextUtils.isEmpty(getText())) {
                this.mSpannableStringBuilder = new SpannableStringBuilder(getText());
            } else {
                this.mSpannableStringBuilder = new SpannableStringBuilder();
            }
        }
        if (this.drawable != null) {
            resizeDrawableByHeight((int) this.textPaint.getTextSize(), this.drawable);
            a aVar = new a(this.drawable, 2);
            SpannableStringBuilder insert = this.mSpannableStringBuilder.insert(0, (CharSequence) "  ");
            insert.setSpan(aVar, 0, 1, 33);
            this.mSpannableStringBuilder = insert;
            this.mHasJoinedIconAndText = true;
        }
        setText(this.mSpannableStringBuilder);
    }

    public SpannableStringBuilder getSpannableStringBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpannableStringBuilder) ipChange.ipc$dispatch("bfbde54c", new Object[]{this}) : this.mSpannableStringBuilder;
    }

    public void setSpannableStringBuilder(SpannableStringBuilder spannableStringBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9571e", new Object[]{this, spannableStringBuilder});
            return;
        }
        this.mSpannableStringBuilder = spannableStringBuilder;
        joinIconAndTextInner();
    }

    public String getSpanColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e91d5756", new Object[]{this}) : this.mSpanColor;
    }

    public void setSpanColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bccb4f48", new Object[]{this, str});
        } else {
            this.mSpanColor = str;
        }
    }

    public int getSpanColorInt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631d83e6", new Object[]{this})).intValue();
        }
        if (!TextUtils.isEmpty(this.mSpanColor)) {
            return Color.parseColor(this.mSpanColor);
        }
        return getCurrentTextColor();
    }
}
