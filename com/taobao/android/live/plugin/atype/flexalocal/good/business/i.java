package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1232480374);
    }

    public i(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4626b36a", new Object[]{this, cVar, liveItem});
            return;
        }
        ItemActionQueryRequest itemActionQueryRequest = new ItemActionQueryRequest();
        itemActionQueryRequest.itemId = String.valueOf(liveItem.itemId);
        itemActionQueryRequest.recordId = liveItem.extendVal.secKillRecordId;
        itemActionQueryRequest.itemActionData = liveItem.itemActionData;
        if (!TextUtils.isEmpty(liveItem.asac)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", liveItem.asac);
            itemActionQueryRequest.asac = liveItem.asac;
            a(hashMap);
        }
        if (cVar != null) {
            itemActionQueryRequest.anchorId = cVar.l.b();
            itemActionQueryRequest.liveId = cVar.l.i();
            itemActionQueryRequest.entryLiveSource = cVar.u();
            itemActionQueryRequest.liveSource = cVar.v();
        }
        a(1, itemActionQueryRequest, ItemActionQueryResponse.class);
    }
}
