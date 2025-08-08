package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.linklog.a;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class kty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f30316a;
    private static int b;
    private static int c;
    private static boolean d;
    private final String e;
    private kua f;

    static {
        kge.a(1933040595);
        b = 10;
        c = 1024;
        d = false;
    }

    public kty(kua kuaVar) {
        this.f = kuaVar;
        this.e = kuaVar.d();
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (d || StringUtils.equals(this.e, "coldStart")) {
        } else {
            c();
            d();
            f30316a = new kuc().a();
            d = true;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            c = j.a("behaviorXDataLimitedSize", 1024);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b = j.a("bxFeatureMaxTime", 10);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (StringUtils.equals(this.e, "coldStart")) {
            return null;
        }
        kua kuaVar = this.f;
        if (kuaVar == null) {
            lap.a("CreateCommonParams", "getBxFeature", "mBxFeatureParam 为空");
            return null;
        } else if ((kuaVar.e() && !f30316a.contains(this.e)) || c <= 0) {
            return null;
        } else {
            if (!this.f.f()) {
                lap.a("CreateCommonParams", "getBxFeature", "mBxFeatureParam 异常 " + this.f.toString());
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                String feature = BUFS.getFeature(new BUFS.QueryArgs(), this.f.a(), this.f.b(), this.f.c());
                a(System.currentTimeMillis() - currentTimeMillis);
                return !a(feature) ? "" : feature;
            } catch (Throwable th) {
                lap.a("CreateCommonParams", "getBxFeature", "getBxFeature调用异常，" + th.getMessage());
                return null;
            }
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j <= b) {
        } else {
            HashMap hashMap = new HashMap(8);
            hashMap.put("sMaxTime", b + "");
            hashMap.put("total", j + "");
            a.a("getBxFeature", "BxFeatureGetter", "1.0", this.f.c(), "BxFeatureGetter", hashMap, "getBxFeatureTimeOut", "接口调用超时");
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int length = str.toCharArray().length;
        if (length <= c) {
            return true;
        }
        a.a("getBxFeature", "BxFeatureGetter", "数据长度超过最大长度, 数据长度为 : " + length);
        return false;
    }
}
