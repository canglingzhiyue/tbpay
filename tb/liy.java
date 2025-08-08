package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes7.dex */
public class liy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(539018994);
    }

    public static int a(ljs ljsVar) {
        IFirstScreenDataService iFirstScreenDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2eb53f6", new Object[]{ljsVar})).intValue();
        }
        String b = b(ljsVar);
        if (StringUtils.isEmpty(b)) {
            return -1;
        }
        int a2 = a(ljsVar, b);
        if (a2 != -1 || (iFirstScreenDataService = (IFirstScreenDataService) ljsVar.a(IFirstScreenDataService.class)) == null) {
            return a2;
        }
        ldf.d("RecommendFirstCardFinder", "未找到首卡，使用首屏服务记录的首卡位置");
        return iFirstScreenDataService.getRecStartIndex();
    }

    public static String b(ljs ljsVar) {
        JSONObject firstScreenExt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5643729c", new Object[]{ljsVar});
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) ljsVar.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService != null && (firstScreenExt = iFirstScreenDataService.getFirstScreenExt()) != null) {
            return firstScreenExt.getString("feedsStartSectionBizCode");
        }
        return null;
    }

    private static int a(ljs ljsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("202a300", new Object[]{ljsVar, str})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getPositionBySectionBizCode(str);
        }
        return -1;
    }
}
