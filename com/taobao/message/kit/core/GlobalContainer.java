package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class GlobalContainer extends BaseContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GlobalContainer";

    static {
        kge.a(-1441351070);
    }

    public static /* synthetic */ Object ipc$super(GlobalContainer globalContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -366443726) {
            if (hashCode != 605395102) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.get((Class) objArr[0], (String) objArr[1], (String) objArr[2]);
        }
        return super.get((Class) objArr[0]);
    }

    /* loaded from: classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static GlobalContainer instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ GlobalContainer access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GlobalContainer) ipChange.ipc$dispatch("285aea06", new Object[0]) : instance;
        }

        static {
            kge.a(-989765835);
            instance = new GlobalContainer();
        }
    }

    public static GlobalContainer getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GlobalContainer) ipChange.ipc$dispatch("ca4d7f21", new Object[0]) : (GlobalContainer) SingletonHolder.access$000().getLazy();
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2415989e", new Object[]{this, cls, str, str2});
        }
        T t = (T) super.get(cls, str, str2);
        return t == null ? (T) DelayInitContainer.getInstance().get(cls, str, str2) : t;
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        T t = (T) super.get(cls);
        return t == null ? (T) DelayInitContainer.getInstance().get(cls) : t;
    }
}
