package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes6.dex */
public class hvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * Globals.getApplication().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
