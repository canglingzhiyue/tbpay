package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.g;
import com.taobao.android.preload.k;
import java.util.Map;

/* loaded from: classes5.dex */
public class fjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1406801527);
    }

    public static JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc81489c", new Object[]{str, str2});
        }
        g a2 = k.a("new_detail").a(str);
        if (a2 == null) {
            fjt.a(fjt.TAG_RENDER, str2 + "阶段取到" + str + "对应cacheData为空");
            return null;
        }
        JSONObject jSONObject = (JSONObject) a2.e;
        if (jSONObject != null) {
            return jSONObject;
        }
        fjt.a(fjt.TAG_RENDER, str2 + "阶段取到" + str + "对应cacheData.data为空");
        return null;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        fkt.a();
        if (!fkt.au || StringUtils.isEmpty(str2)) {
            return str;
        }
        return str2 + "_" + str;
    }

    public static String a(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (!StringUtils.isEmpty(str) && (parse = Uri.parse(str)) != null) ? parse.getQueryParameter("newDetailChannel") : "";
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri}) : uri == null ? "" : uri.getQueryParameter("newDetailChannel");
    }

    public static String a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent}) : (intent == null || (data = intent.getData()) == null) ? "" : data.getQueryParameter("newDetailChannel");
    }

    public static String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        if (map == null) {
            return str;
        }
        fkt.a();
        if (!fkt.au) {
            return str;
        }
        String str2 = map.get(str);
        return StringUtils.isEmpty(str2) ? str : str2;
    }
}
