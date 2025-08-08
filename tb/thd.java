package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes7.dex */
public class thd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1951850646);
    }

    public static boolean a(IMainFeedsViewService<?> iMainFeedsViewService) {
        BaseSectionModel<?> findItemDataByPosition;
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f5d7194", new Object[]{iMainFeedsViewService})).booleanValue();
        }
        if (iMainFeedsViewService != null && (findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(0)) != null && (args = findItemDataByPosition.getArgs()) != null) {
            return StringUtils.equals("1", args.getString(tim.S_ARGS_IS_CLIENT_CACHE));
        }
        return false;
    }
}
