package com.taobao.search.m3.feedback;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class PlaceHolderView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean circle;
    private float currentRadius;
    private final int endColor;
    private final Paint paint;

    static {
        kge.a(-1985650109);
    }

    public static /* synthetic */ Object ipc$super(PlaceHolderView placeHolderView, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ float access$getCurrentRadius$p(PlaceHolderView placeHolderView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("61711f46", new Object[]{placeHolderView})).floatValue() : placeHolderView.currentRadius;
    }

    public static final /* synthetic */ void access$setCurrentRadius$p(PlaceHolderView placeHolderView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7737ba9e", new Object[]{placeHolderView, new Float(f)});
        } else {
            placeHolderView.currentRadius = f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceHolderView(Context context, boolean z, int i) {
        super(context);
        q.c(context, "context");
        this.circle = z;
        this.endColor = i;
        this.paint = new Paint(1);
        this.currentRadius = SimilarButton.Companion.a();
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.search.m3.feedback.PlaceHolderView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    return;
                }
                q.c(view, "view");
                q.c(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), PlaceHolderView.access$getCurrentRadius$p(PlaceHolderView.this));
            }
        });
    }

    public final void updateRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e55a3e", new Object[]{this, new Float(f)});
        } else {
            this.currentRadius = f;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        canvas.drawPaint(this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        fArr[3] = getHeight();
        this.paint.setShader(new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], 0, this.endColor, Shader.TileMode.CLAMP));
    }
}
