package com.taobao.taolive.room.business.goodcard;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.permisson.a;
import com.taobao.taolive.sdk.utils.q;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import tb.cgl;
import tb.hix;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALENDAR_DENY = "请授权日历权限！";
    public static final String CALENDAR_TEXT = "您淘宝直播预约的宝贝马上开抢！";

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(JSONObject jSONObject);
    }

    static {
        kge.a(-1375524373);
    }

    public static /* synthetic */ void a(c cVar, Context context, long j, long j2, String str, String str2, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37733bd", new Object[]{cVar, context, new Long(j), new Long(j2), str, str2, jSONObject});
        } else {
            cVar.a(context, j, j2, str, str2, jSONObject);
        }
    }

    public void a(final Context context, String str, final String str2, final com.alibaba.fastjson.JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf21d078", new Object[]{this, context, str, str2, jSONObject, aVar});
        } else if (context == null) {
            q.b("HotItemSubscriber", "subscribeHotItem | params null.");
        } else if (pmd.a().q() == null) {
            q.b("HotItemSubscriber", "subscribeHotItem | LoginAdapter null.");
        } else {
            new b(new d() { // from class: com.taobao.taolive.room.business.goodcard.c.1
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
                            if (optJSONObject == null) {
                                q.b("HotItemSubscriber", "subscribeHotItem | displayInfo null.");
                                return;
                            }
                            String string = optJSONObject.getString("message");
                            if ("ALREADY_SUBSCRIBED".equals(netResponse.getDataJsonObject().getString("subscribeResultCode"))) {
                                hix.a(context, string);
                                return;
                            }
                            aVar.a(netResponse.getDataJsonObject());
                            long j = netResponse.getDataJsonObject().getLong("promotionStartTime");
                            long millis = j + TimeUnit.MINUTES.toMillis(10L);
                            q.b("HotItemSubscriber", "subscribeHotItem | startTime=" + j + "  msg=" + string);
                            c.a(c.this, context, j, millis, "hotitem_subscribe", str2, jSONObject);
                        } catch (Throwable th) {
                            q.b("HotItemSubscriber", th.getMessage());
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
                        q.b("HotItemSubscriber", "subscribeHotItem | onError, msg=" + netResponse.getRetMsg());
                        hix.a(context, "预约失败，请重试~");
                        aVar.a();
                    }
                }
            }).a(str, pmd.a().q().a());
        }
    }

    private static String a(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "您淘宝直播预约的宝贝马上开抢！";
        }
        String string = jSONObject.getString("anchorName");
        String string2 = jSONObject.getString("itemName");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return "您淘宝直播预约的宝贝马上开抢！";
        }
        return "你预约的" + string + string2 + "可以用补贴抢购啦～";
    }

    private void a(final Context context, long j, long j2, String str, String str2, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85175f7c", new Object[]{this, context, new Long(j), new Long(j2), str, str2, jSONObject});
        } else if (context == null) {
        } else {
            cgl.t().a(context, a(jSONObject), "https://h5.m.taobao.com/taolive/video.html?userId=" + str2 + "&livesource=" + str, j, j2, 1L, new a.InterfaceC0910a() { // from class: com.taobao.taolive.room.business.goodcard.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        q.b("HotItemSubscriber", "onGranted.");
                    }
                }

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    q.b("HotItemSubscriber", "onDenied.");
                    hix.a(context, "请授权日历权限！");
                }
            });
        }
    }
}
