package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"tryWith", "T", "exceptionValue", "handler", "Lkotlin/Function1;", "", "", a.ATOM_EXT_block, "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lightvane_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class gwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(480227643);
    }

    public static /* synthetic */ Object a(Object obj, rul rulVar, ruk rukVar, int i, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57800e6", new Object[]{obj, rulVar, rukVar, new Integer(i), obj2});
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            rulVar = null;
        }
        return a(obj, rulVar, rukVar);
    }

    public static final <T> T a(T t, rul<? super Throwable, t> rulVar, ruk<? extends T> block) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("127a7e1f", new Object[]{t, rulVar, block});
        }
        q.d(block, "block");
        try {
            return block.mo2427invoke();
        } catch (Throwable th) {
            if (rulVar != null) {
                rulVar.mo2421invoke(th);
                return t;
            }
            gwo.a(6, "Extension.ERROR", "tryWith exception" + Log.getStackTraceString(th));
            return t;
        }
    }
}
