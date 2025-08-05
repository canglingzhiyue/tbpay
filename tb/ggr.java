package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggr extends ggu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28324a;

    static {
        kge.a(600122488);
    }

    @Override // tb.ggu
    @Deprecated
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f28324a;
    }

    public ggr(int i) {
        this.f28324a = i;
        this.c = (short) 1;
    }

    @Override // tb.ggu
    public ggu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggu) ipChange.ipc$dispatch("16b6ad88", new Object[]{this});
        }
        ggr ggrVar = new ggr(this.f28324a);
        ggrVar.b = this.b;
        return ggrVar;
    }

    @Override // tb.ggu
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            this.f28324a = Integer.parseInt(obj.toString());
        }
    }
}
