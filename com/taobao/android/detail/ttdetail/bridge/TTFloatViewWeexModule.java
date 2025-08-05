package com.taobao.android.detail.ttdetail.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.utils.ap;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class TTFloatViewWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_ID_PREFIX = "detail_floatweex_instance";
    private static final String TAG = "TTFloatViewWeexModule";

    static {
        kge.a(-1947032389);
    }

    @JSMethod
    public void onMessage(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce0e879", new Object[]{this, jSCallback});
        } else {
            if (this.mWXSDKInstance == null) {
            }
        }
    }

    @JSMethod
    public void dispatchMessage(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763590d1", new Object[]{this, map});
        } else if (this.mWXSDKInstance == null) {
        } else {
            String ak = this.mWXSDKInstance.ak();
            i.a(TAG, "js向native发送消息 url=" + ak);
            c.a(this.mWXSDKInstance.O(), new com.taobao.android.detail.ttdetail.bizmessage.i(generateChannelId(ak), map));
        }
    }

    @JSMethod
    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        i.a(TAG, "js:" + str);
    }

    public static String generateChannelId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c876686", new Object[]{str});
        }
        return "detail_floatweex_instance" + ap.a(str);
    }
}
