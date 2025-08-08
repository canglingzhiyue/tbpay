package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile Map<String, String> f26471a;
    private volatile long b = -1;
    private crj c;

    static {
        kge.a(-411828591);
    }

    public abstract String a();

    public abstract crl b(crq crqVar);

    public final long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    public final void a(crj crjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fc5b1d", new Object[]{this, crjVar});
        } else {
            this.c = crjVar;
        }
    }

    public final crj c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (crj) ipChange.ipc$dispatch("1e66a961", new Object[]{this}) : this.c;
    }

    public final crl a(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("5dc14dd3", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        this.b = SystemClock.elapsedRealtime();
        return b(pipLineDS);
    }

    public final crn a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crn) ipChange.ipc$dispatch("16b9a9c3", new Object[]{this, obj});
        }
        crn crnVar = new crn(a());
        crnVar.a(obj);
        return crnVar;
    }

    public static /* synthetic */ crk a(crj crjVar, Integer num, String str, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crk) ipChange.ipc$dispatch("818d3efb", new Object[]{crjVar, num, str, new Boolean(z), new Integer(i), obj});
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: assembleFailureEvent");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return crjVar.a(num, str, z);
    }

    public final crk a(Integer num, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crk) ipChange.ipc$dispatch("bdc186ef", new Object[]{this, num, str, new Boolean(z)});
        }
        crk crkVar = new crk(a(), num, str);
        crkVar.a(z);
        return crkVar;
    }

    public final crk a(Integer num, String str, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crk) ipChange.ipc$dispatch("98310053", new Object[]{this, num, str, new Boolean(z), obj});
        }
        crk crkVar = new crk(a(), num, str);
        crkVar.a(z);
        crkVar.a(obj);
        return crkVar;
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (this.f26471a == null) {
                this.f26471a = new LinkedHashMap();
            }
            Map<String, String> map = this.f26471a;
            if (map == null) {
                q.a();
            }
            if (str == null) {
                q.a();
            }
            map.put(str, str2);
        }
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            if (this.f26471a == null) {
                this.f26471a = new LinkedHashMap();
            }
            Map<String, String> map2 = this.f26471a;
            if (map2 == null) {
                q.a();
            }
            map2.putAll(map);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a("status", "success");
        a("processTime", String.valueOf(SystemClock.elapsedRealtime() - this.b));
        TLogTracker.b("IrpPipLine", a(), this.f26471a);
    }

    public final void a(int i, String errMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), errMsg});
            return;
        }
        q.c(errMsg, "errMsg");
        a("errCode", String.valueOf(i));
        a("errMsg", errMsg);
        a("status", "success");
        a("processTime", String.valueOf(SystemClock.elapsedRealtime() - this.b));
        TLogTracker.b("IrpPipLine_" + a(), this.f26471a);
    }
}
