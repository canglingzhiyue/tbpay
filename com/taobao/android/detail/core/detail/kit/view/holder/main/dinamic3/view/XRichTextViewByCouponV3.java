package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.eck;
import tb.emu;
import tb.epo;
import tb.fpr;
import tb.kge;

/* loaded from: classes4.dex */
public class XRichTextViewByCouponV3 extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int ascent;
    private Drawable drawable;
    public int drawableH;
    public Rect drawableRect;
    public int drawableW;
    private int imageTextSpace;
    private int lineSpacingExtra;
    private int linesNum;
    private NinePatch np;
    private Rect npRect;
    private String separator;
    private Drawable targetBgDrawable;
    private Drawable textBgDrawable;
    private final int textMarginLeft;
    private TextPaint textPaint;
    private int textSpace;
    private int xIconHeight;
    private int xTextBgPaddingH;
    private int xTextBgPaddingV;

    static {
        kge.a(296112054);
    }

    public static /* synthetic */ Object ipc$super(XRichTextViewByCouponV3 xRichTextViewByCouponV3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 362446068:
                super.setLineSpacing(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 835841791:
                super.setMaxLines(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public XRichTextViewByCouponV3(Context context) {
        super(context);
        this.linesNum = 1;
        this.ascent = 0;
        this.imageTextSpace = epo.b(5);
        this.textSpace = epo.b(5);
        this.textMarginLeft = 0;
        init(context, null);
    }

    public XRichTextViewByCouponV3(Context context, AttributeSet attributeSet) {
        super(context);
        this.linesNum = 1;
        this.ascent = 0;
        this.imageTextSpace = epo.b(5);
        this.textSpace = epo.b(5);
        this.textMarginLeft = 0;
        init(context, attributeSet);
    }

    public XRichTextViewByCouponV3(Context context, AttributeSet attributeSet, int i) {
        super(context);
        this.linesNum = 1;
        this.ascent = 0;
        this.imageTextSpace = epo.b(5);
        this.textSpace = epo.b(5);
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
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XRichTextViewByCouponV3");
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
        this.textPaint.setTextSize(f);
        invalidate();
    }

    public void setSeparator(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f2e2f4", new Object[]{this, str});
        } else {
            this.separator = str;
        }
    }

    public void setXIconHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbc5946", new Object[]{this, new Integer(i)});
        } else {
            this.xIconHeight = fpr.b(getContext(), i);
        }
    }

    public void setTextBgPaddingH(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f20271", new Object[]{this, new Integer(i)});
        } else {
            this.xTextBgPaddingH = i;
        }
    }

    public void setTextBgPaddingV(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd5db23", new Object[]{this, new Integer(i)});
        } else {
            this.xTextBgPaddingV = i;
        }
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable == drawable) {
        } else {
            this.drawable = drawable;
            if (this.drawable != null) {
                getPaddingTop();
                this.textPaint.ascent();
                int intrinsicWidth = this.drawable.getIntrinsicWidth();
                int intrinsicHeight = this.drawable.getIntrinsicHeight();
                int i = this.xIconHeight;
                if (i != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * i) / intrinsicHeight;
                }
                this.drawableW = intrinsicWidth;
                this.drawableH = i;
                this.drawableRect = new Rect();
            }
            invalidate();
        }
    }

    public void setTextBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aa4668", new Object[]{this, drawable});
        } else if (drawable != null && drawable.equals(this.textBgDrawable)) {
        } else {
            this.textBgDrawable = drawable;
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (StringUtils.isEmpty(getText())) {
        } else {
            this.ascent = (int) this.textPaint.ascent();
            CharSequence text = getText();
            String[] split = StringUtils.isEmpty(this.separator) ? new String[]{text.toString()} : text.toString().split(this.separator);
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            getPaddingTop();
            if (this.drawable != null) {
                int i3 = this.drawableW;
                Rect rect = this.drawableRect;
                rect.left = 0;
                rect.right = i3;
                rect.top = (getHeight() - this.drawableH) / 2;
                Rect rect2 = this.drawableRect;
                rect2.bottom = rect2.top + this.drawableH;
                this.drawable.setBounds(this.drawableRect);
                this.drawable.draw(canvas);
                i = i3;
            } else {
                i = 0;
            }
            int i4 = i == 0 ? 0 : this.imageTextSpace;
            int i5 = 0;
            int i6 = 0;
            while (i5 < split.length) {
                int breakText = this.textPaint.breakText(split[i5], z, (width - i) - i4, null);
                int i7 = i5 + 1;
                int i8 = this.xTextBgPaddingH;
                int i9 = z ? 1 : 0;
                int i10 = z ? 1 : 0;
                int paddingRight = (paddingLeft * i7) + (getPaddingRight() * i5) + i + i6 + i4 + (i8 * ((i5 * 2) + i9));
                int measureText = i6 + ((int) this.textPaint.measureText(split[i5], 0, split[i5].length())) + this.textSpace;
                if (paddingRight + measureText > getWidth()) {
                    return;
                }
                int height = ((getHeight() - ((int) this.textPaint.getTextSize())) / i2) - this.xTextBgPaddingV;
                if (this.textBgDrawable != null) {
                    Rect rect3 = new Rect(paddingRight - this.xTextBgPaddingH, height, ((int) this.textPaint.measureText(split[i5], 0, split[i5].length())) + paddingRight + this.xTextBgPaddingH, ((int) this.textPaint.getTextSize()) + height + (this.xTextBgPaddingV * 2));
                    if (!eck.a(this.targetBgDrawable) && (bitmap = ((BitmapDrawable) this.textBgDrawable).getBitmap()) != null) {
                        this.targetBgDrawable = eck.a(getContext(), this.textBgDrawable, eck.a(bitmap.getHeight(), rect3), bitmap.getWidth() / 2);
                    }
                    if (eck.a(this.targetBgDrawable)) {
                        this.targetBgDrawable.setBounds(rect3);
                        this.targetBgDrawable.draw(canvas);
                    }
                }
                Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
                canvas.drawText(split[i5], 0, breakText, paddingRight, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), (Paint) this.textPaint);
                i5 = i7;
                i6 = measureText;
                z = true;
                i2 = 2;
            }
        }
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc237851", new Object[]{drawable});
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
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

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseTargetBgDrawableImg();
    }

    public void releaseTargetBgDrawableImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65fdfaf", new Object[]{this});
            return;
        }
        Drawable drawable = this.textBgDrawable;
        if (drawable != null && drawable.equals(this.targetBgDrawable)) {
            return;
        }
        releaseImg(this.targetBgDrawable);
        this.targetBgDrawable = null;
    }

    private void releaseImg(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd16a67", new Object[]{this, drawable});
        } else if (!eck.a(drawable)) {
        } else {
            ((BitmapDrawable) drawable).getBitmap().recycle();
        }
    }
}
