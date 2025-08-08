package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.TaoLiveShopSingleRoomController;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveLifeCycleEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.v;
import com.ut.share.business.ShareContent;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pjf;
import tb.pjg;
import tb.pji;
import tb.pjx;
import tb.pkf;
import tb.pkg;
import tb.pki;
import tb.pmd;
import tb.ssr;
import tb.sty;

/* loaded from: classes8.dex */
public class ShopTwoFloorSingleRoomController extends ssr implements com.alibaba.triver.triver_shop.container.shopLoft.b, pjf, pjg, pji {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private static boolean c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f21550a;
    private boolean d;
    private Context e;
    private b.c f;
    private JSONObject g;
    private TaoliveOpenLiveRoom h;
    private pkg i;
    private View j;

    /* loaded from: classes8.dex */
    public static class ShopLoftLifeCycle implements LifecycleObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private FragmentActivity f21552a;

        static {
            kge.a(-354008243);
            kge.a(2139684418);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onActivityFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8226c848", new Object[]{this});
                return;
            }
            com.taobao.android.live.plugin.proxy.f.m().activityDestroy();
            ab.c(ShopTwoFloorSingleRoomController.i(), "onActivityFinish, remove LifeCycle.");
            FragmentActivity fragmentActivity = this.f21552a;
            if (fragmentActivity == null) {
                return;
            }
            fragmentActivity.getLifecycle().removeObserver(this);
        }
    }

    public static /* synthetic */ Object ipc$super(ShopTwoFloorSingleRoomController shopTwoFloorSingleRoomController, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.pjg
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    @Override // tb.pjg
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.pjl
    public void aQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac53b56", new Object[]{this});
        }
    }

    @Override // tb.pjh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.pjg
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        }
    }

    @Override // tb.pjg
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.pjj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.pjh
    public void cQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491b1d8", new Object[]{this});
        }
    }

    @Override // tb.pjj
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void endAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1560f0", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "Page_TaobaoLiveWatch";
    }

    @Override // tb.pjl
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    @Override // tb.pji
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        }
    }

    @Override // tb.pji
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onPageStable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36639f0", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
        }
    }

    public static /* synthetic */ JSONObject a(ShopTwoFloorSingleRoomController shopTwoFloorSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("366fa709", new Object[]{shopTwoFloorSingleRoomController}) : shopTwoFloorSingleRoomController.g;
    }

    public static /* synthetic */ Context b(ShopTwoFloorSingleRoomController shopTwoFloorSingleRoomController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5be28ba2", new Object[]{shopTwoFloorSingleRoomController}) : shopTwoFloorSingleRoomController.e;
    }

    public static /* synthetic */ String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : b;
    }

    static {
        kge.a(1466993966);
        kge.a(-563039837);
        kge.a(-598112112);
        kge.a(-1025874655);
        kge.a(514298380);
        b = ShopTwoFloorSingleRoomController.class.getSimpleName();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void initWithData(Context context, JSONObject jSONObject, b.c cVar, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac25571", new Object[]{this, context, jSONObject, cVar, aVar});
            return;
        }
        String str = b;
        ab.c(str, "initWithData " + this);
        this.e = context;
        this.f = cVar;
        a(jSONObject);
        this.g = jSONObject;
        if (!c) {
            j();
            c = true;
        }
        a(this.e);
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.d = v.e(jSONObject.getString("initMuteStatus"));
            jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) jSONObject.getString("id"));
            if (StringUtils.isEmpty(jSONObject.getString("livesource"))) {
                jSONObject.put("livesource", "shop2F");
            }
            String string = jSONObject.getString("sellerId");
            if (!StringUtils.isEmpty(string)) {
                jSONObject.put("accountId", (Object) string);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("liveTransParams");
            if (jSONObject3 != null) {
                jSONObject.put(aw.PARAM_IGNORE_PV, (Object) jSONObject3.getString(aw.PARAM_IGNORE_PV));
            }
            String string2 = jSONObject.getString("itemId");
            if (!StringUtils.isEmpty(string2)) {
                jSONObject.put(aw.PARAM_SJSD_ITEM_ID, (Object) string2);
            }
            String str = "a2141.23201685";
            jSONObject.put("spmCnt", (Object) str);
            String string3 = (jSONObject.getJSONObject("spmParams") == null || jSONObject.getJSONObject("spmParams").getJSONObject("args") == null) ? null : jSONObject.getJSONObject("spmParams").getJSONObject("args").getString("entryBizScene");
            jSONObject.put("livePointTab3", (Object) string3);
            if ("livePointTab3".equals(string3)) {
                if (jSONObject.getString("liveShopUrl") != null) {
                    jSONObject.put("shop2fSkipTab3Url", (Object) jSONObject.getString("liveShopUrl"));
                }
                str = "a2141.b60453322";
            }
            jSONObject.put("spm", (Object) str);
            String string4 = jSONObject.getString("playerViewToken");
            if (!StringUtils.isEmpty(string4) && !com.taobao.taolive.sdk.ui.media.g.a().d(string4)) {
                string4 = null;
            }
            jSONObject.put("playerViewToken", (Object) string4);
            JSONObject jSONObject4 = jSONObject.getJSONObject("spmParams");
            if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("args")) == null) {
                return;
            }
            Integer integer = jSONObject2.getInteger("cardnum");
            String string5 = jSONObject.getString(aw.PARAM_PRODUCT_TYPE);
            if (integer == null || integer.intValue() != 0 || !RecModel.MEDIA_TYPE_TIMEMOVE.equals(string5)) {
                return;
            }
            jSONObject.put("entryByShop2F", (Object) String.valueOf(true));
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        HashMap hashMap = new HashMap();
        pjx pjxVar = new pjx();
        pjxVar.a((ssr) this);
        pjxVar.a((pjg) this);
        pjxVar.a((pji) this);
        pjxVar.a((pjf) this);
        this.i = pki.a().a(context, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString(), (pkf) null, pjxVar, hashMap);
        pki.a().a(this.i);
        this.h = pki.a().b(this.i);
        this.j = pki.a().a(this.i, this.h);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "onMockActivityOnCreate:" + this);
        k();
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "onActivityResume: " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onResume, null);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        ab.c(b, "onActivityPause");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onPause, null);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        ab.c(b, "onActivityStop");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onStop, null);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "willAppear " + this);
        if (this.e == null) {
            return;
        }
        if (as.f()) {
            Context context = this.e;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.e).getWindow().addFlags(128);
            }
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onCreate, this.g);
            this.h.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
        }
        com.taobao.taolive.movehighlight.utils.f.a().a(System.currentTimeMillis());
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "didAppear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
        }
        sty styVar = new sty() { // from class: com.taobao.taolive.room.controller2.ShopTwoFloorSingleRoomController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sty
            public void a(View view, String str2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b9b1c8", new Object[]{this, view, str2, str3, str4});
                } else {
                    com.taobao.taolive.room.utils.s.a(ShopTwoFloorSingleRoomController.b(ShopTwoFloorSingleRoomController.this), com.taobao.taolive.room.utils.c.a(ShopTwoFloorSingleRoomController.a(ShopTwoFloorSingleRoomController.this).getString("id")), null, 67108864, false);
                }
            }
        };
        HashMap hashMap = new HashMap();
        hashMap.put(DataReceiveMonitor.CB_LISTENER, styVar);
        this.h.callPlatform(PlatformListenerEnum.setSmallWindowClickListener, hashMap);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "willDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onWillDisappear, null);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void didDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3025c6b", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "didDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidDisappear, null);
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.h;
        if (taoliveOpenLiveRoom2 != null) {
            taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
        }
        if (!as.f()) {
            return;
        }
        Context context = this.e;
        if (!(context instanceof Activity) || ((Activity) context).getWindow() == null) {
            return;
        }
        ((Activity) this.e).getWindow().clearFlags(128);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        String str = b;
        ab.c(str, "onDestroyed " + this);
        com.taobao.taolive.room.dx.b.c().b();
        c = false;
        this.e = null;
        this.f = null;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        if (this.h == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isMute", String.valueOf(z));
        this.h.callPlatform(PlatformListenerEnum.mute, hashMap);
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public Map<String, String> getUTProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom == null) {
            return null;
        }
        Object callPlatform = taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.callFetchUTArgsWithParams, new Object[0]);
        if (!(callPlatform instanceof Map)) {
            return null;
        }
        return (Map) callPlatform;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.j;
    }

    @Override // com.alibaba.triver.triver_shop.container.shopLoft.b
    public ShareContent getShareContent() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("897c4b17", new Object[]{this});
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.h;
        if (taoliveOpenLiveRoom != null) {
            Object callPlatform = taoliveOpenLiveRoom.callPlatform(PlatformListenerEnum.getVideoInfo, null);
            if (callPlatform instanceof VideoInfo) {
                videoInfo = (VideoInfo) callPlatform;
                if (videoInfo != null || videoInfo.broadCaster == null || videoInfo.shareUrlDO == null || !(this.e instanceof Activity)) {
                    return null;
                }
                String str = videoInfo.broadCaster.accountName;
                return (ShareContent) pmd.a().p().b((Activity) this.e, StringUtils.isEmpty(aa.ae()) ? this.e.getString(R.string.taolive_share_live, str, videoInfo.title) : String.format(aa.ae(), str, videoInfo.title), StringUtils.isEmpty(videoInfo.shareUrlDO.bgImgUrl) ? videoInfo.coverImg : videoInfo.shareUrlDO.bgImgUrl, videoInfo.liveId, videoInfo.topic, false, videoInfo.shareUrlDO.shareUrl, videoInfo.shareUrlDO.shareCardUrl, "zhibo", null);
            }
        }
        videoInfo = null;
        if (videoInfo != null) {
        }
        return null;
    }

    @Override // tb.pji
    public void cO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128009a", new Object[]{this});
            return;
        }
        b.c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.a(b.c.EVENT_ON_SCROLL_ENABLE, null);
    }

    @Override // tb.pji
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        b.c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.a(b.c.EVENT_ON_SCROLL_DISABLE, null);
    }

    @Override // tb.ssr
    public void b(String str) {
        b.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!"close".equals(str) || (cVar = this.f) == null) {
        } else {
            cVar.a(b.c.EVENT_ON_SHOW_BAR, null);
        }
    }

    @Override // tb.ssr
    public void c(String str) {
        b.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!"close".equals(str) || (cVar = this.f) == null) {
        } else {
            cVar.a(b.c.EVENT_ON_HIDE_BAR, null);
        }
    }

    @Override // tb.ssr
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.d = v.e(map.get("isMuted"));
            if (this.f == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMuted", (Object) Boolean.valueOf(this.d));
            this.f.a(b.c.EVENT_ON_MUTE_STATUS_CHANGED, jSONObject);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (c) {
        } else {
            this.f21550a = v.b.a("goodlist", "shopLoftCycle", true);
            if ((this.e instanceof FragmentActivity) && this.f21550a) {
                ab.c(b, "init, initUltronServerConfig.");
                ((FragmentActivity) this.e).getLifecycle().addObserver(new TaoLiveShopSingleRoomController.ShopLoftLifeCycle((FragmentActivity) this.e));
            }
            c = true;
        }
    }
}
