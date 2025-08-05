package tb;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.result.BundleUpdateStep;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.rfz;

/* loaded from: classes9.dex */
public class rfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rfw b;
    private boolean c;

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<rfv> f33126a = new PriorityBlockingQueue(5);
    private rge d = rgf.getLog(rfw.class, (rge) null);

    static {
        kge.a(-1072493007);
    }

    public static /* synthetic */ rge a(rfw rfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rge) ipChange.ipc$dispatch("787dc6e1", new Object[]{rfwVar}) : rfwVar.d;
    }

    public static /* synthetic */ boolean a(rfw rfwVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a14a3e43", new Object[]{rfwVar, new Boolean(z)})).booleanValue();
        }
        rfwVar.c = z;
        return z;
    }

    public static /* synthetic */ BlockingQueue b(rfw rfwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("ce5711eb", new Object[]{rfwVar}) : rfwVar.f33126a;
    }

    private rfw() {
    }

    public static rfw instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rfw) ipChange.ipc$dispatch("c7e48807", new Object[0]);
        }
        if (b == null) {
            synchronized (rfw.class) {
                if (b == null) {
                    b = new rfw();
                }
            }
        }
        return b;
    }

    public boolean contains(rfv rfvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6d62f98", new Object[]{this, rfvVar})).booleanValue() : this.f33126a.contains(rfvVar);
    }

    public int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.f33126a.size();
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f33126a.clear();
        }
    }

    public void add(rfv rfvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f407f16", new Object[]{this, rfvVar});
            return;
        }
        if (this.c) {
            rfy.sUpdateAdapter.commitSuccess("update_center_all", this.c ? "update_dynamic_success" : "update_dexpatch_success", "");
            rfu rfuVar = (rfu) rfvVar;
            if (rfuVar.getPatchType().getPriority() == 3) {
                if (rfuVar.from().equals(rfx.SCAN)) {
                    a("存在其他已成功的动态部署，请杀进程重启后再次扫码，扫码后杀进程重启，当前动态部署生效");
                    return;
                }
                rge rgeVar = this.d;
                rgeVar.w("dynamic update has finished " + this.c);
                return;
            }
        }
        if (!this.f33126a.contains(rfvVar)) {
            this.f33126a.add(rfvVar);
            return;
        }
        rge rgeVar2 = this.d;
        rgeVar2.w(rfvVar + " update is in progress....");
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.rfw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(rfy.sContext, str, 1).show();
                    }
                }
            });
        }
    }

    public void run() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        while (true) {
            rfv poll = this.f33126a.poll(1000L, TimeUnit.MILLISECONDS);
            if (poll == null) {
                return;
            }
            if (poll != null && (poll instanceof rfu)) {
                rfu rfuVar = (rfu) poll;
                int priority = rfuVar.getPatchType().getPriority();
                if (priority == 0) {
                    rfuVar.syncRun();
                } else {
                    if (priority != 1) {
                        if (priority == 2) {
                            if (rfuVar.getRunnable().getUpdateListener() != null) {
                                rfuVar.getRunnable().getUpdateListener().patchProcessListener(new rfz.a() { // from class: tb.rfw.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // tb.rfz.a
                                    public void hasPatched(boolean z) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
                                        }
                                    }

                                    @Override // tb.rfz.a
                                    public void patchStart() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("77e91881", new Object[]{this});
                                        }
                                    }

                                    @Override // tb.rfz.a
                                    public void patching(BundleUpdateStep bundleUpdateStep) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
                                        }
                                    }

                                    @Override // tb.rfz.a
                                    public void patchFailed(String str) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("839bcb76", new Object[]{this, str});
                                            return;
                                        }
                                        rge a2 = rfw.a(rfw.this);
                                        a2.w("Apk update:" + str);
                                    }

                                    @Override // tb.rfz.a
                                    public void patchSuccess() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("890915a2", new Object[]{this});
                                        } else {
                                            rfw.b(rfw.this).clear();
                                        }
                                    }
                                });
                            }
                            rfuVar.syncRun();
                        } else if (priority == 3) {
                            rfy.sUpdateAdapter.commitSuccess("update_center_all", "update_dispatch_dynamic", "");
                            if (rfuVar.getRunnable().getUpdateListener() != null) {
                                rfuVar.getRunnable().getUpdateListener().patchProcessListener(new rfz.a() { // from class: tb.rfw.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // tb.rfz.a
                                    public void hasPatched(boolean z) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
                                        }
                                    }

                                    @Override // tb.rfz.a
                                    public void patchStart() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("77e91881", new Object[]{this});
                                        }
                                    }

                                    @Override // tb.rfz.a
                                    public void patching(BundleUpdateStep bundleUpdateStep) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
                                        }
                                    }

                                    @Override // tb.rfz.a
                                    public void patchFailed(String str) {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("839bcb76", new Object[]{this, str});
                                            return;
                                        }
                                        rge a2 = rfw.a(rfw.this);
                                        a2.w("dynamic feature update:" + str);
                                    }

                                    @Override // tb.rfz.a
                                    public void patchSuccess() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("890915a2", new Object[]{this});
                                            return;
                                        }
                                        rfw.a(rfw.this, true);
                                        rfw.b(rfw.this).clear();
                                    }
                                });
                            }
                            rfuVar.syncRun();
                        } else if (priority != 4 && priority != 5) {
                        }
                    }
                    rfuVar.asyncRun();
                }
            }
        }
    }
}
