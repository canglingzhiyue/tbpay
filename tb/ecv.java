package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class ecv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f27203a;

    static {
        kge.a(-373354023);
        emu.a("com.taobao.android.detail.core.detail.utils.SwitcherUtils");
        f27203a = new Handler(Looper.getMainLooper());
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : ehk.a().a(context);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * ehk.a().b().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
