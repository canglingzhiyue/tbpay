package com.taobao.android.weex_framework.ui;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.media.MediaConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class k<T extends INode> implements d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile Map<String, com.taobao.android.weex_framework.bridge.c<INode>> f16078a;
    private volatile Map<String, com.taobao.android.weex_framework.bridge.c<INode>> b;
    private volatile Map<String, com.taobao.android.weex_framework.bridge.c<INode>> c;
    private volatile boolean d;
    private final l<T> e;
    private final Class<? extends INode> f;

    static {
        kge.a(-1852148577);
        kge.a(-1337233073);
    }

    public k(Class<T> cls) {
        this(new a(cls), cls);
    }

    public k(l<T> lVar, Class<T> cls) {
        this.e = lVar;
        this.f = cls;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d) {
        } else {
            synchronized (this) {
                if (this.d) {
                    return;
                }
                b<Map<String, com.taobao.android.weex_framework.bridge.c<INode>>, Map<String, com.taobao.android.weex_framework.bridge.c<INode>>, Map<String, com.taobao.android.weex_framework.bridge.c<INode>>> a2 = a(this.f);
                this.f16078a = (Map) b.a(a2);
                this.c = (Map) b.b(a2);
                this.b = (Map) b.c(a2);
                this.d = true;
            }
        }
    }

    private static b<Map<String, com.taobao.android.weex_framework.bridge.c<INode>>, Map<String, com.taobao.android.weex_framework.bridge.c<INode>>, Map<String, com.taobao.android.weex_framework.bridge.c<INode>>> a(Class cls) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7c65c0e6", new Object[]{cls});
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        try {
            for (Method method : cls.getMethods()) {
                try {
                    a(method, method.getDeclaredAnnotations(), hashMap2, hashMap, hashMap3);
                } catch (ArrayIndexOutOfBoundsException | IncompatibleClassChangeError unused) {
                }
            }
        } catch (IndexOutOfBoundsException unused2) {
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
        }
        return new b<>(hashMap, hashMap2, hashMap3);
    }

    private static void a(Method method, Annotation[] annotationArr, Map<String, com.taobao.android.weex_framework.bridge.c<INode>> map, Map<String, com.taobao.android.weex_framework.bridge.c<INode>> map2, Map<String, com.taobao.android.weex_framework.bridge.c<INode>> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83aa1524", new Object[]{method, annotationArr, map, map2, map3});
        } else if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (annotation != null) {
                    if (annotation instanceof MUSNodeProp) {
                        MUSNodeProp mUSNodeProp = (MUSNodeProp) annotation;
                        String name = mUSNodeProp.name();
                        if (!mUSNodeProp.refresh()) {
                            map2.put(name, new com.taobao.android.weex_framework.bridge.d(method, MUSThreadStrategy.CURRENT, mUSNodeProp));
                            return;
                        } else {
                            map3.put(name, new com.taobao.android.weex_framework.bridge.d(method, MUSThreadStrategy.CURRENT, mUSNodeProp));
                            return;
                        }
                    } else if (annotation instanceof MUSMethod) {
                        MUSMethod mUSMethod = (MUSMethod) annotation;
                        String alias = mUSMethod.alias();
                        if (StringUtils.equals(mUSMethod.alias(), "_")) {
                            alias = method.getName();
                        }
                        map.put(alias, new com.taobao.android.weex_framework.bridge.d(method, mUSMethod.uiThread() ? MUSThreadStrategy.UI : MUSThreadStrategy.JS));
                        return;
                    }
                }
            }
        }
    }

    @Override // com.taobao.android.weex_framework.ui.d
    public com.taobao.android.weex_framework.bridge.c<T> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("3943a539", new Object[]{this, str});
        }
        b();
        return (com.taobao.android.weex_framework.bridge.c<T>) this.f16078a.get(str);
    }

    @Override // com.taobao.android.weex_framework.ui.d
    public com.taobao.android.weex_framework.bridge.c<T> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("a3732d58", new Object[]{this, str});
        }
        b();
        return (com.taobao.android.weex_framework.bridge.c<T>) this.b.get(str);
    }

    @Override // com.taobao.android.weex_framework.bridge.a
    public com.taobao.android.weex_framework.bridge.c<T> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("cf141d1a", new Object[]{this, str});
        }
        b();
        return (com.taobao.android.weex_framework.bridge.c<T>) this.c.get(str);
    }

    @Override // com.taobao.android.weex_framework.bridge.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        b();
        Set<String> keySet = this.c.keySet();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(keySet);
            return jSONArray.toJSONString();
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.l
    public T a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
        }
        T a2 = this.e.a(mUSDKInstance, i, mUSProps, mUSProps2);
        a2.bindNodeHolder(this);
        a2.setInstance(mUSDKInstance);
        if (mUSProps != null) {
            a2.updateStyles(mUSProps);
        }
        if (mUSProps2 != null) {
            a2.updateAttrs(mUSProps2);
        }
        return a2;
    }

    /* loaded from: classes6.dex */
    public static class a<T extends INode> implements l<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Constructor<? extends INode> f16079a;
        private final Class<? extends INode> b;

        static {
            kge.a(-317452845);
            kge.a(43206167);
        }

        private a(Class<? extends INode> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("node class can't be null");
            }
            this.b = cls;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Class<? extends INode> cls = this.b;
            try {
                this.f16079a = cls.getConstructor(Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException(cls.getSimpleName() + " must have a default constructor");
            }
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public T a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            if (this.f16079a == null) {
                a();
            }
            Constructor<? extends INode> constructor = this.f16079a;
            if (constructor == null) {
                return null;
            }
            try {
                return (T) constructor.newInstance(Integer.valueOf(i));
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.a(e);
                return null;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class b<F, S, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private F f16080a;
        private S b;
        private T c;

        static {
            kge.a(-432582813);
        }

        public static /* synthetic */ Object a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("35e0d3e5", new Object[]{bVar}) : bVar.f16080a;
        }

        public static /* synthetic */ Object b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b441d7c4", new Object[]{bVar}) : bVar.b;
        }

        public static /* synthetic */ Object c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("32a2dba3", new Object[]{bVar}) : bVar.c;
        }

        public b(F f, S s, T t) {
            this.f16080a = f;
            this.b = s;
            this.c = t;
        }
    }
}
