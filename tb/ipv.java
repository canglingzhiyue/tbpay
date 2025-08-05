package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alibaba.fastjson.JSONObject;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.application.common.impl.d;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.monitor.impl.util.f;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.ProcedureImpl;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.t;
import com.taobao.monitor.procedure.u;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.tao.tbmainfragment.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ipv extends mos {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String x;
    private static final List<String> y;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean z;

    public static /* synthetic */ Object ipc$super(ipv ipvVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474193572) {
            super.a(((Number) objArr[0]).longValue());
            return null;
        } else if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode != 93762283) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.d();
            return null;
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.mos
    public void a(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff96c", new Object[]{this, new Float(f), new Long(j)});
        }
    }

    @Override // tb.mos
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.MemoryDispatcher.a
    public void a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed98968", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    @Override // tb.mos
    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.b
    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85c54", new Object[]{this, new Long(j)});
        }
    }

    @Override // tb.mos
    public void i(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f89577", new Object[]{this, mouVar, new Long(j)});
        }
    }

    public static /* synthetic */ void a(ipv ipvVar, u uVar, ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee75756e", new Object[]{ipvVar, uVar, abVar});
        } else {
            ipvVar.a(uVar, abVar);
        }
    }

    static {
        kge.a(-1667084930);
        x = "";
        ArrayList arrayList = new ArrayList();
        y = arrayList;
        arrayList.add(s.KEY_FRAGMENT_IS_FRAGMENT_MODEL);
        y.add("lastJumpPageSchemaUrl");
        y.add("fullPageName");
        y.add("activityName");
    }

    @Override // tb.mos
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            super.d();
        }
    }

    public ipv(final ab abVar, mou mouVar) {
        super(mouVar);
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = true;
        this.D = true;
        g gVar = this.b;
        gVar = gVar instanceof t ? ((t) gVar).e() : gVar;
        if (gVar instanceof ProcedureImpl) {
            ((ProcedureImpl) gVar).a(new ProcedureImpl.a() { // from class: tb.ipv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.procedure.ProcedureImpl.a
                public void a(u uVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5f101f86", new Object[]{this, uVar});
                    } else {
                        ipv.a(ipv.this, uVar, abVar);
                    }
                }
            });
        }
        e();
        a(mouVar.t());
        a(mouVar.i(), mouVar.l(), new HashMap(), mouVar.t());
    }

    private void a(u uVar, ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a90934d", new Object[]{this, uVar, abVar});
        } else if (uVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                Map<String, Object> k = uVar.k();
                Map<String, Object> l = uVar.l();
                Object obj = l.get("pageName");
                Object obj2 = l.get(b.KEY_LOAD_TYPE);
                Object obj3 = l.get("leaveType");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("pageName", (Object) "ShortVideoMonitor");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) "APM_DATA");
                jSONObject.put("arg2", (Object) String.valueOf(obj));
                jSONObject.put("arg3", (Object) String.valueOf(obj3));
                jSONObject.put("args", (Object) jSONObject2);
                jSONObject2.put("pageName", (Object) String.valueOf(obj));
                jSONObject2.put(b.KEY_LOAD_TYPE, (Object) String.valueOf(obj2));
                jSONObject2.put("leaveType", (Object) String.valueOf(obj3));
                if (k != null && k.size() > 0) {
                    for (Map.Entry<String, Object> entry : k.entrySet()) {
                        Object value = entry.getValue();
                        jSONObject2.put(entry.getKey(), (Object) (entry.getValue() instanceof String ? (String) value : String.valueOf(value)));
                    }
                }
                TrackerModule.commit(new g.c(abVar, jSONObject, null), false);
            } catch (Exception e) {
                ogg.a("PageProcessor", "APM_END error, " + e.getMessage());
            }
        }
    }

    @Override // tb.mop
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        super.a(j);
        this.b.a("procedureStartTime", j);
        this.b.a("errorCode", (Object) 1);
        this.b.a("installType", mnd.k);
        this.b.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.b.a("leaveType", "other");
        this.b.a("saveMode", Boolean.valueOf(d.a().a("saveMode", false)));
    }

    @Override // tb.mos
    public void a(String str, String str2, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf215b", new Object[]{this, str, str2, map, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageCreate", str, str2, map);
        a(map);
        a(str, str2, j);
    }

    private void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && y.contains(entry.getKey()) && entry.getValue() != null) {
                        this.b.a(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        this.b.a("pageName", str);
        this.b.a(b.KEY_LOAD_TYPE, "push");
        f.b(this.b, "schemaUrl", str2);
        this.b.a("onPageCreate", (Map<String, Object>) new HashMap(1));
    }

    @Override // tb.mos
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageAppear", this.f31174a.i());
        long a2 = h.a();
        this.b.a("onPageAppear", (Map<String, Object>) new HashMap(1));
        mnd.v = this.f31174a.i();
        mnd.s = a2;
    }

    @Override // tb.mos
    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageDisappear");
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.b.a("onPageDisappear", (Map<String, Object>) hashMap);
    }

    @Override // tb.mos
    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageDestroy");
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.b.a("onPageDestroy", (Map<String, Object>) hashMap);
    }

    @Override // tb.mos
    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        } else if (!this.z) {
        } else {
            this.z = false;
            this.b.a("leaveType", str);
            this.b.a("leaveTime", j);
        }
    }

    @Override // tb.mos, tb.mop
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.A || !this.b.c()) {
            return;
        }
        this.A = true;
        c.a();
        this.b.b(SPManager.FPS_KEY, this.m.toString());
        this.b.b("scrollHitchRate", this.v.toString());
        this.b.b("scrollFps", this.n.toString());
        this.b.b("slowFrameCount", Integer.valueOf(this.q));
        this.b.b("jankCount", Integer.valueOf(this.r));
        this.b.b("movieJankCount", Integer.valueOf(this.s));
        this.b.b("movieBigJankCount", Integer.valueOf(this.t));
        this.b.a("procedureEndTime", h.a());
        this.b.d();
    }

    @Override // tb.mos
    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageVisible", Long.valueOf(j));
        if (!this.B) {
            return;
        }
        this.B = false;
    }

    @Override // tb.mos
    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eab16", new Object[]{this, new Long(j)});
        } else {
            this.b.a("customFirstScreenPaint", j);
        }
    }

    @Override // tb.mos
    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41383b5", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageInteractive", Long.valueOf(j));
        if (!this.C) {
            return;
        }
        this.C = false;
        this.b.a("errorCode", (Object) 0);
    }

    @Override // com.taobao.monitor.impl.trace.c.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(h.a()));
        this.b.a("onLowMemory", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (!mnh.a(activity, this.f31174a.a())) {
        } else {
            if (this.D) {
                this.D = false;
            }
            mnd.v = com.taobao.monitor.impl.util.d.b(activity);
            mnd.s = j;
        }
    }
}
