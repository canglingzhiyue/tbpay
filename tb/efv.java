package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;

/* loaded from: classes6.dex */
public class efv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final efv f27287a = new efv();
    private final ehy b = new ehy();

    private efv() {
    }

    public static efv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (efv) ipChange.ipc$dispatch("f041bc9", new Object[0]) : f27287a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
        } else if (i == 14 || i == 15) {
        } else {
            a(str, str2, i, null);
        }
    }

    public void a(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608d2b11", new Object[]{this, str, str2, new Integer(i), str3});
            return;
        }
        try {
            lyu a2 = this.b.a(str);
            if (a2 == null) {
                String a3 = a.a();
                TLog.loge(a3, "IntroductoryCallbackController", "notifyStatusChanged callback error " + str);
                return;
            }
            a2.onIntroductoryStateChanged(str2, i, str3);
            String a4 = a.a();
            TLog.logd(a4, "IntroductoryCallbackController", "notifyStatusChanged callback success " + str + " " + str2 + " " + i);
        } catch (Throwable th) {
            omr.a("IntroductoryCallbackController", str + " " + th + " notifyStatusChanged error");
            String a5 = a.a();
            TLog.loge(a5, "IntroductoryCallbackController", str + "notifyStatusChanged error " + th);
        }
    }
}
