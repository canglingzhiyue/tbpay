package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/alibaba/android/icart/core/dispatcher/CartAddCartDispatcher;", "", "()V", "dispatch", "", "data", "", "icart-core-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class cuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final cuo INSTANCE;

    static {
        kge.a(1098105769);
        INSTANCE = new cuo();
    }

    private cuo() {
    }

    public final void a(Map<Object, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || !(!map.isEmpty()) || !jqi.a("iCart", ieu.sResetPreRequestDataWhenAddCart, false, true)) {
        } else {
            qgs.INSTANCE.a(tfu.ADD_CART);
        }
    }
}
