package com.taobao.search.common.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class k {
    public static final String ACTION_KEY = "action";
    public static final String ACTION_VALUE = "ipv";
    public static final String ALIBABA_INC_HOST = ".alibaba-inc.com";
    public static final String CONFIG_LIST_CLIP_CHILDREN = "listClipChildren";
    public static final String DEFAULT_ONESEARCH_URL = "defaultOnesearchUrl";
    public static final int DP_ACTION_BAR_HEIGHT = 48;
    public static final int DP_TAB_HEIGHT = 48;
    public static final int DP_TOPBAR_CORNER_RADIUS = 12;
    public static final int DP_TOPBAR_HEIGHT = 40;
    public static final int DP_TOPBAR_HEIGHT_WITH_SLIDE = 54;
    public static final String FORMER_IMAGE_SEARCH_GUIDE_KEYWORD = "former_image_search_guide_keyword";
    public static final String FROM_SEARCH_TUNNEL = "fromSearchTunnel";
    public static final String HOMEPAGE_PREFERENCE_KEY = "homepage_search_detail_data";
    public static final String HTTPS_PREFIX = "https://";
    public static final String HTTP_PREFIX = "http://";
    public static final String IMAGE_SEARCH_NEW_MEMBER_GUIDE_INIT = "image_search_new_member_guide_init";
    public static final String IMAGE_SEARCH_NEW_USER_GUIDE_TIME = "image_search_new_user_guide_time";
    public static final int INSHOP_SEARCH = 3;
    public static final String KEY_DATASOURCE_TOKEN = "datasource_token";
    public static final String KEY_IS_REFRESH = "isRefreshSearchResult";
    public static final String KEY_SEARCH_BAR_TAG = "searchBarTag";
    public static final String KEY_SRP_CUSTOM_TITLE = "srpTitle";
    public static final String KEY_SUGGEST_RN = "suggest_rn";
    public static final String LIST_PARAM_KEY = "list_param";
    public static final String LIST_TYPE_KEY = "list_type";
    public static final String LIST_TYPE_VALUE = "search";
    public static final int LOCATION_REQUEST_CODE = 32167;
    public static final int MAIN_SEARCH = 1;
    public static final int MAIN_SEARCH_AUCTION_BIZ_ID = 8910;
    public static final String MULTIPLE_SEARCHDOOR_CATEGORY = "com.taobao.intent.category.search.MULTI_SEARCHDOOR";
    public static final String NAVI_STYLE_LIGHT_STATUS_BAR = "0";
    public static final int NETWORK_BIZ_ID = 89;
    public static final int P4P_AUCTION_BIZ_ID = 8911;
    public static final String PAILITAO_EDITOR_URL = "taobao://h5.m.taobao.com/tusou/image_editor/index.html";
    public static final String PAILITAO_TEXT;
    public static final String PAILITAO_URL = "http://h5.m.taobao.com/tusou/index.html";
    public static final String PROMOTION_STYLE_MODULE_NAME = "global";
    public static final String PSSOURCE = "pssource";
    public static final String SEARCHLIST_H5 = "http://s.m.taobao.com/h5";
    public static final String SEARCH_DOOR_SPM = "a2141.7631694.0.0";
    public static final String SEARCH_DOOR_SPM_ELDER_HOME = "a2141.23789626.0.0";
    public static final String SHOP_LIST_TYPE_VALUE = "shopSearch";
    public static final String SHOP_SELLER_ID = "sellerId";
    public static final String SHOWED_IMAGEID = "image_id";
    public static final int STARSHOP = 2;
    public static final String SUGGEST_ALIAS = "suggest";
    public static final String TAOBAO_HOST = ".taobao.com";
    public static final String TMALL_HOST = ".tmall.com";
    public static final int TRIPH = 0;
    public static final String TYPE_TAB_GUIDE_ICON = "icon";
    public static final String TYPE_TAB_GUIDE_POP = "pop";
    public static final String URL_PAY_INIT = "searchIphoneNew.htm";
    public static final String URL_SIMBA = "click.mz.simba.taobao.com";
    public static final String URL_STARSHOP_INIT = "star-shop.php";
    public static final String URL_TRIPH_INIT = "ticekt.html";

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_NS_PARAM_MODULE_NAME = "NewSearch";
        public static final String PARAM_COMBO_BIZ_NAME = "g_comboBizName";
        public static final String PARAM_KEY_COMBO_PAGE = "comboPage";
        public static final String PARAM_KEY_FIRST_RN = "first_rn";
        public static final String PARAM_KEY_IS_NEW_SEARCH_JUMP = "isNewSearchJump";
        public static final String PARAM_KEY_LIST_START_INDEX = "startIndex";

        static {
            kge.a(581747374);
        }

        public static String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
                return "";
            }
            return "NewSearch_" + str;
        }
    }

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TYPE_ELDER_NEW_VOICE = "voice-gray-new-voice";
        public static final String TYPE_ELDER_OLD_VOICE = "voice-gray-old-voice-ab";
        public static final String TYPE_INVERT_ELDER_NEW_VOICE = "voice-no-gray-new-voice-ab";
        public static final String TYPE_INVERT_ELDER_OLD_VOICE = "voice";

        static {
            kge.a(-1521052260);
        }

        public static boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : TYPE_INVERT_ELDER_NEW_VOICE.equals(str) || TYPE_ELDER_NEW_VOICE.equals(str);
        }
    }

    static {
        kge.a(-1592730742);
        PAILITAO_TEXT = com.alibaba.ability.localization.b.a(R.string.app_photo_search);
    }
}
