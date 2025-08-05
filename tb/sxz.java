package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class sxz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f33932a;

    /* loaded from: classes6.dex */
    public interface a<D> {
        void a(D d);

        void a(String str);
    }

    static {
        kge.a(-772498228);
    }

    public static /* synthetic */ String a(sxz sxzVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44e54933", new Object[]{sxzVar, str}) : sxzVar.a(str);
    }

    public static /* synthetic */ void a(sxz sxzVar, a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8502dd", new Object[]{sxzVar, aVar, obj});
        } else {
            sxzVar.a((a<a>) aVar, (a) obj);
        }
    }

    public static /* synthetic */ void a(sxz sxzVar, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39063ccb", new Object[]{sxzVar, aVar, str});
        } else {
            sxzVar.a(aVar, str);
        }
    }

    public sxz(String str) {
        this.f33932a = str;
    }

    public void a(final Context context, final String str, final byte[] bArr, final a<byte[]> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861f602f", new Object[]{this, context, str, bArr, aVar});
        } else if (context == null) {
            a((a) aVar, "context为空");
        } else {
            jqh.a(new Runnable() { // from class: tb.sxz.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (sxz.this.a(context, str, bArr)) {
                        sxz.a(sxz.this, aVar, bArr);
                    } else {
                        sxz.a(sxz.this, aVar, "保存失败");
                    }
                }
            });
        }
    }

    public boolean a(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd17c875", new Object[]{this, context, str, bArr})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput(a(str), 0);
            fileOutputStream.write(bArr);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
            }
            return true;
        } catch (Exception unused2) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] b(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "#获取文件失败1"
            com.android.alibaba.ip.runtime.IpChange r1 = tb.sxz.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r2 == 0) goto L1d
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r11
            r0[r4] = r12
            r0[r3] = r13
            java.lang.String r12 = "d49a29f4"
            java.lang.Object r12 = r1.ipc$dispatch(r12, r0)
            byte[] r12 = (byte[]) r12
            return r12
        L1d:
            r1 = 0
            if (r12 != 0) goto L21
            return r1
        L21:
            java.lang.String r2 = r11.a(r13)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L65
            java.io.FileInputStream r12 = r12.openFileInput(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L65
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
        L32:
            int r8 = r7.length     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            int r8 = r12.read(r7, r6, r8)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            r9 = -1
            if (r8 == r9) goto L3e
            r2.write(r7, r6, r8)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            goto L32
        L3e:
            r2.flush()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L93
            if (r12 == 0) goto L5d
            r12.close()     // Catch: java.io.IOException -> L4b
            goto L5d
        L4b:
            r12 = move-exception
            java.lang.String r2 = r11.f33932a
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r6] = r13
            r5[r4] = r0
            java.lang.String r12 = r12.getMessage()
            r5[r3] = r12
            tb.jqg.a(r2, r5)
        L5d:
            return r1
        L5e:
            r2 = move-exception
            goto L67
        L60:
            r12 = move-exception
            r10 = r1
            r1 = r12
            r12 = r10
            goto L94
        L65:
            r2 = move-exception
            r12 = r1
        L67:
            java.lang.String r7 = r11.f33932a     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L93
            r8[r6] = r13     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = "#获取文件失败"
            r8[r4] = r9     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L93
            r8[r3] = r2     // Catch: java.lang.Throwable -> L93
            tb.jqg.a(r7, r8)     // Catch: java.lang.Throwable -> L93
            if (r12 == 0) goto L92
            r12.close()     // Catch: java.io.IOException -> L80
            goto L92
        L80:
            r12 = move-exception
            java.lang.String r2 = r11.f33932a
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r6] = r13
            r5[r4] = r0
            java.lang.String r12 = r12.getMessage()
            r5[r3] = r12
            tb.jqg.a(r2, r5)
        L92:
            return r1
        L93:
            r1 = move-exception
        L94:
            if (r12 == 0) goto Lac
            r12.close()     // Catch: java.io.IOException -> L9a
            goto Lac
        L9a:
            r12 = move-exception
            java.lang.String r2 = r11.f33932a
            java.lang.String[] r5 = new java.lang.String[r5]
            r5[r6] = r13
            r5[r4] = r0
            java.lang.String r12 = r12.getMessage()
            r5[r3] = r12
            tb.jqg.a(r2, r5)
        Lac:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sxz.b(android.content.Context, java.lang.String):byte[]");
    }

    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            File fileStreamPath = context.getFileStreamPath(a(str));
            if (fileStreamPath != null) {
                if (fileStreamPath.exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            jqg.a(this.f33932a, str, "#文件不存在", e.getMessage());
            return false;
        }
    }

    public void c(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{this, context, str});
        } else if (context == null) {
        } else {
            jqh.a(new Runnable() { // from class: tb.sxz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        context.deleteFile(sxz.a(sxz.this, str));
                    }
                }
            });
        }
    }

    private <D> void a(a<D> aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fc17b0", new Object[]{this, aVar, str});
        } else if (aVar == null) {
        } else {
            aVar.a(str);
        }
    }

    private <D> void a(a<D> aVar, D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57addc2", new Object[]{this, aVar, d});
        } else if (aVar == null) {
        } else {
            aVar.a((a<D>) d);
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return "UltronCacheFile_" + this.f33932a + "_" + str;
    }
}
