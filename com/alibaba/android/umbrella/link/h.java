package com.alibaba.android.umbrella.link;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.bpt;

/* loaded from: classes.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f2829a;

    private static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("415f7fe0", new Object[0]);
        }
        if (f2829a == null) {
            synchronized (h.class) {
                if (f2829a == null) {
                    f2829a = new d();
                }
            }
        }
        return f2829a;
    }

    public static i a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8d8ad4a3", new Object[]{str, str2, str3, str4});
        }
        if (!a().a().a(str, str3)) {
            return a().a(str, str2, str3, null, 0, null, null, null, c.a(com.alibaba.android.umbrella.link.export.a.a(str4)));
        }
        return null;
    }

    public static i a(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("aba19db9", new Object[]{str, str2, str3, iVar, map, aVar});
        }
        if (!a().a().a(str, str3)) {
            return a().a(str, str2, str3, iVar, 0, null, null, map, c.a(aVar));
        }
        return null;
    }

    public static i a(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("bbf240a5", new Object[]{str, str2, str3, iVar, str4, str5, map, aVar});
        }
        if (!a().a().a(str, str3)) {
            return a().a(str, str2, str3, iVar, 0, str4, str5, map, c.a(aVar));
        }
        return null;
    }

    public static i b(String str, String str2, String str3, i iVar, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f66c11fa", new Object[]{str, str2, str3, iVar, map, aVar});
        }
        if (!a().a().a(str, str3)) {
            return a().a(str, str2, str3, iVar, 1, null, null, map, c.a(aVar));
        }
        return null;
    }

    public static i b(String str, String str2, String str3, i iVar, String str4, String str5, Map<UMDimKey, Object> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f32f6866", new Object[]{str, str2, str3, iVar, str4, str5, map, aVar});
        }
        if (!a().a().a(str, str3)) {
            return a().a(str, str2, str3, iVar, 2, str4, str5, map, c.a(aVar));
        }
        return null;
    }

    private static void a(Map<UMDimKey, Object> map, Map<UMTagKey, String> map2) {
        UMTagKey key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{map, map2});
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            for (Map.Entry<UMTagKey, String> entry : map2.entrySet()) {
                if (entry != null && (key = entry.getKey()) != null) {
                    if (entry.getValue() == null) {
                        map.put(key.getDimKey(), "empty value");
                    } else {
                        map.put(key.getDimKey(), entry.getValue());
                    }
                }
            }
        }
    }

    public static i a(String str, String str2, i iVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("51e769c7", new Object[]{str, str2, iVar, str3, str4, str5, str6, map, aVar});
        }
        if (a().a().a(str, UMLLCons.FEATURE_TYPE_PAGE)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, str3);
        hashMap.put(UMDimKey.DIM_2, str4);
        a(hashMap, map);
        return a().a(str, str2, UMLLCons.FEATURE_TYPE_PAGE, iVar, 0, str5, str6, hashMap, c.a(aVar));
    }

    public static i a(String str, String str2, i iVar, String str3, String str4, String str5, String str6, String str7, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("c534047d", new Object[]{str, str2, iVar, str3, str4, str5, str6, str7, map, aVar});
        }
        if (a().a().a(str, UMLLCons.FEATURE_TYPE_UI_ACTION)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, str3);
        hashMap.put(UMDimKey.DIM_2, str4);
        hashMap.put(UMDimKey.DIM_3, str5);
        hashMap.put(UMDimKey.DIM_4, str6);
        a(hashMap, map);
        return a().a(str, str2, UMLLCons.FEATURE_TYPE_UI_ACTION, iVar, 0, null, null, hashMap, c.a(aVar).a("args", str7));
    }

    public static i a(String str, String str2, i iVar, String str3, String str4, String str5, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("94446d91", new Object[]{str, str2, iVar, str3, str4, str5, map, aVar});
        }
        if (a().a().a(str, UMLLCons.FEATURE_TYPE_MTOP)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, str3);
        hashMap.put(UMDimKey.DIM_2, str4);
        a(hashMap, map);
        return a().a(str, str2, UMLLCons.FEATURE_TYPE_MTOP, iVar, 1, null, null, hashMap, c.a(aVar).a("requestParams", str5));
    }

    public static i a(String str, String str2, i iVar, MtopResponse mtopResponse, String str3, Map<UMTagKey, String> map, com.alibaba.android.umbrella.link.export.a aVar) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f6fa540", new Object[]{str, str2, iVar, mtopResponse, str3, map, aVar});
        }
        if (a().a().a(str, UMLLCons.FEATURE_TYPE_MTOP) || mtopResponse == null) {
            return null;
        }
        String a2 = bpt.a(mtopResponse);
        HashMap hashMap = new HashMap();
        hashMap.put(UMDimKey.DIM_1, mtopResponse.getApi());
        hashMap.put(UMDimKey.DIM_2, mtopResponse.getV());
        hashMap.put(UMDimKey.DIM_3, bpt.b(a2));
        hashMap.put(UMDimKey.DIM_4, mtopResponse.getRetCode());
        hashMap.put(UMDimKey.DIM_5, Integer.valueOf(mtopResponse.getResponseCode()));
        a(hashMap, map);
        String str6 = "";
        if (!mtopResponse.isApiSuccess()) {
            str4 = mtopResponse.getRetCode();
            str5 = mtopResponse.getRetMsg();
        } else {
            str4 = str6;
            str5 = str4;
        }
        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
        if (dataJsonObject != null) {
            str6 = dataJsonObject.toString();
        }
        return a().a(str, str2, UMLLCons.FEATURE_TYPE_MTOP, iVar, 2, str4, str5, hashMap, c.a(aVar).a("responseString", str6).a("responseHeaders", mtopResponse.getHeaderFields()).a("requestParams", str3));
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
        } else if (a().a().a(str4, str)) {
        } else {
            a().a(str, str2, str3, str4, str5, map);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3969d7f", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
        } else if (a().a().a(str4, str)) {
        } else {
            a().a(str, str2, str3, str4, str5, map, str6, str7);
        }
    }

    public static void a(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693eb862", new Object[]{str, str2, umTypeKey, str3, str4});
        } else if (a().a().a(str, umTypeKey.getKey())) {
        } else {
            a().a(str, str2, umTypeKey, str3, str4);
        }
    }
}
