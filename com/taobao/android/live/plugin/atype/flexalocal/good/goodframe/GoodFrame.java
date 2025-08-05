package com.taobao.android.live.plugin.atype.flexalocal.good.goodframe;

import android.app.Activity;
import android.content.Intent;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.core.g;
import com.taobao.taolive.sdk.goodlist.c;
import com.taobao.taolive.sdk.goodlist.f;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.v;
import java.util.HashMap;
import tb.ddw;
import tb.hjs;
import tb.kge;
import tb.pox;
import tb.pqj;
import tb.rir;
import tb.ris;
import tb.xkw;
import tb.xmj;

/* loaded from: classes5.dex */
public class GoodFrame extends AbstractGoodFrame implements f, d.a, pox<EnterGoodsData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GoodFrame";
    private com.taobao.taolive.sdk.model.f mHandler;
    private ris messageChannel;
    private String popId;
    private boolean vipShopMessage;
    private Runnable vipShopRunnable;

    static {
        kge.a(1082158699);
        kge.a(-1754585422);
        kge.a(-2101054629);
        kge.a(-189160491);
    }

    public static /* synthetic */ Object ipc$super(GoodFrame goodFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1615569613:
                super.show(((Boolean) objArr[0]).booleanValue(), (HashMap) objArr[1], ((Number) objArr[2]).longValue(), ((Boolean) objArr[3]).booleanValue());
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1014400728:
                super.onEvent((String) objArr[0], objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame
    public boolean isKandian() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ed4694b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isTimeShiftInDiantao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74032f2b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    public static /* synthetic */ boolean access$000(GoodFrame goodFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10d2565f", new Object[]{goodFrame})).booleanValue() : goodFrame.vipShopMessage;
    }

    public static /* synthetic */ boolean access$002(GoodFrame goodFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c55ff39b", new Object[]{goodFrame, new Boolean(z)})).booleanValue();
        }
        goodFrame.vipShopMessage = z;
        return z;
    }

    public static /* synthetic */ com.taobao.taolive.sdk.model.f access$100(GoodFrame goodFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.model.f) ipChange.ipc$dispatch("dd49e872", new Object[]{goodFrame}) : goodFrame.mHandler;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        goodRelatedInit();
        init();
    }

    public GoodFrame(Activity activity, String str, boolean z, TBLiveDataModel tBLiveDataModel, View view, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(activity, str, z, tBLiveDataModel, view, aVar);
        this.vipShopMessage = false;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ddw.a().a(this);
        if (this.mFrameContext != null && this.mFrameContext.f() != null) {
            this.mFrameContext.f().registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1004 || i == 1039;
                }
            });
        }
        this.mHandler = new com.taobao.taolive.sdk.model.f(new com.taobao.taolive.sdk.model.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.a
            public void handleMessage(Message message) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                }
            }
        });
        if (!c.a(this.mLiveDataModel.mVideoInfo.roomStatus, isTimeShiftInDiantao()) || !com.taobao.taolive.sdk.goodlist.d.c() || !hjs.a(this.mGoodLiveContext, this.mLiveId)) {
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("glopenfrom", "timemove_recvoer");
        show(false, hashMap, 0L, true);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.taolive.sdk.goodlist.f
    public void show(boolean z, HashMap<String, String> hashMap, long j, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb45d33", new Object[]{this, new Boolean(z), hashMap, new Long(j), new Boolean(z2)});
            return;
        }
        super.show(z, hashMap, j, z2);
        ddw.a().a("com.taobao.taolive.room.goods_list_showing", true, observeUniqueIdentification());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isOpen", "true");
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r() != null) {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r().a("TBLiveWeex.Event.goodListStatus", hashMap2);
        }
        this.popId = null;
        if (hashMap != null && !TextUtils.isEmpty(hashMap.get("from"))) {
            this.popId = hashMap.get("popId");
            "wyswyg".equals(hashMap.get("from"));
        }
        updateSjsdPopStatus(true);
        if (this.mFrameContext.o() != null) {
            this.mFrameContext.o().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
        ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE, TAG, observeUniqueIdentification());
        HashMap hashMap3 = new HashMap();
        hashMap3.put("scene", TAG);
        hashMap3.put("isMoveUp", "true");
        ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap3, observeUniqueIdentification());
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        ddw.a().a("com.taobao.taolive.room.goods_list_showing", false, observeUniqueIdentification());
        HashMap hashMap = new HashMap();
        hashMap.put("isOpen", "false");
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r() != null) {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().r().a("TBLiveWeex.Event.goodListStatus", hashMap);
        }
        updateSjsdPopStatus(false);
        ddw.a().a("com.taobao.taolive.room.enable_updown_switch", null, observeUniqueIdentification());
        ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, TAG, observeUniqueIdentification());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("scene", TAG);
        hashMap2.put("isMoveUp", "false");
        ddw.a().a(xkw.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap2, observeUniqueIdentification());
        new ExpansionRPGetter().a(this.mGoodLiveContext);
    }

    private void updateSjsdPopStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27544d1b", new Object[]{this, new Boolean(z)});
            return;
        }
        g b = n.b(this.mFrameContext);
        if (b == null || b.F == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) "goods");
        ISmartLandingProxy.b bVar = b.F;
        String str = this.popId;
        bVar.a(z, str, true ^ TextUtils.isEmpty(str), jSONObject);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.mFrameContext != null && this.mFrameContext.f() != null) {
            this.mFrameContext.f().unRegisterMessageListener(this);
        }
        ddw.a().b(this);
        com.taobao.taolive.sdk.model.f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ris risVar = this.messageChannel;
        if (risVar == null) {
            return;
        }
        risVar.b();
        this.messageChannel = null;
    }

    private void goodsOpenShopVip(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73624d09", new Object[]{this, liveItem});
            return;
        }
        this.vipShopMessage = false;
        showMemberPoplayer(liveItem.extendVal.anchorId);
        if (this.vipShopRunnable == null) {
            this.vipShopRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GoodFrame.access$002(GoodFrame.this, true);
                    }
                }
            };
        }
        this.mHandler.postDelayed(this.vipShopRunnable, 10000L);
        if (this.messageChannel != null) {
            return;
        }
        this.messageChannel = new ris(this.mContext, "member_auth_poplayer", new rir() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.GoodFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rir
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (!(obj instanceof JSONObject)) {
                } else {
                    String string = ((JSONObject) obj).getString("name");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    char c = 65535;
                    if (string.hashCode() == 1721945403 && string.equals("authSuccess")) {
                        c = 0;
                    }
                    if (c != 0 || GoodFrame.access$000(GoodFrame.this)) {
                        return;
                    }
                    GoodFrame.access$002(GoodFrame.this, true);
                    new HashMap().put("channel", "goods");
                    if (GoodFrame.access$100(GoodFrame.this) == null) {
                        return;
                    }
                    GoodFrame.access$100(GoodFrame.this).removeCallbacksAndMessages(null);
                }
            }
        });
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 1004) {
            hide();
        } else if (i != 1039 || this.mGoodsView == null) {
        } else {
            this.mGoodsView.destroy();
            this.mGoodsView = null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.ddv
    public void onEvent(String str, Object obj) {
        HashMap<String, String> hashMap;
        long j;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        super.onEvent(str, obj);
        if (xkw.EVENT_SHOW_GOODSPACKAGE.equals(str)) {
            if (obj instanceof HashMap) {
                HashMap<String, String> hashMap2 = (HashMap) obj;
                boolean e = v.e(hashMap2.get("show_item_group"));
                hashMap = hashMap2;
                j = v.c(hashMap2.get("bizTopItemId"));
                z = e;
            } else {
                hashMap = null;
                j = 0;
                z = false;
            }
            if (this.mGoodLiveContext != null) {
                String str2 = hashMap.get("expansionRedPacketList");
                if (!TextUtils.isEmpty(str2) && com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.u()) {
                    this.mGoodLiveContext.x().a(pqj.c(str2));
                    new xmj((ViewGroup) this.mCover.getParent()).a();
                }
            }
            show(z, hashMap, j, false);
        } else if (xkw.EVENT_SHOW_GOODSPACKAGE_DISMISS.equals(str) || "com.taobao.taolive.room.hide_goods_list".equals(str)) {
            hide();
        } else if ("com.taobao.taolive.goods.open.shop_vip".equals(str)) {
            if (!(obj instanceof LiveItem)) {
                return;
            }
            goodsOpenShopVip((LiveItem) obj);
        } else if ("com.taobao.taolive.goods.preset.topitem".equals(str)) {
            if (!(obj instanceof JSONObject) || !v.b.a("goodlist", "enablePresetGoodsListOpenBizTopItem", true)) {
                return;
            }
            this.presetTopItemId = ((JSONObject) obj).getString("itemId");
        } else if (str.equals("com.taobao.taolive.room.hide_goods_list.out")) {
            hide();
        } else if ("com.taobao.taolive.inside.detail.open".equals(str)) {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE, "insideDetail", observeUniqueIdentification());
        } else if (!"com.taobao.taolive.inside.detail.close".equals(str)) {
        } else {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, "insideDetail", observeUniqueIdentification());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.goodframe.AbstractGoodFrame, tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_SHOW_GOODSPACKAGE, xkw.EVENT_SHOW_GOODSPACKAGE_DISMISS, "com.taobao.taolive.room.hide_goods_list", "com.taobao.taolive.goods.open.shop_vip", "com.taobao.taolive.goods.preset.topitem", "com.taobao.taolive.room.hide_goods_list.out", "com.taobao.taolive.goods.force_goods_timeout", "com.taobao.taolive.inside.detail.open", "com.taobao.taolive.inside.detail.close"};
    }

    private void showMemberPoplayer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff1208", new Object[]{this, str});
            return;
        }
        String format = String.format("poplayer://joinmember?sellerId=%s&source=liveroom&autoGetGiftPackage=true", str);
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", format);
        intent.putExtra("param", format);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }
}
