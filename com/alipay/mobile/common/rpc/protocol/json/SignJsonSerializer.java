package com.alipay.mobile.common.rpc.protocol.json;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.rpc.protocol.Serializer;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.RpcSignUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes3.dex */
public class SignJsonSerializer implements Serializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JsonSerializer f5507a;
    private Context b;
    private boolean c;
    private String d;
    private RpcSignUtil.SignData e;
    private InnerRpcInvokeContext f;
    private long g = -1;

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        }
    }

    public SignJsonSerializer(JsonSerializer jsonSerializer, Context context, String str, boolean z, InnerRpcInvokeContext innerRpcInvokeContext) {
        this.f5507a = jsonSerializer;
        this.b = context;
        this.c = z;
        this.d = str;
        this.f = innerRpcInvokeContext;
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        this.f5507a.buildNameValuePairs(arrayList);
        a(arrayList);
        return this.f5507a.nvpairs2Bytes(arrayList);
    }

    private void a(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        list.add(new BasicNameValuePair("ts", String.valueOf(getSignTimestamp())));
        b(list);
        StringBuilder sb = new StringBuilder();
        for (BasicNameValuePair basicNameValuePair : list) {
            sb.append(basicNameValuePair.getName());
            sb.append("=");
            sb.append(basicNameValuePair.getValue());
            sb.append("&");
        }
        this.e = RpcSignUtil.signature(this.b, this.d, this.c, sb.deleteCharAt(sb.length() - 1).toString(), MiscUtils.isAlipayGW(this.f.gwUrl));
        RpcSignUtil.SignData signData = this.e;
        if (signData == null || TextUtils.isEmpty(signData.sign)) {
            return;
        }
        list.add(new BasicNameValuePair("sign", this.e.sign));
    }

    private void b(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            Collections.sort(list, new Comparator<BasicNameValuePair>() { // from class: com.alipay.mobile.common.rpc.protocol.json.SignJsonSerializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public int compare(BasicNameValuePair basicNameValuePair, BasicNameValuePair basicNameValuePair2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("26b049a7", new Object[]{this, basicNameValuePair, basicNameValuePair2})).intValue();
                    }
                    try {
                        return basicNameValuePair.getName().compareTo(basicNameValuePair2.getName());
                    } catch (Exception unused) {
                        return 0;
                    }
                }
            });
        }
    }

    public long getSignTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f263071e", new Object[]{this})).longValue();
        }
        long j = this.g;
        if (j != -1) {
            return j;
        }
        this.g = System.currentTimeMillis();
        return this.g;
    }

    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("315012", new Object[]{this}) : this.f5507a.getRequestDataDigest();
    }

    public RpcSignUtil.SignData getSignData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcSignUtil.SignData) ipChange.ipc$dispatch("590f6efc", new Object[]{this}) : this.e;
    }
}
