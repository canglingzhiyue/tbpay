package com.ali.user.mobile.register.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.RegionPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserMobileLoginView;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.OceanRegisterParam;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.ali.user.mobile.webview.WebViewActivity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class AliUserMobileRegisterFragment extends BaseFragment implements View.OnClickListener, UserMobileLoginView, RegisterFormView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SMS2VOCIE_TIME = 29;
    public static final int SMS_2VOICE_CLICK_TIME = 0;
    public boolean alipayInstalled;
    public boolean mCheckBoxSwitch;
    public String mCodeLength;
    public AppLaunchInfoResponseData mFireAppLaunchRes;
    public View mMobileClearBtn;
    public EditText mMobileET;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mMobileStr;
    public TextWatcher mMobileTextWatcher;
    public boolean mPreviousChecked;
    public CheckBox mProtocolCB;
    public TextView mProtocolTV;
    public Button mRegBtn;
    public LinearLayout mRegBtnLL;
    public RegionInfo mRegionInfo;
    public RegionPresenter mRegionPresenter;
    public TextView mRegionTV;
    public RegistParam mRegistParam;
    public EditText mSMSCodeET;
    public String mSessionId;
    public TextWatcher mSmsCodeTextWatcher;
    public String mSource;
    public TextView mTitleTV;
    public TextView mWelcomeTV;
    public boolean mobileCheckSimilarity = true;
    public boolean isVoice = false;
    public OceanRegisterParam mTraceParam = new OceanRegisterParam();
    private boolean mobileUT = true;
    private boolean checkcodeUT = true;

    static {
        kge.a(-982919129);
        kge.a(-829929661);
        kge.a(-1275964844);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(AliUserMobileRegisterFragment aliUserMobileRegisterFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1824869764:
                super.onPrepareOptionsMenu((Menu) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1010147231:
                super.dismissAlertDialog();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public HistoryAccount getHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("81832384", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstans.PageName.UT_PAGE_REG;
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public String getRegType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0b2e441", new Object[]{this}) : UTConstant.Args.UT_MOBILE_REG;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8f5468", new Object[]{this, new Long(j), new Boolean(z)});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public static /* synthetic */ BaseActivity access$000(AliUserMobileRegisterFragment aliUserMobileRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("113f903d", new Object[]{aliUserMobileRegisterFragment}) : aliUserMobileRegisterFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$100(AliUserMobileRegisterFragment aliUserMobileRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("e0272e7e", new Object[]{aliUserMobileRegisterFragment}) : aliUserMobileRegisterFragment.mAttachedActivity;
    }

    public static /* synthetic */ boolean access$200(AliUserMobileRegisterFragment aliUserMobileRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d2e8765", new Object[]{aliUserMobileRegisterFragment})).booleanValue() : aliUserMobileRegisterFragment.mobileUT;
    }

    public static /* synthetic */ boolean access$202(AliUserMobileRegisterFragment aliUserMobileRegisterFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b463699", new Object[]{aliUserMobileRegisterFragment, new Boolean(z)})).booleanValue();
        }
        aliUserMobileRegisterFragment.mobileUT = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(AliUserMobileRegisterFragment aliUserMobileRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("760ee804", new Object[]{aliUserMobileRegisterFragment})).booleanValue() : aliUserMobileRegisterFragment.checkcodeUT;
    }

    public static /* synthetic */ boolean access$302(AliUserMobileRegisterFragment aliUserMobileRegisterFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e71e9da", new Object[]{aliUserMobileRegisterFragment, new Boolean(z)})).booleanValue();
        }
        aliUserMobileRegisterFragment.checkcodeUT = z;
        return z;
    }

    public static /* synthetic */ void access$400(AliUserMobileRegisterFragment aliUserMobileRegisterFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c4528a9", new Object[]{aliUserMobileRegisterFragment, str});
        } else {
            aliUserMobileRegisterFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$500(AliUserMobileRegisterFragment aliUserMobileRegisterFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea03f88", new Object[]{aliUserMobileRegisterFragment, str});
        } else {
            aliUserMobileRegisterFragment.addControl(str);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mPreviousChecked = arguments.getBoolean("check");
                Serializable serializable = arguments.getSerializable(RegistConstants.REGISTPARAM);
                if (serializable instanceof RegistParam) {
                    this.mRegistParam = (RegistParam) serializable;
                }
                if (this.mRegistParam != null && this.mRegistParam.externParams != null) {
                    String str = this.mRegistParam.externParams.get(LoginConstant.APPLAUNCH_INFO);
                    if (!TextUtils.isEmpty(str)) {
                        this.mFireAppLaunchRes = (AppLaunchInfoResponseData) JSON.parseObject(str, AppLaunchInfoResponseData.class);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        createPresenter();
    }

    public void createPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f203b93", new Object[]{this});
            return;
        }
        this.mRegionPresenter = new RegionPresenter(this);
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, new LoginParam());
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserTrackAdapter.updatePageName(getActivity(), getPageName());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UserTrackAdapter.pageDisAppear(getActivity());
    }

    public void generateProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a4e934", new Object[]{this});
        } else {
            ProtocolHelper.generateProtocol(getProtocolModel(), this.mAttachedActivity, this.mProtocolTV, getPageName(), true);
        }
    }

    public ProtocolModel getProtocolModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProtocolModel) ipChange.ipc$dispatch("73065416", new Object[]{this}) : ProtocolHelper.getProtocolModel(this.mAttachedActivity, "", "");
    }

    public void initRegionInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b94e79", new Object[]{this});
            return;
        }
        AppLaunchInfoResponseData appLaunchInfoResponseData = this.mFireAppLaunchRes;
        if (appLaunchInfoResponseData != null && appLaunchInfoResponseData.returnValue != 0 && !TextUtils.isEmpty(((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regPhoneCode) && !TextUtils.isEmpty(((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regCountryCode) && !TextUtils.isEmpty(((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regCheckPattern)) {
            this.mRegionInfo = new RegionInfo();
            this.mRegionInfo.code = ((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regPhoneCode;
            this.mRegionInfo.domain = ((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regCountryCode;
            this.mRegionInfo.checkPattern = ((AppLaunchInfo) this.mFireAppLaunchRes.returnValue).regCheckPattern;
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo == null || TextUtils.isEmpty(regionInfo.code) || TextUtils.isEmpty(this.mRegionInfo.domain)) {
            RegionInfo currentRegion = DataProviderFactory.getDataProvider().getCurrentRegion();
            if (currentRegion == null || TextUtils.isEmpty(currentRegion.domain) || TextUtils.isEmpty(currentRegion.name) || TextUtils.isEmpty(currentRegion.code)) {
                currentRegion = CountryUtil.matchRegionFromLocal(getContext(), currentRegion == null ? "" : currentRegion.domain);
            }
            this.mRegionInfo = currentRegion;
        }
        LoginApprearanceExtensions appreanceExtentions = AliUserLogin.getAppreanceExtentions();
        if (appreanceExtentions != null && !appreanceExtentions.needCountryModule()) {
            this.mRegionTV.setVisibility(8);
        } else {
            RegionInfo regionInfo2 = this.mRegionInfo;
            if (regionInfo2 != null && !TextUtils.isEmpty(regionInfo2.code)) {
                this.mRegionTV.setVisibility(0);
                this.mRegionTV.setText(this.mRegionInfo.code);
                resizeMobileETPadding();
            }
        }
        adjustMobileETMaxLength();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_register_send_smscode_btn) {
            addCheckAction(LoginClickAction.ACTION_REG_SEND_SMS);
        } else if (id == R.id.aliuser_register_reg_btn) {
            addCheckAction(LoginClickAction.ACTION_REG);
        } else if (id == R.id.aliuser_region_rl || id == R.id.aliuser_region_tv) {
            if (LanguageUtil.isChineseLanguage() && !DataProviderFactory.getDataProvider().isForigenLocation()) {
                addControl("Button-ChooseCountry");
                this.mAttachedActivity.startActivityForResult(new Intent(this.mAttachedActivity, AliUserRegisterChoiceRegionActivity.class), 2001);
                return;
            }
            applyRegion();
        } else if (id != R.id.aliuser_login_mobile_clear_iv) {
        } else {
            clearMobile();
        }
    }

    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else {
            onCheckLogin(i);
        }
    }

    public void onCheckLogin(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a830dc", new Object[]{this, new Integer(i)});
            return;
        }
        CheckBox checkBox = this.mProtocolCB;
        if (checkBox != null && !checkBox.isChecked()) {
            UserTrackAdapter.sendUT(getPageName(), "RegAgreement");
            final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
            rrotocolFragment.setNeedAdaptElder(true);
            rrotocolFragment.needAutoReg(false);
            rrotocolFragment.setPostiveBtnText(getString(R.string.aliuser_agree));
            rrotocolFragment.setNegativeBtnText(getString(R.string.aliuser_protocol_disagree));
            rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!AliUserMobileRegisterFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(AliUserMobileRegisterFragment.this.getPageName(), "Agreement_Button_Agree");
                        rrotocolFragment.dismissAllowingStateLoss();
                    }
                }
            });
            rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (!AliUserMobileRegisterFragment.this.isActive()) {
                    } else {
                        UserTrackAdapter.sendControlUT(AliUserMobileRegisterFragment.this.getPageName(), "Agreement_Button_Cancel");
                        rrotocolFragment.dismissAllowingStateLoss();
                        AliUserMobileRegisterFragment.this.mProtocolCB.setChecked(true);
                        AliUserMobileRegisterFragment.this.doRealAction(i);
                    }
                }
            });
            rrotocolFragment.show(getActivity().getSupportFragmentManager(), getPageName());
            return;
        }
        doRealAction(i);
    }

    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_REG) {
            registerAction();
        } else if (i == LoginClickAction.ACTION_REG_SEND_SMS) {
            sendCodeAction();
        } else if (i == LoginClickAction.ACTION_GOOGLE_LOGIN) {
            goGoogle();
        } else if (i == LoginClickAction.ACTION_FACEBOOK_LOGIN) {
            goFacebook();
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else if (i != LoginClickAction.ACTION_ALIPAYHK_LOGIN) {
        } else {
            goAlipay(true);
        }
    }

    public void registerAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb952c0", new Object[]{this});
            return;
        }
        if (!isMobileValid(getMobile())) {
            UserTrackAdapter.sendUT(getPageName(), UTConstans.CustomEvent.UT_MOBILE_INVALID);
        } else {
            this.mTraceParam = new OceanRegisterParam();
            this.mTraceParam.loginSourcePage = getPageName();
            this.mTraceParam.loginSourceType = getRegType();
            this.mTraceParam.traceId = ApiReferer.generateTraceId(getRegType(), getPageName());
        }
        sendCodeAction();
    }

    public void sendCodeAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538b8b32", new Object[]{this});
        } else {
            MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AliUserMobileRegisterFragment aliUserMobileRegisterFragment = AliUserMobileRegisterFragment.this;
                    aliUserMobileRegisterFragment.mMobileStr = aliUserMobileRegisterFragment.getMobile();
                    try {
                        AliUserMobileRegisterFragment.this.onSendSMSAction(false);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public void clearMobile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5398ca56", new Object[]{this});
            return;
        }
        this.mMobileET.getEditableText().clear();
        this.mMobileET.setEnabled(true);
        this.isVoice = false;
    }

    public void onSendSMSAction(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f9fd85", new Object[]{this, new Boolean(z)});
            return;
        }
        addControl("Button-SendSms");
        this.mMobileStr = getMobile();
        if (!isMobileValid(this.mMobileStr)) {
            toast(getString(R.string.aliuser_phone_number_invalidate), 0);
            return;
        }
        this.mMobileLoginPresenter.buildSMSLoginParam(getMobile(), null, this.isVoice);
        this.mMobileLoginPresenter.getLoginParam().smsSid = this.mSessionId;
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SMS_LOGIN;
        this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SMS_LOGIN, getPageName());
        Map<String, String> map = this.mMobileLoginPresenter.getLoginParam().ext;
        map.put(ApiConstants.ApiField.MOBILE_CHECK_SIMILARITY, this.mobileCheckSimilarity + "");
        this.mMobileLoginPresenter.getLoginParam().ext.put(ApiConstants.ApiField.FROM_REGISTER_PAGE, "true");
        this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
        if (CountryUtil.supportOverseaSimLogin(this.mFireAppLaunchRes, this.mRegionInfo, true)) {
            this.mMobileLoginPresenter.getOverseaSimVerifyUrl(new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onSuccess(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onFail(LoginException<LoginReturnData> loginException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77abaa65", new Object[]{this, loginException});
                    } else {
                        AliUserMobileRegisterFragment.this.mMobileLoginPresenter.sendSMS(AliUserMobileRegisterFragment.access$000(AliUserMobileRegisterFragment.this), AliUserMobileRegisterFragment.this.mMobileLoginPresenter.getLoginParam(), AliUserMobileRegisterFragment.this.getUICallback());
                    }
                }

                @Override // com.ali.user.mobile.callback.LoginTasksCallback
                public void onCancel() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                    } else {
                        AliUserMobileRegisterFragment.this.mMobileLoginPresenter.sendSMS(AliUserMobileRegisterFragment.access$100(AliUserMobileRegisterFragment.this), AliUserMobileRegisterFragment.this.mMobileLoginPresenter.getLoginParam(), AliUserMobileRegisterFragment.this.getUICallback());
                    }
                }
            });
        } else {
            this.mMobileLoginPresenter.sendSMS(this.mAttachedActivity, this.mMobileLoginPresenter.getLoginParam(), getUICallback());
        }
    }

    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                SmsApplyResult smsApplyResult;
                Throwable th;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i != 5008 && i != 6001) {
                    if (i != 6002) {
                        return;
                    }
                    AliUserMobileRegisterFragment aliUserMobileRegisterFragment = AliUserMobileRegisterFragment.this;
                    aliUserMobileRegisterFragment.mobileCheckSimilarity = false;
                    aliUserMobileRegisterFragment.sendCodeAction();
                } else if (map == null) {
                } else {
                    long longValue = ((Long) map.get("millSecond")).longValue();
                    try {
                        smsApplyResult = (SmsApplyResult) map.get("result");
                        if (smsApplyResult != null) {
                            try {
                                if (!TextUtils.isEmpty(smsApplyResult.smsSid)) {
                                    AliUserMobileRegisterFragment.this.mSessionId = smsApplyResult.smsSid;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th.printStackTrace();
                                AliUserMobileRegisterFragment.this.onSendSMSSuccess(longValue, smsApplyResult);
                            }
                        }
                    } catch (Throwable th3) {
                        smsApplyResult = null;
                        th = th3;
                    }
                    AliUserMobileRegisterFragment.this.onSendSMSSuccess(longValue, smsApplyResult);
                }
            }
        };
    }

    public boolean isMobileValid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae9a785", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo == null || TextUtils.isEmpty(regionInfo.checkPattern)) {
            return str.length() >= 6 && str.length() <= 20;
        }
        String replaceAll = str.replaceAll(" ", "");
        String replace = this.mRegionInfo.code.replace(riy.PLUS, "");
        return (replace + replaceAll).matches(this.mRegionInfo.checkPattern);
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getCountryCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7094bfac", new Object[]{this});
        }
        RegionInfo regionInfo = this.mRegionInfo;
        return (regionInfo == null || TextUtils.isEmpty(regionInfo.domain)) ? "CN" : this.mRegionInfo.domain;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this});
        }
        RegionInfo regionInfo = this.mRegionInfo;
        return (regionInfo == null || TextUtils.isEmpty(regionInfo.code)) ? "86" : this.mRegionInfo.code.replace(riy.PLUS, "");
    }

    public String getMobile() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c96e2a61", new Object[]{this}) : this.mMobileET.getText().toString().trim().replaceAll(" ", "");
    }

    @Override // com.ali.user.mobile.register.ui.RegisterFormView
    public void onSendSMSSuccess(long j, SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e23b80", new Object[]{this, new Long(j), smsApplyResult});
        } else if (getActivity() == null) {
        } else {
            Intent intent = new Intent();
            intent.putExtra(RegistConstants.REGISTER_MOBILE_NUM, getMobile());
            intent.putExtra("session_id", TextUtils.isEmpty(smsApplyResult.smsSid) ? this.mSessionId : smsApplyResult.smsSid);
            intent.putExtra(RegistConstants.REGISTER_CODE_LENGTH, TextUtils.isEmpty(smsApplyResult.codeLength) ? this.mCodeLength : smsApplyResult.codeLength);
            intent.putExtra(RegistConstants.REGISTER_TRACE_PARAM, JSON.toJSONString(this.mTraceParam));
            RegionInfo regionInfo = this.mRegionInfo;
            intent.putExtra("region", regionInfo == null ? "" : JSON.toJSONString(regionInfo));
            if (smsApplyResult != null && !TextUtils.isEmpty(smsApplyResult.helpVideoUrl)) {
                intent.putExtra("url", smsApplyResult.helpVideoUrl);
            }
            ((AliUserRegisterActivity) getActivity()).gotoSmsCodeFragment(intent);
        }
    }

    /* loaded from: classes2.dex */
    public class MobileTextWatcher extends PhoneNumberFormattingTextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<EditText> editText;

        static {
            kge.a(-1858275728);
        }

        public static /* synthetic */ Object ipc$super(MobileTextWatcher mobileTextWatcher, String str, Object... objArr) {
            if (str.hashCode() == 1731819568) {
                super.onTextChanged((CharSequence) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        private MobileTextWatcher(EditText editText, String str) {
            super(str);
            this.editText = new WeakReference<>(editText);
        }

        @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            super.onTextChanged(charSequence, i, i2, i3);
            if (AliUserMobileRegisterFragment.access$200(AliUserMobileRegisterFragment.this) && !TextUtils.isEmpty(charSequence)) {
                AliUserMobileRegisterFragment.access$202(AliUserMobileRegisterFragment.this, false);
                UserTrackAdapter.sendUT(AliUserMobileRegisterFragment.this.getPageName(), "InputPhone");
            }
            AliUserMobileRegisterFragment.this.checkRegAble(this.editText.get());
        }
    }

    /* loaded from: classes2.dex */
    public class RegTextWatcher implements TextWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<EditText> editText;

        static {
            kge.a(-1368740648);
            kge.a(1670231405);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        public RegTextWatcher(EditText editText) {
            this.editText = new WeakReference<>(editText);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            if (this.editText.get().getId() == R.id.aliuser_register_mobile_et && AliUserMobileRegisterFragment.this.mMobileClearBtn != null) {
                if (charSequence == null || charSequence.length() == 0) {
                    if (AliUserMobileRegisterFragment.this.mMobileClearBtn.getVisibility() != 8) {
                        AliUserMobileRegisterFragment.this.mMobileClearBtn.setVisibility(8);
                    }
                } else {
                    if (AliUserMobileRegisterFragment.access$200(AliUserMobileRegisterFragment.this)) {
                        AliUserMobileRegisterFragment.access$202(AliUserMobileRegisterFragment.this, false);
                        UserTrackAdapter.sendUT(AliUserMobileRegisterFragment.this.getPageName(), "InputPhone");
                    }
                    if (AliUserMobileRegisterFragment.this.mMobileClearBtn.getVisibility() != 0 && AliUserMobileRegisterFragment.this.mMobileClearBtn.isEnabled()) {
                        AliUserMobileRegisterFragment.this.mMobileClearBtn.setVisibility(0);
                    }
                }
            } else if (this.editText.get().getId() == R.id.aliuser_register_sms_code_et && charSequence != null && charSequence.length() > 0 && AliUserMobileRegisterFragment.access$300(AliUserMobileRegisterFragment.this)) {
                AliUserMobileRegisterFragment.access$302(AliUserMobileRegisterFragment.this, false);
                UserTrackAdapter.sendUT(AliUserMobileRegisterFragment.this.getPageName(), "InputCode");
            }
            AliUserMobileRegisterFragment.this.checkRegAble(this.editText.get());
        }
    }

    public void checkRegAble(EditText editText) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2b5472", new Object[]{this, editText});
        } else if (TextUtils.isEmpty(this.mMobileET.getText().toString())) {
            this.mRegBtn.setEnabled(false);
            this.mRegBtnLL.setBackgroundDrawable(null);
        } else {
            this.mRegBtn.setEnabled(true);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05c24e6", new Object[]{this, rpcResponse});
        } else if (!isActive()) {
        } else {
            if (rpcResponse != null && rpcResponse.code == 458825) {
                UserTrackAdapter.sendUT(getPageName(), "CheckSimilarity");
                alert(rpcResponse.message, "", getString(R.string.aliuser_re_enter), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else {
                            AliUserMobileRegisterFragment.access$400(AliUserMobileRegisterFragment.this, "Button-Alert-CheckSimilarity-no");
                        }
                    }
                }, getString(R.string.aliuser_common_ok), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            return;
                        }
                        AliUserMobileRegisterFragment aliUserMobileRegisterFragment = AliUserMobileRegisterFragment.this;
                        aliUserMobileRegisterFragment.mobileCheckSimilarity = false;
                        AliUserMobileRegisterFragment.access$500(aliUserMobileRegisterFragment, "Button-Alert-CheckSimilarity-yes");
                        AliUserMobileRegisterFragment.this.sendCodeAction();
                    }
                });
            } else if (rpcResponse != null && rpcResponse.code == 458826) {
                toast(getResources().getString(R.string.aliuser_reg_mobile_exist), 0);
                UserTrackAdapter.sendUT(getPageName(), "RegisterBlock");
                if (getActivity() == null) {
                    return;
                }
                LoginParam loginParam = new LoginParam();
                loginParam.loginId = getMobile();
                loginParam.callRpc = true;
                WebViewActivity.goFistLoginPage(getActivity(), true, true, loginParam);
            } else {
                Properties properties = LoginComponent.getProperties();
                String pageName = getPageName();
                String str = "";
                if (rpcResponse != null) {
                    str = rpcResponse.code + str;
                }
                UserTrackAdapter.sendUT(pageName, UTConstans.CustomEvent.UT_SMS_SEND_FAIL, str, getRegType(), properties);
                if (rpcResponse != null && rpcResponse.code != 4) {
                    toast(rpcResponse.message, 0);
                } else {
                    toast(getString(R.string.aliuser_sever_error), 0);
                }
            }
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

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || i != 2001 || intent == null) {
            return;
        }
        this.mRegionInfo = (RegionInfo) intent.getParcelableExtra("region");
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo == null) {
            return;
        }
        this.mRegionTV.setText(regionInfo.code);
        resizeMobileETPadding();
        adjustMobileETMaxLength();
    }

    public void adjustMobileETMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06d7b51", new Object[]{this});
            return;
        }
        RegionInfo regionInfo = this.mRegionInfo;
        if (regionInfo != null && TextUtils.equals("CN", regionInfo.domain)) {
            this.mMobileET.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
            if (Build.VERSION.SDK_INT >= 21) {
                TextWatcher textWatcher = this.mMobileTextWatcher;
                if (textWatcher != null) {
                    this.mMobileET.removeTextChangedListener(textWatcher);
                }
                this.mMobileTextWatcher = new MobileTextWatcher(this.mMobileET, Locale.CHINA.getCountry());
                this.mMobileET.addTextChangedListener(this.mMobileTextWatcher);
            }
        } else {
            this.mMobileET.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
            if (Build.VERSION.SDK_INT >= 21) {
                TextWatcher textWatcher2 = this.mMobileTextWatcher;
                if (textWatcher2 != null) {
                    this.mMobileET.removeTextChangedListener(textWatcher2);
                }
                this.mMobileTextWatcher = new RegTextWatcher(this.mMobileET);
                this.mMobileET.addTextChangedListener(this.mMobileTextWatcher);
            }
        }
        this.mMobileET.setText(getMobile());
    }

    public void resizeMobileETPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae86933", new Object[]{this});
        } else {
            this.mRegionTV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    AliUserMobileRegisterFragment.this.mRegionTV.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    AliUserMobileRegisterFragment.this.mMobileET.setPadding(AliUserMobileRegisterFragment.this.mRegionTV.getWidth() + 30, AliUserMobileRegisterFragment.this.mMobileET.getPaddingTop(), AliUserMobileRegisterFragment.this.mRegionTV.getWidth() + 30, AliUserMobileRegisterFragment.this.mMobileET.getPaddingBottom());
                }
            });
        }
    }

    public void applyRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a37f89", new Object[]{this});
        } else {
            this.mRegionPresenter.region(1);
        }
    }

    @Override // com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        } else if (!isActive()) {
        } else {
            RegionDialogFragment regionDialogFragment = new RegionDialogFragment();
            regionDialogFragment.setList(list, hashMap, list2);
            regionDialogFragment.setRegionListener(new RegionListener() { // from class: com.ali.user.mobile.register.ui.AliUserMobileRegisterFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.register.ui.RegionListener
                public void onClick(RegionInfo regionInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9431c0af", new Object[]{this, regionInfo});
                        return;
                    }
                    AliUserMobileRegisterFragment aliUserMobileRegisterFragment = AliUserMobileRegisterFragment.this;
                    aliUserMobileRegisterFragment.mRegionInfo = regionInfo;
                    if (aliUserMobileRegisterFragment.mRegionInfo == null) {
                        return;
                    }
                    AliUserMobileRegisterFragment.this.mRegionTV.setText(AliUserMobileRegisterFragment.this.mRegionInfo.code);
                    AliUserMobileRegisterFragment.this.resizeMobileETPadding();
                    AliUserMobileRegisterFragment.this.adjustMobileETMaxLength();
                }
            });
            regionDialogFragment.setCurrentRegion(this.mRegionInfo);
            regionDialogFragment.setupAdapter(getActivity());
            try {
                regionDialogFragment.show(getActivity().getSupportFragmentManager(), "MobileRegisterRegionDialog");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.base.BaseView
    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (!isActivityAvaiable()) {
        } else {
            dismissProgress();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mRegionPresenter.onDestory();
        this.mMobileET.removeTextChangedListener(this.mMobileTextWatcher);
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
            return;
        }
        if (menu.findItem(R.id.aliuser_menu_item_help) != null && menu.findItem(R.id.aliuser_menu_item_more) != null) {
            menu.findItem(R.id.aliuser_menu_item_more).setVisible(false);
            menu.findItem(R.id.aliuser_menu_item_help).setVisible(true);
        }
        super.onPrepareOptionsMenu(menu);
    }

    @Override // android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        if (LanguageUtil.isHK()) {
            menu.clear();
            menuInflater.inflate(R.menu.aliuser_menu, menu);
            try {
                menu.findItem(R.id.aliuser_menu_item_help).setTitle(getResources().getString(R.string.aliuser_need_help));
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        menu.clear();
    }

    @Override // android.support.v4.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == R.id.aliuser_menu_item_help) {
            addControl("Button-Help");
            AliUserRegisterActivity.goRegHelp(getBaseActivity());
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
        } else {
            super.dismissAlertDialog();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue() : DataProviderFactory.getDataProvider().getSite();
    }

    public TaobaoRegProtocolDialogFragment getRrotocolFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoRegProtocolDialogFragment) ipChange.ipc$dispatch("3dde219b", new Object[]{this}) : new TaobaoRegProtocolDialogFragment();
    }
}
