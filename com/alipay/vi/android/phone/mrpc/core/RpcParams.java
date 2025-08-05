package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import org.apache.http.Header;

/* loaded from: classes3.dex */
public class RpcParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6209a;
    private List<Header> b;
    private boolean c;

    public String getGwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be62e1f0", new Object[]{this}) : this.f6209a;
    }

    public void setGwUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1f1ee", new Object[]{this, str});
        } else {
            this.f6209a = str;
        }
    }

    public List<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("19344190", new Object[]{this}) : this.b;
    }

    public void setHeaders(List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f026123c", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public boolean isGzip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b75982f", new Object[]{this})).booleanValue() : this.c;
    }

    public void setGzip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c20fd1", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
