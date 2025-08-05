package com.taobao.android.livehome.plugin.atype.flexalocal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy;
import com.taobao.android.live.plugin.proxy.livehome.e;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.o;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.sdk.DXPreviewInterfaceImpl;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.ui.a;
import com.taobao.taolive.sdk.utils.y;
import tb.kge;
import tb.mfi;
import tb.sdt;

/* loaded from: classes6.dex */
public class TaoLiveHomePageX implements ITaoLiveHomePageProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APP_VERSION = "20240713";
    private static final String LIVE_HOME_INTERCEPT_URL = "h5.m.taobao.com/taolive/main.html";

    static {
        kge.a(-1825629111);
        kge.a(693224932);
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutTemplate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0d24c29", new Object[]{this}) : "livehomecore_flexalocal/bottoming_template_list.json";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getBailoutVideoListData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a978b4ac", new Object[]{this}) : "live_flexalocal/discovery_video_list.json";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6db0c1b6", new Object[]{this}) : "live_channel_flexalocal";
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public com.taobao.android.live.plugin.proxy.livehome.d createTaoLiveHomePage(Context context, boolean z, Object obj, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.live.plugin.proxy.livehome.d) ipChange.ipc$dispatch("f3b8ebd0", new Object[]{this, context, new Boolean(z), obj, intent}) : new d(context, z, obj, intent);
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public String getDXAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb6a1c18", new Object[]{this}) : getAppVersion(null);
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public void previewEngineDidInitialized(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a034fe0", new Object[]{this, bdVar});
        } else {
            DXPreviewInterfaceImpl.previewEngineDidInitialized(bdVar);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.ITaoLiveHomePageProxy
    public boolean processInner(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4fe2679", new Object[]{this, intent, dVar})).booleanValue() : processInner1(intent, dVar);
    }

    private boolean processInner1(Intent intent, final com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c78d60fc", new Object[]{this, intent, dVar})).booleanValue();
        }
        g.c("tbLiveChannelTabs_navProc", null);
        TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor process start");
        if (intent.getData() != null) {
            String uri = intent.getData().toString();
            if (TextUtils.isEmpty(uri)) {
                return true;
            }
            boolean z = dVar.a() instanceof AppCompatActivity;
            if (uri.contains(LIVE_HOME_INTERCEPT_URL)) {
                sdt.m(dVar.a());
            }
            if (!uri.contains("smallWindowClick=true")) {
                o.f14176a = null;
                if (e.k != null) {
                    e.k.f();
                    e.k = null;
                }
                if (uri.contains(LIVE_HOME_INTERCEPT_URL) && (z || !i.T())) {
                    g.c("tbLiveChannelTabs_navProcH", null);
                    if (Build.VERSION.SDK_INT >= 23 && z) {
                        a.a(dVar.a(), ((Activity) dVar.a()).getWindow().getDecorView().getRootWindowInsets());
                    }
                    com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.TAOLIVE_HOMEPAGE, false, dVar.a());
                    TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor process");
                    e.k = f.z().createTaoLiveHomePage(dVar.a(), false, null, intent);
                    Thread thread = new Thread(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveHomePageX.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            g.c("tbLiveChannelTabs_navProcHAsy", null);
                            TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor process Thread");
                            TaoLiveLaunchInitializer.init();
                            if (e.k != null) {
                                e.k.a(false, false);
                                TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor enableOptimize4Asyn end");
                            }
                            o.f14176a = mfi.a("kTBLiveFeedListKey_2024_new");
                            TLog.loge("TaoLiveHomepage", "TaoLiveHomepageProcessor LiveCache.readData");
                            if (!i.K()) {
                                return;
                            }
                            new com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.a().a(dVar.a());
                        }
                    }, "processInner1");
                    thread.setPriority(10);
                    thread.start();
                }
            }
            if (uri.contains(LIVE_HOME_INTERCEPT_URL) && dVar.a() != null && (y.b(dVar.a()) || y.c(dVar.a()))) {
                handleFullscreen(intent, dVar);
            }
        }
        return true;
    }

    private void handleFullscreen(Intent intent, com.taobao.android.nav.d dVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91d3051", new Object[]{this, intent, dVar});
        } else if (intent == null || intent.getData() == null || dVar == null) {
        } else {
            Uri data = intent.getData();
            String queryParameter = data.getQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY);
            if (TextUtils.isEmpty(queryParameter)) {
                parse = data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build();
            } else {
                String uri = data.toString();
                parse = Uri.parse(uri.replace("largescreenstyle=" + queryParameter, "largescreenstyle=fullscreen"));
            }
            intent.setData(parse);
        }
    }

    public static String getAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba9fc222", new Object[]{str});
        }
        if (c.j() && !TextUtils.isEmpty(str)) {
            return str;
        }
        String b = com.taobao.android.livehome.plugin.atype.flexalocal.utils.a.b();
        if (!"normal".equals(b) && !TextUtils.isEmpty(b)) {
            String[] split = b.split(",");
            if (split.length >= 2) {
                if (sdt.e().equals(split[1])) {
                    return split[0];
                }
                if ("*".equals(split[1])) {
                    return split[0];
                }
            }
        }
        return APP_VERSION;
    }
}
