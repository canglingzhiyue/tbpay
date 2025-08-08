package com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import java.util.HashMap;
import java.util.List;
import tb.hja;
import tb.hjd;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends hja<ItemGroupView> implements hjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2106770781);
        kge.a(1445641463);
    }

    public a(c cVar) {
        super(cVar);
    }

    @Override // tb.hja
    public void a(List<ItemlistV2ResponseData.ItemListv1> list) {
        ItemGroupPageInfo pageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && !list.isEmpty() && (pageInfo = ((ItemGroupView) this.f13751a).getPageInfo()) != null) {
            for (int i = 0; i < list.size(); i++) {
                ItemlistV2ResponseData.ItemListv1 itemListv1 = list.get(i);
                if (itemListv1 != null && itemListv1.liveItemDO != null) {
                    if (itemListv1.liveItemDO.extraUTParams == null) {
                        itemListv1.liveItemDO.extraUTParams = new HashMap();
                    }
                    itemListv1.liveItemDO.extraUTParams.put("aggregation_id", pageInfo.id);
                    itemListv1.liveItemDO.extraUTParams.put("aggregation_type", pageInfo.type);
                    if (!StringUtils.isEmpty(pageInfo.source)) {
                        itemListv1.liveItemDO.extraUTParams.put("aggregation_source", pageInfo.source);
                    }
                }
            }
        }
    }
}
