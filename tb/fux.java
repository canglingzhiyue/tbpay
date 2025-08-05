package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;

/* loaded from: classes.dex */
public class fux {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static fuy f28136a;

    static {
        kge.a(-1595787156);
    }

    public static void a(fuy fuyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94bfd0e", new Object[]{fuyVar});
        } else {
            f28136a = fuyVar;
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        fuy fuyVar = f28136a;
        if (fuyVar == null) {
            return;
        }
        try {
            fuyVar.a(str, str2, str3);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a("DinamicX", "DinamicX", str);
        }
    }

    public static void a(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c0a8a", new Object[]{str, str2, dXTemplateItem, map, str3});
        } else {
            b("DinamicX", "DinamicX", b(str, str2, dXTemplateItem, map, str3));
        }
    }

    private static String b(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7de64c57", new Object[]{str, str2, dXTemplateItem, map, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        sb.append(str);
        sb.append("]:");
        sb.append(str2);
        sb.append("|");
        JSONObject jSONObject = new JSONObject();
        if (dXTemplateItem != null) {
            jSONObject.put("template", (Object) dXTemplateItem.f11925a);
            jSONObject.put("version", (Object) Long.valueOf(dXTemplateItem.b));
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        if (str3 != null) {
            jSONObject.put("error", (Object) str3);
        }
        sb.append(jSONObject.toJSONString());
        return sb.toString();
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        fuy fuyVar = f28136a;
        if (fuyVar == null) {
            return;
        }
        try {
            fuyVar.b(str, str2, str3);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b("DinamicX", "DinamicX", str);
        }
    }
}
