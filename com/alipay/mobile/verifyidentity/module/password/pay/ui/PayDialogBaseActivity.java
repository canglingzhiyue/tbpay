package com.alipay.mobile.verifyidentity.module.password.pay.ui;

import android.content.DialogInterface;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaybase.alikeyboard.AliKeyboardType;
import com.alipay.android.app.safepaybase.alikeyboard.AlipayKeyboard;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.VISafeInputInterface;
import com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity;
import com.alipay.mobile.verifyidentity.ui.APLinearLayout;
import com.alipay.mobile.verifyidentity.ui.CustomProgressWheel;
import com.alipay.mobile.verifyidentity.ui.VIPayProgressDialog;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class PayDialogBaseActivity extends AbsPayPwdActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5930a = "PayDialogBaseActivity";
    public ImageView closeImg;
    public TextView content_biz_desc;
    public TextView content_desc;
    public TextView content_title;
    public VIPayProgressDialog dialog;
    public String findPwdTxt;
    public TextView goBackPwd;
    public String goOtherVerifyProduct;
    public String hind_other;
    public boolean isIntellDecison;
    public AlipayKeyboard mAlipayKeyboard;
    public RelativeLayout mDialogLayout;
    public TextView mPayingTip;
    public LinearLayout mProgressLayout;
    public CustomProgressWheel mProgressWheel;
    public APLinearLayout mPwdInputLayout;
    public VISafeInputInterface mSafeInputContext;
    public String otherProductForDialog;
    public String otherText;
    public TextView other_txt;
    public String showFindPwd;
    public String top_to_product;
    public boolean useDialogPwd;

    public static /* synthetic */ Object ipc$super(PayDialogBaseActivity payDialogBaseActivity, String str, Object... objArr) {
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

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5930a;
    }

    public void setSafeKeyboardPwdInput(EditText editText) {
        if (Build.VERSION.SDK_INT > 10) {
            try {
                Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(editText, false);
            } catch (Exception e) {
                VerifyLogCat.w(f5930a, "setSafeKeyboardPwdInput", e);
            }
            try {
                Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", Boolean.TYPE);
                method2.setAccessible(true);
                method2.invoke(editText, false);
            } catch (Exception e2) {
                VerifyLogCat.w(f5930a, "setSafeKeyboardPwdInput", e2);
            }
        }
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
            VerifyLogCat.i(f5930a, "回到密码页面，经判断需要提交");
            if (this.mIsLogicInterrupted) {
                showProgressDialog(this.verifyingTip);
                verifyResultListener = new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayDialogBaseActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
                    public void onResult(MICRpcResponse mICRpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                            return;
                        }
                        PayDialogBaseActivity.this.dismissProgressDialog();
                        VerifyLogCat.i(PayDialogBaseActivity.access$000(), "补密后rpc返回");
                        if (mICRpcResponse == null) {
                            VerifyLogCat.d(PayDialogBaseActivity.access$000(), "网络异常");
                            PayDialogBaseActivity payDialogBaseActivity = PayDialogBaseActivity.this;
                            payDialogBaseActivity.toast(payDialogBaseActivity.getString(R.string.vi_network_unavailable), 0);
                            PayDialogBaseActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_NET_ERR);
                            PayDialogBaseActivity.this.notifyCancel();
                        } else if (!mICRpcResponse.verifySuccess) {
                            PayDialogBaseActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_FAIL);
                            PayDialogBaseActivity.this.processError();
                        } else {
                            PayDialogBaseActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_SUC);
                            PayDialogBaseActivity payDialogBaseActivity2 = PayDialogBaseActivity.this;
                            payDialogBaseActivity2.toast(payDialogBaseActivity2.passTip, 0);
                            PayDialogBaseActivity.this.doNextStep();
                        }
                    }
                };
            } else {
                hideKeyboard();
                showProgress(0, 8);
                verifyResultListener = new AbsPayPwdActivity.VerifyResultListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayDialogBaseActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.module.password.pay.ui.AbsPayPwdActivity.VerifyResultListener
                    public void onResult(MICRpcResponse mICRpcResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4ce6397b", new Object[]{this, mICRpcResponse});
                            return;
                        }
                        VerifyLogCat.i(PayDialogBaseActivity.access$000(), "找密后rpc返回");
                        if (mICRpcResponse == null) {
                            VerifyLogCat.d(PayDialogBaseActivity.access$000(), "网络异常");
                            PayDialogBaseActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_NET_ERR);
                            PayDialogBaseActivity.this.onNetError(false);
                        } else if (mICRpcResponse.verifySuccess) {
                            PayDialogBaseActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_SUC);
                            PayDialogBaseActivity.this.startAnimationDone();
                        } else {
                            PayDialogBaseActivity.this.autoRpcResLog(AbsPayPwdActivity.LOG_KEY_FAIL);
                            PayDialogBaseActivity.this.processError();
                        }
                    }
                };
            }
            verify("", verifyResultListener);
        } else if (this.mIsLogicInterrupted && this.isMultiModeActionTriggered) {
            VerifyLogCat.i(f5930a, "从补密页回来，取消处理");
            notifyCancel();
        } else {
            VerifyLogCat.i(f5930a, "本次onResume不处理");
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
                VerifyLogCat.d(f5930a, "msp keyboard is showing");
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5930a, "hideKeyboard()");
        this.mAlipayKeyboard.hideKeyboard();
    }

    public void showKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e9488b", new Object[]{this});
            return;
        }
        String str = f5930a;
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
            VerifyLogCat.e(f5930a, th);
        }
    }

    public void initKeyBoard(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16283a9", new Object[]{this, linearLayout});
            return;
        }
        this.mAlipayKeyboard = new AlipayKeyboard(this);
        this.mAlipayKeyboard.initializeKeyboard(null);
        try {
            this.mAlipayKeyboard.setSource(AlipayKeyboard.SourceType.vi);
        } catch (Throwable th) {
            String str = f5930a;
            VerifyLogCat.i(str, "setSource error:" + th.getMessage());
        }
        linearLayout.addView(this.mAlipayKeyboard, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setVisibility(0);
    }

    public void onNetError(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595bc03", new Object[]{this, new Boolean(z)});
        } else if (this.mModule.getTask().getPluginOrProxyMode() || z) {
            if (this.isSimplePwd) {
                clearInputContent();
            }
            this.mDialogLayout.setVisibility(0);
            showProgress(8, 0);
            showKeyboard();
        } else {
            this.mDialogLayout.setVisibility(4);
            alert((String) null, getResources().getString(R.string.network_unavailable), getResources().getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayDialogBaseActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PayDialogBaseActivity.this.mDialogLayout.setVisibility(0);
                    if (PayDialogBaseActivity.this.isSimplePwd) {
                        PayDialogBaseActivity.this.clearInputContent();
                    }
                    PayDialogBaseActivity.this.showProgress(8, 0);
                    PayDialogBaseActivity.this.showKeyboard();
                }
            }, getResources().getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.password.pay.ui.PayDialogBaseActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    PayDialogBaseActivity.this.mDialogLayout.setVisibility(0);
                    PayDialogBaseActivity.this.notifyCancel();
                }
            }, (Boolean) false);
        }
    }

    public void clearInputContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0002c3", new Object[]{this});
        } else {
            this.mSafeInputContext.clearText();
        }
    }

    public void showProgress(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b597b3f1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mProgressLayout.setVisibility(i);
        this.mPayingTip.setVisibility(i);
        this.mProgressWheel.setVisibility(i);
        this.mProgressWheel.setBarColor(-15304705);
        this.mProgressWheel.start();
        this.content_title.setVisibility(i2);
        if (i2 == 0) {
            if (!StringUtils.isEmpty(this.content_desc.getText().toString())) {
                this.content_desc.setVisibility(0);
            } else {
                this.content_desc.setVisibility(8);
            }
            if (!StringUtils.isEmpty(this.content_biz_desc.getText().toString())) {
                this.content_biz_desc.setVisibility(0);
            } else {
                this.content_biz_desc.setVisibility(8);
            }
            if (!StringUtils.isEmpty(this.other_txt.getText().toString())) {
                this.other_txt.setVisibility(0);
            } else {
                this.other_txt.setVisibility(8);
            }
            if (!StringUtils.isEmpty(this.goBackPwd.getText().toString())) {
                this.goBackPwd.setVisibility(0);
            } else {
                this.goBackPwd.setVisibility(8);
            }
        } else {
            this.content_biz_desc.setVisibility(i2);
            this.content_desc.setVisibility(i2);
            this.other_txt.setVisibility(i2);
            this.goBackPwd.setVisibility(i2);
        }
        this.closeImg.setVisibility(i2);
        this.mPwdInputLayout.setVisibility(i2);
    }

    public void startAnimationDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6195e6b", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5930a, "animation done");
        this.mProgressWheel.setVisibility(8);
        doNextStep();
    }

    public void changeLayout(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7acc1", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mPwdInputLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.content_desc.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.content_title.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.content_biz_desc.getLayoutParams();
        if (z) {
            if (this.isSimplePwd) {
                if (z2) {
                    layoutParams4.topMargin = DensityUtil.dip2px(this, 12.0f);
                    layoutParams2.topMargin = DensityUtil.dip2px(this, 12.0f);
                    layoutParams2.addRule(3, this.content_biz_desc.getId());
                    layoutParams3.topMargin = DensityUtil.dip2px(this, 12.0f);
                    layoutParams.topMargin = DensityUtil.dip2px(this, 12.0f);
                } else {
                    layoutParams2.topMargin = DensityUtil.dip2px(this, 8.0f);
                    layoutParams2.addRule(3, this.content_title.getId());
                    layoutParams3.topMargin = DensityUtil.dip2px(this, 17.0f);
                    layoutParams.topMargin = DensityUtil.dip2px(this, 21.0f);
                    layoutParams4.topMargin = DensityUtil.dip2px(this, 0.0f);
                }
            } else if (z2) {
                layoutParams4.topMargin = DensityUtil.dip2px(this, 12.0f);
                layoutParams2.topMargin = DensityUtil.dip2px(this, 12.0f);
                layoutParams2.addRule(3, this.content_biz_desc.getId());
                layoutParams.topMargin = DensityUtil.dip2px(this, 12.0f);
                layoutParams3.topMargin = DensityUtil.dip2px(this, 12.0f);
            } else {
                layoutParams2.topMargin = DensityUtil.dip2px(this, 8.0f);
                layoutParams2.addRule(3, this.content_title.getId());
                layoutParams.topMargin = DensityUtil.dip2px(this, 17.0f);
                layoutParams3.topMargin = DensityUtil.dip2px(this, 17.0f);
                layoutParams4.topMargin = DensityUtil.dip2px(this, 8.0f);
            }
            layoutParams.addRule(3, this.content_desc.getId());
            this.content_desc.setLayoutParams(layoutParams2);
            this.content_title.setLayoutParams(layoutParams3);
            this.content_biz_desc.setLayoutParams(layoutParams4);
        } else {
            if (this.isSimplePwd) {
                if (z2) {
                    layoutParams3.topMargin = DensityUtil.dip2px(this, 17.0f);
                    layoutParams.addRule(3, this.content_biz_desc.getId());
                    layoutParams.topMargin = DensityUtil.dip2px(this, 16.0f);
                    layoutParams4.topMargin = DensityUtil.dip2px(this, 8.0f);
                } else {
                    layoutParams.addRule(3, this.content_desc.getId());
                    layoutParams3.topMargin = DensityUtil.dip2px(this, 31.0f);
                    layoutParams.topMargin = DensityUtil.dip2px(this, 37.0f);
                }
            } else if (z2) {
                layoutParams.addRule(3, this.content_biz_desc.getId());
                layoutParams3.topMargin = DensityUtil.dip2px(this, 17.0f);
                layoutParams.topMargin = DensityUtil.dip2px(this, 16.0f);
                layoutParams4.topMargin = DensityUtil.dip2px(this, 8.0f);
            } else {
                layoutParams.addRule(3, this.content_desc.getId());
                layoutParams3.topMargin = DensityUtil.dip2px(this, 31.0f);
                layoutParams.topMargin = DensityUtil.dip2px(this, 37.0f);
            }
            this.content_biz_desc.setLayoutParams(layoutParams4);
            this.content_title.setLayoutParams(layoutParams3);
        }
        this.mPwdInputLayout.setLayoutParams(layoutParams);
    }

    public String getOtherPayConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28030f29", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.goOtherVerifyProduct)) {
            this.goOtherVerifyProduct = "N";
        }
        return this.goOtherVerifyProduct;
    }

    public String getOtherPayContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a421102e", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.otherText)) {
            return getResources().getString(R.string.other_way_to_pwd);
        }
        return this.otherText;
    }

    public boolean getOtherVerifyPayFlag(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4487a", new Object[]{this, mICRpcResponse})).booleanValue();
        }
        if (mICRpcResponse == null || StringUtils.isEmpty(mICRpcResponse.data)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = f5930a;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("otherVerifyPaySwitch");
        String str2 = f5930a;
        VerifyLogCat.i(str2, "otherVerifyPaySwitch: " + string);
        return "Y".equalsIgnoreCase(string);
    }

    public boolean showFindPwdByResponse(MICRpcResponse mICRpcResponse, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cba25bdf", new Object[]{this, mICRpcResponse, hashMap})).booleanValue();
        }
        if (mICRpcResponse == null || StringUtils.isEmpty(mICRpcResponse.data)) {
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = f5930a;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString(PayPwdModule.SHOW_FIND_PWD);
        if (hashMap != null) {
            hashMap.put(PayPwdModule.FIND_PWD_TXT, jSONObject.getString(PayPwdModule.FIND_PWD_TXT));
        }
        String str2 = f5930a;
        VerifyLogCat.i(str2, "showFindPwd: " + string);
        return StringUtils.isEmpty(string) || "Y".equalsIgnoreCase(string);
    }

    public String getOtherVerifyPayText(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97df53ab", new Object[]{this, mICRpcResponse});
        }
        if (mICRpcResponse == null || StringUtils.isEmpty(mICRpcResponse.data)) {
            return getOtherPayContent();
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(mICRpcResponse.data);
        } catch (JSONException e) {
            String str = f5930a;
            VerifyLogCat.e(str, "json fail " + mICRpcResponse.data, e);
        }
        if (jSONObject == null) {
            return getOtherPayContent();
        }
        this.otherProductForDialog = jSONObject.getString("otherVerifyPayText");
        if (!StringUtils.isEmpty(this.otherProductForDialog)) {
            return this.otherProductForDialog;
        }
        return getOtherPayContent();
    }

    public Animation shakeAnimation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("888049d8", new Object[]{this, new Integer(i)});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 10.0f, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new CycleInterpolator(i));
        translateAnimation.setDuration(500L);
        return translateAnimation;
    }

    public void showViPayProgress(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3750a7e", new Object[]{this, str, new Boolean(z)});
            return;
        }
        dissMissViPayProgress();
        VerifyLogCat.d(f5930a, "showViPayProgress post");
        if (isFinishing()) {
            return;
        }
        this.dialog = new VIPayProgressDialog(this);
        this.dialog.setCancelable(z);
        this.dialog.setMessage(str);
        try {
            this.dialog.show();
        } catch (Throwable th) {
            String str2 = f5930a;
            VerifyLogCat.i(str2, "show viPayProgress error:" + th.getMessage());
        }
    }

    public void dissMissViPayProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763d9b88", new Object[]{this});
            return;
        }
        VIPayProgressDialog vIPayProgressDialog = this.dialog;
        if (vIPayProgressDialog == null || !vIPayProgressDialog.isShowing()) {
            return;
        }
        try {
            this.dialog.dismiss();
        } catch (Throwable unused) {
            VerifyLogCat.i(f5930a, "dissMissViPayProgress error");
        }
    }
}
