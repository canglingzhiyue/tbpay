package com.alibaba.poplayer.factory;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.exception.PoplayerException;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private int f3178a;
    private final HashMap<String, Class<? extends PopLayerBaseView>> b;
    private Class<? extends PopLayerBaseView> c;
    private final Set<String> d;
    private String e;

    /* renamed from: com.alibaba.poplayer.factory.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0117a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f3179a;

        static {
            kge.a(-1506531361);
            f3179a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b065340f", new Object[0]) : f3179a;
        }
    }

    static {
        kge.a(-927721716);
        TAG = a.class.getSimpleName();
    }

    private a() {
        this.f3178a = 0;
        this.b = new HashMap<>();
        this.d = new HashSet();
        this.e = "";
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b065340f", new Object[0]) : C0117a.a();
    }

    public void a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
        } else if (list == null || list.isEmpty()) {
            throw new PoplayerException("viewTypes is empty;");
        } else {
            if (StringUtils.isEmpty(str) || !list.contains(str)) {
                throw new PoplayerException("defaultType is empty or viewTypes don't contains defaultType.");
            }
            this.f3178a = 1;
            this.d.addAll(list);
            this.e = str;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            throw new PoplayerException("viewType is empty;");
        } else {
            this.d.add(str);
        }
    }

    public PopLayerBaseView a(Context context, String str, d dVar) {
        Class<? extends PopLayerBaseView> cls;
        int i = this.f3178a;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            if (PopLayer.getReference().getPopLayerViewFactoryAdapter() == null) {
                c.a("%s.getPopLayerViewFactoryAdapter == null.", TAG);
                return null;
            }
            if (StringUtils.isEmpty(str)) {
                str = this.e;
            }
            return PopLayer.getReference().getPopLayerViewFactoryAdapter().generatePopLayerViewByType(context, str, dVar);
        }
        Class<? extends PopLayerBaseView> cls2 = this.b.get(str);
        if (cls2 != null || !StringUtils.isEmpty(str) || (cls = this.c) == null) {
            cls = cls2;
        } else {
            c.a("%s.create:use baseItem.", TAG);
        }
        if (cls == null) {
            c.a("%s.create:can't find type.", TAG);
            return null;
        }
        try {
            Constructor<? extends PopLayerBaseView> declaredConstructor = cls.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(context);
        } catch (Throwable th) {
            c.a(TAG + ".newInstance fail!", th);
            return null;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
    }
}
