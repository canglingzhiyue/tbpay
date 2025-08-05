package com.alipay.android.msp.framework.helper;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class FileResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f4781a;
    private int b;
    private Map<String, String> c;

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : this.b == 200;
    }

    public byte[] getRespBody() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("7ef8532e", new Object[]{this}) : this.f4781a;
    }

    public void setRespBody(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281ed4a2", new Object[]{this, bArr});
        } else {
            this.f4781a = bArr;
        }
    }

    public int getRespCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f742f64d", new Object[]{this})).intValue() : this.b;
    }

    public void setRespCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83f2ae5d", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public Map<String, String> getRespHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9dc14edc", new Object[]{this}) : this.c;
    }

    public void setRespHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84703ca", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }
}
