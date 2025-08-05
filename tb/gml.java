package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public interface gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(257811355);
        }

        public static void a(gml gmlVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7017fc8", new Object[]{gmlVar, result});
            } else {
                q.d(result, "result");
            }
        }
    }

    void a(ErrorResult errorResult);
}
