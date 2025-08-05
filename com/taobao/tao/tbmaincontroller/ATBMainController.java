package com.taobao.tao.tbmaincontroller;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.navigationextern.c;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.h;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.e;
import com.taobao.tao.navigation.g;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TBDialog;
import com.taobao.tao.util.TBMainLog;
import com.taobao.tao.util.TargetTabHelper;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import tb.kge;
import tb.oml;

/* loaded from: classes8.dex */
public class ATBMainController implements TBMainController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_FRAGMENT_TAB_INDEX = "EXTRA_FRAGMENT_TAB_INDEX";
    private static final String TAG = "ATBMainController";
    private Activity mActivity;
    private LoginBroadcastReceiver mLoginReceiver;
    private h mOnKeyDownListener;
    private TBFragmentTabHost mTabHost;
    public SystemBarDecorator systemBarDecorator;
    private int mTargetTabIndex = 0;
    private boolean mFromLogin = false;
    private boolean isResumed = false;

    /* renamed from: com.taobao.tao.tbmaincontroller.ATBMainController$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21117a = new int[LoginAction.values().length];

        static {
            try {
                f21117a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21117a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21117a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21117a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1639311112);
        kge.a(2113439567);
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.k
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        }
    }

    public static /* synthetic */ Activity access$000(ATBMainController aTBMainController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("47e89336", new Object[]{aTBMainController}) : aTBMainController.mActivity;
    }

    public ATBMainController(Activity activity) {
        this.mActivity = activity;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        try {
            this.systemBarDecorator = new SystemBarDecorator(this.mActivity);
            this.systemBarDecorator.enableImmersiveStatusBar();
        } catch (Throwable th) {
            Log.e(TAG, "enableImmersiveStatusBar failed:", th);
        }
        this.mActivity.setContentView(R.layout.tb_activity_main);
        observerLoginStatus();
        TBMainHost.a().a(this);
        initTab();
        positionTab();
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this.mActivity);
    }

    private void positionTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289b8033", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            this.mTabHost.setCurrentTab(0);
            return;
        }
        int targetTabIndex = TargetTabHelper.getTargetTabIndex(activity, activity.getIntent());
        a.a(targetTabIndex);
        this.mTabHost.setCurrentTab(targetTabIndex);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.isResumed = true;
        if (!this.mFromLogin) {
            return;
        }
        this.mTabHost.setCurrentTab(this.mTargetTabIndex);
        this.mFromLogin = false;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.isResumed = false;
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        unObserverLoginStatus();
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.setNavigationVisibleCallback(null);
        }
        TBMainHost.a().b();
        e.b();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        activity.setIntent(intent);
        if (intent.getExtras() == null) {
            return;
        }
        Activity activity2 = this.mActivity;
        this.mTabHost.setCurrentTab(TargetTabHelper.getTargetTabIndex(activity2, activity2.getIntent()));
        Fragment currentFragment = this.mTabHost.getCurrentFragment();
        if (!(currentFragment instanceof TBBaseFragment)) {
            return;
        }
        Activity activity3 = this.mActivity;
        if (!(activity3 instanceof FragmentActivity) || ((FragmentActivity) activity3).getSupportFragmentManager().findFragmentByTag(currentFragment.getTag()) == null) {
            return;
        }
        ((TBBaseFragment) currentFragment).onNewIntent(intent);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.mActivity.isFinishing() || showDebugSettings(i, keyEvent)) {
            return false;
        }
        if (keyEvent.getRepeatCount() > 0) {
            return i == 4;
        }
        h hVar = this.mOnKeyDownListener;
        if (hVar != null && hVar.onKeyDown(i, keyEvent)) {
            return true;
        }
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof TBBaseFragment) && ((TBBaseFragment) currentFragment).onPanelKeyDown(i, keyEvent)) {
            return true;
        }
        if (i != 4 || this.mTabHost.getCurrentTab() == 0) {
            return false;
        }
        Activity activity = this.mActivity;
        activity.setIntent(Nav.from(activity).intentForUri(e.e().get(0).e()));
        this.mTabHost.setCurrentTab(0);
        return true;
    }

    public void initTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f201d26c", new Object[]{this});
            return;
        }
        this.mTabHost = (TBFragmentTabHost) this.mActivity.findViewById(16908306);
        Activity activity = this.mActivity;
        if (activity instanceof FragmentActivity) {
            this.mTabHost.setup(activity, ((FragmentActivity) activity).getSupportFragmentManager(), R.id.tbTabFragment);
            this.mTabHost.getTabWidget().setDividerDrawable(17170445);
            e.a(this.mTabHost);
            this.mTabHost.setNavigationVisibleCallback(new oml() { // from class: com.taobao.tao.tbmaincontroller.ATBMainController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oml
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : b.a(ATBMainController.access$000(ATBMainController.this), false);
                }

                @Override // tb.oml
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : b.a(ATBMainController.access$000(ATBMainController.this), true);
                }
            });
            c.a(this.mActivity);
            this.mTabHost.updateTabHost();
            return;
        }
        throw new RuntimeException("activity is not instanceof FragmentActivity");
    }

    private void observerLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6809060c", new Object[]{this});
            return;
        }
        if (this.mLoginReceiver == null) {
            this.mLoginReceiver = new LoginBroadcastReceiver();
        }
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.mLoginReceiver);
    }

    /* loaded from: classes8.dex */
    public class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(656891571);
        }

        public LoginBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                ATBMainController.this.handleLoginBroadcast(LoginAction.valueOf(intent.getAction()));
            }
        }
    }

    public void handleLoginBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e790823", new Object[]{this, loginAction});
        } else if (loginAction == null || this.mTabHost == null) {
        } else {
            if (!this.isResumed) {
                int i = AnonymousClass4.f21117a[loginAction.ordinal()];
                if (i == 1) {
                    this.mTargetTabIndex = this.mTabHost.getCurrentTab();
                    this.mFromLogin = true;
                    this.mTabHost.fromLogin(this.mFromLogin);
                } else if (i == 2) {
                    g b = e.b(this.mTabHost.getCurrentTab());
                    if (b != null) {
                        if (b.s()) {
                            g b2 = e.b(this.mTabHost.getLastTab());
                            if (b2 != null) {
                                if (b2.s()) {
                                    this.mTargetTabIndex = 0;
                                    this.mFromLogin = true;
                                    this.mTabHost.fromLogin(this.mFromLogin);
                                } else {
                                    this.mTargetTabIndex = this.mTabHost.getLastTab();
                                    this.mFromLogin = true;
                                    this.mTabHost.fromLogin(this.mFromLogin);
                                }
                            } else {
                                this.mTargetTabIndex = 0;
                                this.mFromLogin = true;
                                this.mTabHost.fromLogin(this.mFromLogin);
                            }
                        } else {
                            this.mTargetTabIndex = this.mTabHost.getCurrentTab();
                            this.mFromLogin = true;
                            this.mTabHost.fromLogin(this.mFromLogin);
                        }
                    } else {
                        this.mTargetTabIndex = 0;
                        this.mFromLogin = true;
                        this.mTabHost.fromLogin(this.mFromLogin);
                    }
                } else if (i == 3 || i == 4) {
                    this.mTargetTabIndex = 0;
                    this.mFromLogin = true;
                    this.mTabHost.fromLogin(this.mFromLogin);
                }
            }
            ArrayList<Fragment> fragments = this.mTabHost.getFragments();
            if (fragments == null || fragments.size() <= 0) {
                return;
            }
            Iterator<Fragment> it = fragments.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                if (next instanceof TBBaseFragment) {
                    ((TBBaseFragment) next).handleLoginAction(loginAction);
                }
            }
        }
    }

    public void unObserverLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4947333", new Object[]{this});
        } else if (this.mLoginReceiver == null) {
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.mLoginReceiver);
        }
    }

    public boolean showDebugSettings(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() > 0 && ((i == 4 || i == 25) && this.mActivity.getString(R.string.env_switch).equals("1"))) {
            try {
                Class<?> cls = Class.forName("android.taobao.mulitenv.EnvironmentViewControler");
                Method method = cls.getMethod("getRootView", new Class[0]);
                final Method method2 = cls.getMethod("exit", new Class[0]);
                final Object newInstance = cls.getConstructor(Activity.class).newInstance(this.mActivity);
                if (newInstance != null) {
                    final TBDialog tBDialog = new TBDialog(this.mActivity, -1, "环境设置", null, (View) method.invoke(newInstance, new Object[0]), true);
                    tBDialog.setPositiveButton(new View.OnClickListener() { // from class: com.taobao.tao.tbmaincontroller.ATBMainController.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            tBDialog.dismiss();
                            SharedPreferences.Editor edit = ATBMainController.access$000(ATBMainController.this).getApplicationContext().getSharedPreferences(TransportConstants.KEY_UUID, 0).edit();
                            edit.clear();
                            edit.commit();
                            try {
                                method2.invoke(newInstance, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                    });
                    tBDialog.setNegativeButton(new View.OnClickListener() { // from class: com.taobao.tao.tbmaincontroller.ATBMainController.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            tBDialog.dismiss();
                            try {
                                method2.invoke(newInstance, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                    });
                    tBDialog.show();
                    TBMainLog.tlog(TAG, "show debug dialog");
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, com.taobao.tao.k
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost == null) {
            return null;
        }
        return tBFragmentTabHost.getCurrentFragment();
    }

    @Override // com.taobao.tao.k
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mActivity.getClass().getName();
    }

    @Override // com.taobao.tao.k
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f06186", new Object[]{this}) : this.mActivity.getClass().getSimpleName();
    }

    @Override // com.taobao.tao.k
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mActivity;
    }

    @Override // com.taobao.tao.k
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}) : (T) this.mActivity.findViewById(i);
    }

    @Override // com.taobao.tao.k
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost == null) {
            return;
        }
        int currentTab = tBFragmentTabHost.getCurrentTab();
        this.mTabHost.clearAllTabs();
        initTab();
        this.mTabHost.setCurrentTab(currentTab);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, com.taobao.tao.k
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this}) : this.mTabHost;
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else if (Login.checkSessionValid()) {
        } else {
            Login.login(true);
            this.mFromLogin = true;
            TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
            if (tBFragmentTabHost == null) {
                return;
            }
            this.mTargetTabIndex = tBFragmentTabHost.getCurrentTab();
            this.mTabHost.fromLogin(this.mFromLogin);
        }
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void registerOnKeyDownListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca6f2c1", new Object[]{this, hVar});
        } else {
            this.mOnKeyDownListener = hVar;
        }
    }
}
