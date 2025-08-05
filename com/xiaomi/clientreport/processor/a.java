package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.push.ab;
import com.xiaomi.push.bm;
import com.xiaomi.push.bq;
import com.xiaomi.push.h;
import com.xiaomi.push.x;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes9.dex */
public class a implements IEventProcessor {

    /* renamed from: a  reason: collision with root package name */
    protected Context f24287a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f22a;

    public a(Context context) {
        a(context);
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        com.xiaomi.channel.commonutils.logger.b.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        r9 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<java.lang.String> a(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r1]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6f
        L15:
            int r9 = r5.read(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r4 = -1
            if (r9 == r4) goto L63
            java.lang.String r6 = "eventData read from cache file failed because magicNumber error"
            if (r9 == r1) goto L24
        L20:
            com.xiaomi.channel.commonutils.logger.b.d(r6)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            goto L63
        L24:
            int r9 = com.xiaomi.push.ab.a(r2)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            r7 = -573785174(0xffffffffddccbbaa, float:-1.84407149E18)
            if (r9 == r7) goto L2e
            goto L20
        L2e:
            int r9 = r5.read(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r9 == r4) goto L63
            if (r9 == r1) goto L3c
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer error"
        L38:
            com.xiaomi.channel.commonutils.logger.b.d(r9)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            goto L63
        L3c:
            int r9 = com.xiaomi.push.ab.a(r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r9 <= 0) goto L60
            r4 = 4096(0x1000, float:5.74E-42)
            if (r9 <= r4) goto L47
            goto L60
        L47:
            byte[] r4 = new byte[r9]     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            int r6 = r5.read(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r6 == r9) goto L52
            java.lang.String r9 = "eventData read from cache file failed cause buffer size not equal length"
            goto L38
        L52:
            java.lang.String r9 = r8.bytesToString(r4)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r4 != 0) goto L15
            r0.add(r9)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            goto L15
        L60:
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K"
            goto L38
        L63:
            com.xiaomi.push.x.a(r5)
            goto L76
        L67:
            r9 = move-exception
            goto L77
        L69:
            r9 = move-exception
            r4 = r5
            goto L70
        L6c:
            r9 = move-exception
            r5 = r4
            goto L77
        L6f:
            r9 = move-exception
        L70:
            com.xiaomi.channel.commonutils.logger.b.a(r9)     // Catch: java.lang.Throwable -> L6c
            com.xiaomi.push.x.a(r4)
        L76:
            return r0
        L77:
            com.xiaomi.push.x.a(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.a.a(java.lang.String):java.util.List");
    }

    private void a(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }
        x.a(randomAccessFile);
    }

    private void a(String str, String str2) {
        com.xiaomi.clientreport.manager.a a2 = com.xiaomi.clientreport.manager.a.a(this.f24287a);
        EventClientReport a3 = a2.a(5001, "24:" + str + "," + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a3.toJsonString());
        a(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v7 */
    private com.xiaomi.clientreport.data.a[] a(com.xiaomi.clientreport.data.a[] aVarArr) {
        Closeable closeable;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String b = b(aVarArr[0]);
        FileLock isEmpty = TextUtils.isEmpty(b);
        try {
            if (isEmpty != 0) {
                return null;
            }
            try {
                File file = new File(b + ".lock");
                x.m2368a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    isEmpty = randomAccessFile.getChannel().lock();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(b), true));
                    } catch (Exception e) {
                        e = e;
                        bufferedOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        closeable = null;
                        x.a(closeable);
                        a(randomAccessFile, isEmpty);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    isEmpty = 0;
                    bufferedOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    isEmpty = 0;
                    closeable = null;
                }
            } catch (Exception e3) {
                e = e3;
                isEmpty = 0;
                randomAccessFile = null;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                isEmpty = 0;
                randomAccessFile = null;
                closeable = null;
            }
            try {
                int i = 0;
                for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                    if (aVar != null) {
                        byte[] stringToBytes = stringToBytes(aVar.toJsonString());
                        if (stringToBytes != null && stringToBytes.length > 0 && stringToBytes.length <= 4096) {
                            if (!bq.m1746a(this.f24287a, b)) {
                                int length = aVarArr.length - i;
                                com.xiaomi.clientreport.data.a[] aVarArr2 = new com.xiaomi.clientreport.data.a[length];
                                System.arraycopy(aVarArr, i, aVarArr2, 0, length);
                                x.a(bufferedOutputStream);
                                a(randomAccessFile, (FileLock) isEmpty);
                                return aVarArr2;
                            }
                            bufferedOutputStream.write(ab.a(-573785174));
                            bufferedOutputStream.write(ab.a(stringToBytes.length));
                            bufferedOutputStream.write(stringToBytes);
                            bufferedOutputStream.flush();
                            i++;
                        }
                        com.xiaomi.channel.commonutils.logger.b.d("event data throw a invalid item ");
                    }
                }
            } catch (Exception e4) {
                e = e4;
                com.xiaomi.channel.commonutils.logger.b.a("event data write to cache file failed cause exception", e);
                x.a(bufferedOutputStream);
                a(randomAccessFile, isEmpty);
                return null;
            }
            x.a(bufferedOutputStream);
            a(randomAccessFile, isEmpty);
            return null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        File externalFilesDir = this.f24287a.getExternalFilesDir("event");
        String a2 = a(aVar);
        if (externalFilesDir == null) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + a2;
        for (int i = 0; i < 100; i++) {
            String str2 = str + i;
            if (bq.m1746a(this.f24287a, str2)) {
                return str2;
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.c
    public void a() {
        bq.a(this.f24287a, "event", "eventUploading");
        File[] m1747a = bq.m1747a(this.f24287a, "eventUploading");
        if (m1747a == null || m1747a.length <= 0) {
            return;
        }
        FileLock fileLock = null;
        RandomAccessFile randomAccessFile = null;
        File file = null;
        for (File file2 : m1747a) {
            if (file2 == null) {
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e) {
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                    }
                }
                x.a(randomAccessFile);
                if (file == null) {
                }
                file.delete();
            } else {
                try {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (file2.length() > WVFile.FILE_MAX_SIZE) {
                        com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                        a(file2.getName(), Formatter.formatFileSize(this.f24287a, file2.length()));
                        file2.delete();
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e3) {
                                com.xiaomi.channel.commonutils.logger.b.a(e3);
                            }
                        }
                        x.a(randomAccessFile);
                        if (file == null) {
                        }
                        file.delete();
                    } else {
                        String absolutePath = file2.getAbsolutePath();
                        File file3 = new File(absolutePath + ".lock");
                        try {
                            x.m2368a(file3);
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rw");
                            try {
                                fileLock = randomAccessFile2.getChannel().lock();
                                a(a(absolutePath));
                                file2.delete();
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e4) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e4);
                                    }
                                }
                                x.a(randomAccessFile2);
                                file3.delete();
                                randomAccessFile = randomAccessFile2;
                                file = file3;
                            } catch (Exception e5) {
                                e = e5;
                                randomAccessFile = randomAccessFile2;
                                file = file3;
                                com.xiaomi.channel.commonutils.logger.b.a(e);
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e6) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e6);
                                    }
                                }
                                x.a(randomAccessFile);
                                if (file == null) {
                                }
                                file.delete();
                            } catch (Throwable th) {
                                th = th;
                                randomAccessFile = randomAccessFile2;
                                file = file3;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e7) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e7);
                                    }
                                }
                                x.a(randomAccessFile);
                                if (file != null) {
                                    file.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    public void a(Context context) {
        this.f24287a = context;
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* renamed from: a  reason: collision with other method in class */
    public void mo1629a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof EventClientReport) && this.f22a != null) {
            EventClientReport eventClientReport = (EventClientReport) aVar;
            String a2 = a((com.xiaomi.clientreport.data.a) eventClientReport);
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f22a.get(a2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(eventClientReport);
            this.f22a.put(a2, arrayList);
        }
    }

    public void a(List<String> list) {
        bq.a(this.f24287a, list);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1630a(com.xiaomi.clientreport.data.a[] aVarArr) {
        if (aVarArr == null || aVarArr.length == 0 || aVarArr[0] == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("event data write to cache file failed because data null");
            return;
        }
        do {
            aVarArr = a(aVarArr);
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
        } while (aVarArr[0] != null);
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.f22a;
        if (hashMap == null) {
            return;
        }
        if (hashMap.size() > 0) {
            for (String str : this.f22a.keySet()) {
                ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f22a.get(str);
                if (arrayList != null && arrayList.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[arrayList.size()];
                    arrayList.toArray(aVarArr);
                    m1630a(aVarArr);
                }
            }
        }
        this.f22a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public String bytesToString(byte[] bArr) {
        byte[] a2;
        if (bArr != null && bArr.length > 0) {
            if (!com.xiaomi.clientreport.manager.a.a(this.f24287a).m1626a().isEventEncrypted()) {
                return bm.b(bArr);
            }
            String a3 = bq.a(this.f24287a);
            if (!TextUtils.isEmpty(a3) && (a2 = bq.a(a3)) != null && a2.length > 0) {
                try {
                    return bm.b(Base64.decode(h.a(a2, bArr), 2));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public void setEventMap(HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap) {
        this.f22a = hashMap;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public byte[] stringToBytes(String str) {
        byte[] a2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.a.a(this.f24287a).m1626a().isEventEncrypted()) {
            return bm.m1743a(str);
        }
        String a3 = bq.a(this.f24287a);
        byte[] m1743a = bm.m1743a(str);
        if (!TextUtils.isEmpty(a3) && m1743a != null && m1743a.length > 1 && (a2 = bq.a(a3)) != null) {
            try {
                if (a2.length > 1) {
                    return h.b(a2, Base64.encode(m1743a, 2));
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }
        return null;
    }
}
