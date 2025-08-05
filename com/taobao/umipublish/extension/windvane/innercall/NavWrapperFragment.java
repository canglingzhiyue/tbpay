package com.taobao.umipublish.extension.windvane.innercall;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class NavWrapperFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ActivityResult mActivityResult;

    /* loaded from: classes9.dex */
    public interface ActivityResult {
        void a(int i, int i2, Intent intent);
    }

    static {
        kge.a(-1669071694);
    }

    public static /* synthetic */ Object ipc$super(NavWrapperFragment navWrapperFragment, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public NavWrapperFragment() {
    }

    public NavWrapperFragment(ActivityResult activityResult) {
        this.mActivityResult = activityResult;
    }

    public void setActivityResultListener(ActivityResult activityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1beb2fa", new Object[]{this, activityResult});
        } else {
            this.mActivityResult = activityResult;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ActivityResult activityResult = this.mActivityResult;
        if (activityResult == null) {
            return;
        }
        activityResult.a(i, i2, intent);
    }
}
