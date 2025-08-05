package com.taobao.android.weex_framework.platform;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f16069a;
    private Map<String, b> b;
    private Map<String, b> c;
    private Map<String, b> d;
    private Map<String, b> e;
    private com.taobao.android.weex_framework.platform.a f;
    private boolean g;

    static {
        kge.a(936015095);
    }

    /* loaded from: classes6.dex */
    public static class a implements com.taobao.android.weex_framework.platform.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Class<?> f16070a;
        private Constructor<?> b;

        static {
            kge.a(2137324547);
            kge.a(950923375);
        }

        public a(Class<?> cls) {
            this.f16070a = cls;
        }

        @Override // com.taobao.android.weex_framework.platform.a
        public Object a(Context context, int i) {
            if (this.b == null) {
                a();
            }
            try {
                return this.b.newInstance(context, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                Log.e("SimpleComponentHolder", "create", e);
                return null;
            } catch (InstantiationException e2) {
                Log.e("SimpleComponentHolder", "create", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("SimpleComponentHolder", "create", e3);
                return null;
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                this.b = this.f16070a.getConstructor(Context.class, Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException("Can't find constructor of component");
            }
        }
    }

    public c(Class<?> cls) {
        this(cls, new a(cls));
    }

    public c(Class<?> cls, com.taobao.android.weex_framework.platform.a aVar) {
        this.g = false;
        this.f16069a = cls;
        this.f = aVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public synchronized Object a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb1b6ef", new Object[]{this, context, new Integer(i)});
        }
        return this.f.a(context, i);
    }

    private void e() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.g) {
            try {
                for (Method method : this.f16069a.getMethods()) {
                    try {
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        int length = declaredAnnotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            Annotation annotation = declaredAnnotations[i];
                            if (annotation != null) {
                                if (annotation instanceof JSMethod) {
                                    JSMethod jSMethod = (JSMethod) annotation;
                                    String alias = jSMethod.alias();
                                    if ("_".equals(alias)) {
                                        alias = method.getName();
                                    }
                                    this.c.put(alias, new b(method, jSMethod.uiThread()));
                                } else if (annotation instanceof WXComponentProp) {
                                    this.b.put(((WXComponentProp) annotation).name(), new b(method, true));
                                    break;
                                } else if (annotation instanceof JSSetter) {
                                    this.d.put(((JSSetter) annotation).name(), new b(method, true));
                                    break;
                                } else if (annotation instanceof JSGetter) {
                                    this.e.put(((JSGetter) annotation).name(), new b(method, true));
                                    break;
                                }
                            }
                            i++;
                        }
                    } catch (ArrayIndexOutOfBoundsException | IncompatibleClassChangeError unused) {
                    }
                }
            } catch (Exception e) {
                Log.e("SimpleComponentHolder", "retrievalMethod", e);
            }
            this.g = true;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.g) {
            e();
        }
        return this.b.isEmpty();
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("811880d1", new Object[]{this, str});
        }
        if (!this.g) {
            e();
        }
        return this.b.get(str);
    }

    public b a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("75703e21", new Object[]{this, str, new Boolean(z)});
        }
        if (!this.g) {
            e();
        }
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        if (z) {
            return this.d.get(str);
        }
        return this.e.get(str);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (!this.g) {
            e();
        }
        return a(this.c.keySet());
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!this.g) {
            e();
        }
        return a(this.d.keySet());
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (!this.g) {
            e();
        }
        return a(this.e.keySet());
    }

    private String a(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b491829", new Object[]{this, set});
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(set);
            return jSONArray.toJSONString();
        } catch (Exception unused) {
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }
}
