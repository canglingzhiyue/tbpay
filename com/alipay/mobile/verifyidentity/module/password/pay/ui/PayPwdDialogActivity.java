package com.alipay.mobile.verifyidentity.module.password.pay.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.PwdInputAdapter;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.APLinearLayout;
import com.alipay.mobile.verifyidentity.ui.CustomProgressWheel;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.utils.IDecisionHelper;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class PayPwdDialogActivity extends PayDialogBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5932a = "PayPwdDialogActivity";
    private static Map<String, PwdCommonHandler> c = new HashMap();
    private LinearLayout b;
    private PwdCommonHandler d;
    private String e;
    private String f;
    private BroadcastReceiver g;
    private LinearLayout h;
    private boolean i;
    private boolean j;
    public boolean isShowGetBackPwd = false;
    private AtomicBoolean k = new AtomicBoolean(false);

    public static /* synthetic */ Object ipc$super(PayPwdDialogActivity payPwdDialogActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
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

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5932a;
    }

    public static /* synthetic */ MicroModule access$1000(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("b343c54a", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1100(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("b557244b", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("b76a834c", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("b97de24d", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1400(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("bb91414e", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1500(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("bda4a04f", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1900(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("c5f21c53", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ PwdCommonHandler access$200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PwdCommonHandler) ipChange.ipc$dispatch("8308b1d2", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.d;
    }

    public static /* synthetic */ MicroModule access$2000(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f39c4669", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2100(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f5afa56a", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f7c3046b", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f9d6636c", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2400(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("fbe9c26d", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2500(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("fdfd216e", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2600(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("10806f", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2700(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("223df70", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$2800(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("4373e71", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ AtomicBoolean access$2900(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("2fe6ef0", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.k;
    }

    public static /* synthetic */ String access$300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29d88504", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.f;
    }

    public static /* synthetic */ boolean access$3102(PayPwdDialogActivity payPwdDialogActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("942a0c2f", new Object[]{payPwdDialogActivity, new Boolean(z)})).booleanValue();
        }
        payPwdDialogActivity.i = z;
        return z;
    }

    public static /* synthetic */ MicroModule access$3200(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("381b858a", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$3300(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("3a2ee48b", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("e708d3df", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("e91c32e0", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModuleContext access$600(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("ae2a58fc", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mMicroModuleContext;
    }

    public static /* synthetic */ MicroModule access$700(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ed42f0e2", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$800(PayPwdDialogActivity payPwdDialogActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ef564fe3", new Object[]{payPwdDialogActivity}) : payPwdDialogActivity.mModule;
    }

    public static /* synthetic */ void access$900(PayPwdDialogActivity payPwdDialogActivity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec33080", new Object[]{payPwdDialogActivity, str, str2, str3});
        } else {
            payPwdDialogActivity.a(str, str2, str3);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity, com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.isNewPwdUi = true;
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getExtras() == null || this.mIsLogicInterrupted) {
            return;
        }
        setContentView(R.layout.layout_paypwd_dialog);
        this.b = (LinearLayout) findViewById(R.id.keyboard_container);
        this.mDialogLayout = (RelativeLayout) findViewById(R.id.dialog_container);
        this.mPwdInputLayout = (APLinearLayout) findViewById(R.id.input_container);
        this.mProgressLayout = (LinearLayout) findViewById(R.id.progress_container);
        this.h = (LinearLayout) findViewById(R.id.closelayout);
        this.other_txt = (TextView) findViewById(R.id.other_txt);
        if (this.mModule == null) {
            notifyError();
            return;
        }
        this.d = c.get(this.mModule.getVerifyId());
        PwdCommonHandler pwdCommonHandler = this.d;
        if (pwdCommonHandler != null) {
            pwdCommonHandler.bindAct(this);
            VerifyLogCat.i(f5932a, "收银台链路的弹框密码");
        } else {
            VerifyLogCat.i(f5932a, "非收银台链路的弹框密码");
            this.d = new PwdCommonHandler(this, this.mModule, null, null);
        }
        this.d.sourceToPwd = getIntent().getExtras().getString("sourceToPwd");
        this.f = getIntent().getExtras().getString("decisionToPwd");
        this.goOtherVerifyProduct = getIntent().getExtras().getString(PayPwdModule.PWD_MSP_FORGET_TIP);
        this.otherText = getIntent().getExtras().getString(PayPwdModule.PWD_MSP_FORGET_TO_VERIFY);
        this.isShowGetBackPwd = getIntent().getExtras().getBoolean("isFindPPW");
        this.e = getIntent().getExtras().getString(PayPwdModule.PWD_INPUT_TIP);
        this.top_to_product = getIntent().getExtras().getString("decisionToPwd_action");
        this.hind_other = getIntent().getExtras().getString(PayPwdModule.PWD_HIND_OTHER, "");
        this.useDialogPwd = getIntent().getExtras().getBoolean(PayPwdModule.PWD_USE_DIALOG_PWD, false);
        this.showFindPwd = getIntent().getExtras().getString(PayPwdModule.SHOW_FIND_PWD, "");
        this.findPwdTxt = getIntent().getExtras().getString(PayPwdModule.FIND_PWD_TXT, "");
        if (getIntent().getExtras().getBoolean("isSimplePwd") || "myBank".equalsIgnoreCase(a())) {
            this.isSimplePwd = true;
        } else {
            this.isSimplePwd = false;
        }
        this.g = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent.getAction() == null) {
                } else {
                    if ("pwd_plugin_close".equalsIgnoreCase(intent.getAction())) {
                        VerifyLogCat.i(PayPwdDialogActivity.access$000(), "PayDialogActivity receive  pwd_plugin_close");
                        PayPwdDialogActivity.this.finish();
                    } else if (!"on_pwd_plugin_action".equalsIgnoreCase(intent.getAction())) {
                    } else {
                        VerifyLogCat.i(PayPwdDialogActivity.access$000(), "PayDialogActivity receive  on_pwd_plugin_action");
                        String string = intent.getExtras().getString("data");
                        if (StringUtils.isEmpty(string) || string.startsWith(UiUtil.INPUT_TYPE_VALUE_PAYSPWD)) {
                            PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                            payPwdDialogActivity.isSimplePwd = true;
                            payPwdDialogActivity.initPwdInput();
                        } else if (UiUtil.INPUT_TYPE_VALUE_PAYPWD.equalsIgnoreCase(string)) {
                            PayPwdDialogActivity payPwdDialogActivity2 = PayPwdDialogActivity.this;
                            payPwdDialogActivity2.isSimplePwd = false;
                            payPwdDialogActivity2.initPwdInput();
                        } else {
                            JSONObject jSONObject = null;
                            try {
                                jSONObject = JSON.parseObject(string);
                            } catch (JSONException e) {
                                String access$000 = PayPwdDialogActivity.access$000();
                                VerifyLogCat.e(access$000, "json fail " + string, e);
                            }
                            if (jSONObject == null) {
                                return;
                            }
                            PayPwdDialogActivity.access$100(PayPwdDialogActivity.this, jSONObject.getString("pubKey"));
                        }
                    }
                }
            }
        };
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("on_pwd_plugin_action");
        intentFilter.addAction("pwd_plugin_close");
        localBroadcastManager.registerReceiver(this.g, intentFilter);
        initViewParams();
        initKeyBoard(this.b);
        this.closeImg = (ImageView) findViewById(R.id.closeimg);
        this.h.bringToFront();
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).isPluginMode) {
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
                }
                PayPwdDialogActivity.this.notifyCancel("102");
            }
        });
        String string = getIntent().getExtras().getString("title");
        this.content_title = (TextView) findViewById(R.id.pwd_title);
        if (StringUtils.isEmpty(string)) {
            string = getResources().getString(R.string.pwd_input_alert_please);
        }
        this.content_title.setText(string);
        this.content_desc = (TextView) findViewById(R.id.pwd_desc);
        this.content_biz_desc = (TextView) findViewById(R.id.pwd_biz_desc);
        String string2 = getIntent().getExtras().getString("subtitle");
        if (!StringUtils.isEmpty(string2) || !StringUtils.isEmpty(this.e)) {
            this.j = true;
            this.content_biz_desc.setVisibility(0);
            if (!StringUtils.isEmpty(this.e)) {
                this.content_biz_desc.setText(this.e);
            } else {
                this.content_biz_desc.setText(string2);
            }
        } else {
            this.j = false;
            this.content_biz_desc.setVisibility(8);
        }
        String string3 = getIntent().getExtras().getString("htip", "");
        if (!StringUtils.isEmpty(this.pwdTopTip)) {
            this.content_desc.setTextColor(-65536);
            this.content_desc.setText(this.pwdTopTip);
            this.content_desc.setVisibility(0);
            changeLayout(true, this.j);
        } else if (!StringUtils.isEmpty(this.f) && !"Y".equalsIgnoreCase(string3)) {
            this.content_desc.setText(this.f);
            this.content_desc.setVisibility(0);
            this.content_desc.setTextColor(Color.parseColor("#333333"));
            changeLayout(true, this.j);
        } else {
            this.content_desc.setVisibility(8);
            changeLayout(false, this.j);
        }
        initPwdInput();
        this.mPayingTip = (TextView) findViewById(R.id.paying_txt);
        this.mProgressWheel = (CustomProgressWheel) findViewById(R.id.paypwd_progress_new);
        String string4 = getIntent().getExtras().getString("loadingTip");
        if (StringUtils.isEmpty(string4)) {
            if (this.d.isPluginMode) {
                string4 = this.d.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.loadingPayingText);
            } else {
                string4 = getResources().getString(R.string.pwd_is_paying);
            }
        }
        this.mPayingTip.setText(string4);
        this.goBackPwd = (TextView) findViewById(R.id.getbackpwd);
        if (this.d.isPluginMode && "Y".equalsIgnoreCase(getOtherPayConfig())) {
            if ("Y".equalsIgnoreCase(this.hind_other)) {
                this.goBackPwd.setVisibility(8);
            } else {
                this.goBackPwd.setVisibility(0);
                this.goBackPwd.setText(getOtherPayContent());
                this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        PayPwdDialogActivity.this.hideKeyboard();
                        PayPwdDialogActivity.this.mDialogLayout.setVisibility(4);
                        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                            MicroModuleContext.getInstance().showProgressDialog("");
                        } else {
                            PayPwdDialogActivity.this.showViPayProgress("", false);
                        }
                        PayPwdDialogActivity.access$900(PayPwdDialogActivity.this, null, "Y", "forgotPwd");
                        if (PayPwdDialogActivity.access$1000(PayPwdDialogActivity.this) == null) {
                            return;
                        }
                        PayPwdDialogActivity.access$1100(PayPwdDialogActivity.this).isFindAndPay = true;
                        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PayPwdDialogActivity.access$1200(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$1300(PayPwdDialogActivity.this).getVerifyId(), null, null);
                    }
                });
            }
        } else if (this.d.isPluginMode) {
            if ("Y".equalsIgnoreCase(this.hind_other)) {
                this.goBackPwd.setVisibility(8);
            } else {
                if (StringUtils.isEmpty(this.showFindPwd) || "Y".equalsIgnoreCase(this.showFindPwd)) {
                    this.goBackPwd.setVisibility(0);
                    if (!StringUtils.isEmpty(this.findPwdTxt)) {
                        this.goBackPwd.setText(this.findPwdTxt);
                    } else {
                        this.goBackPwd.setText(R.string.pwd_forget_in_layout);
                    }
                } else {
                    this.goBackPwd.setVisibility(8);
                }
                this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                        LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).notifyCancel();
                        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeGetPwdDelay))) {
                            PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetMspPPW(PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                            return;
                        }
                        try {
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetMspPPW(PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                                    }
                                }
                            }, 200L);
                        } catch (Throwable th) {
                            String access$000 = PayPwdDialogActivity.access$000();
                            VerifyLogCat.i(access$000, "quit error:" + th.getMessage());
                        }
                    }
                });
            }
        } else if (this.isShowGetBackPwd) {
            String string5 = getIntent().getExtras().getString("pwd_action");
            if (!StringUtils.isEmpty(string5)) {
                this.goBackPwd.setText(string5);
            } else {
                this.goBackPwd.setText(R.string.pwd_forget_in_layout);
            }
            this.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).isPluginMode) {
                        PayPwdDialogActivity.this.showProgress(8, 0);
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetBackPPW();
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).notifyCancel();
                    } else {
                        PayPwdDialogActivity.this.goGetBackPPW();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("module", PayPwdDialogActivity.this.getLogicModuleName());
                    hashMap.put("event", "find_password");
                    hashMap.put("type", "alert");
                    hashMap.put(PayPwdModule.PWD_USE_DIALOG_PWD, String.valueOf(PayPwdDialogActivity.this.useDialogPwd));
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160201-01", Constants.VI_ENGINE_APPID, "hswjmm", PayPwdDialogActivity.access$1400(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$1500(PayPwdDialogActivity.this).getVerifyId(), null, hashMap);
                }
            });
            this.goBackPwd.setVisibility(0);
            VerifyLogCat.i(f5932a, "在不显示其它方式入口的情况下，根据需要，显示忘记密码入口");
        }
        if (getIntent().getExtras().getBoolean("hasOthers")) {
            String string6 = getIntent().getExtras().getString("switchOther");
            if (StringUtils.isEmpty(string6)) {
                String string7 = getIntent().getExtras().getString("pwd_other");
                if (StringUtils.isEmpty(string7)) {
                    string7 = getResources().getString(R.string.pwd_other_way);
                }
                a(string7);
            } else {
                a(string6);
            }
            VerifyLogCat.i(f5932a, "显示选择其它方式入口");
        } else {
            a("");
        }
        forbidCapture();
    }

    public void initViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b862cc2", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mDialogLayout.getLayoutParams();
        layoutParams.width = (displayMetrics.widthPixels << 2) / 5;
        layoutParams.height = -2;
        this.mDialogLayout.setLayoutParams(layoutParams);
        if (this.isSimplePwd) {
            this.mDialogLayout.setMinimumHeight(DensityUtil.dip2px(this, 240.0f));
        } else {
            this.mDialogLayout.setMinimumHeight(DensityUtil.dip2px(this, 300.0f));
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str)) {
            this.isIntellDecison = false;
            this.other_txt.setVisibility(0);
            this.other_txt.setText(str);
            this.other_txt.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("module", PayPwdDialogActivity.this.getLogicModuleName());
                        hashMap.put("ui_type", "alert");
                        hashMap.put("plusPwdType", !StringUtils.isEmpty(PayPwdDialogActivity.access$300(PayPwdDialogActivity.this)) ? "pwd" : "plus_pwd");
                        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-180927-01", Constants.VI_ENGINE_APPID, "zthlio", PayPwdDialogActivity.access$400(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$500(PayPwdDialogActivity.this).getVerifyId(), null, hashMap);
                    } catch (Throwable th) {
                        String access$000 = PayPwdDialogActivity.access$000();
                        VerifyLogCat.i(access$000, "log error:" + th.getMessage());
                    }
                    MicroModuleContext access$600 = PayPwdDialogActivity.access$600(PayPwdDialogActivity.this);
                    PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                    VIUtils.goOtherVerifyProduct(access$600, payPwdDialogActivity, PayPwdDialogActivity.access$700(payPwdDialogActivity));
                }
            });
        } else if (!StringUtils.isEmpty(this.top_to_product)) {
            this.isIntellDecison = true;
            this.other_txt.setVisibility(0);
            this.other_txt.setText(this.top_to_product);
            this.other_txt.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).isPluginMode) {
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusNew("end");
                    }
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).changeToBack();
                    new IDecisionHelper().recordBehavior("BACK_TO_BIO_PAY", "", PayPwdDialogActivity.access$800(PayPwdDialogActivity.this).getVerifyId(), "");
                }
            });
        } else {
            this.other_txt.setVisibility(8);
        }
    }

    public void initPwdInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c01349c4", new Object[]{this});
            return;
        }
        String str = f5932a;
        VerifyLogCat.i(str, "initSixPwd: " + this.isSimplePwd);
        this.mSafeInputContext = new PwdInputAdapter().getVISafeInputForNew(this, this.isSimplePwd, a());
        this.mSafeInputContext.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
            public void onUserConfirm(String str2) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d51cf727", new Object[]{this, str2});
                    return;
                }
                PayPwdDialogActivity.access$1600(PayPwdDialogActivity.this, str2);
                PayPwdDialogActivity payPwdDialogActivity = PayPwdDialogActivity.this;
                if (!StringUtils.isEmpty(str2)) {
                    i = str2.length();
                }
                payPwdDialogActivity.writePWDSwitchBehavorLog("1", String.valueOf(i));
            }
        });
        this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                String access$000 = PayPwdDialogActivity.access$000();
                VerifyLogCat.i(access$000, "safeInputContext onFocusChange: " + z);
                if (!z) {
                    return;
                }
                PayPwdDialogActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(PayPwdDialogActivity.access$000(), "safeInputContext onClick");
                PayPwdDialogActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
        this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randomafter);
        setSafeKeyboardPwdInput(this.mSafeInputContext.getEditText());
        this.mPwdInputLayout.addView(this.mSafeInputContext.getContentView());
        this.mPwdInputLayout.setVisibility(0);
        if (!this.d.isPluginMode) {
            return;
        }
        String actConf = this.d.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.pwdInputBtn);
        String actConf2 = this.d.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.pwdPlaceHolder);
        if (!StringUtils.isEmpty(actConf)) {
            this.mSafeInputContext.setOkButtonText(actConf);
        }
        if (StringUtils.isEmpty(actConf2)) {
            return;
        }
        this.mSafeInputContext.getEditText().setHint(actConf2);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (this.k.get()) {
        } else {
            if (this.d.isPluginMode) {
                this.d.mPlugin.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.abort);
            }
            notifyCancel("102");
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        this.k.set(true);
        writeBehavorWithPlus("UC-MobileIC-20190606-4", "START_VERIFY_PWD_RPC", "wallet_cn", "alert");
        this.d.doRpc(str, str2, str3, this.isSimplePwd, this.predata, this.isIntellDecison, new PwdCommonHandler.NotifyMspResultHandler() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.NotifyMspResultHandler
            public void notifyResult(MICRpcResponse mICRpcResponse, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52319fdb", new Object[]{this, mICRpcResponse, str4});
                    return;
                }
                PayPwdDialogActivity.this.predata = null;
                MicroModuleContext.getInstance().dismissProgressDialog();
                PayPwdDialogActivity.this.dissMissViPayProgress();
                if (mICRpcResponse == null) {
                    VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd null result");
                    PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                    PayPwdDialogActivity.this.onNetError(true);
                } else if (mICRpcResponse.verifySuccess) {
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).doNextStep(mICRpcResponse, str4);
                    PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                    PayPwdDialogActivity.access$1700(PayPwdDialogActivity.this, mICRpcResponse);
                    PayPwdDialogActivity.this.writeBehavorWithPlus("UC-MobileIC-20191030-2", "SUCCESS", "wallet_cn", "alert");
                } else {
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusNew(BaseFBPlugin.VERIFY_STATUS.awaitUser);
                    PayPwdDialogActivity.this.clearInputContent();
                    PayPwdDialogActivity.access$100(PayPwdDialogActivity.this, PubKeyHelper.updateLocalPubKey(PayPwdDialogActivity.this, mICRpcResponse));
                    if ("RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd retry");
                        if (PayPwdDialogActivity.this.useDialogPwd) {
                            PayPwdDialogActivity.access$1800(PayPwdDialogActivity.this, mICRpcResponse);
                        } else {
                            PayPwdDialogActivity.this.mDialogLayout.setVisibility(0);
                            PayPwdDialogActivity.access$3000(PayPwdDialogActivity.this, mICRpcResponse);
                        }
                        PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                    } else {
                        PayPwdDialogActivity.access$2900(PayPwdDialogActivity.this).set(false);
                        PayPwdDialogActivity.access$3102(PayPwdDialogActivity.this, true);
                        PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).processErrorForNew(PayPwdDialogActivity.this, mICRpcResponse, new PwdCommonHandler.OnMspDialogConfirm() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.16.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler.OnMspDialogConfirm
                            public void onConfirm() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("310393e8", new Object[]{this});
                                    return;
                                }
                                if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                                    MicroModuleContext.getInstance().showProgressDialog("");
                                } else {
                                    PayPwdDialogActivity.this.showViPayProgress("", false);
                                }
                                PayPwdDialogActivity.access$900(PayPwdDialogActivity.this, null, "Y", "");
                                if (PayPwdDialogActivity.access$3200(PayPwdDialogActivity.this) == null) {
                                    return;
                                }
                                PayPwdDialogActivity.access$3300(PayPwdDialogActivity.this).isFindAndPay = true;
                            }
                        }, PayPwdDialogActivity.this.mDialogLayout, PayPwdDialogActivity.this.hind_other);
                    }
                    PayPwdDialogActivity.this.writeBehavorWithPlus("UC-MobileIC-20191030-3", "FAIL", "wallet_cn", "alert");
                }
            }
        });
    }

    public void onPwdError(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a14cd", new Object[]{this, mICRpcResponse});
            return;
        }
        showProgress(8, 0);
        this.content_desc.setText(mICRpcResponse.verifyMessage);
        this.content_desc.setTextColor(-65536);
        this.content_desc.setVisibility(0);
        changeLayout(true, this.j);
        showKeyboard();
        this.content_desc.setAnimation(shakeAnimation(6));
    }

    public void writeBehavorWithPlus(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d003c84d", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("module", getLogicModuleName());
            hashMap.put("code", str2);
            hashMap.put("source", str3);
            hashMap.put("ui_type", str4);
            if (!StringUtils.isEmpty(this.f)) {
                hashMap.put("plusPwdType", "pwd");
            } else {
                hashMap.put("plusPwdType", "plus_pwd");
            }
            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavca", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
        } catch (Throwable th) {
            String str5 = f5932a;
            VerifyLogCat.i(str5, "writeBehavorWithPlus error:" + th.getMessage());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (!z) {
            return;
        }
        if (this.i) {
            this.i = false;
            return;
        }
        try {
            if (this.mDialogLayout == null || this.mDialogLayout.getVisibility() != 0) {
                return;
            }
            getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PayPwdDialogActivity.this.showKeyboard();
                    }
                }
            }, 100L);
        } catch (Throwable unused) {
            VerifyLogCat.i(f5932a, "ui error");
        }
    }

    private String a() {
        Bundle extParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        VerifyIdentityTask task = this.mModule.getTask();
        if (task != null && (extParams = task.getExtParams()) != null) {
            return extParams.getString("bizPwdType");
        }
        return null;
    }

    public static void addPwdHandler(String str, PwdCommonHandler pwdCommonHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d73cbc8", new Object[]{str, pwdCommonHandler});
        } else {
            c.put(str, pwdCommonHandler);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c.remove(this.mModule.getVerifyId());
        if (this.g == null) {
            return;
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.g);
    }

    public static /* synthetic */ void access$100(PayPwdDialogActivity payPwdDialogActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2bc764", new Object[]{payPwdDialogActivity, str});
            return;
        }
        String str2 = f5932a;
        VerifyLogCat.i(str2, "updatePubKey: " + str);
        if (StringUtils.isEmpty(str)) {
            VerifyLogCat.i(f5932a, "服务端没有提供新的公钥，不更新");
            return;
        }
        payPwdDialogActivity.generatePubKey(str);
        payPwdDialogActivity.mSafeInputContext.setRsaPublicKey(payPwdDialogActivity.mPubKey);
    }

    public static /* synthetic */ void access$1600(PayPwdDialogActivity payPwdDialogActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77076cd8", new Object[]{payPwdDialogActivity, str});
            return;
        }
        VerifyLogCat.i(f5932a, "safeInputContext onUserInputConfirm");
        payPwdDialogActivity.hideKeyboard();
        payPwdDialogActivity.showProgress(0, 8);
        if (payPwdDialogActivity.d.isPluginMode) {
            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                payPwdDialogActivity.mDialogLayout.setVisibility(4);
                payPwdDialogActivity.mPayingTip.getText().toString();
                payPwdDialogActivity.showViPayProgress("", false);
            }
            payPwdDialogActivity.d.mPlugin.updateVerifyStatusNew("end");
            payPwdDialogActivity.a(str, null, "");
            return;
        }
        payPwdDialogActivity.verify(str, new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
            public void onResult(MICRpcResponse mICRpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                } else if (mICRpcResponse == null) {
                    VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd null result");
                    PayPwdDialogActivity.this.onNetError(false);
                } else if (mICRpcResponse.verifySuccess) {
                    PayPwdDialogActivity.this.startAnimationDone();
                    PayPwdDialogActivity.access$1700(PayPwdDialogActivity.this, mICRpcResponse);
                    PayPwdDialogActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "SUCCESS", "wallet_cn", "alert");
                } else {
                    PayPwdDialogActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "FAIL", "wallet_cn", "alert");
                    PayPwdDialogActivity.this.clearInputContent();
                    PayPwdDialogActivity.access$100(PayPwdDialogActivity.this, PubKeyHelper.updateLocalPubKey(PayPwdDialogActivity.this, mICRpcResponse));
                    if (!"RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        PayPwdDialogActivity.this.showProgress(8, 0);
                        PayPwdDialogActivity payPwdDialogActivity2 = PayPwdDialogActivity.this;
                        payPwdDialogActivity2.processErrorForDialog(payPwdDialogActivity2.mDialogLayout, mICRpcResponse);
                        return;
                    }
                    VerifyLogCat.d(PayPwdDialogActivity.access$000(), "input pwd retry");
                    if (PayPwdDialogActivity.this.useDialogPwd) {
                        PayPwdDialogActivity.access$1800(PayPwdDialogActivity.this, mICRpcResponse);
                    } else {
                        PayPwdDialogActivity.this.onPwdError(mICRpcResponse);
                    }
                }
            }
        });
    }

    public static /* synthetic */ void access$1700(PayPwdDialogActivity payPwdDialogActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e790f4f", new Object[]{payPwdDialogActivity, mICRpcResponse});
        } else if (StringUtils.isEmpty(mICRpcResponse.data) || !mICRpcResponse.data.contains("bicAsyncData")) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(mICRpcResponse.data);
                if (parseObject == null) {
                    return;
                }
                AuthenticatorManager.getInstance(payPwdDialogActivity).processAfterAuth(parseObject.getString("bicAsyncData"));
            } catch (Throwable th) {
                String str = f5932a;
                VerifyLogCat.i(str, "handle km error:" + th.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (android.text.StringUtils.isEmpty(r0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (android.text.StringUtils.isEmpty(r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        r0 = r12.getResources().getString(com.taobao.taobao.R.string.pwd_forget_in_layout);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void access$1800(com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity r12, final com.alipay.mobileic.core.model.rpc.MICRpcResponse r13) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r12
            r1[r2] = r13
            java.lang.String r12 = "eaed4c2e"
            r0.ipc$dispatch(r12, r1)
            return
        L15:
            r0 = 8
            r12.showProgress(r0, r3)
            r12.hideKeyboard()
            android.widget.RelativeLayout r0 = r12.mDialogLayout
            r1 = 4
            r0.setVisibility(r1)
            com.alipay.mobile.verifyidentity.module.password.pay.utils.PwdCommonHandler r0 = r12.d
            boolean r0 = r0.isPluginMode
            java.lang.String r1 = ""
            if (r0 == 0) goto L5c
            java.lang.String r0 = r12.hind_other
            java.lang.String r4 = "Y"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L37
        L35:
            r0 = r1
            goto L83
        L37:
            boolean r0 = r12.getOtherVerifyPayFlag(r13)
            if (r0 == 0) goto L42
            java.lang.String r0 = r12.getOtherVerifyPayText(r13)
            goto L82
        L42:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r4 = r12.showFindPwdByResponse(r13, r0)
            if (r4 == 0) goto L35
            java.lang.String r3 = "findPwdTxt"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.StringUtils.isEmpty(r0)
            if (r3 == 0) goto L82
            goto L76
        L5c:
            boolean r0 = r12.isShowGetBackPwd
            if (r0 == 0) goto L81
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r3 = "pwd_action"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.StringUtils.isEmpty(r0)
            if (r3 != 0) goto L76
            goto L82
        L76:
            android.content.res.Resources r0 = r12.getResources()
            int r3 = com.taobao.taobao.R.string.pwd_forget_in_layout
            java.lang.String r0 = r0.getString(r3)
            goto L82
        L81:
            r0 = r1
        L82:
            r3 = 1
        L83:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r4 = "alertTextColor"
            r11.putBoolean(r4, r2)
            java.lang.String r6 = r13.verifyMessage
            int r2 = com.taobao.taobao.R.string.pwd_error_retry
            java.lang.String r7 = r12.getString(r2)
            com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$14 r8 = new com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$14
            r8.<init>()
            if (r3 == 0) goto L9e
            r9 = r0
            goto L9f
        L9e:
            r9 = r1
        L9f:
            if (r3 == 0) goto La8
            com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$15 r0 = new com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity$15
            r0.<init>()
            r10 = r0
            goto Laa
        La8:
            r13 = 0
            r10 = r13
        Laa:
            java.lang.String r5 = ""
            r4 = r12
            r4.alert(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.access$1800(com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity, com.alipay.mobileic.core.model.rpc.MICRpcResponse):void");
    }

    public static /* synthetic */ void access$3000(PayPwdDialogActivity payPwdDialogActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b722338", new Object[]{payPwdDialogActivity, mICRpcResponse});
            return;
        }
        payPwdDialogActivity.showProgress(8, 0);
        payPwdDialogActivity.content_desc.setText(mICRpcResponse.verifyMessage);
        payPwdDialogActivity.content_desc.setTextColor(-65536);
        payPwdDialogActivity.content_desc.setVisibility(0);
        payPwdDialogActivity.changeLayout(true, payPwdDialogActivity.j);
        payPwdDialogActivity.showKeyboard();
        payPwdDialogActivity.content_desc.setAnimation(payPwdDialogActivity.shakeAnimation(6));
        if ("Y".equalsIgnoreCase(payPwdDialogActivity.hind_other)) {
            payPwdDialogActivity.goBackPwd.setVisibility(8);
        } else if (payPwdDialogActivity.getOtherVerifyPayFlag(mICRpcResponse)) {
            payPwdDialogActivity.goBackPwd.setVisibility(0);
            payPwdDialogActivity.goBackPwd.setText(payPwdDialogActivity.getOtherVerifyPayText(mICRpcResponse));
            payPwdDialogActivity.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PayPwdDialogActivity.this.hideKeyboard();
                    PayPwdDialogActivity.this.mDialogLayout.setVisibility(4);
                    if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.stopNewLoading))) {
                        MicroModuleContext.getInstance().showProgressDialog("");
                    } else {
                        PayPwdDialogActivity.this.showViPayProgress("", false);
                    }
                    PayPwdDialogActivity.access$900(PayPwdDialogActivity.this, null, "Y", "forgotPwd");
                    if (PayPwdDialogActivity.access$1900(PayPwdDialogActivity.this) == null) {
                        return;
                    }
                    PayPwdDialogActivity.access$2000(PayPwdDialogActivity.this).isFindAndPay = true;
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-190311-1", Constants.VI_ENGINE_APPID, "aprj", PayPwdDialogActivity.access$2100(PayPwdDialogActivity.this).getToken(), PayPwdDialogActivity.access$2200(PayPwdDialogActivity.this).getVerifyId(), null, null);
                }
            });
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (payPwdDialogActivity.showFindPwdByResponse(mICRpcResponse, hashMap)) {
                String str = hashMap.get(PayPwdModule.FIND_PWD_TXT);
                payPwdDialogActivity.goBackPwd.setVisibility(0);
                if (!StringUtils.isEmpty(str)) {
                    payPwdDialogActivity.goBackPwd.setText(str);
                } else {
                    payPwdDialogActivity.goBackPwd.setText(R.string.pwd_forget_in_layout);
                }
            } else {
                payPwdDialogActivity.goBackPwd.setVisibility(8);
            }
            payPwdDialogActivity.goBackPwd.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdDialogActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).goGetMspPPW(PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.getActConf(BaseFBPlugin.ACT_CONF.login_id));
                    LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).sendBroadcast(new Intent("kMQPFindPwdNotification"));
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).mPlugin.updateVerifyStatusFotQuit(BaseFBPlugin.VERIFY_STATUS.abort, "forgetPwd");
                    PayPwdDialogActivity.access$200(PayPwdDialogActivity.this).notifyCancel();
                }
            });
        }
    }
}
