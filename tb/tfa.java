package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.android.nextrpc.stream.request.c;
import com.alibaba.android.nextrpc.stream.request.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class tfa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UltronRequestPrefetch";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f34064a;
    private static final Map<String, String> b;
    private static final Map<String, jns<Boolean, StreamNextRpcRequest>> c;
    private static final Map<String, tfc> d;
    private static final Map<String, d> e;
    private static final Map<String, Runnable> f;

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : b;
    }

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    public static /* synthetic */ void a(String str, jnq jnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa38dd5", new Object[]{str, jnqVar});
        } else {
            b(str, jnqVar);
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : e;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]) : f;
    }

    static {
        kge.a(-1609772165);
        f34064a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
        f = new ConcurrentHashMap();
    }

    private static void b(String str, jnq<tfc> jnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448c5616", new Object[]{str, jnqVar});
            return;
        }
        tfc tfcVar = d.get(str);
        if (tfcVar == null) {
            tfcVar = new tfc();
            d.put(str, tfcVar);
        }
        jnqVar.a(tfcVar);
    }

    public static void a(Context context, MtopBusiness mtopBusiness, String str, final d dVar, jns<Boolean, StreamNextRpcRequest> jnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0725345", new Object[]{context, mtopBusiness, str, dVar, jnsVar});
            return;
        }
        final String a2 = a(mtopBusiness);
        if (a2 == null) {
            jqg.a(TAG, "发起预请求失败#cacheKey为空");
            return;
        }
        b(a2);
        StreamNextRpcRequest streamNextRpcRequest = new StreamNextRpcRequest(mtopBusiness, mtopBusiness.mtopProp.connTimeout);
        c cVar = new c(context, str);
        c.put(a2, jnsVar);
        b.put(a2, "start");
        jqg.a(TAG, "发起预请求#", mtopBusiness.request.getApiName());
        String a3 = cVar.a(streamNextRpcRequest, new d() { // from class: tb.tfa.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.nextrpc.stream.request.d
            public void a(final StreamRemoteMainResponse streamRemoteMainResponse, final List<AttachedResponse> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("578d65d", new Object[]{this, streamRemoteMainResponse, list});
                    return;
                }
                d.this.a(streamRemoteMainResponse, list);
                tfa.a().put(a2, "success");
                final d dVar2 = (d) tfa.b().get(a2);
                if (dVar2 != null) {
                    jqg.b(tfa.TAG, "预请求返回成功#回调真实请求的回调");
                    jqh.a(new Runnable() { // from class: tb.tfa.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dVar2.a(streamRemoteMainResponse, list);
                            }
                        }
                    }, 0L);
                    return;
                }
                jqg.b(tfa.TAG, "预请求返回成功#先暂存数据，等待真实请求调用时使用");
                tfa.a(a2, new jnq<tfc>() { // from class: tb.tfa.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jnq
                    public void a(tfc tfcVar) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("527507", new Object[]{this, tfcVar});
                            return;
                        }
                        tfcVar.f34073a = streamRemoteMainResponse;
                        tfcVar.b = list;
                    }
                });
            }

            @Override // com.alibaba.android.nextrpc.stream.request.d
            public void a(StreamOtherResponse streamOtherResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4febbc13", new Object[]{this, streamOtherResponse});
                    return;
                }
                jqg.a(tfa.TAG, "预请求返回失败");
                d.this.a(streamOtherResponse);
                tfa.a().put(a2, "error");
                Runnable runnable = (Runnable) tfa.c().remove(a2);
                if (runnable == null) {
                    return;
                }
                jqg.b(tfa.TAG, "预请求副数据返回失败#回调真实请求的回调");
                runnable.run();
                tfa.a(a2);
            }

            @Override // com.alibaba.android.nextrpc.stream.request.d
            public void a(final List<AttachedResponse> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                    return;
                }
                d.this.a(list);
                final d dVar2 = (d) tfa.b().get(a2);
                if (dVar2 != null) {
                    jqg.b(tfa.TAG, "预请求副数据返回成功#回调真实请求的回调");
                    jqh.a(new Runnable() { // from class: tb.tfa.1.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dVar2.a(list);
                            }
                        }
                    }, 0L);
                    return;
                }
                jqg.b(tfa.TAG, "预请求副数据返回成功#先暂存数据，等待真实请求调用时使用");
                tfa.a(a2, new jnq<tfc>() { // from class: tb.tfa.1.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jnq
                    public void a(tfc tfcVar) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("527507", new Object[]{this, tfcVar});
                        } else if (tfcVar.c == null) {
                            tfcVar.c = new ArrayList(list);
                        } else {
                            tfcVar.c.addAll(list);
                        }
                    }
                });
            }

            @Override // com.alibaba.android.nextrpc.stream.request.d
            public void c(StreamOtherResponse streamOtherResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e3d8095", new Object[]{this, streamOtherResponse});
                    return;
                }
                jqg.b(tfa.TAG, "预请求结束");
                d.this.c(streamOtherResponse);
                String str2 = (String) tfa.a().get(a2);
                if ("success".equals(str2)) {
                    tfa.a().put(a2, "successFinish");
                } else if ("error".equals(str2)) {
                    tfa.a().put(a2, "errorFinish");
                }
                if (((d) tfa.b().get(a2)) == null) {
                    return;
                }
                tfa.a(a2);
            }
        });
        jpz.c(mtopBusiness.request);
        f34064a.put(a2, a3);
    }

    public static tfb a(StreamNextRpcRequest streamNextRpcRequest, final d dVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfb) ipChange.ipc$dispatch("33a5b7d1", new Object[]{streamNextRpcRequest, dVar, runnable});
        }
        String a2 = a(streamNextRpcRequest.getMtopBusiness());
        String remove = f34064a.remove(a2);
        String str = b.get(a2);
        jqg.b(TAG, "interceptRealRequest#start");
        if (a2 == null || TextUtils.isEmpty(remove) || TextUtils.isEmpty(str)) {
            return d();
        }
        jns<Boolean, StreamNextRpcRequest> jnsVar = c.get(a2);
        if (jnsVar == null) {
            return d();
        }
        Boolean a3 = jnsVar.a(streamNextRpcRequest);
        if (a3 == null || !a3.booleanValue()) {
            jqg.b(TAG, "真实请求#与预请求不是同一个请求，不能复用结果");
            return d();
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1543527237:
                if (str.equals("errorFinish")) {
                    c2 = 4;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 3;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 0;
                    break;
                }
                break;
            case 535194230:
                if (str.equals("successFinish")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            jqg.b(TAG, "真实请求#等待预请求");
            e.put(a2, dVar);
            f.put(a2, runnable);
            return new tfb(true, remove);
        } else if (c2 != 1 && c2 != 2) {
            if (c2 == 3 || c2 == 4) {
                b(a2);
                jqg.b(TAG, "真实请求#预请求失败，继续进行真实请求");
                return d();
            }
            b(a2);
            jqg.b(TAG, "真实请求#默认不拦截，继续进行真实请求");
            return new tfb(false, "");
        } else {
            final tfc tfcVar = d.get(a2);
            if ("successFinish".equals(str)) {
                jqg.b(TAG, "真实请求#预请求已经Finish");
                b(a2);
            } else if ("success".equals(str)) {
                e.put(a2, dVar);
            }
            if (tfcVar == null) {
                b(a2);
                return d();
            }
            final StreamRemoteMainResponse streamRemoteMainResponse = tfcVar.f34073a;
            if (streamRemoteMainResponse != null) {
                jqg.b(TAG, "真实请求#预请求已经成功，直接回调");
                tfcVar.f34073a = null;
                jqh.a(new Runnable() { // from class: tb.tfa.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            d.this.a(streamRemoteMainResponse, tfcVar.b);
                        }
                    }
                }, 0L);
            }
            final List<AttachedResponse> list = tfcVar.c;
            if (list != null) {
                tfcVar.c = null;
                jqh.a(new Runnable() { // from class: tb.tfa.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            d.this.a(list);
                        }
                    }
                }, 0L);
            }
            return new tfb(true, remove);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            b(a(str, str2));
        }
    }

    private static tfb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfb) ipChange.ipc$dispatch("261fdb0b", new Object[0]);
        }
        jqg.b(TAG, "interceptRealRequest#不拦截");
        return new tfb(false, "");
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        f34064a.remove(str);
        c.remove(str);
        b.remove(str);
        e.remove(str);
        d.remove(str);
        f.remove(str);
        jqg.a(TAG, "clear#", str);
    }

    private static String a(MtopBusiness mtopBusiness) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a13eac1a", new Object[]{mtopBusiness});
        }
        if (mtopBusiness.mtopProp == null || (str = mtopBusiness.mtopProp.bizIdStr) == null) {
            return null;
        }
        if (mtopBusiness.request == null) {
            jqg.a(TAG, "request of request is null");
            return null;
        }
        String apiName = mtopBusiness.request.getApiName();
        if (apiName == null) {
            jqg.a(TAG, "api name of request is null");
            return null;
        }
        return a(str, apiName);
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return Login.getUserId() + str + str2;
    }
}
