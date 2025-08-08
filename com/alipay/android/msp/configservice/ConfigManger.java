package com.alipay.android.msp.configservice;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.rrv;

/* loaded from: classes3.dex */
public class ConfigManger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConfigManger f4477a;
    private final PersistenceManager c;
    private final UpdatePolicyEvaluator d;
    private final ConfigFetcher e;
    private String f;
    private final MemoryCache b = new MemoryCache();
    private final AtomicBoolean g = new AtomicBoolean(false);

    public static /* synthetic */ String a(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bf03f5b", new Object[]{configManger}) : configManger.f;
    }

    public static /* synthetic */ String a(ConfigManger configManger, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e558a11", new Object[]{configManger, str});
        }
        configManger.f = str;
        return str;
    }

    public static /* synthetic */ ConfigFetcher b(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigFetcher) ipChange.ipc$dispatch("85e92eb4", new Object[]{configManger}) : configManger.e;
    }

    public static /* synthetic */ void b(ConfigManger configManger, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d277ec", new Object[]{configManger, jSONArray});
        } else {
            configManger.a(jSONArray);
        }
    }

    public static /* synthetic */ UpdatePolicyEvaluator e(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UpdatePolicyEvaluator) ipChange.ipc$dispatch("930c3008", new Object[]{configManger}) : configManger.d;
    }

    public static /* synthetic */ AtomicBoolean f(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("53f49f80", new Object[]{configManger}) : configManger.g;
    }

    private ConfigManger(Context context) {
        this.c = new PersistenceManager(context);
        this.d = UpdatePolicyEvaluator.getInstance(context);
        this.e = new ConfigFetcher(context);
        String configs = this.c.getConfigs();
        JSONObject buildParams = this.e.buildParams(null);
        JSONObject parseObject = JSONObject.parseObject(this.c.getLastEnvParams());
        boolean z = true;
        if (buildParams != null && parseObject != null && StringUtils.equals(buildParams.getString(rrv.PRODUCT_ID), parseObject.getString(rrv.PRODUCT_ID)) && StringUtils.equals(buildParams.getString("systemType"), parseObject.getString("systemType")) && StringUtils.equals(buildParams.getString("clientVersion"), parseObject.getString("clientVersion")) && StringUtils.equals(buildParams.getString("mobileBrand"), parseObject.getString("mobileBrand")) && StringUtils.equals(buildParams.getString("mobileModel"), parseObject.getString("mobileModel")) && StringUtils.equals(buildParams.getString("osVersion"), parseObject.getString("osVersion")) && StringUtils.equals(buildParams.getString("romVersion"), parseObject.getString("romVersion")) && StringUtils.equals(buildParams.getString("manufacturer"), parseObject.getString("manufacturer")) && StringUtils.equals(buildParams.getString("appName"), parseObject.getString("appName")) && StringUtils.equals(buildParams.getString("utdid"), parseObject.getString("utdid"))) {
            z = false;
        }
        if (z) {
            LogUtil.record(2, "ConfigManger::init", "环境发生了更改");
            this.b.clear();
            this.f = null;
            this.c.setLastEnvParams(buildParams);
            a(new JSONArray());
        }
        this.b.setConfigs(configs);
        this.f = this.c.getLastFetchTime();
        a(this.d.shouldFetchOnBoot());
    }

    public static ConfigManger getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigManger) ipChange.ipc$dispatch("abb860f3", new Object[]{context});
        }
        if (f4477a == null && context != null) {
            synchronized (ConfigManger.class) {
                try {
                    if (f4477a == null && UpdatePolicyEvaluator.getInstance(context).shouldFetch()) {
                        f4477a = new ConfigManger(context);
                        LogUtil.record(2, "ConfigManger::getInstance", "创建ConfigManger");
                        HashMap hashMap = new HashMap();
                        hashMap.put(UTConstant.Args.UT_PROPERTY_SUCCESS, "1");
                        PhoneCashierMspEngine.getMspLog().walletEventLog("10101278", "pay", hashMap);
                    }
                }
            }
        }
        return f4477a;
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                this.b.setConfig(jSONObject.getString("key"), jSONObject.getString("value"));
            }
            LogUtil.record(2, "ConfigManger::updateRpcConfigs", "更新配置：" + jSONArray.toJSONString());
            this.c.setConfigs(this.f, this.b.getConfigs().toString());
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if ((!z && !this.d.shouldUpdateSwitches()) || !this.g.compareAndSet(false, true)) {
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.configservice.ConfigManger.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JSONObject fetch = ConfigManger.b(ConfigManger.this).fetch(ConfigManger.a(ConfigManger.this));
                        StringBuilder sb = new StringBuilder("rpc结果：");
                        sb.append(fetch == null ? "null" : fetch.toJSONString());
                        LogUtil.record(2, "ConfigManger::fetchConfig", sb.toString());
                        if (fetch != null) {
                            if (fetch.getBooleanValue("success")) {
                                ConfigManger.a(ConfigManger.this, fetch.getString("responseTime"));
                                if (fetch.getBooleanValue("increment")) {
                                    ConfigManger.a(ConfigManger.this, fetch.getJSONArray("deleteKeys"));
                                } else {
                                    ConfigManger.c(ConfigManger.this);
                                }
                                ConfigManger.b(ConfigManger.this, fetch.getJSONArray("switches"));
                            } else if (!StringUtils.isEmpty(fetch.getString("error"))) {
                                ConfigManger.d(ConfigManger.this);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            LogUtil.printExceptionStackTrace(th);
                            ConfigManger.d(ConfigManger.this);
                        } finally {
                            ConfigManger.e(ConfigManger.this).updateLastFetchTime();
                            ConfigManger.f(ConfigManger.this).set(false);
                        }
                    }
                }
            });
        }
    }

    public String getConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d74258f7", new Object[]{this, str});
        }
        try {
            String config = this.b.getConfig(str);
            a(false);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("->");
            sb.append(config == null ? "null" : config);
            LogUtil.record(2, "ConfigManger::getConfig", sb.toString());
            return config;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static /* synthetic */ void a(ConfigManger configManger, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f77610d", new Object[]{configManger, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                configManger.b.remove(jSONArray.getString(i));
            }
        }
    }

    public static /* synthetic */ void c(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d701a3", new Object[]{configManger});
        } else {
            configManger.b.clear();
        }
    }

    public static /* synthetic */ void d(ConfigManger configManger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340d5482", new Object[]{configManger});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result_code", "Fetch_Exception");
        PhoneCashierMspEngine.getMspLog().walletEventLog("10101279", "pay", hashMap);
    }
}
