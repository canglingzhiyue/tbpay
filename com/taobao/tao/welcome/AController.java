package com.taobao.tao.welcome;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.SelectLocaleFragment;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TaoHelper;
import com.taobao.tao.welcome.HostController;
import com.taobao.tao.welcome.d;
import com.taobao.tao.welcome.fragments.ProvisionManager;
import com.taobao.taobao.R;
import java.util.Locale;
import tb.jzj;
import tb.kge;

/* loaded from: classes.dex */
public class AController extends HostController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NavigationWatchDog watchDog;

    public static /* synthetic */ Object ipc$super(AController aController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 888638097:
                return new Boolean(super.onPreCreate((Bundle) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean isImmersive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.fragments.c
    public void onConfirmed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9365271c", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.welcome.fragments.c
    public void onRejected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe6dff", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void access$000(AController aController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f62b16", new Object[]{aController});
        } else {
            aController.exitApp();
        }
    }

    static {
        kge.a(-1348406768);
        com.taobao.android.lightvane.jsbridge.h.a(ViewModeWVApi.class.getSimpleName(), (Class<? extends com.taobao.android.lightvane.jsbridge.c>) ViewModeWVApi.class, false);
    }

    public AController(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.watchDog = null;
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean onPreCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f78a91", new Object[]{this, bundle})).booleanValue();
        }
        Intent intent = getIntent();
        com.taobao.tao.welcome.fragments.b.a(bundle);
        if (decideFinishOrNot(intent)) {
            finish();
            return true;
        }
        return super.onPreCreate(bundle);
    }

    private static boolean decideFinishOrNot(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6385be5d", new Object[]{intent})).booleanValue();
        }
        if (!LauncherRuntime.a(intent)) {
            return false;
        }
        int flags = intent.getFlags();
        return ((268435456 & flags) != 0) && ((4194304 & flags) != 0) && !((flags & 32768) != 0);
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_Welcome_Adaptor_New);
        if (ProvisionManager.a(getApplicationContext()) && handleIntent(getIntent(), null)) {
            return;
        }
        super.onCreate(bundle);
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        Intent intent2 = getIntent();
        Uri data = getIntent().getData();
        Uri data2 = intent.getData();
        super.onNewIntent(intent);
        if (!com.taobao.linkmanager.afc.utils.e.a(data) || com.taobao.linkmanager.afc.utils.e.a(data2) || TextUtils.equals(intent2.getDataString(), intent.getDataString())) {
            return;
        }
        TLog.loge("welcome", "AController", "oldIntent: " + intent2 + ", newIntent:" + intent);
        finish();
        Nav.from(getContext()).toUri(data2);
    }

    @Override // com.taobao.tao.welcome.HostController
    public boolean handleIntent(Intent intent, HostController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6fb350f", new Object[]{this, intent, aVar})).booleanValue();
        }
        if (intent.getBooleanExtra("fullyNewInstall", false)) {
            jzj.a(new i(getHost(), intent));
            return false;
        } else if (!com.taobao.linkmanager.afc.utils.e.a(intent.getData())) {
            return false;
        } else {
            TLog.loge("welcome", "linkx", "Welcome === onCreate === start linkIn");
            com.taobao.linkmanager.afc.utils.e.a(getHost(), intent);
            return true;
        }
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        NavigationWatchDog navigationWatchDog = this.watchDog;
        if (navigationWatchDog == null || !navigationWatchDog.a()) {
            NavigationWatchDog.a("watchdog is not settled, ignore it");
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            intent.putExtra("__from_resume__", true);
            NavigationWatchDog.a("put __from_resume__=true");
        }
        navigate();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        NavigationWatchDog navigationWatchDog = this.watchDog;
        if (navigationWatchDog == null) {
            return;
        }
        navigationWatchDog.b();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        NavigationWatchDog navigationWatchDog = this.watchDog;
        if (navigationWatchDog == null) {
            return;
        }
        navigationWatchDog.c();
    }

    private void finishByMain(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f02d46a", new Object[]{this, bundle});
            return;
        }
        Nav disableTransition = Nav.from(getContext()).withExtras(bundle).disableTransition();
        boolean z = bundle.getBoolean("__from_resume__", false);
        NavigationWatchDog.a("__from_resume__=" + z);
        if (!z) {
            disableTransition.withFlags(67108864);
            NavigationWatchDog.a("__from_resume__=false, added flags=0x" + Integer.toHexString(67108864));
        }
        if (disableTransition.toUri("http://m.taobao.com/index.htm")) {
            if (this.watchDog == null) {
                this.watchDog = new NavigationWatchDog();
            }
            this.watchDog.a(this, 5000L);
            return;
        }
        finish();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void alertProvision() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf766e0", new Object[]{this});
        } else {
            alertProvisionNew();
        }
    }

    private void alertProvisionNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1385490e", new Object[]{this});
        } else {
            h.a("launch", getHost(), new d.a() { // from class: com.taobao.tao.welcome.AController.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.welcome.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        AController.this.navigateOnConfirm();
                    }
                }

                @Override // com.taobao.tao.welcome.d.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    AController.this.finish();
                    if (i == R.id.provision_negative_button_view_mode) {
                        HostController.enterViewMode(AController.this.getHost());
                    } else if (i != R.id.provision_negative_button_exit_app) {
                    } else {
                        AController.access$000(AController.this);
                    }
                }
            }).a();
        }
    }

    private void exitApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5695072a", new Object[]{this});
            return;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
                String str = runningAppProcessInfo.processName;
                if (str.contains(TaoHelper.getPackageName() + ":")) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void navigateOnConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb975df7", new Object[]{this});
            return;
        }
        String language = Locale.getDefault().getLanguage();
        TLog.loge("Welcome", "Navigation", "current language is: " + language);
        getIntent().putExtra("fullyNewInstall", true);
        if (Locale.CHINESE.getLanguage().equals(language)) {
            updateProvisionFlag();
            navigate();
            return;
        }
        BootstrapMode.a(2048);
        updateProvisionFlag();
        TLog.loge("Welcome", "Navigation", "starting IOvsABCallback...");
        com.taobao.android.editionswitcher.b.a(new com.taobao.android.editionswitcher.boarding.d() { // from class: com.taobao.tao.welcome.AController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.editionswitcher.boarding.d
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                TLog.loge("Welcome", "Navigation", "IOvsABCallback received with result: " + z);
                if (z) {
                    AController.this.showMultiLocales();
                    return;
                }
                TLog.loge("Welcome", "Navigation", "navigate immediately");
                AController.this.navigate();
            }
        });
    }

    public void showMultiLocales() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a80f784", new Object[]{this});
            return;
        }
        setTheme(R.style.Theme_Welcome_Main);
        new SystemBarDecorator(getHost()).enableImmersiveStatusBar();
        getSupportFragmentManager().beginTransaction().replace(16908290, new SelectLocaleFragment(), SelectLocaleFragment.class.getSimpleName()).commitAllowingStateLoss();
    }

    @Override // com.taobao.tao.welcome.HostController
    public void onLocaleSetDone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809c7eb2", new Object[]{this});
        } else {
            navigate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[ADDED_TO_REGION] */
    @Override // com.taobao.tao.welcome.HostController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void navigate() {
        /*
            r12 = this;
            java.lang.String r0 = "__from_resume__"
            java.lang.String r1 = "fullyNewInstall"
            java.lang.String r2 = "shop_id"
            java.lang.String r3 = "uid"
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.welcome.AController.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L1d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r7] = r12
            java.lang.String r1 = "c554e978"
            r4.ipc$dispatch(r1, r0)
            return
        L1d:
            android.content.Intent r4 = r12.getIntent()
            r5 = 0
            boolean r4 = r12.handleIntent(r4, r5)
            if (r4 == 0) goto L29
            return
        L29:
            android.content.Intent r4 = r12.getIntent()     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = r4.getStringExtra(r3)     // Catch: java.lang.Exception -> L4a
            android.content.Intent r8 = r12.getIntent()     // Catch: java.lang.Exception -> L4b
            java.lang.String r5 = r8.getStringExtra(r2)     // Catch: java.lang.Exception -> L4b
            android.content.Intent r8 = r12.getIntent()     // Catch: java.lang.Exception -> L4b
            boolean r8 = r8.getBooleanExtra(r0, r7)     // Catch: java.lang.Exception -> L4b
            android.content.Intent r9 = r12.getIntent()     // Catch: java.lang.Exception -> L4c
            boolean r9 = r9.getBooleanExtra(r1, r7)     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4a:
            r4 = r5
        L4b:
            r8 = 0
        L4c:
            r9 = 0
        L4d:
            android.os.Bundle r10 = new android.os.Bundle
            r11 = 5
            r10.<init>(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L5c
            r10.putString(r3, r4)
        L5c:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L65
            r10.putString(r2, r5)
        L65:
            if (r8 == 0) goto L6a
            r10.putBoolean(r0, r6)
        L6a:
            java.lang.String r0 = "show_welcome"
            r10.putBoolean(r0, r7)
            r10.putBoolean(r1, r9)
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = com.taobao.android.launcher.common.LauncherRuntime.a(r0)
            com.taobao.application.common.d r1 = com.taobao.application.common.c.a()
            java.lang.String r2 = "isFirstLaunch"
            boolean r1 = r1.a(r2, r7)
            if (r0 == 0) goto L90
            if (r1 == 0) goto L90
            java.lang.String r0 = "startByLauncher"
            r10.putBoolean(r0, r6)
        L90:
            r12.finishByMain(r10)
            r12.overridePendingTransition(r7, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.welcome.AController.navigate():void");
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
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }
}
