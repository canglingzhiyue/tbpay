package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.b;
import java.util.Stack;

/* loaded from: classes.dex */
public class fwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b<fqp> f28174a;
    private Stack<fqp> b = new Stack<>();
    private fwy c;

    static {
        kge.a(1514329405);
    }

    public fwu(fwy fwyVar) {
        this.c = fwyVar;
    }

    public fqp a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fqp) ipChange.ipc$dispatch("daab1345", new Object[]{this, new Long(j)});
        }
        b<fqp> bVar = this.f28174a;
        if (bVar == null) {
            return null;
        }
        return bVar.get(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
        r18.f28174a.put(r11, r14);
        r9 = r9 + 1;
        r4 = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r19, tb.fwr r20, com.taobao.android.dinamicx.DXRuntimeContext r21) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fwu.a(int, tb.fwr, com.taobao.android.dinamicx.DXRuntimeContext):boolean");
    }

    public b<fqp> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("df391af0", new Object[]{this}) : this.f28174a;
    }
}
