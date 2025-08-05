package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.nodemodel.extend.AURAExtendModuleNodeModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.internal.util.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.Iterator;
import tb.arc;

/* loaded from: classes2.dex */
public class aqw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1624927078);
    }

    public static boolean a(AURAExtendModuleNodeModel aURAExtendModuleNodeModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a41397", new Object[]{aURAExtendModuleNodeModel, jSONObject})).booleanValue();
        }
        String str = aURAExtendModuleNodeModel.configPath;
        if (jSONObject == null || jSONObject.isEmpty()) {
            a(str + "#不是合法的AURA配置", true);
            return true;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject2 == null) {
            a(str + "#不是合法的AURA配置#没有plugin节点", true);
            return true;
        } else if (!TextUtils.equals(jSONObject2.getString("bizCode"), aURAExtendModuleNodeModel.bizCode)) {
            a(str + "和扩展配置中的信息不一致：bizCode", true);
            return true;
        } else if (TextUtils.equals(jSONObject2.getString("name"), aURAExtendModuleNodeModel.name)) {
            return false;
        } else {
            a(str + "#和平台层扩展信息不一致：name", true);
            return true;
        }
    }

    public static JSONObject a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2901b94a", new Object[]{context, str});
        }
        if (bbk.a(str)) {
            a("AURA配置路径不能为空", true);
            return null;
        }
        String a2 = bss.a(context, str);
        if (TextUtils.isEmpty(a2)) {
            a("读取配置文件【" + str + "】失败", true);
            return null;
        }
        JSONObject parseObject = JSON.parseObject(a2);
        if (parseObject == null) {
            a("序列化配置文件【" + str + "】失败", true);
            return null;
        }
        JSONObject jSONObject = parseObject.getJSONObject(b.TRACK_PAGE_COUNTER_TYPE_PLUGIN);
        if (jSONObject == null) {
            a("配置文件【" + str + "】没有plugin节点，不合法", true);
            return null;
        } else if (!TextUtils.isEmpty(jSONObject.getString("bizCode"))) {
            return parseObject;
        } else {
            a("配置文件【" + str + "】没有bizCode节点，不合法", true);
            return null;
        }
    }

    public static AURAExtendModuleNodeModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAExtendModuleNodeModel) ipChange.ipc$dispatch("28df8cdd", new Object[]{jSONObject});
        }
        if ("true".equalsIgnoreCase(jSONObject.getString("debug")) && !baw.a()) {
            return null;
        }
        String string = jSONObject.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String string2 = jSONObject.getString("configPath");
        String str = string2 + "#extendedModules扩展配置必须设置：";
        if (bbk.a(string)) {
            a(str + AliFestivalWVPlugin.PARAMS_MODULE_NAME, true);
            return null;
        }
        String string3 = jSONObject.getString("bizCode");
        if (bbk.a(string3)) {
            a(str + "bizCode", true);
            return null;
        }
        String string4 = jSONObject.getString("name");
        if (bbk.a(string4)) {
            a(str + "name", true);
            return null;
        } else if (baw.a() && TextUtils.isEmpty(string2)) {
            a(str + "configPath", true);
            return null;
        } else {
            return new AURAExtendModuleNodeModel(string, string4, string3, string2);
        }
    }

    public static String b(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : (jSONObject == null || (string = jSONObject.getString("code")) == null) ? "" : string;
    }

    public static JSONObject a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("72e64e7a", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if (str.equals(jSONObject.getString("code"))) {
                        return jSONObject;
                    }
                }
            }
        }
        return null;
    }

    public static boolean b(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef0fe09f", new Object[]{jSONArray, str})).booleanValue();
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof JSONObject) && str.equals(((JSONObject) next).getString("code"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject c(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ff470fc", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if (str.equals(jSONObject.getString("code"))) {
                        return jSONObject;
                    }
                }
            }
        }
        return null;
    }

    public static JSONObject d(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be7b823d", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && !TextUtils.isEmpty(str)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if (str.equals(jSONObject.getString("code"))) {
                        return jSONObject;
                    }
                }
            }
        }
        return null;
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        arc.a().b(str, arc.a.a().b("AURAConfigCombineUtil").a("AURA/core").b());
        if (z) {
            throw new IllegalStateException(str);
        }
    }
}
