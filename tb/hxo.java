package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendItem;
import java.util.List;

/* loaded from: classes6.dex */
public class hxo implements hxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<RecommendItem> f28836a;

    static {
        kge.a(1224756836);
        kge.a(709302014);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RecommendGoodsComponent [result=" + this.f28836a + riy.ARRAY_END_STR;
    }
}
