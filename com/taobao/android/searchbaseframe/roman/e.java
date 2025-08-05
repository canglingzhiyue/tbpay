package com.taobao.android.searchbaseframe.roman;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import tb.kge;
import tb.mto;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(510245296);
        AppMonitor.register("tbsearch", "roman_preload", MeasureSet.create(new String[]{"success"}), DimensionSet.create(new String[]{"page_key", "config_version", "error_code", MUSAppMonitor.ERROR_MSG}));
    }

    public static void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("page_key", str);
        create.setValue("config_version", String.valueOf(i));
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("success", 1.0d);
        AppMonitor.Stat.commit("tbsearch", "roman_preload", create, create2);
    }

    public static void a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4196da5", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("page_key", str);
        create.setValue("config_version", String.valueOf(i));
        create.setValue("error_code", str2);
        create.setValue(MUSAppMonitor.ERROR_MSG, str3);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("success", mto.a.GEO_NOT_SUPPORT);
        AppMonitor.Stat.commit("tbsearch", "roman_preload", create, create2);
    }
}
