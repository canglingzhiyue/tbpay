package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;

/* loaded from: classes5.dex */
public class fjh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2050785630);
    }

    public static String a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1174d798", new Object[]{dVar, str}) : (dVar == null || dVar.J() == null || StringUtils.isEmpty(dVar.J().spmCnt)) ? str : dVar.J().spmCnt;
    }
}
