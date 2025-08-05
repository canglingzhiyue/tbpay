package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.network.impl.ResponseProtocolType;
import org.apache.http.Header;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes3.dex */
public class CachedResponseWrapper implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5549a;
    private byte[] b;
    private String c;
    private String d;

    public String getEtag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d2d124e", new Object[]{this}) : this.f5549a;
    }

    public void setEtag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf477e8", new Object[]{this, str});
        } else {
            this.f5549a = str;
        }
    }

    public byte[] getValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6535725b", new Object[]{this}) : this.b;
    }

    public void setValue(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f4a67d", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public Header getTypeHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header) ipChange.ipc$dispatch("f900aa83", new Object[]{this});
        }
        String str = this.c + ResponseProtocolType.COMMENT + this.d;
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return new BufferedHeader(charArrayBuffer);
    }

    public void setTypeHeader(Header header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76781981", new Object[]{this, header});
        } else if (header == null) {
        } else {
            this.c = header.getName();
            this.d = header.getValue();
        }
    }
}
