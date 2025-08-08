package tb;

import mtopsdk.common.util.StringUtils;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.c;
import com.taobao.alivfssdk.cache.h;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class kfm {
    public static final String CACHE_KEY = "CalendarList";
    public static final String CACHE_MODULE = "Calendar";
    public static final String CACHE_SYNC_FLAG = "CalendarSyncFlag";

    /* renamed from: a  reason: collision with root package name */
    private static h f30037a;
    private static final String b;
    private Map<String, ScheduleDTOModule> c;
    private h.f d = new h.f() { // from class: tb.kfm.1
        @Override // com.taobao.alivfssdk.cache.h.f
        public void onObjectSetCallback(String str, boolean z) {
        }
    };
    private h.d e = new h.d() { // from class: tb.kfm.2
        @Override // com.taobao.alivfssdk.cache.h.d
        public void onObjectRemoveCallback(String str, boolean z) {
            String str2 = kfm.b;
            TLog.logd(str2, "onObjectRemoveCallback, key=" + str + ", success=" + z);
        }
    };

    static {
        kge.a(947841498);
        b = kfm.class.getSimpleName();
    }

    private static h f() {
        h hVar = f30037a;
        if (hVar != null) {
            return hVar;
        }
        h a2 = AVFSCacheManager.getInstance().cacheForModule(CACHE_MODULE).a(kfm.class.getClassLoader()).a(new c()).a();
        f30037a = a2;
        return a2;
    }

    public ScheduleDTOModule a(String str, String str2) {
        if (this.c == null) {
            b();
        }
        Map<String, ScheduleDTOModule> map = this.c;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, ScheduleDTOModule> map2 = this.c;
        return map2.get(kfp.a(str + str2));
    }

    public List<ScheduleDTOModule> a() {
        ArrayList arrayList = new ArrayList();
        if (this.c == null) {
            b();
        }
        Map<String, ScheduleDTOModule> map = this.c;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, ScheduleDTOModule> entry : this.c.entrySet()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public void a(List<ScheduleDTOModule> list) {
        Serializable serializable;
        if (this.c == null) {
            b();
        }
        if (list == null || list.isEmpty()) {
            serializable = null;
        } else {
            for (ScheduleDTOModule scheduleDTOModule : list) {
                if (scheduleDTOModule != null && !StringUtils.isEmpty(scheduleDTOModule.getOutId()) && !StringUtils.isEmpty(scheduleDTOModule.getBizId())) {
                    Map<String, ScheduleDTOModule> map = this.c;
                    map.put(kfp.a(scheduleDTOModule.getBizId() + scheduleDTOModule.getBizId()), scheduleDTOModule);
                }
            }
            serializable = (Serializable) this.c;
        }
        a(CACHE_KEY, serializable);
    }

    public void a(boolean z) {
        a(CACHE_SYNC_FLAG, Boolean.valueOf(z));
    }

    public boolean a(String str) {
        if (!Login.checkSessionValid()) {
            return false;
        }
        try {
            h f = f();
            f.a(str + Login.getUserId(), this.e);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean a(String str, Serializable serializable) {
        if (serializable != null && Login.checkSessionValid()) {
            try {
                h f = f();
                f.a(str + Login.getUserId(), serializable, this.d);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public Object b(String str) {
        if (!Login.checkSessionValid()) {
            return null;
        }
        try {
            h f = f();
            return f.b(str + Login.getUserId());
        } catch (Exception unused) {
            return null;
        }
    }

    public Map<String, ScheduleDTOModule> b() {
        Object b2;
        Map<String, ScheduleDTOModule> map = this.c;
        if ((map == null || map.isEmpty()) && (b2 = b(CACHE_KEY)) != null && (b2 instanceof Map)) {
            this.c = (Map) b2;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        return this.c;
    }

    public void b(String str, String str2) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            return;
        }
        Map<String, ScheduleDTOModule> map = this.c;
        map.remove(kfp.a(str + str2));
        a(CACHE_KEY, (Serializable) this.c);
    }

    public void c() {
        a(CACHE_KEY);
        a(CACHE_SYNC_FLAG);
    }

    public boolean d() {
        return b(CACHE_SYNC_FLAG) != null;
    }
}
