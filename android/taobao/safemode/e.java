package android.taobao.safemode;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.update.datasource.mtop.a;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import com.taobao.update.result.BundleUpdateStep;
import java.util.HashMap;
import tb.reu;
import tb.rfx;
import tb.rfy;
import tb.rfz;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f1520a;
    public c b;
    public android.taobao.safemode.a c;
    public a d;
    public String e;
    public HashMap<String, String> f = new HashMap<>();

    /* loaded from: classes.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private f b;

        public a(Looper looper, f fVar) {
            super(looper);
            this.b = fVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what != 1) {
                super.handleMessage(message);
            } else {
                Log.e("SafeMode", "Fix Timeout");
                this.b.a();
                e.this.f.put("timeout", "30000");
            }
        }
    }

    public e(Context context, String str, boolean z, f fVar) {
        this.f1520a = null;
        this.b = null;
        this.c = null;
        this.f1520a = context instanceof Application ? context : context.getApplicationContext();
        this.b = new c();
        this.e = str;
        this.c = new android.taobao.safemode.a(context);
        HashMap<String, String> hashMap = this.f;
        hashMap.put("launch", "" + z);
        this.f.put("version", this.e);
        this.d = new a(Looper.getMainLooper(), fVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.a();
        this.b.execute(new Runnable() { // from class: android.taobao.safemode.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    rfy.getInstance().init((Application) e.this.f1520a, "taobao4android", TaoPackageInfo.getTTIDNum(), false, new reu());
                    InstantPatchUpdater.instance().init(e.this.f1520a);
                    rfy.getInstance().registerListener(rfx.HOTPATCH, InstantPatchUpdater.instance());
                    InstantPatchUpdater.instance().patchProcessListener(new rfz.a() { // from class: android.taobao.safemode.e.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.rfz.a
                        public void hasPatched(boolean z) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
                            }
                        }

                        @Override // tb.rfz.a
                        public void patchFailed(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("839bcb76", new Object[]{this, str});
                                return;
                            }
                            i.a(e.this.f1520a, "PatchFail");
                            Log.e("SafeMode", "Fix Fail");
                        }

                        @Override // tb.rfz.a
                        public void patchSuccess() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("890915a2", new Object[]{this});
                                return;
                            }
                            i.a(e.this.f1520a, "PatchSuccess");
                            Log.e("SafeMode", "Fix Success");
                        }

                        @Override // tb.rfz.a
                        public void patching(BundleUpdateStep bundleUpdateStep) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
                                return;
                            }
                            Log.e("SafeMode", "patch" + bundleUpdateStep.toString());
                        }

                        @Override // tb.rfz.a
                        public void patchStart() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("77e91881", new Object[]{this});
                            } else {
                                Log.e("SafeMode", "patch Start");
                            }
                        }
                    });
                    ((com.taobao.update.datasource.mtop.a) rfy.getInstance().getUpdater(rfx.MTOP_SOURCE)).setMtopDataListener(new a.b() { // from class: android.taobao.safemode.e.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.update.datasource.mtop.a.b
                        public void hasUpdate(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7413e254", new Object[]{this, str});
                                return;
                            }
                            Log.e("SafeMode", "has update " + str);
                            i.a(e.this.f1520a, "HasUpdate");
                        }

                        @Override // com.taobao.update.datasource.mtop.a.b
                        public void noUpdate() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("429a9d71", new Object[]{this});
                                return;
                            }
                            Log.e("SafeMode", "NO Fix");
                            i.a(e.this.f1520a, "NoUpdate");
                        }
                    }).startUpdate(true, false);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent launchIntentForPackage = this.f1520a.getPackageManager().getLaunchIntentForPackage(this.f1520a.getPackageName());
        launchIntentForPackage.addFlags(335544320);
        this.f1520a.startActivity(launchIntentForPackage);
        this.d.post(new Runnable() { // from class: android.taobao.safemode.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Process.killProcess(Process.myPid());
                }
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.execute(new Runnable() { // from class: android.taobao.safemode.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(e.this.f1520a, "EnterSafeMode");
                    }
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.b.execute(new Runnable() { // from class: android.taobao.safemode.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i.a(e.this.f1520a, "ClearFiles");
                try {
                    e.this.c.b();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.d.sendEmptyMessageDelayed(1, 35000L);
    }
}
