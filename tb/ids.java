package tb;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public abstract class ids {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-467118637);
    }

    public abstract String a();

    public abstract void a(FragmentActivity fragmentActivity, int i, int i2, Intent intent);

    public abstract void a(FragmentActivity fragmentActivity, View view);

    public abstract void a(FragmentActivity fragmentActivity, JSONObject jSONObject);

    public void a(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884da6c5", new Object[]{this, fragmentActivity, str});
        }
    }

    public abstract void a(FragmentActivity fragmentActivity, boolean z);

    public abstract void a(String str, JSONObject jSONObject);

    public abstract void b(FragmentActivity fragmentActivity);

    public void d(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af84fe98", new Object[]{this, fragmentActivity});
        }
    }

    public void e(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68fc8c37", new Object[]{this, fragmentActivity});
        }
    }

    public abstract String f(FragmentActivity fragmentActivity);

    public void g(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbeba775", new Object[]{this, fragmentActivity});
        }
    }
}
