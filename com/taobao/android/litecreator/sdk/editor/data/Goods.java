package com.taobao.android.litecreator.sdk.editor.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class Goods extends EditableBean<Goods> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionUrl;
    public String brandName;
    public String image;
    public List<HashMap<String, String>> infos;
    public String isInvalid;
    public String itemId;
    public String price;
    public String skuId;
    public String tagIcon;
    public String title;

    static {
        kge.a(-1695398950);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Goods{itemId='" + this.itemId + "', skuId='" + this.skuId + "', image='" + this.image + "', tagIcon='" + this.tagIcon + "', title='" + this.title + "', brandName='" + this.brandName + "', price='" + this.price + "', actionUrl='" + this.actionUrl + "', isInvalid='" + this.isInvalid + "', infos=" + this.infos + '}';
    }
}
