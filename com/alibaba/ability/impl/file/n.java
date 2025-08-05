package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f1895a;
    private boolean b;
    private long c;
    private long d;
    private boolean e;

    static {
        kge.a(587853249);
        Companion = new a(null);
    }

    private n() {
    }

    public /* synthetic */ n(o oVar) {
        this();
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f1895a = str;
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    public final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }

    public final long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.d;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(591420361);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final n a(String str) throws Exception {
            ZipFile zipFile;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("eb1a759f", new Object[]{this, str});
            }
            try {
                try {
                    zipFile = new ZipFile(str);
                    try {
                        n nVar = new n(null);
                        nVar.a(str);
                        nVar.a(true);
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry zipEntry = entries.nextElement();
                            q.b(zipEntry, "zipEntry");
                            String name = zipEntry.getName();
                            if (!nVar.d()) {
                                q.b(name, "name");
                                if (kotlin.text.n.b(name, "../", false, 2, (Object) null) || kotlin.text.n.c(name, "/..", false, 2, (Object) null) || kotlin.text.n.b((CharSequence) name, (CharSequence) "/../", false, 2, (Object) null)) {
                                    nVar.b(true);
                                }
                            }
                            nVar.a(nVar.b() + zipEntry.getSize());
                            nVar.b(nVar.c() + zipEntry.getCompressedSize());
                        }
                        a(zipFile);
                        return nVar;
                    } catch (Exception e) {
                        e = e;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        a(zipFile);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = null;
            }
        }

        private final void a(ZipFile zipFile) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2715324a", new Object[]{this, zipFile});
            } else if (zipFile == null) {
            } else {
                try {
                    zipFile.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
