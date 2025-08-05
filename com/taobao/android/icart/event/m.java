package com.taobao.android.icart.event;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.bbz;
import tb.bca;
import tb.bmz;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/icart/event/CartAddCartSubscriber;", "Lcom/alibaba/android/icart/core/ICartSubscriber;", "()V", "onHandleEvent", "", "event", "Lcom/alibaba/android/ultron/trade/event/base/TradeEvent;", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class m extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1897082085);
    }

    public static final /* synthetic */ JSONObject a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1888e8d8", new Object[]{mVar}) : mVar.c();
    }

    public static final /* synthetic */ IDMComponent b(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("8070167d", new Object[]{mVar}) : mVar.h;
    }

    public static final /* synthetic */ bbz c(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("5e940012", new Object[]{mVar}) : mVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        String string;
        Object obj;
        String obj2;
        Object obj3;
        Object obj4;
        IpChange ipChange = $ipChange;
        int i = 1;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject c = c();
        String str = null;
        String obj5 = (c == null || (obj4 = c.get("itemId")) == null) ? null : obj4.toString();
        String str2 = obj5;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        JSONObject c2 = c();
        String obj6 = (c2 == null || (obj3 = c2.get("skuId")) == null) ? null : obj3.toString();
        JSONObject c3 = c();
        if (c3 != null) {
            Object obj7 = c3.get("quantity");
            if (obj7 != null) {
                str = obj7.toString();
            }
            if (str != null) {
                i = Integer.parseInt(str);
            }
        }
        JSONObject c4 = c();
        if (c4 != null && (obj = c4.get("showSKU")) != null && (obj2 = obj.toString()) != null) {
            z = Boolean.parseBoolean(obj2);
        }
        HashMap hashMap = new HashMap();
        JSONObject c5 = c();
        if (c5 != null && (string = c5.getString("exParams")) != null) {
            hashMap.put("exParams", string);
        }
        hashMap.put("itemId", obj5);
        hashMap.put("showSKU", Boolean.valueOf(z));
        if (obj6 != null) {
            hashMap.put("skuId", obj6);
        }
        hashMap.put("quantity", Integer.valueOf(i));
        com.taobao.android.msoa.c.a().a(new com.taobao.android.msoa.h("msoa.taobao.cart.open", "msoa.taobao.cart.open.add", "1.0", "cart", hashMap), new a());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001e\u0010\f\u001a\u00020\u00032\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016¨\u0006\r"}, d2 = {"com/taobao/android/icart/event/CartAddCartSubscriber$onHandleEvent$3", "Lcom/taobao/android/msoa/callback/MSOAServiceListener;", "onFail", "", "s", "", "s1", TplMsg.VALUE_T_NATIVE_RETURN, "", "map", "", "", "onSuccess", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String s, String s1, boolean z, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, s, s1, new Boolean(z), map});
                return;
            }
            q.d(s, "s");
            q.d(s1, "s1");
            q.d(map, "map");
        }

        public a() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, ? extends Object> map) {
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            JSONObject a2 = m.a(m.this);
            if (a2 == null || (string = a2.getString("success")) == null) {
                return;
            }
            IDMComponent mComponent = m.b(m.this);
            q.b(mComponent, "mComponent");
            List<com.taobao.android.ultron.common.model.b> list = mComponent.getEventMap().get(string);
            if (list == null) {
                return;
            }
            for (com.taobao.android.ultron.common.model.b it : list) {
                bbz c = m.c(m.this);
                q.a(c);
                q.b(c, "mPresenter!!");
                bmz a3 = c.F().a();
                q.b(it, "it");
                bmz tradeEvent = a3.a(it.getType()).a(m.b(m.this));
                tradeEvent.a(it);
                q.b(tradeEvent, "tradeEvent");
                tradeEvent.c(string);
                bbz c2 = m.c(m.this);
                q.a(c2);
                q.b(c2, "mPresenter!!");
                c2.F().a(tradeEvent);
            }
        }
    }
}
