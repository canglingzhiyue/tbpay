package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.model.NavigationTabConstraints;

/* loaded from: classes8.dex */
public class omn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f32178a;
    private static a b;

    /* loaded from: classes8.dex */
    public interface a {
        int a(String str);

        String a(int i);
    }

    static {
        b bVar = new b();
        f32178a = bVar;
        b = bVar;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b20954ab", new Object[]{aVar});
        } else if (aVar == null) {
            TLog.loge("BizUtil", "setBizTypeIndexConverter", "converter is null");
        } else {
            b = aVar;
        }
    }

    /* loaded from: classes8.dex */
    public static class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.omn.a
        public String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
            }
            if (i == 0) {
                return NavigationTabConstraints.TAB_BIZ_HOMEPAGE;
            }
            if (i == 1) {
                return "tab2";
            }
            if (i == 2) {
                return "message";
            }
            if (i == 3) {
                return "cart";
            }
            if (i != 4) {
                return null;
            }
            return "mytaobao";
        }

        private b() {
        }

        @Override // tb.omn.a
        public int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
            }
            if (NavigationTabConstraints.TAB_BIZ_HOMEPAGE.equals(str)) {
                return 0;
            }
            if ("message".equals(str)) {
                return 2;
            }
            if ("mytaobao".equals(str)) {
                return 4;
            }
            if ("cart".equals(str)) {
                return 3;
            }
            return "tab2".equals(str) ? 1 : -1;
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : b.a(str);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : b.a(i);
    }
}
