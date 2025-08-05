package android.taobao.windvane.packageapp.zipapp.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.model.ZCacheResourceResponse;
import java.io.ByteArrayInputStream;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ZCacheResourceResponse zCacheResourceResponse = null;

    static {
        kge.a(740520032);
    }

    public ZCacheResourceResponse wrapZCacheResourceResponse(ResourceResponse resourceResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZCacheResourceResponse) ipChange.ipc$dispatch("fb919b40", new Object[]{this, resourceResponse});
        }
        this.zCacheResourceResponse = new ZCacheResourceResponse();
        if (resourceResponse == null) {
            ZCacheResourceResponse zCacheResourceResponse = this.zCacheResourceResponse;
            zCacheResourceResponse.isSuccess = false;
            zCacheResourceResponse.status = 0;
            zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_RESPONSE;
        } else {
            this.zCacheResourceResponse.headers = resourceResponse.getHeader();
            if (this.zCacheResourceResponse.headers != null && this.zCacheResourceResponse.headers.containsKey("X-ZCache-Info")) {
                ZCacheResourceResponse zCacheResourceResponse2 = this.zCacheResourceResponse;
                zCacheResourceResponse2.zcacheInfo = zCacheResourceResponse2.headers.get("X-ZCache-Info");
            } else {
                this.zCacheResourceResponse.zcacheInfo = ZCacheResourceResponse.ZCACHE_NO_HEADER;
            }
            if (resourceResponse.getError() == null && resourceResponse.getData() != null) {
                this.zCacheResourceResponse.inputStream = new ByteArrayInputStream(resourceResponse.getData());
                ZCacheResourceResponse zCacheResourceResponse3 = this.zCacheResourceResponse;
                zCacheResourceResponse3.isSuccess = true;
                zCacheResourceResponse3.status = 2;
            } else {
                ZCacheResourceResponse zCacheResourceResponse4 = this.zCacheResourceResponse;
                zCacheResourceResponse4.isSuccess = false;
                zCacheResourceResponse4.status = 1;
            }
        }
        return this.zCacheResourceResponse;
    }
}
