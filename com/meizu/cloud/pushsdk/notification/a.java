package com.meizu.cloud.pushsdk.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f8000a;
    protected final PushNotificationBuilder b;
    private final NotificationManager c;
    private final Handler d;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, PushNotificationBuilder pushNotificationBuilder) {
        this.b = pushNotificationBuilder;
        this.f8000a = context;
        this.d = new Handler(context.getMainLooper());
        this.c = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    private Notification a(MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3) {
        Notification.Builder builder = new Notification.Builder(this.f8000a);
        a(builder, messageV3, pendingIntent, pendingIntent2);
        a(builder, messageV3);
        b(builder, messageV3);
        c(builder, messageV3);
        d(builder, messageV3);
        Notification build = MinSdkChecker.isSupportNotificationBuild() ? builder.build() : builder.getNotification();
        b(build, messageV3);
        a(build, messageV3);
        a(build, messageV3, pendingIntent3);
        return build;
    }

    private PendingIntent a(MessageV3 messageV3, String str) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        if (MinSdkChecker.isSupportTransmitMessageValue(this.f8000a, str)) {
            intent.putExtra(PushConstants.MZ_MESSAGE_VALUE, com.meizu.cloud.pushsdk.handler.d.a(messageV3));
        } else {
            intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        }
        intent.putExtra("method", "private");
        intent.putExtra("package_name", str);
        intent.setClassName(str, (String) Objects.requireNonNull(MzSystemUtils.findReceiver(this.f8000a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, str)));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setFlags(32);
        return com.android.taobao.aop.a.b(this.f8000a, 0, intent, 1140850688);
    }

    private void a(int i, String str, MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return;
        }
        DebugLogger.e("AbstractPushNotification", "save ad and recovery package, uploadDataPackageName:" + str);
        com.meizu.cloud.pushsdk.handler.e.b.a a2 = com.meizu.cloud.pushsdk.b.a(this.f8000a).a();
        if (a2 != null) {
            int priorityValidTime = messageV3.getAdvertisementOption().getPriorityValidTime();
            a2.a(messageV3);
            a2.a(i, a(messageV3, d(messageV3), f(messageV3), e(messageV3)), priorityValidTime);
        }
        messageV3.setUploadDataPackageName(str);
    }

    private void a(Notification.Builder builder, MessageV3 messageV3) {
        boolean isSound;
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        if (advanceSetting == null) {
            return;
        }
        int i = 0;
        if (advanceSettingEx == null || TextUtils.isEmpty(advanceSettingEx.getSoundTitle())) {
            isSound = advanceSetting.getNotifyType().isSound();
        } else {
            Uri b = com.meizu.cloud.pushsdk.notification.g.b.b(this.f8000a, advanceSettingEx.getSoundTitle());
            if (b != null) {
                DebugLogger.e("AbstractPushNotification", "advance setting builder, sound:" + b);
                builder.setSound(b);
                isSound = false;
            } else {
                isSound = true;
            }
        }
        if (advanceSetting.getNotifyType() != null) {
            boolean isVibrate = advanceSetting.getNotifyType().isVibrate();
            boolean isLights = advanceSetting.getNotifyType().isLights();
            if (isVibrate || isLights || isSound) {
                if (isVibrate) {
                    i = 2;
                }
                if (isLights) {
                    i |= 4;
                }
                if (isSound) {
                    i |= 1;
                }
                DebugLogger.e("AbstractPushNotification", "advance setting builder, defaults:" + i);
                builder.setDefaults(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("advance setting builder, ongoing:");
        sb.append(!advanceSetting.isClearNotification());
        DebugLogger.e("AbstractPushNotification", sb.toString());
        builder.setOngoing(!advanceSetting.isClearNotification());
        if (advanceSettingEx == null || !MinSdkChecker.isSupportNotificationBuild()) {
            return;
        }
        DebugLogger.e("AbstractPushNotification", "advance setting builder, priority:" + advanceSettingEx.getPriorityDisplay());
        builder.setPriority(advanceSettingEx.getPriorityDisplay());
    }

    private void a(Notification.Builder builder, MessageV3 messageV3, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        int statusBarIcon;
        builder.setContentTitle(messageV3.getTitle());
        builder.setContentText(messageV3.getContent());
        builder.setTicker(messageV3.getTitle());
        builder.setAutoCancel(true);
        if (MinSdkChecker.isSupportSendNotification()) {
            builder.setVisibility(1);
        }
        if (MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            Icon b = b(messageV3.getUploadDataPackageName());
            if (b != null) {
                builder.setSmallIcon(b);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            }
            DebugLogger.e("AbstractPushNotification", "cannot get " + messageV3.getUploadDataPackageName() + " smallIcon");
        } else {
            PushNotificationBuilder pushNotificationBuilder = this.b;
            if (pushNotificationBuilder != null && pushNotificationBuilder.getStatusBarIcon() != 0) {
                statusBarIcon = this.b.getStatusBarIcon();
                builder.setSmallIcon(statusBarIcon);
                builder.setContentIntent(pendingIntent);
                builder.setDeleteIntent(pendingIntent2);
            }
        }
        statusBarIcon = com.meizu.cloud.pushsdk.notification.g.c.m(this.f8000a);
        builder.setSmallIcon(statusBarIcon);
        builder.setContentIntent(pendingIntent);
        builder.setDeleteIntent(pendingIntent2);
    }

    private Icon b(String str) {
        try {
            int identifier = this.f8000a.getPackageManager().getResourcesForApplication(str).getIdentifier(PushConstants.MZ_PUSH_NOTIFICATION_SMALL_ICON, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, str);
            if (identifier != 0) {
                DebugLogger.i("AbstractPushNotification", "get " + str + " smallIcon success resId " + identifier);
                return Icon.createWithResource(str, identifier);
            }
        } catch (Exception e) {
            DebugLogger.e("AbstractPushNotification", "cannot load smallIcon form package " + str + " Error message " + e.getMessage());
        }
        return null;
    }

    private String b(Context context, String str) {
        CharSequence applicationLabel;
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            if (applicationInfo != null && (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) != null) {
                return (String) applicationLabel;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            DebugLogger.e("AbstractPushNotification", "can not find " + str + " application info");
        }
        return null;
    }

    private String b(MessageV3 messageV3) {
        if (messageV3 == null || messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return null;
        }
        String uploadDataPackageName = messageV3.getUploadDataPackageName();
        String adPackage = messageV3.getAdvertisementOption().getAdPackage();
        DebugLogger.e("AbstractPushNotification", "again show old ad and replace package, uploadDataPackageName:" + uploadDataPackageName + ", adPackageName:" + adPackage);
        com.meizu.cloud.pushsdk.handler.e.b.a a2 = com.meizu.cloud.pushsdk.b.a(this.f8000a).a();
        if (a2 != null) {
            a2.a();
        }
        messageV3.setUploadDataPackageName(adPackage);
        return uploadDataPackageName;
    }

    private void b(Notification notification, MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.notification.g.b.a(notification, true);
        com.meizu.cloud.pushsdk.notification.g.b.a(notification, g(messageV3));
        notification.extras.putString(PushConstants.EXTRA_ORIGINAL_NOTIFICATION_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        notification.extras.putString(PushConstants.EXTRA_FLYME_GREEN_NOTIFICATION_SETTING, h(messageV3));
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        notification.extras.putString(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        if (!TextUtils.isEmpty(this.b.getAppLabel())) {
            DebugLogger.e("AbstractPushNotification", "set app label " + this.b.getAppLabel());
            notification.extras.putString(PushConstants.EXTRA_SUBSTITUTE_APP_NAME, this.b.getAppLabel());
            return;
        }
        String b = b(this.f8000a, messageV3.getUploadDataPackageName());
        DebugLogger.e("AbstractPushNotification", "current package " + messageV3.getUploadDataPackageName() + " label is " + b);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        notification.extras.putString(PushConstants.EXTRA_SUBSTITUTE_APP_NAME, b);
    }

    private boolean c(MessageV3 messageV3) {
        if (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            return messageV3.getWhiteList() && !MzSystemUtils.isExistReceiver(this.f8000a, messageV3.getUploadDataPackageName(), PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        }
        return true;
    }

    private PendingIntent d(MessageV3 messageV3) {
        return a(messageV3, c(messageV3) ? messageV3.getPackageName() : messageV3.getUploadDataPackageName());
    }

    private void d(Notification.Builder builder, MessageV3 messageV3) {
        String str;
        String str2;
        int i;
        if (!MinSdkChecker.isSupportNotificationChannel()) {
            return;
        }
        AdvanceSetting advanceSetting = messageV3.getAdvanceSetting();
        AdvanceSettingEx advanceSettingEx = messageV3.getAdvanceSettingEx();
        int priorityDisplay = advanceSettingEx != null ? advanceSettingEx.getPriorityDisplay() : 0;
        if (Build.VERSION.SDK_INT >= 29 && advanceSetting.isHeadUpNotification() && advanceSettingEx.getPriorityDisplay() <= 0) {
            priorityDisplay = 1;
        }
        if (priorityDisplay == -2) {
            str = "mz_push_notification_channel_min";
            str2 = "MEIZUPUSHMIN";
            i = 1;
        } else if (priorityDisplay == -1) {
            str = "mz_push_notification_channel_low";
            str2 = "MEIZUPUSHLOW";
            i = 2;
        } else if (priorityDisplay == 1) {
            i = 4;
            str = "mz_push_notification_channel_high";
            str2 = "MEIZUPUSHHIGH";
        } else if (priorityDisplay != 2) {
            i = 3;
            str = "mz_push_notification_channel";
            str2 = "MEIZUPUSH";
        } else {
            i = 5;
            str = "mz_push_notification_channel_max";
            str2 = "MEIZUPUSHMAX";
        }
        Uri b = advanceSettingEx.getSoundTitle() != null ? com.meizu.cloud.pushsdk.notification.g.b.b(this.f8000a, advanceSettingEx.getSoundTitle()) : null;
        if (!advanceSetting.getNotifyType().isSound() && advanceSettingEx.getSoundTitle() == null) {
            str = str + "_mute";
            str2 = str2 + "_MUTE";
        } else if (b != null) {
            str2 = str2 + "_" + advanceSettingEx.getSoundTitle().toUpperCase();
            str = str + "_" + advanceSettingEx.getSoundTitle().toLowerCase();
        }
        DebugLogger.e("AbstractPushNotification", "notification channel builder, channelId: " + str + ", channelName: " + str2 + ", importance:" + i + ", sound: " + b);
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.setShowBadge(true);
        notificationChannel.enableVibration(true);
        if (!advanceSetting.getNotifyType().isSound() && advanceSettingEx.getSoundTitle() == null) {
            notificationChannel.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        } else if (b != null) {
            notificationChannel.setSound(b, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        }
        this.c.createNotificationChannel(notificationChannel);
        builder.setChannelId(str);
    }

    private PendingIntent e(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_CLOSE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f8000a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return com.android.taobao.aop.a.b(this.f8000a, 0, intent, 1140850688);
    }

    private PendingIntent f(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, messageV3);
        intent.putExtra("method", PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE);
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f8000a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return com.android.taobao.aop.a.b(this.f8000a, 0, intent, 1140850688);
    }

    private PendingIntent g(MessageV3 messageV3) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE, messageV3.getNotificationMessage());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_TASK_ID, messageV3.getTaskId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SEQ_ID, messageV3.getSeqId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID, messageV3.getDeviceId());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP, messageV3.getPushTimestamp());
        intent.putExtra(PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME, messageV3.getUploadDataPackageName());
        intent.putExtra(PushConstants.MZ_PUSH_WHITE_LIST, messageV3.getWhiteList());
        intent.putExtra(PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, messageV3.getDelayedReportMillis());
        intent.putExtra("method", "notification_state");
        intent.setClassName(messageV3.getPackageName(), MzSystemUtils.findReceiver(this.f8000a, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, messageV3.getPackageName()));
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        return com.android.taobao.aop.a.b(this.f8000a, 0, intent, 1107296256);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap a(Context context, String str) {
        BitmapDrawable bitmapDrawable;
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str);
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT < 26 || (applicationIcon instanceof BitmapDrawable)) {
                bitmapDrawable = (BitmapDrawable) applicationIcon;
            } else if (applicationIcon instanceof AdaptiveIconDrawable) {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                bitmapDrawable = null;
                bitmap = createBitmap;
            } else {
                bitmapDrawable = null;
            }
            return bitmap == null ? bitmapDrawable.getBitmap() : bitmap;
        } catch (Exception e) {
            DebugLogger.i("AbstractPushNotification", "get app icon error " + e.getMessage());
            return ((BitmapDrawable) context.getApplicationInfo().loadIcon(context.getPackageManager())).getBitmap();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bitmap a(String str) {
        com.meizu.cloud.pushsdk.e.b.c a2 = com.meizu.cloud.pushsdk.e.a.a(str).a().a();
        if (!a2.c() || a2.b() == null) {
            DebugLogger.i("AbstractPushNotification", "ANRequest On other Thread down load largeIcon " + str + "image fail");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ANRequest On other Thread down load largeIcon ");
        sb.append(str);
        sb.append("image ");
        sb.append(a2.b() != null ? "success" : "fail");
        DebugLogger.i("AbstractPushNotification", sb.toString());
        return (Bitmap) a2.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Notification notification, MessageV3 messageV3) {
    }

    protected void a(Notification notification, MessageV3 messageV3, PendingIntent pendingIntent) {
    }

    @Override // com.meizu.cloud.pushsdk.notification.c
    public void a(MessageV3 messageV3) {
        String b = (messageV3.getAdvertisementOption() == null || TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) ? null : b(messageV3);
        Notification a2 = a(messageV3, d(messageV3), f(messageV3), e(messageV3));
        int abs = Math.abs((int) System.currentTimeMillis());
        com.meizu.cloud.pushsdk.notification.model.a b2 = com.meizu.cloud.pushsdk.notification.model.a.b(messageV3);
        if (b2 != null && b2.a() != 0) {
            abs = b2.a();
            DebugLogger.e("AbstractPushNotification", "server notify id " + abs);
            if (!TextUtils.isEmpty(b2.b())) {
                int c = com.meizu.cloud.pushsdk.util.b.c(this.f8000a, messageV3.getUploadDataPackageName(), b2.b());
                DebugLogger.e("AbstractPushNotification", "notifyKey " + b2.b() + " preference notifyId is " + c);
                if (c != 0) {
                    DebugLogger.e("AbstractPushNotification", "use preference notifyId " + c + " and cancel it");
                    this.c.cancel(c);
                }
                DebugLogger.e("AbstractPushNotification", "store new notifyId " + abs + " by notifyKey " + b2.b());
                com.meizu.cloud.pushsdk.util.b.b(this.f8000a, messageV3.getUploadDataPackageName(), b2.b(), abs);
            }
        }
        DebugLogger.e("AbstractPushNotification", "current notify id " + abs);
        if (messageV3.isDiscard()) {
            if (com.meizu.cloud.pushsdk.util.b.b(this.f8000a, messageV3.getPackageName()) == 0) {
                com.meizu.cloud.pushsdk.util.b.a(this.f8000a, messageV3.getPackageName(), abs);
                DebugLogger.i("AbstractPushNotification", "no notification show so put notification id " + abs);
            }
            if (!TextUtils.isEmpty(messageV3.getTaskId())) {
                if (com.meizu.cloud.pushsdk.util.b.c(this.f8000a, messageV3.getPackageName()) == 0) {
                    com.meizu.cloud.pushsdk.util.b.b(this.f8000a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                } else if (Integer.valueOf(messageV3.getTaskId()).intValue() < com.meizu.cloud.pushsdk.util.b.c(this.f8000a, messageV3.getPackageName())) {
                    DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " task id " + messageV3.getTaskId() + " don't show notification");
                    return;
                } else {
                    com.meizu.cloud.pushsdk.util.b.b(this.f8000a, messageV3.getPackageName(), Integer.valueOf(messageV3.getTaskId()).intValue());
                    abs = com.meizu.cloud.pushsdk.util.b.b(this.f8000a, messageV3.getPackageName());
                }
            }
            DebugLogger.i("AbstractPushNotification", "current package " + messageV3.getPackageName() + " notificationId=" + abs + " taskId=" + messageV3.getTaskId());
        }
        if (messageV3.getAdvertisementOption() != null && !TextUtils.isEmpty(messageV3.getAdvertisementOption().getAdPackage())) {
            a(abs, b, messageV3);
        }
        this.c.notify(abs, a2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a() {
        return Thread.currentThread() == this.f8000a.getMainLooper().getThread();
    }

    protected void b(Notification.Builder builder, MessageV3 messageV3) {
    }

    protected void c(Notification.Builder builder, MessageV3 messageV3) {
    }

    protected String h(MessageV3 messageV3) {
        String str;
        try {
        } catch (Exception e) {
            DebugLogger.e("AbstractPushNotification", "parse flyme notification setting error " + e.getMessage());
        }
        if (!TextUtils.isEmpty(messageV3.getNotificationMessage())) {
            str = new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getString("fns");
            DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
            return str;
        }
        str = null;
        DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is " + str);
        return str;
    }
}
