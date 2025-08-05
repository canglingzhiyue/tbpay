package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rix extends rjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rjb f33175a;
    public rjb b;
    public rjb c;

    static {
        kge.a(485244525);
    }

    public rix(String str, int i) {
        super(str, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0.equals(tb.riy.EQUAL) != false) goto L10;
     */
    @Override // tb.rjb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rix.a(java.lang.Object):java.lang.Object");
    }

    @Override // tb.rjb
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (riy.AND_NOT.equals(a())) {
            return "{!" + this.f33175a + riy.BLOCK_END_STR;
        } else if (this.f33175a == null) {
            return riy.BLOCK_START_STR + this.b + a() + this.c + riy.BLOCK_END_STR;
        } else {
            return riy.BLOCK_START_STR + this.f33175a + a() + this.b + ":" + this.c + riy.BLOCK_END_STR;
        }
    }
}
