package com.alipay.mobile.intelligentdecision.helper;

import android.text.TextUtils;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class VidFilterHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile VidFilterHelper d;

    /* renamed from: a  reason: collision with root package name */
    private final int f5726a = 10;
    private ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();

    private VidFilterHelper() {
    }

    public static VidFilterHelper a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VidFilterHelper) ipChange.ipc$dispatch("e7d12015", new Object[0]);
        }
        if (d == null) {
            synchronized (VidFilterHelper.class) {
                if (d == null) {
                    d = new VidFilterHelper();
                }
            }
        }
        return d;
    }

    public final boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            DecisionLogcat.a("VidFilterHelper", "haveCollect error:" + th.getMessage());
        }
        if (!TextUtils.isEmpty(str) && str2.equalsIgnoreCase("pay_enter")) {
            DecisionLogcat.b("VidFilterHelper", "collect size:" + this.b.size());
            if (this.b.containsKey(str)) {
                if (this.b.size() >= 10) {
                    this.b.clear();
                    this.b.put(str, "");
                }
                DecisionLogcat.b("VidFilterHelper", "haveCollect:" + str);
                return true;
            }
            if (this.b.size() >= 10) {
                this.b.clear();
            }
            this.b.put(str, "");
            return false;
        }
        return false;
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            DecisionLogcat.a("VidFilterHelper", "havePredit error:" + th.getMessage());
        }
        if (!TextUtils.isEmpty(str) && str2.equalsIgnoreCase("pay_enter")) {
            DecisionLogcat.b("VidFilterHelper", "pre size:" + this.c.size());
            if (this.c.containsKey(str)) {
                if (this.c.size() >= 10) {
                    this.c.clear();
                    this.c.put(str, "");
                }
                DecisionLogcat.b("VidFilterHelper", "havePredit:" + str);
                return true;
            }
            if (this.c.size() >= 10) {
                this.c.clear();
            }
            this.c.put(str, "");
            return false;
        }
        return false;
    }
}
