package com.alibaba.android.aura.datamodel;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(517392498);
    }

    public static <T extends Serializable> T a(T t) throws IOException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("559d22ee", new Object[]{t});
        }
        ObjectInputStream a2 = a((Object) t);
        T t2 = (T) a2.readObject();
        a2.close();
        return t2;
    }

    public static <T> List<T> a(List<T> list) throws IOException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        ObjectInputStream a2 = a((Object) list);
        List<T> list2 = (List) a2.readObject();
        a2.close();
        return list2;
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) throws IOException, ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        ObjectInputStream a2 = a((Object) map);
        Map<K, V> map2 = (Map) a2.readObject();
        a2.close();
        return map2;
    }

    private static ObjectInputStream a(Object obj) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectInputStream) ipChange.ipc$dispatch("148bf3a6", new Object[]{obj});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        return new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }
}
