package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import tb.slk;

/* loaded from: classes5.dex */
public class obp implements obr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COLLECTION_ORDER = -1;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f31896a;
    private final HashMap<Integer, a> b = new HashMap<>();
    private final HashMap<String, Integer> c = new HashMap<>();

    static {
        kge.a(-1866093713);
        kge.a(-1795130258);
    }

    public obp(FluidContext fluidContext) {
        this.f31896a = fluidContext;
    }

    @Override // tb.obr
    public void requestCollectionList(boolean z, Map map, int i, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90930d98", new Object[]{this, new Boolean(z), map, new Integer(i), aVar});
        } else if (obo.a(this.f31896a, map, aVar)) {
        } else {
            IDataService iDataService = (IDataService) this.f31896a.getService(IDataService.class);
            if (iDataService == null) {
                spz.c(obr.TAG, "deviceService为null，返回");
            } else if (((ICollectionService) this.f31896a.getService(ICollectionService.class)).isCollectionPagingEnable() && i > 0) {
                spz.c(obr.TAG, "H5分页合集请求的剧集" + i + "istop:" + z);
                iDataService.requestListForCollection(z, map, i, aVar);
            } else {
                iDataService.requestList(z, map, aVar);
            }
        }
    }

    @Override // tb.obr
    public void collectionPagingInsertData(int i, slk.a aVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af97113", new Object[]{this, new Integer(i), aVar, new Integer(i2)});
        } else if (aVar == null || aVar.f33700a == null || aVar.f33700a.size() == 0) {
        } else {
            ArrayList<a> mediaSetList = ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList();
            int a2 = obo.a(mediaSetList, 0);
            int a3 = obo.a(mediaSetList, mediaSetList.size() - 1);
            spz.c(obr.TAG, "分页合集插入逻辑，startdindex" + a2 + "endIndex" + a3 + "seq:" + i2 + "collectionOrder" + i + "插入内容大小" + aVar.f33700a.size());
            ((ICollectionService) this.f31896a.getService(ICollectionService.class)).checkToInsertDetailList(i2, a2, a3, aVar);
            LinkedList<a> convertToMediaSetDataList = ((IDataService) this.f31896a.getService(IDataService.class)).convertToMediaSetDataList(aVar.f33700a, aVar.c);
            obo.a(this.b, convertToMediaSetDataList);
            obo.b(this.c, convertToMediaSetDataList);
        }
    }

    @Override // tb.obr
    public boolean LoadFromCollectionPagingCache(int i, com.taobao.android.fluid.core.a<slk.a> aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ae79c54", new Object[]{this, new Integer(i), aVar, new Boolean(z)})).booleanValue();
        }
        if (this.b.get(Integer.valueOf(i)) != null) {
            int a2 = obo.a(((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList(), 0);
            int a3 = obo.a(((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList(), ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().size() - 1);
            ArrayList<a> a4 = obo.a(this.b, z ? i : i - 1, z);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = a4.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    arrayList.add(next.a().i());
                    jSONArray.add(next.a().d);
                }
            }
            slk.a aVar2 = new slk.a(null, arrayList, jSONArray, null, null);
            if (aVar2.f33700a.size() > 0) {
                ((ICollectionService) this.f31896a.getService(ICollectionService.class)).checkToInsertDetailList(i, a2, a3, aVar2);
                smi.a(this.f31896a, aVar2, z);
                if (aVar != null) {
                    aVar.a(aVar2);
                }
                spz.c(obr.TAG, "从缓存中加载的数据， 目标：" + i + " 请求结果" + aVar2.f33700a.size() + "原有startindex" + a2 + "原有endindex" + a3 + z);
                return true;
            }
        }
        return false;
    }

    @Override // tb.obr
    public ArrayList<a> syncloadFromCollectionPagingCache(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("53d31489", new Object[]{this, new Integer(i)});
        }
        if (this.b.get(Integer.valueOf(i)) != null) {
            ArrayList<a> arrayList = new ArrayList<>();
            ArrayList<a> a2 = obo.a(this.b, i, true);
            ArrayList<a> a3 = obo.a(this.b, i, false);
            arrayList.addAll(a2);
            arrayList.addAll(arrayList.size(), a3);
            spz.c("PopupDialog", "从缓存中加载的数据， 目标：" + i + " 请求结果" + arrayList.size());
            return arrayList;
        }
        return new ArrayList<>();
    }

    @Override // tb.obr
    public void checkToInsertDetailList(int i, int i2, int i3, slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768685d2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), aVar});
            return;
        }
        int i4 = i2 - 1;
        if (i == i4) {
            ((IDataService) this.f31896a.getService(IDataService.class)).appendDetailListAtFirst(aVar);
            spz.c(obr.TAG, "加入setlist, target.size" + aVar.f33700a.size() + "终止ID：" + aVar.f33700a.get(aVar.f33700a.size() - 1).sequenceNumber);
            return;
        }
        int i5 = i3 + 1;
        if (i == i5) {
            ((IDataService) this.f31896a.getService(IDataService.class)).appendDetailListAtLast(aVar);
            spz.c(obr.TAG, "加入setlist, target.size" + aVar.f33700a.size() + "起始ID：" + aVar.f33700a.get(0).sequenceNumber);
        } else if (i > i5 || i < i4) {
            spz.c(obr.TAG, "隔断内容不需插入现有mMediaSetList" + ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().size());
        } else {
            spz.c(obr.TAG, "请求的内容和原有内容重合");
        }
    }

    @Override // tb.obr
    public void scrollToIndexForPaging(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3814e7", new Object[]{this, str, new Integer(i)});
        } else if (i != -1 || !((ICollectionService) this.f31896a.getService(ICollectionService.class)).isCollectionPagingEnable() || !this.c.containsKey(str)) {
        } else {
            ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().clear();
            ((IDataService) this.f31896a.getService(IDataService.class)).getUnRemoveMediaSetList().clear();
            int intValue = this.c.get(str).intValue();
            ArrayList<a> a2 = obo.a(this.b, intValue, true);
            ArrayList<a> a3 = obo.a(this.b, intValue, false);
            ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().addAll(a2);
            ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().addAll(((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().size(), a3);
            ((IDataService) this.f31896a.getService(IDataService.class)).getUnRemoveMediaSetList().addAll(a2);
            ((IDataService) this.f31896a.getService(IDataService.class)).getUnRemoveMediaSetList().addAll(((IDataService) this.f31896a.getService(IDataService.class)).getUnRemoveMediaSetList().size(), a3);
            spz.c(obr.TAG, "分页合集跳转到了隔断数据 start:" + obo.a(((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList(), 0) + "endIndex:" + obo.a(((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList(), ((IDataService) this.f31896a.getService(IDataService.class)).getMediaSetList().size() - 1));
            ((IFeedsListService) this.f31896a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
            smi.b(this.f31896a);
            ((IFeedsListService) this.f31896a.getService(IFeedsListService.class)).scrollToItem(str);
            ((IDataService) this.f31896a.getService(IDataService.class)).postLoadUpRunnable();
        }
    }

    @Override // tb.obr
    public HashMap<Integer, a> getCollectionMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("898f0652", new Object[]{this}) : this.b;
    }

    @Override // tb.obr
    public HashMap<String, Integer> getContentIdMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("786f5b68", new Object[]{this}) : this.c;
    }
}
