package com.taobao.android.order.map.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;
import tb.bxb;
import tb.jqc;
import tb.kge;
import tb.mto;

/* loaded from: classes6.dex */
public final class OrderMapBubbleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14650a;
    private JSONObject b;
    private JSONObject c;
    private final JSONObject d;
    private BubbleCoordinate e;

    static {
        kge.a(765111362);
    }

    public OrderMapBubbleModel(String str, JSONObject jSONObject) {
        this.f14650a = str;
        this.d = jSONObject;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f14650a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.getString("bubbleName");
        }
        return null;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.b;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.b = jSONObject;
        this.e = new BubbleCoordinate(jSONObject);
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.c;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public BubbleCoordinate e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BubbleCoordinate) ipChange.ipc$dispatch("b36741f7", new Object[]{this});
        }
        BubbleCoordinate bubbleCoordinate = this.e;
        return bubbleCoordinate == null ? new BubbleCoordinate(null) : bubbleCoordinate;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.d;
    }

    /* loaded from: classes6.dex */
    public static class BubbleCoordinate extends OrderMapCoordinateModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float offsetX;
        private float offsetY;

        static {
            kge.a(14574438);
        }

        public BubbleCoordinate(JSONObject jSONObject) {
            this.offsetX = 0.5f;
            this.offsetY = 1.0f;
            if (jSONObject == null) {
                return;
            }
            try {
                setLongitude(jqc.a(jSONObject, "longitude", (double) mto.a.GEO_NOT_SUPPORT));
                setLatitude(jqc.a(jSONObject, "latitude", (double) mto.a.GEO_NOT_SUPPORT));
                this.offsetX = jqc.a(jSONObject, "offsetX", this.offsetX);
                this.offsetY = jqc.a(jSONObject, "offsetY", this.offsetY);
            } catch (Exception e) {
                bxb.a(OrderBizCode.logisticsDetail, "createBubbleCoordinateError", e.getMessage());
            }
        }

        public float getOffsetX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25635ee6", new Object[]{this})).floatValue() : this.offsetX;
        }

        public float getOffsetY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25717667", new Object[]{this})).floatValue() : this.offsetY;
        }
    }
}
