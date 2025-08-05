package com.taobao.detail.rate.widget.delegate.tag.bean;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class AssociationTagItem implements Serializable {
    public JSONObject associationTag;
    public String fuzzyCount;
    public String id;
    public String status;
    public String title;

    public AssociationTagItem(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        this.title = str;
        this.fuzzyCount = str2;
        this.status = str3;
        this.id = str4;
        this.associationTag = jSONObject;
    }
}
