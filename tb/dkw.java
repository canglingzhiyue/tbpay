package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dkw extends dkx<dkv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26821a;

    static {
        kge.a(-1383231979);
    }

    @Override // tb.dkx
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public dkw(dkv dkvVar) {
        super(dkvVar);
    }

    public dkw(dkv dkvVar, boolean z) {
        super(dkvVar);
        this.f26821a = z;
    }

    @Override // tb.dkx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f26821a;
    }
}
