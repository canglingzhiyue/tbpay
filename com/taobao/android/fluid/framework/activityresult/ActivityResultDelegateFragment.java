package com.taobao.android.fluid.framework.activityresult;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class ActivityResultDelegateFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ActivityResultDelegateFragment";
    private FluidContext mFluidContext;

    static {
        kge.a(-1837882309);
    }

    public static /* synthetic */ Object ipc$super(ActivityResultDelegateFragment activityResultDelegateFragment, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void initFragment(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766c48b9", new Object[]{this, fluidContext});
        } else {
            this.mFluidContext = fluidContext;
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
        FluidContext fluidContext = this.mFluidContext;
        if (fluidContext == null) {
            spz.c(TAG, "FluidSDK 视频流上下文为空");
            return;
        }
        IActivityResultService iActivityResultService = (IActivityResultService) fluidContext.getService(IActivityResultService.class);
        if (iActivityResultService == null) {
            spz.c(TAG, "FluidSDK 视频流 IActivityResultService 服务为空");
        } else {
            iActivityResultService.onActivityResult(i, i2, intent);
        }
    }
}
