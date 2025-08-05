package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.downloader.a;
import tb.jyx;
import tb.knb;

/* loaded from: classes7.dex */
public class kky implements klh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30134a;
    private static boolean b;

    @Override // tb.klh
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    @Override // tb.klh
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    @Override // tb.klh
    public void a(knb.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2917c6", new Object[]{this, aVar, str});
            return;
        }
        a(str);
        if (aVar.f30178a == null) {
            return;
        }
        String str2 = "true";
        DimensionValueSet value = DimensionValueSet.create().setValue("host", aVar.f30178a.getHost()).setValue("https", "https".equals(aVar.f30178a.getProtocol()) ? str2 : "false").setValue("size", a(aVar.b)).setValue("net", String.valueOf(a.p)).setValue("url", aVar.f30178a.toString()).setValue("range", aVar.d ? str2 : "false").setValue("retry", aVar.e ? str2 : "false").setValue("success", aVar.c ? str2 : "false").setValue("error_code", aVar.s).setValue(MUSAppMonitor.ERROR_MSG, aVar.t).setValue("biz", aVar.j);
        if (!aVar.m) {
            str2 = "false";
        }
        AppMonitor.Stat.commit("download-sdk", str, value.setValue("prefetch", str2).setValue("opt_thread", String.valueOf(a.q)).setValue("boost_degraded", String.valueOf(aVar.l)).setValue("md5", aVar.n).setValue("scene", aVar.p).setValue("priorityLevel", aVar.q).setValue("opt_strategy", String.valueOf(a.v)), MeasureValueSet.create().setValue("connectTime", aVar.f).setValue(jyx.c.POINT_NAME, aVar.g).setValue("speed", aVar.i).setValue(Configuration.LOG_TYPE_TRAFFIC, aVar.r / 1048576.0d).setValue("totalTime", System.currentTimeMillis() - aVar.h).setValue("md5CheckTime", aVar.k).setValue("taskAllTime", aVar.o));
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "stat")) {
            if (f30134a) {
                return;
            }
            f30134a = true;
        } else if (TextUtils.equals(str, "download_task")) {
            if (b) {
                return;
            }
            b = true;
        }
        AppMonitor.register("download-sdk", str, MeasureSet.create().addMeasure("connectTime").addMeasure(jyx.c.POINT_NAME).addMeasure("speed").addMeasure(Configuration.LOG_TYPE_TRAFFIC).addMeasure("totalTime").addMeasure("md5CheckTime").addMeasure("taskAllTime"), DimensionSet.create().addDimension("host").addDimension("https").addDimension("size").addDimension("net").addDimension("url").addDimension("range").addDimension("retry").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG).addDimension("biz").addDimension("prefetch").addDimension("opt_thread").addDimension("boost_degraded").addDimension("md5").addDimension("scene").addDimension("priorityLevel").addDimension("opt_strategy"));
    }

    private String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{this, new Long(j)});
        }
        if (0 == j) {
            return "0";
        }
        if (j < 1024) {
            return "<1k";
        }
        if (j < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
            return "1k<n<10k";
        }
        if (j < 102400) {
            return "10k<n<100k";
        }
        if (j < 512000) {
            return "100k<n<500k";
        }
        if (j < 1048576) {
            return "500k<n<1M";
        }
        return (j / 1048576) + "M";
    }
}
