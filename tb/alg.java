package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class alg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f25419a;
    private static SharedPreferences.Editor b;

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]);
        }
        c();
        return f25419a;
    }

    public static SharedPreferences.Editor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("2f094b28", new Object[0]);
        }
        d();
        return b;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (f25419a != null) {
        } else {
            f25419a = alf.f25418a.getSharedPreferences("deviceevaluator", 0);
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (b != null) {
        } else {
            c();
            b = f25419a.edit();
        }
    }
}
