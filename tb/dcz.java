package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import com.taobao.adaemon.l;

/* loaded from: classes.dex */
public class dcz extends dcw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-974713974);
    }

    @Override // tb.dcw
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public static dcz d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dcz) ipChange.ipc$dispatch("26188cc0", new Object[0]) : new dcz(null, -1);
    }

    public dcz(String str, int i) {
        super(str, i);
    }

    @Override // tb.dcw
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e.b("RestartChannelAction", com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE, new Object[0]);
        try {
            Intent intent = new Intent();
            intent.setClassName("com.taobao.taobao", "com.taobao.keepalive.SupportService");
            l.e().bindService(intent, new ServiceConnection() { // from class: tb.dcz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                        return;
                    }
                    e.b("RestartChannelAction", "SupportService.onServiceConnected", new Object[0]);
                    try {
                        Messenger messenger = new Messenger(iBinder);
                        Message obtain = Message.obtain();
                        obtain.replyTo = new Messenger(new a());
                        messenger.send(obtain);
                    } catch (Throwable th) {
                        e.a("RestartChannelAction", "onServiceConnected err", th, new Object[0]);
                    }
                }
            }, 1);
        } catch (Throwable th) {
            e.a("RestartChannelAction", "execute err", th, new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-482206027);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            e.b("RestartChannelAction", "RestartHandler handleMessage", new Object[0]);
            if (message == null || message.what != 1) {
                return;
            }
            Process.killProcess(Process.myPid());
        }
    }
}
