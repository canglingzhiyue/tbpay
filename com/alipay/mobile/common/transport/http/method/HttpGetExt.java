package com.alipay.mobile.common.transport.http.method;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes3.dex */
public class HttpGetExt extends HttpGet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5572a;

    public HttpGetExt(String str) {
        this.f5572a = str;
    }

    public HttpGetExt(URI uri, String str) {
        super(uri);
        this.f5572a = str;
    }

    public HttpGetExt(String str, String str2) {
        super(str);
        this.f5572a = str2;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.f5572a = str;
        }
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.f5572a;
    }
}
