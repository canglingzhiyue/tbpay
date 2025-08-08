package com.taobao.login4android.ui;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.BaseHistoryFragment;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.ui.AliUserSmsCodeView;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.CountDownButton;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.activity.auth.QrScan;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoMobileHistoryFragment extends BaseHistoryFragment implements UserMobileLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipayLoginTV;
    public TextView mChangeLogin;
    public String mCurrentAccount;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public View mQrDividerView;
    public TextView mQrLoginTV;
    public CountDownButton mSendSMSCodeBtn;
    public AliUserSmsCodeView mSmsCodeView;
    public String mSource;
    public LoginParam loginParam = null;
    public boolean hasSendSms = false;
    public boolean isAutoSendSms = false;

    static {
        kge.a(-401928361);
        kge.a(-1275964844);
    }

    public static /* synthetic */ Object ipc$super(TaobaoMobileHistoryFragment taobaoMobileHistoryFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -944147094:
                super.onDeleteAccount();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 230173107:
                super.switchToHistoryMode((HistoryAccount) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this}) : "CN";
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstant.PageName.UT_PAGE_SMS_LOGIN3;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05c24e6", new Object[]{this, rpcResponse});
        }
    }

    public static /* synthetic */ void access$000(TaobaoMobileHistoryFragment taobaoMobileHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3944657d", new Object[]{taobaoMobileHistoryFragment, str});
        } else {
            taobaoMobileHistoryFragment.addControl(str);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        initParams();
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.loginParam = null;
        if (arguments != null) {
            try {
                this.mPreviousChecked = arguments.getBoolean("check");
                String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
                if (!StringUtils.isEmpty(str)) {
                    this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                    if (this.loginParam != null) {
                        if (!StringUtils.isEmpty(this.loginParam.smsSid)) {
                            z = true;
                        }
                        this.hasSendSms = z;
                        this.mSource = this.loginParam.source;
                    }
                }
                this.isAutoSendSms = arguments.getBoolean("autoSendSms");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_mobile_history_tb;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.ali.user.mobile.login.ui.BaseHistoryFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void switchToHistoryMode(com.ali.user.mobile.rpc.HistoryAccount r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.ui.TaobaoMobileHistoryFragment.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r1[r3] = r5
            java.lang.String r5 = "db829b3"
            r0.ipc$dispatch(r5, r1)
            return
        L15:
            super.switchToHistoryMode(r5)
            java.lang.String r0 = r5.mobile
            r4.mCurrentSelectedAccount = r0
            java.lang.String r0 = r5.mobile
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            java.lang.String r1 = "-"
            if (r0 != 0) goto L3e
            java.lang.String r0 = r5.mobile
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L3e
            java.lang.String r5 = r5.mobile
            java.lang.String[] r5 = r5.split(r1)
            int r0 = r5.length
            if (r0 <= r3) goto L3e
            r0 = r5[r3]
            r4.mCurrentSelectedAccount = r0
            r5 = r5[r2]
            goto L40
        L3e:
            java.lang.String r5 = ""
        L40:
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r2 = "hiddenOversea"
            boolean r0 = com.taobao.login4android.config.LoginSwitch.isInABTestRegion(r2, r0)
            if (r0 == 0) goto L82
            java.lang.String r0 = r4.mCurrentSelectedAccount     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = com.ali.user.mobile.utils.StringUtil.showSensitiveFieldForMobileLocal(r5, r0)     // Catch: java.lang.Throwable -> L7e
            android.widget.TextView r2 = r4.mTitleView     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L7d
            boolean r2 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L7d
            boolean r2 = android.text.StringUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L66
            android.widget.TextView r5 = r4.mTitleView     // Catch: java.lang.Throwable -> L7e
            r5.setText(r0)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L66:
            android.widget.TextView r2 = r4.mTitleView     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r3.<init>()     // Catch: java.lang.Throwable -> L7e
            r3.append(r5)     // Catch: java.lang.Throwable -> L7e
            r3.append(r1)     // Catch: java.lang.Throwable -> L7e
            r3.append(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L7e
            r2.setText(r5)     // Catch: java.lang.Throwable -> L7e
        L7d:
            return
        L7e:
            r5 = move-exception
            r5.printStackTrace()
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.ui.TaobaoMobileHistoryFragment.switchToHistoryMode(com.ali.user.mobile.rpc.HistoryAccount):void");
    }

    @Override // com.ali.user.mobile.login.ui.BaseHistoryFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.isHistoryMode = true;
        super.initViews(view);
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        TextView textView = this.mAlipayLoginTV;
        if (textView != null) {
            textView.setOnClickListener(this);
            showAlipay();
        }
        this.mQrLoginTV = (TextView) view.findViewById(R.id.aliuser_qrlogin_tv);
        this.mQrDividerView = view.findViewById(R.id.aliuser_qrlogin_divider);
        TextView textView2 = this.mQrLoginTV;
        if (textView2 != null) {
            setOnClickListener(textView2);
            QrScan.showQrScan(this.mUserLoginActivity, this.mQrLoginTV, this.mQrDividerView);
        }
        this.mSmsCodeView = (AliUserSmsCodeView) view.findViewById(R.id.aliuser_login_sms_code_view);
        AliUserSmsCodeView aliUserSmsCodeView = this.mSmsCodeView;
        if (aliUserSmsCodeView != null) {
            aliUserSmsCodeView.setTextCount(4);
        }
        this.mSmsCodeView.setOnCompletedListener(new AliUserSmsCodeView.OnCompletedListener() { // from class: com.taobao.login4android.ui.TaobaoMobileHistoryFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.register.ui.AliUserSmsCodeView.OnCompletedListener
            public void onCompleted(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d93484bd", new Object[]{this, str});
                } else {
                    TaobaoMobileHistoryFragment.this.submitLoginForm();
                }
            }
        });
        this.mSmsCodeView.focus();
        this.mSmsCodeView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.taobao.login4android.ui.TaobaoMobileHistoryFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view2, new Boolean(z)});
                } else if (!z) {
                } else {
                    TaobaoMobileHistoryFragment.access$000(TaobaoMobileHistoryFragment.this, "inputcode_input");
                }
            }
        });
        this.mSendSMSCodeBtn = (CountDownButton) view.findViewById(R.id.aliuser_login_send_smscode_btn);
        this.mSendSMSCodeBtn.setOnClickListener(this);
        this.mSendSMSCodeBtn.setGetCodeTitle(R.string.aliuser_signup_verification_getCode);
        this.mSendSMSCodeBtn.setTickTitleRes(R.string.aliuser_sms_code_success_hint2);
        this.mSendSMSCodeBtn.setNeedBackground(false);
        this.mChangeLogin = (TextView) view.findViewById(R.id.aliuser_change_login);
        if (this.hasSendSms) {
            onSendSMSSuccess(59000L, true, 0);
        } else if (this.isAutoSendSms) {
            onSendSMSAction();
        }
        if (!LoginSwitch.getSwitch(LoginSwitch.OPEN_LOGIN_PAGE_WHEN_IS_LOGIN, "true")) {
            BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_OPEN_ACTION));
        }
        whatApp();
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mSendSMSCodeBtn, this.mChangeLogin);
        }
        handleClickMore();
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipayLoginTV, null);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseHistoryFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_login_send_smscode_btn) {
            addControl("inputcode_again");
            addCheckAction(LoginClickAction.ACTION_SEND_SMS);
        } else if (id == R.id.ali_user_login_alipay_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onDeleteAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b9756a", new Object[]{this});
        } else if (isMultiAccountPageEnable()) {
        } else {
            super.onDeleteAccount();
        }
    }

    public static boolean isMultiAccountPageEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59209d1b", new Object[0])).booleanValue() : LoginSwitch.isInABTestRegion("enable_multi_account_new", 10000);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        } else {
            PrivacyUtil.addMoreMenus(bottomMenuFragment, list, this);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("680b717", new Object[]{this}) : this.mCurrentSelectedAccount;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8f5468", new Object[]{this, new Long(j), new Boolean(z)});
        } else {
            onSendSMSSuccess(j, z, 0);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSOverLimit(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce5f1f9", new Object[]{this, rpcResponse});
        } else if (!isActive() || rpcResponse == null || rpcResponse.code != 14100) {
        } else {
            onSendSMSSuccess(60000L, false);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        if (!this.mUserLoginActivity.hadReadHistory || this.mUserLoginActivity.mHistoryAccount == null) {
            return "86";
        }
        String str = this.mUserLoginActivity.mHistoryAccount.mobile;
        if (StringUtils.isEmpty(str) || !str.contains("-")) {
            return "86";
        }
        String[] split = str.split("-");
        return split.length > 0 ? split[0] : "86";
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onSendSMSAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704a1b2f", new Object[]{this});
            return;
        }
        AliUserSmsCodeView aliUserSmsCodeView = this.mSmsCodeView;
        if (aliUserSmsCodeView != null) {
            aliUserSmsCodeView.clearText();
        }
        this.mCurrentAccount = getAccountName();
        Properties properties = new Properties();
        properties.setProperty("result", "CheckPass");
        UserTrackAdapter.sendUT(getPageName(), "CheckPhoneResult", null, null, properties);
        this.mMobileLoginPresenter.buildSMSLoginParam(this.mCurrentAccount, null, false);
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
        this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, getPageName());
        this.mMobileLoginPresenter.getLoginParam().resendAlert = this.mUserLoginActivity.isNeedSMSCheck();
        this.mMobileLoginPresenter.getLoginParam().hid = this.historyHid;
        if (this.mUserLoginActivity != null) {
            this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
        }
        this.mMobileLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
        this.mMobileLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.SMS_LOGIN, hashMap);
        AppMonitorAdapter.commitSuccess("Page_Member_Login", "loginMonitorPoint", "action=smsAction;biz=smsLogin;page=" + getPageName());
        this.mMobileLoginPresenter.sendSMS(this.mAttachedActivity, this.mMobileLoginPresenter.getLoginParam(), getUICallback());
    }

    public void submitLoginForm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e52409c", new Object[]{this});
        } else if (this.mMobileLoginPresenter.getLoginParam() == null || (this.mMobileLoginPresenter.getLoginParam() != null && StringUtils.isEmpty(this.mMobileLoginPresenter.getLoginParam().smsSid))) {
            toast(getString(R.string.aliuser_send_sms_first), 0);
        } else {
            this.mMobileLoginPresenter.buildSMSLoginParam(this.mCurrentAccount, this.mSmsCodeView.getText(), false);
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SMS_LOGIN, hashMap);
            LoginFrom.setCurrentLoginFrom("5");
            try {
                if (this.mDialogHelper != null) {
                    this.mDialogHelper.hideInputMethod();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.mMobileLoginPresenter.getLoginParam().hid = this.historyHid;
            this.mMobileLoginPresenter.login(this.mAttachedActivity, this.mMobileLoginPresenter.getLoginParam(), getUICallback());
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.taobao.login4android.ui.TaobaoMobileHistoryFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i != 5008 || map == null) {
                } else {
                    try {
                        TaobaoMobileHistoryFragment.this.onSendSMSSuccess(((Long) map.get("millSecond")).longValue(), Boolean.parseBoolean("needToast"), ((Integer) map.get("errorCode")).intValue());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        };
    }

    public void onSendSMSSuccess(long j, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65bab9b", new Object[]{this, new Long(j), new Boolean(z), new Integer(i)});
        } else {
            this.mSendSMSCodeBtn.startCountDown(j, 1000L);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.isInABTestRegion("resumeToOnekey" + getPageName(), 10000);
    }
}
