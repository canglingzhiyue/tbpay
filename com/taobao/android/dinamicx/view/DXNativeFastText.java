package com.taobao.android.dinamicx.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXNativeFastText extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public StaticLayout staticLayout;
    private float translateX;
    private float translateY;

    static {
        kge.a(513746635);
    }

    public static /* synthetic */ Object ipc$super(DXNativeFastText dXNativeFastText, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DXNativeFastText(Context context) {
        this(context, null);
    }

    public DXNativeFastText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DXNativeFastText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.translateX, this.translateY);
        StaticLayout staticLayout = this.staticLayout;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public void setStaticLayout(StaticLayout staticLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e0e606", new Object[]{this, staticLayout});
        } else {
            this.staticLayout = staticLayout;
        }
    }

    public StaticLayout getStaticLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StaticLayout) ipChange.ipc$dispatch("5b0b5d8c", new Object[]{this}) : this.staticLayout;
    }

    public float getTranslateY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1db2cb8", new Object[]{this})).floatValue() : this.translateY;
    }

    public void setTranslateY(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0616d6c", new Object[]{this, new Float(f)});
        } else {
            this.translateY = f;
        }
    }

    public void setTranslateX(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beac94cd", new Object[]{this, new Float(f)});
        } else {
            this.translateX = f;
        }
    }
}
