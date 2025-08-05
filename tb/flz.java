package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.task.Coordinator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class flz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, fjg> f28044a = new HashMap<>();
    private b b;
    private fmd c;
    private fjg d;
    public Map<String, String> e;

    static {
        kge.a(640514797);
    }

    public static /* synthetic */ fjg a(flz flzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fjg) ipChange.ipc$dispatch("372c085f", new Object[]{flzVar}) : flzVar.d;
    }

    public flz(b bVar, fmd fmdVar) {
        this.b = bVar;
        this.c = fmdVar;
        this.d = new fjg(bVar, fmdVar, "Page_NewDetail");
    }

    public void a(String str, fjg fjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893419f", new Object[]{this, str, fjgVar});
        } else {
            this.f28044a.put(str, fjgVar);
        }
    }

    public void a(String str, String str2, String str3, String str4, Map<String, String> map, d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb966e9", new Object[]{this, str, str2, str3, str4, map, dVar, new Boolean(z)});
            return;
        }
        fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                fjgVar.a(str2, str3, str4, map, dVar, z);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.d.a(str2, str3, str4, map, dVar, z);
    }

    public void a(String str, String str2, String str3, String str4, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505f54b", new Object[]{this, str, str2, str3, str4, map, dVar});
        } else {
            a(str, str2, str3, str4, map, dVar, false);
        }
    }

    public void b(String str, String str2, String str3, String str4, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd22dbaa", new Object[]{this, str, str2, str3, str4, map, dVar});
            return;
        }
        fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                fjgVar.a(str2, str3, str4, map, dVar);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.d.a(str2, str3, str4, map, dVar);
    }

    public Map<String, String> a(String str, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a76459de", new Object[]{this, str, map, dVar});
        }
        fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                return fjgVar.a(map, dVar);
            } catch (Exception e) {
                e.printStackTrace();
                return map == null ? new HashMap() : map;
            }
        }
        return this.d.a(map, dVar);
    }

    public void d(String str, final Map<String, String> map, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a198e46", new Object[]{this, str, map, dVar});
            return;
        }
        final fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                Coordinator.execute(new Runnable() { // from class: tb.flz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            fjgVar.b(map, dVar);
                        }
                    }
                }, 28);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        Coordinator.execute(new Runnable() { // from class: tb.flz.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    flz.a(flz.this).b(map, dVar);
                }
            }
        }, 28);
    }

    public void b(String str, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba992708", new Object[]{this, str, map, dVar});
        } else if (ipa.al()) {
            d(str, map, dVar);
        } else {
            fjg fjgVar = this.f28044a.get(str);
            if (fjgVar != null) {
                try {
                    fjgVar.b(map, dVar);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.d.b(map, dVar);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        final fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                Coordinator.execute(new Runnable() { // from class: tb.flz.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            fjgVar.a();
                        }
                    }
                }, 28);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        Coordinator.execute(new Runnable() { // from class: tb.flz.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    flz.a(flz.this).a();
                }
            }
        }, 28);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (ipa.al()) {
            b(str);
        } else {
            fjg fjgVar = this.f28044a.get(str);
            if (fjgVar != null) {
                try {
                    fjgVar.a();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.d.a();
        }
    }

    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                fjgVar.a(map);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.d.a(map);
    }

    public void c(String str, Map<String, String> map, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a595aa7", new Object[]{this, str, map, dVar});
            return;
        }
        fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                fjgVar.c(map, dVar);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.d.c(map, dVar);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        fjg fjgVar = this.f28044a.get(str);
        if (fjgVar != null) {
            try {
                fjgVar.a(jSONObject);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        this.d.a(jSONObject);
    }
}
