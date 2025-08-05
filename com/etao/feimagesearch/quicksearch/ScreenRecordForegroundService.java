package com.etao.feimagesearch.quicksearch;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class ScreenRecordForegroundService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f6955a = "com.taobao.taobao.plt.MediaService";
    private final String b = "com.taobao.taobao.plt.quick_search";
    private final String c = "com.taobao.taobao.plt.quick_search";
    private final int d = 313;

    static {
        kge.a(-977147412);
    }

    public static /* synthetic */ Object ipc$super(ScreenRecordForegroundService screenRecordForegroundService, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
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
        a();
        return 1;
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 26) {
        } else {
            try {
                PendingIntent a2 = com.android.taobao.aop.a.a(this, 0, new Intent(this, ScreenRecordForegroundService.class), 67108864);
                q.a((Object) a2, "PendingIntent.getActivit….FLAG_IMMUTABLE\n        )");
                NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(this, this.f6955a).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_quick_search)).setSmallIcon(R.drawable.ic_quick_search).setContentTitle(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19064)).setContentText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19048)).setContentIntent(a2);
                NotificationChannel notificationChannel = new NotificationChannel(this.f6955a, this.b, 3);
                notificationChannel.setDescription(this.c);
                Object systemService = getSystemService(RemoteMessageConst.NOTIFICATION);
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
                }
                ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
                startForeground(this.d, contentIntent.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Object systemService = getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.NotificationManager");
        }
        ((NotificationManager) systemService).cancel(this.d);
    }
}
