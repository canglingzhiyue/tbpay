package com.alipay.android.msp.framework.assist;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.core.clients.MspViClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.engine.IViSecEngine;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.verifyidentity.alipay.H5Plugin.VITaoBaoJSAPIAdapter;
import com.alipay.mobile.verifyidentity.callback.RecommendBioListener;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* loaded from: classes3.dex */
public class MspViSecImpl implements IViSecEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public void cleanFpCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db7fd356", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public String getCertsn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52eaf7a4", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public String getVIDataForPaySetting(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b25351", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public void hardwarePayOpt(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de26ffd3", new Object[]{this, new Integer(i), str});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public boolean isVITaskExecuting(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c306f295", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public void verifyId(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0050c8a", new Object[]{this, str, str2, str3, new Integer(i)});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public String getVIData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a09122fc", new Object[]{this, str});
        }
        try {
            return VerifyIdentityEngine.getInstance(GlobalHelper.getInstance().getContext()).getEnvInfoForMsp(str, false);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public String getSecDataForMsp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51deccf3", new Object[]{this});
        }
        try {
            return VerifyIdentityEngine.getInstance(GlobalHelper.getInstance().getContext()).getSecDataForMsp();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public Activity getVidTopActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fda7e4f8", new Object[]{this});
        }
        try {
            return VerifyIdentityEngine.getInstance(GlobalHelper.getInstance().getContext()).getTopActivity().get();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public void setStartActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb58ec1", new Object[]{this, context});
            return;
        }
        VerifyIdentityEngine verifyIdentityEngine = VerifyIdentityEngine.getInstance(GlobalHelper.getInstance().getContext());
        if (verifyIdentityEngine == null) {
            return;
        }
        verifyIdentityEngine.setStartActivityContext(context);
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public void unifiedStartByVerifyIdentity(final int i, String str, String str2, final String str3) {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6baf7edc", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        try {
            final MspViClient mspViClient = MspContextManager.getInstance().getTradeContextByBizId(i).getMspViClient();
            VerifyIdentityEngine verifyIdentityEngine = VerifyIdentityEngine.getInstance(GlobalHelper.getInstance().getContext());
            VIListenerByVerifyId vIListenerByVerifyId = new VIListenerByVerifyId() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
                public void onVerifyResult(String str4, String str5, String str6, VerifyIdentityResult verifyIdentityResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa9841f2", new Object[]{this, str4, str5, str6, verifyIdentityResult});
                        return;
                    }
                    String code = verifyIdentityResult != null ? verifyIdentityResult.getCode() : "";
                    LogUtil.record(4, "", "onVerifyResult", "actionData:" + str3);
                    JSONObject parseObject = JSON.parseObject(str3);
                    mspViClient.onVerifyidEnd(i, str3, "", code, parseObject.containsKey("notExitAfterVid") ? parseObject.getBooleanValue("notExitAfterVid") : false);
                }
            };
            VIMessageChannel vIMessageChannel = new VIMessageChannel() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannel
                public void onAction(Bundle bundle, VIMessageChannelCallback vIMessageChannelCallback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bb94f28", new Object[]{this, bundle, vIMessageChannelCallback});
                        return;
                    }
                    bundle.putString("confirmAct", JSON.parseObject(str3).getJSONObject("confirmAct").getString("name"));
                    bundle.putInt("bizId", i);
                    mspViClient.onVidEnd(bundle, vIMessageChannelCallback);
                }
            };
            LogUtil.record(4, "", "onVerifyResult", "actionData:".concat(String.valueOf(str3)));
            if (str3 != null) {
                try {
                    LogUtil.record(4, "", "onVerifyResult", "actionData:".concat(String.valueOf(str3)));
                    JSONObject parseObject = JSON.parseObject(str3);
                    if (parseObject.containsKey("vidExitFlag")) {
                        int intValue = parseObject.getIntValue("vidExitFlag");
                        try {
                            LogUtil.record(4, "", "onVerifyResult", "vidExitFlag:".concat(String.valueOf(intValue)));
                            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                            if (mspContextByBizId != null && (mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient()) != null) {
                                LogUtil.record(4, "", "setmVidExitFlag", "vidExitFlag:".concat(String.valueOf(intValue)));
                                mspWindowClient.setVidExitFlag(intValue);
                            }
                            i2 = intValue;
                        } catch (Exception e) {
                            e = e;
                            i2 = intValue;
                            LogUtil.printExceptionStackTrace(e);
                            Bundle bundle = new Bundle();
                            bundle.putString("VIExitFlag", String.valueOf(i2));
                            bundle.putString("serviceId", String.valueOf(i));
                            bundle.putBoolean("isFromMsp", true);
                            verifyIdentityEngine.unifiedStartByVerifyId(str, str2, "", bundle, vIListenerByVerifyId, vIMessageChannel);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("VIExitFlag", String.valueOf(i2));
            bundle2.putString("serviceId", String.valueOf(i));
            bundle2.putBoolean("isFromMsp", true);
            verifyIdentityEngine.unifiedStartByVerifyId(str, str2, "", bundle2, vIListenerByVerifyId, vIMessageChannel);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public String getFpInfo(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e827e8ad", new Object[]{this, context});
        }
        LogUtil.record(1, "MspSdkEngine", "getFpInfo", "start");
        try {
            str = AuthenticatorApi.getFingerprintExtInfo(context);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            str = "{\"type\":-1}";
        }
        return !TextUtils.isEmpty(str) ? str : "{\"type\":-1}";
    }

    @Override // com.alipay.android.msp.plugin.engine.IViSecEngine
    public void verifyIdentity(JSONObject jSONObject, Context context, int i, final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a81db9e", new Object[]{this, jSONObject, context, new Integer(i), eventAction});
            return;
        }
        VerifyIdentityEngine verifyIdentityEngine = VerifyIdentityEngine.getInstance(context);
        String string = jSONObject.getString(Constants.VI_ENGINE_VERIFYID);
        String string2 = jSONObject.getString("token");
        String string3 = jSONObject.getString("bizName");
        String string4 = jSONObject.getString(Constants.VI_ENGINE_VERIFY_TYPE);
        String string5 = jSONObject.getString("logonId");
        String string6 = jSONObject.getString("sceneId");
        String string7 = jSONObject.getString("bizId");
        String string8 = jSONObject.getString(Constants.VI_ENGINE_FAST_BIZDATA);
        String string9 = jSONObject.getString(Constants.VI_ENGINE_FAST_MODULENAME);
        String string10 = jSONObject.getString("moduleData");
        String string11 = jSONObject.getString("VIData");
        Bundle cleanParams = Utils.cleanParams(Utils.toBundle(jSONObject));
        cleanParams.putBoolean("isFromMsp", true);
        cleanParams.putString("serviceId", String.valueOf(string7));
        LogUtil.record(1, "MspSdkEngine:verifyIdentity", "startVerifyIdentity verifyId: " + string + " token:" + string2);
        final MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (verifyIdentityEngine == null) {
            return;
        }
        VIListenerByVerifyId vIListenerByVerifyId = new VIListenerByVerifyId() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
            public void onVerifyResult(String str, String str2, String str3, VerifyIdentityResult verifyIdentityResult) {
                String str4;
                String str5;
                String str6;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("aa9841f2", new Object[]{this, str, str2, str3, verifyIdentityResult});
                    return;
                }
                if (verifyIdentityResult != null) {
                    str4 = verifyIdentityResult.getCode();
                    str6 = verifyIdentityResult.getMessage();
                    str5 = verifyIdentityResult.getBizResponseData();
                } else {
                    str4 = "";
                    str5 = str4;
                    str6 = str5;
                }
                LogUtil.record(4, "", "onVerifyResult", "verifyId:".concat(String.valueOf(str)));
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", (Object) str4);
                jSONObject2.put("message", (Object) str6);
                jSONObject2.put(Constants.VI_ENGINE_FAST_BIZ_RES_DATA, (Object) str5);
                MspContext mspContext = mspContextByBizId;
                if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                FBDocument invokeDoc = eventAction.getInvokeDoc();
                                long invokeFunKey = eventAction.getInvokeFunKey();
                                if (invokeFunKey == 0) {
                                    return;
                                }
                                JSPlugin.sendNativeResult(invokeDoc, invokeFunKey, jSONObject2.toJSONString());
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    }, true);
                    return;
                }
                try {
                    FBDocument invokeDoc = eventAction.getInvokeDoc();
                    long invokeFunKey = eventAction.getInvokeFunKey();
                    if (invokeFunKey == 0) {
                        return;
                    }
                    MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, jSONObject2.toJSONString());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        };
        VerifyIdentityListener verifyIdentityListener = new VerifyIdentityListener() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.callback.VerifyIdentityListener
            public void onVerifyResult(String str, String str2, VerifyIdentityResult verifyIdentityResult) {
                String str3;
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f017728", new Object[]{this, str, str2, verifyIdentityResult});
                    return;
                }
                String str5 = "";
                if (verifyIdentityResult != null) {
                    str5 = verifyIdentityResult.getCode();
                    str3 = verifyIdentityResult.getMessage();
                    str4 = verifyIdentityResult.getBizResponseData();
                } else {
                    str3 = str5;
                    str4 = str3;
                }
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", (Object) str5);
                jSONObject2.put("message", (Object) str3);
                jSONObject2.put(Constants.VI_ENGINE_FAST_BIZ_RES_DATA, (Object) str4);
                MspContext mspContext = mspContextByBizId;
                if (mspContext == null || !mspContext.isUseSafeJsExecute()) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                FBDocument invokeDoc = eventAction.getInvokeDoc();
                                long invokeFunKey = eventAction.getInvokeFunKey();
                                if (invokeFunKey == 0) {
                                    return;
                                }
                                JSPlugin.sendNativeResult(invokeDoc, invokeFunKey, jSONObject2.toJSONString());
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    });
                    return;
                }
                try {
                    FBDocument invokeDoc = eventAction.getInvokeDoc();
                    long invokeFunKey = eventAction.getInvokeFunKey();
                    if (invokeFunKey == 0) {
                        return;
                    }
                    MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, jSONObject2.toJSONString());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        };
        try {
            if (!TextUtils.isEmpty(string4) && !"standard".equalsIgnoreCase(string4)) {
                if ("verify_init".equalsIgnoreCase(string4)) {
                    verifyIdentityEngine.fastVerifyWithInitRequest(string5, string6, string7, string8, cleanParams, vIListenerByVerifyId, string3);
                    return;
                } else if ("verify_module".equalsIgnoreCase(string4)) {
                    verifyIdentityEngine.fastVerifyWithModuleRequest(string, string2, string9, string10, string8, cleanParams, vIListenerByVerifyId, string3);
                    return;
                } else if ("verify".equalsIgnoreCase(string4)) {
                    verifyIdentityEngine.unifiedStartByVerifyId(string, string10, string8, cleanParams, vIListenerByVerifyId);
                    return;
                } else if ("recommend".equalsIgnoreCase(string4)) {
                    ProductManagerEngine.getInstance(context).startByVIData(string11, new Bundle(), new RecommendBioListener() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.verifyidentity.callback.RecommendBioListener
                        public void onResult(final String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("cfd30c6d", new Object[]{this, str});
                            } else {
                                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.5.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            FBDocument invokeDoc = eventAction.getInvokeDoc();
                                            long invokeFunKey = eventAction.getInvokeFunKey();
                                            if (invokeFunKey == 0) {
                                                return;
                                            }
                                            JSPlugin.sendNativeResult(invokeDoc, invokeFunKey, str);
                                        } catch (Throwable th) {
                                            LogUtil.printExceptionStackTrace(th);
                                        }
                                    }
                                });
                            }
                        }
                    });
                    return;
                } else if (!VITaoBaoJSAPIAdapter.getEnvData.equalsIgnoreCase(string4)) {
                    return;
                } else {
                    String envData = verifyIdentityEngine.getEnvData(new Bundle());
                    final JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("envData", (Object) envData);
                    if (mspContextByBizId != null && mspContextByBizId.isUseSafeJsExecute()) {
                        FBDocument invokeDoc = eventAction.getInvokeDoc();
                        long invokeFunKey = eventAction.getInvokeFunKey();
                        if (invokeFunKey == 0) {
                            return;
                        }
                        MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, jSONObject2.toJSONString());
                        return;
                    }
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspViSecImpl.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                FBDocument invokeDoc2 = eventAction.getInvokeDoc();
                                long invokeFunKey2 = eventAction.getInvokeFunKey();
                                if (invokeFunKey2 == 0) {
                                    return;
                                }
                                JSPlugin.sendNativeResult(invokeDoc2, invokeFunKey2, jSONObject2.toJSONString());
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    }, true);
                    return;
                }
            }
            if (TextUtils.isEmpty(string)) {
                verifyIdentityEngine.startVerifyByToken(string2, string3, cleanParams, verifyIdentityListener);
            } else {
                verifyIdentityEngine.startVerifyByVerifyId(string, string2, string3, cleanParams, vIListenerByVerifyId);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
