package com.taobao.tao.recommend2.model.remote;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class RawModel implements Serializable, IMTOPDataObject {
    private String bizName;
    private String btn;
    private JSONObject fields;
    private String id;
    private String ref;
    private String tag;
    private String type;

    static {
        kge.a(897642475);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public String getRef() {
        return this.ref;
    }

    public void setRef(String str) {
        this.ref = str;
    }

    public String getBizName() {
        return this.bizName;
    }

    public void setBizName(String str) {
        this.bizName = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public JSONObject getFields() {
        return this.fields;
    }

    public void setFields(JSONObject jSONObject) {
        this.fields = jSONObject;
    }

    public String getBtn() {
        return this.btn;
    }

    public void setBtn(String str) {
        this.btn = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }
}
