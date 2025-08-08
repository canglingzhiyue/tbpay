package com.alipay.android.msp.framework.offline;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.msp.framework.helper.TidHelper;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.network.MiscRequestUtils;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class OfflineRenderReport {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f4814a;

    public OfflineRenderReport(Map<String, String> map) {
        this.f4814a = map;
    }

    public void reportActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4d839e", new Object[]{this, context});
        } else {
            a(context, "bizcontext={\"requestScene\":\"ACTIVITY\"}");
        }
    }

    private void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.offline.OfflineRenderReport.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        OfflineRenderReport.a(OfflineRenderReport.this, context, str);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    private static boolean a(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        String templateVersion = GlobalConstant.getTemplateVersion();
        String mspVersion = GlobalSdkConstant.getMspVersion();
        String b = b(context);
        String string = PrefUtils.getString("cashier_offline_render", "birdnest_ver", null);
        String string2 = PrefUtils.getString("cashier_offline_render", "msp_ver", null);
        try {
            z = !StringUtils.equals(FileUtils.md5(b), PrefUtils.getString("cashier_offline_render", "tHash", null));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            z = false;
        }
        return !StringUtils.equals(templateVersion, string) || !StringUtils.equals(mspVersion, string2) || z;
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        Tid loadTID = TidHelper.loadTID(context);
        if (loadTID == null) {
            return null;
        }
        return loadTID.getTid();
    }

    public void reportUseDefaultResultInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dddffa8", new Object[]{this, context});
        } else {
            a(context, "bizcontext={\"requestScene\":\"DEFAULTRESULT\"}");
        }
    }

    public void reportResultPageInfo(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e645aa73", new Object[]{this, context});
            return;
        }
        String string = PrefUtils.getString("cashier_offline_render", "birdnest_ver", null);
        String string2 = PrefUtils.getString("cashier_offline_render", "msp_ver", null);
        String string3 = PrefUtils.getString("cashier_offline_render", "tHash", null);
        if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string3)) {
            z = false;
        }
        if (z) {
            a(context, "bizcontext={\"requestScene\":\"INIT\"}");
        } else if (!a(context)) {
        } else {
            a(context, "bizcontext={\"requestScene\":\"UPDATE\"}");
        }
    }

    public static /* synthetic */ void a(OfflineRenderReport offlineRenderReport, Context context, String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c98484f", new Object[]{offlineRenderReport, context, str});
            return;
        }
        boolean requestReportLocalInfo = MiscRequestUtils.OfflineRenderReportRequest.requestReportLocalInfo(str, true, offlineRenderReport.f4814a);
        if (requestReportLocalInfo) {
            PrefUtils.putString("cashier_offline_render", "birdnest_ver", GlobalConstant.getTemplateVersion());
            PrefUtils.putString("cashier_offline_render", "msp_ver", GlobalSdkConstant.getMspVersion());
            PrefUtils.putString("cashier_offline_render", "tHash", FileUtils.md5(b(context)));
            PrefUtils.remove("cashier_offline_render", "tid");
        }
        LogUtil.record(2, "OfflineRender::reportLocalInfo", "success:".concat(String.valueOf(requestReportLocalInfo)));
    }
}
