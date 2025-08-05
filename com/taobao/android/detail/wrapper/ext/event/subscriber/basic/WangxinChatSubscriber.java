package com.taobao.android.detail.wrapper.ext.event.subscriber.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.wangxin.proxy.WangxinControlerProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import tb.emu;
import tb.env;
import tb.kge;

/* loaded from: classes5.dex */
public class WangxinChatSubscriber implements j<env>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_QUANTITY = "K_QUANTITY";
    public DetailCoreActivity mActivity;

    static {
        kge.a(305687004);
        kge.a(-1453870097);
        kge.a(1028243835);
    }

    public WangxinChatSubscriber(DetailCoreActivity detailCoreActivity) {
        this.mActivity = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.basic.WangxinChatSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public com.taobao.android.trade.event.i handleEvent(env envVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("c2ee8673", new Object[]{this, envVar});
        }
        if (envVar == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        com.taobao.android.detail.datasdk.event.params.d dVar = envVar.f27480a;
        HashMap hashMap = new HashMap();
        hashMap.put("from", "Page_Detail");
        if (dVar.d > 0) {
            hashMap.put(K_QUANTITY, "" + dVar.d);
        }
        hashMap.put("orderConsultTip", dVar.e);
        HashMap hashMap2 = new HashMap();
        try {
            Iterator<String> it = envVar.b.keySet().iterator();
            while (it != null) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                hashMap2.put(next, envVar.b.getString(next));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        hashMap.putAll(hashMap2);
        WangxinControlerProxy.gotoWangxinChatWithFengliu(this.mActivity, dVar.f9952a, dVar.b, null, JSONObject.toJSONString(hashMap));
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
