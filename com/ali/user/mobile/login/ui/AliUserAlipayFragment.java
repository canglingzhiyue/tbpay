package com.ali.user.mobile.login.ui;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.login.presenter.FaceLoginPresenter;
import com.ali.user.mobile.login.presenter.UserLoginPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserAlipayFragment extends BaseLoginFragment implements FaceLoginView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LoginParam loginParam = null;
    public View mAlipayLoginBtn;
    public TextView mRecommendLoginTV;
    public String mSource;
    public UserLoginPresenter mUserLoginPresenter;

    static {
        kge.a(1882523478);
        kge.a(1385792644);
    }

    public static /* synthetic */ Object ipc$super(AliUserAlipayFragment aliUserAlipayFragment, String str, Object... objArr) {
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
            case -1180824595:
                super.initViews((View) objArr[0]);
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
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstans.PageName.UT_PAGE_ALIPAY;
    }

    public boolean showMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a928c487", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        }
    }

    public static /* synthetic */ void access$000(AliUserAlipayFragment aliUserAlipayFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853591da", new Object[]{aliUserAlipayFragment, str});
        } else {
            aliUserAlipayFragment.addControl(str);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_alipay;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().a("");
            ((BaseActivity) getActivity()).setNavigationCloseIcon();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        View findViewById = view.findViewById(R.id.aliuser_switch_help);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserAlipayFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    AliUserAlipayFragment aliUserAlipayFragment = AliUserAlipayFragment.this;
                    aliUserAlipayFragment.interact = true;
                    aliUserAlipayFragment.openHelp();
                }
            });
        }
        View findViewById2 = view.findViewById(R.id.aliuser_login_menu);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserAlipayFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    AliUserAlipayFragment aliUserAlipayFragment = AliUserAlipayFragment.this;
                    aliUserAlipayFragment.interact = true;
                    AliUserAlipayFragment.access$000(aliUserAlipayFragment, "more");
                    AliUserAlipayFragment.this.showBottomMenu();
                }
            });
        }
        this.mAlipayLoginBtn = view.findViewById(R.id.aliuser_login_login_btn);
        this.mRecommendLoginTV = (TextView) view.findViewById(R.id.aliuser_switch_recommend_login);
        TextView textView = this.mRecommendLoginTV;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        initMode();
        generateProtocol("", "");
        setOnClickListener(this.mAlipayLoginBtn);
        this.mUserLoginPresenter.onStart();
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize((TextView) view.findViewById(R.id.aliuser_login_login_btn_tv), this.mRecommendLoginTV, this.mProtocolTV);
    }

    public void initMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621aedda", new Object[]{this});
        } else if (this.mUserLoginActivity.hadReadHistory) {
            if (this.mUserLoginActivity == null || this.mUserLoginActivity.mHistoryAccount == null) {
                return;
            }
            this.isHistoryMode = true;
            this.historyHid = this.mUserLoginActivity.mHistoryAccount.userId;
            switchToHistoryMode(this.mUserLoginActivity.mHistoryAccount);
        } else {
            this.isHistoryMode = false;
            this.historyHid = 0L;
            switchMode(this.isHistoryMode, null);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        addControl("back");
        return false;
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
        }
        this.mUserLoginPresenter = new UserLoginPresenter(this, this.loginParam);
        this.mFaceLoginPresenter = new FaceLoginPresenter(this, this.loginParam);
        this.mBioPresenter = new BioPresenter(this, this.loginParam);
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
        if (id == R.id.aliuser_switch_recommend_login) {
            addControl("otherid");
            switchAccount();
        } else if (id == R.id.aliuser_login_login_btn) {
            addCheckAction(LoginClickAction.ACTION_ALIPAY);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doRealAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f3d65d", new Object[]{this, new Integer(i)});
        } else if (i == LoginClickAction.ACTION_ALIPAY) {
            goAlipay();
        } else if (i == LoginClickAction.ACTION_FACE) {
            onFaceLogin(true);
        } else {
            super.doRealAction(i);
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
        loginParam.hid = this.historyHid;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this);
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

    @Override // com.ali.user.mobile.login.ui.FaceLoginView
    public void toLastLoginFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db8452f", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        UserLoginPresenter userLoginPresenter = this.mUserLoginPresenter;
        if (userLoginPresenter != null && userLoginPresenter.getLoginParam() != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.goPwdOrSMSFragment(intent);
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

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        if (showMenu()) {
            return;
        }
        menu.clear();
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
    public boolean isInOneKeyABTestRegion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cd611a", new Object[]{this})).booleanValue();
        }
        return LoginSwitch.isInABTestRegion("resumeToOnekey" + getPageName(), 10000);
    }
}
