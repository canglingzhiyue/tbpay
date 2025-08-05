package com.ali.user.mobile.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.FragmentConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.presenter.OneKeyLoginPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.ui.LoginCouponHelper;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class OneKeyLoginFragment extends BaseLoginFragment implements OneKeyLoginView, UserMobileLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView mAlipayLoginTV;
    public UserMobileLoginPresenter mMobileLoginPresenter;
    public String mMobileNum;
    public Button mOneKeyLoginButton;
    public TextView mProtocolView;
    public TextView mRecommendLoginTV;
    public TextView mShowIdTextView;
    public String mSource;
    public OneKeyLoginPresenter oneKeyLoginPresenter;
    public LoginParam loginParam = null;
    public boolean isSendSms = false;

    static {
        kge.a(-895527501);
        kge.a(1474484104);
        kge.a(-1275964844);
    }

    public static /* synthetic */ Object ipc$super(OneKeyLoginFragment oneKeyLoginFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1912803358:
                super.onClick((View) objArr[0]);
                return null;
            case -1829513635:
                super.doRealAction(((Number) objArr[0]).intValue());
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

    public void activeFaceLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dd842d", new Object[]{this});
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "Page_onekey_login";
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public String getPhoneCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3daf0254", new Object[]{this}) : "86";
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onCheckCodeError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3514739", new Object[]{this});
        }
    }

    public static /* synthetic */ void access$000(OneKeyLoginFragment oneKeyLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5a6f1d", new Object[]{oneKeyLoginFragment, str});
        } else {
            oneKeyLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(OneKeyLoginFragment oneKeyLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720899de", new Object[]{oneKeyLoginFragment, str});
        } else {
            oneKeyLoginFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(OneKeyLoginFragment oneKeyLoginFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5b6c49f", new Object[]{oneKeyLoginFragment, str});
        } else {
            oneKeyLoginFragment.addControl(str);
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
        this.isSendSms = false;
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_onekey_login_tb;
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        try {
            Bundle arguments = getArguments();
            this.loginParam = null;
            if (arguments != null) {
                this.mPreviousChecked = arguments.getBoolean("check");
                String str = (String) arguments.get(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM);
                arguments.putString(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, "");
                if (!TextUtils.isEmpty(str)) {
                    this.loginParam = (LoginParam) JSON.parseObject(str, LoginParam.class);
                    if (this.loginParam != null) {
                        this.mSource = this.loginParam.source;
                    }
                }
                this.mMobileNum = arguments.getString("number", "");
                this.mProtocolTitle = arguments.getString("protocolName", "");
                this.mProtocolUrl = arguments.getString("protocolURL", "");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginParam();
        }
        this.oneKeyLoginPresenter = new OneKeyLoginPresenter(this, this.loginParam);
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam);
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
        LoginCouponHelper.handleCoupon(view, this.mUserLoginActivity);
        resetActionBar();
        this.mShowIdTextView = (TextView) view.findViewById(R.id.aliuser_onekey_login_account_tv);
        if (this.mShowIdTextView != null && !TextUtils.isEmpty(this.mMobileNum)) {
            this.mShowIdTextView.setText(this.mMobileNum);
        }
        this.mOneKeyLoginButton = (Button) view.findViewById(R.id.aliuser_onekey_login_btn);
        this.mRecommendLoginTV = (TextView) view.findViewById(R.id.aliuser_switch_recommend_login);
        this.mProtocolView = (TextView) view.findViewById(R.id.aliuser_protocol_tv);
        generateProtocol();
        this.mAlipayLoginTV = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        TextView textView = (TextView) view.findViewById(R.id.aliuser_onekey_login_menu);
        setOnClickListener(this.mOneKeyLoginButton, this.mRecommendLoginTV, textView);
        this.oneKeyLoginPresenter.onStart();
        try {
            this.mCheckBoxSwitch = true;
            this.mProtocolCB = (CheckBox) view.findViewById(R.id.aliuser_reg_checkbox);
            ProtocolHelper.setCheckBox(this, this.mProtocolCB, getPageName(), this.mCheckBoxSwitch, this.mPreviousChecked);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mOneKeyLoginButton, this.mRecommendLoginTV, this.mShowIdTextView, this.mProtocolView, textView);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_onekey_login_btn) {
            addCheckAction(LoginClickAction.ACTION_LOGIN);
        } else if (id == R.id.aliuser_switch_recommend_login) {
            addControl("otherid");
            switchToRecommendLogin();
        } else if (id == R.id.aliuser_onekey_login_menu) {
            addControl("more");
            showBottomMenu();
        } else {
            super.onClick(view);
        }
    }

    public void generateProtocol() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a4e934", new Object[]{this});
        } else {
            ProtocolHelper.generateProtocol(getProtocolModel(), this.mAttachedActivity, this.mProtocolView, getPageName(), false);
        }
    }

    public ProtocolModel getProtocolModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProtocolModel) ipChange.ipc$dispatch("73065416", new Object[]{this}) : ProtocolHelper.getProtocolModel(this.mAttachedActivity, this.mProtocolTitle, this.mProtocolUrl, true ^ this.isHistoryMode);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
            return;
        }
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        ArrayList arrayList = new ArrayList();
        MenuItem menuItem = new MenuItem();
        menuItem.setText(getString(R.string.aliuser_other_account_login));
        menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.OneKeyLoginFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                } else if (!OneKeyLoginFragment.this.isActive()) {
                } else {
                    OneKeyLoginFragment.access$000(OneKeyLoginFragment.this, "Button-ChooseOtherAccountLogin");
                    OneKeyLoginFragment.this.switchAccount();
                }
            }
        });
        if (this.isHistoryMode) {
            arrayList.add(menuItem);
        }
        MenuItem menuItem2 = new MenuItem();
        menuItem2.setText(getString(R.string.aliuser_menu_help));
        menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.OneKeyLoginFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    return;
                }
                OneKeyLoginFragment.access$100(OneKeyLoginFragment.this, "help");
                if (!OneKeyLoginFragment.this.isActive()) {
                    return;
                }
                OneKeyLoginFragment.this.openHelp();
            }
        });
        MenuItem menuItem3 = new MenuItem();
        menuItem3.setText(getFindAccountText());
        menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.ali.user.mobile.login.ui.OneKeyLoginFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
            public void onClickMenuItem(View view, MenuItem menuItem4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    return;
                }
                OneKeyLoginFragment.access$200(OneKeyLoginFragment.this, "findnick");
                if (!OneKeyLoginFragment.this.isActive()) {
                    return;
                }
                OneKeyLoginFragment.this.openFindAccountPage();
            }
        });
        arrayList.add(menuItem2);
        arrayList.add(menuItem3);
        addMoreMenus(bottomMenuFragment, arrayList);
        bottomMenuFragment.setMenuItems(arrayList);
        bottomMenuFragment.setMenuTitle(getString(R.string.aliuser_login_more_func));
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getFindAccountText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e44708e", new Object[]{this}) : getString(R.string.aliuser_find_account);
    }

    public void onOneKeyLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeabd78", new Object[]{this});
            return;
        }
        this.isSendSms = false;
        this.loginParam.sdkTraceId = ApiReferer.generateTraceId("oneKeyLogin", getPageName());
        LoginParam loginParam = this.loginParam;
        loginParam.loginSourceType = "oneKeyLogin";
        loginParam.utPageName = getPageName();
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SIM_LOGIN, hashMap);
        this.oneKeyLoginPresenter.login();
    }

    public void switchToRecommendLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97b4543", new Object[]{this});
        } else {
            switchAccount();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        if (this.isHistoryMode && this.mUserLoginActivity != null && this.mUserLoginActivity.mHistoryAccount != null) {
            return this.mUserLoginActivity.mHistoryAccount.getLoginSite();
        }
        return DataProviderFactory.getDataProvider().getSite();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        OneKeyLoginPresenter oneKeyLoginPresenter = this.oneKeyLoginPresenter;
        if (oneKeyLoginPresenter == null) {
            return;
        }
        oneKeyLoginPresenter.onDestory();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.isSendSms) {
            this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
        } else {
            this.oneKeyLoginPresenter.onActivityResult(i, i2, intent);
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        addControl("close");
        return false;
    }

    @Override // com.ali.user.mobile.login.ui.UserMobileLoginView
    public void onSendSMSSuccess(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8f5468", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (!isActive()) {
        } else {
            Intent intent = new Intent();
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mMobileLoginPresenter.mLoginParam));
            intent.putExtra("pageTag", FragmentConstant.ONE_KEY_LOGIN_FRAGMENT_TAG);
            goToSMSVerificationPage(intent);
        }
    }

    public void goToSMSVerificationPage(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01ef784", new Object[]{this, intent});
            return;
        }
        try {
            if (this.mUserLoginActivity == null) {
                return;
            }
            Fragment sMSVerificationFragment = getSMSVerificationFragment();
            sMSVerificationFragment.setArguments(intent.getExtras());
            Fragment findFragmentByTag = this.mUserLoginActivity.mFragmentManager.findFragmentByTag(FragmentConstant.LOGIN_SMSCODE_FRAGMENT_TAG);
            if (findFragmentByTag != null) {
                this.mUserLoginActivity.mFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            this.mUserLoginActivity.mCurrentFragmentTag = FragmentConstant.LOGIN_SMSCODE_FRAGMENT_TAG;
            this.mUserLoginActivity.mFragmentManager.beginTransaction().replace(R.id.aliuser_content_frame, sMSVerificationFragment, FragmentConstant.LOGIN_SMSCODE_FRAGMENT_TAG).addToBackStack(null).commitAllowingStateLoss();
            this.mUserLoginActivity.mFragmentManager.beginTransaction().show(sMSVerificationFragment).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Fragment getSMSVerificationFragment() throws IllegalAccessException, InstantiationException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("3095a337", new Object[]{this}) : new AliUserSMSLoginVerificationFragment();
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

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onNeedVerifyMobile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1188b84b", new Object[]{this, str, str2});
            return;
        }
        this.isSendSms = true;
        this.mMobileLoginPresenter.buildSMSLoginParam(str2, null, false);
        this.mMobileLoginPresenter.getLoginParam().utPageName = getPageName();
        this.mMobileLoginPresenter.getLoginParam().loginSourceType = LoginType.LocalLoginType.SIM_LOGIN;
        this.mMobileLoginPresenter.getLoginParam().sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SIM_LOGIN, getPageName());
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", this.mMobileLoginPresenter.getLoginParam().sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstans.CustomEvent.UT_SMS_ACTION, "", LoginType.LocalLoginType.SMS_LOGIN, hashMap);
        this.mMobileLoginPresenter.sendSMS();
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade6443", new Object[]{this});
        } else if (!isActivityAvaiable()) {
        } else {
            dismissLoading();
            toast(getString(R.string.aliuser_onekey_login_fail_tip), 0);
            switchToRecommendLogin();
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_LOGIN) {
            onOneKeyLogin();
        } else if (i == LoginClickAction.ACTION_FACE) {
            activeFaceLogin();
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else if (i == LoginClickAction.ACTION_TAOBAO) {
            goTaobao();
        } else {
            super.doRealAction(i);
        }
    }
}
