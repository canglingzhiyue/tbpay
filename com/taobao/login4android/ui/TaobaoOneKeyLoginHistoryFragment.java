package com.taobao.login4android.ui;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.OneKeyLoginPresenter;
import com.ali.user.mobile.login.presenter.SimVerifyPresenter;
import com.ali.user.mobile.login.presenter.UserMobileLoginPresenter;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.CircleImageView;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoOneKeyLoginHistoryFragment extends TaobaoOneKeyLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean fingerLoginEnable = false;
    public FaceLoginPresenter mFaceLoginPresenter;
    public LoginParam mOrinParam;
    public SimVerifyPresenter mSimLoginPresenter;

    static {
        kge.a(1627645919);
    }

    public static /* synthetic */ Object ipc$super(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        } else if (hashCode != 1385199677) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initParams();
            return null;
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "Page_history_onekey";
    }

    public static /* synthetic */ void access$000(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27039371", new Object[]{taobaoOneKeyLoginHistoryFragment, str});
        } else {
            taobaoOneKeyLoginHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("958aa4b2", new Object[]{taobaoOneKeyLoginHistoryFragment, str});
        } else {
            taobaoOneKeyLoginHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411b5f3", new Object[]{taobaoOneKeyLoginHistoryFragment, str});
        } else {
            taobaoOneKeyLoginHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$300(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7298c734", new Object[]{taobaoOneKeyLoginHistoryFragment, str});
        } else {
            taobaoOneKeyLoginHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$400(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e82936b", new Object[]{taobaoOneKeyLoginHistoryFragment});
        } else {
            taobaoOneKeyLoginHistoryFragment.switchAccount();
        }
    }

    public static /* synthetic */ void access$500(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa6e9b6", new Object[]{taobaoOneKeyLoginHistoryFragment, str});
        } else {
            taobaoOneKeyLoginHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ String access$600(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e80bc9d3", new Object[]{taobaoOneKeyLoginHistoryFragment}) : taobaoOneKeyLoginHistoryFragment.mSource;
    }

    public static /* synthetic */ BaseActivity access$700(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseActivity) ipChange.ipc$dispatch("d61d94d2", new Object[]{taobaoOneKeyLoginHistoryFragment}) : taobaoOneKeyLoginHistoryFragment.mAttachedActivity;
    }

    public static /* synthetic */ void access$800(TaobaoOneKeyLoginHistoryFragment taobaoOneKeyLoginHistoryFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c8d16f", new Object[]{taobaoOneKeyLoginHistoryFragment});
        } else {
            taobaoOneKeyLoginHistoryFragment.openHelp();
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment
    public void switchToRecommendLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97b4543", new Object[]{this});
        } else {
            showMoreLoginBottomMenu();
        }
    }

    @Override // com.taobao.login4android.ui.TaobaoOneKeyLoginFragment, com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_onekey_login_history_tb;
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment
    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        super.initParams();
        try {
            if (ServiceFactory.getService(NumberAuthService.class) == null || ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() == null) {
                return;
            }
            this.mProtocolTitle = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
            this.mProtocolUrl = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.login4android.ui.TaobaoOneKeyLoginFragment, com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.isHistoryMode = true;
        if (this.loginParam != null) {
            this.mOrinParam = this.loginParam.m102clone();
        }
        if (this.loginParam == null) {
            this.loginParam = new LoginParam();
        }
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam.m102clone());
        this.mSimLoginPresenter = new SimVerifyPresenter(this, this.loginParam.m102clone());
        this.oneKeyLoginPresenter = new OneKeyLoginPresenter(this, this.loginParam.m102clone());
        this.mMobileLoginPresenter = new UserMobileLoginPresenter(this, this.loginParam.m102clone());
        super.initViews(view);
        if (this.mShowIdTextView != null && this.mUserLoginActivity.mHistoryAccount != null && !StringUtils.isEmpty(this.mUserLoginActivity.mHistoryAccount.mobile)) {
            this.mShowIdTextView.setText(StringUtil.dataMasking(this.mUserLoginActivity.mHistoryAccount.mobile));
            this.historyHid = this.mUserLoginActivity.mHistoryAccount.userId;
        }
        this.mAvatarIV = (CircleImageView) view.findViewById(R.id.aliuser_login_avatar);
        if (this.mUserLoginActivity.mHistoryAccount != null && !StringUtils.isEmpty(this.mUserLoginActivity.mHistoryAccount.headImg)) {
            updateAvatar(this.mUserLoginActivity.mHistoryAccount.headImg);
        }
        this.fingerLoginEnable = isFingerEnable(this.mUserLoginActivity.mHistoryAccount);
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment
    public void onOneKeyLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeabd78", new Object[]{this});
            return;
        }
        addControl("onekey");
        this.mSimLoginPresenter.simLoginWithUserInput(getAccountName(), this.historyHid);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public String getAccountName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("680b717", new Object[]{this}) : this.mUserLoginActivity.mHistoryAccount != null ? this.mUserLoginActivity.mHistoryAccount.mobile : "";
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment
    public void activeFaceLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dd842d", new Object[]{this});
        } else if (ServiceFactory.getService(FaceService.class) == null || this.mFaceLoginPresenter == null) {
        } else {
            LoginParam loginParam = new LoginParam();
            loginParam.hid = this.mUserLoginActivity.mHistoryAccount.userId;
            loginParam.deviceTokenKey = this.mUserLoginActivity.mHistoryAccount.tokenKey;
            loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.SCAN_FACE_LOGIN, getPageName());
            loginParam.loginSourceType = LoginType.LocalLoginType.SCAN_FACE_LOGIN;
            loginParam.utPageName = getPageName();
            LoginContext.sCurrentLoginParam = loginParam;
            HashMap hashMap = new HashMap();
            hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
            UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.SCAN_FACE_LOGIN, hashMap);
            this.mFaceLoginPresenter.activeFaceLogin(loginParam);
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
            MenuItem menuItem = new MenuItem();
            menuItem.setText(getString(R.string.aliuser_login_sms_login));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyLoginHistoryFragment.access$000(TaobaoOneKeyLoginHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SMS);
                        TaobaoOneKeyLoginHistoryFragment.this.switchToSmsLogin(false);
                    }
                }
            });
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_login_pwd_login));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyLoginHistoryFragment.access$100(TaobaoOneKeyLoginHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OHTER_PWD);
                        TaobaoOneKeyLoginHistoryFragment.this.switchToPwdLogin();
                    }
                }
            });
            MenuItem menuItem3 = new MenuItem();
            menuItem3.setText(getString(R.string.aliuser_scan_login_text));
            menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyLoginHistoryFragment.this.addCheckAction(2);
                    }
                }
            });
            arrayList.add(menuItem);
            if (this.mUserLoginActivity.mHistoryAccount.hasPwd == 1) {
                arrayList.add(menuItem2);
            }
            if (DataProviderFactory.getDataProvider().supportFaceLogin() && (this.mUserLoginActivity.isFaceLoginEnvEnable || this.mUserLoginActivity.isFaceLoginActivate)) {
                arrayList.add(menuItem3);
            }
            if (this.fingerLoginEnable) {
                MenuItem menuItem4 = new MenuItem();
                menuItem4.setText(getString(R.string.aliuser_finger_button_text));
                menuItem4.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem4) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                    public void onClickMenuItem(View view, MenuItem menuItem5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem5});
                        } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                        } else {
                            TaobaoOneKeyLoginHistoryFragment.access$200(TaobaoOneKeyLoginHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FINGER);
                            TaobaoOneKeyLoginHistoryFragment.this.addCheckAction(LoginClickAction.ACTION_FINGER);
                        }
                    }
                });
                arrayList.add(menuItem4);
            }
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    public void switchToPwdLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343fb322", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, false);
        intent.putExtra("degrade", false);
        if (this.mProtocolCB != null) {
            intent.putExtra("check", this.mProtocolCB.isChecked());
        }
        this.mUserLoginActivity.gotoPwdLoginFragment(intent);
    }

    public void switchToSmsLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb67b0e", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(LoginConstant.FORCE_NORMAL_MODE, false);
        intent.putExtra("degrade", false);
        intent.putExtra("hasSendSms", z);
        if (this.mProtocolCB != null) {
            intent.putExtra("check", this.mProtocolCB.isChecked());
        }
        if (this.mOrinParam != null) {
            if (this.mMobileLoginPresenter.mLoginParam != null) {
                this.mOrinParam.smsSid = this.mMobileLoginPresenter.mLoginParam.smsSid;
            }
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(this.mOrinParam));
        }
        this.mUserLoginActivity.gotoMobileLoginFragment(intent);
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1004) {
            this.mFaceLoginPresenter.onActivityResult(i, i2, intent);
        } else if (i == 1001) {
            this.mMobileLoginPresenter.onActivityResult(i, i2, intent);
        } else {
            this.mSimLoginPresenter.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        menu.clear();
        menuInflater.inflate(R.menu.aliuser_menu, menu);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ab27c", new Object[]{this, menu});
        } else if (menu.findItem(R.id.aliuser_menu_item_help) == null || menu.findItem(R.id.aliuser_menu_item_more) == null) {
        } else {
            menu.findItem(R.id.aliuser_menu_item_more).setVisible(true);
            menu.findItem(R.id.aliuser_menu_item_help).setVisible(false);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void appendIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        } else if (this.mMobileLoginPresenter == null || this.mMobileLoginPresenter.getLoginParam() == null) {
        } else {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mMobileLoginPresenter.getLoginParam().source;
            if (intent == null) {
                return;
            }
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment
    public void showBottomMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cac9e0e", new Object[]{this});
        } else if (!isActive() || !isVisible()) {
        } else {
            BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            MenuItem menuItem = new MenuItem();
            menuItem.setText(getString(R.string.aliuser_other_account_login));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyLoginHistoryFragment.access$300(TaobaoOneKeyLoginHistoryFragment.this, "Button-ChooseOtherAccountLogin");
                        TaobaoOneKeyLoginHistoryFragment.access$400(TaobaoOneKeyLoginHistoryFragment.this);
                    }
                }
            });
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_reg));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyLoginHistoryFragment.access$500(TaobaoOneKeyLoginHistoryFragment.this, "Button-Reg");
                        RegistParam registParam = new RegistParam();
                        registParam.registSite = TaobaoOneKeyLoginHistoryFragment.this.getLoginSite();
                        registParam.regFrom = DataProviderFactory.getDataProvider().getRegFrom();
                        registParam.source = TaobaoOneKeyLoginHistoryFragment.access$600(TaobaoOneKeyLoginHistoryFragment.this);
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(TaobaoOneKeyLoginHistoryFragment.access$700(TaobaoOneKeyLoginHistoryFragment.this), registParam);
                    }
                }
            });
            arrayList.add(menuItem);
            arrayList.add(menuItem2);
            MenuItem menuItem3 = new MenuItem();
            menuItem3.setText(getString(R.string.aliuser_menu_help));
            menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    } else if (!TaobaoOneKeyLoginHistoryFragment.this.isActive()) {
                    } else {
                        TaobaoOneKeyLoginHistoryFragment.access$800(TaobaoOneKeyLoginHistoryFragment.this);
                    }
                }
            });
            arrayList.add(menuItem3);
            addMoreMenus(bottomMenuFragment, arrayList);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        FaceLoginPresenter faceLoginPresenter = this.mFaceLoginPresenter;
        if (faceLoginPresenter != null) {
            faceLoginPresenter.onDestory();
        }
        SimVerifyPresenter simVerifyPresenter = this.mSimLoginPresenter;
        if (simVerifyPresenter == null) {
            return;
        }
        simVerifyPresenter.onDestory();
    }

    @Override // com.ali.user.mobile.login.ui.OneKeyLoginFragment, com.ali.user.mobile.login.ui.OneKeyLoginView
    public void onGetAccessTokenFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bade6443", new Object[]{this});
        } else if (this.mUserLoginActivity.mHistoryAccount != null && !StringUtils.isEmpty(this.mUserLoginActivity.mHistoryAccount.mobile)) {
            onNeedVerifyMobile("", this.mUserLoginActivity.mHistoryAccount.mobile);
        } else {
            switchToSmsLogin(false);
        }
    }

    @Override // com.taobao.login4android.ui.TaobaoOneKeyLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        } else {
            PrivacyUtil.addMoreMenus(bottomMenuFragment, list, this);
        }
    }
}
