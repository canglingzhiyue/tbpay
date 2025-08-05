package com.etao.feimagesearch.capture.dynamic.msg;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class TipShowMsg extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOW_AREA_CENTER = "center";

    /* renamed from: a  reason: collision with root package name */
    private final String f6566a;
    private final long b;
    private final String c;
    private final String d;

    /* loaded from: classes3.dex */
    public enum TipShowType {
        TEXT_TYPE("text"),
        ALERT_TYPE("alert");
        
        private String type;

        TipShowType(String str) {
            this.type = str;
        }

        public String getType() {
            return this.type;
        }
    }

    static {
        kge.a(1961676735);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "cameraShowTips";
    }

    public TipShowMsg(String str, Long l, String str2, TipShowType tipShowType) {
        this.f6566a = str;
        this.b = l.longValue();
        this.c = str2;
        this.d = tipShowType.type;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6566a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tip", (Object) this.f6566a);
        jSONObject.put("time", (Object) Long.valueOf(this.b));
        jSONObject.put("scene", (Object) this.c);
        jSONObject.put("type", (Object) this.d);
        return jSONObject;
    }
}
