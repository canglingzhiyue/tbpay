package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.i;
import tb.kge;
import tb.ogg;

/* loaded from: classes5.dex */
public class GuangProfileWeexModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GuangProfileWeexModule";
    private i mWeexModuleInterface;

    static {
        kge.a(-174788250);
        kge.a(396540296);
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
        } else {
            this.mWeexModuleInterface = iVar;
        }
    }

    @WeexMethod(uiThread = true)
    public void back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58bdee", new Object[]{this});
            return;
        }
        Object tag = this.mWeexModuleInterface.a().getTag("profileContainer");
        ogg.a(TAG, "weex profile click back in " + tag);
        if (!(tag instanceof b)) {
            return;
        }
        ((b) tag).k();
    }
}
