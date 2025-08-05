package com.alipay.mobile.common.logging.api.rpc;

import android.os.Bundle;
import com.alipay.mobile.framework.MpaasClassInfo;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public interface RpcClient {
    LogRpcResult uploadLog(RpcLogRequestParam rpcLogRequestParam, String str, Bundle bundle);
}
