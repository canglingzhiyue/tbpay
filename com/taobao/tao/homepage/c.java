package com.taobao.tao.homepage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import tb.kge;
import tb.ksp;
import tb.lap;
import tb.njn;

/* loaded from: classes.dex */
public class c extends FragmentManager.FragmentLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-859944839);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1547495758) {
            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
            return null;
        } else if (hashCode != -1501849859) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
            return null;
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d29eae4", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "onFragmentActivityCreated", "执行onFragmentActivityCreated");
        if (a(fragment.getContext())) {
            b.a(fragment, bundle);
        } else {
            i.a(fragment, bundle);
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentResumed(fragmentManager, fragment);
        try {
            njn.b(fragment);
            if (a(fragment.getContext())) {
                b.a(fragment);
            } else {
                i.a(fragment);
            }
        } catch (Throwable unused) {
            ksp.c("popcenter.lifecycle", "onFragmentResume(): PopCenter resume error");
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67b96fd", new Object[]{this, fragmentManager, fragment});
            return;
        }
        super.onFragmentPaused(fragmentManager, fragment);
        try {
            njn.a(fragment);
            if (!a(fragment.getContext())) {
                return;
            }
            b.a();
        } catch (Throwable unused) {
            ksp.c("popcenter.lifecycle", "onFragmentPause(): PopCenter pause error");
        }
    }

    @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a5ac4a", new Object[]{this, fragmentManager, fragment, bundle});
            return;
        }
        lap.a("【Homepage_PageLifeCycle】", "onFragmentSaveInstanceState", "执行onFragmentSaveInstanceState");
        i.b(fragment, bundle);
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : l.d(context) && com.taobao.android.home.component.utils.j.a("enableFoldDeviceRestore", true);
    }
}
