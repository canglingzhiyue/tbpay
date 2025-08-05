package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.CustomLoadRenderParser;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.bpj;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    public static final String KEY_COMPONENT = "triggerComponent";
    public static final String KEY_IS_ERROR = "isError";
    public static final String KEY_MTOP_RESPONSE = "mtopResponse";
    public static final String KEY_NEED_REFRESH_COMPONENTS = "needRefreshComponents";
    public static final String KEY_TARGET_COMPONENTS = "targetComponents";
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_SUCCESS = 2;
    public static final String TAG = "AsyncRefreshSubscriber";

    /* renamed from: a */
    public Map<String, C0088b> f2581a = new HashMap();
    private String b = null;

    static {
        kge.a(1622183574);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(b bVar, IDMComponent iDMComponent, C0088b c0088b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779b2ee", new Object[]{bVar, iDMComponent, c0088b});
        } else {
            bVar.a(iDMComponent, c0088b);
        }
    }

    public static /* synthetic */ void a(b bVar, String str, CustomLoadRenderParser.LoadState loadState, com.alibaba.android.ultron.vfw.viewholder.h hVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51242d6", new Object[]{bVar, str, loadState, hVar, obj});
        } else {
            bVar.a(str, loadState, hVar, obj);
        }
    }

    public static /* synthetic */ void a(b bVar, MtopResponse mtopResponse, JSONArray jSONArray, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c231bd19", new Object[]{bVar, mtopResponse, jSONArray, str, new Boolean(z)});
        } else {
            bVar.a(mtopResponse, jSONArray, str, z);
        }
    }

    public b() {
        this.i = 300;
        a();
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            UnifyLog.a(this.f.h(), TAG, "error: eventFields is null", new String[0]);
            return;
        }
        final JSONArray jSONArray = fields.getJSONArray(KEY_TARGET_COMPONENTS);
        final String string = fields.getString("parseKey");
        String string2 = fields.getString("repeatRequest");
        if (TextUtils.isEmpty(string2)) {
            string2 = "none";
        }
        C0088b c0088b = this.f2581a.get(this.g.getKey());
        if (c0088b == null) {
            c0088b = new C0088b();
            this.f2581a.put(this.g.getKey(), c0088b);
        }
        final C0088b c0088b2 = c0088b;
        char c = 65535;
        int hashCode = string2.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != -1281977283) {
                if (hashCode == 3387192 && string2.equals("none")) {
                    c = 0;
                }
            } else if (string2.equals("failed")) {
                c = 1;
            }
        } else if (string2.equals(RVStartParams.TRANSPARENT_TITLE_ALWAYS)) {
            c = 2;
        }
        if (c != 0) {
            if (c == 1) {
                if (c0088b2.b == 1 || c0088b2.b == 2) {
                    return;
                }
            } else if (c == 2 && c0088b2.b == 1) {
                return;
            }
        } else if (c0088b2.f2583a > 0) {
            return;
        }
        JSONObject jSONObject = fields.getJSONObject("mtopConfig");
        if (jSONObject == null) {
            UnifyLog.a(this.f.h(), TAG, "error: mtopConfig is null", new String[0]);
            return;
        }
        String string3 = jSONObject.getString("apiMethod");
        String string4 = jSONObject.getString("apiVersion");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        boolean booleanValue = jSONObject.getBooleanValue("isNeedWua");
        boolean booleanValue2 = jSONObject.getBooleanValue("usePost");
        this.b = jSONObject.getString("unitStrategy");
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
            UnifyLog.a(this.f.h(), TAG, "error: apiMethod or apiVersion is null", new String[0]);
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string3);
        mtopRequest.setVersion(string4);
        if (jSONObject2 != null) {
            mtopRequest.setData(jSONObject2.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(booleanValue2 ? MethodEnum.POST : MethodEnum.GET);
        if (booleanValue) {
            build.mo1335useWua();
        }
        if ("UNIT_GUIDE".equals(this.b) || "UNIT_TRADE".equals(this.b)) {
            build.mo1328setUnitStrategy(this.b);
        }
        final String string5 = fields.getString("loadRenderKey");
        final com.alibaba.android.ultron.vfw.viewholder.h hVar = (com.alibaba.android.ultron.vfw.viewholder.h) b(com.alibaba.android.ultron.event.base.f.KEY_TRIGGER_VIEW_HOLDER);
        build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.event.AsyncRefreshSubscriber$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String h = b.this.f.h();
                UnifyLog.a(h, b.TAG, "AsyncRefresh onSystemError: " + mtopResponse.getRetMsg(), new String[0]);
                b.a(b.this, string5, CustomLoadRenderParser.LoadState.SATAE_FAILED, hVar, mtopResponse);
                b.a(b.this, mtopResponse, jSONArray, string, true);
                c0088b2.b = 3;
                b bVar = b.this;
                b.a(bVar, bVar.g, c0088b2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                UnifyLog.a(b.this.f.h(), b.TAG, "AsyncRefresh onSuccess", mtopResponse.getRetMsg());
                b.a(b.this, string5, CustomLoadRenderParser.LoadState.STATE_SUCCESS, hVar, mtopResponse);
                b.a(b.this, mtopResponse, jSONArray, string, false);
                c0088b2.b = 2;
                b bVar = b.this;
                b.a(bVar, bVar.g, c0088b2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                String h = b.this.f.h();
                UnifyLog.a(h, b.TAG, "AsyncRefresh onError: " + mtopResponse.getRetMsg(), new String[0]);
                b.a(b.this, string5, CustomLoadRenderParser.LoadState.SATAE_FAILED, hVar, mtopResponse);
                b.a(b.this, mtopResponse, jSONArray, string, true);
                c0088b2.b = 3;
                b bVar = b.this;
                b.a(bVar, bVar.g, c0088b2);
            }
        });
        String h = this.f.h();
        UnifyLog.a(h, TAG, "start execute: " + string3, new String[0]);
        build.startRequest();
        c0088b2.f2583a = c0088b2.f2583a + 1;
        c0088b2.b = 1;
        a(this.g, c0088b2);
        a(string5, CustomLoadRenderParser.LoadState.STATE_LOADING, hVar, (Object) null);
    }

    private void a(IDMComponent iDMComponent, C0088b c0088b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5c95aa", new Object[]{this, iDMComponent, c0088b});
        } else if (iDMComponent == null || c0088b == null) {
        } else {
            iDMComponent.getExtMap().put("asyncStatus", Integer.valueOf(c0088b.b));
        }
    }

    private void a(String str, CustomLoadRenderParser.LoadState loadState, com.alibaba.android.ultron.vfw.viewholder.h hVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9ac492", new Object[]{this, str, loadState, hVar, obj});
            return;
        }
        if ((str != null ? ((com.alibaba.android.ultron.vfw.instance.d) this.e).c(str) : null) == null || hVar == null) {
            return;
        }
        hVar.c();
    }

    private void a(MtopResponse mtopResponse, JSONArray jSONArray, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59b45cd5", new Object[]{this, mtopResponse, jSONArray, str, new Boolean(z)});
        } else if (this.e instanceof com.alibaba.android.ultron.vfw.instance.d) {
            com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) this.e;
            com.alibaba.android.ultron.event.base.b b = str != null ? dVar.b(str) : null;
            if (b == null) {
                b = new a();
            }
            com.alibaba.android.ultron.event.model.a aVar = new com.alibaba.android.ultron.event.model.a(this.e);
            aVar.a(KEY_COMPONENT, this.g);
            aVar.a("mtopResponse", mtopResponse);
            aVar.a(KEY_IS_ERROR, Boolean.valueOf(z));
            aVar.a(KEY_TARGET_COMPONENTS, jSONArray);
            b.a(aVar);
            List<IDMComponent> list = (List) aVar.a(KEY_NEED_REFRESH_COMPONENTS);
            if (list == null || list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    arrayList.add(iDMComponent.getKey());
                }
            }
            String h = this.f.h();
            UnifyLog.a(h, TAG, "CustomSubscriberParser finish", " refresh: " + bpj.a(arrayList, ","));
            UltronInstanceConfig y = dVar.y();
            if (y != null && y.w()) {
                dVar.a(list);
            } else {
                dVar.b(127);
            }
            if (dVar.w() != null) {
                dVar.w();
            }
            this.j = System.currentTimeMillis();
        }
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd4f5", new Object[]{this, list, obj});
        } else {
            this.f2581a.clear();
        }
    }

    /* loaded from: classes2.dex */
    public class a implements com.alibaba.android.ultron.event.base.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1342158379);
            kge.a(-160176441);
        }

        private a() {
            b.this = r1;
        }

        @Override // com.alibaba.android.ultron.event.base.b
        public void a(com.alibaba.android.ultron.event.model.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d131e5eb", new Object[]{this, aVar});
            } else if (aVar == null) {
            } else {
                com.alibaba.android.ultron.vfw.instance.b a2 = aVar.a();
                IDMComponent iDMComponent = (IDMComponent) aVar.a(b.KEY_COMPONENT);
                MtopResponse mtopResponse = (MtopResponse) aVar.a("mtopResponse");
                ((Boolean) aVar.a(b.KEY_IS_ERROR)).booleanValue();
                JSONArray jSONArray = (JSONArray) aVar.a(b.KEY_TARGET_COMPONENTS);
                if (a2 == null || mtopResponse == null) {
                    return;
                }
                JSONObject jSONObject = null;
                try {
                    jSONObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                } catch (Exception e) {
                    bga.a.a(b.this.f == null ? "Ultron" : b.this.f.h(), "AsyncRefreshSubscriber.onCustomParser", e);
                }
                if (jSONObject == null || jSONObject.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (jSONArray == null) {
                    if (!a(iDMComponent, jSONObject.getJSONObject(iDMComponent.getKey()))) {
                        return;
                    }
                    arrayList.add(iDMComponent);
                    aVar.a(b.KEY_NEED_REFRESH_COMPONENTS, arrayList);
                    return;
                }
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        String str = (String) next;
                        IDMComponent b = a2.b().b(str);
                        if (a(b, jSONObject.getJSONObject(str))) {
                            arrayList.add(b);
                        }
                    }
                }
                aVar.a(b.KEY_NEED_REFRESH_COMPONENTS, arrayList);
            }
        }

        private boolean a(IDMComponent iDMComponent, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ca1a8088", new Object[]{this, iDMComponent, jSONObject})).booleanValue();
            }
            if (iDMComponent == null || iDMComponent.getData() == null || jSONObject == null) {
                return false;
            }
            JSONObject data = iDMComponent.getData();
            if (jSONObject.containsKey("fields")) {
                data.put("fields", (Object) jSONObject.getJSONObject("fields"));
            }
            if (jSONObject.containsKey("events")) {
                data.put("events", (Object) jSONObject.getJSONObject("events"));
            }
            iDMComponent.writeBackDataAndReloadEvent(data, true);
            return true;
        }
    }

    /* renamed from: com.alibaba.android.ultron.event.b$b */
    /* loaded from: classes2.dex */
    public static class C0088b {

        /* renamed from: a */
        public int f2583a;
        public int b;

        static {
            kge.a(66990767);
        }

        private C0088b() {
            this.f2583a = 0;
            this.b = 0;
        }
    }
}
