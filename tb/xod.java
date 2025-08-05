package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ba;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxUserContext;", "Lcom/taobao/android/dinamicx/DXUserContext;", "itemData", "Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "global", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;Lcom/alibaba/fastjson/JSONObject;)V", "globalInfo", "getGlobalInfo", "()Lcom/alibaba/fastjson/JSONObject;", "mtbComponentModel", "getMtbComponentModel", "()Lcom/taobao/mytaobao/pagev2/dataservice/model/MtbComponentModel;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xod extends ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final xol f34422a;
    private final JSONObject b;

    static {
        kge.a(873750806);
    }

    public xod(xol itemData, JSONObject jSONObject) {
        q.c(itemData, "itemData");
        this.f34422a = itemData;
        this.b = jSONObject;
    }

    public final xol a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xol) ipChange.ipc$dispatch("f0cdf69", new Object[]{this}) : this.f34422a;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.b;
    }
}
