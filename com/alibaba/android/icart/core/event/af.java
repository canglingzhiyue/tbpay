package com.alibaba.android.icart.core.event;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.bca;
import tb.bdo;
import tb.bea;
import tb.beb;
import tb.bmz;
import tb.jpy;
import tb.jqh;
import tb.kge;

/* loaded from: classes2.dex */
public class af extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(778757642);
    }

    public static /* synthetic */ IDMComponent a(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("e8f6ef3a", new Object[]{afVar}) : afVar.h;
    }

    public static /* synthetic */ void a(Map map, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf57b4dd", new Object[]{map, jSONObject, jSONObject2});
        } else {
            b(map, jSONObject, jSONObject2);
        }
    }

    public static /* synthetic */ IDMComponent b(af afVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("b0263b59", new Object[]{afVar}) : afVar.h;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        final JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        String string = fields.getString(DMComponent.EXTEND_TYPE);
        final Map hashMap = new HashMap();
        if ("item".equals(string)) {
            hashMap = beb.a(this.h, this.f25791a, new String[0]);
        } else if ("shop".equals(string)) {
            hashMap = beb.b(this.h, this.f25791a, new String[0]);
        }
        hashMap.putAll(bdo.a(this.f25791a));
        if (bea.x()) {
            jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.event.af.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        af.a(hashMap, af.a(af.this) != null ? af.b(af.this).getData() : null, fields);
                    }
                }
            });
        } else {
            new a(hashMap, this.h != null ? this.h.getData() : null, fields).execute(new Void[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f2329a;
        private final JSONObject b;
        private final JSONObject c;

        static {
            kge.a(1853178640);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Void doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        private a(Map<String, String> map, JSONObject jSONObject, JSONObject jSONObject2) {
            this.c = jSONObject;
            this.f2329a = map;
            this.b = jSONObject2;
        }

        public Void a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
            }
            try {
                af.a(this.f2329a, this.c, this.b);
                return null;
            } catch (Exception e) {
                UnifyLog.d("CartUserTracker", "sendTracker error message=" + e.getMessage());
                return null;
            }
        }
    }

    private static void b(Map<String, String> map, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f8f77c", new Object[]{map, jSONObject, jSONObject2});
            return;
        }
        try {
            i = jSONObject2.getInteger("eventId").intValue();
        } catch (Exception unused) {
            i = -1;
        }
        if (i < 0) {
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        HashMap hashMap = new HashMap();
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    if (!(value instanceof String)) {
                        hashMap.put(key, value + "");
                    } else {
                        hashMap.put(key, String.valueOf(jpy.a(jSONObject, value)));
                    }
                }
            }
            map.putAll(hashMap);
        }
        if (jSONObject2.getBooleanValue("mergeAutoUTArgs") && (a2 = bdo.a(jSONObject)) != null) {
            for (Map.Entry<String, Object> entry2 : a2.entrySet()) {
                map.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
        }
        String string = jSONObject2.getString("page");
        String string2 = jSONObject2.getString("arg1");
        String string3 = jSONObject2.getString("arg2");
        String string4 = jSONObject2.getString("arg3");
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, TextUtils.isEmpty(string2) ? "" : string2, TextUtils.isEmpty(string3) ? "" : string3, TextUtils.isEmpty(string4) ? "" : string4, map).build());
    }
}
