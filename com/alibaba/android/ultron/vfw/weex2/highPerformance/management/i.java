package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.abm;
import tb.alz;
import tb.cts;
import tb.ifn;
import tb.iro;
import tb.jqd;
import tb.jqg;
import tb.jqh;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class i implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private abm f2780a;
    private LruCache<String, Drawable> b = new LruCache<>(15);

    static {
        kge.a(-692224353);
        kge.a(718836347);
        kge.a(1900527407);
    }

    public static /* synthetic */ LruCache a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("2595724c", new Object[]{iVar}) : iVar.b;
    }

    public static /* synthetic */ String a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("38cbe85b", new Object[]{iVar, str}) : iVar.c(str);
    }

    public static /* synthetic */ List a(i iVar, jqd jqdVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("992e1fc5", new Object[]{iVar, jqdVar, str, str2}) : iVar.a(jqdVar, str, str2);
    }

    public static /* synthetic */ void a(i iVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9a80cc", new Object[]{iVar, list});
        } else {
            iVar.a(list);
        }
    }

    public i(abm abmVar) {
        this.f2780a = abmVar;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2015797284) {
            if (hashCode != 58688523) {
                if (hashCode == 1093956882 && str.equals(UltronTradeHybridStage.ON_RENDER_END)) {
                    c = 0;
                }
            } else if (str.equals(UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                c = 1;
            }
        } else if (str.equals(UltronTradeHybridStage.ON_CONTAINER_DESTROY)) {
            c = 2;
        }
        if (c == 0) {
            a_(str2, UltronTradeHybridStage.ON_RENDER_END, jSONObject);
        } else if (c == 1) {
            a_(str2, UltronTradeHybridStage.ON_CONTAINER_RESUME, jSONObject);
        } else if (c == 2) {
            a_(str2, UltronTradeHybridStage.ON_CONTAINER_DESTROY, jSONObject);
        } else {
            jqg.a("UltronTradeHybridPreRequestImageManager", "onStage", "unknown stage");
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : iro.c(str);
    }

    private void a_(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52db8dd7", new Object[]{this, str, str2, jSONObject});
            return;
        }
        jqg.a("UltronTradeHybridPreRequestImageManager", "prefetchImgByScene:", str + " === start in === " + str2);
        if (!a(str, (String) null)) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "prefetchImgByScene:", str + " switcher is off");
            return;
        }
        List<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.h> b = b(str);
        if (b == null || b.isEmpty()) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "prefetchImgByScene:", str + " preRequestImageModels is empty");
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.h hVar : b) {
            if (hVar != null) {
                if (!StringUtils.equals(hVar.b, str2)) {
                    jqg.a("UltronTradeHybridPreRequestImageManager", "prefetchImgByScene:", str + " no match stage, stage is " + str2);
                } else if (!a(str, jSONObject, hVar.d)) {
                    a(hVar.a(), hVar.d);
                }
            }
        }
    }

    private boolean a(String str, JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ceb68df3", new Object[]{this, str, jSONObject, list})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        Object obj = jSONObject.get("useCustomDataSource");
        if (!(obj instanceof String) || !StringUtils.equals((String) obj, "true")) {
            return false;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -391817972) {
            if (hashCode == 120528346 && str.equals("mytaobao")) {
                c = 1;
            }
        } else if (str.equals(alz.BizKeyOrderList)) {
            c = 0;
        }
        if (c != 0 && c != 1) {
            return false;
        }
        b(list);
        return true;
    }

    private void b(final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            jqh.a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    List a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        List<String> a3 = ifn.Companion.a();
                        jqd a4 = jqd.a("order_list");
                        String userId = Login.getUserId();
                        if (StringUtils.isEmpty(userId)) {
                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncProcessOListData:", "userId is empty");
                            return;
                        }
                        for (String str : a3) {
                            String e = a4.e(userId + str + "_img");
                            if (!StringUtils.isEmpty(e)) {
                                a2 = JSON.parseArray(e, String.class);
                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncProcessOListData:", str + " get imgList from imgMMKV");
                            } else {
                                a2 = i.a(i.this, a4, userId, str);
                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncProcessOListData:", str + " get imgList from olistMMKV");
                            }
                            if (a2 == null) {
                                a2 = new ArrayList();
                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncProcessOListData:", str + " imgList is null");
                            }
                            if (list != null && !list.isEmpty()) {
                                a2.addAll(list);
                            }
                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncProcessOListData:", str + " imgList is valid: " + a2.toString());
                            i.a(i.this, a2);
                        }
                    } catch (Throwable th) {
                        jqg.a("UltronTradeHybridPreRequestImageManager", "asyncProcessOListData:", "throwable: ", th.toString());
                    }
                }
            });
        }
    }

    private List<String> a(jqd jqdVar, String str, String str2) {
        String e;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e08118", new Object[]{this, jqdVar, str, str2});
        }
        try {
            e = jqdVar.e(str + str2);
            if (StringUtils.isEmpty(e)) {
                j f = a.a().f();
                e = f.a(str + str2, cts.a.BIZ_ORDER_LIST);
                jqg.a("UltronTradeHybridPreRequestImageManager", "getImgListFromOListCache:", "load prequest olist data");
            }
        } catch (Throwable unused) {
        }
        if (StringUtils.isEmpty(e)) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "getImgListFromOListCache:", "olistJsonStr is empty");
            return null;
        }
        JSONObject parseObject = JSONObject.parseObject(e);
        if (parseObject == null) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "getImgListFromOListCache:", "olistCacheData is null");
            return null;
        }
        JSONObject jSONObject3 = parseObject.getJSONObject("data");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                if (arrayList.size() >= spk.a(iro.ORANGE_KEY_MY_TAOBAO, "prefetchOListImgCnt", 3)) {
                    break;
                } else if (entry != null) {
                    String key = entry.getKey();
                    if (!StringUtils.isEmpty(key) && key.startsWith("item_") && (entry.getValue() instanceof JSONObject) && (jSONObject = ((JSONObject) entry.getValue()).getJSONObject("fields")) != null && (jSONObject2 = jSONObject.getJSONObject("item")) != null) {
                        String string = jSONObject2.getString("pic");
                        if (!StringUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                }
            }
            jqg.a("UltronTradeHybridPreRequestImageManager", "getImgListFromOListCache:", "olistCacheData's imgList: " + arrayList.toString());
            if (!arrayList.isEmpty()) {
                jqdVar.a(str + str2 + "_img", JSON.toJSONString(arrayList));
            }
            return arrayList;
        }
        jqg.a("UltronTradeHybridPreRequestImageManager", "getImgListFromOListCache:", "olistCacheData's data is null");
        return null;
    }

    private void a(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a(arrayList);
    }

    private void a(final List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list.isEmpty()) {
        } else {
            jqh.a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
                    if (h == null) {
                        return;
                    }
                    if (spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enablePrefetchTradeImg", true)) {
                        h.a("trade-module", list).a();
                        jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "=== phenix.preload ===" + list.toString());
                    }
                    Iterator it = new HashSet(list).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (StringUtils.isEmpty(str)) {
                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "load loop continue: imgUrl is empty");
                        } else {
                            String a2 = i.a(i.this, str);
                            if (StringUtils.isEmpty(a2)) {
                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "load loop continue: formatImgUrl is empty, oriUrl: " + str);
                            } else if (i.a(i.this).get(a2) != null) {
                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "load loop continue: cache drawable is existed(success), formatImgUrl: " + a2);
                            } else {
                                h.a(str).limitSize(null, 200, 200).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.i.2.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.phenix.intf.event.a
                                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                                        IpChange ipChange3 = $ipChange;
                                        return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                                    }

                                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return ((Boolean) ipChange3.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                                        }
                                        if (StringUtils.isEmpty(succPhenixEvent.getUrl())) {
                                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: url is empty");
                                            return false;
                                        }
                                        String a3 = i.a(i.this, succPhenixEvent.getUrl());
                                        if (StringUtils.isEmpty(a3)) {
                                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: formatImgUrl is empty, oriUrl: " + succPhenixEvent.getUrl());
                                            return false;
                                        }
                                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                                        if (drawable == null || succPhenixEvent.isIntermediate()) {
                                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: drawable is null, formatImgUrl: " + a3);
                                        } else {
                                            if (drawable instanceof com.taobao.phenix.cache.memory.f) {
                                                ((com.taobao.phenix.cache.memory.f) drawable).a();
                                            }
                                            if (drawable.getBitmap() != null && drawable.getBitmap().getByteCount() > 307200) {
                                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: prefetch success, but drawable is too large");
                                                return false;
                                            }
                                            i.a(i.this).put(a3, drawable);
                                            jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: prefetch success, formatImgUrl: " + a3);
                                        }
                                        return false;
                                    }
                                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.i.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.phenix.intf.event.a
                                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                                        IpChange ipChange3 = $ipChange;
                                        return ipChange3 instanceof IpChange ? ((Boolean) ipChange3.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                                    }

                                    public boolean a(FailPhenixEvent failPhenixEvent) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return ((Boolean) ipChange3.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                                        }
                                        jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "onHappen: prefetch failed, oriUrl: " + failPhenixEvent.getUrl());
                                        return false;
                                    }
                                }).fetch();
                                jqg.a("UltronTradeHybridPreRequestImageManager", "asyncPrefetchImg:", "=== phenix.load ===, formatImgUrl: " + a2);
                            }
                        }
                    }
                }
            });
        }
    }

    private List<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.h> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        if (!a(str, (String) null)) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "getPreRequestImageModel:", str + " switcher is off");
            return null;
        }
        abm abmVar = this.f2780a;
        if (abmVar == null) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "getPreRequestImageModel:", str + " mConfig is null");
            return null;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
        if (b != null && b.e != null) {
            return b.e;
        }
        jqg.a("UltronTradeHybridPreRequestImageManager", "getPreRequestImageModel:", str + " sceneModel or sceneModel.preRequestImageModels is null");
        return null;
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            Uri parse = Uri.parse(str);
            return StringUtils.isEmpty(parse.getPath()) ? "" : parse.getPath();
        } catch (Throwable unused) {
            return "";
        }
    }

    public Drawable b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("9c19f81d", new Object[]{this, str, str2});
        }
        if (!a(str, (String) null)) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " switcher is off");
            return null;
        }
        String c = c(str2);
        if (StringUtils.isEmpty(c)) {
            jqg.a("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " formatImgUrl is empty, oriUrl: " + str2);
            return null;
        }
        Drawable drawable = this.b.get(c);
        if (drawable != null) {
            return drawable;
        }
        jqg.a("UltronTradeHybridPreRequestImageManager", "getCachedImg:", str + " drawable is null, formatImgUrl: " + c);
        return null;
    }
}
