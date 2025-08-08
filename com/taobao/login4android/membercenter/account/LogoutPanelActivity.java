package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.webview.LoginAgreementHelper;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.ui.AliUserBindMobileDialog;
import com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class LogoutPanelActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String PAGE_NAME = "LogoutPanel";
    public static final String TAG = "login.logoutpanel";
    public Activity activity;
    public FragmentManager mFragmentManager;
    public String mProtocolTitle;
    public String mProtocolUrl;
    public String type = null;

    static {
        kge.a(298084261);
    }

    public static /* synthetic */ Object ipc$super(LogoutPanelActivity logoutPanelActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 143326307) {
            super.onBackPressed();
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : PAGE_NAME;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(LogoutPanelActivity logoutPanelActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7edce5", new Object[]{logoutPanelActivity});
        } else {
            logoutPanelActivity.disagreeCallbck();
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        this.mFragmentManager = getSupportFragmentManager();
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_activity_frame_content);
        this.mViewGroup.setBackgroundColor(0);
        if (LoginSwitch.getSwitch(LoginSwitch.EXTRA_PREFECT, "false") && ServiceFactory.getService(NumberAuthService.class) != null && ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).needPrefetch() && StringUtils.isEmpty(Login.getLoginToken())) {
            ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth("logoutPanel");
        }
        this.activity = this;
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        } else {
            openFragmentByConfig(getIntent());
        }
    }

    private void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            try {
                this.type = intent.getStringExtra("actionType");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (StringUtils.equals("logout_panel", this.type)) {
            showLogoutPanel();
        } else if (!StringUtils.equals("agreement", this.type)) {
        } else {
            if (ServiceFactory.getService(NumberAuthService.class) != null && ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap() != null) {
                this.mProtocolTitle = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolName");
                this.mProtocolUrl = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("protocolURL");
            }
            showAgreement();
        }
    }

    private void showAgreement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853e9994", new Object[]{this});
            return;
        }
        uiShown(UTConstant.PageName.UT_PAGE_LOGIN_BAR, "checkAgreement_dialog");
        final TaobaoRegProtocolDialogFragment rrotocolFragment = getRrotocolFragment();
        rrotocolFragment.setNeedAdaptElder(false);
        rrotocolFragment.setPageNameSpm(getPageName());
        rrotocolFragment.needAutoReg(false);
        rrotocolFragment.setPostiveBtnText(getString(R.string.aliuser_agree));
        rrotocolFragment.setNegativeBtnText(getString(R.string.aliuser_protocol_disagree));
        rrotocolFragment.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LogoutPanelActivity.this.addControl(UTConstant.PageName.UT_PAGE_LOGIN_BAR, "Agreement_Button_Cancel");
                rrotocolFragment.dismissAllowingStateLoss();
                LogoutPanelActivity.access$000(LogoutPanelActivity.this);
                LogoutPanelActivity.this.activity.finish();
            }
        });
        rrotocolFragment.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                LogoutPanelActivity.this.addControl(UTConstant.PageName.UT_PAGE_LOGIN_BAR, "Agreement_Button_Agree");
                rrotocolFragment.dismissAllowingStateLoss();
                if (LoginAgreementHelper.sCallback != null) {
                    LoginAgreementHelper.sCallback.onSuccess();
                }
                LogoutPanelActivity.this.activity.finish();
            }
        });
        rrotocolFragment.setOneKeyProtocol(this.mProtocolTitle);
        rrotocolFragment.setOneKeyProtocolUrl(this.mProtocolUrl);
        rrotocolFragment.show(getSupportFragmentManager(), getPageName());
    }

    private void disagreeCallbck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606345f5", new Object[]{this});
        } else if (LoginAgreementHelper.sCallback == null) {
        } else {
            LoginAgreementHelper.sCallback.onFail(-1, null);
        }
    }

    public void addControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a730d", new Object[]{this, str});
        } else {
            UserTrackAdapter.control(getPageName(), str);
        }
    }

    public void addControl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144fd397", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.control(str, str2);
        }
    }

    public TaobaoRegProtocolDialogFragment getRrotocolFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaobaoRegProtocolDialogFragment) ipChange.ipc$dispatch("3dde219b", new Object[]{this}) : new TaobaoRegProtocolDialogFragment();
    }

    private void showLogoutPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91f7564", new Object[]{this});
            return;
        }
        uiShown("BindMobile");
        AliUserBindMobileDialog aliUserBindMobileDialog = new AliUserBindMobileDialog();
        aliUserBindMobileDialog.setLogoUrl("https://img.alicdn.com/imgextra/i2/O1CN01IA8rhl1oiDDZDtNVt_!!6000000005258-2-tps-885-435.png");
        aliUserBindMobileDialog.setPageNameSpm(getPageName());
        aliUserBindMobileDialog.setTitle(getResources().getString(R.string.aliuser_logout_title));
        aliUserBindMobileDialog.setContent(getResources().getString(R.string.aliuser_logout_message));
        aliUserBindMobileDialog.setPostiveBtnText(getResources().getString(R.string.aliuser_to_other_account));
        aliUserBindMobileDialog.setPositive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (LogoutPanelActivity.this.activity == null || LogoutPanelActivity.this.activity.isFinishing()) {
                } else {
                    UserTrackAdapter.sendUT(LogoutPanelActivity.PAGE_NAME, "Page_AccountManager_Switch");
                    AccountListComponent.openMultiAccountPage(LogoutPanelActivity.this.activity);
                    LogoutPanelActivity.this.finish();
                }
            }
        });
        aliUserBindMobileDialog.setCancelListener(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    LogoutPanelActivity.this.finish();
                }
            }
        });
        aliUserBindMobileDialog.setNegativeBtnText(getString(R.string.aliuser_direct_logout));
        aliUserBindMobileDialog.setNagetive(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.LogoutPanelActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (LogoutPanelActivity.this.activity == null || LogoutPanelActivity.this.activity.isFinishing()) {
                } else {
                    UserTrackAdapter.sendUT(LogoutPanelActivity.PAGE_NAME, "Page_AccountManager_Logout");
                    Login.logout(LogoutPanelActivity.this.activity);
                    LogoutPanelActivity.this.finish();
                }
            }
        });
        aliUserBindMobileDialog.show(this.mFragmentManager, getPageName());
    }

    public void uiShown(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa789ae", new Object[]{this, str});
        } else {
            UserTrackAdapter.UIShown(getPageName(), str);
        }
    }

    public void uiShown(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cae3f8", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.UIShown(str, str2);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if ("agreement".equals(this.type)) {
            addControl("Agreement_Button_Back");
            disagreeCallbck();
            finish();
        } else {
            super.onBackPressed();
        }
    }
}
