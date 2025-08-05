package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.popup.e;
import com.taobao.android.detail.core.detail.popup.g;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.popup.b;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class eff implements j<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DetailCoreActivity b;
    private ehx c;
    private boolean d = false;
    private ArrayList<g> e = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public j f27263a = new j() { // from class: tb.eff.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.trade.event.j
        public i handleEvent(Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
            }
            eff.d(eff.this);
            return a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    };

    static {
        kge.a(-667084854);
        kge.a(-1453870097);
    }

    public static /* synthetic */ ehx a(eff effVar, ehx ehxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ehx) ipChange.ipc$dispatch("71031543", new Object[]{effVar, ehxVar});
        }
        effVar.c = ehxVar;
        return ehxVar;
    }

    public static /* synthetic */ void a(eff effVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151c3c23", new Object[]{effVar, gVar});
        } else {
            effVar.b(gVar);
        }
    }

    public static /* synthetic */ boolean a(eff effVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6bb20d7", new Object[]{effVar})).booleanValue() : effVar.d;
    }

    public static /* synthetic */ boolean a(eff effVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a9ac65", new Object[]{effVar, new Boolean(z)})).booleanValue();
        }
        effVar.d = z;
        return z;
    }

    public static /* synthetic */ DetailCoreActivity b(eff effVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("48a8da5f", new Object[]{effVar}) : effVar.b;
    }

    public static /* synthetic */ ehx c(eff effVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehx) ipChange.ipc$dispatch("47e45d7c", new Object[]{effVar}) : effVar.c;
    }

    public static /* synthetic */ void d(eff effVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2443456", new Object[]{effVar});
        } else {
            effVar.a();
        }
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, bVar}) : a(bVar);
    }

    public eff(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        d a2 = f.a(this.b);
        if (a2 != null) {
            a2.a(eno.a(com.taobao.android.detail.core.event.popup.a.class), this.f27263a);
        }
        emu.a("com.taobao.android.detail.core.event.subscriber.popup.OpenPopupWindowSubscriber");
    }

    public i a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8ac0529d", new Object[]{this, bVar});
        }
        String string = bVar.f9725a.params.getString("popType");
        if (TextUtils.isEmpty(string)) {
            string = "default";
        }
        final com.taobao.android.detail.core.detail.popup.f a2 = n.a(this.b).a(string);
        if (a2 == null) {
            return a.FAILURE;
        }
        final HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.taobao.android.detail.core.detail.popup.f.SRC, bVar.f9725a);
        hashMap.put(com.taobao.android.detail.core.detail.popup.f.EXTRA, bVar.b);
        final g gVar = new g(this.b);
        final g.b a3 = a(bVar.f9725a.params);
        a(gVar);
        gVar.a(a3);
        this.d = true;
        gVar.a(new g.a() { // from class: tb.eff.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.popup.g.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                eff.a(eff.this, gVar);
                eff.a(eff.this, false);
                a2.a();
            }
        });
        a2.a(hashMap, new e() { // from class: tb.eff.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.popup.e
            public void a(com.taobao.android.detail.core.detail.popup.b bVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("22a58213", new Object[]{this, bVar2});
                } else if (!gVar.a()) {
                } else {
                    if (bVar2 == null) {
                        b(bVar2);
                    } else {
                        gVar.a(a3, bVar2);
                    }
                }
            }

            @Override // com.taobao.android.detail.core.detail.popup.e
            public void b(com.taobao.android.detail.core.detail.popup.b bVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("507e1c72", new Object[]{this, bVar2});
                } else if (!gVar.a() && !eff.a(eff.this)) {
                } else {
                    if (bVar2 == null || bVar2.a() == null) {
                        eff.a(eff.this, eib.f27316a.c());
                        final View a4 = eff.c(eff.this).a(eff.b(eff.this));
                        eff.c(eff.this).a(new View.OnClickListener() { // from class: tb.eff.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    return;
                                }
                                a2.a(hashMap, this);
                                gVar.a(a3);
                            }
                        });
                        gVar.a(a3, new com.taobao.android.detail.core.detail.popup.b() { // from class: tb.eff.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.detail.core.detail.popup.b
                            public l b() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (l) ipChange3.ipc$dispatch("a3704cae", new Object[]{this});
                                }
                                return null;
                            }

                            @Override // com.taobao.android.detail.core.detail.popup.b
                            public View a() {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? (View) ipChange3.ipc$dispatch("195fbaaa", new Object[]{this}) : a4;
                            }
                        });
                        return;
                    }
                    gVar.a(a3, bVar2);
                }
            }
        });
        return a.SUCCESS;
    }

    private g.b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g.b) ipChange.ipc$dispatch("f58bc10", new Object[]{this, jSONObject});
        }
        g.b bVar = new g.b();
        JSONObject jSONObject2 = jSONObject.getJSONObject("css");
        if (jSONObject2 != null) {
            try {
                bVar.a(jSONObject2.getFloatValue("height"));
            } catch (Exception unused) {
            }
        }
        bVar.a(80);
        return bVar;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a7c7ee", new Object[]{this, gVar});
            return;
        }
        synchronized (this.e) {
            this.e.add(gVar);
        }
    }

    private void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5080624d", new Object[]{this, gVar});
            return;
        }
        synchronized (this.e) {
            this.e.remove(gVar);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.e) {
            if (this.e.size() - 1 < 0) {
                return;
            }
            g gVar = this.e.get(this.e.size() - 1);
            if (gVar != null) {
                gVar.a(false);
            }
        }
    }
}
