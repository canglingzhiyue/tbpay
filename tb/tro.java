package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/themis/utils/version/TMSVersionUtils;", "", "()V", "compare", "", "version1", "", "version2", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class tro {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tro INSTANCE;

    static {
        kge.a(1170959080);
        INSTANCE = new tro();
    }

    private tro() {
    }

    @JvmStatic
    public static final int a(String version1, String version2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{version1, version2})).intValue();
        }
        q.d(version1, "version1");
        q.d(version2, "version2");
        return trp.Companion.a(version1).a(trp.Companion.a(version2));
    }
}
