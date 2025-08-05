package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.PrefsIPCChannel;
import com.taobao.accs.asp.b;
import com.taobao.accs.asp.e;
import com.taobao.accs.utl.ALog;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public final class d extends b implements OnDataUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1817626789);
        kge.a(877866049);
    }

    public d(Context context, String str, SharedPreferences sharedPreferences) {
        super(context, str, sharedPreferences, 1);
        c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.accs.asp.a.c(new Runnable() { // from class: com.taobao.accs.asp.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        PrefsIPCChannel.a.a(d.this.f8179a, d.this);
                    }
                }
            });
        }
    }

    @Override // com.taobao.accs.asp.b
    public void a() {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e) {
            long currentTimeMillis = System.currentTimeMillis();
            FileLock fileLock = null;
            try {
                randomAccessFile = new RandomAccessFile(this.b, "rw");
                int i = 0;
                while (fileLock == null && i < 10) {
                    try {
                        fileLock = randomAccessFile.getChannel().tryLock();
                        if (fileLock == null) {
                            Thread.sleep(20L);
                            i++;
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                randomAccessFile = null;
            }
            for (Map.Entry<String, ?> entry : this.c.getAll().entrySet()) {
                this.d.put(entry.getKey(), new b.c(entry.getValue()));
            }
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    ALog.e("EdgeSharedPreferences", "randomAccessFile close err", th2, new Object[0]);
                }
            }
            this.e = true;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            ALog.i("EdgeSharedPreferences", "loadFromSP", "cost", Long.valueOf(currentTimeMillis2));
            e.b bVar = new e.b(this.f8179a, 1);
            bVar.c = currentTimeMillis2;
            bVar.d = 1;
            bVar.a();
        }
    }

    @Override // com.taobao.accs.asp.b
    public b.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("765ac156", new Object[]{this}) : new a();
    }

    @Override // com.taobao.accs.asp.OnDataUpdateListener
    public void onDataUpdate(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42abd893", new Object[]{this, modifiedRecord});
        } else {
            a(modifiedRecord);
        }
    }

    /* loaded from: classes.dex */
    public final class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2012457619);
        }

        public a() {
            super();
        }

        @Override // com.taobao.accs.asp.b.a
        public void a(b.C0313b c0313b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730818f4", new Object[]{this, c0313b});
                return;
            }
            ModifiedRecord modifiedRecord = c0313b.d;
            if (modifiedRecord == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            PrefsIPCChannel.a.a(modifiedRecord);
            ALog.i("EdgeSharedPreferences", "commitToDisk", "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
