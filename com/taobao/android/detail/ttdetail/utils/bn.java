package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/detail/ttdetail/utils/AtmosphereUtils;", "", "()V", "Companion", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes5.dex */
public final class bn {
    public static final a Companion;

    static {
        kge.a(-1265236738);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\n"}, d2 = {"Lcom/taobao/android/detail/ttdetail/utils/AtmosphereUtils$Companion;", "", "()V", "getAtmosphereImage", "", "mergedData", "Lcom/alibaba/fastjson/JSONObject;", "handleAtmosphereBeltData", "", "itemId", "tt-detail_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1012550342);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            } else if (!j.v()) {
            } else {
                String c = com.taobao.android.detail.ttdetail.request.preload.h.a().c(str);
                String str2 = c;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (z || !(!kotlin.jvm.internal.q.a((Object) c, (Object) a(jSONObject)))) {
                    return;
                }
                com.taobao.android.detail.ttdetail.request.preload.h.a().d(str);
            }
        }

        public final String a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
            }
            JSONObject e = g.e(jSONObject);
            if (e == null) {
                return null;
            }
            for (Map.Entry<String, Object> entry : e.entrySet()) {
                String key = entry.getKey();
                if (kotlin.text.n.a("model", key, true) && (jSONObject2 = e.getJSONObject(key)) != null) {
                    for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                        String key2 = entry2.getKey();
                        if (kotlin.text.n.a("detail3Atmosphere", key2, true)) {
                            JSONObject jSONObject4 = jSONObject2.getJSONObject(key2);
                            if (jSONObject4 != null && (jSONObject3 = jSONObject4.getJSONObject("fields")) != null) {
                                return jSONObject3.getString("backgroundImage");
                            }
                            return null;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }
}
