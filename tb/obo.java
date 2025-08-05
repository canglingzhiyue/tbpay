package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.RectData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.slk;

/* loaded from: classes5.dex */
public final class obo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUSINESS_EXTRA_MAP = "businessExtraMap";
    public static final String RANGE_LIST = "rangeList";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31895a;

    static {
        kge.a(2017063852);
        f31895a = false;
    }

    public static boolean a(FluidContext fluidContext) {
        boolean z;
        Map<String, Object> map;
        List list;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        boolean a2 = a();
        boolean z3 = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().an;
        Map<String, Map<String, Object>> map2 = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().ao;
        if (map2 != null && (map = map2.get("header")) != null) {
            Object obj = map.get(BUSINESS_EXTRA_MAP);
            if ((obj instanceof Map) && (list = (List) ((Map) obj).get(RANGE_LIST)) != null && list.size() > 1) {
                z = true;
                spz.c("CollectionPagingHelper", "分页合集： enableCollectionPaging： " + a2 + " collectionPage：" + z3 + "pagingSizeEnough" + z);
                if (a2 && z3 && z) {
                    z2 = true;
                }
                ((ICollectionService) fluidContext.getService(ICollectionService.class)).setCollectionPagingEnable(z2);
                f31895a = z2;
                return z2;
            }
        }
        z = false;
        spz.c("CollectionPagingHelper", "分页合集： enableCollectionPaging： " + a2 + " collectionPage：" + z3 + "pagingSizeEnough" + z);
        if (a2) {
            z2 = true;
        }
        ((ICollectionService) fluidContext.getService(ICollectionService.class)).setCollectionPagingEnable(z2);
        f31895a = z2;
        return z2;
    }

    public static ArrayList<a> a(HashMap<Integer, a> hashMap, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("39ef2396", new Object[]{hashMap, new Integer(i), new Boolean(z)});
        }
        ArrayList<a> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add(hashMap.get(Integer.valueOf(i)));
        }
        if (z) {
            for (Integer valueOf = Integer.valueOf(i - 1); hashMap.containsKey(valueOf) && valueOf.intValue() > 0; valueOf = Integer.valueOf(valueOf.intValue() - 1)) {
                arrayList.add(0, hashMap.get(valueOf));
            }
        } else {
            for (Integer valueOf2 = Integer.valueOf(i + 1); hashMap.containsKey(valueOf2); valueOf2 = Integer.valueOf(valueOf2.intValue() + 1)) {
                arrayList.add(hashMap.get(valueOf2));
            }
        }
        spz.c("CollectionPagingHelper", "getContinuousList 返回的大小" + arrayList.size());
        return arrayList;
    }

    public static void a(HashMap<Integer, a> hashMap, LinkedList<a> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9dc163", new Object[]{hashMap, linkedList});
            return;
        }
        Iterator<a> it = linkedList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!hashMap.containsKey(Integer.valueOf(a(next)))) {
                hashMap.put(Integer.valueOf(a(next)), next);
            }
        }
    }

    public static void b(HashMap<String, Integer> hashMap, LinkedList<a> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9154f02", new Object[]{hashMap, linkedList});
            return;
        }
        Iterator<a> it = linkedList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!hashMap.containsKey(Integer.valueOf(a(next)))) {
                hashMap.put(next.a().g(), Integer.valueOf(a(next)));
            }
        }
    }

    public static int a(ArrayList<a> arrayList, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1640bcf4", new Object[]{arrayList, new Integer(i)})).intValue();
        }
        if (arrayList != null && i >= 0 && i < arrayList.size() && arrayList.get(i) != null && arrayList.get(i).f12529a != null && arrayList.get(i).f12529a.getFirst() != null && arrayList.get(i).f12529a.getFirst().i() != null) {
            return arrayList.get(i).f12529a.getFirst().i().sequenceNumber;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mediasetlist取值错误 mediaSetList大小");
        if (arrayList != null) {
            i2 = arrayList.size();
        }
        sb.append(i2);
        sb.append("index");
        sb.append(i);
        spz.c("CollectionPagingHelper", sb.toString());
        return -1;
    }

    public static int a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e800257", new Object[]{aVar})).intValue();
        }
        if (aVar != null && aVar.f12529a.getFirst() != null && aVar.f12529a.getFirst().i() != null) {
            return aVar.f12529a.getFirst().i().sequenceNumber;
        }
        spz.c("CollectionPagingHelper", "mediaSetData取值错误 mediaSetData为" + aVar);
        return -1;
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue();
        }
        if (fluidContext != null && fluidContext.getService(IDataService.class) != null) {
            IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
            a currentMediaSetData = iDataService.getCurrentMediaSetData();
            int lastDataSequenceNumber = iDataService.getLastDataSequenceNumber();
            if (a(currentMediaSetData) == lastDataSequenceNumber && lastDataSequenceNumber > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(List<RectData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{list})).booleanValue();
        }
        if (f31895a) {
            for (RectData rectData : list) {
                float parseFloat = Float.parseFloat(rectData.width);
                float parseFloat2 = Float.parseFloat(rectData.height);
                if (parseFloat == 1.0f && parseFloat2 >= 0.6d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1789430d", new Object[]{aVar})).booleanValue();
        }
        if (aVar != null && aVar.a() != null) {
            return oec.a(aVar.a().get("collectionRelatedFlowRec"), false);
        }
        return false;
    }

    public static boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db6d1987", new Object[]{aVar})).booleanValue() : (aVar == null || aVar.a() == null || aVar.a().i() == null || aVar.a().i().config == null || !aVar.a().i().config.collectionRelatedFlowRec) ? false : true;
    }

    public static boolean a(FluidContext fluidContext, Map map, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76df53b1", new Object[]{fluidContext, map, aVar})).booleanValue();
        }
        if (map == null || !spj.b() || aVar == null || !((ICollectionService) fluidContext.getService(ICollectionService.class)).isNewPageRecommend()) {
            return false;
        }
        aVar.a(null);
        return true;
    }

    public static void a(View view, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1de8a2", new Object[]{view, aVar});
        } else if (!spj.b() || view == null) {
        } else {
            if (b(aVar)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableCollectionPaging", true);
    }
}
