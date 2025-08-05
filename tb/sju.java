package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public final class sju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-532346316);
    }

    public static String a(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b74919c", new Object[]{pswVar}) : (pswVar.D() == null || pswVar.D().f() == null) ? "" : pswVar.D().f().title;
    }

    public static String b(psw pswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c213d3b", new Object[]{pswVar}) : (pswVar.D() == null || !pswVar.D().s()) ? "" : "1";
    }
}
