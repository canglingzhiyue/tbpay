package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mpy implements mqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final mpy f31193a = new mpy();
    private mqb b = new mpz();

    private mpy() {
    }

    @Override // tb.mqb
    public mqc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mqc) ipChange.ipc$dispatch("f07e5bf", new Object[]{this}) : this.b.a();
    }

    public void a(mqb mqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fb16da", new Object[]{this, mqbVar});
        } else {
            this.b = mqbVar;
        }
    }

    public static mpy b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mpy) ipChange.ipc$dispatch("16b98a07", new Object[0]) : f31193a;
    }
}
