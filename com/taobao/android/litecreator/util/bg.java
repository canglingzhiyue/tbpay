package com.taobao.android.litecreator.util;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/litecreator/util/LCUIUtils;", "", "()V", "Companion", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class bg {
    public static final a Companion;

    static {
        kge.a(-2029833507);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/taobao/android/litecreator/util/LCUIUtils$Companion;", "", "()V", "getRoundRect", "Landroid/graphics/drawable/ShapeDrawable;", "radius", "", "color", "radiusTopLeft", "radiusTopRight", "radiusBottomLeft", "radiusBottomRight", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1859457563);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final ShapeDrawable a(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ShapeDrawable) ipChange.ipc$dispatch("d6382f47", new Object[]{this, new Integer(i), new Integer(i2)}) : a(i, i, i, i, i2);
        }

        private final ShapeDrawable a(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShapeDrawable) ipChange.ipc$dispatch("d4c4845a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            }
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            RoundRectShape roundRectShape = new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            Paint paint = shapeDrawable.getPaint();
            kotlin.jvm.internal.q.b(paint, "bgDrawable.paint");
            paint.setColor(i5);
            return shapeDrawable;
        }
    }
}
