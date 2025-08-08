package com.alibaba.android.ultron.vfw.weex2;

import android.os.Looper;
import android.os.MessageQueue;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dsm;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopRequest f2761a = new MtopRequest();
    public MtopBusiness b;
    public b c;

    /* loaded from: classes2.dex */
    public interface b {
        void a(JSONObject jSONObject);

        void a(String str, String str2);
    }

    static {
        kge.a(138168401);
    }

    public e(a aVar) {
        this.f2761a.setApiName(a.a(aVar));
        this.f2761a.setVersion(a.b(aVar));
        if (a.c(aVar) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(a.c(aVar));
            this.f2761a.setData(jSONObject.toJSONString());
        }
        this.b = MtopBusiness.build(this.f2761a);
        if (StringUtils.equals("post", a.d(aVar))) {
            this.b.mo1305reqMethod(MethodEnum.POST);
        } else {
            this.b.mo1305reqMethod(MethodEnum.GET);
        }
        if (a.e(aVar)) {
            this.b.mo1335useWua();
        }
        if (!StringUtils.isEmpty(a.f(aVar))) {
            this.b.mo1328setUnitStrategy(a.f(aVar));
        }
        this.b.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchRequest$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse == null) {
                    if (e.this.c != null) {
                        e.this.c.a("responseError", "mtopResponse is null");
                    }
                    dsm.a(false, mtopResponse, "onSystemError: mtopResponse is null");
                } else {
                    String str = "unknown";
                    String retCode = StringUtils.isEmpty(mtopResponse.getRetCode()) ? str : mtopResponse.getRetCode();
                    if (!StringUtils.isEmpty(mtopResponse.getRetMsg())) {
                        str = mtopResponse.getRetMsg();
                    }
                    if (e.this.c != null) {
                        e.this.c.a(retCode, str);
                    }
                    dsm.a(false, mtopResponse, String.format("onSystemError: errCode - %s, errorMsg - %s", retCode, str));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    if (e.this.c != null) {
                        e.this.c.a("responseError", "mtopResponse is null");
                    }
                    dsm.a(false, mtopResponse, "onSuccess: mtopResponse is null");
                } else {
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        if (bytedata == null) {
                            if (e.this.c != null) {
                                e.this.c.a("responseError", "byteData is null");
                            }
                            dsm.a(false, mtopResponse, "onSuccess: byteData is null");
                            return;
                        }
                        JSONObject parseObject = JSONObject.parseObject(new String(bytedata));
                        if (e.this.c != null) {
                            e.this.c.a(parseObject);
                        }
                        dsm.a(true, mtopResponse, "onSuccess!");
                    } catch (Exception e) {
                        if (e.this.c != null) {
                            e.this.c.a("responseError", e.toString());
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
                    if (e.this.c != null) {
                        e.this.c.a("responseError", "mtopResponse is null");
                    }
                    dsm.a(false, mtopResponse, "onError: mtopResponse is null");
                } else {
                    String str = "unknown";
                    String retCode = StringUtils.isEmpty(mtopResponse.getRetCode()) ? str : mtopResponse.getRetCode();
                    if (!StringUtils.isEmpty(mtopResponse.getRetMsg())) {
                        str = mtopResponse.getRetMsg();
                    }
                    if (e.this.c != null) {
                        e.this.c.a(retCode, str);
                    }
                    dsm.a(false, mtopResponse, String.format("onError: errCode - %s, errorMsg - %s", retCode, str));
                }
            }
        });
        this.c = a.g(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.startRequest();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        MessageQueue messageQueue = null;
        try {
            messageQueue = Looper.myQueue();
        } catch (Exception e) {
            UnifyLog.d("UltronWeex2DataPrefetchRequest.requestIdle", e.toString());
        }
        if (messageQueue == null) {
            UnifyLog.d("UltronWeex2DataPrefetchRequest.requestIdle", "messageQueue is null");
        } else {
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.alibaba.android.ultron.vfw.weex2.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    e.this.a();
                    return false;
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2763a;
        private String b;
        private Map<String, String> c;
        private String d = "get";
        private boolean e = false;
        private String f = "UNIT_TRADE";
        private b g;

        static {
            kge.a(1103248936);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bccdd76b", new Object[]{aVar}) : aVar.f2763a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b2edb4a", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e80a5c4c", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("37f0e308", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7c3fadd", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b2eac6", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ b g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("37f89127", new Object[]{aVar}) : aVar.g;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("259eaa11", new Object[]{this, str});
            }
            this.f2763a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a3ffadf0", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("552c4886", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2260b1cf", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("83750c17", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a0c1b5ae", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8476ca4f", new Object[]{this, bVar});
            }
            this.g = bVar;
            return this;
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("2df3e6f8", new Object[]{this});
            }
            if (!b()) {
                UnifyLog.d("UltronWeex2DataPrefetchRequest.Builder", "build:args is invalid");
                return null;
            }
            return new e(this);
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f2763a) && !StringUtils.isEmpty(this.b);
        }
    }
}
