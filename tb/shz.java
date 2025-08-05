package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class shz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final psw f33595a;
    private sia b;

    static {
        kge.a(-663360716);
    }

    public shz(psw pswVar) {
        this.f33595a = pswVar;
    }

    public sia a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sia) ipChange.ipc$dispatch("f0a81b3", new Object[]{this}) : this.b;
    }

    public void a(sia siaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec6fa2d", new Object[]{this, siaVar});
        } else {
            this.b = siaVar;
        }
    }
}
