package com.taobao.update.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class Button extends CustomView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROIDXML = "http://schemas.android.com/apk/res/android";
    public int background;
    public int backgroundColor;
    public boolean clickAfterRipple;
    public int minHeight;
    public int minWidth;
    public View.OnClickListener onClickListener;
    public float radius;
    public Integer rippleColor;
    public int rippleSize;
    public float rippleSpeed;
    public TextView textButton;
    public float x;
    public float y;

    static {
        kge.a(-964732442);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public abstract void setAttributes(AttributeSet attributeSet);

    public Button(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rippleSpeed = 12.0f;
        this.rippleSize = 3;
        this.clickAfterRipple = true;
        this.backgroundColor = Color.parseColor("#1E88E5");
        this.x = -1.0f;
        this.y = -1.0f;
        this.radius = -1.0f;
        setDefaultProperties();
        this.clickAfterRipple = attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "animate", true);
        setAttributes(attributeSet);
        this.beforeBackground = this.backgroundColor;
        if (this.rippleColor == null) {
            this.rippleColor = Integer.valueOf(makePressColor());
        }
    }

    public void setDefaultProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a83e199", new Object[]{this});
            return;
        }
        setMinimumHeight(d.dpToPx(this.minHeight, getResources()));
        setMinimumWidth(d.dpToPx(this.minWidth, getResources()));
        setBackgroundResource(this.background);
        setBackgroundColor(this.backgroundColor);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        invalidate();
        if (isEnabled()) {
            this.isLastTouch = true;
            if (motionEvent.getAction() == 0) {
                this.radius = getHeight() / this.rippleSize;
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                this.radius = getHeight() / this.rippleSize;
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                if (motionEvent.getX() > getWidth() || motionEvent.getX() < 0.0f || motionEvent.getY() > getHeight() || motionEvent.getY() < 0.0f) {
                    this.isLastTouch = false;
                    this.x = -1.0f;
                    this.y = -1.0f;
                }
            } else if (motionEvent.getAction() == 1) {
                if (motionEvent.getX() <= getWidth() && motionEvent.getX() >= 0.0f && motionEvent.getY() <= getHeight() && motionEvent.getY() >= 0.0f) {
                    this.radius += 1.0f;
                    if (!this.clickAfterRipple && (onClickListener = this.onClickListener) != null) {
                        onClickListener.onClick(this);
                    }
                } else {
                    this.isLastTouch = false;
                    this.x = -1.0f;
                    this.y = -1.0f;
                }
            } else if (motionEvent.getAction() == 3) {
                this.isLastTouch = false;
                this.x = -1.0f;
                this.y = -1.0f;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
        } else if (z) {
        } else {
            this.x = -1.0f;
            this.y = -1.0f;
        }
    }

    public Bitmap makeCircle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f8e59c3", new Object[]{this});
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth() - d.dpToPx(6.0f, getResources()), getHeight() - d.dpToPx(7.0f, getResources()), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(this.rippleColor.intValue());
        canvas.drawCircle(this.x, this.y, this.radius, paint);
        if (this.radius > getHeight() / this.rippleSize) {
            this.radius += this.rippleSpeed;
        }
        if (this.radius >= getWidth()) {
            this.x = -1.0f;
            this.y = -1.0f;
            this.radius = getHeight() / this.rippleSize;
            View.OnClickListener onClickListener = this.onClickListener;
            if (onClickListener != null && this.clickAfterRipple) {
                onClickListener.onClick(this);
            }
        }
        return createBitmap;
    }

    public int makePressColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fedbae8", new Object[]{this})).intValue();
        }
        int i = this.backgroundColor;
        int i2 = (i >> 8) & 255;
        int i3 = i & 255;
        int i4 = ((i >> 16) & 255) - 30;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i2 - 30;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = i3 - 30;
        if (i6 < 0) {
            i6 = 0;
        }
        return Color.rgb(i4, i5, i6);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.onClickListener = onClickListener;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.backgroundColor = i;
        if (isEnabled()) {
            this.beforeBackground = this.backgroundColor;
        }
        try {
            ((GradientDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(R.id.shape_bacground)).setColor(this.backgroundColor);
            this.rippleColor = Integer.valueOf(makePressColor());
        } catch (Exception unused) {
        }
    }

    public void setRippleSpeed(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afc1b04", new Object[]{this, new Float(f)});
        } else {
            this.rippleSpeed = f;
        }
    }

    public float getRippleSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a083ab8", new Object[]{this})).floatValue() : this.rippleSpeed;
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.textButton.setText(str);
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.textButton.setTextColor(i);
        }
    }

    public TextView getTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this}) : this.textButton;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : this.textButton.getText().toString();
    }
}
