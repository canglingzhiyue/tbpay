package com.taobao.android.weex_ability.page;

import android.net.Uri;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15965a;

    static {
        kge.a(980357844);
        f15965a = false;
    }

    public static void a(long j, double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48b49ac", new Object[]{new Long(j), new Double(d), str});
            return;
        }
        a();
        AppMonitor.Stat.commit("muise_asr_page", "page", a(str), a(j, d));
    }

    private static MeasureValueSet a(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureValueSet) ipChange.ipc$dispatch("af3810a5", new Object[]{new Long(j), new Double(d)});
        }
        MeasureValueSet create = MeasureValueSet.create();
        create.setValue("download_wlm", d);
        create.setValue("full_time", j);
        return create;
    }

    private static DimensionValueSet a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("b1dd5d8d", new Object[]{str});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("path", str);
        return create;
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f15965a) {
        } else {
            f15965a = true;
            AppMonitor.register("muise_asr_page", "page", b(), c(), true);
        }
    }

    private static MeasureSet b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureSet) ipChange.ipc$dispatch("1a9bd4c5", new Object[0]);
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure("download_wlm");
        create.addMeasure("full_time");
        return create;
    }

    private static DimensionSet c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("df37a30e", new Object[0]);
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("path");
        return create;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "MusError");
        hashMap.put("message", str2);
        hashMap.put("type", "error");
        hashMap.put("sampling", "1");
        hashMap.put("native", "1");
        try {
            String uri = Uri.parse(str).toString();
            int indexOf = uri.indexOf(63);
            if (indexOf < 0) {
                indexOf = uri.indexOf(35);
            }
            if (indexOf > 0) {
                uri = uri.substring(0, indexOf);
            }
            try {
                uri = URLEncoder.encode(uri, "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            hashMap.put("url", uri + "/muise_page_error");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 19999, "/jstracker.3", "", "", hashMap).build());
    }
}
