package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.preload.d;

/* loaded from: classes4.dex */
public class eit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final d f27333a;

    static {
        kge.a(679889879);
        f27333a = new d();
        emu.a("com.taobao.android.detail.core.performance.parse.ParseStageExecutorService");
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            f27333a.a(1, 60, "parseStageOpt").execute(runnable);
        }
    }
}
