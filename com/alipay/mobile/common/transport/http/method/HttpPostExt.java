package com.alipay.mobile.common.transport.http.method;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes3.dex */
public class HttpPostExt extends HttpPost {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5573a;

    public HttpPostExt(String str) {
        this.f5573a = str;
    }

    public HttpPostExt(URI uri, String str) {
        super(uri);
        this.f5573a = str;
    }

    public HttpPostExt(String str, String str2) {
        super(str);
        this.f5573a = str2;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.f5573a = str;
        }
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.f5573a;
    }
}
