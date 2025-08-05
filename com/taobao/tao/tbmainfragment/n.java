package com.taobao.tao.tbmainfragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public class n extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(129387611);
    }

    public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2070443536:
                super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -2001641611:
                super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1926632732:
                super.onFragmentActivityCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case -1776235783:
                super.onFragmentDetached((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1547495758:
                super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1501849859:
                super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case -1306679736:
                super.onFragmentViewCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (View) objArr[2], (Bundle) objArr[3]);
                return null;
            case -473528248:
                super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            case 632639987:
                super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                return null;
            case 951718524:
                super.onFragmentStopped((FragmentManager) objArr[0], (Fragment) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b551f3", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentCreated(fragmentManager, fragment, bundle);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentCreated" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d29eae4", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentActivityCreated" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21da648", new Object[]{this, fragmentManager, fragment, view, bundle});
            return;
        }
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentViewCreated" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c68848", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStarted(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentStarted" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        FragmentActivity activity;
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        if (Versions.isDebug() && (activity = fragment.getActivity()) != null && (intent = activity.getIntent()) != null && (data = intent.getData()) != null) {
            Log.e("TBMainFragmentLifecycle", "onActivityResumed url:" + data.toString());
        }
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentResumed" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentPaused" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ba127c", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentStopped(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentStopped" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b15f75", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentViewDestroyed" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849789f0", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDestroyed(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentDestroyed" + fragment.getClass().getSimpleName());
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9620caf9", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentDetached(fragmentManager, fragment);
        TLog.loge("TBMainFragmentLifecycle", "into onFragmentDetached" + fragment.getClass().getSimpleName());
    }
}
