package tb;

import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.GradientColorVO;

/* loaded from: classes9.dex */
public class rmk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1593592837);
    }

    public static GradientDrawable a(int i, int i2, int i3, float f, GradientColorVO gradientColorVO) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("ef9cdda4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Float(f), gradientColorVO});
        }
        if (gradientColorVO != null) {
            gradientDrawable = gradientColorVO.type == GradientColorVO.VERTICAL ? new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, gradientColorVO.colors) : new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, gradientColorVO.colors);
        } else {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(i);
            gradientDrawable = gradientDrawable2;
        }
        gradientDrawable.setGradientType(0);
        gradientDrawable.setStroke(i3, i2);
        gradientDrawable.setCornerRadius(f);
        return gradientDrawable;
    }
}
