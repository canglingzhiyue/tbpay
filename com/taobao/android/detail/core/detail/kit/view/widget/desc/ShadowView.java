package com.taobao.android.detail.core.detail.kit.view.widget.desc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ShadowView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBottomShadowFg;
    private Paint mPaint;
    private int mTopShadowFg;

    static {
        kge.a(-1219214992);
    }

    public static /* synthetic */ Object ipc$super(ShadowView shadowView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ShadowView(Context context) {
        super(context);
        init(context);
    }

    public ShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mPaint = new Paint(1);
        this.mTopShadowFg = context.getResources().getColor(R.color.detail_black_10);
        this.mBottomShadowFg = context.getResources().getColor(R.color.detail_black_4);
        setBackgroundColor(getResources().getColor(R.color.detail_e));
        emu.a("com.taobao.android.detail.core.detail.kit.view.widget.desc.ShadowView");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.mPaint.setColor(this.mTopShadowFg);
        float f = width;
        float f2 = height / 2;
        canvas.drawRect(0.0f, 0.0f, f, f2, this.mPaint);
        this.mPaint.setColor(this.mBottomShadowFg);
        canvas.drawRect(0.0f, f2, f, height, this.mPaint);
    }
}
