package com.android.tools.ir.runtime;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.utils.RefectUtils;
import com.taobao.search.common.util.i;
import com.taobao.weex.common.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ApplicationInvoker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, ApplicationInvoker> mApplications = new ConcurrentHashMap();
    private static b sApplicationMonitor = new b();
    private final String bundleName;
    private volatile boolean inited = false;

    /* loaded from: classes3.dex */
    public interface a {
    }

    private ApplicationInvoker(String str) {
        this.bundleName = str;
    }

    public static ApplicationInvoker getInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApplicationInvoker) ipChange.ipc$dispatch("1173b3a8", new Object[]{str});
        }
        synchronized (mApplications) {
            if (mApplications.containsKey(str)) {
                return mApplications.get(str);
            }
            ApplicationInvoker applicationInvoker = new ApplicationInvoker(str);
            mApplications.put(str, applicationInvoker);
            return applicationInvoker;
        }
    }

    public synchronized void invoke(String str, Context context) {
        if (!this.inited) {
            this.inited = true;
            if (!StringUtils.isEmpty(str)) {
                try {
                    Class<?> loadClass = ApplicationInvoker.class.getClassLoader().loadClass(str);
                    if (loadClass == null) {
                        throw new ClassNotFoundException(String.format("can not find class: %s", str));
                    }
                    Application application = (Application) loadClass.newInstance();
                    RefectUtils.method(application, Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class).invoke(application, ((Application) context).getBaseContext());
                    Method method = RefectUtils.method(application, i.b.MEASURE_ONCREATE, new Class[0]);
                    long currentTimeMillis = System.currentTimeMillis();
                    method.invoke(application, new Object[0]);
                    sApplicationMonitor.a("invoke", this.bundleName, str, context.getClass().getName(), System.currentTimeMillis() - currentTimeMillis);
                    Log.e("ApplicationInvoker", "successfully invoke start application " + str);
                } catch (Exception e) {
                    e.printStackTrace();
                    this.inited = false;
                }
            }
        }
    }

    public synchronized void invoke(String str, Context context, a aVar) {
        if (!this.inited) {
            this.inited = true;
            if (!StringUtils.isEmpty(str)) {
                try {
                    Class<?> loadClass = ApplicationInvoker.class.getClassLoader().loadClass(str);
                    if (loadClass == null) {
                        throw new ClassNotFoundException(String.format("can not find class: %s", str));
                    }
                    Application application = (Application) loadClass.newInstance();
                    RefectUtils.method(application, Constants.Event.SLOT_LIFECYCLE.ATTACH, Context.class).invoke(application, ((Application) context).getBaseContext());
                    Method method = RefectUtils.method(application, i.b.MEASURE_ONCREATE, new Class[0]);
                    long currentTimeMillis = System.currentTimeMillis();
                    method.invoke(application, new Object[0]);
                    sApplicationMonitor.a("call", this.bundleName, str, context.getClass().getName(), System.currentTimeMillis() - currentTimeMillis);
                    Log.e("ApplicationInvoker", "successfully invoke start application " + str);
                } catch (Exception e) {
                    this.inited = false;
                    if (aVar != null) {
                        e.getMessage();
                    }
                }
            } else if (aVar != null) {
            }
        } else if (aVar != null) {
        }
    }
}
