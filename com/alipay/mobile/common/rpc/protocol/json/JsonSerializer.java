package com.alipay.mobile.common.rpc.protocol.json;

import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.mobile.common.rpc.protocol.AbstractSerializer;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: classes3.dex */
public class JsonSerializer extends AbstractSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "JsonSerializer";
    public static final String VERSION = "1.0.0";

    /* renamed from: a  reason: collision with root package name */
    private int f5506a;
    private Object b;
    public String mRequestDataJson;

    public void postPacket(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467f88c0", new Object[]{this, list});
        }
    }

    public void prePacket(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b35503", new Object[]{this, list});
        }
    }

    public JsonSerializer(int i, String str, Object obj) {
        super(str, obj);
        this.f5506a = i;
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        } else {
            this.b = obj;
        }
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        prePacket(arrayList);
        buildNameValuePairs(arrayList);
        postPacket(arrayList);
        return nvpairs2Bytes(arrayList);
    }

    public byte[] nvpairs2Bytes(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ccb1a3fb", new Object[]{this, list});
        }
        String format = URLEncodedUtils.format(list, "utf-8");
        StringBuilder sb = new StringBuilder();
        sb.append("request = ");
        sb.append(format == null ? "" : URLDecoder.decode(format));
        LogCatUtil.printInfo("JsonSerializer", sb.toString());
        return format.getBytes();
    }

    public void buildNameValuePairs(List<BasicNameValuePair> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b63dd9", new Object[]{this, list});
            return;
        }
        Object obj = this.b;
        if (obj != null) {
            list.add(new BasicNameValuePair("extParam", JSON.toJSONString(obj)));
        }
        list.add(new BasicNameValuePair("operationType", this.mOperationType));
        if (!StringUtils.isEmpty(this.scene)) {
            list.add(new BasicNameValuePair("scene", this.scene));
        }
        LogCatUtil.printInfo("JsonSerializer", "mParams = " + this.mParams + " scene = " + this.scene);
        list.add(buildReqDataNVPair());
    }

    public BasicNameValuePair buildReqDataNVPair() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasicNameValuePair) ipChange.ipc$dispatch("5fac3b37", new Object[]{this}) : new BasicNameValuePair("requestData", getRequestDataJson());
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.f5506a;
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.f5506a = i;
        }
    }

    public String getOperationType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this}) : this.mOperationType;
    }

    public String getRequestDataJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8af12ae", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.mRequestDataJson)) {
            return this.mRequestDataJson;
        }
        this.mRequestDataJson = this.mParams == null ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : JSON.toJSONString(this.mParams, SerializerFeature.DisableCircularReferenceDetect);
        return this.mRequestDataJson;
    }

    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315012", new Object[]{this});
        }
        try {
            return new String(Base64.encode(MessageDigest.getInstance("MD5").digest(getRequestDataJson().getBytes()), 0));
        } catch (Exception e) {
            LogCatUtil.warn("JsonSerializer", e);
            return "";
        }
    }
}
