package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.IndexForm;
import com.huawei.searchabilitymanager.client.model.SearchableItemAttributeSet;
import com.taobao.desktop.widget.manager.e;
import com.taobao.search.sf.detailpre.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class khr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile khr f30083a;
    private final Context b;

    static {
        kge.a(-901603587);
    }

    public static /* synthetic */ void a(khr khrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb18270d", new Object[]{khrVar, str});
        } else {
            khrVar.a(str);
        }
    }

    public static /* synthetic */ void a(khr khrVar, cxx cxxVar, JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e31f92e2", new Object[]{khrVar, cxxVar, jSONArray, str});
        } else {
            khrVar.a(cxxVar, jSONArray, str);
        }
    }

    public static khr a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (khr) ipChange.ipc$dispatch("34c57e11", new Object[]{context});
        }
        if (f30083a == null) {
            synchronized (khr.class) {
                if (f30083a == null) {
                    f30083a = new khr(context);
                }
            }
        }
        return f30083a;
    }

    private khr(Context context) {
        if (context.getApplicationContext() != null) {
            this.b = context.getApplicationContext();
        } else {
            this.b = context;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (!e.m(this.b) || !c()) {
                return;
            }
            List<String> b = b();
            if (b.isEmpty()) {
                return;
            }
            a(b);
        } catch (Throwable th) {
            Class<?> cls = getClass();
            khu.a(cls, "insertSearchData onError:  " + th.getMessage());
        }
    }

    private List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        List arrayList = new ArrayList();
        String a2 = khs.a();
        if (a2.isEmpty()) {
            arrayList = Arrays.asList("application", a.TYPE_PAGE_MAIN_SEARCH);
        } else {
            for (Map.Entry entry : ((HashMap) JSON.parseObject(a2, new TypeReference<HashMap<String, String>>() { // from class: tb.khr.1
            }, new Feature[0])).entrySet()) {
                if (kht.a() > Long.parseLong((String) entry.getValue())) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        Class<?> cls = getClass();
        khu.a(cls, "searchUpdatePreCheck typeIdList: " + arrayList);
        return arrayList;
    }

    private void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            khd.a().a("android_search", list, null, new khf() { // from class: tb.khr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.khf
                public void a(final String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    Class<?> cls = getClass();
                    khu.a(cls, "requestSearchData onSuccess responseData: " + str);
                    kie.a().execute(new Runnable() { // from class: tb.khr.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                khr.a(khr.this, str);
                            }
                        }
                    });
                }

                @Override // tb.khf
                public void b(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                        return;
                    }
                    Class<?> cls = getClass();
                    khu.a(cls, "requestSearchData onError retMsg " + str);
                }
            });
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            JSONArray jSONArray = JSONObject.parseObject(str).getJSONObject("contentMap").getJSONObject("android_search").getJSONArray("content");
            JSONArray jSONArray2 = new JSONArray();
            if (jSONArray == null || jSONArray.size() <= 0) {
                return;
            }
            HashMap hashMap = new HashMap(2);
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONArray jSONArray3 = ((JSONObject) next).getJSONArray(hjs.UNDER_TAKE_GOODS_LIST);
                    Class<?> cls = getClass();
                    khu.a(cls, "parseServerData itemArray: " + jSONArray3);
                    hashMap.put(((JSONObject) next).getString("id"), ((JSONObject) next).getString("nextRefreshTime"));
                    if (jSONArray3 != null && jSONArray3.size() > 0) {
                        jSONArray2.addAll(jSONArray3);
                    }
                }
            }
            khs.a(JSON.toJSONString(hashMap));
            a(jSONArray2);
        } catch (Exception e) {
            Class<?> cls2 = getClass();
            khu.a(cls2, "parseServerData onError:  " + e.getMessage());
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            if (kid.e() && cxw.a(this.b)) {
                khu.a(getClass(), "isHuaweiServiceSupport support");
                return true;
            }
        } catch (Throwable th) {
            Class<?> cls = getClass();
            khu.a(cls, "isHuaweiServiceSupport error: " + th.getMessage());
        }
        khu.a(getClass(), "isHuaweiServiceSupport not support");
        return false;
    }

    private void a(final JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        try {
            final cxx cxxVar = new cxx(this.b);
            cxxVar.a(new cxv() { // from class: tb.khr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cxv
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    khu.a(getClass(), "searchServiceConnect onConnect ");
                    kie.a().execute(new Runnable() { // from class: tb.khr.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                khr.a(khr.this, cxxVar, jSONArray, "defaultGroup");
                            }
                        }
                    });
                }

                @Override // tb.cxv
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        khu.a(getClass(), "searchServiceConnect onDisconnect ");
                    }
                }
            });
        } catch (Exception e) {
            Class<?> cls = getClass();
            khu.a(cls, "searchServiceConnect onError:  " + e.getMessage());
        }
    }

    private void a(cxx cxxVar, JSONArray jSONArray, String str) {
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4 = "imgUrl";
        String str5 = "contentType";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0aef07", new Object[]{this, cxxVar, jSONArray, str});
            return;
        }
        try {
            List<IndexForm> b = cxxVar.b("content");
            int a2 = cxxVar.a(this.b.getPackageName());
            if (a2 < 0) {
                Class<?> cls = getClass();
                str2 = "isPriceDrop";
                StringBuilder sb = new StringBuilder();
                str3 = "saleNumber";
                sb.append("createSearchData indexFormVersion: ");
                sb.append(a2);
                khu.a(cls, sb.toString());
                if (cxxVar.a(this.b.getPackageName(), 1, b) == 1) {
                    khu.a(getClass(), "createSearchData setIndexForm success");
                } else {
                    khu.a(getClass(), "createSearchData setIndexForm fail");
                    return;
                }
            } else {
                str2 = "isPriceDrop";
                str3 = "saleNumber";
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                String string = jSONObject2.getString("identifier");
                Iterator<Object> it2 = it;
                if (StringUtils.isEmpty(string)) {
                    string = jSONObject2.getString("title");
                }
                SearchableItemAttributeSet a3 = cxxVar.a(string, str);
                String str6 = str5;
                a3.setContentType(StringUtils.isEmpty(jSONObject2.getString(str5)) ? "application" : jSONObject2.getString(str5));
                a3.setDisplayName(jSONObject2.getString("title"));
                a3.setDescription(jSONObject2.getString("desc"));
                if (StringUtils.isEmpty(jSONObject2.getString(str4))) {
                    a3.setLogoURL("https://img.alicdn.com/imgextra/i2/O1CN01znGs3z1pDMFUtRqtG_!!6000000005326-2-tps-80-80.png");
                } else {
                    a3.setLogoURL(jSONObject2.getString(str4));
                }
                String str7 = str4;
                if (jSONObject2.getJSONArray("keywords").toArray(new String[0]) != null) {
                    a3.setKeyWords((String[]) jSONObject2.getJSONArray("keywords").toArray(new String[0]));
                }
                a3.setUniqueIdentifier(string);
                a3.setDataURI(jSONObject2.getString("jumpUrl"));
                if (jSONObject2.getLong("expiredDate") != null) {
                    jSONObject = jSONObject2;
                    a3.setExpirationDate(new Date(jSONObject2.getLong("expiredDate").longValue() * 1000));
                } else {
                    jSONObject = jSONObject2;
                }
                if (jSONObject.getLong("priority") != null) {
                    a3.setRankingHint((float) jSONObject.getLong("priority").longValue());
                } else {
                    a3.setRankingHint(50.0f);
                }
                if (jSONObject.getInteger("storeStatus") != null) {
                    a3.setStoreStatus(jSONObject.getInteger("storeStatus").intValue());
                }
                if (!StringUtils.isEmpty(jSONObject.getString("productPrice"))) {
                    a3.setProductPrice(Float.parseFloat(jSONObject.getString("productPrice")));
                }
                if (!StringUtils.isEmpty(jSONObject.getString("productRating"))) {
                    a3.setProductRating(Float.parseFloat(jSONObject.getString("productRating")));
                }
                String str8 = str3;
                if (jSONObject.getInteger(str8) != null) {
                    a3.setSaleNumber(jSONObject.getInteger(str8).intValue());
                }
                String str9 = str2;
                if (jSONObject.getInteger(str9) != null) {
                    a3.setIsPriceDrop(jSONObject.getInteger(str9).intValue() == 1);
                }
                arrayList.add(a3);
                str3 = str8;
                str2 = str9;
                str4 = str7;
                str5 = str6;
                it = it2;
            }
            Class<?> cls2 = getClass();
            khu.a(cls2, "createSearchData indexDataList.size: " + arrayList.size());
            List<IndexData> a4 = cxxVar.a(str, this.b.getPackageName(), arrayList);
            Class<?> cls3 = getClass();
            khu.a(cls3, "createSearchData failedList: " + a4);
        } catch (Throwable th) {
            Class<?> cls4 = getClass();
            khu.a(cls4, "createSearchData onError:  " + th.getMessage());
        }
    }
}
