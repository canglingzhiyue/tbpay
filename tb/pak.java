package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.pnk;

/* loaded from: classes8.dex */
public class pak implements pnk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1738487787);
        kge.a(614540096);
    }

    @Override // tb.pnk
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : Login.getUserId();
    }

    @Override // tb.pnk
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : Login.getNick();
    }

    @Override // tb.pnk
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    @Override // tb.pnk
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : Login.getSid();
    }

    @Override // tb.pnk
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : Login.getHeadPicLink();
    }

    @Override // tb.pnk
    public void a(Activity activity, pnk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fdedc0", new Object[]{this, activity, aVar});
        } else {
            Login.login(true);
        }
    }
}
