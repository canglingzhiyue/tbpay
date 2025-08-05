package com.taobao.alivfssdk.cache;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.fresco.cache.disk.DefaultDiskStorage;
import com.taobao.alivfssdk.fresco.cache.disk.b;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import tb.dii;
import tb.dio;
import tb.diq;
import tb.dvq;
import tb.kge;

/* loaded from: classes.dex */
public class b implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Integer b;
    private static Map<String, Integer> c;
    private static int d;
    private static boolean e;
    private static Integer l;

    /* renamed from: a  reason: collision with root package name */
    public final c f8482a = c.a();
    private final String f;
    private h g;
    private h h;
    private h i;
    private final File j;
    private ClassLoader k;

    static {
        kge.a(-282911130);
        kge.a(-1811054506);
        b = 259200;
        c = new HashMap();
        l = b;
        d = 4194304;
        e = false;
    }

    public b(String str, File file) {
        this.f = str;
        this.j = file;
        if (this.j == null) {
            l d2 = l.d();
            this.i = d2;
            this.h = d2;
            this.g = d2;
        }
    }

    public h a() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("2f1a026f", new Object[]{this});
        }
        if (this.g == null) {
            if (!e) {
                synchronized (b.class) {
                    if (!e) {
                        if (dii.a() != null) {
                            diq a2 = diq.a();
                            a2.a(dii.a().getFilesDir().getAbsolutePath());
                            String a3 = a2.a("ali_database_es", "ttl_seconds");
                            if (a3 != null) {
                                try {
                                    int parseInt = Integer.parseInt(a3);
                                    if (parseInt <= 0) {
                                        parseInt = b.intValue();
                                    }
                                    l = Integer.valueOf(parseInt);
                                } catch (Exception unused) {
                                }
                            }
                            String a4 = a2.a("ali_database_es", "lsm_white_list");
                            if (a4 != null) {
                                try {
                                    for (String str : a4.split(",")) {
                                        String a5 = a2.a("ali_database_es", str + "_ttl");
                                        if (!TextUtils.isEmpty(a5)) {
                                            c.put(str, Integer.valueOf(Integer.parseInt(a5)));
                                        } else {
                                            c.put(str, l);
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                            } else {
                                c.put("phximgs_top1", l);
                                c.put("phximgs_top2", l);
                                c.put("phximgs_top3", l);
                                c.put("phximgs_top4", l);
                            }
                            String a6 = a2.a("ali_database_es", "wal_size");
                            if (a6 != null) {
                                try {
                                    int parseInt2 = Integer.parseInt(a6);
                                    if (parseInt2 <= 0) {
                                        parseInt2 = 4194304;
                                    }
                                    d = parseInt2;
                                } catch (Exception unused3) {
                                }
                            }
                        }
                        TLog.logi("AVFSCache", "AVFS_FILE_CACHE_CONFIG", "lsm_white_list=" + c + ", ttl=" + l + ", wal_size=" + d);
                        e = true;
                    }
                }
            }
            if (c.containsKey(this.f) && TextUtils.equals(LauncherRuntime.c, LauncherRuntime.b)) {
                Integer num = c.get(this.f);
                if (num != null) {
                    this.g = i.a(this.f, d, num.intValue());
                    Log.e("AliVfs", "using lsm cache");
                }
            } else {
                this.g = new d(this, "file", new DefaultDiskStorage(new File(this.j, dvq.FILES_DIR_NAME), 1, com.taobao.alivfssdk.fresco.cache.common.e.a()), new b.C0335b(0, 0L, this.f8482a.f8483a.longValue()), (int) this.f8482a.b);
            }
        }
        return this.g;
    }

    public h b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("6c39c68e", new Object[]{this}) : a(false);
    }

    public h a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("a044a9eb", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            if (this.i == null) {
                this.i = b(z);
            }
            return this.i;
        }
        if (this.h == null) {
            this.h = b(z);
        }
        return this.h;
    }

    private h b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("71d69ac", new Object[]{this, new Boolean(z)}) : new d(this, com.taobao.alivfsadapter.g.CACHE_SQL, new m(this.j, 1, z, com.taobao.alivfssdk.fresco.cache.common.e.a()), new b.C0335b(0, 0L, this.f8482a.f8483a.longValue()), (int) this.f8482a.c);
    }

    public b a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6083a98f", new Object[]{this, cVar});
        }
        this.f8482a.a(cVar);
        return this;
    }

    public ClassLoader c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("b2ad2d44", new Object[]{this}) : this.k;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f;
    }

    public File e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("b2a84a21", new Object[]{this}) : this.j;
    }

    public b a(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("dc408f5b", new Object[]{this, classLoader});
        }
        this.k = classLoader;
        return this;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            close();
        } catch (IOException e2) {
            dio.a("AVFSCache", e2, new Object[0]);
        }
        File file = this.j;
        if (file == null) {
            return;
        }
        com.taobao.alivfssdk.fresco.common.file.a.a(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        h hVar = this.g;
        if (hVar != null) {
            hVar.close();
            this.g = null;
        }
        h hVar2 = this.h;
        if (hVar2 != null) {
            hVar2.close();
            this.h = null;
        }
        h hVar3 = this.i;
        if (hVar3 == null) {
            return;
        }
        hVar3.close();
        this.i = null;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            super.finalize();
        }
    }
}
