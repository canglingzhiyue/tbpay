package com.taobao.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.widget.TabHost;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmaincontroller.ATBMainController;
import com.taobao.tao.tbmaincontroller.TBMainController;
import com.taobao.tao.tbmaincontroller.b;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.n;
import com.taobao.tao.tbmainfragment.q;
import com.taobao.tao.tbmainfragment.s;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.uikit.immersive.ITBImmersive;
import java.util.Iterator;
import tb.kge;

@PopLayer.PopupAllowedFromFragment
@PopLayer.PopupOnlyManually
/* loaded from: classes8.dex */
public class TBMainActivity extends SupportActivity implements TabHost.OnTabChangeListener, e, k, ITBImmersive {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ABGLOBAL_SAVE_INSTANCE_KEY = "tbmain_save_instance";
    public static final String KEY_APM_MAIN_INDEX = "mainTabIndex";
    private static final String TAG = "TBMainActivity";
    private TBMainController mTBMainController;
    private FragmentManager.FragmentLifecycleCallbacks mFragmentLifecycleCallbacks = null;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks = null;

    static {
        kge.a(-170339594);
        kge.a(1311616296);
        kge.a(-1479396665);
        kge.a(-213345416);
        kge.a(37515620);
    }

    public static /* synthetic */ Object ipc$super(TBMainActivity tBMainActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1772888905:
                super.onSaveInstanceState((Bundle) objArr[0], (PersistableBundle) objArr[1]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // com.taobao.tao.k
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this;
    }

    @Override // com.taobao.tao.k
    public boolean isLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ed9676", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (this.mFragmentLifecycleCallbacks == null) {
            this.mFragmentLifecycleCallbacks = new n();
        }
        if (this.mActivityLifecycleCallbacks == null) {
            this.mActivityLifecycleCallbacks = new com.taobao.tao.tbmainfragment.m();
        }
        getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks, true);
        this.mTBMainController = b.a(this, bundle);
        if (bundle == null) {
            TLog.loge(TAG, "savedInstanceState is null, create controller by TBMainControllers");
        } else {
            TLog.loge(TAG, "savedInstanceState is not null");
            AppMonitor.Counter.commit(com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_MODULE_NAME, com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_MONITOR_POINT_NAME, 1.0d);
            if (bundle.get("android:support:fragments") != null) {
                AppMonitor.Counter.commit(com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_MODULE_NAME, com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_ANDROID_SUPPORT_FRAGMENT_NAME, 1.0d);
            }
            if (bundle.get("android:fragments") != null) {
                AppMonitor.Counter.commit(com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_MODULE_NAME, com.taobao.tao.tbmainfragment.i.SAVE_INSTANCE_ANDROID_FRAGMENT_NAME, 1.0d);
            }
            if (b.a() && (com.taobao.tao.tbmainfragment.d.b(this) || com.taobao.tao.tbmainfragment.d.c(this))) {
                if (!ABGlobal.isFeatureOpened(this, ABGLOBAL_SAVE_INSTANCE_KEY)) {
                    bundle.remove("android:support:fragments");
                    bundle.remove("android:fragments");
                    this.mTBMainController = b.a(this, bundle);
                } else {
                    bundle.remove("android:support:fragments");
                    bundle.remove("android:fragments");
                    com.taobao.tao.tbmainfragment.d.c();
                    com.taobao.tao.tbmainfragment.d.a();
                    this.mTBMainController = new ATBMainController(this);
                }
            }
        }
        setTheme(R.style.Theme_TBMainActivity);
        if (bundle != null) {
            if (ABGlobal.isFeatureOpened(this, s.KEY_SET_CLASS_LOADER)) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            if (isStartSpeedOpen(this) && !LauncherRuntime.b()) {
                TLog.loge("TaobaoCompat", TAG, "executeEnforceStage");
                LauncherRuntime.c();
            }
            Iterator<com.taobao.tao.navigation.g> it = com.taobao.tao.navigation.e.e().iterator();
            while (it.hasNext()) {
                com.android.tools.ir.runtime.c.a(it.next().t(), null);
            }
        }
        TBMainHost.a().a((k) this);
        super.onCreate(bundle);
        this.mTBMainController.onCreate(bundle);
        com.taobao.android.autosize.f.a((Activity) this);
    }

    private static boolean isStartSpeedOpen(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c26930c", new Object[]{context})).booleanValue() : ABGlobal.isFeatureOpened(context, "useNewLaunchConfig");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mTBMainController.onResume();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.mTBMainController.onPause();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTBMainController.onDestroy();
        getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks);
        getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
    }

    @Override // com.taobao.tao.k
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this}) : this.mTBMainController.getFragmentTabHost();
    }

    @Override // com.taobao.tao.k
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
        } else {
            this.mTBMainController.restoreTabHost();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.mTBMainController.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9653dcb7", new Object[]{this, bundle, persistableBundle});
        } else {
            super.onSaveInstanceState(bundle, persistableBundle);
        }
    }

    @Override // com.taobao.tao.k
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this}) : this.mTBMainController.getCurrentFragment();
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        } else {
            this.mTBMainController.onTabChanged(str);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (this.mTBMainController.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : this.mTBMainController.isImmersiveStatus();
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else {
            this.mTBMainController.doLogin();
        }
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue() : this.mTBMainController.checkLogin();
    }

    @Override // com.taobao.tao.k
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mTBMainController.getName();
    }

    @Override // com.taobao.tao.k
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f06186", new Object[]{this}) : this.mTBMainController.getSimpleName();
    }

    public TBMainController getTBMainController() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBMainController) ipChange.ipc$dispatch("ec2eb5f6", new Object[]{this}) : this.mTBMainController;
    }

    @Override // com.taobao.tao.e
    public void registerOnKeyDownListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca6f2c1", new Object[]{this, hVar});
        } else {
            this.mTBMainController.registerOnKeyDownListener(hVar);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.mTBMainController == null) {
            TBMainLog.tlog(TAG, "BaseActivity onActivityResult failed, mTBMainController is null");
            return;
        }
        TBMainLog.tlog(TAG, "BaseActivity onActivityResult");
        this.mTBMainController.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportActivity
    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        int currentTab;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        try {
            TBFragmentTabHost fragmentTabHost = this.mTBMainController.getFragmentTabHost();
            if (fragmentTabHost != null && (currentTab = fragmentTabHost.getCurrentTab()) != 0) {
                TLog.loge(TAG, "current tab is not support fragment model" + currentTab);
                return false;
            } else if (q.a(str)) {
                return true;
            } else {
                TLog.loge(TAG, "url's spm is not from homepage: " + str);
                return false;
            }
        } catch (Throwable th) {
            TLog.loge(TAG, "isFragmentSupported error: " + th);
            return false;
        }
    }
}
