package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.hiq;
import tb.kge;

/* loaded from: classes6.dex */
public class ItemCategory implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean backSortList;
    public String bizType;
    public String categoryId;
    public String couponTemplateId;
    public JSONObject extraInfo;
    public String iconUrl;
    public boolean independentTab;
    public String name;
    public boolean queryRights;
    public String selectedPic;
    public String unSelectedPic;

    static {
        kge.a(-225549876);
        kge.a(-540945145);
    }

    public boolean isDefaultTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1735fe9", new Object[]{this})).booleanValue() : hiq.a(this.name, this.categoryId);
    }

    public boolean isPreheatTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db878ed7", new Object[]{this})).booleanValue() : hiq.a(this.bizType);
    }

    public boolean isIndependentTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d67a790", new Object[]{this})).booleanValue() : this.independentTab;
    }

    public static ItemCategory constructDefaultCategory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemCategory) ipChange.ipc$dispatch("4bed4274", new Object[0]);
        }
        ItemCategory itemCategory = new ItemCategory();
        itemCategory.name = "全部";
        itemCategory.categoryId = "0";
        itemCategory.queryRights = true;
        return itemCategory;
    }
}
