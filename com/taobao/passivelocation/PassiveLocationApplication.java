package com.taobao.passivelocation;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.application.common.a;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.g;
import com.taobao.passivelocation.features.power.PowerStateChangedReceiver;
import com.taobao.runtimepermission.d;
import com.taobao.runtimepermission.f;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.homepage.a;
import tb.dcp;
import tb.kge;
import tb.ndr;
import tb.ndt;
import tb.ndw;
import tb.nea;

/* loaded from: classes7.dex */
public class PassiveLocationApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String LOG = null;
    private static final String USE_SERVICE = "useService";
    private static long timestamp;
    private final long LOCATION_TIME_THRESHOLD = 300000;
    private String SP_KEY = "isOpenPermissionCheckWhenLaunch";

    public static /* synthetic */ String access$000(PassiveLocationApplication passiveLocationApplication) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5487390", new Object[]{passiveLocationApplication}) : passiveLocationApplication.SP_KEY;
    }

    public static /* synthetic */ long access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue() : timestamp;
    }

    public static /* synthetic */ long access$102(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49363c3e", new Object[]{new Long(j)})).longValue();
        }
        timestamp = j;
        return j;
    }

    public static /* synthetic */ String access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("682607c7", new Object[0]) : LOG;
    }

    static {
        kge.a(1739344986);
        LOG = "lbs_application";
        timestamp = 0L;
    }

    public void onCreate(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce26ae5d", new Object[]{this, application});
        } else if (application == null) {
        } else {
            new TaoApplication().onCreate(application);
            registerReceivers();
        }
    }

    private void registerReceivers() {
        d a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97332908", new Object[]{this});
            return;
        }
        String str = LOG;
        nea.c(str, "device & os version：pid=" + Process.myPid() + ";product_model=" + Build.MODEL + ",sdk_version=" + Build.VERSION.SDK_INT + ",release=" + Build.VERSION.RELEASE);
        String processName = TaoApplication.getProcessName(ndw.f31376a);
        if (processName != null && "com.taobao.taobao".equals(processName)) {
            nea.c(LOG, "**********LBS module create**********");
            popPassiveLocationGuideDialog();
            boolean isCheckPermission = isCheckPermission(ndw.f31376a);
            savePermissionCheckState(ndw.f31376a, this.SP_KEY, "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tblocationcommon", "isOpenLaunchPermissionCheck", "true")));
            OrangeConfig.getInstance().registerListener(new String[]{"tblocationcommon"}, new g() { // from class: com.taobao.passivelocation.PassiveLocationApplication.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.g
                public void onConfigUpdate(String str2, boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str2, new Boolean(z2)});
                    } else if (!"tblocationcommon".equalsIgnoreCase(str2)) {
                    } else {
                        PassiveLocationApplication.this.savePermissionCheckState(ndw.f31376a, PassiveLocationApplication.access$000(PassiveLocationApplication.this), "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("tblocationcommon", "isOpenLaunchPermissionCheck", "true")));
                        String config = OrangeConfig.getInstance().getConfig("tblocationcommon", PassiveLocationApplication.USE_SERVICE, "false");
                        if (TextUtils.isEmpty(config)) {
                            return;
                        }
                        PassiveLocationApplication.this.savePermissionCheckState(ndw.f31376a, PassiveLocationApplication.USE_SERVICE, "true".equals(config));
                    }
                }
            });
            if (isCheckPermission && (a2 = f.a(ndw.f31376a, "TB_SHOPPING_PROCESS", new String[]{a.ACCESS_FINE_LOCATION})) != null && a2.b != null && a2.b.length > 0 && a2.b[0] != 0) {
                z = false;
            }
            if (!z) {
                nea.d(LOG, "不允许该场景请求定位");
                return;
            } else if (!(ndw.f31376a instanceof PanguApplication)) {
                return;
            } else {
                ((PanguApplication) ndw.f31376a).registerCrossActivityLifecycleCallback(new c() { // from class: com.taobao.passivelocation.PassiveLocationApplication.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.passivelocation.c, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                    public void onStopped(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("82d37207", new Object[]{this, activity});
                        }
                    }

                    @Override // com.taobao.passivelocation.c, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                    public void onStarted(Activity activity) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4b167bb", new Object[]{this, activity});
                            return;
                        }
                        try {
                            if (System.currentTimeMillis() - PassiveLocationApplication.access$100() < 300000) {
                                nea.d(PassiveLocationApplication.access$200(), "front so frequently！ ignore");
                                return;
                            }
                            PassiveLocationApplication.access$102(System.currentTimeMillis());
                            TBLocationClient a3 = TBLocationClient.a(Globals.getApplication());
                            TBLocationOption tBLocationOption = new TBLocationOption();
                            tBLocationOption.setDataModel(TBLocationOption.DataModel.NEED_ADDRESS);
                            tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.NO_CACHE);
                            tBLocationOption.setAccuracy(TBLocationOption.Accuracy.HEKTOMETER);
                            a3.a(tBLocationOption, new com.taobao.location.client.a() { // from class: com.taobao.passivelocation.PassiveLocationApplication.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.location.client.a
                                public void onLocationChanged(TBLocationDTO tBLocationDTO) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("240b6877", new Object[]{this, tBLocationDTO});
                                        return;
                                    }
                                    try {
                                        String access$200 = PassiveLocationApplication.access$200();
                                        nea.c(access$200, "切前台-位置信息：" + JSON.toJSONString(tBLocationDTO));
                                    } catch (Exception e) {
                                        nea.a(PassiveLocationApplication.access$200(), "切前台-回调处理异常", e);
                                    }
                                }
                            }, Looper.getMainLooper());
                        } catch (Exception unused) {
                        }
                    }
                });
                return;
            }
        }
        nea.c(LOG, "**********not taobao main process into**********");
    }

    private void registerPowerStateChangedReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47588dbb", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_BATTERY_LOW");
        intentFilter.addAction("android.intent.action.ACTION_BATTERY_OKAY");
        ndw.f31376a.registerReceiver(new PowerStateChangedReceiver(), intentFilter);
    }

    private void registerApmNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc33a2b", new Object[]{this});
        } else {
            com.taobao.application.common.c.a(new a.b() { // from class: com.taobao.passivelocation.PassiveLocationApplication.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        return;
                    }
                    try {
                        if (i == 1) {
                            if (!ndr.b) {
                                ndr.b = true;
                                ndw.b = System.currentTimeMillis();
                                if (new ndr(ndw.f31376a).c()) {
                                    ndt ndtVar = new ndt();
                                    ndtVar.a(ndw.f31376a);
                                    ndtVar.a(ndw.f31376a, true);
                                }
                            }
                        } else if (i != 2) {
                        } else {
                            if (ndr.b) {
                                ndr.b = false;
                                ndw.b = System.currentTimeMillis();
                                new ndr(ndw.f31376a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void savePermissionCheckState(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e23de3e", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(dcp.SP_NAME, 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public boolean isCheckPermission(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a53e1d8", new Object[]{this, context})).booleanValue();
        }
        try {
            return context.getSharedPreferences(dcp.SP_NAME, 0).getBoolean(this.SP_KEY, true);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean useService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66fc70b7", new Object[]{context})).booleanValue();
        }
        try {
            return context.getSharedPreferences(dcp.SP_NAME, 0).getBoolean(USE_SERVICE, false);
        } catch (Throwable unused) {
            return true;
        }
    }

    private void popPassiveLocationGuideDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc08a900", new Object[]{this});
            return;
        }
        try {
            startPassiveLocationService();
        } catch (Exception unused) {
        }
    }

    private void startPassiveLocationService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a07e922", new Object[]{this});
            return;
        }
        registerPowerStateChangedReceiver();
        registerApmNotify();
    }
}
