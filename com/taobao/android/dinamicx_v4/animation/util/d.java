package com.taobao.android.dinamicx_v4.animation.util;

import android.animation.TimeInterpolator;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EASE_IN = "EaseIn";
    public static final String EASE_IN_OUT = "EaseInOut";
    public static final String EASE_OUT = "EaseOut";
    public static final String FAST_OUT_SLOW_IN_EASING = "FastOutSlowInEasing";
    public static final String LINEAR_EASING = "LinearEasing";

    static {
        kge.a(963302615);
    }

    public static TimeInterpolator a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("8e4353de", new Object[0]) : new FastOutSlowInInterpolator();
    }

    public static TimeInterpolator b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("e56144bd", new Object[0]) : new LinearInterpolator();
    }

    public static TimeInterpolator c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("3c7f359c", new Object[0]) : a(0.42f, 0.0f, 1.0f, 1.0f);
    }

    public static TimeInterpolator d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("939d267b", new Object[0]) : a(0.0f, 0.0f, 0.58f, 1.0f);
    }

    public static TimeInterpolator e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("eabb175a", new Object[0]) : a(0.42f, 0.0f, 0.58f, 1.0f);
    }

    public static TimeInterpolator a(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("46d257de", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : PathInterpolatorCompat.create(f, f2, f3, f4);
    }

    public static TimeInterpolator f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("41d90839", new Object[0]) : a();
    }

    public static TimeInterpolator a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("18350082", new Object[]{obj});
        }
        if (obj instanceof String) {
            return a((String) obj);
        }
        if (obj instanceof TimeInterpolator) {
            return (TimeInterpolator) obj;
        }
        return f();
    }

    public static TimeInterpolator a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TimeInterpolator) ipChange.ipc$dispatch("39678fd4", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return f();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -960369541:
                if (str.equals(EASE_IN_OUT)) {
                    c = 4;
                    break;
                }
                break;
            case -300434336:
                if (str.equals(EASE_OUT)) {
                    c = 3;
                    break;
                }
                break;
            case 786474531:
                if (str.equals(FAST_OUT_SLOW_IN_EASING)) {
                    c = 0;
                    break;
                }
                break;
            case 926702800:
                if (str.equals(LINEAR_EASING)) {
                    c = 1;
                    break;
                }
                break;
            case 2068518355:
                if (str.equals(EASE_IN)) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return a();
        }
        if (c == 1) {
            return b();
        }
        if (c == 2) {
            return c();
        }
        if (c == 3) {
            return d();
        }
        if (c == 4) {
            return e();
        }
        return f();
    }
}
