package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SymbolExpUtil;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.cache.domain.ApiCacheDo;
import mtopsdk.mtop.cache.domain.AppConfigDo;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class rxf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;
    private static rxf d;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<String, ApiCacheDo> f33399a = new ConcurrentHashMap<>();
    private Set<String> c = new HashSet();

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    public static /* synthetic */ String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        b = str;
        return str;
    }

    static {
        kge.a(452146970);
        b = "";
    }

    public static rxf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxf) ipChange.ipc$dispatch("f0a463e", new Object[0]);
        }
        if (d == null) {
            synchronized (rxf.class) {
                if (d == null) {
                    d = new rxf();
                }
            }
        }
        return d;
    }

    public ApiCacheDo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiCacheDo) ipChange.ipc$dispatch("7a81088c", new Object[]{this, str});
        }
        if (!StringUtils.isBlank(str)) {
            return this.f33399a.get(str);
        }
        return null;
    }

    public void a(String str, ApiCacheDo apiCacheDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7619b95a", new Object[]{this, str, apiCacheDo});
        } else if (StringUtils.isBlank(str) || apiCacheDo == null) {
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.AppConfigManager", "[addApiCacheDoToGroup] apiCacheDo:" + apiCacheDo);
            }
            this.f33399a.put(str, apiCacheDo);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.c.contains(str);
    }

    public void b(String str, ApiCacheDo apiCacheDo) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308f59db", new Object[]{this, str, apiCacheDo});
        } else if (str == null || apiCacheDo == null) {
        } else {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                try {
                    if (HttpHeaderConstant.OFFLINE_FLAG_ON.equalsIgnoreCase(str2)) {
                        apiCacheDo.offline = true;
                    } else if (HttpHeaderConstant.PRIVATE_FLAG_FALSE.equalsIgnoreCase(str2)) {
                        apiCacheDo.privateScope = z;
                    } else if (str2.contains("kt=")) {
                        String substring = str2.substring(3);
                        char c = 65535;
                        switch (substring.hashCode()) {
                            case 64897:
                                if (substring.equals("ALL")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 69104:
                                if (substring.equals(ApiCacheDo.CacheKeyType.EXC)) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 72638:
                                if (substring.equals(ApiCacheDo.CacheKeyType.INC)) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 2402104:
                                if (substring.equals("NONE")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            apiCacheDo.cacheKeyType = "ALL";
                        } else if (c == 1) {
                            apiCacheDo.cacheKeyType = "NONE";
                        } else if (c == 2) {
                            apiCacheDo.cacheKeyType = ApiCacheDo.CacheKeyType.INC;
                        } else if (c == 3) {
                            apiCacheDo.cacheKeyType = ApiCacheDo.CacheKeyType.EXC;
                        }
                    } else {
                        if (str2.contains("ks=")) {
                            apiCacheDo.cacheKeyItems = Arrays.asList(str2.substring(3).split(SymbolExpUtil.SYMBOL_VERTICALBAR));
                        }
                        apiCacheDo.cacheControlHeader = str;
                    }
                } catch (Exception unused) {
                    TBSdkLog.w("mtopsdk.AppConfigManager", "[parseCacheControlHeader] parse item in CacheControlHeader error.item =" + str2 + ",CacheControlHeader=" + str);
                }
                i++;
                z = false;
            }
        }
    }

    public boolean a(String str, String str2) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("clientCache");
            if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("clientCacheAppConfList")) == null) {
                return false;
            }
            for (int length = optJSONArray.length() - 1; length >= 0; length--) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(length);
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("api");
                    String optString2 = optJSONObject2.optString("v");
                    String optString3 = optJSONObject2.optString(a.ATOM_EXT_block);
                    String concatStr2LowerCase = StringUtils.concatStr2LowerCase(optString, optString2);
                    ApiCacheDo a2 = a().a(concatStr2LowerCase);
                    if (a2 != null) {
                        a2.blockName = optString3;
                    } else {
                        a().a(concatStr2LowerCase, new ApiCacheDo(optString, optString2, optString3));
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject(nog.PRICE_UNIT);
            if (optJSONObject3 != null && (optJSONArray2 = optJSONObject3.optJSONArray("tradeUnitApiList")) != null) {
                HashSet hashSet = new HashSet();
                for (int length2 = optJSONArray2.length() - 1; length2 >= 0; length2--) {
                    JSONObject optJSONObject4 = optJSONArray2.optJSONObject(length2);
                    if (optJSONObject4 != null) {
                        hashSet.add(StringUtils.concatStr2LowerCase(optJSONObject4.optString("api"), optJSONObject4.optString("v")));
                    }
                }
                this.c = hashSet;
            }
            return true;
        } catch (Exception e) {
            TBSdkLog.e("mtopsdk.AppConfigManager", str2, "[parseAppConfig]parse appConf node error.", e);
            return false;
        }
    }

    public void a(MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba7c9ab", new Object[]{this, mtopConfig});
        } else if (mtopConfig != null) {
            try {
                File file = new File(mtopConfig.context.getExternalFilesDir(null).getAbsoluteFile() + "/mtop");
                AppConfigDo appConfigDo = (AppConfigDo) MtopUtils.readObject(file, "appConf");
                if (appConfigDo != null && StringUtils.isNotBlank(appConfigDo.appConf) && appConfigDo.appConfigVersion > mtopConfig.xAppConfigVersion) {
                    synchronized (mtopConfig.lock) {
                        if (appConfigDo.appConfigVersion > mtopConfig.xAppConfigVersion && a().a(appConfigDo.appConf, "")) {
                            mtopConfig.xAppConfigVersion = appConfigDo.appConfigVersion;
                            TBSdkLog.i("mtopsdk.AppConfigManager", "[reloadAppConfig] reload appConf succeed. appConfVersion=" + mtopConfig.xAppConfigVersion);
                        }
                    }
                }
                Map map = (Map) MtopUtils.readObject(file, "apiCacheConf");
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    ApiCacheDo apiCacheDo = (ApiCacheDo) entry.getValue();
                    ApiCacheDo apiCacheDo2 = this.f33399a.get(str);
                    if (apiCacheDo2 == null) {
                        this.f33399a.put(str, apiCacheDo);
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.AppConfigManager", "[reloadAppConfig] add apiCacheDo config,apiKey=" + str);
                        }
                    } else if (!apiCacheDo2.equals(apiCacheDo)) {
                        apiCacheDo2.cacheControlHeader = apiCacheDo.cacheControlHeader;
                        apiCacheDo2.privateScope = apiCacheDo.privateScope;
                        apiCacheDo2.offline = apiCacheDo.offline;
                        apiCacheDo2.cacheKeyType = apiCacheDo.cacheKeyType;
                        apiCacheDo2.cacheKeyItems = apiCacheDo.cacheKeyItems;
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.AppConfigManager", "[reloadAppConfig] update apiCacheDo config,apiKey=" + str);
                        }
                    }
                }
            } catch (Exception unused) {
                TBSdkLog.e("mtopsdk.AppConfigManager", "[reloadAppConfig] reload appConf file error.");
            }
        }
    }

    public void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: tb.rxf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (TextUtils.isEmpty(rxf.b())) {
                            rxf.c(context.getExternalFilesDir(null).getAbsoluteFile() + "/mtop");
                        }
                        MtopUtils.writeObject(rxf.this.f33399a, new File(rxf.b()), "apiCacheConf");
                        if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            return;
                        }
                        TBSdkLog.i("mtopsdk.AppConfigManager", str, "[storeApiCacheDoMap] save apiCacheConf succeed.");
                    } catch (Exception e) {
                        TBSdkLog.e("mtopsdk.AppConfigManager", str, "[storeApiCacheDoMap] save apiCacheConf error.", e);
                    }
                }
            });
        }
    }
}
