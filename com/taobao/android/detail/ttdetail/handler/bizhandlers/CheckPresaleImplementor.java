package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.global.SDKUtils;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class CheckPresaleImplementor implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "checkPresale";

    /* renamed from: a  reason: collision with root package name */
    private Handler f10663a = new Handler(Looper.getMainLooper());
    private a b;
    private Context c;
    private eyx d;

    static {
        kge.a(-188909895);
        kge.a(1967244270);
    }

    public static /* synthetic */ void a(CheckPresaleImplementor checkPresaleImplementor, JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99612824", new Object[]{checkPresaleImplementor, jSONObject, runtimeAbilityParamArr});
        } else {
            checkPresaleImplementor.a(jSONObject, runtimeAbilityParamArr);
        }
    }

    public CheckPresaleImplementor(Context context, eyx eyxVar) {
        this.c = context;
        this.d = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null || com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr) == null) {
            return false;
        }
        String string = b.getString("status");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != 49) {
            if (hashCode == 50 && string.equals("2")) {
                c = 1;
            }
        } else if (string.equals("1")) {
            c = 0;
        }
        if (c != 0) {
            if (c == 1) {
                a(b, "endTime");
            } else {
                com.taobao.android.detail.ttdetail.utils.i.a("CheckPresaleImplementor", "preSaleStatus is invalid: " + string);
            }
        } else if (odg.h().b(this.c, this.d, b, new odg.g() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CheckPresaleImplementor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.odg.g
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    CheckPresaleImplementor.a(CheckPresaleImplementor.this, b, runtimeAbilityParamArr);
                }
            }

            @Override // tb.odg.g
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("CheckPresaleImplementor", "PlatformEvn.getReminderEvn().checkRemind() onError with errCode: " + str + " errMsg: " + str2);
            }
        })) {
            a(b, "startTime");
        }
        return true;
    }

    private void a(JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ca12ce", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("beReplaced", (Object) "bottomBarVO");
        jSONObject3.put("toReplace", (Object) "fields");
        jSONObject2.put("targetReplacement", (Object) jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("btnTitle", (Object) "已设置提醒");
        jSONObject4.put("rightFirstStatus", (Object) true);
        jSONObject4.put("rightSecondStatus", (Object) true);
        jSONObject2.put("payload", (Object) jSONObject4);
        this.d.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CheckPresaleImplementor.2
            {
                put("type", "adjustState");
                put("fields", (Object) jSONObject2);
            }
        }), runtimeAbilityParamArr);
    }

    private void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
            return;
        }
        Boolean bool = jSONObject.getBoolean("disableRefresh");
        if (bool == null || bool.booleanValue()) {
            return;
        }
        long longValue = jSONObject.getLong(str).longValue() - ((SDKUtils.getTimeOffset() * 1000) + System.currentTimeMillis());
        if (longValue <= 0) {
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            this.f10663a.removeCallbacks(aVar);
        }
        this.b = new a(this.d);
        this.f10663a.postDelayed(this.b, longValue);
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<eyx> f10665a;

        static {
            kge.a(-1507184417);
            kge.a(-1390502639);
        }

        public a(eyx eyxVar) {
            this.f10665a = new WeakReference<>(eyxVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            eyx eyxVar = this.f10665a.get();
            if (eyxVar == null) {
                return;
            }
            new JSONObject().put("itemId", (Object) com.taobao.android.detail.ttdetail.utils.d.b((Item) eyxVar.a().a(Item.class), ""));
        }
    }
}
