package com.ali.user.mobile.login.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.BooleanOrangeResult;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.CommonUICallback;
import com.ali.user.mobile.login.LoginFrom;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.RegionPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserLoginFragment extends BaseLoginFragment implements UserLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;
    public boolean fromOversea;
    public TextView mAccountTV;
    public String mCurrentAccount;
    public String mCurrentPassword;
    public String mCurrentSelectedAccount;
    public TextView mForgetPasswordTV;
    public LinearLayout mHistoryLoginLL;
    public Button mLoginBtn;
    public LinearLayout mLoginBtnLL;
    public LinearLayout mLoginLL;
    public View mPasswordClearBtn;
    public EditText mPasswordET;
    public TextView mProtocolTV;
    public RegionPresenter mRegionPresenter;
    public ImageView mShowPasswordIV;
    public String mSource;
    public TextView mSwitchFaceLoginBtn;
    public TextView mSwitchMoreLoginBtn;
    public TextView mSwitchSmsLoginBtn;
    public UserLoginPresenter mUserLoginPresenter;
    public boolean isForceNormalMode = false;
    public TextWatcher mTextWatcherPassword = null;
    public boolean mActiveLogin = false;
    public LoginParam loginParam = null;
    private boolean checkcodeUT = true;
    public boolean faceLoginEnable = false;
    public boolean smsLoginEnable = false;

    public static /* synthetic */ Object ipc$super(AliUserLoginFragment aliUserLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1180824595:
                super.initViews((View) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void beforeAccountChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365ea085", new Object[]{this});
        }
    }

    public void beforePasspordChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9210c7b8", new Object[]{this});
        }
    }

    public void onClearAccountBtnClickAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98e42e68", new Object[]{this});
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public void setLoginAccountInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53941165", new Object[]{this, str});
        }
    }

    public static /* synthetic */ boolean access$000(AliUserLoginFragment aliUserLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1e3b98d1", new Object[]{aliUserLoginFragment})).booleanValue() : aliUserLoginFragment.checkcodeUT;
    }

    public static /* synthetic */ boolean access$002(AliUserLoginFragment aliUserLoginFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f46045ad", new Object[]{aliUserLoginFragment, new Boolean(z)})).booleanValue();
        }
        aliUserLoginFragment.checkcodeUT = z;
        return z;
    }

    public static /* synthetic */ void access$100(AliUserLoginFragment aliUserLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d236b6", new Object[]{aliUserLoginFragment, str});
        } else {
            aliUserLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(AliUserLoginFragment aliUserLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e96415", new Object[]{aliUserLoginFragment, str});
        } else {
            aliUserLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ IDialogHelper access$300(AliUserLoginFragment aliUserLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogHelper) ipChange.ipc$dispatch("fa149055", new Object[]{aliUserLoginFragment}) : aliUserLoginFragment.mDialogHelper;
    }

    public static /* synthetic */ IDialogHelper access$400(AliUserLoginFragment aliUserLoginFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDialogHelper) ipChange.ipc$dispatch("18cec816", new Object[]{aliUserLoginFragment}) : aliUserLoginFragment.mDialogHelper;
    }

    static {
        kge.a(-823330627);
        kge.a(1749592790);
        TAG = AliUserLoginFragment.class.getSimpleName();
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

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_user_login_tb;
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.loginParam = null;
        if (arguments != null) {
            this.mPreviousChecked = arguments.getBoolean("check");
            String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
            arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
            if (!StringUtils.isEmpty(str)) {
                this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                LoginParam loginParam = this.loginParam;
                if (loginParam != null) {
                    this.mSource = loginParam.source;
                }
            }
            this.isForceNormalMode = arguments.getBoolean(LoginConstant.FORCE_NORMAL_MODE);
            this.mCurrentAccount = arguments.getString(LoginConstant.ACCOUNT);
            if (this.mUserLoginActivity != null && this.mUserLoginActivity.fireAppLaunchRes != null && this.mUserLoginActivity.fireAppLaunchRes.returnValue != 0 && ((AppLaunchInfo) this.mUserLoginActivity.fireAppLaunchRes.returnValue).fromOversea) {
                this.fromOversea = true;
            }
        }
        this.mUserLoginPresenter = new UserLoginPresenter(this, this.loginParam);
        this.mRegionPresenter = new RegionPresenter(this);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        ((BaseActivity) getActivity()).setNavigationBackIcon();
        initTextWatcher();
        this.mLoginLL = (LinearLayout) view.findViewById(R.id.aliuser_user_login_ll);
        this.mHistoryLoginLL = (LinearLayout) view.findViewById(R.id.aliuser_login_history_ll);
        this.mAccountTV = (TextView) view.findViewById(R.id.aliuser_login_account_tv);
        this.mPasswordET = (EditText) view.findViewById(R.id.aliuser_login_password_et);
        EditText editText = this.mPasswordET;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.mPasswordET.addTextChangedListener(this.mTextWatcherPassword);
            this.mPasswordET.setTypeface(Typeface.SANS_SERIF);
        }
        this.mPasswordClearBtn = view.findViewById(R.id.aliuser_login_password_clear_iv);
        this.mLoginBtn = (Button) view.findViewById(R.id.aliuser_login_login_btn);
        Button button = this.mLoginBtn;
        if (button != null) {
            button.setEnabled(false);
        }
        this.mForgetPasswordTV = (TextView) view.findViewById(R.id.aliuser_login_forgot_password_tv);
        if (this.mForgetPasswordTV != null) {
            BooleanOrangeResult needFindPassword = DataProviderFactory.getOrangeConfig().needFindPassword();
            if (needFindPassword.orangeExist && !needFindPassword.value) {
                this.mForgetPasswordTV.setVisibility(8);
            }
        }
        this.mShowPasswordIV = (ImageView) view.findViewById(R.id.aliuser_login_show_password_btn);
        this.mLoginBtnLL = (LinearLayout) view.findViewById(R.id.aliuser_login_login_btn_ll);
        this.mSwitchSmsLoginBtn = (TextView) view.findViewById(R.id.aliuser_login_switch_smslogin);
        try {
            this.mSwitchMoreLoginBtn = (TextView) view.findViewById(R.id.aliuser_login_switch_more_login);
            this.mSwitchFaceLoginBtn = (TextView) view.findViewById(R.id.aliuser_login_switch_face_login);
        } catch (Throwable unused) {
        }
        ImageView imageView = this.mShowPasswordIV;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        setOnClickListener(this.mLoginBtn, this.mForgetPasswordTV, this.mPasswordClearBtn, this.mSwitchSmsLoginBtn, this.mSwitchMoreLoginBtn, this.mSwitchFaceLoginBtn);
        this.mUserLoginPresenter.onStart();
        this.mRegionPresenter.onStart();
        initMode();
        generateProtocol("", "");
        showPushLogoutAlertIfHas();
        if (!LoginSwitch.getSwitch(LoginSwitch.OPEN_LOGIN_PAGE_WHEN_IS_LOGIN, "true")) {
            BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_OPEN_ACTION));
        }
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mProtocolTV, this.mAccountTV, this.mSwitchFaceLoginBtn, this.mSwitchMoreLoginBtn, this.mSwitchSmsLoginBtn, this.mLoginBtn, this.mForgetPasswordTV, this.mPasswordET);
    }

    public void initMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621aedda", new Object[]{this});
        } else if (this.mUserLoginActivity.hadReadHistory) {
            if (this.mUserLoginActivity.mHistoryAccount != null) {
                this.isHistoryMode = true;
                this.historyHid = this.mUserLoginActivity.mHistoryAccount.userId;
                switchToHistoryMode(this.mUserLoginActivity.mHistoryAccount);
                return;
            }
            this.mUserLoginActivity.switchToRecommendLogin(new Intent());
        } else {
            this.mUserLoginActivity.switchToRecommendLogin(new Intent());
        }
    }

    private void initTextWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a005a6", new Object[]{this});
        } else {
            this.mTextWatcherPassword = new TextWatcher() { // from class: com.ali.user.mobile.login.ui.AliUserLoginFragment.1
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
                        return;
                    }
                    AliUserLoginFragment aliUserLoginFragment = AliUserLoginFragment.this;
                    aliUserLoginFragment.interact = true;
                    if (aliUserLoginFragment.mPasswordClearBtn != null) {
                        if (charSequence == null || charSequence.length() == 0) {
                            if (AliUserLoginFragment.this.mPasswordClearBtn.getVisibility() != 8) {
                                AliUserLoginFragment.this.mPasswordClearBtn.setVisibility(8);
                            }
                        } else if (AliUserLoginFragment.this.mPasswordClearBtn.getVisibility() != 0) {
                            AliUserLoginFragment.this.mPasswordClearBtn.setVisibility(0);
                        }
                    }
                    if (AliUserLoginFragment.this.mPasswordET == null) {
                        return;
                    }
                    AliUserLoginFragment.this.checkSignInable();
                    if (charSequence == null || charSequence.length() <= 0 || !AliUserLoginFragment.access$000(AliUserLoginFragment.this)) {
                        return;
                    }
                    AliUserLoginFragment.access$002(AliUserLoginFragment.this, false);
                    AliUserLoginFragment.access$100(AliUserLoginFragment.this, "password_input");
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    } else {
                        AliUserLoginFragment.this.beforePasspordChange();
                    }
                }
            };
        }
    }

    @Override // com.ali.user.mobile.login.ui.UserLoginView
    public void clearPasswordInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf5829", new Object[]{this});
            return;
        }
        EditText editText = this.mPasswordET;
        if (editText == null) {
            return;
        }
        editText.setText("");
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("680b717", new Object[]{this}) : this.mCurrentSelectedAccount;
    }

    public void checkSignInable() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6ca9cb", new Object[]{this});
            return;
        }
        String charSequence = this.mAccountTV.getText().toString();
        String obj = this.mPasswordET.getText().toString();
        if (!StringUtils.isEmpty(charSequence) && !StringUtils.isEmpty(obj)) {
            z = true;
        }
        this.mLoginBtn.setEnabled(z);
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
        if (id == R.id.aliuser_login_login_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else if (id == R.id.aliuser_login_forgot_password_tv) {
            addControl("Button-ForgetPwd");
            onForgetPasswordAction();
        } else if (id == R.id.aliuser_login_account_clear_iv) {
            onClearAccountBtnClickAction();
        } else if (id == R.id.aliuser_login_password_clear_iv) {
            this.mPasswordET.getEditableText().clear();
        } else if (id == R.id.aliuser_login_show_password_btn) {
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
                view.setTag(false);
                addControl("Button-HidePwd");
            }
            if (selectionEnd > 0) {
                this.mPasswordET.setSelection(selectionEnd);
            }
            this.mPasswordET.postInvalidate();
        } else if (id == R.id.aliuser_login_switch_smslogin) {
            addControl(UTConstans.Controls.UT_CHOOSE_OTHER_SMS);
            switchToSmsLogin();
        } else if (id == R.id.aliuser_login_switch_face_login) {
            addControl(UTConstans.Controls.UT_CHOOSE_OTHER_FACE);
            addCheckAction(LoginClickAction.ACTION_FACE);
        } else if (id == R.id.aliuser_login_switch_more_login) {
            addControl(UTConstans.Controls.UT_CHOOSE_OTHER, getOnekeyEnableMap());
            showMoreLoginBottomMenu();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void appendIntent(Intent intent) {
        UserLoginPresenter userLoginPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        } else if (intent == null || (userLoginPresenter = this.mUserLoginPresenter) == null || userLoginPresenter.getLoginParam() == null) {
        } else {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
    }

    public void showMoreLoginBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff6b5028", new Object[]{this});
        } else if (!isActive()) {
        } else {
            BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            addOnekeyHistory(bottomMenuFragment, arrayList);
            addFingeritem(bottomMenuFragment, arrayList);
            if (this.smsLoginEnable) {
                MenuItem menuItem = new MenuItem();
                menuItem.setText(getString(R.string.aliuser_login_sms_login));
                menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.AliUserLoginFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                    public void onClickMenuItem(View view, MenuItem menuItem2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                        } else if (!AliUserLoginFragment.this.isActive()) {
                        } else {
                            AliUserLoginFragment.access$200(AliUserLoginFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SMS);
                            AliUserLoginFragment.this.switchToSmsLogin();
                        }
                    }
                });
                arrayList.add(menuItem);
            }
            if (this.faceLoginEnable) {
                MenuItem menuItem2 = new MenuItem();
                menuItem2.setText(getString(R.string.aliuser_scan_login_text));
                menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.AliUserLoginFragment.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                    public void onClickMenuItem(View view, MenuItem menuItem3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                        } else if (!AliUserLoginFragment.this.isActive()) {
                        } else {
                            AliUserLoginFragment.this.onCheckLogin(LoginClickAction.ACTION_FACE);
                        }
                    }
                });
                arrayList.add(menuItem2);
            }
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
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
        this.mUserLoginPresenter.onActivityResult(i, i2, intent);
    }

    public void switchToSmsLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab34886", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        if (this.mProtocolCB != null) {
            intent.putExtra("check", this.mProtocolCB.isChecked());
        }
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null && userLoginPresenter.getLoginParam() != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.gotoMobileLoginFragment(intent);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onLoginAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809ca427", new Object[]{this});
            return;
        }
        LoginFrom.setCurrentLoginFrom("4");
        this.mActiveLogin = true;
        this.mCurrentAccount = getAccountName();
        this.mCurrentPassword = this.mPasswordET.getText().toString().trim();
        if (StringUtils.isEmpty(this.mCurrentAccount)) {
            showErrorMessage(R.string.aliuser_sign_in_account_hint);
        } else if (StringUtils.isEmpty(this.mCurrentPassword)) {
            showErrorMessage(R.string.aliuser_sign_in_please_enter_password);
        } else {
            if (this.mDialogHelper != null) {
                this.mDialogHelper.hideInputMethod();
            }
            this.mUserLoginPresenter.buildLoginParam(this.mCurrentAccount, this.mCurrentPassword);
            this.mUserLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.PWD_LOGIN, getPageName());
            this.mUserLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.PWD_LOGIN;
            this.mUserLoginPresenter.getLoginParam().utPageName = getPageName();
            this.mUserLoginPresenter.getLoginParam().hid = this.historyHid;
            if (this.mUserLoginActivity != null) {
                this.mUserLoginPresenter.getLoginParam().alipayInstalled = this.mUserLoginActivity.mAlipayInstall;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", this.mUserLoginPresenter.getLoginParam().sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.PWD_LOGIN, hashMap);
            this.mUserLoginPresenter.login(this.mAttachedActivity, this.mUserLoginPresenter.getLoginParam(), getUICallback());
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public CommonUICallback getUICallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonUICallback) ipChange.ipc$dispatch("c4196dd", new Object[]{this}) : new CommonUICallback() { // from class: com.ali.user.mobile.login.ui.AliUserLoginFragment.4
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
                        AliUserLoginFragment.this.pwdErrorToSMS();
                        return;
                    case 5002:
                        AliUserLoginFragment.this.onFaceLogin(true);
                        return;
                    case 5003:
                        AliUserLoginFragment.this.goAlipay();
                        return;
                    case 5004:
                    default:
                        return;
                    case CommonUICallback.ACTION_PWD_ERROR_SHOW_EYE /* 5005 */:
                        if (!AliUserLoginFragment.this.isActive() || !LoginSwitch.getSwitch("show_password_hint", "true")) {
                            return;
                        }
                        AliUserLoginFragment.this.mPasswordET.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        AliUserLoginFragment.this.mShowPasswordIV.setImageResource(R.drawable.aliuser_ic_visibility);
                        AliUserLoginFragment.this.mShowPasswordIV.setContentDescription(AliUserLoginFragment.this.getString(R.string.aliuser_assist_password_show));
                        AliUserLoginFragment.this.mShowPasswordIV.setTag(true);
                        UserTrackAdapter.sendControlUT(AliUserLoginFragment.this.getPageName(), "Button-ShowPwd");
                        return;
                }
            }
        };
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
        String str = (userLoginPresenter == null || userLoginPresenter.getLoginParam() == null) ? "" : this.mUserLoginPresenter.mLoginParam.source;
        if (this.isHistoryMode && this.mUserLoginActivity.mHistoryAccount != null) {
            if (this.mUserLoginActivity.mHistoryAccount.alipayHid != 0) {
                alert("", this.mAttachedActivity.getResources().getString(R.string.aliuser_alipay_findpwd), this.mAttachedActivity.getResources().getString(R.string.aliuser_confirm), new DialogInterface.OnClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserLoginFragment.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        } else if (AliUserLoginFragment.access$300(AliUserLoginFragment.this) == null) {
                        } else {
                            AliUserLoginFragment.access$400(AliUserLoginFragment.this).dismissAlertDialog();
                        }
                    }
                }, null, null);
                return;
            } else if (StringUtils.isEmpty(this.mUserLoginActivity.mHistoryAccount.tokenKey) || getLoginSite() != 0) {
                this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, str);
                return;
            } else {
                this.mUserLoginPresenter.fetchUrlAndToWebViewWithUserId(this.mAttachedActivity, accountName, this.mUserLoginActivity.mHistoryAccount.userId, str);
                return;
            }
        }
        this.mUserLoginPresenter.fetchUrlAndToWebView(this.mAttachedActivity, accountName, LoginType.LocalLoginType.RETRIVE_PWD_LOGIN, str);
    }

    public void showErrorMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6369e460", new Object[]{this, new Integer(i)});
        } else {
            toast(getString(i), 0);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        if (this.isHistoryMode && this.mUserLoginActivity.mHistoryAccount != null) {
            return this.mUserLoginActivity.mHistoryAccount.getLoginSite();
        }
        return DataProviderFactory.getDataProvider().getSite();
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

    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        } else if (!isActivityAvaiable()) {
        } else {
            this.mCurrentSelectedAccount = historyAccount.userInputName;
            String dataMasking = StringUtil.dataMasking(this.mCurrentSelectedAccount, true);
            if (StringUtils.isEmpty(dataMasking)) {
                return;
            }
            this.mAccountTV.setText(dataMasking);
            updateAvatar(historyAccount.headImg);
            switchMode(this.isHistoryMode, historyAccount);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void switchMode(boolean z, HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feb28ba", new Object[]{this, new Boolean(z), historyAccount});
            return;
        }
        if (z) {
            try {
                this.mHistoryLoginLL.setVisibility(0);
                this.smsLoginEnable = checkSMSLoginEnable(historyAccount);
                if (DataProviderFactory.getDataProvider().supportFaceLogin() && (this.mUserLoginActivity.isFaceLoginEnvEnable || this.mUserLoginActivity.isFaceLoginActivate)) {
                    this.faceLoginEnable = true;
                }
                this.fingerLoginEnable = isFingerEnable(historyAccount);
                this.onekeyHistoryEnable = isHistoryOnekeyEnable(historyAccount);
                if (!this.onekeyHistoryEnable && !this.fingerLoginEnable && (!this.smsLoginEnable || !this.faceLoginEnable)) {
                    if (this.smsLoginEnable) {
                        this.mSwitchSmsLoginBtn.setVisibility(0);
                        this.mSwitchMoreLoginBtn.setVisibility(8);
                        this.mSwitchFaceLoginBtn.setVisibility(8);
                        ((RelativeLayout.LayoutParams) this.mSwitchSmsLoginBtn.getLayoutParams()).addRule(14, -1);
                    } else if (this.faceLoginEnable) {
                        this.mSwitchSmsLoginBtn.setVisibility(8);
                        this.mSwitchMoreLoginBtn.setVisibility(8);
                        this.mSwitchFaceLoginBtn.setVisibility(0);
                        ((RelativeLayout.LayoutParams) this.mSwitchFaceLoginBtn.getLayoutParams()).addRule(14, -1);
                    } else {
                        this.mSwitchSmsLoginBtn.setVisibility(8);
                        this.mSwitchMoreLoginBtn.setVisibility(8);
                        this.mSwitchFaceLoginBtn.setVisibility(8);
                    }
                }
                this.mSwitchSmsLoginBtn.setVisibility(8);
                this.mSwitchMoreLoginBtn.setVisibility(0);
                this.mSwitchFaceLoginBtn.setVisibility(8);
                ((RelativeLayout.LayoutParams) this.mSwitchMoreLoginBtn.getLayoutParams()).addRule(14, -1);
            } catch (Throwable unused) {
                return;
            }
        }
        if (getActivity() == null) {
            return;
        }
        getActivity().invalidateOptionsMenu();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.isHistoryMode ? UTConstant.PageName.UT_PAGE_HISTORY_LOGIN : UTConstant.PageName.UT_PAGE_FIRST_LOGIN;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        EditText editText = this.mPasswordET;
        if (editText != null) {
            editText.removeTextChangedListener(this.mTextWatcherPassword);
        }
        super.onDestroyView();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter == null) {
            return;
        }
        userLoginPresenter.onDestory();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public boolean isHistoryMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40491ad8", new Object[]{this})).booleanValue() : this.isHistoryMode;
    }
}
