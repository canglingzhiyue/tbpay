package com.taobao.android.livehome.plugin.atype.flexalocal.dxengine;

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
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.m;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.n;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.o;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
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
import java.util.concurrent.ConcurrentHashMap;
import tb.fvb;
import tb.fve;
import tb.kge;
import tb.mem;
import tb.men;
import tb.mep;
import tb.meq;
import tb.mer;
import tb.mes;
import tb.meu;
import tb.mev;
import tb.mew;
import tb.mex;
import tb.mey;
import tb.mez;
import tb.mfa;
import tb.mfb;
import tb.mfc;
import tb.mfe;
import tb.mfg;
import tb.mfj;
import tb.mfk;
import tb.sdt;

/* loaded from: classes6.dex */
public class DinamicSdkManager2 implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CHANNEL_DISCOVERY_TEMPLATE_NAME = "taolive_discover_tab_container_2024";
    private static final String TAG;
    private static final int mMaxTemplateVersion = 100000;
    private DinamicXEngine mDinamicEngine;
    private b mDownloadCallback;
    private IDinamicRegister mIDinamicRegister;
    private LiveHomeController2 mLiveHomeController2;

    /* loaded from: classes6.dex */
    public interface IDinamicRegister extends Serializable {
        void a(DinamicXEngine dinamicXEngine);
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public DinamicDataObject f14180a;
        public Context b;
        public mfe c;

        static {
            kge.a(-1042227360);
        }

        public a(DinamicDataObject dinamicDataObject, Context context, mfe mfeVar) {
            this.f14180a = dinamicDataObject;
            this.b = context;
            this.c = mfeVar;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    static {
        kge.a(-1192240804);
        kge.a(1028243835);
        TAG = DinamicSdkManager2.class.getSimpleName();
    }

    public void setLiveHomeController2(LiveHomeController2 liveHomeController2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915c7400", new Object[]{this, liveHomeController2});
        } else {
            this.mLiveHomeController2 = liveHomeController2;
        }
    }

    public void setIDinamicRegister(IDinamicRegister iDinamicRegister) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6242f7f0", new Object[]{this, iDinamicRegister});
            return;
        }
        this.mIDinamicRegister = iDinamicRegister;
        IDinamicRegister iDinamicRegister2 = this.mIDinamicRegister;
        if (iDinamicRegister2 == null) {
            return;
        }
        try {
            iDinamicRegister2.a(this.mDinamicEngine);
        } catch (Exception e) {
            mfj.a(TAG, "on register dinamic exp.", e);
        }
    }

    public void enableBusinessEnableDesignScale(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5b965b", new Object[]{this, context});
            return;
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine == null || dinamicXEngine.b() == null) {
            return;
        }
        if (!sdt.b(context) && !sdt.a(context)) {
            return;
        }
        this.mDinamicEngine.b().a(true, true);
    }

    public DinamicSdkManager2(String str, int i, String str2) {
        DXEngineConfig.a a2 = new DXEngineConfig.a(str).d(i).a(str2);
        if (i.X()) {
            if (i.Q()) {
                a2.a(c.e() ? null : c.d() ? DXEngineConfig.ImageQuality.q50 : DXEngineConfig.ImageQuality.q60);
            }
            if (i.R() && c.d()) {
                a2.g(false);
            }
        }
        this.mDinamicEngine = new DinamicXEngine(a2.a());
        this.mDinamicEngine.a(new ak() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.1
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
        this.mDinamicEngine.a(e.DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW, new e.a());
        this.mDinamicEngine.a(com.taobao.taolive.dinamicext.dinamicx.c.DXTBLANIMATEDVIEW_TBLANIMATEDVIEW, new c.a());
        this.mDinamicEngine.a(n.DXTBLHOMEIMAGEVIEW_TBLHOMEIMAGEVIEW, new n.a());
        this.mDinamicEngine.a(com.taobao.taolive.dinamicext.dinamicx.i.DXTBLIMAGEVIEW_TBLIMAGEVIEW, new i.a());
        this.mDinamicEngine.a(f.DXTBLFAVORVIEW_TBLFAVORVIEW, new f.a());
        this.mDinamicEngine.a(j.DXTBLMASKVIEW_TBLMASKVIEW, new j.a());
        this.mDinamicEngine.a(l.DXTBLTEXTVIEW_TBLTEXTVIEW, new l.a());
        this.mDinamicEngine.a(d.DXTBLCOMMENTVIEW_TBLCOMMENTVIEW, new d.a());
        this.mDinamicEngine.a(g.DXTBLFOLLOWVIEW_TBLFOLLOWVIEW, new g.a());
        this.mDinamicEngine.a(h.DXTBLGRIDLAYOUT_TBLGRIDLAYOUT, new h.a());
        this.mDinamicEngine.a(k.DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW, new k.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.d.DXTBLSLIDERLAYOUT_TBLSLIDERLAYOUT, new d.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.a.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new a.C0685a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.c.DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW, new c.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.a.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new a.C0685a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.b.DXTBLFRAMELAYOUT_TBLFRAMELAYOUT, new b.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.e.DXTBLVWEBVIEW_TBLVWEBVIEW, new e.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.widget.f.DXTBLIVEVIEWPAGER_TBLIVEVIEWPAGER, new f.a());
        this.mDinamicEngine.a(com.taobao.taolive.dinamicext.dinamicx.a.DX_PARSER_TBLDEVICELEVEL, new com.taobao.taolive.dinamicext.dinamicx.a());
        this.mDinamicEngine.a(com.taobao.taolive.dinamicext.dinamicx.b.DX_PARSER_TBLTIMEFOMAT, new com.taobao.taolive.dinamicext.dinamicx.b());
        this.mDinamicEngine.a(mfc.DX_PARSER_TBLVSTRTOMAP, new mfc());
        this.mDinamicEngine.a(meu.DX_PARSER_TBLVTOARRAY, new meu());
        this.mDinamicEngine.a(mev.DX_PARSER_TBLINDEXOFVALUE, new mev());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.k.TBLVSYNCTASK, new k.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.j.TBLVIEWPAGERABILITY, new j.a());
        this.mDinamicEngine.a(5360605235400031797L, new com.taobao.live.home.dinamic.event.e());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.event.g.DX_EVENT_TBLMTOPREFRESH, new com.taobao.live.home.dinamic.event.g());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.event.b.DX_EVENT_LSCROLLEXPOSE, new com.taobao.live.home.dinamic.event.b());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.event.c.DX_EVENT_LTAP, new com.taobao.live.home.dinamic.event.c());
        this.mDinamicEngine.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.DX_EVENT_TBLVNATIVECALLCHAIN, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h());
        this.mDinamicEngine.a("TBLCDNRequest", new a.C0683a());
        this.mDinamicEngine.a("tblvSyncTask", new k.a());
        this.mDinamicEngine.a("TBLCache", new o.a());
        this.mDinamicEngine.a("TBLCallEventChain", new c.a());
        this.mDinamicEngine.a("TBLCountdown", new d.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.a.TBLCDNREQUEST, new a.C0683a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.i.TBLTLOG, new i.a());
        this.mDinamicEngine.a(o.TBLCACHE, new o.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.f.TBLPOSTMESSAGETOH5, new f.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.c.TBLCALLEVENTCHAIN, new c.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.e.TBLFOLLOW, new e.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.g.TBLSUBSCRIBE, new g.a());
        this.mDinamicEngine.a(com.taobao.live.home.dinamic.ability.d.TBLCOUNTDOWN, new d.a());
        this.mDinamicEngine.a(mer.DX_PARSER_TBLFETCHUSERINFO, new mer());
        this.mDinamicEngine.a(meq.DX_PARSER_TBLFETCHTIMESTAMPINFO, new meq());
        this.mDinamicEngine.a(mep.DX_PARSER_TBLFETCHMD5, new mep());
        this.mDinamicEngine.a(m.DX_PARSER_TBLFETCHDEVICEINFO, new m());
        this.mDinamicEngine.a(mfb.DX_PARSER_TBLVMAPTOJSON, new mfb());
        this.mDinamicEngine.a(mfa.DX_PARSER_TBLVJSONTOMAP, new mfa());
        this.mDinamicEngine.a(mez.DX_PARSER_TBLVJSONTOARRAY, new mez());
        this.mDinamicEngine.a(mex.DX_PARSER_TBLVARRAYTOJSON, new mex());
        this.mDinamicEngine.a(mes.DX_PARSER_TBLURLENCODE, new mes());
        this.mDinamicEngine.a(mem.DX_PARSER_TBLENCODECHINESE, new mem());
        this.mDinamicEngine.a(men.DX_PARSER_TBLFETCHBHXBUFSFEATURE, new men());
        this.mDinamicEngine.a(mew.DX_PARSER_TBLRECYCLERDELETEARRAY, new mew());
        this.mDinamicEngine.a(mey.DX_PARSER_TBLVHANDLEMTOPDATA, new mey());
        this.mDinamicEngine.a(6916119436215133091L, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.b());
        this.mDinamicEngine.a(-521746365956793992L, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.k());
        this.mDinamicEngine.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.l.DX_PARSER_TBLVINSERTBELOW, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.l());
        this.mDownloadCallback = new b();
        this.mDinamicEngine.a(this.mDownloadCallback);
    }

    public DinamicXEngine getDinamicEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("d88dea05", new Object[]{this}) : this.mDinamicEngine;
    }

    public void inflateView(Context context, DinamicDataObject dinamicDataObject, mfe mfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2b1796", new Object[]{this, context, dinamicDataObject, mfeVar});
        } else if (context == null || dinamicDataObject == null || mfeVar == null) {
        } else {
            TemplateObject templateObject = null;
            try {
                if (this.mLiveHomeController2 != null && this.mLiveHomeController2.getTemplateCardListOwner() != null) {
                    templateObject = this.mLiveHomeController2.getTemplateCardListOwner().c(dinamicDataObject.templateName);
                }
            } catch (Exception e) {
                mfj.a(TAG, "inflateView getTemplate exp.", e);
            }
            if (templateObject == null) {
                templateObject = new TemplateObject();
                templateObject.name = dinamicDataObject.templateName;
                templateObject.version4Android = 100000L;
            }
            if (this.mDinamicEngine == null) {
                return;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = templateObject.url4Android;
            dXTemplateItem.f11925a = templateObject.name;
            dXTemplateItem.b = templateObject.version4Android;
            DXTemplateItem a2 = this.mDinamicEngine.a(dXTemplateItem);
            if (a2 != null) {
                if (!a2.equals(dXTemplateItem)) {
                    mfk.a(mfk.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString(), "", "item_not_match");
                    b bVar = this.mDownloadCallback;
                    if (bVar != null) {
                        bVar.a(templateObject.name, new a(dinamicDataObject, context, mfeVar));
                    }
                    downloadTemplate(dXTemplateItem);
                }
                mfk.a(mfk.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString());
                DXResult<DXRootView> b2 = this.mDinamicEngine.b(context, a2);
                if (b2.b()) {
                    mfeVar.a();
                    String str = TAG;
                    mfj.c(str, "templateName=" + templateObject.name + "inflate view error: " + b2.a());
                    StringBuilder sb = new StringBuilder();
                    sb.append("template=");
                    sb.append(dXTemplateItem.toString());
                    mfk.a(mfk.DYNAMIC_X_CREATE, sb.toString(), "createViewError", b2.a().toString());
                    return;
                }
                mfk.a(mfk.DYNAMIC_X_CREATE, "template=" + dXTemplateItem.toString());
                bindData(b2.f11780a, dinamicDataObject);
                mfeVar.a(b2.f11780a);
                return;
            }
            mfk.a(mfk.DYNAMIC_X_FETCH, "template=" + dXTemplateItem.toString(), "", "item_not_exits");
            b bVar2 = this.mDownloadCallback;
            if (bVar2 != null) {
                bVar2.a(templateObject.name, new a(dinamicDataObject, context, mfeVar));
            }
            downloadTemplate(dXTemplateItem);
        }
    }

    public void prefetchTemplate(Context context, String str, DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e643a877", new Object[]{this, context, str, dinamicDataObject});
            return;
        }
        LiveHomeController2 liveHomeController2 = this.mLiveHomeController2;
        if (liveHomeController2 == null || liveHomeController2.getTemplateCardListOwner() == null) {
            return;
        }
        TemplateObject c = this.mLiveHomeController2.getTemplateCardListOwner().c(str);
        if (c == null) {
            c = new TemplateObject();
            c.name = dinamicDataObject.templateName;
        }
        if (this.mDinamicEngine == null) {
            return;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.c = c.url4Android;
        dXTemplateItem.f11925a = c.name;
        dXTemplateItem.b = c.version4Android;
        this.mDinamicEngine.a(context, dinamicDataObject.data.get("data"), dXTemplateItem, -1);
    }

    public void prefetchTemplate(Context context, String str, JSONObject jSONObject) {
        LiveHomeController2 liveHomeController2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("387add36", new Object[]{this, context, str, jSONObject});
        } else if (this.mDinamicEngine == null || context == null || com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str) || (liveHomeController2 = this.mLiveHomeController2) == null || liveHomeController2.getTemplateCardListOwner() == null) {
        } else {
            TemplateObject c = this.mLiveHomeController2.getTemplateCardListOwner().c(str);
            if (c == null) {
                c = new TemplateObject();
                c.name = str;
            }
            if (this.mDinamicEngine == null) {
                return;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = c.url4Android;
            dXTemplateItem.f11925a = c.name;
            dXTemplateItem.b = c.version4Android;
            this.mDinamicEngine.a(context, jSONObject, dXTemplateItem, -1);
        }
    }

    public void preLoad(Context context, List<String> list) {
        LiveHomeController2 liveHomeController2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f819489", new Object[]{this, context, list});
        } else if (this.mDinamicEngine != null && context != null && list != null && list.size() > 0 && (liveHomeController2 = this.mLiveHomeController2) != null && liveHomeController2.getTemplateCardListOwner() != null) {
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                TemplateObject c = this.mLiveHomeController2.getTemplateCardListOwner().c(list.get(i));
                if (c == null) {
                    c = new TemplateObject();
                    c.name = list.get(i);
                }
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.c = c.url4Android;
                dXTemplateItem.f11925a = c.name;
                dXTemplateItem.b = c.version4Android;
                arrayList.add(dXTemplateItem);
            }
            this.mDinamicEngine.c(arrayList);
        }
    }

    public void preRenderTemplate(Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d069f58", new Object[]{this, context, str, jSONObject});
        } else if (this.mDinamicEngine == null || context == null || com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str)) {
        } else {
            TemplateObject templateObject = null;
            try {
                if (this.mLiveHomeController2 != null && this.mLiveHomeController2.getTemplateCardListOwner() != null) {
                    templateObject = this.mLiveHomeController2.getTemplateCardListOwner().c(str);
                }
            } catch (Exception e) {
                mfj.a(TAG, "preRenderTemplate getTemplate exp.", e);
            }
            if (templateObject == null) {
                templateObject = new TemplateObject();
                templateObject.name = str;
            }
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.c = templateObject.url4Android;
            dXTemplateItem.f11925a = templateObject.name;
            dXTemplateItem.b = templateObject.version4Android;
            DXTemplateItem a2 = this.mDinamicEngine.a(dXTemplateItem);
            if (a2 == null) {
                return;
            }
            this.mDinamicEngine.a(context, a2, jSONObject, 0, (DXRenderOptions) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView preCreateDX(android.content.Context r9, java.lang.String r10, tb.mfe r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.preCreateDX(android.content.Context, java.lang.String, tb.mfe):com.taobao.android.dinamicx.DXRootView");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXRootView createDX(android.content.Context r11, java.lang.String r12, tb.mfe r13) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.createDX(android.content.Context, java.lang.String, tb.mfe):com.taobao.android.dinamicx.DXRootView");
    }

    public boolean renderDX(Context context, DXRootView dXRootView, JSONObject jSONObject, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bbcbf2c", new Object[]{this, context, dXRootView, jSONObject, dXRenderOptions})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
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

    public boolean renderDX(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e594c82", new Object[]{this, dXRootView, jSONObject})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
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

    public void bindData(View view, DinamicDataObject dinamicDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6a8f81", new Object[]{this, view, dinamicDataObject});
        } else if (!(view instanceof DXRootView) || dinamicDataObject == null) {
        } else {
            DXRootView dXRootView = (DXRootView) view;
            dXRootView.setTag(R.id.live_feedback_tag, dinamicDataObject);
            if (this.mDinamicEngine == null || dinamicDataObject.data == null) {
                return;
            }
            DXResult<DXRootView> a2 = this.mDinamicEngine.a(dXRootView, dinamicDataObject.data.get("data"));
            if (a2.b()) {
                String str = TAG;
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
        } else if (!(view instanceof DXRootView) || this.mDinamicEngine == null) {
        } else {
            DXRootView dXRootView = (DXRootView) view;
            if (dXRootView.getFlattenWidgetNode() == null) {
                return;
            }
            dXRootView.getFlattenWidgetNode().setNeedParse();
        }
    }

    public void setWillDisplay(View view) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6986ce5d", new Object[]{this, view});
        } else if (!(view instanceof DXRootView) || (dinamicXEngine = this.mDinamicEngine) == null) {
        } else {
            dinamicXEngine.b((DXRootView) view);
        }
    }

    public void setDidEndDisplay(View view) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981fc067", new Object[]{this, view});
        } else if (!(view instanceof DXRootView) || (dinamicXEngine = this.mDinamicEngine) == null) {
        } else {
            dinamicXEngine.a((DXRootView) view);
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.mDinamicEngine;
        if (dinamicXEngine != null) {
            dinamicXEngine.o();
        }
        b bVar = this.mDownloadCallback;
        if (bVar != null) {
            bVar.a();
        }
        this.mIDinamicRegister = null;
    }

    public void downloadTemplates(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de36e489", new Object[]{this, list});
        } else if (this.mDinamicEngine == null || list == null || list.isEmpty()) {
        } else {
            this.mDinamicEngine.a(list);
        }
    }

    private void downloadTemplate(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda96292", new Object[]{this, dXTemplateItem});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dXTemplateItem);
        downloadTemplates(arrayList);
    }

    /* loaded from: classes6.dex */
    public class b implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ConcurrentHashMap<String, ArrayList<a>> f14181a = new ConcurrentHashMap<>();

        static {
            kge.a(2057266281);
            kge.a(-1579893205);
        }

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ConcurrentHashMap<String, ArrayList<a>> concurrentHashMap = this.f14181a;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
            this.f14181a = null;
        }

        public void a(String str, a aVar) {
            ConcurrentHashMap<String, ArrayList<a>> concurrentHashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a33dd056", new Object[]{this, str, aVar});
            } else if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str) || aVar == null || (concurrentHashMap = this.f14181a) == null) {
            } else {
                ArrayList<a> arrayList = concurrentHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f14181a.put(str, arrayList);
                }
                arrayList.add(aVar);
            }
        }

        @Override // tb.fve
        public void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar != null) {
                if (!fvbVar.f28139a.isEmpty()) {
                    mfg.a().a("com.taobao.live.home.template_download_complete");
                }
                try {
                    for (DXTemplateItem dXTemplateItem : fvbVar.f28139a) {
                        if (dXTemplateItem != null) {
                            mfk.a(mfk.DYNAMIC_X_DOWNLOAD, "templateName=" + dXTemplateItem.f11925a);
                            a(dXTemplateItem.f11925a);
                        }
                    }
                } catch (Exception e) {
                    mfj.a(DinamicSdkManager2.access$000(), "TBLiveTemplateDownloadCallback.onNotificationListener", e);
                }
                if (fvbVar.b == null) {
                    return;
                }
                try {
                    for (DXTemplateItem dXTemplateItem2 : fvbVar.b) {
                        if (dXTemplateItem2 != null) {
                            mfk.a(mfk.DYNAMIC_X_DOWNLOAD, "templateName=" + dXTemplateItem2.f11925a, "", "");
                        }
                    }
                } catch (Exception e2) {
                    mfj.a(DinamicSdkManager2.access$000(), "TBLiveTemplateDownloadCallback.onNotificationListener", e2);
                }
            }
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (this.f14181a != null) {
                ArrayList<a> arrayList = new ArrayList();
                ArrayList<a> arrayList2 = this.f14181a.get(str);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                try {
                    for (a aVar : arrayList) {
                        if (aVar != null) {
                            DinamicSdkManager2.this.inflateView(aVar.b, aVar.f14180a, aVar.c);
                        }
                    }
                } catch (Exception e) {
                    mfj.a(DinamicSdkManager2.access$000(), "Dinamic download callback.", e);
                }
                this.f14181a.remove(str);
            }
        }
    }
}
