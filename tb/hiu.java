package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.d;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.g;

/* loaded from: classes6.dex */
public class hiu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-460707015);
    }

    public static boolean a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1232887", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || liveItem.extendVal == null || liveItem.extendVal.secKillInfo == null || !hiq.d(liveItem)) {
            return false;
        }
        return !com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.f() || a(pqj.b(liveItem.extendVal.secKillInfo)).f28695a > 0;
    }

    public static boolean a(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a792850", new Object[]{jSONObject, new Boolean(z)})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("extendVal")) != null && TextUtils.equals("secKill", jSONObject2.getString("itemBizType")) && d.a()) {
            if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.f()) {
                return true;
            }
            a a2 = a(jSONObject2.getJSONObject("secKillInfo"));
            if (z && a2.b != null) {
                jSONObject2.put("secKillInfo", (Object) a2.b);
            }
            if (a2.f28695a > 0) {
                return true;
            }
        }
        return false;
    }

    private static a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ef58d40d", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new a(0, null);
        }
        long a2 = hiq.a();
        if (a(jSONObject, a2)) {
            return new a(1, null);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("nextActivityList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new a(0, null);
        }
        return new a(a(jSONArray.getJSONObject(0), a2) ? 2 : 0, a2 > g.a(jSONObject, "showEndTime", -1L) ? jSONArray.getJSONObject(0) : null);
    }

    private static boolean a(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a78ec40", new Object[]{jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return false;
        }
        long a2 = g.a(jSONObject, "showStartTime", -1L);
        long a3 = g.a(jSONObject, "showEndTime", -1L);
        if (a2 <= 0 || a3 <= 0) {
            return true;
        }
        return j < a3 && j > a2;
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f28695a;
        public JSONObject b;

        static {
            kge.a(-1271080621);
        }

        private a(int i, JSONObject jSONObject) {
            this.f28695a = i;
            this.b = jSONObject;
        }
    }
}
