package com.taobao.android.tbtheme.kit;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbtheme.kit.ThemeDarkModeAdapterDevices;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15438a = "ThemeDarkModeUtil";
    private ThemeDarkModeAdapterDevices b;

    static {
        kge.a(-311171516);
    }

    public boolean a() {
        ThemeDarkModeAdapterDevices a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String a3 = f.a(f.DARK_MODE_ADAPTER_DEVICES, (String) null);
        if (StringUtils.isEmpty(a3) || (a2 = a(a3)) == null) {
            return false;
        }
        return a(a2);
    }

    public boolean a(ThemeDarkModeAdapterDevices themeDarkModeAdapterDevices) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a560d24b", new Object[]{this, themeDarkModeAdapterDevices})).booleanValue();
        }
        if (themeDarkModeAdapterDevices != null && themeDarkModeAdapterDevices.brands != null) {
            for (ThemeDarkModeAdapterDevices.Brand brand : themeDarkModeAdapterDevices.brands) {
                if (a(brand)) {
                    return true;
                }
            }
        }
        return false;
    }

    private ThemeDarkModeAdapterDevices a(String str) {
        List<ThemeDarkModeAdapterDevices.Brand> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeDarkModeAdapterDevices) ipChange.ipc$dispatch("acbb1ec3", new Object[]{this, str});
        }
        if (this.b == null) {
            try {
                this.b = (ThemeDarkModeAdapterDevices) JSON.parseObject(str, ThemeDarkModeAdapterDevices.class);
            } catch (Throwable unused) {
                m.a(this.f15438a, "shouldAdapterDarkMode", "orange配置格式错误");
                return null;
            }
        }
        ThemeDarkModeAdapterDevices themeDarkModeAdapterDevices = this.b;
        if (themeDarkModeAdapterDevices != null && (list = themeDarkModeAdapterDevices.brands) != null && !list.isEmpty()) {
            return this.b;
        }
        return null;
    }

    private boolean a(ThemeDarkModeAdapterDevices.Brand brand) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed9e2a68", new Object[]{this, brand})).booleanValue();
        }
        List<ThemeDarkModeAdapterDevices.Model> list = brand.models;
        if (list == null || list.isEmpty()) {
            return Build.BRAND.equals(brand.brand);
        }
        for (ThemeDarkModeAdapterDevices.Model model : list) {
            if (a(brand, model)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(ThemeDarkModeAdapterDevices.Brand brand, ThemeDarkModeAdapterDevices.Model model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d000e82", new Object[]{this, brand, model})).booleanValue();
        }
        ThemeDarkModeAdapterDevices.Version version = model.androidVersions;
        if (version == null) {
            return Build.BRAND.equals(brand.brand) && (StringUtils.isEmpty(model.model) || Build.MODEL.equals(model.model));
        }
        int a2 = a(version.min, Integer.MIN_VALUE);
        return Build.BRAND.equals(brand.brand) && (StringUtils.isEmpty(model.model) || Build.MODEL.equals(model.model)) && Build.VERSION.SDK_INT >= a2 && Build.VERSION.SDK_INT <= Math.max(a2, a(version.max, Integer.MAX_VALUE));
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
