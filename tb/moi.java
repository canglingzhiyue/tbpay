package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class moi implements moh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final moi f31165a = new moi();
    private moh b = null;

    private moi() {
    }

    public static moi b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (moi) ipChange.ipc$dispatch("16b98456", new Object[0]) : f31165a;
    }

    public void a(moh mohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e1a212", new Object[]{this, mohVar});
        } else {
            this.b = mohVar;
        }
    }

    @Override // tb.moh
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        moh mohVar = this.b;
        return mohVar == null ? "" : mohVar.a();
    }
}
