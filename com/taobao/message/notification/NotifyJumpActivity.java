package com.taobao.message.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.message.notification.banner.support.MarketingInnerNotificationAdapter;
import com.taobao.message.notification.constans.NotifyConstants;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class NotifyJumpActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MSGTITLE = "msgTitle";
    public static final String KEY_MSGTYPEID = "msgTypeId";
    public static String NAV_URL_MSG_CENTER_OFFICAL = null;
    public static final String NOTIFY_AGOO_FLAG_ID = "AliAgooMsgID";
    public static final String NOTIFY_CONTENT_INTENT_BODY = "notifyContentIntentBody";
    private static final String TAG = "NotifyJumpActivity";

    public static /* synthetic */ Object ipc$super(NotifyJumpActivity notifyJumpActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    static {
        kge.a(1347304303);
        NAV_URL_MSG_CENTER_OFFICAL = "http://tb.cn/n/ww/official";
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        String dataString = intent == null ? "" : intent.getDataString();
        if (intent != null && "agoo://com.taobao.taobao/thirdpush?".equals(dataString)) {
            TLog.loge(TAG, "dat set null");
            intent.setData(null);
        }
        super.onCreate(bundle);
        TLog.loge(TAG, "on create");
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.e();
        }
        AppMonitor.Counter.commit("accs", "msg_notify_jump", "", mto.a.GEO_NOT_SUPPORT);
        if (handleAgooPushMessage(getIntent())) {
            finish();
            return;
        }
        getIntent().putExtra(NotifyConstants.NOTIFY_URL_KEY_COMEFROM, "push");
        ActivityJumpUtil.jumpToActivity(this, getIntent(), "com.taobao.message.notification.NotifyJumpActivitySrc");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean handleAgooPushMessage(android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.notification.NotifyJumpActivity.handleAgooPushMessage(android.content.Intent):boolean");
    }

    private void notificationUT(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805acf6f", new Object[]{this, str, str2, str3});
            return;
        }
        TLog.loge("PushLaunch", " pushId " + str2);
        HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + str2, str2, null, "0", str3, null, null);
        EnvUtil.UTClick(createUTData, 0, str);
        if (StringUtils.isEmpty(str) || !str.contains("spm=")) {
            createUTData.put("spm-cnt", "a2103.11111292.0.0");
        }
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(createUTData);
        TaobaoRegister.clickMessage(this, str2, null);
    }

    private static Map<String, String> parseBody(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9f169b7b", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            try {
                String string = parseObject.getString("title");
                if (StringUtils.isEmpty(string)) {
                    return null;
                }
                hashMap.put("title", string);
                String string2 = parseObject.getString(RemoteMessageConst.Notification.TICKER);
                if (StringUtils.isEmpty(string2)) {
                    string2 = string;
                }
                hashMap.put(RemoteMessageConst.Notification.TICKER, string2);
                String string3 = parseObject.getString("text");
                if (StringUtils.isEmpty(string3)) {
                    string3 = string;
                }
                hashMap.put("text", string3);
                String string4 = parseObject.getString(RemoteMessageConst.Notification.SOUND);
                if (!StringUtils.isEmpty(string4)) {
                    hashMap.put(RemoteMessageConst.Notification.SOUND, string4);
                }
                hashMap.put("url", parseObject.getString("url"));
                JSONObject jSONObject = parseObject.getJSONObject(Constants.KEY_EXTS);
                if (jSONObject != null) {
                    hashMap.put("view_type", parseViewTypeFromJson(jSONObject));
                    hashMap.put("id", parseOfficalIdFromJson(jSONObject));
                    hashMap.put(Constants.KEY_EXTS, jSONObject.toString());
                    hashMap.put("m-icon", jSONObject.getString("m-icon"));
                    String string5 = jSONObject.getString("wmc_source_id");
                    if (!StringUtils.isEmpty(string5)) {
                        hashMap.put("wmc_source_id", string5);
                    }
                    String string6 = jSONObject.getString("nav_source_id");
                    if (!StringUtils.isEmpty(string6)) {
                        hashMap.put("nav_source_id", string6);
                    }
                    String string7 = jSONObject.getString(d.BUNDLE_BUSINESS_JUMP_URL);
                    if (!StringUtils.isEmpty(string7)) {
                        hashMap.put(d.BUNDLE_BUSINESS_JUMP_URL, string7);
                    }
                    String string8 = jSONObject.getString("msg_type_id");
                    if (!StringUtils.isEmpty(string8)) {
                        hashMap.put("msg_type_id", string8);
                    }
                    String string9 = jSONObject.getString(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS);
                    if (!StringUtils.isEmpty(string9)) {
                        hashMap.put(MarketingInnerNotificationAdapter.KEY_PUSHUTARGS, string9);
                    }
                    String string10 = jSONObject.getString("messageId");
                    if (!StringUtils.isEmpty(string10)) {
                        hashMap.put("messageId", string10);
                    }
                }
                return hashMap;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String parseViewTypeFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7966e9b", new Object[]{jSONObject}) : (jSONObject == null || !jSONObject.containsKey("view_type")) ? "0" : jSONObject.getString("view_type");
    }

    private static String parseOfficalIdFromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fb404545", new Object[]{jSONObject}) : (jSONObject == null || !jSONObject.containsKey("id")) ? "" : jSONObject.getString("id");
    }
}
