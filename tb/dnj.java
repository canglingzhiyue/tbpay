package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J:\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u0011J1\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010\u001cR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u001e"}, d2 = {"Lcom/taobao/android/adam/dx/DXAdamEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "defaultConfig", "Lcom/alibaba/fastjson/JSONObject;", "(Lcom/alibaba/fastjson/JSONObject;)V", "chainManager", "Lcom/taobao/android/adam/ChainManager;", "getDefaultConfig", "()Lcom/alibaba/fastjson/JSONObject;", "setDefaultConfig", "generateAdamConfig", "adamSrcConfig", "userCtx", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "prepareBindEventWithArgs", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "Companion", "adam_android_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public class dnj extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final long DX_EVENT_ADAMEVENTHANDLER = -6706146806808532893L;

    /* renamed from: a  reason: collision with root package name */
    private dna f26869a;
    private JSONObject b;

    static {
        kge.a(-157788895);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(dnj dnjVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dnj(JSONObject defaultConfig) {
        q.c(defaultConfig, "defaultConfig");
        this.b = defaultConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dnj() {
        /*
            r2 = this;
            com.alibaba.fastjson.JSONObject r0 = com.taobao.android.adam.common.Util.a()
            java.lang.String r1 = "Util.getDefaultAdamConfig()"
            kotlin.jvm.internal.q.a(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dnj.<init>():void");
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] args, DXRuntimeContext runtimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, args, runtimeContext});
            return;
        }
        q.c(args, "args");
        q.c(runtimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(args, runtimeContext);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null) {
        } else {
            int length = objArr.length;
            JSONObject jSONObject = null;
            JSONObject jSONObject2 = jSONObject;
            int i = 0;
            String str = null;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                int i3 = i + 1;
                if (i == 0) {
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    str = (String) obj;
                } else if (i == 1) {
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject3 = (JSONObject) obj;
                    Object obj2 = jSONObject3 != null ? jSONObject3.get("parserAdamConfigPrefix") : null;
                    if (!(obj2 instanceof JSONObject)) {
                        obj2 = null;
                    }
                    jSONObject = (JSONObject) obj2;
                    jSONObject2 = jSONObject3;
                } else {
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject4 = (JSONObject) obj;
                    Object obj3 = jSONObject4 != null ? jSONObject4.get("parserAdamConfigPrefix") : null;
                    if (!(obj3 instanceof JSONObject)) {
                        obj3 = null;
                    }
                    jSONObject = (JSONObject) obj3;
                }
                i2++;
                i = i3;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f26869a == null) {
                this.f26869a = new dna();
            }
            dmz dmzVar = new dmz();
            dmzVar.a(dXRuntimeContext);
            HashMap<String, Object> hashMap = new HashMap<>();
            HashMap<String, Object> hashMap2 = hashMap;
            hashMap2.put("event_adam_config", a(jSONObject, hashMap));
            hashMap2.put("global_adam_config", this.b);
            hashMap2.put("utParams", Util.a("adamEventHandler", str, dXRuntimeContext));
            dmzVar.a(hashMap2);
            try {
                dna dnaVar = this.f26869a;
                if (dnaVar == null) {
                    q.a();
                }
                dnaVar.a((dnm) null, dXEvent, new Object[]{str, jSONObject2}, dmzVar);
            } catch (Throwable th) {
                AppMonitor.Counter.commit("ADAM_MONITOR", "AdamEvHandler-ERROR", "msg = " + th.toString(), 1.0d);
                TLog.logi(null, "LOG_ADAM", "execute evChain from adamEventHandler error: " + th.getMessage());
            }
            Util.a("exposure_dxAdamEventHandler", (Map<String, String>) null);
        }
    }

    public final JSONObject a(JSONObject jSONObject, HashMap<String, Object> userCtx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3c02d84b", new Object[]{this, jSONObject, userCtx});
        }
        q.c(userCtx, "userCtx");
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (q.a((Object) key, (Object) "showloading")) {
                jSONObject2.put((JSONObject) "showLoading", (String) Boolean.valueOf(q.a((Object) "true", entry.getValue())));
            } else if (q.a((Object) key, (Object) "rendertype")) {
                jSONObject2.put((JSONObject) "renderType", (String) entry.getValue());
            } else if (q.a((Object) key, (Object) "readCurTemplate")) {
                jSONObject2.put((JSONObject) "readCurTemplate", (String) entry.getValue());
            } else if (q.a((Object) key, (Object) bao.CACHE_KEY_TEMPLATE_INFO)) {
                Object value = entry.getValue();
                if (!(value instanceof JSONArray)) {
                    value = null;
                }
                JSONArray<Object> jSONArray = (JSONArray) value;
                if (jSONArray != null) {
                    for (Object obj : jSONArray) {
                        List b = n.b((CharSequence) obj.toString(), new String[]{","}, false, 0, 6, (Object) null);
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = jSONObject3;
                        jSONObject4.put((JSONObject) "url", b.size() > 0 ? (String) b.get(0) : null);
                        jSONObject4.put((JSONObject) "name", b.size() > 1 ? (String) b.get(1) : null);
                        jSONObject4.put((JSONObject) "version", b.size() > 2 ? (String) b.get(2) : null);
                        arrayList.add(jSONObject3);
                    }
                }
            }
        }
        userCtx.put("templates", arrayList);
        return jSONObject2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/adam/dx/DXAdamEventHandler$Companion;", "", "()V", "DX_EVENT_ADAMEVENTHANDLER", "", "adam_android_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(922553129);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
