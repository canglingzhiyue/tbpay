package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.festival.a;
import com.taobao.android.festival.utils.d;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* loaded from: classes.dex */
public class giy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "festival.broadcast";

    /* renamed from: a  reason: collision with root package name */
    private static Runnable f28335a;

    static {
        kge.a(-2016028475);
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        final Application application = Globals.getApplication();
        if (application == null) {
            return;
        }
        d.b(f28335a);
        Runnable runnable = new Runnable() { // from class: tb.giy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a().l();
                Intent intent = new Intent(FestivalMgr.ACTION_FESTIVAL_CHANGE);
                intent.putExtra(FestivalMgr.EXTRA_FESTIVAL_CHANGE_REASON, FestivalMgr.FESTIVAL_CHANGE_REASON_CONFIG_CHANGE);
                LocalBroadcastManager.getInstance(application).sendBroadcast(intent);
            }
        };
        f28335a = runnable;
        d.a(runnable, j);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        gjf.a();
        a.a().e();
        Intent intent = new Intent(FestivalMgr.ACTION_FESTIVAL_CHANGE);
        intent.putExtra(FestivalMgr.EXTRA_FESTIVAL_CHANGE_REASON, str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void a(Context context, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
            return;
        }
        Intent intent = new Intent(FestivalMgr.ACTION_TABBAR_CHANGE_DONE);
        intent.putExtra(FestivalMgr.COMMON_EXTRA_REASON, hashMap);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
