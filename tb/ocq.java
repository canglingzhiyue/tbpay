package tb;

import android.content.BroadcastReceiver;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;

/* loaded from: classes8.dex */
public class ocq implements nzk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ocq f31920a;

        static {
            kge.a(-1562000500);
            f31920a = new ocq();
        }

        public static /* synthetic */ ocq a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ocq) ipChange.ipc$dispatch("f089ba1", new Object[0]) : f31920a;
        }
    }

    static {
        kge.a(-1000035143);
        kge.a(1977467223);
    }

    public static ocq d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ocq) ipChange.ipc$dispatch("261d8bbe", new Object[0]) : a.a();
    }

    private ocq() {
    }

    @Override // tb.nzk
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            Login.login(z);
        }
    }

    @Override // tb.nzk
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : Login.getUserId();
    }

    @Override // tb.nzk
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    @Override // tb.nzk
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : Login.getHeadPicLink();
    }

    @Override // tb.nzk
    public void a(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db70fdf", new Object[]{this, broadcastReceiver});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(com.taobao.tao.config.a.a(), broadcastReceiver);
        }
    }

    @Override // tb.nzk
    public void b(BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d500be", new Object[]{this, broadcastReceiver});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(com.taobao.tao.config.a.a(), broadcastReceiver);
        }
    }
}
