package tb;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(715044750);
        emu.a("com.taobao.android.detail.wrapper.utils.DrawableUtils");
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
