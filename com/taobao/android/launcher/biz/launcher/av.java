package com.taobao.android.launcher.biz.launcher;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.base.Versions;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.task.Coordinator;
import com.taobao.message.notification.base.VibratorAndMediaManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kkr;
import tb.onj;
import tb.xpb;

/* loaded from: classes.dex */
public class av extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public av(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        xpb.a(application, hashMap);
        ((PanguApplication) application).registerCrossActivityLifecycleCallback(new a());
    }

    /* loaded from: classes5.dex */
    public static class a implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f13027a;
        public boolean b;
        public Coordinator.TaggedRunnable e;
        public Coordinator.TaggedRunnable f;
        public static final String[] groupNames = {"agoo"};
        public static volatile boolean c = false;
        public static volatile boolean d = false;

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            }
        }

        private a() {
            this.b = false;
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a228d0", new Object[]{aVar});
            } else {
                aVar.b();
            }
        }

        public static /* synthetic */ void a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("809cbe9a", new Object[]{aVar, str});
            } else {
                aVar.a(str);
            }
        }

        public static /* synthetic */ void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("967ac32f", new Object[]{aVar});
            } else {
                aVar.c();
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
                return;
            }
            this.f13027a = Globals.getApplication().getApplicationContext();
            this.b = false;
            if (this.e == null) {
                this.e = new Coordinator.TaggedRunnable("remoteconfig") { // from class: com.taobao.android.launcher.biz.launcher.av.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (a.this.b) {
                                return;
                            }
                            a.a(a.this);
                            a.b(a.this);
                        } catch (Throwable th) {
                            try {
                                Log.e("AgooConfigObserver", "AgooConfigCrossActivityLifecycleObserver error=" + th.toString(), null);
                            } finally {
                                a.d = false;
                            }
                        }
                    }
                };
            }
            if (d) {
                return;
            }
            d = true;
            Coordinator.postTask(this.e, 30000);
        }

        private void b() {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f13027a.getSharedPreferences("bindServiceConfig", 0);
                String str = "AgooConfigCrossActivityLifecycleObserver,registerAgoo last_time=" + a(j);
                if (System.currentTimeMillis() - sharedPreferences.getLong("last_time", 0L) < 86400000) {
                    String str2 = "AgooConfigCrossActivityLifecycleObserver,registerAgoo_time is end.currentTime=" + a(System.currentTimeMillis());
                    return;
                }
                boolean z = PreferenceManager.getDefaultSharedPreferences(this.f13027a).getBoolean(VibratorAndMediaManager.ISOPENSERVICE, true);
                String str3 = "is_OpenService param,flag=" + z;
                if (z) {
                    onj.a(this.f13027a);
                } else {
                    UTAnalytics.getInstance().getTracker("accs").send(new UTOriginalCustomHitBuilder("agooUnregister", 66001, a((Object) UtilityImpl.getDeviceId(this.f13027a)), a(Boolean.valueOf(z)), null, null).build());
                    TaobaoRegister.unregister(this.f13027a, null);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_time", System.currentTimeMillis());
                edit.commit();
            } catch (Throwable th) {
                Log.e("AgooConfigObserver", "registerAgoo,error=" + th.toString());
            }
        }

        private static String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
            }
            if (obj == null) {
                return "";
            }
            if (obj instanceof String) {
                return ((String) obj).toString();
            }
            if (obj instanceof Integer) {
                return "" + ((Integer) obj);
            } else if (obj instanceof Long) {
                return "" + ((Long) obj);
            } else if (obj instanceof Double) {
                return "" + ((Double) obj);
            } else if (obj instanceof Float) {
                return "" + ((Float) obj);
            } else if (obj instanceof Short) {
                return "" + ((Short) obj);
            } else if (obj instanceof Byte) {
                return "" + ((Byte) obj);
            } else if (obj instanceof Boolean) {
                return ((Boolean) obj).toString();
            } else {
                return obj instanceof Character ? ((Character) obj).toString() : obj.toString();
            }
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("agoo", "default", "default");
            String str = "agooConfig=" + config;
            a(config);
            OrangeConfig.getInstance().registerListener(groupNames, new com.taobao.orange.f() { // from class: com.taobao.android.launcher.biz.launcher.av.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.f
                public void onConfigUpdate(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0b193b", new Object[]{this, str2});
                        return;
                    }
                    String config2 = OrangeConfig.getInstance().getConfig("agoo", "default", "default");
                    String str3 = "onConfigUpdate,agooConfig=" + config2;
                    a.a(a.this, config2);
                }
            });
        }

        public static final String a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
            }
            if (j == 0) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j));
            } catch (Throwable unused) {
                return "none";
            }
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            try {
            } catch (Exception e) {
                if (Versions.isDebug()) {
                    String str2 = "saveAgooConfig fail:" + e.toString();
                }
            }
            if (StringUtils.equals(str, "default")) {
                return;
            }
            SharedPreferences.Editor edit = this.f13027a.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            edit.putString("agooConfig", str);
            edit.commit();
            Versions.isDebug();
        }

        public static String a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
            }
            try {
                return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString("agooConfig", "");
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            } else if (c) {
            } else {
                if (this.f == null) {
                    this.f = new Coordinator.TaggedRunnable("pingAppStart") { // from class: com.taobao.android.launcher.biz.launcher.av.a.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                a.c = true;
                                a.this.a();
                            } catch (Throwable th) {
                                try {
                                    String str = "onStarted,error=" + th.toString();
                                } finally {
                                    a.c = false;
                                }
                            }
                        }
                    };
                }
                Coordinator.postTask(this.f, 5000);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            String a2 = a(this.f13027a);
            if (StringUtils.isEmpty(a2) || StringUtils.equals(a2, "default")) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(a2);
                int length = jSONArray.length();
                if (length <= 0) {
                    return;
                }
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("app" + i);
                        if (jSONArray2 != null) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("pack");
                            String string3 = jSONObject2.getString("service");
                            boolean z = jSONObject2.getBoolean("enabled");
                            int i2 = jSONObject2.getInt(kkr.PERCENT);
                            String str = "pingapp service:" + string3 + ",pack=" + string2 + ",service=" + string3 + ",percent=" + i2;
                            if (z) {
                                TaobaoRegister.pingApp(this.f13027a, string, string2, string3, i2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.e("AgooConfigObserver", "pingApp error,e=" + th.toString());
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            } else {
                this.b = true;
            }
        }
    }
}
