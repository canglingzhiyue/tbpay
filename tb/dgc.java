package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.api.AbsServiceImpl;
import com.taobao.alimama.c;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import com.taobao.alimama.sdk.common.CommonService;
import com.taobao.alimama.utils.e;

/* loaded from: classes4.dex */
public class dgc extends AbsServiceImpl implements CommonService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1591378850);
        kge.a(-1955676393);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str});
        }
        String handleAdUrl = handleAdUrl(str, true);
        e.a("common_handler_url", "original_uri=" + str, "new_url=" + handleAdUrl);
        return handleAdUrl;
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1536da1", new Object[]{this, str, new Boolean(z)}) : handleAdUrl(str, z, false);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrl(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc586b6b", new Object[]{this, str, new Boolean(z), new Boolean(z2)}) : c.a().a(str, z, z2);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public IfsBuilder buildIfsExposure(Application application, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IfsBuilder) ipChange.ipc$dispatch("8d94aa9b", new Object[]{this, application, str}) : new IfsBuilder(application, str);
    }

    @Override // com.taobao.alimama.sdk.common.CommonService
    public String handleAdUrlForClickId(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e978c67b", new Object[]{this, str, new Boolean(z)}) : c.a().a(str, z);
    }
}
