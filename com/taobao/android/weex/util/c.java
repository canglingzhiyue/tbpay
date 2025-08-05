package com.taobao.android.weex.util;

import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.util.g;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-384123554);
    }

    public static Object a(Type type, WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3b25137d", new Object[]{type, weexValue});
        }
        if (type == WeexValue.class) {
            return weexValue;
        }
        Object value = weexValue == null ? null : weexValue.getValue();
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
                if (type != Long.TYPE && type != Long.class) {
                    if (type != Double.TYPE && type != Double.class) {
                        if (type != Float.TYPE && type != Float.class) {
                            if (type == Boolean.TYPE) {
                                if (weexValue != null && weexValue.getType() != WeexValue.Type.NULL) {
                                    if (weexValue.getType() == WeexValue.Type.BOOL) {
                                        return Boolean.valueOf(weexValue.getBool());
                                    }
                                    if (weexValue.getType() == WeexValue.Type.STRING) {
                                        return Boolean.valueOf(Boolean.parseBoolean(weexValue.getString()));
                                    }
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                                }
                                return false;
                            } else if (type == Boolean.class) {
                                if (weexValue != null && weexValue.getType() != WeexValue.Type.NULL) {
                                    if (weexValue.getType() == WeexValue.Type.BOOL) {
                                        return Boolean.valueOf(weexValue.getBool());
                                    }
                                    if (weexValue.getType() == WeexValue.Type.STRING) {
                                        return Boolean.valueOf(Boolean.parseBoolean(weexValue.getString()));
                                    }
                                    throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
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
                                throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                            } else if (type == JSONObject.class) {
                                if (value == null) {
                                    return null;
                                }
                                if (value instanceof JSONObject) {
                                    return value;
                                }
                                if (value instanceof String) {
                                    return JSON.parseObject((String) value);
                                }
                                throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                            } else if (type == org.json.JSONArray.class) {
                                if (value == null) {
                                    return null;
                                }
                                if (value instanceof org.json.JSONArray) {
                                    return value;
                                }
                                if (value instanceof String) {
                                    return new org.json.JSONArray((String) value);
                                }
                                if (value instanceof JSONArray) {
                                    return new org.json.JSONArray(value.toString());
                                }
                                throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                            } else if (type != org.json.JSONObject.class) {
                                throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                            } else if (value == null) {
                                return null;
                            } else {
                                if (value instanceof org.json.JSONObject) {
                                    return value;
                                }
                                if (value instanceof String) {
                                    return new org.json.JSONObject((String) value);
                                }
                                if (value instanceof JSONObject) {
                                    return new org.json.JSONObject(value.toString());
                                }
                                throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type);
                            }
                        }
                        return Float.valueOf((float) b(weexValue));
                    }
                    return Double.valueOf(b(weexValue));
                }
                return Long.valueOf(c(weexValue));
            }
            return Integer.valueOf((int) c(weexValue));
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't convert " + weexValue + " to " + type, e);
        }
    }

    private static double b(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2eb1f1", new Object[]{weexValue})).doubleValue();
        }
        if (weexValue.isDouble()) {
            return weexValue.getDouble();
        }
        if (weexValue.isLong()) {
            return weexValue.getLong();
        }
        if (weexValue.isString()) {
            return Double.parseDouble(weexValue.getString().trim());
        }
        throw new IllegalArgumentException("Can't convert " + weexValue + " to double");
    }

    private static long c(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("634ca2d6", new Object[]{weexValue})).longValue();
        }
        if (weexValue.isLong()) {
            return weexValue.getLong();
        }
        if (weexValue.isDouble()) {
            return (long) weexValue.getDouble();
        }
        if (weexValue.isString()) {
            return (long) Double.parseDouble(weexValue.getString().trim());
        }
        throw new IllegalArgumentException("Can't convert " + weexValue + " to long");
    }

    public static boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{obj})).booleanValue();
        }
        Map.class.isAssignableFrom(obj.getClass());
        return a((Type) obj.getClass());
    }

    public static boolean a(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c9346db", new Object[]{type})).booleanValue();
        }
        if (!(type instanceof Class)) {
            return false;
        }
        if (type == WeexValue.class || type == Integer.TYPE || type == Float.TYPE || type == Boolean.TYPE || type == Long.TYPE || type == String.class || type == JSONObject.class || type == JSONArray.class || type == com.taobao.android.weex.b.class || type == Object.class || type == Integer.class || type == Float.class || type == Boolean.class || type == Long.class || type == byte[].class || type == MUSValue.class) {
            return true;
        }
        Class cls = (Class) type;
        return Map.class.isAssignableFrom(cls) || List.class.isAssignableFrom(cls);
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            a(z, "");
        }
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
        } else if (z) {
        } else {
            try {
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                g.c("Assert", "Fatal Assert hit in java, msg: " + str, e);
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.weex.util.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        throw e;
                    }
                });
                throw new IllegalStateException();
            }
        }
    }

    public static HashMap<String, String> a(WeexValue weexValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3e537587", new Object[]{weexValue});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject object = weexValue.getObject();
        for (String str : object.keySet()) {
            hashMap.put(str, object.getString(str));
        }
        return hashMap;
    }
}
