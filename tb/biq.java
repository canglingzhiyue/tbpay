package tb;

import com.alibaba.android.ultron.ext.event.util.f;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;

/* loaded from: classes2.dex */
public class biq implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-197743651);
        kge.a(-175378460);
    }

    @Override // com.alibaba.android.ultron.ext.event.util.f
    public void a(String str, String str2, String str3, String str4, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2c41cc", new Object[]{this, str, str2, str3, str4, new Integer(i), strArr});
        } else {
            UnifyLog.a("ultroncommonpage", str, str2, str3, str4, strArr);
        }
    }
}
