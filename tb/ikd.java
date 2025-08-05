package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class ikd implements ihx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihx f29108a;
    private final ijd b;

    /* loaded from: classes6.dex */
    public static class a implements ihu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ihu f29112a;
        private final AtomicInteger b;
        private final iiv<a, Void> c;

        public a(ihu ihuVar, AtomicInteger atomicInteger, iiv<a, Void> iivVar) {
            this.f29112a = ihuVar;
            this.b = atomicInteger;
            this.c = iivVar;
        }

        @Override // tb.ihu
        public void onFetchFinished(ihw ihwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
            } else if (!ihwVar.g() && this.b.decrementAndGet() > 0) {
                RSoLog.c("ArtcFetcherWrapper, fetch failed, retryCounter=" + this.b.get() + " > 0, will schedule next fetch");
                this.c.a(this);
            } else {
                RSoLog.c("ArtcFetcherWrapper, finish, , fetchResult = " + ihwVar.g() + ", retryCounter = " + this.b.get());
                this.f29112a.onFetchFinished(ihwVar);
            }
        }
    }

    public static /* synthetic */ ihx a(ikd ikdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("2f5d7197", new Object[]{ikdVar}) : ikdVar.f29108a;
    }

    public ikd(ihx ihxVar, ijd ijdVar) {
        this.f29108a = ihxVar;
        this.b = ijdVar;
    }

    @Override // tb.ihx
    public ihw a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str}) : this.f29108a.a(str);
    }

    @Override // tb.ihx
    public iht a(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{this, list}) : this.f29108a.a(list);
    }

    @Override // tb.ihx
    public ihw b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("7d1d497b", new Object[]{this, str}) : this.f29108a.b(str);
    }

    @Override // tb.ihx
    public void a(final String str, ihu ihuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d9bf9ac", new Object[]{this, str, ihuVar});
        } else if (!str.equals("artc_engine")) {
            this.f29108a.a(str, ihuVar);
        } else {
            this.f29108a.a("avcodec", new ihu() { // from class: tb.ikd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihu
                public void onFetchFinished(ihw ihwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                    } else {
                        RSoLog.c("ArtcFetcherWrapper, fetchAsync avcodec finished");
                    }
                }
            });
            long a2 = this.b.a("key_artc_fetch_retry_count", 10L);
            RSoLog.c("ArtcFetcherWrapper, fetchAsync start, retryCounter=" + a2);
            this.f29108a.a(str, new a(ihuVar, new AtomicInteger((int) a2), new iiv<a, Void>() { // from class: tb.ikd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.iiv
                public Void a(final a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("c4378d24", new Object[]{this, aVar});
                    }
                    ika.a(new Runnable() { // from class: tb.ikd.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ikd.a(ikd.this).a(str, aVar);
                            }
                        }
                    }, 2000L);
                    return null;
                }
            }));
        }
    }

    @Override // tb.ihx
    public void a(List<String> list, ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d715", new Object[]{this, list, ihsVar});
        } else {
            this.f29108a.a(list, ihsVar);
        }
    }
}
