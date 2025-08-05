package com.taobao.android.live.plugin.atype.flexalocal.good.showcase;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import tb.his;
import tb.kge;
import tb.pqj;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1140515913);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i == 10080;
    }

    public void a(String str, int i, e.a aVar) {
        GoodMsgNew goodMsgNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f1daa", new Object[]{this, str, new Integer(i), aVar});
        } else if (TextUtils.isEmpty(str) || aVar == null || i != 10080 || (goodMsgNew = (GoodMsgNew) pqj.a(str, GoodMsgNew.class)) == null || goodMsgNew.liveItemDO == null) {
        } else {
            his.a("PreheatMsgParser", "onMessageReceived | messagePreheatAddRemove, itemId=" + goodMsgNew.liveItemDO.itemId);
            aVar.e(goodMsgNew);
        }
    }
}
