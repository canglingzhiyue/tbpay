package com.ali.user.mobile.register.ui.oversea;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.EmailLoginPresenter;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.ui.WebConstant;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.WebViewActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliEmailCodeFragment extends AliUserRegisterSMSVerificationFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mChangeEmailView;
    public String mEmail;
    public EmailLoginPresenter mEmailLoginPresenter;
    public TextView mEmailView;
    public TextView mMainTitleView;

    static {
        kge.a(1757406502);
    }

    public static /* synthetic */ Object ipc$super(AliEmailCodeFragment aliEmailCodeFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case 143326311:
                return new Boolean(super.onBackPressed());
            case 1385199677:
                super.initParams();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstans.PageName.UT_PAGE_EMAIL_CODE;
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public String getRegType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this}) : "emailLogin";
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        super.initParams();
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        try {
            this.mEmail = arguments.getString("email");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mEmailLoginPresenter = new EmailLoginPresenter(this, null);
        this.mEmailView = (TextView) view.findViewById(R.id.aliuser_register_sms_code_Third_title_tv);
        this.mChangeEmailView = (TextView) view.findViewById(R.id.aliuser_register_sms_code_Fourth_title_tv);
        this.mMainTitleView = (TextView) view.findViewById(R.id.aliuser_register_title_tv);
        super.initViews(view);
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public void setSecondTV(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe60a25", new Object[]{this, textView});
        } else if (LanguageUtil.isChineseLanguage()) {
            int i = R.string.aliuser_email_code_secondary_title;
            String string = getString(i, " " + this.mEmail);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#111111")), 7, string.length() - 15, 33);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailCodeFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == -1038128277) {
                            super.updateDrawState((TextPaint) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            AliEmailCodeFragment.this.getActivity().finish();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                            return;
                        }
                        super.updateDrawState(textPaint);
                        textPaint.setColor(Color.parseColor("#ff5000"));
                        textPaint.setUnderlineText(false);
                    }
                }, this.mEmail.length() + 16, string.length(), 33);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            this.mMainTitleView.setText(getString(R.string.aliuser_email_code_title));
            textView.setText(getString(R.string.aliuser_email_code_secondary_title));
            this.mEmailView.setText(this.mEmail);
            this.mChangeEmailView.setText(getString(R.string.aliuser_email_code_secondary_subtitle));
            this.mChangeEmailView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailCodeFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        AliEmailCodeFragment.this.getActivity().finish();
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_register_send_smscode_btn) {
            this.isVoice = false;
            sendEmailCodeAction();
            this.mSendSMSCodeBtn.setBackgroundDrawable(null);
        } else {
            super.onClick(view);
        }
    }

    public void sendEmailCodeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9762cf9e", new Object[]{this});
            return;
        }
        if (this.mSmsCodeView != null) {
            this.mSmsCodeView.clearText();
        }
        if (this.mVoiceTV != null) {
            this.mVoiceTV.setVisibility(8);
        }
        this.mEmailLoginPresenter.buildLoginParam(this.mEmail, "", this.isVoice);
        this.mEmailLoginPresenter.getLoginParam().emailSid = this.mSessionId;
        this.mEmailLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
        this.mEmailLoginPresenter.sendEmailCode(getActivity(), this.mEmailLoginPresenter.getLoginParam(), getUICallback());
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public void submitRegisterForm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76722346", new Object[]{this});
            return;
        }
        LoginComponent.getProperties().setProperty("type", getRegType());
        this.mEmailLoginPresenter.buildLoginParam(this.mEmail, "", this.isVoice);
        this.mEmailLoginPresenter.getLoginParam().nativeLoginType = LoginType.ServerLoginType.EmailLogin.getType();
        this.mEmailLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId("emailLogin", getPageName());
        this.mEmailLoginPresenter.getLoginParam().ext.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
        this.mEmailLoginPresenter.getLoginParam().emailSid = this.mSessionId;
        this.mEmailLoginPresenter.getLoginParam().emailCode = this.mSmsCodeView.getText();
        this.mEmailLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
        this.mEmailLoginPresenter.login(this.mAttachedActivity, this.mEmailLoginPresenter.getLoginParam(), getUICallback());
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public void onSendEmailSuccess(SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cb9a57", new Object[]{this, smsApplyResult});
        } else if (smsApplyResult == null) {
        } else {
            this.mSessionId = smsApplyResult.emailSid;
            if (!isActive() || this.mSendSMSCodeBtn == null) {
                return;
            }
            this.mSendSMSCodeBtn.startCountDown(60000L, 1000L);
            if ("voice".equals(smsApplyResult.sendType)) {
                this.mVideoUrl = null;
            } else if (smsApplyResult == null || TextUtils.isEmpty(smsApplyResult.helpVideoUrl)) {
            } else {
                this.mVideoUrl = smsApplyResult.helpVideoUrl;
            }
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public void openHelp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652b6bb2", new Object[]{this});
        } else if (TextUtils.isEmpty(this.mVideoUrl)) {
            addControl("Button-Help");
            if (!isActivityAvaiable()) {
                return;
            }
            addControl("help");
            String helpUrlOversea = LoginConstant.getHelpUrlOversea();
            Intent intent = new Intent(this.mAttachedActivity, WebViewActivity.class);
            intent.putExtra(WebConstant.WEBURL, helpUrlOversea);
            startActivity(intent);
        } else {
            addControl("Button-Help-Video");
            NavigatorManager.getInstance().navToTransparentWeb(getActivity(), this.mVideoUrl);
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment
    public void backClickedYes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("576a1a8e", new Object[]{this});
        } else {
            getActivity().finish();
        }
    }

    @Override // com.ali.user.mobile.register.ui.AliUserRegisterSMSVerificationFragment, com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue() : super.onBackPressed();
    }
}
