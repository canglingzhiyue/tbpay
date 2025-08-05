package com.taobao.tao.tbmaincontroller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.h;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.tbmainfragment.TBMainFragment;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.tao.util.TargetTabHelper;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import tb.kge;

/* loaded from: classes.dex */
public class BTBMainController implements TBMainController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BTBMainController";
    private FragmentActivity mFragmentActivity;
    private FragmentManager mFragmentManager;
    private LoginBroadcastReceiver mLoginReceiver;
    private h mOnKeyDownListener;
    private SupportActivity mSupportActivity;

    static {
        kge.a(-286001415);
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
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa8af", new Object[]{this, str});
        }
    }

    public static /* synthetic */ FragmentManager access$000(BTBMainController bTBMainController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("38a13516", new Object[]{bTBMainController}) : bTBMainController.mFragmentManager;
    }

    public BTBMainController(FragmentActivity fragmentActivity) {
        this.mFragmentActivity = fragmentActivity;
        this.mSupportActivity = (SupportActivity) fragmentActivity;
        this.mFragmentManager = fragmentActivity.getSupportFragmentManager();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onCreate(Bundle bundle) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this.mFragmentActivity);
        this.mFragmentActivity.setContentView(R.layout.tb_activity_main_new);
        observerLoginStatus();
        TBMainHost.a().a(this);
        Intent intent = this.mFragmentActivity.getIntent();
        if (intent != null) {
            parse = intent.getData();
        } else {
            parse = Uri.parse("http://m.taobao.com/index.htm");
        }
        if (bundle != null) {
            return;
        }
        loadRootFragment(parse);
    }

    private void loadRootFragment(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89156148", new Object[]{this, uri});
        } else {
            this.mSupportActivity.loadRootFragment(R.id.tbFragment, TBMainFragment.newInstance(uri), false, false);
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
        TBMainHost.a().b();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        FragmentActivity fragmentActivity = this.mFragmentActivity;
        if (fragmentActivity == null) {
            return;
        }
        fragmentActivity.setIntent(intent);
        if (intent.getExtras() == null || TargetTabHelper.getTargetTabIndex(this.mFragmentActivity, intent) == -1 || !(this.mFragmentActivity instanceof SupportActivity)) {
            return;
        }
        ISupportFragment a2 = i.a(this.mFragmentManager);
        if (a2 instanceof TBMainFragment) {
            ((TBMainFragment) a2).onNewIntent(intent);
            return;
        }
        i.a(false);
        ((SupportActivity) this.mFragmentActivity).popTo(TBMainFragment.class, false);
        TBMainFragment tBMainFragment = (TBMainFragment) i.a(this.mFragmentManager, TBMainFragment.class);
        if (tBMainFragment == null) {
            return;
        }
        tBMainFragment.onNewIntent(intent);
        com.taobao.tao.tbmainfragment.b.b(tBMainFragment, this.mFragmentActivity);
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        h hVar = this.mOnKeyDownListener;
        if (hVar != null && hVar.onKeyDown(i, keyEvent)) {
            return true;
        }
        return this.mSupportActivity.onSupportKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.k
    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}) : (T) this.mFragmentActivity.findViewById(i);
    }

    @Override // com.taobao.tao.k
    public void restoreTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5767576", new Object[]{this});
            return;
        }
        Fragment fragment = (Fragment) i.a(this.mFragmentManager);
        if (!(fragment instanceof TBMainFragment)) {
            return;
        }
        ((TBMainFragment) fragment).restoreTabHost();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, com.taobao.tao.k
    public TBFragmentTabHost getFragmentTabHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentTabHost) ipChange.ipc$dispatch("d6e2078b", new Object[]{this});
        }
        Fragment fragment = (Fragment) i.a(this.mFragmentManager);
        if (!(fragment instanceof TBMainFragment)) {
            return null;
        }
        return ((TBMainFragment) fragment).getFragmentTabHost();
    }

    @Override // com.taobao.tao.tbmaincontroller.TBMainController, com.taobao.tao.k
    public Fragment getCurrentFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("4789611c", new Object[]{this});
        }
        Fragment fragment = (Fragment) i.a(this.mFragmentManager);
        return fragment instanceof TBMainFragment ? ((TBMainFragment) fragment).getCurrentFragment() : fragment;
    }

    @Override // com.taobao.tao.k
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mFragmentActivity.getClass().getName();
    }

    @Override // com.taobao.tao.k
    public String getSimpleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f06186", new Object[]{this}) : this.mFragmentActivity.getClass().getSimpleName();
    }

    @Override // com.taobao.tao.k
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mFragmentActivity;
    }

    @Override // com.taobao.tao.navigation.c
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
            return;
        }
        Fragment fragment = (Fragment) i.a(this.mFragmentManager);
        if (!(fragment instanceof TBMainFragment)) {
            return;
        }
        ((TBMainFragment) fragment).doLogin();
    }

    @Override // com.taobao.tao.navigation.c
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue();
        }
        Fragment fragment = (Fragment) i.a(this.mFragmentManager);
        if (fragment instanceof TBMainFragment) {
            return ((TBMainFragment) fragment).checkLogin();
        }
        return Login.checkSessionValid();
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

    public void unObserverLoginStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4947333", new Object[]{this});
        } else if (this.mLoginReceiver == null) {
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.mLoginReceiver);
        }
    }

    /* loaded from: classes.dex */
    public class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2118471570);
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
                LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                Fragment fragment = (Fragment) i.a(BTBMainController.access$000(BTBMainController.this));
                if (!(fragment instanceof TBMainFragment)) {
                    return;
                }
                ((TBMainFragment) fragment).handleLoginBroadcast(valueOf);
            }
        }
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

    @Override // com.taobao.tao.tbmaincontroller.TBMainController
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ISupportFragment a2 = i.a(this.mFragmentManager);
        if (a2 == null) {
            return;
        }
        a2.asFragment().onActivityResult(i, i2, intent);
    }
}
