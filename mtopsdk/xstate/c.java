package mtopsdk.xstate;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f25046a;

    static {
        kge.a(385476693);
    }

    public c(Context context) {
        this.f25046a = context;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : b.b(str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            b.a(str, str2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b.a(this.f25046a);
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : b.a(str);
    }
}
