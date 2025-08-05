package com.alibaba.triver.triver_shop.shop2023.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopComponentModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject data;
    private final JSONObject extData;
    private final JSONObject mtopInfo;
    private final String name;
    private final int renderHeight;
    private final String renderTargetTab;
    private final boolean sendMtop;
    private final String targetUrl;
    private final String type;
    private final JSONObject userTrackInfo;
    private final String version;

    static {
        kge.a(-1567157451);
        kge.a(1028243835);
    }

    public ShopComponentModel(JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, String str, String str2, String str3, String str4, int i, String str5, JSONObject jSONObject4) {
        this.userTrackInfo = jSONObject;
        this.sendMtop = z;
        this.mtopInfo = jSONObject2;
        this.data = jSONObject3;
        this.type = str;
        this.name = str2;
        this.targetUrl = str3;
        this.version = str4;
        this.renderHeight = i;
        this.renderTargetTab = str5;
        this.extData = jSONObject4;
    }

    public final JSONObject getUserTrackInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e39fb8ff", new Object[]{this}) : this.userTrackInfo;
    }

    public final boolean getSendMtop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70fb6c71", new Object[]{this})).booleanValue() : this.sendMtop;
    }

    public final JSONObject getMtopInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3f8a7db3", new Object[]{this}) : this.mtopInfo;
    }

    public final JSONObject getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this}) : this.data;
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.type;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public final String getTargetUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this}) : this.targetUrl;
    }

    public final String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.version;
    }

    public final int getRenderHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed5c2bcd", new Object[]{this})).intValue() : this.renderHeight;
    }

    public final String getRenderTargetTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("447514e1", new Object[]{this}) : this.renderTargetTab;
    }

    public final JSONObject getExtData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("c5adce5c", new Object[]{this}) : this.extData;
    }

    public final boolean canRenderDXTemplate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("306f11bf", new Object[]{this})).booleanValue() : (this.renderHeight == 0 || this.targetUrl == null || this.version == null) ? false : true;
    }

    public final JSONObject getDXJSONConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a43eddb", new Object[]{this}) : com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("name", this.name), j.a("version", this.version), j.a("url", this.targetUrl));
    }

    public final boolean needPrefetchRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c688ad", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.extData;
        return q.a((Object) "true", (Object) (jSONObject == null ? null : jSONObject.getString("isPrefetchRequest")));
    }

    public final boolean isDXType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c119a023", new Object[]{this})).booleanValue() : q.a((Object) "dx", (Object) this.type);
    }

    public final boolean isWebType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0e81eaf", new Object[]{this})).booleanValue() : q.a((Object) "web", (Object) this.type);
    }
}
