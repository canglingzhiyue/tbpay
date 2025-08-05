package com.alipay.zoloz.toyger.workspace;

import android.app.Activity;
import android.view.KeyEvent;
import com.alipay.mobile.security.bio.workspace.BioFragment;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.interfaces.ToygerEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerFragment extends BioFragment implements ToygerEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ToygerCallback mToygerCallback;

    public static /* synthetic */ Object ipc$super(ToygerFragment toygerFragment, String str, Object... objArr) {
        if (str.hashCode() == 1330549917) {
            super.onAttach((Activity) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void commandFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d256e4", new Object[]{this});
        }
    }

    public boolean onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097306", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public boolean ontActivityEvent(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e35f93a", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.security.bio.workspace.BioFragment, android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        try {
            this.mToygerCallback = (ToygerCallback) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must be ToygerCallback");
        }
    }
}
