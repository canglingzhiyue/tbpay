package com.alipay.mobile.common.netsdkextdependapi;

import com.alipay.mobile.common.netsdkextdependapi.beaninfo.BeanInfoUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class InnerMiscUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Logger logger = Logger.getLogger(InnerMiscUtil.class.getName());

    public static final boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue() : str == null || str.length() == 0;
    }

    public static final <T> T newDefaultBean(String str, Class<T> cls) {
        String beanClassName = BeanInfoUtil.getBeanClassName(str);
        if (isEmpty(beanClassName)) {
            return null;
        }
        return (T) cls.getClassLoader().loadClass(beanClassName).newInstance();
    }

    public static void log(Level level, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26a33ac", new Object[]{level, str});
            return;
        }
        try {
            logger.log(level, str);
        } catch (Throwable unused) {
        }
    }

    public static void log(Level level, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5503c9", new Object[]{level, str, th});
            return;
        }
        try {
            logger.log(level, str, th);
        } catch (Throwable unused) {
        }
    }

    public static boolean isLoggable(Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("193a3bc3", new Object[]{level})).booleanValue();
        }
        try {
            return logger.isLoggable(level);
        } catch (Throwable unused) {
            return false;
        }
    }
}
