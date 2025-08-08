package com.taobao.adaemon;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ProcessController;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class ProcessController implements IpcChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLEAR_STACK_ALL = "clearall";
    public static final String REMOTE_CONTENT_PROVIDER = "com.taobao.accs.AccsIPCProvider";
    private static final CopyOnWriteArraySet<c> S_LISTENERS;
    private static final ConcurrentHashMap<String, i> S_PROCESSES;
    private static final CopyOnWriteArraySet<ITrigger> S_TRIGGERS;
    private static final String TAG = "ProcC";

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ProcessController f8329a;

        static {
            kge.a(544069666);
            f8329a = new ProcessController();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        void a(String str, int i);

        void a(String str, boolean z, String str2);
    }

    static {
        kge.a(-652981490);
        kge.a(-1916142844);
        S_PROCESSES = new ConcurrentHashMap<>();
        S_LISTENERS = new CopyOnWriteArraySet<>();
        S_TRIGGERS = new CopyOnWriteArraySet<>();
    }

    private ProcessController() {
    }

    public static ProcessController getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessController) ipChange.ipc$dispatch("489542e5", new Object[0]) : a.f8329a;
    }

    public void registerProcessListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f8e8e9", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            S_LISTENERS.add(cVar);
        }
    }

    public void unregisterProcessListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3881efb0", new Object[]{this, cVar});
        } else {
            S_LISTENERS.remove(cVar);
        }
    }

    public int getProcessSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("79e0f154", new Object[]{this})).intValue() : S_PROCESSES.size();
    }

    public i getProcess(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("3b84ff8f", new Object[]{this, str}) : S_PROCESSES.get(str);
    }

    public Pair<Long, Long> getMainProcCpuTime(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("87c5007b", new Object[]{this, context});
        }
        i process = getProcess(context.getPackageName());
        if (process != null) {
            return process.g();
        }
        return null;
    }

    public void tryDumpMain(Context context, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0607b9", new Object[]{this, context, new Long(j), new Long(j2)});
            return;
        }
        i process = getProcess(context.getPackageName());
        if (process == null) {
            return;
        }
        process.a(j, j2);
    }

    public boolean clearActivityStack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df101", new Object[]{this, str})).booleanValue();
        }
        if (CLEAR_STACK_ALL.equals(str)) {
            e.b(TAG, "clear all stack", new Object[0]);
            for (i iVar : S_PROCESSES.values()) {
                if (iVar.c() && !iVar.d()) {
                    e.b(TAG, "clearActivityStack fail:" + iVar.b(), new Object[0]);
                    return false;
                }
            }
            return true;
        }
        i iVar2 = S_PROCESSES.get(str);
        if (iVar2 != null) {
            return iVar2.d();
        }
        return false;
    }

    public boolean isTinyProcess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5685889a", new Object[]{this, str})).booleanValue();
        }
        i iVar = S_PROCESSES.get(str);
        if (iVar != null) {
            return iVar.f();
        }
        return false;
    }

    public boolean isBgFromHomePage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3906a9dc", new Object[]{this, str})).booleanValue();
        }
        i iVar = S_PROCESSES.get(str);
        if (iVar != null) {
            return iVar.e();
        }
        return false;
    }

    public void triggerSchedule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5334c1c0", new Object[]{this, str});
            return;
        }
        Iterator<ITrigger> it = S_TRIGGERS.iterator();
        while (it.hasNext()) {
            ITrigger next = it.next();
            try {
                next.onTrigger(str);
            } catch (Throwable th) {
                if ((th instanceof IPCException) && ((IPCException) th).getErrorCode() == 5) {
                    S_TRIGGERS.remove(next);
                    e.b(TAG, "triggerSchedule remove", new Object[0]);
                }
            }
        }
    }

    public Map<String, i> getAllProcess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("560ed300", new Object[]{this}) : new HashMap(S_PROCESSES);
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static volatile IpcChannel f8330a;

        static {
            kge.a(1355648358);
        }

        public static /* synthetic */ IpcChannel a(IpcChannel ipcChannel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IpcChannel) ipChange.ipc$dispatch("9c51df82", new Object[]{ipcChannel});
            }
            f8330a = ipcChannel;
            return ipcChannel;
        }

        private static IpcChannel a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IpcChannel) ipChange.ipc$dispatch("cdd65995", new Object[0]);
            }
            if (f8330a == null) {
                synchronized (b.class) {
                    if (f8330a == null) {
                        final ComponentName componentName = new ComponentName(jzv.a(), "com.taobao.accs.AccsIPCProvider");
                        try {
                            f8330a = (IpcChannel) jzv.b(componentName, IpcChannel.class, new Pair[0]);
                        } catch (IPCException e) {
                            e.a(ProcessController.TAG, "[getIpcCenter]", e, new Object[0]);
                        }
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(Constants.ACTION_DISCONNECT);
                        jzv.a().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.adaemon.ProcessController$IPC$1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context, final Intent intent) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                                } else {
                                    c.a(new Runnable() { // from class: com.taobao.adaemon.ProcessController$IPC$1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            String stringExtra = intent.getStringExtra("processName");
                                            if (StringUtils.isEmpty(stringExtra) || !stringExtra.equals(l.j(jzv.a()))) {
                                                return;
                                            }
                                            try {
                                                e.a("ProcC", "[onReceive]", null, "process", stringExtra);
                                                ProcessController.b.a((IpcChannel) jzv.b(componentName, IpcChannel.class, new Pair[0]));
                                            } catch (IPCException e2) {
                                                e.a("ProcC", "[getIpcCenter]", null, e2);
                                            }
                                        }
                                    });
                                }
                            }
                        }, intentFilter);
                    }
                }
            }
            return f8330a;
        }

        public static void a(String str, IRemoteProcessHandler iRemoteProcessHandler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e77c094", new Object[]{str, iRemoteProcessHandler});
                return;
            }
            try {
                a().registerProcessToRemote(str, iRemoteProcessHandler);
            } catch (IPCException unused) {
                f8330a = null;
            }
        }

        public static void a(ITrigger iTrigger) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a627e74d", new Object[]{iTrigger});
                return;
            }
            try {
                a().registerTriggerToRemote(iTrigger);
            } catch (IPCException unused) {
                f8330a = null;
            }
        }

        public static void a(String str, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3b0622c", new Object[]{str, new Boolean(z), str2});
                return;
            }
            try {
                a().updateLifecycleToRemote(str, z, str2);
            } catch (IPCException unused) {
                f8330a = null;
            }
        }

        public static void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{str, new Integer(i)});
                return;
            }
            try {
                a().updateMemoryEventToRemote(str, i);
            } catch (IPCException unused) {
                f8330a = null;
            }
        }
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void registerProcessToRemote(String str, IRemoteProcessHandler iRemoteProcessHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed2fd40", new Object[]{this, str, iRemoteProcessHandler});
            return;
        }
        e.b(TAG, "[registerProcessToRemote]", "process", str);
        i iVar = new i(str);
        iVar.a(iRemoteProcessHandler);
        S_PROCESSES.put(str, iVar);
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void unregisterProcessToRemote(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa535e5", new Object[]{this, str});
            return;
        }
        e.b(TAG, "[unregisterProcessToRemote]process:" + str, new Object[0]);
        S_PROCESSES.remove(str);
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void registerTriggerToRemote(ITrigger iTrigger) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec5ef8", new Object[]{this, iTrigger});
            return;
        }
        e.b(TAG, "[registerTriggerToRemote]", new Object[0]);
        S_TRIGGERS.add(iTrigger);
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void updateLifecycleToRemote(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797d994b", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        e.b(TAG, "[updateLifecycleToRemote]process:" + str + ", background:" + z + ", bgType:" + str2, new Object[0]);
        i iVar = S_PROCESSES.get(str);
        if (iVar != null) {
            iVar.a(z, str2);
        }
        if ("init".equals(str2)) {
            return;
        }
        if (j.a().H()) {
            if (z) {
                g.b().l();
            } else {
                g.b().k();
            }
        }
        Iterator<c> it = S_LISTENERS.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(str, z, str2);
            } catch (Exception e) {
                e.a(TAG, "[updateLifecycleToRemote]", null, e);
            }
        }
    }

    @Override // com.taobao.adaemon.IpcChannel
    public void updateMemoryEventToRemote(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a97b21", new Object[]{this, str, new Integer(i)});
            return;
        }
        e.b(TAG, "[updateMemoryEventToRemote]process:" + str + ", event:" + i, new Object[0]);
        Iterator<c> it = S_LISTENERS.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(str, i);
            } catch (Exception e) {
                e.a(TAG, "[updateMemoryEventToRemote]", null, e);
            }
        }
    }
}
