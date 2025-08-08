package anetwork.channel.cache;

import mtopsdk.common.util.StringUtils;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class CacheConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.CacheConfig";
    private String abExperiment;
    private String bizName;
    private long cacheSize;
    private final List<String> refererList = new CopyOnWriteArrayList();
    private final List<String> urlList = new CopyOnWriteArrayList();
    private final CachePrediction prediction = new CachePrediction() { // from class: anetwork.channel.cache.CacheConfig.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anetwork.channel.cache.CachePrediction
        public boolean handleCache(String str, Map<String, String> map) {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fb09dede", new Object[]{this, str, map})).booleanValue();
            }
            if (map == null || map.containsKey("x-pv")) {
                return false;
            }
            String str2 = null;
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    if (next != null && HttpConstant.REFERER.equalsIgnoreCase(next.getKey())) {
                        str2 = next.getValue();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (StringUtils.isEmpty(str2) || CacheConfig.access$000(CacheConfig.this).isEmpty()) {
                z = false;
            } else {
                CacheConfig cacheConfig = CacheConfig.this;
                z = CacheConfig.access$100(cacheConfig, str2, CacheConfig.access$000(cacheConfig));
            }
            if (StringUtils.isEmpty(str) || CacheConfig.access$200(CacheConfig.this).isEmpty()) {
                z2 = false;
            } else {
                CacheConfig cacheConfig2 = CacheConfig.this;
                z2 = CacheConfig.access$100(cacheConfig2, str, CacheConfig.access$200(cacheConfig2));
            }
            return z || z2;
        }
    };

    static {
        kge.a(1545980745);
    }

    public static /* synthetic */ List access$000(CacheConfig cacheConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("71edb56a", new Object[]{cacheConfig}) : cacheConfig.refererList;
    }

    public static /* synthetic */ boolean access$100(CacheConfig cacheConfig, String str, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a88ed3d", new Object[]{cacheConfig, str, list})).booleanValue() : cacheConfig.containsKey(str, list);
    }

    public static /* synthetic */ List access$200(CacheConfig cacheConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8bc7e3a8", new Object[]{cacheConfig}) : cacheConfig.urlList;
    }

    private CacheConfig() {
    }

    public static CacheConfig create(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheConfig) ipChange.ipc$dispatch("15585261", new Object[]{jSONObject});
        }
        CacheConfig cacheConfig = new CacheConfig();
        try {
            cacheConfig.bizName = jSONObject.getString("biz");
            cacheConfig.cacheSize = jSONObject.getLong("size");
            cacheConfig.abExperiment = jSONObject.optString("ab");
            JSONArray optJSONArray = jSONObject.optJSONArray(MtopJSBridge.MtopJSParam.REFERER);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!StringUtils.isEmpty(string)) {
                        cacheConfig.refererList.add(string);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("url");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String string2 = optJSONArray2.getString(i2);
                    if (!StringUtils.isEmpty(string2)) {
                        cacheConfig.urlList.add(string2);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return cacheConfig;
    }

    public static CacheConfig create(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CacheConfig) ipChange.ipc$dispatch("79e69125", new Object[]{str, new Long(j)});
        }
        CacheConfig cacheConfig = new CacheConfig();
        cacheConfig.bizName = str;
        cacheConfig.cacheSize = j;
        return cacheConfig;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.bizName;
    }

    public long getCacheSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6be5a9e8", new Object[]{this})).longValue() : this.cacheSize;
    }

    public String getAbExperiment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b54ffe05", new Object[]{this}) : this.abExperiment;
    }

    private boolean containsKey(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efaebd46", new Object[]{this, str, list})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && list != null) {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    ALog.e(TAG, "containsKey", null, "key", str, "container", list);
                    return true;
                }
            }
        }
        return false;
    }

    public CachePrediction getPrediction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CachePrediction) ipChange.ipc$dispatch("f5824523", new Object[]{this}) : this.prediction;
    }
}
