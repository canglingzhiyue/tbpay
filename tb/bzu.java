package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public final class bzu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sBizName = "tradeHybridContainer";
    public static final String sPid = "29266-tracker";

    static {
        kge.a(-1288598085);
    }

    public static void a(jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (!(jptVar instanceof a)) {
            throw new IllegalArgumentException("请使用UltronTradeHybridCustomModel");
        } else {
            jpr.a(jptVar);
        }
    }

    public static void a(sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (!(sdaVar instanceof b)) {
            throw new IllegalArgumentException("请使用UltronTradeHybridMtopModel");
        } else {
            jpr.a(sdaVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-362334955);
        }

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9ffb5e59", new Object[]{str}) : new a(bzu.sBizName, str, bzu.sPid, "http://taobao.com/jstracker/android/tradeHybridContainer.html");
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends sda {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2077451358);
        }

        private b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static b a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("401f43e9", new Object[]{str, new Boolean(z)}) : new b(bzu.sBizName, bzu.sPid, "http://taobao.com/jstracker/android/tradeHybridContainer.html", str, z);
        }
    }
}
