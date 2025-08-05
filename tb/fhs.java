package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* loaded from: classes3.dex */
public final class fhs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final fhs INSTANCE;
    public static final String KEY_IRP_CODE_HEAD_CLICK = "IrpCodeHeadClick";
    public static final String KEY_IRP_TITLE_BAR_GUIDE = "IrpTitleBarGuide";

    @JvmStatic
    public static final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[0])).floatValue();
        }
        return 1.0f;
    }

    @JvmStatic
    public static final float e(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aef535d8", new Object[]{new Boolean(z)})).floatValue() : z ? 3.0f : 3.5f;
    }

    @JvmStatic
    public static final float f(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0aa0e77", new Object[]{new Boolean(z)})).floatValue() : z ? 67.0f : 81.0f;
    }

    @JvmStatic
    public static final float g(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b25ee716", new Object[]{new Boolean(z)})).floatValue() : z ? 42.0f : 57.0f;
    }

    @JvmStatic
    public static final float h(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b413bfb5", new Object[]{new Boolean(z)})).floatValue() : z ? 46.0f : 60.0f;
    }

    @JvmStatic
    public static final float i(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5c89854", new Object[]{new Boolean(z)})).floatValue() : z ? 36.5f : 50.5f;
    }

    static {
        kge.a(-163433399);
        INSTANCE = new fhs();
    }

    private fhs() {
    }
}
