package com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int TAG_LEFT_RIGHT_PADDING;
    public static final int TAG_TOP_BOTTOM_PADDING;

    static {
        kge.a(394979462);
        TAG_TOP_BOTTOM_PADDING = epo.b(8);
        TAG_LEFT_RIGHT_PADDING = epo.b(9);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.xwraptagview3.XWrapTagViewCommonUtils");
    }

    public static ShapeDrawable a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShapeDrawable) ipChange.ipc$dispatch("d6382f47", new Object[]{new Integer(i), new Integer(i2)});
        }
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.setAlpha(255);
        shapeDrawable.getPaint().setColor(i2);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        return shapeDrawable;
    }
}
