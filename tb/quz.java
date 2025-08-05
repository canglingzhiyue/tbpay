package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.alipay.cashdesk.b;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes8.dex */
public class quz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Pay";

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            AppMonitor.Alarm.commitSuccess(PAGE_NAME, "Alipay");
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d679e13", new Object[]{bVar});
        } else {
            AppMonitor.Alarm.commitFail(PAGE_NAME, "Alipay", bVar.f19834a, bVar.b);
        }
    }

    public static void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6689554", new Object[]{bVar});
        } else {
            TBS.Ext.commitEvent(TextUtils.isEmpty(bVar.f) ? "UNKNOW" : bVar.f, 30001, "do_pay_request_failed", bVar.e);
        }
    }

    public static void a(b bVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8e20d", new Object[]{bVar, str, str2, new Boolean(z)});
        } else {
            AdapterForTLog.loge(PAGE_NAME, String.format("PAY_FAILED;resultStr=%s,signStr=%s,from=%s,needpop=%b,alipayResult=%s,unsuccessURL=%s", bVar.c, str, bVar.f, Boolean.valueOf(z), bVar.e, str2));
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "极简支付结束,result=" + str);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "拉起h5支付,h5=" + str);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "simplePay,signStr=" + str);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        AdapterForTLog.logd(PAGE_NAME, "退款鉴权,result=" + str);
    }
}
