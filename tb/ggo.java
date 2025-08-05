package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class ggo extends ggu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28321a;

    static {
        kge.a(925664241);
    }

    public ggo(boolean z) {
        this.f28321a = z;
        this.c = (short) 15;
    }

    @Override // tb.ggu
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f28321a;
    }

    @Override // tb.ggu
    public ggu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggu) ipChange.ipc$dispatch("16b6ad88", new Object[]{this});
        }
        ggo ggoVar = new ggo(this.f28321a);
        ggoVar.b = this.b;
        return ggoVar;
    }

    @Override // tb.ggu
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null) {
        } else {
            this.f28321a = Boolean.parseBoolean(obj.toString());
        }
    }
}
