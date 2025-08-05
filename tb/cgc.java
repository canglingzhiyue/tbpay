package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static cgd f26279a;

    static {
        try {
            f26279a = (cgd) Class.forName("com.alibaba.wireless.aliprivacyext.track.model.TrackLog").newInstance();
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608d2b11", new Object[]{str, str2, new Integer(i), str3});
            return;
        }
        cgd cgdVar = f26279a;
        if (cgdVar == null) {
            return;
        }
        cgdVar.trackSetScenePermissionLog(str, str2, i, str3);
    }

    public static void b(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6690f670", new Object[]{str, str2, new Integer(i), str3});
            return;
        }
        cgd cgdVar = f26279a;
        if (cgdVar == null) {
            return;
        }
        cgdVar.trackRemoteAuthGrantedLog(str, str2, i, str3);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        cgd cgdVar = f26279a;
        if (cgdVar == null) {
            return;
        }
        cgdVar.trackGetScenePermissionLog(str, str2, str3);
    }
}
