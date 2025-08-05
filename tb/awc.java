package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.AutoUt;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class awc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f25650a;
        public AURARenderComponent b;
        public String c;
        public String d;

        static {
            kge.a(1320069757);
        }

        public a(s sVar, AURARenderComponent aURARenderComponent, String str, String str2) {
            this.f25650a = sVar;
            this.b = aURARenderComponent;
            this.c = str;
            this.d = str2;
        }
    }

    static {
        kge.a(-267131950);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1e22e", new Object[]{aVar});
        } else {
            a(aVar.b, aVar.f25650a, 2201, aVar.c, aVar.d);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcd4c6f", new Object[]{aVar});
        } else {
            a(aVar.b, aVar.f25650a, 2101, aVar.c, aVar.d);
        }
    }

    private static boolean a(AURARenderComponent aURARenderComponent) {
        RenderComponent data;
        AutoUt autoUt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{aURARenderComponent})).booleanValue();
        }
        TreeNode<RenderComponent> treeNode = aURARenderComponent.mirror;
        return (treeNode == null || (data = treeNode.data()) == null || (autoUt = data.getAutoUt()) == null || !autoUt.isAutoUt()) ? false : true;
    }

    private static void a(JSONObject jSONObject, String str, s sVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe9da62", new Object[]{jSONObject, str, sVar, aURARenderComponent});
            return;
        }
        d dVar = new d();
        dVar.a(jSONObject);
        dVar.b(str);
        dVar.a(aURARenderComponent);
        dVar.d(aURARenderComponent.key);
        c.a(sVar, "userTrack", dVar);
    }

    private static void a(AURARenderComponent aURARenderComponent, s sVar, int i, String str, String str2) {
        TreeNode<RenderComponent> treeNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d086a1d", new Object[]{aURARenderComponent, sVar, new Integer(i), str, str2});
            return;
        }
        try {
            if (!a(aURARenderComponent) || (treeNode = aURARenderComponent.mirror) == null) {
                return;
            }
            AutoUt autoUt = treeNode.data().getAutoUt();
            JSONObject jSONObject = new JSONObject();
            String arg1 = autoUt.getArg1();
            if (TextUtils.isEmpty(arg1)) {
                arg1 = a(aURARenderComponent, i, autoUt.getPageName(), str, str2);
            }
            jSONObject.put("arg1", (Object) arg1);
            jSONObject.put("arg2", (Object) autoUt.getArg2());
            jSONObject.put("arg3", (Object) autoUt.getArg3());
            jSONObject.put("page", (Object) autoUt.getPageName());
            jSONObject.put("eventId", (Object) Integer.valueOf(i));
            jSONObject.put("args", (Object) autoUt.getArgs());
            a(jSONObject, treeNode);
            a(jSONObject, str2, sVar, aURARenderComponent);
        } catch (Throwable th) {
            hyw.a("AUTO_TRACK_EXCEPTION", th.getMessage());
        }
    }

    private static String a(AURARenderComponent aURARenderComponent, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52c53ef2", new Object[]{aURARenderComponent, new Integer(i), str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(aURARenderComponent.key);
        if (i == 2101) {
            sb.append("-");
            sb.append(str3);
        } else if (i == 2201) {
            if (TextUtils.isEmpty(str2)) {
                sb.append("-Exposure");
            } else {
                sb.append("-");
                sb.append(str2);
                sb.append("Exposure");
            }
        }
        return sb.toString();
    }

    public static void a(JSONObject jSONObject, TreeNode<RenderComponent> treeNode) {
        RenderComponent data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609771e5", new Object[]{jSONObject, treeNode});
        } else if (treeNode != null && (data = treeNode.data()) != null) {
            AutoUt autoUt = data.getAutoUt();
            if (autoUt != null) {
                if (TextUtils.isEmpty(jSONObject.getString("arg2"))) {
                    jSONObject.put("arg2", (Object) autoUt.getArg2());
                }
                if (TextUtils.isEmpty(jSONObject.getString("arg3"))) {
                    jSONObject.put("arg3", (Object) autoUt.getArg3());
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 != null && autoUt.getArgs() != null) {
                    for (Map.Entry<String, Object> entry : autoUt.getArgs().entrySet()) {
                        String key = entry.getKey();
                        if (key instanceof String) {
                            String str = key;
                            if (TextUtils.isEmpty(jSONObject2.getString(str))) {
                                jSONObject2.put(str, entry.getValue());
                            }
                        }
                    }
                }
            }
            a(jSONObject, treeNode.parent());
        }
    }
}
