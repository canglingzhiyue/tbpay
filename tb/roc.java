package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.d;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.implement.UploaderManager;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import tb.rnv;

/* loaded from: classes9.dex */
public class roc extends rnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ArrayList<Pair<Integer, Integer>> d;
    private long e;
    private long f;
    private int g;
    private int h;
    private rny i;
    private String j;
    private rnt k;
    private volatile rnp l;
    private final i m;
    private final d n;
    private final Handler o;
    private final int p;
    private final com.uploader.implement.d q;
    private boolean r;
    private boolean s;
    private String t;
    private int u;

    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Handler.Callback f33256a;
        private final WeakReference<roc> b;
        private final WeakReference<Looper> c = new WeakReference<>(Looper.myLooper());

        public c(roc rocVar, Handler.Callback callback) {
            this.b = new WeakReference<>(rocVar);
            this.f33256a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            roc rocVar = this.b.get();
            Looper looper = this.c.get();
            if (looper == null || rocVar == null) {
                return;
            }
            new Handler(looper, this.f33256a).obtainMessage(a.f33254a, rocVar.e()).sendToTarget();
        }
    }

    public static /* synthetic */ Object ipc$super(roc rocVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes9.dex */
    public static final class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final int f33254a = a.class.hashCode();
        private final WeakReference<rox> b;
        private final WeakReference<rnn> c;

        public a(rnn rnnVar, rox roxVar) {
            this.c = new WeakReference<>(rnnVar);
            this.b = new WeakReference<>(roxVar);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            rox roxVar;
            rnn rnnVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message.what != f33254a || (roxVar = this.b.get()) == null || (rnnVar = this.c.get()) == null) {
                return false;
            }
            rnnVar.a(roxVar, (rov) message.obj);
            return true;
        }
    }

    public roc(com.uploader.implement.d dVar, i iVar, int i, d dVar2, Handler handler, boolean z, boolean z2) {
        super(dVar.c);
        this.d = new ArrayList<>();
        this.q = dVar;
        this.m = iVar;
        this.n = dVar2;
        this.o = handler;
        this.p = i;
        this.r = z;
        this.s = z2;
    }

    @Override // tb.rnn
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.i = null;
        this.d.clear();
    }

    @Override // tb.rnn
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Pair<String, Long> a2 = this.q.f24068a.a();
        return a2 != null && this.q.f24068a.k() && System.currentTimeMillis() < ((Long) a2.second).longValue();
    }

    public rov e() {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("2dd0bbe1", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.r || !this.s) {
            str = null;
            i = 0;
        } else {
            this.t = ((com.uploader.export.a) this.m).f24056a.g;
            this.f = ((com.uploader.export.a) this.m).f24056a.e;
            this.k = rnt.a(((com.uploader.export.a) this.m).f24056a.h);
            this.u = ((com.uploader.export.a) this.m).f24056a.f;
            i = ((com.uploader.export.a) this.m).f24056a.i + 1;
            str = ((com.uploader.export.a) this.m).f24056a.j;
            if (com.uploader.implement.a.a(4)) {
                com.uploader.implement.a.a(4, "UploaderAction", this.f33242a + "breakpoint task:{fileId=" + this.t + ", serverRecvOffset=" + this.f + "} task:" + this.m.hashCode());
            }
        }
        if (StringUtils.isEmpty(this.t)) {
            this.t = i();
        }
        Pair<rov, rnp> a2 = rnw.a(this.m);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (a2.second != null) {
            ((rnp) a2.second).j = currentTimeMillis2;
            this.l = (rnp) a2.second;
            this.l.e = this.t;
            this.l.q = i;
            this.l.o = this.r ? 1 : 0;
        }
        if (this.r && this.s && !StringUtils.isEmpty(str) && !str.equalsIgnoreCase(this.l.h)) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " task md5 has changed, old:" + str + " new:" + this.l.h);
            }
            this.f = 0L;
            this.u = 0;
        }
        if (com.uploader.implement.a.a(16)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33242a);
            sb.append(" createFileDescription, elapsed:");
            sb.append(currentTimeMillis2);
            sb.append(" error:");
            sb.append(a2.first == null ? "" : ((rov) a2.first).toString());
            com.uploader.implement.a.a(16, "UploaderAction", sb.toString());
        }
        if (this.r) {
            rot.a().a(this.t, this.m, true, this.l);
            if (i > 0) {
                rot.a().a(this.t, this.l);
            }
        } else if (com.uploader.implement.b.b()) {
            rot.a().a(this.t, this.m, false, this.l);
        }
        return (rov) a2.first;
    }

    @Override // tb.rnn
    public boolean a(rox roxVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd712321", new Object[]{this, roxVar})).booleanValue();
        }
        if (this.l != null) {
            z = false;
        }
        if (z) {
            rpa.a(new c(this, new a(this, roxVar)));
        }
        return z;
    }

    @Override // tb.rnn
    public rov a(rox roxVar, rny rnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("a3ba1029", new Object[]{this, roxVar, rnyVar, new Boolean(z)});
        }
        if (c() == 2) {
            return c(roxVar, rnyVar, z);
        }
        return b(roxVar, rnyVar, z);
    }

    public rov b(rox roxVar, rny rnyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("cd09f4aa", new Object[]{this, roxVar, rnyVar, new Boolean(z)});
        }
        try {
            rno rnoVar = new rno(this.q);
            if (rnyVar == null) {
                roxVar.a(rnoVar);
            } else {
                roxVar.a(rnyVar, rnoVar, z);
            }
            rol a2 = rnoVar.a();
            this.k = new rnt(true, this.k);
            this.k.d = this.l.f;
            this.k.p = this.l.e;
            this.k.e = a2.f33257a;
            this.k.f = a2.b;
            this.k.k = this.l.g;
            this.k.s = this.l.j;
            if (!com.uploader.implement.a.a(16)) {
                return null;
            }
            com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " beginDeclare statistics create:" + this.k.hashCode());
            return null;
        } catch (JSONException e) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " onActionBegin", e);
            }
            return new rov("200", "1", e.toString(), false);
        } catch (Exception e2) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " onActionBegin", e2);
            }
            return new rov("200", "5", e2.toString(), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r7 >= 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.rov c(tb.rox r23, tb.rny r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.roc.c(tb.rox, tb.rny, boolean):tb.rov");
    }

    @Override // tb.rnn
    public rov a(rox roxVar, rny rnyVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("4a638646", new Object[]{this, roxVar, rnyVar, rovVar});
        }
        rnt rntVar = this.k;
        if (rntVar != null) {
            rntVar.m = System.currentTimeMillis();
        }
        if (com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " onActionRetry, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
        }
        if (c() == 2) {
            return d(roxVar, rnyVar, rovVar);
        }
        return c(roxVar, rnyVar, rovVar);
    }

    public rov c(rox roxVar, rny rnyVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("32e1f704", new Object[]{this, roxVar, rnyVar, rovVar});
        }
        if (this.g >= 4) {
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " retryDeclare, retry failed, request:" + rnyVar.hashCode() + " error:" + rovVar + " declareRetryCounter:" + this.g);
            }
            return rovVar;
        }
        if ("100".equalsIgnoreCase(rovVar.f24058a) || "400".equalsIgnoreCase(rovVar.f24058a)) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " onActionRetry, try to connect next, request:" + rnyVar.hashCode());
            }
            this.q.f24068a.c();
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " ConnectionStrategy, after nextDeclareTarget:" + this.q.f24068a.toString());
            }
        }
        rov b2 = b(roxVar, rnyVar, false);
        if (b2 == null) {
            this.g++;
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " onActionRetry, retry, request:" + rnyVar.hashCode() + " declareRetryCounter:" + this.g);
            }
            rnt rntVar = this.k;
            if (rntVar != null) {
                rntVar.r = this.g;
            }
        }
        return b2;
    }

    public rov d(rox roxVar, rny rnyVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("a7212f63", new Object[]{this, roxVar, rnyVar, rovVar});
        }
        if (this.h >= 5) {
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " retryFile, retry failed, request:" + rnyVar.hashCode() + " error:" + rovVar + " fileRetryCounter:" + this.h);
            }
            return rovVar;
        }
        if ("100".equalsIgnoreCase(rovVar.f24058a)) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " retryFile, try to connect next, request:" + rnyVar.hashCode());
            }
            this.q.f24068a.e();
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " ConnectionStrategy, after nextUploadTarget:" + this.q.f24068a.toString());
            }
        }
        rov c2 = c(roxVar, rnyVar, false);
        if (c2 == null) {
            this.h++;
            if (com.uploader.implement.a.a(2)) {
                com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " retryFile, request:" + rnyVar.hashCode() + " fileRetryCounter:" + this.h);
            }
            rnt rntVar = this.k;
            if (rntVar != null) {
                rntVar.r = this.h;
            }
        }
        return c2;
    }

    @Override // tb.rnn
    public rov a(rox roxVar, rny rnyVar, Pair<Integer, Integer> pair) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rov) ipChange.ipc$dispatch("fc0d5363", new Object[]{this, roxVar, rnyVar, pair});
        }
        if (this.i != null) {
            this.d.add(pair);
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " onActionContinue, add offset, session:" + roxVar.hashCode());
            }
            return null;
        }
        try {
        } catch (UnsupportedEncodingException e) {
            e = e;
            str2 = "UploaderAction";
        } catch (Exception e2) {
            e = e2;
            str = "UploaderAction";
        }
        try {
            rnq rnqVar = new rnq(this.q, this.l, "patch", ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), false);
            roxVar.a(rnyVar, rnqVar, true);
            if (!com.uploader.implement.a.a(4)) {
                return null;
            }
            com.uploader.implement.a.a(4, "UploaderAction", this.f33242a + " onActionContinue, session:" + roxVar.hashCode() + " send request:" + rnqVar.hashCode());
            return null;
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            str2 = "UploaderAction";
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, str2, this.f33242a + " onActionContinue", e);
            }
            return new rov("200", "1", e.toString(), false);
        } catch (Exception e4) {
            e = e4;
            str = "UploaderAction";
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, str, this.f33242a + " onActionContinue", e);
            }
            return new rov("200", "5", e.toString(), false);
        }
    }

    @Override // tb.row
    public void c(rox roxVar, rny rnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e69cb2", new Object[]{this, roxVar, rnyVar});
            return;
        }
        if (com.uploader.implement.a.a(16)) {
            com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " onConnectBegin, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
        }
        rnt rntVar = this.k;
        if (rntVar == null) {
            return;
        }
        rntVar.n = System.currentTimeMillis();
        if (!com.uploader.implement.a.a(8)) {
            return;
        }
        com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " onConnectBegin statistics:" + this.k.hashCode() + " connectedTimeMillisStart:" + this.k.n);
    }

    @Override // tb.row
    public void d(rox roxVar, rny rnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527f9233", new Object[]{this, roxVar, rnyVar});
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " onConnect, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
        }
        rnt rntVar = this.k;
        if (rntVar == null) {
            return;
        }
        rntVar.o = System.currentTimeMillis();
    }

    @Override // tb.row
    public void a(rox roxVar, rny rnyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e1f753", new Object[]{this, roxVar, rnyVar, new Integer(i)});
            return;
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " onUploading, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode() + " fileSizeSent:" + i + ", sendOffset=" + this.e);
        }
        this.e = i + rnyVar.b().c;
        rnt rntVar = this.k;
        if (rntVar == null) {
            return;
        }
        rntVar.b = this.e;
    }

    @Override // tb.row
    public void e(rox roxVar, rny rnyVar) {
        long j;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1887b4", new Object[]{this, roxVar, rnyVar});
            return;
        }
        rnt rntVar = this.k;
        if (rntVar == null || rntVar.l != 0) {
            j = 0;
        } else {
            j = System.currentTimeMillis();
            this.k.l = j;
        }
        this.i = rnyVar;
        if (!com.uploader.implement.a.a(2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33242a);
        sb.append(" onSendBegin, session:");
        sb.append(roxVar.hashCode());
        sb.append(" request and set current:");
        sb.append(rnyVar.hashCode());
        if (j == 0) {
            str = "";
        } else {
            str = " statistics:" + this.k.hashCode() + " costTimeMillisStart:" + j;
        }
        sb.append(str);
        com.uploader.implement.a.a(2, "UploaderAction", sb.toString());
    }

    @Override // tb.rnn
    public Pair<Integer, Integer> a(rox roxVar, rny rnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("86db97fa", new Object[]{this, roxVar, rnyVar});
        }
        if (com.uploader.implement.a.a(4)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33242a);
            sb.append(" onActionDeliver, session:");
            sb.append(roxVar.hashCode());
            sb.append(" request:");
            sb.append(rnyVar.hashCode());
            sb.append(" currentRequest:");
            rny rnyVar2 = this.i;
            sb.append(rnyVar2 == null ? "null" : Integer.valueOf(rnyVar2.hashCode()));
            com.uploader.implement.a.a(4, "UploaderAction", sb.toString());
        }
        if (this.k != null) {
            rob b2 = rnyVar.b();
            this.k.b = b2.d + (b2.f == null ? 0 : b2.f.length) + (b2.g == null ? 0 : b2.g.length);
        }
        if (this.i != rnyVar) {
            return null;
        }
        this.i = null;
        if (this.d.size() <= 0) {
            return null;
        }
        return this.d.remove(0);
    }

    @Override // tb.rnn
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        rnr.a(this.o, i, this.m, this.n, obj);
        if (this.k == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " onActionNotify, notifyType:" + i + " statistics:" + this.k.hashCode() + " costTimeMillisEnd:" + currentTimeMillis);
        }
        if (i == 0) {
            if (this.r) {
                rot.a().a(this.t, true);
            } else if (!com.uploader.implement.b.b()) {
            } else {
                rot.a().a(this.t, false);
            }
        } else if (i == 1) {
            rnt rntVar = this.k;
            rntVar.g = 2;
            rntVar.D = UploaderManager.b();
            rnt rntVar2 = this.k;
            rntVar2.m = currentTimeMillis;
            if (obj != null) {
                rov rovVar = (rov) obj;
                rntVar2.h = rovVar.f24058a;
                this.k.i = rovVar.b;
            }
            this.k.b();
            this.k = null;
            if (this.r) {
                rot.a().a(this.t, true);
            } else if (!com.uploader.implement.b.b()) {
            } else {
                rot.a().a(this.t, false);
            }
        } else if (i == 2) {
            rov rovVar2 = (rov) obj;
            rnt rntVar3 = this.k;
            rntVar3.g = 0;
            rntVar3.h = rovVar2.f24058a;
            this.k.i = rovVar2.b;
            this.k.j = rovVar2.c;
            this.k.D = UploaderManager.b();
            rnt rntVar4 = this.k;
            rntVar4.m = currentTimeMillis;
            rntVar4.b();
            this.k = null;
            if (this.r) {
                rot.a().a(this.t, true);
            } else if (!com.uploader.implement.b.b()) {
            } else {
                rot.a().a(this.t, false);
            }
        } else if (i == 3) {
            Pair pair = (Pair) obj;
            int intValue = ((Integer) pair.first).intValue();
            this.f = ((Long) pair.second).longValue();
            if (this.r) {
                rot.a().a(this.t, intValue, this.f, this.k, true);
            } else if (!com.uploader.implement.b.b()) {
            } else {
                rot.a().a(this.t, intValue, this.f, this.k, false);
            }
        } else if (i != 4) {
            if (i != 7) {
                return;
            }
            this.k.m = currentTimeMillis;
        } else if (this.r) {
            rot.a().a(this.t, this.k, true);
        } else if (!com.uploader.implement.b.b()) {
        } else {
            rot.a().a(this.t, this.k, false);
        }
    }

    public final i f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("5e912bbd", new Object[]{this}) : this.m;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.p;
    }

    /* loaded from: classes9.dex */
    public static class b implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, String> f33255a;
        private String b;
        private String c;

        public b(Map<String, String> map, String str, String str2) {
            this.f33255a = map;
            this.c = str;
            this.b = str2;
        }

        @Override // com.uploader.export.e
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
        }

        @Override // com.uploader.export.e
        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        @Override // com.uploader.export.e
        public Map<String, String> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.f33255a;
        }
    }

    @Override // tb.rnn
    public Pair<rov, ? extends Object> a(rox roxVar, rny rnyVar, rns rnsVar) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1213e513", new Object[]{this, roxVar, rnyVar, rnsVar});
        }
        if (this.k != null && (a2 = rnsVar.a("divided_length")) != null) {
            try {
                this.k.c += Integer.parseInt(a2);
            } catch (Exception e) {
                if (com.uploader.implement.a.a(2)) {
                    com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + e.toString());
                }
            }
        }
        switch (rnsVar.a()) {
            case 1:
                return e(rnsVar);
            case 2:
                return d(rnsVar);
            case 3:
                return b(roxVar, rnyVar, rnsVar);
            case 4:
                return c(rnsVar);
            case 5:
                return b(rnsVar);
            case 6:
                return a(rnsVar);
            default:
                return null;
        }
    }

    public Pair<rov, ? extends Object> a(rns rnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("fc7b29cb", new Object[]{this, rnsVar});
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " retrieveStatus ,response=" + rnsVar);
        }
        String a2 = rnsVar.a("x-arup-session-status");
        if (!StringUtils.isEmpty(a2)) {
            return new Pair<>(null, a2);
        }
        return new Pair<>(null, null);
    }

    public Pair<rov, ? extends Object> b(rns rnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1163f20c", new Object[]{this, rnsVar});
        }
        if (com.uploader.implement.a.a(2)) {
            com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " onReceiveError ,response=" + rnsVar);
        }
        String a2 = rnsVar.a("x-arup-error-code");
        String a3 = rnsVar.a("x-arup-error-msg");
        try {
            long longValue = Long.valueOf(rnsVar.a("x-arup-server-rt")).longValue();
            if (this.k != null && longValue > 0) {
                this.k.w = longValue;
            }
        } catch (Exception unused) {
        }
        String a4 = rnsVar.a("x-arup-server-timestamp");
        if (!StringUtils.isEmpty(a4)) {
            try {
                this.q.f24068a.a(Long.parseLong(a4));
            } catch (Exception e) {
                if (com.uploader.implement.a.a(2)) {
                    com.uploader.implement.a.a(2, "UploaderAction", this.f33242a + " retrieveError " + e);
                }
                a3 = a3 + " " + e.toString();
            }
        }
        if ("20002".equalsIgnoreCase(a2) || "20021".equalsIgnoreCase(a2) || "20022".equalsIgnoreCase(a2) || "20020".equalsIgnoreCase(a2)) {
            this.q.f24068a.a(false);
        }
        if (rnv.a.C1179a.f33251a.contains(a2)) {
            return new Pair<>(new rov("300", a2, a3, true), null);
        }
        if ("20021".equalsIgnoreCase(a2) || "20022".equalsIgnoreCase(a2) || "20020".equalsIgnoreCase(a2)) {
            return new Pair<>(new rov("300", "2", a3, true), null);
        }
        return new Pair<>(new rov("300", a2, a3, false), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<tb.rov, ? extends java.lang.Object> c(tb.rns r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.roc.c(tb.rns):android.util.Pair");
    }

    public Pair<rov, ? extends Object> d(rns rnsVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3b35828e", new Object[]{this, rnsVar});
        }
        String a2 = rnsVar.a("x-arup-process");
        String a3 = rnsVar.a("x-arup-resume-offset");
        if (com.uploader.implement.a.a(16)) {
            com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " progress:" + a2 + ", offset:" + a3 + ", fileId:" + this.l.e + ", trackId:" + this.l.p);
        }
        try {
            i = Integer.parseInt(a2);
        } catch (Exception e) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + "", e);
            }
            i = 0;
        }
        if (i == -1) {
            this.u = 0;
        } else if (i > this.u) {
            this.u = i;
        }
        long j = -1;
        try {
            if (!StringUtils.isEmpty(a3)) {
                j = Integer.parseInt(a3);
            }
        } catch (Exception e2) {
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + "", e2);
            }
        }
        return new Pair<>(null, new Pair(Integer.valueOf(this.u), Long.valueOf(j)));
    }

    public Pair<rov, ? extends Object> e(rns rnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("501e4acf", new Object[]{this, rnsVar});
        }
        try {
            Object[] objArr = rnsVar.c;
            this.q.f24068a.a((String) objArr[0], ((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue(), (List) objArr[3], (List) objArr[4]);
            if (com.uploader.implement.a.a(8)) {
                com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " ConnectionStrategy update:" + this.q.f24068a.toString());
            }
            if (com.uploader.implement.b.a()) {
                rot.a().b();
            }
            ror.a().b();
            rnt rntVar = this.k;
            if (rntVar != null) {
                rntVar.g = 1;
                rntVar.q = (String) this.q.f24068a.a().first;
                this.k.m = System.currentTimeMillis();
                this.j = "Declare" + this.k.b();
                if (com.uploader.implement.a.a(8)) {
                    com.uploader.implement.a.a(8, "UploaderAction", this.f33242a + " retrieveDeclare, statistics:" + this.k.hashCode() + " costTimeMillisEnd:" + this.k.m);
                }
            }
            return new Pair<>(null, null);
        } catch (Exception e) {
            if (com.uploader.implement.a.a(4)) {
                com.uploader.implement.a.a(4, "UploaderAction", e.toString());
            }
            return new Pair<>(new rov("200", "8", e.toString(), true), null);
        }
    }

    public Pair<rov, ? extends Object> b(rox roxVar, rny rnyVar, rns rnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("878e0b54", new Object[]{this, roxVar, rnyVar, rnsVar});
        }
        String a2 = rnsVar.a("x-arup-offset");
        if (StringUtils.isEmpty(a2)) {
            return new Pair<>(new rov("200", "7", "onReceiveOffset:1", true), null);
        }
        int indexOf = a2.indexOf("=");
        if (indexOf == -1) {
            return new Pair<>(new rov("200", "7", "onReceiveOffset:2", true), null);
        }
        if (!this.l.e.equals(a2.substring(0, indexOf))) {
            return new Pair<>(new rov("200", "7", "onReceiveOffset:3", true), null);
        }
        int indexOf2 = a2.indexOf(",");
        int i = indexOf + 1;
        if (indexOf2 <= i || indexOf2 >= a2.length()) {
            return new Pair<>(new rov("200", "7", "onReceiveOffset:4", true), null);
        }
        try {
            return new Pair<>(null, new Pair(Integer.valueOf(Integer.parseInt(a2.substring(i, indexOf2))), Integer.valueOf(Integer.parseInt(a2.substring(indexOf2 + 1, a2.length())))));
        } catch (Exception e) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "UploaderAction", this.f33242a + " parse offset error.", e);
            }
            return new Pair<>(new rov("200", "7", e.toString(), true), null);
        }
    }

    private String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : UUID.randomUUID().toString().replaceAll("-", "");
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.t;
    }
}
