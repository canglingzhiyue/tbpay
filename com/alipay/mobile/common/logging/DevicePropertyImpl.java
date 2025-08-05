package com.alipay.mobile.common.logging;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.security.realidentity.m;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DevicePropertyImpl implements DeviceProperty {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5403a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Context g;

    public DevicePropertyImpl(Context context) {
        this.g = context;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isXiaomiDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ee0a846", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("xiaomi".equals(getBrandName()) || "xiaomi".equals(getManufacturer()))) {
            this.f5403a = "xiaomi";
            return true;
        }
        return "xiaomi".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isVivoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56ff4177", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("vivo".equals(getBrandName()) || "vivo".equals(getManufacturer()))) {
            this.f5403a = "vivo";
            return true;
        }
        return "vivo".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isOppoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("815a0b6b", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("oppo".equals(getBrandName()) || "oppo".equals(getManufacturer()))) {
            this.f5403a = "oppo";
            return true;
        }
        return "oppo".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isHuaweiDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9296ce72", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("huawei".equals(getBrandName()) || "huawei".equals(getManufacturer()))) {
            this.f5403a = "huawei";
            return true;
        }
        return "huawei".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isLeEcoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab536acf", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && (DeviceProperty.ALIAS_LEECO.equals(getBrandName()) || "lemobile".equals(getManufacturer()))) {
            this.f5403a = DeviceProperty.ALIAS_LEECO;
            return true;
        }
        return DeviceProperty.ALIAS_LEECO.equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isQikuDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("166466cd", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && (DeviceProperty.ALIAS_QIKU.equals(getBrandName()) || DeviceProperty.ALIAS_QIKU.equals(getManufacturer()))) {
            this.f5403a = DeviceProperty.ALIAS_QIKU;
            return true;
        }
        return DeviceProperty.ALIAS_QIKU.equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isZteDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb949a2", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && (DeviceProperty.ALIAS_ZTE.equals(getBrandName()) || DeviceProperty.ALIAS_ZTE.equals(getManufacturer()))) {
            this.f5403a = DeviceProperty.ALIAS_ZTE;
            return true;
        }
        return DeviceProperty.ALIAS_ZTE.equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isOnePlusDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de67517", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && (DeviceProperty.ALIAS_ONEPLUS.equals(getBrandName()) || DeviceProperty.ALIAS_ONEPLUS.equals(getManufacturer()))) {
            this.f5403a = DeviceProperty.ALIAS_ONEPLUS;
            return true;
        }
        return DeviceProperty.ALIAS_ONEPLUS.equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isNubiaDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b66af8a", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && (DeviceProperty.ALIAS_NUBIA.equals(getBrandName()) || DeviceProperty.ALIAS_NUBIA.equals(getManufacturer()))) {
            this.f5403a = DeviceProperty.ALIAS_NUBIA;
            return true;
        }
        return DeviceProperty.ALIAS_NUBIA.equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isCoolpadDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e51ad421", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && (DeviceProperty.ALIAS_COOLPAD.equals(getBrandName()) || "yulong".equals(getManufacturer()))) {
            this.f5403a = DeviceProperty.ALIAS_COOLPAD;
            return true;
        }
        return DeviceProperty.ALIAS_COOLPAD.equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isLenovoDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f7ad6be", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("lenovo".equals(getBrandName()) || "lenovo".equals(getManufacturer()))) {
            this.f5403a = "lenovo";
            return true;
        }
        return "lenovo".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isMeizuDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("meizu".equals(getBrandName()) || "meizu".equals(getManufacturer()))) {
            this.f5403a = "meizu";
            return true;
        }
        return "meizu".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public boolean isSamsungDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de5adf71", new Object[]{this})).booleanValue();
        }
        if (this.f5403a == null && ("samsung".equals(getBrandName()) || "samsung".equals(getManufacturer()))) {
            this.f5403a = "samsung";
            return true;
        }
        return "samsung".equals(this.f5403a);
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getDeviceAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbaf4115", new Object[]{this});
        }
        if (this.f5403a == null && !isXiaomiDevice() && !isVivoDevice() && !isOppoDevice() && !isHuaweiDevice() && !isLeEcoDevice() && !isQikuDevice() && !isZteDevice() && !isOnePlusDevice() && !isNubiaDevice() && !isCoolpadDevice() && !isLenovoDevice() && !isMeizuDevice() && !isSamsungDevice()) {
            this.f5403a = "unknown";
        }
        return this.f5403a;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getRomVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[]{this});
        }
        if (this.b == null) {
            if (isXiaomiDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.x, "");
            } else if (isVivoDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.w, "");
            } else if (isOppoDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.y, "");
            } else if (isHuaweiDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.v, "");
            } else if (isLeEcoDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.z, "");
            } else if (isQikuDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.A, "");
            } else if (isZteDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.B, "");
            } else if (isOnePlusDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.C, "");
            } else if (isNubiaDevice()) {
                this.b = LoggingUtil.getSystemProperty(m.D, "");
            } else if (!isCoolpadDevice() && !isLenovoDevice() && !isMeizuDevice()) {
                isSamsungDevice();
            }
            if (TextUtils.isEmpty(this.b)) {
                this.b = getDisplayID();
                if (TextUtils.isEmpty(this.b)) {
                    this.b = "unknown";
                }
            }
            this.b = this.b.toLowerCase();
        }
        return this.b;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getManufacturer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77efb12", new Object[]{this});
        }
        if (this.c == null) {
            try {
                this.c = Build.MANUFACTURER.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.c)) {
                this.c = "unknown";
            }
        }
        return this.c;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getBrandName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d0b47d", new Object[]{this});
        }
        if (this.d == null) {
            try {
                this.d = Build.BRAND.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.d)) {
                this.d = "unknown";
            }
        }
        return this.d;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getDisplayID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfec2b2", new Object[]{this});
        }
        if (this.e == null) {
            try {
                this.e = Build.DISPLAY.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = "unknown";
            }
        }
        return this.e;
    }

    @Override // com.alipay.mobile.common.logging.api.DeviceProperty
    public String getFingerPrint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2255d42b", new Object[]{this});
        }
        if (this.f == null) {
            try {
                this.f = Build.FINGERPRINT.toLowerCase();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(this.f)) {
                this.f = "unknown";
            }
        }
        return this.f;
    }
}
