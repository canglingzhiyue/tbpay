package com.taobao.android.weex_uikit.widget.video;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.UIKitEngine;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.List;
import tb.kge;
import tb.sku;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STATUS_FINISH = "finish";
    public static final String STATUS_PLAY = "play";
    public static final String STATUS_START = "start";
    public static final String STATUS_STOP = "stop";
    public static final String VIDEO_CALLBACK = "videocallback";
    public static final String VIDEO_STATUS = "videostatus";
    public static final String VISIBILITY_STATUS = "visibility";

    /* renamed from: a  reason: collision with root package name */
    public static String f16240a;
    public static String b;
    public static String c;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16244a = true;

        static {
            kge.a(1659674028);
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16245a;
        public boolean b;

        static {
            kge.a(819665489);
        }
    }

    public static /* synthetic */ void k(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987a0156", new Object[]{uINode});
        } else {
            l(uINode);
        }
    }

    static {
        kge.a(1365367887);
        f16240a = "detail";
        b = "videoDuration";
        c = "currentTime";
    }

    public static void a(UINode uINode, String str, JSONObject jSONObject) {
        MUSDKInstance uINode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57f2546", new Object[]{uINode, str, jSONObject});
        } else if (!uINode.hasEvent(str) || (uINode2 = uINode.getInstance()) == null || uINode2.isDestroyed() || TextUtils.isEmpty(str)) {
        } else {
            uINode2.fireEventOnNode(uINode.getNodeId(), str, jSONObject);
        }
    }

    public static void a(UINode uINode, m<d> mVar, m<p.b> mVar2, m<b> mVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6f0c19", new Object[]{uINode, mVar, mVar2, mVar3});
            return;
        }
        a aVar = new a();
        mVar3.a(new b());
        mVar.a(new com.taobao.android.weex_uikit.widget.video.b(uINode, aVar));
        mVar2.a(new com.taobao.android.weex_uikit.widget.video.a(uINode, aVar));
    }

    public static void a(UINode uINode, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc20e1d", new Object[]{uINode, str, aVar});
        } else if (!a(uINode)) {
        } else {
            if (TextUtils.equals(str, "play")) {
                int b2 = b(uINode);
                if (b2 > 0) {
                    a(uINode, b2);
                } else {
                    f(uINode);
                }
            } else if (!TextUtils.equals(str, "stop")) {
            } else {
                i(uINode);
                if (aVar.f16244a) {
                    return;
                }
                a(uINode, "pause", (JSONObject) null);
                aVar.f16244a = true;
            }
        }
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else if (!TextUtils.equals(str, "appear") || !c(uINode) || a(uINode)) {
        } else {
            f(uINode);
        }
    }

    public static MUSVideoView a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSVideoView) ipChange.ipc$dispatch("f6cf3ff5", new Object[]{context}) : new MUSVideoView(context);
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("src", str);
        }
    }

    public static void a(UINode uINode, MUSVideoView mUSVideoView, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589cf021", new Object[]{uINode, mUSVideoView, str, bVar});
            return;
        }
        bVar.f16245a = true;
        bVar.b = false;
    }

    public static void a(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0015db4", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("loop", Boolean.valueOf(z));
        }
    }

    public static void b(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b83f5", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_MUTE, Boolean.valueOf(z));
        }
    }

    public static void a(UINode uINode, MUSVideoView mUSVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ab7f6f", new Object[]{uINode, mUSVideoView, new Boolean(z)});
        } else {
            mUSVideoView.mute(z);
        }
    }

    public static void c(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5aa36", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("controls", Boolean.valueOf(z));
        }
    }

    public static void d(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406fd077", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("autoplay", Boolean.valueOf(z));
        }
    }

    public static void c(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f55a2a8", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("videoId", str);
        }
    }

    public static void b(UINode uINode, MUSVideoView mUSVideoView, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4c0b22", new Object[]{uINode, mUSVideoView, str, bVar});
            return;
        }
        bVar.f16245a = true;
        bVar.b = false;
    }

    public static void e(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e9f6b8", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_CONTROL_BY_LIST, Boolean.valueOf(z));
        }
    }

    public static void d(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb6a687", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("delayTime", str);
        }
    }

    public static boolean a(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59ce7924", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute(MusLiveVideo.ATTR_CONTROL_BY_LIST)).booleanValue();
    }

    public static int b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("134606b2", new Object[]{uINode})).intValue();
        }
        String str = (String) uINode.getAttribute("delayTime");
        if (!TextUtils.isEmpty(str)) {
            return com.taobao.android.weex_uikit.util.b.a(str, 0);
        }
        return 0;
    }

    public static boolean c(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ccbd9462", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute("autoplay")).booleanValue();
    }

    public static boolean d(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86352201", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute(MusLiveVideo.ATTR_MUTE)).booleanValue();
    }

    public static boolean e(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3facafa0", new Object[]{uINode})).booleanValue() : ((Boolean) uINode.getAttribute("loop")).booleanValue();
    }

    public static void e(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17aa66", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_PLAY_SCENES, str);
        }
    }

    public static void f(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa78ae45", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("bizFrom", str);
        }
    }

    public static void g(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d9b224", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("contentId", str);
        }
    }

    public static void a(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae4b65d0", new Object[]{uINode, jSONObject});
        } else {
            uINode.setAttribute("utParams", jSONObject);
        }
    }

    public static void h(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73ab603", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_POSTER, str);
        }
    }

    public static void i(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759bb9e2", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("objectFit", str);
        }
    }

    public static void f(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b641cf9", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_SHOW_FULLSCREEN_BTN, Boolean.valueOf(z));
        }
    }

    public static void g(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0de433a", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_SHOW_PLAY_BTN, Boolean.valueOf(z));
        }
    }

    public static void h(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1658697b", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_SHOW_CENTER_PLAY_BTN, Boolean.valueOf(z));
        }
    }

    public static void i(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd28fbc", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute(MusLiveVideo.ATTR_SHOW_MUTE_BTN, Boolean.valueOf(z));
        }
    }

    public static void j(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14cb5fd", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("enablePan", Boolean.valueOf(z));
        }
    }

    public static void j(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fcbdc1", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("panoType", str);
        }
    }

    public static void k(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725dc1a0", new Object[]{uINode, str});
        } else {
            uINode.setAttribute(sku.KEY_VIDEO_SOURCE, str);
        }
    }

    public static void k(UINode uINode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c6dc3e", new Object[]{uINode, new Boolean(z)});
        } else {
            uINode.setAttribute("showPlayRateBtn", Boolean.valueOf(z));
        }
    }

    public static void f(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9243d3b", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.play();
    }

    public static void g(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29bcada", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.toggleFullScreen();
    }

    public static void a(final UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0011de3", new Object[]{uINode, new Integer(i)});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.postDelayed(new Runnable() { // from class: com.taobao.android.weex_uikit.widget.video.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.k(UINode.this);
                }
            }
        }, i);
    }

    public static void h(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c135879", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.pause();
    }

    public static void b(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557b4424", new Object[]{uINode, new Integer(i)});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.seekTo(i);
    }

    public static void i(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258ae618", new Object[]{uINode});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.stop();
    }

    public static void b(UINode uINode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5744811", new Object[]{uINode, jSONObject});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null) {
            return;
        }
        mUSVideoView.setFov(jSONObject);
    }

    public static void a(UINode uINode, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d9c937", new Object[]{uINode, bVar});
            return;
        }
        MUSVideoView mUSVideoView = (MUSVideoView) uINode.getMountContent();
        if (mUSVideoView == null || bVar == null) {
            return;
        }
        bVar.a(mUSVideoView.getFov());
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, MUSVideoView mUSVideoView, p.b bVar, b bVar2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7302b444", new Object[]{uINode, mUSDKInstance, mUSVideoView, bVar, bVar2, dVar});
            return;
        }
        uINode.registerNativeStateListener("videostatus", bVar);
        uINode.registerNativeStateListener("visibility", bVar);
        mUSVideoView.mount(uINode, mUSDKInstance, UIKitEngine.getVideoCreator(), dVar, uINode.getContentWidth(), uINode.getContentHeight(), uINode.getPadding(), e(uINode), d(uINode));
        a(uINode, mUSVideoView, bVar2);
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, MUSVideoView mUSVideoView, d dVar, p.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cd558e", new Object[]{uINode, mUSDKInstance, mUSVideoView, dVar, bVar});
            return;
        }
        uINode.unregisterNativeStateListener("videostatus", bVar);
        uINode.unregisterNativeStateListener("visibility", bVar);
        mUSVideoView.unmount(mUSDKInstance);
        dVar.b();
    }

    public static void a(final UINode uINode, List<Runnable> list, final b bVar, final p.b bVar2, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab261e", new Object[]{uINode, list, bVar, bVar2, dVar});
        } else {
            list.add(new o() { // from class: com.taobao.android.weex_uikit.widget.video.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (UINode.this.isMounted() && bVar.f16245a) {
                        UINode uINode2 = UINode.this;
                        f.a(uINode2, uINode2.getInstance(), (MUSVideoView) UINode.this.getMountContent(), dVar, bVar2);
                        UINode uINode3 = UINode.this;
                        f.a(uINode3, uINode3.getInstance(), (MUSVideoView) UINode.this.getMountContent(), bVar2, bVar, dVar);
                    }
                    bVar.f16245a = false;
                }
            });
        }
    }

    private static void a(final UINode uINode, MUSVideoView mUSVideoView, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc87d997", new Object[]{uINode, mUSVideoView, bVar});
            return;
        }
        boolean a2 = a(uINode);
        String nativeState = uINode.getNativeState("videostatus");
        if (j(uINode)) {
            return;
        }
        if (a2) {
            if (TextUtils.equals(nativeState, "play")) {
                int b2 = b(uINode);
                if (b2 > 0) {
                    mUSVideoView.postDelayed(new o() { // from class: com.taobao.android.weex_uikit.widget.video.f.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.weex_framework.util.o
                        public void a() throws Exception {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                f.k(UINode.this);
                            }
                        }
                    }, b2);
                    return;
                } else {
                    mUSVideoView.play();
                    return;
                }
            }
            i(uINode);
        } else if (!c(uINode) || bVar.b) {
        } else {
            bVar.b = true;
            mUSVideoView.play();
        }
    }

    private static void l(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f18ef5", new Object[]{uINode});
            return;
        }
        boolean a2 = a(uINode);
        String nativeState = uINode.getNativeState("videostatus");
        if (j(uINode) || !a2 || !TextUtils.equals(nativeState, "play")) {
            return;
        }
        f(uINode);
    }

    public static boolean j(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df0273bb", new Object[]{uINode})).booleanValue() : "disappear".equals(uINode.getNativeState("visibility"));
    }
}
