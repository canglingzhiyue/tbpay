package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bhv;

/* loaded from: classes.dex */
public class bht implements bhu, bhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bht f25916a;
    private Map<String, Boolean> c = new ConcurrentHashMap();
    private List<bhv> b = new ArrayList();

    public static bht a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bht) ipChange.ipc$dispatch("34c166f8", new Object[]{context});
        }
        if (f25916a == null) {
            synchronized (bht.class) {
                if (f25916a == null) {
                    f25916a = new bht(context);
                }
            }
        }
        return f25916a;
    }

    private bht(Context context) {
        if (v.f(context)) {
            try {
                a(new bhw(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (v.e(context)) {
            a(new bhs());
        } else {
            a(new bhv.a());
        }
    }

    @Override // tb.bhv
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str).booleanValue();
        }
        for (bhv bhvVar : this.b) {
            if (bhvVar.a(str)) {
                this.c.put(str, true);
                Log.e("FeatureSourceChain", "canUseHistoryFeature...");
                return true;
            }
        }
        this.c.put(str, false);
        return false;
    }

    @Override // tb.bhv
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        for (bhv bhvVar : this.b) {
            if (bhvVar.a(str) && !TextUtils.isEmpty(bhvVar.b(str))) {
                return bhvVar.b(str);
            }
        }
        return null;
    }

    @Override // tb.bhv
    public boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{this, context, str, str2})).booleanValue();
        }
        for (bhv bhvVar : this.b) {
            if (bhvVar.a(str)) {
                return bhvVar.a(context, str, str2);
            }
        }
        return false;
    }

    public void a(bhv bhvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c00be8", new Object[]{this, bhvVar});
        } else {
            this.b.add(bhvVar);
        }
    }
}
