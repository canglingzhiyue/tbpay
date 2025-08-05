package com.taobao.accs.connection.state;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsIPCProvider;
import com.taobao.accs.AccsMainService;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.IChannelConnection;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.f;
import com.taobao.accs.utl.m;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.aranger.exception.IPCException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import tb.dcd;
import tb.jzv;
import tb.kge;
import tb.mto;
import tb.xkg;

/* loaded from: classes.dex */
public class a extends StateMachine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BOTH_ALIVE = 104;
    public static final int EVENT_CHANNEL_ENTER = 102;
    public static final int EVENT_CHANNEL_EXIT = 103;
    public static final int EVENT_MAIN_ENTER = 100;
    public static final int EVENT_MAIN_EXIT = 101;
    private static final CopyOnWriteArrayList<b> b;
    private int c;
    private StateMachine.a d;
    private StateMachine.a e;
    private StateMachine.a f;
    private StateMachine.a g;
    private IBinder.DeathRecipient h;

    /* renamed from: com.taobao.accs.connection.state.a$a */
    /* loaded from: classes.dex */
    public static class C0317a {

        /* renamed from: a */
        public static a f8225a;

        static {
            kge.a(-305993744);
            f8225a = new a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);

        void b(String str);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1611072840) {
            super.a((StateMachine.Event) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$8562cVu5o1cbSm65NCCnJHZNscU(a aVar, Context context, int i) {
        aVar.a(context, i);
    }

    public static /* synthetic */ void lambda$oNzOujXCP7LXICrmoH7VzTaNIA4(a aVar, Context context) {
        aVar.h(context);
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("270b49fb", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.c = i;
        return i;
    }

    public static /* synthetic */ StateMachine.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateMachine.a) ipChange.ipc$dispatch("1813d934", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ void a(a aVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d155e3cd", new Object[]{aVar, context});
        } else {
            aVar.c(context);
        }
    }

    public static /* synthetic */ StateMachine.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateMachine.a) ipChange.ipc$dispatch("11b9e35", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ CopyOnWriteArrayList b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("f2c233d6", new Object[0]) : b;
    }

    public static /* synthetic */ StateMachine.a c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateMachine.a) ipChange.ipc$dispatch("ea236336", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4c355e", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static /* synthetic */ int e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8ec6052", new Object[]{aVar})).intValue();
        }
        int i = aVar.c + 1;
        aVar.c = i;
        return i;
    }

    public static /* synthetic */ int f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("658c8b53", new Object[]{aVar})).intValue() : aVar.c;
    }

    static {
        kge.a(-1696905472);
        b = new CopyOnWriteArrayList<>();
    }

    private a() {
        this.c = 0;
        this.d = new StateMachine.a() { // from class: com.taobao.accs.connection.state.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.accs.connection.state.StateMachine.a
            public int a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
                }
                return 0;
            }

            {
                a.this = this;
            }

            @Override // com.taobao.accs.connection.state.StateMachine.a
            public void a(StateMachine.Event event) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("60070548", new Object[]{this, event});
                    return;
                }
                int eventId = event.getEventId();
                if (eventId == 100) {
                    a aVar = a.this;
                    aVar.b(a.a(aVar));
                } else if (eventId == 102) {
                    a aVar2 = a.this;
                    aVar2.b(a.b(aVar2));
                } else if (eventId != 104) {
                    ALog.e("ProcessStateMachine", "diedState rcv", "eventId", Integer.valueOf(event.getEventId()));
                } else {
                    a aVar3 = a.this;
                    aVar3.b(a.c(aVar3));
                }
            }

            @Override // com.taobao.accs.connection.state.StateMachine.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (a.this.c() != a.c(a.this).a()) {
                } else {
                    if (UtilityImpl.isMainProcess(GlobalClientInfo.getContext())) {
                        a.d(a.this);
                    } else if (!UtilityImpl.isChannelProcess(GlobalClientInfo.getContext())) {
                    } else {
                        a.a(a.this, GlobalClientInfo.getContext());
                    }
                }
            }
        };
        this.e = new AnonymousClass2();
        this.f = new AnonymousClass3();
        this.g = new AnonymousClass4();
        a(this.d);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4ae744e1", new Object[0]) : C0317a.f8225a;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : c() != this.d.a();
    }

    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
        }
        if (UtilityImpl.isMainProcess(context)) {
            return true;
        }
        if (!d()) {
            return UtilityImpl.isMainProcessAlive(context);
        }
        return b(context);
    }

    public boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{this, context})).booleanValue();
        }
        if (!a(context)) {
            return false;
        }
        if (UtilityImpl.isMainProcess(context)) {
            return f.a().f();
        }
        int i = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_MAIN_CREATED_PID, 0);
        int mainProcessPid = UtilityImpl.getMainProcessPid(context);
        boolean z = mainProcessPid > 0 && mainProcessPid == i;
        ALog.e("ProcessStateMachine", "isMainActivityCreated", "result", Boolean.valueOf(z));
        return z;
    }

    public boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{this, context})).booleanValue();
        }
        if (UtilityImpl.isChannelProcess(context)) {
            return true;
        }
        if (!d()) {
            return UtilityImpl.isChannelProcessAlive(context);
        }
        return b(context);
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : c() == 3;
    }

    @Override // com.taobao.accs.connection.state.StateMachine
    public void a(StateMachine.Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60070548", new Object[]{this, event});
            return;
        }
        try {
            super.a(event);
        } catch (Throwable th) {
            ALog.e("ProcessStateMachine", "processEvent err", th, new Object[0]);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b925761d", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            b.add(bVar);
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e66e4de", new Object[]{this, bVar});
        } else {
            b.remove(bVar);
        }
    }

    /* renamed from: com.taobao.accs.connection.state.a$2 */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            return 1;
        }

        public AnonymousClass2() {
            a.this = r1;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void a(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60070548", new Object[]{this, event});
            } else if (event.getEventId() != 102) {
                ALog.e("ProcessStateMachine", "mainAliveState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar = a.this;
                aVar.b(a.c(aVar));
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (!UtilityImpl.isChannelProcessAlive(GlobalClientInfo.getContext())) {
            } else {
                ALog.e("ProcessStateMachine", "mainAliveState.enter()", new Object[0]);
                a.a().b(StateMachine.Event.obtain(102));
                a.d(a.this);
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (a.this.c() != a.c(a.this).a()) {
            } else {
                com.taobao.accs.common.a.f().execute($$Lambda$a$2$uAXwA99q1vegtoi83pstNY0TVj4.INSTANCE);
            }
        }

        public static /* synthetic */ void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
                return;
            }
            Iterator it = a.b().iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    bVar.b(UtilityImpl.getChannelProcessName(GlobalClientInfo.getContext()));
                }
            }
        }
    }

    /* renamed from: com.taobao.accs.connection.state.a$3 */
    /* loaded from: classes.dex */
    public class AnonymousClass3 extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            return 2;
        }

        public AnonymousClass3() {
            a.this = r1;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void a(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60070548", new Object[]{this, event});
            } else if (event.getEventId() != 100) {
                ALog.e("ProcessStateMachine", "channelAliveState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar = a.this;
                aVar.b(a.c(aVar));
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            Context context = GlobalClientInfo.getContext();
            if (!UtilityImpl.isMainProcessAlive(context)) {
                return;
            }
            ALog.e("ProcessStateMachine", "channelAliveState.enter()", new Object[0]);
            a.a().b(StateMachine.Event.obtain(100));
            a.a(a.this, context);
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (a.this.c() != a.c(a.this).a()) {
            } else {
                com.taobao.accs.common.a.f().execute($$Lambda$a$3$aEb7RB5Cn17nWGvn7Yto5DbCzsY.INSTANCE);
            }
        }

        public static /* synthetic */ void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[0]);
                return;
            }
            Iterator it = a.b().iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    try {
                        bVar.b(UtilityImpl.getMainProcessName(GlobalClientInfo.getContext()));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: com.taobao.accs.connection.state.a$4 */
    /* loaded from: classes.dex */
    public class AnonymousClass4 extends StateMachine.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: lambda$3tTx4OsUf7fu6CeRyr-61X1HXHY */
        public static /* synthetic */ void m805lambda$3tTx4OsUf7fu6CeRyr61X1HXHY(Context context, boolean z) {
            a(context, z);
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            return 3;
        }

        public AnonymousClass4() {
            a.this = r1;
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void a(StateMachine.Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60070548", new Object[]{this, event});
                return;
            }
            int eventId = event.getEventId();
            if (eventId == 101) {
                a aVar = a.this;
                aVar.b(a.b(aVar));
            } else if (eventId != 103) {
                ALog.e("ProcessStateMachine", "bothAliveState rcv", "eventId", Integer.valueOf(event.getEventId()));
            } else {
                a aVar2 = a.this;
                aVar2.b(a.a(aVar2));
                if (!UtilityImpl.isChannelProcess(GlobalClientInfo.getContext())) {
                    return;
                }
                ALog.e("ProcessStateMachine", "channel received 'EVENT_CHANNEL_EXIT'", new Object[0]);
                d.a("accs", BaseMonitor.COUNT_VERIFY, "process_machine_ce", mto.a.GEO_NOT_SUPPORT);
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            a.a(a.this, 0);
            ALog.e("ProcessStateMachine", "bothAliveState.enter()", new Object[0]);
            if (com.taobao.accs.utl.a.c()) {
                return;
            }
            try {
                a.this.d(GlobalClientInfo.getContext());
            } catch (Throwable th) {
                ALog.e("ProcessStateMachine", "listenToMainProcess err", th, new Object[0]);
            }
        }

        @Override // com.taobao.accs.connection.state.StateMachine.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            final Context context = GlobalClientInfo.getContext();
            final boolean isChannelProcess = UtilityImpl.isChannelProcess(context);
            if (isChannelProcess) {
                ConnectionServiceManager.getInstance().onAppBackground();
            }
            com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.accs.connection.state.-$$Lambda$a$4$3tTx4OsUf7fu6CeRyr-61X1HXHY
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass4.m805lambda$3tTx4OsUf7fu6CeRyr61X1HXHY(context, isChannelProcess);
                }
            });
        }

        public static /* synthetic */ void a(Context context, boolean z) {
            String mainProcessName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
                return;
            }
            m.a();
            xkg.b(context);
            Iterator it = a.b().iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar != null) {
                    if (z) {
                        try {
                            mainProcessName = UtilityImpl.getMainProcessName(context);
                        } catch (Throwable unused) {
                        }
                    } else {
                        mainProcessName = UtilityImpl.getChannelProcessName(context);
                    }
                    bVar.a(mainProcessName);
                }
            }
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        Intent intent = new Intent(context, AccsMainService.class);
        intent.setAction(AccsMainService.ACTION_CHANNEL_STARTUP);
        intent.putExtra("event", StateMachine.Event.obtain(102));
        dcd.a(context, intent);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!UtilityImpl.isMainProcess(GlobalClientInfo.getContext())) {
        } else {
            com.taobao.accs.common.a.a().execute($$Lambda$a$5umRLcr3wdZfHZAVf0cJ_QViDSQ.INSTANCE);
        }
    }

    public static /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        try {
            ((IChannelConnection) jzv.a(new ComponentName(GlobalClientInfo.getContext(), AccsIPCProvider.class), IChannelConnection.class, new Pair[0])).mainProcessStartUp(StateMachine.Event.obtain(100));
        } catch (IPCException e) {
            ALog.e("ProcessStateMachine", "mainAliveState enter err", e, new Object[0]);
        }
    }

    private IBinder.DeathRecipient f(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder.DeathRecipient) ipChange.ipc$dispatch("53399a0b", new Object[]{this, context});
        }
        if (this.h == null) {
            synchronized (a.class) {
                if (this.h == null) {
                    this.h = new IBinder.DeathRecipient() { // from class: com.taobao.accs.connection.state.-$$Lambda$a$oNzOujXCP7LXICrmoH7VzTaNIA4
                        {
                            a.this = this;
                        }

                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            a.lambda$oNzOujXCP7LXICrmoH7VzTaNIA4(a.this, context);
                        }
                    };
                }
            }
        }
        return this.h;
    }

    public /* synthetic */ void h(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{this, context});
            return;
        }
        ALog.e("ProcessStateMachine", "MainBinder died", new Object[0]);
        final int mainProcessPid = UtilityImpl.getMainProcessPid(context);
        if (mainProcessPid != -1) {
            int i = this.c + 1;
            this.c = i;
            if (i > 3) {
                ALog.e("ProcessStateMachine", "not allow to rebind", "mListeningProcessCnt", Integer.valueOf(this.c));
                return;
            }
            ALog.e("ProcessStateMachine", "listenToMainProcess delayed", new Object[0]);
            com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.connection.state.-$$Lambda$a$8562cVu5o1cbSm65NCCnJHZNscU
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$8562cVu5o1cbSm65NCCnJHZNscU(a.this, context, mainProcessPid);
                }
            }, 3L, TimeUnit.SECONDS);
            return;
        }
        this.c = 0;
        ALog.e("ProcessStateMachine", "listenToMainProcess exit", new Object[0]);
        a().b(StateMachine.Event.obtain(101));
        GlobalClientInfo.getInstance(context).setMainBinder(null);
    }

    public /* synthetic */ void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        int mainProcessPid = UtilityImpl.getMainProcessPid(context);
        if (mainProcessPid == i) {
            d.a("accs", BaseMonitor.ALARM_ONLY_BINDER_DIED, BaseMonitor.ALARM_ONLY_BINDER_DIED, "-1", BaseMonitor.ALARM_ONLY_BINDER_DIED);
            d(context);
        } else if (mainProcessPid == -1) {
            ALog.e("ProcessStateMachine", "listenToMainProcess delayed, exit", new Object[0]);
            a().b(StateMachine.Event.obtain(101));
            GlobalClientInfo.getInstance(context).setMainBinder(null);
        } else {
            ALog.e("ProcessStateMachine", "main process reboot !", new Object[0]);
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else if (!UtilityImpl.isChannelProcess(context)) {
        } else {
            ALog.e("ProcessStateMachine", "listenToMainProcess in channel", new Object[0]);
            if (com.taobao.accs.utl.a.c()) {
                IBinder mainBinder = GlobalClientInfo.getInstance(context).getMainBinder();
                if (mainBinder != null) {
                    try {
                        mainBinder.linkToDeath(f(context), 0);
                        ALog.e("ProcessStateMachine", "listenToMainProcess success", new Object[0]);
                        d.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_RESULT, "");
                        return;
                    } catch (Throwable th) {
                        String th2 = th.toString();
                        ALog.e("ProcessStateMachine", "linkToDeath", "err", th2);
                        d.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_RESULT, "Throwable", "-2", th2);
                        d.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_FAIL, "Throwable", "-2", th2);
                        return;
                    }
                }
                ALog.e("ProcessStateMachine", "listenToMainProcess but MainBinder null!", new Object[0]);
                String valueOf = String.valueOf(System.currentTimeMillis());
                d.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_RESULT, Constrant.KEY_TIME_OUT, "-1", valueOf);
                d.a("accs", BaseMonitor.ALARM_LISTENER_TO_MAIN_FAIL, Constrant.KEY_TIME_OUT, "-1", valueOf);
                return;
            }
            Intent intent = new Intent(context, AccsMainService.class);
            if (f()) {
                i = 33;
            }
            context.bindService(intent, new AnonymousClass5(context), i);
        }
    }

    /* renamed from: com.taobao.accs.connection.state.a$5 */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        /* renamed from: lambda$Ol0-Fz4WyUF57My1DfwkNppwf2U */
        public static /* synthetic */ void m806lambda$Ol0Fz4WyUF57My1DfwkNppwf2U(AnonymousClass5 anonymousClass5, Context context) {
            anonymousClass5.a(context);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            }
        }

        public AnonymousClass5(Context context) {
            a.this = r1;
            this.b = context;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                return;
            }
            try {
                this.b.unbindService(this);
                if (UtilityImpl.isMainProcessAlive(this.b)) {
                    if (a.e(a.this) > 3) {
                        ALog.e("ProcessStateMachine", "not allow to rebind", "mListeningProcessCnt", Integer.valueOf(a.f(a.this)));
                        return;
                    }
                    ALog.e("ProcessStateMachine", "listenToMainProcess delayed", new Object[0]);
                    final Context context = this.b;
                    com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.connection.state.-$$Lambda$a$5$Ol0-Fz4WyUF57My1DfwkNppwf2U
                        {
                            a.AnonymousClass5.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            a.AnonymousClass5.m806lambda$Ol0Fz4WyUF57My1DfwkNppwf2U(a.AnonymousClass5.this, context);
                        }
                    }, 3L, TimeUnit.SECONDS);
                    return;
                }
                a.a(a.this, 0);
                ALog.e("ProcessStateMachine", "listenToMainProcess exit", new Object[0]);
                a.a().b(StateMachine.Event.obtain(101));
            } catch (Throwable unused) {
                if (UtilityImpl.isMainProcessAlive(this.b)) {
                    if (a.e(a.this) > 3) {
                        ALog.e("ProcessStateMachine", "not allow to rebind", "mListeningProcessCnt", Integer.valueOf(a.f(a.this)));
                        return;
                    }
                    ALog.e("ProcessStateMachine", "listenToMainProcess delayed", new Object[0]);
                    final Context context2 = this.b;
                    com.taobao.accs.common.a.a(new Runnable() { // from class: com.taobao.accs.connection.state.-$$Lambda$a$5$Ol0-Fz4WyUF57My1DfwkNppwf2U
                        {
                            a.AnonymousClass5.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            a.AnonymousClass5.m806lambda$Ol0Fz4WyUF57My1DfwkNppwf2U(a.AnonymousClass5.this, context2);
                        }
                    }, 3L, TimeUnit.SECONDS);
                    return;
                }
                a.a(a.this, 0);
                ALog.e("ProcessStateMachine", "listenToMainProcess exit", new Object[0]);
                a.a().b(StateMachine.Event.obtain(101));
            }
        }

        public /* synthetic */ void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            } else if (UtilityImpl.isMainProcessAlive(context)) {
                a.this.d(context);
            } else {
                ALog.e("ProcessStateMachine", "listenToMainProcess delayed, exit", new Object[0]);
                a.a().b(StateMachine.Event.obtain(101));
            }
        }
    }

    private boolean f() {
        try {
            return ((Boolean) Class.forName("com.taobao.keepalive.KeepAliveManager").getDeclaredMethod("isInstrMode", new Class[0]).invoke(null, new Object[0])).booleanValue();
        } catch (Throwable th) {
            ALog.e("ProcessStateMachine", "instrMode err", th, new Object[0]);
            return false;
        }
    }
}
