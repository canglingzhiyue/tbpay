package com.ta.utdid2.android.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class IntUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-789797879);
    }

    public static byte[] getBytes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8f3337f6", new Object[]{new Integer(i)});
        }
        byte[] bArr = {(byte) ((r5 >> 8) % 256), (byte) (r5 % 256), (byte) (r5 % 256), (byte) (i % 256)};
        int i2 = i >> 8;
        int i3 = i2 >> 8;
        return bArr;
    }

    public static byte[] getBytes(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("af5417fd", new Object[]{bArr, new Integer(i)});
        }
        if (bArr.length != 4) {
            return null;
        }
        bArr[3] = (byte) (i % 256);
        int i2 = i >> 8;
        bArr[2] = (byte) (i2 % 256);
        int i3 = i2 >> 8;
        bArr[1] = (byte) (i3 % 256);
        bArr[0] = (byte) ((i3 >> 8) % 256);
        return bArr;
    }
}
