package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ExtensionRegistry {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends ExtendableMessage>, Map<Integer, Extension<?, ?>>> f4893a = new LinkedHashMap();
    private final Map<Class<? extends ExtendableMessage>, Map<String, Extension<?, ?>>> b = new LinkedHashMap();

    public final <T extends ExtendableMessage<?>, E> void add(Extension<T, E> extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3527dff7", new Object[]{this, extension});
            return;
        }
        Class<T> extendedType = extension.getExtendedType();
        Map<Integer, Extension<?, ?>> map = this.f4893a.get(extendedType);
        Map<String, Extension<?, ?>> map2 = this.b.get(extendedType);
        if (map == null) {
            map = new LinkedHashMap<>();
            map2 = new LinkedHashMap<>();
            this.f4893a.put(extendedType, map);
            this.b.put(extendedType, map2);
        }
        map.put(Integer.valueOf(extension.getTag()), extension);
        map2.put(extension.getName(), extension);
    }

    public final <T extends ExtendableMessage<?>, E> Extension<T, E> getExtension(Class<T> cls, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("f666b685", new Object[]{this, cls, new Integer(i)});
        }
        Map<Integer, Extension<?, ?>> map = this.f4893a.get(cls);
        if (map != null) {
            return (Extension<T, E>) map.get(Integer.valueOf(i));
        }
        return null;
    }

    public final <T extends ExtendableMessage<?>, E> Extension<T, E> getExtension(Class<T> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("ae9867c6", new Object[]{this, cls, str});
        }
        Map<String, Extension<?, ?>> map = this.b.get(cls);
        if (map != null) {
            return (Extension<T, E>) map.get(str);
        }
        return null;
    }
}
