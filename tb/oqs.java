package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.f;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.gateway.dispatch.a;
import com.taobao.homepage.business.permission.b;
import com.taobao.realtimerecommend.j;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.topmultitab.c;
import com.taobao.themis.kernel.i;

/* loaded from: classes.dex */
public abstract class oqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32307a;

    static {
        kge.a(-698929528);
    }

    public static /* synthetic */ Runnable a(oqs oqsVar, ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("5c34f5d7", new Object[]{oqsVar, opeVar, jSONObject}) : oqsVar.b(opeVar, jSONObject);
    }

    public static /* synthetic */ String a(oqs oqsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1d3ad19", new Object[]{oqsVar}) : oqsVar.f32307a;
    }

    public static /* synthetic */ void b(oqs oqsVar, ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aae8a73c", new Object[]{oqsVar, opeVar, jSONObject});
        } else {
            oqsVar.c(opeVar, jSONObject);
        }
    }

    public oqs(String str) {
        this.f32307a = str;
    }

    public void a(final ope opeVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a1b3bc", new Object[]{this, opeVar, jSONObject});
            return;
        }
        AwesomeGetData awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        if (TextUtils.isEmpty(this.f32307a) || awesomeGetData == null || awesomeGetData.containers == null || awesomeGetData.containers.get(this.f32307a) == null) {
            return;
        }
        AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(this.f32307a);
        if (awesomeGetContainerData.base == null || !awesomeGetContainerData.base.dataChange) {
            z = false;
        }
        String string = jSONObject.getString("dataChangeType");
        JSONObject clientCache = awesomeGetContainerData.getClientCache();
        if (TextUtils.equals("delta", string)) {
            clientCache = awesomeGetContainerData.getClientCacheDelta();
        }
        lar.g("handleLocationParam");
        a(clientCache);
        lar.h("handleLocationParam");
        lar.g("handleDeltaPassParams");
        oqu.a().a(awesomeGetContainerData);
        lar.h("handleDeltaPassParams");
        laq a2 = laq.a();
        if (awesomeGetData.ext != null && TextUtils.equals("true", awesomeGetData.ext.getString("isSwitchVersionByNewSDK"))) {
            lar.g("onVersionResponse");
            JSONObject jSONObject2 = awesomeGetData.ext.getJSONObject("switchVersionResponse");
            c.a().c().a(jSONObject2);
            lar.h("onVersionResponse");
            a2.a("Revision").b("edition_switch").c("switchNewSdk.");
            if (jSONObject2 != null) {
                a2.c(jSONObject2.toString());
            } else {
                a2.c("versionResponse : null");
            }
        } else {
            lar.g("updateSTDElderHomeInfo");
            f.a(Globals.getApplication(), awesomeGetContainerData.getExt());
            lar.h("updateSTDElderHomeInfo");
            a2.a("Revision").b("edition_switch").c("switchOldSdk.");
        }
        a.b().a(new Runnable() { // from class: tb.oqs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (z) {
                    j.a(oqs.a(oqs.this), jSONObject);
                }
                sed.a(oqs.a(oqs.this, opeVar, jSONObject));
            }
        });
        a2.b();
    }

    private void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("content")) {
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.oqs.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    if (jSONObject2 == null || !jSONObject2.containsKey("LBS")) {
                        return;
                    }
                    b.a(jSONObject2.getString("LBS"));
                }
            });
        }
    }

    private Runnable b(final ope opeVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("d59ef859", new Object[]{this, opeVar, jSONObject}) : new Runnable() { // from class: tb.oqs.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    oqs.b(oqs.this, opeVar, jSONObject);
                }
            }
        };
    }

    private void c(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb90cefa", new Object[]{this, opeVar, jSONObject});
            return;
        }
        laq b = laq.a().a("MTopRequest").b("refreshGlobalControl");
        JSONObject c = opeVar.c();
        if (c == null) {
            b.c("ext == null").b();
            return;
        }
        String string = jSONObject.getString(i.CDN_REQUEST_TYPE);
        if (TextUtils.isEmpty(string)) {
            b.c("requestType == null").b();
        } else if (!c.getBooleanValue("updateLtv")) {
        } else {
            NativeDelegate.refreshGlobalControl(string);
            b.c("通知behaviorX").b();
        }
    }
}
