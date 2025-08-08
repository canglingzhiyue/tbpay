package tb;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.c;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.base.VibratorAndMediaManager;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.msgnotification.Constants.BizSoundType;
import com.taobao.msgnotification.g;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.Config;
import tb.mto;

@Deprecated
/* loaded from: classes7.dex */
public abstract class msq implements IOldAgooNotification {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFICATION_CHANNEL_DESC = "taobao_agoo_channel_push";
    public static final String NOTIFICATION_CHANNEL_ID = "taobao_agoo_channel_id";
    public static final String NOTIFICATION_CHANNEL_NAME = "消息";
    public static final String NOTIFICATION_CHANNEL_OTHER_DESC = "其他类型的通知";
    public static final String NOTIFICATION_CHANNEL_OTHER_ID = "taobao_agoo_channel_other_id";
    public static final String NOTIFICATION_CHANNEL_OTHER_NAME = "其他通知";
    public static final String NOTIFICATION_CHANNEL_PRIVATE_DESC = "来自当前应用的平台通知消息";
    public static final String NOTIFICATION_CHANNEL_PRIVATE_ID = "agoo_channel_private_id";
    public static final String NOTIFICATION_CHANNEL_PRIVATE_NAME = "应用通知";
    public static final String NOTI_DEFAULT_PRIORITY = "NOTI_DEFAULT_PRIORITY";
    public static final String ORANGE_CONFIG_BUSINESS = "mpm_business_switch";
    public static long[] VIBRATE;
    public static Context mContext;
    public static Random notificationRandom;
    private String TAG = "AgooNotification";
    public NotificationCompat.Builder mBuilder;
    public Bundle mExtras;
    public MsgNotficationDTO mMsgData;
    public Intent mParam;

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        }
    }

    public void setTicker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c85ab9d", new Object[]{this, str});
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        }
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        }
    }

    static {
        kge.a(1057811193);
        kge.a(2124595894);
        notificationRandom = new Random(100000L);
        VIBRATE = new long[]{0, 140, 80, 140};
        mContext = null;
    }

    public msq(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        mContext = context;
        this.mMsgData = msgNotficationDTO;
        this.mExtras = bundle;
        this.mParam = intent;
        if (Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = new NotificationCompat.Builder(Globals.getApplication(), createChannel().getId());
            this.mBuilder.setPriority(1);
        } else {
            this.mBuilder = new NotificationCompat.Builder(Globals.getApplication());
            this.mBuilder.setPriority(1);
        }
        try {
            if (!EnvUtil.isAppBackGround(this.TAG)) {
                this.mBuilder.setPriority(0);
                TLog.loge(this.TAG, "use default priority");
            }
        } catch (Throwable th) {
            TLog.loge(this.TAG, Log.getStackTraceString(th));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mBuilder.setVisibility(1);
            this.mBuilder.setFullScreenIntent(null, true);
        }
        this.mBuilder.setWhen(System.currentTimeMillis());
    }

    public Intent getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("3b75c375", new Object[]{this}) : this.mParam;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.app.NotificationChannel createChannel() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.msq.createChannel():android.app.NotificationChannel");
    }

    private NotificationChannel createChannelV2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannel) ipChange.ipc$dispatch("6634e41b", new Object[]{this, str});
        }
        TLog.loge(this.TAG, " createChannelV2 " + str);
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        NotificationChannel searchNotificationChannel = searchNotificationChannel(str);
        if (searchNotificationChannel != null) {
            return searchNotificationChannel;
        }
        NotificationChannel notificationChannel = getNotificationChannel("taobao_agoo_channel_other_id");
        if (notificationChannel == null) {
            NotificationChannel notificationChannel2 = new NotificationChannel("taobao_agoo_channel_other_id", "其他通知", 4);
            notificationChannel2.setDescription(NOTIFICATION_CHANNEL_OTHER_DESC);
            String string = mContext.getSharedPreferences(Config.PREFERENCES, 4).getString("app_notification_custom_sound", null);
            AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
            if (!StringUtils.isEmpty(string)) {
                notificationChannel2.setSound(Uri.parse(string), build);
            } else if (PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
                if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                    notificationChannel2 = new NotificationChannel("taobao_agoo_channel_id_" + BizSoundType.HONGBAO.getType(), "消息_" + BizSoundType.HONGBAO.getType(), 4);
                    notificationChannel2.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao), build);
                } else {
                    notificationChannel2.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push), build);
                }
            }
            notificationChannel2.enableLights(true);
            notificationChannel2.enableVibration(true);
            notificationChannel2.setShowBadge(true);
            notificationChannel2.setLockscreenVisibility(0);
            notificationChannel2.setVibrationPattern(VIBRATE);
            notificationChannel2.setBypassDnd(true);
            g.a().b().createNotificationChannel(notificationChannel2);
        }
        return notificationChannel;
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public int getMergeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461bf356", new Object[]{this})).intValue();
        }
        MsgNotficationDTO msgNotficationDTO = this.mMsgData;
        if (msgNotficationDTO == null) {
            return 0;
        }
        return msgNotficationDTO.mergeType;
    }

    public void reportNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386a8fa4", new Object[]{this});
            return;
        }
        try {
            String string = this.mExtras != null ? this.mExtras.getString("id") : "";
            AppMonitor.Counter.commit("accs", "agoo_notify", "", mto.a.GEO_NOT_SUPPORT);
            AppMonitor.Counter.commit("accs", "agoo_notify_id", string, mto.a.GEO_NOT_SUPPORT);
            TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_notify_id", null, null, null, "messageId=" + string);
            TLog.loge("agoo_push", "agoo_notify_id, messageId=" + string);
            TaobaoRegister.exposureMessage(mContext, string, "");
            String string2 = this.mExtras.getString("show_type");
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(string2)) {
                hashMap.put("show_type", string2);
            }
            HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + string, string, null, "0", null, null, hashMap);
            if (mtb.a()) {
                createUTData.put("pushType", "old:" + getClass().getSimpleName());
                createUTData.put("isBackground", String.valueOf(EnvUtil.isAppBackGround()));
                try {
                    createUTData.put("isMainProcess", String.valueOf(c.b(EnvUtil.getApplication())));
                } catch (Throwable unused) {
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = JSON.parseObject(this.mExtras.getString(AgooConstants.MESSAGE_BODY)).getJSONObject(Constants.KEY_EXTS);
                if (jSONObject != null) {
                    String string3 = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                    if (!StringUtils.isEmpty(string3)) {
                        try {
                            for (Map.Entry<String, Object> entry : JSON.parseObject(string3).entrySet()) {
                                if (entry.getValue() instanceof String) {
                                    hashMap2.put(entry.getKey(), (String) entry.getValue());
                                }
                            }
                            if (!hashMap2.isEmpty()) {
                                createUTData.putAll(hashMap2);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            EnvUtil.UTShow(createUTData, 0, null);
        } catch (Exception e) {
            k.a("AgooNotification", "reportNotify,error=" + e);
        }
    }

    public void setVibrateSound(NotificationCompat.Builder builder, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983bca12", new Object[]{this, builder, intent});
        } else if (Build.VERSION.SDK_INT >= 26) {
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
            if (intent == null) {
                if (defaultSharedPreferences.getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
                    if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                        builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao));
                    } else {
                        builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push));
                    }
                }
                if (!isVibrate() || !defaultSharedPreferences.getBoolean(VibratorAndMediaManager.ISVIBRATIONON, false)) {
                    return;
                }
                builder.setVibrate(VIBRATE);
                return;
            }
            String stringExtra = intent.getStringExtra("notifySound");
            String stringExtra2 = intent.getStringExtra("notifyVibrate");
            if (!StringUtils.isEmpty(stringExtra)) {
                builder.setSound(Uri.parse(stringExtra));
            } else if (defaultSharedPreferences.getBoolean(VibratorAndMediaManager.RINGON, true) && EnvUtil.isAppBackGround(this.TAG)) {
                if (BizSoundType.HONGBAO.getType().equals(this.mMsgData.sound)) {
                    builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.push_hongbao));
                } else {
                    builder.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push));
                }
            }
            if (!StringUtils.isEmpty(stringExtra2)) {
                builder.setDefaults(Integer.parseInt(stringExtra2));
            } else if (!isVibrate() || !defaultSharedPreferences.getBoolean(VibratorAndMediaManager.ISVIBRATIONON, false)) {
            } else {
                builder.setVibrate(VIBRATE);
            }
        }
    }

    public static boolean isVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aca46f0", new Object[0])).booleanValue();
        }
        int ringerMode = ((AudioManager) Globals.getApplication().getSystemService("audio")).getRingerMode();
        if (ringerMode == 0) {
            return false;
        }
        if (ringerMode == 1 || ringerMode != 2) {
        }
        return true;
    }

    public static NotificationChannel getNotificationChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannel) ipChange.ipc$dispatch("882fe3fa", new Object[]{str});
        }
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return g.a().b().getNotificationChannel(str);
    }

    public static NotificationChannel searchNotificationChannel(String str) {
        List<NotificationChannel> notificationChannels;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NotificationChannel) ipChange.ipc$dispatch("1da799e8", new Object[]{str});
        }
        if ((!BrandUtil.isXiaoMi() && !BrandUtil.isOPPO()) || Build.VERSION.SDK_INT < 26 || (notificationChannels = g.a().b().getNotificationChannels()) == null || notificationChannels.size() <= 0) {
            return null;
        }
        for (NotificationChannel notificationChannel : notificationChannels) {
            if (notificationChannel.getId().contains(str)) {
                return notificationChannel;
            }
        }
        return null;
    }

    public static void createNotificationGroup(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1368b8d3", new Object[]{str, str2});
        } else if (Build.VERSION.SDK_INT < 26) {
        } else {
            g.a().b().createNotificationChannelGroup(new NotificationChannelGroup(str2, str));
        }
    }

    public static boolean getChannelSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9823a6c", new Object[0])).booleanValue() : StringUtils.equals("1", OrangeConfig.getInstance().getConfig("mpm_data_switch", "message_push_channel_switch", "1"));
    }

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public String getMessageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff27d1ad", new Object[]{this});
        }
        Bundle bundle = this.mExtras;
        return bundle != null ? bundle.getString("id") : "";
    }
}
