package com.alipay.zoloz.toyger.photinus;

import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes3.dex */
public class PhotinusUploadContentRepackager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] reserializePbBlob(byte[] bArr, String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4c34a8df", new Object[]{bArr, str, str2});
        }
        BioLog.e("ProtoBuf Re-serialization for Photinus is not implemented!!");
        return bArr;
    }

    public static byte[] reserializeJsonBlob(byte[] bArr, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5e3d0669", new Object[]{bArr, str, str2});
        }
        BioLog.e("JSON Re-serialization for Photinus is not implemented!!");
        return bArr;
    }
}
