package tb;

import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes7.dex */
public class khd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile khd f30068a;

    public static khd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khd) ipChange.ipc$dispatch("f06db57", new Object[0]);
        }
        if (f30068a == null) {
            synchronized (khd.class) {
                if (f30068a == null) {
                    f30068a = new khd();
                }
            }
        }
        return f30068a;
    }

    public void a(String str, List<String> list, Object obj, khf khfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd727266", new Object[]{this, str, list, obj, khfVar});
        } else {
            a(str, list, obj, khfVar, null, null);
        }
    }

    public void a(String str, List<String> list, Object obj, khf khfVar, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52bffec", new Object[]{this, str, list, obj, khfVar, khgVar});
        } else {
            a(str, list, obj, khfVar, null, khgVar);
        }
    }

    public void a(String str, List<String> list, Object obj, khf khfVar, Handler handler, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c8101c", new Object[]{this, str, list, obj, khfVar, handler, khgVar});
        } else if (!a(str) && khfVar != null) {
            khfVar.b("orange config disable");
        } else {
            if (khgVar != null) {
                khgVar.a(b(str));
                if (khgVar.b()) {
                    khgVar.b(c(str));
                }
            }
            khe.a(str, list, obj, false, khfVar, handler, khgVar);
        }
    }

    public void b(String str, List<String> list, Object obj, khf khfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b31ea67", new Object[]{this, str, list, obj, khfVar});
        } else if (!a(str) && khfVar != null) {
            khfVar.b("orange config disable");
        } else {
            khe.a(str, list, obj, true, khfVar, null, null);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!khp.a("enable", true)) {
            return false;
        }
        if ("widget".equals(str) && !khp.a("channel_enable_widget", true)) {
            return false;
        }
        return !"shortcuts".equals(str) || khp.a("channel_enable_shortcuts", true);
    }

    private List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        if (!khp.c() || !StringUtils.equals(str, "widget")) {
            return null;
        }
        try {
            return JSONObject.parseArray(khp.a("dynamic_widget_id_list", "[\"131\",\"130\",\"132\",\"92\",\"43\"]"), String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (!khp.a("enable_anim_widget", false) || !StringUtils.equals(str, "widget")) {
            return null;
        }
        try {
            return JSONObject.parseArray(khp.a("dynamic_anim_id_list", ""), String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
