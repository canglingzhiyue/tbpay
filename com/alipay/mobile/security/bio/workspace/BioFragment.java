package com.alipay.mobile.security.bio.workspace;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.alipay.mobile.security.bio.exception.BioObjectNotInitialException;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BioFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BioFragmentCallBack mBioFragmentCallBack;
    public BioServiceManager mBioServiceManager;

    public static /* synthetic */ Object ipc$super(BioFragment bioFragment, String str, Object... objArr) {
        if (str.hashCode() == 1330549917) {
            super.onAttach((Activity) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.mBioServiceManager = BioServiceManager.getCurrentInstance();
        if (this.mBioServiceManager == null) {
            BioLog.w(new RuntimeException("null == BioServiceManager.getCurrentInstance()"));
            ((BioFragmentContainer) activity).sendResponse(206);
            finish();
            return;
        }
        try {
            this.mBioFragmentCallBack = (BioFragmentCallBack) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must BioFragmentService");
        }
    }

    public <T> T getSystemService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("81aeee2c", new Object[]{this, cls});
        }
        BioServiceManager bioServiceManager = this.mBioServiceManager;
        if (bioServiceManager == null) {
            throw new BioObjectNotInitialException("");
        }
        return (T) bioServiceManager.getBioService(cls);
    }

    public <T> T getExtService(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1599f226", new Object[]{this, cls});
        }
        BioServiceManager bioServiceManager = this.mBioServiceManager;
        if (bioServiceManager == null) {
            throw new BioObjectNotInitialException("");
        }
        return (T) bioServiceManager.getBioService(cls);
    }

    public void backward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab1a6ea", new Object[]{this});
            return;
        }
        BioFragmentCallBack bioFragmentCallBack = this.mBioFragmentCallBack;
        if (bioFragmentCallBack == null) {
            return;
        }
        bioFragmentCallBack.backward(null);
    }

    public void forward(BioFragment bioFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ced79d", new Object[]{this, bioFragment});
            return;
        }
        BioFragmentCallBack bioFragmentCallBack = this.mBioFragmentCallBack;
        if (bioFragmentCallBack == null) {
            return;
        }
        bioFragmentCallBack.forward(null, bioFragment);
    }

    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        BioFragmentCallBack bioFragmentCallBack = this.mBioFragmentCallBack;
        if (bioFragmentCallBack == null) {
            return;
        }
        bioFragmentCallBack.finish(null);
    }
}
