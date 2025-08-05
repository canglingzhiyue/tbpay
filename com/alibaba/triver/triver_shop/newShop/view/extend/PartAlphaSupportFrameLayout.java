package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class PartAlphaSupportFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float alphaWidth;
    private Paint leftAlphaPaint;
    private Paint rightAlphaPaint;

    static {
        kge.a(-927655417);
    }

    public static /* synthetic */ Object ipc$super(PartAlphaSupportFrameLayout partAlphaSupportFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -1665133574) {
            super.draw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void access$initPaint(PartAlphaSupportFrameLayout partAlphaSupportFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae9febd", new Object[]{partAlphaSupportFrameLayout});
        } else {
            partAlphaSupportFrameLayout.initPaint();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartAlphaSupportFrameLayout(Context context) {
        super(context);
        q.d(context, "context");
        this.alphaWidth = 100.0f;
        setWillNotDraw(false);
        post(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.PartAlphaSupportFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PartAlphaSupportFrameLayout.access$initPaint(PartAlphaSupportFrameLayout.this);
                }
            }
        });
    }

    private final void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        this.leftAlphaPaint = new Paint();
        Paint paint = this.leftAlphaPaint;
        if (paint == null) {
            q.b("leftAlphaPaint");
            throw null;
        }
        paint.setAntiAlias(true);
        Paint paint2 = this.leftAlphaPaint;
        if (paint2 == null) {
            q.b("leftAlphaPaint");
            throw null;
        }
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = this.leftAlphaPaint;
        if (paint3 != null) {
            paint3.setShader(new LinearGradient(0.0f, 0.0f, this.alphaWidth, 0.0f, Color.convert(Color.argb(0, 0, 0, 0), ColorSpace.get(ColorSpace.Named.SRGB)), Color.convert(Color.argb(255, 0, 0, 0), ColorSpace.get(ColorSpace.Named.SRGB)), Shader.TileMode.CLAMP));
            this.rightAlphaPaint = new Paint();
            Paint paint4 = this.rightAlphaPaint;
            if (paint4 == null) {
                q.b("rightAlphaPaint");
                throw null;
            }
            paint4.setAntiAlias(true);
            Paint paint5 = this.rightAlphaPaint;
            if (paint5 == null) {
                q.b("rightAlphaPaint");
                throw null;
            }
            paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Paint paint6 = this.rightAlphaPaint;
            if (paint6 != null) {
                paint6.setShader(new LinearGradient(getRight() - this.alphaWidth, 0.0f, getRight(), 0.0f, Color.convert(Color.argb(255, 0, 0, 0), ColorSpace.get(ColorSpace.Named.SRGB)), Color.convert(Color.argb(0, 0, 0, 0), ColorSpace.get(ColorSpace.Named.SRGB)), Shader.TileMode.CLAMP));
                return;
            } else {
                q.b("rightAlphaPaint");
                throw null;
            }
        }
        q.b("leftAlphaPaint");
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (canvas == null) {
        } else {
            if (this.leftAlphaPaint == null) {
                super.draw(canvas);
                return;
            }
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.draw(canvas);
            float height = getHeight();
            Paint paint = this.leftAlphaPaint;
            if (paint == null) {
                q.b("leftAlphaPaint");
                throw null;
            }
            canvas.drawRect(0.0f, 0.0f, 250.0f, height, paint);
            float right = getRight() - this.alphaWidth;
            float right2 = getRight();
            float height2 = getHeight();
            Paint paint2 = this.rightAlphaPaint;
            if (paint2 == null) {
                q.b("rightAlphaPaint");
                throw null;
            }
            canvas.drawRect(right, 0.0f, right2, height2, paint2);
            canvas.restore();
        }
    }

    public final void setAlphaSize(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78bb9fc", new Object[]{this, new Float(f)});
            return;
        }
        this.alphaWidth = f;
        initPaint();
        invalidate();
    }
}
