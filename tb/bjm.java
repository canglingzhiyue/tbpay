package tb;

import com.alibaba.android.ultron.engine.protocol.Global;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(498218128);
    }

    public static Global a(bjp bjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Global) ipChange.ipc$dispatch("ce14e69a", new Object[]{bjpVar});
        }
        Global global = new Global();
        global.data = bjpVar.b();
        return global;
    }
}
