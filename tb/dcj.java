package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.h;
import java.io.Closeable;

/* loaded from: classes.dex */
public class dcj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final dck f26684a;

    static {
        kge.a(-2030638531);
    }

    public static /* synthetic */ dck a(dcj dcjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dck) ipChange.ipc$dispatch("c69afc6d", new Object[]{dcjVar}) : dcjVar.f26684a;
    }

    public dcj(Context context) {
        this.f26684a = new dck(context);
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            dci.b().execute(new Runnable() { // from class: tb.dcj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        SQLiteDatabase writableDatabase = dcj.a(dcj.this).getWritableDatabase();
                        if (writableDatabase == null) {
                            h.a(writableDatabase);
                            return;
                        }
                        long currentTimeMillis = (System.currentTimeMillis() - 604800000) / 1000;
                        writableDatabase.delete(dck.TABLE_PRE_QUEUE, "msg_time<? or service_id!=?", new String[]{String.valueOf(currentTimeMillis), str});
                        dcl.a("PreQueueDBManager", "clean up db messages", "msg_time < ", Long.valueOf(currentTimeMillis), "keepServiceId", str);
                        h.a(writableDatabase);
                    } catch (Throwable th) {
                        try {
                            dcl.a("PreQueueDBManager", "clean err", th, new Object[0]);
                        } finally {
                            h.a((Closeable) null);
                        }
                    }
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public java.util.List<tb.dch> a(java.lang.String r26, java.lang.String r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dcj.a(java.lang.String, java.lang.String, int, int):java.util.List");
    }

    public void a(final dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dcea6f", new Object[]{this, dchVar});
        } else {
            dci.b().execute(new Runnable() { // from class: tb.dcj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    SQLiteDatabase sQLiteDatabase;
                    Throwable th;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        sQLiteDatabase = dcj.a(dcj.this).getWritableDatabase();
                        if (sQLiteDatabase == null) {
                            return;
                        }
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("service_id", dchVar.d());
                            contentValues.put(dck.COL_STREAM, dchVar.e());
                            contentValues.put(dck.COL_SEQ, Integer.valueOf(dchVar.f()));
                            contentValues.put(dck.COL_MSG_TIME, Long.valueOf(System.currentTimeMillis() / 1000));
                            contentValues.put("data", dchVar.a());
                            sQLiteDatabase.insert(dck.TABLE_PRE_QUEUE, null, contentValues);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                dcl.a("PreQueueDBManager", "insert err", th, new Object[0]);
                            } finally {
                                h.a(sQLiteDatabase);
                            }
                        }
                    } catch (Throwable th3) {
                        sQLiteDatabase = null;
                        th = th3;
                    }
                }
            });
        }
    }

    public void a(final String str, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
        } else {
            dci.b().execute(new Runnable() { // from class: tb.dcj.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        SQLiteDatabase writableDatabase = dcj.a(dcj.this).getWritableDatabase();
                        if (writableDatabase == null) {
                            h.a(writableDatabase);
                            return;
                        }
                        dcl.a("PreQueueDBManager", "delete", "serviceId", str, "streamId", str2, "< endSeq", Integer.valueOf(i));
                        StringBuilder sb = new StringBuilder("service_id");
                        sb.append(" = ?");
                        sb.append(" and ");
                        sb.append(dck.COL_SEQ);
                        sb.append(" < ?");
                        if (!StringUtils.isEmpty(str2)) {
                            sb.append(" and ");
                            sb.append(dck.COL_STREAM);
                            sb.append(" = ?");
                            writableDatabase.delete(dck.TABLE_PRE_QUEUE, sb.toString(), new String[]{str, String.valueOf(i), str2});
                        } else {
                            writableDatabase.delete(dck.TABLE_PRE_QUEUE, sb.toString(), new String[]{str, String.valueOf(i)});
                        }
                        h.a(writableDatabase);
                    } catch (Throwable th) {
                        try {
                            dcl.a("PreQueueDBManager", "remove err", th, new Object[0]);
                        } finally {
                            h.a((Closeable) null);
                        }
                    }
                }
            });
        }
    }
}
