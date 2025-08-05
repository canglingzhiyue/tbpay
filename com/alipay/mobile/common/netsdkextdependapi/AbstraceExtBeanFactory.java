package com.alipay.mobile.common.netsdkextdependapi;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public abstract class AbstraceExtBeanFactory<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, T> mBeanMap = null;
    public T defaultBean = null;
    public T backupBean = null;

    /* renamed from: newBackupBean */
    public abstract T mo593newBackupBean();

    /* renamed from: newDefaultBean */
    public abstract T mo594newDefaultBean();

    public T getDefaultBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21488c10", new Object[]{this});
        }
        T t = this.defaultBean;
        if (t != null) {
            return t;
        }
        synchronized (AbstraceExtBeanFactory.class) {
            if (this.defaultBean != null) {
                return this.defaultBean;
            }
            this.defaultBean = mo594newDefaultBean();
            if (this.defaultBean != null) {
                return this.defaultBean;
            }
            return getBackupBean();
        }
    }

    public void setDefaultBean(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3797bb32", new Object[]{this, t});
            return;
        }
        this.defaultBean = t;
        if (t == null) {
            return;
        }
        Level level = Level.FINEST;
        InnerMiscUtil.log(level, "setDefaultBean, hash= " + t.hashCode() + ",class= " + t.getClass().getSimpleName());
    }

    public T getBackupBean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6b71f203", new Object[]{this});
        }
        T t = this.backupBean;
        if (t != null) {
            return t;
        }
        synchronized (this) {
            if (this.backupBean != null) {
                return this.backupBean;
            }
            this.backupBean = mo593newBackupBean();
            return this.backupBean;
        }
    }

    public T getBean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c5d8f5db", new Object[]{this, str});
        }
        Map<String, T> map = this.mBeanMap;
        if (map != null && !map.isEmpty()) {
            return this.mBeanMap.get(str);
        }
        return null;
    }

    public T addBean(String str, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("20b1abd4", new Object[]{this, str, t}) : getBeanMap().put(str, t);
    }

    public T removeBean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7a2dbed", new Object[]{this, str});
        }
        Map<String, T> map = this.mBeanMap;
        if (map != null && !map.isEmpty()) {
            return this.mBeanMap.remove(str);
        }
        return null;
    }

    public Map<String, T> getBeanMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe462c52", new Object[]{this});
        }
        Map<String, T> map = this.mBeanMap;
        if (map != null) {
            return map;
        }
        synchronized (this) {
            if (this.mBeanMap != null) {
                return this.mBeanMap;
            }
            this.mBeanMap = new HashMap(2);
            return this.mBeanMap;
        }
    }
}
