package com.taobao.passivelocation.service;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;
import tb.ndr;
import tb.ndt;
import tb.ndw;

/* loaded from: classes7.dex */
public class UserSwitchControlService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_UPDATE_CONFIG = "com.taobao.passivelocation.Update_Config";

    /* renamed from: a  reason: collision with root package name */
    private final String f18677a;
    private ndr b;
    private ndt c;

    static {
        kge.a(-380876393);
    }

    public static /* synthetic */ Object ipc$super(UserSwitchControlService userSwitchControlService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1899989668) {
            super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    public UserSwitchControlService() {
        this("UserControlService");
    }

    public UserSwitchControlService(String str) {
        super(str);
        this.f18677a = "LocationService";
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        ndw.f31376a = getApplicationContext();
        this.b = new ndr(ndw.f31376a);
        this.c = new ndt();
        AppMonitor.Counter.commit("passivelocation", "UserSwitchControlService", 1.0d);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        super.onStart(intent, i);
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            try {
                if (!TextUtils.isEmpty(intent.getAction()) && intent.getAction().equals(ACTION_UPDATE_CONFIG)) {
                    if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passivelocationoption", "off"))) {
                        return;
                    }
                    if (intent.hasExtra("enabled")) {
                        if (intent.getBooleanExtra("enabled", false)) {
                            this.b.a(intent.getBooleanExtra("enabled", false));
                        } else {
                            this.c.a(getApplicationContext());
                            new ndr(ndw.f31376a).b(false);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
