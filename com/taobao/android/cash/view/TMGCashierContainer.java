package com.taobao.android.cash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dqh;
import tb.kge;

/* loaded from: classes4.dex */
public class TMGCashierContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-328109813);
    }

    public static /* synthetic */ Object ipc$super(TMGCashierContainer tMGCashierContainer, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TMGCashierContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        float a2 = dqh.a(getContext()) * 24.0f;
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        int save = canvas.save();
        int width = getWidth();
        int height = getHeight();
        path.reset();
        path.addRoundRect(new RectF(0.0f, 0.0f, width, height), new float[]{a2, a2, a2, a2, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
}
