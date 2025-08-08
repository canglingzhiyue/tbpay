package com.alipay.android.msp.configservice;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.m;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f4479a = "xiaomi";
    private final String b = "vivo";
    private final String c = "oppo";
    private final String d = "huawei";
    private final String e = DeviceProperty.ALIAS_LEECO;
    private final String f = DeviceProperty.ALIAS_QIKU;
    private final String g = DeviceProperty.ALIAS_ZTE;
    private final String h = DeviceProperty.ALIAS_ONEPLUS;
    private final String i = DeviceProperty.ALIAS_NUBIA;
    private final String j = DeviceProperty.ALIAS_COOLPAD;
    private final String k = "lenovo";
    private final String l = "meizu";
    private final String m = "samsung";
    private Method n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;

    public String getManufacturer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77efb12", new Object[]{this});
        }
        if (this.p == null) {
            try {
                this.p = Build.MANUFACTURER.toLowerCase();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            if (StringUtils.isEmpty(this.p)) {
                this.p = "unknown";
            }
        }
        return this.p;
    }

    public String getBrandName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d0b47d", new Object[]{this});
        }
        if (this.o == null) {
            try {
                this.o = Build.BRAND.toLowerCase();
            } catch (Throwable unused) {
            }
            if (StringUtils.isEmpty(this.o)) {
                this.o = "unknown";
            }
        }
        return this.o;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("xiaomi".equals(getBrandName()) || "xiaomi".equals(getManufacturer()))) {
            this.s = "xiaomi";
            return true;
        }
        return "xiaomi".equals(this.s);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("vivo".equals(getBrandName()) || "vivo".equals(getManufacturer()))) {
            this.s = "vivo";
            return true;
        }
        return "vivo".equals(this.s);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("oppo".equals(getBrandName()) || "oppo".equals(getManufacturer()))) {
            this.s = "oppo";
            return true;
        }
        return "oppo".equals(this.s);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("huawei".equals(getBrandName()) || "huawei".equals(getManufacturer()))) {
            this.s = "huawei";
            return true;
        }
        return "huawei".equals(this.s);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (this.s == null && (DeviceProperty.ALIAS_LEECO.equals(getBrandName()) || "lemobile".equals(getManufacturer()))) {
            this.s = DeviceProperty.ALIAS_LEECO;
            return true;
        }
        return DeviceProperty.ALIAS_LEECO.equals(this.s);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (this.s == null && (DeviceProperty.ALIAS_QIKU.equals(getBrandName()) || DeviceProperty.ALIAS_QIKU.equals(getManufacturer()))) {
            this.s = DeviceProperty.ALIAS_QIKU;
            return true;
        }
        return DeviceProperty.ALIAS_QIKU.equals(this.s);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.s == null && (DeviceProperty.ALIAS_ZTE.equals(getBrandName()) || DeviceProperty.ALIAS_ZTE.equals(getManufacturer()))) {
            this.s = DeviceProperty.ALIAS_ZTE;
            return true;
        }
        return DeviceProperty.ALIAS_ZTE.equals(this.s);
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        if (this.s == null && (DeviceProperty.ALIAS_ONEPLUS.equals(getBrandName()) || DeviceProperty.ALIAS_ONEPLUS.equals(getManufacturer()))) {
            this.s = DeviceProperty.ALIAS_ONEPLUS;
            return true;
        }
        return DeviceProperty.ALIAS_ONEPLUS.equals(this.s);
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (this.s == null && (DeviceProperty.ALIAS_NUBIA.equals(getBrandName()) || DeviceProperty.ALIAS_NUBIA.equals(getManufacturer()))) {
            this.s = DeviceProperty.ALIAS_NUBIA;
            return true;
        }
        return DeviceProperty.ALIAS_NUBIA.equals(this.s);
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (this.s == null && (DeviceProperty.ALIAS_COOLPAD.equals(getBrandName()) || "yulong".equals(getManufacturer()))) {
            this.s = DeviceProperty.ALIAS_COOLPAD;
            return true;
        }
        return DeviceProperty.ALIAS_COOLPAD.equals(this.s);
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("lenovo".equals(getBrandName()) || "lenovo".equals(getManufacturer()))) {
            this.s = "lenovo";
            return true;
        }
        return "lenovo".equals(this.s);
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("meizu".equals(getBrandName()) || "meizu".equals(getManufacturer()))) {
            this.s = "meizu";
            return true;
        }
        return "meizu".equals(this.s);
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        if (this.s == null && ("samsung".equals(getBrandName()) || "samsung".equals(getManufacturer()))) {
            this.s = "samsung";
            return true;
        }
        return "samsung".equals(this.s);
    }

    public String getDeviceAlias() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbaf4115", new Object[]{this});
        }
        if (this.s == null && !a() && !b() && !c() && !d() && !e() && !f() && !g() && !h() && !i() && !j() && !k() && !l() && !m()) {
            this.s = "unknown";
        }
        return this.s;
    }

    private Method n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3c135e29", new Object[]{this});
        }
        if (this.n == null) {
            try {
                this.n = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return this.n;
    }

    public String getSystemProperty(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        try {
            return (String) n().invoke(null, str, str2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str2;
        }
    }

    public String getDisplayID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfec2b2", new Object[]{this});
        }
        if (this.r == null) {
            try {
                this.r = Build.DISPLAY.toLowerCase();
            } catch (Throwable unused) {
            }
            if (StringUtils.isEmpty(this.r)) {
                this.r = "unknown";
            }
        }
        return this.r;
    }

    public String getRomVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4cc8fcdb", new Object[]{this});
        }
        if (this.q == null) {
            if (a()) {
                this.q = getSystemProperty(m.x, "");
            } else if (b()) {
                this.q = getSystemProperty(m.w, "");
            } else if (c()) {
                this.q = getSystemProperty(m.y, "");
            } else if (d()) {
                this.q = getSystemProperty(m.v, "");
            } else if (e()) {
                this.q = getSystemProperty(m.z, "");
            } else if (f()) {
                this.q = getSystemProperty(m.A, "");
            } else if (g()) {
                this.q = getSystemProperty(m.B, "");
            } else if (h()) {
                this.q = getSystemProperty(m.C, "");
            } else if (i()) {
                this.q = getSystemProperty(m.D, "");
            } else if (!j() && !k() && !l()) {
                m();
            }
            if (StringUtils.isEmpty(this.q)) {
                this.q = getDisplayID();
                if (StringUtils.isEmpty(this.q)) {
                    this.q = "unknown";
                }
            }
            this.q = this.q.toLowerCase();
        }
        return this.q;
    }
}
