package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.MockResponse;
import mtopsdk.network.domain.NetworkStats;
import mtopsdk.network.domain.Request;
import mtopsdk.network.domain.b;
import mtopsdk.network.domain.c;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class rym implements ryn, ryo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean e;
    public static volatile boolean f;
    public static AtomicBoolean g;

    /* renamed from: a  reason: collision with root package name */
    public Request f33421a;
    public Context b;
    public volatile boolean c;
    public Future d;
    public String h;

    static {
        kge.a(2046926782);
        kge.a(-221744324);
        kge.a(-1946813053);
        g = new AtomicBoolean(false);
    }

    public rym(Request request, Context context) {
        this.f33421a = request;
        Request request2 = this.f33421a;
        if (request2 != null) {
            this.h = request2.e;
        }
        this.b = context;
        if (this.b == null || !g.compareAndSet(false, true)) {
            return;
        }
        f = MtopUtils.isApkDebug(this.b);
        e = MtopUtils.isAppOpenMock(this.b);
        String str = this.h;
        TBSdkLog.i("mtopsdk.AbstractCallImpl", str, "isDebugApk=" + f + ",isOpenMock=" + e);
    }

    @Override // tb.ryn
    public Request a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("fc82acfb", new Object[]{this}) : this.f33421a;
    }

    @Override // tb.ryn
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.AbstractCallImpl", "try to cancel call.");
        }
        this.c = true;
        Future future = this.d;
        if (future == null) {
            return;
        }
        future.cancel(true);
    }

    public MockResponse a(String str) {
        MockResponse mockResponse;
        Exception e2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MockResponse) ipChange.ipc$dispatch("3fc313e7", new Object[]{this, str});
        }
        if (str == null) {
            TBSdkLog.e("mtopsdk.AbstractCallImpl", this.h, "[getMockResponse] apiName is null!");
            return null;
        } else if (this.b == null) {
            TBSdkLog.e("mtopsdk.AbstractCallImpl", this.h, "[getMockResponse] mContext is null!");
            return null;
        } else {
            try {
                byte[] readFile = MtopUtils.readFile(this.b.getFilesDir().getCanonicalPath() + "/mock/deMock/" + str + ".json");
                if (readFile == null) {
                    return null;
                }
                try {
                    jSONObject = new JSONObject(new String(readFile));
                    mockResponse = new MockResponse();
                } catch (Exception e3) {
                    mockResponse = null;
                    e2 = e3;
                }
                try {
                    mockResponse.api = str;
                    String optString = jSONObject.optString("mock_body");
                    if (optString != null) {
                        mockResponse.byteData = optString.getBytes("utf-8");
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("response_header");
                    if (optJSONObject != null) {
                        mockResponse.headers = new HashMap();
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String string = optJSONObject.getString(next);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(string);
                            mockResponse.headers.put(next, arrayList);
                        }
                    }
                    String optString2 = jSONObject.optString("response_status");
                    if (optString2 == null) {
                        return mockResponse;
                    }
                    mockResponse.statusCode = Integer.parseInt(optString2);
                    return mockResponse;
                } catch (Exception e4) {
                    e2 = e4;
                    TBSdkLog.e("mtopsdk.AbstractCallImpl", this.h, "[getMockData] get MockData error.api=" + str, e2);
                    return mockResponse;
                }
            } catch (IOException e5) {
                TBSdkLog.e("mtopsdk.AbstractCallImpl", this.h, "[getMockResponse] parse ExternalFilesDir/mock/deMock/" + str + ".json filePath error.", e5);
                return null;
            }
        }
    }

    public b a(Request request, int i, String str, final Map<String, List<String>> map, final byte[] bArr, NetworkStats networkStats) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("727ea8a1", new Object[]{this, request, new Integer(i), str, map, bArr, networkStats}) : new b.a().a(request).a(i).a(str).a(map).a(new c() { // from class: tb.rym.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // mtopsdk.network.domain.c
            public InputStream b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (InputStream) ipChange2.ipc$dispatch("97efb06c", new Object[]{this});
                }
                return null;
            }

            @Override // mtopsdk.network.domain.c
            public long a() throws IOException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
                }
                byte[] bArr2 = bArr;
                if (bArr2 == null) {
                    return 0L;
                }
                return bArr2.length;
            }

            @Override // mtopsdk.network.domain.c
            public byte[] c() throws IOException {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (byte[]) ipChange2.ipc$dispatch("ab8ad2b3", new Object[]{this}) : bArr;
            }
        }).a(networkStats).a();
    }
}
