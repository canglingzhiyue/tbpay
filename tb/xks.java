package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.mytaobao.base.b;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/taobao/mytaobao/pagev2/eventhandler/DXMtbClickUTEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xks extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(1762764525);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J-\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/mytaobao/pagev2/eventhandler/DXMtbClickUTEventHandler$Companion;", "", "()V", "commitUT", "", "utParams", "Lcom/alibaba/fastjson/JSONObject;", "performUT", "key", "", "args", "", "userContext", "Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxUserContext;", "(Ljava/lang/String;[Ljava/lang/Object;Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxUserContext;)V", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: tb.xks$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class RunnableC1190a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f34358a;

            public RunnableC1190a(JSONObject jSONObject) {
                this.f34358a = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String string = this.f34358a.getString("page");
                if (string == null) {
                    string = "Page_MyTaobao";
                }
                String str = string;
                Integer integer = this.f34358a.getInteger("eventId");
                mua.a(str, integer != null ? integer.intValue() : 2101, this.f34358a.getString("arg1"), null, null, this.f34358a.getJSONObject("args"));
                JSONObject jSONObject = this.f34358a.getJSONObject("nextPage");
                if (jSONObject == null || jSONObject.isEmpty()) {
                    return;
                }
                HashMap hashMap = new HashMap(jSONObject.keySet().size());
                Set<String> keySet = jSONObject.keySet();
                q.a((Object) keySet, "nextPage.keys");
                for (String str2 : keySet) {
                    hashMap.put(str2, jSONObject.getString(str2));
                }
                UTAnalytics uTAnalytics = UTAnalytics.getInstance();
                q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
                uTAnalytics.getDefaultTracker().updateNextPageProperties(hashMap);
            }
        }

        static {
            kge.a(-1459384843);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final void a(String key, Object[] objArr, xod userContext) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae0189c2", new Object[]{this, key, objArr, userContext});
                return;
            }
            q.c(key, "key");
            q.c(userContext, "userContext");
            JSONObject a2 = userContext.a().a();
            JSONObject jSONObject3 = (a2 == null || (jSONObject = a2.getJSONObject("events")) == null || (jSONObject2 = jSONObject.getJSONObject("clickUt")) == null) ? null : jSONObject2.getJSONObject(key);
            Object a3 = objArr != null ? g.a(objArr, 1) : null;
            if (!(a3 instanceof JSONObject)) {
                a3 = null;
            }
            JSONObject jSONObject4 = (JSONObject) a3;
            if (jSONObject3 == null && jSONObject4 == null) {
                return;
            }
            if (jSONObject3 != null && jSONObject4 == null) {
                a(jSONObject3);
            } else if (jSONObject3 == null && jSONObject4 != null) {
                a(jSONObject4);
            } else {
                if (jSONObject4 == null) {
                    q.a();
                }
                JSONObject jSONObject5 = jSONObject4.getJSONObject("args");
                if (jSONObject5 == null) {
                    jSONObject5 = new JSONObject();
                }
                if (jSONObject3 == null) {
                    q.a();
                }
                JSONObject jSONObject6 = jSONObject3.getJSONObject("args");
                if (jSONObject6 == null) {
                    jSONObject6 = new JSONObject();
                }
                JSONObject jSONObject7 = jSONObject4.getJSONObject("nextPage");
                if (jSONObject7 == null) {
                    jSONObject7 = new JSONObject();
                }
                JSONObject jSONObject8 = jSONObject3.getJSONObject("nextPage");
                if (jSONObject8 == null) {
                    jSONObject8 = new JSONObject();
                }
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.putAll(jSONObject4);
                jSONObject9.putAll(jSONObject3);
                JSONObject jSONObject10 = new JSONObject();
                jSONObject10.putAll(jSONObject5);
                jSONObject10.putAll(jSONObject6);
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.putAll(jSONObject7);
                jSONObject11.putAll(jSONObject8);
                jSONObject9.put("args", (Object) jSONObject10);
                jSONObject9.put("nextPage", (Object) jSONObject11);
                a(jSONObject9);
            }
        }

        private final void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                b.c(new RunnableC1190a(jSONObject));
            }
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        String str = null;
        ba b2 = dXRuntimeContext != null ? dXRuntimeContext.b() : null;
        if (!(b2 instanceof xod)) {
            b2 = null;
        }
        xod xodVar = (xod) b2;
        if (xodVar == null || (b = xodVar.b()) == null || !b.getBooleanValue("disableUtForDXTabEvent")) {
            return;
        }
        Object a2 = objArr != null ? g.a(objArr, 0) : null;
        if (a2 instanceof String) {
            str = a2;
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        Companion.a(str2, objArr, xodVar);
    }
}
