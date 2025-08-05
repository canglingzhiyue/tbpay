package com.taobao.taolive.room.controller2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveLifeCycleEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.oec;
import tb.pjf;
import tb.pjg;
import tb.pji;
import tb.pjx;
import tb.pkf;
import tb.pkg;
import tb.pki;
import tb.ssr;

/* loaded from: classes8.dex */
public class TBLVOpenShopCardComponent extends ssr implements pjf, pjg, pji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21553a;
    private Context b;
    private a c;
    private TaoliveOpenLiveRoom d;
    private final JSONObject e;
    private boolean f;
    private float g;
    private String h;
    private final pkf i = new pkf() { // from class: com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.pkf
        public View j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this});
            }
            return null;
        }

        @Override // tb.pkf
        public Float aR_() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("7d17be3e", new Object[]{this}) : Float.valueOf(0.0f);
        }

        @Override // tb.pkf
        public Float i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("c7707cb9", new Object[]{this}) : Float.valueOf(TBLVOpenShopCardComponent.a(TBLVOpenShopCardComponent.this));
        }
    };
    private final ddv j = new ddv() { // from class: com.taobao.taolive.room.controller2.TBLVOpenShopCardComponent.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ddv
        public String bizCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "TBLVOpenShopCardComponent";
        }

        @Override // tb.ddv
        public void onEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 1819439010) {
                if (hashCode == 1868609458 && str.equals("com.taobao.taolive.goods.pop.card.click")) {
                    c = 0;
                }
            } else if (str.equals("com.taobao.taolive.room.live.end.without.replay")) {
                c = 1;
            }
            if (c == 0) {
                TBLVOpenShopCardComponent.a(TBLVOpenShopCardComponent.this, obj);
            } else if (c != 1 || TBLVOpenShopCardComponent.b(TBLVOpenShopCardComponent.this) == null) {
            } else {
                com.taobao.taolive.sdk.utils.q.b(TBLVOpenShopCardComponent.p(), "playerDidEnd live end without replay");
                TBLVOpenShopCardComponent.b(TBLVOpenShopCardComponent.this).b();
            }
        }

        @Override // tb.ddv
        public String[] observeEvents() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.goods.pop.card.click", "com.taobao.taolive.room.live.end.without.replay"};
        }

        @Override // tb.ddv
        public String observeUniqueIdentification() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : TBLVOpenShopCardComponent.c(TBLVOpenShopCardComponent.this);
        }
    };
    private View k;

    /* loaded from: classes8.dex */
    public enum TBLVOpenShopCardComponentClickType {
        DEFAULT(0),
        GOODS_CARD(1);
        
        private final int value;

        TBLVOpenShopCardComponentClickType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(TBLVOpenShopCardComponentClickType tBLVOpenShopCardComponentClickType, Map<String, Object> map);

        void b();

        void c();
    }

    public static /* synthetic */ Object ipc$super(TBLVOpenShopCardComponent tBLVOpenShopCardComponent, String str, Object... objArr) {
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

    @Override // tb.pji
    public void cO_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("128009a", new Object[]{this});
        }
    }

    @Override // tb.pjh
    public void cQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491b1d8", new Object[]{this});
        }
    }

    @Override // tb.pjk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
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

    @Override // tb.pji
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        }
    }

    public static /* synthetic */ float a(TBLVOpenShopCardComponent tBLVOpenShopCardComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("230bdbad", new Object[]{tBLVOpenShopCardComponent})).floatValue() : tBLVOpenShopCardComponent.g;
    }

    public static /* synthetic */ void a(TBLVOpenShopCardComponent tBLVOpenShopCardComponent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f93659", new Object[]{tBLVOpenShopCardComponent, obj});
        } else {
            tBLVOpenShopCardComponent.c(obj);
        }
    }

    public static /* synthetic */ a b(TBLVOpenShopCardComponent tBLVOpenShopCardComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("30861254", new Object[]{tBLVOpenShopCardComponent}) : tBLVOpenShopCardComponent.c;
    }

    public static /* synthetic */ String c(TBLVOpenShopCardComponent tBLVOpenShopCardComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("998c4585", new Object[]{tBLVOpenShopCardComponent}) : tBLVOpenShopCardComponent.h;
    }

    public static /* synthetic */ String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[0]) : f21553a;
    }

    static {
        kge.a(18266972);
        kge.a(-598112112);
        kge.a(-1025874655);
        kge.a(514298380);
        f21553a = TBLVOpenShopCardComponent.class.getSimpleName();
    }

    public TBLVOpenShopCardComponent(Context context, Map map) {
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "init " + map.toString());
        this.b = context;
        this.e = new JSONObject(map);
        a(context);
    }

    private void a(Context context) {
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
        a(this.e, (Map) hashMap);
        pkg a2 = pki.a().a(context, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString(), this.i, pjxVar, hashMap);
        pki.a().a(a2);
        this.d = pki.a().b(a2);
        this.k = pki.a().a(a2, this.d);
        this.h = a2.hashCode() + "_" + System.currentTimeMillis() + new Random().nextInt(1000);
        ddw.a().a(this.j);
    }

    private void a(JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37335efd", new Object[]{this, jSONObject, map});
            return;
        }
        if (jSONObject != null) {
            try {
                this.f = v.e(jSONObject.getString("initMuteStatus"));
                this.g = jSONObject.getFloat("shopBottomOffset").floatValue();
                this.e.put(aw.PARAM_IS_LIVE_MUTE, (Object) Boolean.valueOf(this.f));
                map.put("shopCardDisableComment", jSONObject.getString("shopCardDisableComment"));
                map.put("shopCardDisableGoodsCard", jSONObject.getString("shopCardDisableGoodsCard"));
            } catch (Exception e) {
                String str = f21553a;
                com.taobao.taolive.sdk.utils.q.b(str, "fixParams 参数解析失败" + e.getMessage());
                e.printStackTrace();
                return;
            }
        }
        map.put("OpenWatchType", "shop2F");
        map.put("enableReplayStatusShowLiveEnd", "true");
    }

    private void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (!(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            if (this.c == null) {
                return;
            }
            String string = jSONObject.getString("itemId");
            String str = f21553a;
            com.taobao.taolive.sdk.utils.q.b(str, "click good itemId:" + string);
            this.c.a(TBLVOpenShopCardComponentClickType.GOODS_CARD, jSONObject);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "willAppear " + this);
        if (this.b == null) {
            return;
        }
        if (as.f()) {
            Context context = this.b;
            if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
                ((Activity) this.b).getWindow().addFlags(128);
            }
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onCreate, this.e);
            this.d.callLifeCycle(TaoliveLifeCycleEnum.onWillAppear, null);
        }
        com.taobao.taolive.movehighlight.utils.f.a().a(System.currentTimeMillis());
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "didAppear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidAppear, null);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "willDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onWillDisappear, null);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "didDisappear " + this);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.d;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callLifeCycle(TaoliveLifeCycleEnum.onDidDisappear, null);
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom2 = this.d;
        if (taoliveOpenLiveRoom2 != null) {
            taoliveOpenLiveRoom2.callLifeCycle(TaoliveLifeCycleEnum.onDestory, null);
        }
        ddw.a().b(this.j);
    }

    public View m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this}) : this.k;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e58d8a0", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "setLiveMuted " + z);
        if (this.d == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isMute", String.valueOf(z));
        this.d.callPlatform(PlatformListenerEnum.mute, hashMap);
    }

    @Override // tb.pjj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "playerFirstFrameRender " + this);
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    @Override // tb.pjj
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "playerError " + this);
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // tb.pjl
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "liveRoomUserLeave " + this);
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // tb.pjl
    public void aQ_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac53b56", new Object[]{this});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "liveRoomEnd " + this);
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // tb.ssr
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.f = v.e(map.get("isMuted"));
        }
    }

    @Override // tb.pjg
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = f21553a;
        com.taobao.taolive.sdk.utils.q.b(str, "onClickCleanScreen " + z);
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(TBLVOpenShopCardComponentClickType.DEFAULT, null);
    }

    public static Map customizedPluginMap(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("979c6744", new Object[]{map, map2});
        }
        if (map == null) {
            map = new HashMap();
        }
        Object obj = map.get(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent);
        if (obj instanceof com.taobao.taolive.room.openarchitecture.opencompontent.ability.b) {
            com.taobao.taolive.room.openarchitecture.opencompontent.ability.b bVar = (com.taobao.taolive.room.openarchitecture.opencompontent.ability.b) obj;
            if (bVar.c != null) {
                boolean a2 = oec.a(map2.get("shopCardDisableGoodsCard"), false);
                boolean a3 = oec.a(map2.get("shopCardDisableComment"), false);
                JSONObject parseObject = JSONObject.parseObject((String) bVar.c);
                JSONArray jSONArray = parseObject.getJSONArray("cList");
                for (int i = 0; jSONArray != null && i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("cName");
                    if (string.equals(ComponentGroupConfig.GROUP_LEFT_BOTTOM) && a3) {
                        jSONObject.put("cList", (Object) new JSONArray());
                    }
                    if (string.equals(ComponentGroupConfig.GROUP_RIGHT_BOTTOM) && a2) {
                        jSONObject.put("cList", (Object) new JSONArray());
                    }
                }
                bVar.c = parseObject.toJSONString();
            }
        }
        return map;
    }
}
