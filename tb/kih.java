package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class kih {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-20692398);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, "", "", null);
        }
    }

    public static void a(String str, String str2, String str3, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd046cf", new Object[]{str, str2, str3, aVar});
            return;
        }
        HashMap hashMap = null;
        if (aVar != null) {
            try {
                hashMap = new HashMap(4);
                hashMap.put("widgetId", String.valueOf(a.a(aVar)));
                hashMap.put("typeId", a.b(aVar));
                hashMap.put("channel", a.c(aVar));
                hashMap.put("receiverName", a.d(aVar));
            } catch (Exception e) {
                kif.a("sendTrack error：" + e.getMessage());
                return;
            }
        }
        kig.a(str, str2, str3, hashMap);
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Integer f30098a;
        private String b;
        private String c;
        private String d;

        static {
            kge.a(703899433);
        }

        public static /* synthetic */ Integer a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("7f7d6558", new Object[]{aVar}) : aVar.f30098a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c034642e", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4864a40d", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d094e3ec", new Object[]{aVar}) : aVar.d;
        }

        public a a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc667370", new Object[]{this, num});
            }
            this.f30098a = num;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("263143ad", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae61838c", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3691c36b", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }
    }
}
