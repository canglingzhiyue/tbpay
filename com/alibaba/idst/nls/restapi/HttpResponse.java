package com.alibaba.idst.nls.restapi;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class HttpResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private byte[] audioBody;
    private String errorMessage;
    private int statusCode;

    static {
        kge.a(945038974);
    }

    public byte[] getAudioBody() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("43d8ca94", new Object[]{this}) : this.audioBody;
    }

    public void setAudioBody(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2d7b64", new Object[]{this, bArr});
        } else {
            this.audioBody = bArr;
        }
    }

    public int getStatusCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eae362ef", new Object[]{this})).intValue() : this.statusCode;
    }

    public void setStatusCode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86008fb", new Object[]{this, new Integer(i)});
        } else {
            this.statusCode = i;
        }
    }

    public String getErrorMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fedd06c4", new Object[]{this}) : this.errorMessage;
    }

    public void setErrorMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d624632", new Object[]{this, str});
        } else {
            this.errorMessage = str;
        }
    }
}
