package tb;

import android.app.Activity;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.viewholder.b;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.wrapper.ultronengine.event.a;
import com.taobao.android.detail.wrapper.ultronengine.event.c;
import com.taobao.android.detail.wrapper.ultronengine.event.g;
import com.taobao.android.detail.wrapper.ultronengine.event.h;
import com.taobao.android.detail.wrapper.ultronengine.event.i;
import com.taobao.android.detail.wrapper.ultronengine.event.j;
import com.taobao.android.detail.wrapper.ultronengine.event.k;
import com.taobao.android.detail.wrapper.ultronengine.event.l;
import com.taobao.android.detail.wrapper.ultronengine.event.m;
import com.taobao.android.detail.wrapper.ultronengine.event.n;
import com.taobao.android.detail.wrapper.ultronengine.event.o;
import com.taobao.android.detail.wrapper.ultronengine.event.p;
import com.taobao.android.detail.wrapper.ultronengine.event.q;
import com.taobao.android.detail.wrapper.ultronengine.event.r;
import com.taobao.android.detail.wrapper.ultronengine.event.s;
import com.taobao.android.detail.wrapper.ultronengine.event.t;
import com.taobao.android.detail.wrapper.ultronengine.event.u;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Collections;

/* loaded from: classes5.dex */
public class fgi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2038112055);
        emu.a("com.taobao.android.detail.wrapper.ultronengine.UltronEngineUtils");
    }

    public static void a(final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06a2ac7", new Object[]{fVar});
        } else if (fVar == null || fVar.k() == null) {
        } else {
            UnifyLog.d("UltronEngineUtils", "initMainPicVH start");
            d c = fVar.c();
            if (fgv.a((Activity) c.a(), fVar.k())) {
                c.a("picGallery$picGallery", new e() { // from class: tb.fgi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.ultron.vfw.viewholder.e
                    public b a(bny bnyVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar});
                        }
                        joq.a("create new Gallary VH");
                        fgg fggVar = new fgg(bnyVar);
                        f.this.a(fggVar);
                        joq.b("create new Gallary VH");
                        return fggVar;
                    }
                });
                if (!ecu.a("Page_Detail_Use_New_Gallery")) {
                    return;
                }
                fgw.a(true);
                fgw.a();
                return;
            }
            c.a("picGallery$picGallery", new e() { // from class: tb.fgi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.viewholder.e
                public b a(bny bnyVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar});
                    }
                    joq.a("create old Gallary VH");
                    fgh fghVar = new fgh(bnyVar);
                    f.this.a(fghVar);
                    joq.b("create old Gallary VH");
                    return fghVar;
                }
            });
            fgw.a(fVar);
            fgw.a(c.a(), fVar.k());
        }
    }

    public static void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe42c526", new Object[]{fVar});
        } else if (fVar == null) {
        } else {
            UnifyLog.d("UltronEngineUtils", "initUltronInstance start");
            d c = fVar.c();
            c.a(new fgk());
            com.alibaba.android.ultron.event.base.f d = c.d();
            d.a("buyNow", new com.taobao.android.detail.wrapper.ultronengine.event.b());
            d.a("addToCart", new a());
            d.a("collectClick", new com.taobao.android.detail.wrapper.ultronengine.event.d());
            d.a("checkCollect", new c());
            d.a("openSKU", new o());
            d.a("openFloatDialog", new i());
            d.a("openAddress", new g());
            d.a("openPopLayer", new k());
            d.a("openTmallApp", new p());
            d.a("openRedPacket", new m());
            d.a("openRate", new l());
            d.a(h.SUBSCRIBER_ID, new h());
            d.a("openShare", new n());
            d.a("openWW", new q());
            d.a("addJhsWaiting", new t());
            d.a("checkPresale", new r());
            d.a("setRemind", new u());
            d.a(j.SUBSCRIBER_ID, new j());
            d.a("querySMBagPrice", new s());
            d.a("invateRate", new com.taobao.android.detail.wrapper.ultronengine.event.e());
            d.a("update_sku_quantity", new com.taobao.android.detail.wrapper.ultronengine.event.f());
        }
    }

    public static void a(com.alibaba.android.ultron.event.base.e eVar, JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a2a25", new Object[]{eVar, jSONArray, jSONObject});
        } else if (eVar == null) {
        } else {
            com.alibaba.android.ultron.event.base.f d = eVar.h().d();
            com.alibaba.android.ultron.event.base.e a2 = d.a();
            a2.a("adjustState");
            a2.a(eVar.d());
            JSONObject a3 = a(eVar);
            JSONObject jSONObject2 = new JSONObject();
            if (a3 != null) {
                jSONObject2.putAll(a3);
            }
            if (jSONArray != null) {
                jSONObject2.put("dataMergeParams", (Object) jSONArray);
            }
            jSONObject2.put("subType", (Object) "");
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (a3 != null) {
                jSONObject.putAll(a3);
            }
            jSONObject2.put("payload", (Object) jSONObject);
            a2.a(new DMEvent("adjustState", jSONObject2, Collections.singletonList(eVar.d())));
            d.a(a2);
        }
    }

    private static JSONObject a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8b1423", new Object[]{eVar});
        }
        if (eVar == null) {
            return null;
        }
        Object i = eVar.i();
        if (!(i instanceof com.taobao.android.ultron.common.model.b)) {
            return null;
        }
        return ((com.taobao.android.ultron.common.model.b) i).getFields();
    }
}
