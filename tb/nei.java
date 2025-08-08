package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.JSBridge;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.jsbridge.c;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class nei implements nek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31396a;
    private final AppController b;
    private final JSBridge c;
    private neh d;

    public static /* synthetic */ void a(nei neiVar, nej nejVar, nej nejVar2, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca08a6aa", new Object[]{neiVar, nejVar, nejVar2, arrayList});
        } else {
            neiVar.a(nejVar, nejVar2, arrayList);
        }
    }

    public static /* synthetic */ void b(nei neiVar, nej nejVar, nej nejVar2, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb24cc9", new Object[]{neiVar, nejVar, nejVar2, arrayList});
        } else {
            neiVar.b(nejVar, nejVar2, arrayList);
        }
    }

    static {
        kge.a(-1986233215);
        kge.a(-1337852729);
        f31396a = nei.class.getSimpleName();
    }

    public nei(AppController appController, neh nehVar) {
        this.b = appController;
        this.d = nehVar;
        this.c = new JSBridge(appController, nehVar);
    }

    @Override // tb.nek
    public Object a(nem nemVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b04b5f0", new Object[]{this, nemVar});
        }
        String b = nemVar.b(0);
        String b2 = nemVar.b(1);
        String b3 = nemVar.b(2);
        final nej a2 = nemVar.a(3);
        final nej a3 = nemVar.a(4);
        final ArrayList<Object> arrayList = new ArrayList<>();
        if (this.b.o()) {
            ngr.b(f31396a, "PHA is finished.");
            arrayList.add("PHA is finished.");
            a(a3, a2, arrayList);
            return null;
        } else if (!StringUtils.isEmpty(b) && !StringUtils.isEmpty(b2)) {
            c cVar = new c();
            cVar.d = JSBridge.parseParamsToOptions(b3);
            cVar.b = b;
            cVar.c = b2;
            cVar.f18742a = this.d;
            cVar.f = new a.InterfaceC0751a() { // from class: tb.nei.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    if (jSONObject != null) {
                        arrayList.add(jSONObject.toJSONString());
                    }
                    nei.a(nei.this, a2, a3, arrayList);
                }

                @Override // com.taobao.pha.core.jsbridge.a.InterfaceC0751a
                public void a(PHAErrorType pHAErrorType, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d80500a", new Object[]{this, pHAErrorType, str});
                        return;
                    }
                    arrayList.add(new com.taobao.pha.core.error.a(pHAErrorType, str).toString());
                    nei.a(nei.this, a3, a2, arrayList);
                }
            };
            this.c.call(cVar);
            return null;
        } else {
            arrayList.add("no impl");
            a(a3, a2, arrayList);
            return null;
        }
    }

    private void a(final nej nejVar, final nej nejVar2, final ArrayList<Object> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1273388", new Object[]{this, nejVar, nejVar2, arrayList});
        } else {
            this.d.a(new Runnable() { // from class: tb.nei.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nei.b(nei.this, nejVar, nejVar2, arrayList);
                    }
                }
            });
        }
    }

    private void b(nej nejVar, nej nejVar2, ArrayList<Object> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e88c68a7", new Object[]{this, nejVar, nejVar2, arrayList});
            return;
        }
        try {
            if (nejVar != null) {
                try {
                    nejVar.a(arrayList);
                } catch (Exception e) {
                    String str = f31396a;
                    ngr.b(str, "callFunctionInternal failed \n" + e.toString());
                    if (nejVar != null) {
                        nejVar.a();
                    }
                    if (nejVar2 == null) {
                        return;
                    }
                    nejVar2.a();
                    return;
                }
            }
            if (nejVar != null) {
                nejVar.a();
            }
            if (nejVar2 == null) {
                return;
            }
            nejVar2.a();
        } catch (Throwable th) {
            if (nejVar != null) {
                nejVar.a();
            }
            if (nejVar2 != null) {
                nejVar2.a();
            }
            throw th;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d = null;
        }
    }
}
