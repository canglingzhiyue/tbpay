package tb;

import com.alibaba.ability.result.ErrorResult;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.q;
import tb.gml;

/* loaded from: classes4.dex */
public interface jzb extends gml {

    /* renamed from: tb.jzb$-CC  reason: invalid class name */
    /* loaded from: classes9.dex */
    public final /* synthetic */ class CC {
        @JvmDefault
        public static void $default$a(jzb jzbVar, ErrorResult result) {
            q.d(result, "result");
            gml.a.a(jzbVar, result);
        }
    }

    @Override // tb.gml
    @JvmDefault
    void a(ErrorResult errorResult);
}
