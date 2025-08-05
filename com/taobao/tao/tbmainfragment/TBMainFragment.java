package com.taobao.tao.tbmainfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Toast;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.navigation.TBFragmentTabHost;
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
import tb.omh;
import tb.oml;

/* loaded from: classes.dex */
public class TBMainFragment extends TBMainBaseFragment implements com.taobao.tao.k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EXTRA_FRAGMENT_TAB_INDEX = "EXTRA_FRAGMENT_TAB_INDEX";
    private static final int REQ_MODIFY_FRAGMENT = 100;
    private static final String TAG = "TBMainFragment";
    private g mSupportCreateAnimation;
    private TBFragmentTabHost mTabHost;
    private View mView;
    public SystemBarDecorator systemBarDecorator;
    private int mTargetTabIndex = 0;
    private boolean mFromLogin = false;
    private boolean isResumed = false;

    /* renamed from: com.taobao.tao.tbmainfragment.TBMainFragment$4  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21126a = new int[LoginAction.values().length];

        static {
            try {
                f21126a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21126a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21126a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21126a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(416191439);
        kge.a(-1479396665);
    }

    public static /* synthetic */ Object ipc$super(TBMainFragment tBMainFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2137173437:
                return super.onSupportCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1542694236:
                super.onSupportInvisible();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -739997161:
                super.onAttachFragment((Fragment) objArr[0]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 604309033:
                return new Boolean(super.needPublicMenu());
            case 797441118:
                super.onPause();
                return null;
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1371699585:
                super.onFragmentResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Bundle) objArr[2]);
                return null;
            case 1950489833:
                super.onSupportVisible();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.k
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static TBMainFragment newInstance(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMainFragment) ipChange.ipc$dispatch("21d30b8b", new Object[]{uri});
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(s.KEY_FRAGMENT_URL, uri);
        TBMainFragment tBMainFragment = new TBMainFragment();
        tBMainFragment.setArguments(bundle);
        return tBMainFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e48a17", new Object[]{this, fragment});
        } else {
            super.onAttachFragment(fragment);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else {
            super.onAttach(context);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (this.mActivity == null) {
            return;
        }
        try {
            this.systemBarDecorator = new SystemBarDecorator(this.mActivity);
            this.systemBarDecorator.enableImmersiveStatusBar();
        } catch (Throwable th) {
            Log.e(TAG, "enableImmersiveStatusBar failed:", th);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mView == null) {
            this.mView = layoutInflater.inflate(R.layout.tb_main_fragment, viewGroup, false);
            initTab(this.mView);
            positionTab();
            this.mTabHost.setNavigationVisibleCallback(new oml() { // from class: com.taobao.tao.tbmainfragment.TBMainFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.oml
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : com.taobao.tao.tbmaincontroller.b.a(TBMainFragment.this.mActivity, false);
                }

                @Override // tb.oml
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : com.taobao.tao.tbmaincontroller.b.a(TBMainFragment.this.mActivity, true);
                }
            });
            UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        }
        return this.mView;
    }

    private void positionTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289b8033", new Object[]{this});
        } else if (this.mActivity == null) {
            this.mTabHost.setCurrentTab(0);
        } else {
            int targetTabIndex = TargetTabHelper.getTargetTabIndex(this.mActivity, this.mActivity.getIntent());
            com.taobao.tao.tbmaincontroller.a.a(targetTabIndex);
            this.mTabHost.setCurrentTab(targetTabIndex);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else if (this.mActivity == null) {
        } else {
            this.mActivity.setIntent(intent);
            if (intent.getExtras() == null) {
                return;
            }
            this.mTabHost.setCurrentTab(TargetTabHelper.getTargetTabIndex(this.mActivity, this.mActivity.getIntent()));
            Fragment currentFragment = this.mTabHost.getCurrentFragment();
            if (!(currentFragment instanceof TBBaseFragment) || !(this.mActivity instanceof FragmentActivity) || getChildFragmentManager().findFragmentByTag(currentFragment.getTag()) == null) {
                return;
            }
            ((TBBaseFragment) currentFragment).onNewIntent(intent);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.isResumed = true;
        if (!this.mFromLogin) {
            return;
        }
        this.mTabHost.setCurrentTab(this.mTargetTabIndex);
        this.mFromLogin = false;
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.isResumed = false;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost != null) {
            tBFragmentTabHost.setNavigationVisibleCallback(null);
        }
        super.onDestroy();
        com.taobao.tao.navigation.e.b();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    public void handleLoginBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e790823", new Object[]{this, loginAction});
        } else if (loginAction == null || this.mTabHost == null) {
        } else {
            if (!this.isResumed) {
                int i = AnonymousClass4.f21126a[loginAction.ordinal()];
                if (i == 1) {
                    this.mTargetTabIndex = this.mTabHost.getCurrentTab();
                    this.mFromLogin = true;
                    this.mTabHost.fromLogin(this.mFromLogin);
                } else if (i == 2) {
                    com.taobao.tao.navigation.g b = com.taobao.tao.navigation.e.b(this.mTabHost.getCurrentTab());
                    if (b != null) {
                        if (b.s()) {
                            com.taobao.tao.navigation.g b2 = com.taobao.tao.navigation.e.b(this.mTabHost.getLastTab());
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

    public void initTab(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e16e6", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.mTabHost = (TBFragmentTabHost) view.findViewById(16908306);
            this.mTabHost.setup(this.mActivity, getChildFragmentManager(), R.id.tbTabFragment);
            this.mTabHost.getTabWidget().setDividerDrawable(17170445);
            com.taobao.tao.navigation.e.a(this.mTabHost);
            com.taobao.android.navigationextern.c.a(this.mActivity);
            this.mTabHost.updateTabHost();
            this.mTabHost.preloadIndicatorView();
        }
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
        initTab(this.mView);
        this.mTabHost.setCurrentTab(currentTab);
    }

    @Override // com.taobao.tao.k
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        View view = this.mView;
        if (view == null) {
            return null;
        }
        return (T) view.findViewById(i);
    }

    @Override // com.taobao.tao.k
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this}) : this.mTabHost;
    }

    @Override // com.taobao.tao.k
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this}) : this.mTabHost.getCurrentFragment();
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

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
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
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof TBBaseFragment) && ((TBBaseFragment) currentFragment).onPanelKeyDown(i, keyEvent)) {
            return true;
        }
        if (i != 4 || this.mTabHost.getCurrentTab() == 0) {
            return false;
        }
        this.mActivity.setIntent(Nav.from(this.mActivity).intentForUri(com.taobao.tao.navigation.e.e().get(0).e()));
        this.mTabHost.setCurrentTab(0);
        return true;
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

    public boolean showDebugSettings(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() > 0 && ((i == 4 || i == 25) && this.mActivity.getString(R.string.env_switch).equals("1"))) {
            try {
                Class<?> cls = Class.forName("android.taobao.mulitenv.EnvironmentViewControler");
                Method method = cls.getMethod("getRootView", new Class[0]);
                final Method method2 = cls.getMethod("exit", new Class[0]);
                final Object newInstance = cls.getConstructor(Activity.class).newInstance(this.mActivity);
                if (newInstance != null) {
                    final TBDialog tBDialog = new TBDialog(this.mActivity, -1, "环境设置", null, (View) method.invoke(newInstance, new Object[0]), true);
                    tBDialog.setPositiveButton(new View.OnClickListener() { // from class: com.taobao.tao.tbmainfragment.TBMainFragment.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            tBDialog.dismiss();
                            SharedPreferences.Editor edit = TBMainFragment.this.mActivity.getApplicationContext().getSharedPreferences(TransportConstants.KEY_UUID, 0).edit();
                            edit.clear();
                            edit.commit();
                            try {
                                method2.invoke(newInstance, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                    });
                    tBDialog.setNegativeButton(new View.OnClickListener() { // from class: com.taobao.tao.tbmainfragment.TBMainFragment.3
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

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : getClass().getName();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
        } else {
            super.onHiddenChanged(z);
        }
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment
    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        if (!d.e(this.mActivity)) {
            return super.needPublicMenu();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public void onFragmentResult(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c27981", new Object[]{this, new Integer(i), new Integer(i2), bundle});
            return;
        }
        super.onFragmentResult(i, i2, bundle);
        if (i != 100 || i2 != -1 || bundle == null) {
            return;
        }
        Toast.makeText(getActivity(), bundle.getString("title"), 0).show();
    }

    @Override // com.taobao.tao.tbmainfragment.TBMainBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74421ce9", new Object[]{this});
            return;
        }
        TBMainLog.tlog(TAG, "into onSupportVisible: ");
        super.onSupportVisible();
        TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
        if (tBFragmentTabHost == null) {
            omh.a("fragment_lifecycle_error", "tab_host_is_null");
            return;
        }
        Fragment currentFragment = tBFragmentTabHost.getCurrentFragment();
        if (currentFragment == null) {
            omh.a("fragment_lifecycle_error", "tab_fragment_is_null");
        } else if (!currentFragment.isAdded() || currentFragment.isResumed()) {
        } else {
            omh.a("fragment_lifecycle_error", "tab_fragment_detached_when_visible_" + currentFragment.getClass().getName());
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, com.taobao.tao.tbmainfragment.ISupportFragment
    public void onSupportInvisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40c5aa4", new Object[]{this});
            return;
        }
        TBMainLog.tlog(TAG, "into onSupportInvisible: ");
        super.onSupportInvisible();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment
    public Animation onSupportCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("809d5243", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        Animation animation = null;
        if (this.mSupportCreateAnimation != null) {
            TBMainLog.tlog(TAG, "mFragmentAnimatorInterrupt is not null");
            animation = this.mSupportCreateAnimation.a(i, z, i2);
        }
        if (animation != null) {
            TBMainLog.tlog(TAG, "interrput animation is not null");
            return animation;
        }
        TBMainLog.tlog(TAG, "interrput animation is not null");
        return super.onSupportCreateAnimation(i, z, i2);
    }

    public void setSupportCreateAnimation(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6033330", new Object[]{this, gVar});
        } else {
            this.mSupportCreateAnimation = gVar;
        }
    }
}
