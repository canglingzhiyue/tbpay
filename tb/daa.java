package tb;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.nirvana.tools.logger.model.b;

/* loaded from: classes4.dex */
public class daa extends dab<b> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public daa(android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            tb.dad r8 = new tb.dad
            if (r12 != 0) goto L7
            java.lang.String r12 = "monitor.db"
            goto L18
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r12 = "_monitor.db"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
        L18:
            r2 = r12
            r3 = 0
            r4 = 3
            java.lang.String r5 = tb.dac.a(r11)
            java.lang.String r6 = tb.dac.e(r11)
            java.lang.String r7 = tb.dac.b(r11)
            r0 = r8
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.<init>(r11, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.daa.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tb.dab
    public ContentValues a(b bVar) {
        if (bVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("strategy", Integer.valueOf(bVar.g()));
        contentValues.put("timestamp", Long.valueOf(bVar.c()));
        contentValues.put("content", bVar.f());
        contentValues.put(RemoteMessageConst.URGENCY, Integer.valueOf(bVar.a()));
        contentValues.put("upload_flag", Integer.valueOf(bVar.d()));
        contentValues.put("upload_count", Integer.valueOf(bVar.e()));
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tb.dab
    /* renamed from: a */
    public b b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        b bVar = new b();
        bVar.a(cursor.getLong(cursor.getColumnIndex("_id")));
        bVar.d(cursor.getInt(cursor.getColumnIndex("strategy")));
        bVar.a(cursor.getString(cursor.getColumnIndex("content")));
        bVar.b(cursor.getInt(cursor.getColumnIndex("upload_flag")));
        bVar.c(cursor.getInt(cursor.getColumnIndex("upload_count")));
        bVar.b(cursor.getLong(cursor.getColumnIndex("timestamp")));
        bVar.a(cursor.getInt(cursor.getColumnIndex(RemoteMessageConst.URGENCY)));
        return bVar;
    }
}
