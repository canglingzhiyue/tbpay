package com.alibaba.android.bindingx.core.internal;

import android.animation.ArgbEvaluator;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.bindingx.core.i;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class JSMath {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ArgbEvaluator sArgbEvaluator;

    public static /* synthetic */ int access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("38fae174", new Object[]{str})).intValue() : parseColor(str);
    }

    public static /* synthetic */ ArgbEvaluator access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArgbEvaluator) ipChange.ipc$dispatch("87573831", new Object[0]) : sArgbEvaluator;
    }

    private JSMath() {
    }

    public static Object sin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("35098bb3", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.sin(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object cos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d2b6da64", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.cos(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object tan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("df7e508a", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.tan(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object asin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4b56b914", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.asin(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object acos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e90407c5", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.acos(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object atan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f5cb7deb", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.atan(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object atan2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1c92439", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.atan2(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue()));
            }
        };
    }

    public static Object pow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b8e20633", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.pow(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue()));
            }
        };
    }

    public static Object exp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d2e72b8e", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.exp(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object sqrt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6199c86b", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.sqrt(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object cbrt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a7d994a", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.cbrt(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object log() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("608020c7", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.log(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object abs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("162ef459", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.abs(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object sign() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2a495bee", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                int i = (doubleValue > mto.a.GEO_NOT_SUPPORT ? 1 : (doubleValue == mto.a.GEO_NOT_SUPPORT ? 0 : -1));
                if (i > 0) {
                    return 1;
                }
                if (i == 0) {
                    return 0;
                }
                if (doubleValue >= mto.a.GEO_NOT_SUPPORT) {
                    return Double.valueOf(Double.NaN);
                }
                return -1;
            }
        };
    }

    public static Object ceil() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7e960da6", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.ceil(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object floor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9d3b6cff", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Double.valueOf(Math.floor(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object round() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8283c4bd", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : Long.valueOf(Math.round(((Double) arrayList.get(0)).doubleValue()));
            }
        };
    }

    public static Object max() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3cacb2a7", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                if (arrayList == null || arrayList.size() <= 0) {
                    return null;
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                int size = arrayList.size();
                for (int i = 1; i < size; i++) {
                    double doubleValue2 = ((Double) arrayList.get(i)).doubleValue();
                    if (doubleValue2 > doubleValue) {
                        doubleValue = doubleValue2;
                    }
                }
                return Double.valueOf(doubleValue);
            }
        };
    }

    public static Object min() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4d003279", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                if (arrayList == null || arrayList.size() <= 0) {
                    return null;
                }
                double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                int size = arrayList.size();
                for (int i = 1; i < size; i++) {
                    double doubleValue2 = ((Double) arrayList.get(i)).doubleValue();
                    if (doubleValue2 < doubleValue) {
                        doubleValue = doubleValue2;
                    }
                }
                return Double.valueOf(doubleValue);
            }
        };
    }

    public static Object PI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("502a6d32", new Object[0]) : Double.valueOf(3.141592653589793d);
    }

    public static Object E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6939e66", new Object[0]) : Double.valueOf(2.718281828459045d);
    }

    public static Object rgb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("56600ade", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                if (arrayList != null && arrayList.size() >= 3) {
                    return Integer.valueOf(Color.rgb((int) ((Double) arrayList.get(0)).doubleValue(), (int) ((Double) arrayList.get(1)).doubleValue(), (int) ((Double) arrayList.get(2)).doubleValue()));
                }
                return null;
            }
        };
    }

    public static Object rgba() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("665378d7", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                if (arrayList != null && arrayList.size() >= 4) {
                    return Integer.valueOf(Color.argb((int) (((Double) arrayList.get(3)).doubleValue() * 255.0d), (int) ((Double) arrayList.get(0)).doubleValue(), (int) ((Double) arrayList.get(1)).doubleValue(), (int) ((Double) arrayList.get(2)).doubleValue()));
                }
                return null;
            }
        };
    }

    static {
        kge.a(-2126001426);
        sArgbEvaluator = new ArgbEvaluator();
    }

    public static Object evaluateColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3269f981", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList});
                }
                return JSMath.access$100().evaluate((float) Math.min(1.0d, Math.max((double) mto.a.GEO_NOT_SUPPORT, ((Double) arrayList.get(2)).doubleValue())), Integer.valueOf(JSMath.access$000((String) arrayList.get(0))), Integer.valueOf(JSMath.access$000((String) arrayList.get(1))));
            }
        };
    }

    private static int parseColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Unknown color");
        }
        if (str.startsWith("'") || str.startsWith("\"")) {
            str = str.substring(1, str.length() - 1);
        }
        int parseColor = Color.parseColor(str);
        return Color.argb(255, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor));
    }

    public static Object asArray() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("388eea4", new Object[0]) : new m() { // from class: com.alibaba.android.bindingx.core.internal.JSMath.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.internal.m
            public Object a(ArrayList<Object> arrayList) throws NumberFormatException, JSONException {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("658fa530", new Object[]{this, arrayList}) : arrayList;
            }
        };
    }

    public static void applyXYToScope(Map<String, Object> map, double d, double d2, i.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c57e7b", new Object[]{map, new Double(d), new Double(d2), bVar});
            return;
        }
        map.put("x", Double.valueOf(bVar.b(d, new Object[0])));
        map.put("y", Double.valueOf(bVar.b(d2, new Object[0])));
        map.put("internal_x", Double.valueOf(d));
        map.put("internal_y", Double.valueOf(d2));
    }

    public static void applySpringValueToScope(Map<String, Object> map, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("680caf9b", new Object[]{map, new Double(d), new Double(d2)});
            return;
        }
        map.put("p", Double.valueOf(d));
        map.put("v", Double.valueOf(d2));
    }

    public static void applyScaleFactorToScope(Map<String, Object> map, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79a240e", new Object[]{map, new Double(d)});
        } else {
            map.put("s", Double.valueOf(d));
        }
    }

    public static void applyRotationInDegreesToScope(Map<String, Object> map, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5051d83", new Object[]{map, new Double(d)});
        } else {
            map.put("r", Double.valueOf(d));
        }
    }

    public static void applyOrientationValuesToScope(Map<String, Object> map, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd910815", new Object[]{map, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), new Double(d8), new Double(d9)});
            return;
        }
        map.put("alpha", Double.valueOf(d));
        map.put("beta", Double.valueOf(d2));
        map.put("gamma", Double.valueOf(d3));
        map.put("dalpha", Double.valueOf(d - d4));
        map.put("dbeta", Double.valueOf(d2 - d5));
        map.put("dgamma", Double.valueOf(d3 - d6));
        map.put("x", Double.valueOf(d7));
        map.put("y", Double.valueOf(d8));
        map.put(AmnetConstant.VAL_SUPPORT_ZSTD, Double.valueOf(d9));
    }

    public static void applyTimingValuesToScope(Map<String, Object> map, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288074ff", new Object[]{map, new Double(d)});
        } else {
            map.put("t", Double.valueOf(d));
        }
    }

    public static void applyScrollValuesToScope(Map<String, Object> map, double d, double d2, double d3, double d4, double d5, double d6, i.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf88374d", new Object[]{map, new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), bVar});
            return;
        }
        map.put("x", Double.valueOf(bVar.b(d, new Object[0])));
        map.put("y", Double.valueOf(bVar.b(d2, new Object[0])));
        map.put("dx", Double.valueOf(bVar.b(d3, new Object[0])));
        map.put("dy", Double.valueOf(bVar.b(d4, new Object[0])));
        map.put("tdx", Double.valueOf(bVar.b(d5, new Object[0])));
        map.put("tdy", Double.valueOf(bVar.b(d6, new Object[0])));
        map.put("internal_x", Double.valueOf(d));
        map.put("internal_y", Double.valueOf(d2));
    }
}
