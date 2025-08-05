package com.taobao.wireless.link.notification;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rkg;

/* loaded from: classes9.dex */
public class NotificationService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1536237891);
    }

    public static /* synthetic */ Object ipc$super(NotificationService notificationService, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return 2;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        rkg.a("link_tag", "NotificationService === onStartCommand == 开启消息前台服务");
        try {
            Notification a2 = b.a((Context) this, com.taobao.wireless.link.controller.a.a().f23587a, false);
            if (a2 == null) {
                return;
            }
            startForeground(20191111, a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
