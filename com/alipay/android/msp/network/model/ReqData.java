package com.alipay.android.msp.network.model;

import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class ReqData<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f4935a = Utils.randomUuid().toString();
    public int mBizId;
    public final T mData;
    public List<Header> mHeaders;
    public String mMspParam;

    public ReqData(T t) {
        this.mData = t;
    }

    public byte[] toBytesData() throws ClassCastException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("7a0266fc", new Object[]{this}) : (byte[]) this.mData;
    }

    public Map<String, String> toMapData() throws ClassCastException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("91ac5de7", new Object[]{this}) : (Map) this.mData;
    }

    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
            return;
        }
        if (this.mHeaders == null) {
            this.mHeaders = new ArrayList();
        }
        this.mHeaders.add(new BasicHeader(str, str2));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<ReqData %s>", this.f4935a);
    }

    public String getReqUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9794996", new Object[]{this}) : this.f4935a;
    }

    public long getLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33609457", new Object[]{this})).longValue();
        }
        long j = 0;
        try {
            if (this.mData instanceof Map) {
                for (Map.Entry<String, String> entry : toMapData().entrySet()) {
                    String value = entry.getValue();
                    if (value != null) {
                        j += value.length();
                    }
                }
                return j;
            } else if (this.mData instanceof byte[]) {
                return toBytesData().length;
            } else {
                return 0L;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return 0L;
        }
    }
}
