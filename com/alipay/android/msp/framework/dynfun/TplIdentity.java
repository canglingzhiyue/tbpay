package com.alipay.android.msp.framework.dynfun;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UtilsMig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes3.dex */
public class TplIdentity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DBG = true;
    public static final int VALUE_V_1 = 1;

    /* renamed from: a  reason: collision with root package name */
    private static int f4707a;
    public final Integer bizId;
    public final String id;
    public final JSONObject info;
    public final int v = 1;
    public final Boolean worker;

    private TplIdentity(String str, Integer num, JSONObject jSONObject, Boolean bool) {
        this.id = str;
        this.bizId = num;
        this.info = jSONObject;
        this.worker = bool;
    }

    public static TplIdentity generateTplIdentity(int i, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TplIdentity) ipChange.ipc$dispatch("d118ed26", new Object[]{new Integer(i), jSONObject, new Boolean(z)});
        }
        int i2 = f4707a;
        long j = i2;
        f4707a = i2 + 1;
        return new TplIdentity(String.format("t_%s_%s_%s", Long.valueOf((new Date().getTime() / 1000) % 100000000), Long.valueOf(j), UtilsMig.getRandomString(8)), Integer.valueOf(i), jSONObject, Boolean.valueOf(z));
    }

    public static TplIdentity generateSpec(String str, Integer num, Boolean bool) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TplIdentity) ipChange.ipc$dispatch("9c8e26b6", new Object[]{str, num, bool}) : new TplIdentity(str, num, null, bool);
    }

    public static boolean matchSpec(TplIdentity tplIdentity, TplIdentity tplIdentity2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1658264b", new Object[]{tplIdentity, tplIdentity2})).booleanValue();
        }
        if (tplIdentity == null || tplIdentity2 == null) {
            return false;
        }
        String str = tplIdentity.id;
        if (str != null && !TextUtils.equals(str, tplIdentity2.id)) {
            return false;
        }
        Integer num = tplIdentity.bizId;
        if (num != null && !num.equals(tplIdentity2.bizId)) {
            return false;
        }
        Boolean bool = tplIdentity.worker;
        return bool == null || bool.equals(tplIdentity2.worker);
    }

    public static TplIdentity fromJSON(JSONObject jSONObject) throws AssertionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TplIdentity) ipChange.ipc$dispatch("dcd92d96", new Object[]{jSONObject});
        }
        try {
            if (!jSONObject.containsKey("v") || jSONObject.getIntValue("v") != 1) {
                throw new AssertionError("Invalid tplIdentity version ".concat(String.valueOf(jSONObject)));
            }
            return new TplIdentity(jSONObject.containsKey("id") ? jSONObject.getString("id") : null, jSONObject.containsKey("bizId") ? Integer.valueOf(jSONObject.getIntValue("bizId")) : null, jSONObject.containsKey("info") ? jSONObject.getJSONObject("info") : null, jSONObject.containsKey("worker") ? jSONObject.getBoolean("worker") : null);
        } catch (Throwable th) {
            LogUtil.record(8, "TplIdentity", "TplIdentity.fromJSON", "exception");
            th.printStackTrace();
            return null;
        }
    }

    public JSONObject toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", (Object) Integer.valueOf(this.v));
        jSONObject.put("id", (Object) this.id);
        jSONObject.put("bizId", (Object) this.bizId);
        jSONObject.put("info", (Object) this.info);
        jSONObject.put("worker", (Object) this.worker);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TplIdentity tplIdentity = (TplIdentity) obj;
            if (this.v == tplIdentity.v && UtilsMig.equals(this.id, tplIdentity.id) && UtilsMig.equals(this.bizId, tplIdentity.bizId) && UtilsMig.equals(this.worker, tplIdentity.worker)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Arrays.hashCode(new Object[]{Integer.valueOf(this.v), this.id, this.bizId, this.worker});
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "<TplIdentity @" + super.hashCode() + " v" + this.v + ", " + this.id + ", " + this.bizId + ", " + this.worker + ">";
    }

    public static boolean drmEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c604402d", new Object[0])).booleanValue() : DynConstants.a();
    }
}
