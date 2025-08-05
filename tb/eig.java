package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private eie f27318a;
    private eid b;

    static {
        kge.a(-1013805760);
    }

    public eig() {
        emu.a("com.taobao.android.detail.core.open.video.VideoRelate");
    }

    public void a(eie eieVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e4f2f7", new Object[]{this, eieVar});
        } else {
            this.f27318a = eieVar;
        }
    }

    public eie a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eie) ipChange.ipc$dispatch("f0424fd", new Object[]{this}) : this.f27318a;
    }

    public void a(eid eidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e47e98", new Object[]{this, eidVar});
        } else {
            this.b = eidVar;
        }
    }

    public eid b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eid) ipChange.ipc$dispatch("16b5ca3d", new Object[]{this}) : this.b;
    }
}
