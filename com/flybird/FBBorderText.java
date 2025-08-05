package com.flybird;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.TextView;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.BorderHelper;
import com.alipay.birdnest.view.TextViewWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import tb.drm;

/* loaded from: classes4.dex */
public class FBBorderText extends TextViewWrapper implements IBorderable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BorderHelper f;
    public boolean g;
    public boolean h;
    public TextPaint i;
    public float j;
    public DisplayMetrics k;
    public Context l;

    public FBBorderText(Context context) {
        super(context);
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = 0.0f;
        this.k = null;
        this.f = new BorderHelper();
        this.i = new TextPaint();
        this.l = context;
    }

    public static /* synthetic */ Object ipc$super(FBBorderText fBBorderText, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -260017868:
                super.setTextSize(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 358241672:
                super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
                return null;
            case 678958088:
                super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                return null;
            case 816388344:
                return new Boolean(super.isFocused());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final float a(CharSequence charSequence, TextPaint textPaint, float f, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9684f17", new Object[]{this, charSequence, textPaint, new Float(f), new Float(f2), new Float(f3), new Float(f4), displayMetrics})).floatValue();
        }
        float f5 = (f2 + f3) / 2.0f;
        textPaint.setTextSize(TypedValue.applyDimension(0, f5, displayMetrics));
        float measureText = textPaint.measureText(charSequence, 0, charSequence.length());
        if (f3 - f2 < f4) {
            return f2;
        }
        if (measureText > f) {
            return a(charSequence, textPaint, f, f2, f5, f4, displayMetrics);
        }
        return measureText < f ? a(charSequence, textPaint, f, f5, f3, f4, displayMetrics) : f5;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (width <= 0) {
            return;
        }
        CharSequence text = getText();
        this.i.set(getPaint());
        this.i.setTextSize(this.j * FBDocumentAssistor.getDp());
        float f = width;
        if (f >= this.i.measureText(text, 0, text.length())) {
            return;
        }
        TextPaint textPaint = this.i;
        float dp = this.j * FBDocumentAssistor.getDp();
        Context context = this.l;
        if (this.k == null) {
            if (BirdNestEngine.useValueCache) {
                this.k = (DisplayMetrics) drm.b("Conf:DefDisplayMetrics");
            } else {
                this.k = new DisplayMetrics();
                ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getMetrics(this.k);
            }
        }
        setTextSize(0, a(text, textPaint, f, 0.0f, dp, 0.5f, this.k));
    }

    @Override // com.flybird.IBorderable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.f.a();
        this.f = null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        super.draw(canvas);
        BorderHelper borderHelper = this.f;
        if (borderHelper == null) {
            return;
        }
        borderHelper.b(canvas);
    }

    @Override // android.view.View
    public boolean isFocused() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30a918f8", new Object[]{this})).booleanValue() : this.g || super.isFocused();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        BorderHelper borderHelper = this.f;
        if (borderHelper != null) {
            borderHelper.a(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
        } else if (this.g) {
        } else {
            super.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!this.h) {
        } else {
            setEllipsize(null);
            b();
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorder(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f.a(i, i2);
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorderRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73d1fc", new Object[]{this, new Integer(i)});
        } else {
            this.f.d = i;
        }
    }

    @Override // com.flybird.IBorderable
    public void setBorderRadiusArray(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f810ab", new Object[]{this, fArr});
        }
    }

    public void setForceFocus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbfd19de", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // com.alipay.birdnest.view.TextViewWrapper, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
            return;
        }
        super.setText(charSequence, bufferType);
        if (!this.h) {
            return;
        }
        setEllipsize(null);
        b();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        super.setTextSize(i, f);
        if (this.j != 0.0f) {
            return;
        }
        this.j = f;
    }
}
