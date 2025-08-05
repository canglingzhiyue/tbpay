package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.TBAsyncTask;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dyo;
import tb.ecg;
import tb.eip;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class MtopStreamRequestCallback implements IMtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_STREAM = "isStream";
    private static final String TAG = "MtopStreamRequestCallback";
    public static final String X_USED_STREAM = "x-used-stream";
    private Map<String, String> data;
    private MtopRequestCallback mtopRequestCallback;
    private String streamFlag;
    private AtomicBoolean isMainDataReceived = new AtomicBoolean(false);
    private a detailMainRequestDataController = new a();
    private int segments = 0;
    private boolean isNullForMainData = false;

    static {
        kge.a(-87952106);
        kge.a(179613910);
    }

    public static /* synthetic */ void access$000(MtopStreamRequestCallback mtopStreamRequestCallback, com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadc9f81", new Object[]{mtopStreamRequestCallback, dVar, baseOutDo, new Integer(i), obj});
        } else {
            mtopStreamRequestCallback.handleReceiveData(dVar, baseOutDo, i, obj);
        }
    }

    public static /* synthetic */ void access$100(MtopStreamRequestCallback mtopStreamRequestCallback, com.taobao.tao.stream.b bVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6be0aa2", new Object[]{mtopStreamRequestCallback, bVar, new Integer(i), obj});
        } else {
            mtopStreamRequestCallback.handleError(bVar, i, obj);
        }
    }

    public static /* synthetic */ void access$200(MtopStreamRequestCallback mtopStreamRequestCallback, com.taobao.tao.stream.c cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba746a4", new Object[]{mtopStreamRequestCallback, cVar, new Integer(i), obj});
        } else {
            mtopStreamRequestCallback.handleFinish(cVar, i, obj);
        }
    }

    public MtopStreamRequestCallback(Map<String, String> map, String str) {
        this.data = map;
        this.streamFlag = str;
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback");
    }

    public void setMtopRequestCallback(MtopRequestCallback mtopRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3358838a", new Object[]{this, mtopRequestCallback});
            return;
        }
        this.mtopRequestCallback = mtopRequestCallback;
        ecg.u(null, "");
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onReceiveData(final com.taobao.tao.stream.d dVar, final BaseOutDo baseOutDo, final int i, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
            return;
        }
        i.c(n.a(TAG), "主接口分段流式请求回调，onReceiveData");
        asyncRun(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (MtopStreamRequestCallback.this) {
                    MtopStreamRequestCallback.access$000(MtopStreamRequestCallback.this, dVar, baseOutDo, i, obj);
                }
            }
        });
    }

    private void asyncRun(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff0a6f4", new Object[]{this, runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            new TBAsyncTask<Runnable, Void, Void>() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.async.TBAsyncTask
                public Void a(Runnable... runnableArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("76718c72", new Object[]{this, runnableArr});
                    }
                    runnableArr[0].run();
                    return null;
                }
            }.a(TBAsyncTask.THREAD_POOL_EXECUTOR, runnable);
        } else {
            runnable.run();
        }
    }

    private void handleReceiveData(com.taobao.tao.stream.d dVar, BaseOutDo baseOutDo, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaba6d65", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
            return;
        }
        Map<String, List<String>> map = dVar == null ? null : dVar.g;
        String str = "";
        String str2 = dVar == null ? str : dVar.f21113a;
        String str3 = dVar == null ? str : dVar.b;
        byte[] bArr = dVar == null ? null : dVar.e;
        if (dVar != null) {
            str = dVar.c;
        }
        JSONObject jSONObject = dVar == null ? null : dVar.i;
        Map<String, List<String>> copyMap = copyMap(map);
        boolean isStreamData = isStreamData(copyMap);
        int i2 = this.segments + 1;
        this.segments = i2;
        ecg.b((Context) null, isStreamData, i2);
        if (this.isMainDataReceived.compareAndSet(false, true)) {
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setRetCode(str2);
            mtopResponse.setRetMsg(str3);
            mtopResponse.setApi(str);
            mtopResponse.setBytedata(bArr);
            mtopResponse.setOriginFastJsonObject(jSONObject);
            if (eip.K) {
                mtopResponse.setSupportStreamJson(true);
            }
            copyMap.put(IS_STREAM, new ArrayList());
            mtopResponse.setHeaderFields(copyMap);
            MtopRequestCallback mtopRequestCallback = this.mtopRequestCallback;
            if (mtopRequestCallback != null) {
                mtopRequestCallback.onSuccess(i, mtopResponse, baseOutDo, obj);
            }
            if (bArr == null) {
                i.c(n.a(TAG), "首屏数据为空：");
                ecg.c((Context) null, isStreamData, this.segments);
                this.isNullForMainData = true;
                return;
            }
            String str4 = new String(bArr);
            dyo.a aVar = new dyo.a();
            if (isStreamData) {
                String a2 = n.a(TAG);
                i.c(a2, "首屏流式数据成功：" + dVar.f);
                this.detailMainRequestDataController.a(str4);
            } else {
                i.c(n.a(TAG), "首屏单响应数据成功");
                aVar.d = str4;
            }
            aVar.b = isStreamData;
            dyo.a(aVar, this.streamFlag);
        } else if (this.isNullForMainData) {
            i.c(n.a(TAG), "首屏流式数据为空，后续数据不保存");
        } else if (bArr == null) {
            ecg.c((Context) null, isStreamData, this.segments);
            String a3 = n.a(TAG);
            i.c(a3, this.segments + "段流式数据为空");
        } else {
            String a4 = n.a(TAG);
            i.c(a4, this.segments + "段流式数据成功：" + dVar.f);
            this.detailMainRequestDataController.a(new String(bArr));
        }
    }

    private boolean isStreamData(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5e1a78e", new Object[]{this, map})).booleanValue() : map != null && map.containsKey("x-used-stream");
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onError(final com.taobao.tao.stream.b bVar, final int i, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
            return;
        }
        i.c(n.a(TAG), "主接口分段流式请求回调，onError");
        asyncRun(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (MtopStreamRequestCallback.this) {
                    MtopStreamRequestCallback.access$100(MtopStreamRequestCallback.this, bVar, i, obj);
                }
            }
        });
    }

    private void handleError(com.taobao.tao.stream.b bVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8b9358", new Object[]{this, bVar, new Integer(i), obj});
            return;
        }
        Map<String, List<String>> map = bVar == null ? null : bVar.f21112a;
        String str = "";
        String str2 = bVar == null ? str : bVar.b;
        if (bVar != null) {
            str = bVar.c;
        }
        Map<String, List<String>> copyMap = copyMap(map);
        boolean isStreamData = isStreamData(copyMap);
        dyo.a b = dyo.b(this.streamFlag);
        if (b == null) {
            b = new dyo.a();
            dyo.a(b, this.streamFlag);
        }
        b.b = isStreamData;
        b.f27116a = 3;
        if (!this.isMainDataReceived.get()) {
            String a2 = n.a(TAG);
            i.c(a2, "无onReceiveData流式调用error:retCode" + str2 + "retMsg:" + str);
            MtopResponse mtopResponse = new MtopResponse();
            mtopResponse.setHeaderFields(copyMap);
            mtopResponse.setRetCode(str2);
            mtopResponse.setRetMsg(str);
            MtopRequestCallback mtopRequestCallback = this.mtopRequestCallback;
            if (mtopRequestCallback != null) {
                mtopRequestCallback.onError(i, mtopResponse, obj);
            }
            ecg.f(null, "noOnReceiveDataError", String.valueOf(isStreamData), str2, str);
        } else {
            String a3 = n.a(TAG);
            i.c(a3, "有onReceiveData流式调用error:retCode" + str2 + "retMsg:" + str);
            this.detailMainRequestDataController.a();
            ecg.f(null, "onReceiveDataError", String.valueOf(isStreamData), str2, str);
        }
        ecg.a((Context) null, isStreamData, this.segments, str2, str);
    }

    @Override // com.taobao.tao.stream.IMtopStreamListener
    public void onFinish(final com.taobao.tao.stream.c cVar, final int i, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
            return;
        }
        i.c(n.a(TAG), "主接口分段流式请求回调，onFinish");
        asyncRun(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.request.client.newmtop.MtopStreamRequestCallback.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (MtopStreamRequestCallback.this) {
                    MtopStreamRequestCallback.access$200(MtopStreamRequestCallback.this, cVar, i, obj);
                }
            }
        });
    }

    private void handleFinish(com.taobao.tao.stream.c cVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e206b4", new Object[]{this, cVar, new Integer(i), obj});
            return;
        }
        Map<String, List<String>> map = cVar == null ? null : cVar.f21112a;
        String str = "";
        String str2 = cVar == null ? str : cVar.b;
        if (cVar != null) {
            str = cVar.c;
        }
        Map<String, List<String>> copyMap = copyMap(map);
        boolean isStreamData = isStreamData(copyMap);
        if (!this.isMainDataReceived.get()) {
            i.c(n.a(TAG), "无onReceiveData流式调用finish");
            if (this.mtopRequestCallback != null) {
                MtopResponse mtopResponse = new MtopResponse();
                mtopResponse.setHeaderFields(copyMap);
                mtopResponse.setRetCode(str2);
                mtopResponse.setRetMsg(str);
                this.mtopRequestCallback.onError(i, mtopResponse, obj);
                ecg.f(null, "NoOnReceiveDataFinish", String.valueOf(isStreamData), str2, str);
            }
        } else {
            i.c(n.a(TAG), "有onReceiveData流式调用finish");
            if (!isStreamData) {
                this.detailMainRequestDataController.a();
                i.c(n.a(TAG), "有onReceiveData流式调用finish且非流式返回");
                return;
            }
            try {
                this.detailMainRequestDataController.a(this.data, this.streamFlag);
            } catch (Exception e) {
                i.a(n.a(TAG), "合并数据失败");
                ecg.p(null, e.getMessage());
            }
            this.detailMainRequestDataController.a();
        }
        ecg.a((Context) null, isStreamData, this.segments);
    }

    private Map<String, List<String>> copyMap(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a3fa10c", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        String key = entry.getKey();
                        List<String> value = entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        if (value != null && !value.isEmpty()) {
                            for (String str : value) {
                                arrayList.add(str);
                            }
                            hashMap.put(key, arrayList);
                        }
                        hashMap.put(key, arrayList);
                    }
                }
            } catch (Exception e) {
                i.a(TAG, "流式返回headerFields异常", e);
                ecg.q(null, e.getMessage());
            }
        }
        return hashMap;
    }
}
