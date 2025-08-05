package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f10047a;
    public String b;
    public String c;
    public String d;
    public C0387a e;

    /* renamed from: com.taobao.android.detail.datasdk.model.datamodel.node.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0387a {

        /* renamed from: a  reason: collision with root package name */
        public b f10048a;

        static {
            kge.a(-875680217);
        }

        public C0387a(JSONObject jSONObject) {
            this.f10048a = new b(jSONObject);
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f10049a;
        public String b;

        static {
            kge.a(-1956052068);
        }

        public b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f10049a = jSONObject.getString("id");
                this.b = jSONObject.getString("version");
            }
        }
    }

    static {
        kge.a(995030882);
    }

    public a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f10047a = jSONObject.getString("mode");
        this.b = jSONObject.getString("osVersion");
        this.c = jSONObject.getString("protocolVersion");
        this.d = jSONObject.getString("ultronage");
        this.e = new C0387a(jSONObject.getJSONObject("meta"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.EndPoint");
    }
}
