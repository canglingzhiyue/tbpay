package com.heytap.msp.push;

import android.content.Context;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.notification.PushNotificationManager;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.List;
import org.json.JSONObject;
import tb.cvf;
import tb.cwa;
import tb.kge;

/* loaded from: classes4.dex */
public class HeytapPushManager {
    static {
        kge.a(-1102745354);
    }

    public static void cancelNotification(JSONObject jSONObject) {
        cvf.a().i(jSONObject);
    }

    public static void clearNotificationType() {
        clearNotificationType(null);
    }

    public static void clearNotificationType(JSONObject jSONObject) {
        cvf.a().f(jSONObject);
    }

    public static void clearNotifications() {
        clearNotifications(null);
    }

    public static void clearNotifications(JSONObject jSONObject) {
        cvf.a().h(jSONObject);
    }

    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        cvf.a().b(iSetAppNotificationCallBackService);
    }

    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        cvf.a().a(iSetAppNotificationCallBackService);
    }

    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        cvf.a().a(iGetAppNotificationCallBackService);
    }

    public static String getMcsPackageName(Context context) {
        return cvf.a().b(context);
    }

    public static void getNotificationStatus() {
        getNotificationStatus(null);
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
        cvf.a().e(jSONObject);
    }

    public static ICallBackResultService getPushCallback() {
        return cvf.a().e();
    }

    public static PushNotificationManager getPushNotificationManager() {
        return PushNotificationManager.getInstance();
    }

    public static void getPushStatus() {
        cvf.a().h();
    }

    public static int getPushVersionCode() {
        return cvf.a().l();
    }

    public static String getPushVersionName() {
        return cvf.a().k();
    }

    public static String getReceiveSdkAction(Context context) {
        return cvf.a().c(context);
    }

    public static void getRegister() {
        getRegister(null);
    }

    public static void getRegister(JSONObject jSONObject) {
        cvf.a().b(jSONObject);
    }

    public static String getRegisterID() {
        return cvf.a().d();
    }

    public static int getSDKVersionCode() {
        return cvf.j();
    }

    public static String getSDKVersionName() {
        return cvf.i();
    }

    public static void init(Context context, boolean z) {
        cvf.a().a(context, z);
    }

    public static boolean isSupportPush(Context context) {
        return cvf.a().d(context);
    }

    public static void openNotificationSettings() {
        openNotificationSettings(null);
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
        cvf.a().g(jSONObject);
    }

    public static void pausePush() {
        pausePush(null);
    }

    public static void pausePush(JSONObject jSONObject) {
        cvf.a().c(jSONObject);
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        cvf.a().a(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void requestNotificationPermission() {
        cvf.a().m();
    }

    public static void resumePush() {
        resumePush(null);
    }

    public static void resumePush(JSONObject jSONObject) {
        cvf.a().d(jSONObject);
    }

    public static void setAppKeySecret(String str, String str2) {
        cvf.a().a(str, str2);
    }

    public static void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    public static void setNotificationType(int i, JSONObject jSONObject) {
        cvf.a().a(i, jSONObject);
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
        cvf.a().a(iCallBackResultService);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) throws IllegalArgumentException {
        cvf.a().a(list, i, i2, i3, i4, jSONObject);
    }

    public static void setRegisterID(String str) {
        cvf.a().a(str);
    }

    public static void statisticEvent(Context context, String str, DataMessage dataMessage) {
        StatisticUtils.statisticEvent(context, str, dataMessage);
    }

    @Deprecated
    public static void statisticMessage(Context context, MessageStat messageStat) {
        cwa.a(context, messageStat);
    }

    @Deprecated
    public static void statisticMessage(Context context, List<MessageStat> list) {
        cwa.a(context, list);
    }

    public static void unRegister() {
        unRegister(null);
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        cvf.a().b(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void unRegister(JSONObject jSONObject) {
        cvf.a().a(jSONObject);
    }
}
