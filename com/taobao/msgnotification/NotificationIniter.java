package com.taobao.msgnotification;

import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.notification.a;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.joq;
import tb.kge;
import tb.msq;

/* loaded from: classes7.dex */
public class NotificationIniter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NotificationIniter";
    private static String channelConfig;

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            initChannel(context);
        }
    }

    public static void initChannel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c711142e", new Object[]{context});
            return;
        }
        if (msq.getChannelSwitch()) {
            TLog.logd(TAG, "initChannelV2");
            TLog.loge(TAG, "initChannelV2");
            initChannelV2(context);
        }
        requestNotificationPermission();
        BrandUtil.getInstance();
        if (!BrandUtil.isOPPO() || Build.VERSION.SDK_INT < 26) {
            return;
        }
        AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
        NotificationChannel notificationChannel = new NotificationChannel("taobao_agoo_channel_id", "消息", 4);
        notificationChannel.setDescription(msq.NOTIFICATION_CHANNEL_DESC);
        preCreateChannel(notificationChannel, build, context);
        NotificationChannel notificationChannel2 = new NotificationChannel("taobao_agoo_channel_other_id", "其他通知", 3);
        notificationChannel2.setDescription(msq.NOTIFICATION_CHANNEL_OTHER_DESC);
        preCreateChannel(notificationChannel2, build, context);
        NotificationChannel notificationChannel3 = new NotificationChannel(msq.NOTIFICATION_CHANNEL_PRIVATE_ID, msq.NOTIFICATION_CHANNEL_PRIVATE_NAME, 3);
        notificationChannel3.setDescription(msq.NOTIFICATION_CHANNEL_PRIVATE_DESC);
        preCreateChannel(notificationChannel3, build, context);
    }

    private static void requestNotificationPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88161290", new Object[0]);
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sdkVersion", Build.VERSION.SDK_INT + "");
            final boolean isPermissionSingleTime = isPermissionSingleTime(hashMap);
            String str = "1";
            hashMap.put("isPermissionSingleTime", isPermissionSingleTime ? str : "0");
            if (Build.VERSION.SDK_INT >= 33) {
                final Activity topActivity = EnvUtil.getTopActivity();
                if (topActivity == null) {
                    hashMap.put("topActivity", "0");
                    TLog.loge(TAG, "topActivity is null");
                    return;
                }
                hashMap.put("topActivity", str);
                final boolean z = ContextCompat.checkSelfPermission(topActivity, a.POST_NOTIFICATIONS_PERMISSION) != 0;
                final String valueOf = String.valueOf(System.currentTimeMillis());
                hashMap.put("isHavePermission", z ? "0" : str);
                if (!z) {
                    str = "0";
                }
                hashMap.put(TBRunTimePermission.REQUEST_PERMISSION_API_NAME, str);
                hashMap.put(joq.STAGE_NETWORK, valueOf);
                topActivity.runOnUiThread(new Runnable() { // from class: com.taobao.msgnotification.NotificationIniter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!z) {
                            TLog.loge(NotificationIniter.TAG, "requestPermissions has been DENIED");
                        } else {
                            Activity activity = topActivity;
                            a.a(activity, "pushIniter_" + valueOf, isPermissionSingleTime ? 4 : 5);
                        }
                    }
                });
            }
            EnvUtil.UTPermissionShow(hashMap, 0, null);
        } catch (Throwable unused) {
        }
    }

    public static void preCreateChannel(NotificationChannel notificationChannel, AudioAttributes audioAttributes, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8cc6b5", new Object[]{notificationChannel, audioAttributes, context});
        } else if (Build.VERSION.SDK_INT >= 26 && context != null) {
            String string = Globals.getApplication().getSharedPreferences(Config.PREFERENCES, 4).getString("app_notification_custom_sound", null);
            if (!StringUtils.isEmpty(string)) {
                notificationChannel.setSound(Uri.parse(string), audioAttributes);
            } else {
                notificationChannel.setSound(Uri.parse("android.resource://" + Globals.getApplication().getPackageName() + "/" + R.raw.sound_push), audioAttributes);
            }
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(0);
            notificationChannel.setVibrationPattern(msq.VIBRATE);
            notificationChannel.setBypassDnd(true);
            g.a().b().createNotificationChannel(notificationChannel);
            TLog.loge(TAG, ((Object) notificationChannel.getName()) + "init finished");
        } else {
            TLog.loge(TAG, "ctx is null");
        }
    }

    public static void initChannelV2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac4fd2", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 26 && BrandUtil.isOPPO()) {
            ArrayList<String> arrayList = new ArrayList();
            AudioAttributes build = new AudioAttributes.Builder().setUsage(5).build();
            try {
                JSONObject jSONObject = new JSONObject(channelConfig);
                JSONArray optJSONArray = jSONObject.optJSONArray("groupName");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("name");
                    String string2 = jSONObject2.getString("id");
                    msq.createNotificationGroup(string, string2);
                    JSONArray optJSONArray2 = jSONObject.optJSONArray(string);
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject3.optString("id");
                        String optString2 = jSONObject3.optString("name");
                        int i3 = jSONObject3.getInt("importance");
                        NotificationChannel notificationChannel = msq.getNotificationChannel(optString);
                        if (notificationChannel == null) {
                            NotificationChannel notificationChannel2 = new NotificationChannel(optString, optString2, i3);
                            notificationChannel2.setGroup(string2);
                            preCreateChannel(notificationChannel2, build, context);
                        } else if (notificationChannel.getImportance() == 0) {
                            arrayList.add(String.valueOf(notificationChannel.getName()));
                        }
                    }
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (String str : arrayList) {
                    sb.append(str);
                    sb.append("-");
                }
                TLog.loge(TAG, " close channel name  " + ((Object) sb));
                TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "channelInfo", null, null, null, "closeChannelName=" + ((Object) sb));
            } catch (Throwable th) {
                th.printStackTrace();
                Log.e(TAG, " error " + Log.getStackTraceString(th));
            }
        }
    }

    private static boolean isPermissionSingleTime(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53329b62", new Object[]{hashMap})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", "isPermissionSingleTime", "");
        if (!StringUtils.isEmpty(config)) {
            hashMap.put("useOrange", config);
            return "true".equals(config);
        }
        String loadABStatusFromAB = loadABStatusFromAB("AB_", "202312141543_5034", "status");
        hashMap.put("useAbtest", loadABStatusFromAB);
        return !StringUtils.isEmpty(loadABStatusFromAB) && loadABStatusFromAB.contains("open");
    }

    public static String loadABStatusFromAB(String str, String str2, String str3) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6191497", new Object[]{str, str2, str3});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        return (activate == null || (variation = activate.getVariation(str3)) == null) ? "" : variation.getValueAsString("");
    }

    static {
        kge.a(-165911522);
        channelConfig = "{\n\t\"groupName\": [{\n\t\t\"name\": \"重要通知\",\n\t\t\"id\": \"0001_importance\"\n\t}, {\n\t\t\"name\": \"普通通知\",\n\t\t\"id\": \"0002_normal\"\n\t}],\n\t\"重要通知\": [{\n\t\t\"id\": \"high_custom_3\",\n\t\t\"name\": \"店铺客服接待\",\n\t\t\"importance\": 4\n\t},{\n\t\t\"id\": \"high_custom_1\",\n\t\t\"name\": \"交易物流通知\",\n\t\t\"importance\": 3\n\t},{\n\t\t\"id\": \"high_custom_2\",\n\t\t\"name\": \"淘宝好友聊天\",\n\t\t\"importance\": 4\n\t},{\n\t\t\"id\": \"high_custom_4\",\n\t\t\"name\": \"服务通知\",\n\t\t\"importance\": 4\n\t}],    \n\t\"普通通知\": [ {\n\t\t\"id\": \"group_im\",\n\t\t\"name\": \"群聊消息\",\n\t\t\"importance\": 3\n\t},{\n\t\t\"id\": \"marketing\",\n\t\t\"name\": \"活动优惠\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"interactivity\",\n\t\t\"name\": \"互动消息\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"taobao_official\",\n\t\t\"name\": \"淘宝团队通知\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"taobao_playground\",\n\t\t\"name\": \"淘宝乐园消息\",\n\t\t\"importance\": 3\n\t}, {\n\t\t\"id\": \"others\",\n\t\t\"name\": \"其他\",\n\t\t\"importance\": 2\n\t}]\n\t\n}";
    }
}
