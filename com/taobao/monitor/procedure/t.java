package com.taobao.monitor.procedure;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.common.BundleMap;
import java.util.Map;
import tb.mpi;

/* loaded from: classes.dex */
public class t implements i, k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADD_BIZ = 4;
    public static final int ADD_BIZ_AB_TEST = 5;
    public static final int ADD_BIZ_STAGE = 6;
    public static final int BEGIN = 0;
    public static final int END = 10;
    public static final int EVENT = 1;
    public static final int STAGE = 2;

    /* renamed from: a  reason: collision with root package name */
    private final ProcedureImpl f18234a;
    private final Handler b;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                int i = message.what;
                if (i == 0) {
                    ((ProcedureImpl) message.obj).b();
                } else if (i == 1) {
                    Bundle data = message.getData();
                    ((ProcedureImpl) message.obj).a(data.getString("name"), ((BundleMap) data.getSerializable("events")).getData());
                } else if (i == 2) {
                    Bundle data2 = message.getData();
                    ((ProcedureImpl) message.obj).a(data2.getString("name"), data2.getLong("timestamp"));
                } else if (i == 4) {
                    Bundle data3 = message.getData();
                    ((ProcedureImpl) message.obj).b(data3.getString("bizID"), ((BundleMap) data3.getSerializable("properties")).getData());
                } else if (i == 5) {
                    Bundle data4 = message.getData();
                    ((ProcedureImpl) message.obj).c(data4.getString("bizID"), ((BundleMap) data4.getSerializable(AntDetector.EXT_KEY_AB_TEST)).getData());
                } else if (i == 6) {
                    Bundle data5 = message.getData();
                    ((ProcedureImpl) message.obj).d(data5.getString("bizID"), ((BundleMap) data5.getSerializable("stage")).getData());
                } else {
                    switch (i) {
                        case 10:
                            ((ProcedureImpl) message.obj).d();
                            return;
                        case 11:
                            ((ProcedureImpl) message.obj).a(message.getData().getBoolean("force"));
                            return;
                        case 12:
                            Bundle data6 = message.getData();
                            ((ProcedureImpl) message.obj).b(data6.getString("name"), data6.getLong("timestamp"));
                            return;
                        default:
                            return;
                    }
                }
            } catch (Exception e) {
                mpi.c("ProcedureProxy", e);
            }
        }
    }

    public static /* synthetic */ ProcedureImpl a(t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcedureImpl) ipChange.ipc$dispatch("43138fef", new Object[]{tVar}) : tVar.f18234a;
    }

    public t(ProcedureImpl procedureImpl) {
        if (procedureImpl == null) {
            throw new IllegalArgumentException();
        }
        this.b = new a(ProcedureGlobal.a().d().getLooper());
        this.f18234a = procedureImpl;
    }

    @Override // com.taobao.monitor.procedure.g
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f18234a.a();
    }

    @Override // com.taobao.monitor.procedure.g
    public g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c8b1d6f9", new Object[]{this});
        }
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = this.f18234a;
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1473508f", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putSerializable("events", new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("56cd4cf0", new Object[]{this, str, new Long(j)});
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putLong("timestamp", j);
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8021a231", new Object[]{this, str, new Long(j)});
        }
        Message obtain = Message.obtain();
        obtain.what = 12;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putLong("timestamp", j);
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5c4e010", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putString("bizID", str);
        bundle.putSerializable("properties", new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f7166f91", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 5;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putString("bizID", str);
        bundle.putSerializable(AntDetector.EXT_KEY_AB_TEST, new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g d(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("e867ff12", new Object[]{this, str, map});
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putString("bizID", str);
        bundle.putSerializable("stage", new BundleMap(map));
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5d552b4", new Object[]{this, str, obj});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).a(str, obj);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a6abc72", new Object[]{this, str, obj});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).c(str, obj);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g b(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("88200793", new Object[]{this, str, obj});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).b(str, obj);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(final String str, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9c903190", new Object[]{this, str, new Long(j), new Long(j2)});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).a(str, j, j2);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5ccf4590", new Object[]{this, str}) : c(str, SystemClock.uptimeMillis());
    }

    @Override // com.taobao.monitor.procedure.g
    public g c(final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a975f772", new Object[]{this, str, new Long(j)});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).c(str, j);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g e(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("d9b98e93", new Object[]{this, str, map}) : a(str, SystemClock.uptimeMillis(), map);
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(final String str, final long j, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b2799d2f", new Object[]{this, str, new Long(j), map});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).a(str, j, map);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("dd49e059", new Object[]{this, str, str2, map}) : a(str, SystemClock.uptimeMillis(), str2, map);
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(final String str, final long j, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("655244f9", new Object[]{this, str, new Long(j), str2, map});
        }
        a(new Runnable() { // from class: com.taobao.monitor.procedure.t.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    t.a(t.this).a(str, j, TextUtils.isEmpty(str2) ? "UNKNOWN" : str2, map);
                }
            }
        });
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f18234a.c();
    }

    @Override // com.taobao.monitor.procedure.g
    public g d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b13047b7", new Object[]{this});
        }
        Message obtain = Message.obtain();
        obtain.what = 10;
        obtain.obj = this.f18234a;
        this.b.sendMessage(obtain);
        return this;
    }

    @Override // com.taobao.monitor.procedure.g
    public g a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("25915716", new Object[]{this, new Boolean(z)});
        }
        Message obtain = Message.obtain();
        obtain.what = 11;
        obtain.obj = this.f18234a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", z);
        obtain.setData(bundle);
        this.b.sendMessage(obtain);
        return this;
    }

    public g e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("256f8016", new Object[]{this}) : this.f18234a;
    }

    @Override // com.taobao.monitor.procedure.i
    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f09c254", new Object[]{this, gVar});
        } else {
            this.f18234a.a(gVar);
        }
    }

    @Override // com.taobao.monitor.procedure.i
    public void b(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b195d5", new Object[]{this, gVar});
        } else {
            this.f18234a.b(gVar);
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            ProcedureGlobal.a().c().post(runnable);
        }
    }

    @Override // com.taobao.monitor.procedure.k
    public void a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f101f86", new Object[]{this, uVar});
        } else {
            this.f18234a.a(uVar);
        }
    }
}
