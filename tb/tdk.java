package tb;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.protodb.e;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;

/* loaded from: classes7.dex */
public class tdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY = "utCacheKey";
    public static final String OVERLAY_CACHE_KEY = "overlayCacheKey";

    /* renamed from: a  reason: collision with root package name */
    private static volatile LSDB f34047a;

    static {
        kge.a(1505675158);
        f34047a = null;
    }

    private static LSDB b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LSDB) ipChange.ipc$dispatch("8b49c999", new Object[0]);
        }
        if (f34047a == null) {
            synchronized (tdk.class) {
                if (f34047a == null) {
                    LSDB.removeDB("info_flow_cache");
                    f34047a = LSDB.open("info_flow_cache", new Config());
                }
            }
        }
        return f34047a;
    }

    public static void a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{baseSectionModel});
            return;
        }
        nuw.a("CardCache", "saveUtLogMapInCache");
        if (baseSectionModel == null) {
            nuw.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null) {
            nuw.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        String string = args.getString("utLogMap");
        String string2 = args.getString(CACHE_KEY);
        if (string2 == null || string == null) {
            nuw.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        LSDB b = b();
        if (b == null) {
            nuw.b("CardCache", "saveUtLogMapInCache");
            return;
        }
        if (b.insertString(new e(string2), string)) {
            args.put("utLogMap", (Object) "");
        }
        nuw.b("CardCache", "saveUtLogMapInCache");
    }

    public static void b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a494b1", new Object[]{baseSectionModel});
            return;
        }
        nuw.a("CardCache", "loadUtLogMapFromCache");
        if (baseSectionModel == null) {
            nuw.b("CardCache", "loadUtLogMapFromCache");
            return;
        }
        JSONObject args = baseSectionModel.getArgs();
        if (args == null) {
            nuw.b("CardCache", "loadUtLogMapFromCache");
            return;
        }
        String string = args.getString(CACHE_KEY);
        if (string == null) {
            return;
        }
        LSDB b = b();
        if (b == null) {
            nuw.b("CardCache", "loadUtLogMapFromCache");
            return;
        }
        String string2 = b.getString(new e(string));
        if (baseSectionModel.getSectionBizCode() == null || string2 == null || string2.isEmpty()) {
            nuw.b("CardCache", "loadUtLogMapFromCache");
            return;
        }
        args.put("utLogMap", (Object) string2);
        nuw.b("CardCache", "loadUtLogMapFromCache");
    }

    public static void c(BaseSectionModel<?> baseSectionModel) {
        JSONObject args;
        String string;
        BaseSubSectionModel mo1098getSubSection;
        LSDB b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab07bb2", new Object[]{baseSectionModel});
        } else if (baseSectionModel == null || (args = baseSectionModel.getArgs()) == null || (string = args.getString(CACHE_KEY)) == null || (mo1098getSubSection = baseSectionModel.mo1098getSubSection()) == null || (b = b()) == null || (jSONObject = mo1098getSubSection.getJSONObject("overlay")) == null) {
        } else {
            String str = OVERLAY_CACHE_KEY + string;
            if (!b.insertString(new e(str), jSONObject.toString())) {
                return;
            }
            mo1098getSubSection.remove("overlay");
            mo1098getSubSection.put(OVERLAY_CACHE_KEY, (Object) str);
        }
    }

    public static void d(BaseSectionModel<?> baseSectionModel) {
        BaseSubSectionModel mo1098getSubSection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11bc62b3", new Object[]{baseSectionModel});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (baseSectionModel == null || (mo1098getSubSection = baseSectionModel.mo1098getSubSection()) == null) {
            return;
        }
        String string = mo1098getSubSection.getString(OVERLAY_CACHE_KEY);
        LSDB b = b();
        if (b == null) {
            return;
        }
        String string2 = b.getString(new e(string));
        long currentTimeMillis2 = System.currentTimeMillis();
        if (baseSectionModel.getSectionBizCode() == null || string2 == null || string2.isEmpty()) {
            ldf.d("CardCacheManager", "加载的缓存数据为空");
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(string2);
            if (parseObject == null) {
                return;
            }
            mo1098getSubSection.put("overlay", (Object) parseObject);
            ldf.d("CardCacheManager", "overlay db loadTime: " + (currentTimeMillis2 - currentTimeMillis));
        } catch (JSONException unused) {
            ldf.d("CardCacheManager", "over cache json parse failed");
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        nuw.a("CardCache", "clearUtLogMapCache");
        LSDB.removeDB("info_flow_cache");
        nuw.b("CardCache", "clearUtLogMapCache");
    }
}
