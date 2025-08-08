package tb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.task.Coordinator;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.homepage.business.permission.c;
import com.taobao.homepage.utils.n;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.d;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.homepage.revision.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.themis.kernel.i;

/* loaded from: classes.dex */
public class oqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32299a;

    static {
        kge.a(615548878);
    }

    public static /* synthetic */ String a(oqm oqmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("963dec13", new Object[]{oqmVar}) : oqmVar.f32299a;
    }

    public static /* synthetic */ void a(oqm oqmVar, ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1089997", new Object[]{oqmVar, opeVar, jSONObject});
        } else {
            oqmVar.b(opeVar, jSONObject);
        }
    }

    public oqm(String str) {
        this.f32299a = str;
    }

    public boolean a(final ope opeVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a1b3c0", new Object[]{this, opeVar, jSONObject})).booleanValue();
        }
        AwesomeGetData awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        if (StringUtils.isEmpty(this.f32299a) || awesomeGetData == null || awesomeGetData.containers == null || awesomeGetData.containers.get(this.f32299a) == null) {
            String str = "null";
            laq a2 = laq.a().a("MTopRequest").b("dataProcess").a("containerId", StringUtils.isEmpty(this.f32299a) ? str : this.f32299a);
            if (awesomeGetData != null) {
                str = "not null";
            }
            a2.a(ZimMessageChannel.K_RPC_RES, str).b();
            return false;
        }
        AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(this.f32299a);
        if (awesomeGetContainerData.base != null && awesomeGetContainerData.base.dataChange) {
            z = true;
        }
        JSONObject passParams = awesomeGetContainerData.getPassParams();
        if (z) {
            opeVar.c(awesomeGetData.globalUTParams);
            a.a().a(awesomeGetContainerData.getVersionInfo());
            ovi.a().e();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isBaseRefresh:");
        sb.append(z ? Constants.VAL_YES : "no");
        lap.a("MTopRequest", "dataProcess", sb.toString());
        b(passParams);
        if (n.o() && Build.VERSION.SDK_INT >= 23) {
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: tb.oqm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    oqm.a(oqm.this, opeVar, jSONObject);
                    return false;
                }
            });
        } else {
            b(opeVar, jSONObject);
        }
        lau.a().a(awesomeGetContainerData.getExt());
        a(jSONObject);
        return true;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!"coldStart".equals(jSONObject.getString(i.CDN_REQUEST_TYPE))) {
        } else {
            String m = oqc.a().m();
            d.f(m).a(m, "outPushPlanId");
        }
    }

    private void b(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3219415b", new Object[]{this, opeVar, jSONObject});
            return;
        }
        laq c = laq.a().a("MTopRequest").b("dataProcess").c("MainContainerDataProcess:");
        String string = jSONObject != null ? jSONObject.getString(i.CDN_REQUEST_TYPE) : "";
        c.a(i.CDN_REQUEST_TYPE, string);
        AwesomeGetContainerData b = opeVar.b(this.f32299a);
        if (b == null) {
            c.a("homeMainData:null containerId", this.f32299a).b();
            return;
        }
        if (b.base != null && b.base.ext != null && b.base.isFirstPage) {
            JSONObject jSONObject2 = b.base.ext.getJSONObject("ucpConfig");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Boolean bool = (Boolean) m.a().a("homeNetLowOptimization", Boolean.class);
            if (bool == null || !bool.booleanValue() || !StringUtils.equals(ldc.a(), "l")) {
                UppProtocolImpl.getInstance().addBizFeatures(jSONObject2, "Page_Home");
            }
            c.a("ucpConfig", jSONObject2.toString());
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("containerId", (Object) this.f32299a);
        c.a("containerId", this.f32299a);
        if (StringUtils.isEmpty(string)) {
            string = "pullRefresh";
        }
        jSONObject3.put(i.CDN_REQUEST_TYPE, (Object) string);
        c.a(i.CDN_REQUEST_TYPE, string);
        String str = "base";
        jSONObject3.put("refreshType", (Object) (b.base != null ? str : "delta"));
        if (b.base == null) {
            str = "delta";
        }
        c.a("refreshType", str);
        UppProtocolImpl.getInstance().sendUCPEventWithScene("Page_Home", "request", jSONObject3);
        c.b();
    }

    private void b(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.oqm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SharedPreferences.Editor edit = g.a().getSharedPreferences("homepage_common", 0).edit();
                    if (!StringUtils.isEmpty(jSONObject.getString("lastVersion"))) {
                        c.b(oqr.a(oqm.a(oqm.this)), jSONObject.getString("lastVersion"));
                        edit.putString("HomePageLatestVersion", jSONObject.getString("lastVersion"));
                    }
                    String jSONString = jSONObject.toJSONString();
                    edit.putString("homePassParams", jSONString);
                    edit.commit();
                    Intent intent = new Intent();
                    intent.setAction(mxo.SKIN_BROADCAST_ACTION);
                    intent.putExtra("homePassParams", jSONString);
                    LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
                }
            });
        }
    }
}
