package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;

/* loaded from: classes7.dex */
public class lci {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd05860", new Object[]{str, str2, str3, str4, jSONObject});
            return;
        }
        lcj.a(str, 19999, "TBTXAdv_" + str2, str3, str4, jSONObject);
    }

    public static void a(String str, float f, int i, int i2, int i3, int i4, int i5, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497dd2b", new Object[]{str, new Float(f), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Float(f2)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put("lottieUrl", (Object) str);
            }
            jSONObject.put("duration", (Object) String.valueOf(f));
            jSONObject.put("lottieWidth", (Object) String.valueOf(i));
            jSONObject.put("lottieHeight", (Object) String.valueOf(i2));
            jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(i3));
            jSONObject.put("screenHeight", (Object) String.valueOf(i4));
            jSONObject.put("curPosition", (Object) String.valueOf(i5));
            jSONObject.put("frameRate", (Object) String.valueOf(f2));
            a("Page_Home_TXAD", "Lottie_Load_Success", null, null, jSONObject);
            lch.a("AdUtUtils", jSONObject.toJSONString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, float f, int i, int i2, int i3, int i4, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc88d5d8", new Object[]{str, new Float(f), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!StringUtils.isEmpty(str)) {
                jSONObject.put("lottieUrl", (Object) str);
            }
            jSONObject.put("duration", (Object) String.valueOf(f));
            jSONObject.put("lottieWidth", (Object) String.valueOf(i));
            jSONObject.put("lottieHeight", (Object) String.valueOf(i2));
            jSONObject.put(d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(i3));
            jSONObject.put("screenHeight", (Object) String.valueOf(i4));
            if (!StringUtils.isEmpty(str2)) {
                jSONObject.put("errMsg", (Object) str2);
            }
            a("Page_Home_TXAD", "Lottie_Load_Fail", null, null, jSONObject);
            lch.a("AdUtUtils", jSONObject.toJSONString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
