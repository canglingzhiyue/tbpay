package com.taobao.tao.msgcenter.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.config.IDefaultConfig;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.ParseUtil;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.message.uikit.util.ActivityUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.NavUrls;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes8.dex */
public class MsgCenterThirdPushActivity extends BaseNotifyClickActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String DEFAULT_ADDRESS_MY_EXPRESS = null;
    public static String NAV_URL_MSG_CENTER_CATEGORY = null;
    public static String NOTIFY_CONTENT_INTENT_BODY = null;
    private static final String NS = "mpm_business_switch";
    private static final String TAG = "msgcenter:MsgCenterThirdPushActivity";
    private boolean mNavDone = false;
    private boolean mFinishBeforeJump = true;

    private boolean hasTFCCommonUtils() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1f52da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(MsgCenterThirdPushActivity msgCenterThirdPushActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -366027668:
                super.onMessage((Intent) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public static /* synthetic */ boolean access$002(MsgCenterThirdPushActivity msgCenterThirdPushActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e87a8011", new Object[]{msgCenterThirdPushActivity, new Boolean(z)})).booleanValue();
        }
        msgCenterThirdPushActivity.mNavDone = z;
        return z;
    }

    static {
        kge.a(-603048479);
        NOTIFY_CONTENT_INTENT_BODY = "notifyContentIntentBody";
        NAV_URL_MSG_CENTER_CATEGORY = NavUrls.NAV_URL_MSG_CENTER_CATEGORY;
        DEFAULT_ADDRESS_MY_EXPRESS = "[\"http://tb.cn/n/im/dynamic/msg_aura_page.html?bizConfigCode=myExpress&enableImmersive=true\",\"https://tb.cn/n/im/dynamic/msg_aura_page.html?bizConfigCode=myExpress&enableImmersive=true\"]";
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TLog.loge(TAG, "onDestory");
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent != null && "agoo://com.taobao.taobao/thirdpush?".equals(String.valueOf(intent.getData()))) {
            TLog.loge(TAG, "dat set null");
            intent.setData(null);
        }
        super.onCreate(bundle);
        TLog.loge(TAG, "MsgCenterThirdPushActivity onCreate");
        monitor();
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        try {
            if (!this.mNavDone) {
                TLog.loge(TAG, "!mNavDone");
                return;
            }
            if (ActivityUtil.onlyOneActivity(this, getClass().getName())) {
                String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", IDefaultConfig.AGOO_PUSH_BACK_TO_URL, getDefaultConfig(IDefaultConfig.AGOO_PUSH_BACK_TO_URL, ""));
                if (!TextUtils.isEmpty(config)) {
                    TLog.loge(TAG, " back jump to :" + config);
                    Nav.from(this).toUri(config);
                } else {
                    TLog.loge(TAG, "agooPushBackToUrl is empty");
                }
            } else {
                TLog.loge(TAG, "not back jump because not only one task, mNavDone is " + this.mNavDone);
            }
            finish();
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity
    public void onMessage(Intent intent) {
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2edc6c", new Object[]{this, intent});
            return;
        }
        TLog.loge(TAG, b.c.EVENT_ON_MESSAGE);
        super.onMessage(intent);
        if (intent != null) {
            try {
                TLog.loge(TAG, intent.getExtras() + str);
                Bundle convertMsgExtras = ConvertUtil.convertMsgExtras(intent);
                if (convertMsgExtras != null) {
                    str = convertMsgExtras.getString("id");
                }
                String str2 = str;
                String targetUrl = getTargetUrl(convertMsgExtras.getString(TaobaoConstants.MESSAGE_URL));
                String stringExtra = intent.getStringExtra("type");
                HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + str2, str2, null, "0", stringExtra, null, null);
                EnvUtil.UTClick(createUTData, 0, targetUrl);
                TLog.loge(TAG, " info " + JSON.toJSONString(createUTData));
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(createUTData);
                if (convertMsgExtras != null) {
                    TLog.loge(TAG, " body " + convertMsgExtras.getString(AgooConstants.MESSAGE_BODY));
                    if (!TextUtils.isEmpty(targetUrl)) {
                        TLog.loge(TAG, targetUrl);
                        Bundle bundle = new Bundle();
                        bundle.putString(NOTIFY_CONTENT_INTENT_BODY, convertMsgExtras.getString(AgooConstants.MESSAGE_BODY));
                        JSONObject parseObject = JSON.parseObject(convertMsgExtras.getString(AgooConstants.MESSAGE_BODY));
                        if (parseObject != null) {
                            String string = parseObject.getJSONObject(Constants.KEY_EXTS).getString("messageId");
                            if (!TextUtils.isEmpty(string)) {
                                bundle.putString("messageId", string);
                            }
                        }
                        TLog.loge(TAG, "valid url: " + targetUrl);
                        jumpToTarget(targetUrl, bundle);
                        return;
                    }
                }
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
                finish();
                return;
            }
        }
        String config = OrangeConfig.getInstance().getConfig("mpm_business_switch", IDefaultConfig.MESSAGE_CENTER_CATEGORY_URL, getDefaultConfig(IDefaultConfig.MESSAGE_CENTER_CATEGORY_URL, NAV_URL_MSG_CENTER_CATEGORY));
        TLog.loge(TAG, "url parse error,Jump to " + config);
        jumpToTarget(config, null);
    }

    private String getTargetUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c0871c7", new Object[]{this, str});
        }
        if ("0".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "convertMyExpressUrl", "1"))) {
            return str;
        }
        if (str == null) {
            return null;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("mpm_original_url");
        TLog.loge(TAG, "get mpm_original_url=" + queryParameter);
        JSONArray parseArray = JSON.parseArray(ConfigUtil.getValue("mpm_business_switch", "directJumpUrl", DEFAULT_ADDRESS_MY_EXPRESS));
        if (parseArray == null || parseArray.isEmpty() || !parseArray.contains(queryParameter)) {
            return str;
        }
        TLog.loge(TAG, "convert targetUrl from \"" + str + "\" to \"" + queryParameter + "\"");
        return queryParameter;
    }

    private void jumpToTarget(final String str, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a71a9", new Object[]{this, str, bundle});
        } else {
            UIHandler.post(new Runnable() { // from class: com.taobao.tao.msgcenter.activity.MsgCenterThirdPushActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ActivityJumpUtil.navLandingUrlWhenMessageNotLoad(MsgCenterThirdPushActivity.this, str)) {
                        MsgCenterThirdPushActivity.access$002(MsgCenterThirdPushActivity.this, true);
                    } else {
                        TLog.loge(MsgCenterThirdPushActivity.TAG, "nav start " + str);
                        (bundle != null ? Nav.from(MsgCenterThirdPushActivity.this).withExtras(bundle) : Nav.from(MsgCenterThirdPushActivity.this)).toUri(ParseUtil.urlSplicingFromParam(str));
                        MsgCenterThirdPushActivity.access$002(MsgCenterThirdPushActivity.this, true);
                        if ("1".equals(ConfigUtil.getValue("mpm_business_switch", "useThirdFinish", "1"))) {
                            MsgCenterThirdPushActivity.this.finish();
                        }
                        TLog.loge(MsgCenterThirdPushActivity.TAG, "nav end");
                    }
                }
            });
        }
    }

    @Override // com.taobao.agoo.BaseNotifyClickActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TLog.loge(TAG, "onStart");
    }

    private void monitor() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1404e1", new Object[]{this});
            return;
        }
        String str2 = null;
        if (getIntent() != null) {
            str2 = getIntent().getStringExtra("AliAgooMsgID");
            str = getIntent().getStringExtra(AgooConstants.MESSAGE_BODY);
        } else {
            str = null;
        }
        TLog.loge(TAG, " onStart agooId " + str2 + "|" + str);
        if (!TextUtils.isEmpty(str2)) {
            return;
        }
        TLog.loge(TAG, "agooId is null");
    }

    public static String getDefaultConfig(String str, String str2) {
        Map<String, String> defaultConfigMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5556ef58", new Object[]{str, str2});
        }
        try {
            IDefaultConfig iDefaultConfig = (IDefaultConfig) GlobalContainer.getInstance().get(IDefaultConfig.class);
            if (iDefaultConfig != null && (defaultConfigMap = iDefaultConfig.getDefaultConfigMap()) != null) {
                String str3 = defaultConfigMap.get(str);
                if (str3 != null) {
                    return str3;
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        return str2;
    }
}
