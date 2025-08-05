package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class ssf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMERCIAL_AD_NORMAL = "commercialAdNormal";
    public static final String COMMERCIAL_AD_VIDEO = "commercialAdVideo";
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_OTHER = 2;
    public static final int TYPE_VIDEO = 0;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f33880a;
    private static final List<String> b;
    private static final List<String> c;
    private static final List<String> d;
    private static final List<String> e;
    private static final List<String> f;

    static {
        kge.a(777728298);
        f33880a = Arrays.asList(BootImageInfo.BIZ_TYPE_VIDEO, BootImageInfo.BIZ_TYPE_VIDEO_ICON, "commercialAdNormal", "commercialAdVideo");
        b = Arrays.asList("image", BootImageInfo.BIZ_TYPE_VIDEO_ICON);
        c = Arrays.asList("commercialAdNormal", "commercialAdVideo");
        d = Arrays.asList(BootImageInfo.BIZ_TYPE_VIDEO, BootImageInfo.BIZ_TYPE_VIDEO_ICON);
        e = Arrays.asList("commercialAdNormal", "image", BootImageInfo.BIZ_TYPE_COLD_START_AD);
        f = Arrays.asList("commercialAdVideo", BootImageInfo.BIZ_TYPE_VIDEO, BootImageInfo.BIZ_TYPE_VIDEO_ICON);
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("subSection")) != null && (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null && (jSONObject4 = jSONObject3.getJSONObject("item")) != null && (jSONObject5 = jSONObject4.getJSONObject("0")) != null) {
            return jSONObject5.getJSONObject("content");
        }
        return null;
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("subSection")) != null && (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null) {
            return jSONObject3.getJSONObject(h.TRACK_EXPOSURE_PARAM);
        }
        return null;
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null) {
            return null;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject(h.TRACK_EXPOSURE_PARAM);
        JSONObject jSONObject6 = jSONObject3.getJSONObject("item");
        if (jSONObject6 == null || (jSONObject4 = jSONObject6.getJSONObject("0")) == null) {
            return null;
        }
        JSONObject jSONObject7 = jSONObject4.getJSONObject("content");
        jSONObject7.put(h.TRACK_EXPOSURE_PARAM, (Object) jSONObject5);
        return jSONObject7;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (e.contains(str)) {
            return 1;
        }
        return f.contains(str) ? 0 : 2;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : f33880a.contains(str);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : b.contains(str);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : c.contains(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue() : d.contains(str);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String substring = str2.substring(str2.lastIndexOf("/") + 1);
        kej.a("BootImageDataUtils", "getLocalVideoPath: " + substring);
        File file = new File(keo.d(str), substring);
        if (!file.exists()) {
            kej.a("BootImageDataUtils", "getLocalVideoPath: " + file + " ,no exist");
            return null;
        }
        return file.getAbsolutePath();
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd890709", new Object[]{str}) : a(tiq.BIZ_CODE, str);
    }
}
