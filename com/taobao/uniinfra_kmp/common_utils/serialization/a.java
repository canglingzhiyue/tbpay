package com.taobao.uniinfra_kmp.common_utils.serialization;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u00060\u0004j\u0002`\u0003*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0002H\u0086\b¢\u0006\u0002\u0010\u0007\u001a.\u0010\b\u001a\u0004\u0018\u0001H\u0002\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u00060\u0004j\u0002`\u0003*\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0002\u0010\n\u001a.\u0010\u000b\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u00060\u0004j\u0002`\u0003*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0002H\u0086\b¢\u0006\u0002\u0010\r\u001a.\u0010\u000e\u001a\u0004\u0018\u0001H\u0002\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u00060\u0004j\u0002`\u0003*\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0086\b¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0001¨\u0006\u0014"}, d2 = {"encodeToString", "", "T", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonUtils$Companion;", "value", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonUtils$Companion;Ljava/io/Serializable;)Ljava/lang/String;", "decodeFromString", "string", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonUtils$Companion;Ljava/lang/String;)Ljava/io/Serializable;", "encodeToJsonObject", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonUtils$Companion;Ljava/io/Serializable;)Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "decodeFromJsonObject", "jsonObject", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonUtils$Companion;Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)Ljava/io/Serializable;", "parse", "", "str", "common_utils_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1710948616);
    }

    public static final Object a(b.a aVar, String str) {
        Object parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eceec34c", new Object[]{aVar, str});
        }
        q.d(aVar, "<this>");
        q.d(str, "str");
        try {
            parse = JSON.parse(str);
        } catch (Exception unused) {
        }
        if (parse instanceof JSONObject) {
            return new KMPJsonObject(parse);
        }
        if (parse instanceof JSONArray) {
            return new KMPJsonArray((JSONArray) parse);
        }
        return null;
    }
}
