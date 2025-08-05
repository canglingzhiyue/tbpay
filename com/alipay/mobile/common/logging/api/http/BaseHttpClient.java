package com.alipay.mobile.common.logging.api.http;

import android.content.Context;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.apache.http.HttpResponse;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public abstract class BaseHttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract void closeStreamForNextExecute();

    public abstract long getRequestLength();

    public abstract int getResponseCode();

    public abstract String getResponseContent();

    public abstract long getResponseLength();

    public abstract void setContext(Context context);

    public abstract void setUrl(String str);

    public abstract HttpResponse synchronousRequestByGET(Map<String, String> map);

    public abstract HttpResponse synchronousRequestByPOST(byte[] bArr, Map<String, String> map);

    public BaseHttpClient(String str, Context context) {
    }

    public BaseHttpClient() {
    }
}
