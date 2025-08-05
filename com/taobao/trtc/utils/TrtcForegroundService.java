package com.taobao.trtc.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcForegroundService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_START = "action_start";
    public static final String ACTION_STOP = "action_stop";
    public static final String NOTIFICATION_CONTENT_TEXT = "notification_content_text";
    public static final String NOTIFICATION_CONTENT_TITLE = "notification_content_title";

    /* renamed from: a  reason: collision with root package name */
    private static final String f23182a;
    private String b;
    private String c;
    private boolean d = false;

    public static /* synthetic */ Object ipc$super(TrtcForegroundService trtcForegroundService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1992651935) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    static {
        kge.a(-1675247720);
        f23182a = TrtcForegroundService.class.getName();
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TrtcLog.d(f23182a, "onCreate()");
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.d(f23182a, "onDestroy()");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        String str = null;
        if (intent != null) {
            str = intent.getAction();
        }
        if (str == null) {
            return super.onStartCommand(intent, i, i2);
        }
        this.b = intent.getStringExtra(NOTIFICATION_CONTENT_TITLE);
        this.c = intent.getStringExtra(NOTIFICATION_CONTENT_TEXT);
        String str2 = f23182a;
        TrtcLog.d(str2, "onStartCommand, action: " + str);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1583723627) {
            if (hashCode == 1850778905 && str.equals(ACTION_START)) {
                c = 0;
            }
        } else if (str.equals(ACTION_STOP)) {
            c = 1;
        }
        if (c == 0) {
            b();
        } else if (c == 1) {
            a();
        }
        return super.onStartCommand(intent, i, i2);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String str = f23182a;
        TrtcLog.d(str, "stopForegroundService, isForeground: " + this.d);
        if (!this.d) {
            return;
        }
        this.d = false;
        stopSelf();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = f23182a;
        TrtcLog.d(str, "startForegroundService, isForeground: " + this.d);
        if (this.d) {
            return;
        }
        d();
        this.d = true;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        try {
            return getApplicationContext().getPackageManager().getApplicationInfo(getApplicationContext().getPackageName(), 0).icon;
        } catch (PackageManager.NameNotFoundException e) {
            String str = f23182a;
            TrtcLog.a(str, "app icon NameNotFoundException: " + e);
            return R.drawable.float_close;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
        a(notificationManager);
        Notification build = new NotificationCompat.Builder(getApplicationContext(), "com.taobao.trtc.utils.TrtcForegroundService.id").setContentTitle(this.b).setContentText(this.c).setSmallIcon(c()).setAutoCancel(false).setOngoing(true).setCategory("service").setPriority(1).build();
        if (notificationManager != null) {
            notificationManager.notify(22222, build);
        }
        startForeground(22222, build);
    }

    private void a(NotificationManager notificationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10107845", new Object[]{this, notificationManager});
        } else if (Build.VERSION.SDK_INT < 26) {
        } else {
            NotificationChannel notificationChannel = new NotificationChannel("com.taobao.trtc.utils.TrtcForegroundService.id", "TrtcForegroundService", 4);
            notificationChannel.setSound(null, null);
            notificationChannel.setLockscreenVisibility(1);
            if (notificationManager == null) {
                return;
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
