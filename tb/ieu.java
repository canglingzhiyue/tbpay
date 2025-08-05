package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes2.dex */
public class ieu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_TOPIC_FIRST_SCREEN_COLD_START_QUERY = "firstScreenColdStart";
    public static final String MTOP_TOPIC_NOT_COLD_START_QUERY = "other";
    public static final String MTOP_TOPIC_QUERY_PRELOAD = "queryPreload";
    public static final String MTOP_TOPIC_UPDATE_PREFIX = "check-";
    public static final String sCacheFirstPageWhenPreRequest = "cacheFirstPageWhenPreRequest";
    public static final String sEnableMtopStreamJsonForAdjust = "enableMtopStreamJsonForAdjust";
    public static final String sEnableMtopStreamJsonForQuery = "enableMtopStreamJsonForQuery";
    public static final String sEnablePanForStdPop = "enablePanForStdPop";
    public static final String sKeyFeedFlowType = "feedFlowType";
    public static final String sKeyRecommendShotAtFirstScreen = "recommendShotAtFirstScreen";
    public static final String sLoadCacheWhenLoadFirstPageOnCreate = "loadCacheWhenLoadFirstPageOnCreate";
    public static final String sLoadImageWhenPreRequest = "loadImageWhenPreRequest";
    public static final String sPageScrollBottomLeftCountToPrefetch = "pageScrollBottomLeftCountToPrefetch";
    public static final int sPopupAnimationTime = 200;
    public static final String sQueryParamsKeyDefaultFilterItem = "defaultFilterItem";
    public static final String sResetPreRequestDataWhenAddCart = "resetPreRequestDataWhenAddCart";
    public static final String sShowWithStdPop = "showWithStdPop";
    public static final String sStageLoadImage = "loadImage";

    static {
        kge.a(366844071);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : UUID.randomUUID().toString().replace("-", "");
    }
}
