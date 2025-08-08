package com.taobao.message.notification.system.base;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.banner.util.MergeCallback;
import com.taobao.message.notification.base.VibratorAndMediaManager;
import com.taobao.message.notification.system.base.ILocalPush;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Random;
import tb.kge;
import tb.nia;

/* loaded from: classes7.dex */
public abstract class BasicLocalPush implements ILocalPush {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_CHANNEL_DESC = "消息默认通知";
    public static final String NOTIFICATION_CHANNEL_ID = "taobao_agoo_channel_id";
    public static final String NOTIFICATION_CHANNEL_NAME = "消息";
    public static final String NOTIFICATION_CHANNEL_OTHER_NAME = "其他通知";
    public static final int RANDOM_MAX = 1000000;
    public static final String TAG = "BasicLocalPush";
    public static long[] VIBRATE;
    public static Random notificationRandom;
    private String mErrorMsg = "";
    private Notification mNotification;
    private int mUniqueId;

    public abstract Intent genClickIntent();

    public Intent genDeleteIntent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("4f8922b5", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public String getCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6c70505", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.RemoteViewsHolder getCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocalPush.RemoteViewsHolder) ipChange.ipc$dispatch("f880f0ff", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public int getImportance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cac5d1e4", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public Bitmap getLargeIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6c36bd03", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public Pair<String, nia> getLargeIconURL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("790c3d42", new Object[]{this});
        }
        return null;
    }

    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isForegroundSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b556c8d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean onBeforeNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("453f0c32", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        }
    }

    static {
        kge.a(1905189598);
        kge.a(-1666677629);
        VIBRATE = new long[]{0, 140, 80, 140};
        notificationRandom = new Random();
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public void performNotify() {
        final NotificationCompat.Builder builder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
            return;
        }
        log("performNotify start");
        if (!isEnabled()) {
            onReject("isEnabled is false");
            return;
        }
        this.mUniqueId = genPushRequestId();
        if (!isForegroundSupport() && !EnvUtil.isAppBackGround(TAG)) {
            onReject("isForegroundSupport is false");
        } else if (!onBeforeNotify()) {
            onReject("init failed");
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = getNotificationChannel();
                if (notificationChannel == null) {
                    onReject("channel is null");
                    return;
                }
                builder = new NotificationCompat.Builder(EnvUtil.getApplication(), notificationChannel.getId());
            } else {
                builder = new NotificationCompat.Builder(EnvUtil.getApplication());
            }
            try {
                if (!EnvUtil.isAppBackGround(TAG)) {
                    builder.setPriority(0);
                    TLog.loge(TAG, "use default priority");
                }
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                builder.setVisibility(1);
                builder.setFullScreenIntent(null, true);
            }
            String category = getCategory();
            if (!StringUtils.isEmpty(category)) {
                builder.setCategory(category);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(assembleSmallAndLargeIcon(builder));
            arrayList.add(assembleSound(builder));
            arrayList.add(assembleAutoCancel(builder));
            arrayList.add(assembleTickerAndContent(builder));
            arrayList.add(assembleVibrate(builder));
            arrayList.add(assembleContentIntent(builder));
            arrayList.add(assembleCustomView(builder));
            new MergeCallback(arrayList, new MergeCallback.AllCompleteCallback() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$DdvPC629Kkro_kv1TPxhUggOsR0
                @Override // com.taobao.message.notification.banner.util.MergeCallback.AllCompleteCallback
                public final void onAllComplete() {
                    BasicLocalPush.this.lambda$performNotify$2$BasicLocalPush(builder);
                }
            }).run();
        }
    }

    public /* synthetic */ void lambda$performNotify$2$BasicLocalPush(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ed4e5c", new Object[]{this, builder});
        } else {
            showSystemNotification(builder);
        }
    }

    private MergeCallback.MergeCallbackTask assembleSmallAndLargeIcon(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("d786e2ee", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$kx-hty37zLS0cpOjDPpBwTvYfQs
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleSmallAndLargeIcon$3$BasicLocalPush(builder, mergeCallback);
            }
        };
    }

    public /* synthetic */ void lambda$assembleSmallAndLargeIcon$3$BasicLocalPush(final NotificationCompat.Builder builder, final MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddbbe04", new Object[]{this, builder, mergeCallback});
            return;
        }
        builder.setSmallIcon(getSmallIcon());
        Pair<String, nia> largeIconURL = getLargeIconURL();
        if (largeIconURL != null && !StringUtils.isEmpty((CharSequence) largeIconURL.first)) {
            b.h().a((String) largeIconURL.first).bitmapProcessors((nia) largeIconURL.second).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    BasicLocalPush.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    Bitmap bitmap;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate() && (bitmap = succPhenixEvent.getDrawable().getBitmap()) != null) {
                        builder.setLargeIcon(bitmap);
                    }
                    mergeCallback.complete();
                    return true;
                }
            }).failListener(new a<FailPhenixEvent>() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    BasicLocalPush.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    TLog.loge(BasicLocalPush.TAG, "头像加载失败:" + failPhenixEvent.getResultCode());
                    mergeCallback.complete();
                    return false;
                }
            }).fetch();
            return;
        }
        Bitmap largeIcon = getLargeIcon();
        if (largeIcon != null) {
            builder.setLargeIcon(largeIcon);
        }
        mergeCallback.complete();
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public ILocalPush.Content getPushContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ILocalPush.Content) ipChange.ipc$dispatch("efefee7d", new Object[]{this}) : new ILocalPush.Content(ILocalPush.Content.DIS_PLAY_TITLE, ILocalPush.Content.DIS_PLAY_TITLE);
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public NotificationChannel getNotificationChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannel) ipChange.ipc$dispatch("b23daa70", new Object[]{this});
        }
        NotificationChannel notificationChannel = new NotificationChannel("taobao_agoo_channel_id", "消息", 3);
        notificationChannel.setDescription(NOTIFICATION_CHANNEL_DESC);
        Uri notificationSound = getNotificationSound();
        if (notificationSound != null) {
            notificationChannel.setSound(notificationSound, new AudioAttributes.Builder().setUsage(5).build());
        }
        AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
        if (getImportance() >= 0) {
            notificationChannel.setImportance(getImportance());
        }
        preCreateChannel(notificationChannel, build, EnvUtil.getApplication());
        return notificationChannel;
    }

    public static void preCreateChannel(NotificationChannel notificationChannel, AudioAttributes audioAttributes, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8cc6b5", new Object[]{notificationChannel, audioAttributes, context});
        } else if (Build.VERSION.SDK_INT >= 26 && context != null) {
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setVibrationPattern(VIBRATE);
            notificationChannel.setBypassDnd(true);
            getNotifyManager().createNotificationChannel(notificationChannel);
            TLog.loge(TAG, ((Object) notificationChannel.getName()) + "init finished");
        } else {
            TLog.loge(TAG, "ctx is null");
        }
    }

    @MethodSpy(name = "showNotification")
    public void showSystemNotification(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f052580", new Object[]{this, builder});
            return;
        }
        NotificationManager notifyManager = getNotifyManager();
        this.mNotification = builder.build();
        try {
            notifyManager.notify(getRequestId(), this.mNotification);
            onShow();
        } catch (SecurityException e) {
            log(e.toString());
        }
        log("showSystemNotification");
    }

    @Override // com.taobao.message.notification.system.base.ILocalPush
    public final int getRequestId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fef4bfce", new Object[]{this})).intValue() : this.mUniqueId;
    }

    public int genPushRequestId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaa3991a", new Object[]{this})).intValue() : notificationRandom.nextInt(1000000) + 999900;
    }

    public void onReject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a01c4a6f", new Object[]{this, str});
            return;
        }
        this.mErrorMsg += str;
        this.mErrorMsg += ";";
        log("onReject", this.mErrorMsg);
    }

    public MergeCallback.MergeCallbackTask assembleAutoCancel(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("c1ade305", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$jOF7Ud_naVtIQcBAoBnhTZKX7mU
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.lambda$assembleAutoCancel$4(NotificationCompat.Builder.this, mergeCallback);
            }
        };
    }

    public static /* synthetic */ void lambda$assembleAutoCancel$4(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdfe628", new Object[]{builder, mergeCallback});
            return;
        }
        builder.setAutoCancel(true);
        mergeCallback.complete();
    }

    private MergeCallback.MergeCallbackTask assembleVibrate(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("f10b2903", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$OT0Iyy0RXvpRnsSDuZTSdF8MDbI
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.lambda$assembleVibrate$5(NotificationCompat.Builder.this, mergeCallback);
            }
        };
    }

    public static /* synthetic */ void lambda$assembleVibrate$5(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb64bd1", new Object[]{builder, mergeCallback});
            return;
        }
        if (isVibrate() && EnvUtil.isAppBackGround(TAG)) {
            builder.setVibrate(VibratorAndMediaManager.CURRENT_MSG_VIBRATE_TIME);
        } else {
            builder.setVibrate(VibratorAndMediaManager.SILENT_MSG_VIBRATE_TIME);
        }
        mergeCallback.complete();
    }

    private MergeCallback.MergeCallbackTask assembleSound(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("706ae5e3", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$tDspwV_hBpHIds8eppVyMWiL4CQ
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleSound$6$BasicLocalPush(builder, mergeCallback);
            }
        };
    }

    public /* synthetic */ void lambda$assembleSound$6$BasicLocalPush(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        Uri notificationSound;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f80d72", new Object[]{this, builder, mergeCallback});
            return;
        }
        if (EnvUtil.isAppBackGround(TAG) && (notificationSound = getNotificationSound()) != null) {
            builder.setSound(notificationSound);
        }
        mergeCallback.complete();
    }

    public final MergeCallback.MergeCallbackTask assembleTickerAndContent(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("5f802962", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$O2uhaG9BLYJr_csgXK6X1qCWhTE
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleTickerAndContent$7$BasicLocalPush(builder, mergeCallback);
            }
        };
    }

    public /* synthetic */ void lambda$assembleTickerAndContent$7$BasicLocalPush(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165c0ee", new Object[]{this, builder, mergeCallback});
            return;
        }
        ILocalPush.Content pushContent = getPushContent();
        if (pushContent != null) {
            pushContent.setData(builder);
        }
        mergeCallback.complete();
    }

    public final MergeCallback.MergeCallbackTask assembleContentIntent(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("f605a2bd", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.-$$Lambda$BasicLocalPush$BeYHgwTH-UKuvDw-4DZbg8i2GUw
            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public final void run(MergeCallback mergeCallback) {
                BasicLocalPush.this.lambda$assembleContentIntent$8$BasicLocalPush(builder, mergeCallback);
            }
        };
    }

    public /* synthetic */ void lambda$assembleContentIntent$8$BasicLocalPush(NotificationCompat.Builder builder, MergeCallback mergeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e18905a", new Object[]{this, builder, mergeCallback});
            return;
        }
        int requestId = getRequestId();
        Intent genClickIntent = genClickIntent();
        PendingIntent pendingIntent = null;
        if (genClickIntent instanceof BroadcastIntent) {
            pendingIntent = com.android.taobao.aop.a.b(EnvUtil.getApplication(), requestId, genClickIntent, 134217728);
        } else if (genClickIntent != null) {
            pendingIntent = com.android.taobao.aop.a.a(EnvUtil.getApplication(), requestId, genClickIntent, 134217728);
        }
        builder.setContentIntent(pendingIntent);
        Intent genDeleteIntent = genDeleteIntent();
        if (genDeleteIntent != null) {
            builder.setDeleteIntent(com.android.taobao.aop.a.b(EnvUtil.getApplication(), requestId + 1, genDeleteIntent, 134217728));
        }
        mergeCallback.complete();
    }

    private MergeCallback.MergeCallbackTask assembleCustomView(final NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MergeCallback.MergeCallbackTask) ipChange.ipc$dispatch("7505f738", new Object[]{this, builder}) : new MergeCallback.MergeCallbackTask() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                BasicLocalPush.this = this;
            }

            @Override // com.taobao.message.notification.banner.util.MergeCallback.MergeCallbackTask
            public void run(final MergeCallback mergeCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a53dc4a5", new Object[]{this, mergeCallback});
                    return;
                }
                ILocalPush.RemoteViewsHolder customView = BasicLocalPush.this.getCustomView();
                if (customView != null) {
                    customView.fetch(new ILocalPush.RemoteViewListener() { // from class: com.taobao.message.notification.system.base.BasicLocalPush.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass3.this = this;
                        }

                        @Override // com.taobao.message.notification.system.base.ILocalPush.RemoteViewListener
                        public void on(RemoteViews remoteViews) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("ccf0d8f8", new Object[]{this, remoteViews});
                                return;
                            }
                            builder.setCustomContentView(remoteViews);
                            builder.setCustomBigContentView(remoteViews);
                            mergeCallback.complete();
                        }
                    });
                } else {
                    mergeCallback.complete();
                }
            }
        };
    }

    private void log(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
            return;
        }
        try {
            TLog.loge(TAG, getClass().getSimpleName() + str + str2);
        } catch (Throwable unused) {
        }
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            log("", str);
        }
    }

    private static NotificationManager getNotifyManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotificationManager) ipChange.ipc$dispatch("be3c7512", new Object[0]) : (NotificationManager) EnvUtil.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    private static boolean isVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aca46f0", new Object[0])).booleanValue();
        }
        AudioManager audioManager = (AudioManager) EnvUtil.getApplication().getSystemService("audio");
        if (audioManager == null) {
            return true;
        }
        int ringerMode = audioManager.getRingerMode();
        if (ringerMode == 0) {
            return false;
        }
        if (ringerMode == 1 || ringerMode != 2) {
        }
        return true;
    }

    public static Intent getBroadcastIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("c8ac6bc5", new Object[0]) : new BroadcastIntent();
    }

    /* loaded from: classes7.dex */
    public static class BroadcastIntent extends Intent {
        static {
            kge.a(1087113431);
        }

        private BroadcastIntent() {
        }
    }

    public Notification getNotification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Notification) ipChange.ipc$dispatch("f8086fe4", new Object[]{this}) : this.mNotification;
    }
}
