package com.alipay.android.msp.framework.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.android.msp.core.model.MQPBehaviorActionSeqModel;
import com.alipay.android.msp.core.model.MQPBehaviorExperienceModel;
import com.alipay.android.msp.core.model.MQPBehaviorRecordModel;
import com.alipay.android.msp.core.model.MQPBizInfoModel;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class MspDbManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile MspDbManager d = null;
    private static boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f4690a;
    private SQLiteDatabase b;
    private MspDBHelper c;
    private boolean f;
    private boolean g;
    private boolean h;

    /* loaded from: classes3.dex */
    public interface MspDBQueryActionCallback {
        void onDataLoaded(List<MQPBehaviorActionSeqModel> list);
    }

    /* loaded from: classes3.dex */
    public interface MspDBQueryBehaviorExperienceCallback {
        void onDataLoaded(List<MQPBehaviorExperienceModel> list);
    }

    /* loaded from: classes3.dex */
    public interface MspDBQueryBizInfoCallback {
        void onDataLoaded(List<MQPBizInfoModel> list);
    }

    /* loaded from: classes3.dex */
    public interface MspDBQueryRecordCallback {
        void onDataLoaded(List<MQPBehaviorRecordModel> list);
    }

    /* loaded from: classes3.dex */
    public interface MspDBSaveCallback {
        void onDataSaveError(Throwable th);

        void onDataSaveSuccess();
    }

    public static MspDbManager getDbManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspDbManager) ipChange.ipc$dispatch("22213cbc", new Object[0]);
        }
        if (d == null) {
            synchronized (MspDbManager.class) {
                if (d == null) {
                    d = new MspDbManager();
                }
            }
        }
        return d;
    }

    private MspDbManager() {
    }

    public synchronized void init(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b35b22e3", new Object[]{this, context, new Boolean(z)});
            return;
        }
        setEnableBehaviorActionUpload(DrmManager.getInstance(context).isGray(DrmKey.enable_behavior_action_upload, false, context));
        setEnableBehaviorRecordUpload(DrmManager.getInstance(context).isGray(DrmKey.enable_behavior_record_upload, false, context));
        if (DrmManager.getInstance(context).isGray(DrmKey.enable_behavior_manager, false, context) || a(context, z)) {
            z2 = true;
        }
        setEnableBehaviorManager(z2);
        if (isEnableBehaviorManager() && !e) {
            this.c = new MspDBHelper(context.getApplicationContext());
            this.f4690a = this.c.getReadableDatabase();
            this.b = this.c.getWritableDatabase();
            e = true;
        }
    }

    private static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        try {
            if (DrmManager.getInstance(context).isGray(DrmKey.gray_behavior_manager_force_open, false, context) && z) {
                LogUtil.record(8, "needForceEnableBehaviorManager", "true");
                return true;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return false;
    }

    @Deprecated
    public boolean isEnableBehaviorActionUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2984afc1", new Object[]{this})).booleanValue() : this.f;
    }

    @Deprecated
    public void setEnableBehaviorActionUpload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28647f", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Deprecated
    public boolean isEnableBehaviorRecordUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b568f81c", new Object[]{this})).booleanValue() : this.g;
    }

    @Deprecated
    public void setEnableBehaviorRecordUpload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcd2784", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public boolean isEnableBehaviorManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad656f79", new Object[]{this})).booleanValue() : this.h;
    }

    public void setEnableBehaviorManager(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439cb37", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public synchronized void save(String str, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3658f2ce", new Object[]{this, str, mspDBSaveCallback});
            return;
        }
        if (this.b != null) {
            this.b.beginTransaction();
            this.b.execSQL(str);
            this.b.setTransactionSuccessful();
        }
        if (mspDBSaveCallback != null) {
            mspDBSaveCallback.onDataSaveSuccess();
        }
        if (this.b != null) {
            this.b.endTransaction();
        }
    }

    private synchronized void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase == null) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            LogUtil.record(8, "deleteExpiredTableData", "db is closed");
            return;
        }
        sQLiteDatabase.beginTransaction();
        Date date = new Date();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar.add(5, 0 - i);
        String format = ThreadSafeDateFormat.format(gregorianCalendar.getTime(), "yyyy-MM-dd HH:mm:ss:SSS");
        int delete = sQLiteDatabase.delete(str, str2 + "<?", new String[]{format});
        LogUtil.record(2, "deleteExpiredTableData", "delete " + str + " " + delete + " row, when valid time is " + format);
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }

    public synchronized void saveBiz(Map<String, String> map, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0c4b88", new Object[]{this, map, mspDBSaveCallback});
            return;
        }
        if (map != null && map.containsKey("trace")) {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                return;
            }
            if (!sQLiteDatabase.isOpen()) {
                LogUtil.record(8, "saveBiz", "db is closed");
                return;
            }
            try {
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                for (String str : map.keySet()) {
                    contentValues.put(str, map.get(str));
                }
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                String str2 = map.get("trace");
                if (!TextUtils.isEmpty(str2)) {
                    str2 = str2.split("_")[0];
                }
                sb.append(str2);
                sb.append(riy.MOD);
                strArr[0] = sb.toString();
                int update = sQLiteDatabase.update(MspDBHelper.BizEntry.TABLE_NAME, contentValues, "trace LIKE ?", strArr);
                if (update == 0) {
                    sQLiteDatabase.insert(MspDBHelper.BizEntry.TABLE_NAME, null, contentValues);
                } else if (update > 1) {
                    LogUtil.record(8, "saveBiz", "multiTrace ".concat(String.valueOf(update)));
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (mspDBSaveCallback != null) {
                    mspDBSaveCallback.onDataSaveSuccess();
                }
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
                if (mspDBSaveCallback != null) {
                    mspDBSaveCallback.onDataSaveError(e2);
                }
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public synchronized void saveRecord(MQPBehaviorRecordModel mQPBehaviorRecordModel, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be66f90", new Object[]{this, mQPBehaviorRecordModel, mspDBSaveCallback});
        } else if (mQPBehaviorRecordModel == null) {
        } else {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                return;
            }
            if (!sQLiteDatabase.isOpen()) {
                LogUtil.record(8, "saveRecord", "db is closed");
                return;
            }
            try {
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("trace", mQPBehaviorRecordModel.getTrace());
                contentValues.put("uid", mQPBehaviorRecordModel.getUid());
                contentValues.put("utdid", mQPBehaviorRecordModel.getUtdid());
                contentValues.put("trade_no", mQPBehaviorRecordModel.getTrade_no());
                contentValues.put("scene_name", mQPBehaviorRecordModel.getScene_name());
                contentValues.put("features", mQPBehaviorRecordModel.getFeatures());
                contentValues.put(MspDBHelper.RecordEntry.COLUMN_NAME_RULE_ID, mQPBehaviorRecordModel.getRule_id());
                contentValues.put("result", mQPBehaviorRecordModel.getResult());
                contentValues.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, mQPBehaviorRecordModel.getVer());
                contentValues.put("time", mQPBehaviorRecordModel.getTime());
                contentValues.put("ds", mQPBehaviorRecordModel.getDs());
                contentValues.put("hh", mQPBehaviorRecordModel.getHh());
                contentValues.put("ext", mQPBehaviorRecordModel.getExt());
                sQLiteDatabase.insert(MspDBHelper.RecordEntry.TABLE_NAME, null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                if (mspDBSaveCallback != null) {
                    mspDBSaveCallback.onDataSaveSuccess();
                }
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
                if (mspDBSaveCallback != null) {
                    mspDBSaveCallback.onDataSaveError(e2);
                }
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public synchronized void saveAction(MQPBehaviorActionSeqModel mQPBehaviorActionSeqModel, MspDBSaveCallback mspDBSaveCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103b5b83", new Object[]{this, mQPBehaviorActionSeqModel, mspDBSaveCallback});
        } else if (mQPBehaviorActionSeqModel == null) {
        } else {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null) {
                return;
            }
            if (!sQLiteDatabase.isOpen()) {
                LogUtil.record(8, "saveAction", "db is closed");
                return;
            }
            try {
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("trace", mQPBehaviorActionSeqModel.getTrace());
                contentValues.put("uid", mQPBehaviorActionSeqModel.getUid());
                contentValues.put("scene_name", mQPBehaviorActionSeqModel.getScene_name());
                contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_TYPE, mQPBehaviorActionSeqModel.getAct_type());
                contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_NAME, mQPBehaviorActionSeqModel.getAct_name());
                contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_PARAMS, mQPBehaviorActionSeqModel.getAct_params());
                contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID, mQPBehaviorActionSeqModel.getPage_id());
                contentValues.put("page_name", mQPBehaviorActionSeqModel.getPage_name());
                contentValues.put(MspDBHelper.ActionEntry.COLUMN_NAME_SERVICE_STACK, mQPBehaviorActionSeqModel.getService_stack());
                contentValues.put("hh", mQPBehaviorActionSeqModel.getHh());
                contentValues.put("time", mQPBehaviorActionSeqModel.getTime());
                contentValues.put("ds", mQPBehaviorActionSeqModel.getDs());
                contentValues.put("ext", mQPBehaviorActionSeqModel.getExt());
                sQLiteDatabase.insert(MspDBHelper.ActionEntry.TABLE_NAME, null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                if (mspDBSaveCallback != null) {
                    mspDBSaveCallback.onDataSaveSuccess();
                }
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
                if (mspDBSaveCallback != null) {
                    mspDBSaveCallback.onDataSaveError(e2);
                }
                sQLiteDatabase.endTransaction();
            }
        }
    }

    public synchronized void queryActionModel(String str, MspDBQueryActionCallback mspDBQueryActionCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf81cf", new Object[]{this, str, mspDBQueryActionCallback});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = query(str);
        if (query != null && query.getCount() > 0) {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String string = query.getString(query.getColumnIndex("trace"));
                String string2 = query.getString(query.getColumnIndex("uid"));
                String string3 = query.getString(query.getColumnIndex("scene_name"));
                String string4 = query.getString(query.getColumnIndex(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_TYPE));
                String string5 = query.getString(query.getColumnIndex(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_NAME));
                String string6 = query.getString(query.getColumnIndex(MspDBHelper.ActionEntry.COLUMN_NAME_ACTION_PARAMS));
                String string7 = query.getString(query.getColumnIndex(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID));
                String string8 = query.getString(query.getColumnIndex("page_name"));
                String string9 = query.getString(query.getColumnIndex(MspDBHelper.ActionEntry.COLUMN_NAME_SERVICE_STACK));
                String string10 = query.getString(query.getColumnIndex("time"));
                String string11 = query.getString(query.getColumnIndex("hh"));
                String string12 = query.getString(query.getColumnIndex("ds"));
                String string13 = query.getString(query.getColumnIndex("ext"));
                MQPBehaviorActionSeqModel mQPBehaviorActionSeqModel = new MQPBehaviorActionSeqModel();
                mQPBehaviorActionSeqModel.setTrace(string);
                mQPBehaviorActionSeqModel.setUid(string2);
                mQPBehaviorActionSeqModel.setAct_name(string5);
                mQPBehaviorActionSeqModel.setAct_type(string4);
                mQPBehaviorActionSeqModel.setAct_params(string6);
                mQPBehaviorActionSeqModel.setScene_name(string3);
                mQPBehaviorActionSeqModel.setPage_id(string7);
                mQPBehaviorActionSeqModel.setPage_name(string8);
                mQPBehaviorActionSeqModel.setService_stack(string9);
                mQPBehaviorActionSeqModel.setHh(string11);
                mQPBehaviorActionSeqModel.setTime(string10);
                mQPBehaviorActionSeqModel.setDs(string12);
                mQPBehaviorActionSeqModel.setExt(string13);
                arrayList.add(mQPBehaviorActionSeqModel);
                query.moveToNext();
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        if (mspDBQueryActionCallback != null) {
            mspDBQueryActionCallback.onDataLoaded(arrayList);
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
    public synchronized void queryBizInfoModel(java.lang.String r29, com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryBizInfoCallback r30) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.db.MspDbManager.queryBizInfoModel(java.lang.String, com.alipay.android.msp.framework.db.MspDbManager$MspDBQueryBizInfoCallback):void");
    }

    public synchronized void queryBehaviorExperienceModel(String str, MspDBQueryBehaviorExperienceCallback mspDBQueryBehaviorExperienceCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f64598f", new Object[]{this, str, mspDBQueryBehaviorExperienceCallback});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = query(str);
        if (query != null && query.getCount() > 0) {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String string = query.getString(query.getColumnIndex("uid"));
                String string2 = query.getString(query.getColumnIndex("utdid"));
                String string3 = query.getString(query.getColumnIndex("app_name"));
                String string4 = query.getString(query.getColumnIndex("app_ver"));
                String string5 = query.getString(query.getColumnIndex("sdk_ver"));
                String string6 = query.getString(query.getColumnIndex("trade_no"));
                String string7 = query.getString(query.getColumnIndex("out_trade_no"));
                String string8 = query.getString(query.getColumnIndex("biz_type"));
                String string9 = query.getString(query.getColumnIndex("end_code"));
                String string10 = query.getString(query.getColumnIndex("ext1"));
                String string11 = query.getString(query.getColumnIndex("ext2"));
                String string12 = query.getString(query.getColumnIndex("ext3"));
                String string13 = query.getString(query.getColumnIndex("date"));
                MQPBehaviorExperienceModel mQPBehaviorExperienceModel = new MQPBehaviorExperienceModel();
                mQPBehaviorExperienceModel.setUid(string);
                mQPBehaviorExperienceModel.setUtdid(string2);
                mQPBehaviorExperienceModel.setApp_name(string3);
                mQPBehaviorExperienceModel.setApp_ver(string4);
                mQPBehaviorExperienceModel.setSdk_ver(string5);
                mQPBehaviorExperienceModel.setTrade_no(string6);
                mQPBehaviorExperienceModel.setOut_trade_no(string7);
                mQPBehaviorExperienceModel.setBiz_type(string8);
                mQPBehaviorExperienceModel.setEnd_code(string9);
                mQPBehaviorExperienceModel.setExt1(string10);
                mQPBehaviorExperienceModel.setExt2(string11);
                mQPBehaviorExperienceModel.setExt3(string12);
                mQPBehaviorExperienceModel.setDate(string13);
                arrayList.add(mQPBehaviorExperienceModel);
                query.moveToNext();
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        if (mspDBQueryBehaviorExperienceCallback != null) {
            mspDBQueryBehaviorExperienceCallback.onDataLoaded(arrayList);
        }
    }

    public synchronized void queryRecordModel(String str, MspDBQueryRecordCallback mspDBQueryRecordCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33266eaf", new Object[]{this, str, mspDBQueryRecordCallback});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = query(str);
        if (query != null && query.getCount() > 0) {
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String string = query.getString(query.getColumnIndex("trace"));
                String string2 = query.getString(query.getColumnIndex("uid"));
                String string3 = query.getString(query.getColumnIndex("trade_no"));
                String string4 = query.getString(query.getColumnIndex("utdid"));
                String string5 = query.getString(query.getColumnIndex("scene_name"));
                String string6 = query.getString(query.getColumnIndex("features"));
                String string7 = query.getString(query.getColumnIndex(MspDBHelper.RecordEntry.COLUMN_NAME_RULE_ID));
                String string8 = query.getString(query.getColumnIndex("result"));
                String string9 = query.getString(query.getColumnIndex(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION));
                String string10 = query.getString(query.getColumnIndex("time"));
                String string11 = query.getString(query.getColumnIndex("ds"));
                String string12 = query.getString(query.getColumnIndex("hh"));
                String string13 = query.getString(query.getColumnIndex("ext"));
                MQPBehaviorRecordModel mQPBehaviorRecordModel = new MQPBehaviorRecordModel();
                mQPBehaviorRecordModel.setTrace(string);
                mQPBehaviorRecordModel.setUid(string2);
                mQPBehaviorRecordModel.setTrade_no(string3);
                mQPBehaviorRecordModel.setUtdid(string4);
                mQPBehaviorRecordModel.setScene_name(string5);
                mQPBehaviorRecordModel.setFeatures(string6);
                mQPBehaviorRecordModel.setRule_id(string7);
                mQPBehaviorRecordModel.setResult(string8);
                mQPBehaviorRecordModel.setVer(string9);
                mQPBehaviorRecordModel.setTime(string10);
                mQPBehaviorRecordModel.setDs(string11);
                mQPBehaviorRecordModel.setHh(string12);
                mQPBehaviorRecordModel.setExt(string13);
                arrayList.add(mQPBehaviorRecordModel);
                query.moveToNext();
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        if (mspDBQueryRecordCallback != null) {
            mspDBQueryRecordCallback.onDataLoaded(arrayList);
        }
    }

    public Cursor query(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("cf19bae0", new Object[]{this, str});
        }
        SQLiteDatabase sQLiteDatabase = this.f4690a;
        Cursor cursor = null;
        if (sQLiteDatabase == null) {
            return null;
        }
        if (!sQLiteDatabase.isOpen()) {
            LogUtil.record(8, "query", "db is closed");
            return null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            cursor = sQLiteDatabase.rawQuery(str, null);
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return cursor;
    }

    public void closeDBHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dec964b", new Object[]{this});
        } else if (this.c == null) {
        } else {
            try {
                e = false;
                a(MspDBHelper.BizEntry.TABLE_NAME, "time", 3);
                a(MspDBHelper.ActionEntry.TABLE_NAME, "time", 3);
                a(MspDBHelper.RecordEntry.TABLE_NAME, "time", 3);
                a(MspDBHelper.BehaviorExperienceEntry.TABLE_NAME, "date", 3);
                LogUtil.record(2, "MspDBManager:delete DB", "delete end");
                this.c.close();
                LogUtil.record(2, "MspDBManager:closeDBHelper", "mDBHelper=" + this.c);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
