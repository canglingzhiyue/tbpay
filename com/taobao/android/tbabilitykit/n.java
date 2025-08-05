package com.taobao.android.tbabilitykit;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.android.abilitykit.mega.a;
import com.taobao.android.abilitykit.mega.b;
import com.taobao.android.af;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.tbabilitykit.weex.pop.render.TAKAbilityHubModule;
import com.taobao.android.tbabilitykit.windvane.pop.render.TAKAbilityHubPlugin;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.common.TypeModuleFactory;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dkt;
import tb.dlc;
import tb.dli;
import tb.dln;
import tb.dmm;
import tb.dmn;
import tb.fiq;
import tb.hvb;
import tb.izm;
import tb.izp;
import tb.izr;
import tb.izs;
import tb.izt;
import tb.izu;
import tb.izv;
import tb.izw;
import tb.izx;
import tb.izy;
import tb.izz;
import tb.jaa;
import tb.jab;
import tb.jac;
import tb.jad;
import tb.jnm;
import tb.kge;

/* loaded from: classes.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15342a;
    private static AtomicBoolean b;

    static {
        kge.a(1174885411);
        f15342a = false;
        b = new AtomicBoolean(false);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f15342a) {
        } else {
            try {
                b();
            } catch (Throwable th) {
                TLog.loge("AbilityKit", "TbAkInit", "init exp:" + dmm.a(th));
            }
            f15342a = true;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        dlc.a aVar = new dlc.a();
        HashMap<String, dln> hashMap = new HashMap<>(200);
        b bVar = new b("MTOP", "requestData", new i());
        hashMap.put("36174867460", bVar);
        hashMap.put("mtop", bVar);
        dli dliVar = new dli(jad.class);
        hashMap.put("startLocationService", dliVar);
        hashMap.put(jad.STARTLOCATIONSERVICE, dliVar);
        dli dliVar2 = new dli(jac.class);
        hashMap.put("checkLocationService", dliVar2);
        hashMap.put(jac.CHECKLOCATIONSERVICE, dliVar2);
        dli dliVar3 = new dli(r.class);
        hashMap.put("sendBroadcast", dliVar3);
        hashMap.put(r.SENDBROADCAST, dliVar3);
        b bVar2 = new b("SharePannel", "open", new l());
        hashMap.put("openShare", bVar2);
        hashMap.put("-5311945073853041490", bVar2);
        a aVar2 = new a(new com.alibaba.ability.builder.a(e.class), e.API_BATCH_COMP_EXPOSURE);
        hashMap.put(e.BATCH_COMP_EXPOSURE, aVar2);
        hashMap.put(e.API_BATCH_COMP_EXPOSURE, aVar2);
        hashMap.put(v.ZCAHCE_PREFETCH, new a(new com.alibaba.ability.builder.a(v.class), "prefetch"));
        hashMap.put(j.SHOWPOPLAYER, new a(new com.alibaba.ability.builder.a(j.class), "show"));
        com.alibaba.ability.builder.a aVar3 = new com.alibaba.ability.builder.a(m.class);
        a aVar4 = new a(aVar3, m.API_WEEX2);
        hashMap.put("6247991069320077767", aVar4);
        hashMap.put("showWeex2Pop", aVar4);
        a aVar5 = new a(aVar3, m.API_CHG_SIZE);
        hashMap.put("9130609484923694635", aVar5);
        hashMap.put("changeSTDPopSize", aVar5);
        a aVar6 = new a(aVar3, m.API_DX);
        hashMap.put("3986215614396433045", aVar6);
        hashMap.put("showDxPop", aVar6);
        a aVar7 = new a(aVar3, m.API_STD_DX);
        hashMap.put("6190661440942079171", aVar7);
        hashMap.put("showStdDXPop", aVar7);
        hashMap.put("showStdDxPop", aVar7);
        a aVar8 = new a(aVar3, m.API_WEEX);
        hashMap.put("3531760516767156884", aVar8);
        hashMap.put(fiq.OPERATE_SHOW_WEEX_POP, aVar8);
        a aVar9 = new a(aVar3, m.API_H5);
        hashMap.put("-2141506650088772581", aVar9);
        hashMap.put(com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.actionShowWindVanePop, aVar9);
        a aVar10 = new a(aVar3, m.API_ULTRON);
        hashMap.put("5675667486637347457", aVar10);
        hashMap.put("showUltronPop", aVar10);
        a aVar11 = new a(aVar3, m.API_NATIVE);
        hashMap.put("3120050928529867108", aVar11);
        hashMap.put("showNativePop", aVar11);
        a aVar12 = new a(aVar3, "close");
        hashMap.put("-5054721624037696157", aVar12);
        hashMap.put("dismissStdPop", aVar12);
        hashMap.put("-8725661404328822574", aVar12);
        hashMap.put("dismissWeexPop", aVar12);
        hashMap.put("-2460236430925693351", aVar12);
        hashMap.put("dismissWindVanePop", aVar12);
        hashMap.put("1450428148730664147", aVar12);
        hashMap.put("dismissDxPop", aVar12);
        b bVar3 = new b("actionSheet", "show");
        b bVar4 = new b("actionSheet", "hide");
        hashMap.put("5287615107804184871", bVar3);
        hashMap.put("-4433317478730044928", bVar4);
        b bVar5 = new b("broadcast", "addEventListener");
        b bVar6 = new b("broadcast", "dispatchEvent");
        b bVar7 = new b("broadcast", "removeEventListener");
        hashMap.put("-2919304423709841379", bVar5);
        hashMap.put("-2389238501438587909", bVar6);
        hashMap.put("8151353824511600005", bVar7);
        hashMap.put("-1539189599379090005", new b("kvStorage", com.taobao.android.weex_framework.util.a.ATOM_EXT_clear));
        hashMap.put("907788072915818654", new b("kvStorage", "getAllKeys"));
        hashMap.put("-1412245266610504100", new b("kvStorage", k.API_GET_CURRENT_INFO));
        hashMap.put("4255344915554475637", new b("kvStorage", "getItem"));
        hashMap.put("36941670233356486", new b("kvStorage", "removeItem"));
        hashMap.put("7761715384706918017", new b("kvStorage", "setItem"));
        hashMap.put("-2537001326812726218", new b(AttributionReporter.SYSTEM_PERMISSION, "check"));
        hashMap.put("-3773705679919406269", new b(AttributionReporter.SYSTEM_PERMISSION, "request"));
        hashMap.put("7826242793715424349", new b("location", WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE));
        hashMap.put("-3650228991512889007", new b("location", "request"));
        hashMap.put("-1643122694260496165", new b("system", "openLocationSettings"));
        b bVar8 = new b("appMonitor", "alarmSuccess", new h());
        hashMap.put("6178545469881757715", bVar8);
        hashMap.put(dmn.TYPE_SUCCESS, bVar8);
        b bVar9 = new b("appMonitor", "alarmFail", new h());
        hashMap.put("617925804773697203", bVar9);
        hashMap.put(dmn.TYPE_FAIL, bVar9);
        b bVar10 = new b("appMonitor", IWXUserTrackAdapter.COUNTER, new h());
        hashMap.put("-3175030764863182054", bVar10);
        hashMap.put(dmn.TYPE_COUNTER, bVar10);
        dli dliVar4 = new dli(com.taobao.android.tbabilitykit.dx.e.class);
        hashMap.put("dxUpdateTemplate", dliVar4);
        hashMap.put(com.taobao.android.tbabilitykit.dx.e.DXDXUPDATETEMPLATE_DXUPDATETEMPLATE, dliVar4);
        dli dliVar5 = new dli(jaa.class);
        hashMap.put("recyclerUpdateState", dliVar5);
        hashMap.put(jaa.RECYCLERUPDATESTATE, dliVar5);
        dli dliVar6 = new dli(izp.class);
        hashMap.put("recyclerAppendItems", dliVar6);
        hashMap.put(izp.RECYCLERAPPENDITEMS, dliVar6);
        dli dliVar7 = new dli(izr.class);
        hashMap.put("recyclerDeleteItems", dliVar7);
        hashMap.put(izr.RECYCLERDELETEITEMS, dliVar7);
        dli dliVar8 = new dli(izs.class);
        hashMap.put("recyclerInsertItems", dliVar8);
        hashMap.put(izs.DXRECYCLERINSERTITEMS, dliVar8);
        dli dliVar9 = new dli(izt.class);
        hashMap.put("recyclerInsertItemsByOffset", dliVar9);
        hashMap.put(izt.RECYCLERINSERTITEMSBYOFFSET, dliVar9);
        dli dliVar10 = new dli(izx.class);
        hashMap.put("recyclerUpdateAllItems", dliVar10);
        hashMap.put(izx.RECYCLERUPDATEALLITEMS, dliVar10);
        dli dliVar11 = new dli(izy.class);
        hashMap.put("recyclerUpdateCurrentItem", dliVar11);
        hashMap.put(izy.RECYCLERUPDATECURRENTITEM, dliVar11);
        dli dliVar12 = new dli(izv.class);
        hashMap.put("recyclerRefreshData", dliVar12);
        hashMap.put(izv.RECYCLERREFRESHDATA, dliVar12);
        dli dliVar13 = new dli(izz.class);
        hashMap.put("recyclerUpdateItems", dliVar13);
        hashMap.put(izz.RECYCLERUPDATEITEMS, dliVar13);
        dli dliVar14 = new dli(izw.class);
        hashMap.put("recyclerScrollToPosition", dliVar14);
        hashMap.put(izw.RECYCLER_SCROLL_TO_POSITION, dliVar14);
        dli dliVar15 = new dli(izu.class);
        hashMap.put("recyclerModifyCurrentItemData", dliVar15);
        hashMap.put(izu.RECYCLERMODIFYCURRENTITEMDATA, dliVar15);
        dli dliVar16 = new dli(com.taobao.android.tbabilitykit.dx.b.class);
        hashMap.put("partialUpdateTemplate", dliVar16);
        hashMap.put(com.taobao.android.tbabilitykit.dx.b.DX_PARTIAL_UPDATE, dliVar16);
        dli dliVar17 = new dli(com.taobao.android.tbabilitykit.dx.c.class);
        hashMap.put("refreshTemplate", dliVar17);
        hashMap.put(com.taobao.android.tbabilitykit.dx.c.REFRESHTEMPLATE, dliVar17);
        dli dliVar18 = new dli(jab.class);
        hashMap.put("viewPagerChangeIndex", dliVar18);
        hashMap.put(jab.VIEWPAGERCHANGEINDEX, dliVar18);
        dli dliVar19 = new dli(com.taobao.android.tbabilitykit.dx.a.class);
        hashMap.put("exposureAbility", dliVar19);
        hashMap.put(com.taobao.android.tbabilitykit.dx.a.EXPOSURE_ABILITY, dliVar19);
        dli dliVar20 = new dli(com.taobao.android.tbabilitykit.dx.f.class);
        hashMap.put("videoControlAbility", dliVar20);
        hashMap.put(com.taobao.android.tbabilitykit.dx.f.VIDEO_CONTROL_ABILITY, dliVar20);
        dli dliVar21 = new dli(com.taobao.android.tbabilitykit.dx.webview.a.class);
        hashMap.put("DXWebViewAbility", dliVar21);
        hashMap.put(com.taobao.android.tbabilitykit.dx.webview.a.DXWEBVIEWABILITY, dliVar21);
        dli dliVar22 = new dli(com.taobao.android.tbabilitykit.dx.g.class);
        hashMap.put("DXVideoViewAbility", dliVar22);
        hashMap.put(com.taobao.android.tbabilitykit.dx.g.DXVIDEOVIEWABILITY, dliVar22);
        aVar.a(hashMap);
        aVar.a(new o());
        aVar.a(new s());
        aVar.a(new q());
        aVar.a(new af());
        aVar.a(new jnm());
        dkt.a(aVar.a());
        c();
        hvb.INSTANCE.a(izm.NAME_SPACE_MEGA_DESIGN, izm.class);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!b.compareAndSet(false, true)) {
        } else {
            try {
                WXSDKEngine.registerModule("abilityHub", (ModuleFactory) new TypeModuleFactory(TAKAbilityHubModule.class), true);
            } catch (Throwable th) {
                if (!(th instanceof NoClassDefFoundError)) {
                    th.printStackTrace();
                }
            }
            try {
                android.taobao.windvane.jsbridge.q.a("AbilityHub", (Class<? extends android.taobao.windvane.jsbridge.e>) TAKAbilityHubPlugin.class);
            } catch (Throwable th2) {
                if (th2 instanceof NoClassDefFoundError) {
                    return;
                }
                th2.printStackTrace();
            }
        }
    }
}
