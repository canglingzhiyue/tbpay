package com.taobao.message.lab.comfrm.inner2;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class ClassPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ConcurrentHashMap<String, Class> mClassByName;
    private static final ConcurrentHashMap<String, ConcurrentHashMap<String, Class>> mClassByNameBySpace;
    private static final ConcurrentHashMap<String, Class> mLowLevelClassByName;
    private static final List<String> mRemotePackageNamePre;

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
            return ipChange instanceof IpChange ? (ClassPool) ipChange.ipc$dispatch("e5998fba", new Object[0]) : instance;
        }

        static {
            kge.a(1439343942);
            instance = new ClassPool();
        }
    }

    public static ClassPool instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassPool) ipChange.ipc$dispatch("f78dd756", new Object[0]) : SingletonHolder.access$100();
    }

    static {
        kge.a(-475512205);
        mClassByNameBySpace = new ConcurrentHashMap<>();
        mClassByName = new ConcurrentHashMap<>();
        mLowLevelClassByName = new ConcurrentHashMap<>();
        mRemotePackageNamePre = Collections.singletonList("com.taobao.message.chatv2");
    }

    public void put(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aa7add", new Object[]{this, str, cls});
        } else if (str == null) {
        } else {
            mClassByName.put(str, cls);
        }
    }

    public void put(String str, Class cls, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9b8767", new Object[]{this, str, cls, str2});
        } else if (TextUtils.isEmpty(str2)) {
            put(str, cls);
        } else {
            ConcurrentHashMap<String, Class> concurrentHashMap = mClassByNameBySpace.get(str2);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                mClassByNameBySpace.put(str2, concurrentHashMap);
            }
            if (str == null) {
                return;
            }
            concurrentHashMap.put(str, cls);
        }
    }

    public void putLowLevel(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd9132d", new Object[]{this, str, cls});
        } else if (str == null) {
        } else {
            mLowLevelClassByName.put(str, cls);
        }
    }

    @Deprecated
    public Class get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("367ce814", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return mClassByName.get(str);
        }
        return null;
    }

    public HashMap<String, Class> getAll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("2718fe55", new Object[]{this}) : new HashMap<>(mClassByName);
    }

    private <T> T getInstance(String str, Class<T> cls, String str2, boolean z, ConcurrentHashMap<String, Class> concurrentHashMap) {
        Class cls2 = concurrentHashMap.get(str);
        if (cls2 == null) {
            cls2 = mLowLevelClassByName.get(str);
        }
        if (cls2 == null) {
            TLog.loge("ClassPool", "NOTFOUND|" + str);
            Logger.e("ClassPool", "NOTFOUND|" + str);
            if (!ApplicationUtil.isDebug() || str.startsWith("event") || str.startsWith("jsEvent")) {
                return null;
            }
            throw new RuntimeException("NOTFIND|" + str);
        }
        if (ApplicationUtil.isDebug() && !z) {
            if (mRemotePackageNamePre.contains(cls2.getPackage().getName())) {
                throw new RuntimeException("Remote Element load");
            }
        }
        try {
            T t = (T) cls2.newInstance();
            if (t instanceof UserIdentifier) {
                ((UserIdentifier) t).identifier(str2);
            }
            return t;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public <T> T getInstance(String str, Class<T> cls, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bb47ce09", new Object[]{this, str, cls, str2, new Boolean(z)}) : (T) getInstance(str, cls, str2, z, mClassByName);
    }

    public <T> T getInstance(String str, Class<T> cls, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3b0cc9bf", new Object[]{this, str, cls, str2, new Boolean(z), str3});
        }
        if (str3 == null) {
            return (T) getInstance(str, cls, str2, z);
        }
        ConcurrentHashMap<String, Class> concurrentHashMap = mClassByNameBySpace.get(str3);
        if (concurrentHashMap != null) {
            return (T) getInstance(str, cls, str2, z, concurrentHashMap);
        }
        return null;
    }

    public void check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17afa58f", new Object[]{this});
        } else {
            ApplicationUtil.isDebug();
        }
    }
}
