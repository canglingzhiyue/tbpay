package android.taobao.windvane.jsbridge;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<View, Boolean> f1675a;

    static {
        kge.a(360892780);
        f1675a = new ConcurrentHashMap<>();
    }

    public static void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{view, new Boolean(z)});
        } else if (!android.taobao.windvane.config.j.commonConfig.cW || view == null) {
        } else {
            f1675a.put(view, Boolean.valueOf(z));
        }
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
        } else {
            f1675a.remove(view);
        }
    }

    public static boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{view})).booleanValue();
        }
        if (!android.taobao.windvane.config.j.commonConfig.cW) {
            return true;
        }
        if (view == null) {
            return false;
        }
        Boolean bool = f1675a.get(view);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
