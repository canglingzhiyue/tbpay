package com.taobao.android.detail.wrapper.ext.request.client.search;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.detail.core.async.TBAsyncTask;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.wrapper.ext.request.client.a;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecg;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class SearchInfoApiRequestClient extends com.taobao.android.detail.wrapper.ext.request.client.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<MtopRequestListener<a>> d;

    static {
        kge.a(467065966);
    }

    public static /* synthetic */ Object ipc$super(SearchInfoApiRequestClient searchInfoApiRequestClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Map a(SearchInfoApiRequestClient searchInfoApiRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4e8b095e", new Object[]{searchInfoApiRequestClient}) : searchInfoApiRequestClient.b;
    }

    public static /* synthetic */ Context b(SearchInfoApiRequestClient searchInfoApiRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("58ab6062", new Object[]{searchInfoApiRequestClient}) : searchInfoApiRequestClient.f11353a;
    }

    public static /* synthetic */ Context c(SearchInfoApiRequestClient searchInfoApiRequestClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a55989e3", new Object[]{searchInfoApiRequestClient}) : searchInfoApiRequestClient.f11353a;
    }

    public SearchInfoApiRequestClient(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoApiRequestClient");
    }

    public void a(String str, MtopRequestListener<a> mtopRequestListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe2646b", new Object[]{this, str, mtopRequestListener});
            return;
        }
        a(a(str));
        this.d = new WeakReference<>(mtopRequestListener);
        a(new MtopCallback());
    }

    private a.C0446a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.C0446a) ipChange.ipc$dispatch("f3eb10a4", new Object[]{this, str});
        }
        RequestModel.Params params = new RequestModel.Params();
        params.itemId = str;
        params.utdid = UTDevice.getUtdid(this.f11353a);
        params.userId = epo.g().e();
        params.nick = epo.g().d();
        params.ttid = epo.f();
        RequestModel requestModel = new RequestModel();
        requestModel.appId = "35522";
        requestModel.params = params;
        a.C0446a c0446a = new a.C0446a();
        c0446a.f11354a = "mtop.relationrecommend.wirelessrecommend.recommend";
        c0446a.b = "2.0";
        c0446a.c = "post";
        c0446a.d = "GUIDE";
        c0446a.h = JSON.toJSONString(requestModel);
        return c0446a;
    }

    /* loaded from: classes5.dex */
    public class MtopCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(207032003);
            kge.a(-525336021);
        }

        private MtopCallback() {
        }

        public static /* synthetic */ boolean access$100(MtopCallback mtopCallback, boolean z, a aVar, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbdcb1db", new Object[]{mtopCallback, new Boolean(z), aVar, mtopResponse})).booleanValue() : mtopCallback.callListener(z, aVar, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                new TBAsyncTask<Object, Object, a>() { // from class: com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoApiRequestClient.MtopCallback.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == -1507519932) {
                            super.a((AnonymousClass1) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoApiRequestClient$a] */
                    @Override // com.taobao.android.detail.core.async.TBAsyncTask
                    public /* synthetic */ a a(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("32c10c89", new Object[]{this, objArr}) : c(objArr);
                    }

                    public a c(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (a) ipChange2.ipc$dispatch("ac904313", new Object[]{this, objArr}) : a.a(mtopResponse);
                    }

                    @Override // com.taobao.android.detail.core.async.TBAsyncTask
                    public void a(a aVar) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3b50a4cc", new Object[]{this, aVar});
                            return;
                        }
                        super.a((AnonymousClass1) aVar);
                        if (aVar == null) {
                            z = false;
                        }
                        MtopCallback.access$100(MtopCallback.this, z, aVar, mtopResponse);
                    }
                }.b(new Object[0]);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            callListener(false, null, mtopResponse);
            reportMtopError(false, mtopResponse);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            callListener(false, null, mtopResponse);
            reportMtopError(true, mtopResponse);
        }

        private boolean callListener(boolean z, a aVar, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            boolean z2 = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a56e7be8", new Object[]{this, new Boolean(z), aVar, mtopResponse})).booleanValue();
            }
            MtopRequestListener<a> mtopRequestListener = SearchInfoApiRequestClient.this.d.get();
            if (mtopRequestListener == null) {
                return false;
            }
            if (z && aVar != null) {
                z2 = true;
            }
            if (z2) {
                mtopRequestListener.b(aVar);
            } else {
                mtopRequestListener.a(mtopResponse);
            }
            return true;
        }

        private void reportMtopError(boolean z, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6709be6", new Object[]{this, new Boolean(z), mtopResponse});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("requestParam", SearchInfoApiRequestClient.a(SearchInfoApiRequestClient.this));
            ecg.a(SearchInfoApiRequestClient.b(SearchInfoApiRequestClient.this), mtopResponse, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(InputFrame3.TYPE_RESPONSE, mtopResponse);
            ecg.c(SearchInfoApiRequestClient.c(SearchInfoApiRequestClient.this), "SearchTextRequest", z ? "searchtext_api_system_error" : "searchtext_api_request_error", z ? "searchtext_api_onSystemError" : "searchtext_api_onError", hashMap2);
        }
    }

    /* loaded from: classes5.dex */
    public static class RequestModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String appId;
        public Params params;

        /* loaded from: classes5.dex */
        public static class Params implements Serializable {
            public String itemId;
            public String nick;
            public String shopId;
            public String ttid;
            public String userId;
            public String utdid;

            static {
                kge.a(-10731942);
                kge.a(1028243835);
            }
        }

        static {
            kge.a(-681451920);
            kge.a(1028243835);
        }

        public String getParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this}) : JSONObject.toJSONString(this.params);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11365a;
        public String b;
        public String c;
        public List<String> d = new ArrayList();

        static {
            kge.a(-1448663555);
        }

        public static a a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5c041f2d", new Object[]{mtopResponse});
            }
            try {
                JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("searchInfo");
                JSONObject jSONObject3 = jSONObject.getJSONObject("searchInfoList");
                if (jSONObject3 != null) {
                    a aVar = new a();
                    aVar.b = jSONObject3.getString("url");
                    aVar.c = jSONObject3.getString("utParams");
                    aVar.f11365a = jSONObject2.getString("searchtext");
                    JSONArray jSONArray = jSONObject3.getJSONArray("searchtextList");
                    if (jSONArray != null) {
                        for (int i = 0; i < jSONArray.size(); i++) {
                            aVar.d.add(jSONArray.getString(i));
                        }
                    } else {
                        aVar.d = null;
                    }
                    return aVar;
                } else if (jSONObject2 == null) {
                    return null;
                } else {
                    a aVar2 = new a();
                    aVar2.b = jSONObject2.getString("url");
                    aVar2.c = jSONObject2.getString("utParams");
                    String string = jSONObject2.getString("searchtext");
                    aVar2.f11365a = string;
                    if (string != null) {
                        aVar2.d.add(string);
                    } else {
                        aVar2.d = null;
                    }
                    return aVar2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
