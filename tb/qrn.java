package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.impl.collect.b;
import com.taobao.tinct.impl.config.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class qrn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f33051a = new AtomicBoolean(false);

    public static void a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
            return;
        }
        try {
            if (!a.a(context, str, i)) {
                return;
            }
            b.a().a(context);
        } catch (Exception e) {
            Log.e("TinctLauncher", "preInit exception", e);
        }
    }

    public static void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
        } else if (f33051a.get()) {
        } else {
            if (context == null) {
                Log.e("TinctLauncher", "The content is null");
                return;
            }
            Context applicationContext = context.getApplicationContext();
            a.a(applicationContext, hashMap);
            if (!a.a()) {
                Log.e("TinctLauncher", "The tinct is disable!");
                return;
            }
            b.a().b(applicationContext);
            f33051a.set(true);
            b.a().c();
        }
    }

    public static AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[0]) : f33051a;
    }
}
