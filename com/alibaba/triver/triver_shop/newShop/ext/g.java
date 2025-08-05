package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import kotlin.collections.ao;
import kotlin.text.Regex;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String DEFAULT_2022_BG_IMG_URL = "https://img.alicdn.com/imgextra/i2/O1CN01OZ4hI81kplLTLrHYS_!!6000000004733-2-tps-750-1624.png";
    public static final long DEFAULT_ANIMATION_TIME = 300;
    public static final String DEFAULT_BG_IMG_URL = "https://img.alicdn.com/imgextra/i3/O1CN01biYZKy1dlSGR6Z0Z6_!!6000000003776-2-tps-750-2500.png";
    public static final String KEY_ALL_ITEMS = "allitemsbar";
    public static final String KEY_APM_SHOP_URL = "shopUrl";
    public static final String KEY_APP_END = "appEnd";
    public static final String KEY_APP_START = "appStart";
    public static final String KEY_CATEGORY = "categorybar";
    public static final String KEY_CLOSE_BUTTON_URL = "https://gw.alicdn.com/imgextra/i1/O1CN016Z6Myg1CUW0hp4ger_!!6000000000084-2-tps-104-104.png";
    public static final String KEY_CONTAINER_FINISH = "containerFinish";
    public static final String KEY_CONTAINER_INIT_START = "containerRealStart";
    public static final String KEY_CONTAINER_START = "containerStart";
    public static final String KEY_CUSTOM_CAR_TAB = "carcustomtab";
    public static final String KEY_DONG_TAI = "dongtaibar";
    public static final String KEY_DX_BIZ_TYPE = "shop";
    public static final String KEY_ENABLE_DIRECTLY_PUSH_AC = "enableDirectlyPushActivity";
    public static final String KEY_ENABLE_NEW_START_AC_LOGIC = "enableNewStartActivityDataProcess";
    public static final String KEY_FIRST_IN_SHOP_URL = "firstInShopUrl";
    public static final String KEY_FIRST_LEAVE_SHOP_TIME = "firstLeaveShopTime";
    public static final int KEY_FLAG_SHIP_BIG_CARD_SIZE_RPX = 1190;
    public static final int KEY_FLAG_SHIP_H5_BIG_CARD_SIZE_RPX = 1360;
    public static final int KEY_FLAG_SHIP_SUPER_BIG_CARD_SIZE_RPX = 1333;
    public static final String KEY_FLOAT_POP_URL = "poplayer://tb_shop_bottom_hover";
    public static final String KEY_FOLLOW_STATUS = "followStatus";
    public static final String KEY_HAS_BIG_CARD_STYLE = "bigCardStyle";
    public static final String KEY_HEADER_EXPANDED = "expanded";
    public static final String KEY_INDEX_NAV_FULL_SCREEN = "fullScreenStyle";
    public static final String KEY_INIT_DX_ENGINE_COST = "initDXEngineCost";
    public static final String KEY_INIT_SHOP_BASE_VIEW = "initShopBaseViewCost";
    public static final String KEY_INIT_SHOP_TEMPLATE_COMPONENT_COST = "initShopTemplateComponentCost";
    public static final String KEY_IS_SHOW_LIVE_ICON = "isShowLiveIcon";
    public static final String KEY_IS_SHOW_NEW_LIVE_CARD = "isShowNewLiveCard";
    public static final String KEY_IS_TRANSPARENT = "isTransparent";
    public static final String KEY_MSG_COUNT = "badgeCount";
    public static final String KEY_PAGE_LOADED = "pageLoaded";
    public static final String KEY_PARSE_SHOP_DATA_COST = "parseShopDataCost";
    public static final String KEY_PROMOTION = "promotion";
    public static final String KEY_PROMOTION_TAB = "promotionTab";
    public static final String KEY_RENDER_FINISH_TIME = "renderCompleteTime";
    public static final String KEY_ROUTER_END = "routerEnd";
    public static final String KEY_ROUTER_END_TIME = "routerFinishTime";
    public static final String KEY_ROUTER_START = "routerStart";
    public static final String KEY_ROUTER_START_TIME = "routerStartTime";
    public static final String KEY_SELECTED_INDEX = "selectedIndex";
    public static final String KEY_SELLER_ID = "sellerId";
    public static final String KEY_SHOP_FETCH = "shopFetch";
    public static final String KEY_SHOP_ID = "shopId";
    public static final String KEY_SHOP_INDEX = "shopindex";
    public static final String KEY_SHOP_INDEX_BAR = "shopindexbar";
    public static final String KEY_SHOP_INDEX_TYPE = "shopIndexType";
    public static final String KEY_SHOP_LAUNCH_OPT = "shopLaunchOpt";
    public static final String KEY_SHOP_NAVI_END = "shopNaviEnd";
    public static final String KEY_SHOW_ALL_ITEM_RED_DOT = "showAllitemRedDot";
    public static final String KEY_SUBSCRIBE_SUBJECT_TYPE_RED_DOT = "showDongtaiRedDot";
    public static final String KEY_SUBSCRIBE_SUCCESS_URL = "poplayer://202101FollowSubscribe?type=followWithTrafficGuide&accountType=ACCOUNT";
    public static final String KEY_TAB_KEY_NAME = "tabKey";
    public static final String KEY_TEMPLATE_LIST = "templateList";
    public static final String KEY_UNREAD_MSG_INTENT = "msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD";
    public static final String KEY_WANG_WANG = "wangwang";
    public static final String KEY_XSD_PAGE_FINISH = "xsd_pageFinish";
    public static final String KEY_XSD_PAGE_START = "xsd_pageStart";
    public static final String TB_NATIVE_SHOP_COMMON_TEMPLATE_ID = "N_3000000002110464";
    public static final long TB_SHOP_TAP_EVENT_CODE = 3889687988683861406L;

    /* renamed from: a  reason: collision with root package name */
    private static final Regex[] f3853a;

    static {
        kge.a(1494696316);
        Companion = new a(null);
        f3853a = new Regex[]{new Regex("shop\\d+.m.taobao.com"), new Regex("shop\\d+.taobao.com")};
    }

    public static final /* synthetic */ Regex[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Regex[]) ipChange.ipc$dispatch("bdd63fc7", new Object[0]) : f3853a;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-703561276);
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private a() {
        }

        public final Regex[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Regex[]) ipChange.ipc$dispatch("bdd63fc7", new Object[]{this}) : g.a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        private static final Set<String> f3854a;
        private static final Set<String> b;

        private b() {
        }

        public final Set<String> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : f3854a;
        }

        static {
            kge.a(1281253692);
            INSTANCE = new b();
            f3854a = ao.a((Object[]) new String[]{"2928278102", "2206567368008", "2208032884214", "2978398582", "2217259782977", "2215887543004", "2216262630798", "2856437246", "46154391", "479184430", "2932374699", "2843446399", "3937219703", "2206588314948"});
            b = ao.a((Object[]) new String[]{"163215406", "370119986", "452775482", "235556882", "284717436", "488679671", "294622145", "479456214", "561102871", "494898805", "476381228", "150352431", "414731087", "535868582", "465965982", "186232144", "128986059", "314214241", "257214627"});
        }

        public final Set<String> b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : b;
        }
    }
}
