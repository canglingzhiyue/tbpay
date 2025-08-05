package com.taobao.avplayer.music;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class BackgroundAudioService extends Service implements AudioManager.OnAudioFocusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NOTIFICATION = "intent_action_notification";
    public static final int NOTIFICATION_ID = 3070160;
    public static final int VIEW_ID_NOTIFICATION_CLOSE = 5;
    public static final int VIEW_ID_NOTIFICATION_NEXT = 3;
    public static final int VIEW_ID_NOTIFICATION_OPEN = 4;
    public static final int VIEW_ID_NOTIFICATION_PLAY_STOP = 2;
    public static final int VIEW_ID_NOTIFICATION_PREVIOUS = 1;

    /* renamed from: a  reason: collision with root package name */
    private a f16531a;
    private Notification b;
    private RemoteViews c;
    private NotificationBroadcastReceiver d;
    private MusicBinder e;
    private int h = R.id.iv_image;
    private int i = R.id.tv_song_name;
    private int j = R.id.tv_singer;
    private int k = R.id.iv_music_play_stop;
    private int l = R.id.iv_music_close;
    private int m = R.id.iv_music_previous_new;
    private int n = R.id.iv_music_next_new;
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.avplayer.music.BackgroundAudioService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (BackgroundAudioService.a(BackgroundAudioService.this) == null) {
            } else {
                BackgroundAudioService.a(BackgroundAudioService.this).onPause();
            }
        }
    };
    private boolean g = true;

    static {
        kge.a(-50711715);
        kge.a(-1491822649);
    }

    public static /* synthetic */ Object ipc$super(BackgroundAudioService backgroundAudioService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return 2;
    }

    public static /* synthetic */ MusicBinder a(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MusicBinder) ipChange.ipc$dispatch("5c5ad23", new Object[]{backgroundAudioService}) : backgroundAudioService.e;
    }

    public static /* synthetic */ boolean a(BackgroundAudioService backgroundAudioService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a858993e", new Object[]{backgroundAudioService, new Boolean(z)})).booleanValue();
        }
        backgroundAudioService.g = z;
        return z;
    }

    public static /* synthetic */ boolean b(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70d30a1f", new Object[]{backgroundAudioService})).booleanValue() : backgroundAudioService.d();
    }

    public static /* synthetic */ void c(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a275f5c", new Object[]{backgroundAudioService});
        } else {
            backgroundAudioService.b();
        }
    }

    public static /* synthetic */ a d(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8f7e1afd", new Object[]{backgroundAudioService}) : backgroundAudioService.f16531a;
    }

    public static /* synthetic */ boolean e(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ecd009e2", new Object[]{backgroundAudioService})).booleanValue() : backgroundAudioService.g;
    }

    public static /* synthetic */ void f(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16245f1f", new Object[]{backgroundAudioService});
        } else {
            backgroundAudioService.c();
        }
    }

    public static /* synthetic */ int g(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f78b453", new Object[]{backgroundAudioService})).intValue() : backgroundAudioService.i;
    }

    public static /* synthetic */ RemoteViews h(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteViews) ipChange.ipc$dispatch("2cf5f9e7", new Object[]{backgroundAudioService}) : backgroundAudioService.c;
    }

    public static /* synthetic */ Notification i(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification) ipChange.ipc$dispatch("6b2c95aa", new Object[]{backgroundAudioService}) : backgroundAudioService.b;
    }

    public static /* synthetic */ void j(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb75b423", new Object[]{backgroundAudioService});
        } else {
            backgroundAudioService.f();
        }
    }

    public static /* synthetic */ boolean k(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4ca0968", new Object[]{backgroundAudioService})).booleanValue() : backgroundAudioService.e();
    }

    public static /* synthetic */ int l(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1e5e98", new Object[]{backgroundAudioService})).intValue() : backgroundAudioService.k;
    }

    /* loaded from: classes6.dex */
    public class MusicBinder extends Binder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1158547128);
        }

        public MusicBinder() {
        }

        public void onPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150378ba", new Object[]{this});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onPlay");
            if (!BackgroundAudioService.b(BackgroundAudioService.this)) {
                return;
            }
            BackgroundAudioService.c(BackgroundAudioService.this);
            BackgroundAudioService.d(BackgroundAudioService.this).m();
            BackgroundAudioService.a(BackgroundAudioService.this, true);
        }

        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onPause " + BackgroundAudioService.e(BackgroundAudioService.this));
            if (!BackgroundAudioService.e(BackgroundAudioService.this)) {
                return;
            }
            if (BackgroundAudioService.d(BackgroundAudioService.this) != null) {
                BackgroundAudioService.d(BackgroundAudioService.this).l();
            }
            BackgroundAudioService.f(BackgroundAudioService.this);
            BackgroundAudioService.a(BackgroundAudioService.this, false);
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca32b81", new Object[]{this, str, bundle});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onPlayFromMediaId " + str);
            BackgroundAudioService.b(BackgroundAudioService.this);
            BackgroundAudioService.c(BackgroundAudioService.this);
            BackgroundAudioService.d(BackgroundAudioService.this).k();
            BackgroundAudioService.a(BackgroundAudioService.this, true);
            AVSDKLog.e("AVSDK-tb-Music", "onPlayFromMediaId finish");
        }

        public void onSeekTo(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65f2e48b", new Object[]{this, new Long(j)});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onSeekTo " + j);
            BackgroundAudioService.d(BackgroundAudioService.this).a((int) j, false, false);
        }

        public void onSkipToNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c91fc33", new Object[]{this});
                return;
            }
            BackgroundAudioService.d(BackgroundAudioService.this).n();
            HashMap<String, String> f = BackgroundAudioService.d(BackgroundAudioService.this).f();
            if (f == null) {
                return;
            }
            if (f.containsKey("title")) {
                BackgroundAudioService.h(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.g(BackgroundAudioService.this), f.get("title"));
            } else {
                BackgroundAudioService.h(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.g(BackgroundAudioService.this), "taobao tv_song_name");
            }
            BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
            backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.i(backgroundAudioService));
        }

        public void onSkipToPrevious() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6436c5b7", new Object[]{this});
                return;
            }
            BackgroundAudioService.d(BackgroundAudioService.this).o();
            HashMap<String, String> f = BackgroundAudioService.d(BackgroundAudioService.this).f();
            if (f == null) {
                return;
            }
            if (f.containsKey("title")) {
                BackgroundAudioService.h(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.g(BackgroundAudioService.this), f.get("title"));
            } else {
                BackgroundAudioService.h(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.g(BackgroundAudioService.this), "taobao tv_song_name");
            }
            BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
            backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.i(backgroundAudioService));
        }

        public void onClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e155e360", new Object[]{this});
                return;
            }
            BackgroundAudioService.d(BackgroundAudioService.this).p();
            BackgroundAudioService.f(BackgroundAudioService.this);
            BackgroundAudioService.a(BackgroundAudioService.this, false);
        }

        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            BackgroundAudioService.this.stopForeground(true);
            BackgroundAudioService.a(BackgroundAudioService.this, false);
        }

        public void onCustomAction(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be99bcdd", new Object[]{this, str, bundle});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onCustomAction " + str);
            if ("updateAlbumArtBitmap".equals(str)) {
                if (BackgroundAudioService.d(BackgroundAudioService.this).f() == null) {
                    return;
                }
                BackgroundAudioService.j(BackgroundAudioService.this);
                BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
                backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.i(backgroundAudioService));
            } else if (!"closeVideo".equals(str)) {
            } else {
                BackgroundAudioService.this.stopForeground(true);
                BackgroundAudioService.d(BackgroundAudioService.this).j();
                BackgroundAudioService.d(BackgroundAudioService.this).p();
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.e == null) {
            this.e = new MusicBinder();
        }
        return this.e;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        AVSDKLog.e("AVSDK-tb-Music", " service onCreate start");
        this.f16531a = a.a(this);
        f();
        a();
        this.d = new NotificationBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_NOTIFICATION);
        registerReceiver(this.d, intentFilter);
        AVSDKLog.e("AVSDK-tb-Music", " service onCreate finish");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            registerReceiver(this.f, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
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
        ((AudioManager) getSystemService("audio")).abandonAudioFocus(this);
        unregisterReceiver(this.f);
        NotificationManagerCompat.from(this).cancel(NOTIFICATION_ID);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + " showPlayingNotification ");
        RemoteViews remoteViews = this.c;
        if (remoteViews == null) {
            return;
        }
        remoteViews.setImageViewResource(this.k, R.drawable.music_stop_gray_dark);
        startForeground(NOTIFICATION_ID, this.b);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + " showPausedNotification ");
        RemoteViews remoteViews = this.c;
        if (remoteViews == null) {
            return;
        }
        remoteViews.setImageViewResource(this.k, R.drawable.music_play_gray_dark);
        startForeground(NOTIFICATION_ID, this.b);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        boolean a2 = com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", "onlyGetShortFocusForAudioPlayer", "false"));
        int requestAudioFocus = audioManager.requestAudioFocus(this, 3, a2 ? 2 : 1);
        StringBuilder sb = new StringBuilder();
        sb.append("successfullyRetrievedAudioFocus result=");
        sb.append(requestAudioFocus);
        sb.append(", gain focusType=");
        sb.append(a2 ? "short" : "long");
        AVSDKLog.e("AVSDK-tb-Music", sb.toString());
        return requestAudioFocus == 1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e("AVSDK-tb-Music", "onAudioFocusChange focusChange ");
        if (i != -2 && i != -1) {
            return;
        }
        this.e.onPause();
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.g;
    }

    /* loaded from: classes6.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2099803390);
        }

        public NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            AVSDKLog.e("AVSDK-tb-Music", "NotificationBroadcastReceiver onReceive " + action);
            if (!action.equals(BackgroundAudioService.ACTION_NOTIFICATION)) {
                return;
            }
            int intExtra = intent.getIntExtra("view_id", 0);
            AVSDKLog.e("AVSDK-tb-Music", "NotificationBroadcastReceiver onReceive " + action + ", " + intExtra);
            if (intExtra == 1) {
                BackgroundAudioService.a(BackgroundAudioService.this).onSkipToPrevious();
            } else if (intExtra != 2) {
                if (intExtra == 3) {
                    BackgroundAudioService.a(BackgroundAudioService.this).onSkipToNext();
                } else if (intExtra == 4) {
                    BackgroundAudioService.d(BackgroundAudioService.this).i();
                } else if (intExtra != 5) {
                } else {
                    BackgroundAudioService.a(BackgroundAudioService.this).onCustomAction("closeVideo", null);
                }
            } else if (BackgroundAudioService.k(BackgroundAudioService.this)) {
                BackgroundAudioService.a(BackgroundAudioService.this).onPause();
                BackgroundAudioService.h(BackgroundAudioService.this).setImageViewResource(BackgroundAudioService.l(BackgroundAudioService.this), R.drawable.music_play_gray_dark);
                BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
                backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.i(backgroundAudioService));
            } else {
                BackgroundAudioService.a(BackgroundAudioService.this).onPlay();
                BackgroundAudioService.h(BackgroundAudioService.this).setImageViewResource(BackgroundAudioService.l(BackgroundAudioService.this), R.drawable.music_stop_gray_dark);
                BackgroundAudioService backgroundAudioService2 = BackgroundAudioService.this;
                backgroundAudioService2.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.i(backgroundAudioService2));
            }
        }
    }

    private String a(String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i)});
        }
        if (str.length() > i) {
            str2 = str.substring(0, i) + "...";
        } else {
            str2 = str;
        }
        AVSDKLog.e("AVSDK-tb-Music", str + " ellipsize " + str2);
        return str2;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap<String, String> f = this.f16531a.f();
        if (f == null) {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView return null");
        }
        AVSDKLog.e("AVSDK-tb-Music", "initNotificationView ");
        NotificationManager notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
        boolean r = this.f16531a.r();
        if (r) {
            this.h = R.id.iv_image_new;
            this.i = R.id.tv_song_name_new;
            this.j = R.id.tv_singer_new;
            this.k = R.id.iv_music_play_stop_new;
            this.l = R.id.iv_music_close_new;
        }
        this.c = new RemoteViews(getPackageName(), r ? R.layout.layout_notification_music_play_new : R.layout.layout_notification_music_play);
        Bitmap g = this.f16531a.g();
        if (g != null) {
            this.c.setImageViewBitmap(this.h, g);
        } else {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView no image");
        }
        Intent intent = new Intent(ACTION_NOTIFICATION);
        if (r) {
            intent.putExtra("view_id", 1);
            this.c.setOnClickPendingIntent(this.m, com.android.taobao.aop.a.b(this, 1, intent, 134217728));
        }
        intent.putExtra("view_id", 2);
        this.c.setOnClickPendingIntent(this.k, com.android.taobao.aop.a.b(this, 2, intent, 134217728));
        if (this.g) {
            this.c.setImageViewResource(this.k, R.drawable.music_stop_gray_dark);
        } else {
            this.c.setImageViewResource(this.k, R.drawable.music_play_gray_dark);
        }
        if (r) {
            intent.putExtra("view_id", 3);
            this.c.setOnClickPendingIntent(this.n, com.android.taobao.aop.a.b(this, 3, intent, 134217728));
        }
        intent.putExtra("view_id", 4);
        PendingIntent b = com.android.taobao.aop.a.b(this, 4, intent, 134217728);
        intent.putExtra("view_id", 5);
        this.c.setOnClickPendingIntent(this.l, com.android.taobao.aop.a.b(this, 5, intent, 134217728));
        if (f != null && f.containsKey("title")) {
            this.c.setTextViewText(this.i, a(f.get("title"), 7));
        } else {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView no title");
        }
        if (f != null && f.containsKey("subtitle")) {
            this.c.setTextViewText(this.j, a(f.get("subtitle"), 10));
        } else {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView no subtitle");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView createNotificationChannel if");
            NotificationChannel notificationChannel = new NotificationChannel("tb_music_player", "淘宝音频", 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setSound(null, null);
            notificationChannel.setVibrationPattern(new long[]{0});
            notificationManager.createNotificationChannel(notificationChannel);
            this.b = new NotificationCompat.Builder(getApplicationContext()).setContentTitle("淘宝音频").setSmallIcon(R.drawable.defalut_tao).setCustomContentView(this.c).setChannelId("tb_music_player").setContentIntent(b).setVibrate(new long[]{0}).setSound(null).build();
        } else {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView createNotificationChannel else");
            this.b = new NotificationCompat.Builder(getApplicationContext()).setContentTitle("淘宝音频").setSmallIcon(R.drawable.defalut_tao).setContent(this.c).setVibrate(new long[]{0}).setSound(null).build();
        }
        NotificationManagerCompat.from(this).notify(NOTIFICATION_ID, this.b);
        startForeground(NOTIFICATION_ID, this.b);
    }
}
