package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.LoginInfo;
import com.taobao.alimama.services.a;
import com.taobao.alimama.services.d;
import com.taobao.muniontaobaosdk.util.TaoLog;

/* loaded from: classes4.dex */
public final class dbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(770708737);
    }

    public static void a(String str, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        LoginInfo b = ((d) a.d().a(IBaseService.Names.SERVICE_LOGIN.name())).b();
        String str3 = "";
        if (b == null || !b.isValid()) {
            str2 = str3;
        } else {
            str3 = b.nickname;
            str2 = b.userId;
        }
        TaoLog.Logi("O2OAdSdk", String.format("[step=%s,th=%s,ver=%s,user=%s,uid=%s] args: %s", str, Thread.currentThread().getName(), "5.15.6", str3, str2, StringUtils.join(",", strArr)));
    }
}
