package com.alipay.mobile.verifyidentity.module.internal.password.pay.ui;

import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alipay.android.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.PwdInputAdapter;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
import com.alipay.mobile.verifyidentity.ui.APImageView;
import com.alipay.mobile.verifyidentity.ui.APLinearLayout;
import com.alipay.mobile.verifyidentity.ui.APRelativeLayout;
import com.alipay.mobile.verifyidentity.ui.APScrollView;
import com.alipay.mobile.verifyidentity.ui.APTextView;
import com.alipay.mobile.verifyidentity.ui.CustomProgressWheel;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class PayPwdCommonActivity extends AbsPayPwdActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5910a = "PayPwdCommonActivity";
    public APLinearLayout mAPLinearLayout;
    public AlipayKeyboard mAlipayKeyboard;
    public APImageView mBack;
    public APTextView mContent;
    public CustomProgressWheel mCustomProgressWheel;
    public AnimationDrawable mLoading;
    public APTextView mOther;
    public APTextView mProgressText;
    public APLinearLayout mPwdInputLayout;
    public View mRoot;
    public VISafeInputInterface mSafeInputContext;
    public APTextView mSubtitle;
    public ImageView mTick;
    public APTextView mTitle;
    public String mUser;
    public int mViewHeight;
    public APScrollView mWrapper;
    public String pageStyle;
    public int processBarMarginTop = 0;
    public boolean isShowGetBackPwd = false;

    public static /* synthetic */ Object ipc$super(PayPwdCommonActivity payPwdCommonActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != -884160602) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
        }
    }

    public static /* synthetic */ MicroModuleContext access$000(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("4df9d351", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mMicroModuleContext;
    }

    public static /* synthetic */ MicroModule access$100(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("f4ecf4b", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$200(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("e7dfc16a", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$300(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("c070b389", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("9901a5a8", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("719297c7", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ String access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("542dd222", new Object[0]) : f5910a;
    }

    public static /* synthetic */ MicroModule access$900(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("d3d66043", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public void showProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f25e952", new Object[]{this, new Integer(i)});
            return;
        }
        this.mCustomProgressWheel.setVisibility(i);
        this.mProgressText.setVisibility(i);
        if (i == 0) {
            this.mAPLinearLayout.setVisibility(8);
            this.mCustomProgressWheel.start();
            return;
        }
        this.mAPLinearLayout.setVisibility(0);
        AnimationDrawable animationDrawable = this.mLoading;
        if (animationDrawable == null) {
            return;
        }
        animationDrawable.stop();
        this.mLoading = null;
    }

    public void startAnimationDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6195e6b", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5910a, "animation done");
        this.mCustomProgressWheel.setVisibility(8);
        this.mTick.setImageDrawable(null);
        this.mTick.setBackgroundResource(R.drawable.pwd_success_blue_notice);
        this.mTick.setVisibility(0);
        try {
            this.mLoading = (AnimationDrawable) this.mTick.getBackground();
            this.mLoading.start();
        } catch (Throwable th) {
            VerifyLogCat.w(f5910a, "FAIL to start success animation!", th);
        }
        this.mProgressText.setVisibility(0);
        String string = getIntent().getExtras().getString("pwd_PASS");
        String str = f5910a;
        VerifyLogCat.i(str, "pass_tip:" + string);
        if (!TextUtils.isEmpty(string)) {
            this.mProgressText.setText(string);
        } else {
            this.mProgressText.setText(getLocaleStringResource(R.string.sg_pwd_verify_success));
        }
        new Handler().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PayPwdCommonActivity.this.doNextStep();
                }
            }
        }, 600L);
    }

    private int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue() : (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void initGoOther() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73318c5f", new Object[]{this});
            return;
        }
        this.mOther = (APTextView) findViewById(R.id.paypwd_other);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mOther.getLayoutParams();
        if (this.pageStyle.equals("full") && this.isIpay && !getIntent().getExtras().getBoolean("isSimplePwd")) {
            layoutParams.topMargin = a(15.0f);
            this.mOther.setLayoutParams(layoutParams);
        } else if (this.pageStyle.equals("full") && this.isIpay) {
            layoutParams.topMargin = a(20.0f);
            this.mOther.setLayoutParams(layoutParams);
        }
        this.isShowGetBackPwd = getIntent().getExtras().getBoolean("isFindPPW");
        if (getIntent().getExtras().getBoolean("hasOthers")) {
            this.mOther.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PayPwdCommonActivity.this.hideKeyboard();
                    PayPwdCommonActivity.this.mOther.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            VIUtils.goOtherVerifyProduct(PayPwdCommonActivity.access$000(PayPwdCommonActivity.this), PayPwdCommonActivity.this, PayPwdCommonActivity.access$100(PayPwdCommonActivity.this));
                            VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-180927-01", Constants.VI_ENGINE_APPID, "zthlio", PayPwdCommonActivity.access$200(PayPwdCommonActivity.this).getToken(), PayPwdCommonActivity.access$300(PayPwdCommonActivity.this).getVerifyId(), null, null);
                        }
                    }, 300L);
                }
            });
            String string = getIntent().getExtras().getString("pwd_other");
            if (!TextUtils.isEmpty(string)) {
                this.mOther.setText(string);
            }
            this.mOther.setVisibility(0);
            VerifyLogCat.i(f5910a, "显示选择其它方式入口");
        } else if (!this.isShowGetBackPwd) {
        } else {
            String string2 = getIntent().getExtras().getString("pwd_action");
            if (!TextUtils.isEmpty(string2)) {
                this.mOther.setText(string2);
            } else {
                this.mOther.setText(getLocaleStringResource(R.string.sg_pwd_forget_in_layout));
            }
            this.mOther.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("module", PayPwdCommonActivity.this.getLogicModuleName());
                    hashMap.put("event", "find_password");
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160201-01", Constants.VI_ENGINE_APPID, "hswjmm", PayPwdCommonActivity.access$400(PayPwdCommonActivity.this).getToken(), PayPwdCommonActivity.access$500(PayPwdCommonActivity.this).getVerifyId(), null, hashMap);
                    PayPwdCommonActivity.this.goGetBackPPW();
                }
            });
            this.mOther.setVisibility(0);
            VerifyLogCat.i(f5910a, "在不显示其它方式入口的情况下，根据需要，显示忘记密码入口");
        }
    }

    public void initContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ad4d50", new Object[]{this});
            return;
        }
        this.mContent = (APTextView) findViewById(R.id.paypwd_content);
        String string = getIntent().getExtras().getString("footRemark");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.mContent.setText(string);
        this.mContent.setVisibility(0);
    }

    public void initProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf10964", new Object[]{this});
            return;
        }
        this.mAPLinearLayout = (APLinearLayout) findViewById(R.id.pwd_input_area);
        this.mCustomProgressWheel = (CustomProgressWheel) findViewById(R.id.paypwd_progress_new);
        this.mCustomProgressWheel.setBarColor(-15304705);
        this.mCustomProgressWheel.start();
        this.mTick = (ImageView) findViewById(R.id.template_pay_success);
        this.mProgressText = (APTextView) findViewById(R.id.paypwd_progress_text);
        String string = getIntent().getExtras().getString("loadingTip");
        if (TextUtils.isEmpty(string)) {
            string = getLocaleStringResource(R.string.pwd_verify_ing);
        }
        this.mProgressText.setText(string);
    }

    public void initInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2455421", new Object[]{this});
            return;
        }
        if (getIntent().getExtras().getBoolean("isSimplePwd") || "myBank".equalsIgnoreCase(a())) {
            this.isSimplePwd = true;
        } else {
            this.isSimplePwd = false;
        }
        initPwdInput();
        this.processBarMarginTop = 0;
        String str = f5910a;
        VerifyLogCat.d(str, "processBarMarginTop: " + this.processBarMarginTop);
        APRelativeLayout aPRelativeLayout = (APRelativeLayout) findViewById(R.id.progress_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aPRelativeLayout.getLayoutParams();
        int i = this.processBarMarginTop;
        if (i > 0) {
            layoutParams.setMargins(0, i, 0, 0);
        } else {
            layoutParams.addRule(13);
        }
        aPRelativeLayout.setLayoutParams(layoutParams);
    }

    public void initKeyBoard(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4057803d", new Object[]{this, viewGroup});
            return;
        }
        VerifyLogCat.d(f5910a, "initKeyBoard and new AlipayKeyboard");
        this.mAlipayKeyboard = new AlipayKeyboard(this);
        this.mAlipayKeyboard.initializeKeyboard(null);
        viewGroup.addView(this.mAlipayKeyboard, new LinearLayout.LayoutParams(-1, -2));
        viewGroup.setVisibility(0);
    }

    public void initPwdInput() {
        String str = f5910a;
        VerifyLogCat.i(str, "initSixPwd: " + this.isSimplePwd);
        this.mPwdInputLayout = (APLinearLayout) findViewById(R.id.paypwd_sixpwd_layout);
        this.mSafeInputContext = new PwdInputAdapter().getVISafeInput(this, this.isSimplePwd, a(), this.isIpay, this.pageStyle);
        this.mSafeInputContext.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
            public void onUserConfirm(String str2) {
                IpChange ipChange = $ipChange;
                int i = 0;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d51cf727", new Object[]{this, str2});
                    return;
                }
                PayPwdCommonActivity.access$600(PayPwdCommonActivity.this, str2);
                PayPwdCommonActivity payPwdCommonActivity = PayPwdCommonActivity.this;
                if (!TextUtils.isEmpty(str2)) {
                    i = str2.length();
                }
                payPwdCommonActivity.writePWDSwitchBehavorLog("1", String.valueOf(i));
            }
        });
        this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                String access$700 = PayPwdCommonActivity.access$700();
                VerifyLogCat.i(access$700, "safeInputContext onFocusChange: " + z);
                if (!z) {
                    return;
                }
                PayPwdCommonActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(PayPwdCommonActivity.access$700(), "safeInputContext onClick");
                PayPwdCommonActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
        this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randombefore);
        String localeStringResource = getLocaleStringResource(R.string.sg_please_input_user_pwd);
        if (!TextUtils.isEmpty(getIntent().getExtras().getString(PayPwdModule.FORM_TIP_PLACEHOLDER))) {
            localeStringResource = getIntent().getExtras().getString(PayPwdModule.FORM_TIP_PLACEHOLDER);
        }
        this.mSafeInputContext.setEditTextHint(localeStringResource);
        if (!TextUtils.isEmpty(getIntent().getExtras().getString(PayPwdModule.FORM_BTN))) {
            this.mSafeInputContext.setOkButtonText(getIntent().getExtras().getString(PayPwdModule.FORM_BTN));
        } else {
            this.mSafeInputContext.setOkButtonText(getLocaleStringResource(R.string.sg_pwd_page_confirm));
        }
        EditText editText = this.mSafeInputContext.getEditText();
        if (Build.VERSION.SDK_INT > 10) {
            try {
                Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, false);
            } catch (Exception e) {
                VerifyLogCat.w(f5910a, "setSafeKeyboardPwdInput", e);
            }
            try {
                Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
                method2.setAccessible(true);
                method2.invoke(editText, false);
            } catch (Exception e2) {
                VerifyLogCat.w(f5910a, "setSafeKeyboardPwdInput", e2);
            }
        }
        this.mPwdInputLayout.addView(this.mSafeInputContext.getContentView());
        this.mPwdInputLayout.setVisibility(0);
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

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onResume() {
        AbsPayPwdActivity.VerifyResultListener verifyResultListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.needSubmitOnPwdChanged.get()) {
            VerifyLogCat.i(f5910a, "回到密码页面，经判断需要提交");
            if (this.mIsLogicInterrupted) {
                showProgressDialog(this.verifyingTip);
                verifyResultListener = new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
                    public void onResult(MICRpcResponse mICRpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                            return;
                        }
                        PayPwdCommonActivity.this.dismissProgressDialog();
                        VerifyLogCat.i(PayPwdCommonActivity.access$700(), "补密后rpc返回");
                        if (mICRpcResponse == null) {
                            VerifyLogCat.d(PayPwdCommonActivity.access$700(), "网络异常");
                            PayPwdCommonActivity payPwdCommonActivity = PayPwdCommonActivity.this;
                            payPwdCommonActivity.toast(payPwdCommonActivity.getString(R.string.vi_network_unavailable), 0);
                            PayPwdCommonActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_NET_ERR);
                            PayPwdCommonActivity.this.notifyCancel();
                        } else if (!mICRpcResponse.verifySuccess) {
                            PayPwdCommonActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_FAIL);
                            PayPwdCommonActivity.this.processError();
                        } else {
                            PayPwdCommonActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_SUC);
                            PayPwdCommonActivity payPwdCommonActivity2 = PayPwdCommonActivity.this;
                            payPwdCommonActivity2.toast(payPwdCommonActivity2.passTip, 0);
                            new Handler().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.8.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        PayPwdCommonActivity.this.doNextStep();
                                    }
                                }
                            }, 600L);
                        }
                    }
                };
            } else {
                hideKeyboard();
                showProgress(0);
                verifyResultListener = new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
                    public void onResult(MICRpcResponse mICRpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                            return;
                        }
                        VerifyLogCat.i(PayPwdCommonActivity.access$700(), "找密后rpc返回");
                        if (mICRpcResponse == null) {
                            VerifyLogCat.d(PayPwdCommonActivity.access$700(), "网络异常");
                            PayPwdCommonActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_NET_ERR);
                            PayPwdCommonActivity.this.onNetError();
                        } else if (mICRpcResponse.verifySuccess) {
                            PayPwdCommonActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_SUC);
                            PayPwdCommonActivity.this.startAnimationDone();
                        } else {
                            PayPwdCommonActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_FAIL);
                            PayPwdCommonActivity.this.processError();
                        }
                    }
                };
            }
            verify("", verifyResultListener);
        } else if (this.mIsLogicInterrupted && this.isMultiModeActionTriggered) {
            VerifyLogCat.i(f5910a, "从补密页回来，取消处理");
            notifyCancel();
        } else {
            VerifyLogCat.i(f5910a, "本次onResume不处理");
        }
    }

    public void initSubtitle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a186c6e5", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mSubtitle = (APTextView) findViewById(R.id.paypwd_subtitle);
        String string = getIntent().getExtras().getString("subtitle");
        if (z && TextUtils.isEmpty(string)) {
            string = getLocaleStringResource(R.string.sg_please_input_user_pwd);
        }
        if (!TextUtils.isEmpty(string)) {
            this.mSubtitle.setText(string);
            this.mSubtitle.setVisibility(0);
            return;
        }
        findViewById(R.id.blank_margin_bottom).setVisibility(4);
    }

    public void showKeyBoardDelay(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beef887e", new Object[]{this, new Long(j)});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PayPwdCommonActivity.this.showKeyboard();
                    }
                }
            }, j);
        }
    }

    public void showKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9488b", new Object[]{this});
            return;
        }
        String str = f5910a;
        VerifyLogCat.d(str, "showKeyboard isSimplePwd: " + this.isSimplePwd);
        try {
            if (this.isSimplePwd) {
                this.mSafeInputContext.getEditText().requestFocus();
                this.mAlipayKeyboard.showKeyboard(AliKeyboardType.num, this.mSafeInputContext.getEditText(), 0L);
                return;
            }
            this.mSafeInputContext.getEditText().requestFocus();
            this.mAlipayKeyboard.showKeyboard(AliKeyboardType.abc, this.mSafeInputContext.getEditText(), 0L);
        } catch (Throwable th) {
            VerifyLogCat.e(f5910a, th);
        }
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5910a, "hideKeyboard()");
        this.mAlipayKeyboard.hideKeyboard();
    }

    public void clearInputContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0002c3", new Object[]{this});
        } else {
            this.mSafeInputContext.clearText();
        }
    }

    public void onPwdError(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a14cd", new Object[]{this, mICRpcResponse});
        } else {
            alert((String) null, mICRpcResponse.verifyMessage, !this.isShowGetBackPwd ? null : getLocaleStringResource(R.string.sg_pwd_forget), !this.isShowGetBackPwd ? null : new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PayPwdCommonActivity.this.goGetBackPPW();
                    PayPwdCommonActivity.this.writePWDErrorBehavorLog("RETRY", "0");
                }
            }, getLocaleStringResource(R.string.sg_pwd_input_again), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PayPwdCommonActivity.this.showProgress(8);
                    PayPwdCommonActivity.this.showKeyboard();
                    PayPwdCommonActivity.this.writePWDErrorBehavorLog("RETRY", "1");
                }
            }, (Boolean) false);
        }
    }

    public void onNetError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1d94f1", new Object[]{this});
        } else if (this.mModule.getTask().getPluginOrProxyMode()) {
            if (this.isSimplePwd) {
                clearInputContent();
            }
            showProgress(8);
            showKeyboard();
        } else {
            alert((String) null, getLocaleStringResource(R.string.network_unavailable), getLocaleStringResource(R.string.retry), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    if (PayPwdCommonActivity.this.isSimplePwd) {
                        PayPwdCommonActivity.this.clearInputContent();
                    }
                    PayPwdCommonActivity.this.showProgress(8);
                    PayPwdCommonActivity.this.showKeyboard();
                }
            }, getLocaleStringResource(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        PayPwdCommonActivity.this.notifyCancel();
                    }
                }
            }, (Boolean) false);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            AlipayKeyboard alipayKeyboard = this.mAlipayKeyboard;
            if (alipayKeyboard != null && alipayKeyboard.isShowKeyboard()) {
                hideKeyboard();
                VerifyLogCat.d(f5910a, "msp keyboard is showing");
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static /* synthetic */ void access$600(PayPwdCommonActivity payPwdCommonActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42967cee", new Object[]{payPwdCommonActivity, str});
            return;
        }
        VerifyLogCat.i(f5910a, "safeInputContext onUserConfirm");
        payPwdCommonActivity.hideKeyboard();
        payPwdCommonActivity.showProgress(0);
        payPwdCommonActivity.verify(str, new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.PayPwdCommonActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
            public void onResult(MICRpcResponse mICRpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                } else if (mICRpcResponse == null) {
                    VerifyLogCat.d(PayPwdCommonActivity.access$700(), "input pwd null result");
                    PayPwdCommonActivity.this.onNetError();
                } else if (mICRpcResponse.verifySuccess) {
                    PayPwdCommonActivity.this.startAnimationDone();
                    PayPwdCommonActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "SUCCESS", "wallet_macao");
                } else {
                    PayPwdCommonActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "FAIL", "wallet_macao");
                    PayPwdCommonActivity.this.clearInputContent();
                    PayPwdCommonActivity.access$800(PayPwdCommonActivity.this, PubKeyHelper.updateLocalPubKey(PayPwdCommonActivity.this, mICRpcResponse));
                    String moduleName = PayPwdCommonActivity.access$900(PayPwdCommonActivity.this).getModuleName();
                    if (ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS.equalsIgnoreCase(PayPwdCommonActivity.this.sourceToPwd)) {
                        moduleName = ModuleConstants.VI_MODULE_NAME_PAYMENT_PASSWORD_PLUS;
                    }
                    if (mICRpcResponse.finish || TextUtils.isEmpty(mICRpcResponse.nextStep) || !mICRpcResponse.nextStep.equals(moduleName)) {
                        PayPwdCommonActivity.this.processError();
                        return;
                    }
                    VerifyLogCat.d(PayPwdCommonActivity.access$700(), "input pwd retry");
                    PayPwdCommonActivity.this.onPwdError(mICRpcResponse);
                }
            }
        });
    }

    public static /* synthetic */ void access$800(PayPwdCommonActivity payPwdCommonActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eaed0ac", new Object[]{payPwdCommonActivity, str});
            return;
        }
        String str2 = f5910a;
        VerifyLogCat.i(str2, "updatePubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i(f5910a, "服务端没有提供新的公钥，不更新");
            return;
        }
        payPwdCommonActivity.generatePubKey(str);
        payPwdCommonActivity.mSafeInputContext.setRsaPublicKey(payPwdCommonActivity.mPubKey);
    }
}
