package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.l;
import java.util.Map;

/* loaded from: classes.dex */
public class ldl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static l f30501a;

    static {
        kge.a(2075041588);
    }

    public static void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ac2e83", new Object[]{lVar});
        } else {
            f30501a = lVar;
        }
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
            return;
        }
        l lVar = f30501a;
        if (lVar == null) {
            ldf.b("BaseUserTrackUtils", "updatePageProperties gUserTrack == null");
            return;
        }
        try {
            lVar.a(obj, map);
        } catch (Throwable th) {
            ldf.a("BaseUserTrackUtils", "updatePageProperties error", th);
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        l lVar = f30501a;
        if (lVar == null) {
            ldf.b("BaseUserTrackUtils", "updateNextPageProperties gUserTrack == null");
            return;
        }
        try {
            lVar.a(map);
        } catch (Throwable th) {
            ldf.a("BaseUserTrackUtils", "updateNextPageProperties error", th);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        l lVar = f30501a;
        if (lVar == null) {
            ldf.b("BaseUserTrackUtils", "updateNextPageUtParam gUserTrack == null");
            return;
        }
        try {
            lVar.a(str);
        } catch (Throwable th) {
            ldf.a("BaseUserTrackUtils", "updateNextPageUtParam error", th);
        }
    }

    public static void a(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc66733", new Object[]{str, map, map2, map3});
            return;
        }
        l lVar = f30501a;
        if (lVar == null) {
            ldf.b("BaseUserTrackUtils", "sceneTrackerBeginScene gUserTrack == null");
            return;
        }
        try {
            lVar.a(str, map, map2, map3);
        } catch (Throwable th) {
            ldf.a("BaseUserTrackUtils", "sceneTrackerBeginScene error", th);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        l lVar = f30501a;
        if (lVar == null) {
            ldf.b("BaseUserTrackUtils", "sceneTrackerBeginScene gUserTrack == null");
            return;
        }
        try {
            lVar.b(str);
        } catch (Throwable th) {
            ldf.a("BaseUserTrackUtils", "sceneTrackerBeginScene error", th);
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c357439", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        l lVar = f30501a;
        if (lVar == null) {
            ldf.b("BaseUserTrackUtils", "updateNextPageUtParam gUserTrack == null");
            return;
        }
        try {
            lVar.a(str, i, str2, str3, str4, str5);
        } catch (Throwable th) {
            ldf.a("BaseUserTrackUtils", "commitEvent error", th);
        }
    }
}
