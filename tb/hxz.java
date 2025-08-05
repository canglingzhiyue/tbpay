package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendDataResponse;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendItem;
import com.taobao.android.order.bundle.search.ui.pojo.RecommendShop;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class hxz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1320308797);
    }

    public static List<hxl> a(List<hxl> list, RecommendDataResponse recommendDataResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1db0168", new Object[]{list, recommendDataResponse});
        }
        if (recommendDataResponse != null && recommendDataResponse.result != null) {
            List<RecommendItem> list2 = recommendDataResponse.result;
            if (list2.size() > 0) {
                list.add(new hxp());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                arrayList.add(list2.get(i));
                if (arrayList.size() == hxk.f28833a) {
                    hxo hxoVar = new hxo();
                    hxoVar.f28836a = arrayList;
                    list.add(hxoVar);
                    arrayList = new ArrayList();
                } else if (i == list2.size() - 1 && arrayList.size() < hxk.f28833a) {
                    hxo hxoVar2 = new hxo();
                    hxoVar2.f28836a = arrayList;
                    list.add(hxoVar2);
                }
            }
        }
        return list;
    }

    public static List<hxl> b(List<hxl> list, RecommendDataResponse recommendDataResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f47be87", new Object[]{list, recommendDataResponse});
        }
        if (recommendDataResponse != null && recommendDataResponse.result != null) {
            List<RecommendShop> list2 = recommendDataResponse.recommendShop;
            if (list2.size() > 0) {
                list.add(new hxr());
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list2.size(); i++) {
                arrayList.add(list2.get(i));
                if (arrayList.size() == hxk.b) {
                    hxq hxqVar = new hxq();
                    hxqVar.f28838a = arrayList;
                    list.add(hxqVar);
                    arrayList = new ArrayList();
                } else if (i == list2.size() - 1 && arrayList.size() < hxk.b) {
                    hxq hxqVar2 = new hxq();
                    hxqVar2.f28838a = arrayList;
                    list.add(hxqVar2);
                }
            }
        }
        return list;
    }
}
