package com.alipay.android.msp.configservice;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UpdatePolicyEvaluator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static UpdatePolicyEvaluator c;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f4483a = new JSONObject();
    private long b;

    public static UpdatePolicyEvaluator getInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdatePolicyEvaluator) ipChange.ipc$dispatch("b9a32b53", new Object[]{context});
        }
        if (c == null && context != null) {
            synchronized (UpdatePolicyEvaluator.class) {
                if (c == null) {
                    c = new UpdatePolicyEvaluator(context);
                }
            }
        }
        return c;
    }

    private UpdatePolicyEvaluator(Context context) {
        reset(context);
    }

    public void reset(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b45632", new Object[]{this, context});
            return;
        }
        String rawDrmValueFromKey = DrmManager.getInstance(context).getRawDrmValueFromKey("gray_alipay_config_10560");
        if (TextUtils.isEmpty(rawDrmValueFromKey)) {
            return;
        }
        try {
            this.f4483a = new JSONObject(rawDrmValueFromKey);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public boolean shouldFetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("797561d2", new Object[]{this})).booleanValue() : this.f4483a.optBoolean("enable", false);
    }

    public boolean shouldFetchOnBoot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6f581a3", new Object[]{this})).booleanValue() : shouldFetch() && this.f4483a.optBoolean("bootFetch", false);
    }

    public boolean shouldUpdateSwitches() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a0b9ce9", new Object[]{this})).booleanValue() : shouldFetch() && (System.currentTimeMillis() - this.b) / 60000 >= ((long) this.f4483a.optInt("fetchInterval", Integer.MAX_VALUE));
    }

    public void updateLastFetchTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47794cef", new Object[]{this});
        } else {
            this.b = System.currentTimeMillis();
        }
    }
}
