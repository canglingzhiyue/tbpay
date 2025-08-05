package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.h;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.goodlist.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhi extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_ADDTOCART = 5119113208634763883L;

    static {
        kge.a(-1538570768);
    }

    public static /* synthetic */ Object ipc$super(hhi hhiVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hhi hhiVar, Context context, c cVar, LiveItem liveItem, JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb9e79c", new Object[]{hhiVar, context, cVar, liveItem, jSONObject, objArr});
        } else {
            hhiVar.a(context, cVar, liveItem, jSONObject, objArr);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // tb.iot
    public void a(DXEvent dXEvent, final Object[] objArr, DXRuntimeContext dXRuntimeContext, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
            return;
        }
        try {
            final JSONObject jSONObject = (JSONObject) objArr[0];
            final Context m = dXRuntimeContext.m();
            final LiveItem liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class);
            hiq.a(cVar, liveItem);
            if (liveItem.itemActionData != null && liveItem.itemActionData.containsKey("userBehaviorEvents")) {
                String string = liveItem.itemActionData.getString("userBehaviorEvents");
                if (!TextUtils.isEmpty(string) && hhf.a(string, '@', "userbuy")) {
                    new sql().a(cVar, liveItem, new pox<Boolean>() { // from class: tb.hhi.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.pox
                        public /* synthetic */ void onResult(Boolean bool) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8251d27f", new Object[]{this, bool});
                            } else {
                                a(bool);
                            }
                        }

                        public void a(Boolean bool) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                            } else if (bool.booleanValue()) {
                                hhi.a(hhi.this, m, cVar, liveItem, jSONObject, objArr);
                            } else {
                                his.b("Handler_addToCart", "handleEvent | result is false.");
                            }
                        }

                        @Override // tb.pox
                        public void onError(String str, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                                return;
                            }
                            his.a("Handler_addToCart", "handleEvent.onError | liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                        }
                    });
                } else {
                    a(m, cVar, liveItem, jSONObject, objArr);
                }
            } else {
                a(m, cVar, liveItem, jSONObject, objArr);
            }
            if (!hkk.aa()) {
                return;
            }
            ddw.a().a("com.taobao.taolive.room.addcart", Long.valueOf(liveItem.itemId), cVar.D());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(final Context context, final c cVar, final LiveItem liveItem, JSONObject jSONObject, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffa18a3", new Object[]{this, context, cVar, liveItem, jSONObject, objArr});
            return;
        }
        String g = hiq.g(liveItem);
        final HashMap hashMap = new HashMap();
        hashMap.put("scene", g);
        String str = "2";
        hashMap.put("laiyuan", str);
        String string = jSONObject.getString("item_position");
        hashMap.put("item_position", string);
        if (liveItem.extendVal == null || !"secKill".equals(liveItem.extendVal.itemBizType)) {
            str = "1";
        }
        if (liveItem.extendVal != null) {
            hashMap.put("isYanxuan", liveItem.extendVal.isYanxuan);
        }
        hashMap.put("bubbleType", str);
        String str2 = objArr.length >= 2 ? (String) objArr[1] : null;
        liveItem.clickSource = spy.BIZ_GOODS_LIST;
        liveItem.cpsClickPos = hiq.a(liveItem, true, objArr.length >= 3 ? (String) objArr[2] : "");
        a(cVar, liveItem, str2, string);
        if (a.a().f(cVar) && a.a().i() != null) {
            a.a().i().a(cVar == null ? null : cVar.C(), (Activity) context, liveItem, "detail", hashMap);
        } else if (!a.a().f(cVar) && !TextUtils.isEmpty(str2) && "shopVipEntrance".equals(str2)) {
            a.a().a(cVar, false);
            ddw.a().a("com.taobao.taolive.room.hide_goods_list.out", null, c.a(cVar));
            ddw.a().a("com.taobao.taolive.hide.member.identification.inner", null, c.a(cVar));
            new h(new d() { // from class: tb.hhi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr2) {
                    if (str3.hashCode() == -83293931) {
                        super.onSuccess(((Number) objArr2[0]).intValue(), (NetResponse) objArr2[1], (NetBaseOutDo) objArr2[2], objArr2[3]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, netResponse, netBaseOutDo, obj);
                    MemberCheckResponseData mo1437getData = ((MemberCheckResponse) netBaseOutDo).mo1437getData();
                    if (a.a().i() == null) {
                        return;
                    }
                    com.taobao.alilive.aliliveframework.frame.a aVar = null;
                    if (mo1437getData != null && !TextUtils.isEmpty(mo1437getData.shopMember) && "false".equalsIgnoreCase(mo1437getData.shopMember)) {
                        e i2 = a.a().i();
                        c cVar2 = cVar;
                        if (cVar2 != null) {
                            aVar = cVar2.C();
                        }
                        i2.a(aVar, liveItem);
                        return;
                    }
                    LiveItem liveItem2 = liveItem;
                    if (liveItem2 == null || liveItem2.extendVal == null) {
                        return;
                    }
                    e i3 = a.a().i();
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        aVar = cVar3.C();
                    }
                    i3.a(aVar, (Activity) context, liveItem, "detail", hashMap);
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onSystemError(i, netResponse, obj);
                    }
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    LiveItem liveItem2 = liveItem;
                    if (liveItem2 == null || liveItem2.extendVal == null || a.a().i() == null) {
                        return;
                    }
                    e i2 = a.a().i();
                    c cVar2 = cVar;
                    i2.a(cVar2 == null ? null : cVar2.C(), (Activity) context, liveItem, "detail", hashMap);
                }
            }).a(liveItem.extendVal.anchorId, liveItem.liveId);
        } else if (liveItem == null || a.a().i() == null) {
        } else {
            if (hiq.a(liveItem)) {
                if (objArr.length >= 3) {
                    hashMap.put("bottomMode", (String) objArr[2]);
                }
                his.a("Handler_addToCart", "handleEvent | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                a.a().i().a(cVar == null ? null : cVar.C(), (Activity) context, 10000, liveItem, hashMap);
            } else if (hiq.b(liveItem) && hiw.h()) {
                if (objArr.length >= 3) {
                    hashMap.put("bottomMode", (String) objArr[2]);
                }
                his.a("Handler_addToCart", "handleEvent liveShop good | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                a.a().i().a(cVar == null ? null : cVar.C(), context, 10000, liveItem, hashMap);
            } else {
                his.a("Handler_addToCart", "handleEvent | goToDetail, liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                a.a().i().a(cVar == null ? null : cVar.C(), (Activity) context, liveItem, "detail", hashMap);
            }
        }
    }

    private void a(c cVar, LiveItem liveItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e9fb7e", new Object[]{this, cVar, liveItem, str, str2});
        } else if ("newcart".equals(str)) {
            HashMap<String, String> hashMap = new HashMap<>();
            com.taobao.taolive.sdk.goodlist.c.a(hashMap, liveItem);
            a.a().j().a("newcart", hashMap);
            com.taobao.android.live.plugin.atype.flexalocal.good.track.a.a(cVar, liveItem, true, true, str2);
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.track.a.a(cVar, liveItem, true, false, str2);
        }
    }
}
