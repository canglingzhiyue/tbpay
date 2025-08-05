package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ibf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f28889a;
    public float b;
    public float c;

    static {
        kge.a(990730174);
    }

    public ibf(float f, float f2, float f3) {
        this.f28889a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.f28889a = f;
        this.b = f2;
        this.c = f3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f28889a + "," + this.b + "," + this.c;
    }
}
