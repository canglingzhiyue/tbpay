package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class LoadingCardModel extends BaseCardModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(364553910);
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.BaseCardModel, com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("275317a8", new Object[]{this}) : "loading";
    }
}
