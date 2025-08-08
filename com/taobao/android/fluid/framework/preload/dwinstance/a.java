package com.taobao.android.fluid.framework.preload.dwinstance;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.x2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kox;
import tb.ljm;
import tb.oeb;
import tb.ogv;
import tb.oyw;
import tb.pil;
import tb.pio;
import tb.snu;
import tb.snv;
import tb.soq;
import tb.sox;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1463690713);
    }

    public static Pair<snv, String> a(FluidContext fluidContext, Context context, boolean z, String str, String str2, String str3, TNodeView tNodeView, Map map, DetailCacheData detailCacheData) {
        boolean z2;
        String str4;
        String str5;
        snv a2;
        Pair<snv, String> pair;
        String str6;
        int i;
        boolean z3;
        Pair<snv, String> pair2;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f0935896", new Object[]{fluidContext, context, new Boolean(z), str, str2, str3, tNodeView, map, detailCacheData});
        }
        if (!(context instanceof Activity)) {
            spz.c("PickPreloadController_PreDWInstanceCreator", "createDWInstanceInternal, context不是Activity");
            return new Pair<>(null, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        pio.a(pio.GG_VIDEOTAB_VIDEO_NEW_DW_INSTANCE);
        pil.a(context, null, "gg_pickpreload_preCreateDW");
        String str8 = z ? "ggpick_preload" : "guangguang_pick";
        boolean z4 = !StringUtils.isEmpty(str2);
        if (z4) {
            z2 = z4;
            str4 = "gg_pickpreload_preCreateDW";
            str5 = "PickPreloadController_PreDWInstanceCreator";
            a2 = snu.a(fluidContext, context, null, str2, x2.o, 960, null, str8, str, true);
            if (a2.f() != null) {
                a2.f().setTag(R.id.fluid_sdk_tag_localVideo, true);
            }
            pair = new Pair<>(a2, str);
        } else {
            z2 = z4;
            str4 = "gg_pickpreload_preCreateDW";
            str5 = "PickPreloadController_PreDWInstanceCreator";
            a2 = snu.a(fluidContext, context, str, null, null, str3, str8, true);
            pair = new Pair<>(a2, str);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        boolean a3 = oyw.a(context).a();
        boolean z5 = soq.n() && sox.a(str3);
        boolean z6 = tNodeView == null;
        HashMap hashMap = new HashMap();
        hashMap.put("isVideoCached", String.valueOf(z5));
        hashMap.put("isLocalVideo", String.valueOf(z2));
        hashMap.put("videoId", String.valueOf(str));
        if (detailCacheData != null) {
            i = detailCacheData.hasVideoDownloadSize;
            str6 = detailCacheData.hasVideoDownloadUrl;
            hashMap.put("hasVideoDownloadSize", String.valueOf(i));
            hashMap.put("videoCacheMatched", String.valueOf(z5 == (i > 0)));
            hashMap.put("hasVideoDownloadUrl", str6);
        } else {
            str6 = "";
            i = 0;
        }
        hashMap.put("isDWP2ff", String.valueOf(z6));
        hashMap.put("isPrecreateDW", String.valueOf(z));
        hashMap.put("isPlayerCacheValid", String.valueOf(a3));
        hashMap.put("createDwElapsedTime", String.valueOf(currentTimeMillis2));
        if (a2 != null) {
            z3 = z2;
            a2.a(a((String) pair.second, map, z3));
            HashMap<String, String> a4 = a(z3);
            a4.putAll(hashMap);
            a2.b(a4);
            if (z6) {
                final ViewGroup f = a2.f();
                boolean a5 = c.a((View) f);
                pair2 = pair;
                str7 = str6;
                hashMap.put(soq.AB_KEY_OPT_P2FF_VIEW, String.valueOf(a5));
                long currentTimeMillis3 = System.currentTimeMillis();
                pil.a(context, null, "gg_videotab_video_pre_dw_p2ff");
                a2.g();
                pil.a(context, null, "gg_videotab_video_pre_dw_p2ff", hashMap);
                spz.c(str5, "[preloadvideo][stagecost]p2ff,cose=" + (System.currentTimeMillis() - currentTimeMillis3) + ",videoCached=" + z5);
                if (a5) {
                    f.postDelayed(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.dwinstance.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                c.b(f);
                            }
                        }
                    }, 500L);
                }
            } else {
                pair2 = pair;
                str7 = str6;
            }
            if (a2.f() != null && tNodeView != null) {
                a2.f().setTag(R.id.fluid_sdk_tag_tnodeView, tNodeView);
            }
        } else {
            z3 = z2;
            pair2 = pair;
            str7 = str6;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[preloadvideo][stagecost]预创建播放器,createDwCost=");
        sb.append(currentTimeMillis2);
        sb.append(",allcost:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" videoId=");
        sb.append(str);
        sb.append(" isLocal:");
        sb.append(z3);
        sb.append(" 成功:");
        sb.append(a2 != null);
        sb.append(" videoCached=");
        sb.append(z5);
        sb.append(" hasVideoDownloadSize=");
        sb.append(i);
        sb.append(" isPlayerCacheValid=");
        sb.append(a3);
        sb.append(" needP2ff=");
        sb.append(z6);
        spz.c(str5, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[cachevideo]videocache is match ? ");
        sb2.append(z5 == (i > 0));
        sb2.append("; downloadUrl=");
        sb2.append(str7);
        spz.c(str5, sb2.toString());
        pio.b(pio.GG_VIDEOTAB_VIDEO_NEW_DW_INSTANCE);
        if (a2 != null) {
            pil.a(context, null, str4, hashMap);
        } else {
            pil.a(context, null, str4, "noDwInstance", hashMap);
        }
        return pair2;
    }

    public static HashMap<String, String> a(String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("759bbf44", new Object[]{str, map, new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id", str);
        hashMap.put("x_bizline", "guangguang");
        hashMap.put("index", "0");
        hashMap.put("videoid", str);
        hashMap.put("version", AfcCustomSdk.SDK_VERSION);
        hashMap.put("xubo", "0");
        hashMap.put("sourceType", "guangguang_pick");
        hashMap.put("content_id", str);
        hashMap.put("spm", "a310p.13800399.0.0");
        hashMap.put("spm-cnt", "a310p.13800399.0.0");
        hashMap.put("sourceGroup", "guangguang");
        hashMap.put("source", "guangguang_pick");
        hashMap.put("page", "guangguang_pick");
        hashMap.put("cid", str);
        hashMap.put(kox.X_OBJECT_ID, str);
        hashMap.put("x_object_type", "common_video_page");
        hashMap.put("content_type", "video");
        hashMap.put("product_type", com.taobao.android.fluid.business.usertrack.track.b.PRODUCT_NAME);
        hashMap.put(snv.EXP_KEY_PRECREATED_DW, "true");
        hashMap.put("platform", "phone");
        if (i.b("video")) {
            hashMap.put("isFromLauncher", "true");
            hashMap.put("processLauncherFlag", "1");
        }
        hashMap.put("isLocalVideo", String.valueOf(z));
        hashMap.put(snv.EXP_KEY_IS_HUITUI, String.valueOf(i.c("video")));
        if (map != null) {
            hashMap.putAll(map);
            if (oeb.a("ShortVideo.addUtLogMapForPreDW", true)) {
                hashMap.put("utLogMap", JSON.toJSONString(map));
            }
        }
        return hashMap;
    }

    public static HashMap<String, String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c1ef85cf", new Object[]{new Boolean(z)});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("videoActionType", "init");
        hashMap.put(snv.EXP_KEY_PRECREATED_DW, "true");
        hashMap.put(snv.EXP_KEY_FULL_PAGE_INDEX, "0");
        hashMap.put(snv.EXP_KEY_SUB_BUSINESS_TYPE, "guangguang_pick");
        hashMap.put("isLocalVideo", String.valueOf(z));
        hashMap.put(snv.EXP_KEY_IS_HUITUI, String.valueOf(i.c("video")));
        hashMap.put(snv.EXP_KEY_USE_SOFTWARE_FOR_FIRSTVideo, String.valueOf(a()));
        HashMap<String, String> a2 = ljm.a(false);
        if (!ogv.a(a2)) {
            hashMap.putAll(a2);
        }
        if (i.b("video")) {
            hashMap.put("isFromLauncher", "true");
            hashMap.put("processLauncherFlag", "1");
        }
        return hashMap;
    }

    private static boolean a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (i.c("video")) {
            str = "softwareInHuitui";
        } else {
            str = i.b("video") ? "softwareInColdLauncher" : "softwareInHotLauncher";
        }
        return i.a(ab.a(), str, false);
    }
}
