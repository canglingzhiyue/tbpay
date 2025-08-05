package com.taobao.message.kit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class DelayInitContainer extends BaseContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InitMethodCallback initMethodCallback;

    /* loaded from: classes7.dex */
    public interface InitMethodCallback {
        <T> void doInitMethod(Class<T> cls);

        <T> void doInitMethod(Class<T> cls, String str, String str2);
    }

    static {
        kge.a(1640283082);
    }

    public static /* synthetic */ Object ipc$super(DelayInitContainer delayInitContainer, String str, Object... objArr) {
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
        private static DelayInitContainer instance;

        private SingletonHolder() {
        }

        public static /* synthetic */ DelayInitContainer access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DelayInitContainer) ipChange.ipc$dispatch("10f0c2a4", new Object[0]) : instance;
        }

        static {
            kge.a(-812674915);
            instance = new DelayInitContainer();
        }
    }

    public static DelayInitContainer getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DelayInitContainer) ipChange.ipc$dispatch("158653a9", new Object[0]) : (DelayInitContainer) SingletonHolder.access$000().getLazy();
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{this, cls});
        }
        InitMethodCallback initMethodCallback = this.initMethodCallback;
        if (initMethodCallback != null) {
            initMethodCallback.doInitMethod(cls);
        }
        return (T) super.get(cls);
    }

    public <T> T getWithoutInit(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f6f6ff9e", new Object[]{this, cls}) : (T) super.get(cls);
    }

    @Override // com.taobao.message.kit.core.BaseContainer
    public <T> T get(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2415989e", new Object[]{this, cls, str, str2});
        }
        InitMethodCallback initMethodCallback = this.initMethodCallback;
        if (initMethodCallback != null) {
            initMethodCallback.doInitMethod(cls, str, str2);
        }
        return (T) super.get(cls, str, str2);
    }

    public <T> T getWithoutInit(Class<T> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f7234f0a", new Object[]{this, cls, str, str2}) : (T) super.get(cls, str, str2);
    }

    public InitMethodCallback getInitMethodCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InitMethodCallback) ipChange.ipc$dispatch("9f61c134", new Object[]{this}) : this.initMethodCallback;
    }

    public void setInitMethodCallback(InitMethodCallback initMethodCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25b1872", new Object[]{this, initMethodCallback});
        } else {
            this.initMethodCallback = initMethodCallback;
        }
    }
}
