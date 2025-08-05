package com.ta.utdid2.android.utils;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Random;
import tb.kge;

/* loaded from: classes4.dex */
public class PhoneInfoUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean mPrivacyMode;
    private static boolean mSdcardPrivacyMode;

    @Deprecated
    public static String getImsi(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98b0848f", new Object[]{context}) : "";
    }

    static {
        kge.a(-849792100);
        mPrivacyMode = false;
        mSdcardPrivacyMode = true;
    }

    public static void setPrivacyMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854b8544", new Object[]{new Boolean(z)});
        } else {
            mPrivacyMode = z;
        }
    }

    public static boolean isPrivacyMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("496625cc", new Object[0])).booleanValue() : mPrivacyMode;
    }

    public static boolean isSdcardPrivacyMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5937762b", new Object[0])).booleanValue() : mSdcardPrivacyMode;
    }

    public static String getUniqueID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4faa1617", new Object[0]);
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] bytes = IntUtils.getBytes(currentTimeMillis);
        byte[] bytes2 = IntUtils.getBytes(nanoTime);
        byte[] bytes3 = IntUtils.getBytes(nextInt);
        byte[] bytes4 = IntUtils.getBytes(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return Base64.encodeToString(bArr, 2);
    }

    public static String getImei(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f9baa5d", new Object[]{context});
        }
        String str = null;
        if (StringUtils.isEmpty(null)) {
            str = getYunOSUuid();
        }
        return StringUtils.isEmpty(str) ? getUniqueID() : str;
    }

    private static String getYunOSUuid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c6c57e", new Object[0]);
        }
        String str = SystemProperties.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = SystemProperties.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? getYunOSTVUuid() : str;
    }

    private static String getYunOSTVUuid() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }
}
