package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.sdk;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.DXTblScrollExposeEventHandler;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.TBLDinamicXCommonClickHandler;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.m;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.n;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.o;
import com.taobao.live.home.dinamic.ability.a;
import com.taobao.live.home.dinamic.ability.c;
import com.taobao.live.home.dinamic.ability.e;
import com.taobao.live.home.dinamic.ability.g;
import com.taobao.live.home.dinamic.ability.j;
import com.taobao.live.home.dinamic.ability.k;
import com.taobao.live.home.dinamic.event.e;
import com.taobao.live.home.dinamic.widget.a;
import com.taobao.live.home.dinamic.widget.b;
import com.taobao.live.home.dinamic.widget.c;
import com.taobao.live.home.dinamic.widget.d;
import com.taobao.live.home.dinamic.widget.f;
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
import tb.iep;
import tb.kge;
import tb.men;
import tb.mep;
import tb.meq;
import tb.mer;
import tb.mes;
import tb.meu;
import tb.mey;
import tb.mez;
import tb.mfa;
import tb.mfb;
import tb.mfc;

/* loaded from: classes6.dex */
public class DXPreviewInterfaceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1740043955);
    }

    public static void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{bdVar});
        } else if (bdVar == null) {
        } else {
            bdVar.a(n.DXTBLHOMEIMAGEVIEW_TBLHOMEIMAGEVIEW, new n.a());
            bdVar.a(i.DXTBLIMAGEVIEW_TBLIMAGEVIEW, new i.a());
            bdVar.a(f.DXTBLFAVORVIEW_TBLFAVORVIEW, new f.a());
            bdVar.a(j.DXTBLMASKVIEW_TBLMASKVIEW, new j.a());
            bdVar.a(l.DXTBLTEXTVIEW_TBLTEXTVIEW, new l.a());
            bdVar.a(d.DXTBLCOMMENTVIEW_TBLCOMMENTVIEW, new d());
            bdVar.a(g.DXTBLFOLLOWVIEW_TBLFOLLOWVIEW, new g.a());
            bdVar.a(h.DXTBLGRIDLAYOUT_TBLGRIDLAYOUT, new h.a());
            bdVar.a(k.DXTBLSUBSCRIBEVIEW_TBLSUBSCRIBEVIEW, new k.a());
            bdVar.a(com.taobao.live.home.dinamic.widget.d.DXTBLSLIDERLAYOUT_TBLSLIDERLAYOUT, new d.a());
            bdVar.a(c.DXTBLLONGTEXTVIEW_TBLLONGTEXTVIEW, new c.a());
            bdVar.a(a.DXTBLAUTOSCROLLSCROLLERLAYOUT_TBLAUTOSCROLLSCROLLERLAYOUT, new a.C0685a());
            bdVar.a(b.DXTBLFRAMELAYOUT_TBLFRAMELAYOUT, new b.a());
            bdVar.a(10220236261038765L, new TBLDinamicXCommonClickHandler());
            bdVar.a(DXTblScrollExposeEventHandler.DX_EVENT_TBLSCROLLEXPOSE, new DXTblScrollExposeEventHandler());
            bdVar.a(5360605235400031797L, new e());
            bdVar.a(com.taobao.taolive.dinamicext.dinamicx.a.DX_PARSER_TBLDEVICELEVEL, new com.taobao.taolive.dinamicext.dinamicx.a());
            bdVar.a(com.taobao.taolive.dinamicext.dinamicx.b.DX_PARSER_TBLTIMEFOMAT, new com.taobao.taolive.dinamicext.dinamicx.b());
            bdVar.a(mfc.DX_PARSER_TBLVSTRTOMAP, new mfc());
            bdVar.a(meu.DX_PARSER_TBLVTOARRAY, new meu());
            bdVar.a(mfb.DX_PARSER_TBLVMAPTOJSON, new mfb());
            bdVar.a(mfa.DX_PARSER_TBLVJSONTOMAP, new mfa());
            bdVar.a(mez.DX_PARSER_TBLVJSONTOARRAY, new mez());
            bdVar.a(mes.DX_PARSER_TBLURLENCODE, new mes());
            bdVar.a(men.DX_PARSER_TBLFETCHBHXBUFSFEATURE, new men());
            bdVar.a(meq.DX_PARSER_TBLFETCHTIMESTAMPINFO, new meq());
            bdVar.a(mer.DX_PARSER_TBLFETCHUSERINFO, new mer());
            bdVar.a(meq.DX_PARSER_TBLFETCHTIMESTAMPINFO, new meq());
            bdVar.a(mep.DX_PARSER_TBLFETCHMD5, new mep());
            bdVar.a(m.DX_PARSER_TBLFETCHDEVICEINFO, new m());
            bdVar.a(mey.DX_PARSER_TBLVHANDLEMTOPDATA, new mey());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.e.DX_PARSER_TBLGETEXPOSE, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.e());
            bdVar.a(m.DX_PARSER_TBLFETCHDEVICEINFO, new m());
            bdVar.a(6916119436215133091L, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.b());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.l.DX_PARSER_TBLVINSERTBELOW, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.l());
            bdVar.a(com.taobao.live.home.dinamic.event.c.DX_EVENT_LTAP, new com.taobao.live.home.dinamic.event.c());
            bdVar.a(com.taobao.live.home.dinamic.event.b.DX_EVENT_LSCROLLEXPOSE, new com.taobao.live.home.dinamic.event.b());
            bdVar.a(iep.DX_EVENT_LOPENCHANNEL, new iep());
            bdVar.a(com.taobao.live.home.dinamic.event.g.DX_EVENT_TBLMTOPREFRESH, new com.taobao.live.home.dinamic.event.g());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h.DX_EVENT_TBLVNATIVECALLCHAIN, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h());
            bdVar.a(com.taobao.taolive.dinamicext.dinamicx.c.DXTBLANIMATEDVIEW_TBLANIMATEDVIEW, new c.a());
            bdVar.a(com.taobao.live.home.dinamic.widget.f.DXTBLIVEVIEWPAGER_TBLIVEVIEWPAGER, new f.a());
            bdVar.a(com.taobao.taolive.dinamicext.dinamicx.e.DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW, new e.a());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a.DXTAOLIVEJELLYMARQUEE_TAOLIVEJELLYMARQUEE, new a.C0544a());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.a.DX_EVENT_TBLOPENCHANNEL, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.a());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.c.DX_EVENT_TBLSEARCHTAP, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.c());
            bdVar.a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.f.DX_EVENT_TBLCARDDATAEXPO, new com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.f());
            if (bdVar.d() == null) {
                return;
            }
            bdVar.d().a(com.taobao.live.home.dinamic.ability.g.TBLSUBSCRIBE, new g.a());
            bdVar.d().a(com.taobao.live.home.dinamic.ability.e.TBLFOLLOW, new e.a());
            bdVar.d().a(com.taobao.live.home.dinamic.ability.j.TBLVIEWPAGERABILITY, new j.a());
            bdVar.d().a(o.TBLCACHE, new o.a());
            bdVar.d().a(com.taobao.live.home.dinamic.ability.k.TBLVSYNCTASK, new k.a());
            bdVar.d().a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.d.TBLUPDATEVIEWPROPERTY, new d.a());
            bdVar.d().a(com.taobao.live.home.dinamic.ability.c.TBLCALLEVENTCHAIN, new c.a());
            bdVar.d().a(com.taobao.live.home.dinamic.ability.a.TBLCDNREQUEST, new a.C0683a());
            bdVar.d().a(com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.g.TBLMTOP, new g.a());
        }
    }
}
