package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aet {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static aew c;

    static {
        kge.a(197348267);
        c = null;
    }

    public static aew c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aew) ipChange.ipc$dispatch("1e659169", new Object[0]) : c;
    }

    public static void a(aew aewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe16125", new Object[]{aewVar});
        } else {
            c = aewVar;
        }
    }
}
