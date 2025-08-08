package com.taobao.taolive.sdk.goodlist;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class ItemGroupPageInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject data;
    public String goodsTips;
    public String id;
    public String source;
    public String title;
    public String topButton;
    public String type;

    static {
        kge.a(-292857250);
        kge.a(-540945145);
    }

    public boolean checkInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a75a361", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.title) && !StringUtils.isEmpty(this.id) && !StringUtils.isEmpty(this.type);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ItemGroupPageInfo{title='" + this.title + "', id='" + this.id + "', type='" + this.type + "', topButton='" + this.topButton + "', source='" + this.source + "', data=" + this.data + '}';
    }
}
