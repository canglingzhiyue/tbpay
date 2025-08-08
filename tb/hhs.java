package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
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
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.j;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.a;
import com.taobao.android.live.plugin.atype.flexalocal.projectscreen.b;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.goodlist.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import tb.hhu;

/* loaded from: classes5.dex */
public class hhs implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile hhs f28667a;
    private p c;
    private Context d;
    private String e = null;
    private DinamicXEngine b = new DinamicXEngine(new DXEngineConfig.a("live").a(false).a());

    static {
        kge.a(446680818);
        kge.a(-797454141);
    }

    public static hhs a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhs) ipChange.ipc$dispatch("f05800b", new Object[0]);
        }
        if (f28667a == null) {
            synchronized (hhs.class) {
                if (f28667a == null) {
                    f28667a = new hhs();
                }
            }
        }
        return f28667a;
    }

    private hhs() {
        this.b.a(hgz.DX_PARSER_JSONARRAYSTR2TEXTBYKEY, new hgz());
        this.b.a(hgy.DX_PARSER_CALLFUN, new hgy());
        this.b.a(hha.DX_PARSER_TBLIVE_GETSERVERTIME, new hha());
        this.b.a(tet.DX_PARSER_TAOLIVEDXAB, new tet());
        this.b.a(hhi.DX_EVENT_TBLIVE_ADDTOCART, new hhi());
        this.b.a(hhf.DX_EVENT_TBLIVEGOTODETAIL, new hhf());
        this.b.a(hhg.DX_EVENT_TBLIVEROOMACTION, new hhg());
        this.b.a(hhh.DX_EVENT_TBLIVESENDDYNAMICMESSAGE, new hhh());
        this.b.a(hhp.DX_EVENT_TLOPENINTERACTIVECOMPONENT, new hhp());
        this.b.a(hhk.DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD, new hhk());
        this.b.a(hhj.DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT, new hhj());
        this.b.a(hhd.DX_EVENT_TAOLIVEROOMCOMMONHANDLER, new hhd());
        this.b.a(hhn.DX_EVENT_TBLIVEGOODCASEGOTODETAIL, new hhn());
        this.b.a(hhl.DX_EVENT_TBLIVE_GOODS_TOP_CARD, new hhl());
        this.b.a(hhm.DX_EVENT_TBLIVE_PRESALE, new hhm());
        this.b.a(hhu.DXTBLTIMER_TBLTIMER, new hhu.a());
        this.b.a(hhc.DX_EVENT_TAOLIVEANCHORCARDACTION, new hhc());
        this.b.a(b.DX_EVENT_TAOLIVEPROJECTSCREENACTION, new b());
        this.b.a(a.DX_EVENT_TAOLIVEOFFICIALENTRYCLICK, new a());
        this.b.a(j.DX_EVENT_TAOLIVECOMMENTACTION, new j());
        this.b.a(xjr.DX_EVENT_TAOLIVEHOTRESERVATIONCARDACTION, new xjr());
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        p pVar = this.c;
        if (pVar != null) {
            pVar.a();
            this.c = null;
        }
        this.d = null;
        f28667a = null;
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null) {
            return;
        }
        dinamicXEngine.o();
        this.b = null;
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else {
            this.b.a(dXWidgetNode, 0, new DXWidgetRefreshOption.a().a(true).a());
        }
    }

    public String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{this, context, str});
        }
        String a2 = hio.a(context);
        if (StringUtils.isEmpty(a2) && context != null && context.getResources() != null) {
            return hio.b(context, str);
        }
        his.a("TBLiveGoodsDXManager", "使用cache预置数据");
        return a2;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!hir.e()) {
        } else {
            this.e = str;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netResponse == null || netResponse.getDataJsonObject() == null) {
        } else {
            String jSONObject = netResponse.getDataJsonObject().toString();
            JSONObject jSONObject2 = (JSONObject) pqj.a(jSONObject);
            if (jSONObject2 == null || jSONObject2.getJSONArray("result") == null || jSONObject2.getJSONArray("result").isEmpty()) {
                String a2 = a(this.d, "template_list.json");
                if (StringUtils.isEmpty(a2)) {
                    return;
                }
                b(a2);
                return;
            }
            this.e = jSONObject;
            b(this.e);
            if (StringUtils.isEmpty(this.e)) {
                return;
            }
            hio.a(this.d, this.e);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onSystemError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        String str = "onSystemError";
        String responseCode = netResponse != null ? netResponse.getResponseCode() : str;
        if (netResponse != null) {
            str = netResponse.getRetMsg();
        }
        his.b("TBLiveGoodsDXManager", "errorCode = " + responseCode + " , errorMsg = " + str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
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
            this.b.a(arrayList);
        } catch (Throwable th) {
            his.b("TBLiveGoodsDXManager", "downloadDX Error: " + th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
        tb.his.b("TBLiveGoodsDXManager", "createDX Error : name=" + r8 + " version=" + r9 + " url=" + r13);
        r3.put("name", r8);
        r3.put("version", java.lang.String.valueOf(r9));
        r3.put("url", r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView b(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hhs.b(android.content.Context, java.lang.String):com.taobao.android.dinamicx.DXRootView");
    }

    @Deprecated
    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
        } else {
            a(dXRootView, jSONObject, (iou) null);
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c693c19", new Object[]{this, dXRootView, jSONObject, dXRenderOptions});
            return;
        }
        if (dXRenderOptions == null) {
            a2 = this.b.a(dXRootView, jSONObject);
        } else {
            a2 = this.b.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, dXRenderOptions);
        }
        his.a("TBLiveGoodsDXManager", "renderTime dxTemplateName:" + a2.c().toString());
        boolean b = a2.b();
        HashMap hashMap = new HashMap();
        hashMap.put("name", (dXRootView == null || dXRootView.getDxTemplateItem() == null) ? "" : dXRootView.getDxTemplateItem().f11925a);
        if (b) {
            his.b("TBLiveGoodsDXManager", "renderDX Error:" + a2.a().toString());
            pqi.a().a("DXManager_Render_Point", pqj.a(hashMap), a2.a().toString(), a2.a().toString());
            return;
        }
        pqi.a().a("DXManager_Render_Point", pqj.a(hashMap));
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9eacd8e", new Object[]{this, dXRootView, jSONObject, cVar});
        } else {
            a(dXRootView, jSONObject, new iou(cVar));
        }
    }

    public void a(DXRootView dXRootView, JSONObject jSONObject, iou iouVar) {
        DXResult<DXRootView> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34a4f28", new Object[]{this, dXRootView, jSONObject, iouVar});
            return;
        }
        if (iouVar == null) {
            a2 = this.b.a(dXRootView, jSONObject);
        } else {
            a2 = this.b.a(dXRootView.getContext(), dXRootView, dXRootView.getDxTemplateItem(), jSONObject, -1, new DXRenderOptions.a().a((ba) iouVar).a());
        }
        his.a("TBLiveGoodsDXManager", "renderTime dxTemplateName:" + a2.c().toString());
        boolean b = a2.b();
        HashMap hashMap = new HashMap();
        hashMap.put("name", (dXRootView == null || dXRootView.getDxTemplateItem() == null) ? "" : dXRootView.getDxTemplateItem().f11925a);
        if (b) {
            his.b("TBLiveGoodsDXManager", "renderDX Error:" + a2.a().toString());
            pqi.a().a("DXManager_Render_Point", pqj.a(hashMap), a2.a().toString(), a2.a().toString());
            return;
        }
        pqi.a().a("DXManager_Render_Point", pqj.a(hashMap));
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
        } else {
            this.b.a(dXRootView);
        }
    }

    public void b(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
        } else {
            this.b.b(dXRootView);
        }
    }

    public DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("c0d4a65d", new Object[]{this}) : this.b;
    }
}
