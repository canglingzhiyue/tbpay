package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.c;
import com.taobao.zcache.p;

/* loaded from: classes.dex */
public class nee extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1982495865);
    }

    public static /* synthetic */ Object ipc$super(nee neeVar, String str, Object... objArr) {
        if (str.hashCode() == -1342773960) {
            return super.a();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.pha.core.c
    public nge a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("7c72ddc8", new Object[]{this, str});
        }
        if (!p.a().b(str)) {
            return null;
        }
        aef zCacheResourceResponse = aeb.getZCacheResourceResponse(str);
        String str2 = zCacheResourceResponse.mimeType;
        String str3 = zCacheResourceResponse.encoding;
        if (zCacheResourceResponse.headers != null && zCacheResourceResponse.headers.containsKey("Content-Type")) {
            str2 = zCacheResourceResponse.headers.get("Content-Type");
            if ((str2 instanceof String) && str2.contains("text/html")) {
                str2 = "text/html";
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ngn.n(str);
        }
        if (TextUtils.isEmpty(zCacheResourceResponse.encoding)) {
            str3 = "UTF-8";
        }
        ngm ngmVar = new ngm(str2, str3, zCacheResourceResponse.inputStream);
        ngmVar.a(zCacheResourceResponse.headers);
        return ngmVar;
    }

    @Override // com.taobao.pha.core.c
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        nge a2 = a("//g.alicdn.com/pha/pha-bridge/pha_bridge..js");
        if (a2 != null && a2.e() != null) {
            return ngn.a(a2.e());
        }
        return super.a();
    }
}
