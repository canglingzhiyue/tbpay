package com.taobao.accs.asp;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.e;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.exception.IPCException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jzv;
import tb.kge;

/* loaded from: classes.dex */
public class PrefsIPCChannel implements IPrefsChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CORE_PROCESS_CREATED = "com.taobao.adaemon.CORE_PROCESS_CREATED";
    public static final String CORE_CONTENT_PROVIDER = "com.taobao.accs.AccsIPCProvider";
    private static final String TAG = "PrefsIPCChannel";
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<OnDataUpdateListener>> listeners = new ConcurrentHashMap<>();
    private final ARangerReceiver receiver = new ARangerReceiver();
    private final AtomicBoolean coreProcessReady = new AtomicBoolean(false);
    private volatile boolean isRegisterReceiver = false;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static PrefsIPCChannel f8176a;

        static {
            kge.a(527161684);
            f8176a = new PrefsIPCChannel();
        }
    }

    static {
        kge.a(1088118300);
        kge.a(934632065);
    }

    public static /* synthetic */ AtomicBoolean access$100(PrefsIPCChannel prefsIPCChannel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("2a007ced", new Object[]{prefsIPCChannel}) : prefsIPCChannel.coreProcessReady;
    }

    public static PrefsIPCChannel getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PrefsIPCChannel) ipChange.ipc$dispatch("b13edaa7", new Object[0]) : b.f8176a;
    }

    @Override // com.taobao.accs.asp.IPrefsChannel
    public void commitToDiskRemote(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3803e536", new Object[]{this, modifiedRecord});
            return;
        }
        SharedPreferences multiProcessSharedPreferences = APreferencesManager.getMultiProcessSharedPreferences(modifiedRecord.name);
        if (!(multiProcessSharedPreferences instanceof com.taobao.accs.asp.b)) {
            return;
        }
        ((com.taobao.accs.asp.b) multiProcessSharedPreferences).a(modifiedRecord);
    }

    @Override // com.taobao.accs.asp.IPrefsChannel
    public void registerDataListenerRemote(String str, OnDataUpdateListener onDataUpdateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1822b7c6", new Object[]{this, str, onDataUpdateListener});
            return;
        }
        CopyOnWriteArrayList<OnDataUpdateListener> copyOnWriteArrayList = this.listeners.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(onDataUpdateListener);
        this.listeners.put(str, copyOnWriteArrayList);
    }

    public void dataUpdateEvent(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1efc88", new Object[]{this, modifiedRecord});
            return;
        }
        CopyOnWriteArrayList<OnDataUpdateListener> copyOnWriteArrayList = this.listeners.get(modifiedRecord.name);
        if (copyOnWriteArrayList == null) {
            return;
        }
        Iterator<OnDataUpdateListener> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            OnDataUpdateListener next = it.next();
            if (next != null) {
                e.a aVar = new e.a(3);
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    next.onDataUpdate(modifiedRecord);
                    aVar.b = 1;
                } catch (IPCException e) {
                    ALog.e(TAG, "[dataUpdateEvent]error.", null, e);
                    aVar.b = 0;
                    int errorCode = e.getErrorCode();
                    if (errorCode == 5 || errorCode == 2) {
                        ALog.i(TAG, "remove listener", "result", Boolean.valueOf(copyOnWriteArrayList.remove(next)));
                    }
                }
                aVar.c = System.currentTimeMillis() - currentTimeMillis;
                aVar.a();
            }
        }
    }

    public void register(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{this, context});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_DISCONNECT);
            intentFilter.addAction(Constants.ACTION_CONNECT);
            if (f.c()) {
                this.coreProcessReady.set(true);
            } else {
                intentFilter.addAction(ACTION_CORE_PROCESS_CREATED);
                if (f.d()) {
                    this.coreProcessReady.set(true);
                }
            }
            context.registerReceiver(this.receiver, intentFilter);
            this.isRegisterReceiver = true;
        } catch (Throwable th) {
            ALog.e(TAG, "asp register err", th, new Object[0]);
        }
    }

    public void unregister(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70c8265", new Object[]{this, context});
        } else if (!this.isRegisterReceiver) {
        } else {
            try {
                context.unregisterReceiver(this.receiver);
            } catch (Throwable th) {
                ALog.e(TAG, "asp unregister err", th, new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static volatile IPrefsChannel f8175a;

        static {
            kge.a(381157235);
            f8175a = null;
        }

        public static IPrefsChannel a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IPrefsChannel) ipChange.ipc$dispatch("9dddcab8", new Object[0]);
            }
            if (f8175a == null) {
                synchronized (a.class) {
                    if (f8175a == null) {
                        try {
                            f8175a = (IPrefsChannel) jzv.b(new ComponentName(jzv.a(), "com.taobao.accs.AccsIPCProvider"), IPrefsChannel.class, new Pair[0]);
                        } catch (IPCException e) {
                            ALog.e(PrefsIPCChannel.TAG, "create ipc proxy error.", e, new Object[0]);
                        }
                    }
                }
            }
            return f8175a;
        }

        public static void a(ModifiedRecord modifiedRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db24d1a2", new Object[]{modifiedRecord});
            } else if (modifiedRecord == null) {
            } else {
                e.a aVar = new e.a(1);
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    a().commitToDiskRemote(modifiedRecord);
                    aVar.b = 1;
                } catch (IPCException e) {
                    ALog.e(PrefsIPCChannel.TAG, "[commitToDisk]IPC error.", e, new Object[0]);
                    aVar.b = 0;
                    f8175a = null;
                }
                aVar.c = System.currentTimeMillis() - currentTimeMillis;
                aVar.a();
            }
        }

        public static void a(String str, OnDataUpdateListener onDataUpdateListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f511e3c0", new Object[]{str, onDataUpdateListener});
                return;
            }
            e.a aVar = new e.a(2);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                a().registerDataListenerRemote(str, onDataUpdateListener);
                aVar.b = 1;
            } catch (IPCException e) {
                ALog.e(PrefsIPCChannel.TAG, "[registerDataListener]IPC error.", e, new Object[0]);
                aVar.b = 0;
                f8175a = null;
            }
            aVar.c = System.currentTimeMillis() - currentTimeMillis;
            aVar.a();
        }
    }

    /* loaded from: classes.dex */
    public class ARangerReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(273627133);
        }

        private ARangerReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            String a2 = f.a();
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            if (Constants.ACTION_DISCONNECT.equals(action)) {
                String stringExtra = intent.getStringExtra("processName");
                ALog.i(PrefsIPCChannel.TAG, "[onReceive] process disconnect.", "process", stringExtra);
                if (!a2.equals(stringExtra)) {
                    return;
                }
                com.taobao.accs.asp.a.b(new Runnable() { // from class: com.taobao.accs.asp.PrefsIPCChannel.ARangerReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        a.f8175a = null;
                        a.a();
                    }
                });
            } else if (Constants.ACTION_CONNECT.equals(action)) {
                String stringExtra2 = intent.getStringExtra("processName");
                ALog.i(PrefsIPCChannel.TAG, "[onReceive] process connect.", "process", stringExtra2);
                if (!a2.equals(stringExtra2)) {
                    return;
                }
                APreferencesManager.recoverPreferences();
            } else if (!PrefsIPCChannel.ACTION_CORE_PROCESS_CREATED.equals(action)) {
            } else {
                PrefsIPCChannel.access$100(PrefsIPCChannel.this).set(true);
            }
        }
    }

    public boolean isCoreProcessReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a198108", new Object[]{this})).booleanValue() : this.coreProcessReady.get();
    }
}
