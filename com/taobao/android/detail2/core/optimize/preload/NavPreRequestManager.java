package com.taobao.android.detail2.core.optimize.preload;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.net.prerequest.PreRequestParams;
import com.taobao.android.detail2.core.optimize.preload.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ctu;
import tb.fhi;
import tb.fis;
import tb.fjt;
import tb.fjx;
import tb.fjy;
import tb.fkr;
import tb.fkt;
import tb.fkw;
import tb.fkz;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class NavPreRequestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    private static NavPreRequestManager f;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, b> f11666a = new HashMap();

    /* loaded from: classes5.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void a(JSONObject jSONObject, String str);

        void a(String str);
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11671a = NavPreRequestManager.b;
        public int b = NavPreRequestManager.b;
        public boolean c;
        public JSONObject d;
        public JSONObject e;
        public a f;
        public com.taobao.android.detail2.core.optimize.preload.b g;
        public HandlerThread h;
        public fkz i;
        public fkz j;
        public boolean k;
        public boolean l;
        public String m;

        static {
            kge.a(1479930596);
        }
    }

    public static /* synthetic */ void a(NavPreRequestManager navPreRequestManager, b bVar, a.C0468a c0468a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3a664", new Object[]{navPreRequestManager, bVar, c0468a});
        } else {
            navPreRequestManager.a(bVar, c0468a);
        }
    }

    public static /* synthetic */ void a(NavPreRequestManager navPreRequestManager, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d304af4", new Object[]{navPreRequestManager, bVar, str});
        } else {
            navPreRequestManager.a(bVar, str);
        }
    }

    public static /* synthetic */ void a(NavPreRequestManager navPreRequestManager, b bVar, String str, a.C0468a c0468a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48225e2e", new Object[]{navPreRequestManager, bVar, str, c0468a});
        } else {
            navPreRequestManager.a(bVar, str, c0468a);
        }
    }

    public static /* synthetic */ void a(NavPreRequestManager navPreRequestManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a656cc6", new Object[]{navPreRequestManager, str, str2});
        } else {
            navPreRequestManager.a(str, str2);
        }
    }

    public static /* synthetic */ void b(NavPreRequestManager navPreRequestManager, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133c3235", new Object[]{navPreRequestManager, bVar, str});
        } else {
            navPreRequestManager.b(bVar, str);
        }
    }

    public static /* synthetic */ void b(NavPreRequestManager navPreRequestManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787196a5", new Object[]{navPreRequestManager, str, str2});
        } else {
            navPreRequestManager.b(str, str2);
        }
    }

    public static NavPreRequestManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavPreRequestManager) ipChange.ipc$dispatch("de909572", new Object[0]);
        }
        if (f == null) {
            f = new NavPreRequestManager();
        }
        return f;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f11666a.put(str, bVar);
        }
        if (bVar.h != null) {
            return;
        }
        bVar.h = new HandlerThread("NewDetailPreRealRequestCallbackThread");
        bVar.h.start();
    }

    public synchronized void a(Context context, Intent intent, fkr fkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79acbe20", new Object[]{this, context, intent, fkrVar});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "startAllRequestWhenNav, token: " + fkrVar.aq());
        if (fkrVar.r() != null && fkrVar.r().b(fkrVar.k().W)) {
            a(intent, fkrVar, fkrVar.aq());
        }
        if (fkrVar.r() != null && fkrVar.r().c(fkrVar.k().W)) {
            a(context, fkrVar.aq(), fkrVar, (fhi) null);
        }
    }

    public synchronized void a(Context context, fkr fkrVar, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb5518c", new Object[]{this, context, fkrVar, fhiVar});
            return;
        }
        if (fkrVar.r() != null && fkrVar.r().c(fkrVar.k().W)) {
            a(context, fkrVar.aq(), fkrVar, fhiVar);
        }
    }

    private void a(Context context, final String str, fkr fkrVar, fhi fhiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3954f56", new Object[]{this, context, str, fkrVar, fhiVar});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "startRealRequest, token: " + str);
        ctu.a("startRealRequest");
        final com.taobao.android.detail2.core.optimize.preload.b b2 = com.taobao.android.detail2.core.optimize.preload.a.b(fkrVar, fhiVar, false);
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f11666a.put(str, bVar);
        }
        if (bVar.k) {
            fjt.a(fjt.TAG_RENDER, "abandon startRealRequest, token: " + str);
            return;
        }
        bVar.g = b2;
        if (bVar.h == null) {
            bVar.h = new HandlerThread("NewDetailPreRealRequestCallbackThread");
            bVar.h.start();
        }
        fkz fkzVar = new fkz(context, b2.j, "NewNewDetailFirst", fkrVar.b().ad(), fkrVar.r().d(fkrVar.k().W));
        bVar.j = fkzVar;
        fkzVar.a(new Handler(bVar.h.getLooper()));
        fkzVar.a(new IRemoteBaseListener() { // from class: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    NavPreRequestManager.a(NavPreRequestManager.this, str, mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                fjt.a(fjt.TAG_RENDER, "onNavRealRequestMtopSuccess");
                final b bVar2 = NavPreRequestManager.this.f11666a.get(str);
                if (bVar2 == null) {
                    fjt.a(fjt.TAG_RENDER, "onNavRealRequestMtopSuccessStatusNUll");
                    return;
                }
                bVar2.c = true;
                final a.C0468a a2 = com.taobao.android.detail2.core.optimize.preload.a.a(mtopResponse, false, com.taobao.android.detail2.core.optimize.preload.a.a(false, bVar2.g), b2);
                fjt.a(fjt.TAG_RENDER, "onNavRealRequestMtopSuccessBeforeMainPost");
                ipa.N().post(new Runnable() { // from class: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NavPreRequestManager.a(NavPreRequestManager.this, bVar2, a2);
                        }
                    }
                });
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    NavPreRequestManager.a(NavPreRequestManager.this, str, mtopResponse.getRetMsg());
                }
            }
        });
        ctu.a("realClient.execute");
        fkzVar.a();
        bVar.b = c;
        ctu.a();
        ctu.a();
    }

    private void a(b bVar, a.C0468a c0468a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe773ee", new Object[]{this, bVar, c0468a});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "NavRequestNotifyRealDataSuccess");
        if (c0468a.f && c0468a.f11672a != null) {
            com.taobao.android.detail2.core.optimize.preload.a.a(c0468a.f11672a, bVar.g);
            bVar.b = e;
            bVar.d = c0468a.f11672a;
            bVar.m = c0468a.e;
            if (bVar.f == null) {
                return;
            }
            bVar.f.a(bVar.d, bVar.m);
            return;
        }
        a(bVar, c0468a.b);
    }

    private void a(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "handleRealDataFailed, token: " + str + ", msg: " + str2);
        final b bVar = this.f11666a.get(str);
        if (bVar == null) {
            return;
        }
        bVar.c = true;
        ipa.N().post(new Runnable() { // from class: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NavPreRequestManager.a(NavPreRequestManager.this, bVar, str2);
                }
            }
        });
    }

    private void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b119157e", new Object[]{this, bVar, str});
            return;
        }
        bVar.b = d;
        if (bVar.f == null) {
            return;
        }
        bVar.f.a(str);
    }

    private void a(Intent intent, fkr fkrVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2095f2", new Object[]{this, intent, fkrVar, str});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "startOpenImmedRequest : " + str);
        if (intent == null) {
            fjt.a(fjt.TAG_RENDER, "startOpenImmedRequest intent == null return : " + str);
            return;
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f11666a.put(str, bVar);
        }
        if (bVar.l) {
            fjt.a(fjt.TAG_RENDER, "startOpenImmedRequest isAbandon : " + str);
            return;
        }
        if (bVar.h == null) {
            bVar.h = new HandlerThread("NewDetailPreRealRequestCallbackThread");
            bVar.h.start();
        }
        PreRequestParams preRequestParams = new PreRequestParams();
        JSONArray a2 = a(intent);
        if (a2 == null) {
            fjt.a(fjt.TAG_RENDER, "nav阶段预请求batchparams为空，直接返回，不发起瞬开预请求:" + str);
            return;
        }
        preRequestParams.setBatchParams(a2);
        preRequestParams.setNewDetailChannel(fjx.a(intent.getData()));
        preRequestParams.setNavRequest(true);
        fkz fkzVar = new fkz(com.taobao.tao.navigation.a.b(), preRequestParams, "NewDetailPreloadNav", false, fkrVar.r().d(fkrVar.k().W));
        bVar.i = fkzVar;
        fkzVar.a(new Handler(bVar.h.getLooper()));
        fkzVar.a(new NavPreRequestOpenImmedListener(str, this.f11666a));
        fjt.a(fjt.TAG_RENDER, "startOpenImmedRequest调用,发起mtop调用" + str);
        fkzVar.a();
        bVar.f11671a = c;
    }

    /* loaded from: classes5.dex */
    public class NavPreRequestOpenImmedListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, b> mRequestMap;
        private String mToken;

        static {
            kge.a(899428224);
            kge.a(-525336021);
        }

        public static /* synthetic */ String access$400(NavPreRequestOpenImmedListener navPreRequestOpenImmedListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6a73bb6", new Object[]{navPreRequestOpenImmedListener}) : navPreRequestOpenImmedListener.mToken;
        }

        public NavPreRequestOpenImmedListener(String str, Map<String, b> map) {
            this.mToken = str;
            this.mRequestMap = map;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                NavPreRequestManager.b(NavPreRequestManager.this, this.mToken, mtopResponse.getRetMsg());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            final b bVar = this.mRequestMap.get(this.mToken);
            if (bVar == null || bVar.c) {
                return;
            }
            final a.C0468a a2 = com.taobao.android.detail2.core.optimize.preload.a.a(mtopResponse);
            ipa.N().post(new Runnable() { // from class: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.NavPreRequestOpenImmedListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NavPreRequestManager.a(NavPreRequestManager.this, bVar, NavPreRequestOpenImmedListener.access$400(NavPreRequestOpenImmedListener.this), a2);
                    }
                }
            });
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                NavPreRequestManager.b(NavPreRequestManager.this, this.mToken, mtopResponse.getRetMsg());
            }
        }
    }

    private void a(b bVar, String str, a.C0468a c0468a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c59d38", new Object[]{this, bVar, str, c0468a});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "notifyOpenImmedDataSuccess: " + str);
        bVar.f11671a = e;
        bVar.e = c0468a.f11672a;
        if (bVar.f == null) {
            return;
        }
        bVar.f.a(bVar.e);
    }

    private void b(String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        final b bVar = this.f11666a.get(str);
        if (bVar == null) {
            return;
        }
        ipa.N().post(new Runnable() { // from class: com.taobao.android.detail2.core.optimize.preload.NavPreRequestManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    NavPreRequestManager.b(NavPreRequestManager.this, bVar, str2);
                }
            }
        });
    }

    private void b(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919add5d", new Object[]{this, bVar, str});
        } else {
            bVar.f11671a = d;
        }
    }

    private JSONArray a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c60d9979", new Object[]{this, intent});
        }
        if (intent == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        String str = new fis().a(com.taobao.tao.navigation.a.b()).c;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> a2 = fkw.a(fjy.a(intent.getData()), fkt.GUIDE_PRELOAD_PARAMS_BLACKLIST, fkt.DEFAULT_GUIDE_PRELOAD_PARAMS_BLACKLIST);
        if (!StringUtils.isEmpty(str) && !"0".equals(str)) {
            a2.put(fkw.V, str);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("queryParams", (Object) a2);
        jSONObject.put("bizParams", (Object) jSONObject2);
        String a3 = fjy.a(intent);
        if (StringUtils.isEmpty(a3)) {
            fjt.a(fjt.TAG_RENDER, "nav阶段预请求构建id为空，直接返回");
            return null;
        }
        jSONObject.put("itemId", (Object) a3);
        jSONArray.add(jSONObject);
        return jSONArray;
    }

    public com.taobao.android.detail2.core.optimize.preload.b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.optimize.preload.b) ipChange.ipc$dispatch("19f938f9", new Object[]{this, str});
        }
        b bVar = this.f11666a.get(str);
        if (bVar != null) {
            return bVar.g;
        }
        return null;
    }

    public synchronized void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7004fcb", new Object[]{this, str, aVar});
            return;
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f11666a.put(str, bVar);
        }
        bVar.f = aVar;
        if (bVar.d != null) {
            if (bVar.f != null) {
                bVar.f.a(bVar.d, bVar.m);
            }
        } else if (bVar.e != null && bVar.f != null) {
            bVar.f.a(bVar.e);
        }
    }

    public synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            return;
        }
        if (bVar.h != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                fjt.a(fjt.TAG_RENDER, str + " NavPreRequestManager线程quitSafely");
                bVar.h.quitSafely();
            } else {
                fjt.a(fjt.TAG_RENDER, str + " NavPreRequestManager线程quit");
                bVar.h.quit();
            }
        }
        if (bVar.i != null) {
            bVar.i.b();
        }
        if (bVar.j != null) {
            bVar.j.b();
        }
        this.f11666a.remove(str);
    }

    public synchronized boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            return false;
        }
        return bVar.b != b;
    }

    public synchronized boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            return false;
        }
        return bVar.f11671a != b;
    }

    public synchronized void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f11666a.put(str, bVar);
        }
        bVar.k = true;
        if (bVar.j != null) {
            bVar.j.b();
        }
    }

    public synchronized void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        b bVar = this.f11666a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f11666a.put(str, bVar);
        }
        bVar.l = true;
        if (bVar.i != null) {
            bVar.i.b();
        }
    }

    static {
        kge.a(-675161721);
        b = 0;
        c = 1;
        d = 2;
        e = 3;
    }
}
