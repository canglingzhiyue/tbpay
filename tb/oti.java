package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import tb.osx;
import tb.osz;

/* loaded from: classes8.dex */
public class oti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f32390a = new JSONObject();
    private ksk b;
    private osz.a c;
    private osx.a d;
    private osx.b e;
    private osx.c f;
    private final osy g;
    private boolean h;

    static {
        kge.a(-1430580573);
    }

    public static /* synthetic */ void a(oti otiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abe01fe", new Object[]{otiVar, str});
        } else {
            otiVar.a(str);
        }
    }

    public static /* synthetic */ void a(oti otiVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd02b486", new Object[]{otiVar, str, new Long(j)});
        } else {
            otiVar.a(str, j);
        }
    }

    public static /* synthetic */ boolean a(oti otiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f8923d38", new Object[]{otiVar})).booleanValue() : otiVar.h;
    }

    public static /* synthetic */ boolean a(oti otiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b61c24", new Object[]{otiVar, new Boolean(z)})).booleanValue();
        }
        otiVar.h = z;
        return z;
    }

    public static /* synthetic */ void b(oti otiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71543b5", new Object[]{otiVar});
        } else {
            otiVar.n();
        }
    }

    public oti(ksk kskVar, osy osyVar) {
        this.g = osyVar;
        this.b = kskVar;
        b();
        d();
        f();
        h();
    }

    public void a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b1abf5", new Object[]{this, kskVar});
        } else {
            this.b = kskVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        e();
        g();
        i();
        opr.a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.c = m();
            this.g.a(this.c);
        }
    }

    private void c() {
        osz.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        osy osyVar = this.g;
        if (osyVar == null || (aVar = this.c) == null) {
            return;
        }
        osyVar.b(aVar);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.d = l();
            this.g.a(this.d);
        }
    }

    private void e() {
        osx.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        osy osyVar = this.g;
        if (osyVar == null || (aVar = this.d) == null) {
            return;
        }
        osyVar.b(aVar);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.e = k();
            this.g.a(this.e);
        }
    }

    private void g() {
        osx.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        osy osyVar = this.g;
        if (osyVar == null || (bVar = this.e) == null) {
            return;
        }
        osyVar.b(bVar);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.f = j();
            this.g.a(this.f);
        }
    }

    private void i() {
        osx.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        osy osyVar = this.g;
        if (osyVar == null || (cVar = this.f) == null) {
            return;
        }
        osyVar.b(cVar);
    }

    private osx.c j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osx.c) ipChange.ipc$dispatch("6100aa82", new Object[]{this}) : new osx.c() { // from class: tb.oti.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osx.c
            public void a(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                } else {
                    oti.a(oti.this, "pageRenderStart", j);
                }
            }
        };
    }

    private osx.b k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osx.b) ipChange.ipc$dispatch("42de7402", new Object[]{this}) : new osx.b() { // from class: tb.oti.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osx.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    oti.a(oti.this, "moduleInit");
                }
            }
        };
    }

    private osx.a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osx.a) ipChange.ipc$dispatch("24bc3d82", new Object[]{this}) : new osx.a() { // from class: tb.oti.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osx.a
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                oti.a(oti.this, RenderTrackUtils.renderEnd);
                if (oti.a(oti.this)) {
                    return;
                }
                oti.b(oti.this);
                oti.a(oti.this, true);
            }
        };
    }

    private osz.a m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osz.a) ipChange.ipc$dispatch("69aefdf", new Object[]{this}) : new osz.a() { // from class: tb.oti.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osz.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                }
            }

            @Override // tb.osz.a
            public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
                } else {
                    oti.a(oti.this, "requestStart");
                }
            }

            @Override // tb.osz.a
            public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
                } else {
                    oti.a(oti.this, "requestEnd");
                }
            }
        };
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, System.currentTimeMillis());
        }
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (this.h) {
        } else {
            try {
                this.f32390a.put(str.concat("Time"), (Object) String.valueOf(j));
            } catch (Exception e) {
                lap.a("recmdPrefetch", "saveCurrentPhaseTime", "出现异常：" + e);
            }
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (this.b == null) {
            lap.a("recmdPrefetch", "commitPhaseTime", "containerType == null");
        } else {
            this.f32390a.put("optimizeType", (Object) opr.b());
            this.f32390a.put("result", (Object) opr.d());
            this.f32390a.put("deviceLevel", (Object) g.b());
            lap.a("recmdPrefetch", "commitPhaseTime", "args: " + this.f32390a);
            kss.a(this.b.b(), 19999, "tradeInfoflowPrefetchRequest", this.b.a(), "tradeInfoflowRenderSuccess", this.f32390a);
        }
    }
}
