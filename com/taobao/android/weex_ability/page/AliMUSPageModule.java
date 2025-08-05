package com.taobao.android.weex_ability.page;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes6.dex */
public class AliMUSPageModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "muisepage";

    static {
        kge.a(1765314008);
    }

    public AliMUSPageModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void downgrade() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
            return;
        }
        Activity activity = (Activity) getInstance().getUIContext();
        if (!(activity instanceof FragmentActivity) || (findFragmentByTag = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentByTag("ali_mus_fragment_tag")) == null || !(findFragmentByTag instanceof MUSPageFragment)) {
            return;
        }
        ((MUSPageFragment) findFragmentByTag).downgrade();
    }
}
