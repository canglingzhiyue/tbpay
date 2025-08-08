package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.hotItemSubscribe.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.goodlist.k;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class tpm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALENDAR_DENY = "请授权日历权限！";
    public static final String CALENDAR_TEXT = "您淘宝直播预约的宝贝马上开抢！";

    static {
        kge.a(-1045791598);
    }

    public static void a(final c cVar, final LiveItem liveItem, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165196b4", new Object[]{cVar, liveItem, str});
        } else if (cVar == null || cVar.x() == null || liveItem == null || liveItem.itemExtData == null) {
            his.b("HotItemSubscriber", "subscribeHotItem | params null.");
        } else if (pmd.a().q() == null) {
            his.b("HotItemSubscriber", "subscribeHotItem | LoginAdapter null.");
        } else {
            new a(new d() { // from class: tb.tpm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (netResponse == null || netResponse.getDataJsonObject() == null) {
                    } else {
                        try {
                            JSONObject optJSONObject = netResponse.getDataJsonObject().optJSONObject("displayInfo");
                            String optString = netResponse.getDataJsonObject().optString("subscribeResultCode");
                            if (optJSONObject == null) {
                                his.b("HotItemSubscriber", "subscribeHotItem | displayInfo null.");
                                return;
                            }
                            String string = optJSONObject.getString("message");
                            hix.a(c.this.f(), string);
                            if (c.this.x() != null) {
                                c.this.x().a(String.valueOf(liveItem.itemId), optString, str);
                            }
                            long longValue = liveItem.itemExtData.getLongValue("promotionStartTime");
                            long millis = longValue + TimeUnit.MINUTES.toMillis(10L);
                            his.b("HotItemSubscriber", "subscribeHotItem | startTime=" + longValue + " name=" + liveItem.itemName + "  msg=" + string);
                            tpm.a(c.this, liveItem, longValue, millis, "hotitem_subscribe");
                        } catch (Throwable th) {
                            his.b("HotItemSubscriber", th.getMessage());
                        }
                    }
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else if (netResponse == null) {
                    } else {
                        his.b("HotItemSubscriber", "subscribeHotItem | onError, msg=" + netResponse.getRetMsg());
                        hix.a(c.this.f(), netResponse.getRetMsg());
                    }
                }
            }).a(liveItem.itemExtData.getString("activityDetailId"), pmd.a().q().a());
        }
    }

    private static String a(c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9574276", new Object[]{cVar, liveItem});
        }
        if (cVar == null || liveItem == null) {
            return "您淘宝直播预约的宝贝马上开抢！";
        }
        String str = (cVar.t() == null || cVar.t().broadCaster == null) ? "" : cVar.t().broadCaster.accountName;
        String str2 = liveItem.itemName;
        if (!StringUtils.isEmpty(liveItem.itemShortTitle)) {
            str2 = liveItem.itemShortTitle;
        }
        return "你预约的" + str + str2 + "可以用补贴抢购啦～";
    }

    public static void a(final c cVar, LiveItem liveItem, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5523bcb4", new Object[]{cVar, liveItem, new Long(j), new Long(j2), str});
        } else if (cVar == null || liveItem == null || cVar.f() == null) {
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar.C(), cVar.f(), a(cVar, liveItem), "https://h5.m.taobao.com/taolive/video.html?userId=" + cVar.m() + "&livesource=" + str, j, j2, 1L, new k() { // from class: tb.tpm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.goodlist.k
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        his.b("HotItemSubscriber", "onGranted.");
                    }
                }

                @Override // com.taobao.taolive.sdk.goodlist.k
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    his.b("HotItemSubscriber", "onDenied.");
                    hix.a(c.this.f(), "请授权日历权限！");
                }
            });
        }
    }

    public static void b(c cVar, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c002c1f5", new Object[]{cVar, liveItem, str});
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null || liveItem == null || liveItem.personalityData == null || liveItem.personalityData.getIntValue("hotItemPreheatSubscribeStatus") != 0) {
        } else {
            HashMap<String, String> a2 = hit.a(cVar, liveItem);
            a2.put("clickSource", StringUtils.equals(str, "showcase") ? "itemwidow" : spy.BIZ_GOODS_LIST);
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("gl_hotItemSubscribe", a2);
        }
    }
}
