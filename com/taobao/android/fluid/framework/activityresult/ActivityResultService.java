package com.taobao.android.fluid.framework.activityresult;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import tb.kge;
import tb.sma;
import tb.spz;

/* loaded from: classes5.dex */
public class ActivityResultService implements IActivityResultService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FRAGMENT_TAG = "shortvideo_activity_delegate_fragment_";
    private ActivityResultDelegateFragment mActivityResultDelegateFragment;
    private final FluidContext mFluidContext;
    private final String TAG = "ActivityResultService";
    private a mWeexAddCartForResultHelper = new a();

    static {
        kge.a(58673839);
        kge.a(-1124403398);
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    public ActivityResultService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.framework.activityresult.IActivityResultService
    public void navToCartForResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f35c139", new Object[]{this, str});
            return;
        }
        if (this.mWeexAddCartForResultHelper == null) {
            this.mWeexAddCartForResultHelper = new a();
        }
        initActivityResultDelegateFragment(this.mFluidContext.getContext());
        this.mWeexAddCartForResultHelper.a(this.mFluidContext, this.mActivityResultDelegateFragment, str);
    }

    @Override // com.taobao.android.fluid.framework.activityresult.IActivityResultService
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (this.mWeexAddCartForResultHelper == null) {
        } else {
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.mFluidContext.getService(IDataService.class)).getCurrentMediaSetData();
            sma messageCenter = ((IMessageService) this.mFluidContext.getService(IMessageService.class)).getMessageCenter();
            a.c a2 = currentMediaSetData.a();
            if (a2 == null) {
                return;
            }
            this.mWeexAddCartForResultHelper.a(messageCenter, a2.c, i, i2, intent);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            removeActivityResultDelegateFragment(this.mFluidContext.getContext());
        }
    }

    private void initActivityResultDelegateFragment(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dba9a70", new Object[]{this, context});
        } else if (!(context instanceof FragmentActivity)) {
        } else {
            String str = FRAGMENT_TAG + this.mFluidContext.getInstanceId();
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(str);
            spz.c("ActivityResultService", "初始化 ActivityResultDelegateFragment，从 tag 获取的 Fragment：" + findFragmentByTag);
            if (findFragmentByTag instanceof ActivityResultDelegateFragment) {
                this.mActivityResultDelegateFragment = (ActivityResultDelegateFragment) findFragmentByTag;
                this.mActivityResultDelegateFragment.initFragment(this.mFluidContext);
            } else {
                this.mActivityResultDelegateFragment = new ActivityResultDelegateFragment();
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                beginTransaction.add(this.mActivityResultDelegateFragment, str);
                beginTransaction.commitAllowingStateLoss();
                this.mActivityResultDelegateFragment.initFragment(this.mFluidContext);
                spz.c("ActivityResultService", "添加 ActivityResultDelegateFragment");
            }
            spz.c("ActivityResultService", "初始化 ActivityResultDelegateFragment 完成：" + this.mActivityResultDelegateFragment);
        }
    }

    private void removeActivityResultDelegateFragment(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99814e7c", new Object[]{this, context});
        } else if (!(context instanceof FragmentActivity)) {
        } else {
            FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG + this.mFluidContext.getInstanceId());
            spz.c("ActivityResultService", "移除 ActivityResultDelegateFragment，从 tag 获取的 Fragment：" + findFragmentByTag);
            if (findFragmentByTag == null) {
                return;
            }
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.commit();
            spz.c("ActivityResultService", "移除 ActivityResultDelegateFragment");
        }
    }
}
