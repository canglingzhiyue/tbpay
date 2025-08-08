package android.taobao.windvane.monitor;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f1686a;
    private static List<String> b;

    static {
        kge.a(-1467724863);
        f1686a = null;
        b = Arrays.asList("heic.alicdn.com", "img.alicdn.com", "gw.alicdn.com", "picasso.alicdn.com");
    }

    public static boolean needSampleWebp() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf071c27", new Object[0])).booleanValue();
        }
        if (!android.taobao.windvane.config.j.commonConfig.cu) {
            return false;
        }
        Boolean bool = f1686a;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (android.taobao.windvane.config.j.commonConfig.cv > Math.random()) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f1686a = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean isImageSpaceUrl(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4df30f", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
            android.taobao.windvane.util.m.e("WebpSampleUtil", "url parse fail");
        }
        if (parse == null) {
            return false;
        }
        for (String str2 : b) {
            if (StringUtils.equals(str2, parse.getHost())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWebpUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee49a57e", new Object[]{str})).booleanValue() : str != null && str.endsWith(".webp");
    }

    public static void commitWebpResource(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec49cec7", new Object[]{str, str2, new Integer(i)});
        } else if (!needSampleWebp() || isImageSpaceUrl(str) || StringUtils.isEmpty(str2)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageUrl", str2);
                jSONObject.put("resourceUrl", str);
                jSONObject.put("coreType", i);
                a.commitSuccess(a.MONITOR_POINT_WEBP_RESOURCE, jSONObject.toString());
            } catch (JSONException e) {
                android.taobao.windvane.util.m.b("WebpSampleUtil", "commitWebpResource error", e, new Object[0]);
            }
        }
    }
}
