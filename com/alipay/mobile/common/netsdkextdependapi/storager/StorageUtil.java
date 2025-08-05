package com.alipay.mobile.common.netsdkextdependapi.storager;

import com.alipay.mobile.common.netsdkextdependapi.InnerMiscUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public class StorageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final boolean saveSerializable(String str, Serializable serializable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c14bb5e7", new Object[]{str, serializable, new Long(j)})).booleanValue();
        }
        try {
            return a().saveSerializable(str, serializable, j);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[StorageUtil#saveSerializable] Exception: " + th.toString(), th);
            return false;
        }
    }

    public static final Serializable getSerializable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("3cc33b64", new Object[]{str});
        }
        try {
            return a().getSerializable(str);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[StorageUtil#getSerializable] Exception: " + th.toString(), th);
            return null;
        }
    }

    public static final boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{str})).booleanValue();
        }
        try {
            return a().remove(str);
        } catch (Throwable th) {
            Level level = Level.WARNING;
            InnerMiscUtil.log(level, "[StorageUtil#getSerializable] Exception: " + th.toString(), th);
            return true;
        }
    }

    private static final StorageManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StorageManager) ipChange.ipc$dispatch("4072cf46", new Object[0]) : StorageManagerFactory.getInstance().getDefaultBean();
    }
}
