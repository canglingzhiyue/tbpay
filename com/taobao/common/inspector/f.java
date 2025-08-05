package com.taobao.common.inspector;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.Callable;
import tb.kge;

/* loaded from: classes7.dex */
public class f<T> implements Callable<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16932a;
    private final Class<? extends T> b;
    private final String c;
    private final String d;
    private final String e;

    static {
        kge.a(-1546872661);
        kge.a(-119797776);
    }

    public f(Context context, Class<? extends T> cls, String str, String str2, String str3) {
        this.f16932a = context;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig(this.c, null);
        SharedPreferences sharedPreferences = this.f16932a.getSharedPreferences(this.d, 0);
        if (customConfig != null) {
            sharedPreferences.edit().putString(this.e, customConfig).apply();
        } else {
            customConfig = sharedPreferences.getString(this.e, null);
        }
        if (customConfig != null) {
            return (T) JSON.parseObject(customConfig, this.b);
        }
        return null;
    }
}
