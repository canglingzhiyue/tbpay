package com.loc;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.f3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public class ca {

    /* renamed from: a  reason: collision with root package name */
    static boolean f7715a = false;
    static int b = 20;
    private static int c = 20;
    private static WeakReference<bv> d;
    private static int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a extends cs {

        /* renamed from: a  reason: collision with root package name */
        static int f7716a = 1;
        static int b = 2;
        static int c = 3;
        private Context d;
        private bz f;
        private int g;
        private List<bz> h;

        a(Context context, int i) {
            this.d = context;
            this.g = i;
        }

        a(Context context, int i, bz bzVar) {
            this(context, i);
            this.f = bzVar;
        }

        a(Context context, int i, List<bz> list) {
            this(context, i);
            this.h = list;
        }

        @Override // com.loc.cs
        public final void a() {
            String str;
            String str2;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            int i = this.g;
            if (i == 1) {
                try {
                    if (this.d != null && this.f != null) {
                        synchronized (ca.class) {
                            if (this.d != null && this.f != null) {
                                ca.a(this.d, this.f.a());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    str = "stm";
                    str2 = "as";
                }
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                try {
                    if (this.d == null) {
                        return;
                    }
                    bv a2 = cb.a(ca.d);
                    cb.a(this.d, a2, at.h, 1000, f3.e, "2");
                    if (a2.g == null) {
                        a2.g = new cc(new cg(this.d, new cd(new ch(new cj()))));
                    }
                    a2.h = 3600000;
                    if (StringUtils.isEmpty(a2.i)) {
                        a2.i = "cKey";
                    }
                    if (a2.f == null) {
                        a2.f = new cn(this.d, a2.h, a2.i, new ck(a2.f7709a, new cl(this.d, ca.f7715a, ca.c << 10, ca.b << 10, "staticUpdate", ca.e << 10)));
                    }
                    bw.a(a2);
                    return;
                } catch (Throwable th3) {
                    av.b(th3, "stm", "usd");
                    return;
                }
            } else {
                try {
                    synchronized (ca.class) {
                        if (this.h != null && this.d != null) {
                            ByteArrayOutputStream byteArrayOutputStream2 = null;
                            byte[] bArr = new byte[0];
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                for (bz bzVar : this.h) {
                                    if (bzVar != null) {
                                        byteArrayOutputStream.write(bzVar.a());
                                    }
                                }
                                bArr = byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th5) {
                                    th = th5;
                                    th.printStackTrace();
                                    ca.a(this.d, bArr);
                                    return;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                try {
                                    av.b(th, "stm", "aStB");
                                    if (byteArrayOutputStream2 != null) {
                                        try {
                                            byteArrayOutputStream2.close();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th.printStackTrace();
                                            ca.a(this.d, bArr);
                                            return;
                                        }
                                    }
                                    ca.a(this.d, bArr);
                                    return;
                                } catch (Throwable th8) {
                                    ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream2;
                                    if (byteArrayOutputStream3 != null) {
                                        try {
                                            byteArrayOutputStream3.close();
                                        } catch (Throwable th9) {
                                            th9.printStackTrace();
                                        }
                                    }
                                    throw th8;
                                }
                            }
                            ca.a(this.d, bArr);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    str = "stm";
                    str2 = "apb";
                }
            }
            av.b(th, str, str2);
        }
    }

    public static void a(Context context) {
        cr.a().b(new a(context, a.c));
    }

    static /* synthetic */ void a(Context context, byte[] bArr) throws IOException {
        bv a2 = cb.a(d);
        cb.a(context, a2, at.h, 1000, f3.e, "2");
        if (a2.e == null) {
            a2.e = new be();
        }
        Random random = new Random();
        try {
            bw.a(Integer.toString(random.nextInt(100)) + Long.toString(System.nanoTime()), bArr, a2);
        } catch (Throwable th) {
            av.b(th, "stm", "wts");
        }
    }

    public static synchronized void a(bz bzVar, Context context) {
        synchronized (ca.class) {
            cr.a().b(new a(context, a.f7716a, bzVar));
        }
    }

    public static synchronized void a(List<bz> list, Context context) {
        synchronized (ca.class) {
            if (list != null) {
                try {
                    if (list.size() != 0) {
                        cr.a().b(new a(context, a.b, list));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void a(boolean z, int i) {
        synchronized (ca.class) {
            f7715a = z;
            e = Math.max(0, i);
        }
    }

    public static synchronized void b(List<bz> list, Context context) {
        synchronized (ca.class) {
            try {
                List<bz> b2 = bq.b();
                if (b2 != null && b2.size() > 0) {
                    list.addAll(b2);
                }
            } catch (Throwable unused) {
            }
            a(list, context);
        }
    }
}
