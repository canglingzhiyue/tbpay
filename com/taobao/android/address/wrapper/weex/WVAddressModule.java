package com.taobao.android.address.wrapper.weex;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.c;
import com.taobao.android.address.wrapper.widget.RealtimeSpeechView;
import com.taobao.android.address.wrapper.widget.a;
import com.taobao.android.nav.Nav;
import com.taobao.runtimepermission.f;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.uc.webview.export.extension.UCExtension;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.dof;
import tb.gvl;

/* loaded from: classes4.dex */
public class WVAddressModule extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHOOSE_ADDRESS = "userChoosedAddress";
    private static final String ACTION_GET_ADDRESS_PARAMS = "getAddressParams";
    private static final String ACTION_OPEN_H5_PAGE = "openH5Page";
    public static final String ACTION_SPEECH_RECOGNITION = "speechRecognition";
    public static final String ACTION_SUPPORT_SPEECH_RECOGNITION = "isSupportSpeechRecognizer";
    public static final String ACTION_USER_SWITCH_RECOMMEND_ADDRESS = "onUserChangeRecommendAddress";
    public static final String PLUGIN_NAME = "ALBBAddress";
    private static a speechRecognitionDialog;
    private String currentSelectType;

    public static /* synthetic */ Object ipc$super(WVAddressModule wVAddressModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else if (hashCode != 1257714799) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ void access$000(Activity activity, String str, com.taobao.android.address.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9fb1cf", new Object[]{activity, str, aVar});
        } else {
            showRecognitionDialog(activity, str, aVar);
        }
    }

    public static /* synthetic */ a access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b1bb609", new Object[0]) : speechRecognitionDialog;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getParams".equals(str)) {
            getParams(str2, wVCallBackContext);
            return true;
        } else if ("openAddress".equals(str)) {
            openAddress(str2, wVCallBackContext);
            return true;
        } else if ("callbackParams".equals(str)) {
            callbackParams(str2, wVCallBackContext);
            return true;
        } else if (ACTION_GET_ADDRESS_PARAMS.equals(str)) {
            getAddressParams(str2, wVCallBackContext);
            return true;
        } else if (ACTION_CHOOSE_ADDRESS.equals(str)) {
            userChoosedAddress(str2, wVCallBackContext);
            return true;
        } else if ("openH5Page".equals(str)) {
            openH5Page(str2, wVCallBackContext);
            return true;
        } else if (ACTION_USER_SWITCH_RECOMMEND_ADDRESS.equals(str)) {
            onUserSwitchRecommendAddress(str2, wVCallBackContext);
            return true;
        } else if ("messageToWeex".equals(str)) {
            navToWeex(str2, wVCallBackContext);
            return true;
        } else {
            if ("messageToH5".equals(str)) {
                WVStandardEventCenter.postNotificationToJS(this.mWebView, "addressMessageToH5", str2);
            } else if (BehavorID.OPENPAGE.equals(str)) {
                try {
                    Nav.from(this.mContext).withFlags(UCExtension.EXTEND_INPUT_TYPE_IDCARD).toUri(gvl.a(this.mContext, new JSONObject(str2).optString("url")));
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    returnErr(wVCallBackContext);
                }
            } else if ("closeWebView".equals(str)) {
                if (this.mContext != null && (this.mContext instanceof Activity)) {
                    ((Activity) this.mContext).finish();
                    return true;
                }
            } else if (ACTION_SPEECH_RECOGNITION.equals(str)) {
                speechRecognition((Activity) this.mContext, str2, new com.taobao.android.address.a() { // from class: com.taobao.android.address.wrapper.weex.WVAddressModule.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.address.a
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("data", str3);
                            r rVar = new r();
                            rVar.a(jSONObject);
                            wVCallBackContext.success(rVar);
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.taobao.android.address.a
                    public void a(int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str3});
                        } else if (wVCallBackContext == null) {
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("code", i);
                                jSONObject.put("message", str3);
                                r rVar = new r();
                                rVar.a(jSONObject);
                                wVCallBackContext.error(rVar);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                });
                return true;
            } else if (ACTION_SUPPORT_SPEECH_RECOGNITION.equals(str)) {
                wVCallBackContext.success();
                return true;
            }
            returnErr(wVCallBackContext);
            return false;
        }
    }

    public void getParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0bfcca", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            try {
                r rVar = new r();
                JSONObject jSONObject = new JSONObject();
                if (c.u != null) {
                    jSONObject.put("data", JSON.toJSONString(c.u));
                } else {
                    jSONObject.put("data", JSON.parse(c.v));
                }
                rVar.a(jSONObject);
                wVCallBackContext.success(rVar);
            } catch (Throwable th) {
                wVCallBackContext.error();
                th.printStackTrace();
            }
        }
    }

    public void callbackParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16dd7b9", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null || this.mContext == null) {
        } else {
            Activity activity = (Activity) this.mContext;
            try {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                Intent intent = new Intent();
                if (!StringUtils.isEmpty(str) && !parseObject.isEmpty()) {
                    intent.putExtra("data", str);
                    activity.setResult(-1, intent);
                    activity.finish();
                    return;
                }
                cancel(activity);
            } catch (Throwable th) {
                th.printStackTrace();
                cancel(activity);
            }
        }
    }

    public void getAddressParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aea3532", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null && this.mContext != null) {
            try {
                r rVar = new r();
                rVar.a(c.a());
                wVCallBackContext.success(rVar);
            } catch (Exception e) {
                e.printStackTrace();
                returnErr(wVCallBackContext);
            }
        } else {
            returnErr(wVCallBackContext);
        }
    }

    @JSMethod(uiThread = true)
    public void userChoosedAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8e4780", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null && str != null && this.mContext != null && (this.mContext instanceof Activity)) {
            userChoosedAddress((Activity) this.mContext, str);
        } else if (this.mContext == null || !(this.mContext instanceof Activity)) {
        } else {
            cancel((Activity) this.mContext);
        }
    }

    public static void userChoosedAddress(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c481d5", new Object[]{activity, str});
        } else if (activity != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() <= 0) {
                    cancel(activity);
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra(com.taobao.android.purchase.core.address.c.K_DELIVERY_ID, jSONObject.optString(c.K_DELIVERY_ID));
                intent.putExtra(com.taobao.android.purchase.core.address.c.K_ADDRESS_TYPE, Integer.parseInt(jSONObject.optString("addressType")));
                intent.putExtra(com.taobao.android.purchase.core.address.c.K_SITE_INFO, jSONObject.optString(com.taobao.android.purchase.core.address.c.K_SITE_INFO));
                intent.putExtra("storeId", jSONObject.optString("storeId"));
                intent.putExtra("shopType", jSONObject.optString("shopType"));
                if (c.t) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!StringUtils.isEmpty(next) && !StringUtils.equals(c.K_DELIVERY_ID, next) && !StringUtils.equals("addressType", next) && !StringUtils.equals(com.taobao.android.purchase.core.address.c.K_SITE_INFO, next) && !StringUtils.equals("storeId", next) && !StringUtils.equals("shopType", next)) {
                            String optString = jSONObject.optString(next);
                            if (!StringUtils.isEmpty(optString)) {
                                intent.putExtra(next, optString);
                            }
                        }
                    }
                }
                activity.setResult(-1, intent);
                activity.finish();
            } catch (Throwable unused) {
                cancel(activity);
            }
        } else {
            cancel(activity);
        }
    }

    @JSMethod(uiThread = true)
    public void openH5Page(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99683bb4", new Object[]{this, str, wVCallBackContext});
        } else if (this.mContext == null || StringUtils.isEmpty(str) || !(this.mContext instanceof Activity)) {
        } else {
            String openH5Page = openH5Page((Activity) this.mContext, str);
            if (StringUtils.isEmpty(openH5Page)) {
                return;
            }
            this.currentSelectType = openH5Page;
        }
    }

    public static String openH5Page(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ced1feb7", new Object[]{activity, str});
        }
        String str2 = "";
        if (activity != null && !StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                String optString2 = jSONObject.optString("addressType");
                if (StringUtils.isEmpty(optString)) {
                    return str2;
                }
                if (StringUtils.equals(optString2, "1")) {
                    Nav.from(activity).forResult(1).toUri(gvl.a(activity, optString));
                } else if (StringUtils.equals(optString2, "2")) {
                    if (c.s != null && c.s.sites != null) {
                        int optInt = jSONObject.optInt("siteIndex");
                        JSONArray jSONArray = new JSONArray(c.s.sites);
                        if (jSONArray.length() > optInt) {
                            str2 = ((JSONObject) jSONArray.get(optInt)).optString("type");
                        }
                    }
                    Nav.from(activity).forResult(9876).toUri(gvl.a(activity, optString));
                } else if (StringUtils.equals(optString2, "3")) {
                    Nav.from(activity).forResult(2).toUri(gvl.a(activity, optString));
                } else {
                    Nav.from(activity).toUri(gvl.a(activity, optString));
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    @JSMethod(uiThread = true)
    public void navToWeex(String str, WVCallBackContext wVCallBackContext) {
        try {
            Field declaredField = WXSDKManager.getInstance().getClass().getDeclaredField("sInstanceId");
            declaredField.setAccessible(true);
            AtomicInteger atomicInteger = (AtomicInteger) declaredField.get(WXSDKManager.getInstance());
            WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(String.valueOf(atomicInteger.get()));
            if (sDKInstance == null) {
                for (int i = atomicInteger.get() - 1; i > 0; i--) {
                    sDKInstance = WXSDKManager.getInstance().getSDKInstance(String.valueOf(i));
                    if (sDKInstance != null) {
                        break;
                    }
                }
            }
            if (sDKInstance != null) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                HashMap hashMap = new HashMap();
                for (String str2 : parseObject.keySet()) {
                    hashMap.put(str2, parseObject.get(str2));
                }
                sDKInstance.a(parseObject.getString("eventName"), (Map<String, Object>) hashMap);
                wVCallBackContext.success();
                return;
            }
            wVCallBackContext.error();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @JSMethod(uiThread = true)
    public void onUserSwitchRecommendAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9fb1a4", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext != null && this.mContext != null && (this.mContext instanceof Activity)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Intent intent = new Intent();
                intent.putExtra("data", jSONObject.optString("data"));
                intent.putExtra("type", jSONObject.optString("type"));
                intent.putExtra("bizIdentity", jSONObject.optString("bizIdentity"));
                ((Activity) this.mContext).setResult(-1, intent);
                ((Activity) this.mContext).finish();
            } catch (Throwable unused) {
                cancel((Activity) this.mContext);
            }
        } else {
            cancel((Activity) this.mContext);
        }
    }

    public static void speechRecognition(final Activity activity, final String str, final com.taobao.android.address.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c30a14", new Object[]{activity, str, aVar});
        } else {
            f.a(activity, new String[]{"android.permission.RECORD_AUDIO"}).b("address").a(activity.getString(R.string.address_request_record_auto)).a(true).a(0L).a(new Runnable() { // from class: com.taobao.android.address.wrapper.weex.WVAddressModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WVAddressModule.access$000(activity, str, aVar);
                    }
                }
            }).b(new Runnable() { // from class: com.taobao.android.address.wrapper.weex.WVAddressModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity2 = activity;
                    Toast.makeText(activity2, activity2.getString(R.string.address_request_record_auto_fail), 0).show();
                    com.taobao.android.address.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(1, "");
                }
            }).a();
        }
    }

    private static void showRecognitionDialog(Activity activity, String str, final com.taobao.android.address.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743c22c1", new Object[]{activity, str, aVar});
            return;
        }
        speechRecognitionDialog = new a(activity);
        final RealtimeSpeechView realtimeSpeechView = new RealtimeSpeechView(activity, str);
        speechRecognitionDialog.setContentView(realtimeSpeechView);
        ViewGroup.LayoutParams layoutParams = realtimeSpeechView.getLayoutParams();
        layoutParams.width = activity.getResources().getDisplayMetrics().widthPixels;
        realtimeSpeechView.setLayoutParams(layoutParams);
        realtimeSpeechView.setRealTimeSpeechListener(new RealtimeSpeechView.a() { // from class: com.taobao.android.address.wrapper.weex.WVAddressModule.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.address.wrapper.widget.RealtimeSpeechView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                WVAddressModule.access$100().dismiss();
                com.taobao.android.address.a aVar2 = com.taobao.android.address.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(0, "");
            }

            @Override // com.taobao.android.address.wrapper.widget.RealtimeSpeechView.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                WVAddressModule.access$100().dismiss();
                com.taobao.android.address.a aVar2 = com.taobao.android.address.a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(str2);
            }
        });
        speechRecognitionDialog.getWindow().setGravity(80);
        speechRecognitionDialog.setCanceledOnTouchOutside(true);
        speechRecognitionDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.taobao.android.address.wrapper.weex.WVAddressModule.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    return;
                }
                RealtimeSpeechView realtimeSpeechView2 = RealtimeSpeechView.this;
                if (realtimeSpeechView2 != null) {
                    realtimeSpeechView2.cancelRecorder();
                }
                com.taobao.android.address.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(0, "");
            }
        });
        speechRecognitionDialog.show();
        dof.a(RealtimeSpeechView.SPEECH_PAGE, "show", "", null);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        stopRecognition();
    }

    public static void stopRecognition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3fbc5c", new Object[0]);
            return;
        }
        a aVar = speechRecognitionDialog;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        speechRecognitionDialog.cancel();
    }

    public static void destoryRecognition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3778290a", new Object[0]);
            return;
        }
        speechRecognitionDialog = null;
        speechRecognitionDialog = null;
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        destoryRecognition();
        super.onDestroy();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1 && i2 == 1) {
            if (this.mContext == null) {
                return;
            }
            executeActivityResult((Activity) this.mContext, intent, false);
        } else if (i == 9876 && i2 == 9876) {
            if (this.mContext == null) {
                return;
            }
            storeFinish((Activity) this.mContext, intent, this.currentSelectType);
        } else if (i == 2) {
            if (this.mContext == null) {
                return;
            }
            executeActivityResult((Activity) this.mContext, intent, true);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public static void executeActivityResult(Activity activity, Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("536cffbd", new Object[]{activity, intent, new Boolean(z)});
        } else if (intent == null) {
            cancel(activity);
        } else {
            String stringExtra = intent.getStringExtra("data");
            if (StringUtils.isEmpty(stringExtra)) {
                cancel(activity);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String optString = jSONObject.optString("deliveryAddressId");
                String optString2 = jSONObject.optString(com.taobao.android.purchase.core.address.c.K_LINK_ADDRESS_ID);
                Intent intent2 = new Intent();
                intent2.putExtra(com.taobao.android.purchase.core.address.c.K_DELIVERY_ID, optString);
                if (z) {
                    intent2.putExtra(com.taobao.android.purchase.core.address.c.K_ADDRESS_TYPE, 3);
                    intent2.putExtra(com.taobao.android.purchase.core.address.c.K_LINK_ADDRESS_ID, optString2);
                } else {
                    intent2.putExtra(com.taobao.android.purchase.core.address.c.K_ADDRESS_TYPE, 1);
                }
                if (c.t) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!StringUtils.isEmpty(next) && !StringUtils.equals("deliveryAddressId", next) && !StringUtils.equals(com.taobao.android.purchase.core.address.c.K_LINK_ADDRESS_ID, next)) {
                            String optString3 = jSONObject.optString(next);
                            if (!StringUtils.isEmpty(optString3)) {
                                intent2.putExtra(next, optString3);
                            }
                        }
                    }
                }
                activity.setResult(-1, intent2);
                activity.finish();
            } catch (Throwable unused) {
            }
        }
    }

    public static void storeFinish(Activity activity, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12c87474", new Object[]{activity, intent, str});
        } else if (intent == null) {
            cancel(activity);
        } else {
            String stringExtra = intent.getStringExtra("data");
            if (StringUtils.isEmpty(stringExtra)) {
                cancel(activity);
                return;
            }
            com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(stringExtra);
            parseObject.put("selectType", (Object) str);
            String jSONString = parseObject.toJSONString();
            Intent intent2 = new Intent();
            intent2.putExtra(com.taobao.android.purchase.core.address.c.K_SITE_INFO, jSONString);
            intent2.putExtra(com.taobao.android.purchase.core.address.c.K_ADDRESS_TYPE, 2);
            activity.setResult(-1, intent2);
            activity.finish();
        }
    }

    public static void cancel(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a717693", new Object[]{activity});
            return;
        }
        activity.setResult(0);
        activity.finish();
    }

    private void returnErr(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29cc959", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", -1);
            jSONObject.put("message", "fail");
            r rVar = new r();
            rVar.a(jSONObject);
            wVCallBackContext.error(rVar);
        } catch (Throwable unused) {
        }
    }

    public void openAddress(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a54d18", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("nativeScheme");
            String optString2 = jSONObject.optString("addressUrl");
            String optString3 = jSONObject.optString("data");
            String optString4 = jSONObject.optString("bizId");
            if (StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString4)) {
                optString = "http://my.m.taobao.com/deliver/common_address.htm?bizId=" + optString4 + "&data=" + optString3;
            }
            Bundle bundle = new Bundle();
            bundle.putString("data", optString3);
            bundle.putString(c.K_COMMON_ADDRESS_URL, optString2);
            String a2 = gvl.a(this.mContext, optString);
            if (jSONObject.has("requestCode")) {
                Nav.from(this.mContext).withExtras(bundle).forResult(Integer.parseInt(jSONObject.optString("requestCode"))).toUri(a2);
            } else {
                Nav.from(this.mContext).withExtras(bundle).toUri(a2);
            }
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }
}
