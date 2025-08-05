package tb;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.f;
import com.taobao.android.dinamicx.model.a;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.m;
import com.taobao.detail.rate.vivid.ability.b;
import com.taobao.detail.rate.vivid.ability.c;
import com.taobao.detail.rate.vivid.ability.d;
import com.taobao.detail.rate.vivid.ability.e;
import com.taobao.detail.rate.vivid.ability.f;
import com.taobao.detail.rate.vivid.ability.g;
import com.taobao.detail.rate.vivid.ability.h;
import com.taobao.detail.rate.vivid.ability.i;
import com.taobao.detail.rate.vivid.ability.j;
import com.taobao.detail.rate.vivid.ability.k;
import com.taobao.detail.rate.vivid.ability.l;
import com.taobao.detail.rate.widget.DXMegaVideoWidgetNodeV2;
import com.taobao.statistic.TBS;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.xpk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J$\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¨\u0006\u001e"}, d2 = {"Lcom/taobao/detail/rate/vivid/utils/DxUtils;", "", "()V", "getWidgetContentViewAttribute", "Lcom/taobao/android/dinamicx/model/DXLayoutParamAttribute;", "layoutWidth", "", "layoutHeight", "weight", "", "layoutGravity", "direction", "initDXEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "akAbilityEngine", "Lcom/taobao/android/abilitykit/AKAbilityEngine;", "registerReceiverAbilityBuild", "Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Builder;", "context", "Landroid/content/Context;", "reportDXDownloadErrorIfNeed", "", "result", "Lcom/taobao/android/dinamicx/notification/DXNotificationResult;", "setWidgetContentLayoutParams", "viewGroup", "Landroid/view/ViewGroup;", c.MSG_SOURCE_PARENT, "Lcom/taobao/android/dinamicx/widget/DXLayout;", "beforeMeasureAttribute", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kpz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kpz INSTANCE = new kpz();

    private kpz() {
    }

    public final void a(ViewGroup viewGroup, m parent, a aVar) {
        ViewGroup.LayoutParams generateLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72aff298", new Object[]{this, viewGroup, parent, aVar});
            return;
        }
        q.d(viewGroup, "viewGroup");
        q.d(parent, "parent");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            q.a(aVar);
            generateLayoutParams = parent.generateLayoutParams(aVar);
        } else {
            q.a(aVar);
            generateLayoutParams = parent.generateLayoutParams(aVar, layoutParams);
        }
        viewGroup.setLayoutParams(generateLayoutParams);
    }

    public final a a(int i, int i2, double d, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a0150bf", new Object[]{this, new Integer(i), new Integer(i2), new Double(d), new Integer(i3), new Integer(i4)});
        }
        a aVar = new a();
        aVar.f11888a = i;
        aVar.b = i2;
        aVar.c = d;
        if (i3 != aVar.e) {
            aVar.d = gbh.a(DXWidgetNode.getAbsoluteGravity(i3, i4));
            aVar.e = i3;
        }
        return aVar;
    }

    public final DinamicXEngine a(dkt dktVar, c.a aVar, Context context) {
        com.taobao.android.megadesign.dx.view.c cVar;
        IpChange ipChange = $ipChange;
        int i = 2;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("2a0099f3", new Object[]{this, dktVar, aVar, context});
        }
        boolean z2 = !kjp.INSTANCE.a();
        boolean a2 = ses.INSTANCE.a();
        boolean z3 = context != null && kio.INSTANCE.C() && kil.e(context);
        DXEngineConfig.a g = new DXEngineConfig.a(kin.INSTANCE.a()).b(1).a(dktVar).a(a2).g(z2);
        if (!kio.INSTANCE.c() && !a2) {
            i = 0;
        }
        DXEngineConfig.a c = g.f(i).d(kio.INSTANCE.b()).d(kin.INSTANCE.c()).a(kin.INSTANCE.b()).c(a2);
        if (xkm.INSTANCE.b() && z2) {
            z = true;
        }
        DXEngineConfig a3 = c.f(z).a(z3, z3).g(xkm.INSTANCE.i() ? 1 : 0).a();
        q.b(a3, "DXEngineConfig.Builder(K…\n                .build()");
        DinamicXEngine dinamicXEngine = new DinamicXEngine(a3);
        if (z3 && (context instanceof Activity)) {
            dinamicXEngine.a((Activity) context);
        }
        dinamicXEngine.a(kiy.DX_PARSER_LIST_FILTER, new kiy());
        dinamicXEngine.a(kjh.DX_PARSER_TBORANGE, new kjh());
        dinamicXEngine.a(kix.DX_PARSER_KV2JSON, new kix());
        dinamicXEngine.a(kiw.Companion.a(), new kiw());
        dinamicXEngine.a(kjj.Companion.a(), new kjj());
        dinamicXEngine.a(kjb.Companion.a(), new kjb());
        dinamicXEngine.a(kiv.DX_PARSER_INDEXOFVALUEFORKEYPATH, new kiv());
        dinamicXEngine.a(kiv.DX_PARSER_INDEXOFVALUEFORKEYPATH, new kiv());
        dinamicXEngine.a(kje.DX_PARSER_RLLIST2MAP, new kje());
        dinamicXEngine.a(kjf.DX_PARSER_STRIMPLODE, new kjf());
        dinamicXEngine.a(kja.DX_PARSER_MAPIMPLODE, new kja());
        dinamicXEngine.a(kiz.DX_PARSER_MAP_CONCAT, new kiz());
        dinamicXEngine.a(kjc.DX_PARSER_RATEUNITEXCHANGE, new kjc());
        dinamicXEngine.a(kiu.Companion.a(), new kiu());
        dinamicXEngine.a(kit.Companion.a(), new kit());
        dinamicXEngine.a(kjg.Companion.a(), new kjg());
        dinamicXEngine.a(kji.DX_PARSER_VALUEFORKEYPATH, new kji());
        dinamicXEngine.a(kis.Companion.a(), new kis());
        dinamicXEngine.a(kjd.Companion.a(), new kjd());
        dinamicXEngine.a(kir.Companion.a(), new kir());
        dinamicXEngine.a(rif.Companion.a(), new rif());
        dinamicXEngine.a(rie.DX_PARSER_DICREMOVEBYKEY, new rie());
        dinamicXEngine.a(rig.DX_PARSER_RATEINDEXOFARRAY, new rig());
        dinamicXEngine.a(xkj.DX_PARSER_RATELISTUSERHEADPIC, new xkj());
        if (kjp.INSTANCE.a()) {
            kjl kjlVar = new kjl();
            dinamicXEngine.a(kjl.Companion.a(), kjlVar);
            dinamicXEngine.a(com.taobao.android.megadesign.dx.view.c.Companion.a(), kjlVar);
        } else {
            if (ses.INSTANCE.a()) {
                cVar = new DXMegaVideoWidgetNodeV2();
            } else {
                cVar = new com.taobao.android.megadesign.dx.view.c();
            }
            ak akVar = cVar;
            dinamicXEngine.a(kjl.Companion.a(), akVar);
            dinamicXEngine.a(com.taobao.android.megadesign.dx.view.c.Companion.a(), akVar);
        }
        dinamicXEngine.a(kjm.Companion.a(), new kjm());
        dinamicXEngine.a(kjn.Companion.a(), new kjn());
        dinamicXEngine.a(kjk.Companion.a(), new kjk());
        dinamicXEngine.a(kpy.DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGFLOWVIEW, new kpy());
        dinamicXEngine.a(kiq.Companion.a(), new kiq());
        dinamicXEngine.a(thq.DX_EVENT_DXEVENTSCROLLSTATECHANGE, new thq());
        if (kio.INSTANCE.f()) {
            dinamicXEngine.a(f.DX_EVENT_EVENTCHAIN, new kip());
        }
        dinamicXEngine.a(d.SHOWRATESKUPOP, new d.a());
        dinamicXEngine.a(b.Companion.a(), new b.a());
        dinamicXEngine.a(com.taobao.detail.rate.vivid.ability.c.Companion.a(), aVar);
        dinamicXEngine.a(e.XRATEWINDVANEV2, new e.a());
        dinamicXEngine.a(com.taobao.detail.rate.vivid.ability.f.XRATETRANSLATE, new f.a());
        dinamicXEngine.a(g.CUSTOMAPM, new g.a());
        dinamicXEngine.a(i.RATEFIRSTFRAMETRACK, new i.a());
        dinamicXEngine.a(h.RATEFIRSTFRAMEPICTURERENDER, new h.a());
        dinamicXEngine.a(j.SRKPREREQUEST, new j.a());
        dinamicXEngine.a(xpk.TBTRADEJSTRACKERREPORT, new xpk.a());
        dinamicXEngine.a(l.XRATEOPENPREVIEWV2, new l.a());
        dinamicXEngine.a(k.RATELOADINGVIEWFIRSTFRAMEPICTURERENDER, new k.a());
        dinamicXEngine.l().a("-6435166934211554155", com.taobao.detail.rate.vivid.ability.a.class, "split");
        dinamicXEngine.l().a("dataProcessSplit", com.taobao.detail.rate.vivid.ability.a.class, "split");
        return dinamicXEngine;
    }

    public final void a(fvb fvbVar) {
        List<DXTemplateItem> list;
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94fa006", new Object[]{this, fvbVar});
            return;
        }
        Object obj = null;
        if (fvbVar != null && (list = fvbVar.b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                DXTemplateItem dXTemplateItem = (DXTemplateItem) next;
                if (dXTemplateItem == null || (str = dXTemplateItem.f11925a) == null || !str.equals(kio.INSTANCE.n())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            obj = (DXTemplateItem) obj;
        }
        if (obj == null) {
            return;
        }
        String str2 = "failedTemplate:" + obj + ", requestList:" + fvbVar.c;
        android.taobao.windvane.util.m.e(kin.INSTANCE.a(), "模板下载失败. " + str2);
        TBS.Ext.commitEvent("Page_DetailComments2", 2201, "Page_DetailComments_renderend", null, null, "success=0,reason=dxDownload,errDetail=" + str2);
    }
}
