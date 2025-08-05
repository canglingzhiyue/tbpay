package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.security.realidentity.v2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.d;
import com.taobao.tao.infoflow.multitab.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public class sqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<JSONObject> f33845a;

    static {
        kge.a(1560740183);
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        WeakReference<JSONObject> weakReference = f33845a;
        if (weakReference != null && weakReference.get() != null) {
            return f33845a.get();
        }
        lap.a("SearchBar", "getPreSearchBarData", "TopMultiTabPresetDataLoader.getHomepageSearchBarTopMultiTabPresetData;首页多tab情况下，获取本地预置的数据");
        try {
            JSONObject parseObject = JSON.parseObject("{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Button-searchBar\",\"args\":{\"expo\":\"a2141.1.searchbar.tbpassport1:1007.home_topbar.tbpassport1.d;a2141.1.searchbar.scan:1007.home_topbar.scan.d;a2141.1.searchbar.pailitao:1007.home_topbar.pailitao.d;a2141.1.searchbar.location:1007.home_topbar.redpacket.d;a2141.1.searchbar.searchbox:1007.home_topbar.searchbox.d;\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{\"hidden\":\"true\",\"expandSearchBarHeight\":\"87np\",\"isClearSearchBar\":\"false\",\"isExpandNaviBar\":\"true\",\"zoomSearchBarHeight\":\"45np\"},\"index\":\"0\",\"invalidType\":\"error\",\"item\":{\"bg\":{\"clickParam\":{},\"content\":{\"bgColor\":\"#ffffff\",\"bgImg\":\"\",\"darkBgColor\":\"\",\"darkBgImg\":\"\",\"darkModeBgColor\":\"\",\"darkModeBgImg\":\"\",\"lightBgColor\":\"\",\"lightBgImg\":\"\",\"taoImg\":\"https://gw.alicdn.com/tfs/TB1lKN.zUY1gK0jSZFCXXcwqXXa-411-88.png\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"memberCode\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.tbpassport1\"},\"smartContent\":{},\"targetUrl\":\"https://market.m.taobao.com/app/big-vip/vip-code/pages/index_v4?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.tbpassport1&scm=1007.home_topbar.tbpassport1.d&wh_weex=true&wx_navbar_transparent=true\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar\",\"subSection\":{\"leftTopIcon\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-tbpassport1\",\"args\":{\"spm\":\"a2141.1.searchbar.tbpassport1\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.tbpassport1.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"img\":\"https://gw.alicdn.com/tfs/TB1L5S0VAL0gK0jSZFtXXXQCXXa-108-108.png\",\"title\":\"签到\",\"titleColor\":\"#FA3B32\",\"bgColor\":\"#FFE5D1\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"memberCode\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.tbpassport1\"},\"smartContent\":{},\"targetUrl\":\"https://market.m.taobao.com/app/tmall-def/daily-welfare/pages/index?wh_weex=true&_wx_statusbar_hidden=true&wx_navbar_hidden=true&wx_navbar_transparent=true&spma=uhf&spmb=14164841\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-memberCode\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"rightTopIcon\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-tbpassport1\",\"args\":{\"spm\":\"a2141.1.searchbar.tbpassport1\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.tbpassport1.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"img\":\"https://gw.alicdn.com/tfs/TB1n9z0iypE_u4jSZKbXXbCUVXa-108-108.png\",\"title\":\"会员码\",\"titleColor\":\"#FA3B32\",\"bgColor\":\"#FFE5D1\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"memberCode\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.tbpassport1\"},\"smartContent\":{},\"targetUrl\":\"http://market.m.taobao.com/app/big-vip/vip-code/pages/index_v4?&wh_weex=true&wx_navbar_transparent=true\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-memberCode\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"scan\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-scan\",\"args\":{\"spm\":\"a2141.1.searchbar.scan\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.scan.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"darkImg\":\"https://gw.alicdn.com/tfs/TB1Pi4rxrY1gK0jSZTEXXXDQVXa-50-50.png\",\"img\":\"https://gw.alicdn.com/tfs/TB1Pi4rxrY1gK0jSZTEXXXDQVXa-50-50.png\",\"lightImg\":\"https://gw.alicdn.com/tfs/TB1Pi4rxrY1gK0jSZTEXXXDQVXa-50-50.png\",\"scm\":\"1007.home_topbar.scan.d\",\"voiceText\":\"扫一扫\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"scan\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.scan\"},\"smartContent\":{},\"targetUrl\":\"http://tb.cn/n/scancode?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.scan&scm=1007.home_topbar.scan.d\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-scan\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"pailitao\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"args\":{}},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-pailitao\",\"args\":{\"spm\":\"a2141.1.searchbar.pailitao\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.pailitao.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"darkImg\":\"https://gw.alicdn.com/tfs/TB1BqgOf.T1gK0jSZFrXXcNCXXa-72-72.png\",\"img\":\"https://gw.alicdn.com/tfs/TB1BqgOf.T1gK0jSZFrXXcNCXXa-72-72.png\",\"lightImg\":\"https://gw.alicdn.com/tfs/TB1BqgOf.T1gK0jSZFrXXcNCXXa-72-72.png\",\"scm\":\"1007.home_topbar.pailitao.d\",\"voiceText\":\"拍立淘\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"pailitao\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.pailitao\"},\"smartContent\":{},\"targetUrl\":\"http://h5.m.taobao.com/tusou/index.html?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.pailitao&scm=1007.home_topbar.pailitao.d&is_act_show=0&pssource=sy\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-pailitao\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"searchBox\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\",\"scm\":\"1007.home_topbar.searchbox.d\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"\",\"borderColor\":\"#FF5000\",\"searchIcon\":\"https://gw.alicdn.com/tfs/TB1cM7RfYH1gK0jSZFwXXc7aXXa-72-72.png\",\"btnEndColor\":\"#FF5000\",\"loopBeginTime\":\"4000\",\"searchTextArea\":\"shouye_query_rec_hintq_rolling\",\"btnTitle\":\"搜索\",\"btnStartColor\":\"#FF8D0E\",\"abtest\":\"\",\"loopInterval\":\"3000\",\"searchWidth\":\"54\",\"scm\":\"1007.home_topbar.searchbox.d\",\"voiceText\":\"搜索\",\"displayTextColor\":\"#666666\",\"festivalBorderWidth\":\"3\",\"btnTitleBold\":\"true\",\"btnTitleSize\":\"15\",\"textBold\":\"true\",\"textSize\":\"15\",\"textMaskImg\":\"https://gw.alicdn.com/tfs/TB19if0AeH2gK0jSZJnXXaT1FXa-63-64.png\",\"bgColor\":\"#ffffff\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"searchBox\",\"passOnTrack\":{\"spm-url\":\"a2141.1.searchbar.searchbox\"},\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"sectionBizCode\":\"DXSearchBar-searchBox\",\"subSection\":{\"0\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Show-inner_search_text\",\"args\":{\"suggest_rn\":\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\",\"display_text\":\"%E5%9C%B0%E7%97%9E%E5%B8%BD\",\"search_text\":\"%E5%9C%B0%E7%97%9E%E5%B8%BD\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"scm\":\"1007.home_topbar.searchbox.d\",\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"地痞帽\",\"searchTextConfig\":\"{\\\"displayText\\\":\\\"地痞帽\\\",\\\"searchText\\\":\\\"地痞帽\\\",\\\"searchparams\\\":[],\\\"suggest_rn\\\":\\\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\\\"}\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"mst_roll_0\",\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"1\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Show-inner_search_text\",\"args\":{\"suggest_rn\":\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\",\"display_text\":\"%E5%9C%86%E8%84%B8%E9%80%82%E5%90%88%E7%9A%84%E5%B8%BD%E5%AD%90%E5%86%AC%E5%AD%A3\",\"search_text\":\"%E5%9C%86%E8%84%B8%E9%80%82%E5%90%88%E7%9A%84%E5%B8%BD%E5%AD%90%E5%86%AC%E5%AD%A3\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"scm\":\"1007.home_topbar.searchbox.d\",\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"圆脸适合的帽子冬季\",\"searchTextConfig\":\"{\\\"displayText\\\":\\\"圆脸适合的帽子冬季\\\",\\\"searchText\\\":\\\"圆脸适合的帽子冬季\\\",\\\"searchparams\\\":[],\\\"suggest_rn\\\":\\\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\\\"}\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"mst_roll_1\",\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"2\":{\"args\":{},\"bizData\":{},\"categoryData\":{},\"detal\":\"false\",\"exposureParam\":{\"arg1\":\"Page_Home_Show-inner_search_text\",\"args\":{\"suggest_rn\":\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\",\"display_text\":\"%E5%A4%A7%E8%A1%A3%E8%85%B0%E5%B8%A6%E9%85%8D%E4%BB%B6\",\"search_text\":\"%E5%A4%A7%E8%A1%A3%E8%85%B0%E5%B8%A6%E9%85%8D%E4%BB%B6\"},\"eventId\":\"2201\",\"page\":\"Page_Home\"},\"ext\":{},\"invalidType\":\"error\",\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-searchbar-searchbox\",\"args\":{\"scm\":\"1007.home_topbar.searchbox.d\",\"spm\":\"a2141.1.searchbar.searchbox\",\"ranger_buckets_native\":\"tsp2189_21582_normaluser01\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"displayText\":\"大衣腰带配件\",\"searchTextConfig\":\"{\\\"displayText\\\":\\\"大衣腰带配件\\\",\\\"searchText\\\":\\\"大衣腰带配件\\\",\\\"searchparams\\\":[],\\\"suggest_rn\\\":\\\"bucketid_9-rn_BBDD972A7039625033E6BBE778143C19\\\"}\"},\"eventParam\":{},\"exContent\":{},\"ext\":{},\"itemBizCode\":\"mst_roll_2\",\"smartContent\":{},\"targetUrl\":\"https://s.m.taobao.com/h5entry?utparam=%7B%22ranger_buckets_native%22%3A%22tsp2189_21582_normaluser01%22%7D&spm=a2141.1.searchbar.searchbox&scm=1007.home_topbar.searchbox.d&_navigation_params=%7B%22needdismiss%22%3A%220%22%2C%22animated%22%3A%220%22%2C%22needpoptoroot%22%3A%220%22%7D\"}},\"secondLoad\":\"false\",\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"}},\"template\":{\"name\":\"home_null\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"},\"tabBar\":{\"ext\":{\"titleColor\":\"#111111\",\"darkTitleColor\":\"#000000\",\"selectedTitleColor\":\"#ff5000\",\"darkSelectedTitleColor\":\"#ff5000\"},\"item\":{\"0\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-tabdingyue\",\"args\":{\"spm\":\"a2141.1.searchbar.dingyue\"},\"eventId\":\"2101\",\"page\":\"Page_Home\"},\"content\":{\"title\":\"订阅\",\"type\":\"subscribe\",\"isDefault\":\"false\"}},\"1\":{\"clickParam\":{\"arg1\":\"Page_Home_Button-tabtuijian\",\"args\":{\"spm\":\"a21acg.b41183928.c1600427199067.d1600427199067\"},\"eventId\":\"2101\",\"page\":\"Page_DingYueindexall\"},\"content\":{\"title\":\"推荐\",\"type\":\"home\",\"isDefault\":\"true\"}}}}},\"template\":{\"name\":\"home_m_h_v7_searchbar\",\"version\":\"13\",\"url\":\"https://ossgw.alicdn.com/rapid-oss-bucket/1602211077610/m_h_v7_searchbar.zip\"},\"updateGroup\":\"false\",\"updateRule\":\"false\",\"valid\":\"true\"}", Feature.OrderedField);
            f33845a = new WeakReference<>(parseObject);
            return parseObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        JSONObject c = c();
        if (c != null) {
            return c.getString("sectionBizCode");
        }
        return null;
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[0]);
        }
        laq c = laq.a().a("SearchBar").b("getD3SearchViewSection").c("SearchBarDataUtil.getD3SearchViewSection");
        String l = oqc.a().l();
        ope f = d.f(l);
        if (f == null) {
            c.a(c.KEY_DATA_SOURCE, "is null").b();
            return null;
        }
        List<SectionModel> g = f.g(l);
        c.a("isNewFace", "true").a("主容器Id", l);
        if (g == null) {
            c.a("sections", "is null").b();
            return null;
        }
        for (SectionModel sectionModel : g) {
            if (TextUtils.equals(sectionModel.getString("sectionBizCode"), "DXSearchBar")) {
                return sectionModel;
            }
        }
        c.a("getSection", "null").b();
        return null;
    }

    public static JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[0]);
        }
        JSONObject g = g();
        if (g == null) {
            ldf.d("SearchBarDataUtil", "getTabBarList tabBar == null");
            return null;
        }
        return g.getJSONObject("item");
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("subSection")) != null) {
            return jSONObject2.getJSONObject("tabBar");
        }
        return null;
    }

    public static List<JSONObject> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : new TreeMap(jSONObject).entrySet()) {
            arrayList.add((JSONObject) entry.getValue());
        }
        return arrayList;
    }

    public static boolean e() {
        JSONObject b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        String l = oqc.a().l();
        ope f = d.f(l);
        if (f != null && (b = e.b(f.g(l))) != null && (jSONObject = b.getJSONObject("ext")) != null) {
            return TextUtils.equals(jSONObject.getString("categoryTabVersion"), v2.d);
        }
        return false;
    }

    public static List<String> f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[0]);
        }
        JSONObject h = h();
        if (h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < h.size(); i++) {
            JSONObject jSONObject2 = h.getJSONObject(String.valueOf(i));
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject(e.KEY_SMART_CONTENT)) != null) {
                String string = jSONObject.getString("ssrPageUrl");
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        return arrayList;
    }

    public static void a(SectionModel sectionModel) {
        JSONObject c;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba04285", new Object[]{sectionModel});
            return;
        }
        String l = oqc.a().l();
        List<SectionModel> g = d.f(l).g(l);
        if (g == null || g.isEmpty() || (c = c()) == null || (indexOf = g.indexOf(c)) < 0) {
            return;
        }
        g.set(indexOf, sectionModel);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue();
        }
        JSONObject c = c();
        if (c == null) {
            lap.a("SearchBar", "SearchBarDataUtil", "searchDataSection == null");
            return false;
        }
        JSONObject jSONObject = c.getJSONObject("ext");
        if (jSONObject == null) {
            lap.a("SearchBar", "SearchBarDataUtil", "ext == null");
            return false;
        }
        return jSONObject.getBooleanValue("isClearSearchBar");
    }

    private static JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[0]);
        }
        JSONObject c = c();
        if (c == null) {
            ldf.d("SearchBarDataUtil", "getTabBar searchBarSection == null");
            return null;
        }
        JSONObject jSONObject = c.getJSONObject("subSection");
        if (jSONObject == null) {
            ldf.d("SearchBarDataUtil", "getTabBar subSection == null");
            return null;
        }
        return jSONObject.getJSONObject("tabBar");
    }

    private static JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[0]);
        }
        Object a2 = HomePageUtility.a(g(), "subSection.tabSelect.subSection.popContentSection.item");
        if (!(a2 instanceof JSONObject)) {
            return null;
        }
        return (JSONObject) a2;
    }
}
