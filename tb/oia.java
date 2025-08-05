package tb;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class oia extends LinearSmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f32078a;

    public static /* synthetic */ Object ipc$super(oia oiaVar, String str, Object... objArr) {
        if (str.hashCode() == -1142219598) {
            return new Float(super.calculateSpeedPerPixel((DisplayMetrics) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue() : i3 - i;
    }

    static {
        kge.a(-1729292917);
        f32078a = 1.0f;
    }

    public oia(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
        }
        float calculateSpeedPerPixel = super.calculateSpeedPerPixel(displayMetrics);
        float f = f32078a;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        return calculateSpeedPerPixel * (1.0f / f);
    }
}
