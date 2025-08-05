package com.taobao.message.uikit.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class TextDrawable extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int[] appearanceAttributes;
    private static final int[] themeAttributes;
    private Resources mResources;
    private ColorStateList mTextColors;
    private StaticLayout mTextLayout;
    private Path mTextPath;
    private Layout.Alignment mTextAlignment = Layout.Alignment.ALIGN_NORMAL;
    private CharSequence mText = "";
    private Rect mTextBounds = new Rect();
    private TextPaint mTextPaint = new TextPaint(1);

    public static /* synthetic */ Object ipc$super(TextDrawable textDrawable, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(138683188);
        themeAttributes = new int[]{16842804};
        appearanceAttributes = new int[]{16842901, 16842902, 16842903, 16842904};
    }

    public TextDrawable(Context context) {
        ColorStateList colorStateList;
        int i;
        int i2;
        this.mResources = context.getResources();
        this.mTextPaint.density = this.mResources.getDisplayMetrics().density;
        this.mTextPaint.setDither(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(themeAttributes);
        int i3 = -1;
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        Typeface typeface = null;
        TypedArray obtainStyledAttributes2 = resourceId != -1 ? context.obtainStyledAttributes(resourceId, appearanceAttributes) : null;
        if (obtainStyledAttributes2 != null) {
            colorStateList = null;
            i = 15;
            i2 = -1;
            for (int i4 = 0; i4 < obtainStyledAttributes2.getIndexCount(); i4++) {
                int index = obtainStyledAttributes2.getIndex(i4);
                if (index == 0) {
                    try {
                        i = obtainStyledAttributes2.getDimensionPixelSize(index, i);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else if (index == 1) {
                    i3 = obtainStyledAttributes2.getInt(index, i3);
                } else if (index == 2) {
                    i2 = obtainStyledAttributes2.getInt(index, i2);
                } else if (index == 3) {
                    colorStateList = obtainStyledAttributes2.getColorStateList(index);
                }
            }
            obtainStyledAttributes2.recycle();
        } else {
            colorStateList = null;
            i = 15;
            i2 = -1;
        }
        setTextColor(colorStateList == null ? ColorStateList.valueOf(-16777216) : colorStateList);
        setRawTextSize(i);
        if (i3 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i3 == 2) {
            typeface = Typeface.SERIF;
        } else if (i3 == 3) {
            typeface = Typeface.MONOSPACE;
        }
        setTypeface(typeface, i2);
    }

    public void setText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.mText = charSequence;
        measureContent();
    }

    public CharSequence getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("27ef5fd0", new Object[]{this}) : this.mText;
    }

    public float getTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue() : this.mTextPaint.getTextSize();
    }

    public void setTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5eecc9", new Object[]{this, new Float(f)});
        } else {
            setTextSize(2, f);
        }
    }

    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
        } else {
            setRawTextSize(TypedValue.applyDimension(i, f, this.mResources.getDisplayMetrics()));
        }
    }

    private void setRawTextSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cdbf45", new Object[]{this, new Float(f)});
        } else if (f == this.mTextPaint.getTextSize()) {
        } else {
            this.mTextPaint.setTextSize(f);
            measureContent();
        }
    }

    public float getTextScaleX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cafe7c8", new Object[]{this})).floatValue() : this.mTextPaint.getTextScaleX();
    }

    public void setTextScaleX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7024145c", new Object[]{this, new Float(f)});
        } else if (f == this.mTextPaint.getTextScaleX()) {
        } else {
            this.mTextPaint.setTextScaleX(f);
            measureContent();
        }
    }

    public Layout.Alignment getTextAlign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Layout.Alignment) ipChange.ipc$dispatch("3704020f", new Object[]{this}) : this.mTextAlignment;
    }

    public void setTextAlign(Layout.Alignment alignment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82059b79", new Object[]{this, alignment});
        } else if (this.mTextAlignment == alignment) {
        } else {
            this.mTextAlignment = alignment;
            measureContent();
        }
    }

    public Shader setShader(Shader shader) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Shader) ipChange.ipc$dispatch("edc5072", new Object[]{this, shader}) : this.mTextPaint.setShader(shader);
    }

    public void setTypeface(Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9d3566", new Object[]{this, typeface});
        } else if (this.mTextPaint.getTypeface() == typeface) {
        } else {
            this.mTextPaint.setTypeface(typeface);
            measureContent();
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface create;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9509ea5d", new Object[]{this, typeface, new Integer(i)});
            return;
        }
        float f = 0.0f;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            TextPaint textPaint = this.mTextPaint;
            if ((i2 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.mTextPaint;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    public Typeface getTypeface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("3161bb0a", new Object[]{this}) : this.mTextPaint.getTypeface();
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            setTextColor(ColorStateList.valueOf(i));
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac309779", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColors = colorStateList;
        updateTextColors(getState());
    }

    public void setTextPath(Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980a25d", new Object[]{this, path});
        } else if (this.mTextPath == path) {
        } else {
            this.mTextPath = path;
            measureContent();
        }
    }

    private void measureContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e97042", new Object[]{this});
            return;
        }
        if (this.mTextPath != null) {
            this.mTextLayout = null;
            this.mTextBounds.setEmpty();
        } else {
            this.mTextLayout = new StaticLayout(this.mText, this.mTextPaint, (int) Layout.getDesiredWidth(this.mText, this.mTextPaint), this.mTextAlignment, 1.0f, 0.0f, false);
            this.mTextBounds.set(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        }
        invalidateSelf();
    }

    private boolean updateTextColors(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f891ffff", new Object[]{this, iArr})).booleanValue();
        }
        int colorForState = this.mTextColors.getColorForState(iArr, -1);
        if (this.mTextPaint.getColor() == colorForState) {
            return false;
        }
        this.mTextPaint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
        } else {
            this.mTextBounds.set(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b242421", new Object[]{this})).booleanValue() : this.mTextColors.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ffd309b", new Object[]{this, iArr})).booleanValue() : updateTextColors(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        if (!this.mTextBounds.isEmpty()) {
            return this.mTextBounds.bottom - this.mTextBounds.top;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        if (!this.mTextBounds.isEmpty()) {
            return this.mTextBounds.right - this.mTextBounds.left;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.mTextPath == null) {
            this.mTextLayout.draw(canvas);
        } else {
            canvas.drawTextOnPath(this.mText.toString(), this.mTextPath, 0.0f, 0.0f, this.mTextPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else if (this.mTextPaint.getAlpha() == i) {
        } else {
            this.mTextPaint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue() : this.mTextPaint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else if (this.mTextPaint.getColorFilter() == colorFilter) {
        } else {
            this.mTextPaint.setColorFilter(colorFilter);
        }
    }
}
