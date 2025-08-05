package tb;

import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class reh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1163568816);
    }

    public static r a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("8c2d5a30", new Object[]{str, str2});
        }
        r rVar = new r();
        rVar.a("HY_FAILED");
        rVar.a("errorCode", str);
        rVar.a("errorMsg", str2);
        return rVar;
    }
}
