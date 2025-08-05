package com.taobao.android.themis.graphics;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes6.dex */
public class JSParam {
    public static final int BOOLEAN = 1;
    public static final int DOUBLE = 4;
    public static final int FLOAT = 6;
    public static final int INTEGER = 5;
    public static final int JSON = 3;
    public static final int STRING = 2;
    public Object data;
    public int type;

    public JSParam(Object obj) {
        Object jSONObject;
        if (obj == null) {
            this.type = 2;
            jSONObject = "";
        } else {
            this.data = obj;
            if (obj instanceof Integer) {
                this.type = 5;
                jSONObject = (Integer) obj;
            } else if (obj instanceof Double) {
                this.type = 4;
                jSONObject = (Double) obj;
            } else if (obj instanceof Float) {
                this.type = 6;
                jSONObject = (Float) obj;
            } else if (obj instanceof Boolean) {
                this.type = 1;
                jSONObject = (Boolean) obj;
            } else if (obj instanceof String) {
                this.type = 2;
                return;
            } else if (!(obj instanceof JSONObject)) {
                if (!(obj instanceof JSONArray)) {
                    return;
                }
                this.type = 3;
                this.data = ((JSONArray) obj).toString();
                return;
            } else {
                this.type = 3;
                jSONObject = ((JSONObject) obj).toString();
            }
        }
        this.data = jSONObject;
    }
}
