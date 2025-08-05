package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bik {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bil f25926a;
    private bim b;

    static {
        kge.a(954557003);
    }

    public bil a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bil) ipChange.ipc$dispatch("f02c8b9", new Object[]{this}) : this.f25926a;
    }

    public void a(bil bilVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c997b3", new Object[]{this, bilVar});
        } else {
            this.f25926a = bilVar;
        }
    }

    public bim b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bim) ipChange.ipc$dispatch("16b46e37", new Object[]{this}) : this.b;
    }

    public void a(bim bimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ca0c12", new Object[]{this, bimVar});
        } else {
            this.b = bimVar;
        }
    }
}
