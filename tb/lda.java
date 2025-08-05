package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.e;
import com.taobao.infoflow.core.engine.env.protocol.d;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class lda {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f30489a;

    static {
        kge.a(-906439710);
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a88b8b", new Object[]{dVar});
        } else {
            f30489a = dVar;
        }
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{str, str2, str3, jSONObject});
            return;
        }
        d dVar = f30489a;
        if (dVar == null) {
            ldf.b("InfoFlowBx", "commitTap gInfoFlowBx == null");
            return;
        }
        try {
            dVar.a(str, str2, str3, jSONObject);
        } catch (Throwable th) {
            ldf.a("InfoFlowBx", "commitTap error", th);
        }
    }

    public static void a(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d594bda4", new Object[]{str, str2, str3, view, jSONObject});
            return;
        }
        d dVar = f30489a;
        if (dVar == null) {
            ldf.b("InfoFlowBx", "commitAppear gInfoFlowBx == null");
            return;
        }
        try {
            dVar.a(str, str2, str3, view, jSONObject);
        } catch (Throwable th) {
            ldf.a("InfoFlowBx", "commitAppear error", th);
        }
    }

    public static void b(String str, String str2, String str3, View view, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a47c5be5", new Object[]{str, str2, str3, view, jSONObject});
            return;
        }
        d dVar = f30489a;
        if (dVar == null) {
            ldf.b("InfoFlowBx", "commitDisAppear gInfoFlowBx == null");
            return;
        }
        try {
            dVar.b(str, str2, str3, view, jSONObject);
        } catch (Throwable th) {
            ldf.a("InfoFlowBx", "commitDisAppear error", th);
        }
    }

    public static void a(String str, String str2, float f, float f2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b0c878", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
            return;
        }
        d dVar = f30489a;
        if (dVar == null) {
            ldf.b("InfoFlowBx", "commitScrollStart gInfoFlowBx == null");
            return;
        }
        try {
            dVar.a(str, str2, f, f2, list, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowBx", "commitScrollStart error", th);
        }
    }

    public static void b(String str, String str2, float f, float f2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21c197", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
            return;
        }
        d dVar = f30489a;
        if (dVar == null) {
            ldf.b("InfoFlowBx", "commitScrolling gInfoFlowBx == null");
            return;
        }
        try {
            dVar.b(str, str2, f, f2, list, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowBx", "commitScrolling error", th);
        }
    }

    public static void c(String str, String str2, float f, float f2, List<e> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2892bab6", new Object[]{str, str2, new Float(f), new Float(f2), list, map});
            return;
        }
        d dVar = f30489a;
        if (dVar == null) {
            ldf.b("InfoFlowBx", "commitScrollEnd gInfoFlowBx == null");
            return;
        }
        try {
            dVar.c(str, str2, f, f2, list, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowBx", "commitScrollEnd error", th);
        }
    }
}
