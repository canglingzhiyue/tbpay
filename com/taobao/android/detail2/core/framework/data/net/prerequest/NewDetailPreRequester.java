package com.taobao.android.detail2.core.framework.data.net.prerequest;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.preload.core.task.e;
import com.taobao.android.preload.g;
import com.taobao.android.preload.h;
import com.taobao.android.preload.i;
import com.taobao.android.preload.j;
import com.taobao.android.preload.k;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.zcache.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.bpt;
import tb.ctu;
import tb.fig;
import tb.fis;
import tb.fjk;
import tb.fjp;
import tb.fjt;
import tb.fjx;
import tb.fjy;
import tb.fkt;
import tb.fkw;
import tb.fkz;
import tb.icj;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class NewDetailPreRequester implements icj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int b;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.preload.a f11525a = new com.taobao.android.preload.a();

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : b;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        int i = b;
        b = i + 1;
        return i;
    }

    static {
        kge.a(-360343362);
        kge.a(735438186);
        b = 0;
    }

    @Override // tb.icj
    public void a(PreloadTaskEntity preloadTaskEntity, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92b9c76", new Object[]{this, preloadTaskEntity, eVar});
            return;
        }
        ctu.a("NewDetailPreRequester_request");
        ctu.a();
        fjt.a(fjt.TAG_RENDER, "NewDetailPreRequester.request调用");
        h a2 = i.a("new_detail");
        if (a2 != null) {
            a2.b(fkt.b(com.taobao.tao.navigation.a.b()));
        }
        ArrayList<PreloadTaskEntity.a> arrayList = preloadTaskEntity.items;
        if (arrayList == null || arrayList.isEmpty()) {
            fjt.a(fjt.TAG_RENDER, "NewDetailPreRequester.request调用,preloadTaskEntity.items为空");
            eVar.a(preloadTaskEntity, (Exception) null);
            return;
        }
        PreRequestParams preRequestParams = new PreRequestParams();
        HashMap<String, String> hashMap = new HashMap<>();
        preRequestParams.setBatchParams(a(arrayList, hashMap));
        preRequestParams.setNewDetailChannel(a(preloadTaskEntity));
        fkz fkzVar = new fkz(com.taobao.tao.navigation.a.b(), preRequestParams, "NewDetailPreload", false, false);
        fkzVar.a(new NDRemoteBaseListener(this.f11525a, preloadTaskEntity, hashMap, eVar));
        fjt.a(fjt.TAG_RENDER, "NewDetailPreRequester.request调用,发起mtop调用");
        fkzVar.a();
    }

    private String a(PreloadTaskEntity preloadTaskEntity) {
        PreloadTaskEntity.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4051d4a7", new Object[]{this, preloadTaskEntity});
        }
        if (preloadTaskEntity == null || preloadTaskEntity.items == null || preloadTaskEntity.items.isEmpty() || (aVar = preloadTaskEntity.items.get(0)) == null) {
            return "";
        }
        String a2 = fjx.a(aVar.d);
        return StringUtils.isEmpty(a2) ? "" : a2;
    }

    private JSONArray a(ArrayList<PreloadTaskEntity.a> arrayList, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c7b2bbed", new Object[]{this, arrayList, hashMap});
        }
        JSONArray jSONArray = new JSONArray();
        String str = new fis().a(com.taobao.tao.navigation.a.b()).c;
        Iterator<PreloadTaskEntity.a> it = arrayList.iterator();
        while (it.hasNext()) {
            PreloadTaskEntity.a next = it.next();
            JSONObject jSONObject = new JSONObject();
            Map<String, String> a2 = fkw.a(next.c, fkt.GUIDE_PRELOAD_PARAMS_BLACKLIST, fkt.DEFAULT_GUIDE_PRELOAD_PARAMS_BLACKLIST);
            if (!StringUtils.isEmpty(str) && !"0".equals(str)) {
                a2.put(fkw.V, str);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("queryParams", (Object) a2);
            jSONObject.put("bizParams", (Object) jSONObject2);
            String a3 = fjy.a(next.d);
            jSONObject.put("itemId", (Object) a3);
            jSONArray.add(jSONObject);
            String b2 = fjx.b(a3, fjx.a(next.d));
            hashMap.put(a3, b2);
            fig.a c = fig.c(b2);
            if (c != null && c.b == 5) {
                fig.a(b2, 4);
            }
            fig.a(b2, 1);
            fig.a(b2);
        }
        return jSONArray;
    }

    /* loaded from: classes5.dex */
    public static class NDRemoteBaseListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int CORE_POOL_SIZE = 1;
        private static final int KEEP_ALIVE_TIME = 60;
        private com.taobao.android.preload.a mExecutorServiceFactory;
        private Map<String, String> mId2CacheKeyMap;
        private PreloadTaskEntity mPreloadtaskEntity;
        private e mTaskCallback;

        static {
            kge.a(-1233824121);
            kge.a(-525336021);
        }

        public NDRemoteBaseListener(com.taobao.android.preload.a aVar, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, e eVar) {
            this.mExecutorServiceFactory = aVar;
            this.mPreloadtaskEntity = preloadTaskEntity;
            this.mTaskCallback = eVar;
            this.mId2CacheKeyMap = map;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            dealMtopError(this.mPreloadtaskEntity, this.mTaskCallback);
            bga.b.a("new_detail", mtopResponse);
            traceError(mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                getExecutorService().execute(new a(mtopResponse, this.mPreloadtaskEntity, this.mId2CacheKeyMap, this.mTaskCallback));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            dealMtopError(this.mPreloadtaskEntity, this.mTaskCallback);
            bga.b.a("new_detail", mtopResponse);
            traceError(mtopResponse);
        }

        private void traceError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f943280f", new Object[]{this, mtopResponse});
            } else if (mtopResponse == null) {
            } else {
                String a2 = bpt.a(mtopResponse);
                StringBuilder sb = new StringBuilder("traceId: " + a2 + ", nids:[");
                PreloadTaskEntity preloadTaskEntity = this.mPreloadtaskEntity;
                if (preloadTaskEntity != null && preloadTaskEntity.items != null) {
                    Iterator<PreloadTaskEntity.a> it = this.mPreloadtaskEntity.items.iterator();
                    while (it.hasNext()) {
                        PreloadTaskEntity.a next = it.next();
                        if (next != null) {
                            String a3 = fjy.a(next.d);
                            String b = fjx.b(a3, fjx.a(next.d));
                            sb.append(a3);
                            sb.append(",");
                            fig.a(b, 2);
                        }
                    }
                }
                sb.append("], errorMSg: ");
                sb.append(mtopResponse.getRetMsg());
                sb.append(", errorCode: ");
                sb.append(mtopResponse.getRetCode());
                fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_REQUEST_FAIL, sb.toString(), new HashMap());
            }
        }

        private void dealMtopError(PreloadTaskEntity preloadTaskEntity, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d84134a9", new Object[]{this, preloadTaskEntity, eVar});
            } else {
                eVar.a(preloadTaskEntity, (Exception) null);
            }
        }

        private ExecutorService getExecutorService() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("d9806c48", new Object[]{this}) : this.mExecutorServiceFactory.a(1, 60, "newdetail-pre-request-data-parse");
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MtopResponse f11526a;
        private PreloadTaskEntity b;
        private e c;
        private Map<String, String> d;

        static {
            kge.a(-1359974244);
            kge.a(-1390502639);
        }

        public a(MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, Map<String, String> map, e eVar) {
            this.d = new HashMap();
            this.f11526a = mtopResponse;
            this.b = preloadTaskEntity;
            this.c = eVar;
            this.d = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject a2 = a(this.f11526a, this.b, this.c);
            a(this.f11526a, a2);
            if (a2 == null) {
                return;
            }
            a(a2, this.f11526a, this.b, this.c);
            bga.b.b("new_detail", this.f11526a);
        }

        private void a(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a539a663", new Object[]{this, mtopResponse, jSONObject});
                return;
            }
            int size = jSONObject == null ? 0 : jSONObject.keySet().size();
            PreloadTaskEntity preloadTaskEntity = this.b;
            if (preloadTaskEntity != null && preloadTaskEntity.items != null) {
                i = this.b.items.size();
            }
            if (i == size) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String a2 = bpt.a(mtopResponse);
            StringBuilder sb = new StringBuilder("traceId: " + a2 + ", responseNids: ");
            if (jSONObject == null) {
                sb.append("null, ");
            } else {
                sb.append(riy.ARRAY_START_STR);
                for (String str : jSONObject.keySet()) {
                    if (!StringUtils.isEmpty(str)) {
                        String a3 = fjx.a(this.d, str);
                        sb.append(a3);
                        sb.append(", ");
                        arrayList.add(a3);
                    }
                }
                sb.append(riy.ARRAY_END_STR);
            }
            sb.append(", requestNids: ");
            ArrayList arrayList2 = new ArrayList();
            PreloadTaskEntity preloadTaskEntity2 = this.b;
            if (preloadTaskEntity2 == null || preloadTaskEntity2.items == null) {
                sb.append("null");
            } else {
                sb.append(riy.ARRAY_START_STR);
                Iterator<PreloadTaskEntity.a> it = this.b.items.iterator();
                while (it.hasNext()) {
                    PreloadTaskEntity.a next = it.next();
                    if (next != null) {
                        String a4 = fjx.a(this.d, fjy.a(next.d));
                        sb.append(a4);
                        sb.append(",");
                        if (!arrayList2.contains(a4)) {
                            arrayList2.add(a4);
                            if (!arrayList.contains(a4)) {
                                fig.a(a4, 3);
                            }
                        }
                    }
                }
                sb.append(riy.ARRAY_END_STR);
            }
            fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH, sb.toString(), new HashMap());
            if (arrayList2.size() == arrayList.size()) {
                return;
            }
            fjp.a(fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_NID_MISMATCH_DISTINCT, sb.toString(), new HashMap());
        }

        private JSONObject a(MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, e eVar) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("fe19015b", new Object[]{this, mtopResponse, preloadTaskEntity, eVar});
            }
            try {
                jSONObject = JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
            } catch (Exception e) {
                eVar.a(preloadTaskEntity, e);
                fjt.a("new_detail异常", "mtopresponse解析失败", e);
                jSONObject = null;
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                fjt.a(fjt.TAG_RENDER, "预请求preCheckMtopData，拿到的data为空");
                eVar.a(preloadTaskEntity, (Exception) null);
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("preloadSectionList");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                return jSONObject2;
            }
            fjt.a(fjt.TAG_RENDER, "预请求preCheckMtopData，拿到的preloadSectionList为空");
            eVar.a(preloadTaskEntity, (Exception) null);
            return null;
        }

        private void a(JSONObject jSONObject, MtopResponse mtopResponse, PreloadTaskEntity preloadTaskEntity, e eVar) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62ab495b", new Object[]{this, jSONObject, mtopResponse, preloadTaskEntity, eVar});
                return;
            }
            try {
                StringBuilder sb = new StringBuilder("NewDetailPreRequester.dealMtopSuccess调用,缓存");
                j a2 = k.a("new_detail");
                for (String str : jSONObject.keySet()) {
                    if (!StringUtils.isEmpty(str)) {
                        String a3 = fjx.a(this.d, str);
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                        a2.a(new g.a().a("preload").b("low").c(a3).a((g.a) jSONObject2).d(preloadTaskEntity.sourceFrom).a());
                        if (i == 0) {
                            a(jSONObject2);
                        }
                        sb.append(a3);
                        sb.append(", ");
                        fig.a(a3, 5);
                        fjp.a("eventProcess", fjp.UMBRELLA_TAG_PRE_REQUEST_SUCCESS, (Map<String, String>) null);
                        i++;
                    }
                }
                fjt.a(fjt.TAG_RENDER, sb.toString());
                if (fjk.a()) {
                    a2.a("preload", "low");
                }
                a();
                eVar.a(preloadTaskEntity, mtopResponse);
            } catch (Exception e) {
                fjt.a("new_detail异常", "dealMtopSuccess异常", e);
                eVar.a(preloadTaskEntity, e);
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isSuccess", String.valueOf(MUSCommonNativeBridge.b()));
            hashMap.put("preloadWeexNum", String.valueOf(NewDetailPreRequester.a()));
            fjt.a(fjt.TAG_RENDER, "ND在预请求第" + NewDetailPreRequester.a() + "次成功时是否加载成功：" + MUSCommonNativeBridge.b());
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_PRELOAD_WEEX_LOAD_SO_SUCCESS, (Map<String, String>) null);
            NewDetailPreRequester.b();
        }

        private void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (NewDetailPreRequester.a() != 0) {
                fjt.a(fjt.TAG_RENDER, "非首次预请求，不加载zcache");
            } else {
                ArrayList<String> i = fkt.i();
                if (i.size() == 0) {
                    fjt.a(fjt.TAG_RENDER, "zcache orange list为空，不加载zcache");
                } else if (jSONObject == null) {
                    fjt.a(fjt.TAG_RENDER, "数据节点为空，不加载zcache");
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("detailInfo");
                    if (jSONObject2 == null) {
                        fjt.a(fjt.TAG_RENDER, "detailInfo数据节点为空，不加载zcache");
                        return;
                    }
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("biz");
                    if (jSONObject3 == null) {
                        fjt.a(fjt.TAG_RENDER, "biz数据节点为空，不加载zcache");
                        return;
                    }
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("feature");
                    if (jSONObject4 == null) {
                        fjt.a(fjt.TAG_RENDER, "feature数据节点为空，不加载zcache");
                        return;
                    }
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("optimizeConfig");
                    if (jSONObject5 == null) {
                        fjt.a(fjt.TAG_RENDER, "optimizeConfig数据节点为空，不加载zcache");
                    } else if (!"true".equals(jSONObject5.getString("enableAllOptimize"))) {
                        fjt.a(fjt.TAG_RENDER, "enableAllOptimize没打开，不加载zcache");
                    } else {
                        n.a(i);
                        fjt.a(fjt.TAG_RENDER, "首次预请求完成加载zcache成功：" + i);
                    }
                }
            }
        }
    }
}
