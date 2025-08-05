package com.alipay.literpc.android.phone.mrpc.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HttpUrlResponse extends Response {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;
    private String d;
    private long e;
    private long f;
    private String g;
    private HttpUrlHeader h;

    public HttpUrlResponse(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.h = httpUrlHeader;
        this.c = i;
        this.d = str;
        this.f5297a = bArr;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue() : this.c;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a817838e", new Object[]{this}) : this.d;
    }

    public String getCharset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ca2bba3", new Object[]{this}) : this.g;
    }

    public void setCharset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb8419b", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public long getCreateTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue() : this.e;
    }

    public void setCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33e2e12", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public long getPeriod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("516e9b2", new Object[]{this})).longValue() : this.f;
    }

    public void setPeriod(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c383a", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public HttpUrlHeader getHeader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUrlHeader) ipChange.ipc$dispatch("30d7d770", new Object[]{this}) : this.h;
    }

    public void setHeader(HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe8fd7a", new Object[]{this, httpUrlHeader});
        } else {
            this.h = httpUrlHeader;
        }
    }
}
