package com.taobao.taolive.room.mediaplatform;

import android.content.Context;
import android.taobao.windvane.jsbridge.q;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.taolive.room.mediaplatform.container.h5.TBLiveBaseWVPlugin;
import com.taobao.taolive.room.mediaplatform.container.h5.TBLiveGoodsWVPlugin;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.tbliveinteractive.jsbridge.TBLiveWVPlugin;
import tb.kge;
import tb.phq;
import tb.pmd;

/* loaded from: classes8.dex */
public class MediaPlatformFrame extends BaseFrame implements com.taobao.taolive.sdk.adapter.network.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACCESS_POINT_MESSAGE = "message";
    private static final String ACCESS_POINT_MESSINFO = "messinfo";
    private static final String ACCESS_POINT_URL = "url";
    private static final String TAG;

    public static /* synthetic */ Object ipc$super(MediaPlatformFrame mediaPlatformFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != 797441118) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onPause();
            return null;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            appLinkRegisterPluginInner();
        }
    }

    static {
        kge.a(584945070);
        kge.a(-797454141);
        if (pmd.a().a("JSBridge")) {
            q.a("TBLiveWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) TBLiveWVPlugin.class, true);
            q.a("TBLiveBaseWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) TBLiveBaseWVPlugin.class, true);
            q.a("TBLiveGoodsWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) TBLiveGoodsWVPlugin.class, true);
            try {
                if (com.taobao.android.live.plugin.proxy.c.a().d()) {
                    appLinkRegisterPluginInner();
                } else {
                    com.taobao.android.live.plugin.proxy.c.a().a(new c.b() { // from class: com.taobao.taolive.room.mediaplatform.MediaPlatformFrame.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.live.plugin.proxy.c.b
                        public void a() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                MediaPlatformFrame.access$000();
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.taobao.taolive.sdk.utils.q.b("MediaPlatformFrame", "[<clinit>] error: " + th.getMessage());
            }
        }
        TAG = MediaPlatformFrame.class.getSimpleName();
    }

    private static void appLinkRegisterPluginInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1660d08c", new Object[0]);
        } else if (com.taobao.android.live.plugin.proxy.f.t() == null) {
        } else {
            try {
                com.taobao.android.live.plugin.proxy.f.t().appLinkRegisterPlugin();
            } catch (Throwable th) {
                String str = TAG;
                com.taobao.taolive.sdk.utils.q.b(str, "[appLinkRegisterPluginInner] error: " + th.getMessage());
            }
        }
    }

    @Deprecated
    public MediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
    }

    public MediaPlatformFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else {
            init();
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.mFrameContext == null || this.mFrameContext.d() == null) {
        } else {
            this.mFrameContext.d().a(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else {
            pmd.a().m().b(TAG, "getMessInfo success------");
        }
    }

    private com.taobao.tbliveinteractive.e getTBLiveInteractiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tbliveinteractive.e) ipChange.ipc$dispatch("a8e86078", new Object[]{this});
        }
        if (!(this.mFrameContext instanceof phq)) {
            return null;
        }
        return ((phq) this.mFrameContext).p();
    }
}
