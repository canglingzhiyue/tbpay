package com.taobao.taolive.room.openarchitecture.openh5;

import android.content.Context;
import android.taobao.windvane.embed.BaseEmbedView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.H5PlatfomListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.a;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import java.util.HashMap;
import java.util.Map;
import tb.ecg;
import tb.kge;
import tb.pkf;
import tb.pkg;
import tb.pki;

/* loaded from: classes8.dex */
public class TaoliveOpenH5PlatformView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG;
    public static final String ViewType = "TLOVideoPlayer";
    private pkg openContext;
    private TaoliveOpenLiveRoom taoliveOpenLiveRoom;

    public static /* synthetic */ Object ipc$super(TaoliveOpenH5PlatformView taoliveOpenH5PlatformView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("35692924", new Object[]{this}) : ViewType;
    }

    static {
        kge.a(-1422451145);
        TAG = TaoliveOpenH5PlatformView.class.getSimpleName();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        String str = "generateView:  EmbedViewConfig:" + this.params;
        if (this.params != null && this.params.mObjectParam != null && (this.params.mObjectParam.get("bizCode") instanceof String)) {
            String str2 = (String) this.params.mObjectParam.get("bizCode");
            if (!StringUtils.isEmpty(str2)) {
                Object initOpenView = initOpenView(context, str2);
                if (initOpenView instanceof TBLOpenPlatformView) {
                    return (TBLOpenPlatformView) initOpenView;
                }
            }
        }
        return new View(context);
    }

    private Object initOpenView(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("33772326", new Object[]{this, context, str});
        }
        String str2 = "initOpenView bizCode:" + str;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (this.openContext == null) {
            this.openContext = pki.a().a(context, str, (pkf) null, (a) null, (Map<String, Object>) null);
        }
        if (this.taoliveOpenLiveRoom == null) {
            pki.a().a(this.openContext);
            this.taoliveOpenLiveRoom = pki.a().b(this.openContext);
        }
        if (this.taoliveOpenLiveRoom == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        hashMap.put(ecg.UMB_FEATURE_WEB_VIEW, this.webView);
        return this.taoliveOpenLiveRoom.invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5PlatformView, this.openContext, this.taoliveOpenLiveRoom, hashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if (r8.equals("setConfiguration") != false) goto L15;
     */
    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.openh5.TaoliveOpenH5PlatformView.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        super.onAttachedToWebView();
        HashMap hashMap = new HashMap();
        hashMap.put("embedViewConfig", this.params);
        hashMap.put("params", this.params);
        hashMap.put("id", this.id);
        callH5Platform(H5PlatfomListenerEnum.onAttachedToWebView, hashMap);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
            return;
        }
        super.onDetachedFromWebView();
        callH5Platform(H5PlatfomListenerEnum.onDetachedFromWebView, new HashMap());
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        callH5Platform(H5PlatfomListenerEnum.onPause, new HashMap());
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        callH5Platform(H5PlatfomListenerEnum.onResume, new HashMap());
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("onVisibilityChanged", Integer.valueOf(i));
        callH5Platform(H5PlatfomListenerEnum.onVisibilityChanged, hashMap);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        callH5Platform(H5PlatfomListenerEnum.onDestroy, new HashMap());
    }

    private Object callH5Platform(H5PlatfomListenerEnum h5PlatfomListenerEnum, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ff1f0a9", new Object[]{this, h5PlatfomListenerEnum, objArr});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.taoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        return taoliveOpenLiveRoom.invokeCommand(TaoliveGatewayEnum.TaoliveGateway_Create_OpenH5Compontent, this.openContext, this.taoliveOpenLiveRoom.eventCompontent, h5PlatfomListenerEnum, objArr);
    }
}
