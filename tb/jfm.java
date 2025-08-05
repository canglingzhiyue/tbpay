package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jfo;

/* loaded from: classes6.dex */
public class jfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static jfm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfm) ipChange.ipc$dispatch("f06608d", new Object[0]) : new jfm();
    }

    private jfm() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        final jfn jfnVar = new jfn();
        jfl b = jfr.a().b();
        jfr.a().a(jfnVar);
        if (!(b instanceof jfo)) {
            return;
        }
        jfnVar.getClass();
        ((jfo) b).a(new jfo.a() { // from class: tb.-$$Lambda$OcWWb1Zjt98OC8LaH23KdIYZ5Zk
            @Override // tb.jfo.a
            public final void accept(String str, String str2, String str3) {
                jfl.this.a(str, str2, str3);
            }
        });
    }
}
