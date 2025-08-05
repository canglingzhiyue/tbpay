package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.b;
import com.taobao.accs.asp.e;
import com.taobao.accs.utl.ALog;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public final class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SharedPreferences.Editor f;

    static {
        kge.a(1153283513);
    }

    public static /* synthetic */ SharedPreferences.Editor a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("5950eec0", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ SharedPreferences.Editor a(c cVar, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("f8dfb85", new Object[]{cVar, editor});
        }
        cVar.f = editor;
        return editor;
    }

    public c(Context context, String str, SharedPreferences sharedPreferences) {
        super(context, str, sharedPreferences, 0);
    }

    @Override // com.taobao.accs.asp.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.e) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry<String, ?> entry : this.c.getAll().entrySet()) {
                this.d.put(entry.getKey(), new b.c(entry.getValue()));
            }
            this.e = true;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            ALog.i("CoreSharedPreferences", "loadFromSP", "cost", Long.valueOf(currentTimeMillis2));
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

    /* loaded from: classes.dex */
    public final class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1107949015);
        }

        public a() {
            super();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v8, types: [com.taobao.accs.asp.e$b] */
        /* JADX WARN: Type inference failed for: r15v9, types: [java.nio.channels.FileLock] */
        @Override // com.taobao.accs.asp.b.a
        public void a(b.C0313b c0313b) {
            boolean z;
            IpChange ipChange = $ipChange;
            int i = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("730818f4", new Object[]{this, c0313b});
                return;
            }
            ModifiedRecord modifiedRecord = c0313b.d;
            if (modifiedRecord == null) {
                return;
            }
            PrefsIPCChannel.getInstance().dataUpdateEvent(modifiedRecord);
            long currentTimeMillis = System.currentTimeMillis();
            if (c.a(c.this) == null) {
                c cVar = c.this;
                c.a(cVar, cVar.c.edit());
            }
            if (modifiedRecord.isClear) {
                c.a(c.this).clear();
            }
            for (String str : modifiedRecord.modified.keySet()) {
                Object obj = modifiedRecord.modified.get(str);
                if (obj == null) {
                    c.a(c.this).remove(str);
                } else if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() >= 5120) {
                        e.c cVar2 = new e.c(c.this.f8179a);
                        cVar2.b = str;
                        cVar2.d = str.length();
                        cVar2.c = str2;
                        cVar2.e = str2.length();
                        cVar2.a();
                    }
                    c.a(c.this).putString(str, str2);
                } else if (obj instanceof Integer) {
                    c.a(c.this).putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    c.a(c.this).putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    c.a(c.this).putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof ArrayList) {
                    c.a(c.this).putStringSet(str, new HashSet((ArrayList) obj));
                } else if (obj instanceof Float) {
                    c.a(c.this).putFloat(str, ((Float) obj).floatValue());
                }
            }
            FileLock fileLock = 0;
            fileLock = 0;
            try {
                try {
                    fileLock = new RandomAccessFile(c.this.b, "rw").getChannel().lock();
                    z = c.a(c.this).commit();
                    if (fileLock != 0) {
                        try {
                            fileLock.release();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e2) {
                    ALog.e("CoreSharedPreferences", "[commitToDisk]error.", e2, new Object[0]);
                    if (fileLock != 0) {
                        try {
                            fileLock.release();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    z = false;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ALog.i("CoreSharedPreferences", "commitToDisk", "cost", Long.valueOf(currentTimeMillis2));
                fileLock = new e.b(c.this.f8179a, 2);
                fileLock.c = currentTimeMillis2;
                if (!z) {
                    i = 0;
                }
                fileLock.d = i;
                fileLock.a();
            } catch (Throwable th) {
                if (fileLock != 0) {
                    try {
                        fileLock.release();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }
}
