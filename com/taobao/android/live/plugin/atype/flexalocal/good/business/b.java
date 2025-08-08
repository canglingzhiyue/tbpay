package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import mtopsdk.common.util.StringUtils;
import android.text.format.DateUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ad;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;
import tb.hkk;
import tb.kge;
import tb.pox;
import tb.pqj;

/* loaded from: classes4.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1944326190);
    }

    public b(final pox<EnterGoodsData> poxVar) {
        super(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.business.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (netBaseOutDo == null) {
                } else {
                    pox.this.onResult((EnterGoodsData) netBaseOutDo.mo1437getData());
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                pox poxVar2 = pox.this;
                if (poxVar2 == null) {
                    return;
                }
                poxVar2.onError(netResponse.getRetCode(), netResponse.getRetMsg());
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                pox poxVar2 = pox.this;
                if (poxVar2 == null) {
                    return;
                }
                poxVar2.onError(netResponse.getRetCode(), netResponse.getRetMsg());
            }
        });
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32cb1543", new Object[]{this, cVar, new Boolean(z), str, str2, str3});
        } else if (cVar.s() == null || cVar.s().mVideoInfo == null) {
        } else {
            EnterLiveItemRequest enterLiveItemRequest = new EnterLiveItemRequest();
            enterLiveItemRequest.liveId = cVar.s().mVideoInfo.liveId;
            if (cVar.s().mVideoInfo.broadCaster != null) {
                enterLiveItemRequest.creatorId = cVar.s().mVideoInfo.broadCaster.accountId;
            }
            if (z) {
                enterLiveItemRequest.itemHoldType = cVar.s().mVideoInfo.itemHoldType;
                enterLiveItemRequest.holdItemIds = cVar.s().mVideoInfo.holdItemIds;
                if (!StringUtils.isEmpty(cVar.Q) && StringUtils.isEmpty(enterLiveItemRequest.itemHoldType) && StringUtils.isEmpty(enterLiveItemRequest.holdItemIds)) {
                    enterLiveItemRequest.holdItemIds = cVar.Q;
                    enterLiveItemRequest.itemHoldType = com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            } else {
                enterLiveItemRequest.itemHoldType = str;
                enterLiveItemRequest.holdItemIds = str2;
                if (!StringUtils.isEmpty(str3) && StringUtils.isEmpty(enterLiveItemRequest.itemHoldType) && StringUtils.isEmpty(enterLiveItemRequest.holdItemIds)) {
                    enterLiveItemRequest.holdItemIds = str3;
                    enterLiveItemRequest.itemHoldType = com.taobao.taolive.sdk.mergeInfo.b.VALUE_ITEM_HOLD_TYPE_CARD;
                }
            }
            enterLiveItemRequest.livesource = cVar.v();
            enterLiveItemRequest.entryLiveSource = cVar.u();
            enterLiveItemRequest.needRecommendItem = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.l();
            enterLiveItemRequest.itemTransferInfo = cVar.s().mVideoInfo.itemTransferInfo == null ? "" : cVar.s().mVideoInfo.itemTransferInfo.toJSONString();
            ArrayList<String> arrayList = cVar.s().mVideoInfo == null ? null : cVar.s().mVideoInfo.interacts;
            if (arrayList != null && !arrayList.isEmpty()) {
                enterLiveItemRequest.interacts = pqj.a(arrayList);
            }
            if (hkk.ab()) {
                if (!DateUtils.isToday(ad.b("new_user_zone_card_show_time"))) {
                    ad.a("new_user_zone_card_show_count", 0);
                }
                enterLiveItemRequest.todayExposureCount = String.valueOf(ad.b("new_user_zone_card_show_count", 0));
            }
            a(1, enterLiveItemRequest, EnterLiveItemResponse.class);
        }
    }
}
