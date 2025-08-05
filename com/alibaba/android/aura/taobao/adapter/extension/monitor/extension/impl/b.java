package com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.monitor.model.AURABlockDataModel;
import com.alibaba.security.realidentity.f3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.aze;
import tb.bau;
import tb.bba;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.aspect.error.alarm.monitor.slice")
/* loaded from: classes2.dex */
public final class b extends aze {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(329282980);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.azg
    public AURABlockDataModel a(com.alibaba.android.aura.b bVar) {
        final Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABlockDataModel) ipChange.ipc$dispatch("d6de22cf", new Object[]{this, bVar});
        }
        Map<String, Object> c = bVar.c();
        if (bau.a(c) || (obj = c.get("requestParams")) == null) {
            return null;
        }
        AURABlockDataModel a2 = a(new HashMap<String, Object>() { // from class: com.alibaba.android.aura.taobao.adapter.extension.monitor.extension.impl.AURAAlarmMonitorSliceSliceExtensions$1
            {
                b.this = this;
                put("requestParams", obj);
            }
        });
        if (a2 != null) {
            c.remove("requestParams");
        }
        return a2;
    }

    private AURABlockDataModel a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (AURABlockDataModel) ipChange.ipc$dispatch("6cc00312", new Object[]{this, map});
        }
        String b = bba.b(map);
        int length = TextUtils.isEmpty(b) ? 0 : b.length();
        if (length <= 153600) {
            return null;
        }
        String valueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i < length) {
            int i3 = i + f3.c;
            arrayList.add(new AURABlockDataModel.AURASliceDataModel(valueOf, String.valueOf(i2), b.substring(i, Math.min(i3, length))));
            i2++;
            i = i3;
        }
        return new AURABlockDataModel(valueOf, arrayList);
    }
}
