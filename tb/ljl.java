package tb;

import android.os.SystemClock;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.startup.UCInitializerInfo;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.lji;

/* loaded from: classes7.dex */
public class ljl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CREATE_VIEW_TIME = "onCreateViewStart";
    public static final String LAUNCHER_FINISH_TIME = "onLaunchFinish";
    public static final String LAUNCHER_START_TIME = "onLaunchStart";
    public static final String RENDER_START_TIME = "onRenderStart";
    public static final String RENDER_SUCCESS_TIME = "onRenderSuccess";
    public static final String TAB_CLICKED_TIME = "onTabClicked";
    private static final long h;
    private final lji c;
    private final String d;
    private boolean e;
    private final String f;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f30680a = new JSONObject();
    private final List<Object> g = new CopyOnWriteArrayList();
    private final lji.a b = c();

    public static /* synthetic */ JSONObject a(ljl ljlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("94a6a88a", new Object[]{ljlVar}) : ljlVar.f30680a;
    }

    public static /* synthetic */ void a(ljl ljlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545a88b4", new Object[]{ljlVar, str});
        } else {
            ljlVar.b(str);
        }
    }

    static {
        kge.a(-1533922944);
        h = System.currentTimeMillis() - SystemClock.uptimeMillis();
    }

    public ljl(lji ljiVar, String str, String str2) {
        this.c = ljiVar;
        this.d = str;
        this.f = str2;
        this.c.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.b(this.b);
        this.f30680a.clear();
        this.g.clear();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (StringUtils.equals(str, LAUNCHER_START_TIME)) {
            this.f30680a.put("isUcSupport", (Object) Boolean.valueOf(WVCore.getInstance().isUCSupport()));
        }
        this.f30680a.put(str, (Object) String.valueOf(System.currentTimeMillis()));
        d();
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            this.f30680a.put(str, (Object) String.valueOf(j));
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    private lji.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lji.a) ipChange.ipc$dispatch("2e4bf7f4", new Object[]{this}) : new lji.a() { // from class: tb.ljl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lji.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "commitPerformancePoint";
            }

            @Override // tb.lji.a
            public void a(String str, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0e36ce9", new Object[]{this, str, jSONObject, interfaceC1153a});
                } else if (jSONObject == null || jSONObject.isEmpty()) {
                    interfaceC1153a.a("bridge params is empty");
                } else {
                    boolean booleanValue = jSONObject.getBooleanValue("isCommit");
                    ljl.a(ljl.this).putAll(jSONObject);
                    interfaceC1153a.b("收到性能阶段数据");
                    if (!booleanValue) {
                        return;
                    }
                    try {
                        ljl.a(ljl.this, jSONObject.getString("bizType"));
                    } catch (Exception e) {
                        ldf.d("PerformancePointService", "commit exception:" + e);
                    }
                    interfaceC1153a.b("性能点位上报成功");
                }
            }
        };
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.f30680a.put("isOutLinkTrigger", (Object) Boolean.valueOf(this.e));
        this.f30680a.put("businessId", (Object) this.f);
        e();
        d a2 = c.a();
        if (a2 != null) {
            this.f30680a.put("startProcessSystem", (Object) Long.valueOf(a2.a("startProcessSystemTime", -1L)));
        }
        long b = UCInitializerInfo.a().b(7);
        long b2 = UCInitializerInfo.a().b(0);
        long b3 = UCInitializerInfo.a().b(8);
        this.f30680a.put("ucInitSuccessTime", (Object) Long.valueOf(a(b)));
        this.f30680a.put("ucInitStartTime", (Object) Long.valueOf(a(b2)));
        this.f30680a.put("ucInitFailTime", (Object) Long.valueOf(a(b3)));
        ldk.a("containerPerformanceStage", str, "1.0", ljk.MAIN_BIZ_NAME, this.d, (Map) JSON.parseObject(this.f30680a.toJSONString(), new TypeReference<Map<String, String>>() { // from class: tb.ljl.2
        }, new Feature[0]));
        this.f30680a.clear();
        this.e = false;
    }

    private long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue() : j != 0 ? j + h : j;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.g.isEmpty()) {
        } else {
            Iterator<Object> it = this.g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.g.isEmpty()) {
        } else {
            Iterator<Object> it = this.g.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
