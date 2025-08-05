package com.taobao.android.icart.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.event.b;
import com.taobao.android.icart.event.f;
import com.taobao.android.icart.event.g;
import com.taobao.android.icart.event.i;
import com.taobao.android.icart.event.j;
import com.taobao.android.icart.event.k;
import com.taobao.android.icart.event.l;
import com.taobao.android.icart.event.m;
import com.taobao.android.icart.widget.touch.DXCartWrapperFrameLayoutWidgetNode;
import java.util.HashMap;
import tb.aad;
import tb.aaf;
import tb.bed;
import tb.bmy;
import tb.bna;
import tb.fuf;
import tb.fxa;
import tb.gmw;
import tb.gmx;
import tb.gmy;
import tb.gmz;
import tb.gna;
import tb.gnb;
import tb.gnc;
import tb.gnd;
import tb.gne;
import tb.gnf;
import tb.gng;
import tb.gnh;
import tb.gni;
import tb.gnj;
import tb.gnk;
import tb.gnl;
import tb.gnm;
import tb.gnn;
import tb.gno;
import tb.gnp;
import tb.icw;
import tb.jqg;
import tb.kge;
import tb.tfu;
import tb.xmd;
import tb.xme;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1632045456);
    }

    public static void a(Context context, bd bdVar, bna bnaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0269a55", new Object[]{context, bdVar, bnaVar});
        } else if (context != null && bdVar != null) {
            jqg.b("DxRegisterUtil", "register");
            HashMap<Long, h> hashMap = new HashMap<Long, h>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil$1
                {
                    put(Long.valueOf(fxa.a("goBack")), new gne());
                    put(Long.valueOf((long) gnd.DX_EVENT_ULTRONEVENTDISPATCH), new gnd());
                    put(Long.valueOf((long) gmw.DX_EVENT_CARTBUBBLEAPPEAR), new gmw());
                    put(Long.valueOf((long) gna.DX_EVENT_CARTSEARCHFOCUS), new gna());
                    put(Long.valueOf((long) gnc.DX_EVENT_TABSHORIZONTALSCROLL), new gnc());
                    put(Long.valueOf((long) gmy.DX_EVENT_CARTCOUDANANIMATIONFINISH), new gmy());
                    put(Long.valueOf((long) gmx.DX_EVENT_CARTBUBBLEFADEANIMATION), new gmx());
                    put(Long.valueOf((long) gmz.DX_EVENT_CARTELEVATORAPPEAR), new gmz());
                    put(Long.valueOf((long) gnb.DX_EVENT_CARTWRITEBACK), new gnb());
                    put(Long.valueOf((long) xme.DX_EVENT_HANDLEWIDGETEXPOSURE), new xme());
                    put(Long.valueOf((long) xmd.DX_EVENT_CARTPREFETCHZCACHE), new xmd());
                }
            };
            HashMap<Long, fuf> hashMap2 = new HashMap<Long, fuf>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil$2
                {
                    put(Long.valueOf(fxa.a(gnp.PARSER_TAG)), new gnp());
                    put(Long.valueOf(fxa.a(gno.PARSER_TAG)), new gno());
                    put(Long.valueOf((long) gnj.DX_PARSER_CARTISNEWCART2021), new gnj());
                    put(Long.valueOf((long) gnn.DX_PARSER_ULTRONDATAREFERENCE), new gnn());
                    put(Long.valueOf((long) gnk.DX_PARSER_CARTSELECTEDITEMCOUNT), new gnk());
                    put(Long.valueOf((long) gnh.DX_PARSER_CARTFILTERSTATE), new gnh());
                    put(Long.valueOf((long) gnm.DX_PARSER_TABSHORIZONTALOFFSET), new gnm());
                    put(Long.valueOf((long) gnf.DX_PARSER_ARRAY_CREATE), new gnf());
                    put(Long.valueOf((long) gni.DX_PARSER_CARTGETBUNDLEHEADER), new gni());
                    put(Long.valueOf((long) gng.DX_PARSER_CARTEXISTCOMPONENTSBYTAG), new gng());
                    put(Long.valueOf((long) gnl.DX_PARSER_ISCARTPOPLAYEROPEN), new gnl());
                }
            };
            try {
                a(context, bdVar);
            } catch (Exception e) {
                bed.a("DXRegisterWidget", e.getMessage());
            }
            HashMap<String, bmy> hashMap3 = new HashMap<String, bmy>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil$3
                {
                    put("cartShowSku", new com.taobao.android.icart.event.h());
                    put("downgrade", new com.taobao.android.icart.event.c());
                    put("undowngrade", new i());
                    put("manageSwitch", new j());
                    put(k.EVENT_TYPE_SWITCH_QUANTITY, new k());
                    put("reQuery", new f());
                    put("cartAddonFetch", new com.taobao.android.icart.event.a());
                    put("cartAddonAddBag", new com.taobao.android.icart.event.a());
                    put("cartAddonOpenUrl", new com.taobao.android.icart.event.a());
                    put("cartScrollToFeedflow", new com.taobao.android.icart.event.a());
                    put("cartAddonRefresh", new com.taobao.android.icart.event.a());
                    put("popupQuery", new com.taobao.android.icart.event.e());
                    put("addressClick", new b());
                    put("listToTop", new com.taobao.android.icart.event.d());
                    put("cartShowIndustrySku", new g());
                    put("addOnTabClick", new l());
                    put(tfu.ADD_CART, new m());
                }
            };
            for (Long l : hashMap.keySet()) {
                bdVar.a(l.longValue(), hashMap.get(l));
            }
            for (Long l2 : hashMap2.keySet()) {
                bdVar.a(l2.longValue(), hashMap2.get(l2));
            }
            if (bnaVar != null) {
                for (String str : hashMap3.keySet()) {
                    bnaVar.b(str, hashMap3.get(str));
                }
            }
            aaf.b(context, bdVar);
        }
    }

    public static void a(final Context context, bd bdVar) {
        HashMap<Long, DXWidgetNode> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd794b9a", new Object[]{context, bdVar});
        } else if (context != null && bdVar != null && bdVar.d() != null) {
            DinamicXEngine d = bdVar.d();
            HashMap<Long, DXWidgetNode> hashMap2 = null;
            if (aad.INSTANCE.a()) {
                hashMap2 = new HashMap<Long, DXWidgetNode>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil$4
                    {
                        put(Long.valueOf((long) com.taobao.android.icart.widget.h.DXTEXTVIEW_TEXTVIEW), new com.taobao.android.icart.widget.l(context));
                        com.taobao.android.icart.widget.k kVar = new com.taobao.android.icart.widget.k();
                        put(7700670404894374791L, kVar);
                        put(Long.valueOf((long) icw.ID), kVar);
                    }
                };
                hashMap = new HashMap<Long, DXWidgetNode>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil$5
                    {
                        put(Long.valueOf((long) com.taobao.android.icart.widget.h.DXTEXTVIEW_TEXTVIEW), new com.taobao.android.icart.widget.h());
                        com.taobao.android.icart.widget.g gVar = new com.taobao.android.icart.widget.g();
                        put(7700670404894374791L, gVar);
                        put(Long.valueOf((long) icw.ID), gVar);
                    }
                };
            } else {
                hashMap = null;
            }
            HashMap<Long, DXWidgetNode> hashMap3 = new HashMap<Long, DXWidgetNode>() { // from class: com.taobao.android.icart.utils.DxRegisterUtil$6
                {
                    put(Long.valueOf((long) com.taobao.android.icart.widget.a.DXALIFLOWLAYOUT_ALIFLOWLAYOUT), new com.taobao.android.icart.widget.a());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.c.DXCARTNEWTAGFLOWLAYOUT_CARTNEWTAGFLOWLAYOUT), new com.taobao.android.icart.widget.c());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.d.DXCARTPRICEFLOWLAYOUT_CARTPRICEFLOWLAYOUT), new com.taobao.android.icart.widget.d());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.e.DXCARTTEXTINPUT_CARTTEXTINPUT), new com.taobao.android.icart.widget.e());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.richtext.b.DXCARTRICHVIEW_CARTRICHVIEW), new com.taobao.android.icart.widget.richtext.b());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.richtext.c.DXCARTTEXTSPAN_CARTTEXTSPAN), new com.taobao.android.icart.widget.richtext.c());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.richtext.a.DXCARTIMAGESPAN_CARTIMAGESPAN), new com.taobao.android.icart.widget.richtext.a());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.swipe.a.DXCARTFRAMELAYOUT_CARTFRAMELAYOUT), new com.taobao.android.icart.widget.swipe.a());
                    put(Long.valueOf((long) DXCartWrapperFrameLayoutWidgetNode.DXCARTWRAPPERFRAMELAYOUT_CARTWRAPPERFRAMELAYOUT), new DXCartWrapperFrameLayoutWidgetNode());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.f.DXCARTTRANSLATABLEFRAMELAYOUT_CARTTRANSLATABLEFRAMELAYOUT), new com.taobao.android.icart.widget.f());
                    put(Long.valueOf((long) com.taobao.android.icart.widget.b.DXCARTLOTTIEVIEW_CARTLOTTIEVIEW), new com.taobao.android.icart.widget.b());
                    if (!aad.INSTANCE.a()) {
                        put(Long.valueOf((long) com.taobao.android.icart.widget.h.DXTEXTVIEW_TEXTVIEW), new com.taobao.android.icart.widget.h());
                        com.taobao.android.icart.widget.g gVar = new com.taobao.android.icart.widget.g();
                        put(7700670404894374791L, gVar);
                        put(Long.valueOf((long) icw.ID), gVar);
                    }
                    put(Long.valueOf((long) com.taobao.android.icart.widget.j.DXCARTFLOWSEPARATORLAYOUT_CARTFLOWSEPARATORLAYOUT), new com.taobao.android.icart.widget.j());
                }
            };
            for (Long l : hashMap3.keySet()) {
                d.a(l.longValue(), hashMap3.get(l));
            }
            if (hashMap2 != null) {
                for (Long l2 : hashMap2.keySet()) {
                    d.c(l2.longValue(), hashMap2.get(l2));
                }
            }
            if (hashMap == null) {
                return;
            }
            for (Long l3 : hashMap.keySet()) {
                d.b(l3.longValue(), hashMap.get(l3));
            }
        }
    }
}
