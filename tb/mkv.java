package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.g;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class mkv extends mkh<mkw> implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final boolean f31078a;
    private final Handler b;
    private final List<mku> c = new ArrayList();

    public static /* synthetic */ Object ipc$super(mkv mkvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$is0lrOHjqZ_edBrnWQeYa9OV8pw(mkv mkvVar, Object obj, String str) {
        mkvVar.a(obj, str);
    }

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [tb.mkw, java.lang.Object] */
    @Override // tb.mkh
    public /* synthetic */ mkw a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map}) : c(i, map);
    }

    static {
        f31078a = Build.VERSION.SDK_INT >= 23;
    }

    public mkv(Handler handler) {
        this.b = handler;
    }

    public void a(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (!f31078a) {
        } else {
            this.b.post(new Runnable() { // from class: tb.-$$Lambda$mkv$is0lrOHjqZ_edBrnWQeYa9OV8pw
                @Override // java.lang.Runnable
                public final void run() {
                    mkv.lambda$is0lrOHjqZ_edBrnWQeYa9OV8pw(mkv.this, obj, str);
                }
            });
        }
    }

    public /* synthetic */ void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
            return;
        }
        this.c.add(new mku(obj, str, SystemClock.uptimeMillis()));
        TLog.loge("MetricKit.ReachabilityObjectCollector", "Watching " + obj.getClass().getName() + " with tag " + str);
    }

    @Override // tb.mkh
    public int[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ab8ad2ba", new Object[]{this}) : new int[]{4};
    }

    @Override // tb.mkh
    public void b(int i, Map<String, ?> map) {
        Fragment fragment;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
            return;
        }
        Object obj = map.get(mln.PARAM_LIFECYCLE);
        int i2 = -1;
        if (obj instanceof Integer) {
            i2 = ((Integer) obj).intValue();
        }
        if (i2 < 0) {
            return;
        }
        if (i2 == 107) {
            Object obj2 = map.get("page");
            if (obj2 instanceof Activity) {
                Activity activity = (Activity) obj2;
                Intent intent = activity.getIntent();
                a(intent != null ? intent.getStringExtra("apmPageSession") : "null", activity);
            }
        }
        if (i2 == 212) {
            Object obj3 = map.get("page");
            if ((obj3 instanceof Fragment) && (view = (fragment = (Fragment) obj3).getView()) != null) {
                a(a(fragment) + "_" + fragment.getClass().getName(), view);
            }
        }
        if (i2 != 213) {
            return;
        }
        Object obj4 = map.get("page");
        if (!(obj4 instanceof Fragment)) {
            return;
        }
        Fragment fragment2 = (Fragment) obj4;
        a(a(fragment2), fragment2);
    }

    private String a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f012096", new Object[]{this, fragment});
        }
        Bundle arguments = fragment.getArguments();
        return arguments != null ? arguments.getString("apmPageSession") : "null";
    }

    public mkw c(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mkw) ipChange.ipc$dispatch("d984c401", new Object[]{this, new Integer(i), map});
        }
        if (!f31078a) {
            return new mkw();
        }
        return new mkw(SystemClock.uptimeMillis(), a());
    }

    private List<mku> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<mku> it = this.c.iterator();
        while (it.hasNext()) {
            mku next = it.next();
            if (next.get() != null) {
                arrayList.add(next);
            } else {
                it.remove();
            }
        }
        return arrayList;
    }
}
