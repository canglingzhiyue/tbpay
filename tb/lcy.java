package tb;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.b;
import java.util.Map;

/* loaded from: classes.dex */
public class lcy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f30487a;

    static {
        kge.a(-37355270);
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a7a2cd", new Object[]{bVar});
        } else {
            f30487a = bVar;
        }
    }

    public static void a(Application application, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2e3cd0", new Object[]{application, str, str2, str3, map});
            return;
        }
        b bVar = f30487a;
        if (bVar == null) {
            ldf.d("InfoFlowAliMaMa", "commit  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            bVar.a(application, str, str2, str3, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowAliMaMa", "commit error", th);
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        b bVar = f30487a;
        if (bVar == null) {
            ldf.d("InfoFlowAliMaMa", "commitAdvExposeEvent  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            bVar.a(jSONObject);
        } catch (Throwable th) {
            ldf.a("InfoFlowAliMaMa", "commitAdvExposeEvent error", th);
        }
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        b bVar = f30487a;
        if (bVar == null) {
            ldf.d("InfoFlowAliMaMa", "commitAdvClickEvent  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            bVar.b(jSONObject);
        } catch (Throwable th) {
            ldf.a("InfoFlowAliMaMa", "commitAdvClickEvent error", th);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        b bVar = f30487a;
        if (bVar == null) {
            ldf.d("InfoFlowAliMaMa", "commitIfsArrayExposure  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            bVar.a(str, str2, str3, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowAliMaMa", "commitIfsArrayExposure error", th);
        }
    }

    public static void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10af9e", new Object[]{str, str2, str3, map});
            return;
        }
        b bVar = f30487a;
        if (bVar == null) {
            ldf.d("InfoFlowAliMaMa", "commitIfsArrayClick  gInfoFlowAliMaMa == null");
            return;
        }
        try {
            bVar.b(str, str2, str3, map);
        } catch (Throwable th) {
            ldf.a("InfoFlowAliMaMa", "commitIfsArrayClick error", th);
        }
    }
}
