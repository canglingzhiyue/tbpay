package com.taobao.homepage.page.weexv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.lbo;
import tb.mjx;
import tb.oho;

/* loaded from: classes7.dex */
public class WeexSecondModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "secondHome";
    private static final String TAG = "WeexSecondModule";

    static {
        kge.a(1406563585);
    }

    public static /* synthetic */ Object ipc$super(WeexSecondModule weexSecondModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WeexSecondModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void backHome(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11579484", new Object[]{this, bVar});
        } else {
            callBackHome(getInstance());
        }
    }

    private void callBackHome(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f78fe202", new Object[]{this, pVar});
            return;
        }
        Object tag = pVar.getTag(oho.HOME_PAGE_MANAGER);
        if (tag == null) {
            e.e(TAG, "tag == null");
        } else if (!(tag instanceof WeakReference)) {
            e.e(TAG, "!(tag instanceof WeakReference<?>)");
        } else {
            WeakReference weakReference = (WeakReference) tag;
            if (!(weakReference.get() instanceof lbo)) {
                e.e(TAG, "!(weakReference.get() instanceof HomePageManager)");
                return;
            }
            mjx i = ((lbo) weakReference.get()).i();
            if (i == null) {
                e.e(TAG, "pullDownUpManager == null");
                return;
            }
            i.d();
            e.e(TAG, "返回首页");
        }
    }
}
