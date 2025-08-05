package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fiq extends fij {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPERATE_ADD_NAVI_ITEM = "addNaviItem";
    public static final String OPERATE_CONTROL_SCROLL = "pageViewControlScroll";
    public static final String OPERATE_DISMISS_CARD = "dismissCard";
    public static final String OPERATE_GET_DETAIL_DATA = "getDetailData";
    public static final String OPERATE_GET_EXPOSURE_STATE = "getExposureStatus";
    public static final String OPERATE_GET_RECOMMENDWEEXPASS = "getRecommendWeexPassParams";
    public static final String OPERATE_MONITOR_LOG = "weexMonitorLog";
    public static final String OPERATE_PAGE_TRACE = "pageTrace";
    public static final String OPERATE_PREVENT_BACK = "preventBack";
    public static final String OPERATE_QUIT_NEW_DETAIL = "quitNewDetail";
    public static final String OPERATE_SHOW_WEEX_POP = "showWeexPop";
    public static final String OPERATE_UPDATE_DATA = "update_detail";

    static {
        kge.a(1584067008);
    }

    public fiq(Object obj, JSONObject jSONObject) {
        super(obj, jSONObject);
    }

    @Override // tb.fij, com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : fil.a(fiq.class, this.f);
    }
}
