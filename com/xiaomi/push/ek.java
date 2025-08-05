package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ah;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class ek extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f24447a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f257a;

    /* renamed from: a  reason: collision with other field name */
    private com.xiaomi.push.service.az f258a;

    public ek(Context context) {
        this.f24447a = context;
        this.f257a = context.getSharedPreferences("mipush_extra", 0);
        this.f258a = com.xiaomi.push.service.az.a(context);
    }

    private List<ik> a(File file) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        FileInputStream fileInputStream;
        eb m1834a = ec.a().m1834a();
        String a2 = m1834a == null ? "" : m1834a.a();
        FileInputStream fileInputStream2 = null;
        fileInputStream2 = null;
        r2 = null;
        fileInputStream2 = null;
        FileLock fileLock2 = null;
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[4];
        synchronized (ef.f24443a) {
            try {
                File file2 = new File(this.f24447a.getExternalFilesDir(null), "push_cdata.lock");
                x.m2368a(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    try {
                        fileInputStream = new FileInputStream(file);
                        while (fileInputStream.read(bArr) == 4) {
                            try {
                                int a3 = ab.a(bArr);
                                byte[] bArr2 = new byte[a3];
                                if (fileInputStream.read(bArr2) != a3) {
                                    break;
                                }
                                byte[] a4 = ee.a(a2, bArr2);
                                if (a4 != null && a4.length != 0) {
                                    ik ikVar = new ik();
                                    jm.a(ikVar, a4);
                                    arrayList.add(ikVar);
                                    a(ikVar);
                                }
                            } catch (Exception unused) {
                                fileLock2 = fileLock;
                                if (fileLock2 != null && fileLock2.isValid()) {
                                    try {
                                        fileLock2.release();
                                    } catch (IOException unused2) {
                                    }
                                }
                                x.a((Closeable) fileInputStream);
                                x.a(randomAccessFile);
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream2 = fileInputStream;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException unused3) {
                                    }
                                }
                                x.a((Closeable) fileInputStream2);
                                x.a(randomAccessFile);
                                throw th;
                            }
                        }
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException unused4) {
                            }
                        }
                        x.a((Closeable) fileInputStream);
                    } catch (Exception unused5) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused6) {
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = null;
                }
            } catch (Exception unused7) {
                randomAccessFile = null;
                fileInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileLock = null;
                randomAccessFile = null;
            }
            x.a(randomAccessFile);
        }
        return arrayList;
    }

    private void a() {
        SharedPreferences.Editor edit = this.f257a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    private void a(ik ikVar) {
        if (ikVar.f529a != ie.AppInstallList || ikVar.f530a.startsWith("same_")) {
            return;
        }
        SharedPreferences.Editor edit = this.f257a.edit();
        edit.putLong("dc_job_result_time_4", ikVar.f528a);
        edit.putString("dc_job_result_4", bm.a(ikVar.f530a));
        edit.commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m1840a() {
        if (bg.e(this.f24447a)) {
            return false;
        }
        if ((bg.g(this.f24447a) || bg.f(this.f24447a)) && !c()) {
            return true;
        }
        return (bg.h(this.f24447a) && !b()) || bg.i(this.f24447a);
    }

    private boolean b() {
        if (!this.f258a.a(ih.Upload3GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f257a.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max((int) RemoteMessageConst.DEFAULT_TTL, this.f258a.a(ih.Upload3GFrequency.a(), 432000)));
    }

    private boolean c() {
        if (!this.f258a.a(ih.Upload4GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f257a.getLong("last_upload_data_timestamp", -1L)) > ((long) Math.max((int) RemoteMessageConst.DEFAULT_TTL, this.f258a.a(ih.Upload4GFrequency.a(), 259200)));
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo1839a() {
        return "1";
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f24447a.getExternalFilesDir(null), "push_cdata.data");
        if (!bg.d(this.f24447a)) {
            if (file.length() <= 1863680) {
                return;
            }
            file.delete();
        } else if (m1840a() || !file.exists()) {
        } else {
            List<ik> a2 = a(file);
            if (!ac.a(a2)) {
                int size = a2.size();
                if (size > 4000) {
                    a2 = a2.subList(size + com.taobao.oversea.discovery.business.model.a.LIVE_CARD_TYPE, size);
                }
                iv ivVar = new iv();
                ivVar.a(a2);
                byte[] a3 = x.a(jm.a(ivVar));
                jb jbVar = new jb("-1", false);
                jbVar.c(im.DataCollection.f538a);
                jbVar.a(a3);
                eb m1834a = ec.a().m1834a();
                if (m1834a != null) {
                    m1834a.a(jbVar, ic.Notification, null);
                }
                a();
            }
            file.delete();
        }
    }
}
