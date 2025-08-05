package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bqe implements bqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26042a;
    private static bqd b;

    static {
        kge.a(964874881);
        kge.a(-2080136334);
        b = new bqe();
        f26042a = true;
    }

    public static bqd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bqd) ipChange.ipc$dispatch("f02e5c9", new Object[0]) : b;
    }

    private bqe() {
    }

    @Override // tb.bqd
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!f26042a) {
        } else {
            String str3 = str + "#" + str2;
        }
    }

    @Override // tb.bqd
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!f26042a) {
        } else {
            String str3 = str + "#" + str2;
        }
    }

    @Override // tb.bqd
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (!f26042a) {
        } else {
            Log.e("#UMF_LOGGER#", str + "#" + str2);
        }
    }
}
