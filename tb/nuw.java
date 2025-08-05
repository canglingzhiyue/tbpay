package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.m;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;

/* loaded from: classes7.dex */
public class nuw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static m f31779a;

    static {
        kge.a(-1694210196);
    }

    public static void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aca2e2", new Object[]{mVar});
        } else {
            f31779a = mVar;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        m mVar = f31779a;
        if (mVar == null) {
            ldf.b("InfoFlowLauncherTracker", "traceStart sInfoFlowLauncherTracker == null");
            return;
        }
        try {
            mVar.a(str, str2);
        } catch (InfoFlowRuntimeException e) {
            ldf.a("InfoFlowLauncherTracker", "traceStart error", e);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        m mVar = f31779a;
        if (mVar == null) {
            ldf.b("InfoFlowLauncherTracker", "traceEnd sInfoFlowLauncherTracker == null");
            return;
        }
        try {
            mVar.b(str, str2);
        } catch (InfoFlowRuntimeException e) {
            ldf.a("InfoFlowLauncherTracker", "traceStart error", e);
        }
    }
}
