package tb;

import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes.dex */
public class ija implements iia {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iia f29066a;

    public ija(iia iiaVar) {
        this.f29066a = iiaVar;
    }

    @Override // tb.iia
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f29066a.a(str);
    }

    @Override // tb.iia
    public ihz b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("7d1d49d8", new Object[]{this, str}) : this.f29066a.b(str);
    }

    @Override // tb.iia
    public ihz c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("7dc9f577", new Object[]{this, str}) : this.f29066a.c(str);
    }

    @Override // tb.iia
    public void a(String str, ihy ihyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9dcb28", new Object[]{this, str, ihyVar});
        } else {
            this.f29066a.a(str, ihyVar);
        }
    }
}
