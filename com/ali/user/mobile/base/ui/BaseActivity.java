package com.ali.user.mobile.base.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.ali.user.mobile.app.dataprovider.DataProvider;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int HOOK_NATIVE_BACK = 0;
    private static final String TAG = "BaseActivity";
    public boolean activityIsTranslucent;
    public boolean isLoginObserver;
    public ViewGroup mContentView;
    public IDialogHelper mDialogHelper;
    public BroadcastReceiver mLoginReceiver;
    public Toolbar mToolbar;
    public ViewGroup mViewGroup;
    public boolean needAdjustToolbar;
    public boolean supportTaobaoOrAlipay = false;
    public boolean isHookNativeBackByJs = false;
    public boolean isHookNativeBack = false;
    public Handler handler = new Handler(Looper.getMainLooper()) { // from class: com.ali.user.mobile.base.ui.BaseActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
            if (str.hashCode() == 72182663) {
                super.dispatchMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
                return;
            }
            super.dispatchMessage(message);
            if (message.what != BaseActivity.HOOK_NATIVE_BACK) {
                return;
            }
            LoginTLogAdapter.e("BaseActivity", "onMessage : " + message.what);
            BaseActivity.this.isHookNativeBack = true;
        }
    };

    public static /* synthetic */ Object ipc$super(BaseActivity baseActivity, String str, Object... objArr) {
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
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        }
    }

    public boolean isNavIconLeftBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17467beb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean isShowNavIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69ad8500", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public Toolbar getToolbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toolbar) ipChange.ipc$dispatch("21834ebf", new Object[]{this}) : this.mToolbar;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setOrientation();
        setDefaultTheme();
        super.onCreate(bundle);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                getWindow().getDecorView().setImportantForAutofill(8);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        onLanguageSwitchNotify();
        if (AliUserLogin.mAppreanceExtentions != null && AliUserLogin.mAppreanceExtentions.getDialogHelper() != null) {
            try {
                this.mDialogHelper = (IDialogHelper) AliUserLogin.mAppreanceExtentions.getDialogHelper().newInstance();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (this.isLoginObserver) {
            this.mLoginReceiver = new BroadcastReceiver() { // from class: com.ali.user.mobile.base.ui.BaseActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    LoginTLogAdapter.e("BaseActivity", "onReceive action=" + intent.getAction());
                    if (LoginResActions.LOGIN_SUCCESS_ACTION.equals(intent.getAction())) {
                        BaseActivity.this.finishWhenLoginSuccess();
                    } else if (!LoginResActions.LOGIN_CLOSE_ACTION.equals(intent.getAction())) {
                    } else {
                        BaseActivity.this.finish();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginResActions.LOGIN_SUCCESS_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_CLOSE_ACTION);
            LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.mLoginReceiver, intentFilter);
        }
        setupViews();
        try {
            if (needToolbar()) {
                initToolBar();
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        initViews();
        setListenerToRootView();
        setStatusBarMode();
    }

    public void setStatusBarMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549eb249", new Object[]{this});
            return;
        }
        try {
            if (AliUserLogin.mAppreanceExtentions != null && !AliUserLogin.mAppreanceExtentions.isNeedDarkStatusBarMode()) {
                if (AliUserLogin.mAppreanceExtentions == null || AliUserLogin.mAppreanceExtentions.isNeedDarkStatusBarMode()) {
                    return;
                }
                StatusBarHelper.setStatusBarMode(this, false);
                return;
            }
            StatusBarHelper.setStatusBarMode(this, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        kge.a(-988189019);
        HOOK_NATIVE_BACK = 0;
    }

    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this}) : this.handler;
    }

    public void finishWhenLoginSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae22c6e", new Object[]{this});
        } else {
            finish();
        }
    }

    public boolean needToolbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a370e010", new Object[]{this})).booleanValue();
        }
        if (this.activityIsTranslucent) {
            return false;
        }
        return AliUserLogin.mAppreanceExtentions == null || AliUserLogin.mAppreanceExtentions.isNeedToolbar();
    }

    public void setOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4717d95", new Object[]{this});
        } else if (this.activityIsTranslucent && Build.VERSION.SDK_INT == 26) {
        } else {
            if ((DataProviderFactory.getDataProvider().isAdapterPadAndFold() && DeviceUtils.isTablet(this)) || DeviceUtils.isFoldDeviceExpand(this)) {
                setRequestedOrientation(3);
            } else if (DataProviderFactory.getDataProvider().getOrientation() == 0) {
                setRequestedOrientation(0);
                getWindow().setFlags(1024, 1024);
            } else if (DataProviderFactory.getDataProvider().getOrientation() == 1) {
                setRequestedOrientation(1);
            } else {
                setRequestedOrientation(DataProviderFactory.getDataProvider().getOrientation());
            }
        }
    }

    public void setDefaultTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c0ad11", new Object[]{this});
        } else if (DataProviderFactory.getDataProvider().getLoginStyle() > 0) {
            setTheme(DataProviderFactory.getDataProvider().getLoginStyle());
        } else if (this.activityIsTranslucent) {
        } else {
            setTheme(R.style.AliUserAppThemeBase);
        }
    }

    public void setupViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142219f8", new Object[]{this});
            return;
        }
        setContentView(getLayout());
        this.mViewGroup = (ViewGroup) findViewById(R.id.aliuser_main_content);
        ViewGroup viewGroup = this.mViewGroup;
        if (viewGroup != null && this.activityIsTranslucent) {
            viewGroup.setBackgroundColor(0);
        }
        this.mContentView = (ViewGroup) findViewById(R.id.aliuser_content);
        this.mContentView.addView((ViewGroup) getLayoutInflater().inflate(getLayoutContent(), this.mViewGroup, false));
    }

    public int getLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue() : R.layout.aliuser_activity_container;
    }

    public void setContainerBackground(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee994aaf", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup viewGroup = this.mViewGroup;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setBackgroundResource(i);
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_activity_parent_default_content;
    }

    public int getToolbarLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ff8cebc9", new Object[]{this})).intValue() : R.layout.aliuser_toolbar;
    }

    public void initToolBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b52eb32", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(getToolbarLayout(), this.mViewGroup, false);
        this.mToolbar = (AliUserCustomToolbar) viewGroup.findViewById(R.id.aliuser_toolbar);
        this.mViewGroup.addView(viewGroup, 0);
        setSupportActionBar(this.mToolbar);
        if (isShowNavIcon()) {
            if (isNavIconLeftBack()) {
                if (DataProviderFactory.getDataProvider().getToolbarBackIcon() > 0) {
                    setNavigationBackIcon(DataProviderFactory.getDataProvider().getToolbarBackIcon());
                } else {
                    setNavigationBackIcon(R.drawable.aliuser_ic_actionbar_back);
                }
            } else {
                setNavigationCloseIcon();
            }
        } else {
            getSupportActionBar().c(false);
        }
        this.mToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.base.ui.BaseActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    BaseActivity.this.onClickBack(view);
                }
            }
        });
        this.mToolbar.setNavigationContentDescription(R.string.aliuser_title_back);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mToolbar.getLayoutParams();
        marginLayoutParams.height = (int) getResources().getDimension(R.dimen.aliuser_btn_height);
        if (this.needAdjustToolbar && !LanguageUtil.isChineseLanguage()) {
            marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.aliuser_toolbar_padding);
        }
        this.mToolbar.setLayoutParams(marginLayoutParams);
        if (needToolbar()) {
            return;
        }
        getSupportActionBar().e();
    }

    public void onClickBack(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f861eb7b", new Object[]{this, view});
            return;
        }
        hideInputMethodPannel(view);
        onBackPressed();
    }

    public void setNavigationBackIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191548e6", new Object[]{this, new Integer(i)});
            return;
        }
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setNavigationIcon(i);
        }
        if (getSupportActionBar() == null) {
            return;
        }
        getSupportActionBar().d();
    }

    public void setNavigationBackIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d761bd", new Object[]{this});
        } else {
            setNavigationBackIcon(R.drawable.aliuser_ic_actionbar_back);
        }
    }

    public void setNavigationCloseIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e4e1a22", new Object[]{this});
        } else {
            setNavigationBackIcon(R.drawable.aliuser_ic_actionbar_close);
        }
    }

    public void setListenerToRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27ea29f", new Object[]{this});
            return;
        }
        final View findViewById = getWindow().getDecorView().findViewById(16908290);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ali.user.mobile.base.ui.BaseActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                } else if (findViewById.getRootView().getHeight() - findViewById.getHeight() <= 100) {
                } else {
                    BaseActivity.this.dismissProgressDialog();
                }
            }
        });
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.alert(this, str, str2, str3, onClickListener, str4, onClickListener2);
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.toast(this, str, i);
    }

    public void showProgress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f3b5b", new Object[]{this, str});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.showProgressDialog(this, str, true);
    }

    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.dismissProgressDialog();
    }

    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.dismissAlertDialog();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        onLanguageSwitchNotify();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        try {
            setOrientation();
            onLanguageSwitchNotify();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onLanguageSwitchNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6106de1b", new Object[]{this});
        } else if (!(DataProviderFactory.getDataProvider() instanceof DataProvider)) {
        } else {
            Configuration configuration = getResources().getConfiguration();
            configuration.locale = DataProviderFactory.getDataProvider().getCurrentLanguage();
            if (configuration.locale == null) {
                return;
            }
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            DataProviderFactory.getApplicationContext().getResources().updateConfiguration(configuration, DataProviderFactory.getApplicationContext().getResources().getDisplayMetrics());
        }
    }

    public void hideInputMethodPannel(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8072fea", new Object[]{this, view});
        } else if (view == null) {
        } else {
            try {
                ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mLoginReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.mLoginReceiver);
    }
}
