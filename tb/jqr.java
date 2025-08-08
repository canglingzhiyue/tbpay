package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* loaded from: classes5.dex */
public class jqr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LruCache<String, jcu> c;
    private int b = 1;

    /* renamed from: a  reason: collision with root package name */
    private final jcu f29714a = new jcu();

    static {
        kge.a(221362623);
    }

    public jqr(FluidContext fluidContext) {
        this.c = ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getConfig().g();
        if (this.c == null) {
            int i = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().W;
            spz.c("LruFeedBack", "feedBackCount：" + i);
            if (i <= 0) {
                return;
            }
            this.c = new LruCache<>(i);
            ((IIntelligenceService) fluidContext.getService(IIntelligenceService.class)).getConfig().a(this.c);
        }
    }

    public void a(String str, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba13f39a", new Object[]{this, str, dVar});
            return;
        }
        this.f29714a.a(str);
        this.f29714a.b(SystemClock.elapsedRealtime());
        if (dVar.h() != null) {
            this.f29714a.c(String.valueOf(dVar.h().duration * 1000));
        }
        a(true);
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.f29714a.d(i);
        jcu a2 = a(str);
        String valueOf = String.valueOf(((this.f29714a.f() - 1) * Long.parseLong(this.f29714a.g())) + this.f29714a.d());
        String str2 = "0";
        if (StringUtils.isEmpty(valueOf)) {
            valueOf = str2;
        }
        if (a2 != null && StringUtils.isEmpty(str)) {
            if (!StringUtils.isEmpty(a2.e())) {
                str2 = a2.e();
            }
            if (Long.parseLong(valueOf) > Long.parseLong(str2)) {
                this.f29714a.b(valueOf);
            }
        } else {
            this.f29714a.b(valueOf);
        }
        this.f29714a.c(SystemClock.elapsedRealtime());
        jcu jcuVar = this.f29714a;
        jcuVar.a(jcuVar.b() - this.f29714a.a());
        spz.a("LruFeedBack", "cardDisappear 存当前页面的值：" + this.f29714a.toString());
        b(str, this.f29714a);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b = 1;
        } else {
            this.b++;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29714a.a(this.b);
        }
    }

    private void a(String str, jcu jcuVar) {
        LruCache<String, jcu> lruCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0a5cc6", new Object[]{this, str, jcuVar});
        } else if (StringUtils.isEmpty(str) || (lruCache = this.c) == null) {
        } else {
            lruCache.put(str, jcuVar);
        }
    }

    private jcu a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jcu) ipChange.ipc$dispatch("7c70ff38", new Object[]{this, str});
        }
        jcu jcuVar = new jcu();
        LruCache<String, jcu> lruCache = this.c;
        return lruCache != null ? lruCache.get(str) : jcuVar;
    }

    private void b(String str, jcu jcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f32507", new Object[]{this, str, jcuVar});
        } else {
            a(str, jcuVar);
        }
    }
}
