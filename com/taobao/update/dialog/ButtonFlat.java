package com.taobao.update.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class ButtonFlat extends Button {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Paint paint;
    public TextView textButton;

    static {
        kge.a(1643473535);
    }

    public static /* synthetic */ Object ipc$super(ButtonFlat buttonFlat, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ButtonFlat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.paint = new Paint();
    }

    @Override // com.taobao.update.dialog.Button
    public void setDefaultProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a83e199", new Object[]{this});
            return;
        }
        this.minHeight = 36;
        this.minWidth = 88;
        this.rippleSize = 3;
        setMinimumHeight(d.dpToPx(this.minHeight, getResources()));
        setMinimumWidth(d.dpToPx(this.minWidth, getResources()));
        setBackgroundResource(R.drawable.background_transparent);
    }

    @Override // com.taobao.update.dialog.Button
    public void setAttributes(AttributeSet attributeSet) {
        String attributeValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8354ae", new Object[]{this, attributeSet});
            return;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", -1);
        if (attributeResourceValue != -1) {
            attributeValue = getResources().getString(attributeResourceValue);
        } else {
            attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "text");
        }
        if (attributeValue != null) {
            this.textButton = new TextView(getContext());
            this.textButton.setText(attributeValue.toUpperCase());
            this.textButton.setTextColor(this.backgroundColor);
            this.textButton.setTypeface(null, 1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13, -1);
            this.textButton.setLayoutParams(layoutParams);
            addView(this.textButton);
        }
        int attributeResourceValue2 = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", -1);
        if (attributeResourceValue2 != -1) {
            setBackgroundColor(getResources().getColor(attributeResourceValue2));
            return;
        }
        this.background = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "background", -1);
        if (this.background == -1) {
            return;
        }
        setBackgroundColor(this.background);
    }

    @Override // com.taobao.update.dialog.CustomView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.x == -1.0f) {
            return;
        }
        this.paint.setAntiAlias(true);
        this.paint.setColor(makePressColor());
        canvas.drawCircle(this.x, this.y, this.radius, this.paint);
        if (this.radius > getHeight() / this.rippleSize) {
            this.radius += this.rippleSpeed;
        }
        if (this.radius >= getWidth()) {
            this.x = -1.0f;
            this.y = -1.0f;
            this.radius = getHeight() / this.rippleSize;
            if (this.onClickListener != null && this.clickAfterRipple) {
                this.onClickListener.onClick(this);
            }
        }
        invalidate();
    }

    @Override // com.taobao.update.dialog.Button
    public int makePressColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5fedbae8", new Object[]{this})).intValue() : Color.parseColor("#88DDDDDD");
    }

    @Override // com.taobao.update.dialog.Button
    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.textButton.setText(str.toUpperCase());
        }
    }

    @Override // com.taobao.update.dialog.Button, android.view.View
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
        this.textButton.setTextColor(i);
    }

    @Override // com.taobao.update.dialog.Button
    public TextView getTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this}) : this.textButton;
    }

    @Override // com.taobao.update.dialog.Button
    public String getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : this.textButton.getText().toString();
    }
}
