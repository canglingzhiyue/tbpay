package tb;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ServiceConnection;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jez implements JvmUncaughtCrashListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29513a;

    public jez(Context context) {
        this.f29513a = context;
    }

    @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
    public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
        }
        Throwable a2 = jgt.a(th);
        if (!(a2 instanceof AndroidRuntimeException) && !(a2 instanceof IllegalArgumentException)) {
            return null;
        }
        String message = a2.getMessage();
        if (!"can't deliver broadcast".equals(message) && !"regist too many Broadcast Receivers".equals(message)) {
            return null;
        }
        try {
            String a3 = a();
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("receivers&services", a3);
            return hashMap;
        } catch (Exception e) {
            jfj.b(e);
            return null;
        }
    }

    private String a(jgp jgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d7841b", new Object[]{this, jgpVar});
        }
        StringBuilder sb = new StringBuilder();
        Map map = (Map) jgpVar.a("mReceivers").a();
        HashMap hashMap = new HashMap();
        synchronized (map) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        for (Map map2 : hashMap.values()) {
            for (BroadcastReceiver broadcastReceiver : map2.keySet()) {
                String name = broadcastReceiver.getClass().getName();
                Integer num = (Integer) hashMap2.get(name);
                if (num != null) {
                    hashMap2.put(name, Integer.valueOf(num.intValue() + 1));
                } else {
                    hashMap2.put(name, 1);
                }
            }
        }
        sb.append("receivers:");
        sb.append(hashMap2);
        sb.append("\n");
        return sb.toString();
    }

    private String b(jgp jgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8842fba", new Object[]{this, jgpVar});
        }
        StringBuilder sb = new StringBuilder();
        Map map = (Map) jgpVar.a("mServices").a();
        HashMap hashMap = new HashMap();
        synchronized (map) {
            hashMap.putAll(map);
        }
        HashMap hashMap2 = new HashMap();
        for (Map map2 : hashMap.values()) {
            for (int i = 0; i < map2.size(); i++) {
                for (ServiceConnection serviceConnection : map2.keySet()) {
                    String name = serviceConnection.getClass().getName();
                    Integer num = (Integer) hashMap2.get(name);
                    if (num != null) {
                        hashMap2.put(name, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap2.put(name, 1);
                    }
                }
            }
        }
        sb.append("services:");
        sb.append(hashMap2.toString());
        sb.append("\n");
        return sb.toString();
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        Context context = this.f29513a;
        jgp a2 = jgp.a(context instanceof Application ? (Application) context : (Application) context.getApplicationContext()).a("mLoadedApk");
        try {
            sb.append(a(a2));
        } catch (Exception e) {
            jfj.b(e);
        }
        try {
            sb.append(b(a2));
        } catch (Exception e2) {
            jfj.b(e2);
        }
        return sb.toString();
    }
}
