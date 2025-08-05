package com.taobao.linkmanager.launcher;

import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.task.Coordinator;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.flowcustoms.afc.utils.f;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.remote.HomePageReceiver;
import com.taobao.linkmanager.afc.remote.LoginReceiver;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.afc.utils.d;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.mbm;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17717a;
    private static AtomicBoolean b;

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            c(context);
        }
    }

    static {
        kge.a(1465613939);
        f17717a = false;
        b = new AtomicBoolean(false);
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (!b.compareAndSet(false, true)) {
        } else {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "HomePageTask === executeHomePageTask");
            b(context, z);
        }
    }

    private static void b(final Context context, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
            return;
        }
        if (d.d()) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.linkmanager.launcher.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.linkmanager.flowout.a.a().a(TbFcLinkInit.instance().mApplication);
                    }
                }
            });
        } else {
            com.taobao.linkmanager.flowout.a.a().a(TbFcLinkInit.instance().mApplication);
        }
        if (AfcLifeCycleCenter.isLauncherStart) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.linkmanager.launcher.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (AfcUtils.c(context)) {
                        AfcUtils.d(context);
                        if (z) {
                            com.taobao.flowcustoms.afc.utils.c.a("linkx", "HomePageTask === executeHomePageTask === 首次安装，执行还原逻辑");
                            com.taobao.linkmanager.afc.reduction.c.a().a(context, false);
                        } else {
                            com.taobao.flowcustoms.afc.utils.c.a("linkx", "HomePageTask === executeHomePageTask === 多语言站点，不执行还原逻辑");
                        }
                    }
                    com.taobao.linkmanager.afc.utils.c.a(context);
                }
            });
        } else {
            if (LauncherRuntime.m) {
                mbm.b();
            }
            f17717a = false;
            LocalBroadcastManager.getInstance(context).unregisterReceiver(HomePageReceiver.a.f17677a);
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.linkmanager.launcher.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LoginBroadcastHelper.registerLoginReceiver(context, LoginReceiver.a.f17679a);
                try {
                    a.b(context);
                } catch (Exception e) {
                    com.taobao.flowcustoms.afc.utils.c.a("linkx", "HomePageReceiver === onReceive: 上传渠道信息异常：" + e);
                }
            }
        });
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (context == null || !((Boolean) f.a(context).b("huaWei_first_install", true)).booleanValue()) {
        } else {
            String c = TFCCommonUtils.c(context);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "HomePageReceiver === onReceive === 获取的trackId：" + c);
            HashMap hashMap = new HashMap();
            hashMap.put("imei", AfcUtils.a(context, false));
            hashMap.put("oaid", TFCCommonUtils.b(context));
            hashMap.put("activeTime", AfcUtils.a() + "");
            hashMap.put("hwChannelId", c);
            com.taobao.flowcustoms.afc.utils.b.a(19999, "hw_channel_data", "", "", hashMap);
            f.a(context).a("huaWei_first_install", (Object) false);
        }
    }
}
