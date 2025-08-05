package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.n;

/* loaded from: classes6.dex */
public class hvf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String b = "OpenCart";
    private static AliLogInterface c = n.a();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28810a = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public interface a {
        void a(String str);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b;
    }

    public static /* synthetic */ AliLogInterface b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliLogInterface) ipChange.ipc$dispatch("af68b83c", new Object[0]) : c;
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
            return;
        }
        if (f28810a) {
            a(d(str, strArr), new a() { // from class: tb.hvf.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hvf.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        hvf.a();
                    }
                }
            });
        }
        if (c == null) {
            return;
        }
        a(d(str, strArr), new a() { // from class: tb.hvf.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hvf.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                } else {
                    hvf.b().b(hvf.a(), str2);
                }
            }
        });
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13c1eb", new Object[]{str, strArr});
            return;
        }
        if (f28810a) {
            a(d(str, strArr), new a() { // from class: tb.hvf.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.hvf.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    } else {
                        Log.e(hvf.a(), str2);
                    }
                }
            });
        }
        if (c == null) {
            return;
        }
        a(d(str, strArr), new a() { // from class: tb.hvf.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.hvf.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                } else {
                    hvf.b().d(hvf.a(), str2);
                }
            }
        });
    }

    private static void a(String str, a aVar) {
        String substring;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9876962d", new Object[]{str, aVar});
        } else if (str == null) {
        } else {
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    substring = str.substring(i);
                } else {
                    substring = str.substring(i, i2);
                }
                if (i != 0) {
                    substring = "----- log split -----\n" + substring;
                }
                aVar.a(substring);
                i = i2;
            }
        }
    }

    private static String d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a0b2d6", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.append(strArr[i]);
                if (strArr.length > 1) {
                    sb.append(" |");
                }
            } else {
                sb.append(" ");
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }
}
