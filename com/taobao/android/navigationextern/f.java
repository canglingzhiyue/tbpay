package com.taobao.android.navigationextern;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f CATEGORY_TAB_CH;
    public static final f CATEGORY_TAB_EN;
    public static final f DEFAULT_TB_MAIN_TAB;
    public static final f DISCOVERY_TAB;
    public static final f NEW_TB_MAIN_TAB;
    public static final f SEARCH_TAB;

    /* renamed from: a  reason: collision with root package name */
    private final int f14469a;
    private final String b;
    private final Object c;
    private final Object d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final boolean m;
    private final String n;
    public static final f DefaultGuangGuangTab = new f(1, "逛逛", Integer.valueOf(R.drawable.uik_nav_guangguang_normal), Integer.valueOf(R.drawable.uik_nav_guangguang_selected), 0, "https://h5.m.taobao.com/guangguang/index.htm", "com.taobao.wetao.home.WeTaoMainActivity", "com.taobao.wetao.home.GuangGuangTnodeMainFragment", "com.taobao.allspark", "a2141.1.tabbar.guangguang", "Page_TabVC", "Button-guangguang", false, "tab2");
    public static final f DefaultMessageTab = new f(2, "消息", Integer.valueOf(R.drawable.uik_nav_message_normal), Integer.valueOf(R.drawable.uik_nav_message_selected), 0, "taobao://message/root", "com.taobao.message.category.MsgCenterCategoryTabActivity", "com.taobao.message.conversation.MessageTabFragment", "com.taobao.wangxin", "a2141.1.tabbar.ocean", "Page_TabVC", "Button-Message", true, "message");
    public static final List<Pair> ELDER_HOME_TAB_BAR_CONFIG = new ArrayList();
    public static final List<Pair> I18N_TAB_BAR_CONFIG = new ArrayList();
    public static final HashMap<String, Integer> NONE_CHANGED_TAB_BAR_TITLE_CONFIG = new HashMap<>();
    public static final List<Pair> DEFAULT_TAB_BAR_CONFIG = new ArrayList();

    private f(int i, String str, Object obj, Object obj2, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9) {
        this.f14469a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = z;
        this.n = str9;
    }

    private f(int i, String str, Object obj, Object obj2, String str2, int i2) {
        this.f14469a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i2;
        this.f = null;
        this.g = null;
        this.h = str2;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = null;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f14469a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.k;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.l;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        return h() + "_nav_selected";
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        return h() + "_nav_unselected";
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.m;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.n;
    }

    static {
        ELDER_HOME_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_elder), Integer.valueOf(R.drawable.uik_nav_home_selected_elder)));
        ELDER_HOME_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_guangguang_normal_elder), Integer.valueOf(R.drawable.uik_nav_guangguang_selected_elder)));
        ELDER_HOME_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_message_normal_elder), Integer.valueOf(R.drawable.uik_nav_message_selected_elder)));
        ELDER_HOME_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_elder), Integer.valueOf(R.drawable.uik_nav_cart_selected_elder)));
        ELDER_HOME_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_elder), Integer.valueOf(R.drawable.uik_nav_my_selected_elder)));
        I18N_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_en), Integer.valueOf(R.drawable.uik_nav_home_selected_en)));
        I18N_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_category_normal_en), Integer.valueOf(R.drawable.uik_nav_category_selected_en)));
        I18N_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_search_normal_en), Integer.valueOf(R.drawable.uik_nav_search_selected_en)));
        I18N_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_en), Integer.valueOf(R.drawable.uik_nav_cart_selected_en)));
        I18N_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_en), Integer.valueOf(R.drawable.uik_nav_my_selected_en)));
        NONE_CHANGED_TAB_BAR_TITLE_CONFIG.put(NavigationTabConstraints.TAB_BIZ_HOMEPAGE, Integer.valueOf(R.string.uik_navigation_title_home));
        NONE_CHANGED_TAB_BAR_TITLE_CONFIG.put("cart", Integer.valueOf(R.string.uik_navigation_title_cart));
        NONE_CHANGED_TAB_BAR_TITLE_CONFIG.put("mytaobao", Integer.valueOf(R.string.uik_navigation_title_my));
        DEFAULT_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal), Integer.valueOf(R.drawable.uik_nav_home_selected)));
        DEFAULT_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_guangguang_normal), Integer.valueOf(R.drawable.uik_nav_guangguang_selected)));
        DEFAULT_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_message_normal), Integer.valueOf(R.drawable.uik_nav_message_selected)));
        DEFAULT_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal), Integer.valueOf(R.drawable.uik_nav_cart_selected)));
        DEFAULT_TAB_BAR_CONFIG.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal), Integer.valueOf(R.drawable.uik_nav_my_selected)));
        DISCOVERY_TAB = new f(1, "发现", Integer.valueOf(R.drawable.uik_nav_descovery_normal), Integer.valueOf(R.drawable.uik_nav_descovery_selected), 0, "http://h5.m.taobao.com/tmgdiscovery/main.html", "com.taobao.wetao.home.WeTaoMainActivity", "com.taobao.oversea.discovery.TmgDiscoveryFragment", "com.taobao.oversea.discovery", "a2141.1.tabbar.discovery", "Page_TabVC", "Button-TMGJDiscover", false, NavigationTabConstraints.TAB_BIZ_DISCOVERY);
        NEW_TB_MAIN_TAB = new f(0, "首页", Integer.valueOf(R.drawable.uik_nav_home_normal), Integer.valueOf(R.drawable.uik_nav_home_selected), 0, "http://m.taobao.com/index.htm", "com.taobao.tao.homepage.MainActivity3", "com.taobao.android.home.HomeFragment", "com.taobao.taobao.home", "a2141.1.tabbar.homepage", "Page_TabVC", "Button-Home", false, NavigationTabConstraints.TAB_BIZ_HOMEPAGE);
        DEFAULT_TB_MAIN_TAB = new f(0, "首页", Integer.valueOf(R.drawable.uik_nav_home_normal), Integer.valueOf(R.drawable.uik_nav_home_selected), 0, "http://m.taobao.com/index.htm", "com.taobao.tao.homepage.MainActivity3", "com.taobao.tao.homepage.HomepageFragment", "com.taobao.taobao.home", "a2141.1.tabbar.homepage", "Page_TabVC", "Button-Home", false, NavigationTabConstraints.TAB_BIZ_HOMEPAGE);
        CATEGORY_TAB_EN = new f(1, "Category", Integer.valueOf(R.drawable.uik_nav_category_normal_en), Integer.valueOf(R.drawable.uik_nav_category_selected_en), 0, "https://h5.m.taobao.com/tmgi18n/categorytab.html", "com.taobao.wetao.home.WeTaoMainActivity", "com.taobao.oversea.category.TmgCategoryFragment", "com.taobao.oversea.category", "a2141.1.tabbar.i18ncategory", "Page_TabVC", "Button-TMGCategory", false, NavigationTabConstraints.TAB_BIZ_CATEGORY);
        CATEGORY_TAB_CH = new f(1, "分类", Integer.valueOf(R.drawable.uik_nav_category_normal_ch), Integer.valueOf(R.drawable.uik_nav_category_selected_ch), 0, "https://h5.m.taobao.com/tmgi18n/categorytab.html", "com.taobao.wetao.home.WeTaoMainActivity", "com.taobao.oversea.category.TmgCategoryFragment", "com.taobao.oversea.category", "a2141.1.tabbar.i18ncategory", "Page_TabVC", "Button-TMGCategory", false, NavigationTabConstraints.TAB_BIZ_CATEGORY);
        SEARCH_TAB = new f(2, ag.SEARCH_ENTRANCE_CLICK, Integer.valueOf(R.drawable.uik_nav_search_normal_en), Integer.valueOf(R.drawable.uik_nav_search_selected_en), 0, "https://h5.m.taobao.com/tusou/camera_tabbar?scene=autodetect", "com.taobao.wetao.home.WeTaoMainActivity", "com.etao.feimagesearch.capture.CaptureFragment", "com.taobao.oversea.capture", "a2141.1.tabbar.i18npailitao", "Page_TabVC", "Button-TMGpailitao", false, NavigationTabConstraints.TAB_BIZ_PAILITAO);
    }

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean m;

        /* renamed from: a  reason: collision with root package name */
        private int f14470a = -1;
        private String b = null;
        private Object c = null;
        private Object d = null;
        private int e = -1;
        private String f = null;
        private String g = null;
        private String h = null;
        private String i = null;
        private String j = null;
        private String k = null;
        private String l = null;
        private String n = null;

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("daafe111", new Object[]{this, new Integer(i)});
            }
            this.f14470a = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6395f6a8", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("499c2ba", new Object[]{this, obj});
            }
            this.c = obj;
            return this;
        }

        public a b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f82946fb", new Object[]{this, obj});
            }
            this.d = obj;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("94276eb0", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("57257ae9", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ab4ff2a", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e44836b", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("31d407ac", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25638bed", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("18f3102e", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c82946f", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("14083be2", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public f a() {
            String str;
            Object obj;
            Object obj2;
            int i;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("362f05fb", new Object[]{this});
            }
            int i2 = this.f14470a;
            if (i2 == -1 || (str = this.b) == null || (obj = this.c) == null || (obj2 = this.d) == null || (i = this.e) == -1 || (str2 = this.f) == null || (str3 = this.g) == null || (str4 = this.h) == null || (str5 = this.i) == null || (str6 = this.j) == null || (str7 = this.k) == null || (str8 = this.l) == null) {
                throw new IllegalArgumentException("navigation bar not enough parameters");
            }
            return new f(i2, str, obj, obj2, i, str2, str3, str4, str5, str6, str7, str8, this.m, this.n);
        }

        public f b() {
            String str;
            Object obj;
            Object obj2;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("1b7074bc", new Object[]{this});
            }
            int i2 = this.f14470a;
            if (i2 == -1 || (str = this.b) == null || (obj = this.c) == null || (obj2 = this.d) == null || (i = this.e) == -1) {
                throw new IllegalArgumentException("navigation bar not enough parameters");
            }
            return new f(i2, str, obj, obj2, this.h, i);
        }
    }
}
