package com.alipay.mobile.verifyidentity.ui.fb.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.internal.util.b;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.DebugViewer;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class BaseFBPlugin extends AbsFBPlugin implements View.OnClickListener, View.OnFocusChangeListener, FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABORT_SCENE_CANCEL_BY_ENGINE = "CANCEL_BY_ENGINE";
    public static final String ABORT_SCENE_MSP_EXIT = "SCENE_MSP_EXIT";
    public static final String KEY_COMMON_ACTION = "onViAction";
    public JSONObject actionConfig;
    private Context b;
    private FBPluginCtx c;
    private MICRpcResponse d;
    public Bundle extParams;
    private BroadcastReceiver f;
    private long g;
    public MicroModule mModule;
    public String moduleData;
    public String token;
    public String verifyData;
    public String verifyId;
    public String viType;

    /* renamed from: a  reason: collision with root package name */
    private final String f6086a = getClass().getSimpleName();
    public Handler mainHandler = new Handler(Looper.getMainLooper());
    private Object e = new Object();
    public JSONObject jsFuncNames = new JSONObject();

    /* loaded from: classes3.dex */
    public class ACT_CONF {
        public static final String costTip = "costTip";
        public static final String disableSmartSort = "disableSmartSort";
        public static final String hwAuthTip = "hwAuthTip";
        public static final String hwAuthingText = "hwAuthingText";
        public static final String hwInputPwdTip = "hwInputPwdTip";
        public static final String hwPaySuccessText = "hwPaySuccessText";
        public static final String hwPayingText = "hwPayingText";
        public static final String hwRetryText = "hwRetryText";
        public static final String kVIDisableForgetPwdKey = "kVIDisableForgetPwdKey";
        public static final String loadingPaySuccessText = "loadingPaySuccessText";
        public static final String loadingPayingText = "loadingPayingText";
        public static final String login_id = "LoginId";
        public static final String pwdInputBtn = "pwdInputBtn";
        public static final String pwdInputTip = "pwdInputTip";
        public static final String pwdPlaceHolder = "pwdPlaceHolder";
        public static final String pwdTip = "pwdTip";
        public static final String supportEmbedVi = "supportEmbedVi";
        public static final String supportNoPwdUI = "supportNoPwdUI";
        public static final String supportRetain = "supportRetain";
        public static final String supportVersion = "supportVersion";
        public static final String usePwd = "usePwd";

        public ACT_CONF() {
        }
    }

    /* loaded from: classes3.dex */
    public class PLUGIN_ACTION {
        public static final String payStatus = "payStatus";
        public static final String viClosePage = "viClosePage";
        public static final String viGetViModel = "viGetViModel";
        public static final String viHandleOtherPayWay = "viHandleOtherPayWay";
        public static final String viOnGetViModel = "viOnGetViModel";
        public static final String viOnViModelChange = "viOnViModelChange";
        public static final String viPreBioOpen = "viPreBioOpen";
        public static final String viPreStart = "viPreStart";
        public static final String viPreload = "viPreload";
        public static final String viPwdVerifyResult = "viPwdVerifyResult";
        public static final String viQueryOtherPayWay = "viQueryOtherPayWay";
        public static final String viResult = "viResult";
        public static final String viRpcRequest = "viRpcRequest";
        public static final String viRpcResponse = "viRpcResponse";
        public static final String viShowForgetPwd = "viShowForgetPwd";
        public static final String viShowNavRightView = "viShowNavRightView";
        public static final String viStart = "viStart";
        public static final String viStatus = "viStatus";
        public static final String viToPWD = "viToPWD";
        public static final String viUpdatePwdTips = "viUpdatePwdTips";

        public PLUGIN_ACTION() {
        }
    }

    /* loaded from: classes3.dex */
    public class PWD_TIPS_TYPE {
        public static final String typeError = "error";
        public static final String typeNormal = "normal";
        public static final String typeWarning = "warning";

        public PWD_TIPS_TYPE() {
        }
    }

    /* loaded from: classes3.dex */
    public class VERIFY_STATUS {
        public static final String abort = "abort";
        public static final String awaitUser = "awaitUser";
        public static final String bioOpenDuplicate = "bioOpenDuplicate";
        public static final String end = "end";
        public static final String start = "start";

        public VERIFY_STATUS() {
        }
    }

    /* loaded from: classes3.dex */
    public class VERIFY_TYPE {
        public static final String faceid = "faceid";
        public static final String fp = "fp";
        public static final String pp = "pp";
        public static final String sp = "sp";
        public static final String swipe = "swipe";
        public static final String zface = "zface";

        public VERIFY_TYPE() {
        }
    }

    public static /* synthetic */ Object ipc$super(BaseFBPlugin baseFBPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void bindModule(MicroModule microModule, String str);

    public abstract void clear();

    public abstract String getPluginName();

    public abstract void handleEngineCancel();

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        }
    }

    public void onHandleOtherPayWay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae78977", new Object[]{this});
        }
    }

    public void onPaySuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a313101", new Object[]{this});
        }
    }

    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        }
    }

    public static /* synthetic */ String access$000(BaseFBPlugin baseFBPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9d17f1c", new Object[]{baseFBPlugin}) : baseFBPlugin.f6086a;
    }

    public static /* synthetic */ FBPluginCtx access$100(BaseFBPlugin baseFBPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBPluginCtx) ipChange.ipc$dispatch("eea4a48e", new Object[]{baseFBPlugin}) : baseFBPlugin.c;
    }

    public BaseFBPlugin(Context context, FBPluginCtx fBPluginCtx) {
        this.g = SystemClock.elapsedRealtime();
        this.b = context;
        this.c = fBPluginCtx;
        this.g = SystemClock.elapsedRealtime();
        logBehavior("cjxr", "UC-MobileIC-170505-1", null);
    }

    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        MicroModule findModule;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
            return;
        }
        this.verifyId = str;
        this.token = moduleDataModel.token;
        this.verifyData = str2;
        this.moduleData = moduleDataModel.data;
        this.extParams = bundle;
        this.f = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                VerifyLogCat.i(BaseFBPlugin.access$000(BaseFBPlugin.this), "收到收银台退出广播：KExitMiniPayViewNotification");
                BaseFBPlugin.this.onBNPageClose();
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("source", b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
                BaseFBPlugin.this.logBehavior("syttcgb", "UC-MobileIC-170505-5", hashMap);
                if (!BaseFBPlugin.this.openDuplicatePayTaskFix()) {
                    return;
                }
                BaseFBPlugin.this.updateVerifyStatusFotQuit(VERIFY_STATUS.abort, BaseFBPlugin.ABORT_SCENE_MSP_EXIT);
            }
        };
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.f, new IntentFilter("KExitMiniPayViewNotification"));
        if (bundle != null && bundle.getBoolean("needFindExist") && (findModule = MicroModuleContext.getInstance().findModule(this.verifyId, this.token, ModuleConstants.VI_MODULE_NAME_PAY_PWD)) != null) {
            VerifyLogCat.i("DST", "basePlugin bind");
            bindModule(findModule, this.moduleData);
            z = true;
        }
        if (z) {
            VerifyLogCat.i(this.f6086a, "Module已经存在，不再创建，直接关联");
        } else if (TextUtils.isEmpty(this.verifyId) || TextUtils.isEmpty(this.verifyData)) {
            VerifyLogCat.w(this.f6086a, "fail to addPlugin!");
        } else {
            if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.synKillPre))) {
                VIFBPluginManager.cachePlugin(this.verifyId, this);
            } else {
                VIFBPluginManager.addPlugin(this.verifyId, this);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(VIFBPluginManager.KEY_PLUGIN_NAME, getPluginName());
            bundle2.putBoolean(VIFBPluginManager.KEY_IS_PLUGIN_MODE, true);
            Bundle bundle3 = this.extParams;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            VerifyIdentityEngine.getInstance(this.b).unifiedStartByVerifyId(this.verifyId, this.verifyData, null, bundle2, new VIListenerByVerifyId() { // from class: com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.callback.VIListenerByVerifyId
                public void onVerifyResult(String str3, String str4, String str5, VerifyIdentityResult verifyIdentityResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa9841f2", new Object[]{this, str3, str4, str5, verifyIdentityResult});
                    } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeEngineCancelNotify)) || verifyIdentityResult == null) {
                    } else {
                        try {
                            if (!"1003".equalsIgnoreCase(verifyIdentityResult.getCode()) || verifyIdentityResult.getExtInfo() == null) {
                                return;
                            }
                            Object obj = verifyIdentityResult.getExtInfo().get("nextProVid");
                            String str6 = "";
                            String valueOf = obj != null ? String.valueOf(obj) : str6;
                            Object obj2 = verifyIdentityResult.getExtInfo().get("subCode");
                            if (obj2 != null) {
                                str6 = String.valueOf(obj2);
                            }
                            if (!TextUtils.isEmpty(str6) && CommonConstant.CANCEL_SUB_BY_START_ACTIVITY_TIMEOUT.equalsIgnoreCase(str6)) {
                                BaseFBPlugin.this.handleEngineCancel();
                            } else if (TextUtils.isEmpty(valueOf) || valueOf.endsWith("mobile_cashier_payment_N_2") || valueOf.endsWith("mobile_cashier_payment_2")) {
                            } else {
                                if ((!BaseFBPlugin.this.openDuplicatePayTaskFix() && (valueOf.endsWith("mobile_cashier_payment_N_1") || valueOf.endsWith("mobile_cashier_payment_1"))) || TextUtils.isEmpty(str6) || !"101".equalsIgnoreCase(str6)) {
                                    return;
                                }
                                if (BaseFBPlugin.this.openDuplicatePayTaskFix()) {
                                    BaseFBPlugin.this.logBehavior("clbyeg", "UC-MobileIC-221110-1", null);
                                }
                                BaseFBPlugin.this.handleEngineCancel();
                            }
                        } catch (Throwable unused) {
                            VerifyLogCat.i(BaseFBPlugin.access$000(BaseFBPlugin.this), "handle engine cancel error");
                        }
                    }
                }
            });
        }
    }

    public boolean openDuplicatePayTaskFix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("573bb754", new Object[]{this})).booleanValue();
        }
        try {
            String reportFlag = ReportHelper.getReportFlag(ReportHelper.enableMultiCashierFixPolice);
            String str = this.f6086a;
            VerifyLogCat.i(str, "openDuplicatePayTaskFix config: " + reportFlag);
            return "Y".equalsIgnoreCase(reportFlag);
        } catch (Throwable th) {
            VerifyLogCat.e(this.f6086a, "openDuplicatePayTaskFix exp: ", th);
            return false;
        }
    }

    public void updateVerifyStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90588c5", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        doCommonAction(PLUGIN_ACTION.viStatus, jSONObject);
    }

    public void updateVerifyStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9eaa695", new Object[]{this, jSONObject});
        } else {
            doCommonAction(PLUGIN_ACTION.viStatus, jSONObject);
        }
    }

    public void updateVerifyStatusNew(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44100afd", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            jSONObject.put("version", "2.0");
        }
        doCommonAction(PLUGIN_ACTION.viStatus, jSONObject);
    }

    public void updateVerifyStatusNew(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3060e15d", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        jSONObject.put("version", "2.0");
        doCommonAction(PLUGIN_ACTION.viStatus, jSONObject);
    }

    public void updateVerifyStatusWithScene(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da698ad", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        jSONObject.put("scene", (Object) str2);
        doCommonAction(PLUGIN_ACTION.viStatus, jSONObject);
    }

    public void updateVerifyStatusFotQuit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5d201", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        jSONObject.put("version", "2.0");
        jSONObject.put("scene", (Object) str2);
        doCommonAction(PLUGIN_ACTION.viStatus, jSONObject);
    }

    public void setJsFuncName(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad6f5af", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.size() <= 0) {
        } else {
            this.jsFuncNames.putAll(jSONObject);
        }
    }

    public String getJsFuncName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2458dbeb", new Object[]{this}) : this.jsFuncNames.getString(KEY_COMMON_ACTION);
    }

    public void setActionConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2886a0ef", new Object[]{this, jSONObject});
        } else {
            this.actionConfig = jSONObject;
        }
    }

    public String getActConf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eab9b8f", new Object[]{this, str});
        }
        JSONObject jSONObject = this.actionConfig;
        return jSONObject == null ? "" : jSONObject.getString(str);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            viNativeExecuteJs(getJsFuncName(), str);
        }
    }

    public void viNativeExecuteJs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec39c2f", new Object[]{this, str, str2});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = KEY_COMMON_ACTION;
        }
        final String replace = "js_function && js_function('$jsonData$');".replace("js_function", str).replace("$jsonData$", TextUtils.isEmpty(str2) ? "" : str2.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\u2028", "\\u2028").replace("\u2029", "\\u2029"));
        this.mainHandler.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String access$000 = BaseFBPlugin.access$000(BaseFBPlugin.this);
                VerifyLogCat.i(access$000, "nativeExecuteJs: " + replace);
                BaseFBPlugin.access$100(BaseFBPlugin.this).nativeExecuteJs(replace);
            }
        });
    }

    public MICRpcResponse sendRpcRequest(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("803ed8a3", new Object[]{this, obj});
        }
        this.d = null;
        JSONObject jSONObject = (JSONObject) JSON.toJSON(obj);
        String str2 = this.f6086a;
        VerifyLogCat.i(str2, "sendRpcRequest: " + jSONObject);
        doCommonAction("viRpcRequest", jSONObject);
        MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        String str3 = "";
        try {
            hashMap.put("module", jSONObject.getString("module"));
            hashMap.put("operationType", "alipay.mobile.ic.dispatch");
            hashMap.put("action", jSONObject.getString("action"));
            if (jSONObject.getString("data") != null) {
                hashMap.put("data-length", String.valueOf(jSONObject.getString("data").length()));
            }
            str3 = jSONObject.getString("token");
            str = jSONObject.getString(Constants.VI_ENGINE_VERIFYID);
        } catch (Exception e) {
            VerifyLogCat.w(this.f6086a, "插件rpc埋点出现异常: ", e);
            str = "";
        }
        mICRpcServiceBiz.writeRpcSendLog(str3, str, hashMap);
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        DebugViewer.getInstance().sendRpc(valueOf, jSONObject);
        synchronized (this.e) {
            try {
                this.e.wait();
            } catch (InterruptedException e2) {
                VerifyLogCat.w(this.f6086a, e2);
            }
        }
        DebugViewer.getInstance().gotRpcResult(valueOf, this.d);
        mICRpcServiceBiz.writeRpcBackLog(this.d, str3, str, elapsedRealtime, hashMap);
        MICRpcResponse mICRpcResponse = this.d;
        if (mICRpcResponse != null) {
            String str4 = mICRpcResponse.channelError;
            if (!TextUtils.isEmpty(str4)) {
                String str5 = this.f6086a;
                VerifyLogCat.i(str5, "鸟巢插件rpc出现 channelError: " + str4);
                if ("-1002".equalsIgnoreCase(str4)) {
                    VerifyLogCat.i(this.f6086a, "通道返回要求立即按成功处理（如收银台sync结果先到）");
                    MICRpcResponse defSucMICRpcResponse = VIUtils.getDefSucMICRpcResponse(str, str3);
                    defSucMICRpcResponse.channelError = str4;
                    return defSucMICRpcResponse;
                }
                try {
                    i = Integer.valueOf(str4).intValue();
                } catch (Exception unused) {
                }
                throw new RpcException(Integer.valueOf(i), str4);
            }
        }
        return this.d;
    }

    public void onBNPageClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9567005", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.f);
        VIFBPluginManager.cleanByVidAndPluginName(this.verifyId, getPluginName());
    }

    public void onVerifyFinished(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92267c0d", new Object[]{this, moduleExecuteResult});
            return;
        }
        MICRpcResponse mICRpcResponse = moduleExecuteResult.getMICRpcResponse();
        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult(mICRpcResponse.finishCode);
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONObject parseObject = JSONObject.parseObject(mICRpcResponse.finishParams);
            if (parseObject != null) {
                hashMap.putAll(parseObject);
            }
        } catch (Exception e) {
            VerifyLogCat.e(this.f6086a, e.getMessage());
        }
        try {
            if (moduleExecuteResult.getExtInfo() != null) {
                hashMap.putAll(moduleExecuteResult.getExtInfo());
            }
        } catch (Exception e2) {
            VerifyLogCat.e(this.f6086a, e2.getMessage());
        }
        if (!TextUtils.isEmpty(mICRpcResponse.verifyCode)) {
            hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
        }
        verifyIdentityResult.setExtInfo(hashMap);
        verifyIdentityResult.setMessage(mICRpcResponse.verifyMessage);
        verifyIdentityResult.setBizResponseData(mICRpcResponse.bizResponseData);
        onVerifyResult(verifyIdentityResult);
    }

    public void onVerifyResult(VerifyIdentityResult verifyIdentityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc594614", new Object[]{this, verifyIdentityResult});
        } else {
            doCommonAction(PLUGIN_ACTION.viResult, (JSONObject) JSON.toJSON(verifyIdentityResult));
        }
    }

    public void doCommonAction(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9cb74d3", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", (Object) str);
        if (jSONObject != null && !jSONObject.isEmpty()) {
            if (PLUGIN_ACTION.viToPWD.equalsIgnoreCase(str)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(MspEventTypes.ACTION_STRING_VID, (Object) this.verifyId);
                if (!TextUtils.isEmpty(jSONObject.getString("version"))) {
                    jSONObject3.put("version", (Object) jSONObject.getString("version"));
                }
                if (!TextUtils.isEmpty(jSONObject.getString("usePwd"))) {
                    jSONObject3.put("usePwd", (Object) jSONObject.getString("usePwd"));
                }
                try {
                    jSONObject3.put("data", (Object) new String(Base64.encode(jSONObject.toJSONString().getBytes("UTF-8"), 2)));
                } catch (UnsupportedEncodingException e) {
                    VerifyLogCat.w(this.f6086a, "fail to build verifyData：", e);
                }
                jSONObject2.put("data", (Object) jSONObject3.toJSONString());
            } else if (PLUGIN_ACTION.viStatus.equalsIgnoreCase(str)) {
                jSONObject.put("type", (Object) this.viType);
                jSONObject2.put("data", (Object) jSONObject);
                a(jSONObject);
            } else {
                jSONObject2.put("data", (Object) jSONObject.toJSONString());
            }
        }
        a(jSONObject2.toJSONString());
    }

    public void doPwdAction(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b1e01f7", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", (Object) str);
        jSONObject2.put("data", (Object) jSONObject);
        a(jSONObject2.toJSONString());
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (!str.equals("src")) {
            return false;
        }
        return b(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin.b(java.lang.String):boolean");
    }

    public void sendModelChangeEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f3176e", new Object[]{this, str, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("preViModel", (Object) str);
        jSONObject.put("nextViModel", (Object) str2);
        jSONObject.put("viType", (Object) str3);
        doCommonAction(PLUGIN_ACTION.viOnViModelChange, jSONObject);
    }

    public void sendOnGetViModelEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eede70e", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nextViModel", (Object) str);
        jSONObject.put("viType", (Object) str2);
        doCommonAction(PLUGIN_ACTION.viOnGetViModel, jSONObject);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            if ("start".equalsIgnoreCase(jSONObject.getString("status"))) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
                String str2 = this.f6086a;
                VerifyLogCat.i(str2, "start cost: " + elapsedRealtime);
                logBehaviorWithCost("cjzttz", "UC-MobileIC-170505-3", String.valueOf(elapsedRealtime), hashMap);
                return;
            }
            logBehavior("cjzttz", "UC-MobileIC-170505-3", hashMap);
        }
    }

    public void logBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7fec42", new Object[]{this, str, str2, hashMap});
        } else {
            logBehaviorWithCost(str, str2, null, hashMap);
        }
    }

    public void logBehaviorWithCost(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac91bb85", new Object[]{this, str, str2, str3, hashMap});
            return;
        }
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, this.mModule == null ? null : this.mModule.getToken(), this.mModule == null ? null : this.mModule.getVerifyId(), str3, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.w(this.f6086a, "logBehavior Exception", th);
        }
    }

    public void forbidDark(View view) {
        if (Build.VERSION.SDK_INT <= 28 || view == null) {
            return;
        }
        try {
            Method method = View.class.getMethod("setForceDarkAllowed", Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(view, false);
        } catch (Throwable th) {
            VerifyLogCat.printStackTraceAndMore(th);
        }
    }

    public String getOriginModuleData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca20fac7", new Object[]{this}) : this.moduleData;
    }
}
