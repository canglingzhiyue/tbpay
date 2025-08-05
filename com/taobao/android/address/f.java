package com.taobao.android.address;

import android.content.Context;
import android.content.IntentFilter;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.AddressKinshipBridge;
import com.taobao.android.address.wrapper.weex.WVAddressModule;
import com.taobao.android.address.wrapper.weex.WXAddressModule;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.weex.WXSDKEngine;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.efe;
import tb.mqt;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONSTANT_ADDRESS_ZCACHE_LIST_DEFAULT = "receiver-address-themis-address;receiver-address-weex2;receiver-address-weex2-list";
    public static final String SP_FILE_NAME = "address_config";
    public static final String SP_KEY_ADDRESS_ZCACHE_LIST = "address_zcache_list";
    public static final String TAG = "address.AddressConfig";

    /* renamed from: a  reason: collision with root package name */
    private static Context f8976a;

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            f8976a = context;
            c();
            d();
            q.a("aluAddress", (Class<? extends android.taobao.windvane.jsbridge.e>) AddressKinshipBridge.class);
            q.a(WVAddressModule.PLUGIN_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) WVAddressModule.class);
            mqt.b(context);
            mqt.a(10000);
            mqt.a(context);
            mqt.c(context);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "init error", th);
        }
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        try {
            if (Login.checkSessionValid()) {
                AdapterForTLog.loge(TAG, "address prefetch");
                efe.g();
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginAction.NOTIFY_LOGIN_SUCCESS.name());
            f8976a.getApplicationContext().registerReceiver(new AddressLoginBroadcast(), intentFilter);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "zcachePrefetch error", th);
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("address", WXAddressModule2.class);
            WXSDKEngine.registerModule(WXAddressModule.PLUGIN_NAME, WXAddressModule.class);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "initWeex1Bridge error", th);
        }
    }

    public static Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[0]) : f8976a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            return Mtop.instance(a()).getMtopConfig().envMode.getEnvMode() == EnvModeEnum.PREPARE.getEnvMode();
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isPre error", th);
            return false;
        }
    }
}
