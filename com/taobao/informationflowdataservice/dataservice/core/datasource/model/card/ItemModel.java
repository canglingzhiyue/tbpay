package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import tb.kge;

/* loaded from: classes7.dex */
public class ItemModel extends BaseItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(149963526);
    }

    public ItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : size();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel
    /* renamed from: getBaseItemModel  reason: collision with other method in class */
    public SubItemModel mo1094getBaseItemModel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubItemModel) ipChange.ipc$dispatch("f8e7af58", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = getJSONObject(String.valueOf(i));
        if (jSONObject != null) {
            return new SubItemModel(jSONObject);
        }
        return null;
    }
}
