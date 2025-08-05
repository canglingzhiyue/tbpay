package tb;

import android.text.TextUtils;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class kfl {

    /* renamed from: a  reason: collision with root package name */
    private static kfl f30036a;
    private kfm b = new kfm();

    static {
        kge.a(1152726762);
        f30036a = new kfl();
    }

    private kfl() {
    }

    public static synchronized kfl a() {
        kfl kflVar;
        synchronized (kfl.class) {
            if (f30036a == null) {
                f30036a = new kfl();
            }
            kflVar = f30036a;
        }
        return kflVar;
    }

    public void a(ScheduleDTOModule scheduleDTOModule) {
        if (scheduleDTOModule == null) {
            return;
        }
        String bizId = scheduleDTOModule.getBizId();
        String outId = scheduleDTOModule.getOutId();
        if (TextUtils.isEmpty(bizId) || TextUtils.isEmpty(outId)) {
            return;
        }
        Map<String, ScheduleDTOModule> b = this.b.b();
        if (b != null) {
            b.put(kfp.a(bizId + outId), scheduleDTOModule);
        } else {
            b = new HashMap<>();
        }
        this.b.a(kfm.CACHE_KEY, (Serializable) b);
    }

    public void a(List<ScheduleDTOModule> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ScheduleDTOModule scheduleDTOModule : list) {
            if (scheduleDTOModule != null && !TextUtils.isEmpty(scheduleDTOModule.getOutId()) && !TextUtils.isEmpty(scheduleDTOModule.getBizId())) {
                this.b.a(list);
            }
        }
    }

    public void a(boolean z) {
        this.b.a(true);
    }

    public boolean a(String str, String str2) {
        ScheduleDTOModule a2;
        return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (a2 = this.b.a(str, str2)) != null && !TextUtils.isEmpty(a2.getBizId()) && !TextUtils.isEmpty(a2.getOutId());
    }

    public void b() {
        this.b.c();
    }

    public void b(String str, String str2) {
        this.b.b(str, str2);
    }

    public List<ScheduleDTOModule> c() {
        return this.b.a();
    }

    public boolean d() {
        return this.b.d();
    }
}
