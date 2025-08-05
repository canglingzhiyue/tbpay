package android.taobao.windvane.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import tb.kge;

/* loaded from: classes2.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1568a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static String e;
    public static Pattern f;
    public static String g;
    public static Pattern h;
    public static String i;
    public static Pattern j;
    public static String k;
    public static Pattern l;
    public static String m;
    public static Pattern n;
    public static String o;
    public static Pattern p;
    public static String q;

    static {
        kge.a(-1233234419);
        f1568a = true;
        b = true;
        c = false;
        d = false;
        e = "^https?:\\/\\/(([^/\\?#]+\\.)*((mp\\.dfkhgj|mp\\.iuynfg|mp\\.edcdfg|mp\\.asczwa|taobao|tmall|juhuasuan|xiami|amap|taobaocdn|alipay|etao|alibaba|aliyun|alimama|weibo|tanx|laiwang|alicdn|mmstat|yunos|alibaba-inc|alitrip|aliloan|kanbox|wirlesshare|dingtalk|alimei|cnzz|kuaidadi|autonavi|m\\.yintai|polyinno|spdyidea|h5util|h5tool|5945i|miaostreet|1688|cainiao-inc|cainiao|taohua|m\\.jiaoyimao|m\\.dfkhgj|m\\.edcdfg|liangxinyao|taopiaopiao|fliggy|feizhu|mashangfangxin|youku|im\\.alisoft|100x100w|koubei|alibabausercontent|hemaos|alihive|(jishi|cdn)\\.rantu|ishuqi|jishi\\.aligames|aligames|h5\\.shyhhema|duanqu|y\\.xevddy|l\\.xevddy|portalpro\\.hemaos)\\.com|(tb|tbcdn|weibo|mashort|mybank|uc|feizhu|alihealth|alios|xixi\\.fullspeed|image\\.9game|pass\\.alios|damai|portal-h5\\.hemayx)\\.cn|(fastidea|juzone)\\.(me|cc)|(lemon\\.faas\\.ele|marketing-feast\\.faas\\.ele|lemon\\.ele|tb\\.ele|h5\\.ele|juhs|t-series-act\\.faas\\.ele|2018-bill\\.faas\\.ele)\\.me|lwurl\\.to|(taobao|alipay|cnzz|fliggy|feizhu|tmall)\\.net|tdd\\.la|yao\\.95095\\.com|(tmall|alipay|fliggy)\\.hk|ahd\\.so|atb\\.so|mshare\\.cc|xianyu\\.mobi|ynuf\\.aliapp\\.org|doctoryou\\.ai|m\\.10010\\.com\\/queen\\/alitrip\\/alipay\\.html|gseller\\.cn-shanghai\\.oss\\.aliyun-inc\\.com|gw\\.alipayobjects\\.com\\/as\\/g\\/memberAsset\\/zfb-tbcard|wegame-web-daily\\.uc\\.test)([\\?|#|/].*)?|go(/.*)?)$";
        f = null;
        g = "";
        h = null;
        i = "^((https?:)?\\/\\/([^/\\?#]+\\.)*((5317wan|guahao|wap\\.wandafilm|wrating|alipayobjects|(hft|\\w+app)\\.evergrande|jmt\\.wxcsgd|mpay\\.cx580|mt\\.locojoy|cpa1\\.locojoy|miiee|imaijia)\\.com|(h5\\.edaijia|beta\\.library\\.sh|web\\.chelaile\\.net|app3\\.shmzj\\.gov|bsfw\\.qingdao\\.gov|www\\.hzpolice\\.gov|www\\.sxgajj\\.gov|service\\.zjzwfw\\.gov|people\\.com|hbjg\\.premier-tech)\\.cn|(aliplay|ali\\.hk515)\\.net|tmall\\.pp\\.cc|ele\\.me)([\\?|#|/|:].*)?)$";
        j = null;
        k = "";
        l = null;
        m = "https?:\\/\\/(g|img|gw)\\.alicdn\\.com\\/.*";
        n = null;
        o = "";
        p = null;
        q = "0";
    }

    public static boolean a(String str, android.taobao.windvane.webview.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3d9b066", new Object[]{str, gVar})).booleanValue();
        }
        if (!gVar.canUseUrlConfig()) {
            return a(str);
        }
        return true;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (j.commonConfig.ad) {
            return t.a().e(str);
        }
        return b(str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (f == null) {
            if (TextUtils.isEmpty(e)) {
                e = "^https?:\\/\\/(([^/\\?#]+\\.)*((mp\\.dfkhgj|mp\\.iuynfg|mp\\.edcdfg|mp\\.asczwa|taobao|tmall|juhuasuan|xiami|amap|taobaocdn|alipay|etao|alibaba|aliyun|alimama|weibo|tanx|laiwang|alicdn|mmstat|yunos|alibaba-inc|alitrip|aliloan|kanbox|wirlesshare|dingtalk|alimei|cnzz|kuaidadi|autonavi|m\\.yintai|polyinno|spdyidea|h5util|h5tool|5945i|miaostreet|1688|cainiao-inc|cainiao|taohua|m\\.jiaoyimao|m\\.dfkhgj|m\\.edcdfg|liangxinyao|taopiaopiao|fliggy|feizhu|mashangfangxin|youku|im\\.alisoft|100x100w|koubei|alibabausercontent|hemaos|alihive|(jishi|cdn)\\.rantu|ishuqi|jishi\\.aligames|aligames|h5\\.shyhhema|duanqu|y\\.xevddy|l\\.xevddy|portalpro\\.hemaos)\\.com|(tb|tbcdn|weibo|mashort|mybank|uc|feizhu|alihealth|alios|xixi\\.fullspeed|image\\.9game|pass\\.alios|damai|portal-h5\\.hemayx)\\.cn|(fastidea|juzone)\\.(me|cc)|(lemon\\.faas\\.ele|marketing-feast\\.faas\\.ele|lemon\\.ele|tb\\.ele|h5\\.ele|juhs|t-series-act\\.faas\\.ele|2018-bill\\.faas\\.ele)\\.me|lwurl\\.to|(taobao|alipay|cnzz|fliggy|feizhu|tmall)\\.net|tdd\\.la|yao\\.95095\\.com|(tmall|alipay|fliggy)\\.hk|ahd\\.so|atb\\.so|mshare\\.cc|xianyu\\.mobi|ynuf\\.aliapp\\.org|doctoryou\\.ai|m\\.10010\\.com\\/queen\\/alitrip\\/alipay\\.html|gseller\\.cn-shanghai\\.oss\\.aliyun-inc\\.com|gw\\.alipayobjects\\.com\\/as\\/g\\/memberAsset\\/zfb-tbcard|wegame-web-daily\\.uc\\.test)([\\?|#|/].*)?|go(/.*)?)$";
            }
            try {
                f = Pattern.compile(e, 2);
                android.taobao.windvane.util.m.b("WVServerConfig", "compile pattern domainPat rule, " + e);
            } catch (PatternSyntaxException e2) {
                android.taobao.windvane.util.m.e("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (f != null) {
                return f.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean b(String str, android.taobao.windvane.webview.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40c6c785", new Object[]{str, gVar})).booleanValue();
        }
        if (!gVar.canUseUrlConfig()) {
            return c(str);
        }
        return t.a().d(str);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (j.commonConfig.ad) {
            return t.a().f(str);
        }
        return d(str);
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue();
        }
        if (j == null) {
            if (TextUtils.isEmpty(i)) {
                i = "^((https?:)?\\/\\/([^/\\?#]+\\.)*((5317wan|guahao|wap\\.wandafilm|wrating|alipayobjects|(hft|\\w+app)\\.evergrande|jmt\\.wxcsgd|mpay\\.cx580|mt\\.locojoy|cpa1\\.locojoy|miiee|imaijia)\\.com|(h5\\.edaijia|beta\\.library\\.sh|web\\.chelaile\\.net|app3\\.shmzj\\.gov|bsfw\\.qingdao\\.gov|www\\.hzpolice\\.gov|www\\.sxgajj\\.gov|service\\.zjzwfw\\.gov|people\\.com|hbjg\\.premier-tech)\\.cn|(aliplay|ali\\.hk515)\\.net|tmall\\.pp\\.cc|ele\\.me)([\\?|#|/|:].*)?)$";
            }
            try {
                j = Pattern.compile(i, 2);
                android.taobao.windvane.util.m.b("WVServerConfig", "compile pattern thirdPartyDomain rule, " + i);
            } catch (PatternSyntaxException e2) {
                android.taobao.windvane.util.m.e("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (j != null) {
                return j.matcher(str).matches();
            }
        } catch (Exception e3) {
            android.taobao.windvane.util.m.e("WVServerConfig", "error " + e3.toString());
            e3.printStackTrace();
        }
        return false;
    }

    public static boolean c(String str, android.taobao.windvane.webview.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdb3dea4", new Object[]{str, gVar})).booleanValue();
        }
        if (!gVar.canUseUrlConfig()) {
            return e(str);
        }
        return t.a().h(str);
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (j.commonConfig.ad) {
            return t.a().h(str);
        }
        return f(str);
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue();
        }
        if (h == null) {
            if (TextUtils.isEmpty(g)) {
                g = "";
            }
            try {
                h = Pattern.compile(g, 2);
                android.taobao.windvane.util.m.b("WVServerConfig", "compile pattern black rule, " + g);
            } catch (PatternSyntaxException e2) {
                android.taobao.windvane.util.m.e("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return h.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (l == null) {
            if (TextUtils.isEmpty(k)) {
                k = "";
            }
            try {
                l = Pattern.compile(k, 2);
                android.taobao.windvane.util.m.b("WVServerConfig", "compile pattern supportDownloadDomain rule, " + k);
            } catch (PatternSyntaxException e2) {
                android.taobao.windvane.util.m.e("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return l.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (n == null) {
            if (TextUtils.isEmpty(m)) {
                m = "";
            }
            try {
                n = Pattern.compile(m, 2);
                android.taobao.windvane.util.m.b("WVServerConfig", "compile pattern allowAccessDomain rule, " + m);
            } catch (PatternSyntaxException e2) {
                android.taobao.windvane.util.m.e("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return n.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str);
    }
}
