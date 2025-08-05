package com.alibaba.android.icart.core.performance.cache;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.f;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bbz;
import tb.bed;
import tb.jny;
import tb.jqd;
import tb.jqg;
import tb.jqh;
import tb.jqi;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Drawable> f2372a;
    private static int b;

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        b = i;
        return i;
    }

    public static /* synthetic */ void a(JSONObject jSONObject, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee58fc43", new Object[]{jSONObject, str, list});
        } else {
            b(jSONObject, str, list);
        }
    }

    public static /* synthetic */ void a(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{list, new Integer(i)});
        } else {
            b(list, i);
        }
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : b;
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[0]) : f2372a;
    }

    static {
        kge.a(685950979);
        f2372a = new ConcurrentHashMap();
        b = 0;
    }

    private static void b(JSONObject jSONObject, String str, List<String> list) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a3b122", new Object[]{jSONObject, str, list});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
        if (jSONArray2 == null || jSONArray2.isEmpty()) {
            return;
        }
        Iterator<Object> it = jSONArray2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                String str2 = (String) next;
                if (str2.startsWith("group_") && (jSONArray = jSONObject.getJSONArray(str2)) != null && !jSONArray.isEmpty()) {
                    Iterator<Object> it2 = jSONArray.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (list.size() < b) {
                            if (next2 instanceof String) {
                                String str3 = (String) next2;
                                if (str3.startsWith("item_") && !list.contains(next2)) {
                                    list.add(str3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.performance.cache.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject2;
                    JSONObject jSONObject3;
                    JSONArray jSONArray;
                    JSONObject jSONObject4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b.a(jqi.a("iCart", "maxPreloadItemImageCount", 5));
                    JSONObject jSONObject5 = JSONObject.this.getJSONObject("data");
                    if (jSONObject5 == null || (jSONObject2 = JSONObject.this.getJSONObject("hierarchy")) == null || (jSONObject3 = jSONObject2.getJSONObject("structure")) == null || (jSONArray = jSONObject3.getJSONArray("extendBody_1")) == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            if (arrayList.size() >= b.c()) {
                                break;
                            }
                            b.a(jSONObject3, (String) next, arrayList);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    int i = -1;
                    while (it2.hasNext()) {
                        JSONObject jSONObject6 = jSONObject5.getJSONObject((String) it2.next());
                        if (jSONObject6 != null && (jSONObject4 = jSONObject6.getJSONObject("fields")) != null) {
                            if (i == -1 && jSONObject4.containsKey("itemPrefetchPicSize")) {
                                i = jSONObject4.getInteger("itemPrefetchPicSize").intValue();
                            }
                            String string = jSONObject4.getString("pic");
                            if (string != null) {
                                arrayList2.add(string);
                            }
                        }
                    }
                    b.a(arrayList2, i);
                }
            });
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String str = null;
        try {
            str = jqd.a("iCart").e("firstScreenItemImageUrls");
            if (str == null) {
                return;
            }
            b(Arrays.asList(str.split(",")), -1);
        } catch (Exception e) {
            bed.a("syncLoadPictureToDrawableException", "pictureUrlStr=" + str + " | message=" + e.getMessage());
        }
    }

    private static void b(List<String> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0262f69", new Object[]{list, new Integer(i)});
        } else if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (str != null && !f2372a.containsKey(str)) {
                    PhenixCreator failListener = com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.alibaba.android.icart.core.performance.cache.b.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                        }

                        public boolean a(SuccPhenixEvent succPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                            }
                            BitmapDrawable drawable = succPhenixEvent.getDrawable();
                            if (drawable != null && !succPhenixEvent.isIntermediate()) {
                                if (drawable instanceof f) {
                                    ((f) drawable).a();
                                }
                                String url = succPhenixEvent.getUrl();
                                b.d().put(url, drawable);
                                jqg.b("iCart", "图片加载成功:", url);
                            }
                            return false;
                        }
                    }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.alibaba.android.icart.core.performance.cache.b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.intf.event.a
                        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                        }

                        public boolean a(FailPhenixEvent failPhenixEvent) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                            }
                            jqg.b("iCart", "图片加载失败:" + failPhenixEvent.getUrl());
                            return false;
                        }
                    });
                    if (i > 0) {
                        failListener.limitSize(null, i, i);
                    }
                    failListener.fetch();
                }
            }
        }
    }

    public static Drawable a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("c99d6048", new Object[]{str}) : f2372a.remove(str);
    }

    public static void a(jny jnyVar, bbz bbzVar, boolean z, boolean z2, StreamRemoteMainResponse streamRemoteMainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ca457b", new Object[]{jnyVar, bbzVar, new Boolean(z), new Boolean(z2), streamRemoteMainResponse});
        } else if (jnyVar == null || streamRemoteMainResponse == null) {
        } else {
            JSONObject data = streamRemoteMainResponse.getData();
            if (data == null) {
                data = (JSONObject) JSON.parseObject(streamRemoteMainResponse.getMtopResponse().getBytedata(), JSONObject.class, new Feature[0]);
                streamRemoteMainResponse.setData(data);
            }
            if (data == null) {
                jqg.b("iCart", "tryLoadFirstPageItemPictures#data is null");
                return;
            }
            JSONObject jSONObject = data.getJSONObject("data");
            if (jSONObject == null) {
                jqg.b("iCart", "tryLoadFirstPageItemPictures#ultronProtocol is null");
            } else if (!z || jnyVar.e()) {
            } else {
                if (z2 && bbzVar.j()) {
                    return;
                }
                a(jSONObject);
                jqg.b("iCart", "请求结束，预加载首屏商品图片");
            }
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            f2372a.clear();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            e();
        }
    }
}
