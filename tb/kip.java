package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.f;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes7.dex */
public class kip extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bfy b = null;
    public RecyclerView c;

    public static /* synthetic */ Object ipc$super(kip kipVar, String str, Object... objArr) {
        if (str.hashCode() == -103056537) {
            super.handleEvent((DXEvent) objArr[0], (Object[]) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(kip kipVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d99aeda", new Object[]{kipVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void b(kip kipVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86353339", new Object[]{kipVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void c(kip kipVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed0b798", new Object[]{kipVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ void d(kip kipVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976c3bf7", new Object[]{kipVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.eventchain.f, com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(final DXEvent dXEvent, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length == 0 || StringUtils.isEmpty(objArr[0].toString())) {
        } else {
            if (objArr.length == 1 || objArr[1] == null) {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
                return;
            }
            String obj = objArr[1].toString();
            if (StringUtils.isEmpty(obj)) {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
                return;
            }
            char c = 65535;
            switch (obj.hashCode()) {
                case -2017976178:
                    if (obj.equals("runModePost")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1853519950:
                    if (obj.equals("runModeAsync")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1855860565:
                    if (obj.equals("runModeDelay")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2112570534:
                    if (obj.equals("runModeRvIdle")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                fxe.a(new Runnable() { // from class: tb.kip.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            kip.a(kip.this, dXEvent, objArr, dXRuntimeContext);
                        }
                    }
                });
            } else if (c == 1) {
                long j = 0;
                if (objArr.length > 2 && objArr[2] != null) {
                    j = a(objArr[2].toString());
                }
                fxe.a(new Runnable() { // from class: tb.kip.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            kip.b(kip.this, dXEvent, objArr, dXRuntimeContext);
                        }
                    }
                }, j);
            } else if (c == 2) {
                if (this.b == null) {
                    this.b = new bfy("eventChainHandler", 3);
                }
                this.b.a(new Runnable() { // from class: tb.kip.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            kip.c(kip.this, dXEvent, objArr, dXRuntimeContext);
                        }
                    }
                });
            } else if (c == 3) {
                fxe.a(new Runnable() { // from class: tb.kip.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (kip.this.c == null || kip.this.c.getScrollState() == 0) {
                            kip.d(kip.this, dXEvent, objArr, dXRuntimeContext);
                        } else {
                            fxe.a(this);
                        }
                    }
                });
            } else {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else {
            this.c = recyclerView;
        }
    }

    private long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{this, str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
