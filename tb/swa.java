package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.g;
import com.taobao.tao.homepage.windvane.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class swa implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1810147068);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("wakeSelectArea");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(wVCallBackContext);
    }

    private boolean a(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca15efa9", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        laq c = laq.a().a("Bridge").b("wakeSelectArea").c("homepage.HomePageWVPlugin.wakeSelectArea");
        if (b(wVCallBackContext)) {
            c.a("checkCallback", "true");
            try {
                g.a(wVCallBackContext.getWebview().getContext(), 1);
                c.c("success").b();
                return true;
            } catch (Throwable th) {
                c.a("exception", "showDialog error " + th.getMessage());
                ksr.b("HomePageWVPlugin", "2.0", "wakeSelectArea Exception", "showDialog error : " + th.getMessage(), null, null);
            }
        } else {
            c.a("checkCallback", "false");
            ksr.b("HomePageWVPlugin", "2.0", "wakeSelectArea Exception", "callback checkError", null, null);
        }
        c.c("fail").b();
        return false;
    }

    private boolean b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("efa9f8aa", new Object[]{this, wVCallBackContext})).booleanValue() : (wVCallBackContext == null || wVCallBackContext.getWebview() == null || wVCallBackContext.getWebview().getContext() == null) ? false : true;
    }
}
