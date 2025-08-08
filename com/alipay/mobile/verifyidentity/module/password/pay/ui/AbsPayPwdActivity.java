package com.alipay.mobile.verifyidentity.module.password.pay.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyRequestModel;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyResponseConstants;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class AbsPayPwdActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String LOG_KEY_FAIL = "fail";
    public static String LOG_KEY_NET_ERR = "neterr";
    public static String LOG_KEY_RESULT = "result";
    public static String LOG_KEY_SUC = "suc";
    public static final String SCENE_KEY = "VI_PWD_SCENE";
    public static final String SCENE_VALUE_MYBANK = "MYBANK";
    public static final String UP_ARROW = "^";

    /* renamed from: a  reason: collision with root package name */
    private static final String f5929a = "AbsPayPwdActivity";
    private static String f = "find";
    private static String g = "add";
    private MICRpcResponse b;
    private long h;
    public String mPubKey;
    public String passTip;
    public String predata;
    public BroadcastReceiver pwdChangedBroadcastReceiver;
    public String pwdTopTip;
    public String sceneId;
    public String sourceToPwd;
    public String mTimestamp = "";
    public String verifyingTip = "";
    public boolean isSimplePwd = true;
    private AtomicBoolean c = new AtomicBoolean(false);
    private Object d = new Object();
    public boolean mIsLogicInterrupted = false;
    public boolean isMultiEnabledServer = false;
    public boolean isMultiModeActionTriggered = false;
    public AtomicBoolean needSubmitOnPwdChanged = new AtomicBoolean(false);
    public String uriToGetBackPwd = "alipays://platformapi/startapp?appId=20000013&preAuth=YES&bizScene=mobileic_sdk_identification";
    public String uriToGetBackPwdMybank = "mybank://setting/pwdManage";
    public boolean isNewPwdUi = false;
    private long e = SystemClock.elapsedRealtime();
    public String pwdAction = "NEBULANOTIFY_PAYMENT_PWD_SAVED_RESULT";
    public String pwdResSuc = "success";

    /* loaded from: classes3.dex */
    public interface VerifyResultListener {
        void onResult(MICRpcResponse mICRpcResponse);
    }

    public static /* synthetic */ Object ipc$super(AbsPayPwdActivity absPayPwdActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : g;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f5929a;
    }

    public static /* synthetic */ void access$1000(AbsPayPwdActivity absPayPwdActivity, VerifyResultListener verifyResultListener, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7170c862", new Object[]{absPayPwdActivity, verifyResultListener, mICRpcResponse});
        } else {
            absPayPwdActivity.a(verifyResultListener, mICRpcResponse);
        }
    }

    public static /* synthetic */ AtomicBoolean access$1200(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("6c0442c4", new Object[]{absPayPwdActivity}) : absPayPwdActivity.c;
    }

    public static /* synthetic */ MicroModule access$300(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("cc37ff4", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("5c8f6893", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ac5b5132", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$600(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("fc2739d1", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ long access$700(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("99b6fda2", new Object[]{absPayPwdActivity})).longValue() : absPayPwdActivity.e;
    }

    public static /* synthetic */ MicroModule access$800(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("9bbf0b0f", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MICRpcResponse access$900(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MICRpcResponse) ipChange.ipc$dispatch("551f711a", new Object[]{absPayPwdActivity}) : absPayPwdActivity.b;
    }

    public static /* synthetic */ MICRpcResponse access$902(AbsPayPwdActivity absPayPwdActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("24d79702", new Object[]{absPayPwdActivity, mICRpcResponse});
        }
        absPayPwdActivity.b = mICRpcResponse;
        return mICRpcResponse;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            VerifyLogCat.d(f5929a, "null intent params");
            notifyError();
            return;
        }
        super.onCreate(bundle);
        Bundle extras = intent.getExtras();
        if (extras.getBoolean(PayPwdModule.PWD_FROM_MSP, false)) {
            this.mTimestamp = extras.getString("timestamp");
            if (StringUtils.isEmpty(this.mTimestamp)) {
                this.mTimestamp = "";
            }
            this.predata = extras.getString("predata");
            generatePubKey(extras.getString("pubKey"));
            this.sourceToPwd = extras.getString("sourceToPwd");
            this.sceneId = extras.getString("sceneId");
            this.pwdTopTip = extras.getString("pwdTopTip");
            return;
        }
        this.pwdTopTip = extras.getString("pwdTopTip");
        if (!StringUtils.isEmpty(this.pwdTopTip)) {
            if (this.isNewPwdUi) {
                showNewToast(this, this.pwdTopTip, 0);
            } else {
                toast(this.pwdTopTip, 0);
            }
        }
        String string = getIntent().getExtras().getString("pwd_PASS");
        if (!StringUtils.isEmpty(string)) {
            this.passTip = string;
        } else {
            this.passTip = getResources().getString(R.string.pwd_verify_success);
        }
        String string2 = getIntent().getExtras().getString("loadingTip");
        if (!StringUtils.isEmpty(string2)) {
            this.verifyingTip = string2;
        }
        if ("MYBANK".equalsIgnoreCase(extras.getString("VI_PWD_SCENE"))) {
            this.uriToGetBackPwd = this.uriToGetBackPwdMybank;
        }
        writePwdBehavorLog("UC-MobileIC-20190606-1", "VIEW_PWD", "wallet_cn");
        this.sourceToPwd = extras.getString("sourceToPwd");
        this.sceneId = extras.getString("sceneId");
        this.isMultiEnabledServer = extras.getBoolean("uninterrupt");
        String str = f5929a;
        VerifyLogCat.i(str, "isMultiEnabledServer: " + this.isMultiEnabledServer);
        if (!extras.getBoolean("havePpw") || extras.getBoolean("resetPwd")) {
            this.mIsLogicInterrupted = true;
            final String string3 = extras.getString("addPpwUrl");
            String string4 = extras.getString("addPPWText");
            if (StringUtils.isEmpty(string4) || PlatformUtils.isAlipay(this)) {
                string4 = getResources().getString(R.string.no_pwd);
            }
            String str2 = string4;
            if (StringUtils.isEmpty(string3)) {
                alert("", str2, getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            AbsPayPwdActivity.this.notifyCancel();
                        }
                    }
                }, (String) null, (DialogInterface.OnClickListener) null, (Boolean) false);
                return;
            } else {
                alert("", str2, getResources().getString(R.string.pwd_add_ppw), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        AbsPayPwdActivity absPayPwdActivity = AbsPayPwdActivity.this;
                        absPayPwdActivity.isMultiModeActionTriggered = true;
                        if (absPayPwdActivity.isMultiEnabledServer) {
                            AbsPayPwdActivity.this.enableMultiTask(AbsPayPwdActivity.access$000());
                        } else {
                            VerifyLogCat.i(AbsPayPwdActivity.access$100(), "不激活多实例，老样子结束并回调");
                            AbsPayPwdActivity.this.notifyCancel();
                        }
                        ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.H5Utils", "startH5", new Class[]{String.class}, new Object[]{string3});
                        AbsPayPwdActivity.access$200(AbsPayPwdActivity.this, "setupPPW", "1");
                    }
                }, getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        AbsPayPwdActivity.this.notifyCancel();
                        AbsPayPwdActivity.access$200(AbsPayPwdActivity.this, "setupPPW", "0");
                    }
                }, (Boolean) false);
                return;
            }
        }
        this.mTimestamp = extras.getString("timestamp");
        if (StringUtils.isEmpty(this.mTimestamp)) {
            this.mTimestamp = "";
        }
        this.predata = extras.getString("predata");
        generatePubKey(extras.getString("pubKey"));
        writePwdBehavorLog("UC-MobileIC-20191030-1", "START_PWD_VIEW", "wallet_cn", "verify", ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(this.sourceToPwd) ? "pwd_plus" : "pwd");
    }

    public final void generatePubKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cb6348", new Object[]{this, str});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                this.mPubKey = PubKeyHelper.getPubKey(this);
            } else {
                this.mPubKey = str;
            }
        } catch (Exception e) {
            VerifyLogCat.e(f5929a, e);
            notifyError();
        }
    }

    public void verify(final String str, final VerifyResultListener verifyResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439b61e0", new Object[]{this, str, verifyResultListener});
            return;
        }
        synchronized (this.d) {
            if (this.c.get()) {
                VerifyLogCat.d(f5929a, "Duplicate rpc request! Give up this one!");
                return;
            }
            VerifyLogCat.d(f5929a, "set mIsVerifying true");
            this.c.set(true);
            writePwdBehavorLog("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "verify", ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(this.sourceToPwd) ? "pwd_plus" : "pwd");
            try {
                AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        try {
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            MICRpcRequest mICRpcRequest = new MICRpcRequest();
                            mICRpcRequest.verifyId = AbsPayPwdActivity.access$300(AbsPayPwdActivity.this).getVerifyId();
                            mICRpcRequest.module = AbsPayPwdActivity.access$400(AbsPayPwdActivity.this).getModuleName();
                            mICRpcRequest.token = AbsPayPwdActivity.access$500(AbsPayPwdActivity.this).getToken();
                            mICRpcRequest.action = "VERIFY_PPW";
                            VerifyRequestModel verifyRequestModel = new VerifyRequestModel();
                            verifyRequestModel.setIsSimplePPW(AbsPayPwdActivity.access$600(AbsPayPwdActivity.this).getVerifyId(), AbsPayPwdActivity.this.isSimplePwd);
                            verifyRequestModel.encryptPwd = str;
                            if (AbsPayPwdActivity.this.needSubmitOnPwdChanged.getAndSet(false)) {
                                verifyRequestModel.pwdResume = "Y";
                                verifyRequestModel.setInterruptGap(AbsPayPwdActivity.access$700(AbsPayPwdActivity.this));
                            }
                            if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(AbsPayPwdActivity.this.sourceToPwd)) {
                                VerifyLogCat.d(AbsPayPwdActivity.access$100(), "This pwd check request is from fingerprint module.");
                                verifyRequestModel.predata = JSON.parseObject(AbsPayPwdActivity.this.predata);
                                mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS;
                            }
                            mICRpcRequest.data = JSON.toJSONString(verifyRequestModel);
                            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
                            mICRpcServiceBiz.setTask(AbsPayPwdActivity.access$800(AbsPayPwdActivity.this).getTask());
                            AbsPayPwdActivity.access$902(AbsPayPwdActivity.this, null);
                            AbsPayPwdActivity.access$902(AbsPayPwdActivity.this, mICRpcServiceBiz.dispatch(mICRpcRequest));
                            if (AbsPayPwdActivity.access$900(AbsPayPwdActivity.this) == null) {
                                throw new Exception();
                            }
                            AbsPayPwdActivity.this.predata = null;
                            AbsPayPwdActivity.access$1000(AbsPayPwdActivity.this, verifyResultListener, AbsPayPwdActivity.access$900(AbsPayPwdActivity.this));
                        } catch (RpcException e) {
                            AbsPayPwdActivity.access$1100(AbsPayPwdActivity.this, e, verifyResultListener);
                        } catch (Exception e2) {
                            AbsPayPwdActivity.access$1100(AbsPayPwdActivity.this, e2, verifyResultListener);
                            AbsPayPwdActivity.this.notifyError();
                        } finally {
                            VerifyLogCat.d(AbsPayPwdActivity.access$100(), "finally set mIsVerifying false");
                            AbsPayPwdActivity.access$1200(AbsPayPwdActivity.this).set(false);
                        }
                    }
                }, NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            } catch (Throwable unused) {
                VerifyLogCat.d(f5929a, "set mIsVerifying false");
                this.c.set(false);
            }
        }
    }

    private void a(final VerifyResultListener verifyResultListener, final MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5f9300", new Object[]{this, verifyResultListener, mICRpcResponse});
        } else if (verifyResultListener == null) {
        } else {
            runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        verifyResultListener.onResult(mICRpcResponse);
                    }
                }
            });
        }
    }

    public void doNextStep() {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c62a7991", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5929a, "next step");
        if (this.b != null) {
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse(this.b);
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        notifyResult(defaultModuleResult);
    }

    public void processError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1330e0e0", new Object[]{this});
            return;
        }
        MICRpcResponse mICRpcResponse = this.b;
        if (mICRpcResponse == null) {
            toast(getResources().getString(R.string.verifyidentity_wrong_data), 0);
            notifyResult(new DefaultModuleResult("1001"));
        } else if (VerifyResponseConstants.PPW_LOCK_FIND.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d(f5929a, "lock findable");
            alert("", this.b.verifyMessage, getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AbsPayPwdActivity.access$900(AbsPayPwdActivity.this).verifyCode = "PPW_LOCK_USER_CANCEL";
                    if (AbsPayPwdActivity.this.isMultiEnabledServer) {
                        AbsPayPwdActivity.access$900(AbsPayPwdActivity.this).finish = true;
                        AbsPayPwdActivity.access$900(AbsPayPwdActivity.this).finishCode = "2006";
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    AbsPayPwdActivity.this.doNextStep();
                }
            }, getResources().getString(R.string.pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "0");
                    AbsPayPwdActivity.this.goGetBackPPW();
                }
            }, (Boolean) false);
        } else if (VerifyResponseConstants.PPW_LOCK.equalsIgnoreCase(this.b.verifyCode)) {
            VerifyLogCat.d(f5929a, "lock notify");
            alert("", this.b.verifyMessage, getResources().getString(R.string.i_know), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                    AbsPayPwdActivity.this.doNextStep();
                }
            }, (String) null, (DialogInterface.OnClickListener) null, (Boolean) false);
        } else {
            String str = f5929a;
            VerifyLogCat.d(str, "unhandled error " + this.b.verifyCode);
            toast(StringUtils.isEmpty(this.b.verifyMessage) ? getResources().getString(R.string.verifyidentity_wrong_data) : this.b.verifyMessage, 0);
            doNextStep();
        }
    }

    public void processErrorForDialog(final View view, final MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a4618b", new Object[]{this, view, mICRpcResponse});
        } else if (mICRpcResponse == null) {
            toast(getResources().getString(R.string.verifyidentity_wrong_data), 0);
            notifyResult(new DefaultModuleResult("1001"));
        } else if (VerifyResponseConstants.PPW_LOCK_FIND.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d(f5929a, "lock findable");
            view.setVisibility(4);
            alert("", mICRpcResponse.verifyMessage, getResources().getString(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    mICRpcResponse.verifyCode = "PPW_LOCK_USER_CANCEL";
                    if (AbsPayPwdActivity.this.isMultiEnabledServer) {
                        MICRpcResponse mICRpcResponse2 = mICRpcResponse;
                        mICRpcResponse2.finish = true;
                        mICRpcResponse2.finishCode = "2006";
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    AbsPayPwdActivity.this.doNextStep();
                }
            }, getResources().getString(R.string.pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    if (AbsPayPwdActivity.this.isMultiEnabledServer) {
                        view.setVisibility(0);
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "0");
                    AbsPayPwdActivity.this.goGetBackPPW();
                }
            }, (Boolean) false);
        } else if (VerifyResponseConstants.PPW_LOCK.equalsIgnoreCase(mICRpcResponse.verifyCode)) {
            VerifyLogCat.d(f5929a, "lock notify");
            view.setVisibility(4);
            alert("", mICRpcResponse.verifyMessage, getResources().getString(R.string.i_know), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK, "0");
                    AbsPayPwdActivity.this.doNextStep();
                }
            }, (String) null, (DialogInterface.OnClickListener) null, (Boolean) false);
        } else {
            String str = f5929a;
            VerifyLogCat.d(str, "unhandled error " + mICRpcResponse.verifyCode);
            toast(StringUtils.isEmpty(mICRpcResponse.verifyMessage) ? getResources().getString(R.string.verifyidentity_wrong_data) : mICRpcResponse.verifyMessage, 0);
            doNextStep();
        }
    }

    public void notifyError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b87bd46", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5929a, "error");
        notifyResult(new DefaultModuleResult("2002"));
    }

    public void notifyCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673f922a", new Object[]{this});
        } else {
            notifyCancel(null);
        }
    }

    public void notifyCancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f84574", new Object[]{this, str});
            return;
        }
        String str2 = f5929a;
        VerifyLogCat.i(str2, "cancel [subcode]: " + str);
        DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
        if (!StringUtils.isEmpty(str)) {
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", str);
        }
        notifyResult(defaultModuleResult);
    }

    public void goGetBackPPW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3b1a69", new Object[]{this});
        } else if (isDoubleClick()) {
        } else {
            this.isMultiModeActionTriggered = true;
            try {
                enableMultiTask(f);
                if (!StringUtils.isEmpty(this.sceneId)) {
                    this.uriToGetBackPwd += "^" + this.sceneId;
                }
                VerifyLogCat.i(f5929a, "[uriToGetBackPwd]: " + this.uriToGetBackPwd);
                Uri parse = Uri.parse(this.uriToGetBackPwd);
                Context context = this.mMicroModuleContext.getContext();
                if (context != null) {
                    String packageName = context.getPackageName();
                    if (!StringUtils.isEmpty(packageName) && packageName.startsWith(MspGlobalDefine.PACKAGE_AFWEALTH)) {
                        parse = Uri.parse("afwealth://platformapi/startapp?appId=20000013&preAuth=YES");
                    }
                }
                startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (Exception unused) {
                updateMultiStatus(false);
                toast(getResources().getString(R.string.pwd_install), 1);
            }
            if (this.mModule.getTask().isMultiTaskEnabled) {
                return;
            }
            notifyCancel("103");
        }
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.h;
        if (0 < j && j < 2000) {
            return true;
        }
        this.h = elapsedRealtime;
        return false;
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.sourceToPwd)) {
            return this.mModule.getModuleName();
        }
        return this.sourceToPwd;
    }

    public void enableMultiTask(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c371c6c", new Object[]{this, str});
        } else if (!this.isMultiEnabledServer) {
        } else {
            this.e = SystemClock.elapsedRealtime();
            updateMultiStatus(true);
            if (this.pwdChangedBroadcastReceiver == null) {
                this.pwdChangedBroadcastReceiver = new PwdChangedBroadcastReceiver();
                LocalBroadcastManager.getInstance(this).registerReceiver(this.pwdChangedBroadcastReceiver, new IntentFilter(this.pwdAction));
            }
            logBehavior("zmbmuni", "180906-01", addToMap("type", str));
        }
    }

    public void updateMultiStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e659666b", new Object[]{this, new Boolean(z)});
        } else {
            this.mModule.getTask().isMultiTaskEnabled = z;
        }
    }

    /* loaded from: classes3.dex */
    public class PwdChangedBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private PwdChangedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String access$100 = AbsPayPwdActivity.access$100();
            VerifyLogCat.i(access$100, "接到找密/补密结果：" + intent.getExtras());
            String stringExtra = intent.getStringExtra(AbsPayPwdActivity.LOG_KEY_RESULT);
            if (AbsPayPwdActivity.this.isMultiEnabledServer && AbsPayPwdActivity.this.isMultiModeActionTriggered && AbsPayPwdActivity.this.pwdResSuc.equalsIgnoreCase(stringExtra)) {
                AbsPayPwdActivity.this.needSubmitOnPwdChanged.set(true);
                VerifyLogCat.i(AbsPayPwdActivity.access$100(), "需要推进后续流程");
            }
            AbsPayPwdActivity absPayPwdActivity = AbsPayPwdActivity.this;
            absPayPwdActivity.logBehavior("zmbmjgtz", "180906-02", absPayPwdActivity.addToMap(AbsPayPwdActivity.LOG_KEY_RESULT, stringExtra));
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.pwdChangedBroadcastReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.pwdChangedBroadcastReceiver);
    }

    public HashMap<String, String> addToMap(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("dfc5f37e", new Object[]{this, str, str2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        return hashMap;
    }

    public void logBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7fec42", new Object[]{this, str, str2, hashMap});
            return;
        }
        try {
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-" + str2, Constants.VI_ENGINE_APPID, str, this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            VerifyLogCat.w(f5929a, "logBehavior Exception", th);
        }
    }

    public void autoRpcResLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab6c6eb", new Object[]{this, str});
        } else {
            logBehavior("zmbmars", "180906-03", addToMap(LOG_KEY_RESULT, str));
        }
    }

    public void writeBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214dc80b", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("binIndx", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "hsbmts", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writeBehavorLog(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd832515", new Object[]{this, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("binIndx", str3);
        hashMap.put("ui_type", str4);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "hsbmts", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writePwdBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d15438a", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writePwdBehavorLog(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a085ed4", new Object[]{this, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        hashMap.put("ui_type", str4);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writePwdBehavorLog(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcafb9e", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", getLogicModuleName());
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        if (!StringUtils.isEmpty(str4)) {
            hashMap.put("from", str4);
        }
        if (!StringUtils.isEmpty(str5)) {
            hashMap.put("sourceToPwd", str5);
        }
        if (!StringUtils.isEmpty(getIntent().getExtras().getString("decisionToPwd"))) {
            hashMap.put("plusPwdType", "pwd");
        } else {
            hashMap.put("plusPwdType", "plus_pwd");
        }
        if (this.isNewPwdUi) {
            hashMap.put("isNewMUI", "true");
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aksbhas", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void writePWDErrorBehavorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a202b1ac", new Object[]{this, str, str2});
        } else {
            writeBehavorLog("UC-MobileIC-161201-2", str, str2);
        }
    }

    public void writePWDSwitchBehavorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e152d94", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pwdSwitch", str);
        hashMap.put("rsaResult", str2);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-220722-02", Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    public void forbidCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeba4c99", new Object[]{this});
        } else if (getWindow() == null) {
        } else {
            getWindow().addFlags(8192);
        }
    }

    public void showNewToast(Context context, CharSequence charSequence, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c08462", new Object[]{this, context, charSequence, new Integer(i)});
            return;
        }
        try {
            Toast makeText = Toast.makeText(context, charSequence, i);
            View inflate = LayoutInflater.from(context).inflate(R.layout.simple_toast, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.tip_content)).setText(charSequence);
            makeText.setView(inflate);
            makeText.setGravity(17, 0, DensityUtil.dip2px(this, 40.0f));
            makeText.show();
        } catch (Throwable unused) {
            VerifyLogCat.i(f5929a, "toast error");
        }
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(this.sourceToPwd)) {
            moduleExecuteResult.setLogicModuleName(ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS);
        } else if (this.mModule != null && this.mModule.getTask() != null) {
            VerifyIdentityTask task = this.mModule.getTask();
            if (task.getExtParams() == null) {
                task.setExtParams(new Bundle());
            }
            task.getExtParams().putString(CommonConstant.PRO_VERIFY_TYPE, "pwd");
        }
        if (this.mModule != null) {
            IDecisionHelper.sendLocalBroadcast(IDecisionHelper.PWD_EXIT_ACTION, this.sceneId, this.mModule.getVerifyId());
            if (this.mMicroModuleContext != null) {
                this.mMicroModuleContext.notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
            } else {
                MicroModuleContext.getInstance().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
            }
        }
        LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("NEW_PWD_EXIT"));
        finish();
    }

    public static /* synthetic */ void access$200(AbsPayPwdActivity absPayPwdActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91be52a7", new Object[]{absPayPwdActivity, str, str2});
        } else {
            absPayPwdActivity.writeBehavorLog("UC-MobileIC-161201-1", str, str2);
        }
    }

    public static /* synthetic */ void access$1100(AbsPayPwdActivity absPayPwdActivity, Exception exc, VerifyResultListener verifyResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd922d7", new Object[]{absPayPwdActivity, exc, verifyResultListener});
            return;
        }
        VerifyLogCat.e(f5929a, exc);
        absPayPwdActivity.a(verifyResultListener, null);
    }
}
