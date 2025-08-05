package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggq extends ggu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f28323a;

    static {
        kge.a(-1325943259);
    }

    public ggq(float f) {
        this.f28323a = f;
        this.c = (short) 17;
    }

    @Override // tb.ggu
    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.f28323a;
    }

    @Override // tb.ggu
    public ggu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggu) ipChange.ipc$dispatch("16b6ad88", new Object[]{this});
        }
        ggq ggqVar = new ggq(this.f28323a);
        ggqVar.b = this.b;
        return ggqVar;
    }

    @Override // tb.ggu
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            this.f28323a = Float.parseFloat(obj.toString());
        }
    }
}
