package com.taobao.android.dinamic.tempate;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import tb.fpa;
import tb.fps;
import tb.fpu;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<a> f11757a = new ArrayDeque<>();
    private volatile a b;

    /* loaded from: classes5.dex */
    public interface b {
        void a(com.taobao.android.dinamic.tempate.b bVar);
    }

    static {
        kge.a(957322736);
    }

    public static /* synthetic */ void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab2a4d8", new Object[]{cVar});
        } else {
            cVar.a();
        }
    }

    public synchronized void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1771c6fb", new Object[]{this, aVar});
            return;
        }
        a.a(aVar, this);
        this.f11757a.offer(aVar);
        if (this.b == null) {
            a();
        }
    }

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a poll = this.f11757a.poll();
        this.b = poll;
        if (poll != null) {
            this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* loaded from: classes5.dex */
    public static final class a extends AsyncTask<Void, com.taobao.android.dinamic.tempate.b, com.taobao.android.dinamic.tempate.b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f11758a;
        public List<DinamicTemplate> b;
        public String c;
        private final fps d;
        private c e;
        private Timer f;
        private long g;
        private volatile boolean h;
        private ArrayList<DinamicTemplate> i = new ArrayList<>();
        private ArrayList<DinamicTemplate> j = new ArrayList<>();
        private ArrayList<DinamicTemplate> k = new ArrayList<>();
        private ArrayList<DinamicTemplate> l = new ArrayList<>();
        private ArrayList<DinamicTemplate> m = new ArrayList<>();
        private TimerTask n = new TimerTask() { // from class: com.taobao.android.dinamic.tempate.c.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (a.this) {
                    if (a.a(a.this)) {
                        return;
                    }
                    try {
                        if (a.b(a.this).size() > 0 || a.c(a.this).size() > 0) {
                            a.a(a.this, new com.taobao.android.dinamic.tempate.b[]{a.d(a.this)});
                            a.b(a.this).clear();
                            a.c(a.this).clear();
                        }
                    } catch (Exception e) {
                        fpa.b("SerialTaskManager", e, "callback onFinished is error");
                    }
                }
            }
        };

        static {
            kge.a(-406511455);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ c a(a aVar, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("bc17a8fb", new Object[]{aVar, cVar});
            }
            aVar.e = cVar;
            return cVar;
        }

        public static /* synthetic */ void a(a aVar, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b57b456", new Object[]{aVar, objArr});
            } else {
                aVar.publishProgress(objArr);
            }
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1771c6ff", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ ArrayList b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d875d756", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ ArrayList c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("26354f57", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ com.taobao.android.dinamic.tempate.b d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.dinamic.tempate.b) ipChange.ipc$dispatch("23c7fb69", new Object[]{aVar}) : aVar.a();
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.dinamic.tempate.b, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ com.taobao.android.dinamic.tempate.b doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(com.taobao.android.dinamic.tempate.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, bVar});
            } else {
                a(bVar);
            }
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onProgressUpdate(com.taobao.android.dinamic.tempate.b[] bVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e9c3295", new Object[]{this, bVarArr});
            } else {
                a(bVarArr);
            }
        }

        public a(fps fpsVar, int i) {
            this.g = 3000L;
            this.d = fpsVar;
            this.g = i;
        }

        private com.taobao.android.dinamic.tempate.b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.dinamic.tempate.b) ipChange.ipc$dispatch("6d18e7bf", new Object[]{this});
            }
            com.taobao.android.dinamic.tempate.b bVar = new com.taobao.android.dinamic.tempate.b();
            bVar.f11756a = this.h;
            bVar.b = (ArrayList) this.i.clone();
            bVar.c = (ArrayList) this.j.clone();
            bVar.d = (ArrayList) this.k.clone();
            bVar.e = (ArrayList) this.l.clone();
            bVar.f = (ArrayList) this.m.clone();
            return bVar;
        }

        public com.taobao.android.dinamic.tempate.b a(Void... voidArr) {
            byte[] bArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.dinamic.tempate.b) ipChange.ipc$dispatch("8146e453", new Object[]{this, voidArr});
            }
            List<DinamicTemplate> list = this.b;
            if (list == null || list.isEmpty()) {
                this.h = true;
                return a();
            }
            HashSet hashSet = new HashSet();
            for (DinamicTemplate dinamicTemplate : this.b) {
                if (dinamicTemplate == null || StringUtils.isEmpty(dinamicTemplate.templateUrl) || StringUtils.isEmpty(dinamicTemplate.name) || StringUtils.isEmpty(dinamicTemplate.version)) {
                    this.j.add(dinamicTemplate);
                    this.l.add(dinamicTemplate);
                } else {
                    C0470c b = b(dinamicTemplate);
                    if (b == null) {
                        this.m.add(dinamicTemplate);
                    } else {
                        hashSet.add(b);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                this.f = new Timer();
                Timer timer = this.f;
                TimerTask timerTask = this.n;
                long j = this.g;
                timer.schedule(timerTask, j, j);
                ArrayList arrayList = new ArrayList(hashSet);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0470c c0470c = (C0470c) arrayList.get(i);
                    try {
                        bArr = this.d.a(c0470c.c, c0470c.f11760a, c0470c.b, new fpu(this.c));
                    } catch (Throwable th) {
                        fpa.a("SerialTaskManager", "remote getTemplate", th);
                        bArr = null;
                    }
                    synchronized (this) {
                        if (bArr == null) {
                            this.l.add(c0470c.c);
                            this.j.add(c0470c.c);
                        } else {
                            this.k.add(c0470c.c);
                            this.i.add(c0470c.c);
                        }
                        if (i == size - 1) {
                            this.h = true;
                            this.f.cancel();
                        }
                    }
                }
            } else {
                this.h = true;
            }
            return a();
        }

        public void a(com.taobao.android.dinamic.tempate.b bVar) {
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fab23079", new Object[]{this, bVar});
                } else {
                    this.f11758a.a(bVar);
                }
            } catch (Exception e) {
                fpa.b("SerialTaskManager", e, "callback onFinished is error");
            } finally {
                c.a(this.e);
            }
        }

        public void a(com.taobao.android.dinamic.tempate.b... bVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c65f7e", new Object[]{this, bVarArr});
                return;
            }
            try {
                this.f11758a.a(bVarArr[0]);
            } catch (Exception e) {
                fpa.b("SerialTaskManager", e, "callback onFinished is error");
            }
        }

        private C0470c b(DinamicTemplate dinamicTemplate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0470c) ipChange.ipc$dispatch("946224d4", new Object[]{this, dinamicTemplate});
            }
            String a2 = a(dinamicTemplate);
            if (StringUtils.isEmpty(a2) || this.d.c(a2) != null) {
                return null;
            }
            C0470c c0470c = new C0470c();
            c0470c.f11760a = a2;
            c0470c.b = dinamicTemplate.templateUrl;
            c0470c.c = dinamicTemplate;
            return c0470c;
        }

        public String a(DinamicTemplate dinamicTemplate) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b4a5106e", new Object[]{this, dinamicTemplate});
            }
            return dinamicTemplate.name + "_" + dinamicTemplate.version;
        }
    }

    /* renamed from: com.taobao.android.dinamic.tempate.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0470c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11760a;
        public String b;
        public DinamicTemplate c;

        static {
            kge.a(-1186159083);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return StringUtils.equals(this.f11760a, ((C0470c) obj).f11760a);
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f11760a;
            if (str != null) {
                return str.hashCode();
            }
            return -1;
        }
    }
}
