package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes6.dex */
public class hxh implements hzx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(268341644);
        kge.a(23215758);
    }

    @Override // tb.hzx
    public void a(String str, String str2, String str3, String str4, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2c41cc", new Object[]{this, str, str2, str3, str4, new Integer(i), strArr});
        } else {
            UnifyLog.a("order", str, str2, str3, str4, strArr);
        }
    }
}
