package com.alipay.zoloz.toyger.upload;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UploadContent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final byte[] content;
    public final byte[] contentSig;
    public final boolean isUTF8;

    public UploadContent(byte[] bArr, byte[] bArr2, boolean z) {
        this.content = bArr;
        this.contentSig = bArr2;
        this.isUTF8 = z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("UploadContent{content=");
        String str = "null";
        sb.append(this.content == null ? str : "***");
        sb.append(", contentSig=");
        if (this.contentSig != null) {
            str = "***";
        }
        sb.append(str);
        sb.append(", isUTF8=");
        sb.append(this.isUTF8);
        sb.append('}');
        return sb.toString();
    }
}
