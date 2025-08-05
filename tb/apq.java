package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public class apq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static apq f25504a;
    private b b = new b();
    private a c = new a();

    static {
        kge.a(-732275667);
        f25504a = new apq();
    }

    private apq() {
    }

    public static apq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (apq) ipChange.ipc$dispatch("f026f3c", new Object[0]) : f25504a;
    }

    public String[] a(String[] strArr, boolean z) {
        Comparator comparator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("b52688c", new Object[]{this, strArr, new Boolean(z)});
        }
        if (z) {
            comparator = this.c;
        } else {
            comparator = this.b;
        }
        if (comparator == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        Arrays.sort(strArr, comparator);
        return strArr;
    }

    /* loaded from: classes2.dex */
    public class b implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-166835179);
            kge.a(-2099169482);
        }

        private b() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
        }

        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                return str.compareTo(str2) * (-1);
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1394747783);
            kge.a(-2099169482);
        }

        private a() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
        }

        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                return str.compareTo(str2);
            }
            return 0;
        }
    }
}
