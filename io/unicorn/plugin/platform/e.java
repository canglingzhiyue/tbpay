package io.unicorn.plugin.platform;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.jur;
import tb.jva;
import tb.kge;
import tb.mto;
import tb.rtp;

/* loaded from: classes9.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private rtp f24872a;
    private PlatformViewsController c;
    private WeakReference<WeexInstance> d;

    static {
        kge.a(-302737300);
    }

    public e(PlatformViewsController platformViewsController) {
        this.c = platformViewsController;
    }

    public static float a(String str) {
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.equals(str, "null")) {
                return Float.parseFloat(str);
            }
            return 0.0f;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0f;
        }
    }

    public static long a(Object obj) {
        StringBuilder sb;
        if (obj == null) {
            return 0L;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("px")) {
            try {
                return Long.parseLong(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Argument format error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return 0L;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Argument error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return 0L;
            }
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Argument format error! value is ");
            sb.append(obj);
            Log.e("MethodInvokeExecutor", sb.toString(), e);
            return 0L;
        } catch (Exception e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Argument error! value is ");
            sb.append(obj);
            Log.e("MethodInvokeExecutor", sb.toString(), e);
            return 0L;
        }
    }

    public static Object a(Type type, Object obj) {
        if (obj != null) {
            if (obj.getClass() == type) {
                return obj;
            }
            if ((type instanceof Class) && ((Class) type).isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        if (type == String.class) {
            return obj instanceof String ? obj : io.unicorn.plugin.common.e.b(obj).toString();
        } else if (type == Integer.TYPE) {
            return (obj.getClass().isAssignableFrom(Integer.TYPE) || (obj instanceof Integer)) ? obj : Integer.valueOf(e(obj));
        } else if (type == Long.TYPE) {
            return (obj.getClass().isAssignableFrom(Long.TYPE) || (obj instanceof Long)) ? obj : obj instanceof Integer ? Long.valueOf(((Integer) obj).intValue()) : Long.valueOf(a(obj));
        } else if (type == Double.TYPE) {
            return (obj.getClass().isAssignableFrom(Double.TYPE) || (obj instanceof Double)) ? obj : Double.valueOf(b(obj));
        } else if (type == Float.TYPE) {
            return (obj.getClass().isAssignableFrom(Float.TYPE) || (obj instanceof Float)) ? obj : obj instanceof Double ? Float.valueOf((float) ((Double) obj).doubleValue()) : c(obj);
        } else if (type == Boolean.TYPE) {
            return (obj.getClass().isAssignableFrom(Boolean.TYPE) || (obj instanceof Boolean)) ? obj : d(obj);
        } else if (type == JSONArray.class && obj != null && obj.getClass() == JSONArray.class) {
            return obj;
        } else {
            if (type == JSONObject.class && obj != null && obj.getClass() == JSONObject.class) {
                return obj;
            }
            if ((type instanceof ParameterizedType) && (obj instanceof String)) {
                Type rawType = ((ParameterizedType) type).getRawType();
                try {
                    if (rawType != HashMap.class && rawType != Map.class) {
                        if (rawType == List.class || rawType == ArrayList.class) {
                            return io.unicorn.plugin.common.e.a(new JSONArray((String) obj));
                        }
                    }
                    return io.unicorn.plugin.common.e.a(new JSONObject((String) obj));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }

    private Object[] a(Type[] typeArr, WeexValue[] weexValueArr) throws Exception {
        int length = weexValueArr == null ? 0 : weexValueArr.length;
        Object[] objArr = new Object[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (i < length) {
                WeexValue weexValue = weexValueArr[i];
                if (weexValue == null || weexValue.getType() != WeexValue.Type.FUNCTION) {
                    objArr[i] = com.taobao.android.weex.util.c.a(type, weexValue);
                } else if (type == com.taobao.android.weex.b.class || type == Object.class) {
                    objArr[i] = new jur(this.d.get(), ((Long) weexValue.getValue()).longValue());
                } else if (type == com.taobao.android.weex_framework.bridge.b.class) {
                    objArr[i] = new jva(((WeexInstanceImpl) this.d.get()).getAdapterMUSInstance(), ((Long) weexValue.getValue()).intValue(), null);
                } else if (type != WeexValue.class) {
                    throw new IllegalArgumentException("[prepareArguments] WeexCallback can't assign to " + type);
                } else {
                    objArr[i] = weexValue;
                }
            } else if (type.getClass().isPrimitive()) {
                throw new Exception("[prepareArguments] method argument list not match.");
            } else {
                objArr[i] = null;
            }
        }
        return objArr;
    }

    public static double b(Object obj) {
        StringBuilder sb;
        if (obj == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("px")) {
            try {
                return Double.parseDouble(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Argument format error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return mto.a.GEO_NOT_SUPPORT;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Argument error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return mto.a.GEO_NOT_SUPPORT;
            }
        }
        try {
            return Double.parseDouble(trim);
        } catch (NumberFormatException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Argument format error! value is ");
            sb.append(obj);
            Log.e("MethodInvokeExecutor", sb.toString(), e);
            return mto.a.GEO_NOT_SUPPORT;
        } catch (Exception e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Argument error! value is ");
            sb.append(obj);
            Log.e("MethodInvokeExecutor", sb.toString(), e);
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    public static Float c(Object obj) {
        StringBuilder sb;
        Float valueOf = Float.valueOf(Float.NaN);
        if (obj == null) {
            return valueOf;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("px")) {
            try {
                return Float.valueOf(Float.parseFloat(trim.substring(0, trim.indexOf("px"))));
            } catch (NumberFormatException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Argument format error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return valueOf;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Argument error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return valueOf;
            }
        }
        try {
            return Float.valueOf(Float.parseFloat(trim));
        } catch (NumberFormatException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Argument format error! value is ");
            sb.append(obj);
            Log.e("MethodInvokeExecutor", sb.toString(), e);
            return valueOf;
        } catch (Exception e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Argument error! value is ");
            sb.append(obj);
            Log.e("MethodInvokeExecutor", sb.toString(), e);
            return valueOf;
        }
    }

    public static void c() {
    }

    public static Boolean d(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        String trim = obj.toString().trim();
        try {
            if (!StringUtils.isEmpty(trim) && "true".equals(trim)) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (NumberFormatException e) {
            Log.e("MethodInvokeExecutor", "The parameter format is not supported", e);
            return false;
        } catch (Exception e2) {
            Log.e("MethodInvokeExecutor", "Argument error! value is " + obj, e2);
            return false;
        }
    }

    private static int e(Object obj) {
        StringBuilder sb;
        float a2;
        if (obj == null) {
            return 0;
        }
        String trim = obj.toString().trim();
        if (StringUtils.equals("px", trim.length() >= 2 ? trim.substring(trim.length() - 2, trim.length()) : "")) {
            try {
                String substring = trim.substring(0, trim.length() - 2);
                if (StringUtils.isEmpty(substring) || !substring.contains(".")) {
                    return Integer.parseInt(substring);
                }
                a2 = a(substring);
            } catch (NumberFormatException e) {
                e = e;
                sb = new StringBuilder();
                sb.append("Argument format error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return 0;
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                sb.append("Argument error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return 0;
            }
        } else {
            try {
                if (StringUtils.isEmpty(trim)) {
                    return 0;
                }
                if (!trim.contains(".")) {
                    return Integer.parseInt(trim);
                }
                a2 = a(trim);
            } catch (NumberFormatException e3) {
                Log.e("MethodInvokeExecutor", "The parameter format is not supported", e3);
                return 0;
            } catch (Exception e4) {
                e = e4;
                sb = new StringBuilder();
                sb.append("Argument error! value is ");
                sb.append(obj);
                Log.e("MethodInvokeExecutor", sb.toString(), e);
                return 0;
            }
        }
        return (int) a2;
    }

    public MUSDKInstance a() {
        WeakReference<WeexInstance> weakReference = this.d;
        return ((WeexInstanceImpl) (weakReference == null ? null : weakReference.get())).getAdapterMUSInstance();
    }

    public Object a(Object obj, com.taobao.android.weex_framework.platform.b bVar, WeexValue[] weexValueArr) {
        try {
            try {
                return bVar.a(obj, a(bVar.a(), weexValueArr));
            } catch (Exception e) {
                Log.e("MethodInvokeExecutor", obj + " Invoker " + bVar.toString(), e);
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void a(int i, String str, Object obj) {
        rtp rtpVar = this.f24872a;
        if (rtpVar == null) {
            return;
        }
        rtpVar.a(i, str, obj);
        if (this.c == null || !str.equals("scrollable.scroll")) {
            return;
        }
        this.c.d(i);
    }

    public void a(WeexInstance weexInstance) {
        this.d = new WeakReference<>(weexInstance);
    }

    public void a(rtp rtpVar) {
        this.f24872a = rtpVar;
    }

    public WeexInstance b() {
        return this.d.get();
    }
}
