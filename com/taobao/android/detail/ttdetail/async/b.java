package com.taobao.android.detail.ttdetail.async;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncModule;
import com.taobao.android.detail.ttdetail.async.mtop.a;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ah;
import com.taobao.android.detail.ttdetail.utils.au;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.avr;
import tb.dwv;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_LIST_NAME = "asyncModuleEntry";
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    public static final String KEY_ASYNC_STATUS_INIT = "init";
    public static final List<String> sEventTypes;

    /* renamed from: a  reason: collision with root package name */
    private Handler f10490a = new Handler(Looper.getMainLooper());
    private eyx b;

    /* loaded from: classes4.dex */
    public interface a {
        void a(JSONObject jSONObject, JSONObject jSONObject2);

        void a(String str);
    }

    public static /* synthetic */ Handler a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("7ef839eb", new Object[]{bVar}) : bVar.f10490a;
    }

    public static /* synthetic */ JSONObject a(b bVar, JSONObject jSONObject, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("6a593766", new Object[]{bVar, jSONObject, list}) : bVar.a(jSONObject, list);
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, JSONObject jSONObject2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fc3cf1", new Object[]{bVar, jSONObject, jSONObject2, aVar});
        } else {
            bVar.a(jSONObject, jSONObject2, aVar);
        }
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, List list, eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7c17c51", new Object[]{bVar, jSONObject, list, eyyVar});
        } else {
            bVar.b(jSONObject, list, eyyVar);
        }
    }

    public static /* synthetic */ void a(b bVar, AsyncModule asyncModule, eyy eyyVar, a aVar, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7152cad", new Object[]{bVar, asyncModule, eyyVar, aVar, runtimeAbilityParamArr});
        } else {
            bVar.a(asyncModule, eyyVar, aVar, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faf393b", new Object[]{bVar, str, aVar});
        } else {
            bVar.a(str, aVar);
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z, AsyncModule.b bVar2, eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c2ac93", new Object[]{bVar, new Boolean(z), bVar2, eyyVar});
        } else {
            bVar.a(z, bVar2, eyyVar);
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z, AsyncModule.b bVar2, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1614f7ce", new Object[]{bVar, new Boolean(z), bVar2, runtimeAbilityParamArr});
        } else {
            bVar.a(z, bVar2, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ boolean a(b bVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("893b3fe3", new Object[]{bVar, jSONObject, str})).booleanValue() : bVar.a(jSONObject, str);
    }

    public static /* synthetic */ boolean a(b bVar, AsyncModule.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33949869", new Object[]{bVar, aVar, jSONObject})).booleanValue() : bVar.a(aVar, jSONObject);
    }

    static {
        kge.a(1017950748);
        sEventTypes = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.async.AsyncProcessor$1
            {
                add(avr.EVENT_TYPE);
                add(dwv.EVENT_TYPE);
            }
        };
    }

    public b(eyx eyxVar) {
        this.b = eyxVar;
    }

    public boolean a(final eyy eyyVar, final a aVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34aeaa11", new Object[]{this, eyyVar, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (eyyVar == null) {
            a("AsyncProcessor#process() componentHolder param is null", aVar);
            return false;
        }
        JSONObject c = c(eyyVar);
        if (c == null) {
            a("AsyncProcessor#process() asyncFields param is null", aVar);
            return false;
        } else if (eyyVar.d() == null) {
            a("AsyncProcessor#process() componentHolder's fields is null", aVar);
            return false;
        } else {
            final AsyncModule asyncModule = new AsyncModule(c);
            if (asyncModule.a() == null) {
                a("AsyncProcessor#process() mtopConfig is null", aVar);
                return false;
            }
            if (d(eyyVar)) {
                a(asyncModule, new a.InterfaceC0402a() { // from class: com.taobao.android.detail.ttdetail.async.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.async.mtop.a.InterfaceC0402a
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        } else if (b.a(b.this, asyncModule.a(), jSONObject)) {
                            b.a(b.this, asyncModule, eyyVar, aVar, runtimeAbilityParamArr);
                        } else {
                            a("mergeDependencyToCurrentMtopRequestData failure");
                        }
                    }

                    @Override // com.taobao.android.detail.ttdetail.async.mtop.a.InterfaceC0402a
                    public void a(final String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                            return;
                        }
                        b.a(b.this, false, asyncModule.b(), eyyVar);
                        b.a(b.this).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.async.b.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                b.a(b.this, str, aVar);
                                b.a(b.this, false, asyncModule.b(), runtimeAbilityParamArr);
                            }
                        });
                    }
                });
            } else {
                a(asyncModule, eyyVar, aVar, runtimeAbilityParamArr);
            }
            return true;
        }
    }

    private void a(boolean z, AsyncModule.b bVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("776f6f3b", new Object[]{this, new Boolean(z), bVar, runtimeAbilityParamArr});
        } else if (this.b != null && bVar != null) {
            JSONArray jSONArray = null;
            if (z) {
                AsyncModule.c a2 = bVar.a();
                if (a2 != null) {
                    jSONArray = a2.b();
                }
            } else {
                AsyncModule.c b = bVar.b();
                if (b != null) {
                    jSONArray = b.b();
                }
            }
            if (jSONArray == null || jSONArray.isEmpty()) {
                return;
            }
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && !jSONObject.isEmpty()) {
                    this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(jSONObject), runtimeAbilityParamArr);
                }
            }
        }
    }

    private boolean a(AsyncModule.a aVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7297d9c", new Object[]{this, aVar, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(dwv.KEY_RECOMMEND_ID_INFO);
        String str2 = "";
        if (jSONObject2 != null) {
            str = jSONObject2.getString(dwv.KEY_RECOMMEND_IDS);
            if (str == null) {
                str = str2;
            }
            String string = jSONObject2.getString(dwv.KEY_SMART_FLAG);
            if (string != null) {
                str2 = string;
            }
        } else {
            str = str2;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("flag", (Object) str2);
        aVar.a(jSONObject3);
        JSONObject jSONObject4 = aVar.c().getJSONObject("params");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject4.put(dwv.KEY_RECOMMEND_ITEM_ID, (Object) str);
        aVar.c().put("params", (Object) jSONObject4);
        return true;
    }

    private void a(AsyncModule asyncModule, final a.InterfaceC0402a interfaceC0402a) {
        AsyncModule.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e550c9af", new Object[]{this, asyncModule, interfaceC0402a});
            return;
        }
        AsyncModule.DependencyRequest c = asyncModule.c();
        if (c == null || (a2 = c.a()) == null) {
            return;
        }
        new com.taobao.android.detail.ttdetail.async.mtop.a(a2).a(new a.InterfaceC0402a() { // from class: com.taobao.android.detail.ttdetail.async.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.async.mtop.a.InterfaceC0402a
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    return;
                }
                a.InterfaceC0402a interfaceC0402a2 = interfaceC0402a;
                if (interfaceC0402a2 == null) {
                    return;
                }
                interfaceC0402a2.a(jSONObject);
            }

            @Override // com.taobao.android.detail.ttdetail.async.mtop.a.InterfaceC0402a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                a.InterfaceC0402a interfaceC0402a2 = interfaceC0402a;
                if (interfaceC0402a2 == null) {
                    return;
                }
                interfaceC0402a2.a(str);
            }
        });
    }

    private void a(final AsyncModule asyncModule, final eyy eyyVar, final a aVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30771020", new Object[]{this, asyncModule, eyyVar, aVar, runtimeAbilityParamArr});
        } else {
            new com.taobao.android.detail.ttdetail.async.mtop.a(asyncModule.a()).a(new a.InterfaceC0402a() { // from class: com.taobao.android.detail.ttdetail.async.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.async.mtop.a.InterfaceC0402a
                public void a(final JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    } else if (b.a(b.this, jSONObject, asyncModule.f())) {
                        a("filterByVIf: " + asyncModule.f());
                    } else {
                        b.a(b.this, jSONObject, asyncModule.d(), eyyVar);
                        b.a(b.this, true, asyncModule.b(), eyyVar);
                        final ArrayList arrayList = new ArrayList();
                        List<AsyncModule.RelateComponent> e = asyncModule.e();
                        if (e != null) {
                            for (AsyncModule.RelateComponent relateComponent : e) {
                                List<AsyncModule.KVMapping> a2 = relateComponent.a();
                                if (a2 != null) {
                                    arrayList.addAll(a2);
                                }
                            }
                        }
                        b.a(b.this).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.async.b.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                b.a(b.this, b.a(b.this, jSONObject, arrayList), jSONObject, aVar);
                                b.a(b.this, true, asyncModule.b(), runtimeAbilityParamArr);
                            }
                        });
                    }
                }

                @Override // com.taobao.android.detail.ttdetail.async.mtop.a.InterfaceC0402a
                public void a(final String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    b.a(b.this, false, asyncModule.b(), eyyVar);
                    b.a(b.this).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.async.b.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            b.a(b.this, str, aVar);
                            b.a(b.this, false, asyncModule.b(), runtimeAbilityParamArr);
                        }
                    });
                }
            });
        }
    }

    private boolean a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48075356", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !str.matches("^\\$\\{.+\\}$")) {
            return false;
        }
        try {
            return ah.a(str, jSONObject);
        } catch (Throwable th) {
            i.a("AsyncProcessor", "filterByVIf exception", th);
            return true;
        }
    }

    private JSONObject c(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2eb12695", new Object[]{this, eyyVar});
        }
        JSONObject c = com.taobao.android.detail.ttdetail.utils.a.c(eyyVar);
        return (c == null || c.isEmpty()) ? com.taobao.android.detail.ttdetail.utils.a.e(eyyVar) : c;
    }

    private boolean d(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b35895fa", new Object[]{this, eyyVar})).booleanValue();
        }
        List<com.taobao.android.detail.ttdetail.handler.event.a> a2 = eyyVar.a(EVENT_LIST_NAME);
        if (a2 == null) {
            return false;
        }
        for (com.taobao.android.detail.ttdetail.handler.event.a aVar : a2) {
            if (dwv.EVENT_TYPE.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    private void a(boolean z, AsyncModule.b bVar, eyy eyyVar) {
        JSONObject d;
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76023ac6", new Object[]{this, new Boolean(z), bVar, eyyVar});
        } else if (eyyVar == null || bVar == null || (d = eyyVar.d()) == null) {
        } else {
            if (z) {
                AsyncModule.c a4 = bVar.a();
                if (a4 == null || (a3 = a4.a()) == null) {
                    return;
                }
                List<AsyncModule.KVMapping> c = a4.c();
                if (c != null && !c.isEmpty()) {
                    a(a3, c, eyyVar);
                    return;
                } else {
                    d.putAll(a3);
                    return;
                }
            }
            AsyncModule.c b = bVar.b();
            if (b == null || (a2 = b.a()) == null) {
                return;
            }
            List<AsyncModule.KVMapping> c2 = b.c();
            if (c2 != null && !c2.isEmpty()) {
                a(a2, c2, eyyVar);
            } else {
                d.putAll(a2);
            }
        }
    }

    public static boolean a(AsyncModule.KVMapping kVMapping) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d45ad79a", new Object[]{kVMapping})).booleanValue();
        }
        if (kVMapping == null || kVMapping.a() == null) {
            return false;
        }
        return au.b.a(kVMapping.b()) || au.b.b(kVMapping.b());
    }

    private void b(JSONObject jSONObject, List<AsyncModule.KVMapping> list, eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9e5d23", new Object[]{this, jSONObject, list, eyyVar});
        } else if (!a(jSONObject, list, eyyVar)) {
        } else {
            a(eyyVar);
            b(eyyVar);
        }
    }

    public static boolean a(JSONObject jSONObject, List<AsyncModule.KVMapping> list, eyy eyyVar) {
        String b;
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("175fed88", new Object[]{jSONObject, list, eyyVar})).booleanValue();
        }
        if (list == null) {
            i.a("AsyncProcessor", "mergeKvMappings() kvMappings null");
            return false;
        }
        for (AsyncModule.KVMapping kVMapping : list) {
            if (a(kVMapping)) {
                String a3 = kVMapping.a();
                Object a4 = (StringUtils.isEmpty(a3) || StringUtils.equals(a3, "*")) ? jSONObject : au.b.a(a3.split("\\."), jSONObject);
                if (a4 != null && (a2 = au.b.a((b = kVMapping.b()), eyyVar)) != null) {
                    String[] c = au.b.c(b);
                    if (c == null) {
                        if (a4 instanceof Map) {
                            a2.putAll((Map) a4);
                        }
                    } else {
                        au.b.a(c, a2, a4);
                    }
                }
            }
        }
        return true;
    }

    public static void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{eyyVar});
        } else if (eyyVar == null) {
        } else {
            au.a.a(eyyVar.d(), eyyVar.d());
        }
    }

    public static void b(eyy eyyVar) {
        Map<String, List<com.taobao.android.detail.ttdetail.handler.event.a>> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d65288f4", new Object[]{eyyVar});
        } else if (eyyVar != null && (f = eyyVar.f()) != null) {
            for (List<com.taobao.android.detail.ttdetail.handler.event.a> list : f.values()) {
                if (list != null) {
                    for (com.taobao.android.detail.ttdetail.handler.event.a aVar : list) {
                        if (aVar != null) {
                            au.a.a(aVar.b(), eyyVar.d());
                        }
                    }
                }
            }
        }
    }

    private JSONObject a(JSONObject jSONObject, List<AsyncModule.KVMapping> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e793ff99", new Object[]{this, jSONObject, list});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (list == null) {
            i.a("AsyncProcessor", "kvMappings null");
            return jSONObject2;
        }
        for (AsyncModule.KVMapping kVMapping : list) {
            if (a(kVMapping)) {
                String a2 = kVMapping.a();
                Object a3 = (StringUtils.isEmpty(a2) || StringUtils.equals(a2, "*")) ? jSONObject : au.b.a(a2.split("\\."), jSONObject);
                if (a3 != null) {
                    String b = kVMapping.b();
                    if (StringUtils.isEmpty(b) || StringUtils.equals(b, "*")) {
                        if (a3 instanceof Map) {
                            jSONObject2.putAll((Map) a3);
                        }
                    } else {
                        au.b.a(b.split("\\."), jSONObject2, a3);
                    }
                }
            }
        }
        return jSONObject2;
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23052e5e", new Object[]{this, jSONObject, jSONObject2, aVar});
        } else if (aVar == null) {
        } else {
            aVar.a(jSONObject, jSONObject2);
        }
    }

    private void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fb98a8", new Object[]{this, str, aVar});
        } else if (aVar == null) {
        } else {
            aVar.a(str);
        }
    }
}
