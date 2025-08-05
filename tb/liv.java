package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class liv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f30670a;
    private Object b;
    private String c;
    private String d;

    static {
        kge.a(-1863184056);
        kge.a(-1390502639);
    }

    public liv(View view, Object obj, String str, String str2) {
        this.f30670a = view;
        this.b = obj;
        this.c = str2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Object obj2 = this.b;
        if (obj2 instanceof String) {
            obj = (String) obj2;
        } else {
            obj = obj2 instanceof Integer ? obj2.toString() : null;
        }
        lda.b(this.d, this.c, obj, this.f30670a, null);
    }
}
