package tb;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.realtimerecommend.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class lsv implements IContainerDataService.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<String> c;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30903a;
    private final lsu b;

    static {
        kge.a(-876195533);
        kge.a(-153391203);
        c = Arrays.asList(Constant.KEY_PAGEBACK, "pullRefresh", "aiRefresh");
    }

    public lsv(ljs ljsVar, lsu lsuVar) {
        this.f30903a = ljsVar;
        this.b = lsuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
    public Map<String, String> a(lli lliVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
        }
        HashMap hashMap = new HashMap(8);
        if (a(str)) {
            a(hashMap);
        }
        return hashMap;
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            map.put("unexposedItemIds", a(a(), b()));
        }
    }

    private List<BaseSectionModel<?>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30903a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("CardBackParamsCreator", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("CardBackParamsCreator", "containerData == null");
            return null;
        }
        return containerData.getTotalData();
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f30903a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            ldf.d("CardBackParamsCreator", "isRecommendFirstCardOnScreen mainFeedsViewService is null");
            return -1;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            ldf.d("CardBackParamsCreator", "isRecommendFirstCardOnScreen visiblePositionRange error");
            return -1;
        }
        return visiblePositionRange[1] + 1 + this.b.b();
    }

    private String a(List<BaseSectionModel<?>> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d92c6d16", new Object[]{this, list, new Integer(i)});
        }
        if (i < 0 || list == null || list.size() < i) {
            ldf.d("CardBackParamsCreator", "startPosition not in sectionData,data may changed");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (i < list.size()) {
            BaseSectionModel<?> baseSectionModel = list.get(i);
            if (baseSectionModel != null && !baseSectionModel.getBooleanValue(j.IS_USER_ACTION_TRACKED)) {
                String a2 = a(baseSectionModel);
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    sb.append(",");
                }
            }
            i++;
        }
        String sb2 = sb.toString();
        return sb2.length() > 0 ? sb2.substring(0, sb2.length() - 1) : sb2;
    }

    private String a(BaseSectionModel<?> baseSectionModel) {
        BaseItemModel mo1097getItem;
        BaseSubItemModel mo1094getBaseItemModel;
        BaseUtModel mo1100getClickParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bc5cf0", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel != null && (mo1097getItem = baseSectionModel.mo1097getItem()) != null && (mo1094getBaseItemModel = mo1097getItem.mo1094getBaseItemModel(0)) != null && (mo1100getClickParam = mo1094getBaseItemModel.mo1100getClickParam()) != null) {
            return mo1100getClickParam.getItemId();
        }
        return null;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b.a() && c.contains(str);
    }
}
