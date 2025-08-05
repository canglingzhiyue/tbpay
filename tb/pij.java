package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taolive.room.ui.fanslevel.H5DynamicSDKFrame;
import com.taobao.taolive.room.ui.interactpanel.InteractPanelFrameSDK;
import com.taobao.taolive.room.ui.right_component.RightComponentFrameSDK;
import com.taobao.taolive.room.ui.system_component.SystemComponentFrameSDK;
import com.taobao.taolive.room.utils.ab;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends BaseFrame>> f32683a;

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    static {
        kge.a(-80406627);
        f32683a = new HashMap();
        a("dynamic_h5_sdk", H5DynamicSDKFrame.class);
        a("tl-intimacy", SystemComponentFrameSDK.class);
        try {
            if (c.a().d()) {
                b();
            } else {
                c.a().a(new c.b() { // from class: tb.pij.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.live.plugin.proxy.c.b
                    public void a() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            pij.a();
                        }
                    }
                });
            }
        } catch (Throwable th) {
            ab.a("LegacyFrameRegistry", th.getMessage());
        }
        a("tl-interactive-entrance", RightComponentFrameSDK.class);
        a("tl-interact-panel", InteractPanelFrameSDK.class);
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            if (f.n().getFrameClassMap(IAlphaVideoProxy.KEY_FRAME_CLASS_FAVOR_EFFECT_FRAME) != null) {
                a("tl-favor-effect", f.n().getFrameClassMap(IAlphaVideoProxy.KEY_FRAME_CLASS_FAVOR_EFFECT_FRAME));
            }
        } catch (Throwable th) {
            ab.a("LegacyFrameRegistry", th.getMessage());
        }
        try {
            if (f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_CONNECTION_FRAME_2) != null) {
                a("tl-connect-mic", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_CONNECTION_FRAME_2));
            }
        } catch (Throwable th2) {
            ab.a("LegacyFrameRegistry", th2.getMessage());
        }
        try {
            if (f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_NOTICE_FRAME_2) != null) {
                a("tl-notice", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_NOTICE_FRAME_2));
            }
        } catch (Throwable th3) {
            ab.a("LegacyFrameRegistry", th3.getMessage());
        }
        try {
            if (f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_BOTTOM_CONTAINER_FRAME) != null) {
                a("tl-bubble-bottom-container", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_BOTTOM_CONTAINER_FRAME));
            }
        } catch (Throwable th4) {
            ab.a("LegacyFrameRegistry", th4.getMessage());
        }
        try {
            if (f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_SUBSCRIBE_CARD_FRAME_2) == null) {
                return;
            }
            a("tl-subscribe-card", f.p().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_SUBSCRIBE_CARD_FRAME_2));
        } catch (Throwable th5) {
            ab.a("LegacyFrameRegistry", th5.getMessage());
        }
    }

    public static void a(String str, Class<? extends BaseFrame> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            f32683a.put(str, cls);
        }
    }

    public static Class<? extends BaseFrame> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("582938df", new Object[]{str}) : f32683a.get(str);
    }
}
