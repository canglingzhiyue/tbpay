package com.alipay.android.msp.plugin;

import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import java.io.IOException;
import java.util.List;
import org.apache.http.Header;

/* loaded from: classes3.dex */
public interface ITransChannel {
    ResData<byte[]> requestData(ReqData<byte[]> reqData, RequestConfig requestConfig) throws Exception;

    ResData<byte[]> requestData(byte[] bArr, String str, String str2, List<Header> list, int i) throws IOException, NetErrorException;

    void shutdown();
}
