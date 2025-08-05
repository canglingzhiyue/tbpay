package tb;

import android.content.Context;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionActionType;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class elz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(692024350);
        emu.a("com.taobao.android.detail.core.standard.userMotion.DetailUserMotionUtils");
    }

    public static UserMotionConfig a(Context context) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserMotionConfig) ipChange.ipc$dispatch("3955ffa0", new Object[]{context});
        }
        if (!(context instanceof DetailCoreActivity)) {
            return null;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
        if (detailCoreActivity.C() == null || detailCoreActivity.C().f10055a == null || detailCoreActivity.C().f10055a.a() == null || (jSONObject = detailCoreActivity.C().f10055a.a().getJSONObject("detailMotion")) == null || jSONObject.isEmpty()) {
            return null;
        }
        try {
            return (UserMotionConfig) JSON.toJavaObject(jSONObject, UserMotionConfig.class);
        } catch (Exception e) {
            i.a("DetailUserMotionUtils", e.toString());
            return null;
        }
    }

    public static JSONObject b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ecf0ff1f", new Object[]{context});
        }
        if (!(context instanceof DetailCoreActivity)) {
            return null;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
        if (detailCoreActivity.C() == null) {
            return null;
        }
        String i = detailCoreActivity.C().i();
        if (i == null) {
            i = "";
        }
        String h = detailCoreActivity.C().h();
        if (h == null) {
            h = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) i);
        jSONObject.put("sellerId", (Object) h);
        return jSONObject;
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        UserMotionConfig a2 = a(context);
        if (!UserMotionConfig.isValid(a2)) {
            return;
        }
        String str = a2.page;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z ? "_Appear-" : "_DisAppear-");
        sb.append("detailDesc");
        String sb2 = sb.toString();
        String str2 = z ? UserMotionActionType.COMPONENT_APPEAR : UserMotionActionType.COMPONENT_DISAPPEAR;
        HashMap hashMap = new HashMap();
        JSONObject b = b(context);
        if (b != null) {
            hashMap.put("itemId", b.getString("itemId"));
            hashMap.put("sellerId", b.getString("sellerId"));
        }
        hashMap.put("uniqueId", a2.uid);
        hashMap.put("from", "unknown");
        hashMap.put("componentKey", "detailDesc");
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19997, sb2, str2, "", hashMap).build());
    }
}
