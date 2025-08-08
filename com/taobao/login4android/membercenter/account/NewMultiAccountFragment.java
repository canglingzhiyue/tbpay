package com.taobao.login4android.membercenter.account;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.BaseLogonFragment;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.ui.BaseLoginFragment;
import com.ali.user.mobile.model.AutoLoginCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.SiteUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.autologin.AutoLoginParam;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.membercenter.account.adapter.AccountHelper;
import com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.taobao.R;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class NewMultiAccountFragment extends BaseLogonFragment implements View.OnClickListener, View.OnFocusChangeListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_AccountManager";
    public static final String TAG = "login.MultiAccount";
    public static final int TYPE_ADD = 1;
    public static final int TYPE_CHANGE = 2;
    public boolean loginMode;
    public ListView mAccountListView;
    public NewAccountAdapter mAdapter;
    public View mAddAccountBtn;
    public Activity mAttachedActivity;
    public View mBackBtn;
    public TextView mDeleteManagerBtn;
    public List<SessionModel> mListAccounts;
    public SessionList mSessionList;
    private BroadcastReceiver mSwitchLoginReceiver;
    public TextView mTitleTV;
    private String changingUserId = "";
    public boolean isFromAccount = true;
    private final int ADD_ACCOUNT = 1;
    private final int SWITCH_ACCOUNT = 2;

    /* renamed from: com.taobao.login4android.membercenter.account.NewMultiAccountFragment$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17896a = new int[LoginAction.values().length];

        static {
            try {
                f17896a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17896a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17896a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-1419453248);
        kge.a(-1201612728);
        kge.a(632431720);
        kge.a(54921071);
        kge.a(1038424275);
    }

    public static /* synthetic */ Object ipc$super(NewMultiAccountFragment newMultiAccountFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : PAGE_NAME;
    }

    public String getSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3139e888", new Object[]{this}) : "switchAccount";
    }

    public void initParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1621df92", new Object[]{this, view, new Boolean(z)});
        }
    }

    public static /* synthetic */ boolean access$000(NewMultiAccountFragment newMultiAccountFragment, SessionList sessionList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5302985", new Object[]{newMultiAccountFragment, sessionList})).booleanValue() : newMultiAccountFragment.sessionListEmpty(sessionList);
    }

    public static /* synthetic */ void access$100(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b151e89", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$200(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84167028", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$300(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d17c1c7", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ void access$400(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6191366", new Object[]{newMultiAccountFragment});
        } else {
            newMultiAccountFragment.dismissProgress();
        }
    }

    public static /* synthetic */ String access$500(NewMultiAccountFragment newMultiAccountFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b66f9a3b", new Object[]{newMultiAccountFragment}) : newMultiAccountFragment.changingUserId;
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment, com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        boolean z = this.isFromAccount;
        if (z) {
            LoginStatus.resetLoginFlag(!z);
        }
        initParams();
        loginBeforeRender();
    }

    public void loginBeforeRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b05585", new Object[]{this});
        } else if (Login.checkSessionValid()) {
        } else {
            Bundle bundle = new Bundle();
            String hintInput = getHintInput();
            if (!StringUtils.isEmpty(hintInput)) {
                LoginParam loginParam = new LoginParam();
                loginParam.loginId = hintInput;
                bundle.putString(LoginConstant.LOGINPARAM, JSON.toJSONString(loginParam));
            }
            bundle.putString("source", "MultiCheckLogin");
            Login.login(true, bundle);
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.mAttachedActivity = activity;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        if (!checkBeforeDraw()) {
            return;
        }
        drawView();
    }

    public boolean checkBeforeDraw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("104e6796", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_multiaccount_list_layout;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserTrackAdapter.updatePageName(getActivity(), getPageName(), BaseLoginFragment.getTraces());
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mAccountListView = (ListView) view.findViewById(R.id.aliuser_multi_account_lv);
        this.mDeleteManagerBtn = (TextView) view.findViewById(R.id.aliuser_multi_account_delete_manager_btn);
        this.mDeleteManagerBtn.setOnClickListener(this);
        this.mBackBtn = view.findViewById(R.id.aliuser_custom_back);
        this.mBackBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (NewMultiAccountFragment.this.mAttachedActivity == null || !(NewMultiAccountFragment.this.mAttachedActivity instanceof BaseActivity)) {
                } else {
                    ((BaseActivity) NewMultiAccountFragment.this.mAttachedActivity).onClickBack(view2);
                }
            }
        });
        this.mAddAccountBtn = view.findViewById(R.id.aliuser_multi_account_add_btn);
        this.mAddAccountBtn.setOnClickListener(this);
        this.mTitleTV = (TextView) view.findViewById(R.id.aliuser_multi_account_title);
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mDeleteManagerBtn, this.mTitleTV);
    }

    public void setVisibility(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7643c8c", new Object[]{this, view, new Integer(i)});
        } else if (view == null) {
        } else {
            view.setVisibility(i);
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceiveSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ad5f6c", new Object[]{this});
        } else if (!isActivityAvaiable()) {
        } else {
            drawView();
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceiveFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bfd7383", new Object[]{this});
        } else {
            dismissProgress();
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment
    public void doWhenReceivedCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a964207", new Object[]{this});
            return;
        }
        if (!Login.checkSessionValid()) {
            Activity activity = this.mAttachedActivity;
            if (activity != null) {
                activity.finish();
            }
            if (AccountListComponent.getOnAccountChangedListener() != null) {
                AccountListComponent.getOnAccountChangedListener().OnAccountChanged();
            }
        }
        dismissProgress();
    }

    public void drawView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15eef210", new Object[]{this});
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, SessionList>() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [com.ali.user.mobile.rpc.login.model.SessionList, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ SessionList doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(SessionList sessionList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, sessionList});
                    } else {
                        a(sessionList);
                    }
                }

                public SessionList a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (SessionList) ipChange2.ipc$dispatch("8cd065e4", new Object[]{this, objArr}) : SecurityGuardManagerWraper.getSessionListFromFile();
                }

                public void a(SessionList sessionList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fc852dc3", new Object[]{this, sessionList});
                    } else if (!NewMultiAccountFragment.this.isActivityAvaiable()) {
                    } else {
                        NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                        newMultiAccountFragment.mSessionList = sessionList;
                        if (sessionList != null) {
                            newMultiAccountFragment.mListAccounts = sessionList.sessionModels;
                        }
                        NewMultiAccountFragment newMultiAccountFragment2 = NewMultiAccountFragment.this;
                        if (NewMultiAccountFragment.access$000(newMultiAccountFragment2, newMultiAccountFragment2.mSessionList)) {
                            NewMultiAccountFragment.this.gotoLoginActivity(null, true);
                            return;
                        }
                        NewMultiAccountFragment.this.initAdapter();
                        NewMultiAccountFragment.this.afterViews();
                        NewMultiAccountFragment.access$100(NewMultiAccountFragment.this);
                    }
                }
            }, new Object[0]);
        }
    }

    public void doAddThing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6696ff", new Object[]{this});
            return;
        }
        sendControl("Button_Add_Click");
        if (Login.checkSessionValid()) {
            gotoLoginActivity(null, true, 1);
            sendControl("Button_Add");
        } else if (StringUtils.isEmpty(Login.getUserId()) || StringUtils.isEmpty(Login.getLoginToken())) {
            toLoginWithCurrent(true);
        } else {
            LoginController.getInstance().doAutoLoginWithCallback(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer(), false, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        NewMultiAccountFragment.this.gotoLoginActivity(null, true, 1);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onBizFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str});
                    } else {
                        NewMultiAccountFragment.this.toLoginWithCurrent(true);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onNetworkError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                    } else {
                        Toast.makeText(DataProviderFactory.getApplicationContext(), NewMultiAccountFragment.this.mAttachedActivity.getString(R.string.aliuser_network_error), 0).show();
                    }
                }
            });
        }
    }

    public void toLoginWithCurrent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47397f08", new Object[]{this, new Boolean(z)});
        } else {
            gotoLoginActivity(null, z);
        }
    }

    public String getHintInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94296a4c", new Object[]{this});
        }
        String email = Login.getEmail();
        return StringUtils.isEmpty(email) ? Login.getNick() : email;
    }

    private boolean sessionListEmpty(SessionList sessionList) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51709bcf", new Object[]{this, sessionList})).booleanValue() : sessionList == null || sessionList.sessionModels == null || sessionList.sessionModels.size() == 0;
    }

    public void gotoLoginActivity(SessionModel sessionModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b632ba", new Object[]{this, sessionModel, new Boolean(z)});
        } else {
            gotoLoginActivity(sessionModel, z, -1);
        }
    }

    public void gotoLoginActivity(SessionModel sessionModel, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96109789", new Object[]{this, sessionModel, new Boolean(z), new Integer(i)});
            return;
        }
        dismissProgress();
        if (this.isFromAccount) {
            LoginStatus.compareAndSetFromChangeAccount(false, true);
        }
        Bundle bundle = new Bundle();
        if (sessionModel != null) {
            LoginParam loginParam = new LoginParam();
            try {
                loginParam.hid = Long.parseLong(sessionModel.userId);
            } catch (Throwable unused) {
            }
            bundle.putString(LoginConstant.LOGINPARAM, JSON.toJSONString(loginParam));
        }
        if (i == 1) {
            bundle.putString("source", "MultiAddAccount");
        } else if (i == 2) {
            bundle.putString("source", "MultiSwitchAccount");
        } else {
            bundle.putString("source", "MultiCheckLogin");
        }
        if (LoginSwitch.isInABTestRegion(LoginSwitch.ADD_MULTI_TAG, LoginSwitch.ADD_MULTI_TAG_DEFAULT)) {
            bundle.putBoolean(LoginConstant.FORM_ADD_ACCOUNT, z);
        } else {
            bundle.putBoolean(LoginConstant.FORCE_NORMAL_MODE, z);
        }
        bundle.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
        LoginController.getInstance().userLogin(true, true, bundle);
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        this.mAdapter = new NewAccountAdapter(this.mAttachedActivity, this.mAccountListView, this.mListAccounts, this.loginMode);
        this.mAccountListView.setAdapter((ListAdapter) this.mAdapter);
        addDeleteListener();
        addConfirmListener();
        this.mAdapter.notifyDataSetChanged();
        String pageName = getPageName();
        UserTrackAdapter.sendUT(pageName, "OnlineAccountList", "size=" + this.mListAccounts.size(), null);
    }

    private void addDeleteListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cf2f07", new Object[]{this});
        } else {
            this.mAdapter.setOnDeleteClickListener(new NewAccountAdapter.OnButtonClickListener() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.OnButtonClickListener
                public void click(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d7d00", new Object[]{this, view, new Integer(i)});
                    } else {
                        NewMultiAccountFragment.this.doDeleteThing(i);
                    }
                }
            });
        }
    }

    private void addConfirmListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5280bba", new Object[]{this});
        } else {
            this.mAdapter.setConfirmClickListener(new NewAccountAdapter.OnButtonClickListener() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.OnButtonClickListener
                public void click(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d7d00", new Object[]{this, view, new Integer(i)});
                    } else if (NewMultiAccountFragment.this.mAdapter != null && NewMultiAccountFragment.this.mAdapter.isDeleteMode()) {
                    } else {
                        NewMultiAccountFragment.this.registerSwitchUserLoginStatus(2);
                        NewMultiAccountFragment.this.doChangeThing(i);
                    }
                }
            });
        }
    }

    public void afterViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb54a979", new Object[]{this});
            return;
        }
        this.mAccountListView.setOnItemClickListener(this);
        this.mAccountListView.setOnItemLongClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            return;
        }
        NewAccountAdapter newAccountAdapter = this.mAdapter;
        if (newAccountAdapter != null && newAccountAdapter.isDeleteMode()) {
            return;
        }
        registerSwitchUserLoginStatus(2);
        doChangeThing(i);
    }

    public void doChangeThing(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18bcda9", new Object[]{this, new Integer(i)});
            return;
        }
        sendControl("Button_Change_Click");
        if (Login.checkSessionValid()) {
            doChange(i);
        } else if (StringUtils.isEmpty(Login.getUserId()) || StringUtils.isEmpty(Login.getLoginToken())) {
            LoginStatus.compareAndSetFromChangeAccount(false, true);
            toLoginWithCurrent(false);
        } else {
            LoginStatus.compareAndSetFromChangeAccount(false, true);
            LoginController.getInstance().doAutoLoginWithCallback(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer(), false, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        NewMultiAccountFragment.this.doChange(i);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onBizFail(int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i2), str});
                    } else {
                        NewMultiAccountFragment.this.toLoginWithCurrent(false);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onNetworkError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                        return;
                    }
                    NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                    newMultiAccountFragment.toast(newMultiAccountFragment.mAttachedActivity.getString(R.string.aliuser_network_error), 0);
                }
            });
        }
    }

    public void doChange(int i) {
        SessionModel sessionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2c2021", new Object[]{this, new Integer(i)});
        } else if (!isActivityAvaiable() || (sessionModel = this.mListAccounts.get(i)) == null || isCurrentLoginUser(sessionModel)) {
        } else {
            this.changingUserId = sessionModel.userId;
            sendControl("Button_Change", sessionModel.userId);
            showProgress(getResources().getString(R.string.con_ali_multi_account_change));
            LoginStatus.compareAndSetFromChangeAccount(false, true);
            autologinTarget(sessionModel);
        }
    }

    public boolean isCurrentLoginUser(SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5655d0e", new Object[]{this, sessionModel})).booleanValue() : AccountHelper.isCurrentLoginUser(sessionModel);
    }

    public void autologinTarget(final SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e937e330", new Object[]{this, sessionModel});
            return;
        }
        boolean isInABTestRegion = LoginSwitch.isInABTestRegion(LoginSwitch.NEED_KEEP_SGCOOKIE_IN_CHANGE_ACCOUNT, 0);
        if (Login.session == null) {
            Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        }
        if (isInABTestRegion) {
            Login.session.clearCookieManager(true);
        } else {
            Login.session.clearCookieManager();
        }
        AutoLoginParam autoLoginParam = new AutoLoginParam();
        autoLoginParam.token = sessionModel.autoLoginToken;
        autoLoginParam.userId = sessionModel.userId;
        autoLoginParam.site = SiteUtil.getDefaultLoginSite();
        autoLoginParam.apiRefer = ApiReferer.generateApiReferer();
        autoLoginParam.needBroadcast = true;
        autoLoginParam.source = getSource();
        autoLoginParam.isFromChangeAccount = true;
        LoginController.getInstance().doAutoLoginWithCallback(autoLoginParam, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else {
                    NewMultiAccountFragment.access$200(NewMultiAccountFragment.this);
                }
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onBizFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str});
                    return;
                }
                NewMultiAccountFragment.access$300(NewMultiAccountFragment.this);
                NewMultiAccountFragment.this.gotoLoginActivity(sessionModel, false, 2);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onNetworkError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                    return;
                }
                NewMultiAccountFragment.access$400(NewMultiAccountFragment.this);
                NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                newMultiAccountFragment.toast(newMultiAccountFragment.mAttachedActivity.getString(R.string.aliuser_network_error), 0);
            }
        });
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("caf3a110", new Object[]{this, adapterView, view, new Integer(i), new Long(j)})).booleanValue() : doDeleteThing(i);
    }

    public boolean doDeleteThing(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7d41e8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        sendControl("Button_Delete_Click");
        if (Login.checkSessionValid()) {
            doDelete(i);
            sendControl("Button_Delete");
        } else if (StringUtils.isEmpty(Login.getUserId()) || StringUtils.isEmpty(Login.getLoginToken())) {
            toLoginWithCurrent(false);
        } else {
            LoginController.getInstance().doAutoLoginWithCallback(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer(), false, new AutoLoginCallback() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        NewMultiAccountFragment.this.doDelete(i);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onBizFail(int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i2), str});
                    } else {
                        NewMultiAccountFragment.this.toLoginWithCurrent(false);
                    }
                }

                @Override // com.ali.user.mobile.model.AutoLoginCallback
                public void onNetworkError() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                        return;
                    }
                    NewMultiAccountFragment newMultiAccountFragment = NewMultiAccountFragment.this;
                    newMultiAccountFragment.toast(newMultiAccountFragment.mAttachedActivity.getString(R.string.aliuser_network_error), 0);
                }
            });
        }
        return true;
    }

    public boolean doDelete(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eebb30a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mListAccounts.get(i) != null) {
            showBottomMenu(i);
        }
        return true;
    }

    public void showBottomMenu(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e796b5", new Object[]{this, new Integer(i)});
        } else if (!isActivityAvaiable() || !isVisible() || this.mListAccounts.get(i) == null) {
        } else {
            BottomMenuFragment bottomMenuFragment = new BottomMenuFragment();
            ArrayList arrayList = new ArrayList();
            MenuItem menuItem = new MenuItem();
            menuItem.setText(getString(R.string.aliuser_multi_account_delete_confirm_title));
            menuItem.textColor = getResources().getColor(R.color.aliuser_text_light_gray);
            menuItem.textSize = getResources().getDimension(R.dimen.aliuser_textsize_small);
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_multi_account_delete_confirm));
            menuItem2.textColor = getResources().getColor(R.color.aliuser_edittext_bg_color_normal);
            menuItem2.textSize = getResources().getDimension(R.dimen.aliuser_textsize_normal);
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                        return;
                    }
                    NewMultiAccountFragment.this.sendControl("Button-Reg");
                    NewMultiAccountFragment.this.deleteUser(i);
                }
            });
            arrayList.add(menuItem);
            arrayList.add(menuItem2);
            bottomMenuFragment.setMenuItems(arrayList);
            bottomMenuFragment.show(getFragmentManager(), getPageName());
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseFragment
    public boolean isActivityAvaiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ec97ffb", new Object[]{this})).booleanValue();
        }
        return (this.mAttachedActivity != null && (Build.VERSION.SDK_INT >= 17 ? !(this.mAttachedActivity.isFinishing() || this.mAttachedActivity.isDestroyed()) : !this.mAttachedActivity.isFinishing())) && isAdded();
    }

    public void deleteUser(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40070506", new Object[]{this, new Integer(i)});
            return;
        }
        sendControl("Button-DeleteUser");
        if (this.mListAccounts.size() > 0) {
            if (this.mListAccounts.size() <= i) {
                this.mAttachedActivity.finish();
                return;
            }
            SessionModel remove = this.mListAccounts.remove(i);
            SecurityGuardManagerWraper.removeSessionModelFromFile(remove.userId);
            try {
                SecurityGuardManagerWraper.removeHistoryAccount(SecurityGuardManagerWraper.findHistoryAccount(Long.parseLong(remove.userId)));
            } catch (NumberFormatException unused) {
            }
            if (AccountHelper.isCurrentLoginUser(remove)) {
                this.mAttachedActivity.finish();
                Login.logout(DataProviderFactory.getApplicationContext());
                if (Build.VERSION.SDK_INT < 25) {
                    return;
                }
                sendControl("Button_PreDeleteCurrent");
                return;
            }
            if (Build.VERSION.SDK_INT >= 25) {
                sendControl("Button_PreDelete");
            }
            if (this.mListAccounts.size() > 0) {
                this.mAccountListView.setAdapter((ListAdapter) null);
                boolean isDeleteMode = this.mAdapter.isDeleteMode();
                this.mAdapter = null;
                initAdapter();
                this.mAdapter.setDeleteMode(isDeleteMode);
                return;
            }
            Activity activity = this.mAttachedActivity;
            if (activity instanceof MultiAccountActivity) {
                activity.finish();
            }
            gotoLoginActivity(null, true);
            return;
        }
        this.mAttachedActivity.finish();
        gotoLoginActivity(null, false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_multi_account_add_btn) {
            registerSwitchUserLoginStatus(1);
            doAddThing();
        } else if (id != R.id.aliuser_multi_account_delete_manager_btn) {
        } else {
            NewAccountAdapter newAccountAdapter = this.mAdapter;
            if (newAccountAdapter != null && !newAccountAdapter.isDeleteMode()) {
                switchDeleteMode();
            } else if (this.mAdapter == null) {
            } else {
                switchNormalMode();
            }
        }
    }

    public void switchDeleteMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6271bc9", new Object[]{this});
            return;
        }
        this.mTitleTV.setText(R.string.aliuser_multi_account_delete_account_title);
        this.mDeleteManagerBtn.setText(R.string.aliuser_cancel);
        this.mAddAccountBtn.setVisibility(8);
        this.mAdapter.setDeleteMode(true);
        addDeleteListener();
        addConfirmListener();
        this.mAccountListView.setAdapter((ListAdapter) this.mAdapter);
        this.mAdapter.notifyDataSetChanged();
    }

    public void switchNormalMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9baa5705", new Object[]{this});
            return;
        }
        this.mTitleTV.setText(R.string.aliuser_multi_change_account);
        this.mDeleteManagerBtn.setText(R.string.aliuser_text_manage);
        this.mAddAccountBtn.setVisibility(0);
        if (this.mAdapter == null) {
            this.mAdapter = new NewAccountAdapter(this.mAttachedActivity, this.mAccountListView, this.mListAccounts, this.loginMode);
            addDeleteListener();
            addConfirmListener();
        }
        this.mAdapter.setDeleteMode(false);
        this.mAccountListView.setAdapter((ListAdapter) this.mAdapter);
        this.mAdapter.notifyDataSetChanged();
    }

    public void registerSwitchUserLoginStatus(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70c7bc3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mSwitchLoginReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String pageName;
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null) {
                } else {
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    int i2 = AnonymousClass2.f17896a[valueOf.ordinal()];
                    if (i2 == 1) {
                        if (Build.VERSION.SDK_INT >= 25) {
                            int i3 = i;
                            if (i3 == 1) {
                                pageName = NewMultiAccountFragment.this.getPageName();
                                str = "AddMultiAccountsSuc";
                            } else if (i3 == 2) {
                                pageName = NewMultiAccountFragment.this.getPageName();
                                str = "ChangeMultiAccountsSuc";
                            }
                            UserTrackAdapter.sendUT(pageName, str);
                        }
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.login4android.membercenter.account.NewMultiAccountFragment.10.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (NewMultiAccountFragment.this.isActivityAvaiable()) {
                                    NewMultiAccountFragment.this.mAttachedActivity.finish();
                                }
                                if (AccountListComponent.getOnAccountChangedListener() == null) {
                                    return;
                                }
                                AccountListComponent.getOnAccountChangedListener().OnAccountChanged();
                            }
                        }, 100L);
                        NewMultiAccountFragment.this.unregisterSwitchLoginReceiver();
                    } else if (i2 != 2 && i2 != 3) {
                    } else {
                        NewMultiAccountFragment.this.unregisterSwitchLoginReceiver();
                        if (!Login.checkSessionValid()) {
                            if (NewMultiAccountFragment.this.isActivityAvaiable()) {
                                NewMultiAccountFragment.this.mAttachedActivity.finish();
                            }
                            if (AccountListComponent.getOnAccountChangedListener() != null) {
                                AccountListComponent.getOnAccountChangedListener().OnAccountChanged();
                            }
                        }
                        if (valueOf != LoginAction.NOTIFY_LOGIN_FAILED || i != 2) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("arg2", NewMultiAccountFragment.access$500(NewMultiAccountFragment.this));
                        hashMap.put(UTHitBuilders.a.FIELD_ARG2, NewMultiAccountFragment.access$500(NewMultiAccountFragment.this));
                        UserTrackAdapter.sendUserTrack(NewMultiAccountFragment.this.getPageName(), "ChangeMultiAccountsFail", hashMap);
                    }
                }
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), this.mSwitchLoginReceiver);
    }

    public void unregisterSwitchLoginReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60be44f", new Object[]{this});
        } else if (this.mSwitchLoginReceiver == null) {
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(DataProviderFactory.getApplicationContext(), this.mSwitchLoginReceiver);
            this.mSwitchLoginReceiver = null;
        }
    }

    @Override // com.ali.user.mobile.base.BaseLogonFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unregisterSwitchLoginReceiver();
        super.onDestroy();
    }

    public void sendControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3cb986", new Object[]{this, str});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), str, "", new HashMap());
        }
    }

    public void sendControl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd4cdd0", new Object[]{this, str, str2});
        } else {
            UserTrackAdapter.sendControlUT(getPageName(), str, str2, new HashMap());
        }
    }
}
