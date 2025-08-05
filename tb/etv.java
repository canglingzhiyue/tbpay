package tb;

import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class etv implements Interpolator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f27573a;

    public etv(float f) {
        this.f27573a = 0.7f;
        this.f27573a = f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue() : f * this.f27573a;
    }
}
