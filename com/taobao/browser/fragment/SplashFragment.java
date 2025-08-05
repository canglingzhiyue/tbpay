package com.taobao.browser.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.config.a;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import tb.gfe;
import tb.kge;

/* loaded from: classes6.dex */
public class SplashFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    public static String URL;
    private BrowserHybridWebView mWebView = null;

    public static /* synthetic */ Object ipc$super(SplashFragment splashFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1796649244);
        TAG = "WindVane/SplashFragment";
        URL = "url";
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
        } else {
            super.onAttach(activity);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.Theme_Welcome_Adaptor_New_Provision);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        gfe.a(getDialog());
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        setRetainInstance(true);
    }

    public static SplashFragment newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SplashFragment) ipChange.ipc$dispatch("e7fb5f0d", new Object[0]) : new SplashFragment();
    }

    public static void show(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a8eff5", new Object[]{fragmentManager});
        } else if (a.commonConfig.A && ABGlobal.isFeatureOpened(Globals.getApplication(), "enableSkipSplashFragment")) {
            e.a(RVLLevel.Info, TAG, "skip SplashFragment");
        } else {
            e.a(RVLLevel.Info, TAG, "still show SplashFragment");
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("SplashFragment");
            if (findFragmentByTag != null) {
                beginTransaction.remove(findFragmentByTag);
            }
            SplashFragment newInstance = newInstance();
            beginTransaction.add(newInstance, "SplashFragment").commitAllowingStateLoss();
            newInstance.setCancelable(false);
        }
    }

    public static void dismiss(FragmentManager fragmentManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757b6802", new Object[]{fragmentManager});
            return;
        }
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("SplashFragment");
        if (findFragmentByTag == null) {
            return;
        }
        ((DialogFragment) findFragmentByTag).dismissAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            super.onDestroy();
        } catch (Exception e) {
            m.e(TAG, e.getMessage());
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        BrowserHybridWebView browserHybridWebView = this.mWebView;
        if (browserHybridWebView == null) {
            return;
        }
        browserHybridWebView.onActivityResult(i, i2, intent);
    }
}
