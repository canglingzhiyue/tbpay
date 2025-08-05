package com.tmall.android.dai.internal.compute;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import com.taobao.mrt.task.i;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.e;
import com.tmall.android.dai.model.DAIModelTriggerType;
import com.tmall.android.dai.model.c;
import com.tmall.android.dai.model.j;
import com.ut.mini.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;
import tb.noa;

/* loaded from: classes9.dex */
public class a implements DAIComputeService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Map<String, String>> f23676a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, com.tmall.android.dai.model.a> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<DAIModelTriggerType, Set<j>> c = new ConcurrentHashMap<>();

    static {
        kge.a(1049582352);
        kge.a(-1475523334);
    }

    public static /* synthetic */ ConcurrentHashMap a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("404a61de", new Object[]{aVar}) : aVar.f23676a;
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str}) : this.f23676a.get(str);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public void a(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0230f6", new Object[]{this, aVar});
            return;
        }
        this.b.put(aVar.b(), aVar);
        if (aVar.e() == null || aVar.e().size() <= 0) {
            return;
        }
        b(aVar);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        com.taobao.mrt.utils.a.b("DAIComputeService", "Unregister Model, modelName=" + str);
        this.b.remove(str);
        g.a().a(str);
        d(str);
    }

    private void b(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60416955", new Object[]{this, aVar});
            return;
        }
        com.tmall.android.dai.trigger.b.a().a(aVar);
        synchronized (this.c) {
            for (c cVar : aVar.e()) {
                Set<j> set = this.c.get(cVar.b());
                if (set == null) {
                    set = new CopyOnWriteArraySet<>(new HashSet());
                    this.c.put(cVar.b(), set);
                }
                set.add(new j(aVar.b(), cVar.c(), cVar.a()));
            }
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        com.tmall.android.dai.trigger.b.a().a(str);
        if (str.isEmpty()) {
            return;
        }
        synchronized (this.c) {
            for (Set<j> set : this.c.values()) {
                for (j jVar : set) {
                    if (jVar.f23725a.equalsIgnoreCase(str)) {
                        set.remove(jVar);
                    }
                }
            }
        }
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public Set<j> a(DAIModelTriggerType dAIModelTriggerType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("b44301d1", new Object[]{this, dAIModelTriggerType}) : this.c.get(dAIModelTriggerType);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public Collection<com.tmall.android.dai.model.a> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this}) : this.b.values();
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public com.tmall.android.dai.model.a c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.tmall.android.dai.model.a) ipChange.ipc$dispatch("73b67502", new Object[]{this, str}) : this.b.get(str);
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public String a(Map<String, Object> map, String str, String str2, String str3, Map<String, String> map2, Map<String, Map<String, Object>> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28074da5", new Object[]{this, map, str, str2, str3, map2, map3});
        }
        String uuid = UUID.randomUUID().toString();
        String currentPageName = l.getInstance().getCurrentPageName();
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("triId", str);
        map2.put(noa.KEY_MODEL_NAME, str2);
        map2.put("runId", uuid);
        map2.put("page", currentPageName);
        if (str3 != null) {
            map2.put(com.taobao.android.behavix.feature.a.FEATURE_NAME, str3);
        }
        map.put("walle_inner_context", JSON.toJSONString(map2));
        this.f23676a.put(uuid, map2);
        if (map3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dim1", currentPageName);
            hashMap.put("dim2", str);
            hashMap.put("dim3", uuid);
            hashMap.put("dim4", map2.get("subModelName"));
            hashMap.put("dim5", str3);
            map3.put("dims", hashMap);
        }
        return uuid;
    }

    @Override // com.tmall.android.dai.compute.DAIComputeService
    public void a(final String str, Map<String, Object> map, DAIComputeService.TaskPriority taskPriority, final DAICallback dAICallback, final String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a328e3", new Object[]{this, str, map, taskPriority, dAICallback, str2});
            return;
        }
        com.taobao.mrt.utils.a.b("DAIComputeService", "addComputeTaskWithTriId modelName: " + str + "\ttriId: " + str2 + "\tinputData:" + JSON.toJSONString(map));
        final MRTTaskDescription b = g.a().b(str);
        com.tmall.android.dai.model.a c = c(str);
        if (b == null || c == null) {
            if (dAICallback == null) {
                return;
            }
            dAICallback.onError(new DAIError(209, "task not register"));
            return;
        }
        HashMap hashMap = map == null ? new HashMap() : map;
        HashMap hashMap2 = new HashMap();
        final String a2 = a(hashMap, str2, str, c.a(), null, hashMap2);
        e.b(str, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(BHRTaskConfigBase.TYPE_CONFIG_UT);
        arrayList.add(hashMap);
        if (hashMap == null || hashMap.remove(DAI.WALLE_DOWNLOAD_ONLY) == null) {
            z = false;
        }
        final com.tmall.android.dai.internal.util.e eVar = new com.tmall.android.dai.internal.util.e();
        final Map<String, Object> map2 = hashMap;
        g.a().a(str, "__all__", arrayList, z, "ODCP", eVar, new i() { // from class: com.tmall.android.dai.internal.compute.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.mrt.task.i
            public void onCompletion(final int i, final MRTRuntimeException mRTRuntimeException, final Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.tmall.android.dai.internal.compute.a.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str3;
                        int i2;
                        String str4;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        com.taobao.mrt.utils.a.b("DAIComputeService", "MRTJobManager result  modelName: " + str + "\ttriId: " + str2 + "\tinputData:" + JSON.toJSONString(map2) + "code: " + i + " result: " + JSON.toJSONString(obj));
                        if (mRTRuntimeException != null) {
                            if (dAICallback != null) {
                                dAICallback.onError(new DAIError(i, mRTRuntimeException.getMessage()));
                            }
                            str3 = str;
                            i2 = i;
                            str4 = mRTRuntimeException.getMessage();
                        } else {
                            Map map3 = null;
                            boolean a3 = eVar.a();
                            if (obj instanceof List) {
                                String str5 = ((List) obj).get(1) + "";
                                if (!TextUtils.isEmpty(str5)) {
                                    map3 = (Map) JSON.parseObject(str5, Map.class);
                                }
                            }
                            if (!a3) {
                                if (dAICallback != null) {
                                    dAICallback.onError(new DAIError(402, "python finish() func ret false"));
                                }
                                e.a(str, 402, "python finish() func ret false");
                                a.a(a.this).remove(a2);
                            }
                            if (dAICallback != null) {
                                dAICallback.onSuccess(map3);
                            }
                            str3 = str;
                            i2 = i;
                            str4 = "model run success";
                        }
                        e.a(str3, i2, str4);
                        a.a(a.this).remove(a2);
                    }
                };
                if (b.async) {
                    runnable.run();
                } else {
                    com.tmall.android.dai.internal.util.g.b(runnable);
                }
            }
        }, hashMap2);
    }
}
