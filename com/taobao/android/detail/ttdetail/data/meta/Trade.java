package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import com.ut.share.utils.Constants;
import tb.kge;

@MappingKey(key = "trade")
/* loaded from: classes4.dex */
public class Trade extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject afterAddToCartAction;
    private a hintBanner;
    private final String redirectUrl;

    static {
        kge.a(-1882402868);
    }

    public static String nullToEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8ed2fc4", new Object[]{str}) : str == null ? "" : str;
    }

    public Trade(JSONObject jSONObject) {
        super(jSONObject);
        this.redirectUrl = jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY);
        JSONObject jSONObject2 = jSONObject.getJSONObject("hintBanner");
        if (jSONObject2 != null) {
            this.hintBanner = new a(jSONObject2);
        }
        this.afterAddToCartAction = jSONObject.getJSONObject("afterAddToCartAction");
    }

    public String getRedirectUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e51785c", new Object[]{this}) : this.redirectUrl;
    }

    public a getHintBanner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("807e8f0c", new Object[]{this}) : this.hintBanner;
    }

    public JSONObject getAfterAddToCartAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fcb7b633", new Object[]{this}) : this.afterAddToCartAction;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f10634a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private JSONObject i;

        static {
            kge.a(622633099);
        }

        public a(JSONObject jSONObject) {
            this.f10634a = Trade.nullToEmpty(jSONObject.getString("text"));
            this.b = Trade.nullToEmpty(jSONObject.getString("subText"));
            this.c = Trade.nullToEmpty(jSONObject.getString(e.KEY_BG_COLOR));
            this.g = Trade.nullToEmpty(jSONObject.getString("textColor"));
            this.h = Trade.nullToEmpty(jSONObject.getString("buttonTextColor"));
            this.d = Trade.nullToEmpty(jSONObject.getString("buttonText"));
            this.e = Trade.nullToEmpty(jSONObject.getString("eventId"));
            this.f = Trade.nullToEmpty(jSONObject.getString("url"));
            this.i = jSONObject.getJSONObject("fields");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10634a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
        }

        public String h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
        }

        public JSONObject i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this}) : this.i;
        }
    }
}
