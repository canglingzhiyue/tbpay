package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.localization.a;
import com.taobao.orange.OrangeConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import mtopsdk.mtop.intf.Mtop;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u00020.J\u0006\u00101\u001a\u00020\u0004J\u0006\u00102\u001a\u000203J\n\u00104\u001a\u0004\u0018\u000105H\u0002J\u0006\u00106\u001a\u000203J\n\u00107\u001a\u0004\u0018\u000105H\u0002J\b\u00108\u001a\u0004\u0018\u000105J\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u000203J\n\u0010<\u001a\u0004\u0018\u000105H\u0002J\u0006\u0010=\u001a\u000203J\u0006\u0010>\u001a\u000203J\u0006\u0010?\u001a\u000203J\u0006\u0010@\u001a\u00020:J\u0006\u0010A\u001a\u00020.J\u0006\u0010B\u001a\u00020.J\u0006\u0010C\u001a\u00020.J\b\u0010D\u001a\u00020.H\u0002J\u0006\u0010E\u001a\u00020.J\u0006\u0010F\u001a\u00020.J\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020.J\u0006\u0010J\u001a\u00020.J\u0006\u0010K\u001a\u00020.J\u0006\u0010L\u001a\u00020.J\u0006\u0010M\u001a\u00020.J\u0006\u0010N\u001a\u00020.J\u0006\u0010O\u001a\u00020.J\u0006\u0010P\u001a\u00020.J\u0006\u0010Q\u001a\u00020.J\u0006\u0010R\u001a\u000203J\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010TR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u000e\u0010\"\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007R\u0014\u0010)\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\u0014\u0010+\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007¨\u0006U"}, d2 = {"Lcom/taobao/detail/rate/vivid/OrangeCore;", "", "()V", "DEFAULT_SUBSCRIBE_MSG_LIST", "", "DEFAULT_VIEW_CONTAINER_INFO", "getDEFAULT_VIEW_CONTAINER_INFO", "()Ljava/lang/String;", "DEFAULT_VIEW_CONTAINER_INFO_I18N", "getDEFAULT_VIEW_CONTAINER_INFO_I18N", "ENABLE_ALI_TEXT_STYLE", "ENABLE_RATE_CPU_BOOST", "ENABLE_RATE_PAGER_PERFORMANCE", "ENABLE_SAME_RATE_REPLACE", "FIRST_FRAME_TRACK_ENABLE", "FIRST_FRAME_TRACK_IMAGE_SIZE", "FIRST_FRAME_TRACK_TIMEOUT_TIME", "FIRST_FRAME_TRACK_TOP_RATE", "FLING_VELOCTIY", "HIDE_LOADING", "KEY_SUBSCRIBE_MSG_LIST", "LOADING_VIEW_FIRST_FRAME_TRACK_ENABLE", "LOADING_VIEW_FIRST_FRAME_TRACK_TOP_RATE", "NEW_EVENT_HANDLER", "OPEN_FLING_VELOCTIY", "OPEN_GRAY_NEW_DIFF", "OPEN_LOADING_VIEW_TRACK", "OPEN_NEW_DIFF", "OPEN_PRE_RENDER", "OPEN_RATE_PAGER_ADD_PURCHASE", "OPEN_VIDEO_CONTROL", "OPEN_VIDEO_CONTROL_APPEND", "ORANGE_NAME_SPACE", "getORANGE_NAME_SPACE", "ORANGE_NAV_2_NEW_RATE", "PAGE_ANIM_DURATION", "PRE_RENDER_MIN_VERSION", "SCROLL_THROTTLE_DURATION", "USER_TEXTSIZE_STRATEGY", "USE_OLD_CPMMENT_DISPLAY", "getUSE_OLD_CPMMENT_DISPLAY", "VIEW_CONTAINER", "getVIEW_CONTAINER", "VIEW_CONTAINER_I18N", "getVIEW_CONTAINER_I18N", kio.ENABLE_RATE_CPU_BOOST, "", "enablePerformance", "enableSameRateReplacePageName", "getCurrentDxTemplateName", "getFlingVelocity", "", "getI18nConfig", "Lcom/alibaba/fastjson/JSONObject;", "getLoadingViewTrackFeedListLength", "getNormalConfig", "getNormalDXInfo", "getPageAnimDuration", "", "getRateListCacheValidTimeMin", "getReallyNormalConfig", "getScrollThrottleDuration", "getTrackFeedListLength", "getTrackImageLoadedMinSize", "getTrackTimeoutTime", "hideLoading", "isEnableIpadOpt", "isEnableTextStyle", jgw.IS_GRAY_VERSION, "isNewEventHandler", "isUseTextSizeStrategy", "jsTrackerPerfReportSampling", "", "openFirstFrameTrack", kio.OPEN_FLING_VELOCTIY, "openLoadingViewFirstFrameTrack", kio.OPEN_LOADING_VIEW_TRACK, kio.OPEN_NEW_DIFF, kio.OPEN_PRE_RENDER, kio.OPEN_RATE_PAGER_ADD_PURCHASE, kio.OPEN_VIDEO_CONTROL, "openVideoControlAppendLogic", kio.PRE_RENDER_MIN_VERSION, kio.KEY_SUBSCRIBE_MSG_LIST, "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SUBSCRIBE_MSG_LIST = "MSG_REFRESH_UI,MSG_REFRESH,MSG_SCROLL_CHANGE_QUICK,SHOW_SINGLE_TAG_IF_NEED,AR_MAKE_UP_COMPLETED,TBRatePicOnAlbumClicked,MSG_REFRESH_FLOATS,MSG_REFRESH_TAB,MSG_TAG_LIST_STATUS,MSG_SCROLL_CHANGE,subscribe_click_share_msg,pre_request_buyshower_data,MSG_FEEDBACK_UPDATE";
    public static final String ENABLE_ALI_TEXT_STYLE = "enableALiTextStyle";
    public static final String ENABLE_RATE_CPU_BOOST = "enableCPUBoost";
    public static final String ENABLE_RATE_PAGER_PERFORMANCE = "enableRatePagerPerformance";
    public static final String ENABLE_SAME_RATE_REPLACE = "enableSameRateReplace";
    public static final String FIRST_FRAME_TRACK_ENABLE = "firstFrameTopRateEnable";
    public static final String FIRST_FRAME_TRACK_IMAGE_SIZE = "firstFrameTopRateImageSize";
    public static final String FIRST_FRAME_TRACK_TIMEOUT_TIME = "firstFrameTimeout";
    public static final String FIRST_FRAME_TRACK_TOP_RATE = "firstFrameTopRate";
    public static final String FLING_VELOCTIY = "flingVelocity";
    public static final String HIDE_LOADING = "hideLoading";
    public static final String KEY_SUBSCRIBE_MSG_LIST = "subscribeMsgList";
    public static final String LOADING_VIEW_FIRST_FRAME_TRACK_ENABLE = "loadingViewFirstFrameTopRateEnable";
    public static final String LOADING_VIEW_FIRST_FRAME_TRACK_TOP_RATE = "loadingViewFirstFrameTopRate";
    public static final String NEW_EVENT_HANDLER = "isNewEventChainHandler";
    public static final String OPEN_FLING_VELOCTIY = "openFlingVelocity";
    public static final String OPEN_GRAY_NEW_DIFF = "openGrayNewDiff";
    public static final String OPEN_LOADING_VIEW_TRACK = "openLoadingViewTrack";
    public static final String OPEN_NEW_DIFF = "openNewDiff";
    public static final String OPEN_PRE_RENDER = "openPreRender";
    public static final String OPEN_RATE_PAGER_ADD_PURCHASE = "openRatePagerAddPurchase";
    public static final String OPEN_VIDEO_CONTROL = "openVideoControl";
    public static final String OPEN_VIDEO_CONTROL_APPEND = "openVideoControlAppend";
    public static final String PAGE_ANIM_DURATION = "page_anim_duration";
    public static final String PRE_RENDER_MIN_VERSION = "preRenderMinVersion";
    public static final String SCROLL_THROTTLE_DURATION = "scrollThrottleDuration";
    public static final String USER_TEXTSIZE_STRATEGY = "textSizeStrategy";
    public static final kio INSTANCE = new kio();

    /* renamed from: a  reason: collision with root package name */
    private static final String f30102a = "swifty_rate_kit";
    private static final String b = "tb_rate_list_layout";
    private static final String f = "tb_rate_list_layout_multi";
    private static final String c = "isNewComment";
    private static final String d = "nav2NewRate";
    private static final String e = "{\"name\": \"tb_rate_list_layout\",\"version\": \"789\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout/1719309138571/tb_rate_list_layout.zip\"}";
    private static final String g = "{\"name\": \"tb_rate_list_layout_multi\",\"version\": \"26\", \"url\": \"https://dinamicx.alibabausercontent.com/l_pub/tb_rate_list_layout_multi/1721219411891/tb_rate_list_layout_multi.zip\"}";

    private kio() {
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : g();
    }

    private final JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        if (a.Companion.a()) {
            return q();
        }
        return p();
    }

    private final JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9774dc17", new Object[]{this});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig(f30102a, b, e));
        } catch (Exception unused) {
            return JSON.parseObject(e);
        }
    }

    private final JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab1caf98", new Object[]{this});
        }
        try {
            return JSON.parseObject(OrangeConfig.getInstance().getConfig(f30102a, f, g));
        } catch (Exception unused) {
            return JSON.parseObject(g);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : StringUtils.equals(OrangeConfig.getInstance().getConfig(f30102a, USER_TEXTSIZE_STRATEGY, "true"), "true");
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (h() && Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, OPEN_GRAY_NEW_DIFF, "true"))) {
            return true;
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, OPEN_NEW_DIFF, "false"));
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, OPEN_PRE_RENDER, "true"));
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, PRE_RENDER_MIN_VERSION, "789");
        q.b(config, "OrangeConfig.getInstance…ENDER_MIN_VERSION, \"789\")");
        return Integer.parseInt(config);
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : ses.INSTANCE.a() && Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, "hideLoading", "true"));
    }

    private final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        try {
            Mtop instance = Mtop.instance(null);
            q.b(instance, "Mtop.instance(null as Context?)");
            String str = instance.getMtopConfig().appVersion;
            q.b(str, "Mtop.instance(null as Co…t?).mtopConfig.appVersion");
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            Object[] array = n.b((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return ((String[]) array).length >= 4;
        } catch (Exception unused) {
            return false;
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, FLING_VELOCTIY, "2500");
        q.b(config, "OrangeConfig.getInstance…, FLING_VELOCTIY, \"2500\")");
        Integer d2 = n.d(config);
        if (d2 == null) {
            return 0;
        }
        return d2.intValue();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : kjp.INSTANCE.a() && d() > 0 && Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, OPEN_FLING_VELOCTIY, "false"));
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, NEW_EVENT_HANDLER, "true"));
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        if (a.Companion.a()) {
            return f;
        }
        return b;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, ENABLE_ALI_TEXT_STYLE, "true"));
    }

    public final List<String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e0c1553", new Object[]{this});
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, KEY_SUBSCRIBE_MSG_LIST, DEFAULT_SUBSCRIBE_MSG_LIST);
        if (config == null) {
            return null;
        }
        return n.b((CharSequence) config, new String[]{","}, false, 0, 6, (Object) null);
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, SCROLL_THROTTLE_DURATION, "100");
        q.b(config, "OrangeConfig.getInstance…THROTTLE_DURATION, \"100\")");
        Integer d2 = n.d(config);
        if (d2 == null) {
            return 100;
        }
        return d2.intValue();
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, OPEN_RATE_PAGER_ADD_PURCHASE, "true"));
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, ENABLE_RATE_PAGER_PERFORMANCE, "true"));
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, OPEN_LOADING_VIEW_TRACK, "true"));
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, ENABLE_SAME_RATE_REPLACE, "true"));
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, FIRST_FRAME_TRACK_ENABLE, "true"));
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, LOADING_VIEW_FIRST_FRAME_TRACK_ENABLE, "true"));
    }

    public final boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(f30102a, "is_enable_ipad_opt", "false"));
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, FIRST_FRAME_TRACK_TOP_RATE, "2");
        q.b(config, "OrangeConfig.getInstance…RAME_TRACK_TOP_RATE, \"2\")");
        return Integer.parseInt(config);
    }

    public final int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, LOADING_VIEW_FIRST_FRAME_TRACK_TOP_RATE, "1");
        q.b(config, "OrangeConfig.getInstance…RAME_TRACK_TOP_RATE, \"1\")");
        return Integer.parseInt(config);
    }

    public final int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, FIRST_FRAME_TRACK_TOP_RATE, "5");
        q.b(config, "OrangeConfig.getInstance…RAME_TRACK_TOP_RATE, \"5\")");
        return Integer.parseInt(config);
    }

    public final int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, FIRST_FRAME_TRACK_IMAGE_SIZE, "3");
        q.b(config, "OrangeConfig.getInstance…ME_TRACK_IMAGE_SIZE, \"3\")");
        return Integer.parseInt(config);
    }

    public final long z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7f5", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, FIRST_FRAME_TRACK_TIMEOUT_TIME, IDecisionResult.ENGINE_ERROR);
        q.b(config, "OrangeConfig.getInstance…ACK_TIMEOUT_TIME, \"5000\")");
        return Long.parseLong(config);
    }

    public final long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f1", new Object[]{this})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, PAGE_ANIM_DURATION, "150");
        q.b(config, "OrangeConfig.getInstance…AGE_ANIM_DURATION, \"150\")");
        return Long.parseLong(config);
    }

    public final float E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3c", new Object[]{this})).floatValue();
        }
        String config = OrangeConfig.getInstance().getConfig(f30102a, PAGE_ANIM_DURATION, "1");
        q.b(config, "OrangeConfig.getInstance… PAGE_ANIM_DURATION, \"1\")");
        return Float.parseFloat(config);
    }
}
