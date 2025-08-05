package com.taobao.collection.dto;

import android.bluetooth.BluetoothDevice;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class BeaconRecord {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<IBeacon> f16915a = new ArrayList();
    private long b;

    static {
        kge.a(1619815747);
    }

    public void a(List<IBeacon> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f16915a = list;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public List<IBeacon> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f16915a;
    }

    /* loaded from: classes7.dex */
    public static class IBeacon {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String bluetoothAddress;
        public int major;
        public int minor;
        public String name;
        public String proximityUuid;
        public int rssi;
        public int txPower;

        static {
            kge.a(761685900);
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IBeacon)) {
                return false;
            }
            IBeacon iBeacon = (IBeacon) obj;
            String str5 = this.name;
            String str6 = iBeacon.name;
            return (str5 == str6 || (str5 != null && str5.equals(str6))) && this.major == iBeacon.major && this.minor == iBeacon.minor && ((str = this.proximityUuid) == (str2 = iBeacon.proximityUuid) || (str != null && str.equals(str2))) && (((str3 = this.bluetoothAddress) == (str4 = iBeacon.bluetoothAddress) || (str3 != null && str3.equals(str4))) && this.txPower == iBeacon.txPower && this.rssi == iBeacon.rssi);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.name;
            int hashCode = (((((217 + (str == null ? 0 : str.hashCode())) * 31) + this.major) * 31) + this.minor) * 31;
            String str2 = this.proximityUuid;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.bluetoothAddress;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return ((((hashCode2 + i) * 31) + this.txPower) * 31) + this.rssi;
        }

        public String getName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
        }

        public int getMajor() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("27fd26fd", new Object[]{this})).intValue() : this.major;
        }

        public int getMinor() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a9f7af9", new Object[]{this})).intValue() : this.minor;
        }

        public String getProximityUuid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c5d3055", new Object[]{this}) : this.proximityUuid;
        }

        public int getTxPower() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7da46fa5", new Object[]{this})).intValue() : this.txPower;
        }

        public int getRssi() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4ba74ec7", new Object[]{this})).intValue() : this.rssi;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "IBeacon [name=" + this.name + ", major=" + this.major + ", minor=" + this.minor + ", proximityUuid=" + this.proximityUuid + ", bluetoothAddress=" + this.bluetoothAddress + ", txPower=" + this.txPower + ", rssi=" + this.rssi + riy.ARRAY_END_STR;
        }
    }

    public static IBeacon a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (IBeacon) ipChange.ipc$dispatch("50b13965", new Object[]{bluetoothDevice, new Integer(i), bArr});
        }
        int i2 = 2;
        while (true) {
            if (i2 > 5) {
                z = false;
                break;
            }
            int i3 = i2 + 2;
            if ((bArr[i3] & 255) == 2 && (bArr[i2 + 3] & 255) == 21) {
                break;
            } else if ((bArr[i2] & 255) == 45 && (bArr[i2 + 1] & 255) == 36 && (bArr[i3] & 255) == 191 && (bArr[i2 + 3] & 255) == 22) {
                IBeacon iBeacon = new IBeacon();
                iBeacon.major = 0;
                iBeacon.minor = 0;
                iBeacon.proximityUuid = "00000000-0000-0000-0000-000000000000";
                iBeacon.txPower = -55;
                return iBeacon;
            } else if ((bArr[i2] & 255) == 173 && (bArr[i2 + 1] & 255) == 119 && (bArr[i3] & 255) == 0 && (bArr[i2 + 3] & 255) == 198) {
                IBeacon iBeacon2 = new IBeacon();
                iBeacon2.major = 0;
                iBeacon2.minor = 0;
                iBeacon2.proximityUuid = "00000000-0000-0000-0000-000000000000";
                iBeacon2.txPower = -55;
                return iBeacon2;
            } else {
                i2++;
            }
        }
        if (!z) {
            return null;
        }
        IBeacon iBeacon3 = new IBeacon();
        iBeacon3.major = ((bArr[i2 + 20] & 255) << 8) + (bArr[i2 + 21] & 255);
        iBeacon3.minor = ((bArr[i2 + 22] & 255) << 8) + (bArr[i2 + 23] & 255);
        iBeacon3.txPower = bArr[i2 + 24];
        iBeacon3.rssi = i;
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, i2 + 4, bArr2, 0, 16);
        String a2 = a(bArr2);
        iBeacon3.proximityUuid = a2.substring(0, 8) + "-" + a2.substring(8, 12) + "-" + a2.substring(12, 16) + "-" + a2.substring(16, 20) + "-" + a2.substring(20, 32);
        if (bluetoothDevice != null) {
            iBeacon3.bluetoothAddress = bluetoothDevice.getAddress();
            iBeacon3.name = bluetoothDevice.getName();
        }
        return iBeacon3;
    }

    private static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
