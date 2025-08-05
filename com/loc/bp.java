package com.loc;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class bp extends r {

    /* renamed from: a  reason: collision with root package name */
    protected Context f7691a;
    protected w b;
    protected byte[] c;

    public bp(Context context, w wVar) {
        if (context != null) {
            this.f7691a = context.getApplicationContext();
        }
        this.b = wVar;
        r();
    }

    private static byte[] A() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(x.a("PANDORA$"));
            byteArrayOutputStream.write(new byte[]{1});
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                as.a(th, "bre", "gbh");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                as.a(th2, "bre", "gbh");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th3) {
                    as.a(th3, "bre", "gbh");
                    return null;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    as.a(th5, "bre", "gbh");
                }
                throw th4;
            }
        }
    }

    private byte[] B() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[]{3});
            if (i()) {
                byte[] a2 = n.a(this.f7691a, k(), this.b != null && "navi".equals(this.b.a()));
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
            } else {
                byteArrayOutputStream.write(new byte[]{0, 0});
            }
            byte[] a3 = x.a(f());
            if (a3 == null || a3.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a3));
                byteArrayOutputStream.write(a3);
            }
            byte[] a4 = x.a(j());
            if (a4 == null || a4.length <= 0) {
                byteArrayOutputStream.write(new byte[]{0, 0});
            } else {
                byteArrayOutputStream.write(a(a4));
                byteArrayOutputStream.write(a4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                as.a(th, "bre", "gred");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                as.a(th2, "bre", "gpd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    as.a(th3, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    as.a(th5, "bre", "gred");
                }
                throw th4;
            }
        }
    }

    private byte[] C() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] a_ = a_();
            if (a_ != null && a_.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byteArrayOutputStream.write(a(a_));
                byteArrayOutputStream.write(a_);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    as.a(th, "bre", "grrd");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                as.a(th2, "bre", "grrd");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                as.a(th3, "bre", "grrd");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    as.a(th4, "bre", "grrd");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    as.a(th6, "bre", "grrd");
                }
                throw th5;
            }
        }
    }

    private byte[] D() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] b_ = b_();
            if (b_ != null && b_.length != 0) {
                byteArrayOutputStream.write(new byte[]{1});
                byte[] a2 = n.a(b_);
                byteArrayOutputStream.write(a(a2));
                byteArrayOutputStream.write(a2);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    as.a(th, "bre", "gred");
                }
                return byteArray;
            }
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                as.a(th2, "bre", "gred");
            }
            return byteArray2;
        } catch (Throwable th3) {
            try {
                as.a(th3, "bre", "gred");
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    as.a(th4, "bre", "gred");
                }
                return new byte[]{0};
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    as.a(th6, "bre", "gred");
                }
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] a(byte[] bArr) {
        return x.a(bArr.length);
    }

    public abstract byte[] a_();

    public abstract byte[] b_();

    @Override // com.loc.bt
    public final byte[] d() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(A());
            byteArrayOutputStream.write(B());
            byteArrayOutputStream.write(C());
            byteArrayOutputStream.write(D());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.c = byteArray;
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                as.a(th, "bre", "geb");
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                as.a(th2, "bre", "geb");
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Throwable th3) {
                    as.a(th3, "bre", "geb");
                    return null;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    as.a(th5, "bre", "geb");
                }
                throw th4;
            }
        }
    }

    @Override // com.loc.bt
    public Map<String, String> e() {
        String f = l.f(this.f7691a);
        String a2 = n.a();
        String a3 = n.a(this.f7691a, a2, "key=".concat(String.valueOf(f)));
        HashMap hashMap = new HashMap();
        hashMap.put("ts", a2);
        hashMap.put("key", f);
        hashMap.put("scode", a3);
        return hashMap;
    }

    protected String f() {
        return "2.1";
    }

    public boolean i() {
        return true;
    }

    public String j() {
        return String.format("platform=Android&sdkversion=%s&product=%s", this.b.c(), this.b.a());
    }

    protected boolean k() {
        return false;
    }
}
