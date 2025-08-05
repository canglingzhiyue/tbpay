package com.taobao.weex.ui.view.border;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.dom.CSSShorthand;
import tb.kge;

/* loaded from: classes9.dex */
public class BorderEdge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mBorderWidth;
    private CSSShorthand.EDGE mEdge;
    private BorderCorner mPostCorner;
    private BorderCorner mPreCorner;

    static {
        kge.a(1211358530);
    }

    public BorderEdge set(BorderCorner borderCorner, BorderCorner borderCorner2, float f, CSSShorthand.EDGE edge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BorderEdge) ipChange.ipc$dispatch("2b7ceb28", new Object[]{this, borderCorner, borderCorner2, new Float(f), edge});
        }
        this.mPreCorner = borderCorner;
        this.mPostCorner = borderCorner2;
        this.mBorderWidth = f;
        this.mEdge = edge;
        return this;
    }

    public void drawEdge(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e89de52", new Object[]{this, canvas, paint});
            return;
        }
        paint.setStrokeWidth(this.mBorderWidth);
        BorderCorner borderCorner = this.mPreCorner;
        borderCorner.drawRoundedCorner(canvas, paint, borderCorner.getAngleBisectorDegree());
        paint.setStrokeWidth(this.mBorderWidth);
        canvas.drawLine(this.mPreCorner.getRoundCornerEndX(), this.mPreCorner.getRoundCornerEndY(), this.mPostCorner.getRoundCornerStartX(), this.mPostCorner.getRoundCornerStartY(), paint);
        BorderCorner borderCorner2 = this.mPostCorner;
        borderCorner2.drawRoundedCorner(canvas, paint, borderCorner2.getAngleBisectorDegree() - 45.0f);
    }

    public CSSShorthand.EDGE getEdge() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CSSShorthand.EDGE) ipChange.ipc$dispatch("f827d19a", new Object[]{this}) : this.mEdge;
    }

    public float getBorderWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c84ce3b", new Object[]{this})).floatValue() : this.mBorderWidth;
    }
}
