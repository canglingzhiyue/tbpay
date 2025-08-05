package com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.d;
import com.taobao.android.task.Coordinator;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;
import tb.kge;
import tb.ldf;
import tb.liz;
import tb.ljs;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17523a;
    private IContainerDataService<?> b;
    private Map<String, List<BaseSectionModel<?>>> c = new HashMap();

    static {
        kge.a(-858241511);
    }

    public static /* synthetic */ LoadingCache a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoadingCache) ipChange.ipc$dispatch("32706cb", new Object[]{aVar, str}) : aVar.d(str);
    }

    public static /* synthetic */ List a(a aVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f180550a", new Object[]{aVar, list}) : aVar.a(list);
    }

    public static /* synthetic */ void a(a aVar, String str, LoadingCache loadingCache, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdd5a79", new Object[]{aVar, str, loadingCache, str2});
        } else {
            aVar.a(str, loadingCache, str2);
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d50dac", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.f17523a = z;
        return z;
    }

    public a(ljs ljsVar) {
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        List<BaseSectionModel<?>> list = this.c.get(str);
        if (list != null) {
            return list.size();
        }
        return -1;
    }

    public List<BaseSectionModel<?>> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        List<BaseSectionModel<?>> list = this.c.get(str);
        if (list == null) {
            return new ArrayList(0);
        }
        return new ArrayList(list);
    }

    public void a(String str, List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
        } else {
            this.c.put(str, list);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f17523a;
    }

    public void a(final String str, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        final List<BaseSectionModel<?>> b = b(str);
        Coordinator.execute(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                List<JSONObject> bufferList;
                List a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (a.this.a(i)) {
                    a.this.c(str);
                }
                LoadingCache a3 = a.a(a.this, str);
                a.a(a.this, true);
                if (a3 == null || (bufferList = a3.getBufferList()) == null || (a2 = a.a(a.this, bufferList)) == null) {
                    return;
                }
                b.addAll(a2);
                a.this.a(str, b);
                ldf.d("SmartLoadingCache", "从磁盘中取出数据了，取出的数据大小是：" + bufferList.size());
            }
        });
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        File file = new File(d.a(Globals.getApplication()), String.format("%s_%s.dat", str, "insert_card"));
        if (!file.exists()) {
            return;
        }
        file.delete();
    }

    public void b(final String str, List<BaseSectionModel<?>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{this, str, list});
            return;
        }
        final ArrayList arrayList = new ArrayList(list);
        Coordinator.execute(new Runnable() { // from class: com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    LoadingCache loadingCache = new LoadingCache();
                    loadingCache.setBufferList(arrayList);
                    a.a(a.this, str, loadingCache, "insert_card");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            liz.b("loading_cache_time_mills", String.valueOf(SDKUtils.getCorrectionTimeMillis() / 1000));
        }
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        String a2 = liz.a("loading_cache_time_mills", "0");
        if (a2.equals("0")) {
            return false;
        }
        long j = 0;
        try {
            j = (SDKUtils.getCorrectionTimeMillis() / 1000) - Integer.parseInt(a2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return j > ((long) i);
    }

    private List<BaseSectionModel<?>> a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        if (this.b == null) {
            ldf.d("SmartLoadingCache", "transform2BaseSectionModel containerDataService is null");
            return null;
        } else if (list == null) {
            ldf.d("SmartLoadingCache", "transform2BaseSectionModel sectionJsonList is null");
            return null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (JSONObject jSONObject : list) {
                arrayList.add(this.b.createBaseSectionModel(jSONObject));
            }
            return arrayList;
        }
    }

    private LoadingCache d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoadingCache) ipChange.ipc$dispatch("c0c1248a", new Object[]{this, str}) : a(new File(d.a(Globals.getApplication()), String.format("%s_%s.dat", str, "insert_card")));
    }

    private void a(String str, LoadingCache loadingCache, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238813d", new Object[]{this, str, loadingCache, str2});
            return;
        }
        try {
            d.a(new File(d.a(Globals.getApplication()), String.format("%s_%s.dat", str, str2)), JSON.toJSONBytes(loadingCache, new SerializerFeature[0]));
        } catch (Exception e) {
            ldf.a("load cache file error", e, new String[0]);
        } catch (OutOfMemoryError unused) {
            ldf.d("load cache file error, out of memory.", new String[0]);
        }
    }

    private LoadingCache a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoadingCache) ipChange.ipc$dispatch("2f1bebf4", new Object[]{this, file});
        }
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] a2 = d.a(file);
            if (a2 != null && a2.length > 0) {
                return (LoadingCache) JSON.parseObject(a2, LoadingCache.class, new Feature[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
