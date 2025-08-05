package com.alibaba.android.nextrpc.stream.internal.mtop;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.tao.stream.c;
import com.taobao.tao.stream.d;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes2.dex */
public class StreamMtopRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MtopBusiness f2389a;
    private Handler b = null;

    public StreamMtopRequestClient(MtopBusiness mtopBusiness) {
        this.f2389a = mtopBusiness;
        a(mtopBusiness);
    }

    private void a(MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d0bd46", new Object[]{this, mtopBusiness});
        } else if (mtopBusiness.mtopProp == null || mtopBusiness.mtopProp.handler == null || mtopBusiness.mtopProp.handler.getLooper() == Looper.getMainLooper()) {
        } else {
            this.b = new Handler(Looper.getMainLooper());
        }
    }

    public void a(IStreamMtopRequestCallback iStreamMtopRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f0c8f0", new Object[]{this, iStreamMtopRequestCallback});
            return;
        }
        StreamResponse streamResponse = new StreamResponse(iStreamMtopRequestCallback, this.b);
        MtopBusiness mtopBusiness = this.f2389a;
        if (mtopBusiness == null) {
            return;
        }
        mtopBusiness.streamMode(true);
        this.f2389a.mo1337addListener((MtopListener) streamResponse).startRequest();
    }

    /* loaded from: classes2.dex */
    public static class StreamResponse implements IMtopStreamListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final IStreamMtopRequestCallback callback;
        private Handler mainHandler;

        public static /* synthetic */ IStreamMtopRequestCallback access$000(StreamResponse streamResponse) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (IStreamMtopRequestCallback) ipChange.ipc$dispatch("f026f499", new Object[]{streamResponse}) : streamResponse.callback;
        }

        public StreamResponse(IStreamMtopRequestCallback iStreamMtopRequestCallback, Handler handler) {
            this.callback = iStreamMtopRequestCallback;
            this.mainHandler = handler;
        }

        private void postToMain(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baa2c919", new Object[]{this, runnable});
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                if (this.mainHandler == null) {
                    this.mainHandler = new Handler(Looper.getMainLooper());
                }
                this.mainHandler.post(runnable);
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onReceiveData(final d dVar, final BaseOutDo baseOutDo, final int i, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ccf0e5c", new Object[]{this, dVar, baseOutDo, new Integer(i), obj});
                return;
            }
            final String str = dVar.f == null ? "" : dVar.f;
            final long currentTimeMillis = System.currentTimeMillis();
            final StreamRemoteMainResponse streamRemoteMainResponse = new StreamRemoteMainResponse(i, dVar, baseOutDo, obj);
            streamRemoteMainResponse.setData(parse(dVar));
            streamRemoteMainResponse.parseBizSuccess(dVar.h);
            final long currentTimeMillis2 = System.currentTimeMillis();
            postToMain(new Runnable() { // from class: com.alibaba.android.nextrpc.stream.internal.mtop.StreamMtopRequestClient.StreamResponse.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis3 = System.currentTimeMillis();
                    com.alibaba.android.nextrpc.stream.internal.response.b statistics = streamRemoteMainResponse.getStatistics();
                    statistics.a(str);
                    statistics.a(currentTimeMillis);
                    statistics.b(currentTimeMillis2);
                    statistics.c(currentTimeMillis2);
                    statistics.d(currentTimeMillis3);
                    if (dVar.i != null) {
                        z = true;
                    }
                    statistics.a(z);
                    StreamResponse.access$000(StreamResponse.this).onReceiveData(streamRemoteMainResponse, baseOutDo, i, obj);
                }
            });
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onError(final com.taobao.tao.stream.b bVar, final int i, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fad801", new Object[]{this, bVar, new Integer(i), obj});
            } else {
                postToMain(new Runnable() { // from class: com.alibaba.android.nextrpc.stream.internal.mtop.StreamMtopRequestClient.StreamResponse.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            StreamResponse.access$000(StreamResponse.this).onError(bVar, i, obj);
                        }
                    }
                });
            }
        }

        @Override // com.taobao.tao.stream.IMtopStreamListener
        public void onFinish(final c cVar, final int i, final Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("295b572b", new Object[]{this, cVar, new Integer(i), obj});
            } else {
                postToMain(new Runnable() { // from class: com.alibaba.android.nextrpc.stream.internal.mtop.StreamMtopRequestClient.StreamResponse.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            StreamResponse.access$000(StreamResponse.this).onFinish(cVar, i, obj);
                        }
                    }
                });
            }
        }

        private JSONObject parse(d dVar) {
            JSONObject jSONObject;
            String[] split;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("78cf1c32", new Object[]{this, dVar});
            }
            JSONObject jSONObject2 = null;
            if (dVar.h == null) {
                byte[] bArr = dVar.e;
                if (bArr == null || bArr.length == 0) {
                    dVar.f21113a = ErrorConstant.ERRCODE_JSONDATA_BLANK;
                    dVar.b = ErrorConstant.ERRMSG_JSONDATA_BLANK;
                    return null;
                }
                try {
                    if (dVar.i == null) {
                        jSONObject = (JSONObject) JSONObject.parseObject(bArr, JSONObject.class, new Feature[0]);
                    } else {
                        jSONObject = dVar.i;
                    }
                    jSONObject2 = jSONObject;
                    JSONArray jSONArray = jSONObject2.getJSONArray(com.taobao.mtop.wvplugin.a.RESULT_KEY);
                    if (jSONArray != null) {
                        String[] strArr = new String[jSONArray.size()];
                        for (int i = 0; i < jSONArray.size(); i++) {
                            strArr[i] = String.valueOf(jSONArray.get(i));
                        }
                        dVar.h = strArr;
                        if (strArr.length > 0) {
                            String str = strArr[0];
                            if (StringUtils.isNotBlank(str) && (split = str.split("::")) != null && split.length > 1) {
                                dVar.f21113a = split[0];
                                dVar.b = split[1];
                            }
                        }
                    }
                } catch (Exception unused) {
                    dVar.f21113a = ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR;
                    dVar.b = ErrorConstant.ERRMSG_JSONDATA_PARSE_ERROR;
                }
                return jSONObject2;
            } else if (dVar.i != null) {
                return dVar.i;
            } else {
                return null;
            }
        }
    }
}
