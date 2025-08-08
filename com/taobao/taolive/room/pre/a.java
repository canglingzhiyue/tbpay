package com.taobao.taolive.room.pre;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.utils.n;
import com.taobao.taolive.sdk.utils.q;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.ppq;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ISAFCCOLDCONTEXT_KEY = "isAfcColdContext_key";
    public static final String PRE_CREATE_ROOM_REC = "isPreCreateRoomRec";
    public static final String TAG = "PreRequestManager";

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, PreRequestInfo> f21672a;

    /* renamed from: com.taobao.taolive.room.pre.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0900a {
        public static final a INSTANCE;

        static {
            kge.a(-916792248);
            INSTANCE = new a();
        }
    }

    static {
        kge.a(2084224373);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f01b8464", new Object[0]) : C0900a.INSTANCE;
    }

    private a() {
        this.f21672a = new ConcurrentHashMap<>();
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("timemove_");
        sb.append(str);
        sb.append("_");
        if (str2 != null) {
            sb.append(str2);
        } else {
            sb.append(str3);
        }
        return sb.toString();
    }

    public void a(Intent intent, LiveDetailPreRequestParams liveDetailPreRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6dc16b9", new Object[]{this, intent, liveDetailPreRequestParams});
            return;
        }
        a(false, liveDetailPreRequestParams);
        n.b(TAG, "preStartRequestDetail feedId:" + liveDetailPreRequestParams.feedId);
    }

    public void a(LiveDetailPreRequestParams liveDetailPreRequestParams, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9098eda", new Object[]{this, liveDetailPreRequestParams, str, str2, str3});
            return;
        }
        String a2 = a(str, str2, str3);
        PreRequestInfo preRequestInfo = this.f21672a.get(a2);
        if (preRequestInfo == null || preRequestInfo.responseStatus == 2) {
            PreRequestInfo preRequestInfo2 = new PreRequestInfo();
            preRequestInfo2.tbLiveDataProvider = new TBLiveDataProvider();
            preRequestInfo2.params = liveDetailPreRequestParams;
            PreRequestImpl preRequestImpl = new PreRequestImpl();
            preRequestInfo2.preRequest = preRequestImpl;
            preRequestImpl.startRealRequest(preRequestInfo2);
            this.f21672a.put(a2, preRequestInfo2);
            return;
        }
        q.a(TAG, "已经存在对应看点的预请求，跳过");
    }

    public void a(LiveDetailPreRequestParams liveDetailPreRequestParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3eac4c6", new Object[]{this, liveDetailPreRequestParams, str});
            return;
        }
        PreRequestInfo preRequestInfo = new PreRequestInfo();
        preRequestInfo.tbLiveDataProvider = new TBLiveDataProvider();
        preRequestInfo.params = liveDetailPreRequestParams;
        PreRequestImpl preRequestImpl = new PreRequestImpl();
        preRequestInfo.preRequest = preRequestImpl;
        preRequestImpl.startRealRequest(preRequestInfo);
        ConcurrentHashMap<String, PreRequestInfo> concurrentHashMap = this.f21672a;
        concurrentHashMap.put(PRE_CREATE_ROOM_REC + str, preRequestInfo);
    }

    private void a(boolean z, LiveDetailPreRequestParams liveDetailPreRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82582d00", new Object[]{this, new Boolean(z), liveDetailPreRequestParams});
        } else if (liveDetailPreRequestParams == null) {
            n.b(TAG, "params null");
        } else if (!z && StringUtils.isEmpty(liveDetailPreRequestParams.feedId)) {
            n.b(TAG, "params feedid null");
        } else {
            PreRequestInfo preRequestInfo = new PreRequestInfo();
            preRequestInfo.tbLiveDataProvider = new TBLiveDataProvider();
            preRequestInfo.params = liveDetailPreRequestParams;
            PreRequestImpl preRequestImpl = new PreRequestImpl();
            preRequestInfo.preRequest = preRequestImpl;
            preRequestImpl.startRealRequest(preRequestInfo);
            this.f21672a.put(z ? ISAFCCOLDCONTEXT_KEY : liveDetailPreRequestParams.feedId, preRequestInfo);
            n.b(TAG, "startRequest feedId:" + liveDetailPreRequestParams.feedId);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.f21672a.clear();
        } catch (Exception unused) {
        }
    }

    public PreRequestInfo c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreRequestInfo) ipChange.ipc$dispatch("443f6c2b", new Object[]{this, str}) : this.f21672a.get(str);
    }

    public void a(String str, ppq.a aVar, TBLiveDataProvider.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bed232", new Object[]{this, str, aVar, bVar});
        } else if (StringUtils.isEmpty(str) || !this.f21672a.containsKey(str)) {
        } else {
            PreRequestInfo preRequestInfo = this.f21672a.get(str);
            if (preRequestInfo.preRequest == null) {
                return;
            }
            preRequestInfo.preRequest.setResponseListener(aVar, bVar);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || !this.f21672a.containsKey(str)) {
        } else {
            PreRequestInfo preRequestInfo = this.f21672a.get(str);
            if (preRequestInfo.preRequest != null) {
                preRequestInfo.preRequest.removeResponseListener();
            }
            this.f21672a.remove(str);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && this.f21672a.containsKey(str);
    }
}
