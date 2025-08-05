package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nrm extends nrl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_NAME = "InShopSearch";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private nsi f31697a;

    static {
        kge.a(1041759243);
        Companion = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrm(Activity activity, ium parent, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar, nsi nsiVar) {
        super(activity, parent, searchDoorContext, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        this.f31697a = nsiVar;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-793733741);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // tb.nrl
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String b = nse.b(this.f31697a);
        q.a((Object) b, "ShopSearchUtils.getShopId(searchParamsProvider)");
        hashMap.put("shop_id", b);
        String a2 = nse.a(this.f31697a);
        q.a((Object) a2, "ShopSearchUtils.getSellerId(searchParamsProvider)");
        hashMap.put("seller_id", a2);
        hashMap.put("area", "shop_wireless");
        hashMap.put("channelSrp", CHANNEL_NAME);
        return hashMap;
    }
}
