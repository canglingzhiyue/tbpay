package com.alipay.mobile.verifyidentity.module.password.pay.ui;

import android.content.DialogInterface;
import android.content.res.Configuration;
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
import com.alipay.mobile.verifyidentity.data.VerifyIdentityTask;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.PubKeyHelper;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.PwdInputAdapter;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.safepaybase.EncryptRandomType;
import com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener;
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
    private static final String f5931a = "PayPwdCommonActivity";
    public APLinearLayout mAPLinearLayout;
    public AlipayKeyboard mAlipayKeyboard;
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
    public String mUser;
    public int mViewHeight;
    public APScrollView mWrapper;
    public int processBarMarginTop = 0;
    public boolean needPwd_forget = false;
    public boolean isShowGetBackPwd = false;

    public static /* synthetic */ Object ipc$super(PayPwdCommonActivity payPwdCommonActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -884160602) {
            return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
        } else {
            if (hashCode != -349229044) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onConfigurationChanged((Configuration) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ MicroModule access$000(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("c3e622d8", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$100(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("c5f981d9", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1100(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("9a81ef48", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1200(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("9c954e49", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModuleContext access$200(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModuleContext) ipChange.ipc$dispatch("b45defe3", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mMicroModuleContext;
    }

    public static /* synthetic */ MicroModule access$300(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ca203fdb", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$400(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("cc339edc", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$500(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("ce46fddd", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$600(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("d05a5cde", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$700(PayPwdCommonActivity payPwdCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("d26dbbdf", new Object[]{payPwdCommonActivity}) : payPwdCommonActivity.mModule;
    }

    public static /* synthetic */ String access$900() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4c30efe0", new Object[0]) : f5931a;
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
        VerifyLogCat.d(f5931a, "animation done");
        this.mCustomProgressWheel.setVisibility(8);
        this.mTick.setImageDrawable(null);
        this.mTick.setBackgroundResource(R.drawable.pwd_success_blue_notice);
        this.mTick.setVisibility(0);
        try {
            this.mLoading = (AnimationDrawable) this.mTick.getBackground();
            this.mLoading.start();
        } catch (Throwable th) {
            VerifyLogCat.w(f5931a, "FAIL to start success animation!", th);
        }
        this.mProgressText.setVisibility(0);
        String string = getIntent().getExtras().getString("pwd_PASS");
        if (!TextUtils.isEmpty(string)) {
            this.mProgressText.setText(string);
        } else {
            this.mProgressText.setText(getResources().getString(R.string.pwd_verify_success));
        }
        new Handler().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.1
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

    public void initGoOther() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73318c5f", new Object[]{this});
            return;
        }
        this.mOther = (APTextView) findViewById(R.id.paypwd_other);
        this.isShowGetBackPwd = getIntent().getExtras().getBoolean("isFindPPW");
        final boolean z = getIntent().getExtras().getBoolean(PayPwdModule.HAS_FORGOT_PWD);
        if (getIntent().getExtras().getBoolean("hasOthers")) {
            this.mOther.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    PayPwdCommonActivity.this.hideKeyboard();
                    if (!z) {
                        PayPwdCommonActivity.this.mOther.postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                VIUtils.goOtherVerifyProduct(PayPwdCommonActivity.access$200(PayPwdCommonActivity.this), PayPwdCommonActivity.this, PayPwdCommonActivity.access$300(PayPwdCommonActivity.this));
                                HashMap hashMap = new HashMap();
                                hashMap.put("module", PayPwdCommonActivity.this.getLogicModuleName());
                                hashMap.put("plusPwdType", "plus_pwd");
                                VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-180927-01", Constants.VI_ENGINE_APPID, "zthlio", PayPwdCommonActivity.access$400(PayPwdCommonActivity.this).getToken(), PayPwdCommonActivity.access$500(PayPwdCommonActivity.this).getVerifyId(), null, hashMap);
                            }
                        }, 300L);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("module", PayPwdCommonActivity.this.getLogicModuleName());
                    hashMap.put("event", "find_password");
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160201-01", Constants.VI_ENGINE_APPID, "hswjmm", PayPwdCommonActivity.access$000(PayPwdCommonActivity.this).getToken(), PayPwdCommonActivity.access$100(PayPwdCommonActivity.this).getVerifyId(), null, hashMap);
                    PayPwdCommonActivity.this.goGetBackPPW();
                }
            });
            if (!z) {
                String string = getIntent().getExtras().getString("pwd_other");
                if (!TextUtils.isEmpty(string)) {
                    this.mOther.setText(string);
                }
            } else {
                this.mOther.setText(R.string.pwd_forget_in_layout);
            }
            this.mOther.setVisibility(0);
            VerifyLogCat.i(f5931a, "显示选择其它方式入口");
        } else if (!this.isShowGetBackPwd) {
        } else {
            String string2 = getIntent().getExtras().getString("pwd_action");
            if (!TextUtils.isEmpty(string2)) {
                this.mOther.setText(string2);
            } else {
                this.mOther.setText(R.string.pwd_forget_in_layout);
            }
            this.mOther.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.3
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
                    VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, "UC-MobileIC-160201-01", Constants.VI_ENGINE_APPID, "hswjmm", PayPwdCommonActivity.access$600(PayPwdCommonActivity.this).getToken(), PayPwdCommonActivity.access$700(PayPwdCommonActivity.this).getVerifyId(), null, hashMap);
                    PayPwdCommonActivity.this.goGetBackPPW();
                }
            });
            this.mOther.setVisibility(0);
            VerifyLogCat.i(f5931a, "在不显示其它方式入口的情况下，根据需要，显示忘记密码入口");
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
            string = "";
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
        String str = f5931a;
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
        VerifyLogCat.d(f5931a, "initKeyBoard and new AlipayKeyboard");
        this.mAlipayKeyboard = new AlipayKeyboard(this);
        this.mAlipayKeyboard.initializeKeyboard(null);
        viewGroup.addView(this.mAlipayKeyboard, new LinearLayout.LayoutParams(-1, -2));
        viewGroup.setVisibility(0);
    }

    public void initPwdInput() {
        String str = f5931a;
        VerifyLogCat.i(str, "initSixPwd: " + this.isSimplePwd);
        this.mPwdInputLayout = (APLinearLayout) findViewById(R.id.paypwd_sixpwd_layout);
        this.mSafeInputContext = new PwdInputAdapter().getVISafeInput(this, this.isSimplePwd, a());
        this.mSafeInputContext.setOnConfirmListener(new OnConfirmListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.safepaybase.OnConfirmListener
            public void onUserConfirm(String str2) {
                IpChange ipChange = $ipChange;
                int i = 0;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d51cf727", new Object[]{this, str2});
                    return;
                }
                PayPwdCommonActivity.access$800(PayPwdCommonActivity.this, str2);
                PayPwdCommonActivity payPwdCommonActivity = PayPwdCommonActivity.this;
                if (!TextUtils.isEmpty(str2)) {
                    i = str2.length();
                }
                payPwdCommonActivity.writePWDSwitchBehavorLog("1", String.valueOf(i));
            }
        });
        this.mSafeInputContext.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
                    return;
                }
                String access$900 = PayPwdCommonActivity.access$900();
                VerifyLogCat.i(access$900, "safeInputContext onFocusChange: " + z);
                if (!z) {
                    return;
                }
                PayPwdCommonActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                VerifyLogCat.i(PayPwdCommonActivity.access$900(), "safeInputContext onClick");
                PayPwdCommonActivity.this.showKeyboard();
            }
        });
        this.mSafeInputContext.setRsaPublicKey(this.mPubKey);
        this.mSafeInputContext.setEncryptRandomStringAndType(this.mTimestamp, EncryptRandomType.randomafter);
        EditText editText = this.mSafeInputContext.getEditText();
        if (Build.VERSION.SDK_INT > 10) {
            try {
                Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, false);
            } catch (Exception e) {
                VerifyLogCat.w(f5931a, "setSafeKeyboardPwdInput", e);
            }
            try {
                Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
                method2.setAccessible(true);
                method2.invoke(editText, false);
            } catch (Exception e2) {
                VerifyLogCat.w(f5931a, "setSafeKeyboardPwdInput", e2);
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
            VerifyLogCat.i(f5931a, "回到密码页面，经判断需要提交");
            if (this.mIsLogicInterrupted) {
                showProgressDialog(this.verifyingTip);
                verifyResultListener = new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
                    public void onResult(MICRpcResponse mICRpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                            return;
                        }
                        PayPwdCommonActivity.this.dismissProgressDialog();
                        VerifyLogCat.i(PayPwdCommonActivity.access$900(), "补密后rpc返回");
                        if (mICRpcResponse == null) {
                            VerifyLogCat.d(PayPwdCommonActivity.access$900(), "网络异常");
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
                            new Handler().postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.8.1
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
                verifyResultListener = new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
                    public void onResult(MICRpcResponse mICRpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                            return;
                        }
                        VerifyLogCat.i(PayPwdCommonActivity.access$900(), "找密后rpc返回");
                        if (mICRpcResponse == null) {
                            VerifyLogCat.d(PayPwdCommonActivity.access$900(), "网络异常");
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
            VerifyLogCat.i(f5931a, "从补密页回来，取消处理");
            notifyCancel();
        } else {
            VerifyLogCat.i(f5931a, "本次onResume不处理");
        }
    }

    public void initSubtitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684ea5cf", new Object[]{this});
            return;
        }
        this.mSubtitle = (APTextView) findViewById(R.id.paypwd_subtitle);
        String string = (getIntent() == null || getIntent().getExtras() == null) ? "" : getIntent().getExtras().getString("subtitle");
        if (!TextUtils.isEmpty(string)) {
            this.mSubtitle.setText(string);
            this.mSubtitle.setVisibility(0);
            return;
        }
        findViewById(R.id.blank_margin_bottom).setVisibility(4);
        try {
            View findViewById = findViewById(R.id.title_blank_area);
            if (findViewById == null) {
                return;
            }
            findViewById.setVisibility(4);
        } catch (Throwable unused) {
            VerifyLogCat.i(f5931a, "subTitleBlank show error");
        }
    }

    public void showKeyBoardDelay(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beef887e", new Object[]{this, new Long(j)});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.10
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
        String str = f5931a;
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
            VerifyLogCat.e(f5931a, th);
        }
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5931a, "hideKeyboard()");
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPwdError(com.alipay.mobileic.core.model.rpc.MICRpcResponse r14) {
        /*
            r13 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r13
            r1[r2] = r14
            java.lang.String r14 = "1b0a14cd"
            r0.ipc$dispatch(r14, r1)
            return
        L15:
            android.content.Intent r0 = r13.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            java.lang.String r1 = "switchOther"
            java.lang.String r0 = r0.getString(r1)
            android.content.Intent r1 = r13.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            java.lang.String r4 = "hasOthers"
            boolean r1 = r1.getBoolean(r4)
            r4 = 0
            if (r1 != 0) goto L49
            boolean r0 = r13.isShowGetBackPwd
            if (r0 == 0) goto L47
            r13.needPwd_forget = r2
            android.content.res.Resources r0 = r13.getResources()
            int r1 = com.taobao.taobao.R.string.pwd_forget
            java.lang.String r0 = r0.getString(r1)
            goto L59
        L47:
            r8 = r4
            goto L5a
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L59
            android.content.res.Resources r0 = r13.getResources()
            int r1 = com.taobao.taobao.R.string.pwd_other_way
            java.lang.String r0 = r0.getString(r1)
        L59:
            r8 = r0
        L5a:
            r6 = 0
            java.lang.String r7 = r14.verifyMessage
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            if (r14 == 0) goto L64
            goto L69
        L64:
            com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity$11 r4 = new com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity$11
            r4.<init>()
        L69:
            r9 = r4
            android.content.res.Resources r14 = r13.getResources()
            int r0 = com.taobao.taobao.R.string.pwd_input_again
            java.lang.String r10 = r14.getString(r0)
            com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity$12 r11 = new com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity$12
            r11.<init>()
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            r5 = r13
            r5.alert(r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.onPwdError(com.alipay.mobileic.core.model.rpc.MICRpcResponse):void");
    }

    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity
    public void logBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7fec42", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable unused) {
                return;
            }
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
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
            alert((String) null, getResources().getString(R.string.network_unavailable), getResources().getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.13
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
            }, getResources().getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.14
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

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        updateAlertLayout();
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
                VerifyLogCat.d(f5931a, "msp keyboard is showing");
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static /* synthetic */ void access$800(PayPwdCommonActivity payPwdCommonActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e46c68", new Object[]{payPwdCommonActivity, str});
            return;
        }
        VerifyLogCat.i(f5931a, "safeInputContext onUserInputConfirm");
        payPwdCommonActivity.hideKeyboard();
        payPwdCommonActivity.showProgress(0);
        payPwdCommonActivity.verify(str, new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayPwdCommonActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
            public void onResult(MICRpcResponse mICRpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                } else if (mICRpcResponse == null) {
                    VerifyLogCat.d(PayPwdCommonActivity.access$900(), "input pwd null result");
                    PayPwdCommonActivity.this.onNetError();
                } else if (mICRpcResponse.verifySuccess) {
                    PayPwdCommonActivity.this.startAnimationDone();
                    PayPwdCommonActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "SUCCESS", "wallet_cn");
                } else {
                    PayPwdCommonActivity.this.writePwdBehavorLog("UC-MobileIC-20190606-5", "FAIL", "wallet_cn");
                    PayPwdCommonActivity.this.clearInputContent();
                    PayPwdCommonActivity.access$1000(PayPwdCommonActivity.this, PubKeyHelper.updateLocalPubKey(PayPwdCommonActivity.this, mICRpcResponse));
                    if (!"RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                        PayPwdCommonActivity.this.processError();
                        return;
                    }
                    VerifyLogCat.d(PayPwdCommonActivity.access$900(), "input pwd retry");
                    PayPwdCommonActivity.this.onPwdError(mICRpcResponse);
                }
            }
        });
    }

    public static /* synthetic */ void access$1000(PayPwdCommonActivity payPwdCommonActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8c6b8f", new Object[]{payPwdCommonActivity, str});
            return;
        }
        String str2 = f5931a;
        VerifyLogCat.i(str2, "updatePubKey: " + str);
        if (TextUtils.isEmpty(str)) {
            VerifyLogCat.i(f5931a, "服务端没有提供新的公钥，不更新");
            return;
        }
        payPwdCommonActivity.generatePubKey(str);
        payPwdCommonActivity.mSafeInputContext.setRsaPublicKey(payPwdCommonActivity.mPubKey);
    }
}
