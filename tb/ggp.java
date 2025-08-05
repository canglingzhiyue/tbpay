package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggp extends ggu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public double f28322a;

    static {
        kge.a(-132002750);
    }

    public ggp(double d) {
        this.f28322a = d;
        this.c = (short) 3;
    }

    @Override // tb.ggu
    public double c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b58", new Object[]{this})).doubleValue() : this.f28322a;
    }

    @Override // tb.ggu
    public ggu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggu) ipChange.ipc$dispatch("16b6ad88", new Object[]{this});
        }
        ggp ggpVar = new ggp(this.f28322a);
        ggpVar.b = this.b;
        return ggpVar;
    }

    @Override // tb.ggu
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            this.f28322a = Double.parseDouble(obj.toString());
        }
    }
}
