package com.taobao.adaemon;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.exception.IPCException;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f8361a;
    private boolean b;
    private String c;
    private IRemoteProcessHandler d;

    static {
        kge.a(-794252846);
    }

    public i(String str) {
        this.f8361a = str;
    }

    public void a(IRemoteProcessHandler iRemoteProcessHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82633d4a", new Object[]{this, iRemoteProcessHandler});
        } else {
            this.d = iRemoteProcessHandler;
        }
    }

    public void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.b = z;
        this.c = str;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f8361a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.d;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.isProcessLive();
        } catch (IPCException unused) {
            return false;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.d;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.clearActivityStack();
        } catch (IPCException e) {
            e.a("Process", "[clearActivityStack]error.", null, e);
            return false;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.d;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.isBgFromHomePage();
        } catch (IPCException unused) {
            return false;
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.d;
        if (iRemoteProcessHandler == null) {
            return false;
        }
        try {
            return iRemoteProcessHandler.isTinyProcess();
        } catch (IPCException unused) {
            return false;
        }
    }

    public Pair<Long, Long> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9a78ac38", new Object[]{this});
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.d;
        if (iRemoteProcessHandler == null) {
            return null;
        }
        try {
            String mainProcCpuCost = iRemoteProcessHandler.getMainProcCpuCost();
            if (TextUtils.isEmpty(mainProcCpuCost)) {
                return null;
            }
            String[] split = mainProcCpuCost.split(",");
            return Pair.create(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(Long.parseLong(split[1])));
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        IRemoteProcessHandler iRemoteProcessHandler = this.d;
        if (iRemoteProcessHandler == null) {
            return;
        }
        try {
            iRemoteProcessHandler.tryDumpMainProc(j, j2);
        } catch (IPCException e) {
            e.a("Process", "tryDumpMainProc ipc", e, new Object[0]);
        }
    }
}
