package com.alipay.zoloz.hardware.camera.preview.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SPManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEAUTY_LEVEL_KEY = "level";
    public static final String FPS_KEY = "fps";

    /* renamed from: a  reason: collision with root package name */
    private String f6249a;
    private Context b;
    private SharedPreferences c;

    public static synchronized SPManager newInstance(Context context) {
        synchronized (SPManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SPManager) ipChange.ipc$dispatch("9e109dd5", new Object[]{context});
            }
            return newInstance(context, "hardware_renderfps_monitor");
        }
    }

    public static synchronized SPManager newInstance(Context context, String str) {
        synchronized (SPManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SPManager) ipChange.ipc$dispatch("2bc9d64b", new Object[]{context, str});
            }
            return new SPManager(context, str);
        }
    }

    private SPManager(Context context, String str) {
        this.f6249a = "hardware_renderfps_monitor";
        this.b = context;
        if (str == null) {
            this.f6249a = "hardware_renderfps_monitor";
        }
        this.c = context.getSharedPreferences(this.f6249a, 0);
    }

    public Object get(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb95e40f", new Object[]{this, str, obj});
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(this.c.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof String) {
            return this.c.getString(str, (String) obj);
        }
        if (!(obj instanceof Boolean)) {
            return null;
        }
        return Boolean.valueOf(this.c.getBoolean(str, ((Boolean) obj).booleanValue()));
    }

    public void put(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
            return;
        }
        SharedPreferences.Editor edit = this.c.edit();
        if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        }
        edit.commit();
    }
}
