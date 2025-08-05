package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.a;
import tb.osz;

/* loaded from: classes8.dex */
public class osq implements osz.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private otc f32378a;

    static {
        kge.a(18353920);
        kge.a(-2057357945);
    }

    public osq(otc otcVar) {
        this.f32378a = otcVar;
    }

    @Override // tb.osz.a
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
        } else {
            this.f32378a.a(str, awesomeGetRequestParams, str2, z);
        }
    }

    @Override // tb.osz.a
    public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
        } else {
            this.f32378a.a(str, str2, awesomeGetData, z);
        }
    }

    @Override // tb.osz.a
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            this.f32378a.a(str, str2, str3);
        }
    }

    @Override // tb.osz.b
    public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1acb7ed", new Object[]{this, str, awesomeGetRequestParams, aVar});
        } else {
            this.f32378a.a(str, awesomeGetRequestParams, aVar);
        }
    }
}
