package com.alipay.mobile.verifyidentity.module.internal.password.pay.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.model.VerifyRequestModel;
import com.alipay.mobile.verifyidentity.module.password.pay.model.VerifyResponseConstants;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Locale;
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
    private static final String f5909a = "AbsPayPwdActivity";
    private static String e = "find";
    private static String f = "add";
    private MICRpcResponse b;
    private long g;
    private String h;
    public boolean isIpay;
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
    public String languge = "";
    private AtomicBoolean c = new AtomicBoolean(false);
    private Object d = new Object();
    public boolean mIsLogicInterrupted = false;
    public boolean isMultiEnabledServer = false;
    public boolean isMultiModeActionTriggered = false;
    public AtomicBoolean needSubmitOnPwdChanged = new AtomicBoolean(false);
    public String uriToGetBackPwd = "alipays://platformapi/startapp?appId=20000013&preAuth=YES&bizScene=mobileic_sdk_identification";
    public String uriToGetBackPwdMybank = "mybank://setting/pwdManage";
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : f5909a;
    }

    public static /* synthetic */ AtomicBoolean access$1000(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("e7ccbbf0", new Object[]{absPayPwdActivity}) : absPayPwdActivity.c;
    }

    public static /* synthetic */ MicroModule access$300(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ebe95b06", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("789fb547", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("5560f88", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$600(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("920c69c9", new Object[]{absPayPwdActivity}) : absPayPwdActivity.mModule;
    }

    public static /* synthetic */ MICRpcResponse access$700(AbsPayPwdActivity absPayPwdActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MICRpcResponse) ipChange.ipc$dispatch("187a876", new Object[]{absPayPwdActivity}) : absPayPwdActivity.b;
    }

    public static /* synthetic */ MICRpcResponse access$702(AbsPayPwdActivity absPayPwdActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("2d793662", new Object[]{absPayPwdActivity, mICRpcResponse});
        }
        absPayPwdActivity.b = mICRpcResponse;
        return mICRpcResponse;
    }

    public static /* synthetic */ void access$800(AbsPayPwdActivity absPayPwdActivity, VerifyResultListener verifyResultListener, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81605a4f", new Object[]{absPayPwdActivity, verifyResultListener, mICRpcResponse});
        } else {
            absPayPwdActivity.a(verifyResultListener, mICRpcResponse);
        }
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
            VerifyLogCat.d(f5909a, "null intent params");
            notifyError();
            return;
        }
        super.onCreate(bundle);
        forbidCapture();
        Bundle extras = intent.getExtras();
        this.pwdTopTip = extras.getString("pwdTopTip");
        this.languge = extras.getString(PayPwdModule.VI_LANGUAGE);
        this.h = extras.getString(PayPwdModule.VI_FORBID_JUMP);
        if (!TextUtils.isEmpty(this.pwdTopTip)) {
            toast(this.pwdTopTip, 0);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            setIsIPay(getIntent().getExtras().getBoolean(PayPwdModule.IS_IPAY, false));
        }
        String string = getIntent().getExtras().getString("pwd_PASS");
        if (!TextUtils.isEmpty(string)) {
            this.passTip = string;
        } else {
            this.passTip = getLocaleStringResource(R.string.sg_pwd_verify_success);
        }
        String string2 = getIntent().getExtras().getString("loadingTip");
        if (!TextUtils.isEmpty(string2)) {
            this.verifyingTip = string2;
        } else {
            this.verifyingTip = getLocaleStringResource(R.string.pwd_verify_ing);
        }
        if ("MYBANK".equalsIgnoreCase(extras.getString("VI_PWD_SCENE"))) {
            this.uriToGetBackPwd = this.uriToGetBackPwdMybank;
        }
        writePwdBehavorLog("UC-MobileIC-20190606-1", "VIEW_PWD", "wallet_macao");
        this.sourceToPwd = extras.getString("sourceToPwd");
        this.sceneId = extras.getString("sceneId");
        this.isMultiEnabledServer = extras.getBoolean("uninterrupt");
        String str = f5909a;
        VerifyLogCat.i(str, "isMultiEnabledServer: " + this.isMultiEnabledServer);
        boolean z = extras.getBoolean(PayPwdModule.COMPLETE_PPW, false);
        if (this.isIpay) {
            if (z) {
                a(extras);
                return;
            }
        } else if (!extras.getBoolean("havePpw") || extras.getBoolean("resetPwd")) {
            a(extras);
            return;
        }
        this.mTimestamp = extras.getString("timestamp");
        if (TextUtils.isEmpty(this.mTimestamp)) {
            this.mTimestamp = "";
        }
        this.predata = extras.getString("predata");
        generatePubKey(extras.getString("pubKey"));
    }

    private void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
            return;
        }
        this.mIsLogicInterrupted = true;
        final String string = bundle.getString("addPpwUrl");
        String string2 = bundle.getString("addPPWText");
        if (TextUtils.isEmpty(string2) || PlatformUtils.isAlipay(this)) {
            string2 = getLocaleStringResource(R.string.sg_no_pwd);
        }
        String str = string2;
        if (TextUtils.isEmpty(string)) {
            alert("", str, getLocaleStringResource(R.string.sg_pwd_page_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.1
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
        } else {
            alert("", str, getLocaleStringResource(R.string.sg_pwd_add_ppw), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.2
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
                    ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.H5Utils", "startH5", new Class[]{String.class}, new Object[]{string});
                    AbsPayPwdActivity.access$200(AbsPayPwdActivity.this, "setupPPW", "1");
                }
            }, getLocaleStringResource(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.3
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
        }
    }

    public final void generatePubKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cb6348", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                this.mPubKey = PubKeyHelper.getPubKey(this);
            } else {
                this.mPubKey = str;
            }
        } catch (Exception e2) {
            VerifyLogCat.e(f5909a, e2);
            notifyError();
        }
    }

    public void setIsIPay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93b1f42", new Object[]{this, new Boolean(z)});
        } else {
            this.isIpay = z;
        }
    }

    public void verify(final String str, final VerifyResultListener verifyResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("174e0ee", new Object[]{this, str, verifyResultListener});
            return;
        }
        synchronized (this.d) {
            if (this.c.get()) {
                VerifyLogCat.d(f5909a, "Duplicate rpc request! Give up this one!");
                return;
            }
            VerifyLogCat.d(f5909a, "set mIsVerifying true");
            this.c.set(true);
            writePwdBehavorLog("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_macao");
            try {
                AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.4
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
                            verifyRequestModel.data = str;
                            if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(AbsPayPwdActivity.this.sourceToPwd)) {
                                String access$100 = AbsPayPwdActivity.access$100();
                                VerifyLogCat.d(access$100, "predata:" + AbsPayPwdActivity.this.predata);
                                verifyRequestModel.predata = AbsPayPwdActivity.this.predata;
                                verifyRequestModel.encryptPwd = str;
                                verifyRequestModel.data = "";
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("data", (Object) JSON.toJSONString(verifyRequestModel));
                                mICRpcRequest.data = jSONObject.toJSONString();
                                mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS;
                            } else {
                                mICRpcRequest.data = JSON.toJSONString(verifyRequestModel);
                            }
                            MICRpcServiceBiz mICRpcServiceBiz = new MICRpcServiceBiz();
                            mICRpcServiceBiz.setTask(AbsPayPwdActivity.access$600(AbsPayPwdActivity.this).getTask());
                            AbsPayPwdActivity.access$702(AbsPayPwdActivity.this, null);
                            AbsPayPwdActivity.access$702(AbsPayPwdActivity.this, mICRpcServiceBiz.dispatch(mICRpcRequest));
                            if (AbsPayPwdActivity.access$700(AbsPayPwdActivity.this) == null) {
                                throw new Exception();
                            }
                            AbsPayPwdActivity.this.predata = null;
                            AbsPayPwdActivity.access$800(AbsPayPwdActivity.this, verifyResultListener, AbsPayPwdActivity.access$700(AbsPayPwdActivity.this));
                        } catch (RpcException e2) {
                            AbsPayPwdActivity.access$900(AbsPayPwdActivity.this, e2, verifyResultListener);
                        } catch (Exception e3) {
                            AbsPayPwdActivity.access$900(AbsPayPwdActivity.this, e3, verifyResultListener);
                            AbsPayPwdActivity.this.notifyError();
                        } finally {
                            VerifyLogCat.d(AbsPayPwdActivity.access$100(), "finally set mIsVerifying false");
                            AbsPayPwdActivity.access$1000(AbsPayPwdActivity.this).set(false);
                        }
                    }
                }, NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            } catch (Throwable unused) {
                VerifyLogCat.d(f5909a, "set mIsVerifying false");
                this.c.set(false);
            }
        }
    }

    private void a(final VerifyResultListener verifyResultListener, final MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81fbc12e", new Object[]{this, verifyResultListener, mICRpcResponse});
        } else if (verifyResultListener == null) {
        } else {
            runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.5
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
        VerifyLogCat.d(f5909a, "next step");
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
        boolean z = this.b.finish;
        if ((!this.b.finish && !TextUtils.isEmpty(this.b.nextStep) && !this.b.nextStep.equals(this.mModule.getModuleName())) || z) {
            VerifyLogCat.d(f5909a, "lock findable");
            alert("", this.b.verifyMessage, getLocaleStringResource(R.string.pwd_find_later), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AbsPayPwdActivity.access$700(AbsPayPwdActivity.this).verifyCode = "PPW_LOCK_USER_CANCEL";
                    if (AbsPayPwdActivity.this.isMultiEnabledServer) {
                        AbsPayPwdActivity.access$700(AbsPayPwdActivity.this).finish = true;
                        AbsPayPwdActivity.access$700(AbsPayPwdActivity.this).finishCode = "2006";
                    }
                    AbsPayPwdActivity.this.writePWDErrorBehavorLog(VerifyResponseConstants.PPW_LOCK_FIND, "1");
                    AbsPayPwdActivity.this.doNextStep();
                }
            }, getLocaleStringResource(R.string.sg_pwd_find_now), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.7
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
            return;
        }
        String str = f5909a;
        VerifyLogCat.d(str, "unhandled error " + this.b.verifyCode);
        toast(TextUtils.isEmpty(this.b.verifyMessage) ? getLocaleStringResource(R.string.verifyidentity_wrong_data) : this.b.verifyMessage, 0);
        doNextStep();
    }

    public String getLocaleStringResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5351b433", new Object[]{this, new Integer(i)});
        }
        if (!TextUtils.isEmpty(this.languge) && "en".equalsIgnoreCase(this.languge)) {
            if (Build.VERSION.SDK_INT >= 17) {
                Configuration configuration = new Configuration(getResources().getConfiguration());
                configuration.setLocale(new Locale("en", "US"));
                return createConfigurationContext(configuration).getText(i).toString();
            }
            Resources resources = getResources();
            Configuration configuration2 = resources.getConfiguration();
            Locale locale = configuration2.locale;
            configuration2.locale = new Locale("en", "US");
            resources.updateConfiguration(configuration2, null);
            String string = resources.getString(i);
            configuration2.locale = locale;
            resources.updateConfiguration(configuration2, null);
            return string;
        }
        return getResources().getString(i);
    }

    public void notifyError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b87bd46", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5909a, "error");
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
        String str2 = f5909a;
        VerifyLogCat.i(str2, "cancel [subcode]: " + str);
        DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
        if (!TextUtils.isEmpty(str)) {
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
                enableMultiTask(e);
                if (!TextUtils.isEmpty(getIntent().getExtras().getString(PayPwdModule.FORM_TIP_URL))) {
                    this.uriToGetBackPwd = getIntent().getExtras().getString(PayPwdModule.FORM_TIP_URL);
                    if (VIUtils.isInExport()) {
                        this.uriToGetBackPwd = "alipays://platformapi/startapp?appId=20000013&url=" + this.uriToGetBackPwd;
                    }
                }
                String str = f5909a;
                VerifyLogCat.i(str, "[uriToGetBackPwd]: " + this.uriToGetBackPwd);
                if (!VIUtils.isInExport()) {
                    ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.H5Utils", "startH5", new Class[]{String.class}, new Object[]{this.uriToGetBackPwd});
                } else if (!"Y".equalsIgnoreCase(this.h)) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.uriToGetBackPwd)));
                }
            } catch (Exception unused) {
                updateMultiStatus(false);
                toast(getLocaleStringResource(R.string.pwd_install), 1);
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
        long j = elapsedRealtime - this.g;
        if (0 < j && j < 2000) {
            return true;
        }
        this.g = elapsedRealtime;
        return false;
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.sourceToPwd)) {
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
            updateMultiStatus(true);
            if (this.pwdChangedBroadcastReceiver == null) {
                this.pwdChangedBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
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
                };
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
            VerifyLogCat.w(f5909a, "logBehavior Exception", th);
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
            return;
        }
        try {
            if (getWindow() == null) {
                return;
            }
            getWindow().addFlags(8192);
        } catch (Throwable unused) {
        }
    }

    public void writePWDErrorBehavorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a202b1ac", new Object[]{this, str, str2});
        } else {
            writeBehavorLog("UC-MobileIC-161201-2", str, str2);
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
            if (this.mMicroModuleContext != null) {
                this.mMicroModuleContext.notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
            } else {
                MicroModuleContext.getInstance().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
            }
        }
        finish();
    }

    public static /* synthetic */ void access$200(AbsPayPwdActivity absPayPwdActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9c17", new Object[]{absPayPwdActivity, str, str2});
        } else {
            absPayPwdActivity.writeBehavorLog("UC-MobileIC-161201-1", str, str2);
        }
    }

    public static /* synthetic */ void access$900(AbsPayPwdActivity absPayPwdActivity, Exception exc, VerifyResultListener verifyResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4182c7c", new Object[]{absPayPwdActivity, exc, verifyResultListener});
            return;
        }
        VerifyLogCat.e(f5909a, exc);
        absPayPwdActivity.a(verifyResultListener, null);
    }
}
