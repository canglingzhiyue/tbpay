package com.ali.user.mobile.login.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.callback.LoginTasksCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.EmailLoginPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.LoginFlowReturnData;
import com.ali.user.mobile.login.presenter.RecommendLoginPresenter;
import com.ali.user.mobile.login.presenter.SMSNickLoginPresenter;
import com.ali.user.mobile.login.presenter.SimVerifyPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterChoiceRegionActivity;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.CountryUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.c;
import com.taobao.android.weex_framework.util.a;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class RecommendLoginFragment extends BaseLoginFragment implements ILoginMethodChange, RecommendLoginView, UserLoginView, UserMobileLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ui.RecommendLoginFragment";
    public boolean fromOversea;
    public View mAccountClearBtn;
    public RelativeLayout mAccountRL;
    public BioPresenter mBioPresenter;
    public EmailLoginPresenter mEmailLoginPresenter;
    public FaceLoginPresenter mFaceLoginPresenter;
    public TextView mLeftFuncTV;
    public EditText mLoginAccountET;
    public String mLoginFlowId;
    public LoginFlowReturnData mLoginFlowReturnData;
    public RecommendLoginPresenter mLoginPresenter;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mOriginUserInput;
    public View mPasswordClearBtn;
    public EditText mPasswordET;
    public RelativeLayout mPasswordRL;
    public String mRecommendLoginId;
    public Button mRecommendLoginNextBtn;
    public String mRecommendLoginType;
    public TextView mRegTV;
    public RegionInfo mRegionInfo;
    public TextView mRegionTV;
    public TextView mRightFuncTV;
    public SMSNickLoginPresenter mSMSNickLoginPresenter;
    public ImageView mShowPasswordIV;
    public SimVerifyPresenter mSimLoginPresenter;
    public TextView mTipsTV;
    public UserLoginPresenter mUserLoginPresenter;
    public TextView moreFuncMenu;
    private int originalAccountETPadding;
    public String paramModeState;
    public boolean supportOverseaSimLogin;
    public LoginParam mLoginParam = null;
    public List<String> mAvailableLoginModes = new ArrayList();
    public boolean takeAvaliable = true;
    public LoginModeState mCurrentLoginModeState = LoginModeState.LOCATION;
    public boolean forceNormal = false;
    public boolean mobileCheckSimilarity = true;
    private boolean needPwdInputUT = true;
    private boolean accountUT = true;
    public boolean degradeToSMS = false;

    static {
        kge.a(-910858710);
        kge.a(227130239);
        kge.a(-1275964844);
        kge.a(1749592790);
        kge.a(375400382);
    }

    public static /* synthetic */ Object ipc$super(RecommendLoginFragment recommendLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1829513635:
                super.doRealAction(((Number) objArr[0]).intValue());
                return null;
            case -1641657532:
                super.showBottomMenuForFirstPage();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void clearPasswordInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf5829", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void goTaobao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42725bd", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.UserLoginView
    public void onPwdError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5f51", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendEmailReg(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc989a34", new Object[]{this, str, list, loginParam});
        }
    }

    public static /* synthetic */ boolean access$000(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6e1027c4", new Object[]{recommendLoginFragment})).booleanValue() : recommendLoginFragment.needPwdInputUT;
    }

    public static /* synthetic */ boolean access$002(RecommendLoginFragment recommendLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75611c9a", new Object[]{recommendLoginFragment, new Boolean(z)})).booleanValue();
        }
        recommendLoginFragment.needPwdInputUT = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7413f323", new Object[]{recommendLoginFragment})).booleanValue() : recommendLoginFragment.accountUT;
    }

    public static /* synthetic */ void access$1000(RecommendLoginFragment recommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f18897b", new Object[]{recommendLoginFragment, str});
        } else {
            recommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ boolean access$102(RecommendLoginFragment recommendLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fd6bd1b", new Object[]{recommendLoginFragment, new Boolean(z)})).booleanValue();
        }
        recommendLoginFragment.accountUT = z;
        return z;
    }

    public static /* synthetic */ void access$200(RecommendLoginFragment recommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38584c8", new Object[]{recommendLoginFragment, str});
        } else {
            recommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ BaseActivity access$300(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("3a31c5c3", new Object[]{recommendLoginFragment}) : recommendLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$400(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("933d1144", new Object[]{recommendLoginFragment}) : recommendLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ BaseActivity access$500(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("ec485cc5", new Object[]{recommendLoginFragment}) : recommendLoginFragment.mAttachedActivity;
    }

    public static /* synthetic */ boolean access$600(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9226ebfe", new Object[]{recommendLoginFragment})).booleanValue() : recommendLoginFragment.sendSms();
    }

    public static /* synthetic */ int access$700(RecommendLoginFragment recommendLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("982ab74c", new Object[]{recommendLoginFragment})).intValue() : recommendLoginFragment.originalAccountETPadding;
    }

    public static /* synthetic */ int access$702(RecommendLoginFragment recommendLoginFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e98403f", new Object[]{recommendLoginFragment, new Integer(i)})).intValue();
        }
        recommendLoginFragment.originalAccountETPadding = i;
        return i;
    }

    public static /* synthetic */ void access$800(RecommendLoginFragment recommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898d6e82", new Object[]{recommendLoginFragment, str});
        } else {
            recommendLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$900(RecommendLoginFragment recommendLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28ec021", new Object[]{recommendLoginFragment, str});
        } else {
            recommendLoginFragment.addControl(str);
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : LoginModeState.SMS_LOGIN.name().equals(this.paramModeState) ? UTConstant.PageName.UT_PAGE_SMS_LOGIN0 : LoginModeState.PASSWORD.name().equals(this.paramModeState) ? UTConstant.PageName.UT_PAGE_PWD_LOGIN0 : UTConstans.PageName.UT_PAGE_RECOMMEND_LOGIN;
    }

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.mLoginParam = null;
        if (arguments != null) {
            try {
                this.forceNormal = arguments.getBoolean(LoginConstant.FORCE_NORMAL_MODE, false);
                this.mPreviousChecked = arguments.getBoolean("check");
                String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                arguments.remove(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                if (!TextUtils.isEmpty(str)) {
                    this.mLoginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                }
                this.supportOverseaSimLogin = arguments.getBoolean("supportOverseaSimLogin", false);
                this.paramModeState = arguments.getString(LoginConstant.CURRENT_LOGIN_MODE_STATE, LoginModeState.LOCATION.name());
                this.mCurrentLoginModeState = LoginModeState.parse(this.paramModeState);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mSource = this.mLoginParam.source;
        this.mLoginPresenter = new RecommendLoginPresenter(this, this.mLoginParam.m102clone());
        LoginParam loginParam = this.mLoginParam;
        loginParam.token = null;
        loginParam.tokenType = null;
        this.mUserLoginPresenter = new UserLoginPresenter(this, loginParam.m102clone());
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.mLoginParam.m102clone());
        this.mSimLoginPresenter = new SimVerifyPresenter(this, this.mLoginParam.m102clone());
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.mLoginParam.m102clone());
        this.mSMSNickLoginPresenter = new SMSNickLoginPresenter(this, this.mLoginParam.m102clone());
        this.mBioPresenter = new BioPresenter(this, this.mLoginParam.m102clone());
        this.mEmailLoginPresenter = new EmailLoginPresenter(this, this.mLoginParam.m102clone());
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().a("");
            ((BaseActivity) getActivity()).setNavigationCloseIcon();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.mUserLoginActivity = (UserLoginActivity) getActivity();
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    RecommendLoginFragment.this.alipayInstalled = true;
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else {
                    RecommendLoginFragment.this.alipayInstalled = false;
                }
            }
        });
        resetActionBar();
        if (this.mUserLoginActivity != null && this.mUserLoginActivity.fireAppLaunchRes != null && this.mUserLoginActivity.fireAppLaunchRes.returnValue != 0) {
            AppLaunchInfo appLaunchInfo = (AppLaunchInfo) this.mUserLoginActivity.fireAppLaunchRes.returnValue;
            if (appLaunchInfo.fromOversea) {
                this.fromOversea = true;
                if (TextUtils.equals(this.mCurrentLoginModeState.name(), LoginModeState.SMS_LOGIN.name())) {
                    UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_OVERSEA_LOGIN_SHOW, String.valueOf(appLaunchInfo.supportOverseaSimLogin), null);
                }
            }
        }
        this.mAccountClearBtn = view.findViewById(R.id.aliuser_login_account_clear_iv);
        this.mPasswordClearBtn = view.findViewById(R.id.aliuser_recommend_login_password_clear_iv);
        this.mAccountRL = (RelativeLayout) view.findViewById(R.id.aliuser_recommend_login_account_rl);
        this.mRegTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_reg_tv);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_recommend_login_reg_tip_tv);
        if (LoginSwitch.isInABTestRegion(LoginSwitch.REGISTER_TV, -1)) {
            TextView textView2 = this.mRegTV;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView != null) {
                textView.setText(getResources().getString(R.string.aliuser_reg_tip_can_login));
                textView.setTextColor(getResources().getColor(R.color.aliuser_edittext_bg_color_activated));
            }
        }
        this.mLoginAccountET = (EditText) view.findViewById(R.id.aliuser_recommend_login_account_et);
        this.mLoginAccountET.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view2, new Boolean(z)});
                } else if (z) {
                    RecommendLoginFragment.this.editLoginAccount();
                } else if (RecommendLoginFragment.this.mAccountClearBtn == null) {
                } else {
                    RecommendLoginFragment.this.mAccountClearBtn.setVisibility(8);
                }
            }
        });
        updateLoginHint();
        this.mLoginAccountET.addTextChangedListener(new TextWatcher() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                if (!TextUtils.isEmpty(charSequence) && RecommendLoginFragment.this.mRecommendLoginNextBtn != null) {
                    RecommendLoginFragment.this.mRecommendLoginNextBtn.setEnabled(true);
                }
                RecommendLoginFragment.access$002(RecommendLoginFragment.this, true);
                if (RecommendLoginFragment.access$100(RecommendLoginFragment.this) && !TextUtils.isEmpty(charSequence)) {
                    RecommendLoginFragment.access$102(RecommendLoginFragment.this, false);
                    UserTrackAdapter.sendUT(RecommendLoginFragment.this.getPageName(), "Input");
                }
                if (RecommendLoginFragment.this.mAccountClearBtn == null || RecommendLoginFragment.this.mCurrentLoginModeState != LoginModeState.LOCATION) {
                    return;
                }
                if (charSequence == null || charSequence.length() == 0) {
                    if (RecommendLoginFragment.this.mAccountClearBtn.getVisibility() == 8) {
                        return;
                    }
                    RecommendLoginFragment.this.mAccountClearBtn.setVisibility(8);
                } else if (RecommendLoginFragment.this.mAccountClearBtn.getVisibility() == 0) {
                } else {
                    RecommendLoginFragment.this.mAccountClearBtn.setVisibility(0);
                }
            }
        });
        this.mRecommendLoginNextBtn = (Button) view.findViewById(R.id.aliuser_recommend_login_next_btn);
        this.mRecommendLoginNextBtn.setEnabled(false);
        this.mProtocolTV = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
        this.mCheckBoxSwitch = true;
        this.mProtocolCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
        ProtocolHelper.setCheckBox(this, this.mProtocolCB, getPageName(), this.mCheckBoxSwitch, this.mPreviousChecked);
        this.mRegionTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_region_tv);
        this.mRegionTV.setVisibility(8);
        this.mLeftFuncTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_left_func_tv);
        this.mRightFuncTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_right_func_tv);
        this.mPasswordRL = (RelativeLayout) view.findViewById(R.id.aliuser_recommend_login_password_rl);
        this.mPasswordET = (EditText) view.findViewById(R.id.aliuser_recommend_login_password_et);
        this.mPasswordET.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mPasswordET.addTextChangedListener(new TextWatcher() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (RecommendLoginFragment.this.mPasswordET == null || charSequence == null || charSequence.length() <= 0 || !RecommendLoginFragment.access$000(RecommendLoginFragment.this)) {
                } else {
                    RecommendLoginFragment.access$002(RecommendLoginFragment.this, false);
                    RecommendLoginFragment.access$200(RecommendLoginFragment.this, "password_input");
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (RecommendLoginFragment.this.mPasswordClearBtn == null) {
                } else {
                    if (charSequence == null || charSequence.length() == 0) {
                        if (RecommendLoginFragment.this.mPasswordClearBtn.getVisibility() == 8) {
                            return;
                        }
                        RecommendLoginFragment.this.mPasswordClearBtn.setVisibility(8);
                    } else if (RecommendLoginFragment.this.mPasswordClearBtn.getVisibility() == 0) {
                    } else {
                        RecommendLoginFragment.this.mPasswordClearBtn.setVisibility(0);
                    }
                }
            }
        });
        this.mShowPasswordIV = (ImageView) view.findViewById(R.id.aliuser_recommend_login_show_password_btn);
        this.mTipsTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_tip_tv);
        this.moreFuncMenu = (TextView) view.findViewById(R.id.aliuser_recommend_login_menu);
        setOnClickListener(this.mRegTV, this.mRecommendLoginNextBtn, this.mLeftFuncTV, this.mRightFuncTV, this.mShowPasswordIV, this.mLoginAccountET, this.mRegionTV, this.moreFuncMenu, this.mAccountClearBtn, this.mPasswordClearBtn);
        this.mLoginPresenter.onStart();
        if (this.mLoginParam.callRpc) {
            this.mLoginParam.callRpc = false;
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        }
        updateLoginModeState(this.mCurrentLoginModeState);
        whatApp();
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mRegTV, this.mRecommendLoginNextBtn, this.mRegionTV, this.mLoginAccountET, this.mPasswordET, this.mLeftFuncTV, this.mRightFuncTV, textView, this.moreFuncMenu, this.mProtocolTV);
    }

    public void updateLoginHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da5e7ce", new Object[]{this});
            return;
        }
        try {
            SpannableString spannableString = new SpannableString(getHintAccountText());
            int i = 16;
            if (this.needAdaptElder) {
                i = ElderUtil.getScaleSize(16);
            }
            spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, spannableString.length(), 33);
            this.mLoginAccountET.setHint(new SpannedString(spannableString));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public String getHintAccountText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f43ea15c", new Object[]{this});
        }
        if (this.supportOverseaSimLogin && this.mCurrentLoginModeState == LoginModeState.SMS_LOGIN) {
            return getString(R.string.aliuser_recommend_login_mobile_hint);
        }
        if (this.mCurrentLoginModeState == LoginModeState.SMS_LOGIN) {
            return getString(R.string.aliuser_recommend_login_mobile_hint);
        }
        return getString(R.string.aliuser_taobao_recommend_login_hint);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doInResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ead564", new Object[]{this});
        } else if (!LoginSwitch.getSwitch(LoginSwitch.RMD_TO_ONEKEY, "true") || this.forceNormal) {
        } else {
            this.mRecommendLoginNextBtn.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ServiceFactory.getService(NumberAuthService.class) == null || RecommendLoginFragment.this.forceNormal) {
                    } else {
                        ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginMaskPhone(5000, "recommend", new CommonDataCallback() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.CommonDataCallback
                            public void onFail(int i, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                }
                            }

                            @Override // com.ali.user.mobile.callback.CommonDataCallback
                            public void onSuccess(Map<String, String> map) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("93e51c7a", new Object[]{this, map});
                                    return;
                                }
                                if (RecommendLoginFragment.this.mLoginAccountET != null && !TextUtils.isEmpty(RecommendLoginFragment.this.mLoginAccountET.getText().toString())) {
                                    RecommendLoginFragment.this.interact = true;
                                }
                                if (!RecommendLoginFragment.this.isActive() || RecommendLoginFragment.access$300(RecommendLoginFragment.this) == null || !(RecommendLoginFragment.access$400(RecommendLoginFragment.this) instanceof UserLoginActivity) || RecommendLoginFragment.this.interact) {
                                    return;
                                }
                                UserTrackAdapter.sendUT("goOnekey");
                                Intent intent = new Intent();
                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                    intent.putExtra(entry.getKey(), entry.getValue());
                                }
                                ((UserLoginActivity) RecommendLoginFragment.access$500(RecommendLoginFragment.this)).gotoOneKeyLoginFragment(intent);
                            }
                        });
                    }
                }
            }, 2000L);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_recommend_login_tb;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        int id = view.getId();
        if (id == R.id.aliuser_recommend_login_reg_tv) {
            addControl("register");
            RegistParam registParam = new RegistParam();
            registParam.registSite = getLoginSite();
            registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
            registParam.source = this.mSource;
            try {
                if (this.mUserLoginActivity.fireAppLaunchRes != null) {
                    registParam.externParams = new HashMap();
                    registParam.externParams.put(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(this.mUserLoginActivity.fireAppLaunchRes));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(this.mAttachedActivity, registParam);
        } else if (id == R.id.aliuser_recommend_login_next_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else if (id == R.id.aliuser_recommend_login_region_tv) {
            addControl("Button-Region");
            Intent intent = new Intent(this.mAttachedActivity, AliUserRegisterChoiceRegionActivity.class);
            intent.putExtra("from_login", true);
            this.mAttachedActivity.startActivityForResult(intent, 2001);
        } else if (id == R.id.aliuser_recommend_login_account_et) {
            editLoginAccount();
        } else if (id == R.id.aliuser_recommend_login_right_func_tv) {
            addControl("Button-ResetPwd");
            onForgetPasswordAction();
        } else if (id == R.id.aliuser_recommend_login_show_password_btn) {
            int selectionEnd = this.mPasswordET.getSelectionEnd();
            if (view.getTag() == null || !((Boolean) view.getTag()).booleanValue()) {
                this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                this.mShowPasswordIV.setContentDescription(getString(R.string.aliuser_assist_password_show));
                view.setTag(true);
                addControl("Button-ShowPwd");
            } else {
                this.mPasswordET.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility_off);
                this.mShowPasswordIV.setContentDescription(getString(R.string.aliuser_assist_password_hide));
                addControl("Button-HidePwd");
                view.setTag(false);
            }
            if (selectionEnd > 0) {
                this.mPasswordET.setSelection(selectionEnd);
            }
            this.mPasswordET.postInvalidate();
        } else if (id == R.id.aliuser_recommend_login_menu) {
            addControl("more");
            showBottomMenu();
        } else if (id == R.id.aliuser_login_account_clear_iv) {
            addControl(a.ATOM_EXT_clear);
            EditText editText = this.mLoginAccountET;
            if (editText == null) {
                return;
            }
            editText.getEditableText().clear();
            this.mLoginAccountET.setEnabled(true);
        } else if (id == R.id.aliuser_recommend_login_password_clear_iv) {
            EditText editText2 = this.mPasswordET;
            if (editText2 == null) {
                return;
            }
            editText2.getEditableText().clear();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onClickLoginAction();
        } else if (i == LoginClickAction.ACTION_FACE) {
            onFaceLogin();
        } else if (i == LoginClickAction.ACTION_SEND_SMS) {
            onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN);
        } else if (i == LoginClickAction.ACTION_EMAIL_SEND) {
            onSendEmailAction();
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else if (i == LoginClickAction.ACTION_TAOBAO) {
            goTaobao();
        } else if (i == LoginClickAction.ACTION_SIM_VERIFY) {
            onSimVerify();
        } else {
            super.doRealAction(i);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onFingerLogin() {
        BioPresenter bioPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e64a28", new Object[]{this});
        } else if (ServiceFactory.getService(FingerprintService.class) == null || (bioPresenter = this.mBioPresenter) == null) {
        } else {
            bioPresenter.buildLoginParam();
            this.mBioPresenter.mLoginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.BIO_LOGIN, getPageName());
            this.mBioPresenter.mLoginParam.utPageName = LoginType.LocalLoginType.BIO_LOGIN;
            this.mBioPresenter.mLoginParam.utPageName = getPageName();
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mBioPresenter.mLoginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.BIO_LOGIN, hashMap);
            if (this.mUserLoginActivity != null) {
                this.mBioPresenter.mLoginParam.alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
            }
            this.mBioPresenter.mLoginParam.biometricId = this.mLoginFlowReturnData.biometricId;
            this.mBioPresenter.login(this.mAttachedActivity, this.mBioPresenter.mLoginParam, getUICallback());
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, getPageName());
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
        loginParam.source = this.mSource;
        loginParam.alipayInstalled = true;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(loginParam.sdkTraceId);
        String str = "";
        sb.append(str);
        hashMap.put("sdkTraceId", sb.toString());
        if (TextUtils.equals(this.mRecommendLoginType, LoginModeState.LOCATION.name())) {
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "recommendLoginFlow", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        } else {
            String pageName = getPageName();
            LoginModeState loginModeState = this.mCurrentLoginModeState;
            if (loginModeState != null) {
                str = loginModeState.name();
            }
            UserTrackAdapter.control(pageName, UTConstant.CustomEvent.UT_LOGIN_ACTION, str, LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        }
        AlipayAuth.onAlipayLoginClick(this);
    }

    public void onClickLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b821dd", new Object[]{this});
            return;
        }
        switch (this.mCurrentLoginModeState) {
            case LOCATION:
                if (TextUtils.isEmpty(getAccountName())) {
                    toast(getString(R.string.aliuser_taobao_recommend_login_hint), 0);
                    return;
                }
                this.mOriginUserInput = getAccountName();
                this.mLoginPresenter.buildLoginParam(getAccountName(), "", this.mobileCheckSimilarity);
                try {
                    if (this.mDialogHelper != null) {
                        this.mDialogHelper.hideInputMethod();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.mLoginFlowId = AppInfo.getInstance().getUtdid() + String.valueOf(System.currentTimeMillis() / 1000);
                this.mLoginPresenter.mLoginParam.sdkTraceId = this.mLoginFlowId;
                HashMap hashMap = new HashMap();
                hashMap.put("sdkTraceId", this.mLoginFlowId);
                UserTrackAdapter.control(getPageName(), "confirm", "", hashMap);
                if (this.mLoginPresenter.mLoginParam.ext == null) {
                    this.mLoginPresenter.mLoginParam.ext = new HashMap();
                }
                if (LoginSwitch.isInABTestRegion("canHandleGuideH5", -1)) {
                    this.mLoginPresenter.mLoginParam.ext.put("canHandleGuideH5", "true");
                }
                this.mLoginPresenter.getLoginFlow();
                return;
            case SMS_LOGIN:
                onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN);
                return;
            case PASSWORD:
                String trim = this.mPasswordET.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    toast(getString(R.string.aliuser_sign_in_please_enter_password), 0);
                    return;
                }
                if (this.mDialogHelper != null) {
                    this.mDialogHelper.hideInputMethod();
                }
                String accountName = getAccountName();
                if (this.mRegionTV.getVisibility() == 0) {
                    String phoneCode = getPhoneCode();
                    if (!"86".equals(phoneCode)) {
                        accountName = phoneCode + "-" + accountName;
                    }
                }
                this.mUserLoginPresenter.buildLoginParam(accountName, trim);
                this.mUserLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.PWD_LOGIN, getPageName(), this.mLoginFlowId);
                this.mUserLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.PWD_LOGIN;
                this.mUserLoginPresenter.getLoginParam().utPageName = getPageName();
                if (TextUtils.equals(this.paramModeState, LoginModeState.LOCATION.name())) {
                    this.mUserLoginPresenter.getLoginParam().fromRecommendLogin = true;
                } else {
                    this.mUserLoginPresenter.getLoginParam().fromRecommendLogin = false;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("sdkTraceId", this.mUserLoginPresenter.getLoginParam().sdkTraceId + "");
                UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.PWD_LOGIN, hashMap2);
                if (this.mUserLoginActivity != null) {
                    this.mUserLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
                }
                this.mUserLoginPresenter.login(this.mAttachedActivity, this.mUserLoginPresenter.getLoginParam(), getUICallback());
                return;
            case SIM_LOGIN:
                addControl("onekey");
                onSimVerify();
                return;
            case SCAN_FACE:
                onFaceLogin();
                return;
            case BIOMETRIC:
                onFingerLogin();
                return;
            default:
                return;
        }
    }

    public void onSimVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e54c518", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.loginId = getAccountName();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, getPageName(), this.mLoginFlowId);
        loginParam.loginSourceType = LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN;
        loginParam.utPageName = getPageName();
        if (this.mUserLoginActivity != null) {
            loginParam.alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
        }
        this.mSimLoginPresenter.login(this.mAttachedActivity, loginParam, getUICallback());
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                switch (i) {
                    case 5001:
                        RecommendLoginFragment.this.pwdErrorToSMS();
                        return;
                    case 5002:
                        RecommendLoginFragment.this.onFaceLogin();
                        return;
                    case 5003:
                        RecommendLoginFragment.this.goAlipay();
                        return;
                    case 5004:
                    default:
                        return;
                    case CommonUICallback.ACTION_PWD_ERROR_SHOW_EYE /* 5005 */:
                        if (!RecommendLoginFragment.this.isActive() || !LoginSwitch.getSwitch("show_password_hint", "true")) {
                            return;
                        }
                        RecommendLoginFragment.this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        RecommendLoginFragment.this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                        RecommendLoginFragment.this.mShowPasswordIV.setContentDescription(RecommendLoginFragment.this.getString(R.string.aliuser_assist_password_show));
                        RecommendLoginFragment.this.mShowPasswordIV.setTag(true);
                        UserTrackAdapter.sendControlUT(RecommendLoginFragment.this.getPageName(), "Button-ShowPwd");
                        return;
                    case 5006:
                        if (!RecommendLoginFragment.this.isActive()) {
                            return;
                        }
                        RecommendLoginFragment.this.onGetAccessTokenFail();
                        return;
                    case CommonUICallback.ACTION_ONEKEY_SEND_SMS /* 5007 */:
                        if (!RecommendLoginFragment.this.isActive() || map == null || TextUtils.isEmpty((String) map.get("mobile"))) {
                            return;
                        }
                        RecommendLoginFragment.this.onNeedVerifyMobile("", (String) map.get("mobile"));
                        return;
                    case CommonUICallback.ACTION_HANDLE_SEND_SMS_SUCCESS /* 5008 */:
                        if (!RecommendLoginFragment.this.isActive() || map == null) {
                            return;
                        }
                        RecommendLoginFragment.this.onSendSMSSuccess(((Long) map.get("millSecond")).longValue(), Boolean.parseBoolean("needToast"));
                        return;
                    case CommonUICallback.ACTION_HANDLE_SEND_EMAIL_SUCCESS /* 5009 */:
                        if (!RecommendLoginFragment.this.isActive() || map == null) {
                            return;
                        }
                        RecommendLoginFragment.this.onSendEmailSuccess();
                        return;
                }
            }
        };
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade6443", new Object[]{this});
        } else {
            onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN);
        }
    }

    public void onSendEmailAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0518b72", new Object[]{this});
            return;
        }
        try {
            this.mEmailLoginPresenter.buildEmailLoginParam(getAccountName(), null);
            buildLoginParamUT(this.mEmailLoginPresenter.getLoginParam(), "emailLogin");
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mEmailLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_EMAIL_ACTION, "", "emailLogin", hashMap);
            this.mEmailLoginPresenter.sendEmailCode(this.mAttachedActivity, this.mEmailLoginPresenter.getLoginParam(), getUICallback());
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th);
        }
    }

    public void onSendSmsAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb87b39", new Object[]{this, str});
            return;
        }
        LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
        if (loginFlowReturnData != null && !TextUtils.isEmpty(loginFlowReturnData.maskMobile)) {
            this.mSMSNickLoginPresenter.buildSMSLoginParam(getAccountName(), null, false);
            this.mSMSNickLoginPresenter.getLoginParam().resendAlert = this.mUserLoginActivity.isNeedSMSCheck();
            this.mSMSNickLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
            this.mSMSNickLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
            buildLoginParamUT(this.mSMSNickLoginPresenter.getLoginParam(), LoginType.LocalLoginType.NICK_SMS_LOGIN);
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mSMSNickLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.NICK_SMS_LOGIN, hashMap);
            if (this.mUserLoginActivity != null) {
                this.mSMSNickLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
            }
            this.mSMSNickLoginPresenter.sendSMS(this.mAttachedActivity, this.mSMSNickLoginPresenter.getLoginParam(), getUICallback());
            return;
        }
        try {
            if (LoginSwitch.getSwitch("checkMobileValid", "true") && LoginModeState.SMS_LOGIN.name().equals(this.paramModeState) && !isMobileValid(getAccountName())) {
                toast(getString(R.string.aliuser_phone_number_invalidate), 0);
                UserTrackAdapter.sendUT(getPageName(), UTConstans.CustomEvent.UT_MOBILE_INVALID);
                return;
            }
            this.mMobileLoginPresenter.buildSMSLoginParam(getAccountName(), null, false);
            this.mMobileLoginPresenter.getLoginParam().resendAlert = this.mUserLoginActivity.isNeedSMSCheck();
            this.mMobileLoginPresenter.getLoginParam().whatsAppInstalled = this.whatsApp;
            this.mMobileLoginPresenter.getLoginParam().whatsAppBusinessInstalled = this.whatsAppBusiness;
            if (this.mUserLoginActivity != null) {
                this.mMobileLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
            }
            buildLoginParamUT(this.mMobileLoginPresenter.getLoginParam(), str);
            if (this.mCheckBoxSwitch && this.mMobileLoginPresenter.getLoginParam().ext != null) {
                this.mMobileLoginPresenter.getLoginParam().ext.put("showReigsterPolicy", "true");
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", str, hashMap2);
            if (CountryUtil.supportOverseaSimLogin(this.mUserLoginActivity.fireAppLaunchRes, this.mRegionInfo, false)) {
                UserTrackAdapter.control(getPageName(), "supportOverseaSimLogin", String.valueOf(NetworkUtil.getNetworkInfoType(this.mUserLoginActivity)), str, hashMap2);
                this.mMobileLoginPresenter.getOverseaSimVerifyUrl(new LoginTasksCallback<LoginReturnData>() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.7
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
                            RecommendLoginFragment.access$600(RecommendLoginFragment.this);
                        }
                    }

                    @Override // com.ali.user.mobile.callback.LoginTasksCallback
                    public void onCancel() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("379d4540", new Object[]{this});
                        } else {
                            RecommendLoginFragment.access$600(RecommendLoginFragment.this);
                        }
                    }
                });
                return;
            }
            sendSms();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void buildLoginParamUT(LoginParam loginParam, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47213ff", new Object[]{this, loginParam, str});
            return;
        }
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = str;
        loginParam.sdkTraceId = ApiReferer.generateTraceId(str, getPageName(), this.mLoginFlowId);
    }

    private boolean sendSms() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7422acbc", new Object[]{this})).booleanValue();
        }
        this.mMobileLoginPresenter.sendSMS(this.mAttachedActivity, this.mMobileLoginPresenter.getLoginParam(), getUICallback());
        return true;
    }

    public void onFaceLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be39df4", new Object[]{this});
        } else if (ServiceFactory.getService(FaceService.class) == null) {
        } else {
            LoginParam loginParam = new LoginParam();
            loginParam.hid = this.mLoginParam.hid;
            if (this.mUserLoginActivity != null) {
                loginParam.alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
            }
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName(), this.mLoginFlowId);
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            LoginContext.sCurrentLoginParam = loginParam;
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (loginFlowReturnData != null && loginFlowReturnData.ext != null && "true".equals(this.mLoginFlowReturnData.ext.get("preCheckVerify"))) {
                this.mFaceLoginPresenter.activeFaceLogin(loginParam);
            } else {
                this.mFaceLoginPresenter.fetchScanToken(loginParam);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        EditText editText = this.mLoginAccountET;
        return editText == null ? "" : editText.getText().toString().trim().replaceAll(" ", "");
    }

    public String getAccountNameForPassword(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7d6cffed", new Object[]{this, str}) : TextUtils.isEmpty(str) ? "" : str.trim().replaceAll(" ", "");
    }

    public void editLoginAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cedbb35", new Object[]{this});
        } else if (this.degradeToSMS || !TextUtils.equals(this.paramModeState, LoginModeState.LOCATION.name()) || this.supportOverseaSimLogin) {
        } else {
            if (this.mCurrentLoginModeState != LoginModeState.LOCATION) {
                updateLoginModeState(LoginModeState.LOCATION);
                resetLoginAccountETPadding();
                LoginParam loginParam = this.mLoginParam;
                if (loginParam != null && !TextUtils.isEmpty(loginParam.phoneCode)) {
                    addControl("sms_input");
                } else {
                    addControl("change_nick");
                }
                initParams();
                onPwdError();
                return;
            }
            addControl("input");
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else {
            super.showBottomMenuForFirstPage();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
            return;
        }
        EditText editText = this.mLoginAccountET;
        if (editText == null) {
            return;
        }
        this.mOriginUserInput = str;
        editText.setText(str);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onForgetPasswordAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf966a84", new Object[]{this});
            return;
        }
        String accountName = getAccountName();
        if (this.mRegionTV.getVisibility() == 0) {
            String phoneCode = getPhoneCode();
            if (!"86".equals(phoneCode)) {
                accountName = phoneCode + "-" + accountName;
            }
        }
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, (userLoginPresenter == null || userLoginPresenter.getLoginParam() == null) ? "" : this.mUserLoginPresenter.mLoginParam.source);
    }

    public void initRegionInfo(LoginParam loginParam) {
        LoginFlowReturnData loginFlowReturnData;
        RegionInfo currentRegion;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1fcd56", new Object[]{this, loginParam});
        } else if (this.degradeToSMS) {
            LoginTLogAdapter.e(getPageName(), "degradeToSMS");
        } else {
            LoginApprearanceExtensions appreanceExtentions = AliUserLogin.getAppreanceExtentions();
            if ((appreanceExtentions != null && !appreanceExtentions.needCountryModule()) || ((loginFlowReturnData = this.mLoginFlowReturnData) != null && !TextUtils.isEmpty(loginFlowReturnData.maskMobile))) {
                this.mRegionTV.setVisibility(8);
                return;
            }
            if (loginParam != null) {
                currentRegion = new RegionInfo();
                currentRegion.domain = loginParam.countryCode;
                currentRegion.code = loginParam.phoneCode;
            } else {
                currentRegion = DataProviderFactory.getDataProvider().getCurrentRegion();
            }
            if (currentRegion == null || TextUtils.isEmpty(currentRegion.domain)) {
                currentRegion = DataProviderFactory.getDataProvider().getCurrentRegion();
            }
            if (currentRegion == null || TextUtils.isEmpty(currentRegion.domain) || TextUtils.isEmpty(currentRegion.code)) {
                currentRegion = CountryUtil.matchRegionFromLocal(getContext(), currentRegion == null ? "" : currentRegion.domain);
            }
            if (currentRegion == null) {
                return;
            }
            this.mRegionInfo = currentRegion;
            this.mRegionTV.setVisibility(0);
            this.mRegionTV.setText(this.mRegionInfo.code);
            resizeLoginAccountETPadding();
        }
    }

    public void resizeLoginAccountETPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244e2d91", new Object[]{this});
        } else {
            this.mRegionTV.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    if (RecommendLoginFragment.access$700(RecommendLoginFragment.this) == 0) {
                        RecommendLoginFragment recommendLoginFragment = RecommendLoginFragment.this;
                        RecommendLoginFragment.access$702(recommendLoginFragment, recommendLoginFragment.mLoginAccountET.getPaddingLeft());
                    }
                    RecommendLoginFragment.this.mRegionTV.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    RecommendLoginFragment.this.mLoginAccountET.setPadding(RecommendLoginFragment.this.mRegionTV.getWidth() + RecommendLoginFragment.access$700(RecommendLoginFragment.this), RecommendLoginFragment.this.mLoginAccountET.getPaddingTop(), RecommendLoginFragment.this.mLoginAccountET.getPaddingRight(), RecommendLoginFragment.this.mLoginAccountET.getPaddingBottom());
                }
            });
        }
    }

    public void resetLoginAccountETPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4b0156", new Object[]{this});
            return;
        }
        if (this.originalAccountETPadding == 0) {
            this.originalAccountETPadding = this.mLoginAccountET.getPaddingLeft();
        }
        EditText editText = this.mLoginAccountET;
        editText.setPadding(this.originalAccountETPadding, editText.getPaddingTop(), this.mLoginAccountET.getPaddingRight(), this.mLoginAccountET.getPaddingBottom());
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 2001) {
            if (intent == null) {
                return;
            }
            RegionInfo regionInfo = (RegionInfo) intent.getParcelableExtra("region");
            this.supportOverseaSimLogin = CountryUtil.supportOverseaSimLogin(this.mUserLoginActivity.fireAppLaunchRes, regionInfo, false);
            if (regionInfo != null && this.mRegionInfo != null && !TextUtils.equals(regionInfo.code, this.mRegionInfo.code)) {
                this.degradeToSMS = true;
                this.mAvailableLoginModes.remove(LoginModeState.SCAN_FACE.name());
                this.mAvailableLoginModes.remove(LoginModeState.SIM_LOGIN.name());
                updateLoginModeState(this.mCurrentLoginModeState);
            }
            this.mRegionInfo = regionInfo;
            RegionInfo regionInfo2 = this.mRegionInfo;
            if (regionInfo2 == null) {
                return;
            }
            this.mRegionTV.setText(regionInfo2.code);
            return;
        }
        int i3 = AnonymousClass17.$SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[this.mCurrentLoginModeState.ordinal()];
        if (i3 == 1) {
            this.mLoginPresenter.onActivityResult(i, i2, intent);
        } else if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        if (i == 1001) {
                            this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
                        } else if (i == 1003) {
                            this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
                        } else {
                            this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
                        }
                    }
                } else if (i == 1001) {
                    this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
                } else if (i == 1003) {
                    this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
                } else {
                    this.mSimLoginPresenter.onActivityResult(i, i2, intent);
                }
            } else if (i == 1001) {
                this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
            } else if (i == 1003) {
                this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
            } else if (i == 1004) {
                this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
            } else {
                this.mUserLoginPresenter.onActivityResult(i, i2, intent);
            }
        } else if (i == 1004) {
            this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
        } else if (i == 1003) {
            this.mSMSNickLoginPresenter.onActivityResult(i, i2, intent);
        } else {
            this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
        }
        c.a(SNSPlatform.PLATFORM_GOOGLE, i, i2, intent);
        c.a(SNSPlatform.PLATFORM_FACEBOOK, i, i2, intent);
    }

    public void updateLoginModeState(LoginModeState loginModeState) {
        TextView textView;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c8f43a", new Object[]{this, loginModeState});
            return;
        }
        this.mCurrentLoginModeState = loginModeState;
        TextView textView2 = this.mTipsTV;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        updateLoginHint();
        this.mLoginAccountET.setInputType(1);
        this.mRegionTV.setVisibility(loginModeState.regionTVVisibility);
        String str2 = "";
        if (loginModeState == LoginModeState.LOCATION) {
            if (!TextUtils.isEmpty(this.mOriginUserInput)) {
                this.mLoginAccountET.setText(this.mOriginUserInput);
                this.mLoginAccountET.setSelection(this.mOriginUserInput.length());
            }
        } else if (loginModeState == LoginModeState.PASSWORD) {
            this.mLoginAccountET.setText(getAccountNameForPassword(this.mRecommendLoginId));
            this.mPasswordET.setText(str2);
            TextView textView3 = this.mTipsTV;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else if (loginModeState == LoginModeState.SMS_LOGIN || loginModeState == LoginModeState.SIM_LOGIN) {
            this.mLoginAccountET.setText(this.mRecommendLoginId);
            if (this.supportOverseaSimLogin || LoginModeState.SMS_LOGIN.name().equals(this.paramModeState)) {
                this.mLoginAccountET.setInputType(2);
            } else {
                this.mLoginAccountET.setInputType(1);
            }
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (loginFlowReturnData != null && !TextUtils.isEmpty(loginFlowReturnData.maskMobile) && (textView = this.mTipsTV) != null) {
                textView.setVisibility(0);
                this.mRegionTV.setVisibility(8);
                TextView textView4 = this.mTipsTV;
                int i = R.string.aliuser_sms_nick_login_tips;
                textView4.setText(getString(i, this.mLoginFlowReturnData.maskMobile + " "));
            }
        } else {
            this.mLoginAccountET.setText(this.mRecommendLoginId);
        }
        if (loginModeState == LoginModeState.SMS_LOGIN || loginModeState == LoginModeState.SIM_LOGIN) {
            initRegionInfo(this.mLoginParam);
        } else if (loginModeState == LoginModeState.PASSWORD) {
            LoginFlowReturnData loginFlowReturnData2 = this.mLoginFlowReturnData;
            if (loginFlowReturnData2 != null && !TextUtils.isEmpty(loginFlowReturnData2.countryCode)) {
                this.mRegionTV.setVisibility(0);
                initRegionInfo(this.mLoginParam);
            } else {
                this.mRegionTV.setVisibility(8);
                resetLoginAccountETPadding();
            }
        } else {
            resetLoginAccountETPadding();
        }
        this.mRightFuncTV.setVisibility(loginModeState.rightFuncTVVisibility);
        if (this.mCheckBoxSwitch && this.mProtocolTV != null) {
            this.mProtocolTV.setVisibility(0);
            if (loginModeState.protocolVisibility != 0 || ServiceFactory.getService(NumberAuthService.class) == null || ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() == null) {
                str = str2;
            } else {
                str2 = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
                str = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
            }
            generateProtocol(str2, str);
        }
        if (loginModeState.passwordVisibility == 0) {
            viewVisibleAnimate(this.mPasswordRL, 40);
        } else {
            viewGoneAnimate(this.mPasswordRL);
        }
        this.mRecommendLoginNextBtn.setText(loginModeState.loginBtnText);
        if (this.supportOverseaSimLogin || LoginModeState.SMS_LOGIN.name().equals(this.paramModeState) || LoginModeState.PASSWORD.name().equals(this.paramModeState)) {
            if (TextUtils.equals(LoginModeState.SMS_LOGIN.name(), loginModeState.name())) {
                this.mRecommendLoginNextBtn.setText(R.string.aliuser_confirm);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(LoginModeState.PASSWORD.name());
            arrayList.add(LoginModeState.SMS_LOGIN.name());
            this.mAvailableLoginModes = arrayList;
            updateOtherLoginMode(loginModeState);
            return;
        }
        updateOtherLoginMode(loginModeState);
    }

    public void updateOtherLoginMode(final LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1070e3", new Object[]{this, loginModeState});
            return;
        }
        List<String> list = this.mAvailableLoginModes;
        if (list == null || list.size() == 0) {
            this.mLeftFuncTV.setVisibility(8);
        } else if (this.mAvailableLoginModes.size() == 1) {
            this.mLeftFuncTV.setVisibility(8);
        } else if (this.mAvailableLoginModes.size() == 2) {
            if (loginModeState != LoginModeState.LOCATION) {
                for (String str : this.mAvailableLoginModes) {
                    if (!TextUtils.equals(loginModeState.name(), str)) {
                        final LoginModeState valueOf = LoginModeState.valueOf(str);
                        if (valueOf.loginModeName > 0) {
                            this.mLeftFuncTV.setVisibility(0);
                            if (this.fromOversea && TextUtils.equals(valueOf.name(), LoginModeState.SMS_LOGIN.name())) {
                                this.mLeftFuncTV.setText(R.string.aliuser_login_sms_login_oversea);
                            } else {
                                this.mLeftFuncTV.setText(valueOf.loginModeName);
                            }
                            this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.9
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                        return;
                                    }
                                    RecommendLoginFragment.this.switchLoginModeHit(valueOf);
                                    RecommendLoginFragment.this.updateLoginModeState(valueOf);
                                }
                            });
                        } else {
                            this.mLeftFuncTV.setVisibility(8);
                        }
                    }
                }
                return;
            }
            this.mLeftFuncTV.setVisibility(8);
        } else if (loginModeState != LoginModeState.LOCATION) {
            this.mLeftFuncTV.setVisibility(0);
            this.mLeftFuncTV.setText(R.string.aliuser_login_more_login);
            this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    RecommendLoginFragment.access$800(RecommendLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER);
                    RecommendLoginFragment.this.showMoreLoginModeMenu(loginModeState);
                }
            });
        } else {
            this.mLeftFuncTV.setVisibility(8);
        }
    }

    public void switchLoginModeHit(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9521cfad", new Object[]{this, loginModeState});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), loginModeState.controllName, this.mRecommendLoginType);
        }
    }

    public void showMoreLoginModeMenu(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940a8aaf", new Object[]{this, loginModeState});
            return;
        }
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        ArrayList arrayList = new ArrayList();
        for (final String str : this.mAvailableLoginModes) {
            if (!TextUtils.equals(loginModeState.name(), str)) {
                MenuItem menuItem = new MenuItem();
                final LoginModeState valueOf = LoginModeState.valueOf(str);
                if (valueOf.loginModeName > 0) {
                    menuItem.setText(getString(valueOf.loginModeName));
                    menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.11
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                        public void onClickMenuItem(View view, MenuItem menuItem2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                            } else if (!RecommendLoginFragment.this.isActive()) {
                            } else {
                                RecommendLoginFragment.this.switchLoginModeHit(valueOf);
                                if (TextUtils.equals(str, LoginModeState.SCAN_FACE.name())) {
                                    RecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_FACE);
                                } else if (TextUtils.equals(str, LoginModeState.SMS_LOGIN.name()) && !TextUtils.isEmpty(RecommendLoginFragment.this.mLoginParam.phoneCode)) {
                                    RecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_SEND_SMS);
                                } else if (TextUtils.equals(str, LoginModeState.BIOMETRIC.name())) {
                                    RecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_FINGER);
                                } else if (TextUtils.equals(str, LoginModeState.EMAIL_CODE_LOGIN.name())) {
                                    RecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_EMAIL_SEND);
                                } else if (TextUtils.equals(str, LoginModeState.SIM_LOGIN.name())) {
                                    RecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_SIM_VERIFY);
                                } else {
                                    RecommendLoginFragment.this.updateLoginModeState(valueOf);
                                }
                            }
                        }
                    });
                    arrayList.add(menuItem);
                }
            }
        }
        bottomMenuFragment.setMenuItems(arrayList);
        bottomMenuFragment.setMenuTitle(getString(R.string.aliuser_more_login_mode_title));
        if (TextUtils.equals(this.mRecommendLoginType, LoginModeState.SMS_LOGIN.name())) {
            bottomMenuFragment.setControlHitPrefix("sms_chooseother");
        } else if (TextUtils.equals(this.mRecommendLoginType, LoginModeState.PASSWORD.name())) {
            bottomMenuFragment.setControlHitPrefix("pwd_chooseother");
        } else if (TextUtils.equals(this.mRecommendLoginType, LoginModeState.SIM_LOGIN.name())) {
            bottomMenuFragment.setControlHitPrefix("onekey_chooseother");
        } else if (TextUtils.equals(this.mRecommendLoginType, LoginModeState.SCAN_FACE.name())) {
            bottomMenuFragment.setControlHitPrefix("face_chooseother");
        } else if (TextUtils.equals(this.mRecommendLoginType, LoginModeState.BIOMETRIC.name())) {
            bottomMenuFragment.setControlHitPrefix("bio_chooseother");
        }
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void updateAccountInfo(LoginFlowReturnData loginFlowReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4189dac", new Object[]{this, loginFlowReturnData});
        } else {
            this.mLoginFlowReturnData = loginFlowReturnData;
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendSmsLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6129f86c", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendsmsLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && (editText = this.mLoginAccountET) != null) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            initRegionInfo(loginParam);
            updateLoginModeState(LoginModeState.SMS_LOGIN);
            this.mAccountRL.requestFocus();
            if (!LoginSwitch.getSwitch(LoginSwitch.REG_TO_LOGIN_SENDSMS, "true") || !loginParam.callRpc) {
                return;
            }
            onClickLoginAction();
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendPwdLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579d2708", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendpwdLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && (editText = this.mLoginAccountET) != null) {
                editText.setText(getAccountNameForPassword(loginParam.loginId));
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.PASSWORD);
            if (LoginSwitch.isInABTestRegion("pwdShowRegion", 10000) && !TextUtils.isEmpty(loginParam.countryCode)) {
                this.mRegionTV.setVisibility(0);
                initRegionInfo(loginParam);
            } else {
                this.mRegionTV.setVisibility(8);
            }
            this.mPasswordET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RecommendLoginFragment.this.mPasswordRL.setVisibility(0);
                    if (RecommendLoginFragment.this.getContext() == null || !RecommendLoginFragment.this.isActive() || RecommendLoginFragment.this.mPasswordET == null) {
                        return;
                    }
                    RecommendLoginFragment.this.mPasswordET.requestFocus();
                    RecommendLoginFragment.this.mPasswordET.requestFocusFromTouch();
                    InputMethodManager inputMethodManager = (InputMethodManager) RecommendLoginFragment.this.getContext().getSystemService("input_method");
                    if (inputMethodManager == null) {
                        return;
                    }
                    inputMethodManager.showSoftInput(RecommendLoginFragment.this.mPasswordET, 1);
                }
            }, 300L);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendSimLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1214ae", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendsimLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && (editText = this.mLoginAccountET) != null) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            initRegionInfo(loginParam);
            updateLoginModeState(LoginModeState.SIM_LOGIN);
            this.mAccountRL.requestFocus();
            if (!LoginSwitch.getSwitch(LoginSwitch.SIM_LOGIN_AUTO, "true")) {
                return;
            }
            onClickLoginAction();
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendFaceLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fd7d0e", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendscanfaceLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && (editText = this.mLoginAccountET) != null) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.SCAN_FACE);
            this.mAccountRL.requestFocus();
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendBioLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407fa49d", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendbioLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && (editText = this.mLoginAccountET) != null) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.BIOMETRIC);
            this.mAccountRL.requestFocus();
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendEmailLogin(String str, List<String> list, LoginParam loginParam) {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38909549", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendemailLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && (editText = this.mLoginAccountET) != null) {
                editText.setText(loginParam.loginId);
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.EMAIL_CODE_LOGIN);
            this.mAccountRL.requestFocus();
        }
    }

    private void updateLoginParamWhenRecommend(String str, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e32d43", new Object[]{this, str, loginParam});
            return;
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginParam.hid = loginParam.hid;
        this.mLoginParam.countryCode = loginParam.countryCode;
        this.mLoginParam.phoneCode = loginParam.phoneCode;
        View view = this.mAccountClearBtn;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void showFindPasswordAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8313525e", new Object[]{this, loginParam, rpcResponse});
        } else {
            showFindPasswordAlert(loginParam, rpcResponse, this.mUserLoginPresenter, this.mPasswordET, this.mShowPasswordIV);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void pwdErrorToSMS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab6e9da", new Object[]{this});
        } else {
            onSendSmsAction(LoginType.LocalLoginType.SMS_LOGIN);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onNeedAlert(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6912462", new Object[]{this, loginParam, rpcResponse});
        } else if (rpcResponse == null || TextUtils.isEmpty(rpcResponse.codeGroup) || !"mobileNeedCheck".equals(rpcResponse.codeGroup)) {
        } else {
            if (rpcResponse.returnValue == null || rpcResponse.returnValue.ext == null) {
                str = "";
            } else {
                rpcResponse.returnValue.ext.get("dialogTitle");
                str = rpcResponse.returnValue.ext.get("dialogContent");
            }
            UserTrackAdapter.sendUT(getPageName(), "CheckSimilarity");
            alert(str, "", getString(R.string.aliuser_re_enter), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        RecommendLoginFragment.access$900(RecommendLoginFragment.this, "Button-Alert-CheckSimilarity-no");
                    }
                }
            }, getString(R.string.aliuser_continue_use), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (!RecommendLoginFragment.this.isActive()) {
                    } else {
                        RecommendLoginFragment recommendLoginFragment = RecommendLoginFragment.this;
                        recommendLoginFragment.mobileCheckSimilarity = false;
                        RecommendLoginFragment.access$1000(recommendLoginFragment, "Button-Alert-CheckSimilarity-yes");
                        RecommendLoginFragment.this.addCheckAction(LoginClickAction.ACTION_LOGIN);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onGuideH5(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse) {
        final String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a350433f", new Object[]{this, loginParam, rpcResponse});
            return;
        }
        if (rpcResponse.returnValue == null || rpcResponse.returnValue.ext == null) {
            str = "";
            str2 = str;
            str3 = str2;
        } else {
            String str4 = rpcResponse.returnValue.ext.get("dialogActionText");
            str = rpcResponse.returnValue.ext.get("dialogActionUrl");
            str2 = rpcResponse.returnValue.ext.get("dialogContent");
            str3 = str4;
        }
        alert(str2, "", getString(R.string.aliuser_continue_login), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else if (!RecommendLoginFragment.this.isActive()) {
                } else {
                    dialogInterface.dismiss();
                    if (RecommendLoginFragment.this.mLoginPresenter.mLoginParam.ext != null) {
                        RecommendLoginFragment.this.mLoginPresenter.mLoginParam.ext.remove("canHandleGuideH5");
                    }
                    RecommendLoginFragment.this.mLoginPresenter.getLoginFlow();
                }
            }
        }, str3, new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.RecommendLoginFragment.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else if (!RecommendLoginFragment.this.isActive()) {
                } else {
                    dialogInterface.dismiss();
                    LoginReturnData loginReturnData = new LoginReturnData();
                    loginReturnData.site = RecommendLoginFragment.this.getLoginSite();
                    NavigatorManager.getInstance().navToWebViewPage(RecommendLoginFragment.this.getBaseActivity(), str, null, loginReturnData);
                }
            }
        });
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8f5468", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (!isActive()) {
        } else {
            Intent intent = new Intent();
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (loginFlowReturnData != null && !TextUtils.isEmpty(loginFlowReturnData.maskMobile)) {
                intent.putExtra("maskMobile", this.mLoginFlowReturnData.maskMobile);
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mSMSNickLoginPresenter.mLoginParam));
            } else {
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mMobileLoginPresenter.mLoginParam));
            }
            if (this.takeAvaliable) {
                intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_METHODS, JSON.toJSONString(this.mAvailableLoginModes));
            }
            intent.putExtra("pageTag", FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG);
            LoginFlowReturnData loginFlowReturnData2 = this.mLoginFlowReturnData;
            if (loginFlowReturnData2 != null && loginFlowReturnData2.ext != null) {
                intent.putExtra("preCheckVerify", this.mLoginFlowReturnData.ext.get("preCheckVerify"));
                intent.putExtra("verify", this.mLoginFlowReturnData.ext.get("verify"));
            }
            intent.putExtra("havanaId", this.mLoginParam.hid);
            goToSMSVerificationPage(intent);
        }
    }

    public void onSendEmailSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a4edf5", new Object[]{this});
        } else if (!isActive()) {
        } else {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mEmailLoginPresenter.mLoginParam));
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_METHODS, JSON.toJSONString(this.mAvailableLoginModes));
            intent.putExtra("pageTag", FragmentConstant.RECOMMEND_LOGIN_FRAGMENT_TAG);
            LoginFlowReturnData loginFlowReturnData = this.mLoginFlowReturnData;
            if (loginFlowReturnData != null && loginFlowReturnData.ext != null) {
                intent.putExtra("preCheckVerify", this.mLoginFlowReturnData.ext.get("preCheckVerify"));
                intent.putExtra("verify", this.mLoginFlowReturnData.ext.get("verify"));
            }
            intent.putExtra("havanaId", this.mLoginParam.hid);
            goToSMSVerificationPage(intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSSendFail(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05c24e6", new Object[]{this, rpcResponse});
        } else if (rpcResponse == null || rpcResponse.code != 14100 || !isActive()) {
        } else {
            onSendSMSSuccess(60000L, false);
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSMSOverLimit(RpcResponse rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce5f1f9", new Object[]{this, rpcResponse});
        } else {
            onSMSSendFail(rpcResponse);
        }
    }

    public void goToSMSVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
        } else if (this.mUserLoginActivity == null) {
        } else {
            this.mUserLoginActivity.goToSMSVerificationPage(intent);
            AliUserSMSLoginVerificationFragment.mLoginMethodChange = this;
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onFlowLimitLocked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117ae149", new Object[]{this, str});
        } else if (!isActive()) {
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(LoginModeState.PASSWORD.name());
            LoginParam loginParam = new LoginParam();
            loginParam.loginId = str;
            loginParam.countryCode = "CN";
            loginParam.phoneCode = "+86";
            if (isChineseMobile(str)) {
                arrayList.add(LoginModeState.SMS_LOGIN.name());
                onRecommendSmsLogin(LoginModeState.SMS_LOGIN.name(), arrayList, loginParam);
                return;
            }
            onRecommendPwdLogin(LoginModeState.PASSWORD.name(), arrayList, loginParam);
        }
    }

    public boolean isChineseMobile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a71e97ba", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.replaceAll(" ", "").matches("^{0,1}1\\d{10}$");
        }
        return false;
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        RecommendLoginPresenter recommendLoginPresenter = this.mLoginPresenter;
        if (recommendLoginPresenter != null) {
            recommendLoginPresenter.onDestory();
        }
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null) {
            userLoginPresenter.onDestory();
        }
        UserMobileLoginPresenter userMobileLoginPresenter = this.mMobileLoginPresenter;
        if (userMobileLoginPresenter != null) {
            userMobileLoginPresenter.onDestory();
        }
        FaceLoginPresenter faceLoginPresenter = this.mFaceLoginPresenter;
        if (faceLoginPresenter != null) {
            faceLoginPresenter.onDestory();
        }
        SimVerifyPresenter simVerifyPresenter = this.mSimLoginPresenter;
        if (simVerifyPresenter != null) {
            simVerifyPresenter.onDestory();
        }
        SMSNickLoginPresenter sMSNickLoginPresenter = this.mSMSNickLoginPresenter;
        if (sMSNickLoginPresenter == null) {
            return;
        }
        sMSNickLoginPresenter.onDestory();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        addControl("close");
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onNeedVerifyMobile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1188b84b", new Object[]{this, str, str2});
        } else if (!isActive()) {
        } else {
            this.mMobileLoginPresenter.buildSMSLoginParam(str2, null, false);
            this.mMobileLoginPresenter.sendSMS();
        }
    }

    @Override // com.ali.user.mobile.login.ui.ILoginMethodChange
    public void onMethodChange(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8109c178", new Object[]{this, loginModeState});
            return;
        }
        switchLoginModeHit(loginModeState);
        updateLoginModeState(loginModeState);
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
}
