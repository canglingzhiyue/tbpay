package com.taobao.tbpoplayer.watermask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.util.e;
import java.io.File;
import tb.caf;
import tb.kge;

/* loaded from: classes9.dex */
public class WaterMaskView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Bitmap bitmap;
    private Paint paint;

    static {
        kge.a(1200628142);
    }

    public static /* synthetic */ Object ipc$super(WaterMaskView waterMaskView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WaterMaskView(Context context) {
        super(context);
    }

    public WaterMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaterMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fede19b", new Object[]{this})).booleanValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = getResources().getDisplayMetrics().densityDpi;
        options.inTargetDensity = getResources().getDisplayMetrics().densityDpi;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        WaterMaskInfo d = a.a().d();
        if (d == null) {
            return false;
        }
        a a2 = a.a();
        Context context = getContext();
        File a3 = a2.a(context, d.imgCode + ".png");
        if (!a3.exists()) {
            return false;
        }
        try {
            this.bitmap = e.a(a3);
            if (this.bitmap == null) {
                c.a("WaterMaskView.init.bitmap=null.cancel", new Object[0]);
                return false;
            }
            c.a("WaterMaskView.init.bitmapWidth=" + this.bitmap.getWidth() + ".bitmapHeight=" + this.bitmap.getHeight(), new Object[0]);
            this.paint = new Paint();
            Paint paint = this.paint;
            Bitmap bitmap = this.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            setAlpha(a.a().b(caf.a().g(), caf.a().f()));
            return true;
        } catch (Throwable th) {
            c.a("WaterMaskView.init.loadBitmapFromFile.error", th);
            return false;
        }
    }

    public void resetAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c1e256", new Object[]{this});
            return;
        }
        float b = a.a().b(caf.a().g(), caf.a().f());
        c.a("WaterMaskView.resetAlpha.alpha=" + b, new Object[0]);
        setAlpha(b);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        c.a("WaterMaskView.destroy", new Object[0]);
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        bitmap.recycle();
        this.bitmap = null;
        c.a("WaterMaskView.destroy.bitmap.recycle", new Object[0]);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.bitmap == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int width2 = this.bitmap.getWidth();
        int height2 = this.bitmap.getHeight();
        int i = width2 / 160;
        int i2 = height / height2;
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            int i4 = i3 * height2;
            for (int i5 = 0; i5 < (width / width2) + 1; i5++) {
                int i6 = (i5 * width2) - (i * i3);
                if (i6 < width) {
                    canvas.drawBitmap(this.bitmap, i6, i4, this.paint);
                }
            }
        }
    }
}
