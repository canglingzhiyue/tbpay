package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class bhr implements bhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bhq f25914a;

    static {
        kge.a(359428021);
        kge.a(1378917592);
    }

    public bhr(bhq bhqVar) {
        this.f25914a = bhqVar;
    }

    @Override // tb.bhq
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        bhq bhqVar = this.f25914a;
        if (bhqVar == null) {
            return;
        }
        bhqVar.a(str, i);
    }

    @Override // tb.bhq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        bhq bhqVar = this.f25914a;
        if (bhqVar == null) {
            return;
        }
        bhqVar.a(str, str2);
    }
}
