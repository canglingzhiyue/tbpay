package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ijg implements ijy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f29077a;
    private final com.taobao.android.remoteso.index.c b;
    private final ijr c;
    private final b d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public interface b {
        void a(iiv<a, Void> iivVar);
    }

    /* loaded from: classes6.dex */
    public static class c implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.remoteso.resolver2.c.a
        public void a(k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                return;
            }
            RSoLog.c("RSoPreSettle,performPreSettle,  resolve result = " + kVar);
        }
    }

    public static /* synthetic */ ijd a(ijg ijgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ijd) ipChange.ipc$dispatch("e659e991", new Object[]{ijgVar}) : ijgVar.f29077a;
    }

    public static /* synthetic */ void a(ijg ijgVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c4fe1f", new Object[]{ijgVar, aVar});
        } else {
            ijgVar.a(aVar);
        }
    }

    public static /* synthetic */ boolean a(ijg ijgVar, String str, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3bed488", new Object[]{ijgVar, str, soIndexData, soIndexAdvanced})).booleanValue() : ijgVar.a(str, soIndexData, soIndexAdvanced);
    }

    public static /* synthetic */ AtomicBoolean b(ijg ijgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("1dd7e1b3", new Object[]{ijgVar}) : ijgVar.e;
    }

    public ijg(ijd ijdVar, com.taobao.android.remoteso.index.c cVar, ijr ijrVar, b bVar) {
        this.f29077a = ijdVar;
        this.b = cVar;
        this.c = ijrVar;
        this.d = bVar;
    }

    @Override // tb.ijy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        RSoLog.c("RSoPreSettle,trigger enter");
        try {
            if (!this.f29077a.a("key_presettle_enabled", true)) {
                RSoLog.c("RSoPreSettle,trigger, skipped,  not enabled in config ");
                return;
            }
            a b2 = b();
            if (b2 != null) {
                RSoLog.c("RSoPreSettle,performPreSettle, data from config");
                a(b2);
                return;
            }
            this.d.a(new iiv<a, Void>() { // from class: tb.ijg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iiv
                public Void a(a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("637cb308", new Object[]{this, aVar});
                    }
                    RSoLog.c("RSoPreSettle,performPreSettle, data from  provider ");
                    ijg.a(ijg.this, aVar);
                    return null;
                }
            });
        } catch (Throwable th) {
            ikq.a("RSoPreSettle,trigger", th);
        }
    }

    private a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("474ebbba", new Object[]{this});
        }
        String a2 = ijb.a(this.f29077a, "preSettleLibs");
        if (ikw.a((CharSequence) a2)) {
            RSoLog.c("RSoPreSettle,performPreSettle,skip,   StringUtils.isEmpty(preSettleLibs)");
            return null;
        }
        SoIndexData soIndexData = (SoIndexData) ijb.a(this.f29077a, "preSettleIndex", SoIndexData.class);
        if (soIndexData == null) {
            RSoLog.c("RSoPreSettle,performPreSettle,skip,   preSettleIndex == null");
            return null;
        }
        return new a(a2, soIndexData, (SoIndexAdvanced) ijb.a(this.f29077a, "preSettleIndex2", SoIndexAdvanced.class));
    }

    private void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("981da955", new Object[]{this, aVar});
        } else if (!this.e.compareAndSet(false, true)) {
            RSoLog.c("RSoPreSettle,dataProvider,consume,  skipped.  processing ");
        } else {
            RSoLog.c("RSoPreSettle,schedulePreSettleTask enter");
            this.b.a(a.a(aVar), a.b(aVar));
            RSoLog.c("RSoPreSettle,schedulePreSettleTask,  markDataAvailable finish ");
            long a2 = this.f29077a.a("key_presettle_delay", 60000L);
            long random = ((long) (Math.random() * a2)) + 60000;
            ika.a(new Runnable() { // from class: tb.ijg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List<String> b2 = ikw.b(a.c(aVar));
                    if (b2.isEmpty()) {
                        RSoLog.c("RSoPreSettle,schedulePreSettleTask,  skip,   whiteList is empty");
                        return;
                    }
                    RSoLog.c("RSoPreSettle,schedulePreSettleTask,  libNameWhiteList=" + b2);
                    long a3 = ijg.a(ijg.this).a("key_presettle_request_interval", 10000L);
                    for (String str : b2) {
                        if (ijg.a(ijg.this, str, a.a(aVar), a.b(aVar))) {
                            iky.a(a3);
                        }
                    }
                    ijg.b(ijg.this).set(false);
                    RSoLog.c("RSoPreSettle,schedulePreSettleTask,  finish ");
                }
            }, random);
            RSoLog.c("RSoPreSettle,schedulePreSettleTask, submit task done,  configDelay=" + a2 + ", actualDelay=" + random);
        }
    }

    private boolean a(String str, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96466c3e", new Object[]{this, str, soIndexData, soIndexAdvanced})).booleanValue();
        }
        if (ikw.a((CharSequence) str)) {
            return false;
        }
        SoIndexData.SoFileInfo a2 = this.b.a(str, soIndexData);
        if (a2 == null) {
            RSoLog.c("RSoPreSettle,doPreSettle,  presettle data not include lib=" + str);
            return false;
        } else if (!ikw.a((CharSequence) "Remote", (CharSequence) a2.getFrom())) {
            RSoLog.c("RSoPreSettle,doPreSettle,  not remote lib=" + str);
            return false;
        } else {
            RSoLog.c("RSoPreSettle,doPreSettle,  ready to resolveOneResult, " + str);
            j a3 = j.a(str, a2, this.b.a(str, soIndexAdvanced));
            a3.a("presettle");
            try {
                this.c.a(a3, new c());
                return true;
            } catch (Throwable th) {
                ikq.a("RSoPreSettle,doPreSettle", th);
                return false;
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f29080a;
        private final SoIndexData b;
        private final SoIndexAdvanced c;

        public static /* synthetic */ SoIndexData a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SoIndexData) ipChange.ipc$dispatch("35ed333d", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ SoIndexAdvanced b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SoIndexAdvanced) ipChange.ipc$dispatch("7ed6abc6", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1d3ffa9", new Object[]{aVar}) : aVar.f29080a;
        }

        public a(String str, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
            this.f29080a = str;
            this.b = soIndexData;
            this.c = soIndexAdvanced;
        }
    }
}
