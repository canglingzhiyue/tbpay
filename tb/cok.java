package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cok {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCENE = "Ccrc_FaceDetector";

    /* renamed from: a  reason: collision with root package name */
    private static a f26355a;

    /* loaded from: classes3.dex */
    public interface a {
        coo a();
    }

    static {
        kge.a(-1646444462);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("382926dc", new Object[]{aVar});
        } else {
            f26355a = aVar;
        }
    }

    public static coo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (coo) ipChange.ipc$dispatch("f0353fb", new Object[0]);
        }
        a aVar = f26355a;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }
}
