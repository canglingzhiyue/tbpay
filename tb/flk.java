package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.android.detail2.core.framework.view.manager.ListViewManager;
import java.util.Iterator;
import java.util.List;
import tb.ipa;

/* loaded from: classes5.dex */
public class flk implements ListViewManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fmd f28030a;
    public DetailDataManager b;
    public List<flr> c;
    public b d;
    public com.taobao.android.detail2.core.framework.view.manager.b e;
    private long f;
    private boolean g = false;
    private boolean h = false;

    static {
        kge.a(2054982467);
        kge.a(-1621731880);
    }

    public static /* synthetic */ long a(flk flkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8c6cc47", new Object[]{flkVar})).longValue() : flkVar.f;
    }

    public static /* synthetic */ void a(flk flkVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef99aa9", new Object[]{flkVar, dVar});
        } else {
            flkVar.d(dVar);
        }
    }

    public flk(b bVar, fmd fmdVar, DetailDataManager detailDataManager, com.taobao.android.detail2.core.framework.view.manager.b bVar2, List<flr> list) {
        this.f28030a = fmdVar;
        this.b = detailDataManager;
        this.d = bVar;
        this.c = list;
        this.e = bVar2;
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d a2 = this.f28030a.a(0);
        if (a2 == null || a2.y) {
            return;
        }
        d l = this.f28030a.l();
        if (l != null) {
            this.b.a(l.k, true);
        }
        Iterator<flr> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a
    public void a(com.taobao.android.detail2.core.framework.view.feeds.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("799501f7", new Object[]{this, dVar});
        } else if (dVar != null && dVar.H() != null) {
            if (dVar.H().f == 0 && dVar.H().y) {
                return;
            }
            for (flr flrVar : this.c) {
                if (flrVar != null) {
                    flrVar.b(dVar);
                }
            }
            if (!dVar.D()) {
                return;
            }
            a(dVar.H(), dVar.F());
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a
    public void b(com.taobao.android.detail2.core.framework.view.feeds.d dVar) {
        d dVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340aa278", new Object[]{this, dVar});
        } else if (dVar != null && dVar.H() != null) {
            if (dVar.H().f == 0 && dVar.H().y) {
                return;
            }
            fjt.a(fjt.TAG_REARRANGE, "当前上屏：" + dVar.H().k);
            int a2 = this.f28030a.a(dVar.H().k, dVar.H().f);
            int size = (this.f28030a.m().size() - a2) - 1;
            Activity g = this.d.g();
            fjt.a(g, fjt.TAG_RENDER, "onItemRender--->currentPosition: " + dVar.H().f + ", distance: " + size + ", currentId: " + dVar.H().k);
            if (size <= b().aj()) {
                if (this.d.k() != null && this.d.k().c() && this.d.h().b().aE()) {
                    this.d.k().a(new NewDetailMaskFrameLayout.b() { // from class: tb.flk.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                        public String b() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "InstanceList fetchRecommendListForNextPage";
                        }

                        @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                        public long c() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Number) ipChange2.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
                            }
                            return 2L;
                        }

                        @Override // com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.b
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            d dVar3 = flk.this.f28030a.m().get(flk.this.f28030a.m().size() - 1);
                            if (dVar3 == null) {
                                return;
                            }
                            ctu.a("fetchRecommendListForNextPage 1");
                            flk.this.b.a(dVar3.k, true);
                            ctu.a();
                        }
                    });
                } else {
                    d dVar3 = this.f28030a.m().get(this.f28030a.m().size() - 1);
                    if (dVar3 != null) {
                        ctu.a("fetchRecommendListForNextPage 2");
                        this.b.a(dVar3.k, true);
                        ctu.a();
                    }
                }
            }
            if (b().n() && a2 <= c().g() && this.f28030a.m() != null && this.f28030a.m().size() > 0 && (dVar2 = this.f28030a.m().get(0)) != null) {
                this.b.a(dVar2.k, true, true);
            }
            for (flr flrVar : this.c) {
                if (flrVar != null) {
                    flrVar.a(dVar);
                }
            }
            a(dVar.H(), dVar.F());
        }
    }

    private fkr b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("16b647d0", new Object[]{this}) : this.d.h();
    }

    private fkt c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("1e67ed6d", new Object[]{this}) : b().b();
    }

    @Override // com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a
    public void c(com.taobao.android.detail2.core.framework.view.feeds.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8042f9", new Object[]{this, dVar});
            return;
        }
        Iterator<flr> it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(final d dVar, int i) {
        final int X;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c91b7305", new Object[]{this, dVar, new Integer(i)});
        } else if (ipa.S()) {
            if (i == 0) {
                if (this.g) {
                    X = ipa.X();
                } else if (ipa.au()) {
                    X = ipa.X() / 20;
                    if (!this.h) {
                        a(dVar);
                    }
                } else if (this.h) {
                    X = (ipa.X() << 1) + 1;
                } else {
                    a(dVar);
                    X = ipa.X() << 1;
                }
            } else {
                this.g = true;
                X = ipa.X();
            }
            this.h = true;
            ipa.d dVar2 = new ipa.d() { // from class: tb.flk.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "doUpdateFixUI";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (d() < flk.a(flk.this)) {
                    } else {
                        flk.a(flk.this, dVar);
                    }
                }

                @Override // tb.ipa.c
                public int c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : X;
                }
            };
            this.f = dVar2.d();
            ipa.c(dVar2);
        } else {
            this.f = 2147483647L;
            d(dVar);
        }
    }

    private void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a363f7be", new Object[]{this, dVar});
        } else {
            c(dVar);
        }
    }

    private void d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c4d941", new Object[]{this, dVar});
            return;
        }
        this.f28030a.a(dVar);
        c(dVar);
        b(dVar);
    }

    private void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd9983f", new Object[]{this, dVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(dVar.f));
        jSONObject.put("position", (Object) Integer.valueOf(this.f28030a.f(dVar.k)));
        jSONObject.put(com.taobao.android.detail2.core.framework.view.feeds.d.KEY_CURRENT_SHOW_INDEX, (Object) Integer.valueOf(this.f28030a.e()));
        jSONObject.putAll(dVar.Q());
        this.f28030a.b("pageLayerScrollRefresh", jSONObject);
    }

    private void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184f38c0", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            this.d.f().updateBatteryBarDarkMode(dVar.E());
        }
    }
}
