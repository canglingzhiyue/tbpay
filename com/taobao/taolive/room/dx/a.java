package com.taobao.taolive.room.dx;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ak;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taolive.room.dx.g;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.goodlist.p;
import com.taobao.taolive.sdk.utils.y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.hiq;
import tb.kge;
import tb.pfx;
import tb.pid;
import tb.pmd;
import tb.pnj;
import tb.pqi;
import tb.pqj;
import tb.qmn;

/* loaded from: classes8.dex */
public abstract class a implements com.taobao.taolive.sdk.adapter.network.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DXImageBizId = 3101;
    private static final String d;
    public Context b;
    private p e;
    public String c = null;

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f21619a = new DinamicXEngine(new DXEngineConfig.a(a()).d(3101).a(false).a());

    public abstract String a();

    static {
        kge.a(431692668);
        kge.a(-797454141);
        d = b.class.getSimpleName();
    }

    public a() {
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().a(this.f21619a);
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().b(this.f21619a);
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().d(this.f21619a);
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().e(this.f21619a);
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().h(this.f21619a);
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().i(this.f21619a);
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().j(this.f21619a);
        this.f21619a.a(g.DXLIVECOUNTDOWNVIEW_LIVECOUNTDOWNVIEW, new g.a());
        this.f21619a.a(5360605235400031797L, new e());
        this.f21619a.a(new ak() { // from class: com.taobao.taolive.room.dx.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.ak
            public long a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : hiq.a();
            }
        });
        com.taobao.android.live.plugin.proxy.f.m().getGoodHandlerProxy().k(this.f21619a);
        this.f21619a.a(c.DX_EVENT_TAOLIVEHOMETABCLICK, new c());
        this.f21619a.a(pid.DX_EVENT_TBLIVE_ROOM_SET_FAVORITE, new pid());
        this.f21619a.a(com.taobao.taolive.room.ui.growth.b.DX_EVENT_GROWTHTAP, new com.taobao.taolive.room.ui.growth.b());
        this.f21619a.a(d.DX_EVENT_TAOLIVERECOMMENDCARDGOODSACTION, new d());
        this.f21619a.a(h.DX_EVENT_TAOLIVEHOTRESERVATIONSWITCHCARDACTION, new h());
        this.f21619a.a(f.DX_EVENT_TAOLIVERECOMMENDACTION, new f());
        this.f21619a.a(((Long) com.taobao.android.live.plugin.proxy.f.d().getRankEntranceDXHandler().first).longValue(), (bn) com.taobao.android.live.plugin.proxy.f.d().getRankEntranceDXHandler().second);
        qmn.a(this.f21619a);
        this.f21619a.a(((Long) com.taobao.android.live.plugin.proxy.f.s().getOfficialLiveEntryDXHandler().first).longValue(), (bn) com.taobao.android.live.plugin.proxy.f.s().getOfficialLiveEntryDXHandler().second);
        this.f21619a.a(((Long) com.taobao.android.live.plugin.proxy.f.v().getProjectScreenDXHandler().first).longValue(), (bn) com.taobao.android.live.plugin.proxy.f.v().getProjectScreenDXHandler().second);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = context;
        DinamicXEngine dinamicXEngine = this.f21619a;
        if (dinamicXEngine != null) {
            DXEngineConfig b = dinamicXEngine.b();
            if (y.a() && y.b(this.b)) {
                b.a(true, true);
            }
            if (y.a() && y.c(this.b)) {
                b.a(true);
            }
        }
        p pVar = this.e;
        if (pVar != null) {
            pVar.a();
        }
        this.e = new p(this);
        this.e.b();
        pfx.a().a(context);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p pVar = this.e;
        if (pVar != null) {
            pVar.a();
            this.e = null;
        }
        this.b = null;
        DinamicXEngine dinamicXEngine = this.f21619a;
        if (dinamicXEngine != null) {
            dinamicXEngine.o();
            this.f21619a = null;
        }
        if (aa.aJ()) {
            com.taobao.android.live.plugin.proxy.f.m().destroyDXManger();
        }
        pfx.a().b();
    }

    public String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        String a2 = com.taobao.taolive.room.utils.h.a(context);
        if (!StringUtils.isEmpty(a2) || context == null || context.getResources() == null) {
            return a2;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getResources().getAssets(), "template_list.json");
            InputStreamReader inputStreamReader = new InputStreamReader(proxy_open, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    proxy_open.close();
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            String str = "error:" + e.toString();
            return "";
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        Log.e(d, "onSuccess");
        if (netResponse == null || netResponse.getDataJsonObject() == null) {
            return;
        }
        String jSONObject = netResponse.getDataJsonObject().toString();
        JSONObject jSONObject2 = (JSONObject) pqj.a(jSONObject);
        if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
            String b = b(this.b);
            if (StringUtils.isEmpty(b)) {
                return;
            }
            a(b);
            return;
        }
        this.c = jSONObject;
        com.taobao.android.live.plugin.proxy.f.m().setTemplateString(this.c);
        a(this.c);
        if (StringUtils.isEmpty(this.c) || this.c.equals(b(this.b))) {
            Log.e(d, "mTemplateString is null OR same cache");
        } else {
            com.taobao.taolive.room.utils.h.a(this.b, this.c);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            Log.e(d, "onError");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            Log.e(d, "onError");
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) pqj.a(str);
            if (jSONObject == null) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("result");
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String string = ((JSONObject) next).getString("name");
                String string2 = ((JSONObject) next).getString("url4Android");
                long longValue = ((JSONObject) next).getLongValue("version4Android");
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f11925a = string;
                dXTemplateItem.c = string2;
                dXTemplateItem.b = longValue;
                arrayList.add(dXTemplateItem);
            }
            this.f21619a.a(arrayList);
        } catch (Throwable th) {
            pnj m = pmd.a().m();
            m.a("downloadDX", "downloadDX error " + th.toString());
        }
    }

    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fb6cf46d", new Object[]{this, context, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        if (StringUtils.isEmpty(this.c)) {
            this.c = b(context);
        }
        if (StringUtils.isEmpty(this.c)) {
            pqi.a().a("DXManager_Create_Point", pqj.a(hashMap), "mTemplateString", "mTemplateString");
            return null;
        }
        try {
            JSONObject b = pqj.b(this.c);
            if (b == null) {
                pqi.a().a("DXManager_Create_Point", pqj.a(hashMap), "parseObject", "parseObject");
                return null;
            }
            Iterator<Object> it = b.getJSONArray("result").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String string = ((JSONObject) next).getString("name");
                if (str.equals(string)) {
                    String string2 = ((JSONObject) next).getString("url4Android");
                    long longValue = ((JSONObject) next).getLongValue("version4Android");
                    String str2 = d;
                    Log.e(str2, string + string2 + longValue);
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f11925a = string;
                    dXTemplateItem.c = string2;
                    dXTemplateItem.b = longValue;
                    DXResult<DXRootView> b2 = this.f21619a.b(context, this.f21619a.a(dXTemplateItem));
                    if (b2.b()) {
                        pqi.a().a("DXManager_Create_Point", pqj.a(hashMap), b2.toString(), b2.toString());
                    } else {
                        pqi.a().a("DXManager_Create_Point", pqj.a(hashMap));
                    }
                    return b2.f11780a;
                }
            }
            pqi.a().a("DXManager_Create_Point", pqj.a(hashMap), "null", "null");
            return null;
        } catch (Throwable unused) {
            pqi.a().a("DXManager_Create_Point", pqj.a(hashMap), "try_catch", "try_catch");
            return null;
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
            return;
        }
        DXResult<DXRootView> a2 = this.f21619a.a(dXRootView, jSONObject);
        boolean b = a2.b();
        HashMap hashMap = new HashMap();
        hashMap.put("name", (dXRootView == null || dXRootView.getDxTemplateItem() == null) ? "" : dXRootView.getDxTemplateItem().f11925a);
        if (b) {
            pqi.a().a("DXManager_Render_Point", pqj.a(hashMap), a2.toString(), a2.toString());
        } else {
            pqi.a().a("DXManager_Render_Point", pqj.a(hashMap));
        }
    }
}
