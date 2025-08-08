package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.d;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.v;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28665a;
    private String b;

    static {
        kge.a(-2078099866);
    }

    public static /* synthetic */ String a(hhr hhrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("132bf73a", new Object[]{hhrVar}) : hhrVar.f28665a;
    }

    public static /* synthetic */ String b(hhr hhrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13d8a2d9", new Object[]{hhrVar}) : hhrVar.b;
    }

    public hhr() {
        JSONObject b;
        this.f28665a = "预约成功，将在主播开卖时提醒你";
        this.b = "已取消预约";
        String a2 = v.b.a("goodlist", "preheatToast", "");
        if (!StringUtils.isEmpty(a2) && (b = pqj.b(a2)) != null) {
            String string = b.getString("add");
            String string2 = b.getString("cancel");
            if (!StringUtils.isEmpty(string)) {
                this.f28665a = string;
            }
            if (StringUtils.isEmpty(string2)) {
                return;
            }
            this.b = string2;
        }
    }

    public void a(final c cVar, final Context context, final LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d0da3e", new Object[]{this, cVar, context, liveItem, str});
        } else if (liveItem == null) {
        } else {
            if (liveItem.personalityData != null && StringUtils.equals("1", liveItem.personalityData.getString("subscribeStatus"))) {
                z = false;
            }
            a(cVar, liveItem, z);
            final boolean z2 = z;
            new d(new com.taobao.taolive.sdk.adapter.network.d() { // from class: tb.hhr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (netResponse == null || netResponse.getDataJsonObject() == null) {
                    } else {
                        try {
                            if (netResponse.getDataJsonObject().optBoolean("result", false)) {
                                if (liveItem.personalityData == null) {
                                    liveItem.personalityData = new JSONObject();
                                }
                                if (z2) {
                                    liveItem.personalityData.put("subscribeStatus", (Object) "1");
                                } else {
                                    liveItem.personalityData.put("subscribeStatus", (Object) "0");
                                }
                                hiq.a(liveItem, cVar);
                                hix.a(context, z2 ? hhr.a(hhr.this) : hhr.b(hhr.this));
                                return;
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        hix.a(context, "活动太火爆了，再试一次");
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        hix.a(context, "活动太火爆了，再试一次");
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        hix.a(context, "活动太火爆了，再试一次");
                    }
                }
            }).a(l.b(liveItem.liveId), liveItem.itemId, z, str);
        }
    }

    private void a(c cVar, LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb06caa", new Object[]{this, cVar, liveItem, new Boolean(z)});
        } else if (a.a().j() == null) {
        } else {
            HashMap<String, String> a2 = hit.a(cVar, liveItem);
            StringBuilder sb = new StringBuilder();
            sb.append("1_");
            sb.append(z ? "0" : "1");
            a2.put("subscribe", sb.toString());
            a.a().j().a("ItemSubscribe", a2);
        }
    }
}
