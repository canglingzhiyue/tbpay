package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taolive.movehighlight.dx.widget.a;
import com.taobao.taolive.movehighlight.dx.widget.b;
import com.taobao.taolive.movehighlight.dx.widget.scrollerLayout.DXHighlightScrollableLayoutWidgetNode;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.utils.y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.pfs;
import tb.pgd;
import tb.pgg;

/* loaded from: classes8.dex */
public class pfx implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private static pfx c;
    private Context d;
    private pfw e;
    private String f = null;

    /* renamed from: a  reason: collision with root package name */
    public DinamicXEngine f32613a = new DinamicXEngine(new DXEngineConfig("live_highlight"));

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    static {
        kge.a(-1983071104);
        kge.a(-797454141);
        b = pfx.class.getSimpleName();
    }

    public static pfx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfx) ipChange.ipc$dispatch("f091c1c", new Object[0]);
        }
        if (c == null) {
            synchronized (pfx.class) {
                c = new pfx();
            }
        }
        return c;
    }

    private pfx() {
        this.f32613a.a(pfz.DX_EVENT_HIGHLIGHTSCROLLABLEONLOADMORE, new pfz());
        this.f32613a.a(pgb.DX_EVENT_TBLIVE_TIMESHIFT_CUSTOM, new pgb());
        this.f32613a.a(pga.DX_EVENT_HIGHLIGHTTRACKUTILS, new pga());
        this.f32613a.a(pgc.DX_EVENT_TBLIVE_TIMEMOVE_SECKILL_ITEM_ADD, new pgc());
        this.f32613a.a(DXHighlightScrollableLayoutWidgetNode.DXHIGHLIGHTSCROLLABLELAYOUT_HIGHLIGHTSCROLLABLELAYOUT, new DXHighlightScrollableLayoutWidgetNode.a());
        this.f32613a.a(pgg.DXHIGHLIGHTSTRUCTLISTVIEW_HIGHLIGHTSTRUCTLISTVIEW, new pgg.a());
        this.f32613a.a(pgd.DXHIGLIGHTPLAYERCONTROLLERNEW_HIGLIGHTPLAYERCONTROLLERNEW, new pgd.a());
        this.f32613a.a(pfs.DXHIGHLIGHTCONTENTVIEW_HIGHLIGHTCONTENTVIEW, new pfs.a());
        f.m().getGoodHandlerProxy().l(this.f32613a);
        this.f32613a.a(b.DX_PARSER_HIGHLIGHTSTRTOMAP, new b());
        this.f32613a.a(a.DX_PARSER_HIGHLIGHTABCONFIG, new a());
        this.f32613a.a(pgk.DX_PARSER_HIGHLIGHT_STRUCT_JSON_STR, new pgk());
        f.m().getGoodHandlerProxy().c(this.f32613a);
        f.m().getGoodHandlerProxy().b(this.f32613a);
        f.m().getGoodHandlerProxy().a(this.f32613a);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.d = context;
        DinamicXEngine dinamicXEngine = this.f32613a;
        if (dinamicXEngine != null && dinamicXEngine.b() != null) {
            if (y.a() && y.b(this.d)) {
                this.f32613a.b().a(true, true);
            }
            if (y.a() && y.c(this.d)) {
                this.f32613a.b().a(true);
            }
        }
        pfw pfwVar = this.e;
        if (pfwVar != null) {
            pfwVar.a();
        }
        this.e = new pfw(this);
        this.e.b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        pfw pfwVar = this.e;
        if (pfwVar != null) {
            pfwVar.a();
            this.e = null;
        }
        this.d = null;
        c = null;
        DinamicXEngine dinamicXEngine = this.f32613a;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.o();
        this.f32613a = null;
    }

    public String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{this, context});
        }
        String c2 = c(context);
        if (!TextUtils.isEmpty(c2) || context == null || context.getResources() == null) {
            return c2;
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getResources().getAssets(), "highlight_template_list.json");
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
        Log.e(b, "onSuccess");
        if (netResponse == null || netResponse.getDataJsonObject() == null) {
            return;
        }
        String jSONObject = netResponse.getDataJsonObject().toString();
        JSONObject jSONObject2 = (JSONObject) pqj.a(jSONObject);
        if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
            String b2 = b(this.d);
            if (TextUtils.isEmpty(b2)) {
                return;
            }
            a(b2);
            return;
        }
        this.f = jSONObject;
        a(this.f);
        if (TextUtils.isEmpty(this.f) || this.f.equals(b(this.d))) {
            Log.e(b, "mTemplateString is null OR same cache");
        } else {
            b(this.d, this.f);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            Log.e(b, "onError");
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
            this.f32613a.a(arrayList);
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
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        if (TextUtils.isEmpty(this.f)) {
            this.f = b(context);
        }
        if (TextUtils.isEmpty(this.f)) {
            pqi.a().a("Highlight_DXManager_Create_Point", pqj.a(hashMap), "mTemplateString", "mTemplateString");
            return null;
        }
        try {
            JSONObject b2 = pqj.b(this.f);
            if (b2 == null) {
                pqi.a().a("Highlight_DXManager_Create_Point", pqj.a(hashMap), "parseObject", "parseObject");
                return null;
            }
            Iterator<Object> it = b2.getJSONArray("result").iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String string = ((JSONObject) next).getString("name");
                if (str.equals(string)) {
                    String string2 = ((JSONObject) next).getString("url4Android");
                    long longValue = ((JSONObject) next).getLongValue("version4Android");
                    String str2 = b;
                    Log.e(str2, string + string2 + longValue);
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.f11925a = string;
                    dXTemplateItem.c = string2;
                    dXTemplateItem.b = longValue;
                    DXResult<DXRootView> b3 = this.f32613a.b(context, this.f32613a.a(dXTemplateItem));
                    if (b3.b()) {
                        pqi.a().a("Highlight_DXManager_Create_Point", pqj.a(hashMap), b3.toString(), b3.toString());
                    } else {
                        pqi.a().a("Highlight_DXManager_Create_Point", pqj.a(hashMap));
                    }
                    return b3.f11780a;
                }
            }
            pqi.a().a("Highlight_DXManager_Create_Point", pqj.a(hashMap), "null", "null");
            return null;
        } catch (Throwable unused) {
            pqi.a().a("Highlight_DXManager_Create_Point", pqj.a(hashMap), "try_catch", "try_catch");
            return null;
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, com.taobao.alilive.aliliveframework.frame.a aVar) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c85e9fe", new Object[]{this, dXRootView, jSONObject, aVar});
            return;
        }
        if (aVar == null) {
            a2 = this.f32613a.a(dXRootView, jSONObject);
        } else {
            a2 = this.f32613a.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.a().a((ba) new quf(aVar)).a());
        }
        boolean b2 = a2.b();
        HashMap hashMap = new HashMap();
        hashMap.put("name", (dXRootView == null || dXRootView.getDxTemplateItem() == null) ? "" : dXRootView.getDxTemplateItem().f11925a);
        if (b2) {
            pqi.a().a("Highlight_DXManager_Render_Point", pqj.a(hashMap), a2.toString(), a2.toString());
        } else {
            pqi.a().a("Highlight_DXManager_Render_Point", pqj.a(hashMap));
        }
    }

    public void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
            return;
        }
        try {
            com.taobao.taolive.sdk.goodlist.b.a(context.getCacheDir().getPath(), "highlight_template_list.json", str);
        } catch (Exception unused) {
        }
    }

    public String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{this, context});
        }
        try {
            return com.taobao.taolive.sdk.goodlist.b.a(context.getCacheDir().getPath(), "highlight_template_list.json");
        } catch (Exception unused) {
            return null;
        }
    }
}
