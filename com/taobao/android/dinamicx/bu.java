package com.taobao.android.dinamicx;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.alibaba.security.realidentity.f2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.bi;
import com.taobao.android.dinamicx.component.TIconFontViewConstructor;
import com.taobao.android.dinamicx.component.TImageViewConstructor;
import com.taobao.android.dinamicx.v;
import com.taobao.android.dinamicx.widget.ah;
import com.taobao.android.dinamicx.widget.ap;
import com.taobao.android.dinamicx.widget.as;
import com.taobao.android.dinamicx.widget.bl;
import com.taobao.android.dinamicx.widget.q;
import com.taobao.android.dinamicx.widget.r;
import com.taobao.android.dinamicx.widget.video.DXProgressBarWidgetNode;
import com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode;
import com.taobao.android.weex_framework.module.builtin.WXLocalStorageModule;
import com.taobao.taolive.dinamicext.homepage.TLiveViewConstructor;
import tb.fut;
import tb.fuw;
import tb.fvf;
import tb.fvg;
import tb.fvh;
import tb.gbv;
import tb.gfa;
import tb.gfd;
import tb.ghf;
import tb.hie;
import tb.jdm;
import tb.jdn;
import tb.jqm;
import tb.mrc;

/* loaded from: classes.dex */
public class bu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11829a = false;

    private static v.a a(Context context, com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar, com.taobao.android.dinamicx.model.b<fut> bVar2, com.taobao.android.dinamicx.model.b<bn> bVar3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (v.a) ipChange.ipc$dispatch("255248a9", new Object[]{context, bVar, bVar2, bVar3});
        }
        v.a aVar = new v.a();
        com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar4 = new com.taobao.android.dinamicx.model.b<>(30);
        bVar4.put(-4224482009255257824L, new ap.a());
        bVar4.put(com.taobao.android.dinamicx.widget.q.DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT, new q.a());
        bVar4.put(com.taobao.android.dinamicx.widget.as.DX_WIDGET_ID, new as.a());
        bVar4.put(com.taobao.android.dinamicx.widget.r.DXOCRIMAGEVIEW_OCRIMAGEVIEW, new r.a());
        bVar4.put(com.taobao.android.dinamicx.widget.ah.DXWEBVIEW, new ah.a());
        bVar4.put(DXVideoViewWidgetNode.DXVIDEOVIEW_VIDEOVIEW, new DXVideoViewWidgetNode.a());
        bVar4.put(DXProgressBarWidgetNode.DXVIDEOPROGRESSBAR_VIDEOPROGRESSBAR, new DXProgressBarWidgetNode.a());
        aVar.c(bVar4);
        com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar5 = new com.taobao.android.dinamicx.model.b<>(5);
        bVar5.put(-4224482009255257824L, new bl.a());
        aVar.d(bVar5);
        com.taobao.android.dinamicx.model.b<fut> bVar6 = new com.taobao.android.dinamicx.model.b<>(30);
        bVar6.put(fvg.DX_PARSER_MTOPTIMESTAMP, new fvg());
        bVar6.put(-3536948596548552968L, new fvf());
        bVar6.put(mrc.DX_PARSER_ISI18NEDITION, new mrc());
        bVar6.put(jdm.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new jdm());
        bVar6.put(jdn.DX_PARSER_TAOBAO_THEME_VALID, new jdn());
        aVar.a(new com.taobao.android.dinamicx.elder.a(context.getApplicationContext()));
        aVar.a(new com.taobao.android.dinamicx.elder.b());
        aVar.b(bVar6);
        if (bVar != null && bVar.size() != 0) {
            bVar4.a(bVar);
        }
        if (bVar2 != null && bVar2.size() != 0) {
            bVar6.a(bVar2);
        }
        if (bVar3 != null && bVar3.size() != 0) {
            aVar.a(bVar3);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        aVar.b(z);
        aVar.a(new bi() { // from class: com.taobao.android.dinamicx.bu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.bi
            public /* synthetic */ boolean a() {
                return bi.CC.$default$a(this);
            }

            @Override // com.taobao.android.dinamicx.bi
            public boolean a(Context context2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9e1d6464", new Object[]{this, context2})).booleanValue() : com.taobao.android.tbtheme.c.a(context2);
            }

            @Override // com.taobao.android.dinamicx.bi
            public int a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
                }
                if (i == 0) {
                    return com.taobao.android.tbtheme.c.a(0, i2);
                }
                if (i == 1) {
                    return com.taobao.android.tbtheme.c.a(2, i2);
                }
                return com.taobao.android.tbtheme.c.a(3, i2);
            }
        });
        aVar.a(1);
        aVar.a(com.taobao.android.dinamicx.muise.a.class);
        aVar.a(new com.taobao.android.dinamicx.widget.s());
        aVar.b(new com.taobao.android.dinamicx.widget.b());
        aVar.a(new g());
        aVar.a(new com.taobao.android.dinamicx.widget.a());
        aVar.a(new z());
        aVar.a(new l());
        aVar.a(b());
        aVar.a(new j());
        aVar.a(new bw());
        aVar.a((com.taobao.android.dinamicx.widget.bf) new com.taobao.android.dinamicx.widget.at());
        aVar.a(new cc());
        aVar.a(new hie());
        aVar.a(new ch());
        aVar.a(new ck());
        return aVar;
    }

    private static ghf b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ghf) ipChange.ipc$dispatch("16b6af78", new Object[0]);
        }
        ghf ghfVar = new ghf();
        ghfVar.a(new com.taobao.android.dinamicx_v4.loader.b());
        ghfVar.a(new gbv());
        ghfVar.a(com.taobao.android.dinamicx.logic.b.class);
        ghfVar.a(new gfa());
        ghfVar.a(new gfd());
        return ghfVar;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        com.taobao.android.dinamicx.expression.expr_v2.d.a(WXLocalStorageModule.NAME, "getItem", new com.taobao.android.dinamicx.muise.c());
        com.taobao.android.dinamicx.expression.expr_v2.d.a(WXLocalStorageModule.NAME, "setItem", new com.taobao.android.dinamicx.muise.e());
        com.taobao.android.dinamicx.expression.expr_v2.d.a(WXLocalStorageModule.NAME, "removeItem", new com.taobao.android.dinamicx.muise.d());
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            com.taobao.android.dinamic.c.a().a("TImageView", new TImageViewConstructor());
            com.taobao.android.dinamic.c.a().a("XIconFontView", new TIconFontViewConstructor());
            com.taobao.android.dinamic.c.a().a("TLiveView", new TLiveViewConstructor());
            com.taobao.android.dinamic.c.a().a(f2.g, new fvh());
            com.taobao.android.dinamic.c.a().a(new br());
        } catch (Throwable th) {
            Log.e("DinamicException", "TBDinamicX registerView failed", th);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f11829a) {
        } else {
            d.b(context, a(context, null, null, null), jqm.a());
            if (!ABGlobal.isFeatureOpened(context, "removeTAKAbilityEngineWrapperInitFromDX")) {
                try {
                    com.taobao.android.tbabilitykit.n.a();
                } catch (Throwable th) {
                    fuw.a("DinamicException", "TBDinamicX init tb ability engine failed", th);
                }
            }
            c();
            f11829a = true;
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        d.a(context, jqm.a());
        a();
    }
}
