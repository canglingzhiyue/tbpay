package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.ceg;
import tb.dkt;
import tb.dlh;
import tb.dll;
import tb.dlr;
import tb.kge;
import tb.rul;
import tb.ruw;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(692168198);
    }

    public static /* synthetic */ MtopRequest a(String str, String str2, Map map, boolean z, boolean z2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("e38982e1", new Object[]{str, str2, map, new Boolean(z), new Boolean(z2), new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return a(str, str2, map, z, z2);
    }

    public static final MtopRequest a(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("828ba2f4", new Object[]{str, str2, map, new Boolean(z), new Boolean(z2)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.dataParams = map;
        mtopRequest.setNeedSession(z);
        mtopRequest.setNeedEcode(z2);
        if (map != null) {
            mtopRequest.setData(JSONObject.toJSONString(map));
        }
        return mtopRequest;
    }

    public static /* synthetic */ MtopBusiness a(Context context, MtopRequest mtopRequest, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("e7aa1c9a", new Object[]{context, mtopRequest, str, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            str = "GET";
        }
        return a(context, mtopRequest, str);
    }

    public static final MtopBusiness a(Context context, MtopRequest request, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("3dfadbef", new Object[]{context, request, str});
        }
        q.d(context, "context");
        q.d(request, "request");
        MtopBusiness mo1305reqMethod = MtopBusiness.build(request, Mtop.instance(Mtop.Id.INNER, context).getMtopConfig().ttid).mo1305reqMethod(q.a((Object) str, (Object) "GET") ? MethodEnum.GET : MethodEnum.POST);
        q.b(mo1305reqMethod, "build(request, instance.mtopConfig.ttid)\n        .reqMethod(if (requestMethod == \"GET\") MethodEnum.GET else MethodEnum.POST)");
        return mo1305reqMethod;
    }

    public static /* synthetic */ void a(Context context, String str, String str2, Map map, rul rulVar, ruw ruwVar, boolean z, boolean z2, boolean z3, String str3, boolean z4, Map map2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b25a4", new Object[]{context, str, str2, map, rulVar, ruwVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str3, new Boolean(z4), map2, new Integer(i), obj});
        } else {
            a(context, str, str2, (i & 8) != 0 ? null : map, rulVar, ruwVar, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? "GET" : str3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? null : map2);
        }
    }

    public static final void a(Context context, String str, String str2, Map<String, String> map, final rul<? super JSONObject, t> rulVar, final ruw<? super Integer, ? super String, t> ruwVar, boolean z, boolean z2, boolean z3, String str3, boolean z4, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef3ae9b", new Object[]{context, str, str2, map, rulVar, ruwVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str3, new Boolean(z4), map2});
        } else if (context == null) {
        } else {
            MtopBusiness a2 = a(context, a(str, str2, map, z, z2), str3);
            if (z4) {
                a2.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
            }
            if (map2 != null) {
                a2.mo1297headers(map2);
            }
            a2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.newShop.ext.BizExtKt$sendMTopRequest$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(BizExtKt$sendMTopRequest$2 bizExtKt$sendMTopRequest$2, String str4, Object... objArr) {
                    int hashCode = str4.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode != 2057952281) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                    } else {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    rul<JSONObject, t> rulVar2 = rulVar;
                    if (rulVar2 == null) {
                        return;
                    }
                    rulVar2.mo2421invoke(d.a(mtopResponse == null ? null : mtopResponse.getBytedata()));
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    ruw<Integer, String, t> ruwVar2 = ruwVar;
                    if (ruwVar2 == null) {
                        return;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    String str4 = null;
                    JSONObject a3 = d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    if (a3 != null) {
                        str4 = a3.toString();
                    }
                    ruwVar2.mo2423invoke(valueOf, str4);
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    ruw<Integer, String, t> ruwVar2 = ruwVar;
                    if (ruwVar2 == null) {
                        return;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    String str4 = null;
                    JSONObject a3 = d.a(mtopResponse == null ? null : mtopResponse.getBytedata());
                    if (a3 != null) {
                        str4 = a3.toString();
                    }
                    ruwVar2.mo2423invoke(valueOf, str4);
                }
            });
            if (z3) {
                a2.mo1300prefetch(10000L, (MtopPrefetch.IPrefetchCallback) C0137a.INSTANCE).startRequest();
            } else {
                a2.startRequest();
            }
        }
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.a$a */
    /* loaded from: classes3.dex */
    public static final class C0137a implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0137a INSTANCE = new C0137a();

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public final void onPrefetch(String str, HashMap<String, String> p1) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, p1});
                return;
            }
            ceg.a aVar = ceg.Companion;
            StringBuilder sb = new StringBuilder();
            sb.append("on shop mtop prefetch callback : ");
            sb.append((Object) str);
            sb.append(", ");
            q.b(p1, "p1");
            sb.append((Object) b.b(p1));
            aVar.b(sb.toString());
        }
    }

    public static /* synthetic */ c a(String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("fec2e265", new Object[]{str, map, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            map = null;
        }
        return a(str, map);
    }

    public static final c a(String url, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("515374de", new Object[]{url, map});
        }
        q.d(url, "url");
        URLConnection openConnection = new URL(url).openConnection();
        if (openConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            q.b(inputStream, "inputStream");
            byte[] a2 = kotlin.io.a.a(inputStream);
            IOUtils.closeQuietly(inputStream);
            httpURLConnection.disconnect();
            return new c(responseCode, true, a2);
        }
        httpURLConnection.disconnect();
        return new c(responseCode, false, null);
    }

    public static final void a(Activity activity, JSONObject popParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d13476", new Object[]{activity, popParams});
            return;
        }
        q.d(activity, "activity");
        q.d(popParams, "popParams");
        dlr dlrVar = new dlr();
        dlrVar.a(activity);
        dlrVar.a(activity.getWindow().getDecorView());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "type", com.alibaba.triver.triver_shop.container.shopLoft.newStyle.c.actionShowWindVanePop);
        jSONObject2.put((JSONObject) "params", (String) popParams);
        new dkt().a(new dlh(jSONObject), dlrVar, (dll) null);
    }
}
