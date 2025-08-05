package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.d;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.goodlist.k;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhm extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_PRESALE = 5811354893753556959L;

    static {
        kge.a(946187038);
    }

    public static /* synthetic */ Object ipc$super(hhm hhmVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, final c cVar) {
        final LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
        } else if (objArr == null || objArr.length < 2) {
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            final Context m = dXRuntimeContext.m();
            if (jSONObject == null && TextUtils.equals("update", (String) objArr[1]) && dXRuntimeContext.s() != null) {
                jSONObject = dXRuntimeContext.s().getData();
            }
            if (jSONObject == null || (liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class)) == null || liveItem.itemExtData == null) {
                return;
            }
            his.a("Handler_presale", "handleEvent | args1=" + ((String) objArr[1]) + "    liveId=" + liveItem.liveId + "  itemId=" + liveItem.itemId);
            if (TextUtils.equals("subscribe", (String) objArr[1])) {
                String string = liveItem.itemExtData.getString("subscribeStatus");
                long longValue = liveItem.itemExtData.getLongValue("depositBegin");
                long longValue2 = liveItem.itemExtData.getLongValue("depositEnd");
                String str = "预售提醒：" + liveItem.itemName;
                final long b = l.b(liveItem.liveId);
                String d = a.a().d(cVar);
                b(liveItem);
                if (!TextUtils.equals("1", string)) {
                    a.a().i().a(cVar == null ? null : cVar.C(), m, str, "https://h5.m.taobao.com/taolive/video.html?userId=" + d + "&livesource=presale_subscribe&sjsdItemId=" + liveItem.itemId, longValue, longValue2, 1L, new k() { // from class: tb.hhm.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.goodlist.k
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                new d(new com.taobao.taolive.sdk.business.d() { // from class: tb.hhm.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                            return;
                                        }
                                        if (netResponse != null && netResponse.getDataJsonObject() != null) {
                                            try {
                                                if (netResponse.getDataJsonObject().getBoolean("result")) {
                                                    liveItem.itemExtData.put("subscribeStatus", (Object) "1");
                                                    hiq.a(liveItem, cVar);
                                                    hix.a(m, "设置提醒成功，可在手机日历自行关闭提醒");
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th.printStackTrace();
                                            }
                                        }
                                        hix.a(m, "活动太火爆了，再试一次");
                                    }

                                    @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                    public void onError(int i, NetResponse netResponse, Object obj) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                                        } else {
                                            hix.a(m, "活动太火爆了，再试一次");
                                        }
                                    }
                                }).a(b, liveItem.itemId, true, "preSale");
                            }
                        }

                        @Override // com.taobao.taolive.sdk.goodlist.k
                        public void b() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                            } else {
                                hix.a(m, "请授权日历权限！");
                            }
                        }
                    });
                    return;
                }
                a.a().i().a(cVar == null ? null : cVar.C(), m, str, longValue, longValue2, new k() { // from class: tb.hhm.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.goodlist.k
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            new d(new com.taobao.taolive.sdk.business.d() { // from class: tb.hhm.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                        return;
                                    }
                                    hix.a(m, "已取消付定提醒");
                                    liveItem.itemExtData.put("subscribeStatus", (Object) "0");
                                    hiq.a(liveItem, cVar);
                                }

                                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                                public void onError(int i, NetResponse netResponse, Object obj) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                                    } else {
                                        hix.a(m, "取消预约失败，再试一次");
                                    }
                                }
                            }).a(b, liveItem.itemId, false, "preSale");
                        }
                    }

                    @Override // com.taobao.taolive.sdk.goodlist.k
                    public void b() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        } else {
                            hix.a(m, "请授权日历权限！");
                        }
                    }
                });
            } else if (!TextUtils.equals("update", (String) objArr[1])) {
            } else {
                hiq.a(liveItem, cVar);
            }
        }
    }

    private void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae4644", new Object[]{this, liveItem});
        } else if (a.a().j() == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            com.taobao.taolive.sdk.goodlist.c.a(hashMap, liveItem);
            hashMap.put("itemtype", "1");
            a.a().j().a("newcart", hashMap);
        }
    }
}
