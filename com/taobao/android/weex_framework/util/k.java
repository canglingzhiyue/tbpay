package com.taobao.android.weex_framework.util;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import java.lang.reflect.Type;
import tb.jva;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-441300233);
    }

    private static float c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a8844b6", new Object[]{obj})).floatValue();
        }
        if (obj == null) {
            throw new IllegalArgumentException("float param can't be null");
        }
        if (obj instanceof Long) {
            return (float) ((Long) obj).longValue();
        }
        if (obj instanceof Double) {
            return (float) ((Double) obj).doubleValue();
        }
        return i.b(obj.toString().trim());
    }

    public static boolean a(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c9346db", new Object[]{type})).booleanValue();
        }
        if (!(type instanceof Class)) {
            return false;
        }
        return type == MUSValue.class || type == Integer.TYPE || type == Float.TYPE || type == Boolean.TYPE || type == Long.TYPE || type == String.class || type == JSONObject.class || type == JSONArray.class || type == com.taobao.android.weex_framework.bridge.b.class || type == Object.class || type == Integer.class || type == Float.class || type == Boolean.class || type == Long.class || type == byte[].class;
    }

    public static MUSValue b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("20080fde", new Object[]{obj});
        }
        if (obj instanceof MUSValue) {
            return (MUSValue) obj;
        }
        Class<?> cls = obj.getClass();
        if (String.class.isAssignableFrom(cls)) {
            return MUSValue.ofString((String) obj);
        }
        if (Integer.class == cls || Integer.TYPE == cls) {
            return MUSValue.ofInt(((Integer) obj).intValue());
        }
        if (Long.class == cls || Long.TYPE == cls) {
            return MUSValue.ofInt(((Long) obj).longValue());
        }
        if (Float.class == cls || Float.TYPE == cls) {
            return MUSValue.ofFloat(((Float) obj).floatValue());
        }
        if (Double.class == cls || Double.TYPE == cls) {
            return MUSValue.ofFloat(((Double) obj).doubleValue());
        }
        if (Boolean.class == cls || Boolean.TYPE == cls) {
            return MUSValue.ofBool(((Boolean) obj).booleanValue());
        }
        if (JSON.class.isAssignableFrom(cls)) {
            return MUSValue.ofJSON(obj);
        }
        if (byte[].class != cls) {
            return null;
        }
        return MUSValue.ofArrayBuffer((byte[]) obj);
    }

    public static Object a(com.taobao.android.weex_framework.p pVar, Object obj, Type type, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e9cb4f5", new Object[]{pVar, obj, type, mUSValue});
        }
        if (mUSValue == null) {
            return null;
        }
        if (mUSValue.isFunction()) {
            if (type != com.taobao.android.weex_framework.bridge.b.class && type != Object.class) {
                return null;
            }
            return new jva((jvb) pVar, mUSValue.getFunctionId(), obj);
        }
        return a(type, mUSValue);
    }

    public static Object a(Type type, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7a6804ae", new Object[]{type, mUSValue});
        }
        if (type == MUSValue.class) {
            return mUSValue;
        }
        Object value = mUSValue == null ? null : mUSValue.getValue();
        if (value != null) {
            if (value.getClass() == type) {
                return value;
            }
            if ((type instanceof Class) && ((Class) type).isAssignableFrom(value.getClass())) {
                return value;
            }
        } else if (type instanceof Class) {
            if (!((Class) type).isPrimitive()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return false;
            }
            throw new IllegalArgumentException("Can't assign null to " + type);
        }
        try {
            if (type == String.class) {
                return value instanceof String ? value : JSON.toJSONString(value);
            }
            if (type != Integer.TYPE && type != Integer.class) {
                if (type != Float.TYPE && type != Float.class) {
                    if (type == Boolean.TYPE) {
                        if (mUSValue != null && mUSValue.getType() != 0) {
                            if (mUSValue.getType() == 5) {
                                return true;
                            }
                            if (mUSValue.getType() == 6) {
                                return false;
                            }
                            if (mUSValue.getType() == 4) {
                                return Boolean.valueOf(Boolean.parseBoolean(mUSValue.getStringValue()));
                            }
                            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                        }
                        return false;
                    } else if (type == Boolean.class) {
                        if (mUSValue != null && mUSValue.getType() != 0) {
                            if (mUSValue.getType() == 5) {
                                return true;
                            }
                            if (mUSValue.getType() == 6) {
                                return false;
                            }
                            if (mUSValue.getType() == 4) {
                                return Boolean.valueOf(Boolean.parseBoolean(mUSValue.getStringValue()));
                            }
                            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                        }
                        return null;
                    } else if (type == JSONArray.class) {
                        if (value == null) {
                            return null;
                        }
                        if (value instanceof JSONArray) {
                            return value;
                        }
                        if (value instanceof String) {
                            return JSON.parseArray((String) value);
                        }
                        throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                    } else if (type != JSONObject.class) {
                        throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                    } else if (value == null) {
                        return null;
                    } else {
                        if (value instanceof JSONObject) {
                            return value;
                        }
                        if (value instanceof String) {
                            return JSON.parseObject((String) value);
                        }
                        throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type);
                    }
                }
                return Float.valueOf(c(value));
            }
            return Integer.valueOf((int) c(value));
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't convert " + mUSValue + " to " + type, e);
        }
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (f <= 0.0f || f >= 1.0f) ? (int) f : Math.round(f);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.taobao.android.weex_framework.m.b.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (!ConnectivityManager.isNetworkTypeValid(type)) {
                    return "other";
                }
                if (type == 1) {
                    return "wifi";
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2g";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3g";
                    case 13:
                        return "4g";
                    default:
                        return "other";
                }
            }
            return "other";
        } catch (Throwable unused) {
            return "other";
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("weex_mode");
        if (!"dom".equals(queryParameter) && !com.taobao.homepage.page.weexv2.a.KEY_MUS.equals(queryParameter) && !"xr".equals(queryParameter)) {
            return false;
        }
        return "true".equals(parse.getQueryParameter("wh_weex")) || !StringUtils.isEmpty(parse.getQueryParameter(com.taobao.vessel.utils.b.WX_TPL)) || !StringUtils.isEmpty(parse.getQueryParameter("_mus_tpl"));
    }
}
