package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class mxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1300212140);
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.mxp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
                        edit.putString("MyTaobaoOrderNumberCache", str);
                        edit.putString("OrderNumUserId", Login.getUserId());
                        edit.commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.mxp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
                        String string = defaultSharedPreferences.getString("OrderNumUserId", "null");
                        if (TextUtils.isEmpty(string) || TextUtils.equals(string, Login.getUserId())) {
                            return;
                        }
                        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                        edit.remove("MyTaobaoOrderNumberCache");
                        edit.remove("OrderNumUserId");
                        edit.commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
