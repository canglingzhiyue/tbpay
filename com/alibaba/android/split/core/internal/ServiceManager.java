package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.alibaba.android.split.aa;
import com.alibaba.android.split.core.tasks.m;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bgu;
import tb.kge;

/* loaded from: classes.dex */
public final class ServiceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map map;
    private BinderCreator binderCreator;
    private Context mContext;
    private IInterface mIInterface;
    private Intent mIntent;
    private bgu mLogger;
    private boolean optServce;
    private ServiceConnection serviceConnection;
    private boolean serviceExcuting;
    private String taskName;
    private List taskList = new ArrayList();
    private IBinder.DeathRecipient deathRecipient = new DeathRecipientImpl(this);

    static {
        kge.a(-944801584);
        map = Collections.synchronizedMap(new HashMap());
    }

    public ServiceManager(Context context, bgu bguVar, String str, Intent intent, BinderCreator binderCreator) {
        this.mContext = context;
        this.mLogger = bguVar;
        this.taskName = str;
        this.mIntent = intent;
        this.binderCreator = binderCreator;
        this.optServce = v.p(context);
    }

    public final void executeTask(AbstractTask abstractTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d96a11", new Object[]{this, abstractTask});
        } else {
            post(new TaskProxy(this, abstractTask.getTaskWrapper(), abstractTask));
        }
    }

    public final void unbindService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e2086", new Object[]{this});
        } else {
            post(new UnbindService(this));
        }
    }

    public final IInterface getIInterface() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IInterface) ipChange.ipc$dispatch("6f7dfb43", new Object[]{this}) : this.mIInterface;
    }

    private final Handler getHandler() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        synchronized (map) {
            if (!map.containsKey(this.taskName)) {
                HandlerThread handlerThread = new HandlerThread(this.taskName, 0);
                handlerThread.start();
                map.put(this.taskName, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.taskName);
        }
        return handler;
    }

    private final void execute(AbstractTask abstractTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8cab2c", new Object[]{this, abstractTask});
        } else if (this.mIInterface == null && !this.serviceExcuting) {
            this.mLogger.d("Initiate binding to the service.", new Object[0]);
            this.taskList.add(abstractTask);
            this.serviceConnection = new ServiceConnectionImpl(this);
            this.serviceExcuting = true;
            if (this.optServce) {
                if (aa.a(this.mContext, this.serviceConnection)) {
                    return;
                }
                this.mLogger.d("Failed to bind to local service.", new Object[0]);
                this.serviceExcuting = false;
                for (AbstractTask abstractTask2 : this.taskList) {
                    m taskWrapper = abstractTask2.getTaskWrapper();
                    if (taskWrapper != null) {
                        taskWrapper.a((Exception) new SplitLoadException());
                    }
                }
                this.taskList.clear();
            } else if (!this.mContext.bindService(this.mIntent, this.serviceConnection, 1)) {
                this.mLogger.d("Failed to bind to the service.", new Object[0]);
                this.serviceExcuting = false;
                for (AbstractTask abstractTask3 : this.taskList) {
                    m taskWrapper2 = abstractTask3.getTaskWrapper();
                    if (taskWrapper2 != null) {
                        taskWrapper2.a((Exception) new SplitLoadException());
                    }
                }
                this.taskList.clear();
            }
        } else if (this.serviceExcuting) {
            this.mLogger.d("Waiting to bind to the service.", new Object[0]);
            this.taskList.add(abstractTask);
        } else {
            abstractTask.run();
        }
    }

    private final void post(AbstractTask abstractTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f67097", new Object[]{this, abstractTask});
        } else {
            getHandler().post(abstractTask);
        }
    }

    private final void linkToDeath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfa0066", new Object[]{this});
            return;
        }
        this.mLogger.d("linkToDeath", new Object[0]);
        try {
            this.mIInterface.asBinder().linkToDeath(this.deathRecipient, 0);
        } catch (RemoteException e) {
            this.mLogger.a(e, "linkToDeath failed", new Object[0]);
        }
    }

    private final void unlinkToDeath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649ccad", new Object[]{this});
            return;
        }
        this.mLogger.d("unlinkToDeath", new Object[0]);
        this.mIInterface.asBinder().unlinkToDeath(this.deathRecipient, 0);
    }

    public static void execute(ServiceManager serviceManager, AbstractTask abstractTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44fe4cb", new Object[]{serviceManager, abstractTask});
        } else {
            serviceManager.execute(abstractTask);
        }
    }

    public static IInterface getIInterface(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IInterface) ipChange.ipc$dispatch("6d6c09e2", new Object[]{serviceManager}) : serviceManager.mIInterface;
    }

    public static bgu getLogger(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bgu) ipChange.ipc$dispatch("c7ce384a", new Object[]{serviceManager}) : serviceManager.mLogger;
    }

    public static ServiceConnection getServiceConnection(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("de214997", new Object[]{serviceManager}) : serviceManager.serviceConnection;
    }

    public static Context getContext(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("81811e57", new Object[]{serviceManager}) : serviceManager.mContext;
    }

    public static boolean setBinding(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b657ad", new Object[]{serviceManager})).booleanValue();
        }
        serviceManager.serviceExcuting = false;
        return false;
    }

    public static IInterface setIInterface(ServiceManager serviceManager, IInterface iInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInterface) ipChange.ipc$dispatch("c90b49c4", new Object[]{serviceManager, iInterface});
        }
        serviceManager.mIInterface = iInterface;
        return iInterface;
    }

    public static ServiceConnection releaseServiceConnection(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ServiceConnection) ipChange.ipc$dispatch("4287a4c6", new Object[]{serviceManager});
        }
        serviceManager.serviceConnection = null;
        return null;
    }

    public static BinderCreator getBinderCreator(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BinderCreator) ipChange.ipc$dispatch("17a62cb9", new Object[]{serviceManager}) : serviceManager.binderCreator;
    }

    public static void linkToDeath(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4081b145", new Object[]{serviceManager});
        } else {
            serviceManager.linkToDeath();
        }
    }

    public static List getTaskList(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("baf0c848", new Object[]{serviceManager}) : serviceManager.taskList;
    }

    public static void post(ServiceManager serviceManager, AbstractTask abstractTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20866d36", new Object[]{serviceManager, abstractTask});
        } else {
            serviceManager.post(abstractTask);
        }
    }

    public static void unlinkToDeath(ServiceManager serviceManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350bfc8c", new Object[]{serviceManager});
        } else {
            serviceManager.unlinkToDeath();
        }
    }

    public final void reportBinderDeath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eab5a9d", new Object[]{this});
            return;
        }
        this.mLogger.d("reportBinderDeath", new Object[0]);
        this.mLogger.d("%s : Binder has died.", this.taskName);
        for (AbstractTask abstractTask : this.taskList) {
            m taskWrapper = abstractTask.getTaskWrapper();
            if (taskWrapper != null) {
                taskWrapper.a((Exception) (Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.taskName).concat(" : Binder has died."))));
            }
        }
        this.taskList.clear();
    }

    public boolean isOptService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0e4bd7", new Object[]{this})).booleanValue() : this.optServce;
    }
}
