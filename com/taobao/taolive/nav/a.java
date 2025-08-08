package com.taobao.taolive.nav;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.nav.d;
import com.taobao.android.nav.e;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.login4android.api.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.u;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.sdk.ui.media.f;
import com.taobao.taolive.sdk.ui.media.g;
import com.taobao.taolive.sdk.ui.media.h;
import com.taobao.taolive.sdk.ui.media.r;
import com.taobao.taolive.sdk.utils.ac;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.w;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.taolive.ui.view.NewDetailMaskFrameLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.pmd;
import tb.poy;
import tb.tnn;
import tb.tno;

/* loaded from: classes8.dex */
public class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2016604853);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "LiveRoomProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        ac.a("KLifecycle_route");
        ac.a();
        Trace.beginSection("TLiveFFTrace - live processor");
        if (intent != null && b()) {
            final double currentTimeMillis = System.currentTimeMillis();
            final Uri data = intent.getData();
            if (data != null) {
                final int hashCode = (data.getQueryParameter("id") + currentTimeMillis).hashCode();
                intent.putExtra("newLiveSession", String.valueOf(hashCode));
                Coordinator.execute(new Runnable() { // from class: com.taobao.taolive.nav.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (data == null) {
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("action", "process");
                            hashMap.put("currentTimeOpt", String.valueOf(currentTimeMillis));
                            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, String.valueOf(data.getQueryParameter("id")));
                            hashMap.put("livesource", data.getQueryParameter("livesource"));
                            hashMap.put("deviceLevel", String.valueOf(k.a()));
                            hashMap.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
                            hashMap.put("liveSession", String.valueOf(hashCode));
                            ai.a((com.taobao.alilive.aliliveframework.frame.a) null, "NewArchitecturePlayStart", (Map<String, String>) hashMap);
                        }
                    }
                });
            }
        }
        if (!aa.dp() && !NetworkStatusHelper.isConnected()) {
            if (pmd.a().u() != null && pmd.a().u().c() != null) {
                w.a(pmd.a().u().c(), "网络异常，暂时无法进入直播间");
            }
            q.b("LiveRoomProcessor", "process isConnected false return");
            return false;
        }
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            if (StringUtils.isEmpty(uri) || !uri.contains("h5.m.taobao.com/taolive/video.html")) {
                return true;
            }
            Trace.beginSection("TLiveFFTrace - preplay");
            c(intent, dVar);
            Trace.endSection();
            Trace.beginSection("TLiveFFTrace - common");
            a(intent, dVar);
            Trace.endSection();
            Trace.beginSection("TLiveFFTrace - handle live");
            if (c()) {
                c(intent);
            }
            Trace.endSection();
        }
        Trace.beginSection("TLiveFFTrace - handle detailsource");
        if (d()) {
            a(dVar, intent);
        }
        Trace.endSection();
        Trace.endSection();
        return true;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableTbliveUtBugfix", "true"));
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("tblive", "enablePreRequestTimeMove", "true"));
    }

    private void a(d dVar, Intent intent) {
        tno d;
        MediaData mediaData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b396ee6f", new Object[]{this, dVar, intent});
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String queryParameter = data.getQueryParameter("livesource");
        if (RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(data.getQueryParameter(aw.PARAM_PRODUCT_TYPE)) && "detailReplay".equalsIgnoreCase(queryParameter)) {
            String queryParameter2 = data.getQueryParameter("id");
            String queryParameter3 = data.getQueryParameter(aw.PARAM_TIMEMOVING_ITEM_ID);
            String queryParameter4 = data.getQueryParameter(aw.PARAM_SJSD_ITEM_ID);
            if (queryParameter2 == null || (queryParameter3 == null && queryParameter4 == null)) {
                ab.d("LiveRoomProcessor", "看点id 和所见所得id 都为空");
                return;
            }
            ab.d("LiveRoomProcessor", "看点预请求");
            com.taobao.taolive.room.pre.a.a().a(u.a(data), queryParameter2, queryParameter3, queryParameter4);
        } else if (!"detailLive".equals(queryParameter)) {
        } else {
            String queryParameter5 = data.getQueryParameter("id");
            if (StringUtils.isEmpty(queryParameter5) || (d = tnn.a().d(queryParameter5)) == null || (mediaData = d.b) == null || intent.getExtras() == null || !(dVar.a() instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) dVar.a();
            if (activity.getWindow() == null) {
                return;
            }
            activity.getWindow().getDecorView();
            a(dVar, mediaData, data, (ViewGroup) activity.getWindow().getDecorView());
        }
    }

    private void c(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937df4b1", new Object[]{this, intent, dVar});
        } else if (!a() || dVar == null || !(dVar.a() instanceof Activity) || intent == null || intent.getData() == null) {
        } else {
            Uri data = intent.getData();
            if (!StringUtils.isEmpty(data.getQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN))) {
                return;
            }
            Window window = ((Activity) dVar.a()).getWindow();
            if (window == null) {
                ab.c("LiveRoomProcessor", "[Metrics-VideoPrePlay: window is null");
                return;
            }
            View decorView = window.getDecorView();
            if (!(decorView instanceof ViewGroup) || !intent.getExtras().containsKey("mediaInfo")) {
                ab.c("LiveRoomProcessor", "[Metrics-VideoPrePlay: intent not contains mediaInfo");
                return;
            }
            MediaData a2 = com.taobao.taolive.sdk.model.common.a.a(JSON.parseObject(intent.getExtras().getString("mediaInfo")));
            if (a2 == null) {
                return;
            }
            Trace.beginSection("TLiveFFTrace -- call player pre");
            f a3 = a(dVar, a2, data, (ViewGroup) decorView);
            Trace.endSection();
            if (a3 == null || StringUtils.isEmpty(a3.L())) {
                return;
            }
            Uri.Builder buildUpon = data.buildUpon();
            buildUpon.appendQueryParameter(aw.PARAM_PLAY_VIEW_TOKEN, a3.L());
            buildUpon.appendQueryParameter(aw.PARAM_PLAY_MODE, "prePlay");
            intent.setData(buildUpon.build());
        }
    }

    private f a(d dVar, MediaData mediaData, Uri uri, final ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("25bd3750", new Object[]{this, dVar, mediaData, uri, viewGroup});
        }
        Trace.beginSection("TLiveFFTrace -- check token");
        h hVar = new h();
        hVar.b = r.a(mediaData, null);
        hVar.f21934a = g.e(hVar.b);
        if (g.a().a(hVar.f21934a, hVar.b)) {
            Trace.endSection();
            return null;
        }
        ab.c("LiveRoomProcessor", "[VideoPrePlay_startTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- create player");
        f fVar = new f(hVar);
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- enable consume false");
        fVar.s(false);
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- navi context");
        fVar.a(dVar.a());
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- data source");
        fVar.a(mediaData, (String) null);
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- use rtc live");
        fVar.f(true);
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- muted true");
        fVar.a(true);
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- business liveroom ");
        fVar.d("LiveRoom");
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- check view");
        final ViewGroup G = fVar.G();
        if (G == null) {
            ab.c("LiveRoomProcessor", "[Metrics-VideoPrePlay: mediaView is null");
            Trace.endSection();
            return null;
        }
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- start");
        fVar.g();
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- delay destory");
        fVar.N();
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- add to decor view");
        ab.c("LiveRoomProcessor", "[VideoPrePlay_endTime]:" + System.currentTimeMillis() + " current:" + hashCode());
        uri.getQueryParameter("id");
        viewGroup.addView(G, 0, new ViewGroup.LayoutParams(1, 1));
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace -- set info and error callback ");
        fVar.a(new IMediaPlayer.g() { // from class: com.taobao.taolive.nav.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.g
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                ViewGroup viewGroup2;
                ViewGroup viewGroup3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && (viewGroup2 = viewGroup) != null && (viewGroup3 = G) != null && viewGroup2.indexOfChild(viewGroup3) != -1) {
                    viewGroup.removeView(G);
                }
                return false;
            }
        });
        fVar.a(new IMediaPlayer.e() { // from class: com.taobao.taolive.nav.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                ViewGroup viewGroup2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                ViewGroup viewGroup3 = viewGroup;
                if (viewGroup3 != null && (viewGroup2 = G) != null && viewGroup3.indexOfChild(viewGroup2) != -1) {
                    viewGroup.removeView(G);
                }
                return false;
            }
        });
        Trace.endSection();
        return fVar;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return "homepage".equals(str) || "follow".equals(str) || str.contains("homepage.") || str.contains("follow.");
    }

    private void a(Intent intent, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d54a2f", new Object[]{this, intent, dVar});
            return;
        }
        Trace.beginSection("TLiveFFTrace - pad check");
        if (dVar != null && a(dVar.a())) {
            b(intent, dVar);
        }
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace - backwardx");
        if (com.taobao.android.live.plugin.proxy.c.a().d() && com.taobao.android.live.plugin.proxy.f.p().getBackwardX() != null) {
            com.taobao.android.live.plugin.proxy.f.p().getBackwardX().a(intent, dVar);
        }
        Trace.endSection();
        Trace.beginSection("TLiveFFTrace - device check");
        Uri data = intent.getData();
        if (data != null && !a(data.getQueryParameter("livesource"))) {
            NewDetailMaskFrameLayout.startCheckCurrentDeviceStatus(3);
        }
        Trace.endSection();
    }

    private void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
            return;
        }
        b(intent);
        a(intent);
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : y.a() && (y.b(context) || y.c(context));
    }

    private void b(Intent intent, d dVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a299f70", new Object[]{this, intent, dVar});
        } else if (intent == null || intent.getData() == null || dVar == null || !a(dVar.a())) {
        } else {
            Uri data = intent.getData();
            String queryParameter = data.getQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY);
            if (StringUtils.isEmpty(queryParameter)) {
                parse = data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
            } else {
                String uri = data.toString();
                parse = Uri.parse(uri.replace("largescreenstyle=" + queryParameter, "largescreenstyle=fullscreen"));
            }
            intent.setData(parse);
        }
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (!com.taobao.taolive.sdk.utils.u.aG()) {
        } else {
            Uri data = intent.getData();
            if (data.getQueryParameterNames().contains("isSmallWindowBack") && StringUtils.equals("1", data.getQueryParameter("isSmallWindowBack"))) {
                ab.d("LiveRoomProcessor", "hit smallWindow and return");
            } else if (data.getQueryParameterNames().contains(aw.PARAM_PLAY_VIEW_TOKEN)) {
                ab.d("LiveRoomProcessor", "hit playViewToken");
            } else if (data.getQueryParameterNames().contains(aw.PARAM_CUSTOM_PLAY_CTRL)) {
                ab.d("LiveRoomProcessor", "hit customPlayCtrlParams");
            } else if (!StringUtils.equals("detailLive", data.getQueryParameter("livesource"))) {
                ab.d("LiveRoomProcessor", "livesource is not detailLive");
            } else {
                String queryParameter = data.getQueryParameter("id");
                if (StringUtils.isEmpty(queryParameter)) {
                    ab.d("LiveRoomProcessor", "liveId is null");
                } else if (!StringUtils.isEmpty(poy.ao(n.a())) && StringUtils.equals(queryParameter, poy.ao(n.a()))) {
                    ab.d("LiveRoomProcessor", "liveId hit the same room");
                } else {
                    com.taobao.taolive.room.pre.a.a().a(intent, u.a(intent));
                    ab.d("LiveRoomProcessor", "start preRequest");
                }
            }
        }
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("livesource");
        HashMap hashMap = new HashMap();
        hashMap.put("livesource", queryParameter);
        hashMap.put("entryLiveSource", queryParameter);
        Set<String> queryParameterNames = data.getQueryParameterNames();
        if (queryParameterNames.contains("spm")) {
            hashMap.put("spm-url", data.getQueryParameter("spm"));
        }
        if (queryParameterNames.contains("id")) {
            hashMap.put("id", data.getQueryParameter("id"));
        }
        if (queryParameterNames.contains("bizFrom")) {
            hashMap.put("bizCode", data.getQueryParameter("bizFrom"));
        }
        if (pmd.a() != null && pmd.a().v() != null) {
            hashMap.put("brandLevel", String.valueOf(pmd.a().v().d()));
        }
        com.taobao.taolive.sdk.monitor.b.b().a("LIVE_CODE_BOOT_STAGE", hashMap);
        ab.d("LiveRoomProcessor", "initMonitorParams success");
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return false;
        }
        return l.d(pmd.a().d().a("tblive", "enableLiveroomProcessLiveOpt", "false"));
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (pmd.a().d() == null) {
            return true;
        }
        return l.d(pmd.a().d().b("tblive", "enablePrePlayNew", "true"));
    }
}
