package com.taobao.tao.welcome;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TabHost;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.k;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmaincontroller.TBMainController;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.m;
import com.taobao.tao.tbmainfragment.n;
import com.taobao.tao.tbmainfragment.q;
import com.taobao.tao.welcome.HostController;
import com.taobao.taobao.R;
import com.taobao.uikit.immersive.ITBImmersive;
import com.ut.mini.UTAnalytics;
import java.util.Iterator;
import tb.gvt;
import tb.kge;

/* loaded from: classes.dex */
public class BController extends HostController implements TabHost.OnTabChangeListener, com.taobao.tao.e, k, ITBImmersive {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "Welcome";
    private static final String TAG = "BController";
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    private FragmentManager.FragmentLifecycleCallbacks mFragmentLifecycleCallbacks;
    private TBMainController mTBMainController;

    static {
        kge.a(1149609169);
        kge.a(-1479396665);
        kge.a(1311616296);
        kge.a(-213345416);
        kge.a(37515620);
    }

    public static /* synthetic */ Object ipc$super(BController bController, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 188604040:
                super.onStop();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 888638097:
                return new Boolean(super.onPreCreate((Bundle) objArr[0]));
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

    @Override // com.taobao.tao.welcome.HostController
    public void checkPrerequisite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84b565", new Object[]{this});
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

    @Override // com.taobao.tao.welcome.HostController
    public void navigate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c554e978", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.welcome.fragments.c
    public void onConfirmed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365271c", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.welcome.fragments.c
    public void onRejected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe6dff", new Object[]{this, new Integer(i)});
        }
    }

    public BController(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.mFragmentLifecycleCallbacks = null;
        this.mActivityLifecycleCallbacks = null;
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onPreCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f78a91", new Object[]{this, bundle})).booleanValue();
        }
        if (!getHost().isTaskRoot() && LauncherRuntime.a(getIntent())) {
            finish();
            return true;
        }
        handleTheme();
        return super.onPreCreate(bundle);
    }

    private void handleInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60f2ab9", new Object[]{this, bundle});
        } else if (isPurelyOutLink(getIntent())) {
        } else {
            if (this.mFragmentLifecycleCallbacks == null) {
                this.mFragmentLifecycleCallbacks = new n();
            }
            if (this.mActivityLifecycleCallbacks == null) {
                this.mActivityLifecycleCallbacks = new m();
            }
            FragmentActivity fragmentActivity = (FragmentActivity) getHost();
            fragmentActivity.getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks, true);
            this.mTBMainController = com.taobao.tao.tbmaincontroller.b.a(fragmentActivity, bundle);
            if (bundle == null) {
                return;
            }
            Iterator<com.taobao.tao.navigation.g> it = com.taobao.tao.navigation.e.e().iterator();
            while (it.hasNext()) {
                com.android.tools.ir.runtime.c.a(it.next().t(), null);
            }
        }
    }

    private void handleTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc0c88", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (isPurelyOutLink(intent)) {
            return;
        }
        setTheme(R.style.Theme_Welcome_Main);
        updateUri(intent);
        TBMainHost.a().a(this);
    }

    private void updateUri(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8c38a7", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        if (data == null || data.isOpaque()) {
            intent.setData(Uri.parse("http://m.taobao.com/index.htm"));
            return;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        if (TextUtils.isEmpty(queryParameter)) {
            intent.setData(Uri.parse("http://m.taobao.com/index.htm"));
            return;
        }
        Uri parse = Uri.parse(queryParameter);
        if (!com.taobao.linkmanager.afc.utils.e.b(parse)) {
            return;
        }
        intent.setData(parse);
    }

    private boolean isPurelyOutLink(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b50894e1", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null || !com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
            return false;
        }
        Uri data = intent.getData();
        if (data.isOpaque()) {
            return false;
        }
        String queryParameter = data.getQueryParameter("h5Url");
        return TextUtils.isEmpty(queryParameter) || !com.taobao.linkmanager.afc.utils.e.b(Uri.parse(queryParameter));
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else if (handleIntent(getIntent(), null)) {
        } else {
            super.onCreate(bundle);
            gvt.a("w-b-setupOnCreate");
            setupOnCreate(bundle);
            gvt.a();
        }
    }

    private void setupOnCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ad2095", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        handleInstanceState(bundle);
        commitPageEvent();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.onCreate(bundle);
    }

    private void commitPageEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9090405b", new Object[]{this});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(getHost());
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean handleIntent(Intent intent, HostController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6fb350f", new Object[]{this, intent, aVar})).booleanValue();
        }
        if (intent == null || !com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
            return false;
        }
        TLog.loge(MODULE, "linkx", "Welcome === onCreate === start linkIn");
        if (aVar != null) {
            aVar.a(intent);
        }
        com.taobao.linkmanager.afc.utils.e.a(getHost(), intent);
        return true;
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.onResume();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.onPause();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.onDestroy();
        getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.mFragmentLifecycleCallbacks);
        getHost().getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.mTBMainController == null) {
            TLog.loge(MODULE, TAG, "BaseActivity onActivityResult failed, mTBMainController is null");
            return;
        }
        TLog.loge(MODULE, TAG, "BaseActivity onActivityResult");
        this.mTBMainController.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean isFragmentSupported(String str, ISupportFragment iSupportFragment) {
        int currentTab;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e13d72ea", new Object[]{this, str, iSupportFragment})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return true;
        }
        try {
            TBFragmentTabHost fragmentTabHost = tBMainController.getFragmentTabHost();
            if (fragmentTabHost != null && (currentTab = fragmentTabHost.getCurrentTab()) != 0) {
                TLog.loge(MODULE, TAG, "current tab is not support fragment model" + currentTab);
                return false;
            } else if (q.a(str)) {
                return true;
            } else {
                TLog.loge(MODULE, TAG, "url's spm is not from homepage: " + str);
                return false;
            }
        } catch (Throwable th) {
            TLog.loge(MODULE, TAG, "isFragmentSupported error: " + th);
            return false;
        }
    }

    @Override // com.taobao.tao.k
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return null;
        }
        return tBMainController.getCurrentFragment();
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.onTabChanged(str);
    }

    @Override // com.taobao.tao.k
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return null;
        }
        return tBMainController.getFragmentTabHost();
    }

    @Override // com.taobao.tao.k
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.restoreTabHost();
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean isImmersive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return false;
        }
        return tBMainController.isImmersiveStatus();
    }

    @Override // com.taobao.tao.k
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : Welcome.class.getName();
    }

    @Override // com.taobao.tao.k
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f06186", new Object[]{this}) : Welcome.class.getSimpleName();
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.doLogin();
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return false;
        }
        return tBMainController.checkLogin();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onNewIntent(Intent intent) {
        TBMainController tBMainController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        if (handleIntent(intent, new HostController.a() { // from class: com.taobao.tao.welcome.BController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.welcome.HostController.a
            public Intent a(Intent intent2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Intent) ipChange2.ipc$dispatch("f20fa74e", new Object[]{this, intent2}) : intent2.putExtra("hot_startup_h5", true);
            }
        }) || (tBMainController = this.mTBMainController) == null) {
            return;
        }
        tBMainController.onNewIntent(intent);
    }

    @Override // com.taobao.tao.e
    public void registerOnKeyDownListener(com.taobao.tao.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca6f2c1", new Object[]{this, hVar});
            return;
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return;
        }
        tBMainController.registerOnKeyDownListener(hVar);
    }

    @Override // com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController == null) {
            return false;
        }
        return tBMainController.isImmersiveStatus();
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        TBMainController tBMainController = this.mTBMainController;
        if (tBMainController != null && tBMainController.onKeyDown(i, keyEvent)) {
            z = true;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
