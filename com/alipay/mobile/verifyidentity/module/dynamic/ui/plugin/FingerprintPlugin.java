package com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintRequest;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleDataModel;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintModule;
import com.alipay.mobile.verifyidentity.module.fingerprint.SafepayChecker;
import com.alipay.mobile.verifyidentity.module.fingerprint.proxy.ApiFingerprintManagerProxy;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cpe;
import tb.riy;

/* loaded from: classes3.dex */
public class FingerprintPlugin extends BaseFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5893a = "FingerprintPlugin";
    private static long p;
    private Context b;
    private FBPluginCtx c;
    private int d;
    private View e;
    private TextView f;
    public BroadcastReceiver fpBroadcastReceiver;
    private TextView g;
    private boolean h;
    private int i;
    private SafepayChecker j;
    private AtomicBoolean k;
    private AtomicBoolean l;
    private AtomicBoolean m;
    private DataHelper n;
    private boolean o;
    public BroadcastReceiver pageChangeBroadcastReceiver;

    public static /* synthetic */ Object ipc$super(FingerprintPlugin fingerprintPlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2070326638) {
            super.addPlugin((String) objArr[0], (String) objArr[1], (ModuleDataModel) objArr[2], (Bundle) objArr[3]);
            return null;
        } else if (hashCode != -111775739) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onBNPageClose();
            return null;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5893a;
    }

    public static /* synthetic */ DataHelper access$100(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("d81e842a", new Object[]{fingerprintPlugin}) : fingerprintPlugin.n;
    }

    public static /* synthetic */ Handler access$1000(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("813a3070", new Object[]{fingerprintPlugin}) : fingerprintPlugin.mainHandler;
    }

    public static /* synthetic */ MicroModule access$1100(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("4fa61837", new Object[]{fingerprintPlugin}) : fingerprintPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$1200(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("dc1a5516", new Object[]{fingerprintPlugin}) : fingerprintPlugin.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("688e91f5", new Object[]{fingerprintPlugin}) : fingerprintPlugin.mModule;
    }

    public static /* synthetic */ AtomicBoolean access$1400(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("ede092d2", new Object[]{fingerprintPlugin}) : fingerprintPlugin.l;
    }

    public static /* synthetic */ Context access$1500(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("50a00e69", new Object[]{fingerprintPlugin}) : fingerprintPlugin.b;
    }

    public static /* synthetic */ TextView access$1700(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("34003aa3", new Object[]{fingerprintPlugin}) : fingerprintPlugin.g;
    }

    public static /* synthetic */ AtomicBoolean access$1800(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("baa8714e", new Object[]{fingerprintPlugin}) : fingerprintPlugin.k;
    }

    public static /* synthetic */ void access$200(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("577f6823", new Object[]{fingerprintPlugin});
        } else {
            fingerprintPlugin.c();
        }
    }

    public static /* synthetic */ void access$300(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7ec682", new Object[]{fingerprintPlugin});
        } else {
            fingerprintPlugin.a();
        }
    }

    public static /* synthetic */ AtomicBoolean access$400(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("6a4af0e1", new Object[]{fingerprintPlugin}) : fingerprintPlugin.m;
    }

    public static /* synthetic */ Handler access$600(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1ec552c7", new Object[]{fingerprintPlugin}) : fingerprintPlugin.mainHandler;
    }

    public static /* synthetic */ Handler access$700(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("622bc208", new Object[]{fingerprintPlugin}) : fingerprintPlugin.mainHandler;
    }

    public static /* synthetic */ TextView access$800(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("14963fd1", new Object[]{fingerprintPlugin}) : fingerprintPlugin.f;
    }

    public static /* synthetic */ void access$900(FingerprintPlugin fingerprintPlugin, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6918ef86", new Object[]{fingerprintPlugin, str});
        } else {
            fingerprintPlugin.a(str);
        }
    }

    public FingerprintPlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        super(context, fBPluginCtx);
        this.h = false;
        this.j = new SafepayChecker();
        this.k = new AtomicBoolean(true);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.o = false;
        this.b = context;
        this.c = fBPluginCtx;
        this.d = i;
        if (this.c == null || this.d == 0) {
            return;
        }
        VerifyLogCat.i(f5893a, "just for PMD");
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.e = ((LayoutInflater) this.b.getSystemService("layout_inflater")).inflate(R.layout.fb_fp_plugin, (ViewGroup) null);
        forbidDark(this.e);
        this.e.setVisibility(8);
        this.f = (TextView) this.e.findViewById(R.id.go_pwd);
        this.g = (TextView) this.e.findViewById(R.id.mini_fp_tips);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(FingerprintPlugin.access$000(), "用户选择切换到支付密码");
                if (FingerprintPlugin.access$100(FingerprintPlugin.this) != null) {
                    FingerprintPlugin.access$100(FingerprintPlugin.this).logFpResBehavior("RESULT_FALLBACK", null);
                    FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                    FingerprintPlugin.access$200(FingerprintPlugin.this);
                    return;
                }
                VerifyLogCat.i(FingerprintPlugin.access$000(), "mDataHelper为空！！无法转密码");
                try {
                    VerifyLogger.getInstance().eventBehavior("UC-MobileIC-180928-1", "", "", "", null);
                } catch (Throwable th) {
                    VerifyLogCat.w(FingerprintPlugin.access$000(), "eventBehavior Exception", th);
                }
            }
        });
        String actConf = getActConf(BaseFBPlugin.ACT_CONF.hwInputPwdTip);
        if (!StringUtils.isEmpty(actConf)) {
            String str = f5893a;
            VerifyLogCat.i(str, "收银台指定了切换密码文案hwInputPwdTip：" + actConf);
            this.f.setText(actConf);
        }
        this.o = false;
        return this.e;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this}) : FingerprintPlugin.class.getSimpleName();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void addPlugin(String str, String str2, ModuleDataModel moduleDataModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84995292", new Object[]{this, str, str2, moduleDataModel, bundle});
        } else {
            super.addPlugin(str, str2, moduleDataModel, bundle);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void bindModule(MicroModule microModule, String str) {
        String reportFlag;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c61b9cc", new Object[]{this, microModule, str});
            return;
        }
        this.mModule = microModule;
        this.n = new DataHelper(this.mModule, str, this);
        String actConf = getActConf("usePwd");
        boolean z2 = !StringUtils.isEmpty(actConf) && "Y".equalsIgnoreCase(actConf);
        if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
            this.viType = "fp";
            this.j.init(this.b, 1);
        } else if (DataHelper.WL_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
            this.viType = "wl";
        } else if (DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
            this.viType = DataHelper.FACEID_TYPE_VALUE;
        } else if (this.n.isZFACE()) {
            this.viType = DataHelper.ZFACE_TYPE_VALUE;
        } else {
            VerifyLogCat.w(f5893a, "Predata Type is not FP or WL. Go to check pay pwd!");
            this.n.goToPayPwd();
            return;
        }
        VerifyLogCat.i("DST", "fingeplugin create");
        if (!this.n.isEmbed) {
            this.e.setVisibility(8);
            if ("fp".equalsIgnoreCase(this.viType) && !b(false)) {
                VerifyLogCat.i(f5893a, "viStart过来的普通指纹，发现本地指纹状态异常，直接通知模版切密码");
                if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeFpStatusAction))) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.i);
                    hashMap.put("status", sb.toString());
                    this.n.logBehavior("yhfpztyc", "UC-MobileIC-180929-1", hashMap);
                    if (!a(true)) {
                        return;
                    }
                    String string = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                    if (!StringUtils.isEmpty(string)) {
                        DialogHelper.makeToast(this.b, 0, string, 0).show();
                    }
                } else {
                    AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
                    authenticatorResponse.setResult(this.i);
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.i);
                    hashMap2.put("status", sb2.toString());
                    this.n.logBehavior("yhfpztyc", "UC-MobileIC-180929-1", hashMap2);
                    DataHelper dataHelper = this.n;
                    dataHelper.proVerifyResult = "FP_STATUS-" + this.i;
                    String string2 = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                    if (!StringUtils.isEmpty(string2)) {
                        this.n.updateTipToPwd(string2);
                    }
                    this.n.goToPayPwd(authenticatorResponse);
                    return;
                }
            }
            if (DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(this.viType) && ZFaceChecker.isSameVerifyIdCallAgain(this.verifyId)) {
                VerifyLogCat.i(f5893a, "相同vid再次调用2D人脸，直接切密码");
                if (!a(false)) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString(FingerprintModule.FP_MODULE_DATA_KEY, str);
            bundle.putBoolean(FingerprintModule.FP_IS_MSP_USE_PWD, z2);
            if (this.extParams != null) {
                bundle.putAll(this.extParams);
            }
            this.o = true;
            FingerprintCheckActivity.addDataHelper(this.verifyId, this.n);
            Intent intent = new Intent(this.b, FingerprintCheckActivity.class);
            intent.putExtras(bundle);
            MicroModuleContext.getInstance().setStartActivityMonitor();
            MicroModuleContext.getInstance().startActivity(this.mModule, intent);
        } else {
            this.e.setVisibility(0);
            this.pageChangeBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                        return;
                    }
                    VerifyLogCat.i(FingerprintPlugin.access$000(), "收到广播：com.alipay.phonecashier.framechange");
                    FingerprintPlugin.this.onBNPageClose();
                }
            };
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.pageChangeBroadcastReceiver, new IntentFilter(MspGlobalDefine.FRAME_CHANGE_ACTION));
            if (DataHelper.WL_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type) || DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type) || DataHelper.ZFACE_TYPE_VALUE.equalsIgnoreCase(this.n.predata_type)) {
                VerifyLogCat.i(f5893a, "viPreStart过来的可穿戴设备或人脸校验，不处理");
                b();
                return;
            } else if (!b(false)) {
                VerifyLogCat.i(f5893a, "viPreStart过来的华为内嵌模式，发现本地指纹状态异常，不渲染插件");
                return;
            } else {
                this.o = true;
                a(BaseFBPlugin.ACT_CONF.hwAuthTip);
                try {
                    reportFlag = ReportHelper.getReportFlag(this.b, ReportHelper.fpDelay);
                    String str2 = f5893a;
                    VerifyLogCat.i(str2, "fpDelay：" + reportFlag);
                } catch (Throwable unused) {
                    VerifyLogCat.i(f5893a, "延时判断出现异常，直接启动指纹");
                }
                if (!StringUtils.isEmpty(reportFlag)) {
                    long longValue = Long.valueOf(reportFlag).longValue() - (SystemClock.elapsedRealtime() - p);
                    String str3 = f5893a;
                    VerifyLogCat.i(str3, "本次调用指纹需要延时：[" + longValue + "]毫秒（只>0时延）");
                    if (longValue > 0) {
                        this.mainHandler.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    FingerprintPlugin.access$300(FingerprintPlugin.this);
                                }
                            }
                        }, longValue);
                        this.fpBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, Intent intent2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                                    return;
                                }
                                VerifyLogCat.i(FingerprintPlugin.access$000(), "收到广播：fingerprint_authenticate_result");
                                if (113 != intent2.getIntExtra("result", 1)) {
                                    return;
                                }
                                if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.fp2PwdOnRpc))) {
                                    VerifyLogCat.i(FingerprintPlugin.access$000(), "服务端关闭了广播切密码的优化后逻辑，走老逻辑");
                                } else if (!FingerprintPlugin.access$1800(FingerprintPlugin.this).get()) {
                                    VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，已进入rpc流程（或已结束），不转密码");
                                    return;
                                }
                                VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹要转支付密码");
                                if (FingerprintPlugin.access$100(FingerprintPlugin.this) == null || FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                                    VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹已取消，不转密码");
                                    return;
                                }
                                FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                                FingerprintPlugin.access$200(FingerprintPlugin.this);
                            }
                        };
                        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.fpBroadcastReceiver, new IntentFilter(MspGlobalDefine.FP_AUTHENTICATE_ACTION));
                    }
                }
                a();
                this.fpBroadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                            return;
                        }
                        VerifyLogCat.i(FingerprintPlugin.access$000(), "收到广播：fingerprint_authenticate_result");
                        if (113 != intent2.getIntExtra("result", 1)) {
                            return;
                        }
                        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.fp2PwdOnRpc))) {
                            VerifyLogCat.i(FingerprintPlugin.access$000(), "服务端关闭了广播切密码的优化后逻辑，走老逻辑");
                        } else if (!FingerprintPlugin.access$1800(FingerprintPlugin.this).get()) {
                            VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，已进入rpc流程（或已结束），不转密码");
                            return;
                        }
                        VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹要转支付密码");
                        if (FingerprintPlugin.access$100(FingerprintPlugin.this) == null || FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                            VerifyLogCat.i(FingerprintPlugin.access$000(), "用户离开，指纹已取消，不转密码");
                            return;
                        }
                        FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                        FingerprintPlugin.access$200(FingerprintPlugin.this);
                    }
                };
                LocalBroadcastManager.getInstance(this.b).registerReceiver(this.fpBroadcastReceiver, new IntentFilter(MspGlobalDefine.FP_AUTHENTICATE_ACTION));
            }
        }
        if (this.n.newUiParamsObj != null) {
            if (this.n.isFP()) {
                z = this.n.newUiParamsObj.getBooleanValue(DataHelper.FP_TYPE_VALUE);
            } else if (this.n.isFACEID() || this.n.isZFACE() || this.n.isWL()) {
                z = this.n.newUiParamsObj.getBooleanValue(ModuleConstants.VI_MODULE_NAME_PAY_PWD);
            }
            String actConf2 = getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
            if (!z && !StringUtils.isEmpty(actConf2) && "2.0".equalsIgnoreCase(actConf2)) {
                this.h = true;
                updateVerifyStatusNew("start");
                return;
            }
            this.h = false;
            updateVerifyStatus("start");
        }
        z = false;
        String actConf22 = getActConf(BaseFBPlugin.ACT_CONF.supportVersion);
        if (!z) {
        }
        this.h = false;
        updateVerifyStatus("start");
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            onBNPageClose();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void handleEngineCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b64b42b", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f5893a, "fp plugin cancel");
        if (this.h) {
            if (openDuplicatePayTaskFix()) {
                updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, BaseFBPlugin.ABORT_SCENE_CANCEL_BY_ENGINE);
                return;
            } else {
                updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
                return;
            }
        }
        updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.n.multiBio) {
            if (this.n.hasNextBio()) {
                this.n.parseNextBio();
                if (this.n.isFP()) {
                    this.viType = "fp";
                } else if (this.n.isFACEID()) {
                    this.viType = DataHelper.FACEID_TYPE_VALUE;
                } else if (this.n.isZFACE()) {
                    this.viType = DataHelper.ZFACE_TYPE_VALUE;
                } else if (this.n.isWL()) {
                    this.viType = "wl";
                }
                return true;
            }
            if (z) {
                DataHelper dataHelper = this.n;
                dataHelper.proVerifyResult = "FP_STATUS-" + this.i;
                String string = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
                if (!StringUtils.isEmpty(string)) {
                    this.n.updateTipToPwd(string);
                }
            }
            this.n.goToPayPwd();
            return false;
        }
        if (z) {
            DataHelper dataHelper2 = this.n;
            dataHelper2.proVerifyResult = "FP_STATUS-" + this.i;
            String string2 = this.b.getResources().getString(R.string.vi_fp_tip_sys_fingerprint_error_setting);
            if (!StringUtils.isEmpty(string2)) {
                this.n.updateTipToPwd(string2);
            }
        }
        this.n.goToPayPwd();
        return false;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VerifyLogCat.i(f5893a, "startSpFingerprintChecker");
        this.n.logBehavior("cpzwjyks", "UC-MobileIC-160321-01", null);
        this.j.init(this.b, 1);
        if (!b(true)) {
            return;
        }
        FingerprintRequest fingerprintRequest = new FingerprintRequest();
        fingerprintRequest.mData = this.n.challenge;
        fingerprintRequest.mUserId = this.n.userId;
        new ApiFingerprintManagerProxy(this.j.getFingerprintManager(this.b)).vertify(fingerprintRequest, new AnonymousClass3());
    }

    /* renamed from: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements IFingerprintCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
        public void onCallBack(final FingerprintResult fingerprintResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
            } else if (FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                String access$000 = FingerprintPlugin.access$000();
                StringBuilder sb = new StringBuilder("指纹校验已取消，不处理回调结果[");
                sb.append(fingerprintResult != null ? fingerprintResult.mStatus : "");
                sb.append(riy.ARRAY_END_STR);
                VerifyLogCat.i(access$000, sb.toString());
            } else {
                FingerprintPlugin.access$700(FingerprintPlugin.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FingerprintPlugin.access$100(FingerprintPlugin.this).logFpResBehavior(String.valueOf(fingerprintResult.mResult), cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
                        if (fingerprintResult.mStatus == FingerprintResult.FingerprintStatus.COMMON_SUCCESS) {
                            VerifyLogCat.i(FingerprintPlugin.access$000(), "SP指纹本地校验成功，提交服务端校验");
                            FingerprintPlugin.access$100(FingerprintPlugin.this).buildRequestData(true, fingerprintResult);
                            FingerprintPlugin.access$500(FingerprintPlugin.this);
                            return;
                        }
                        String access$0002 = FingerprintPlugin.access$000();
                        VerifyLogCat.i(access$0002, "SP指纹本地校验未通过（含取消）, 转密码支付[" + fingerprintResult.mStatus + riy.ARRAY_END_STR);
                        FingerprintPlugin.access$600(FingerprintPlugin.this).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.3.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd(fingerprintResult);
                                }
                            }
                        }, 250L);
                    }
                });
            }
        }

        @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
        public void onProgressChanged(boolean z, final FingerprintResult fingerprintResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
            } else if (FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                String access$000 = FingerprintPlugin.access$000();
                StringBuilder sb = new StringBuilder("指纹校验已取消，不处理状态回调结果[");
                sb.append(fingerprintResult != null ? fingerprintResult.mStatus : "");
                sb.append(riy.ARRAY_END_STR);
                VerifyLogCat.i(access$000, sb.toString());
            } else {
                FingerprintPlugin.access$1000(FingerprintPlugin.this).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.3.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String access$0002 = FingerprintPlugin.access$000();
                        VerifyLogCat.i(access$0002, "onProgressChanged[" + fingerprintResult.mStatus + riy.ARRAY_END_STR);
                        if (fingerprintResult.mStatus == FingerprintResult.FingerprintStatus.COMMON_FAILED) {
                            FingerprintPlugin.access$800(FingerprintPlugin.this).setVisibility(8);
                            FingerprintPlugin.access$900(FingerprintPlugin.this, BaseFBPlugin.ACT_CONF.hwRetryText);
                        } else if (fingerprintResult.mStatus != FingerprintResult.FingerprintStatus.COMMON_VERIFYING) {
                        } else {
                            FingerprintPlugin.access$800(FingerprintPlugin.this).setVisibility(8);
                            FingerprintPlugin.access$900(FingerprintPlugin.this, BaseFBPlugin.ACT_CONF.hwAuthingText);
                        }
                    }
                });
            }
        }
    }

    private boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.n.userId)) {
            int checkUserStatus = this.j.checkUserStatus(this.n.userId);
            this.i = checkUserStatus;
            if (checkUserStatus == 2) {
                VerifyLogCat.i(f5893a, "用户本地指纹状态正常");
            } else {
                String str = f5893a;
                VerifyLogCat.i(str, "用户本地指纹状态不正确[" + checkUserStatus + riy.ARRAY_END_STR);
                if (z) {
                    VerifyLogCat.i(f5893a, "指纹状态不正确转密码");
                    AuthenticatorResponse authenticatorResponse = new AuthenticatorResponse();
                    authenticatorResponse.setResult(checkUserStatus);
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("status", String.valueOf(checkUserStatus));
                    this.n.logBehavior("yhfpztyc", "UC-MobileIC-180929-1", hashMap);
                    DataHelper dataHelper = this.n;
                    dataHelper.proVerifyResult = "FP_STATUS-" + this.i;
                    this.n.goToPayPwd(authenticatorResponse);
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onPaySuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a313101", new Object[]{this});
        } else {
            a(BaseFBPlugin.ACT_CONF.hwPaySuccessText);
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String actConf = FingerprintPlugin.this.getActConf(str);
                    if (!StringUtils.isEmpty(actConf)) {
                        FingerprintPlugin.access$1700(FingerprintPlugin.this).setText(actConf);
                    } else if (DataHelper.confResidMap.get(str) == null) {
                    } else {
                        FingerprintPlugin.access$1700(FingerprintPlugin.this).setText(DataHelper.confResidMap.get(str).intValue());
                    }
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.mModule == null) {
            VerifyLogCat.i(f5893a, "mModule为空？！返回。");
        } else {
            DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
            if (!this.o) {
                try {
                    if (defaultModuleResult.getExtInfo() != null) {
                        defaultModuleResult.getExtInfo().put("cancel_scene", "fp_plugin");
                    } else {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("cancel_scene", "fp_plugin");
                        defaultModuleResult.setExtInfo(hashMap);
                    }
                } catch (Throwable unused) {
                    VerifyLogCat.i(f5893a, "setExtParams error");
                }
            }
            MicroModuleContext.getInstance().notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), defaultModuleResult);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (!this.m.get()) {
            this.m.set(true);
            this.j.getFingerprintManager(this.b).cancel();
            p = SystemClock.elapsedRealtime();
            VerifyLogCat.i(f5893a, "取消指纹校验");
        }
        this.m.set(true);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin
    public void onBNPageClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9567005", new Object[]{this});
            return;
        }
        super.onBNPageClose();
        if (!this.m.get()) {
            c();
            b();
        }
        if (this.fpBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.fpBroadcastReceiver);
        }
        if (this.pageChangeBroadcastReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.pageChangeBroadcastReceiver);
    }

    public static /* synthetic */ void access$500(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7d8340", new Object[]{fingerprintPlugin});
            return;
        }
        fingerprintPlugin.k.set(false);
        VerifyLogCat.i(f5893a, "upload fingerprint check result");
        fingerprintPlugin.f.setVisibility(8);
        fingerprintPlugin.a(BaseFBPlugin.ACT_CONF.hwPayingText);
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.module = FingerprintPlugin.access$1100(FingerprintPlugin.this).getModuleName();
                    mICRpcRequest.verifyId = FingerprintPlugin.access$1200(FingerprintPlugin.this).getVerifyId();
                    mICRpcRequest.action = "VERIFY_PPW";
                    mICRpcRequest.token = FingerprintPlugin.access$1300(FingerprintPlugin.this).getToken();
                    String access$000 = FingerprintPlugin.access$000();
                    VerifyLogCat.i(access$000, "fingerprint data json str：" + FingerprintPlugin.access$100(FingerprintPlugin.this).fingerprintResultData);
                    mICRpcRequest.data = FingerprintPlugin.access$100(FingerprintPlugin.this).fingerprintResultData;
                    if (FingerprintPlugin.access$400(FingerprintPlugin.this).get()) {
                        VerifyLogCat.i(FingerprintPlugin.access$000(), "已压后台。不再发rpc了！");
                        return;
                    }
                    final MICRpcResponse sendRpcRequest = FingerprintPlugin.this.sendRpcRequest(mICRpcRequest);
                    FingerprintPlugin.access$1400(FingerprintPlugin.this).set(true);
                    if (sendRpcRequest == null) {
                        FingerprintPlugin.access$1600(FingerprintPlugin.this);
                    } else if (sendRpcRequest.verifySuccess) {
                        FingerprintPlugin.access$100(FingerprintPlugin.this).notifyResult(sendRpcRequest);
                    } else if (!sendRpcRequest.finish) {
                        FingerprintPlugin.access$100(FingerprintPlugin.this).updateTipToPwd(sendRpcRequest.verifyMessage);
                        FingerprintPlugin.access$100(FingerprintPlugin.this).logFpResBehavior(sendRpcRequest.verifyCode, "server");
                        FingerprintPlugin.access$100(FingerprintPlugin.this).goToPayPwd();
                    } else {
                        String str = sendRpcRequest.verifyMessage;
                        if (StringUtils.isEmpty(str)) {
                            str = FingerprintPlugin.access$1500(FingerprintPlugin.this).getResources().getString(R.string.verifyidentity_wrong_data);
                        }
                        MicroModuleContext.getInstance().alert("", str, FingerprintPlugin.access$1500(FingerprintPlugin.this).getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.FingerprintPlugin.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                    return;
                                }
                                FingerprintPlugin.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                                FingerprintPlugin.access$100(FingerprintPlugin.this).notifyResult(sendRpcRequest);
                            }
                        }, null, null);
                    }
                } catch (RpcException unused) {
                    FingerprintPlugin.access$1400(FingerprintPlugin.this).set(true);
                    VerifyLogCat.w(FingerprintPlugin.access$000(), "upload fingerprint check result got rpc error");
                    FingerprintPlugin.access$1600(FingerprintPlugin.this);
                }
            }
        }, "VERIFY_FINGERPRINT_MINI");
    }

    public static /* synthetic */ void access$1600(FingerprintPlugin fingerprintPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb710d0", new Object[]{fingerprintPlugin});
            return;
        }
        fingerprintPlugin.k.set(false);
        MicroModuleContext.getInstance().notifyAndFinishModule(fingerprintPlugin.mModule.getVerifyId(), fingerprintPlugin.mModule.getToken(), fingerprintPlugin.mModule.getModuleName(), new DefaultModuleResult("2003"));
    }
}
