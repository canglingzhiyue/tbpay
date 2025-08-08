package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@AURAExtensionImpl(code = axo.AURA_CODE)
/* loaded from: classes2.dex */
public final class axo extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CODE = "aura.impl.event.userTrack";
    public static final String EVENT_TYPE = "userTrack";
    public static final String KEY_ARG1 = "arg1";
    public static final String KEY_ARG2 = "arg2";
    public static final String KEY_ARG3 = "arg3";
    public static final String KEY_ARGS = "args";
    public static final String KEY_EVENT_ID = "eventId";
    public static final String KEY_PAGE = "page";

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f25675a;
    private Boolean b;

    static {
        kge.a(-1346348569);
    }

    public static /* synthetic */ Object ipc$super(axo axoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "userTrack";
    }

    public static /* synthetic */ void a(axo axoVar, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31163f2c", new Object[]{axoVar, aURAEventIO});
        } else {
            axoVar.c(aURAEventIO);
        }
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f25675a = bbh.a(1, 3, 3L, TimeUnit.SECONDS, "AURAUserTrackEvent");
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = (Boolean) b().a("enableAsyncUT", Boolean.class, false);
        }
        Boolean bool = this.b;
        return bool != null && bool.booleanValue();
    }

    @Override // tb.arv
    public void b(final AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (f()) {
            this.f25675a.execute(new Runnable() { // from class: tb.axo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        axo.a(axo.this, aURAEventIO);
                    }
                }
            });
        } else {
            c(aURAEventIO);
        }
    }

    private void c(AURAEventIO aURAEventIO) {
        int intValue;
        String str;
        AURARenderComponent aURARenderComponent;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfc3cd6", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null || (intValue = c.getIntValue("eventId")) == 0) {
            return;
        }
        String string = c.getString("page");
        String string2 = c.getString("arg1");
        String string3 = c.getString("arg2");
        String string4 = c.getString("arg3");
        JSONObject jSONObject = c.getJSONObject("args");
        JSONObject jSONObject2 = new JSONObject();
        AURARenderComponent d = aURAEventIO.getEventModel().d();
        if (d != null && d.data != null && d.data.fields != null) {
            try {
                jSONObject2.putAll(d.data.fields);
            } catch (Exception e) {
                arc.a().c("AURAUserTrackEvent", "doTrack", e.toString());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("fields", (Object) jSONObject2);
        Map<String, String> a2 = a(jSONObject, jSONObject3);
        List<axy> b = c().b(axy.class);
        HashMap hashMap2 = new HashMap(a2);
        if (!b.isEmpty() && d != null) {
            for (axy axyVar : b) {
                if (axyVar != null) {
                    aURARenderComponent = d;
                    String str2 = string4;
                    str = string4;
                    hashMap = hashMap2;
                    Map<String, String> a3 = axyVar.a(new aya(d, string, intValue, string2, string3, str2, a2));
                    if (a3 != null) {
                        hashMap.putAll(a3);
                    }
                } else {
                    str = string4;
                    aURARenderComponent = d;
                    hashMap = hashMap2;
                }
                d = aURARenderComponent;
                hashMap2 = hashMap;
                string4 = str;
            }
        }
        String str3 = string4;
        HashMap hashMap3 = hashMap2;
        List<axz> b2 = c().b(axz.class);
        if (b2.isEmpty()) {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, intValue, string2, string3, str3, hashMap3).build());
            return;
        }
        for (axz axzVar : b2) {
            axzVar.a(string, intValue, string2, string3, str3, hashMap3);
        }
    }

    private Map<String, String> a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2cdc0c9d", new Object[]{this, jSONObject, jSONObject2});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject2 != null) {
            for (String str : jSONObject.keySet()) {
                if (!StringUtils.isEmpty(str)) {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof String) {
                        hashMap.put(str, String.valueOf(axt.a(jSONObject2, obj)));
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        }
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ExecutorService executorService = this.f25675a;
        if (executorService != null && !executorService.isShutdown()) {
            this.f25675a.shutdown();
        }
        this.f25675a = null;
    }
}
