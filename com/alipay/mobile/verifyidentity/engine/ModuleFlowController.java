package com.alipay.mobile.verifyidentity.engine;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.verifyidentity.callback.ModuleListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.common.UserIdCache;
import com.alipay.mobile.verifyidentity.common.VerifyType;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VISrcCode;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.VIFBPluginManager;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICInitRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class ModuleFlowController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5863a = "ModuleFlowController";
    private static volatile ModuleFlowController b;

    /* loaded from: classes3.dex */
    public class VerifyDirectThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5864a;
        private String b;
        private String c;
        private String d;
        private VerifyIdentityTask e;

        public VerifyDirectThread(VerifyIdentityTask verifyIdentityTask) {
            this.f5864a = verifyIdentityTask.getVerifyId();
            this.b = verifyIdentityTask.getToken();
            this.c = verifyIdentityTask.entryModuleName;
            this.d = verifyIdentityTask.entryModuleData;
            this.e = verifyIdentityTask;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ModuleFlowController.access$500(ModuleFlowController.this, this.f5864a, this.b, this.c, this.d, this.e);
            ModuleFlowController.access$600(ModuleFlowController.this, this.f5864a, this.b, this.c, this.e);
        }
    }

    /* loaded from: classes3.dex */
    public class VerifyThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5866a;
        private String b;
        private VerifyIdentityTask c;

        public VerifyThread(VerifyIdentityTask verifyIdentityTask) {
            this.f5866a = verifyIdentityTask.getVerifyId();
            this.b = verifyIdentityTask.getToken();
            this.c = verifyIdentityTask;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ModuleFlowController.access$100(ModuleFlowController.this, this.f5866a, this.b, ModuleFlowController.access$000(ModuleFlowController.this, this.f5866a, this.b, this.c), this.c);
            }
        }
    }

    public static /* synthetic */ MICRpcResponse access$000(ModuleFlowController moduleFlowController, String str, String str2, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MICRpcResponse) ipChange.ipc$dispatch("7f983df7", new Object[]{moduleFlowController, str, str2, verifyIdentityTask}) : a(str, str2, verifyIdentityTask);
    }

    public static /* synthetic */ HashMap access$1000(ModuleFlowController moduleFlowController, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("3fc5b31d", new Object[]{moduleFlowController, moduleExecuteResult, verifyIdentityTask}) : a(moduleExecuteResult, verifyIdentityTask);
    }

    public static /* synthetic */ MICRpcResponse access$200(ModuleFlowController moduleFlowController, String str, String str2, String str3, Map map, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MICRpcResponse) ipChange.ipc$dispatch("9bbdb59e", new Object[]{moduleFlowController, str, str2, str3, map, verifyIdentityTask}) : a(str, str2, str3, map, verifyIdentityTask);
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60292585", new Object[0]) : f5863a;
    }

    public static /* synthetic */ void access$500(ModuleFlowController moduleFlowController, String str, String str2, String str3, String str4, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff44be2", new Object[]{moduleFlowController, str, str2, str3, str4, verifyIdentityTask});
        } else {
            moduleFlowController.a(str, str2, str3, str4, verifyIdentityTask);
        }
    }

    public static /* synthetic */ void access$600(ModuleFlowController moduleFlowController, String str, String str2, String str3, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2ee19", new Object[]{moduleFlowController, str, str2, str3, verifyIdentityTask});
        } else {
            a(str, str2, str3, verifyIdentityTask);
        }
    }

    public static /* synthetic */ void access$700(ModuleFlowController moduleFlowController, String str, String str2, String str3, String str4, Bundle bundle, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c5fd0", new Object[]{moduleFlowController, str, str2, str3, str4, bundle, verifyIdentityTask});
        } else {
            moduleFlowController.a(str, str2, str3, str4, bundle, verifyIdentityTask);
        }
    }

    public static /* synthetic */ void access$900(ModuleFlowController moduleFlowController, String str, String str2, MICRpcResponse mICRpcResponse, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717a880c", new Object[]{moduleFlowController, str, str2, mICRpcResponse, verifyIdentityTask});
        } else {
            a(str, str2, mICRpcResponse, verifyIdentityTask);
        }
    }

    public static ModuleFlowController getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModuleFlowController) ipChange.ipc$dispatch("f5cb8792", new Object[0]);
        }
        if (b == null) {
            synchronized (ModuleFlowController.class) {
                if (b == null) {
                    b = new ModuleFlowController();
                }
            }
        }
        return b;
    }

    private ModuleFlowController() {
    }

    /* loaded from: classes3.dex */
    public class VerifyInitThread extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5865a;
        private String b;
        private String c;
        private Map<String, Object> d;
        private VerifyIdentityTask e;

        public static /* synthetic */ VerifyIdentityTask access$300(VerifyInitThread verifyInitThread) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (VerifyIdentityTask) ipChange.ipc$dispatch("c5794e55", new Object[]{verifyInitThread}) : verifyInitThread.e;
        }

        public VerifyInitThread(VerifyIdentityTask verifyIdentityTask, Map<String, Object> map) {
            this.f5865a = verifyIdentityTask.sceneId;
            this.b = verifyIdentityTask.bizId;
            this.c = verifyIdentityTask.bizRequestData;
            this.d = map;
            this.e = verifyIdentityTask;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MICRpcResponse access$200 = ModuleFlowController.access$200(ModuleFlowController.this, this.f5865a, this.b, this.c, this.d, this.e);
            if (access$200 == null) {
                if (!this.e.showEngineError) {
                    return;
                }
                MicroModuleContext.getInstance().alert(null, VIUtils.getString(R.string.vi_network_unavailable), VIUtils.getString(R.string.vi_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.VerifyInitThread.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
                        new VISrcCode().addEngineCode(verifyIdentityResult, "vitrrn");
                        TaskManager.getInstance().notifyVerifyTaskResult("", "", verifyIdentityResult, VerifyInitThread.access$300(VerifyInitThread.this));
                    }
                }, null, null);
                return;
            }
            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.noUpSceneVID))) {
                this.e.setVerifyId(access$200.verifyId);
                this.e.setToken(access$200.token);
                VerifyLogCat.i(ModuleFlowController.access$400(), "sceneId模式，更新了verifyId、token");
            }
            ModuleFlowController.access$100(ModuleFlowController.this, access$200.verifyId, access$200.token, access$200, this.e);
        }
    }

    public void startVerifyTask(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffbd6d7", new Object[]{this, verifyIdentityTask});
            return;
        }
        Bundle extParams = verifyIdentityTask.getExtParams();
        if (extParams == null) {
            extParams = Bundle.EMPTY;
        }
        if (VerifyType.FAST_INIT.equals(verifyIdentityTask.getVerifyType())) {
            HashMap hashMap = new HashMap();
            if (extParams != null) {
                for (String str : extParams.keySet()) {
                    hashMap.put(str, extParams.get(str));
                }
            }
            VerifyInitThread verifyInitThread = new VerifyInitThread(verifyIdentityTask, hashMap);
            verifyInitThread.setName("verifyInitThread");
            verifyInitThread.start();
        } else if (VerifyType.FAST_DIRECT.equals(verifyIdentityTask.getVerifyType())) {
            VerifyDirectThread verifyDirectThread = new VerifyDirectThread(verifyIdentityTask);
            verifyDirectThread.setName("verifyDirectThread");
            verifyDirectThread.start();
        } else {
            VerifyThread verifyThread = new VerifyThread(verifyIdentityTask);
            verifyThread.setName("VerifyThread");
            verifyThread.start();
        }
        verifyIdentityTask.taskPrepareStartTime = SystemClock.elapsedRealtime();
    }

    private static MICRpcResponse a(String str, String str2, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("44942f1a", new Object[]{str, str2, verifyIdentityTask});
        }
        try {
            MicroModuleContext.getInstance().showProgressDialog("");
            MICRpcRequest mICRpcRequest = new MICRpcRequest();
            mICRpcRequest.verifyId = str;
            mICRpcRequest.token = str2;
            if (!TextUtils.isEmpty(str2)) {
                mICRpcRequest.module = "INIT";
            } else {
                mICRpcRequest.module = ModuleConstants.VI_MODULE_VERIFY_INIT;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean a2 = a(verifyIdentityTask);
            boolean b2 = b(verifyIdentityTask);
            if (str != null && str.endsWith("_site")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean(EnvInfoUtil.KEY_IS_IPAY, true);
                mICRpcRequest.data = EnvInfoUtil.getEnvData(bundle);
            } else {
                mICRpcRequest.data = EnvInfoUtil.getEnvInfoWithExt(a2, b2);
            }
            TimeCostLog.log(f5863a, "获取环境参数耗时：", elapsedRealtime);
            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
            verifyIdentityTask.initRpcStartTime = SystemClock.elapsedRealtime();
            MICRpcResponse dispatch = mICRpcServiceBiz.dispatch(mICRpcRequest);
            MicroModuleContext.getInstance().dismissProgressDialog();
            if (dispatch != null) {
                return dispatch;
            }
            throw new Exception();
        } catch (RpcException e) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e(f5863a, "catch rpcexception");
            if (verifyIdentityTask.showEngineError) {
                return null;
            }
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
            verifyIdentityResult.setMessage(e.getMessage());
            new VISrcCode().addEngineCode(verifyIdentityResult, "gnsre");
            TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
            if (!VIUtils.isInExport()) {
                throw e;
            }
            return null;
        } catch (Throwable th) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e(f5863a, "catch exception when getNextStep");
            if (!verifyIdentityTask.showEngineError) {
                VerifyIdentityResult verifyIdentityResult2 = new VerifyIdentityResult("2002");
                verifyIdentityResult2.setMessage(th.getMessage());
                new VISrcCode().addEngineCode(verifyIdentityResult2, "gnse");
                TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult2, verifyIdentityTask);
            }
            return null;
        }
    }

    private void a(String str, String str2, String str3, String str4, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffaa7600", new Object[]{this, str, str2, str3, str4, verifyIdentityTask});
        } else {
            a(str, str2, str3, str4, false, verifyIdentityTask, true);
        }
    }

    private void a(final String str, final String str2, final String str3, final String str4, boolean z, final VerifyIdentityTask verifyIdentityTask, boolean z2) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221940a0", new Object[]{this, str, str2, str3, str4, new Boolean(z), verifyIdentityTask, new Boolean(z2)});
            return;
        }
        String str5 = f5863a;
        VerifyLogCat.i(str5, "nextStep: " + str3);
        if (!TextUtils.isEmpty(str3)) {
            final Bundle bundle = new Bundle();
            if (verifyIdentityTask.getExtParams() != null) {
                bundle.putAll(verifyIdentityTask.getExtParams());
            }
            bundle.putBoolean("isLocalTrans", z);
            bundle.putBoolean(ModuleConstants.VI_MODULE_IS_FIRST, z2);
            if (verifyIdentityTask.isIPay) {
                bundle.putBoolean(PayPwdModule.IS_IPAY, true);
            }
            if (!TextUtils.isEmpty(str4) && (parseObject = JSON.parseObject(str4)) != null && !z) {
                try {
                    String string = parseObject.getString("userId");
                    if (TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    UserIdCache.uid = string;
                } catch (Throwable th) {
                    VerifyLogCat.e(f5863a, th);
                }
                new IDecisionHelper().handleIDecision(str, parseObject);
                final boolean hasOtherVerifyProduct = VIUtils.hasOtherVerifyProduct(parseObject);
                String string2 = parseObject.getString("needGuideDialog");
                String string3 = parseObject.getString("dialogMainText");
                String string4 = parseObject.getString("sceneId");
                if (TextUtils.isEmpty(verifyIdentityTask.sceneId)) {
                    verifyIdentityTask.sceneId = string4;
                }
                if ("Y".equalsIgnoreCase(string2)) {
                    VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-190402-1", Constants.VI_ENGINE_APPID, "ndguidedg", str2, str, "", new HashMap());
                    MicroModuleContext.getInstance().alert(null, string3, VIUtils.getString(R.string.vi_ok), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                ModuleFlowController.access$700(ModuleFlowController.this, str, str2, str3, str4, bundle, verifyIdentityTask);
                            }
                        }
                    }, VIUtils.getString(hasOtherVerifyProduct ? R.string.vi_choose_other : R.string.vi_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else if (hasOtherVerifyProduct) {
                                VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-190402-2", Constants.VI_ENGINE_APPID, "gotherpro", str2, str, "", new HashMap());
                                VIUtils.goOtherVerifyProduct(MicroModuleContext.getInstance(), str, str2, str3, new ModuleListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.alipay.mobile.verifyidentity.callback.ModuleListener
                                    public void onModuleExecuteResult(String str6, String str7, String str8, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask2) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("60b41082", new Object[]{this, str6, str7, str8, moduleExecuteResult, verifyIdentityTask2});
                                        } else {
                                            ModuleFlowController.access$800(ModuleFlowController.this, str6, str7, str8, moduleExecuteResult, verifyIdentityTask2);
                                        }
                                    }
                                }, verifyIdentityTask);
                            } else {
                                VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-190402-3", Constants.VI_ENGINE_APPID, "goendcancle", str2, str, "", new HashMap());
                                TaskManager.getInstance().notifyVerifyTaskResult(str, str2, new VerifyIdentityResult("1003"), verifyIdentityTask);
                            }
                        }
                    });
                    return;
                }
            }
            a(str, str2, str3, str4, bundle, verifyIdentityTask);
            return;
        }
        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2002");
        new VISrcCode().addEngineCode(verifyIdentityResult, "hnsno");
        TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
    }

    private static MICRpcResponse a(String str, String str2, String str3, Map<String, Object> map, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("587f879d", new Object[]{str, str2, str3, map, verifyIdentityTask});
        }
        try {
            MicroModuleContext.getInstance().showProgressDialog("");
            MICInitRequest mICInitRequest = new MICInitRequest();
            mICInitRequest.sceneId = str;
            mICInitRequest.bizId = str2;
            mICInitRequest.bizRequestData = str3;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a(verifyIdentityTask)) {
                map.put(ModuleConstants.VI_MODULE_IS_SUPPORT_FP, EnvInfoUtil.getIsSupportFP());
                map.put(ModuleConstants.VI_MODULE_FP_SECDATA, EnvInfoUtil.getFpSecdata());
            }
            if (b(verifyIdentityTask)) {
                map.put(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
            }
            map.put("bp", EnvInfoUtil.getBirdNestInfo());
            mICInitRequest.externParams = map;
            mICInitRequest.envData = EnvInfoUtil.getBaseEnvInfo().toJSONString();
            TimeCostLog.log(f5863a, "获取环境参数耗时：", elapsedRealtime);
            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
            verifyIdentityTask.initRpcStartTime = SystemClock.elapsedRealtime();
            MICRpcResponse initVerifyTask = mICRpcServiceBiz.initVerifyTask(mICInitRequest);
            MicroModuleContext.getInstance().dismissProgressDialog();
            return initVerifyTask;
        } catch (RpcException e) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e(f5863a, "catch rpcexception");
            if (verifyIdentityTask.showEngineError) {
                return null;
            }
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
            verifyIdentityResult.setMessage(e.getMessage());
            new VISrcCode().addEngineCode(verifyIdentityResult, "ivtre");
            TaskManager.getInstance().notifyVerifyTaskResult("", "", verifyIdentityResult, verifyIdentityTask);
            if (!VIUtils.isInExport()) {
                throw e;
            }
            return null;
        } catch (Throwable th) {
            MicroModuleContext.getInstance().dismissProgressDialog();
            VerifyLogCat.e(f5863a, "catch exception when initVerifyTask", th);
            if (!verifyIdentityTask.showEngineError) {
                VerifyIdentityResult verifyIdentityResult2 = new VerifyIdentityResult("2002");
                verifyIdentityResult2.setMessage(th.getMessage());
                new VISrcCode().addEngineCode(verifyIdentityResult2, "ivte");
                TaskManager.getInstance().notifyVerifyTaskResult("", "", verifyIdentityResult2, verifyIdentityTask);
            }
            return null;
        }
    }

    private static void a(String str, String str2, MICRpcResponse mICRpcResponse, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5021d3b2", new Object[]{str, str2, mICRpcResponse, verifyIdentityTask});
            return;
        }
        VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult(mICRpcResponse.finishCode);
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONObject parseObject = JSONObject.parseObject(mICRpcResponse.finishParams);
            if (parseObject != null) {
                hashMap.putAll(parseObject);
            }
        } catch (Exception e) {
            VerifyLogCat.e(f5863a, e.getMessage());
        }
        if (!TextUtils.isEmpty(mICRpcResponse.verifyCode)) {
            hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
        }
        verifyIdentityResult.setExtInfo(hashMap);
        verifyIdentityResult.setMessage(mICRpcResponse.verifyMessage);
        verifyIdentityResult.setBizResponseData(mICRpcResponse.bizResponseData);
        new VISrcCode().addEngineCode(verifyIdentityResult, "orrf");
        TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
    }

    private void a(String str, String str2, String str3, final String str4, Bundle bundle, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac793eb4", new Object[]{this, str, str2, str3, str4, bundle, verifyIdentityTask});
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        ModuleListener moduleListener = new ModuleListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.callback.ModuleListener
            public void onModuleExecuteResult(String str5, String str6, String str7, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask2) {
                String str8;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("60b41082", new Object[]{this, str5, str6, str7, moduleExecuteResult, verifyIdentityTask2});
                    return;
                }
                if (moduleExecuteResult != null && !moduleExecuteResult.isLocalTrans()) {
                    HashMap access$1000 = ModuleFlowController.access$1000(ModuleFlowController.this, moduleExecuteResult, verifyIdentityTask2);
                    if (!TextUtils.isEmpty(moduleExecuteResult.getLogicModuleName())) {
                        access$1000.put("module", moduleExecuteResult.getLogicModuleName());
                    } else {
                        access$1000.put("module", str7);
                    }
                    if (moduleExecuteResult.isFindPay()) {
                        access$1000.put("findAndPay", "Y");
                    }
                    String str9 = moduleExecuteResult.getMICRpcResponse().finishCode;
                    if (moduleExecuteResult.isFindPay()) {
                        str9 = "1003";
                    } else if (TextUtils.isEmpty(moduleExecuteResult.getMICRpcResponse().finishCode)) {
                        str9 = String.valueOf(moduleExecuteResult.getMICRpcResponse().verifySuccess);
                    }
                    String str10 = str9;
                    access$1000.put("useBird", verifyIdentityTask2.isDynamicMode ? "Y" : "N");
                    String str11 = (String) access$1000.get(CommonConstant.PRO_VERIFY_RESULT);
                    if ("Y".equalsIgnoreCase((String) access$1000.get("usePwd"))) {
                        str11 = "USE_PWD";
                    }
                    String str12 = str11;
                    try {
                        str8 = JSON.parseObject(str4).getString("mcSalesProd");
                    } catch (Throwable unused) {
                        VerifyLogCat.i(ModuleFlowController.access$400(), "getmcSalesProd error");
                        str8 = "";
                    }
                    if (verifyIdentityTask2 != null && verifyIdentityTask2.getPluginOrProxyMode() && TextUtils.isEmpty(verifyIdentityTask2.sceneId)) {
                        verifyIdentityTask2.sceneId = "mobilecashier_mobile_cashier_mobile_cashier_payment_app";
                    }
                    if (TextUtils.isEmpty(str8)) {
                        str8 = verifyIdentityTask2.sceneId;
                    }
                    new IDecisionHelper().saveFeature(SystemClock.elapsedRealtime() - elapsedRealtime, str10, "MODULE_END", str5, (String) access$1000.get(CommonConstant.PRO_VERIFY_TYPE), (String) access$1000.get("module"), str12, str8);
                    VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-3", Constants.VI_ENGINE_APPID, "mdtchscp", str6, str5, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), access$1000);
                }
                ModuleFlowController.access$800(ModuleFlowController.this, str5, str6, str7, moduleExecuteResult, verifyIdentityTask2);
            }
        };
        if (!bundle.getBoolean("isLocalTrans")) {
            HashMap hashMap = new HashMap();
            hashMap.put("module", str3);
            hashMap.put("useBird", verifyIdentityTask.isDynamicMode ? "Y" : "N");
            VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-150810-2", Constants.VI_ENGINE_APPID, "mdhxhscp", str2, str, null, hashMap);
        }
        bundle.remove("isLocalTrans");
        MicroModuleContext.getInstance().startModule(str, str2, str3, str4, bundle, moduleListener, verifyIdentityTask);
        verifyIdentityTask.taskPrepareEndTime = SystemClock.elapsedRealtime();
    }

    private static void a(String str, String str2, String str3, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3a6236", new Object[]{str, str2, str3, verifyIdentityTask});
        } else if (verifyIdentityTask == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sceneId", verifyIdentityTask.sceneId);
            hashMap.put("bizId", verifyIdentityTask.bizId);
            hashMap.put("module", str3);
            hashMap.put(Constants.VI_ENGINE_VERIFY_TYPE, verifyIdentityTask.getCompatibleVerifyType());
            hashMap.put("useBird", verifyIdentityTask.isDynamicMode ? "Y" : "N");
            hashMap.put(Constants.Name.INTERVAL, String.valueOf(verifyIdentityTask.initRpcEndTime - verifyIdentityTask.initRpcStartTime));
            VerifyBehavorLogger.logBehavorRightAway(BehaviourIdEnum.EVENT, "UC-MobileIC-160316-1", com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_APPID, "mddychqcp", str2, str, String.valueOf(SystemClock.elapsedRealtime() - verifyIdentityTask.getTaskCreateTime()), hashMap);
            TimeCostLog.log(f5863a, "首个Module唤起总耗时：", verifyIdentityTask.getTaskCreateTime());
        }
    }

    private static void a(MICRpcResponse mICRpcResponse, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a5a446", new Object[]{mICRpcResponse, verifyIdentityTask});
            return;
        }
        if ("Y".equalsIgnoreCase(mICRpcResponse.useBird)) {
            verifyIdentityTask.isDynamicMode = true;
        } else {
            verifyIdentityTask.isDynamicMode = false;
        }
        String str = f5863a;
        StringBuilder sb = new StringBuilder("下一个模块[");
        sb.append(mICRpcResponse.nextStep);
        sb.append(riy.ARRAY_END_STR);
        sb.append(verifyIdentityTask.isDynamicMode ? " 要 " : "不");
        sb.append("走动态版产品");
        VerifyLogCat.i(str, sb.toString());
        String str2 = f5863a;
        VerifyLogCat.i(str2, "envType: " + mICRpcResponse.envType);
        MicroModuleContext.getInstance().setEnvType(mICRpcResponse.envType);
    }

    private static HashMap<String, String> a(ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c8997e69", new Object[]{moduleExecuteResult, verifyIdentityTask});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (moduleExecuteResult != null) {
            try {
                if (moduleExecuteResult.getMICRpcResponse() != null) {
                    MICRpcResponse mICRpcResponse = moduleExecuteResult.getMICRpcResponse();
                    hashMap.put("success", String.valueOf(mICRpcResponse.success));
                    hashMap.put("sysErrCode", mICRpcResponse.sysErrCode);
                    hashMap.put("verifySuccess", String.valueOf(mICRpcResponse.verifySuccess));
                    hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
                    hashMap.put("finish", String.valueOf(mICRpcResponse.finish));
                    hashMap.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, mICRpcResponse.finishCode);
                    hashMap.put(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_FAST_MODULENAME, mICRpcResponse.nextStep);
                    if (verifyIdentityTask.getExtParams() != null) {
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.PRO_VERIFY_TYPE)) {
                            hashMap.put(CommonConstant.PRO_VERIFY_TYPE, verifyIdentityTask.getExtParams().getString(CommonConstant.PRO_VERIFY_TYPE));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.PRO_VERIFY_RESULT)) {
                            hashMap.put(CommonConstant.PRO_VERIFY_RESULT, verifyIdentityTask.getExtParams().getString(CommonConstant.PRO_VERIFY_RESULT));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.BIO_CHANGE_TYPE)) {
                            hashMap.put(CommonConstant.BIO_CHANGE_TYPE, verifyIdentityTask.getExtParams().getString(CommonConstant.BIO_CHANGE_TYPE));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey("usePwd")) {
                            hashMap.put("usePwd", verifyIdentityTask.getExtParams().getString("usePwd"));
                        }
                        if (verifyIdentityTask.getExtParams().containsKey(CommonConstant.PPWFIRST)) {
                            hashMap.put(CommonConstant.PPWFIRST, verifyIdentityTask.getExtParams().getString(CommonConstant.PPWFIRST));
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    private static boolean a(VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b62fdc", new Object[]{verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask.getExtParams() != null && verifyIdentityTask.getExtParams().containsKey(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_IS_NEED_FP)) {
            z = Boolean.valueOf(String.valueOf(verifyIdentityTask.getExtParams().get(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_IS_NEED_FP))).booleanValue();
        }
        String str = f5863a;
        VerifyLogCat.i(str, "[isNeedFP]:" + z);
        return z;
    }

    private static boolean b(VerifyIdentityTask verifyIdentityTask) {
        Object obj;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b45b41d", new Object[]{verifyIdentityTask})).booleanValue();
        }
        if (verifyIdentityTask.getExtParams() != null && (obj = verifyIdentityTask.getExtParams().get(com.alipay.mobile.verifyidentity.common.Constants.VI_ENGINE_IS_NEED_BIO)) != null) {
            z = Boolean.valueOf(String.valueOf(obj)).booleanValue();
        }
        String str = f5863a;
        VerifyLogCat.i(str, "[isNeedBio]:" + z);
        return z;
    }

    public static /* synthetic */ void access$100(ModuleFlowController moduleFlowController, final String str, final String str2, final MICRpcResponse mICRpcResponse, final VerifyIdentityTask verifyIdentityTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b7f314", new Object[]{moduleFlowController, str, str2, mICRpcResponse, verifyIdentityTask});
            return;
        }
        verifyIdentityTask.initRpcEndTime = SystemClock.elapsedRealtime();
        VerifyLogCat.i(f5863a, String.format("processRpcResult verifyId: %s, token: %s", str, str2));
        ReportHelper.updateConfig(null, mICRpcResponse);
        if (mICRpcResponse != null && mICRpcResponse.success) {
            VerifyIdentityTask.TASK_TIMEOUT = mICRpcResponse.expireTime * 1000;
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(mICRpcResponse.token)) {
                    str2 = mICRpcResponse.token;
                }
            } else {
                if (!TextUtils.isEmpty(mICRpcResponse.verifyId)) {
                    str = mICRpcResponse.verifyId;
                }
                if (!TextUtils.isEmpty(mICRpcResponse.token)) {
                    str2 = mICRpcResponse.token;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (str.endsWith("_site")) {
                    verifyIdentityTask.isIPay = true;
                } else {
                    verifyIdentityTask.isIPay = false;
                }
            }
            VerifyLogCat.i(f5863a, String.format("processRpcResult updateVidToken verifyId: %s, token: %s", str, str2));
            if (mICRpcResponse.finish) {
                if (verifyIdentityTask.showEngineError) {
                    final String str3 = str;
                    final String str4 = str2;
                    MicroModuleContext.getInstance().alert(null, VIUtils.getString(R.string.vi_server_wrong_data), VIUtils.getString(R.string.vi_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else {
                                ModuleFlowController.access$900(ModuleFlowController.this, str3, str4, mICRpcResponse, verifyIdentityTask);
                            }
                        }
                    }, null, null);
                    return;
                }
                a(str, str2, mICRpcResponse, verifyIdentityTask);
                return;
            }
            a(mICRpcResponse, verifyIdentityTask);
            moduleFlowController.a(str, str2, mICRpcResponse.nextStep, mICRpcResponse.data, verifyIdentityTask);
            TimeCostLog.log(f5863a, "processRpcResult耗时：", verifyIdentityTask.initRpcEndTime);
            a(str, str2, mICRpcResponse.nextStep, verifyIdentityTask);
            return;
        }
        final VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2003");
        if (verifyIdentityTask != null && verifyIdentityTask.showEngineError) {
            VerifyLogCat.i(f5863a, "需要进行初始化异常提示");
            MicroModuleContext.getInstance().alert(null, VIUtils.getString(R.string.vi_network_unavailable), VIUtils.getString(R.string.vi_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    new VISrcCode().addEngineCode(verifyIdentityResult, "nneoc");
                    TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
                }
            }, null, null);
            return;
        }
        new VISrcCode().addEngineCode(verifyIdentityResult, "nnee");
        TaskManager.getInstance().notifyVerifyTaskResult(str, str2, verifyIdentityResult, verifyIdentityTask);
    }

    public static /* synthetic */ void access$800(ModuleFlowController moduleFlowController, String str, String str2, String str3, ModuleExecuteResult moduleExecuteResult, VerifyIdentityTask verifyIdentityTask) {
        String str4 = str;
        String str5 = str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43763", new Object[]{moduleFlowController, str4, str5, str3, moduleExecuteResult, verifyIdentityTask});
            return;
        }
        VerifyLogCat.i(f5863a, String.format("handleModuleExecuteResult verifyId: %s, token: %s", str4, str5));
        if (moduleExecuteResult == null || moduleExecuteResult.getMICRpcResponse() == null) {
            VerifyLogCat.w(f5863a, "ModuleExecuteResult is null or ResultEnum is null");
            VerifyIdentityResult verifyIdentityResult = new VerifyIdentityResult("2002");
            new VISrcCode().addEngineCode(verifyIdentityResult, "hmern");
            TaskManager.getInstance().notifyVerifyTaskResult(str4, str5, verifyIdentityResult, verifyIdentityTask);
            return;
        }
        final MICRpcResponse mICRpcResponse = moduleExecuteResult.getMICRpcResponse();
        try {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.engine.ModuleFlowController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ReportHelper.updateConfig((Context) null, mICRpcResponse, true);
                    }
                }
            }, "updateConfig");
        } catch (Throwable th) {
            String str6 = f5863a;
            VerifyLogCat.e(str6, "update config error:" + th.getMessage());
        }
        String str7 = f5863a;
        VerifyLogCat.d(str7, str3 + " execute finishCode: " + mICRpcResponse.finishCode);
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(mICRpcResponse.token)) {
                str5 = mICRpcResponse.token;
            }
        } else {
            String str8 = !TextUtils.isEmpty(mICRpcResponse.verifyId) ? mICRpcResponse.verifyId : str4;
            if (!TextUtils.isEmpty(mICRpcResponse.token)) {
                str5 = mICRpcResponse.token;
            }
            str4 = str8;
        }
        VerifyLogCat.i(f5863a, String.format("handleModuleExecuteResult updateVidToken verifyId: %s, token: %s", str4, str5));
        if (!mICRpcResponse.finish) {
            a(mICRpcResponse, verifyIdentityTask);
            String str9 = "";
            String str10 = mICRpcResponse != null ? mICRpcResponse.nextStep : str9;
            if (mICRpcResponse != null) {
                str9 = mICRpcResponse.data;
            }
            moduleFlowController.a(str4, str5, str10, str9, moduleExecuteResult.isLocalTrans(), verifyIdentityTask, false);
            return;
        }
        VerifyIdentityResult verifyIdentityResult2 = new VerifyIdentityResult(mICRpcResponse.finishCode);
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONObject parseObject = JSONObject.parseObject(mICRpcResponse.finishParams);
            if (parseObject != null) {
                VerifyLogCat.i(f5863a, "need do more");
                if (parseObject != null) {
                    String string = parseObject.getString("nextVerifyId");
                    String string2 = parseObject.getString("nextModuleData");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putAll(parseObject);
                        TaskManager.getInstance().addSlientModule(jSONObject);
                    }
                    parseObject.remove("nextVerifyId");
                    parseObject.remove("nextModuleData");
                }
                hashMap.putAll(parseObject);
            }
        } catch (Exception e) {
            VerifyLogCat.e(f5863a, e.getMessage());
        }
        try {
            if (moduleExecuteResult.getExtInfo() != null) {
                hashMap.putAll(moduleExecuteResult.getExtInfo());
            }
        } catch (Exception e2) {
            VerifyLogCat.e(f5863a, e2.getMessage());
        }
        if (!TextUtils.isEmpty(mICRpcResponse.verifyCode)) {
            hashMap.put(ModuleConstants.VI_TASK_VERIFYCODE, mICRpcResponse.verifyCode);
        }
        verifyIdentityResult2.setExtInfo(hashMap);
        verifyIdentityResult2.setMessage(mICRpcResponse.verifyMessage);
        verifyIdentityResult2.setBizResponseData(mICRpcResponse.bizResponseData);
        new VISrcCode().addEngineCode(verifyIdentityResult2, "omrf");
        TaskManager.getInstance().notifyVerifyTaskResult(str4, str5, verifyIdentityResult2, verifyIdentityTask);
        VIFBPluginManager.cleanByVerifyId(str4);
    }
}
