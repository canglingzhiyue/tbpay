package com.taobao.securityjni.bcast;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.ArrayList;
import tb.kge;
import tb.riy;

@Deprecated
/* loaded from: classes8.dex */
public class AppStateManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DNS_ACTION = "setaobao.bbox.DNS";
    public static final String EXTRA_DNS_IP = "IPAddress";
    public static final String EXTRA_DNS_LOCAL = "DNSinfolocal";
    public static final String EXTRA_DNS_NET = "DNSinfonet";
    public static final String EXTRA_RT = "RTinfo";
    public static final String EXTRA_SPITEP = "SPITEPinfo";
    private static final int IPV4_SIZE = 4;
    public static int Init = 0;
    public static final String RT_ACTION = "setaobao.bbox.RT";
    public static final int RT_VALUE_100_PERMISSION = 10;
    public static final int RT_VALUE_INVALID = -1;
    public static final int RT_VALUE_LIKELY_1 = 1;
    public static final int RT_VALUE_LIKELY_2 = 2;
    public static final int RT_VALUE_LIKELY_3 = 3;
    public static final int RT_VALUE_LIKELY_4 = 4;
    public static final int RT_VALUE_LIKELY_5 = 5;
    public static final int RT_VALUE_LIKELY_6 = 6;
    public static final int RT_VALUE_LIKELY_7 = 7;
    public static final int RT_VALUE_LIKELY_8 = 8;
    public static final int RT_VALUE_LIKELY_9 = 9;
    public static final int RT_VALUE_UNDETECTABLE = 0;
    public static final String SPITEP_ACTION = "setaobao.bbox.SPITEP";
    public static final int SPITEP_VALUE_NS_0 = 0;
    public static final int SPITEP_VALUE_NS_1 = 1;
    public static final int SPITEP_VALUE_NS_2 = 2;
    public static final int SPITEP_VALUE_NS_3 = 3;

    static {
        kge.a(-1556409070);
        Init = 0;
    }

    /* loaded from: classes8.dex */
    public static class DoaminIP {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public byte[][] ip;
        public String name;

        static {
            kge.a(261172981);
        }

        private String IpToString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("99167806", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            if (this.ip == null) {
                return "null";
            }
            int i = 0;
            while (true) {
                byte[][] bArr = this.ip;
                if (i < bArr.length) {
                    byte[] bArr2 = bArr[i];
                    sb.append("ip[");
                    sb.append(i);
                    sb.append("]=");
                    if (bArr2 != null) {
                        for (int i2 = 0; i2 < bArr2.length; i2++) {
                            sb.append(bArr2[i2] & 255);
                            if (i2 != bArr2.length - 1) {
                                sb.append(riy.CONDITION_IF_MIDDLE);
                            }
                        }
                    } else {
                        sb.append("null");
                    }
                    sb.append("  ");
                    i++;
                } else {
                    return sb.toString();
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DoaminIP [name=" + this.name + ", ip=" + IpToString() + riy.ARRAY_END_STR;
        }
    }

    public static final ArrayList<DoaminIP> parserDomainIP(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fc945348", new Object[]{intent});
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra(EXTRA_DNS_IP);
        if (byteArrayExtra == null) {
            return null;
        }
        ArrayList<DoaminIP> arrayList = new ArrayList<>();
        byte[][] bArr = null;
        int i = 0;
        while (i < byteArrayExtra.length) {
            int i2 = byteArrayExtra[i] & 255;
            String str = new String(byteArrayExtra, i + 1, i2);
            int i3 = i + i2 + 1;
            int i4 = byteArrayExtra[i3] & 255;
            int i5 = i4 + i3;
            if (i5 > byteArrayExtra.length - 1) {
                break;
            }
            int i6 = i4 / 4;
            if (i6 > 0) {
                byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, i6, 4);
                for (int i7 = 0; i7 < i6; i7++) {
                    System.arraycopy(byteArrayExtra, i3 + 1 + (i7 << 2), bArr2[i7], 0, 4);
                }
                bArr = bArr2;
            }
            i = i5 + 1;
            DoaminIP doaminIP = new DoaminIP();
            doaminIP.name = str;
            doaminIP.ip = bArr;
            arrayList.add(doaminIP);
        }
        return arrayList;
    }
}
