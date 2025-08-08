package com.taobao.tao.image;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.OssImageUrlStrategy;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_CDN_DOMAIN = "aliCdnDomain";
    public static final String AVIF_BUSINESS_WHITE_LIST = "avifBizWhiteList";
    public static final String AVIF_IMAGE_DOMAIN = "avifImageDomain";
    public static final String CDN_10000_HEIGHT = "cdn10000Height";
    public static final String CDN_10000_WIDTH = "cdn10000Width";
    public static final String CDN_IMAGE_SIZE = "cdnImageSizes";
    public static final String CONVERT_EXCLUDE_PATH = "domainConvertExcludePath";
    public static final String DEFAULT_CDN_DOMAIN_WHITE_LIST = "defaultCDNDomainWhiteList";
    public static final String DOMAIN_DEST = "domainDest";
    public static final String DOMAIN_SWITCH = "domainSwitch";
    public static final String EXACT_EXCLUDE_DOMAIN = "exactExcludeDomain";
    public static final String FUZZY_EXCLUDE_PATH = "fuzzyExcludePath";
    public static final String GLOBAL_SWITCH = "globalSwitch";
    public static final String H5_HEIF_BUSINESS_WHITE_LIST = "h5HeifBizWhiteList";
    public static final String H5_HEIF_SOURCE_WHITE_LIST = "h5HeifSourceWhiteList";
    public static final String HEIF_BUSINESS_WHITE_LIST = "heifBizWhiteList";
    public static final String HEIF_IMAGE_DOMAIN = "heifImageDomain";
    public static final String IMAGE_CONFIG = "android_image_strategy_config";
    public static final String IMAGE_STRATEGY = "image_strategy";
    public static final String LEVEL_MODEL_SIZES = "levelModelImageSizes";
    public static final String LEVEL_MODEL_XZSIZES = "levelModelXZImageSizes";
    public static final String LEVEL_RATIO = "levelRatio";
    public static final String MODULES = "modules";
    public static final String OSS_CDN_DOMAIN = "ossCdnDomain";
    public static final String OSS_FUZZY_EXCLUDE = "ossFuzzyExclude";
    public static final String SPECIAL_IMAGE_DOMAIN = "specialImageDomain";
    public static final String STRICT_ALI_CDN_DOMAIN = "strictCDNDomainWL";
    public static final String STRICT_CONVERT_EXCLUDE_PATH = "strictDomainConvertBL";
    public static final String STRICT_EXACT_EXCLUDE_DOMAIN = "strictExactDomainBL";
    public static final String TTL_MAX_TIME = "maxTTLTime";
    public static final String XZ_CDN_IMAGE_SIZE = "xzcdnImageSizes";

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f20623a;
    private static e d;
    private static c e;
    private b b;
    private a c;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f20623a = hashMap;
        hashMap.put(GLOBAL_SWITCH, "1");
        f20623a.put(DOMAIN_SWITCH, "1");
        f20623a.put(MODULES, "default,search,detail,shop,weitao,weapp,weappsharpen,bala,home,tbchannel");
        f20623a.put("default", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q75\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put("search", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put("detail", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put("shop", "{ \"highNetQ\": \"q75\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"s150\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put(ImageStrategyConfig.WEITAO, "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q75\", \"highNetSharpen\": \"s110\", \"lowNetSharpen\": \"s110\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put(ImageStrategyConfig.WEAPP, "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put(ImageStrategyConfig.WEAPPSHARPEN, "{ \"highNetQ\": \"q75\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"s150\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put(ImageStrategyConfig.BALA, "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put("home", "{ \"highNetQ\": \"q90\", \"lowNetQ\": \"q50\", \"highNetSharpen\": \"\", \"lowNetSharpen\": \"\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        f20623a.put(ImageStrategyConfig.TBCHANNEL, "{ \"highNetQ\": \"q50\", \"lowNetQ\": \"q30\", \"highNetSharpen\": \"s150\", \"lowNetSharpen\": \"s150\", \"highNetScale\": \"1\", \"lowNetScale\": \"1\", \"useWebP\": 1 }");
        e = null;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("589490ce", new Object[0]) : e;
    }

    public static c a(Application application, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("96e6acfe", new Object[]{application, bVar});
        }
        if (e == null) {
            e = new c(application, bVar);
        }
        return e;
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac71d46", new Object[]{eVar});
        } else {
            d = eVar;
        }
    }

    public c(Application application, b bVar) {
        this.b = bVar;
        TaobaoImageUrlStrategy.getInstance().initDip(application);
        d.b(d.COMMON_TAG, "construct ImageInitBusinss with IImageStrategySupport(webp support:%b)", Boolean.valueOf(this.b.a()));
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac54bca", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("496597ef", new Object[]{this}) : this.c;
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3a369f6d", new Object[]{this}) : this.b;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String a2 = this.b.a(IMAGE_CONFIG, CDN_IMAGE_SIZE, "");
        String a3 = this.b.a(IMAGE_CONFIG, CDN_10000_WIDTH, "");
        String a4 = this.b.a(IMAGE_CONFIG, CDN_10000_HEIGHT, "");
        String a5 = this.b.a(IMAGE_CONFIG, XZ_CDN_IMAGE_SIZE, "");
        String a6 = this.b.a(IMAGE_CONFIG, LEVEL_MODEL_SIZES, "");
        String a7 = this.b.a(IMAGE_CONFIG, LEVEL_MODEL_XZSIZES, "");
        String a8 = this.b.a(IMAGE_CONFIG, DOMAIN_DEST, "");
        String a9 = this.b.a(IMAGE_CONFIG, ALI_CDN_DOMAIN, "");
        String a10 = this.b.a(IMAGE_CONFIG, OSS_CDN_DOMAIN, "");
        String a11 = this.b.a(IMAGE_CONFIG, EXACT_EXCLUDE_DOMAIN, "");
        String a12 = this.b.a(IMAGE_CONFIG, FUZZY_EXCLUDE_PATH, "");
        String a13 = this.b.a(IMAGE_CONFIG, OSS_FUZZY_EXCLUDE, "");
        String a14 = this.b.a(IMAGE_CONFIG, CONVERT_EXCLUDE_PATH, "");
        String a15 = this.b.a(IMAGE_CONFIG, LEVEL_RATIO, "");
        String a16 = this.b.a(IMAGE_CONFIG, DOMAIN_SWITCH, f20623a.get(DOMAIN_SWITCH));
        String a17 = this.b.a(IMAGE_CONFIG, GLOBAL_SWITCH, f20623a.get(GLOBAL_SWITCH));
        String a18 = this.b.a(IMAGE_CONFIG, HEIF_IMAGE_DOMAIN, "");
        String a19 = this.b.a(IMAGE_CONFIG, HEIF_BUSINESS_WHITE_LIST, "");
        String a20 = this.b.a(IMAGE_CONFIG, AVIF_IMAGE_DOMAIN, "");
        String a21 = this.b.a(IMAGE_CONFIG, AVIF_BUSINESS_WHITE_LIST, "");
        String a22 = this.b.a(IMAGE_CONFIG, MODULES, f20623a.get(MODULES));
        String a23 = this.b.a(IMAGE_CONFIG, SPECIAL_IMAGE_DOMAIN, "");
        String a24 = this.b.a(IMAGE_CONFIG, TTL_MAX_TIME, "");
        String a25 = this.b.a(IMAGE_CONFIG, STRICT_ALI_CDN_DOMAIN, "");
        String a26 = this.b.a(IMAGE_CONFIG, STRICT_EXACT_EXCLUDE_DOMAIN, "");
        String a27 = this.b.a(IMAGE_CONFIG, STRICT_CONVERT_EXCLUDE_PATH, "");
        String[] b = b(a22);
        String a28 = this.b.a(IMAGE_CONFIG, H5_HEIF_BUSINESS_WHITE_LIST, "");
        String a29 = this.b.a(IMAGE_CONFIG, H5_HEIF_SOURCE_WHITE_LIST, "");
        String a30 = this.b.a(IMAGE_CONFIG, DEFAULT_CDN_DOMAIN_WHITE_LIST, "");
        if (d != null) {
            d.a(a23, a24);
        }
        TaobaoImageUrlStrategy.getInstance().initImageUrlStrategy(a(a2), a(a3), a(a4), a(a5), a(a6), a(a7), a(b), a8, a18, a20, a23, a(a19), a(a21), b(a14), b(a9), b(a11), b(a12), c(a17), c(a16), a15, true);
        OssImageUrlStrategy.getInstance().setupConfigs(b(a10), b(a13));
        TaobaoImageUrlStrategy.getInstance().updateStrictCDNDomainWhiteList(b(a25));
        TaobaoImageUrlStrategy.getInstance().updateStrictCDNDomainBlackList(b(a26));
        TaobaoImageUrlStrategy.getInstance().updateStrictConvergenceBlackList(b(a27));
        TaobaoImageUrlStrategy.getInstance().updateH5HeifWhiteList(b(a28));
        TaobaoImageUrlStrategy.getInstance().updateH5HeifSourceWhiteList(b(a29));
        TaobaoImageUrlStrategy.getInstance().updateDefaultCDNDomainWhiteList(b(a30));
        d.b(d.COMMON_TAG, "orange notify(%s) update\ncdnImageSize:%s\ncdn10000Width:%s\ncdn10000Height:%s\nxzCdnSize:%s\nlevelModelSizes:%s\nlevelModelXzSizes:%s\ndomainDest:%s\nheifDomain:%s\nheifBizWL:%s\navifDomain:%s\navifBizWL:%s\ndomainSwitch:%s\nglobalSwitch:%s\naliCdnDomain:%s\nexactExcludePath:%s\nfuzzyExcludePath:%s\nconvertExcludePath:%s\nmodules:%s\nlevelRatio:%s\nossCdnDomains:%s\nossFuzzyExcludes:%s\nstrictCDNDomainWL:%s\nstrictExactDomainBL:%s\nstrictDomainConvertBL:%s", IMAGE_CONFIG, a2, a3, a4, a5, a6, a7, a8, a18, a19, a20, a21, a16, a17, a9, a11, a12, a14, a22, a15, a10, a13, a25, a26, a27);
    }

    private HashMap<String, TaobaoImageUrlStrategy.ServiceImageSwitch> a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6dfbc55a", new Object[]{this, strArr});
        }
        HashMap<String, TaobaoImageUrlStrategy.ServiceImageSwitch> hashMap = new HashMap<>();
        for (String str : strArr) {
            String a2 = this.b.a(IMAGE_CONFIG, str, f20623a.get(str));
            if (!StringUtils.isEmpty(a2)) {
                JSONObject jSONObject = null;
                try {
                    jSONObject = JSONObject.parseObject(a2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (jSONObject != null) {
                    TaobaoImageUrlStrategy.ServiceImageSwitch serviceImageSwitch = new TaobaoImageUrlStrategy.ServiceImageSwitch();
                    serviceImageSwitch.setAreaName(str);
                    serviceImageSwitch.setUseWebp(c(jSONObject.getString("useWebP")));
                    serviceImageSwitch.setHighNetQ(jSONObject.getString("highNetQ"));
                    serviceImageSwitch.setLowNetQ(jSONObject.getString("lowNetQ"));
                    serviceImageSwitch.setHighNetSharpen(jSONObject.getString("highNetSharpen"));
                    serviceImageSwitch.setLowNetSharpen(jSONObject.getString("lowNetSharpen"));
                    serviceImageSwitch.setHighNetScale(e(jSONObject.getString("highNetScale")));
                    serviceImageSwitch.setLowNetScale(e(jSONObject.getString("lowNetScale")));
                    serviceImageSwitch.setHighDeviceScale(e(jSONObject.getString("highDeviceScale")));
                    serviceImageSwitch.setMidDeviceScale(e(jSONObject.getString("midDeviceScale")));
                    serviceImageSwitch.setLowDeviceScale(e(jSONObject.getString("lowDeviceScale")));
                    serviceImageSwitch.useCdnSizes(c(jSONObject.getString("useCdnSizes")));
                    hashMap.put(str, serviceImageSwitch);
                }
            }
        }
        return hashMap;
    }

    private int[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("81233af2", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[] iArr = new int[split.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = d(split[i]);
        }
        return iArr;
    }

    private String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return str.split(",");
        }
        return null;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : "true".equals(str) || "1".equals(str);
    }

    private int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private double e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb124", new Object[]{this, str})).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return 1.0d;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.h;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.i;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }
}
