package tb;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.homepage.request.SettingNewConfigResult;
import com.taobao.tao.homepage.d;
import com.taobao.weex.utils.TBWXConfigManger;
import tb.mto;

/* loaded from: classes7.dex */
public class ohs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f32072a;
    private static final int b;
    private static final int c;

    static {
        kge.a(252333982);
        f32072a = Color.parseColor("#31284D");
        b = Color.parseColor("#2A1B44");
        c = Color.parseColor("#501337");
    }

    public static a a(SettingNewConfigResult settingNewConfigResult) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9c332202", new Object[]{settingNewConfigResult});
        }
        if (settingNewConfigResult != null && (jSONObject = settingNewConfigResult.ext) != null) {
            return new a(jSONObject.getString("defaultBgImgUrl"), a(jSONObject.getString("backgroundColor"), f32072a), jSONObject.getString("straightPullImgUrl"), jSONObject.getString("shadeBgImgUrl"), jSONObject.getString("targetUrl"), a(jSONObject.getString("shadeGradientStartBgColor"), b), a(jSONObject.getString("shadeGradientEndBgColor"), c));
        }
        return null;
    }

    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            e.b("SecondFloorConfigParseUtil", e, "backgroundColor parse error");
            return i;
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        JSONObject f = f();
        if (f != null) {
            return f.getString("straightHomePullImgUrl");
        }
        return null;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        JSONObject f = f();
        if (f != null) {
            return f.getString("straightHomeShadeBgUrl");
        }
        return null;
    }

    public static JSONObject b(SettingNewConfigResult settingNewConfigResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8cf4c8fb", new Object[]{settingNewConfigResult});
        }
        JSONObject jSONObject = new JSONObject();
        if (settingNewConfigResult.getSections() == null) {
            return jSONObject;
        }
        for (JSONObject jSONObject2 : settingNewConfigResult.getSections()) {
            if (TextUtils.equals("Page_SecondFloor", jSONObject2.getString("sectionBizCode"))) {
                return jSONObject2;
            }
        }
        return jSONObject;
    }

    public static int a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return jSONObject2.getIntValue("height");
        } catch (Exception e) {
            e.e("SecondFloorConfigParseUtil", "parseEnterSecondFloorHeight except: " + e);
            return Integer.MAX_VALUE;
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        e.e("SecondFloorConfigParseUtil", "parseWeexUrl targetUrl: " + str);
        String configUrl = TBWXConfigManger.getInstance().getConfigUrl(str);
        if (TextUtils.isEmpty(configUrl) && com.taobao.homepage.page.weexv2.a.a(str)) {
            configUrl = str;
        }
        if (TextUtils.isEmpty(configUrl)) {
            AppMonitor.Alarm.commitFail("Page_Home", ssm.MONITOR_POINT, null, "parseWeexUrlEmpty", "targetUrl: " + str);
            return str;
        }
        return Uri.parse(configUrl).buildUpon().appendQueryParameter("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE).appendQueryParameter("isOpenDirectly", "true").toString();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.isHierarchical() ? parse.getQueryParameter("_mus_tpl") : "";
        return TextUtils.isEmpty(queryParameter) ? str : queryParameter;
    }

    public static double c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b58", new Object[0])).doubleValue() : c("shadeBgStartAlpha");
    }

    public static double d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2d9", new Object[0])).doubleValue() : c("shadeBgMidAlpha");
    }

    public static double e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5a", new Object[0])).doubleValue() : c("shadeBgEndAlpha");
    }

    private static double c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea2", new Object[]{str})).doubleValue();
        }
        JSONObject f = f();
        if (f == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        String string = f.getString(str);
        if (TextUtils.isEmpty(string)) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        try {
            return Double.parseDouble(string);
        } catch (Exception e) {
            e.e("SecondFloorConfigParseUtil", "getValueFromSecondTheme except: " + e);
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    private static JSONObject f() {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[0]);
        }
        String l = oqc.a().l();
        ope f = d.f(l);
        if (f != null && (ext = f.b(l).getExt()) != null) {
            return ext.getJSONObject("secondTheme");
        }
        return null;
    }
}
