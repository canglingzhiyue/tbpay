package com.taobao.tao.powermsg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.d;
import com.taobao.tao.messagekit.base.monitor.c;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.powermsg.managers.b;
import com.taobao.tao.powermsg.outter.PowerMsg4JS;
import com.taobao.tao.powermsg.outter.PowerMsg4WW;
import com.taobao.weex.WXSDKEngine;
import java.util.List;
import tb.kge;
import tb.omg;
import tb.omy;
import tb.omz;
import tb.ona;
import tb.onb;
import tb.onc;
import tb.ond;
import tb.one;
import tb.onf;

/* loaded from: classes8.dex */
public class PowerMsgReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1377967678);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            WXSDKEngine.registerModule("powermsg", PowerMsg4JS.class);
            q.a("powermsg", (Class<? extends e>) PowerMsg4WW.class);
            return true;
        } catch (Error unused) {
            MsgLog.c("PMReceiver", "init failed");
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            MsgLog.c("PMReceiver", "register erroooooor");
            return false;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MsgLog.c("PMReceiver", "enter init");
        com.taobao.tao.messagekit.base.d.a().j().a();
        c cVar = new c();
        com.taobao.tao.messagekit.base.d.a().a((d.b) cVar);
        com.taobao.tao.messagekit.base.d.a().a((d.a) cVar);
        com.taobao.tao.messagekit.base.d.a().h().a(new c.d(2, new b(), new c.InterfaceC0870c() { // from class: com.taobao.tao.powermsg.PowerMsgReceiver.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.messagekit.base.monitor.c.InterfaceC0870c
            public long a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : d.b();
            }

            @Override // com.taobao.tao.messagekit.base.monitor.c.InterfaceC0870c
            public boolean a(List<com.taobao.tao.messagekit.base.monitor.b> list, long j) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("19a0788f", new Object[]{this, list, new Long(j)})).booleanValue() : d.a(list, j);
            }

            @Override // com.taobao.tao.messagekit.base.monitor.c.InterfaceC0870c
            public boolean b(List<com.taobao.tao.messagekit.base.monitor.b> list, long j) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a026332e", new Object[]{this, list, new Long(j)})).booleanValue() : d.a(list, j);
            }
        }));
        if (omg.f == -1 || omg.f == 0) {
            com.taobao.tao.messagekit.base.network.b.a(0, new omy());
            com.taobao.tao.messagekit.base.network.b.a(0, new ona());
        }
        if (omg.f == -1 || omg.f == 1) {
            com.taobao.tao.messagekit.base.network.b.a(1, new omz());
            com.taobao.tao.messagekit.base.network.b.a(1, new onb());
        }
        c();
        com.taobao.tao.messagekit.base.d.a().k();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.tao.messagekit.base.d.a().j().a(303, new one());
        onc oncVar = new onc();
        com.taobao.tao.messagekit.base.d.a().j().a(301, oncVar);
        com.taobao.tao.messagekit.base.d.a().j().a(302, oncVar);
        com.taobao.tao.messagekit.base.d.a().j().a(304, new onf());
        com.taobao.tao.messagekit.base.d.a().j().a(306, new ond());
    }

    public static /* synthetic */ Object ipc$super(PowerMsgReceiver powerMsgReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{this, context, intent});
            return;
        }
        MsgLog.c("PMReceiver", "enter initOnReceive");
        try {
            if ("init".equalsIgnoreCase(intent.getStringExtra("key"))) {
                b();
            } else {
                MsgLog.c("PMReceiver", "not init!!!!");
            }
            a();
            omg.a();
        } catch (Throwable th) {
            MsgLog.c("PMReceiver", th, "initOnReceive err");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        MsgLog.c("PMReceiver", "onReceiver action=" + intent.getAction());
        if ("true".equals(com.taobao.tao.messagekit.base.c.a("init_async", "false"))) {
            new Thread(new Runnable() { // from class: com.taobao.tao.powermsg.PowerMsgReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PowerMsgReceiver.this.a(context, intent);
                    }
                }
            }, "PowerMsgReceiverInit").start();
        } else {
            a(context, intent);
        }
    }
}
