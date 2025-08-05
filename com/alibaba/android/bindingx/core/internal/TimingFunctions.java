package com.alibaba.android.bindingx.core.internal;

import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import org.json.JSONException;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class TimingFunctions {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final b<a> cache;

    private static double easeOutBounce(double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e376079d", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue();
        }
        double d8 = d / d4;
        if (d8 < 0.36363636363636365d) {
            d7 = 7.5625d * d8 * d8;
        } else {
            if (d8 < 0.7272727272727273d) {
                double d9 = d8 - 0.5454545454545454d;
                d5 = 7.5625d * d9 * d9;
                d6 = 0.75d;
            } else if (d8 < 0.9090909090909091d) {
                double d10 = d8 - 0.8181818181818182d;
                d5 = 7.5625d * d10 * d10;
                d6 = 0.9375d;
            } else {
                double d11 = d8 - 0.9545454545454546d;
                d5 = 7.5625d * d11 * d11;
                d6 = 0.984375d;
            }
            d7 = d5 + d6;
        }
        return (d3 * d7) + d2;
    }

    public static /* synthetic */ a access$000(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9ebcd5dd", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)}) : isCacheHit(f, f2, f3, f4);
    }

    public static /* synthetic */ b access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d3a2dedb", new Object[0]) : cache;
    }

    public static /* synthetic */ double access$200(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2205f8e7", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue() : easeInBounce(d, d2, d3, d4);
    }

    public static /* synthetic */ double access$300(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b6eaaba8", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue() : easeOutBounce(d, d2, d3, d4);
    }

    private TimingFunctions() {
    }

    public static Object linear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f2951b86", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                return Double.valueOf((doubleValue3 * (Math.min(doubleValue, doubleValue4) / doubleValue4)) + doubleValue2);
            }
        };
    }

    public static Object cubicBezier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5cb3ca62", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double doubleValue5 = ((Double) arrayList.get(4)).doubleValue();
                double doubleValue6 = ((Double) arrayList.get(5)).doubleValue();
                double doubleValue7 = ((Double) arrayList.get(6)).doubleValue();
                double doubleValue8 = ((Double) arrayList.get(7)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                if (min == doubleValue4) {
                    return Double.valueOf(doubleValue2 + doubleValue3);
                }
                float f = (float) doubleValue5;
                float f2 = (float) doubleValue6;
                float f3 = (float) doubleValue7;
                float f4 = (float) doubleValue8;
                a access$000 = TimingFunctions.access$000(f, f2, f3, f4);
                if (access$000 == null) {
                    access$000 = new a(f, f2, f3, f4);
                    TimingFunctions.access$100().a(access$000);
                }
                return Double.valueOf((doubleValue3 * access$000.getInterpolation((float) (min / doubleValue4))) + doubleValue2);
            }
        };
    }

    static {
        kge.a(85826548);
        cache = new b<>(4);
    }

    private static a isCacheHit(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("598a4bb2", new Object[]{new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        }
        for (a aVar : cache.a()) {
            if (Float.compare(aVar.f2233a, f) == 0 && Float.compare(aVar.c, f3) == 0 && Float.compare(aVar.b, f2) == 0 && Float.compare(aVar.d, f4) == 0) {
                return aVar;
            }
        }
        return null;
    }

    public static Object easeInQuad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a3ae0831", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf((doubleValue3 * min * min) + doubleValue2);
            }
        };
    }

    public static Object easeOutQuad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7e9de04", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf(((-doubleValue3) * min * (min - 2.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInOutQuad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f1f1fa49", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
                if (min < 1.0d) {
                    return Double.valueOf(((doubleValue3 / 2.0d) * min * min) + doubleValue2);
                }
                double d = min - 1.0d;
                return Double.valueOf((((-doubleValue3) / 2.0d) * ((d * (d - 2.0d)) - 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInCubic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("24e79c94", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.29
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf((doubleValue3 * min * min * min) + doubleValue2);
            }
        };
    }

    public static Object easeOutCubic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("48268121", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
                return Double.valueOf((doubleValue3 * ((min * min * min) + 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInOutCubic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9f21ed7c", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
                if (min < 1.0d) {
                    return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min) + doubleValue2);
                }
                double d = min - 2.0d;
                return Double.valueOf(((doubleValue3 / 2.0d) * ((d * d * d) + 2.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInQuart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("cd68613f", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.32
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf((doubleValue3 * min * min * min * min) + doubleValue2);
            }
        };
    }

    public static Object easeOutQuart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f0a745cc", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
                return Double.valueOf(((-doubleValue3) * ((((min * min) * min) * min) - 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInOutQuart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("47a2b227", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
                if (min < 1.0d) {
                    return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min * min) + doubleValue2);
                }
                double d = min - 2.0d;
                return Double.valueOf((((-doubleValue3) / 2.0d) * ((((d * d) * d) * d) - 2.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInQuint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("84ae7333", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf((doubleValue3 * min * min * min * min * min) + doubleValue2);
            }
        };
    }

    public static Object easeOutQuint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a7ed57c0", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
                return Double.valueOf((doubleValue3 * ((min * min * min * min * min) + 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInOutQuint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fee8c41b", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
                if (min < 1.0d) {
                    return Double.valueOf(((doubleValue3 / 2.0d) * min * min * min * min * min) + doubleValue2);
                }
                double d = min - 2.0d;
                return Double.valueOf(((doubleValue3 / 2.0d) * ((d * d * d * d * d) + 2.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInSine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("270672ab", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                return Double.valueOf(((-doubleValue3) * Math.cos((Math.min(doubleValue, doubleValue4) / doubleValue4) * 1.5707963267948966d)) + doubleValue3 + doubleValue2);
            }
        };
    }

    public static Object easeOutSine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8b42487e", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                return Double.valueOf((doubleValue3 * Math.sin((Math.min(doubleValue, doubleValue4) / doubleValue4) * 1.5707963267948966d)) + doubleValue2);
            }
        };
    }

    public static Object easeInOutSine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("754a64c3", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                return Double.valueOf((((-doubleValue3) / 2.0d) * (Math.cos((Math.min(doubleValue, doubleValue4) * 3.141592653589793d) / doubleValue4) - 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInExpo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("86161866", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                if (min != mto.a.GEO_NOT_SUPPORT) {
                    doubleValue2 += doubleValue3 * Math.pow(2.0d, ((min / doubleValue4) - 1.0d) * 10.0d);
                }
                return Double.valueOf(doubleValue2);
            }
        };
    }

    public static Object easeOutExpo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ea51ee39", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                return Double.valueOf(min == doubleValue4 ? doubleValue2 + doubleValue3 : doubleValue2 + (doubleValue3 * ((-Math.pow(2.0d, (min * (-10.0d)) / doubleValue4)) + 1.0d)));
            }
        };
    }

    public static Object easeInOutExpo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d45a0a7e", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                if (min == mto.a.GEO_NOT_SUPPORT) {
                    return Double.valueOf(doubleValue2);
                }
                if (min == doubleValue4) {
                    return Double.valueOf(doubleValue2 + doubleValue3);
                }
                double d = min / (doubleValue4 / 2.0d);
                return d < 1.0d ? Double.valueOf(((doubleValue3 / 2.0d) * Math.pow(2.0d, (d - 1.0d) * 10.0d)) + doubleValue2) : Double.valueOf(((doubleValue3 / 2.0d) * ((-Math.pow(2.0d, (d - 1.0d) * (-10.0d))) + 2.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInCirc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ffbc9261", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf(((-doubleValue3) * (Math.sqrt(1.0d - (min * min)) - 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeOutCirc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("63f86834", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
                return Double.valueOf((doubleValue3 * Math.sqrt(1.0d - (min * min))) + doubleValue2);
            }
        };
    }

    public static Object easeInOutCirc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4e008479", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
                if (min < 1.0d) {
                    return Double.valueOf((((-doubleValue3) / 2.0d) * (Math.sqrt(1.0d - (min * min)) - 1.0d)) + doubleValue2);
                }
                double d = min - 2.0d;
                return Double.valueOf(((doubleValue3 / 2.0d) * (Math.sqrt(1.0d - (d * d)) + 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInElastic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c03ca929", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                if (min == mto.a.GEO_NOT_SUPPORT) {
                    return Double.valueOf(doubleValue2);
                }
                double d = min / doubleValue4;
                if (d == 1.0d) {
                    return Double.valueOf(doubleValue2 + doubleValue3);
                }
                double d2 = 0.3d * doubleValue4;
                double d3 = d - 1.0d;
                return Double.valueOf((-(doubleValue3 * Math.pow(2.0d, d3 * 10.0d) * Math.sin((((d3 * doubleValue4) - (doubleValue3 < Math.abs(doubleValue3) ? d2 / 4.0d : (d2 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3))) * 6.283185307179586d) / d2))) + doubleValue2);
            }
        };
    }

    public static Object easeOutElastic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f549e76", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                if (min == mto.a.GEO_NOT_SUPPORT) {
                    return Double.valueOf(doubleValue2);
                }
                double d = min / doubleValue4;
                if (d == 1.0d) {
                    return Double.valueOf(doubleValue2 + doubleValue3);
                }
                double d2 = 0.3d * doubleValue4;
                return Double.valueOf((Math.pow(2.0d, d * (-10.0d)) * doubleValue3 * Math.sin((((d * doubleValue4) - (doubleValue3 < Math.abs(doubleValue3) ? d2 / 4.0d : (d2 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3))) * 6.283185307179586d) / d2)) + doubleValue3 + doubleValue2);
            }
        };
    }

    public static Object easeInOutElastic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("95266011", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                if (min == mto.a.GEO_NOT_SUPPORT) {
                    return Double.valueOf(doubleValue2);
                }
                double d = min / (doubleValue4 / 2.0d);
                if (d == 2.0d) {
                    return Double.valueOf(doubleValue2 + doubleValue3);
                }
                double d2 = 0.44999999999999996d * doubleValue4;
                double asin = doubleValue3 < Math.abs(doubleValue3) ? d2 / 4.0d : (d2 / 6.283185307179586d) * Math.asin(doubleValue3 / doubleValue3);
                if (d < 1.0d) {
                    double d3 = d - 1.0d;
                    return Double.valueOf((doubleValue3 * Math.pow(2.0d, d3 * 10.0d) * Math.sin((((d3 * doubleValue4) - asin) * 6.283185307179586d) / d2) * (-0.5d)) + doubleValue2);
                }
                double d4 = d - 1.0d;
                return Double.valueOf((Math.pow(2.0d, (-10.0d) * d4) * doubleValue3 * Math.sin((((d4 * doubleValue4) - asin) * 6.283185307179586d) / d2) * 0.5d) + doubleValue3 + doubleValue2);
            }
        };
    }

    public static Object easeInBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("76c5a891", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / doubleValue4;
                return Double.valueOf((doubleValue3 * min * min * ((2.70158d * min) - 1.70158d)) + doubleValue2);
            }
        };
    }

    public static Object easeOutBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("db017e64", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = (Math.min(doubleValue, doubleValue4) / doubleValue4) - 1.0d;
                return Double.valueOf((doubleValue3 * ((min * min * ((2.70158d * min) + 1.70158d)) + 1.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInOutBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c5099aa9", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4) / (doubleValue4 / 2.0d);
                if (min < 1.0d) {
                    return Double.valueOf(((doubleValue3 / 2.0d) * min * min * ((3.5949095d * min) - 2.5949095d)) + doubleValue2);
                }
                double d = min - 2.0d;
                return Double.valueOf(((doubleValue3 / 2.0d) * ((d * d * ((3.5949095d * d) + 2.5949095d)) + 2.0d)) + doubleValue2);
            }
        };
    }

    public static Object easeInBounce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fa098650", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                return Double.valueOf(TimingFunctions.access$200(Math.min(doubleValue, doubleValue4), doubleValue2, doubleValue3, doubleValue4));
            }
        };
    }

    public static Object easeOutBounce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3ea73363", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                return Double.valueOf(TimingFunctions.access$300(Math.min(doubleValue, doubleValue4), doubleValue2, doubleValue3, doubleValue4));
            }
        };
    }

    public static Object easeInOutBounce() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c7195268", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.TimingFunctions.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                double doubleValue3 = ((Double) arrayList.get(2)).doubleValue();
                double doubleValue4 = ((Double) arrayList.get(3)).doubleValue();
                double min = Math.min(doubleValue, doubleValue4);
                return min < doubleValue4 / 2.0d ? Double.valueOf((TimingFunctions.access$200(min * 2.0d, mto.a.GEO_NOT_SUPPORT, doubleValue3, doubleValue4) * 0.5d) + doubleValue2) : Double.valueOf((TimingFunctions.access$300((min * 2.0d) - doubleValue4, mto.a.GEO_NOT_SUPPORT, doubleValue3, doubleValue4) * 0.5d) + (doubleValue3 * 0.5d) + doubleValue2);
            }
        };
    }

    private static double easeInBounce(double d, double d2, double d3, double d4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2067790", new Object[]{new Double(d), new Double(d2), new Double(d3), new Double(d4)})).doubleValue() : (d3 - easeOutBounce(d4 - d, mto.a.GEO_NOT_SUPPORT, d3, d4)) + d2;
    }

    /* loaded from: classes2.dex */
    public static class b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque<T> f2234a;

        static {
            kge.a(297015708);
        }

        public b(int i) {
            this.f2234a = new ArrayDeque<>(i);
        }

        public void a(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            } else if (this.f2234a.size() >= 4) {
                this.f2234a.removeFirst();
                this.f2234a.addLast(t);
            } else {
                this.f2234a.addLast(t);
            }
        }

        public Deque<T> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Deque) ipChange.ipc$dispatch("de6b1059", new Object[]{this}) : this.f2234a;
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f2233a;
        public float b;
        public float c;
        public float d;
        private Interpolator e;

        static {
            kge.a(1548361629);
            kge.a(-1444680548);
        }

        public a(float f, float f2, float f3, float f4) {
            this.f2233a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = PathInterpolatorCompat.create(f, f2, f3, f4);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue() : this.e.getInterpolation(f);
        }
    }
}
