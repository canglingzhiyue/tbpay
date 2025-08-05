package com.alipay.vi.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HttpUrlResponse extends Response {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f6203a;
    private String b;
    private long c;
    private long d;
    private String e;
    private HttpUrlHeader f;

    public HttpUrlResponse(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f = httpUrlHeader;
        this.f6203a = i;
        this.b = str;
        this.mResData = bArr;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.f6203a;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.b;
    }

    public String getCharset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ca2bba3", new Object[]{this}) : this.e;
    }

    public void setCharset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb8419b", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public long getCreateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue() : this.c;
    }

    public void setCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33e2e12", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public long getPeriod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("516e9b2", new Object[]{this})).longValue() : this.d;
    }

    public void setPeriod(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c383a", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public HttpUrlHeader getHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUrlHeader) ipChange.ipc$dispatch("eb15da6", new Object[]{this}) : this.f;
    }

    public void setHeader(HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0599296", new Object[]{this, httpUrlHeader});
        } else {
            this.f = httpUrlHeader;
        }
    }
}
