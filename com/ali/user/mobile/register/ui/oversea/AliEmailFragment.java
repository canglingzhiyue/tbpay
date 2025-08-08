package com.ali.user.mobile.register.ui.oversea;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.EmailLoginPresenter;
import com.ali.user.mobile.login.presenter.LoginFlowReturnData;
import com.ali.user.mobile.login.presenter.RecommendLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.LoginModeState;
import com.ali.user.mobile.login.ui.RecommendLoginView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.register.RegistConstants;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.LanguageUtil;
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
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AliEmailFragment extends BaseLoginFragment implements View.OnClickListener, RecommendLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ui.AliEmailFragment";
    public TextView bottomTV;
    public boolean isRegState;
    public View mAccountClearBtn;
    public RelativeLayout mAccountRL;
    public TextView mAlipay;
    public TextView mAlipayHK;
    public View mAlipayHKLL;
    public View mAlipayLL;
    public EmailLoginPresenter mEmailLoginPresenter;
    public TextView mFacebook;
    public LinearLayout mFbLL;
    public LinearLayout mGgLL;
    public TextView mGoogle;
    public TextView mLeftFuncTV;
    public AutoCompleteTextView mLoginAccountET;
    public String mLoginFlowId;
    public LoginFlowReturnData mLoginFlowReturnData;
    public LoginParam mLoginParam;
    public RecommendLoginPresenter mLoginPresenter;
    public TextView mMainTitleTV;
    public String mOriginUserInput;
    public View mPasswordClearBtn;
    public EditText mPasswordET;
    public RelativeLayout mPasswordRL;
    public String mRecommendLoginId;
    public Button mRecommendLoginNextBtn;
    public String mRecommendLoginType;
    public View mRightFuncLL;
    public TextView mRightTV;
    public ImageView mShowPasswordIV;
    public UserLoginPresenter mUserLoginPresenter;
    public String paramModeState;
    public TextView passwordHintTV;
    public TextView snsTextView;
    public LoginModeState mCurrentLoginModeState = LoginModeState.LOCATION;
    private boolean needPwdInputUT = true;
    private boolean accountUT = true;
    public List<String> mAvailableLoginModes = new ArrayList();
    public String[] emailSuffixes = {"gmail.com", "hotmail.com", "yahoo.es", "outlook.com", "icloud.com", "163.com", "msn.com", "mail.ru", "yandex.ru", "yandex.com"};
    private boolean isDropdownVisible = false;

    /* renamed from: com.ali.user.mobile.register.ui.oversea.AliEmailFragment$13  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass13 {
        public static final /* synthetic */ int[] $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState = new int[LoginModeState.values().length];

        static {
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.EMAIL_CODE_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.EMAIL_REG_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[LoginModeState.PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1541317479);
        kge.a(227130239);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(AliEmailFragment aliEmailFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1829513635:
                super.doRealAction(((Number) objArr[0]).intValue());
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -353043723:
                super.resetActionBar();
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public HistoryAccount getHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("81832384", new Object[]{this});
        }
        return null;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "page_email_login";
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public boolean needAutoReg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24fe9ffa", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onFlowLimitLocked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117ae149", new Object[]{this, str});
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade6443", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.BaseView
    public void onGetRegion(List<RegionInfo> list, HashMap<String, Integer> hashMap, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edae3301", new Object[]{this, list, hashMap, list2});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onGuideH5(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a350433f", new Object[]{this, loginParam, rpcResponse});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onNeedAlert(LoginParam loginParam, RpcResponse<LoginFlowReturnData> rpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6912462", new Object[]{this, loginParam, rpcResponse});
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onNeedVerifyMobile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1188b84b", new Object[]{this, str, str2});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendBioLogin(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407fa49d", new Object[]{this, str, list, loginParam});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendEmailLogin(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38909549", new Object[]{this, str, list, loginParam});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendFaceLogin(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fd7d0e", new Object[]{this, str, list, loginParam});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendSimLogin(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1214ae", new Object[]{this, str, list, loginParam});
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendSmsLogin(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6129f86c", new Object[]{this, str, list, loginParam});
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public void updateLoginHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da5e7ce", new Object[]{this});
        }
    }

    public static /* synthetic */ boolean access$002(AliEmailFragment aliEmailFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5e95ac9", new Object[]{aliEmailFragment, new Boolean(z)})).booleanValue();
        }
        aliEmailFragment.alipayInstalled = z;
        return z;
    }

    public static /* synthetic */ void access$1000(AliEmailFragment aliEmailFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863e51dc", new Object[]{aliEmailFragment});
        } else {
            aliEmailFragment.goAlipay();
        }
    }

    public static /* synthetic */ boolean access$102(AliEmailFragment aliEmailFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5018e2e8", new Object[]{aliEmailFragment, new Boolean(z)})).booleanValue();
        }
        aliEmailFragment.alipayInstalled = z;
        return z;
    }

    public static /* synthetic */ void access$1100(AliEmailFragment aliEmailFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fdc9dd", new Object[]{aliEmailFragment});
        } else {
            aliEmailFragment.pwdErrorToSMS();
        }
    }

    public static /* synthetic */ boolean access$200(AliEmailFragment aliEmailFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79b9fd73", new Object[]{aliEmailFragment})).booleanValue() : aliEmailFragment.needPwdInputUT;
    }

    public static /* synthetic */ boolean access$202(AliEmailFragment aliEmailFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba486b07", new Object[]{aliEmailFragment, new Boolean(z)})).booleanValue();
        }
        aliEmailFragment.needPwdInputUT = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(AliEmailFragment aliEmailFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7797574", new Object[]{aliEmailFragment})).booleanValue() : aliEmailFragment.accountUT;
    }

    public static /* synthetic */ boolean access$302(AliEmailFragment aliEmailFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2477f326", new Object[]{aliEmailFragment, new Boolean(z)})).booleanValue();
        }
        aliEmailFragment.accountUT = z;
        return z;
    }

    public static /* synthetic */ boolean access$402(AliEmailFragment aliEmailFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ea77b45", new Object[]{aliEmailFragment, new Boolean(z)})).booleanValue();
        }
        aliEmailFragment.isDropdownVisible = z;
        return z;
    }

    public static /* synthetic */ void access$500(AliEmailFragment aliEmailFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62dd6bc", new Object[]{aliEmailFragment, str});
        } else {
            aliEmailFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$600(AliEmailFragment aliEmailFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da9b07d", new Object[]{aliEmailFragment, str});
        } else {
            aliEmailFragment.addControl(str);
        }
    }

    public static /* synthetic */ String access$700(AliEmailFragment aliEmailFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a9d1b5ac", new Object[]{aliEmailFragment}) : aliEmailFragment.mSource;
    }

    public static /* synthetic */ BaseActivity access$800(AliEmailFragment aliEmailFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("69756d2b", new Object[]{aliEmailFragment}) : aliEmailFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$900(AliEmailFragment aliEmailFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d2dc4d", new Object[]{aliEmailFragment, new Integer(i)});
        } else {
            aliEmailFragment.onCheckLogin(i);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void resetActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4faf5", new Object[]{this});
        } else if (!LanguageUtil.isChineseLanguage()) {
        } else {
            super.resetActionBar();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_recommend_oversea_email;
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

    private void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                this.mPreviousChecked = arguments.getBoolean("check");
                this.isRegState = arguments.getBoolean("isRegState");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (this.mLoginParam == null) {
            this.mLoginParam = new LoginParam();
        }
        this.mLoginPresenter = new RecommendLoginPresenter(this, this.mLoginParam.m102clone());
        this.mEmailLoginPresenter = new EmailLoginPresenter(this, this.mLoginParam.m102clone());
        this.mUserLoginPresenter = new UserLoginPresenter(this, this.mLoginParam.m102clone());
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mUserLoginActivity = (UserLoginActivity) getActivity();
        this.snsTextView = (TextView) view.findViewById(R.id.aliuser_sns_hint_tv);
        this.mAlipayHK = (TextView) view.findViewById(R.id.ali_user_login_alipayhk_login_tv);
        this.mAlipayHKLL = view.findViewById(R.id.aliuser_sns_alipayhk_ll);
        this.mAlipayHK.setOnClickListener(this);
        this.mAlipay = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        this.mAlipayLL = view.findViewById(R.id.aliuser_sns_alipay_ll);
        TextView textView = this.mAlipay;
        if (textView != null) {
            textView.setOnClickListener(this);
            showAlipay();
        }
        this.mGoogle = (TextView) view.findViewById(R.id.aliuser_recommend_google);
        this.mFacebook = (TextView) view.findViewById(R.id.aliuser_recommend_facebook);
        boolean supportGoogleFB = UserLoginActivity.supportGoogleFB();
        this.snsTextView.setVisibility(supportGoogleFB ? 0 : 8);
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                AliEmailFragment.this.snsTextView.setVisibility(0);
                AliEmailFragment.this.mAlipay.setVisibility(0);
                AliEmailFragment.this.mAlipayLL.setVisibility(0);
                AliEmailFragment.access$002(AliEmailFragment.this, true);
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                } else {
                    AliEmailFragment.access$102(AliEmailFragment.this, false);
                }
            }
        });
        AlipayAuth.supportAlipayHK(getActivity(), new CommonCallback() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else if (!LanguageUtil.isHK()) {
                } else {
                    AliEmailFragment.this.snsTextView.setVisibility(0);
                    AliEmailFragment.this.mAlipayHK.setVisibility(0);
                    AliEmailFragment.this.mAlipayHKLL.setVisibility(0);
                }
            }
        });
        this.mGgLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_gg_ll);
        this.mFbLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_fb_ll);
        if (supportGoogleFB) {
            LinearLayout linearLayout = this.mGgLL;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView2 = this.mGoogle;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.mGoogle.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            AliEmailFragment.this.addCheckAction(LoginClickAction.ACTION_GOOGLE_LOGIN);
                        }
                    }
                });
            }
            LinearLayout linearLayout2 = this.mFbLL;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            TextView textView3 = this.mFacebook;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.mFacebook.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            AliEmailFragment.this.addCheckAction(LoginClickAction.ACTION_FACEBOOK_LOGIN);
                        }
                    }
                });
            }
        }
        if (LanguageUtil.isChineseLanguage()) {
            try {
                ((BaseActivity) getActivity()).getSupportActionBar().a("");
                ((BaseActivity) getActivity()).setNavigationCloseIcon();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        resetActionBar();
        this.mMainTitleTV = (TextView) view.findViewById(R.id.aliuser_main_title);
        if (LanguageUtil.isChineseLanguage()) {
            if (this.isRegState) {
                this.mMainTitleTV.setText(getString(R.string.aliuser_oversea_email_reg));
            } else {
                this.mMainTitleTV.setText(getString(R.string.aliuser_oversea_email_login));
            }
        } else {
            this.mMainTitleTV.setVisibility(8);
        }
        this.mAccountClearBtn = view.findViewById(R.id.aliuser_login_account_clear_iv);
        this.mPasswordClearBtn = view.findViewById(R.id.aliuser_recommend_login_password_clear_iv);
        this.mAccountRL = (RelativeLayout) view.findViewById(R.id.aliuser_recommend_login_account_rl);
        this.mLoginAccountET = (AutoCompleteTextView) view.findViewById(R.id.aliuser_recommend_login_account_et);
        this.mLoginAccountET.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1621df92", new Object[]{this, view2, new Boolean(z)});
                } else if (z) {
                    AliEmailFragment.this.editLoginAccount();
                } else if (AliEmailFragment.this.mAccountClearBtn == null) {
                } else {
                    AliEmailFragment.this.mAccountClearBtn.setVisibility(8);
                }
            }
        });
        updateLoginHint();
        this.mLoginAccountET.addTextChangedListener(new TextWatcher() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
                if (!StringUtils.isEmpty(charSequence) && AliEmailFragment.this.mRecommendLoginNextBtn != null) {
                    AliEmailFragment.this.mRecommendLoginNextBtn.setEnabled(true);
                }
                AliEmailFragment.access$202(AliEmailFragment.this, true);
                if (AliEmailFragment.access$300(AliEmailFragment.this) && !StringUtils.isEmpty(charSequence)) {
                    AliEmailFragment.access$302(AliEmailFragment.this, false);
                    UserTrackAdapter.sendUT(AliEmailFragment.this.getPageName(), "Input");
                }
                if (AliEmailFragment.this.mAccountClearBtn != null && AliEmailFragment.this.mCurrentLoginModeState == LoginModeState.LOCATION) {
                    if (charSequence == null || charSequence.length() == 0) {
                        if (AliEmailFragment.this.mAccountClearBtn.getVisibility() != 8) {
                            AliEmailFragment.this.mAccountClearBtn.setVisibility(8);
                        }
                    } else if (AliEmailFragment.this.mAccountClearBtn.getVisibility() != 0) {
                        AliEmailFragment.this.mAccountClearBtn.setVisibility(0);
                    }
                }
                String charSequence2 = charSequence.toString();
                int indexOf = charSequence2.indexOf(64);
                if (!LoginSwitch.getSwitch("showDropDown", "true")) {
                    return;
                }
                if (indexOf != -1) {
                    int i4 = indexOf + 1;
                    List<String> hitLength = getHitLength(charSequence2.substring(0, i4), charSequence2.substring(i4));
                    if (hitLength != null && hitLength.size() > 0) {
                        AliEmailFragment.this.mLoginAccountET.setAdapter(new ArrayAdapter(AliEmailFragment.this.getActivity(), R.layout.aliuser_simple_dropdown_item_1line, hitLength));
                        AliEmailFragment.this.mLoginAccountET.setDropDownHeight((int) (AliEmailFragment.this.getActivity().getResources().getDisplayMetrics().density * 40.0f * Math.min(hitLength.size(), 4)));
                        AliEmailFragment.this.mLoginAccountET.showDropDown();
                        AliEmailFragment.access$402(AliEmailFragment.this, true);
                        return;
                    }
                    AliEmailFragment.this.mLoginAccountET.dismissDropDown();
                    AliEmailFragment.access$402(AliEmailFragment.this, false);
                    return;
                }
                AliEmailFragment.this.mLoginAccountET.dismissDropDown();
                AliEmailFragment.access$402(AliEmailFragment.this, false);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                } else if (editable.length() != 0 && editable.toString().contains("@")) {
                } else {
                    AliEmailFragment.this.mLoginAccountET.dismissDropDown();
                    AliEmailFragment.access$402(AliEmailFragment.this, false);
                }
            }

            private List<String> getHitLength(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("5f9469c9", new Object[]{this, str, str2});
                }
                String config = LoginSwitch.getConfig("email_suffixes", "");
                String[] strArr = AliEmailFragment.this.emailSuffixes;
                if (!StringUtils.isEmpty(config)) {
                    strArr = config.split(",");
                }
                ArrayList arrayList = new ArrayList();
                for (String str3 : strArr) {
                    if (!StringUtils.isEmpty(str3)) {
                        if (str2 == null || str2.length() == 0) {
                            arrayList.add(str + str3);
                        } else if (!str3.equals(str2) && str3.startsWith(str2)) {
                            arrayList.add(str + str3);
                        }
                    }
                }
                return arrayList;
            }
        });
        this.mRecommendLoginNextBtn = (Button) view.findViewById(R.id.aliuser_recommend_login_next_btn);
        this.mRecommendLoginNextBtn.setEnabled(false);
        this.bottomTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_menu);
        if (LanguageUtil.isChineseLanguage()) {
            this.bottomTV.setVisibility(8);
        } else {
            this.bottomTV.setVisibility(8);
        }
        this.passwordHintTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_tip_tv);
        this.mLeftFuncTV = (TextView) view.findViewById(R.id.aliuser_recommend_login_left_func_tv);
        this.mRightFuncLL = view.findViewById(R.id.aliuser_recommend_login_right_func_tv);
        this.mRightTV = (TextView) view.findViewById(R.id.aliuser_login_forgot_password_tv);
        SpannableString spannableString = new SpannableString(getString(R.string.aliuser_sign_in_forget_password));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        this.mRightTV.setText(spannableString);
        this.mCheckBoxSwitch = true;
        this.mProtocolCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
        this.mProtocolTV = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
        ProtocolHelper.setCheckBox(this, this.mProtocolCB, getPageName(), true, this.mPreviousChecked);
        generateProtocol("", "");
        this.mPasswordRL = (RelativeLayout) view.findViewById(R.id.aliuser_recommend_login_password_rl);
        this.mPasswordET = (EditText) view.findViewById(R.id.aliuser_recommend_login_password_et);
        if (LanguageUtil.isChineseLanguage()) {
            this.mPasswordET.setBackgroundResource(R.drawable.aliuser_edittext_bg_tb);
        } else {
            this.mPasswordET.setBackgroundResource(R.drawable.aliuser_edittext_square_bg);
        }
        if (LanguageUtil.isChineseLanguage()) {
            this.mLoginAccountET.setBackgroundResource(R.drawable.aliuser_edittext_bg_tb);
        } else {
            this.mLoginAccountET.setBackgroundResource(R.drawable.aliuser_edittext_square_bg);
        }
        this.mPasswordET.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mPasswordET.addTextChangedListener(new TextWatcher() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.7
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
                } else if (AliEmailFragment.this.mPasswordET == null || charSequence == null || charSequence.length() <= 0 || !AliEmailFragment.access$200(AliEmailFragment.this)) {
                } else {
                    AliEmailFragment.access$202(AliEmailFragment.this, false);
                    AliEmailFragment.access$500(AliEmailFragment.this, "password_input");
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (AliEmailFragment.this.mPasswordClearBtn == null) {
                } else {
                    if (charSequence == null || charSequence.length() == 0) {
                        if (AliEmailFragment.this.mPasswordClearBtn.getVisibility() == 8) {
                            return;
                        }
                        AliEmailFragment.this.mPasswordClearBtn.setVisibility(8);
                    } else if (AliEmailFragment.this.mPasswordClearBtn.getVisibility() == 0) {
                    } else {
                        AliEmailFragment.this.mPasswordClearBtn.setVisibility(0);
                    }
                }
            }
        });
        this.mShowPasswordIV = (ImageView) view.findViewById(R.id.aliuser_recommend_login_show_password_btn);
        setOnClickListener(this.mRecommendLoginNextBtn, this.bottomTV, this.mLeftFuncTV, this.mRightFuncLL, this.mRightTV, this.mShowPasswordIV, this.mLoginAccountET, this.mAccountClearBtn, this.mPasswordClearBtn);
    }

    public void editLoginAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cedbb35", new Object[]{this});
        } else if (this.mCurrentLoginModeState != LoginModeState.LOCATION) {
            updateLoginModeState(LoginModeState.LOCATION);
            LoginParam loginParam = this.mLoginParam;
            if (loginParam != null && !StringUtils.isEmpty(loginParam.phoneCode)) {
                addControl("sms_input");
            } else {
                addControl("change_nick");
            }
            initParams();
            onPwdError();
        } else {
            addControl("input");
        }
    }

    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipayInner(this, this.mAlipay, this.mAlipayLL, null, false);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.ali_user_login_alipay_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else if (id == R.id.ali_user_login_alipayhk_login_tv) {
            addCheckAction(LoginClickAction.ACTION_ALIPAYHK_LOGIN);
        } else if (id == R.id.aliuser_recommend_login_menu) {
            addControl("help");
            AliUserRegisterActivity.goRegHelp(getActivity());
        } else if (id == R.id.aliuser_recommend_login_next_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else if (id == R.id.aliuser_recommend_login_account_et) {
            editLoginAccount();
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
        } else if (id == R.id.aliuser_login_account_clear_iv) {
            addControl(a.ATOM_EXT_clear);
            AutoCompleteTextView autoCompleteTextView = this.mLoginAccountET;
            if (autoCompleteTextView == null) {
                return;
            }
            autoCompleteTextView.getEditableText().clear();
            this.mLoginAccountET.setEnabled(true);
        } else if (id == R.id.aliuser_recommend_login_password_clear_iv) {
            EditText editText = this.mPasswordET;
            if (editText == null) {
                return;
            }
            editText.getEditableText().clear();
        } else if (id != R.id.aliuser_login_forgot_password_tv) {
        } else {
            addControl("Button-ResetPwd");
            onForgetPasswordAction();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onForgetPasswordAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf966a84", new Object[]{this});
            return;
        }
        String accountName = getAccountName();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, (userLoginPresenter == null || userLoginPresenter.getLoginParam() == null) ? "" : this.mUserLoginPresenter.mLoginParam.source);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        if (!LanguageUtil.isChineseLanguage()) {
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
        try {
            menu.findItem(R.id.aliuser_menu_item_help).setTitle(getResources().getString(R.string.aliuser_need_help));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public TaobaoRegProtocolDialogFragment getRrotocolFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoRegProtocolDialogFragment) ipChange.ipc$dispatch("3dde219b", new Object[]{this}) : new TaobaoRegProtocolDialogFragment();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addCheckAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129c9b7f", new Object[]{this, new Integer(i)});
        } else if (this.mCheckBoxSwitch) {
            onCheckLogin(i);
        } else {
            doRealAction(i);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onClickLoginAction();
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else if (i == LoginClickAction.ACTION_EMAIL_SEND) {
            onSendEmailAction();
        } else if (i == LoginClickAction.ACTION_GOOGLE_LOGIN) {
            goGoogle();
        } else if (i == LoginClickAction.ACTION_FACEBOOK_LOGIN) {
            goFacebook();
        } else {
            super.doRealAction(i);
        }
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
    public void onRecommendPwdLogin(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579d2708", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendpwdLogin");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && this.mLoginAccountET != null) {
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.PASSWORD);
            this.mPasswordET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AliEmailFragment.this.mPasswordRL.setVisibility(0);
                    if (AliEmailFragment.this.getContext() == null || !AliEmailFragment.this.isActive() || AliEmailFragment.this.mPasswordET == null) {
                        return;
                    }
                    AliEmailFragment.this.mPasswordET.requestFocus();
                    AliEmailFragment.this.mPasswordET.requestFocusFromTouch();
                    InputMethodManager inputMethodManager = (InputMethodManager) AliEmailFragment.this.getContext().getSystemService("input_method");
                    if (inputMethodManager == null) {
                        return;
                    }
                    inputMethodManager.showSoftInput(AliEmailFragment.this.mPasswordET, 1);
                }
            }, 300L);
        }
    }

    @Override // com.ali.user.mobile.login.ui.RecommendLoginView
    public void onRecommendEmailReg(String str, List<String> list, LoginParam loginParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc989a34", new Object[]{this, str, list, loginParam});
        } else if (!isActive()) {
        } else {
            uiShown("recommendemailReg");
            this.mAvailableLoginModes = list;
            this.mRecommendLoginType = str;
            if (loginParam != null && this.mLoginAccountET != null) {
                this.mRecommendLoginId = loginParam.loginId;
                updateLoginParamWhenRecommend(str, loginParam);
            }
            updateLoginModeState(LoginModeState.EMAIL_REG_LOGIN);
            this.mPasswordET.postDelayed(new Runnable() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AliEmailFragment.this.mPasswordRL.setVisibility(0);
                    if (LanguageUtil.isChineseLanguage()) {
                        AliEmailFragment.this.passwordHintTV.setVisibility(0);
                    }
                    if (AliEmailFragment.this.getContext() == null || !AliEmailFragment.this.isActive() || AliEmailFragment.this.mPasswordET == null) {
                        return;
                    }
                    AliEmailFragment.this.mPasswordET.requestFocus();
                    AliEmailFragment.this.mPasswordET.requestFocusFromTouch();
                    InputMethodManager inputMethodManager = (InputMethodManager) AliEmailFragment.this.getContext().getSystemService("input_method");
                    if (inputMethodManager == null) {
                        return;
                    }
                    inputMethodManager.showSoftInput(AliEmailFragment.this.mPasswordET, 1);
                }
            }, 300L);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void setOnClickListener(View... viewArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e43b81f", new Object[]{this, viewArr});
            return;
        }
        for (View view : viewArr) {
            if (view != null) {
                view.setClickable(true);
                view.setOnClickListener(this);
            }
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
        View view = this.mAccountClearBtn;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void updateLoginModeState(LoginModeState loginModeState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c8f43a", new Object[]{this, loginModeState});
            return;
        }
        this.mCurrentLoginModeState = loginModeState;
        updateLoginHint();
        this.mLoginAccountET.setInputType(1);
        if (loginModeState == LoginModeState.LOCATION) {
            this.mPasswordRL.setVisibility(8);
        } else if (loginModeState == LoginModeState.PASSWORD) {
            this.mPasswordET.setText("");
        } else if (loginModeState != LoginModeState.EMAIL_CODE_LOGIN && loginModeState == LoginModeState.EMAIL_REG_LOGIN) {
            this.mPasswordET.setText("");
        }
        this.mRightFuncLL.setVisibility(loginModeState.rightFuncTVVisibility);
        if (this.mCheckBoxSwitch && this.mProtocolTV != null) {
            this.mProtocolTV.setVisibility(0);
            generateProtocol("", "");
        }
        if (loginModeState.passwordVisibility == 0) {
            viewVisibleAnimate(this.mPasswordRL, 45);
        } else {
            viewGoneAnimate(this.mPasswordRL);
        }
        this.mRecommendLoginNextBtn.setText(loginModeState.loginBtnText);
        updateOtherLoginMode(loginModeState);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void generateProtocol(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309e9448", new Object[]{this, str, str2});
            return;
        }
        ProtocolModel protocolModel = ProtocolHelper.getProtocolModel(getActivity(), str, str2, false);
        boolean isChineseLanguage = LanguageUtil.isChineseLanguage();
        if (!isChineseLanguage) {
            protocolModel.protocolItemColor = R.color.aliuser_edittext_bg_color_activated;
        }
        ProtocolHelper.generateProtocol(protocolModel, this.mAttachedActivity, this.mProtocolTV, getPageName(), !isChineseLanguage);
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
            if (LoginModeState.EMAIL_REG_LOGIN == loginModeState) {
                this.mLeftFuncTV.setVisibility(0);
                this.mLeftFuncTV.setText(getString(R.string.aliuser_oversea_reg_with_mobile));
                this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            AliEmailFragment.this.getActivity().finish();
                        }
                    }
                });
                return;
            }
            this.mLeftFuncTV.setVisibility(8);
        } else if (this.mAvailableLoginModes.size() == 2) {
            if (loginModeState != LoginModeState.LOCATION) {
                for (String str : this.mAvailableLoginModes) {
                    if (!StringUtils.equals(loginModeState.name(), str)) {
                        if (LoginModeState.valueOf(str).loginModeName > 0) {
                            this.mLeftFuncTV.setVisibility(0);
                            if (LoginModeState.PASSWORD == loginModeState) {
                                SpannableString spannableString = new SpannableString(getString(R.string.aliuser_oversea_email_code_login));
                                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                                this.mLeftFuncTV.setText(spannableString);
                            } else {
                                this.mLeftFuncTV.setText(getString(R.string.aliuser_oversea_reg_with_mobile));
                            }
                            this.mLeftFuncTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.11
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    } else if (LoginModeState.PASSWORD == loginModeState) {
                                        AliEmailFragment.access$900(AliEmailFragment.this, LoginClickAction.ACTION_EMAIL_SEND);
                                    } else if (AliEmailFragment.this.isRegState) {
                                        AliEmailFragment.this.getActivity().finish();
                                    } else {
                                        AliEmailFragment.access$600(AliEmailFragment.this, "register");
                                        RegistParam registParam = new RegistParam();
                                        registParam.registSite = AliEmailFragment.this.getLoginSite();
                                        registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
                                        registParam.source = AliEmailFragment.access$700(AliEmailFragment.this);
                                        try {
                                            if (AliEmailFragment.this.mUserLoginActivity != null && AliEmailFragment.this.mUserLoginActivity.fireAppLaunchRes != null) {
                                                registParam.externParams = new HashMap();
                                                registParam.externParams.put(LoginConstant.APPLAUNCH_INFO, JSON.toJSONString(AliEmailFragment.this.mUserLoginActivity.fireAppLaunchRes));
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(AliEmailFragment.access$800(AliEmailFragment.this), registParam);
                                    }
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
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("680b717", new Object[]{this});
        }
        AutoCompleteTextView autoCompleteTextView = this.mLoginAccountET;
        return autoCompleteTextView == null ? "" : autoCompleteTextView.getText().toString().trim().replaceAll(" ", "");
    }

    public void onClickLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b821dd", new Object[]{this});
            return;
        }
        String trim = this.mPasswordET.getText().toString().trim();
        int i = AnonymousClass13.$SwitchMap$com$ali$user$mobile$login$ui$LoginModeState[this.mCurrentLoginModeState.ordinal()];
        if (i == 1) {
            if (StringUtils.isEmpty(getAccountName())) {
                toast(getString(R.string.aliuser_email_empty_hint), 0);
            } else if (!isEmailValid(getAccountName())) {
                toast(getString(R.string.aliuser_email_format_error), 0);
            } else {
                this.mOriginUserInput = getAccountName();
                this.mLoginPresenter.buildLoginParam(getAccountName(), "");
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
                this.mLoginPresenter.getLoginParam().pageType = "emailLogin";
                this.mLoginPresenter.getLoginFlow();
            }
        } else if (i == 2) {
            if (this.mDialogHelper != null) {
                this.mDialogHelper.hideInputMethod();
            }
            this.mEmailLoginPresenter.buildLoginParam(getAccountName(), "");
            this.mEmailLoginPresenter.sendEmailCode(this.mAttachedActivity, this.mEmailLoginPresenter.getLoginParam(), getUICallback());
        } else if (i == 3) {
            if (StringUtils.isEmpty(trim)) {
                toast(getString(R.string.aliuser_sign_in_please_enter_password), 0);
            } else {
                sendEmailCode(trim);
            }
        } else if (i != 4) {
        } else {
            if (StringUtils.isEmpty(trim)) {
                toast(getString(R.string.aliuser_sign_in_please_enter_password), 0);
                return;
            }
            if (this.mDialogHelper != null) {
                this.mDialogHelper.hideInputMethod();
            }
            this.mUserLoginPresenter.buildLoginParam(getAccountName(), trim);
            this.mUserLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.PWD_LOGIN, getPageName(), this.mLoginFlowId);
            this.mUserLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.PWD_LOGIN;
            this.mUserLoginPresenter.getLoginParam().utPageName = getPageName();
            this.mUserLoginPresenter.getLoginParam().pageType = "emailLogin";
            HashMap hashMap2 = new HashMap();
            hashMap2.put("sdkTraceId", this.mUserLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.PWD_LOGIN, hashMap2);
            this.mUserLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
            this.mUserLoginPresenter.login(this.mAttachedActivity, this.mUserLoginPresenter.getLoginParam(), getUICallback());
        }
    }

    private void sendEmailCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c49cd2", new Object[]{this, str});
            return;
        }
        if (this.mDialogHelper != null) {
            this.mDialogHelper.hideInputMethod();
        }
        this.mEmailLoginPresenter.buildLoginParam(getAccountName(), str);
        this.mEmailLoginPresenter.sendEmailCode(this.mAttachedActivity, this.mEmailLoginPresenter.getLoginParam(), getUICallback());
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
            this.mEmailLoginPresenter.getLoginParam().alipayInstalled = this.alipayInstalled;
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mEmailLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_EMAIL_ACTION, "", "emailLogin", hashMap);
            this.mEmailLoginPresenter.sendEmailCode(this.mAttachedActivity, this.mEmailLoginPresenter.getLoginParam(), getUICallback());
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th);
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.ali.user.mobile.register.ui.oversea.AliEmailFragment.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.login.CommonUICallback
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else if (i == 5001) {
                    AliEmailFragment.access$1100(AliEmailFragment.this);
                } else if (i == 5003) {
                    AliEmailFragment.access$1000(AliEmailFragment.this);
                } else if (i == 5005) {
                    if (!AliEmailFragment.this.isActive() || !LoginSwitch.getSwitch("show_password_hint", "true")) {
                        return;
                    }
                    AliEmailFragment.this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    AliEmailFragment.this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                    AliEmailFragment.this.mShowPasswordIV.setContentDescription(AliEmailFragment.this.getString(R.string.aliuser_assist_password_show));
                    AliEmailFragment.this.mShowPasswordIV.setTag(true);
                    UserTrackAdapter.sendControlUT(AliEmailFragment.this.getPageName(), "Button-ShowPwd");
                } else if (i != 5009 || !AliEmailFragment.this.isActive() || map == null || !AliEmailFragment.this.isActive() || map == null) {
                } else {
                    SmsApplyResult smsApplyResult = null;
                    try {
                        smsApplyResult = (SmsApplyResult) map.get("result");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    AliEmailFragment.this.onSendEmailSuccess(smsApplyResult);
                }
            }
        };
    }

    public void onSendEmailSuccess(SmsApplyResult smsApplyResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cb9a57", new Object[]{this, smsApplyResult});
        } else if (!isActive()) {
        } else {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mEmailLoginPresenter.mLoginParam));
            intent.putExtra("email", getAccountName());
            intent.putExtra("session_id", smsApplyResult.emailSid);
            intent.putExtra(RegistConstants.REGISTER_CODE_LENGTH, smsApplyResult.codeLength);
            if (smsApplyResult != null && !StringUtils.isEmpty(smsApplyResult.helpVideoUrl)) {
                intent.putExtra("url", smsApplyResult.helpVideoUrl);
            }
            goToEmailVerificationPage(intent);
        }
    }

    public void goToEmailVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3236607", new Object[]{this, intent});
        } else {
            NavigatorManager.getInstance().navToEmailCodePage(getActivity(), intent == null ? new Bundle() : intent.getExtras());
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
        c.a(SNSPlatform.PLATFORM_GOOGLE, i, i2, intent);
        c.a(SNSPlatform.PLATFORM_FACEBOOK, i, i2, intent);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void openHelp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652b6bb2", new Object[]{this});
        } else {
            AliUserRegisterActivity.goRegHelp(getActivity());
        }
    }
}
