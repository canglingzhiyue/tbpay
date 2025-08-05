package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.c;
import com.uploader.export.i;
import com.uploader.export.k;
import com.uploader.implement.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rot {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f33281a;
    private SQLiteDatabase b;
    private d c;
    private ThreadPoolExecutor d;
    private ThreadPoolExecutor e;
    private final int f;

    /* loaded from: classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final rot f33287a;
        public final int b;
        public final Object[] c;

        public a(int i, rot rotVar, Object... objArr) {
            this.b = i;
            this.f33287a = rotVar;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            rot rotVar;
            String str;
            int intValue;
            long longValue;
            rnt rntVar;
            boolean booleanValue;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                switch (this.b) {
                    case 1:
                        rot.a(this.f33287a, (String) this.c[0], (i) this.c[1], ((Boolean) this.c[2]).booleanValue(), (rnp) this.c[3]);
                        return;
                    case 2:
                        rot.a(this.f33287a, (String) this.c[0], ((Boolean) this.c[1]).booleanValue());
                        return;
                    case 3:
                        rotVar = this.f33287a;
                        str = (String) this.c[0];
                        intValue = ((Integer) this.c[1]).intValue();
                        longValue = ((Long) this.c[2]).longValue();
                        rntVar = null;
                        booleanValue = ((Boolean) this.c[3]).booleanValue();
                        break;
                    case 4:
                        rot.a(this.f33287a, (String) this.c[0], (c) this.c[1], (Handler) this.c[2], ((Boolean) this.c[3]).booleanValue());
                        return;
                    case 5:
                        rot.a(this.f33287a);
                        return;
                    case 6:
                        rot.a(this.f33287a, (String) this.c[0], (rnt) this.c[1], ((Boolean) this.c[2]).booleanValue());
                        return;
                    case 7:
                        rotVar = this.f33287a;
                        str = (String) this.c[0];
                        intValue = ((Integer) this.c[1]).intValue();
                        longValue = ((Long) this.c[2]).longValue();
                        rntVar = (rnt) this.c[3];
                        booleanValue = ((Boolean) this.c[4]).booleanValue();
                        break;
                    case 8:
                        rot.a(this.f33287a, (String) this.c[0], (rnp) this.c[1]);
                        return;
                    case 9:
                        rot.b(this.f33287a);
                        return;
                    default:
                        return;
                }
                rot.a(rotVar, str, intValue, longValue, rntVar, booleanValue);
            } catch (Throwable th) {
                if (!com.uploader.implement.a.a(16)) {
                    return;
                }
                com.uploader.implement.a.a(16, "TaskDbManager", "HandlerRunnable error, flag=" + this.b, th);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final rot f33288a = new rot();

        public static /* synthetic */ rot a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rot) ipChange.ipc$dispatch("f0a2627", new Object[0]) : f33288a;
        }
    }

    private String a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f223e6b4", new Object[]{this, new Boolean(z)}) : z ? "multi_phase_resume_task" : "single_phase_task";
    }

    public static /* synthetic */ void a(rot rotVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6f51a1", new Object[]{rotVar});
        } else {
            rotVar.d();
        }
    }

    public static /* synthetic */ void a(rot rotVar, String str, int i, long j, rnt rntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20175710", new Object[]{rotVar, str, new Integer(i), new Long(j), rntVar, new Boolean(z)});
        } else {
            rotVar.b(str, i, j, rntVar, z);
        }
    }

    public static /* synthetic */ void a(rot rotVar, String str, c cVar, Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a1b29", new Object[]{rotVar, str, cVar, handler, new Boolean(z)});
        } else {
            rotVar.b(str, cVar, handler, z);
        }
    }

    public static /* synthetic */ void a(rot rotVar, String str, i iVar, boolean z, rnp rnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aaefb1b", new Object[]{rotVar, str, iVar, new Boolean(z), rnpVar});
        } else {
            rotVar.b(str, iVar, z, rnpVar);
        }
    }

    public static /* synthetic */ void a(rot rotVar, String str, rnp rnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dd53e67", new Object[]{rotVar, str, rnpVar});
        } else {
            rotVar.b(str, rnpVar);
        }
    }

    public static /* synthetic */ void a(rot rotVar, String str, rnt rntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0b9f51", new Object[]{rotVar, str, rntVar, new Boolean(z)});
        } else {
            rotVar.b(str, rntVar, z);
        }
    }

    public static /* synthetic */ void a(rot rotVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dada309", new Object[]{rotVar, str, new Boolean(z)});
        } else {
            rotVar.b(str, z);
        }
    }

    public static /* synthetic */ void b(rot rotVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf25822", new Object[]{rotVar});
        } else {
            rotVar.e();
        }
    }

    private rot() {
        this.f = hashCode();
    }

    public static rot a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rot) ipChange.ipc$dispatch("f0a2627", new Object[0]) : b.a();
    }

    public void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd02a0a", new Object[]{this, context, dVar});
            return;
        }
        if (com.uploader.implement.a.a(4)) {
            com.uploader.implement.a.a(4, "TaskDbManager", this.f + " initialize.");
        }
        this.f33281a = context;
        this.c = dVar;
        this.b = new rou(context, "aus_uploader.db").getWritableDatabase();
        this.d = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(1024), new ThreadFactory() { // from class: tb.rot.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "[aus_multi_phase_task_db]");
            }
        });
        this.e = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(1024), new ThreadFactory() { // from class: tb.rot.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "[aus_single_phase_task_db]");
            }
        });
        if (Build.VERSION.SDK_INT <= 8) {
            return;
        }
        this.d.allowCoreThreadTimeOut(true);
        this.e.allowCoreThreadTimeOut(true);
    }

    public void a(String str, i iVar, boolean z, rnp rnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db95b622", new Object[]{this, str, iVar, new Boolean(z), rnpVar});
            return;
        }
        ThreadPoolExecutor b2 = b(z);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(1, this, str, iVar, Boolean.valueOf(z), rnpVar));
    }

    private void b(String str, i iVar, boolean z, rnp rnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea0b63", new Object[]{this, str, iVar, new Boolean(z), rnpVar});
            return;
        }
        String a2 = a(z);
        Cursor query = this.b.query(a2, null, "fileId = ?", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "TaskDbManager", this.f + " DB has this record. fileId: " + str + ", task: " + iVar.hashCode());
            }
            query.close();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("fileId", str);
        contentValues.put("bizType", iVar.getBizType());
        contentValues.put("filePath", iVar.getFilePath());
        contentValues.put(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_TYPE, iVar.getFileType());
        if (iVar.getMetaInfo() != null) {
            contentValues.put("metaInfo", a(iVar.getMetaInfo()));
        }
        contentValues.put("resumeOffset", (Integer) 0);
        contentValues.put("progress", (Integer) 0);
        contentValues.put("fileCreateTime", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("env", Integer.valueOf(this.c.b.a().f24057a));
        contentValues.put("phaseIndex", (Integer) 0);
        if (rnpVar != null) {
            contentValues.put("md5", rnpVar.h);
        }
        if (this.b.insert(a2, null, contentValues) != -1 || !com.uploader.implement.a.a(16)) {
            return;
        }
        com.uploader.implement.a.a(16, "TaskDbManager", this.f + " DB doInsert fail. fileId: " + str + ", task: " + iVar.hashCode());
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor b2 = b(z);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(2, this, str, Boolean.valueOf(z)));
    }

    private void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int delete = this.b.delete(a(z), "fileId = ?", new String[]{str});
        if (delete > 0 || !com.uploader.implement.a.a(16)) {
            return;
        }
        com.uploader.implement.a.a(16, "TaskDbManager", this.f + " DB doDelete fail. fileId: " + str + ", result: " + delete);
    }

    public void a(String str, int i, long j, rnt rntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e1e5a9", new Object[]{this, str, new Integer(i), new Long(j), rntVar, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor b2 = b(z);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(7, this, str, Integer.valueOf(i), Long.valueOf(j), rntVar, Boolean.valueOf(z)));
    }

    private void b(String str, int i, long j, rnt rntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6201a9c8", new Object[]{this, str, new Integer(i), new Long(j), rntVar, new Boolean(z)});
            return;
        }
        String a2 = a(z);
        ContentValues contentValues = new ContentValues();
        contentValues.put("progress", Integer.valueOf(i));
        contentValues.put("resumeOffset", Long.valueOf(j));
        contentValues.put("uploadStat", rntVar.c());
        int update = this.b.update(a2, contentValues, "fileId = ?", new String[]{str});
        if (update > 0 || !com.uploader.implement.a.a(16)) {
            return;
        }
        com.uploader.implement.a.a(16, "TaskDbManager", this.f + " DB doUpdateProgress fail. fileId: " + str + ", result: " + update);
    }

    public void a(String str, c cVar, Handler handler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d583b0", new Object[]{this, str, cVar, handler, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor b2 = b(z);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(4, this, str, cVar, handler, Boolean.valueOf(z)));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0235 A[Catch: all -> 0x0223, TRY_LEAVE, TryCatch #0 {all -> 0x0223, blocks: (B:7:0x004f, B:73:0x022f, B:75:0x0235), top: B:90:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r35, final com.uploader.export.c r36, android.os.Handler r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rot.b(java.lang.String, com.uploader.export.c, android.os.Handler, boolean):void");
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    jSONObject.put(key, value);
                }
            }
        } catch (Exception e) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "TaskDbManager", this.f + " mapToJson error.", e);
            }
        }
        return jSONObject.toString();
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "TaskDbManager", this.f + " jsonToMap error.", e);
            }
        }
        return hashMap;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ThreadPoolExecutor b2 = b(true);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(5, this, new Object[0]));
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.delete(a(true), "fileCreateTime < ?", new String[]{String.valueOf(System.currentTimeMillis() - (this.c.f24068a.h() * 1000))});
        }
    }

    public void a(String str, rnt rntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2b002a", new Object[]{this, str, rntVar, new Boolean(z)});
            return;
        }
        ThreadPoolExecutor b2 = b(z);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(6, this, str, rntVar, Boolean.valueOf(z)));
    }

    private void b(String str, rnt rntVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45b4009", new Object[]{this, str, rntVar, new Boolean(z)});
            return;
        }
        String a2 = a(z);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uploadStat", rntVar.c());
        int update = this.b.update(a2, contentValues, "fileId = ?", new String[]{str});
        if (update > 0 || !com.uploader.implement.a.a(16)) {
            return;
        }
        com.uploader.implement.a.a(16, "TaskDbManager", this.f + " DB doUpdateUploadStat fail. fileId: " + str + ", result: " + update);
    }

    public void a(String str, rnp rnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d49de6e", new Object[]{this, str, rnpVar});
            return;
        }
        ThreadPoolExecutor b2 = b(true);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(8, this, str, rnpVar));
    }

    private void b(String str, rnp rnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5232a6af", new Object[]{this, str, rnpVar});
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("phaseIndex", Integer.valueOf(rnpVar.q));
        contentValues.put("md5", rnpVar.h);
        int update = this.b.update("multi_phase_resume_task", contentValues, "fileId = ?", new String[]{str});
        if (update > 0 || !com.uploader.implement.a.a(16)) {
            return;
        }
        com.uploader.implement.a.a(16, "TaskDbManager", this.f + " DB doUpdateTaskPhaseIndex fail. fileId: " + str + ", result: " + update);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ThreadPoolExecutor b2 = b(false);
        if (b2 == null) {
            return;
        }
        b2.submit(new a(9, this, new Object[0]));
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = a(false);
        Cursor query = this.b.query(a2, null, "env=?", new String[]{String.valueOf(this.c.b.a().f24057a)}, null, null, null);
        int columnIndex = query.getColumnIndex("fileId");
        int columnIndex2 = query.getColumnIndex("bizType");
        int columnIndex3 = query.getColumnIndex("filePath");
        int columnIndex4 = query.getColumnIndex(com.taobao.tao.log.statistics.d.PARAM_UPLOAD_FILE_TYPE);
        int columnIndex5 = query.getColumnIndex("metaInfo");
        int columnIndex6 = query.getColumnIndex("progress");
        int columnIndex7 = query.getColumnIndex("resumeOffset");
        int columnIndex8 = query.getColumnIndex("uploadStat");
        int columnIndex9 = query.getColumnIndex("phaseIndex");
        while (query.moveToNext()) {
            String string = query.getString(columnIndex2);
            String string2 = query.getString(columnIndex);
            String string3 = query.getString(columnIndex3);
            String string4 = query.getString(columnIndex4);
            String string5 = query.getString(columnIndex5);
            int i = query.getInt(columnIndex6);
            long j = query.getLong(columnIndex7);
            final String string6 = query.getString(columnIndex8);
            final k kVar = new k(string, string3, string4, a(string5), string2, j, i, string6, query.getInt(columnIndex9));
            rpa.a(new Runnable() { // from class: tb.rot.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rnt.a(string6).b(kVar);
                    }
                }
            });
        }
        query.close();
        this.b.delete(a2, "env=?", new String[]{String.valueOf(this.c.b.a().f24057a)});
    }

    private ThreadPoolExecutor b(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("8d4317eb", new Object[]{this, new Boolean(z)}) : z ? this.d : this.e;
    }
}
