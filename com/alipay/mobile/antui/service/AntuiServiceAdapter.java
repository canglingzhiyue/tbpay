package com.alipay.mobile.antui.service;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AntuiServiceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile IAntuiLogger f5343a;
    private static volatile IAntuiKeyboardConfig b;
    private static volatile IAntuiSwitch c;

    public static IAntuiLogger getAntuiLogger() {
        if (f5343a == null) {
            synchronized (AntuiServiceAdapter.class) {
                if (f5343a == null) {
                    f5343a = (IAntuiLogger) Class.forName("com.alipay.mobile.antui.service.AntuiLoggerImpl").newInstance();
                }
            }
        }
        return f5343a;
    }

    public static IAntuiSwitch getAntuiSwitch() {
        if (c == null) {
            synchronized (AntuiServiceAdapter.class) {
                if (c == null) {
                    c = (IAntuiSwitch) Class.forName("com.alipay.mobile.antui.service.AntuiSwitchImpl").newInstance();
                }
            }
        }
        return c;
    }

    public static IAntuiKeyboardConfig getAntuiKeyboardConfig() {
        if (b == null) {
            synchronized (AntuiServiceAdapter.class) {
                if (b == null) {
                    b = (IAntuiKeyboardConfig) Class.forName("com.alipay.mobile.antui.service.AntuiKeyboardConfigImpl").newInstance();
                }
            }
        }
        return b;
    }
}
