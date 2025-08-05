package com.taobao.umipublish.draft;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ali.alidatabasees.CallableStatement;
import com.ali.alidatabasees.Database;
import com.ali.alidatabasees.PreparedStatement;
import com.ali.alidatabasees.Result;
import com.ali.alidatabasees.ResultSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.draft.DraftModel;
import com.taobao.umipublish.draft.c;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tb.kge;
import tb.tek;

/* loaded from: classes9.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f23236a;
    private Context c;
    private DraftMediaHelper d;
    private Map<String, Database> b = new HashMap();
    private Map<String, Collection<DraftModel>> e = new HashMap();

    static {
        kge.a(-361783830);
        kge.a(1021917309);
        f23236a = new String[]{"guangguang", "guangguang_asyncpublish"};
    }

    public a(Context context) {
        this.c = context;
        this.d = new DraftMediaHelper(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0223 A[Catch: Throwable -> 0x0292, TryCatch #4 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0027, B:33:0x011c, B:35:0x0122, B:37:0x0128, B:39:0x012e, B:55:0x01b2, B:40:0x013d, B:43:0x0165, B:74:0x02b5, B:76:0x02bd, B:11:0x002f, B:13:0x0039, B:15:0x0047, B:17:0x0062, B:19:0x007b, B:21:0x0081, B:22:0x009e, B:24:0x00a4, B:25:0x00b0, B:27:0x00c8, B:29:0x00ce, B:56:0x01d1, B:59:0x01ec, B:61:0x01f2, B:62:0x021d, B:64:0x0223, B:66:0x025b, B:68:0x0264, B:70:0x026a), top: B:88:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bd A[Catch: all -> 0x02db, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0007, B:6:0x0011, B:9:0x0027, B:33:0x011c, B:35:0x0122, B:37:0x0128, B:39:0x012e, B:55:0x01b2, B:40:0x013d, B:43:0x0165, B:74:0x02b5, B:76:0x02bd, B:11:0x002f, B:13:0x0039, B:15:0x0047, B:17:0x0062, B:19:0x007b, B:21:0x0081, B:22:0x009e, B:24:0x00a4, B:25:0x00b0, B:27:0x00c8, B:29:0x00ce, B:56:0x01d1, B:59:0x01ec, B:61:0x01f2, B:62:0x021d, B:64:0x0223, B:66:0x025b, B:68:0x0264, B:70:0x026a), top: B:88:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d9 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean e(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.umipublish.draft.a.e(java.lang.String, java.lang.String):boolean");
    }

    private boolean b() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        File a2 = d.a(d.CACHE_DRAFT_PATH);
        File b = d.b(d.CACHE_DRAFT_PATH);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (String str : new String[]{"umi_draft.db", "umi_draft.db-shm", "umi_draft.db-wal"}) {
            String str2 = a2 + File.separator + str;
            String str3 = b + File.separator + str;
            String str4 = b + File.separator + "temp_" + str;
            if (!(k.a(str2, str4) && k.a(new File(str2), new File(str4)) && new File(str4).renameTo(new File(str3)))) {
                return false;
            }
        }
        u.d("DbDraftStore", "move db to internal store. cost: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        File a2 = d.a(d.CACHE_DRAFT_PATH);
        k.c(a2 + File.separator + "umi_draft.db");
        k.c(a2 + File.separator + "umi_draft.db-shm");
        k.c(a2 + File.separator + "umi_draft.db-wal");
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        File b = d.b(d.CACHE_DRAFT_PATH);
        if (k.a(b + File.separator + "umi_draft.db")) {
            if (k.a(b + File.separator + "umi_draft.db-shm")) {
                if (k.a(b + File.separator + "umi_draft.db-wal")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        File a2 = d.a(d.CACHE_DRAFT_PATH);
        if (k.a(a2 + File.separator + "umi_draft.db")) {
            if (k.a(a2 + File.separator + "umi_draft.db-shm")) {
                if (k.a(a2 + File.separator + "umi_draft.db-wal")) {
                    return true;
                }
            }
        }
        return false;
    }

    private String a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16fb04d8", new Object[]{this, str, str2, new Long(j)});
        }
        return str + "_" + str2 + "_" + j;
    }

    private DraftModel a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("59107be2", new Object[]{this, bArr});
        }
        DraftModel parseFromJsonString = DraftModel.parseFromJsonString(new String(bArr));
        return a(parseFromJsonString) ? this.d.b(parseFromJsonString) : parseFromJsonString;
    }

    private boolean a(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da839f87", new Object[]{this, draftModel})).booleanValue() : draftModel != null && draftModel.meta != null && !TextUtils.equals(draftModel.meta.mode, "lite") && !TextUtils.equals(draftModel.meta.mode, "quick");
    }

    private byte[] b(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("2f67df59", new Object[]{this, draftModel}) : draftModel.toString().getBytes();
    }

    private synchronized Collection<DraftModel> a(PreparedStatement preparedStatement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("78d41119", new Object[]{this, preparedStatement});
        } else if (preparedStatement == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            UmiPublishMonitor.a("DbDraftStore", "queryAndConvert start.");
            ResultSet b = preparedStatement.b();
            UmiPublishMonitor.a("DbDraftStore", "queryAndConvert end.");
            if (b != null) {
                while (b.b()) {
                    arrayList.add(a(b.d(3)));
                }
            }
            return arrayList;
        }
    }

    private String a(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2afc0da7", new Object[]{this, collection});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append("'");
            sb.append(str);
            sb.append("'");
            sb.append(",");
        }
        if (collection.size() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public synchronized int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue();
        }
        if (e(str, str2)) {
            PreparedStatement a2 = this.b.get(str).a(String.format("select count(1) from %s_%s", str, str2));
            if (a2 == null) {
                return 0;
            }
            UmiPublishMonitor.a("DbDraftStore", "getDraftCount start.");
            ResultSet b = a2.b();
            UmiPublishMonitor.a("DbDraftStore", "getDraftCount end.");
            if (b != null && b.b()) {
                int b2 = b.b(0);
                u.a(b.TAG, "query draft count: " + b2);
                return b2;
            }
        }
        return 0;
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized c.a a(String str, String str2, DraftModel draftModel) {
        PreparedStatement a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("98cce354", new Object[]{this, str, str2, draftModel});
        }
        if (e(str, str2)) {
            boolean isEmpty = TextUtils.isEmpty(draftModel.draftId);
            int a3 = a(str, str2);
            if (isEmpty && a3 >= tek.a(str)) {
                return new c.a("103", c.a.ERROR_MSG_DRAFT_LIMIT);
            }
            draftModel.modificationTimestamp = System.currentTimeMillis();
            if (isEmpty) {
                draftModel.creationTimestamp = draftModel.modificationTimestamp;
                draftModel.draftId = a(str, str2, draftModel.creationTimestamp);
                if (draftModel.meta == null) {
                    draftModel.meta = new DraftModel.Meta();
                }
                draftModel.meta.draftId = draftModel.draftId;
                this.d.a(draftModel, (DraftModel) null);
                a2 = this.b.get(str).a(String.format(Locale.getDefault(), "insert into %s_%s(draftId, cTime, mTime, content) values('%s', %d, %d, ?)", str, str2, draftModel.draftId, Long.valueOf(draftModel.creationTimestamp), Long.valueOf(draftModel.modificationTimestamp)));
                if (a2 != null) {
                    a2.a(1, b(draftModel));
                }
            } else {
                a2 = this.b.get(str).a(String.format(Locale.getDefault(), "update %s_%s set mTime=%d, content = ? where draftId = ?", str, str2, Long.valueOf(draftModel.modificationTimestamp)));
                if (a2 != null) {
                    this.d.a(draftModel, a(str, str2, draftModel.draftId));
                    a2.a(1, b(draftModel));
                    a2.a(2, draftModel.draftId);
                }
            }
            UmiPublishMonitor.a("DbDraftStore", "save draft start.");
            if (a2 != null && a2.a() != null) {
                UmiPublishMonitor.a("DbDraftStore", "save draft success: isNew = " + isEmpty + ", biz = " + str + ", userId = " + str2 + ", draftModel = " + draftModel.toString());
                u.a(b.TAG, "save success: isNew = " + isEmpty + ", biz = " + str + ", userId = " + str2 + ", draftModel = " + draftModel.toString());
                return new c.a(draftModel, a3 + 1);
            }
        }
        return new c.a("104", c.a.ERROR_MSG_DRAFT_SAVE_FAILED);
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized Collection<DraftModel> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("6341a46a", new Object[]{this, str, str2});
        } else if (!e(str, str2)) {
            return null;
        } else {
            Collection<DraftModel> a2 = a(this.b.get(str).a(String.format("select * from %s_%s order by mTime desc", str, str2)));
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("readAll success:  biz = ");
            sb.append(str);
            sb.append(", userId = ");
            sb.append(str2);
            sb.append(", result = ");
            sb.append(a2 == null ? "null" : Arrays.toString(a2.toArray()));
            objArr[0] = sb.toString();
            u.a(b.TAG, objArr);
            return a2;
        }
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized DraftModel c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("d7dbd4b3", new Object[]{this, str, str2});
        }
        if (e(str, str2)) {
            Collection<DraftModel> a2 = a(this.b.get(str).a(String.format("select * from %s_%s order by mTime desc limit 1", str, str2)));
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("readLastOne success:  biz = ");
            sb.append(str);
            sb.append(", userId = ");
            sb.append(str2);
            sb.append(", result = ");
            sb.append(a2 == null ? "null" : Arrays.toString(a2.toArray()));
            objArr[0] = sb.toString();
            u.a(b.TAG, objArr);
            if (a2 != null && a2.iterator().hasNext()) {
                return a2.iterator().next();
            }
        }
        return null;
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized DraftModel a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("deeb96eb", new Object[]{this, str, str2, str3});
        }
        DraftModel draftModel = null;
        if (!e(str, str2)) {
            return null;
        }
        PreparedStatement a2 = this.b.get(str).a(String.format("select * from %s_%s where draftId = ?", str, str2));
        if (a2 == null) {
            return null;
        }
        a2.a(1, str3);
        Collection<DraftModel> a3 = a(a2);
        if (a3 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a3);
        if (!arrayList.isEmpty()) {
            draftModel = (DraftModel) arrayList.get(0);
        }
        if (draftModel != null) {
            u.a(b.TAG, "read success:  biz = " + str + ", userId = " + str2 + ", result = " + draftModel.toString());
        }
        return draftModel;
    }

    public synchronized Collection<DraftModel> a(String str, String str2, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("401cf4ba", new Object[]{this, str, str2, collection});
        } else if (e(str, str2)) {
            PreparedStatement a2 = this.b.get(str).a(String.format("select * from %s_%s where draftId in (%s)", str, str2, a(collection)));
            if (a2 == null) {
                UmiPublishMonitor.a("DbDraftStore", "queryStatement is empty");
                return null;
            }
            Collection<DraftModel> a3 = a(a2);
            u.a(b.TAG, "readAll success:  biz = " + str + ", userId = " + str2 + ", result = " + Arrays.toString(a3.toArray()));
            return a3;
        } else {
            UmiPublishMonitor.a("DbDraftStore", "ensureTable failed.");
            return null;
        }
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized c.a b(String str, String str2, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("bab052b", new Object[]{this, str, str2, collection});
        } else if (e(str, str2)) {
            Collection<DraftModel> a2 = a(str, str2, collection);
            if (a2 != null && !a2.isEmpty()) {
                return c(str, str2, a2);
            }
            UmiPublishMonitor.a("DbDraftStore", "delete draft, but draft is empty, biz:" + str + ", userId:" + str2);
            return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
        } else {
            UmiPublishMonitor.a("DbDraftStore", "ensureTable error, biz:" + str + ", userId:" + str2);
            return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
        }
    }

    private synchronized c.a c(String str, String str2, Collection<DraftModel> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("33f1456c", new Object[]{this, str, str2, collection});
        }
        ArrayList arrayList = new ArrayList();
        for (DraftModel draftModel : collection) {
            arrayList.add(draftModel.draftId);
        }
        CallableStatement b = this.b.get(str).b(String.format("delete from %s_%s where draftId in (%s)", str, str2, a(arrayList)));
        if (b == null) {
            UmiPublishMonitor.a("DbDraftStore", "delete draft, but statement is empty, biz:" + str + ", userId:" + str2);
            return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
        }
        UmiPublishMonitor.a("DbDraftStore", "deleteDrafts start.");
        Result a2 = b.a();
        UmiPublishMonitor.a("DbDraftStore", "deleteDrafts end");
        if (a2 != null) {
            u.a(b.TAG, "delete success:  biz = " + str + ", userId = " + str2 + ", deleted = " + Arrays.toString(arrayList.toArray()));
            if (this.d.a(collection)) {
                return new c.a(true);
            }
            UmiPublishMonitor.a("DbDraftStore", "delete draft, deleteMediasOfDraft failed, biz:" + str + ", userId:" + str2);
        } else {
            UmiPublishMonitor.a("DbDraftStore", "delete draft, result is empty, biz:" + str + ", userId:" + str2);
        }
        return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized c.a d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("6a06353c", new Object[]{this, str, str2});
        }
        if (e(str, str2)) {
            Collection<DraftModel> b = b(str, str2);
            CallableStatement b2 = this.b.get(str).b(String.format("delete from %s_%s", str, str2));
            if (b2 == null) {
                return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
            }
            UmiPublishMonitor.a("DbDraftStore", "deleteAll start.");
            Result a2 = b2.a();
            UmiPublishMonitor.a("DbDraftStore", "deleteAll start.");
            if (a2 != null) {
                u.a(b.TAG, "deleteAll success:  biz = " + str + ", userId = " + str2);
                if (this.d.a(b)) {
                    return new c.a(true);
                }
            }
        }
        return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    @Override // com.taobao.umipublish.draft.c
    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (!this.b.isEmpty()) {
                for (Database database : this.b.values()) {
                    database.a();
                }
            }
            this.b.clear();
        } catch (Throwable unused) {
        }
    }
}
