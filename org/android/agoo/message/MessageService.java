package org.android.agoo.message;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.build.C1238p;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.c;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.android.agoo.common.MsgDO;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class MessageService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACCS_SPACE_NAME = "accs_message";
    private static final String ADD_MESSAGE = "accs.add_agoo_message";
    private static final String BODY_CODE = "body_code";
    private static final String CREATE_TIME = "create_time";
    private static final String DATABASE_NAME = "message_accs_db";
    private static final int DATABASE_VERSION = 3;
    private static final String DEAL_MESSAGE = "accs.dealMessage";
    private static final String ID = "id";
    private static final String MESSAGE = "message";
    private static final String MESSAGE_TARGET_TIME = "target_time";
    private static final String MESSAGE_TARGET_TIME_INTERVAL = "interval";
    public static final String MSG_ACCS_NOTIFY_CLICK = "8";
    public static final String MSG_ACCS_NOTIFY_DISMISS = "9";
    public static final String MSG_ACCS_READY_REPORT = "4";
    public static final String MSG_DB_COMPLETE = "100";
    public static final String MSG_DB_NOTIFY_CLICK = "2";
    public static final String MSG_DB_NOTIFY_DISMISS = "3";
    public static final String MSG_DB_NOTIFY_REACHED = "1";
    public static final String MSG_DB_READY_REPORT = "0";
    private static final int NOTICE = 1;
    private static final String NOTIFY = "notify";
    private static final String REPORT = "report";
    private static final String SPACE_NAME = "message";
    private static final String STATE = "state";
    private static final String TAG = "MessageService";
    private static final String TYPE = "type";
    private static Context mContext;
    private static Map<String, Integer> messageStores;
    private volatile SQLiteOpenHelper sqliteOpenHelper = null;

    static {
        kge.a(-1347271116);
        mContext = null;
        messageStores = null;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        messageStores = new HashMap();
        mContext = context;
        this.sqliteOpenHelper = new MessageDBHelper(context);
    }

    /* loaded from: classes.dex */
    public static class MessageDBHelper extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1167163459);
        }

        private String getCreateBodyCodeIndexSQL() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("570cbb9c", new Object[]{this}) : "CREATE INDEX body_code_index ON message(body_code)";
        }

        private String getCreateIdIndexSQL() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ff28b30", new Object[]{this}) : "CREATE INDEX id_index ON message(id)";
        }

        public static /* synthetic */ Object ipc$super(MessageDBHelper messageDBHelper, String str, Object... objArr) {
            if (str.hashCode() == 305025623) {
                return super.getWritableDatabase();
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public MessageDBHelper(Context context) {
            super(context, MessageService.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SQLiteDatabase) ipChange.ipc$dispatch("122e5257", new Object[]{this});
            }
            if (c.a(super.getWritableDatabase().getPath(), (int) C1238p.b)) {
                return super.getWritableDatabase();
            }
            return null;
        }

        private String createmMessageTableSQL() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b8e47a3", new Object[]{this});
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table accs_message");
            stringBuffer.append(riy.BRACKET_START_STR);
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state text,");
            stringBuffer.append("message text,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        private String getCreateTableSQL() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("395a6107", new Object[]{this});
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("create table message");
            stringBuffer.append(riy.BRACKET_START_STR);
            stringBuffer.append("id text UNIQUE not null,");
            stringBuffer.append("state integer,");
            stringBuffer.append("body_code integer,");
            stringBuffer.append("report long,");
            stringBuffer.append("target_time long,");
            stringBuffer.append("interval integer,");
            stringBuffer.append("type text,");
            stringBuffer.append("message text,");
            stringBuffer.append("notify integer,");
            stringBuffer.append("create_time date");
            stringBuffer.append(");");
            return stringBuffer.toString();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            } else if (sQLiteDatabase == null) {
            } else {
                try {
                    sQLiteDatabase.execSQL(getCreateTableSQL());
                    sQLiteDatabase.execSQL(getCreateIdIndexSQL());
                    sQLiteDatabase.execSQL(getCreateBodyCodeIndexSQL());
                    sQLiteDatabase.execSQL(createmMessageTableSQL());
                } catch (Throwable th) {
                    ALog.e(MessageService.TAG, "messagedbhelper create", th, new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
                } catch (Throwable th) {
                    try {
                        ALog.e(MessageService.TAG, "messagedbhelper create", th, new Object[0]);
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(createmMessageTableSQL());
                            return;
                        } catch (Throwable th2) {
                            ALog.e(MessageService.TAG, "MessageService onUpgrade is error", th2, new Object[0]);
                            return;
                        }
                    } catch (Throwable th3) {
                        try {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                            sQLiteDatabase.execSQL(createmMessageTableSQL());
                        } catch (Throwable th4) {
                            ALog.e(MessageService.TAG, "MessageService onUpgrade is error", th4, new Object[0]);
                        }
                        throw th3;
                    }
                }
            }
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accs_message");
                sQLiteDatabase.execSQL(createmMessageTableSQL());
            } catch (Throwable th5) {
                ALog.e(MessageService.TAG, "MessageService onUpgrade is error", th5, new Object[0]);
            }
        }
    }

    public void updateAccsMessage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18fb527", new Object[]{this, str, str2});
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.i(TAG, "updateAccsMessage sqlite3--->[" + str + ",state=" + str2 + riy.ARRAY_END_STR, new Object[0]);
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                SQLiteDatabase writableDatabase = this.sqliteOpenHelper.getWritableDatabase();
                if (writableDatabase == null) {
                    if (writableDatabase == null) {
                        return;
                    }
                    writableDatabase.close();
                    return;
                }
                if (StringUtils.equals(str2, "1")) {
                    writableDatabase.execSQL("UPDATE accs_message set state = ? where id = ? and state = ?", new Object[]{str2, str, "0"});
                } else {
                    writableDatabase.execSQL("UPDATE accs_message set state = ? where id = ?", new Object[]{str2, str});
                }
                if (writableDatabase == null) {
                    return;
                }
                writableDatabase.close();
            }
        } catch (Throwable th) {
            try {
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e(TAG, "updateAccsMessage error,e--->[" + th + riy.ARRAY_END_STR + ",ex=" + th.getStackTrace().toString(), new Object[0]);
                }
            } finally {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
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
    public void addAccsMessage(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.addAccsMessage(java.lang.String, java.lang.String, java.lang.String):void");
    }

    private String getStackMsg(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38cdb21", new Object[]{this, th});
        }
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && stackTrace.length > 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public void addMessage(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38207498", new Object[]{this, str, str2, str3, new Integer(i)});
        } else {
            addMessage(str, str2, str3, 1, -1L, -1, i);
        }
    }

    private void addMessage(String str, String str2, String str3, int i, long j, int i2, int i3) {
        SQLiteDatabase sQLiteDatabase;
        int hashCode;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aac5a8c", new Object[]{this, str, str2, str3, new Integer(i), new Long(j), new Integer(i2), new Integer(i3)});
            return;
        }
        ALog.d(TAG, "add sqlite3--->[" + str + riy.ARRAY_END_STR, new Object[0]);
        try {
            String str5 = "";
            if (StringUtils.isEmpty(str2)) {
                hashCode = -1;
                str4 = str5;
            } else {
                hashCode = str2.hashCode();
                str4 = str2;
            }
            if (!StringUtils.isEmpty(str3)) {
                str5 = str3;
            }
            if (!messageStores.containsKey(str)) {
                messageStores.put(str, Integer.valueOf(hashCode));
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i(TAG, "addMessage,messageId=" + str + ",messageStores＝" + messageStores.toString(), new Object[0]);
                }
            }
            sQLiteDatabase = this.sqliteOpenHelper.getWritableDatabase();
            if (sQLiteDatabase == null) {
                if (sQLiteDatabase == null) {
                    return;
                }
                try {
                    sQLiteDatabase.close();
                    return;
                } catch (Throwable th) {
                    if (!ALog.isPrintLog(ALog.Level.E)) {
                        return;
                    }
                    ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th + riy.ARRAY_END_STR, new Object[0]);
                    return;
                }
            }
            try {
                sQLiteDatabase.execSQL("INSERT INTO message VALUES(?,?,?,?,?,?,?,?,?,date('now'))", new Object[]{str, Integer.valueOf(i), Integer.valueOf(hashCode), 0, Long.valueOf(j), Integer.valueOf(i2), str5, str4, Integer.valueOf(i3)});
                if (sQLiteDatabase == null) {
                    return;
                }
                try {
                    sQLiteDatabase.close();
                } catch (Throwable th2) {
                    if (!ALog.isPrintLog(ALog.Level.E)) {
                        return;
                    }
                    ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th2 + riy.ARRAY_END_STR, new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.e(TAG, "addMessage error,e--->[" + th + riy.ARRAY_END_STR, new Object[0]);
                    }
                    if (sQLiteDatabase == null) {
                        return;
                    }
                    try {
                        sQLiteDatabase.close();
                    } catch (Throwable th4) {
                        if (!ALog.isPrintLog(ALog.Level.E)) {
                            return;
                        }
                        ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th4 + riy.ARRAY_END_STR, new Object[0]);
                    }
                } catch (Throwable th5) {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.close();
                        } catch (Throwable th6) {
                            if (ALog.isPrintLog(ALog.Level.E)) {
                                ALog.e(TAG, "addMessage,db.close(),error,e--->[" + th6 + riy.ARRAY_END_STR, new Object[0]);
                            }
                        }
                    }
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            sQLiteDatabase = null;
        }
    }

    public void deleteCacheMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e6cff7", new Object[]{this});
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase writableDatabase = this.sqliteOpenHelper.getWritableDatabase();
            if (writableDatabase == null) {
                if (writableDatabase == null) {
                    return;
                }
                try {
                    writableDatabase.close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            writableDatabase.execSQL("delete from message where create_time< date('now','-7 day') and state=1");
            writableDatabase.execSQL("delete from accs_message where create_time< date('now','-1 day') ");
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.close();
            } catch (Throwable unused2) {
            }
        } catch (Throwable th) {
            try {
                ALog.e(TAG, "deleteCacheMessage sql Throwable", th, new Object[0]);
                if (0 == 0) {
                    return;
                }
                try {
                    sQLiteDatabase.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th2;
            }
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
    public java.util.ArrayList<org.android.agoo.common.MsgDO> getUnReportMsg() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.getUnReportMsg():java.util.ArrayList");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public boolean hasMessageDuplicate(java.lang.String r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = org.android.agoo.message.MessageService.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "8c284f93"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = org.android.agoo.message.MessageService.messageStores     // Catch: java.lang.Throwable -> L8d
            boolean r1 = r1.containsKey(r8)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L48
            com.taobao.accs.utl.ALog$Level r1 = com.taobao.accs.utl.ALog.Level.E     // Catch: java.lang.Throwable -> L8d
            boolean r1 = com.taobao.accs.utl.ALog.isPrintLog(r1)     // Catch: java.lang.Throwable -> L8d
            if (r1 == 0) goto L46
            java.lang.String r1 = "MessageService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r4.<init>()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "hasMessageDuplicate,msgid="
            r4.append(r5)     // Catch: java.lang.Throwable -> L8d
            r4.append(r8)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L8d
            com.taobao.accs.utl.ALog.e(r1, r4, r5)     // Catch: java.lang.Throwable -> L8d
        L46:
            r1 = 1
            goto L49
        L48:
            r1 = 0
        L49:
            android.database.sqlite.SQLiteOpenHelper r4 = r7.sqliteOpenHelper     // Catch: java.lang.Throwable -> L7e
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L57
            if (r4 == 0) goto L56
            r4.close()     // Catch: java.lang.Throwable -> L56
        L56:
            return r1
        L57:
            java.lang.String r5 = "select count(1) from message where id = ?"
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L8f
            r6[r3] = r8     // Catch: java.lang.Throwable -> L8f
            android.database.Cursor r0 = r4.rawQuery(r5, r6)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L71
            boolean r8 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L71
            int r8 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L8f
            if (r8 <= 0) goto L71
            r1 = 1
        L71:
            if (r0 == 0) goto L76
            r0.close()     // Catch: java.lang.Throwable -> L97
        L76:
            if (r4 == 0) goto L97
        L78:
            r4.close()     // Catch: java.lang.Throwable -> L97
            goto L97
        L7c:
            r8 = move-exception
            goto L82
        L7e:
            r4 = r0
            goto L8f
        L80:
            r8 = move-exception
            r4 = r0
        L82:
            if (r0 == 0) goto L87
            r0.close()     // Catch: java.lang.Throwable -> L8c
        L87:
            if (r4 == 0) goto L8c
            r4.close()     // Catch: java.lang.Throwable -> L8c
        L8c:
            throw r8
        L8d:
            r4 = r0
            r1 = 0
        L8f:
            if (r0 == 0) goto L94
            r0.close()     // Catch: java.lang.Throwable -> L97
        L94:
            if (r4 == 0) goto L97
            goto L78
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.hasMessageDuplicate(java.lang.String):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public boolean hasMessageDuplicate(java.lang.String r9, int r10) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = org.android.agoo.message.MessageService.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r8
            r1[r3] = r9
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r10)
            r1[r2] = r9
            java.lang.String r9 = "f8e21558"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L25:
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Integer> r1 = org.android.agoo.message.MessageService.messageStores     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = r1.containsKey(r9)     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L5c
            java.util.Map<java.lang.String, java.lang.Integer> r1 = org.android.agoo.message.MessageService.messageStores     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = r1.containsValue(r5)     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L5c
            com.taobao.accs.utl.ALog$Level r1 = com.taobao.accs.utl.ALog.Level.I     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = com.taobao.accs.utl.ALog.isPrintLog(r1)     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L5a
            java.lang.String r1 = "MessageService"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r5.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = "addMessage,messageStores hasMessageDuplicate,msgid="
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb4
            r5.append(r9)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lb4
            com.taobao.accs.utl.ALog.i(r1, r5, r6)     // Catch: java.lang.Throwable -> Lb4
        L5a:
            r1 = 1
            goto L5d
        L5c:
            r1 = 0
        L5d:
            android.database.sqlite.SQLiteOpenHelper r5 = r8.sqliteOpenHelper     // Catch: java.lang.Throwable -> La5
            android.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> La5
            if (r5 != 0) goto L6b
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r1
        L6b:
            java.lang.String r6 = "select count(1) from message where id = ? and body_code=? create_time< date('now','-1 day')"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lb6
            r2[r4] = r9     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r9.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = ""
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb6
            r9.append(r10)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lb6
            r2[r3] = r9     // Catch: java.lang.Throwable -> Lb6
            android.database.Cursor r0 = r5.rawQuery(r6, r2)     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L98
            boolean r9 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lb6
            if (r9 == 0) goto L98
            int r9 = r0.getInt(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r9 <= 0) goto L98
            r1 = 1
        L98:
            if (r0 == 0) goto L9d
            r0.close()     // Catch: java.lang.Throwable -> Lbe
        L9d:
            if (r5 == 0) goto Lbe
        L9f:
            r5.close()     // Catch: java.lang.Throwable -> Lbe
            goto Lbe
        La3:
            r9 = move-exception
            goto La9
        La5:
            r5 = r0
            goto Lb6
        La7:
            r9 = move-exception
            r5 = r0
        La9:
            if (r0 == 0) goto Lae
            r0.close()     // Catch: java.lang.Throwable -> Lb3
        Lae:
            if (r5 == 0) goto Lb3
            r5.close()     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            throw r9
        Lb4:
            r5 = r0
            r1 = 0
        Lb6:
            if (r0 == 0) goto Lbb
            r0.close()     // Catch: java.lang.Throwable -> Lbe
        Lbb:
            if (r5 == 0) goto Lbe
            goto L9f
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.hasMessageDuplicate(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0159 A[Catch: Throwable -> 0x0192, TryCatch #0 {Throwable -> 0x0192, blocks: (B:13:0x0063, B:15:0x0084, B:17:0x008a, B:19:0x00b2, B:22:0x00bc, B:23:0x00bf, B:25:0x00d3, B:27:0x00dd, B:29:0x00e3, B:32:0x00ee, B:33:0x00f3, B:35:0x00fb, B:37:0x0121, B:38:0x0128, B:40:0x0143, B:42:0x014b, B:48:0x0159, B:51:0x0179, B:53:0x0181), top: B:62:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.android.agoo.common.MsgDO createMsg(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.agoo.message.MessageService.createMsg(java.lang.String, java.lang.String):org.android.agoo.common.MsgDO");
    }

    public static final boolean checkPackage(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("948c6ad1", new Object[]{context, str})).booleanValue() : context.getPackageManager().getApplicationInfo(str, 0) != null;
    }

    private static Bundle getFlag(long j, MsgDO msgDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("82cc92c4", new Object[]{new Long(j), msgDO});
        }
        Bundle bundle = new Bundle();
        try {
            char[] charArray = Long.toBinaryString(j).toCharArray();
            if (charArray != null && 8 <= charArray.length) {
                if (8 <= charArray.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(Integer.parseInt("" + charArray[1] + charArray[2] + charArray[3] + charArray[4], 2));
                    bundle.putString(AgooConstants.MESSAGE_ENCRYPTED, sb.toString());
                    if (charArray[6] == '1') {
                        bundle.putString("report", "1");
                        msgDO.reportStr = "1";
                    }
                    if (charArray[7] == '1') {
                        bundle.putString("notify", "1");
                    }
                }
                if (9 <= charArray.length && charArray[8] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_HAS_TEST, "1");
                }
                if (10 <= charArray.length && charArray[9] == '1') {
                    bundle.putString(AgooConstants.MESSAGE_DUPLICATE, "1");
                }
                if (11 <= charArray.length && charArray[10] == '1') {
                    bundle.putInt(AgooConstants.MESSAGE_POPUP, 1);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
