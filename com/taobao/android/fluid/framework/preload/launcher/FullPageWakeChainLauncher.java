package com.taobao.android.fluid.framework.preload.launcher;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.DefaultFluidInitialize;
import com.taobao.android.fluid.framework.data.remote.d;
import com.taobao.android.fluid.framework.preload.dwinstance.c;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oec;
import tb.ogv;
import tb.pio;
import tb.skw;
import tb.soq;
import tb.sov;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes5.dex */
public class FullPageWakeChainLauncher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String QUERY_VALUE_SKIP_MTOP = "skipMTOPV2";
    private static final String QUERY_VALUE_spm = "spm";
    private static final String ROLL_BACK = "huitui.huitui.0.0";
    private static final String SENCE_SOURCE = "sceneSource";
    private static final String TAG = "FullPageWake_PickPreloadController";
    private static boolean inited;

    static {
        kge.a(-1834882817);
        inited = false;
    }

    public static void initTBVideoSDK(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0010ee4", new Object[]{context});
        } else if (context == null) {
        } else {
            DefaultFluidInitialize.init(context);
        }
    }

    public static void init(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{context, hashMap});
            return;
        }
        TLog.loge(TAG, "PickPreloadController,init task start " + JSON.toJSONString(hashMap));
        if (inited) {
            return;
        }
        inited = true;
        try {
            if (ogv.a(hashMap)) {
                return;
            }
            String str = (String) hashMap.get("startIntent");
            if (StringUtils.isEmpty(str)) {
                return;
            }
            pio.a(pio.TRACE_VIDEOTAB_VIDEO_LAUNCHER_INIT);
            c.a(System.currentTimeMillis());
            Uri parse = Uri.parse(str);
            if (parse == null || "1".equals(parse.getQueryParameter(QUERY_VALUE_SKIP_MTOP))) {
                return;
            }
            TLog.loge(TAG, "MTOP优化开关打开");
            if (isEnableLoadLibrary()) {
                AsyncTask.execute(new Runnable() { // from class: com.taobao.android.fluid.framework.preload.launcher.FullPageWakeChainLauncher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TLog.loge(FullPageWakeChainLauncher.TAG, "loadLibrariesOnce");
                        pio.a(pio.GG_VIDEOTAB_VIDEO_LOADSO);
                        TaobaoMediaPlayer.loadLibrariesOnce(null);
                        pio.b(pio.GG_VIDEOTAB_VIDEO_LOADSO);
                    }
                });
            }
            pio.a(pio.GG_VIDEOTAB_VIDEO_PRELOAD);
            c.a(parse);
            if (!(!StringUtils.isEmpty(c.a(context, true)))) {
                Pair<String, String> b = sov.b(parse);
                if (b != null && (!StringUtils.isEmpty((CharSequence) b.first) || !StringUtils.isEmpty((CharSequence) b.second))) {
                    TLog.logi(TAG, "PickPreloadController, requestVideoInfo, videoId:" + ((String) b.first) + " itemId:" + ((String) b.second));
                    pio.a(pio.GG_VIDEOTAB_VIDEO_PREFETCH_MTOP);
                    d.a((String) b.first, (String) b.second, true, null);
                    return;
                }
                tryPrefetchDetail(context, parse, hashMap);
                return;
            }
            tryPrefetchDetail(context, parse, hashMap);
        } catch (Throwable th) {
            TLog.loge(TAG, "PickPreloadController,init task start,error: " + th.getMessage());
        }
    }

    private static void tryPrefetchDetail(Context context, Uri uri, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e5539c", new Object[]{context, uri, map});
        } else if (!soq.e()) {
        } else {
            TLog.loge(TAG, "fetchContentDetail tryPrefetchDetail  targetUri=" + uri + " ； params=" + map);
            JSONObject a2 = sov.a(uri);
            int a3 = oec.a(map.get("prefetchTimeOut"), 10000);
            HashMap hashMap = null;
            if (uri != null) {
                hashMap = new HashMap(1);
                hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_TAB3COMPONENTSOURCE, uri.getQueryParameter("source"));
            }
            d.a(a2, skw.FAKE_CONTENT_ID, true, true, a3, hashMap, false, null);
        }
    }

    private static boolean isEnableLoadLibrary() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("392547f3", new Object[0])).booleanValue() : i.a(ab.a(), "load_video_so", false);
    }
}
