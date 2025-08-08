package com.taobao.homepage.dinamic3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import tb.kge;

/* loaded from: classes7.dex */
public class RIconTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int ascent;
    private Drawable drawable;
    private int lineSpacingExtra;
    private int linesNum;
    private final int textMarginLeft;
    private TextPaint textPaint;
    private int textSize;

    static {
        kge.a(-1239245104);
    }

    public RIconTextView(Context context) {
        super(context);
        this.linesNum = 2;
        this.ascent = 0;
        this.textMarginLeft = 3;
        this.textSize = 0;
        init(context, null);
    }

    public RIconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.linesNum = 2;
        this.ascent = 0;
        this.textMarginLeft = 3;
        this.textSize = 0;
        init(context, attributeSet);
    }

    public RIconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.linesNum = 2;
        this.ascent = 0;
        this.textMarginLeft = 3;
        this.textSize = 0;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        this.textPaint = new TextPaint(1);
        this.lineSpacingExtra = 9;
        this.textPaint.setTextSize(getTextSize());
        this.textPaint.setColor(getTextColors().getColorForState(getDrawableState(), 0));
        this.textPaint.setAntiAlias(true);
        this.ascent = (int) this.textPaint.ascent();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
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
        this.textSize = (int) f;
        this.textPaint.setTextSize(f);
        invalidate();
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable == drawable) {
        } else {
            this.drawable = drawable;
            if (this.drawable != null) {
                int paddingTop = (int) (getPaddingTop() - this.textPaint.ascent());
                int intrinsicWidth = this.drawable.getIntrinsicWidth();
                int intrinsicHeight = this.drawable.getIntrinsicHeight();
                int textSize = (int) this.textPaint.getTextSize();
                if (textSize != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * textSize) / intrinsicHeight;
                }
                int descent = (int) (((paddingTop + this.textPaint.descent()) - textSize) / 2.0f);
                this.drawable.setBounds(0, descent, intrinsicWidth, textSize + descent);
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int breakText;
        String str;
        CharSequence charSequence;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (StringUtils.isEmpty(getText())) {
        } else {
            this.ascent = (int) this.textPaint.ascent();
            CharSequence text = getText();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop() - this.ascent;
            Drawable drawable = this.drawable;
            if (drawable != null) {
                i3 = drawable.getBounds().width();
                this.drawable.draw(canvas);
            }
            int i4 = 0;
            if (j.a("enableIconTextViewImprovement", true)) {
                breakText = this.textPaint.breakText(text, 0, text.length(), true, width - i3, null);
            } else {
                breakText = this.textPaint.breakText(text.toString(), true, width - i3, null);
            }
            int i5 = breakText;
            String str2 = "enableIconTextViewImprovement";
            int i6 = paddingTop;
            int i7 = paddingLeft;
            int i8 = width;
            CharSequence charSequence2 = text;
            canvas.drawText(text, 0, i5, i3 + paddingLeft + 3, paddingTop, this.textPaint);
            if (i5 >= charSequence2.length()) {
                return;
            }
            int i9 = 1;
            while (i9 < this.linesNum) {
                int i10 = i9 + 1;
                int i11 = i6 + this.lineSpacingExtra + this.textSize;
                int i12 = i4 + i5;
                float f = i8;
                if (this.textPaint.measureText(charSequence2, i12, charSequence2.length()) > f) {
                    int i13 = i8;
                    CharSequence charSequence3 = charSequence2;
                    String str3 = str2;
                    i5 = this.textPaint.breakText(charSequence2, i12, charSequence2.length(), true, f, null);
                    if (j.a(str3, true)) {
                        CharSequence subSequence = charSequence3.subSequence(i12, i12 + i5);
                        i2 = i7;
                        str = str3;
                        charSequence = charSequence3;
                        i = i12;
                        i6 = i11;
                        canvas.drawText(subSequence, 0, subSequence.length(), i2, i11, this.textPaint);
                    } else {
                        str = str3;
                        charSequence = charSequence3;
                        i = i12;
                        i6 = i11;
                        i2 = i7;
                        canvas.drawText(charSequence.toString().substring(i, i + i5), i2, i6, this.textPaint);
                    }
                    i7 = i2;
                    str2 = str;
                    i9 = i10;
                    charSequence2 = charSequence;
                    i8 = i13;
                    i4 = i;
                } else {
                    CharSequence charSequence4 = charSequence2;
                    canvas.drawText(charSequence4, i12, charSequence4.length(), i7, i11, this.textPaint);
                    return;
                }
            }
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        this.linesNum = i;
        requestLayout();
        invalidate();
    }

    public void setLineSpacingExtra(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf919", new Object[]{this, new Integer(i)});
            return;
        }
        this.lineSpacingExtra = i;
        invalidate();
    }
}
