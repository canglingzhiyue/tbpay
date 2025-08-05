package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.b;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes5.dex */
public class skn implements skm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33658a;
    private b b = new b("INTELLIGENCE-1009", "获取未曝光列表失败");

    static {
        kge.a(497062396);
        kge.a(717666181);
    }

    public skn(FluidContext fluidContext) {
        this.f33658a = fluidContext;
    }

    @Override // tb.skm
    public List<MediaContentDetailData> getUnVisibleOrExposedItems(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae902e1a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList<a> mediaSetList = ((IDataService) this.f33658a.getService(IDataService.class)).getMediaSetList();
        int size = mediaSetList.size();
        int itemCount = ((IFeedsListService) this.f33658a.getService(IFeedsListService.class)).getMediaCardListAdapter().getItemCount();
        for (int i = 0; i < itemCount && i < size; i++) {
            a.c a2 = mediaSetList.get(i).a();
            MediaContentDetailData i2 = a2.i();
            if (!z || "VIDEO".equalsIgnoreCase(i2.type)) {
                if (!z2 && !i2.hasExposed) {
                    sb.append(i2.id);
                    sb.append(",");
                    arrayList.add(i2);
                } else if (z2 && i2.hasExposed && !a2.u()) {
                    sb.append(i2.id);
                    sb.append(",");
                    arrayList.add(i2);
                }
                sb2.append(i2.id);
                sb2.append(",");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("PickPreloadController，");
        sb3.append(z2 ? "" : "未");
        sb3.append("曝光，listsize=");
        sb3.append(arrayList.size());
        sb3.append(" ; [");
        sb3.append((Object) sb);
        sb3.append("]，Lits所有Id，listsize=");
        sb3.append(itemCount);
        sb3.append(" ; [");
        sb3.append((Object) sb2);
        sb3.append(riy.ARRAY_END_STR);
        spz.c("UnexposedDataManager", sb3.toString());
        return arrayList;
    }

    @Override // tb.skm
    public List<a.c> getUnExposedItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7da581d1", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        try {
            spz.c("UnexposedDataManager", "getUnExposedItems: getMediaCardListAdapterSize:" + ((IFeedsListService) this.f33658a.getService(IFeedsListService.class)).getMediaCardListAdapter().getItemCount() + ";getMediaSetListSize:" + ((IDataService) this.f33658a.getService(IDataService.class)).getMediaSetList().size());
            for (int size = ((IDataService) this.f33658a.getService(IDataService.class)).getMediaSetList().size() - 1; size >= 0; size--) {
                if (((IDataService) this.f33658a.getService(IDataService.class)).getMediaSetList().get(size) != null) {
                    a.c a2 = ((IDataService) this.f33658a.getService(IDataService.class)).getMediaSetList().get(size).a();
                    MediaContentDetailData i = a2.i();
                    if (i.isLocalPreCacheVideo || i.hasExposed) {
                        break;
                    }
                    linkedList.add(a2);
                }
            }
            Collections.reverse(linkedList);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < linkedList.size(); i2++) {
                sb.append(((a.c) linkedList.get(i2)).g());
                sb.append(',');
            }
            spz.c("UnexposedDataManager", "获取未曝光列表，获取的列表为：" + ((Object) sb));
            return linkedList;
        } catch (Throwable th) {
            spz.c("UnexposedDataManager", "getUnExposedItemsError");
            FluidException.throwException(this.f33658a, this.b, th);
            linkedList.clear();
            return linkedList;
        }
    }

    @Override // tb.skm
    public List getUnExposeItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c74ff73", new Object[]{this});
        }
        List<MediaContentDetailData> unVisibleOrExposedItems = ((IDataService) this.f33658a.getService(IDataService.class)).getUnVisibleOrExposedItems(false, false);
        ArrayList arrayList = new ArrayList();
        for (MediaContentDetailData mediaContentDetailData : unVisibleOrExposedItems) {
            HashMap hashMap = new HashMap();
            hashMap.put("sectionBizCode", mediaContentDetailData.id);
            hashMap.put("utLogMapEdge", mediaContentDetailData.utLogMapEdge);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @Override // tb.skm
    public String getUnExposeIds() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ff2b94", new Object[]{this});
        }
        List<MediaContentDetailData> unVisibleOrExposedItems = ((IDataService) this.f33658a.getService(IDataService.class)).getUnVisibleOrExposedItems(false, false);
        if (unVisibleOrExposedItems == null || unVisibleOrExposedItems.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (MediaContentDetailData mediaContentDetailData : unVisibleOrExposedItems) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            sb.append(mediaContentDetailData.id);
        }
        return sb.toString();
    }
}
