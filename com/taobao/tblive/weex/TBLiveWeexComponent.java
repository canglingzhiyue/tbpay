package com.taobao.tblive.weex;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.miniLive.ui.TBLiveVideoView;
import com.taobao.android.miniLive.ui.b;
import com.taobao.android.miniLive.ui.c;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.HashMap;
import tb.hua;

/* loaded from: classes8.dex */
public class TBLiveWeexComponent extends WXComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLiveWeexComponent";
    private TBLiveVideoView liveView;
    private boolean mIsPlayingBeforeActivityPause;
    private boolean mReceivePM;
    private c tbLiveWeexVideoController;

    public static /* synthetic */ Object ipc$super(TBLiveWeexComponent tBLiveWeexComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == 474982114) {
            super.onActivityResume();
            return null;
        } else if (hashCode != 1692842255) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityPause();
            return null;
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : TAG;
    }

    public TBLiveWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mReceivePM = false;
    }

    public TBLiveWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
        this.mReceivePM = false;
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView */
    public View mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1d4db689", new Object[]{this, context});
        }
        String str = (String) getAttrs().get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        String str2 = (String) getAttrs().get("bizCode");
        String str3 = (String) getAttrs().get("autoplay");
        String str4 = (String) getAttrs().get("receivePM");
        if (!StringUtils.isEmpty(str4)) {
            this.mReceivePM = Boolean.valueOf(str4).booleanValue();
        }
        initLiveView(str, str2, Boolean.valueOf(str3).booleanValue());
        return this.liveView;
    }

    private boolean getAttrsValue(String str, WXAttr wXAttr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3482ef8f", new Object[]{this, str, wXAttr})).booleanValue();
        }
        if (wXAttr != null && wXAttr.containsKey(str)) {
            return Boolean.valueOf(String.valueOf(wXAttr.get(str))).booleanValue();
        }
        return false;
    }

    private void initLiveView(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e258", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        this.tbLiveWeexVideoController = new c(getContext(), str, str2, new b.a().b(getAttrsValue("showFavor", getAttrs())).a(getAttrsValue(MusLiveVideo.ATTR_SHOW_MUTE_BTN, getAttrs())).c(getAttrsValue("showPauseBtn", getAttrs())).a());
        this.liveView = (TBLiveVideoView) this.tbLiveWeexVideoController.a();
        if (!this.mReceivePM) {
            return;
        }
        this.tbLiveWeexVideoController.a(new hua.a() { // from class: com.taobao.tblive.weex.TBLiveWeexComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hua.a
            public void a(int i, Object obj) {
                String jSONString;
                StringBuilder sb;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
                    return;
                }
                HashMap hashMap = new HashMap();
                if (i == 1009) {
                    i = 10101;
                } else if (i == 102) {
                    i = 10103;
                }
                hashMap.put("type", Integer.valueOf(i));
                if (obj instanceof ShareGoodsListMessage) {
                    jSONString = JSONObject.toJSONString((ShareGoodsListMessage) obj);
                    hashMap.put("data", jSONString);
                    TBLiveWeexComponent.access$000();
                    sb = new StringBuilder();
                } else if (!(obj instanceof JoinNotifyMessage)) {
                    if (obj instanceof TLiveMsg) {
                        jSONString = JSONObject.toJSONString(obj);
                        hashMap.put("data", jSONString);
                        TBLiveWeexComponent.access$000();
                        sb = new StringBuilder();
                    }
                    WXSDKManager.getInstance().fireEvent(TBLiveWeexComponent.this.getInstanceId(), TBLiveWeexComponent.this.getRef(), "powermsg", hashMap);
                } else {
                    jSONString = JSONObject.toJSONString((JoinNotifyMessage) obj);
                    hashMap.put("data", jSONString);
                    TBLiveWeexComponent.access$000();
                    sb = new StringBuilder();
                }
                sb.append("onMessageReceived-------");
                sb.append(i);
                sb.append(" data = ");
                sb.append(jSONString);
                sb.toString();
                WXSDKManager.getInstance().fireEvent(TBLiveWeexComponent.this.getInstanceId(), TBLiveWeexComponent.this.getRef(), "powermsg", hashMap);
            }
        });
    }

    @JSMethod
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        c cVar = this.tbLiveWeexVideoController;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    @JSMethod
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        c cVar = this.tbLiveWeexVideoController;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @JSMethod
    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.tbLiveWeexVideoController;
        if (cVar == null) {
            return;
        }
        cVar.a(z);
    }

    @JSMethod
    public String getLiveDetailData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e81a547c", new Object[]{this});
        }
        c cVar = this.tbLiveWeexVideoController;
        if (cVar == null) {
            return null;
        }
        return cVar.f();
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        c cVar = this.tbLiveWeexVideoController;
        if (cVar == null) {
            return;
        }
        this.mIsPlayingBeforeActivityPause = cVar.c();
        this.tbLiveWeexVideoController.e();
    }

    @Override // com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        if (this.mIsPlayingBeforeActivityPause) {
            c cVar = this.tbLiveWeexVideoController;
            if (cVar == null) {
                return;
            }
            cVar.b();
            return;
        }
        c cVar2 = this.tbLiveWeexVideoController;
        if (cVar2 == null) {
            return;
        }
        cVar2.d();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        c cVar = this.tbLiveWeexVideoController;
        if (cVar == null) {
            return;
        }
        cVar.g();
    }
}
