package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.dxng.kmp_api_exporter.c;
import com.taobao.dxng.kmp_api_exporter.d;
import com.taobao.dxng.kmp_api_exporter.e;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/utils/abtest/TaoLiveABTest;", "", "<init>", "()V", "TBLIVE_AB_GROUP", "", "getVariation", "component", "module", "variable", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class tra {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final tra INSTANCE;
    public static final String TBLIVE_AB_GROUP = "taolive";

    static {
        kge.a(2108664831);
        INSTANCE = new tra();
    }

    private tra() {
    }

    public final String a(String component, String module, String variable, String defaultValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{this, component, module, variable, defaultValue});
        }
        q.d(component, "component");
        q.d(module, "module");
        q.d(variable, "variable");
        q.d(defaultValue, "defaultValue");
        c.a aVar = c.Companion;
        d dVar = new d();
        dVar.a(component);
        dVar.b(module);
        dVar.c(variable);
        String a2 = e.a(aVar, dVar);
        if (a2.length() != 0) {
            z = false;
        }
        if (z) {
            a2 = defaultValue;
        }
        return a2;
    }
}
