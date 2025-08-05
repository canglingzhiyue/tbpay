package com.ta.utdid2.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.android.utils.StringUtils;
import java.util.zip.Adler32;
import tb.kge;

@Deprecated
/* loaded from: classes4.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object CREATE_DEVICE_METADATA_LOCK;
    private static Device mDevice;

    static {
        kge.a(801677652);
        mDevice = null;
        CREATE_DEVICE_METADATA_LOCK = new Object();
    }

    public static long getMetadataCheckSum(Device device) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c2cb8e0", new Object[]{device})).longValue();
        }
        if (device == null) {
            return 0L;
        }
        String format = String.format("%s%s%s%s%s", device.getUtdid(), device.getDeviceId(), Long.valueOf(device.getCreateTimestamp()), device.getImsi(), device.getImei());
        if (StringUtils.isEmpty(format)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(format.getBytes());
        return adler32.getValue();
    }

    private static Device initDeviceMetadata(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Device) ipChange.ipc$dispatch("db4c3ad7", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        synchronized (CREATE_DEVICE_METADATA_LOCK) {
            String value = UTUtdid.instance(context).getValue();
            if (StringUtils.isEmpty(value)) {
                return null;
            }
            if (value.endsWith("\n")) {
                value = value.substring(0, value.length() - 1);
            }
            Device device = new Device();
            long currentTimeMillis = System.currentTimeMillis();
            String imei = PhoneInfoUtils.getImei(context);
            String imsi = PhoneInfoUtils.getImsi(context);
            device.setDeviceId(imei);
            device.setImei(imei);
            device.setCreateTimestamp(currentTimeMillis);
            device.setImsi(imsi);
            device.setUtdid(value);
            device.setCheckSum(getMetadataCheckSum(device));
            return device;
        }
    }

    public static synchronized Device getDevice(Context context) {
        synchronized (DeviceInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Device) ipChange.ipc$dispatch("6049640", new Object[]{context});
            } else if (mDevice != null) {
                return mDevice;
            } else if (context == null) {
                return null;
            } else {
                Device initDeviceMetadata = initDeviceMetadata(context);
                mDevice = initDeviceMetadata;
                return initDeviceMetadata;
            }
        }
    }
}
