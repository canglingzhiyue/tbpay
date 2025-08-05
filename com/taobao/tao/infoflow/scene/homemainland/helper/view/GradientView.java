package com.taobao.tao.infoflow.scene.homemainland.helper.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class GradientView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Paint mPaint;

    static {
        kge.a(84129844);
    }

    public static /* synthetic */ Object ipc$super(GradientView gradientView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public GradientView(Context context) {
        super(context);
        this.mPaint = new Paint();
    }

    public void setGradientModel(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a657192b", new Object[]{this, aVar});
            return;
        }
        int a2 = aVar.a();
        int b = aVar.b();
        int[] iArr = {a2, b};
        this.mPaint.setShader(new LinearGradient(aVar.c(), aVar.e(), aVar.d(), aVar.f(), iArr, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.mPaint);
    }
}
