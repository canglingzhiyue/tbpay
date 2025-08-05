package com.taobao.mytaobao.ultron;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jny;
import tb.kge;
import tb.mtp;
import tb.muh;
import tb.mxe;
import tb.mxk;
import tb.mxz;
import tb.nwv;
import tb.xnt;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_KEY_MTB_MINIAPP_UPDATE_TIME = "ultron_mtb_miniapp_update_time";
    public static final String CACHE_KEY_ULTRON_MTB = "ultron_mtb_only_response";
    public static final String CACHE_KEY_ULTRON_SEC_SCREEN = "ultron_mtb_second_screen_response";
    public static final String CACHE_KEY_UPDATE_TIME = "ultron_mtb_update_time";
    public static final long DEFAULT_INFO_DATA_EXPIRES_TIME = 480;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static b f18491a;
    public JSONObject b;
    private JSONObject c;
    public String d;
    private boolean e = false;

    static {
        kge.a(-10249731);
        TAG = b.class.getSimpleName();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("bdc4a5f4", new Object[0]);
        }
        if (f18491a == null) {
            synchronized (b.class) {
                if (f18491a == null) {
                    f18491a = new b();
                }
            }
        }
        return f18491a;
    }

    private JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2185e711", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = null;
        Object b = muh.b(CACHE_KEY_ULTRON_MTB);
        if (b != null && (b instanceof JSONObject)) {
            jSONObject2 = (JSONObject) b;
        }
        nwv.a(jSONObject2);
        this.b = jSONObject2;
        this.d = e(jSONObject2);
        return this.b;
    }

    public JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("352dba92", new Object[]{this});
        }
        JSONObject d = d(this.b);
        if (d != null) {
            return d.getJSONObject("skin");
        }
        return null;
    }

    public JSONObject b() {
        Object b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = null;
        if (Login.checkSessionValid() && (b = muh.b(CACHE_KEY_ULTRON_SEC_SCREEN)) != null && (b instanceof JSONObject)) {
            jSONObject2 = (JSONObject) b;
        }
        this.c = jSONObject2;
        return this.c;
    }

    private JSONObject n() {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this});
        }
        if (com.taobao.mytaobao.base.c.p()) {
            if (System.currentTimeMillis() % 10 == 1) {
                com.taobao.mytaobao.base.c.k = 2;
                a2 = mxk.a(Globals.getApplication(), "mytaobao/ultron_mtb_2024_nv.json");
            } else {
                com.taobao.mytaobao.base.c.k = 1;
                a2 = mxk.a(Globals.getApplication(), "mytaobao/ultron_mtb_2024.json");
            }
        } else {
            com.taobao.mytaobao.base.c.k = 0;
            a2 = mxk.a(Globals.getApplication(), "mytaobao/ultron_mtb_2022.json");
        }
        return JSON.parseObject(a2);
    }

    private JSONObject q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab1caf98", new Object[]{this});
        }
        JSONObject j = j();
        if (j == null) {
            mxe.INSTANCE.a(1);
            TLog.loge("mtbMainLink", "主接口getMTBCache为空，登录状态:" + Login.checkSessionValid());
            j = n();
            if (j == null) {
                TLog.loge("mtbMainLink", "主接口getMTBAsset为空");
            }
            this.b = j;
            this.d = e(j);
        } else {
            mxe.INSTANCE.a(0);
        }
        return j;
    }

    public JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("48d58e13", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        return jSONObject != null ? jSONObject : q();
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : b();
    }

    public boolean f() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            j = Long.parseLong(muh.a(CACHE_KEY_MTB_MINIAPP_UPDATE_TIME));
        } catch (Exception unused) {
            j = 0;
        }
        return j != 0 && j + g() >= TimeStampManager.instance().getCurrentTimeStamp();
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        long j = mxz.f;
        return j > 0 ? j * 1000 : j;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject d = d(jSONObject);
        if (d == null) {
            return;
        }
        if (d.getBooleanValue("openNewService")) {
            muh.a("mtbPageV2", "true");
            if (this.e) {
                return;
            }
            this.e = true;
            com.taobao.mytaobao.dataservice.datasource.d dVar = new com.taobao.mytaobao.dataservice.datasource.d();
            dVar.a(new com.taobao.mytaobao.dataservice.datasource.c(Login.getUserId()));
            dVar.a(4, (xnt) null);
            return;
        }
        muh.a("mtbPageV2", "false");
    }

    public void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null) {
        } else {
            if (CACHE_KEY_ULTRON_MTB.equalsIgnoreCase(str)) {
                this.b = jSONObject;
                this.d = e(jSONObject);
                muh.a(CACHE_KEY_ULTRON_MTB, jSONObject);
                muh.a(CACHE_KEY_MTB_MINIAPP_UPDATE_TIME, Long.valueOf(TimeStampManager.instance().getCurrentTimeStamp()));
                a(jSONObject);
                return;
            }
            this.c = jSONObject;
            muh.a(str, jSONObject);
        }
    }

    public void a(final MtopResponse mtopResponse, jny jnyVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db24f92", new Object[]{this, mtopResponse, jnyVar, str});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MtopResponse mtopResponse2 = mtopResponse;
                    if (mtopResponse2 == null || mtopResponse2.getBytedata() == null) {
                        return;
                    }
                    b.this.a(JSON.parseObject(new String(mtopResponse.getBytedata())), str);
                }
            });
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.b = null;
        this.d = null;
        muh.c(CACHE_KEY_UPDATE_TIME);
        muh.c(CACHE_KEY_ULTRON_MTB);
        muh.c(CACHE_KEY_ULTRON_SEC_SCREEN);
        muh.c(CACHE_KEY_MTB_MINIAPP_UPDATE_TIME);
        muh.c("ultron_mtb_upp_delta");
        com.taobao.mytaobao.ut.c.a("Page_MyTaobao", 19999, "upp_async", "async_remove", (String) null, (JSONObject) null);
    }

    private String e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19cf1c", new Object[]{this, jSONObject});
        }
        JSONObject d = d(jSONObject);
        if (d != null && (jSONObject2 = d.getJSONObject("skin")) != null) {
            return jSONObject2.getString("vipType");
        }
        return null;
    }

    public JSONObject d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed36a885", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("data");
        } catch (Throwable unused) {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            return jSONObject2.getJSONObject("global");
        }
        return null;
    }

    public static JSONArray b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("aaec3d37", new Object[]{jSONObject});
        }
        if (jSONObject == null || !jSONObject.containsKey("data") || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return null;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            if (entry.getKey().contains("orderModule")) {
                JSONObject jSONObject4 = (JSONObject) entry.getValue();
                if (jSONObject4 != null && (jSONObject3 = jSONObject4.getJSONObject("fields")) != null) {
                    return jSONObject3.getJSONArray(mtp.DELIVER_LIST);
                }
                return null;
            }
        }
        return null;
    }

    public JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return com.taobao.mytaobao.basement.a.a(jSONObject.getJSONObject("data"));
        }
        return null;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.b = null;
        this.d = null;
        f18491a = null;
    }
}
