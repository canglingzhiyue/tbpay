package com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.adh;
import tb.dsm;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopRequest f2801a = new MtopRequest();
    public MtopBusiness b;
    public a c;

    static {
        kge.a(475950571);
    }

    public b(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.b bVar, JSONObject jSONObject, a aVar) {
        this.f2801a.setApiName(bVar.f2788a);
        this.f2801a.setVersion(bVar.b);
        this.f2801a.setNeedEcode(bVar.e);
        this.f2801a.setNeedSession(bVar.f);
        if (bVar.h instanceof String) {
            String str = (String) bVar.h;
            if (adh.a(str)) {
                Object a2 = adh.a(str, jSONObject);
                if (a2 instanceof JSONObject) {
                    this.f2801a.setData(((JSONObject) a2).toJSONString());
                }
            }
        } else if (bVar.h instanceof JSONObject) {
            JSONObject parseObject = JSONObject.parseObject(((JSONObject) bVar.h).toJSONString());
            a(parseObject, jSONObject);
            this.f2801a.setData(parseObject.toJSONString());
        }
        this.b = MtopBusiness.build(this.f2801a);
        this.b.mo1305reqMethod(bVar.c ? MethodEnum.POST : MethodEnum.GET);
        if (bVar.d) {
            this.b.mo1335useWua();
        }
        if (!TextUtils.isEmpty(bVar.g)) {
            this.b.mo1328setUnitStrategy(bVar.g);
        }
        this.b.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.UltronTradeHybridPreRequest$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse == null) {
                    if (b.this.c != null) {
                        b.this.c.a("responseError", "mtopResponse is null");
                    }
                    dsm.a(false, mtopResponse, "onSystemError: mtopResponse is null");
                } else {
                    String str2 = "unknown";
                    String retCode = TextUtils.isEmpty(mtopResponse.getRetCode()) ? str2 : mtopResponse.getRetCode();
                    if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                        str2 = mtopResponse.getRetMsg();
                    }
                    if (b.this.c != null) {
                        b.this.c.a(retCode, str2);
                    }
                    dsm.a(false, mtopResponse, String.format("onSystemError: errCode - %s, errorMsg - %s", retCode, str2));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    if (b.this.c != null) {
                        b.this.c.a("responseError", "mtopResponse is null");
                    }
                    dsm.a(false, mtopResponse, "onSuccess: mtopResponse is null");
                } else {
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        if (bytedata == null) {
                            if (b.this.c != null) {
                                b.this.c.a("responseError", "byteData is null");
                            }
                            dsm.a(false, mtopResponse, "onSuccess: byteData is null");
                            return;
                        }
                        JSONObject parseObject2 = JSONObject.parseObject(new String(bytedata));
                        if (b.this.c != null) {
                            b.this.c.a(parseObject2);
                        }
                        dsm.a(true, mtopResponse, "onSuccess!");
                    } catch (Exception e) {
                        if (b.this.c != null) {
                            b.this.c.a("responseError", e.toString());
                        }
                        dsm.a(false, mtopResponse, String.format("onSuccess: %s", e.toString()));
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse == null) {
                    if (b.this.c != null) {
                        b.this.c.a("responseError", "mtopResponse is null");
                    }
                    dsm.a(false, mtopResponse, "onError: mtopResponse is null");
                } else {
                    String str2 = "unknown";
                    String retCode = TextUtils.isEmpty(mtopResponse.getRetCode()) ? str2 : mtopResponse.getRetCode();
                    if (!TextUtils.isEmpty(mtopResponse.getRetMsg())) {
                        str2 = mtopResponse.getRetMsg();
                    }
                    if (b.this.c != null) {
                        b.this.c.a(retCode, str2);
                    }
                    dsm.a(false, mtopResponse, String.format("onError: errCode - %s, errorMsg - %s", retCode, str2));
                }
            }
        });
        this.c = aVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str != null) {
            this.b.mo1310setBizTopic(str);
        }
        this.b.startRequest();
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        MessageQueue messageQueue = null;
        try {
            messageQueue = Looper.myQueue();
        } catch (Exception e) {
            UnifyLog.d("UltronTradeHybridPreRequest.requestIdle", e.toString());
        }
        if (messageQueue == null) {
            UnifyLog.d("UltronTradeHybridPreRequest.requestIdle", "messageQueue is null");
        } else {
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.pre.request.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    b.this.a(str);
                    return false;
                }
            });
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str) && (obj = jSONObject.get(str)) != null) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (adh.a(str2)) {
                            Object a2 = adh.a(str2, jSONObject2);
                            if (a2 != null) {
                                jSONObject.put(str, a2);
                            }
                        }
                    }
                    if (obj instanceof JSONObject) {
                        a((JSONObject) obj, jSONObject2);
                    }
                }
            }
        }
    }
}
