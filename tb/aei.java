package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class aei implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(273945750);
        kge.a(1845411121);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        ael aelVar = new ael(false);
        if (i == 3016) {
            a();
        }
        return aelVar;
    }
}
