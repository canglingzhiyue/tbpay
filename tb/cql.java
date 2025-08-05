package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(600805603);
    }

    public static boolean a(ctf ctfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e416b8a7", new Object[]{ctfVar})).booleanValue() : b(ctfVar) || c(ctfVar);
    }

    public static boolean b(ctf ctfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d299bf28", new Object[]{ctfVar})).booleanValue() : "plt_autodetect".equalsIgnoreCase(ctfVar.a()) && ctfVar.b().equalsIgnoreCase("sourceImage");
    }

    public static boolean c(ctf ctfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c11cc5a9", new Object[]{ctfVar})).booleanValue() : "plt_autodetect".equalsIgnoreCase(ctfVar.a()) && ctfVar.b().equalsIgnoreCase("cropImage");
    }
}
