package com.taobao.search.weex.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchTimeModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "searchTime";
    private static final String TAG = "SearchTimeModule";

    static {
        kge.a(1439911082);
    }

    @JSMethod(uiThread = false)
    public void getTime(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509755fe", new Object[]{this, jSCallback});
            return;
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp() / 1000;
        q.a(TAG, "getTime: " + currentTimeStamp);
        jSCallback.invoke(String.valueOf(currentTimeStamp));
    }
}
