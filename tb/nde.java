package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.oversea.discovery.business.model.a;
import com.taobao.oversea.discovery.business.mtop.d;
import com.taobao.tao.infoflow.multitab.e;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* loaded from: classes7.dex */
public class nde {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ECHO = "echo";
    public static final String END = "end";
    public static final String G_BIZFILTER = "g_bizFilter";
    public static final String G_CHANNELSRP = "g_channelSrp";
    public static final String PLACEHOLDER = "placeholder";

    public static lkb a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkb) ipChange.ipc$dispatch("ac9cbec0", new Object[]{ljsVar});
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService != null) {
            return iHostService.getInvokeCallback().c();
        }
        return null;
    }

    public static void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{str, jSONObject});
            return;
        }
        try {
            jSONObject.getJSONObject(e.KEY_SMART_CONTENT).put("displayText", (Object) str);
            String string = jSONObject.getString("targetUrl");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            if (string.contains(G_CHANNELSRP) || string.contains(G_BIZFILTER) || string.contains("placeholder")) {
                String a2 = a(string, "\\?");
                if (StringUtils.isEmpty(a2)) {
                    a2 = "";
                }
                if (StringUtils.isEmpty(a2)) {
                    string = a(string, "&");
                    if (!StringUtils.isEmpty(string)) {
                    }
                }
                string = a2;
            }
            if (string.contains("?")) {
                if (!string.endsWith("?")) {
                    string = string + "&";
                }
            } else {
                string = string + "?";
            }
            jSONObject.put("targetUrl", (Object) (string + G_CHANNELSRP + "=" + a.f + "&" + G_BIZFILTER + "=" + a.f + "&placeholder=" + URLEncoder.encode(new String(str.getBytes(), Charset.forName("UTF-8")), "UTF-8")));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            String[] split = str.split(str2);
            return split.length > 0 ? split[0] : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static <T> T a(String str, Class<T> cls, d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("a8c1c1be", new Object[]{str, cls, dVar});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null && !StringUtils.isEmpty(parseObject.toJSONString())) {
                JSONObject parseObject2 = JSON.parseObject(parseObject.toJSONString());
                dVar.a(parseObject2.getString(ECHO) == null ? "" : parseObject2.getString(ECHO));
                if (parseObject2.getBoolean("end") == null || !parseObject2.getBoolean("end").booleanValue()) {
                    z = false;
                }
                dVar.b(z);
                return (T) JSON.parseObject(parseObject.toJSONString(), cls);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
