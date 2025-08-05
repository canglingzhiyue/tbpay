package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

import com.alipay.literpc.android.phone.mrpc.core.RpcException;
import com.alipay.literpc.jsoncodec.JSONCodec;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes3.dex */
public class JsonSerializer extends AbstractSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VERSION = "1.0.0";
    private int c;
    private Object d;

    public JsonSerializer(int i, String str, Object obj) {
        super(str, obj);
        this.c = i;
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Serializer
    public byte[] packet() throws RpcException {
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", JSONCodec.toJSONString(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f5304a));
            arrayList.add(new BasicNameValuePair("id", this.c + str));
            String str2 = "mParams is:" + this.b;
            arrayList.add(new BasicNameValuePair("requestData", this.b == null ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : JSONCodec.toJSONString(this.b)));
            String format = URLEncodedUtils.format(arrayList, "utf-8");
            String str3 = "request = " + format;
            return format.getBytes();
        } catch (Exception e) {
            if (("request  =" + this.b + ":" + e) != null) {
                str = e.getMessage();
            }
            throw new RpcException(9, str, e);
        }
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.c;
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
