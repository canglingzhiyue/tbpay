package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.performance.k;
import com.taobao.android.detail.core.request.MtopRequestListener;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.detail.core.utils.o;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.domain.MtopRequest;
import tb.dyo;
import tb.ecg;
import tb.eip;
import tb.emu;
import tb.epu;
import tb.eqc;
import tb.fef;
import tb.fgq;
import tb.god;
import tb.kge;
import tb.smx;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f11361a;
    private static boolean c;
    private Context b;
    private MainRequestParams d;
    private RemoteBusiness e;
    private WeakReference<MtopRequestListener<String>> f;
    private String g;
    private boolean h;
    private MtopRequestCallback i;
    private boolean j;
    private String k;

    /* loaded from: classes5.dex */
    public interface a {
        void a(Context context, MainRequestParams mainRequestParams, String str, MtopRequestListener<String> mtopRequestListener, String str2);
    }

    static {
        kge.a(-701702084);
        f11361a = i.a("NewMainRequestClientWrapper", BTags.MainRequestTag);
        c = true;
    }

    public d(Context context, MainRequestParams mainRequestParams, String str, MtopRequestListener<String> mtopRequestListener) {
        this.b = context;
        this.d = mainRequestParams;
        this.g = str;
        this.f = new WeakReference<>(mtopRequestListener);
        this.e = a(this.d, this.g);
        a(this.b, this.e);
        com.taobao.android.detail.sdk.utils.a.a();
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.NewMainRequestClientWrapper");
    }

    private RemoteBusiness a(MainRequestParams mainRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("e2faf2fe", new Object[]{this, mainRequestParams, str});
        }
        MtopRequest mtopRequest = new MtopRequest();
        boolean a2 = c.a(mainRequestParams);
        this.j = c.d(mainRequestParams);
        this.k = c.b(mainRequestParams);
        HashMap<String, String> map = mainRequestParams.toMap();
        map.remove("itemNumId");
        map.put("id", map.get("itemNumId"));
        mtopRequest.setData(JSONObject.toJSONString(map));
        mtopRequest.setApiName(smx.API_NAME);
        mtopRequest.setVersion("1.0");
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str);
        build.mo1310setBizTopic("dataEngine");
        this.h = b();
        this.i = this.h ? new PrefetchMtopRequestCallback(this.b, mainRequestParams, build, this.g, this.f, this.k) : new MainMtopRequestCallback(this.b, mainRequestParams, build, this.g, this.f, this.k);
        if (eip.j && (this.h || a2)) {
            if (Debuggable.isDebug() && eip.s) {
                HashMap hashMap = new HashMap();
                hashMap.put("x-nw-retry", "true");
                build.mo1297headers((Map<String, String>) hashMap);
            }
            build.streamMode(true);
            build.forbidStreamExceptionCallback(god.u);
            MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(map, this.k);
            mtopStreamRequestCallback.setMtopRequestCallback(this.i);
            build.registerListener((IMtopStreamListener) mtopStreamRequestCallback);
            String a3 = com.taobao.android.detail.core.performance.d.a(f11361a);
            com.taobao.android.detail.core.utils.i.c(a3, "注册分段流式请求回调，是否为预请求: " + this.h);
        } else {
            build.registeListener((IRemoteListener) this.i);
            String a4 = com.taobao.android.detail.core.performance.d.a(f11361a);
            com.taobao.android.detail.core.utils.i.c(a4, "注册非流式请求回调，是否为预请求: " + this.h);
        }
        build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_TRADE.toString());
        build.allowParseJson(false);
        if (eip.K) {
            build.mo1330supportStreamJson(true);
            com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.d.a(f11361a), "data.get接口使用流式解析");
        }
        if (c) {
            build.mo1340setBizId(9999);
        } else {
            build.mo1340setBizId(9998);
        }
        if (eip.q) {
            build.mo1296handler(fgq.a().c());
        }
        c = false;
        return build;
    }

    public MtopRequestCallback h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopRequestCallback) ipChange.ipc$dispatch("52b4ee80", new Object[]{this}) : this.i;
    }

    private boolean b() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        MainRequestParams mainRequestParams = this.d;
        if (mainRequestParams == null || (map = mainRequestParams.mExParams) == null) {
            return false;
        }
        return eip.c && map.containsKey(com.taobao.android.detail.wrapper.nav.a.DETAIL_NAV_PREFETCH);
    }

    private void a(Context context, RemoteBusiness remoteBusiness) {
        Map<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b4c80", new Object[]{this, context, remoteBusiness});
            return;
        }
        com.alibaba.android.spindle.stage.b a2 = com.taobao.android.detail.core.perf.b.a(context);
        if (a2 == null || (b = a2.b("ProductDetail_FirstScreen")) == null || b.size() <= 0) {
            return;
        }
        remoteBusiness.mo1317setOpenTracingContext(b);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1469620c", new Object[]{this, aVar});
        } else {
            this.i.setOnDowngrade(aVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.h) {
            c();
        } else {
            d();
        }
        g();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fef.b a2 = fef.a(this.i.mRequestID);
        if (a2 == null) {
            com.taobao.android.detail.core.utils.i.a(k.a(f11361a), "prefetchInfo is null, won't execute prefetch request");
            return;
        }
        fef.a aVar = a2.f27850a;
        if (aVar != null && StringUtils.equals(aVar.f27849a, com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE)) {
            fef.b(this.i.mRequestID);
            ecg.c(this.b);
            com.taobao.android.detail.core.utils.i.c(k.a(f11361a), "main request has executed, won't execute prefetch request, clear prefetchInfo");
            return;
        }
        fef.c cVar = a2.b;
        if (cVar == null) {
            com.taobao.android.detail.core.utils.i.a(k.a(f11361a), "prefetchRequest is null");
        } else if (StringUtils.equals(cVar.d, BaseFBPlugin.VERIFY_STATUS.abort)) {
            fef.b(this.i.mRequestID);
            com.taobao.android.detail.core.utils.i.c(k.a(f11361a), "prefetchRequest is aborted, clear prefetchInfo");
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            ApiID asyncRequest = this.e.asyncRequest();
            cVar.g = uptimeMillis - f();
            cVar.d = com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE;
            cVar.f27851a = asyncRequest;
            o.b(this.i.mIntentFlag, uptimeMillis);
            com.taobao.android.detail.core.utils.i.c(k.a(f11361a), "execute prefetch request");
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (e()) {
        } else {
            if (!god.r && eip.j) {
                dyo.a(this.k);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            this.e.asyncRequest();
            o.b(this.i.mIntentFlag, uptimeMillis);
            Context context = this.b;
            if (!(context instanceof DetailCoreActivity)) {
                return;
            }
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) context;
            if (detailCoreActivity.f9411a == null) {
                return;
            }
            h.k(detailCoreActivity, uptimeMillis - detailCoreActivity.f9411a.w);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.j && eip.c) {
            if (this.i.hitPrefetch()) {
                com.taobao.android.detail.core.utils.i.c(k.a(f11361a), "hit prefetch request");
                return true;
            }
            fef.b a2 = fef.a(this.i.mRequestID);
            if (a2 == null) {
                com.taobao.android.detail.core.utils.i.a(k.a(f11361a), "prefetchInfo is null");
                return false;
            }
            fef.a aVar = a2.f27850a;
            if (aVar == null) {
                com.taobao.android.detail.core.utils.i.a(k.a(f11361a), "mainRequest is null");
                return false;
            }
            aVar.f27849a = com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE;
            com.taobao.android.detail.core.utils.i.c(k.a(f11361a), "hit prefetch request failed, execute main request");
        }
        return false;
    }

    private long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue();
        }
        try {
            return Long.parseLong(this.i.mRequestID);
        } catch (Exception e) {
            String a2 = k.a(f11361a);
            com.taobao.android.detail.core.utils.i.a(a2, "getNavStartTime parseLong exception: " + e);
            return 0L;
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        n.b("newRemoteBusiness");
        ecg.b(this.b, smx.API_NAME, "1.0", this.e.request.getData(), (Map<String, Object>) null);
        eqc.a(this.b, "mMtop", "主接口Mtop时间");
        epu.a();
    }
}
