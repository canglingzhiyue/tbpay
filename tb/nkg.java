package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.taobao.windvane.cache.d;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.privacyguard.config.RuleConfig;
import com.taobao.privacyguard.config.b;
import com.taobao.speech.util.e;
import com.taobao.tao.homepage.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class nkg implements nke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f31530a;
    public static List<String> b;

    @Override // tb.nke
    public boolean a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afdd1f5", new Object[]{this, invocation})).booleanValue();
        }
        return false;
    }

    @Override // tb.nke
    public void b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75195090", new Object[]{this, invocation});
        }
    }

    static {
        kge.a(578028743);
        kge.a(2043963864);
        String[] strArr = {"android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.WRITE_CALENDAR", e.CAMERA, "android.permission.RECORD_AUDIO", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", a.ACCESS_FINE_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"};
        f31530a = strArr;
        b = Arrays.asList(strArr);
    }

    @Override // tb.nke
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        SharedPreferences sharedPreferences = com.taobao.privacyguard.a.a().b().getSharedPreferences("sensitive_permissions", 4);
        RuleConfig b2 = b.a().b();
        if (b2 != null && !b2.isReportPermissionCheck()) {
            return;
        }
        long j = sharedPreferences.getLong("last_check_time", -1L);
        long j2 = sharedPreferences.getLong("last_commit_time", -1L);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = (b2 == null || b2.permissionCheckInterval == -1) ? 86400L : b2.permissionCheckInterval;
        if (j != -1 && currentTimeMillis - j <= j3 * 1000) {
            return;
        }
        JSONObject c = c();
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(sharedPreferences.getString("last_permission_status", ""));
        } catch (Throwable th) {
            Log.e("PermissionDiffReporter", "init: can not obtain last permission info!");
            th.printStackTrace();
        }
        if (!a(c, jSONObject) || j2 == -1 || currentTimeMillis - j2 > d.DEFAULT_MAX_AGE) {
            a(c);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("last_check_time", currentTimeMillis);
            edit.putLong("last_commit_time", currentTimeMillis);
            edit.putString("last_permission_status", c.toString());
            edit.apply();
            String str = "init: report permission info : " + c;
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putLong("last_check_time", currentTimeMillis);
        edit2.apply();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("grantResult");
        AppMonitor.register(nkd.MONITOR_MODULE, "PermissionCheck", MeasureSet.create(), create);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            Log.e("PermissionDiffReporter", "report: current permission info is null!");
        } else {
            DimensionValueSet create = DimensionValueSet.create();
            create.setValue("grantResult", jSONObject.toString());
            AppMonitor.Stat.commit(nkd.MONITOR_MODULE, "PermissionCheck", create, MeasureValueSet.create());
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("71733358", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        Application b2 = com.taobao.privacyguard.a.a().b();
        if (b2 == null) {
            Log.e("PermissionDiffReporter", "getCurrentPermissionInfo: context is null!");
            return jSONObject;
        }
        try {
            RuleConfig b3 = b.a().b();
            if (b3 != null && b3.getPermissionCheckList() != null) {
                b = b3.getPermissionCheckList();
            }
            for (String str : b) {
                int checkSelfPermission = ContextCompat.checkSelfPermission(b2, str);
                if (checkSelfPermission == -2) {
                    checkSelfPermission = 1;
                } else if (checkSelfPermission == -1) {
                    checkSelfPermission = 2;
                } else if (checkSelfPermission == 0) {
                    checkSelfPermission = 3;
                }
                jSONObject.put(str, checkSelfPermission);
            }
        } catch (Throwable th) {
            Log.e("PermissionDiffReporter", "getCurrentPermissionInfo: can not obtain current permission info!");
            th.printStackTrace();
        }
        return jSONObject;
    }

    public boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7938d2c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (jSONObject.optInt(next, -1) != jSONObject2.optInt(next, -1)) {
                return false;
            }
        }
        return true;
    }
}
