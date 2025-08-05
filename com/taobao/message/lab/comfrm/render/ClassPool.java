package com.taobao.message.lab.comfrm.render;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class ClassPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1883859219);
    }

    private ClassPool() {
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static ClassPool instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ ClassPool access$100() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ClassPool) ipChange.ipc$dispatch("bb55ca80", new Object[0]) : instance;
        }

        static {
            kge.a(1403307456);
            instance = new ClassPool();
        }
    }

    public static ClassPool instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassPool) ipChange.ipc$dispatch("cd4a121c", new Object[0]) : SingletonHolder.access$100();
    }

    public Class get(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("367ce814", new Object[]{this, str}) : com.taobao.message.lab.comfrm.inner2.ClassPool.instance().get(str);
    }

    public void put(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aa7add", new Object[]{this, str, cls});
        } else {
            com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put(str, cls);
        }
    }

    public void put(String str, Class cls, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9b8767", new Object[]{this, str, cls, str2});
        } else {
            com.taobao.message.lab.comfrm.inner2.ClassPool.instance().put(str, cls, str2);
        }
    }
}
