package com.taobao.message.launcher.init;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.wangxin.app.InitMessage;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes7.dex */
public class ReInitHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "message_init";
    private static final String MONITOR_POINT = "message_not_run_application";
    private static final String TAG = "ReInitHelper";
    public static String sInitClassName;

    static {
        kge.a(-1749357060);
        sInitClassName = InitMessage.INIT_CLASS_NAME;
    }

    public static boolean init() {
        try {
            Class<?> cls = Class.forName(sInitClassName);
            if (cls != null) {
                Method method = cls.getMethod("init", new Class[0]);
                if (method != null) {
                    InitOpenPoint.before();
                    try {
                        try {
                            method.invoke(null, new Object[0]);
                        } catch (IllegalAccessException e) {
                            TLog.loge(TAG, Log.getStackTraceString(e));
                        }
                    } catch (InvocationTargetException e2) {
                        TLog.loge(TAG, Log.getStackTraceString(e2));
                    }
                    InitOpenPoint.after();
                }
            } else {
                TLog.loge(TAG, " reInit is error ");
            }
            return true;
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            return false;
        }
    }

    public static boolean reInit(String str, String str2) {
        try {
            Class<?> cls = Class.forName(sInitClassName);
            if (cls == null) {
                TLog.loge(TAG, " reInit is error ");
                return true;
            }
            Method method = cls.getMethod("reInit", String.class, String.class);
            if (method == null) {
                return true;
            }
            InitOpenPoint.before();
            try {
                method.invoke(null, str, str2);
            } catch (IllegalAccessException e) {
                TLog.loge(TAG, Log.getStackTraceString(e));
            } catch (InvocationTargetException e2) {
                TLog.loge(TAG, Log.getStackTraceString(e2));
            }
            InitOpenPoint.after();
            return true;
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
            return false;
        }
    }
}
