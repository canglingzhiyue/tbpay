package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes8.dex */
public class ocs implements oct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f31921a;

    static {
        kge.a(756230572);
        kge.a(-1872533319);
    }

    public static /* synthetic */ JSONObject a(ocs ocsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5cc24079", new Object[]{ocsVar}) : ocsVar.f31921a;
    }

    public ocs(String str) {
        this.f31921a = JSONObject.parseObject(str);
    }

    @Override // tb.oct
    public void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.ocs.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Nav.from(activity).withFlags(65536).disableTransition().toUri(ocs.a(ocs.this).getString("url"));
                    }
                }
            }, 10L);
        }
    }
}
