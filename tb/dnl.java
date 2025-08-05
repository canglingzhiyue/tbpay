package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.adam.common.b;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.g;
import com.taobao.android.dinamicx.eventchain.j;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class dnl implements dnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, DXWidgetNode> f26870a = new HashMap<>(4);
    private HashMap<String, String> c = new HashMap<>(4);

    static {
        kge.a(-727850082);
        kge.a(52393184);
    }

    public static /* synthetic */ HashMap a(dnl dnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("67ea8259", new Object[]{dnlVar}) : dnlVar.c;
    }

    public static /* synthetic */ void a(dnl dnlVar, boolean z, Context context, DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8316f5a5", new Object[]{dnlVar, new Boolean(z), context, dinamicXEngine, str});
        } else {
            dnlVar.a(z, context, dinamicXEngine, str);
        }
    }

    public static /* synthetic */ boolean a(dnl dnlVar, DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a9646b8", new Object[]{dnlVar, dXRuntimeContext, dXWidgetNode, str, str2, jSONObject})).booleanValue() : dnlVar.a(dXRuntimeContext, dXWidgetNode, str, str2, jSONObject);
    }

    public static /* synthetic */ boolean a(dnl dnlVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9bec322", new Object[]{dnlVar, new Boolean(z)})).booleanValue();
        }
        dnlVar.b = z;
        return z;
    }

    public static /* synthetic */ HashMap b(dnl dnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("7cd34a9a", new Object[]{dnlVar}) : dnlVar.f26870a;
    }

    public static /* synthetic */ boolean c(dnl dnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c27fcb7c", new Object[]{dnlVar})).booleanValue() : dnlVar.b;
    }

    public static /* synthetic */ boolean d(dnl dnlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b102d1fd", new Object[]{dnlVar})).booleanValue() : dnlVar.a();
    }

    @Override // tb.dnm
    public dnd a(dnc dncVar, DXEvent dXEvent, Object[] objArr, final dmz dmzVar) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        boolean z;
        DinamicXEngine dinamicXEngine;
        String str3;
        DinamicXEngine dinamicXEngine2;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dnd) ipChange.ipc$dispatch("2f23671d", new Object[]{this, dncVar, dXEvent, objArr, dmzVar});
        }
        if (dmzVar == null || dmzVar.b() == null || objArr == null || objArr.length <= 0) {
            return dnd.a();
        }
        boolean b = Util.b();
        if (b) {
            this.c.clear();
        }
        this.b = false;
        String valueOf = String.valueOf(objArr[0]);
        JSONObject jSONObject3 = (objArr.length <= 1 || !(objArr[1] instanceof JSONObject)) ? null : (JSONObject) objArr[1];
        final DXRuntimeContext a2 = dmzVar.a();
        if (a2 == null || a2.C() == null) {
            return dnd.a();
        }
        final DinamicXEngine b2 = a2.C().b();
        if (b2 == null) {
            return dnd.a();
        }
        List<JSONObject> list = (List) dmzVar.b().get("templates");
        String str5 = "LOG_ADAM";
        if (list == null || list.isEmpty()) {
            TLog.logi(null, str5, "templates is null, eventName = " + objArr[0]);
            return dnd.a();
        }
        JSONObject jSONObject4 = (JSONObject) dmzVar.b().get("global_adam_config");
        if (jSONObject4 == null) {
            jSONObject4 = Util.a();
        }
        JSONObject jSONObject5 = jSONObject4;
        JSONObject jSONObject6 = (JSONObject) dmzVar.b().get("event_adam_config");
        String str6 = "true";
        String str7 = "showLoading";
        boolean parseBoolean = (jSONObject6 == null || jSONObject6.get(str7) == null) ? Boolean.parseBoolean(jSONObject5.getString(str7)) : str6.equals(String.valueOf(jSONObject6.get(str7)));
        for (JSONObject jSONObject7 : list) {
            DXWidgetNode dXWidgetNode = this.f26870a.get(jSONObject7.getString("url"));
            final boolean z2 = parseBoolean;
            String str8 = valueOf;
            String str9 = str7;
            final String str10 = valueOf;
            String str11 = str6;
            if (a(a2, dXWidgetNode, str8, jSONObject7.getString("url"), jSONObject3)) {
                Util.a("globalEventChain", (Map) dmzVar.b().get("utParams"));
                a(z2, a2.m(), b2, "hideLoading");
                TLog.logi(null, str5, "handle evChain by global template(cache), eventName = " + objArr[0]);
                return dnd.b();
            } else if (dXWidgetNode == null) {
                String string = (jSONObject6 == null || jSONObject6.getString("renderType") == null) ? jSONObject5.getString("renderType") : jSONObject6.getString("renderType");
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("sharedEngine", (Object) str11);
                jSONObject8.put("refreshType", (Object) string);
                jSONObject8.put("template", (Object) jSONObject7);
                final jnk jnkVar = new jnk(jSONObject8);
                final jnl jnlVar = new jnl(a2.m(), jnkVar, a2.A(), null);
                if (b || !this.c.containsKey(jnkVar.a().c)) {
                    this.c.put(jnkVar.a().c, str10);
                    str = str11;
                    final boolean z3 = b;
                    str2 = str10;
                    jSONObject = jSONObject6;
                    jSONObject2 = jSONObject5;
                    final JSONObject jSONObject9 = jSONObject3;
                    z = b;
                    dinamicXEngine = b2;
                    str3 = str5;
                    jnlVar.a(new jnn() { // from class: tb.dnl.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.jnn
                        public void a(DXRootView dXRootView) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
                                return;
                            }
                            String str12 = z3 ? str10 : (String) dnl.a(dnl.this).get(jnkVar.a().c);
                            dnl.a(dnl.this).remove(jnkVar.a().c);
                            DXResult<DXRootView> a3 = jnlVar.a().a(a2.m(), dXRootView, dXRootView.getDxTemplateItem(), (JSONObject) null, -1, new DXRenderOptions.a().a());
                            if (a3.f11780a != null || !a3.b()) {
                                dnl.b(dnl.this).put(jnkVar.a().c, a3.f11780a.getExpandWidgetNode());
                                if (!dnl.c(dnl.this) && dnl.a(dnl.this, a2, a3.f11780a.getExpandWidgetNode(), str12, jnkVar.a().c, jSONObject9)) {
                                    dnl.a(dnl.this, true);
                                    dnl.a(dnl.this, z2, a2.m(), b2, "hideLoading");
                                    TLog.logi(null, "LOG_ADAM", "handle evChain by global template, eventName = " + str12);
                                    Util.a("globalEventChain", (Map) dmzVar.b().get("utParams"));
                                }
                            }
                            if (!dnl.d(dnl.this) || dnl.c(dnl.this)) {
                                return;
                            }
                            dnl.a(dnl.this, z2, a2.m(), b2, "hideLoading");
                            AppMonitor.Counter.commit("ADAM_MONITOR", "NOT_FOUND_GLOBAL_EVENT", 1.0d);
                        }

                        @Override // tb.jnn
                        public void a(String str12, s sVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("c703f88f", new Object[]{this, str12, sVar});
                                return;
                            }
                            dnl.a(dnl.this).remove(jnkVar.a().c);
                            if (dnl.d(dnl.this) && !dnl.c(dnl.this)) {
                                dnl.a(dnl.this, z2, a2.m(), b2, "hideLoading");
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("dxCreateViewError ");
                            sb.append(str12);
                            sb.append(" error info: ");
                            sb.append(sVar == null ? "" : sVar.toString());
                            String sb2 = sb.toString();
                            TLog.logi(null, "LOG_ADAM", sb2 + " templateUrl = " + jnkVar.a().c);
                            AppMonitor.Counter.commit("ADAM_MONITOR", "NOT_FOUND_GLOBAL_EVENT", sb2, 1.0d);
                        }
                    });
                } else {
                    this.c.put(jnkVar.a().c, str10);
                    str2 = str10;
                    jSONObject = jSONObject6;
                    jSONObject2 = jSONObject5;
                    str3 = str5;
                    dinamicXEngine = b2;
                    z = b;
                    str = str11;
                }
                if (this.b) {
                    break;
                }
                if (!a()) {
                    dinamicXEngine2 = dinamicXEngine;
                    str4 = str9;
                    a(z2, a2.m(), dinamicXEngine2, str4);
                } else {
                    dinamicXEngine2 = dinamicXEngine;
                    str4 = str9;
                }
                b = z;
                b2 = dinamicXEngine2;
                str7 = str4;
                parseBoolean = z2;
                str6 = str;
                valueOf = str2;
                jSONObject6 = jSONObject;
                jSONObject5 = jSONObject2;
                str5 = str3;
            } else {
                parseBoolean = z2;
                str6 = str11;
                str7 = str9;
                valueOf = str10;
            }
        }
        if (this.b) {
            return dnd.b();
        }
        return dnd.a(a() ? dnd.b : dnd.f26865a);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c.isEmpty();
    }

    private void a(boolean z, Context context, DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6682dd97", new Object[]{this, new Boolean(z), context, dinamicXEngine, str});
        } else if (!z) {
        } else {
            Util.a(context, dinamicXEngine, str);
        }
    }

    private boolean a(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4db43aa", new Object[]{this, dXRuntimeContext, dXWidgetNode, str, str2, jSONObject})).booleanValue();
        }
        if (dXWidgetNode == null || b.a(dXWidgetNode.getDXRuntimeContext(), str) == null) {
            return false;
        }
        j a2 = dXRuntimeContext.C().b().a(str, dXRuntimeContext.d(), dXWidgetNode, jSONObject, (String) null, (g) null);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("execute result = ");
        sb.append(a2 != null ? Integer.valueOf(a2.a()) : "null");
        TLog.logi(null, "LOG_ADAM", sb.toString());
        return true;
    }
}
