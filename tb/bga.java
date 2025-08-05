package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.ITinctOperater;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bga {

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void a(String str, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1453b77", new Object[]{str, mtopResponse});
            } else if (TextUtils.isEmpty(str) || mtopResponse == null) {
            } else {
                bgc.a(str, mtopResponse);
            }
        }

        public static void b(String str, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6d94478", new Object[]{str, mtopResponse});
            } else if (TextUtils.isEmpty(str) || mtopResponse == null) {
            } else {
                bgc.b(str, mtopResponse);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            } else {
                ITinctOperater.getInstance().markABUsed(str, str2, str3, str4);
            }
        }

        public static void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            } else {
                ITinctOperater.getInstance().markBatchTouchStoneUsed(str, str2);
            }
        }

        public static void b(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            } else {
                ITinctOperater.getInstance().markUsed(str2, str3, str4, str);
            }
        }

        public static void a(String str, String str2, String str3, String str4, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd749044", new Object[]{str, str2, str3, str4, new Boolean(z)});
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            } else {
                ITinctOperater.getInstance().markUsed(str2, str3, str4, str, z);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            } else {
                bgb.a(str, "dataParse", str2, str3, str4);
            }
        }

        public static void b(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            } else {
                bgb.a(str, "eventProcess", str2, str3, str4);
            }
        }

        public static void a(String str, String str2, Throwable th) {
            Class<?> cls;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            } else if (th == null || (cls = th.getClass()) == null) {
            } else {
                String name = cls.getName();
                String str3 = null;
                StackTraceElement[] stackTrace = th.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    str3 = stackTrace[0].toString();
                }
                String str4 = "";
                if (name == null) {
                    name = str4;
                }
                if (str3 != null) {
                    str4 = str3;
                }
                bgb.a(str, "exception", str2, name, str4);
            }
        }
    }
}
