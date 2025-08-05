package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* loaded from: classes7.dex */
public class bxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(186832469);
    }

    public static boolean a(ljs ljsVar, IMainFeedsViewService<?> iMainFeedsViewService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87573d52", new Object[]{ljsVar, iMainFeedsViewService, new Integer(i)})).booleanValue();
        }
        View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i);
        if (findItemViewByPosition == null) {
            ldf.d("CardFinder", "view is null");
            return false;
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null) {
            ldf.d("CardFinder", "hostService is null");
            return false;
        }
        lkb c = iHostService.getInvokeCallback().c();
        if (c == null) {
            ldf.d("CardFinder", "naviBarCallback is null");
            return false;
        }
        float a2 = c.a();
        if (a2 >= 0.0f) {
            int[] iArr = new int[2];
            findItemViewByPosition.getLocationInWindow(iArr);
            return ((float) iArr[1]) > a2;
        }
        ldf.d("CardFinder", "searchBarHeight < 0 , searchBarHeight : " + a2);
        return false;
    }

    public static int a(List<SectionModel> list) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{list})).intValue();
        }
        if (list == null) {
            ldf.d("CardFinder", "findSliderDataPosition->  originalDataSet == null");
            return -1;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SectionModel sectionModel = list.get(i);
            if (sectionModel != null && (jSONObject = sectionModel.getJSONObject("ext")) != null && jSONObject.getBooleanValue("isBannerCard")) {
                return i;
            }
        }
        return -1;
    }
}
