package com.alibaba.openid.device;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import tb.bzi;
import tb.bzk;
import tb.eyr;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2077403117);
    }

    public static bzi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bzi) ipChange.ipc$dispatch("f03082d", new Object[0]);
        }
        String str = Build.BRAND;
        bzk.a("Device", "Brand", str);
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (eyr.e()) {
            return new HonorDeviceIdSupplier();
        }
        if (eyr.d()) {
            return new HuaweiDeviceIdSupplier();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase(l.REDMI_MANUFACTURE_LOWER_CASE) || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new h();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new g();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase(DeviceProperty.ALIAS_ONEPLUS) || str.equalsIgnoreCase("realme")) {
            return new e();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new b();
        }
        if (str.equalsIgnoreCase(DeviceProperty.ALIAS_NUBIA)) {
            return new d();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new f();
        }
        if (!str.equalsIgnoreCase("meizu") && !str.equalsIgnoreCase("mblu") && !eyr.a()) {
            return null;
        }
        return new c();
    }
}
