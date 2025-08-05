package com.alipay.mobile.common.amnet.api.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ChannelType {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte CHANNLE_COMMON = 0;
    public static final byte CHANNLE_PUSH = 4;
    public static final byte CHANNLE_RPC = 1;
    public static final byte CHANNLE_SYNC = 2;
    public static final byte CHANNLE_SYNC_DIRECT = 3;

    public static boolean isPush(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("15975835", new Object[]{new Byte(b)})).booleanValue() : b == 4;
    }

    public static boolean isRpc(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e342b99e", new Object[]{new Byte(b)})).booleanValue() : b == 1;
    }

    public static boolean isSync(byte b) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60e1f554", new Object[]{new Byte(b)})).booleanValue() : b == 2;
    }
}
