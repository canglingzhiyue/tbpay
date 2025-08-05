package com.alipay.mobile.common.transport;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Response {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mContentType;
    public byte[] mResData;

    public byte[] getResData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a83a0582", new Object[]{this}) : this.mResData;
    }

    public void setResData(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f36b36", new Object[]{this, bArr});
        } else {
            this.mResData = bArr;
        }
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this}) : this.mContentType;
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.mContentType = str;
        }
    }
}
