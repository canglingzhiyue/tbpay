package com.taobao.android.tab2liveroom.liveroom;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.taolive.room.controller2.f;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.ier;
import tb.iet;
import tb.kge;
import tb.kqq;
import tb.mqo;
import tb.mqq;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.pjf;
import tb.pjg;
import tb.pji;
import tb.ssr;

/* loaded from: classes6.dex */
public class LiveRoomEventHandler implements com.taobao.taolive.room.controller2.e, f, g.a, ier, pjf, pjg, pji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f15280a;
    private iet b = new iet();
    private Boolean c;
    private mqo d;
    private mqq e;
    private VideoInfo f;
    private ISmallWindowStrategy g;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ScrollType {
    }

    static {
        kge.a(-2079355257);
        kge.a(-598112112);
        kge.a(-2044291106);
        kge.a(-1025874655);
        kge.a(514298380);
        kge.a(354006265);
        kge.a(745372282);
        kge.a(-609918999);
    }

    @Override // tb.pjg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public static /* synthetic */ a a(LiveRoomEventHandler liveRoomEventHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b77f5fe2", new Object[]{liveRoomEventHandler}) : liveRoomEventHandler.f15280a;
    }

    public LiveRoomEventHandler(a aVar) {
        this.f15280a = aVar;
        this.b.a((ier) this);
        this.b.a((pjg) this);
        this.b.a((pji) this);
        this.b.a((pjf) this);
        p();
        q();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom b = this.f15280a.b();
        if (b == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.g == null) {
            this.g = new ISmallWindowStrategy() { // from class: com.taobao.android.tab2liveroom.liveroom.LiveRoomEventHandler.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
                public void a(View view, String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str, str2, str3});
                        return;
                    }
                    ogg.c(a.TAG, "onSmallWindowClick, url:" + str + ", id:" + str2 + ", liveType:" + str3);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str);
                    hashMap2.put("id", str2);
                    hashMap2.put(com.alibaba.triver.triver_shop.newShop.view.embed.c.LIVE_TYPE, str3);
                    LiveRoomEventHandler.a(LiveRoomEventHandler.this).b("onMiniWindow", hashMap2);
                }
            };
        }
        hashMap.put(DataReceiveMonitor.CB_LISTENER, this.g);
        b.callWatchPlatform(WatchPlatformListenerEnum.setSmallWindowClickListener, hashMap);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom b = this.f15280a.b();
        if (b == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("onScrollListener", this);
        this.f15280a.b().callWatchPlatform(WatchPlatformListenerEnum.setOnScrollListener, hashMap);
        if (oeb.a("enableInterceptLiveFinish", true)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(DataReceiveMonitor.CB_LISTENER, this);
            this.f15280a.b().callWatchPlatform(WatchPlatformListenerEnum.setRoomFinishListener, hashMap2);
        }
        Object callWatchPlatform = b.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (callWatchPlatform instanceof com.taobao.taolive.sdk.controller.e) {
            com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) callWatchPlatform;
            this.c = Boolean.valueOf(eVar.r());
            a aVar = this.f15280a;
            if (aVar != null) {
                aVar.c(this.c.booleanValue());
            }
            eVar.a(this);
        }
        l();
    }

    public iet j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iet) ipChange.ipc$dispatch("5444b99d", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.taolive.sdk.core.g.a
    public void onGlobalLiveRoomMuteChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ead943b", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.f15280a;
        if (aVar != null) {
            aVar.c(z);
        }
        this.c = Boolean.valueOf(z);
    }

    @Override // tb.ier
    public void a(Object obj) {
        HashMap hashMap;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        ogg.c(a.TAG, "onLiveDetailChanged, onReceiveDetailResponse");
        VideoInfo videoInfo = null;
        if (obj instanceof VideoInfo) {
            videoInfo = (VideoInfo) obj;
            this.f = videoInfo;
            hashMap = new HashMap();
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, videoInfo.liveId);
            hashMap.put("roomNum", videoInfo.roomNum);
            hashMap.put("roomStatus", videoInfo.roomStatus);
            hashMap.put("roomType", Integer.valueOf(videoInfo.roomType));
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountId", videoInfo.broadCaster.accountId);
                hashMap.put("accountName", videoInfo.broadCaster.accountName);
                hashMap.put("headImg", videoInfo.broadCaster.headImg);
                hashMap.put("jumpUrl", videoInfo.broadCaster.jumpUrl);
                hashMap.put("shopId", videoInfo.broadCaster.shopId);
                hashMap.put("subscribe", Boolean.valueOf(videoInfo.broadCaster.subscribe));
                hashMap.put("follow", Boolean.valueOf(videoInfo.broadCaster.follow));
                hashMap.put("topFollow", Boolean.valueOf(videoInfo.broadCaster.topFollow));
                hashMap.put("type", videoInfo.broadCaster.type);
                hashMap.put("shopName", videoInfo.broadCaster.shopName);
            }
            if (videoInfo.officialLiveInfo != null) {
                hashMap.put("officialLiveId", videoInfo.officialLiveInfo.officialLiveId);
                hashMap.put("officialAccountId", videoInfo.officialLiveInfo.accountId);
                hashMap.put("officialAccountName", videoInfo.officialLiveInfo.accountName);
                hashMap.put("officialHeadImg", videoInfo.officialLiveInfo.officialHeadImg);
                hashMap.put("officialFollow", videoInfo.officialLiveInfo.follow);
                if (TextUtils.equals(videoInfo.officialLiveInfo.officialLive, "official")) {
                    str2 = "mainroom";
                } else {
                    str2 = TextUtils.equals(videoInfo.officialLiveInfo.officialLive, "rebroadcast") ? "subroom" : "none";
                }
                hashMap.put("officialLiveType", str2);
            }
            str = videoInfo.liveId;
            if (videoInfo.officialLiveInfo != null && !TextUtils.isEmpty(videoInfo.officialLiveInfo.officialLiveId)) {
                str = videoInfo.officialLiveInfo.officialLiveId;
            }
        } else {
            ogg.c(a.TAG, "unsupport type response:" + JSON.toJSONString(obj));
            hashMap = null;
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f15280a.a(videoInfo, str, this.c);
        }
        this.f15280a.b("onLiveDetailChanged", hashMap);
        this.f15280a.d();
    }

    @Override // tb.pjg
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        ogg.c(a.TAG, "onFollowChanged, onFollowAction accountId:" + str + " accountType:" + str2 + " followSource:" + str3);
        HashMap hashMap = new HashMap();
        hashMap.put("followed", true);
        hashMap.put("accountId", str);
        hashMap.put("accountType", str2);
        hashMap.put("followSource", str3);
        this.f15280a.b("onFollowChanged", hashMap);
    }

    @Override // tb.pjg
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            return;
        }
        ogg.c(a.TAG, "onFollowChanged, onUnfollowAciton accountId:" + str + " accountType:" + str2 + " followSource:" + str3);
        HashMap hashMap = new HashMap();
        hashMap.put("followed", false);
        hashMap.put("accountId", str);
        hashMap.put("accountType", str2);
        hashMap.put("followSource", str3);
        this.f15280a.b("onFollowChanged", hashMap);
    }

    @Override // tb.pjg
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ogg.c(a.TAG, "onScreenCleanChanged, clean: " + z);
        HashMap hashMap = new HashMap();
        hashMap.put("clean", Boolean.valueOf(z));
        this.f15280a.b("onScreenCleanChanged", hashMap);
    }

    @Override // tb.pjh
    public void cQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491b1d8", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onStreamStateChanged, streamPlay");
        }
    }

    @Override // tb.pjh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onStreamStateChanged, streamPause");
        }
    }

    @Override // tb.pji
    public void cO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128009a", new Object[]{this});
            return;
        }
        if (this.f15280a.a() != null && this.f15280a.a().a() != null && oeb.a("enableFixClearLiveScreen", true)) {
            this.f15280a.a().a().b();
        }
        ogg.c(a.TAG, "onVerticalScrollEnable");
    }

    @Override // tb.pji
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onVerticalScrollDisable");
        }
    }

    @Override // tb.pji
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onHorizontalScrollEnable");
        a aVar = this.f15280a;
        aVar.f15282a = true;
        aVar.a(true, false, false);
    }

    @Override // tb.pji
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onHorizontalScrollDisable");
        a aVar = this.f15280a;
        aVar.f15282a = false;
        aVar.a(false, false, false);
    }

    @Override // tb.pjj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onPlayerStatusChange, playerFirstFrameRender");
        HashMap hashMap = new HashMap();
        hashMap.put("state", ImageLoader.Scene.FIRST_FRAME);
        if (this.f15280a.a() != null && this.f15280a.a().a() != null) {
            this.f15280a.a().a().b();
        }
        this.f15280a.B();
        this.f15280a.b("onPlayerStatusChange", hashMap);
    }

    @Override // tb.pjj
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onPlayerStatusChange, playerError");
        HashMap hashMap = new HashMap();
        hashMap.put("state", "error");
        this.f15280a.b("onPlayerStatusChange", hashMap);
        VideoInfo videoInfo = this.f;
        d.a(this.f15280a, videoInfo != null ? videoInfo.liveId : null);
    }

    @Override // tb.pjk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onStreamStateChanged, onLive");
        }
    }

    @Override // tb.pjk
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onStreamStateChanged, onReplay");
        }
    }

    @Override // tb.pjk
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onStreamStateChanged, onPrelive");
        }
    }

    @Override // tb.pjl
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onRoomStateChanged, liveRoomUserLeave");
        HashMap hashMap = new HashMap();
        hashMap.put("state", "userleave");
        this.f15280a.b("onRoomStateChanged", hashMap);
    }

    @Override // tb.pjl
    public void aQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac53b56", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onRoomStateChanged, liveRoomEnd");
        HashMap hashMap = new HashMap();
        hashMap.put("state", "end");
        this.f15280a.b("onRoomStateChanged", hashMap);
    }

    @Override // com.taobao.taolive.room.controller2.f
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        ogg.c(a.TAG, "onLiveRoomChanged onScrollUp");
        this.f15280a.b(false);
        a(map, "scrollUp");
    }

    @Override // com.taobao.taolive.room.controller2.f
    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        ogg.c(a.TAG, "onLiveRoomChanged onScrollDown");
        this.f15280a.b(false);
        a(map, "scrollDown");
    }

    @Override // com.taobao.taolive.room.controller2.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ogg.c(a.TAG, "onFinish");
        }
    }

    private void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
            return;
        }
        this.f15280a.a(true);
        HashMap hashMap = new HashMap();
        hashMap.put("scrollType", str);
        hashMap.put("index", Integer.valueOf(m()));
        if (map != null) {
            hashMap.putAll(map);
        }
        this.f15280a.b("onScrollChanged", map);
    }

    private int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        TaoliveOpenLiveRoom b = this.f15280a.b();
        return oec.a(b != null ? b.callWatchPlatform(WatchPlatformListenerEnum.getCurRoomIndex, new Object[0]) : 0, 0);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = new mqo(this.f15280a);
        }
        this.b.a((ssr) this.d);
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = new mqq(this.f15280a);
        }
    }

    public kqq k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kqq) ipChange.ipc$dispatch("5bf77469", new Object[]{this}) : this.e;
    }
}
