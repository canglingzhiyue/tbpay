package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\bj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/detail/rate/vivid/manager/RateListCacheManager;", "", "()V", "A_MIN", "", RPCDataItems.SWITCH_TAG_LOG, "", "cacheTimeMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "rateListCache", "Lcom/taobao/detail/rate/vivid/utils/RateLRUCache;", "Lcom/alibaba/fastjson/JSONObject;", "validTimeInterval", "checkValid", "", "key", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE, "setCache", "", "data", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class xkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xkk INSTANCE = new xkk();

    /* renamed from: a  reason: collision with root package name */
    private static final String f34350a = "RateListCacheManager";
    private static final xkl<String, JSONObject> b = new xkl<>(1, 3);
    private static final HashMap<String, Long> c = new HashMap<>();
    private static long d;

    static {
        d = 300000L;
        d = kio.INSTANCE.t() * 60000;
    }

    private xkk() {
    }

    public final void a(String key, JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, key, data});
            return;
        }
        q.d(key, "key");
        q.d(data, "data");
        b.a(key, data);
        c.put(key, Long.valueOf(System.currentTimeMillis()));
    }

    private final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        Long l = c.get(str);
        return l != null && System.currentTimeMillis() - l.longValue() <= d;
    }

    public final JSONObject a(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, key});
        }
        q.d(key, "key");
        if (b.b(key) != null) {
            if (b(key)) {
                String str = "get cache key = " + key;
                return b.b(key);
            }
            b.a((xkl<String, JSONObject>) key);
            c.remove(key);
        }
        c.remove(key);
        return null;
    }
}
