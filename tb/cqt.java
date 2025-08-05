package tb;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class cqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26451a;
    private a b;

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z, View view);

        void a(boolean z, Integer num, String str);

        int b(int i);

        void b(boolean z, Integer num, String str);

        void s();
    }

    static {
        kge.a(1501507752);
    }

    public abstract void a(Activity activity, Map<String, String> map);

    public abstract void a(JSONArray jSONArray);

    public abstract void a(JSONObject jSONObject);

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        }
    }

    public abstract void a(String str, String str2, Map<String, ? extends Object> map);

    public abstract void b();

    public abstract void b(JSONObject jSONObject);

    public abstract void b(boolean z);

    public abstract void c();

    public abstract void c(boolean z);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract boolean g();

    public cqt(a aVar) {
        this.b = aVar;
    }

    public final a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6a8ab8b3", new Object[]{this}) : this.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f26451a = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f26451a;
    }
}
