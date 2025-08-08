package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.adapter.test.a;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.d;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.logger.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class qpu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33027a = false;
    private final Map<String, String> d = new ConcurrentHashMap();
    private final Map<String, String> e = new ConcurrentHashMap();
    private volatile boolean f = false;

    static {
        kge.a(-1915969376);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a(str, currentTimeMillis + "");
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.d.put(str, str2);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        Map<String, String> map = this.d;
        if (map != null) {
            return map.containsKey(str);
        }
        return false;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        Map<String, String> map = this.d;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.e.put(str, str2);
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.d;
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str}) : this.e.get(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, fVar});
        } else if (this.f) {
        } else {
            this.f = true;
            JSONObject a2 = qpv.a(fVar);
            a2.putAll(this.d);
            a2.putAll(this.e);
            if (!StringUtils.isEmpty(this.b)) {
                this.f33027a = true;
            }
            a2.put("hasError", (Object) Boolean.valueOf(this.f33027a));
            a2.put("errorCode", (Object) this.b);
            a2.put("errorMsg", (Object) this.c);
            try {
                JSONObject jSONObject = JSON.parseObject(a.a(((d) fVar.b().c().a(d.class)).b())).getJSONObject("value");
                if (jSONObject != null && jSONObject.getJSONObject("properties") != null) {
                    a2.put("isFirstLoad", (Object) jSONObject.getJSONObject("properties").getString("isFirstLoad"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (com.taobao.themis.kernel.utils.a.b()) {
                String a3 = b.a(fVar);
                com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_MONITOR, com.taobao.themis.kernel.logger.a.EVENT_ON_COMMIT_LAUNCH_MONITOR, a3, b.a(fVar) + "_monitor", a2);
            }
            try {
                ((IMonitorAdapter) qpt.a(IMonitorAdapter.class)).trackStat(TLogAdapterImpl.TLOG_MODULE, "Launch", a2, new JSONObject());
                TMSLogger.d("TMSLaunchMonitor", "TMS Launch monitor commit: " + a2.toJSONString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
