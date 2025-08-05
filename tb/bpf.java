package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;

/* loaded from: classes2.dex */
public class bpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1054174310);
    }

    public static String a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("712ee827", new Object[]{sVar});
        }
        StringBuilder sb = new StringBuilder();
        if (sVar == null) {
            sb.append("dxError is null");
            return sb.toString();
        }
        for (s.a aVar : sVar.c) {
            sb.append(aVar.toString());
        }
        return sb.toString();
    }
}
