package com.taobao.live.home.dinamic.sdk;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ak;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.live.home.LiveHomeController;
import com.taobao.live.home.dinamic.ability.a;
import com.taobao.live.home.dinamic.ability.c;
import com.taobao.live.home.dinamic.ability.d;
import com.taobao.live.home.dinamic.ability.e;
import com.taobao.live.home.dinamic.ability.f;
import com.taobao.live.home.dinamic.ability.g;
import com.taobao.live.home.dinamic.ability.i;
import com.taobao.live.home.dinamic.ability.j;
import com.taobao.live.home.dinamic.ability.k;
import com.taobao.live.home.dinamic.model.DinamicDataObject;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.live.home.dinamic.widget.a;
import com.taobao.live.home.dinamic.widget.b;
import com.taobao.live.home.dinamic.widget.c;
import com.taobao.live.home.dinamic.widget.d;
import com.taobao.live.home.dinamic.widget.e;
import com.taobao.live.home.dinamic.widget.f;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import com.taobao.taolive.dinamicext.dinamicx.c;
import com.taobao.taolive.dinamicext.dinamicx.d;
import com.taobao.taolive.dinamicext.dinamicx.e;
import com.taobao.taolive.dinamicext.dinamicx.f;
import com.taobao.taolive.dinamicext.dinamicx.g;
import com.taobao.taolive.dinamicext.dinamicx.h;
import com.taobao.taolive.dinamicext.dinamicx.i;
import com.taobao.taolive.dinamicext.dinamicx.j;
import com.taobao.taolive.dinamicext.dinamicx.k;
import com.taobao.taolive.dinamicext.dinamicx.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kqp;
import tb.mem;
import tb.men;
import tb.mep;
import tb.meq;
import tb.mer;
import tb.mes;
import tb.met;
import tb.meu;
import tb.mev;
import tb.mew;
import tb.mex;
import tb.mey;
import tb.mez;
import tb.mfa;
import tb.mfb;
import tb.mfc;
import tb.mfd$a;
import tb.mfd$c;
import tb.mfe;
import tb.mfj;
import tb.mfk;

/* loaded from: classes7.dex */
public class DinamicSdkManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f17744a = "DinamicSdkManager";
    private static final int mMaxTemplateVersion = 100000;
    private DinamicXEngine b;
    private mfd$c c;
    private IDinamicRegister d;

    /* loaded from: classes7.dex */
    public interface IDinamicRegister extends Serializable {
        void a(DinamicXEngine dinamicXEngine);
    }

    public void a(IDinamicRegister iDinamicRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d4a19", new Object[]{this, iDinamicRegister});
            return;
        }
        this.d = iDinamicRegister;
        IDinamicRegister iDinamicRegister2 = this.d;
        if (iDinamicRegister2 == null) {
            return;
        }
        try {
            iDinamicRegister2.a(this.b);
        } catch (Exception e) {
            mfj.a(f17744a, "on register dinamic exp.", e);
        }
    }

    public DinamicSdkManager(String str, int i, String str2) {
        this.b = new DinamicXEngine(new DXEngineConfig.a(str).d(i).a(str2).a(true, true).a());
        this.b.a(new ak() { // from class: com.taobao.live.home.dinamic.sdk.DinamicSdkManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.ak
            public long a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
                }
                long serverTime = TimestampSynchronizer.getServerTime();
                return serverTime <= 0 ? System.currentTimeMillis() : serverTime;
            }
        });
        this.b.a(e.DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW, new e.a());
        this.b.a(c.DXTBLANIMATEDVIEW_TBLANIMATEDVIEW, new c.a());
        this.b.a(i.DXTBLIMAGEVIEW_TBLIMAGEVIEW, new i.a());
        this.b.a(f.DXTBLFAVORVIEW_TBLFAVORVIEW, new f.a());
        this.b.a(j.DXTBLMASKVIEW_TBLMASKVIEW, new j.a());
        this.b.a(l.DXTBLTEXTVIEW_TBLTEXTVIEW, new l.a());
        this.b.a(d.DXTBLCOMMENTVIEW_TBLCOMMENTVIEW, new d.a());
        this.b.a(g.DXTBLFOLLOWVIEW_TBLFOLLOWVIEW, new g.a());
        this.b.a(h.DXTBLGRIDLAYOUT_TBLGRIDLAYOUT, new h.a());
        this.b.a(k.DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW, new k.a());
        this.b.a(com.taobao.live.home.dinamic.widget.d.DXTBLSLIDERLAYOUT_TBLSLIDERLAYOUT, new d.a());
        this.b.a(a.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new a.C0685a());
        this.b.a(com.taobao.live.home.dinamic.widget.c.DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW, new c.a());
        this.b.a(a.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new a.C0685a());
        this.b.a(b.DXTBLFRAMELAYOUT_TBLFRAMELAYOUT, new b.a());
        this.b.a(com.taobao.live.home.dinamic.widget.e.DXTBLVWEBVIEW_TBLVWEBVIEW, new e.a());
        this.b.a(com.taobao.live.home.dinamic.widget.f.DXTBLIVEVIEWPAGER_TBLIVEVIEWPAGER, new f.a());
        this.b.a(com.taobao.taolive.dinamicext.dinamicx.a.DX_PARSER_TBLDEVICELEVEL, new com.taobao.taolive.dinamicext.dinamicx.a());
        this.b.a(com.taobao.taolive.dinamicext.dinamicx.b.DX_PARSER_TBLTIMEFOMAT, new com.taobao.taolive.dinamicext.dinamicx.b());
        this.b.a(mfc.DX_PARSER_TBLVSTRTOMAP, new mfc());
        this.b.a(meu.DX_PARSER_TBLVTOARRAY, new meu());
        this.b.a(mev.DX_PARSER_TBLINDEXOFVALUE, new mev());
        this.b.a(5360605235400031797L, new com.taobao.live.home.dinamic.event.e());
        this.b.a(com.taobao.live.home.dinamic.event.g.DX_EVENT_TBLMTOPREFRESH, new com.taobao.live.home.dinamic.event.g());
        this.b.a(com.taobao.live.home.dinamic.event.b.DX_EVENT_LSCROLLEXPOSE, new com.taobao.live.home.dinamic.event.b());
        this.b.a(com.taobao.live.home.dinamic.event.c.DX_EVENT_LTAP, new com.taobao.live.home.dinamic.event.c());
        this.b.a("TBLCDNRequest", new a.C0683a());
        this.b.a("tblvSyncTask", new k.a());
        this.b.a("TBLCallEventChain", new c.a());
        this.b.a("TBLCountdown", new d.a());
        this.b.a(com.taobao.live.home.dinamic.ability.a.TBLCDNREQUEST, new a.C0683a());
        this.b.a(com.taobao.live.home.dinamic.ability.i.TBLTLOG, new i.a());
        this.b.a(com.taobao.live.home.dinamic.ability.f.TBLPOSTMESSAGETOH5, new f.a());
        this.b.a(com.taobao.live.home.dinamic.ability.c.TBLCALLEVENTCHAIN, new c.a());
        this.b.a(com.taobao.live.home.dinamic.ability.e.TBLFOLLOW, new e.a());
        this.b.a(com.taobao.live.home.dinamic.ability.g.TBLSUBSCRIBE, new g.a());
        this.b.a(com.taobao.live.home.dinamic.ability.d.TBLCOUNTDOWN, new d.a());
        this.b.a(com.taobao.live.home.dinamic.ability.k.TBLVSYNCTASK, new k.a());
        this.b.a(com.taobao.live.home.dinamic.ability.j.TBLVIEWPAGERABILITY, new j.a());
        this.b.a(mer.DX_PARSER_TBLFETCHUSERINFO, new mer());
        this.b.a(meq.DX_PARSER_TBLFETCHTIMESTAMPINFO, new meq());
        this.b.a(mep.DX_PARSER_TBLFETCHMD5, new mep());
        this.b.a(mfb.DX_PARSER_TBLVMAPTOJSON, new mfb());
        this.b.a(mfa.DX_PARSER_TBLVJSONTOMAP, new mfa());
        this.b.a(mez.DX_PARSER_TBLVJSONTOARRAY, new mez());
        this.b.a(mex.DX_PARSER_TBLVARRAYTOJSON, new mex());
        this.b.a(mes.DX_PARSER_TBLURLENCODE, new mes());
        this.b.a(mem.DX_PARSER_TBLENCODECHINESE, new mem());
        this.b.a(men.DX_PARSER_TBLFETCHBHXBUFSFEATURE, new men());
        this.b.a(mew.DX_PARSER_TBLRECYCLERDELETEARRAY, new mew());
        this.b.a(mey.DX_PARSER_TBLVHANDLEMTOPDATA, new mey());
        this.b.a(6916119436215133091L, new met());
        this.b.a(-521746365956793992L, new kqp());
        this.c = new mfd$c(this);
        this.b.a(this.c);
    }

    public DinamicXEngine a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("4d3f629f", new Object[]{this}) : this.b;
    }

    public void a(Context context, DinamicDataObject dinamicDataObject, mfe mfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39919f61", new Object[]{this, context, dinamicDataObject, mfeVar});
        } else if (context == null || dinamicDataObject == null || mfeVar == null) {
        } else {
            TemplateObject templateObject = null;
            try {
                if (LiveHomeController.a().d() != null) {
                    templateObject = LiveHomeController.a().d().c(dinamicDataObject.templateName);
                }
            } catch (Exception e) {
                mfj.a(f17744a, "inflateView getTemplate exp.", e);
            }
            if (templateObject == null) {
                templateObject = new TemplateObject();
                templateObject.name = dinamicDataObject.templateName;
            }
            if (this.b == null) {
                return;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = templateObject.url4Android;
            dXTemplateItem.f11925a = templateObject.name;
            dXTemplateItem.b = templateObject.version4Android;
            DXTemplateItem a2 = this.b.a(dXTemplateItem);
            if (a2 != null) {
                if (!a2.equals(dXTemplateItem)) {
                    mfk.a(mfk.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString(), "", "item_not_match");
                    mfd$c mfd_c = this.c;
                    if (mfd_c != null) {
                        mfd_c.a(templateObject.name, new mfd$a(dinamicDataObject, context, mfeVar));
                    }
                    a(dXTemplateItem);
                }
                mfk.a(mfk.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString());
                DXResult<DXRootView> b = this.b.b(context, a2);
                if (b.b()) {
                    mfeVar.a();
                    String str = f17744a;
                    mfj.c(str, "templateName=" + templateObject.name + "inflate view error: " + b.a());
                    StringBuilder sb = new StringBuilder();
                    sb.append("template=");
                    sb.append(dXTemplateItem.toString());
                    mfk.a(mfk.DYNAMIC_X_CREATE, sb.toString(), "createViewError", b.a().toString());
                    return;
                }
                mfk.a(mfk.DYNAMIC_X_CREATE, "template=" + dXTemplateItem.toString());
                a(b.f11780a, dinamicDataObject);
                mfeVar.a(b.f11780a);
                return;
            }
            mfk.a(mfk.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString(), "", "item_not_exits");
            mfd$c mfd_c2 = this.c;
            if (mfd_c2 != null) {
                mfd_c2.a(templateObject.name, new mfd$a(dinamicDataObject, context, mfeVar));
            }
            a(dXTemplateItem);
        }
    }

    public void a(Context context, String str, DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beedb5a7", new Object[]{this, context, str, dinamicDataObject});
        } else if (LiveHomeController.a().d() == null) {
        } else {
            TemplateObject c = LiveHomeController.a().d().c(str);
            if (c == null) {
                c = new TemplateObject();
                c.name = dinamicDataObject.templateName;
            }
            if (this.b == null) {
                return;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = c.url4Android;
            dXTemplateItem.f11925a = c.name;
            dXTemplateItem.b = c.version4Android;
            this.b.a(context, dinamicDataObject.data.get("data"), dXTemplateItem, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView a(android.content.Context r9, java.lang.String r10, tb.mfe r11) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.home.dinamic.sdk.DinamicSdkManager.a(android.content.Context, java.lang.String, tb.mfe):com.taobao.android.dinamicx.DXRootView");
    }

    public boolean a(Context context, DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1a1ca15", new Object[]{this, context, dXRootView, jSONObject, dXRenderOptions})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null || jSONObject == null) {
            return false;
        }
        DXResult<DXRootView> a2 = dinamicXEngine.a(context, dXRootView, dXRootView.getDxTemplateItem(), jSONObject, 0, dXRenderOptions);
        if (a2.b()) {
            mfk.a(mfk.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f11925a, "", a2.a().toString());
            return false;
        }
        mfk.a(mfk.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f11925a);
        return true;
    }

    public boolean a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeb8c22b", new Object[]{this, dXRootView, jSONObject})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null || jSONObject == null) {
            return false;
        }
        DXResult<DXRootView> a2 = dinamicXEngine.a(dXRootView, jSONObject);
        if (a2.b()) {
            mfk.a(mfk.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f11925a, "", a2.a().toString());
            return false;
        }
        mfk.a(mfk.DYNAMIC_X_BIND_DATA, "templateName=" + dXRootView.getDxTemplateItem().f11925a);
        return true;
    }

    public void a(View view, DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaaf2e7", new Object[]{this, view, dinamicDataObject});
        } else if (!(view instanceof DXRootView) || dinamicDataObject == null) {
        } else {
            DXRootView dXRootView = (DXRootView) view;
            dXRootView.setTag(R.id.live_feedback_tag, dinamicDataObject);
            if (this.b == null || dinamicDataObject.data == null) {
                return;
            }
            DXResult<DXRootView> a2 = this.b.a(dXRootView, dinamicDataObject.data.get("data"));
            if (a2.b()) {
                String str = f17744a;
                mfj.c(str, "templateName=" + dinamicDataObject.templateName + ". bind data error: " + a2.a().toString());
                StringBuilder sb = new StringBuilder();
                sb.append("templateName=");
                sb.append(dinamicDataObject.templateName);
                mfk.a(mfk.DYNAMIC_X_BIND_DATA, sb.toString(), "", a2.a().toString());
                return;
            }
            mfk.a(mfk.DYNAMIC_X_BIND_DATA, "templateName=" + dinamicDataObject.templateName);
        }
    }

    public void setNeedParse(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f128510", new Object[]{this, view});
        } else if (!(view instanceof DXRootView) || this.b == null) {
        } else {
            DXRootView dXRootView = (DXRootView) view;
            if (dXRootView.getFlattenWidgetNode() == null) {
                return;
            }
            dXRootView.getFlattenWidgetNode().setNeedParse();
        }
    }

    public void a(View view) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof DXRootView) || (dinamicXEngine = this.b) == null) {
        } else {
            dinamicXEngine.b((DXRootView) view);
        }
    }

    public void b(View view) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (!(view instanceof DXRootView) || (dinamicXEngine = this.b) == null) {
        } else {
            dinamicXEngine.a((DXRootView) view);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            dinamicXEngine.o();
        }
        mfd$c mfd_c = this.c;
        if (mfd_c != null) {
            mfd_c.a();
        }
        this.d = null;
    }

    public void a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.b == null || list == null || list.isEmpty()) {
        } else {
            this.b.a(list);
        }
    }

    private void a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplateItem);
        a(arrayList);
    }
}
