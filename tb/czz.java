package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MemberCheckResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.h;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class czz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(795275897);
    }

    public static /* synthetic */ void a(czz czzVar, c cVar, JSONObject jSONObject, LiveItem liveItem, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00cfd2d", new Object[]{czzVar, cVar, jSONObject, liveItem, str, str2, str3});
        } else {
            czzVar.a(cVar, jSONObject, liveItem, str, str2, str3);
        }
    }

    public void a(final c cVar, final LiveItem liveItem, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2281c8", new Object[]{this, cVar, liveItem, str, str2, str3});
        } else if (cVar == null || liveItem == null) {
            his.b("AddCartHelper", "addCartAndCheckBySeckill | params empty.");
        } else {
            JSONObject b = pqj.b(liveItem.extendVal.secKillInfo);
            if (b == null) {
                his.b("AddCartHelper", "addCartAndCheckBySeckill | secKillInfo is null.");
            } else {
                dae.a(cVar, liveItem, b, new pox<String>() { // from class: tb.czz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pox
                    public /* synthetic */ void onResult(String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8251d27f", new Object[]{this, str4});
                        } else {
                            a(str4);
                        }
                    }

                    public void a(String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                            return;
                        }
                        his.b("AddCartHelper", "onResult | s=" + str4);
                        czz.a(czz.this, cVar, null, liveItem, str, str2, str3);
                    }

                    @Override // tb.pox
                    public void onError(String str4, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str4, str5});
                            return;
                        }
                        his.b("AddCartHelper", "s=" + str4 + "   msg=" + str5);
                        hix.a(cVar.f(), str5);
                    }
                });
            }
        }
    }

    private void a(final c cVar, JSONObject jSONObject, LiveItem liveItem, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7704e27a", new Object[]{this, cVar, jSONObject, liveItem, str, str2, str3});
            return;
        }
        if (cVar != null) {
            try {
                if (cVar.f() != null) {
                    if (jSONObject == null && liveItem == null) {
                        his.b("AddCartHelper", "addCart | liveDataJson,liveItem is null.");
                        return;
                    } else if (a.a().i() == null) {
                        his.b("AddCartHelper", "addCart | adapter is null.");
                        return;
                    } else {
                        final Context f = cVar.f();
                        if (liveItem == null) {
                            liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class);
                        }
                        String g = hiq.g(liveItem);
                        final HashMap hashMap = new HashMap();
                        hashMap.put("scene", g);
                        hashMap.put("item_position", str3);
                        if (liveItem.extendVal != null) {
                            hashMap.put("isYanxuan", liveItem.extendVal.isYanxuan);
                        }
                        liveItem.clickSource = spy.BIZ_GOODS_LIST;
                        liveItem.cpsClickPos = hiq.a(liveItem, true, str2);
                        a(cVar, liveItem, str, str3);
                        if (a.a().f(cVar)) {
                            a.a().i().a(cVar.C(), (Activity) f, liveItem, "detail", hashMap);
                            return;
                        } else if (!TextUtils.isEmpty(str) && "shopVipEntrance".equals(str)) {
                            a.a().a(cVar, false);
                            ddw.a().a("com.taobao.taolive.room.hide_goods_list.out", null, c.a(cVar));
                            ddw.a().a("com.taobao.taolive.hide.member.identification.inner", null, c.a(cVar));
                            final LiveItem liveItem2 = liveItem;
                            new h(new d() { // from class: tb.czz.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str4, Object... objArr) {
                                    if (str4.hashCode() == -83293931) {
                                        super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
                                        return null;
                                    }
                                    throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
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
                                    if (mo1437getData != null && !TextUtils.isEmpty(mo1437getData.shopMember) && "false".equalsIgnoreCase(mo1437getData.shopMember)) {
                                        a.a().i().a(cVar.C(), liveItem2);
                                    } else if (liveItem2.extendVal == null) {
                                    } else {
                                        a.a().i().a(cVar.C(), (Activity) f, liveItem2, "detail", hashMap);
                                    }
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
                                    } else if (liveItem2.extendVal == null || a.a().i() == null) {
                                    } else {
                                        a.a().i().a(cVar.C(), (Activity) f, liveItem2, "detail", hashMap);
                                    }
                                }
                            }).a(liveItem.extendVal.anchorId, liveItem.liveId);
                            return;
                        } else if (hiq.a(liveItem)) {
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("bottomMode", str2);
                            }
                            his.a("AddCartHelper", "handleEvent | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            a.a().i().a(cVar.C(), (Activity) f, 10000, liveItem, hashMap);
                            return;
                        } else if (hiq.b(liveItem) && hiw.h()) {
                            if (!TextUtils.isEmpty(str2)) {
                                hashMap.put("bottomMode", str2);
                            }
                            his.a("AddCartHelper", "handleEvent liveShop good | addCart, bottomMode=" + ((String) hashMap.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            a.a().i().a(cVar.C(), (Activity) f, 10000, liveItem, hashMap);
                            return;
                        } else {
                            his.a("AddCartHelper", "handleEvent | goToDetail, liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            a.a().i().a(cVar.C(), (Activity) f, liveItem, "detail", hashMap);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        his.b("AddCartHelper", "addCart | context is null.");
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
