package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfw extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;

    static {
        kge.a(-75599079);
    }

    public gfw() {
    }

    public gfw(int i, short s) {
        this.c = i;
        a(s);
        a((byte) 2);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.c;
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gfw gfwVar = new gfw();
        gfwVar.c = this.c;
        a(gfwVar);
        return gfwVar;
    }
}
