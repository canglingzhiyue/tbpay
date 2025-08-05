package com.loc;

import anet.channel.strategy.dispatch.DispatchConstants;
import java.util.Objects;
import org.json.JSONObject;
import tb.mto;

/* loaded from: classes4.dex */
public final class fc {

    /* renamed from: a  reason: collision with root package name */
    public int f7786a = 0;
    public double b = mto.a.GEO_NOT_SUPPORT;
    public double c = mto.a.GEO_NOT_SUPPORT;
    public long d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 63;
    public int h = 0;

    public final String a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("time", this.d);
            jSONObject.put("lon", this.c);
            jSONObject.put(DispatchConstants.LATITUDE, this.b);
            jSONObject.put("radius", this.e);
            jSONObject.put("locationType", this.f7786a);
            jSONObject.put("reType", this.g);
            jSONObject.put("reSubType", this.h);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.b = jSONObject.optDouble(DispatchConstants.LATITUDE, this.b);
            this.c = jSONObject.optDouble("lon", this.c);
            this.f7786a = jSONObject.optInt("locationType", this.f7786a);
            this.g = jSONObject.optInt("reType", this.g);
            this.h = jSONObject.optInt("reSubType", this.h);
            this.e = jSONObject.optInt("radius", this.e);
            this.d = jSONObject.optLong("time", this.d);
        } catch (Throwable th) {
            fr.a(th, "CoreUtil", "transformLocation");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fc fcVar = (fc) obj;
            if (this.f7786a == fcVar.f7786a && Double.compare(fcVar.b, this.b) == 0 && Double.compare(fcVar.c, this.c) == 0 && this.d == fcVar.d && this.e == fcVar.e && this.f == fcVar.f && this.g == fcVar.g && this.h == fcVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7786a), Double.valueOf(this.b), Double.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }
}
