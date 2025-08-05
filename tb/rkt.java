package tb;

import com.taobao.weex.common.Constants;
import com.tmall.android.dai.model.e;
import java.util.Map;

/* loaded from: classes9.dex */
public class rkt implements e {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f33213a;
    public String b;
    public String c;
    public Long d = null;

    static {
        kge.a(-950759756);
        kge.a(-1944657401);
    }

    public rkt(Map<String, Object> map) {
        this.f33213a = map;
        try {
            this.b = (String) map.get("loop");
            this.c = (String) map.get(Constants.Name.INTERVAL);
        } catch (Throwable unused) {
        }
    }
}
