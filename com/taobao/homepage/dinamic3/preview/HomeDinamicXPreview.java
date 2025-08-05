package com.taobao.homepage.dinamic3.preview;

import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.preview.DXTemplatePreviewActivity;
import com.taobao.homepage.utils.b;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.isw;
import tb.jdm;
import tb.jdn;
import tb.kge;
import tb.kuv;
import tb.kuw;
import tb.kux;
import tb.kuz;
import tb.kva;
import tb.kvc;
import tb.kve;
import tb.kvf;
import tb.kvg;
import tb.kvh;
import tb.kvj;
import tb.kvk;
import tb.kvl;
import tb.kvm;
import tb.kvn;
import tb.kvp;
import tb.kvq;
import tb.kvs;
import tb.kvv;
import tb.kvx;
import tb.kvy;
import tb.kvz;
import tb.kwb;
import tb.kwc;
import tb.kwd;
import tb.kwe;
import tb.kwf;
import tb.kwg;
import tb.kwh;
import tb.kwi;
import tb.kwl;
import tb.kwn;
import tb.kwo;
import tb.kwq;
import tb.kwr;
import tb.kwt;
import tb.kwu;
import tb.kwv;
import tb.kww;
import tb.kyw;
import tb.lap;
import tb.lrf;
import tb.rhk;
import tb.rhl;
import tb.rhm;
import tb.rhn;
import tb.rho;
import tb.rhp;
import tb.rhq;
import tb.sdk;
import tb.sfl;
import tb.sqa;
import tb.sso;
import tb.thc;

/* loaded from: classes7.dex */
public class HomeDinamicXPreview implements DXTemplatePreviewActivity.DXPreviewInterface, IMTOPDataObject {
    private static bd engineRouter;

    static {
        kge.a(-1087094212);
        kge.a(1293529562);
        kge.a(-350052935);
        engineRouter = null;
    }

    @Override // com.taobao.android.preview.DXTemplatePreviewActivity.DXPreviewInterface
    public void previewEngineDidInitialized(bd bdVar) {
        engineRouter = bdVar;
        bdVar.a(1202423593942681808L, new kwq.a());
        bdVar.a(-7577370574697348630L, new kwu.a());
        bdVar.a(-7752096208734590680L, new kwt.a());
        bdVar.a(-8690577844899785500L, new kwr.a());
        bdVar.a(-6240570111658900479L, new kwn.a());
        bdVar.a(thc.DXHMULTISELECTVIEW_HMULTISELECTVIEW, new thc.a());
        bdVar.a(-3771791355023224372L, new kwo.a());
        bdVar.a(kwv.f30360a, new kwv.a());
        bdVar.a(-5996311416603680075L, new kww.a());
        bdVar.a(34696035233L, new kvg());
        bdVar.a(37581716043L, new kvl());
        bdVar.a(isw.DX_EVENT_RTABITEMTAP, new isw());
        bdVar.a(5560765727008152586L, new kvm());
        bdVar.a(6136827152325085276L, new kvj());
        bdVar.a(-9200576388575376305L, new kvk());
        bdVar.a(-1980042490983877383L, new kuv());
        bdVar.a(-4629410644348754929L, new kvn());
        bdVar.a(kux.DX_EVENT_HEDITIONSWITCH, new kux());
        bdVar.a(kuz.DX_EVENT_HOPENPOP, new kuz());
        bdVar.a(8520638904096683930L, new kve());
        bdVar.a(-5738105571919564880L, new kva());
        bdVar.a(-279868442483546412L, new sqa());
        bdVar.a(kvf.DX_EVENT_HTABCLICK, new kvf());
        bdVar.a(rhl.DX_EVENT_HSAVEDATA, new rhl());
        bdVar.a(kvc.DX_EVENT_HSETDATATOMODEL, new kvc());
        bdVar.a(204709052093538189L, new kvh());
        bdVar.a(kuw.DX_EVENT_ELDERTABCLICK, new kuw());
        bdVar.a(9422011105736515L, new rho());
        bdVar.a(rhp.DX_PARSER_MAPTOARRAY, new rhp());
        bdVar.a(kwd.DX_PARSER_NAVEXTHEIGHT, new kwd());
        bdVar.a(rhm.DX_PARSER_FESTIVAL, new rhm());
        bdVar.a(-5348504102650243981L, new kvq());
        bdVar.a(9860385864900610L, new kwe());
        bdVar.a(1466861815985736590L, new kvx());
        bdVar.a(5284242828433939926L, new kwf());
        bdVar.a(1293712961081187802L, new kwg());
        bdVar.a(-2517623531547489759L, new kwi());
        bdVar.a(kwh.DX_PARSER_REVISIONSWITCH, new kwh());
        bdVar.a(-6150397287027100920L, new kvz());
        bdVar.a(kvs.DX_PARSER_HGETDATAFROMMODEL, new kvs());
        bdVar.a(jdm.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new jdm());
        bdVar.a(jdn.DX_PARSER_TAOBAO_THEME_VALID, new jdn());
        bdVar.a(rhn.DX_PARSER_HGETDATA, new rhn());
        bdVar.a(6584495743641924598L, new kvv());
        bdVar.a(kvy.DX_PARSER_HISCLIENTCACHE, new kvy());
        bdVar.a(6875012019473020234L, new kvp());
        bdVar.a(sfl.DX_PARSER_HSEARCHBARDATA, new sfl());
        bdVar.a(kwb.DX_PARSER_HTABCONTENTDISPLAYLAYOUTTYPE, new kwb());
        bdVar.a(kwc.DX_PARSER_ISNEWPULL, new kwc());
        if (b.b() || b.c()) {
            bdVar.d().b().a(true, b.d());
            bdVar.d().a(h.a().h());
        }
        try {
            kwl.a(bdVar.d());
        } catch (Throwable th) {
            lap.a("dxInit", "initFowAdDX error", th.getMessage());
        }
        initPopDxPreview();
        initRecommendDxPreview();
    }

    private void initRecommendDxPreview() {
        DinamicXEngine engine = getEngine();
        if (engine == null) {
            return;
        }
        lrf.a(engine);
        engine.a(8281326256809424134L, new sso());
        engine.a(-8936854687533104177L, new sdk());
        engine.a(rhq.DX_PARSER_HGETFROMCURRENTMODEL, new rhq());
        engine.a(rhk.DX_EVENT_HSETTOCURRENTMODEL, new rhk());
    }

    private void initPopDxPreview() {
        DinamicXEngine engine = getEngine();
        if (engine == null) {
            return;
        }
        kyw.a(engine);
    }

    public static DinamicXEngine getEngine() {
        try {
            return engineRouter.d();
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
