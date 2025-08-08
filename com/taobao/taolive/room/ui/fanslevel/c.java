package com.taobao.taolive.room.ui.fanslevel;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponse;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.mediaplatform.h;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolivecontainer.TBLiveWebView;
import com.taobao.tbliveinteractive.jsbridge.g;
import com.taobao.tbliveinteractive.view.DWPenetrateFrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cgl;
import tb.ddw;
import tb.kge;
import tb.pdt;
import tb.pkg;
import tb.pmd;
import tb.pmt;
import tb.pmv;
import tb.pmy;
import tb.pmz;
import tb.pna;
import tb.pnb;
import tb.pnj;
import tb.poy;
import tb.poz;
import tb.pqj;
import tb.pqq;
import tb.qmr;
import tb.tfu;
import tb.xkw;

/* loaded from: classes8.dex */
public class c implements com.taobao.tbliveinteractive.jsbridge.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21714a;
    private static HashMap<String, String> d;
    private Context b;
    private com.taobao.alilive.aliliveframework.frame.a c;
    public String e;
    public String f = "errorCode";
    public String g = "errorMsg";

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("251fa072", new Object[]{cVar}) : cVar.b;
    }

    static {
        kge.a(-261036513);
        kge.a(-2141014113);
        f21714a = c.class.getSimpleName();
        HashMap<String, String> hashMap = new HashMap<>();
        d = hashMap;
        hashMap.put("topBar", "TopBarFrame3");
        d.put(tfu.COMMENT, "tl-chat");
        d.put("favorAni", "tl-favor-anim");
        d.put(tfu.FAVOR, "tl-bottom-favor");
        d.put("bottomBar", "tl-bottom-bar-native");
        d.put("follow", "FollowFrame");
        d.put("enterInfo", "enterInfo");
        d.put("goods", "goods");
        d.put("more", "more");
        d.put("gift", "gift");
        d.put("roomNum", "roomNum");
        d.put("commentInput", "commentInput");
        d.put("fullScreenOverlay", "fullScreenOverlay");
        d.put("backToLiveWidget", "backToLiveWidget");
        d.put("close", "close");
        d.put("useLevelPoints", "useLevelPoints");
    }

    public c(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.c = aVar;
        this.b = context;
        com.taobao.alilive.aliliveframework.frame.a aVar2 = this.c;
        if (aVar2 != null) {
            this.e = aVar2.G();
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.c = null;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : poy.t(n.b()) != null ? poy.t(n.b()) : "";
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public void a(final g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c764755", new Object[]{this, gVar});
            return;
        }
        d dVar = new d() { // from class: com.taobao.taolive.room.ui.fanslevel.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                if (netBaseOutDo instanceof LiveDetailMessinfoResponse) {
                    LiveDetailMessinfoResponseData mo1437getData = ((LiveDetailMessinfoResponse) netBaseOutDo).mo1437getData();
                    if (mo1437getData.activity != null) {
                        gVar.a(mo1437getData.activity.bizData);
                        return;
                    }
                }
                gVar.a();
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    gVar.a();
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    gVar.a();
                }
            }
        };
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar == null || aVar.d() == null) {
            return;
        }
        this.c.d().a(dVar);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("level");
        if (!StringUtils.isEmpty(str)) {
            a.a().b(str);
        }
        String str2 = map.get("scopeId");
        if (!StringUtils.isEmpty(str2)) {
            a.a().d(str2);
        }
        String str3 = map.get("subScopeId");
        if (!StringUtils.isEmpty(str3)) {
            a.a().e(str3);
        }
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("url");
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        boolean e = v.e(map.get("disableSmallWindow"));
        boolean e2 = v.e(map.get("closeRoom"));
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String path = parse.getPath();
        if ((e || e2) && (("h5.m.taobao.com".equals(host) || "wapp.m.taobao.com".equals(host) || "huodong.m.taobao.com".equals(host)) && ("/act/talent/live.html".equals(path) || "/taolive/video.html".equals(path)))) {
            e2 = false;
            e = false;
        }
        if (e2) {
            com.taobao.taolive.room.mediaplatform.a.c();
        }
        com.taobao.taolive.room.mediaplatform.a.a(this.b, str, e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2985bedf", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        ddw.a().a("com.taobao.taolive.room.mediaplatform_start_video", map, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        ddw.a().a("com.taobao.taolive.room.mediaplatform_pause_video", null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        ddw.a().a("com.taobao.taolive.room.mediaplatform_resume_video", null, aVar != null ? aVar.G() : null);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1127953e", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        ddw.a().a("com.taobao.taolive.room.mediaplatform_mute_video", Boolean.valueOf(v.e(map.get(MusLiveVideo.ATTR_MUTE))), this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c96b9d", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.WIDGET_NAME);
        if (StringUtils.isEmpty(str) || d.get(str) == null) {
            return false;
        }
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, d.get(str), this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06b41fc", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.WIDGET_NAME);
        if (StringUtils.isEmpty(str) || d.get(str) == null) {
            return false;
        }
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, d.get(str), this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c80d185b", new Object[]{this, map})).booleanValue();
        }
        ddw.a().a(xkw.EVENT_INPUT_SHOW, map, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        ddw.a().a(xkw.EVENT_INPUT_HIDE, null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92cfe54e", new Object[]{this, context});
        }
        if (context != null) {
            return h.a(context, this.c);
        }
        return null;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        ddw.a().a("com.taobao.taolive.goods.force_goods_timeout", null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UserAbility.API_IS_LOGIN, cgl.i().c() ? "true" : "false");
            if (!cgl.i().c()) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("userId", cgl.i().a());
            jSONObject2.put("nick", cgl.i().b());
            jSONObject.put("info", jSONObject2);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afaeeeba", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = f21714a;
        q.b(str, "enableUpDownSwitch " + map.get("enable") + " name " + map.get("__namespace"));
        if (v.e(map.get("enable"))) {
            ddw.a().a("com.taobao.taolive.room.enable_updown_switch", "liveApi", this.e);
        } else {
            ddw.a().a("com.taobao.taolive.room.disable_updown_switch", "liveApi", this.e);
        }
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9750c519", new Object[]{this, map})).booleanValue();
        }
        if (this.b != null && map != null) {
            if (StringUtils.isEmpty(map.get("itemID"))) {
                map.get("itemId");
            }
            map.get("accountId");
            map.get("bizType");
            map.get("isCpc");
            LiveItem liveItem = (LiveItem) pqj.a(map.get("detail"), LiveItem.class);
            try {
                if (this.b instanceof Activity) {
                    HashMap hashMap = new HashMap();
                    if (liveItem != null && !StringUtils.isEmpty(liveItem.native_channel)) {
                        hashMap.put("channel", liveItem.native_channel);
                    }
                    hashMap.put("itemlistType", aa.G() ? "dx" : "weex");
                    com.taobao.taolive.room.utils.c.a((Activity) this.b, 10000, liveItem, hashMap);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ef29b78", new Object[]{this, map})).booleanValue();
        }
        Context context = this.b;
        if (context == null || map == null || !(context instanceof Activity)) {
            return false;
        }
        map.get("itemId");
        map.get("itemUrl");
        map.get("itemH5TaokeUrl");
        map.get("isCpc");
        map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        map.get("adgrid");
        map.get("refpid");
        map.get("isBulk");
        LiveItem liveItem = (LiveItem) pqj.a(map.get("detail"), LiveItem.class);
        HashMap hashMap = new HashMap();
        if (liveItem != null && !StringUtils.isEmpty(liveItem.native_channel)) {
            hashMap.put("channel", liveItem.native_channel);
        }
        com.taobao.taolive.room.utils.c.b((Activity) this.b, liveItem, "detail", hashMap);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean k(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669471d7", new Object[]{this, map})).booleanValue();
        }
        if (this.b != null && map != null) {
            String str = map.get(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_APM_SHOP_URL);
            if (!StringUtils.isEmpty(str)) {
                com.taobao.taolive.room.utils.c.a(this.b, str);
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e364836", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        final String str = map.get("accountId");
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        pmtVar.b = map.get("accountType");
        pmtVar.p = map.get("followSource");
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar != null) {
            pmtVar.c = aVar.d;
        }
        pmd.a().B().a(ai.a(this.c, pmtVar), new pmv() { // from class: com.taobao.taolive.room.ui.fanslevel.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    return;
                }
                aj.a(pmd.a().u().c(), ((pmy) pmzVar).f32766a);
                ddw.a().a(xkw.EVENT_ACTION_FOLLOW, str, c.this.e);
            }

            @Override // tb.pmv
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                if (StringUtils.isEmpty(str3)) {
                    str3 = pmd.a().u().c().getString(R.string.taolive_user_account_follow_fail);
                }
                aj.a(pmd.a().u().c(), str3);
            }
        });
        ai.a(this.c, this.b, str);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean m(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d81e95", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        final String str = map.get("accountId");
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        pmtVar.p = map.get("followSource");
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar != null) {
            pmtVar.c = aVar.d;
        }
        pmd.a().B().b(pmtVar, new pmv() { // from class: com.taobao.taolive.room.ui.fanslevel.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    return;
                }
                aj.a(c.a(c.this), ((pnb) pmzVar).f32768a);
                ddw.a().a(xkw.EVENT_ACTION_UNFOLLOW, str, c.this.e);
            }

            @Override // tb.pmv
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                } else {
                    aj.a(c.a(c.this), "取消关注失败，请重试");
                }
            }
        });
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public void a(final g gVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b135f90", new Object[]{this, gVar, map});
        } else if (map == null) {
            gVar.a();
        } else {
            String str = map.get("accountId");
            if (StringUtils.isEmpty(str)) {
                gVar.a();
                return;
            }
            pmt pmtVar = new pmt();
            pmtVar.f32764a = str;
            pmd.a().B().d(pmtVar, new pmv() { // from class: com.taobao.taolive.room.ui.fanslevel.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pmv
                public void a(pmz pmzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                        return;
                    }
                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                    jSONObject.put("result", (Object) Boolean.valueOf(((pna) pmzVar).f32767a));
                    gVar.a(jSONObject.toJSONString());
                }

                @Override // tb.pmv
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    } else {
                        gVar.a();
                    }
                }
            });
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d79f4f4", new Object[]{this, map})).booleanValue();
        }
        ddw.a().a(FullScreenFrame.EVENT_MEDIAPLATFORM_SHOW_SHAREPANEL, map, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        ddw.a().a("com.taolive.taolive.room.mediaplatform_addfavor", null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean o(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51bcb53", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get("eventName");
        String str2 = map.get("subType");
        if (!StringUtils.isEmpty(str)) {
            ddw.a().a(str, map.get("data"), this.e);
        } else if (!StringUtils.isEmpty(str2)) {
            ddw.a().a(str2, map, this.e);
        }
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean p(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecbda1b2", new Object[]{this, map})).booleanValue();
        }
        ddw.a().a("com.taobao.taolive.room.update_position", map, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d45f7811", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        if (map.containsKey(aw.PARAM_SJSD_ITEM_ID)) {
            return true;
        }
        String str = map.get("position");
        if (!StringUtils.isEmpty(str) && StringUtils.isDigitsOnly(str)) {
            ddw.a().a("com.taobao.taolive.room.seekto_replay", Integer.valueOf(Integer.parseInt(str) * 1000), this.e);
            return true;
        } else if (StringUtils.isEmpty(str) || !str.contains(".")) {
            return false;
        } else {
            ddw.a().a("com.taobao.taolive.room.seekto_replay", Integer.valueOf(((int) Float.parseFloat(str)) * 1000), this.e);
            return true;
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public String i() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.taobao.taolive.sdk.playcontrol.c.i(this.c) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
                z = true;
            }
            jSONObject.put("isPlaybackTimeMove", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc014e70", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        if (v.e(map.get("enable"))) {
            ddw.a().a(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, null, this.e);
        } else {
            ddw.a().a(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, null, this.e);
        }
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : poy.al(this.c);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return poy.O(aVar);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isOpenWatermarkHeight", true);
            jSONObject.put("watermarkHeight", (int) ((poy.ar(this.c) / com.taobao.taolive.room.utils.d.c()) * 750.0f));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public Map a(Uri uri) {
        pkg pkgVar;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        boolean z = (aVar == null || ((e) aVar).o() == null || ((e) this.c).o() == null) ? false : true;
        HashMap hashMap = new HashMap();
        String uri2 = uri.toString();
        if (z) {
            com.taobao.alilive.aliliveframework.frame.a aVar2 = this.c;
            if ((aVar2 instanceof com.taobao.taolive.room.controller2.g) && aVar2.g() != null) {
                hashMap.putAll(this.c.g());
                uri2 = this.c.g().get(aw.PARAM_INTENT_URL);
            }
        } else {
            for (String str : uri.getQueryParameterNames()) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
            if (aa.aB()) {
                hashMap.put("spmUrl", poy.K(this.c));
            }
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        List<String> am = aa.am();
        if (am != null) {
            for (int i = 0; i < am.size(); i++) {
                if (am.get(i) != null) {
                    String[] split = am.get(i).split("_");
                    if (split.length == 3) {
                        String a2 = p.a(split[0], split[1], split[2]);
                        if (!StringUtils.isEmpty(a2)) {
                            jSONObject.put(am.get(i), (Object) a2);
                        }
                    }
                }
            }
        }
        String str2 = f21714a;
        q.b(str2, "getLiveRoomInfo interactiveExperimentListRet " + jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("evoSwitch", jSONObject.toString());
        hashMap2.put("queryParams", pqj.a(hashMap));
        if (!aa.cM()) {
            uri2 = uri.toString();
        }
        hashMap2.put("originURL", uri2);
        hashMap2.put("updownSwitchModel", poy.ab(this.c));
        hashMap2.put("entryLiveSourceGlobals", poy.R(this.c));
        hashMap2.put("liveSourceGlobals", poz.p(n.b(this.c)));
        hashMap2.put(aw.PARAM_IS_FIRST_ENTER, String.valueOf(m.p()));
        hashMap2.put("switchIndex", String.valueOf(poy.ai(this.c)));
        com.taobao.alilive.aliliveframework.frame.a aVar3 = this.c;
        if (aVar3 != null && ((e) aVar3).o() != null) {
            hashMap2.put("openLiveRoomBizCode", ((e) this.c).o().bizCode);
        }
        com.taobao.alilive.aliliveframework.frame.a aVar4 = this.c;
        if (aVar4 instanceof e) {
            if (((e) aVar4).o() != null && (pkgVar = ((e) this.c).o().taoliveOpenContext) != null && pkgVar.f != null && (obj = pkgVar.f.get("aliveChanel")) != null) {
                hashMap2.put("aliveChannel", String.valueOf(obj));
            }
            if (poz.c(this.c.z()) != null) {
                Uri parse = Uri.parse(poz.c(this.c.z()));
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                HashMap hashMap3 = new HashMap();
                for (String str3 : queryParameterNames) {
                    hashMap3.put(str3, parse.getQueryParameter(str3));
                }
                hashMap2.put(pdt.entryQuery, JSON.toJSONString(hashMap3));
            }
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("params", pqj.a(hashMap2));
        return hashMap4;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158668", new Object[]{this})).longValue();
        }
        if (com.taobao.taolive.sdk.playcontrol.c.e(this.c) == null) {
            return 0L;
        }
        return com.taobao.taolive.sdk.playcontrol.c.e(this.c).m();
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public void a(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36f00c", new Object[]{this, iWVWebView});
            return;
        }
        qmr b = b(iWVWebView);
        if (b == null) {
            return;
        }
        b.c();
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView, Map<String, String> map, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d94986c", new Object[]{this, eVar, iWVWebView, map, gVar})).booleanValue();
        }
        qmr b = b(iWVWebView);
        if (b == null || map == null) {
            gVar.a();
            return false;
        }
        View j = b.j();
        if (j != null && (j instanceof DWPenetrateFrameLayout)) {
            String str = map.get("componentName");
            DWPenetrateFrameLayout dWPenetrateFrameLayout = (DWPenetrateFrameLayout) j;
            if (!map.containsKey("isShowComponent")) {
                dWPenetrateFrameLayout.setPenetrateAlpha((int) (v.d(map.get("alpha")) * 255.0f));
            } else {
                boolean e = v.e(map.get("isShowComponent"));
                boolean a2 = v.a(map.get("isNeedShowCloseBtn"), true);
                float d2 = v.d(map.get("closeBtnSize"));
                String str2 = map.get("closeBtnImg");
                float d3 = v.d(map.get("offsetRight"));
                float d4 = v.d(map.get("offsetTop"));
                if (!StringUtils.isEmpty(str) && eVar != null && eVar.h() != null) {
                    pnj m = pmd.a().m();
                    String str3 = f21714a;
                    m.a(str3, "setPenetrateAlpha componentName " + str + " isShowComponent " + e + " " + a2 + " " + str2 + " " + d2 + " " + d3 + " " + d4);
                    boolean a3 = eVar.h().a(str, e, a2, str2, d2, d3, d4);
                    com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                    jSONObject.put("isAddShowComponentList", (Object) Boolean.valueOf(a3));
                    gVar.a(jSONObject.toJSONString());
                    return true;
                }
            }
            com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
            jSONObject2.put("isAddShowComponentList", (Object) false);
            gVar.a(jSONObject2.toJSONString());
            return true;
        }
        gVar.a();
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cff62164", new Object[]{this, eVar, iWVWebView, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("url");
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            hashMap.put(str, String.valueOf(jSONObject.get(str)));
        }
        eVar.a(poz.b(this.b, n.b(n.a())), string, hashMap);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3737df9", new Object[]{this, eVar, iWVWebView, map})).booleanValue();
        }
        if ((iWVWebView instanceof TBLiveWebView) && ((TBLiveWebView) iWVWebView).getWebViewToken() != null && eVar != null) {
            return eVar.b(b(this.b), map.get("url"), map);
        }
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec7bcb94", new Object[]{this, eVar, iWVWebView})).booleanValue();
        }
        if ((iWVWebView instanceof TBLiveWebView) && ((TBLiveWebView) iWVWebView).getWebViewToken() != null && eVar != null) {
            return eVar.m();
        }
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean b(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccf52195", new Object[]{this, eVar, iWVWebView})).booleanValue();
        }
        if ((iWVWebView instanceof TBLiveWebView) && ((TBLiveWebView) iWVWebView).getWebViewToken() != null && eVar != null) {
            return eVar.m();
        }
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3a324cf", new Object[]{this, map})).booleanValue();
        }
        if (map == null || !map.containsKey("itemId") || !map.containsKey("itemPic") || !map.containsKey("itemPrice")) {
            return false;
        }
        ddw.a().a(xkw.EVENT_INPUT_SHOW, map, this.e);
        ddw.a().a("com.taobao.taolive.room.hide_goods_list", null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b44fb2e", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_UPDATE_FAVOR_IMAGE, map.get("url"));
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        ddw.a().a("com.taobao.taolive.room.hide_goods_list", null, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean u(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72e6d18d", new Object[]{this, map})).booleanValue();
        }
        ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, map, this.e);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public void b(final g gVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5890011", new Object[]{this, gVar, map});
            return;
        }
        NetRequest netRequest = new NetRequest();
        netRequest.setApiName(String.valueOf(map.get("api")));
        netRequest.setVersion(String.valueOf(map.get("v")));
        Object obj = map.get("data");
        if (obj != null) {
            netRequest.setData(String.valueOf(obj));
        }
        int i = map.get(SessionConstants.ECODE);
        if (i == null) {
            i = 0;
        }
        netRequest.setNeedEcode(!"0".equalsIgnoreCase(String.valueOf(i)));
        netRequest.setPost("POST".equalsIgnoreCase(String.valueOf(map.get("type"))));
        if (map.containsKey(MtopJSBridge.MtopJSParam.SESSION_OPTION)) {
            netRequest.setSessionOption(String.valueOf(map.get(MtopJSBridge.MtopJSParam.SESSION_OPTION)));
        } else {
            netRequest.setSessionOption("AutoLoginAndManualLogin");
        }
        new com.taobao.taolive.sdk.business.b(new com.taobao.taolive.sdk.business.a(new d() { // from class: com.taobao.taolive.room.ui.fanslevel.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj2});
                } else {
                    gVar.a(new String(netResponse.getBytedata()));
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i2, NetResponse netResponse, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj2});
                    return;
                }
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put(c.this.f, (Object) netResponse.getRetCode());
                jSONObject.put(c.this.g, (Object) netResponse.getRetMsg());
                gVar.b(jSONObject.toJSONString());
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i2, NetResponse netResponse, Object obj2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i2), netResponse, obj2});
                    return;
                }
                com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                jSONObject.put(c.this.f, (Object) netResponse.getRetCode());
                jSONObject.put(c.this.g, (Object) netResponse.getRetMsg());
                gVar.b(jSONObject.toJSONString());
            }
        }, this.b)).a(1, netRequest, (Class<?>) null);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a88a7ec", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        com.taobao.taolive.room.mediaplatform.a.a(this.b, map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID), map.get("timePointPlayUrl"), map.get(pqq.KEY_LIVE_SOURCE), map.get("videoGood"), null);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        com.taobao.taolive.room.mediaplatform.a.c();
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean a(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        com.taobao.taolive.sdk.playcontrol.a A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffe481d", new Object[]{this, eVar, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g) || aVar.d == null || !this.c.d.equals(str) || (A = ((com.taobao.taolive.room.controller2.g) this.c).A()) == null) {
            return false;
        }
        if (o.r() && A.e() != null) {
            A.e().a((Drawable) new BitmapDrawable(this.b.getResources(), A.e().bG_()), true);
        }
        A.w();
        A.c(true);
        return true;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.c
    public boolean b(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd6e27c", new Object[]{this, eVar, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = map.get(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
        if (StringUtils.isEmpty(str)) {
            str = map.get("id");
        }
        com.taobao.taolive.room.mediaplatform.a.a(this.b, str, map.get("timePointPlayUrl"), map.get(pqq.KEY_LIVE_SOURCE), map.get("videoGood"), null, true);
        return true;
    }

    private qmr b(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qmr) ipChange.ipc$dispatch("156cd8c3", new Object[]{this, iWVWebView});
        }
        if (!(iWVWebView instanceof TBLiveWebView)) {
            return null;
        }
        TBLiveWebView tBLiveWebView = (TBLiveWebView) iWVWebView;
        if (!(tBLiveWebView.getWebViewToken() instanceof qmr)) {
            return null;
        }
        return (qmr) tBLiveWebView.getWebViewToken();
    }

    public ViewGroup b(Context context) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5d577b36", new Object[]{this, context});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = this.c;
        if (aVar != null && ((e) aVar).o() != null && (o = ((e) this.c).o()) != null && o.uiCompontent != null && o.uiCompontent.a() != null) {
            View j = o.uiCompontent.a().j();
            if (j instanceof ViewGroup) {
                return (ViewGroup) j;
            }
        }
        return poz.b(context, n.b(this.c));
    }
}
