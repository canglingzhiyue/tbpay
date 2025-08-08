package tb;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.infoflow.multitab.e;

/* loaded from: classes7.dex */
public class sqy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1383839271);
    }

    public static int a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            return -1;
        }
        int parseColor = Color.parseColor("#FFFFFF");
        if (jSONObject2.getBooleanValue("globalGrey")) {
            return Color.parseColor("#FAFAFA");
        }
        if (d(jSONObject)) {
            return a(FestivalMgr.a().a("global", "actionBarBackgroundColor"), parseColor);
        }
        Object a2 = HomePageUtility.a(jSONObject, "item.bg.content.bgColor");
        return a2 instanceof String ? a((String) a2, parseColor) : parseColor;
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        if (d(jSONObject)) {
            return FestivalMgr.a().a("global", "actionBarBackgroundImage");
        }
        Object a2 = HomePageUtility.a(jSONObject, "item.bg.content.bgImg");
        return a2 instanceof String ? (String) a2 : "";
    }

    public static boolean c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null) {
            return jSONObject2.getBooleanValue("nativeBgEnable");
        }
        return false;
    }

    private static boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        return jSONObject2 != null && !jSONObject2.getBooleanValue(e.KEY_IS_FESTIVAL) && !StringUtils.isEmpty(FestivalMgr.a().a("global", "actionBarBackgroundColor"));
    }

    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
