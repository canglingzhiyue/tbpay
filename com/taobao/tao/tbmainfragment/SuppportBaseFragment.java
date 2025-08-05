package com.taobao.tao.tbmainfragment;

import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBBaseFragment;
import tb.kge;

/* loaded from: classes8.dex */
public class SuppportBaseFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mShouldDoOnPauseOrOnStop = true;
    private boolean mShouldDoOnStart = true;
    private boolean mShouldDoOnResume = true;

    static {
        kge.a(-202141572);
    }

    public static /* synthetic */ Object ipc$super(SuppportBaseFragment suppportBaseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (shouldDoOnStart()) {
            this.mShouldDoOnPauseOrOnStop = true;
            this.mShouldDoOnResume = true;
            this.mShouldDoOnStart = false;
            setForceDoOnStart(false);
        }
        super.onStart();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        if (shouldDoOnResume()) {
            this.mShouldDoOnPauseOrOnStop = true;
            this.mShouldDoOnStart = true;
            this.mShouldDoOnResume = false;
        }
        super.onResume();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (shouldDoOnPause()) {
            this.mShouldDoOnResume = true;
        }
        super.onPause();
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (shouldDoOnStop()) {
            this.mShouldDoOnResume = true;
            this.mShouldDoOnPauseOrOnStop = false;
        }
        super.onStop();
    }

    public boolean shouldDoOnStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea050", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch() || isForceDoOnStart()) {
            return true;
        }
        if (!isFragmentVisible()) {
            return false;
        }
        return this.mShouldDoOnStart;
    }

    public boolean shouldDoOnResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10692235", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch()) {
            return true;
        }
        if (!isFragmentVisible()) {
            return false;
        }
        return this.mShouldDoOnResume;
    }

    public boolean shouldDoOnPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b71917e4", new Object[]{this})).booleanValue();
        }
        if (checkSwitch()) {
            return this.mShouldDoOnPauseOrOnStop;
        }
        return true;
    }

    public boolean shouldDoOnStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("833a4aca", new Object[]{this})).booleanValue();
        }
        if (checkSwitch()) {
            return this.mShouldDoOnPauseOrOnStop;
        }
        return true;
    }

    private boolean isFragmentVisible() {
        FragmentActivity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12e2e603", new Object[]{this})).booleanValue();
        }
        if (!checkSwitch() || (activity = getActivity()) == null) {
            return true;
        }
        return i.b(activity.getSupportFragmentManager());
    }

    private boolean checkSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32fb98e7", new Object[]{this})).booleanValue() : d.b(this.mActivity) || d.c(this.mActivity);
    }

    private boolean isForceDoOnStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("130f8e2", new Object[]{this})).booleanValue() : i.a();
    }

    private void setForceDoOnStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483fab7e", new Object[]{this, new Boolean(z)});
        } else {
            i.a(z);
        }
    }
}
