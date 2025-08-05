package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ibg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f28890a;
    public float b;

    static {
        kge.a(1397396772);
    }

    public ibg(float f, float f2) {
        this.f28890a = 0.0f;
        this.b = 0.0f;
        this.f28890a = f;
        this.b = f2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f28890a + "," + this.b;
    }
}
