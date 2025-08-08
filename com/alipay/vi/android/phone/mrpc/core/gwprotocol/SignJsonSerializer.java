package com.alipay.vi.android.phone.mrpc.core.gwprotocol;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.vi.android.phone.mrpc.core.Config;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes3.dex */
public class SignJsonSerializer implements Serializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_KEY_DEBUG = "rpc-sdk";
    public static final String APP_KEY_ONLINE = "rpc-sdk-online";

    /* renamed from: a  reason: collision with root package name */
    private JsonSerializer f6212a;
    private Context b;
    private Config c;
    private long d = -1;

    @Override // com.alipay.vi.android.phone.mrpc.core.gwprotocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        }
    }

    public SignJsonSerializer(JsonSerializer jsonSerializer, Context context, Config config) {
        this.f6212a = jsonSerializer;
        this.b = context;
        this.c = config;
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.gwprotocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        this.f6212a.buildNameValuePairs(arrayList);
        a(arrayList);
        return this.f6212a.nvpairs2Bytes(arrayList);
    }

    private void a(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        list.add(new BasicNameValuePair("ts", String.valueOf(getSignTimestamp())));
        Collections.sort(list, new Comparator<BasicNameValuePair>() { // from class: com.alipay.vi.android.phone.mrpc.core.gwprotocol.SignJsonSerializer.1
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
        StringBuilder sb = new StringBuilder();
        for (BasicNameValuePair basicNameValuePair : list) {
            sb.append(basicNameValuePair.getName());
            sb.append("=");
            sb.append(basicNameValuePair.getValue());
            sb.append("&");
        }
        Config config = this.c;
        String sign = config.sign(this.b, config.getAppKey(), sb.deleteCharAt(sb.length() - 1).toString());
        if (StringUtils.isEmpty(sign)) {
            return;
        }
        list.add(new BasicNameValuePair("sign", sign));
    }

    public long getSignTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f263071e", new Object[]{this})).longValue();
        }
        long j = this.d;
        if (j != -1) {
            return j;
        }
        this.d = System.currentTimeMillis();
        return this.d;
    }

    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("315012", new Object[]{this}) : this.f6212a.getRequestDataDigest();
    }
}
