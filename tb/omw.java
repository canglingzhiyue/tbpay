package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* loaded from: classes8.dex */
public class omw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1264142272);
    }

    public static omv a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omv) ipChange.ipc$dispatch("e665ab33", new Object[]{new Integer(i)});
        }
        MsgLog.b("MtopAPIGeneratorFactory", "domainType=" + i);
        if (i != 1 && i == 2) {
            return new omt();
        }
        return new omu();
    }
}
