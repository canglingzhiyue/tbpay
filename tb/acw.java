package tb;

import android.taobao.util.d;
import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes2.dex */
public class acw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1562856748);
    }

    public static d.a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("ddda6a4e", new Object[]{str}) : d.a(str);
    }
}
