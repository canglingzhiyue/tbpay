package com.taobao.android.fluid.framework.preload.dwinstance;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.cache.DetailCacheData;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.taobao.R;
import java.io.File;
import tb.kge;
import tb.obz;
import tb.oeb;
import tb.oec;
import tb.ogv;
import tb.ohh;
import tb.sjt;
import tb.snv;
import tb.soo;
import tb.sop;
import tb.sor;
import tb.sov;
import tb.spz;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int P2FF_PREADDVIEW_SAFEREMOVE_DELAYTIME = 500;

    /* renamed from: a  reason: collision with root package name */
    public static long f12637a;
    private static String b;
    private static String c;
    private static long d;
    private static boolean e;
    private static boolean f;

    static {
        kge.a(-1226306169);
        b = "435094871315";
        c = "435094871315_localfile";
        f12637a = -1L;
        d = -1L;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : d;
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            d = j;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f;
    }

    public static void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{uri});
            return;
        }
        f = "1".equals(uri.getQueryParameter("skipMTOPSS"));
        e = true;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : e;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (f12637a < 0) {
            z = true;
        }
        if (System.currentTimeMillis() - f12637a > 0) {
            z = true;
        }
        spz.c("PickPreloadController_PreloadVideoUtils", "PickPreloadController,iconNetWorkRequestOverdued，overdued:" + z);
        return z;
    }

    public static sor a(FluidInstance fluidInstance, Context context, TNodeView tNodeView, boolean z, Uri uri, DetailCacheData detailCacheData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("bc554bf6", new Object[]{fluidInstance, context, tNodeView, new Boolean(z), uri, detailCacheData});
        }
        if (detailCacheData == null) {
            return null;
        }
        String videoResourceStr = detailCacheData.getVideoResourceStr();
        JSONObject a2 = obz.a(videoResourceStr);
        String string = !ogv.a(a2) ? a2.getString("id") : null;
        JSONObject a3 = sov.a(uri);
        String localVideoCachePath = detailCacheData instanceof com.taobao.android.fluid.framework.preload.cache.c ? ((com.taobao.android.fluid.framework.preload.cache.c) detailCacheData).getLocalVideoCachePath() : null;
        Pair<snv, String> a4 = a.a(fluidInstance, context, false, string, localVideoCachePath, videoResourceStr, tNodeView, a3, detailCacheData);
        sor sorVar = new sor((snv) a4.first, (String) a4.second);
        sorVar.d = detailCacheData.getTimeStamp();
        sorVar.j = videoResourceStr;
        sorVar.k = !StringUtils.isEmpty(localVideoCachePath);
        sorVar.l = null;
        sorVar.p = StringUtils.equals(detailCacheData.getSceneName(), IDetailCache.SCENE_NAME_SHORT_VIDEO_INTERNAL_EXPOSED);
        sorVar.t = b(uri);
        sorVar.q = false;
        sorVar.r = z;
        sorVar.s = true;
        if (sorVar.f33778a != null && sorVar.f33778a.f() != null) {
            sorVar.f33778a.f().setTag(R.id.fluid_sdk_tag_preloadVideo, sorVar);
        }
        if (sop.a().b().m) {
            sorVar.m = detailCacheData.getFirstFrameUrl();
        }
        if (StringUtils.isEmpty(sorVar.b) && !StringUtils.isEmpty(detailCacheData.contentId)) {
            sorVar.b = detailCacheData.contentId;
            spz.c("PickPreloadController_PreloadVideoUtils", "播控为null，preloadedVideo.videoId为null，取cache里面的contentId");
        }
        try {
            if (sjt.y() && detailCacheData.getMediaContentDetailData() != null) {
                sorVar.u = new com.taobao.android.fluid.framework.data.datamodel.a((MediaContentDetailData) JSON.toJavaObject(detailCacheData.getMediaContentDetailData(), MediaContentDetailData.class), detailCacheData.getMediaContentDetailJson());
            }
        } catch (Exception e2) {
            spz.a("PickPreloadController_PreloadVideoUtils", "构建mediaSetData失败" + e2.getMessage(), e2);
        }
        return sorVar;
    }

    public static sor a(FluidInstance fluidInstance, Context context, TNodeView tNodeView, boolean z, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sor) ipChange.ipc$dispatch("e3bb16c6", new Object[]{fluidInstance, context, tNodeView, new Boolean(z), uri});
        }
        if (!(context instanceof Activity)) {
            spz.c("PickPreloadController_PreloadVideoUtils", "PickPreloadControllerNew,setLocalVideoPreloadData当前的Context不是Activity的Context，return");
            return null;
        }
        String a2 = a(context, z);
        JSONObject a3 = sov.a(uri);
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        spz.c("PickPreloadController_PreloadVideoUtils", "PickPreloadControllerNew,创建本地文件播放器");
        Pair<snv, String> a4 = a.a(fluidInstance, context, false, b, a2, null, tNodeView, a3, null);
        sor sorVar = new sor((snv) a4.first, (String) a4.second);
        sorVar.j = null;
        sorVar.k = true;
        sorVar.l = a2;
        sorVar.p = true;
        sorVar.t = b(uri);
        sorVar.q = false;
        sorVar.r = z;
        return sorVar;
    }

    public static String a(Context context, boolean z) {
        String[] split;
        File a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6033d0ac", new Object[]{context, new Boolean(z)});
        }
        synchronized (c.class) {
            IStorage q = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().q();
            Object b2 = ohh.b("Tab2localVideoConfig");
            String str = b2 instanceof String ? (String) b2 : null;
            if (!StringUtils.isEmpty(str) && (split = str.split(",")) != null && split.length == 2) {
                String str2 = split[0];
                String str3 = split[1];
                if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3) && (a2 = q.a(str3)) != null && a2.exists()) {
                    spz.c("PickPreloadController_PreloadVideoUtils", "获取远程配置的视频文件, videoId:" + str2);
                    b = str2;
                    return a2.getAbsolutePath();
                }
            }
            if (!z && !oeb.a("ShortVideo.useLocalVideoInHotLaunch", true)) {
                spz.c("PickPreloadController_PreloadVideoUtils", "热启不使用本地视频文件");
                return null;
            }
            File a3 = q.a(c);
            if (a3 != null) {
                if (a3.exists() && a3.isFile()) {
                    spz.c("PickPreloadController_PreloadVideoUtils", "本地视频文件已存在");
                    return a3.getAbsolutePath();
                } else if (oec.a(context, "tab2_launcher.mp4", a3)) {
                    spz.c("PickPreloadController_PreloadVideoUtils", "移动本地视频文件成功");
                    return a3.getAbsolutePath();
                }
            }
            spz.c("PickPreloadController_PreloadVideoUtils", "本地视频文件不存在");
            return null;
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            return c(context) == 1;
        } catch (Throwable th) {
            spz.a("PickPreloadController_PreloadVideoUtils", th.getMessage(), th);
            return false;
        }
    }

    private static int c(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.getType();
            }
            return 0;
        } catch (Throwable th) {
            spz.a("PickPreloadController_PreloadVideoUtils", th.getMessage(), th);
            return 0;
        }
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("spm");
        if (StringUtils.isEmpty(queryParameter)) {
            return false;
        }
        return queryParameter.startsWith("huitui.huitui");
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue() : ((IPreloadService) fluidContext.getService(IPreloadService.class)).isPreloadedVideoAdded(fluidContext);
    }

    public static boolean a(sor sorVar, soo sooVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b9a339", new Object[]{sorVar, sooVar, new Boolean(z)})).booleanValue();
        }
        if (sorVar == null || sooVar == null) {
            return false;
        }
        return (sooVar.l ^ true) && !z && (sorVar.k || (sorVar.s && sorVar.p));
    }

    public static TNodeView a(ViewParent viewParent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("ee2e153d", new Object[]{viewParent});
        }
        while (true) {
            z = viewParent instanceof TNodeView;
            if (z || viewParent == null) {
                break;
            }
            viewParent = viewParent.getParent();
        }
        if (!z) {
            return null;
        }
        return (TNodeView) viewParent;
    }

    public static boolean a(snv snvVar) {
        ViewGroup f2;
        sor sorVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff16fb81", new Object[]{snvVar})).booleanValue();
        }
        if (snvVar == null || (f2 = snvVar.f()) == null || (sorVar = (sor) f2.getTag(R.id.fluid_sdk_tag_preloadVideo)) == null) {
            return false;
        }
        return sorVar.k || sorVar.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(final android.view.View r6) {
        /*
            java.lang.String r0 = "PickPreloadController_PreloadVideoUtils"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.fluid.framework.preload.dwinstance.c.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1b
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r6
            java.lang.String r6 = "9501e36e"
            java.lang.Object r6 = r1.ipc$dispatch(r6, r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1b:
            if (r6 != 0) goto L1e
            return r3
        L1e:
            java.lang.String r1 = "enableP2ffPreAddview"
            boolean r1 = tb.soq.a(r1)
            if (r1 == 0) goto L73
            com.taobao.tao.navigation.TBFragmentTabHost r1 = com.taobao.tao.navigation.e.c()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L73
            com.taobao.tao.navigation.NavigationTabIndicatorView r1 = r1.getTabViewAtIndex(r4)     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L73
            android.view.ViewParent r2 = r6.getParent()     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L73
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r4, r4)     // Catch: java.lang.Throwable -> L5a
            r6.setVisibility(r3)     // Catch: java.lang.Throwable -> L5a
            r5 = 0
            r6.setAlpha(r5)     // Catch: java.lang.Throwable -> L5a
            r1.addView(r6, r2)     // Catch: java.lang.Throwable -> L5a
            int r1 = com.taobao.taobao.R.id.fluid_sdk_tag_p2ff_preaddview     // Catch: java.lang.Throwable -> L5a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L5a
            r6.setTag(r1, r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = "[preloadvideo]预创建播放器 add viewtree"
            tb.spz.c(r0, r1)     // Catch: java.lang.Throwable -> L57
            r3 = 1
            goto L73
        L57:
            r1 = move-exception
            r3 = 1
            goto L5b
        L5a:
            r1 = move-exception
        L5b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "p2ffPreAddview error"
            r2.append(r4)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            tb.spz.c(r0, r1)
        L73:
            if (r3 == 0) goto L7d
            com.taobao.android.fluid.framework.preload.dwinstance.c$1 r0 = new com.taobao.android.fluid.framework.preload.dwinstance.c$1
            r0.<init>()
            r6.addOnAttachStateChangeListener(r0)
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.preload.dwinstance.c.a(android.view.View):boolean");
    }

    public static boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{view})).booleanValue();
        }
        if (view == null || !oec.a(view.getTag(R.id.fluid_sdk_tag_p2ff_preaddview), false)) {
            return false;
        }
        view.setTag(R.id.fluid_sdk_tag_p2ff_preaddview, false);
        view.setAlpha(1.0f);
        if (view.getParent() instanceof NavigationTabIndicatorView) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        spz.c("PickPreloadController_PreloadVideoUtils", "[preloadvideo]预创建播放器 reset videoview....");
        return true;
    }
}
