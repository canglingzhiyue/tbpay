package com.alibaba.ability.impl.kvstorage;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.protodb.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.d;
import kotlin.io.f;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final d f;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f1904a;
    private final LSDB b;
    private final String c;
    private final String d;
    private final long e;

    private c(LSDB lsdb, String str, String str2, long j) {
        this.b = lsdb;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f1904a = new AtomicInteger(0);
        this.f1904a.addAndGet((int) this.b.getLong(new e("__current_file_values_size__")));
    }

    public /* synthetic */ c(LSDB lsdb, String str, String str2, long j, o oVar) {
        this(lsdb, str, str2, j);
    }

    public static final /* synthetic */ d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7cccf41", new Object[0]) : f;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public final List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        com.taobao.android.protodb.d<e> keyIterator = this.b.keyIterator();
        for (e a2 = keyIterator.a(); a2 != null; a2 = keyIterator.a()) {
            String a3 = a2.a();
            if (a3 == null) {
                a3 = "";
            }
            if ((!q.a((Object) "__current_file_values_size__", (Object) a3)) && this.b.contains(a2)) {
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.alibaba.ability.impl.kvstorage.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class RunnableC0052a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ File f1905a;

            public RunnableC0052a(File file) {
                this.f1905a = file;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String[] list = this.f1905a.list();
                if (list == null) {
                    return;
                }
                for (String str : list) {
                    f.c(new File(this.f1905a, str));
                }
            }
        }

        static {
            kge.a(-870697616);
        }

        private final bfy a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("f02bf09", new Object[]{this});
            } else {
                d g = c.g();
                a aVar = c.Companion;
                value = g.getValue();
            }
            return (bfy) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ bfy a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("547a3c32", new Object[]{aVar}) : aVar.a();
        }

        @JvmStatic
        public final c a(Context context, String fileName, String str, long j) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9a261fda", new Object[]{this, context, fileName, str, new Long(j)});
            }
            q.d(context, "context");
            q.d(fileName, "fileName");
            if (str == null) {
                str2 = fileName;
            } else {
                a aVar = this;
                Context applicationContext = context.getApplicationContext();
                q.b(applicationContext, "context.applicationContext");
                File file = new File(applicationContext.getFilesDir(), "lsdb-kv_storage_session");
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    Context applicationContext2 = context.getApplicationContext();
                    q.b(applicationContext2, "context.applicationContext");
                    File file3 = new File(applicationContext2.getFilesDir(), "mega_kv_session_to_delete");
                    file3.mkdirs();
                    if (!file3.exists()) {
                        f.c(file);
                    } else {
                        file.renameTo(new File(file3, String.valueOf(System.currentTimeMillis())));
                        bfy.a(a(aVar), new RunnableC0052a(file3), 0L, null, 6, null);
                    }
                    file2.mkdirs();
                }
                str2 = "kv_storage_session" + File.separator + str + File.separator + fileName;
            }
            Config config = new Config();
            config.walSize = 524288;
            t tVar = t.INSTANCE;
            LSDB open = LSDB.open(str2, config);
            q.b(open, "LSDB.open(lsdbModule, Co… * 512\n                })");
            Context applicationContext3 = context.getApplicationContext();
            q.b(applicationContext3, "context.applicationContext");
            String absolutePath = new File(applicationContext3.getFilesDir(), "lsdb-" + str2).getAbsolutePath();
            q.b(absolutePath, "File(context.application…lsdbModule\").absolutePath");
            return new c(open, fileName, absolutePath, j, null);
        }
    }

    static {
        kge.a(-1412342744);
        Companion = new a(null);
        f = kotlin.e.a(KVStorageImpl$Companion$deleteRunner$2.INSTANCE);
    }

    public final Object a(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, key});
        }
        q.d(key, "key");
        return this.b.getString(new e(key));
    }

    public final Pair<String, String> a(String key, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d1028f77", new Object[]{this, key, obj});
        }
        q.d(key, "key");
        if (this.f1904a.get() >= this.e) {
            return new Pair<>("QUOTA_EXHAUSTED", "当前业务已无存储空间，请清理后再试, 配额=" + this.e);
        }
        e eVar = new e(key);
        this.f1904a.addAndGet(-this.b.getDataSize(eVar));
        LSDB lsdb = this.b;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        lsdb.insertString(eVar, str);
        this.f1904a.addAndGet(this.b.getDataSize(eVar));
        this.b.insertLong(new e("__current_file_values_size__"), this.f1904a.get());
        return null;
    }

    public final void b(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, key});
            return;
        }
        q.d(key, "key");
        e eVar = new e(key);
        this.f1904a.addAndGet(-this.b.getDataSize(eVar));
        this.b.delete(eVar);
        this.b.insertLong(new e("__current_file_values_size__"), this.f1904a.get());
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.e;
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.f1904a.longValue();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b.close();
        f.c(new File(this.d));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.close();
        }
    }
}
