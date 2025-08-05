package com.taobao.calendar.aidl.business.db;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.uc.webview.export.extension.UCCore;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes6.dex */
public abstract class SQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        if (i <= 0) {
            throw new IllegalArgumentException("Version must be >= 1, was " + i);
        }
        this.mContext = context;
        this.mName = str;
        this.mFactory = cursorFactory;
        this.mNewVersion = i;
        this.mErrorHandler = databaseErrorHandler;
    }

    private SQLiteDatabase getDatabaseLocked(boolean z) {
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            try {
                this.mIsInitializing = true;
                if (sQLiteDatabase2 == null) {
                    if (this.mName == null) {
                        sQLiteDatabase2 = SQLiteDatabase.create(null);
                    } else {
                        this.mContext.getDatabasePath(this.mName);
                        String path = this.mContext.getDatabasePath(this.mName).getPath();
                        try {
                            try {
                                sQLiteDatabase2 = this.mContext.openOrCreateDatabase(this.mName, this.mEnableWriteAheadLogging ? UCCore.VERIFY_POLICY_PAK_QUICK : 0, this.mFactory);
                            } catch (Exception unused) {
                                sQLiteDatabase2 = SQLiteDatabase.openDatabase(path, this.mFactory, 268435472, this.mErrorHandler);
                            }
                        } catch (SQLiteException e) {
                            if (z) {
                                throw e;
                            }
                            Log.e(TAG, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                            sQLiteDatabase2 = SQLiteDatabase.openDatabase(path, this.mFactory, 1, this.mErrorHandler);
                        }
                    }
                }
                onConfigure(sQLiteDatabase2);
                int version = sQLiteDatabase2.getVersion();
                Log.e(TAG, "oldversion =" + version + "newVersion =" + this.mNewVersion);
                if (version != this.mNewVersion) {
                    if (sQLiteDatabase2.isReadOnly()) {
                        throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase2.getVersion() + " to " + this.mNewVersion + ResponseProtocolType.COMMENT + this.mName);
                    }
                    sQLiteDatabase2.beginTransaction();
                    if (version == 0) {
                        onCreate(sQLiteDatabase2);
                    } else if (version > this.mNewVersion) {
                        onDowngrade(sQLiteDatabase2, version, this.mNewVersion);
                    } else {
                        onUpgrade(sQLiteDatabase2, version, this.mNewVersion);
                    }
                    sQLiteDatabase2.setVersion(this.mNewVersion);
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                }
                onOpen(sQLiteDatabase2);
                if (sQLiteDatabase2.isReadOnly()) {
                    String str = "Opened " + this.mName + " in read-only mode";
                }
                this.mDatabase = sQLiteDatabase2;
                return sQLiteDatabase2;
            } finally {
                this.mIsInitializing = false;
                if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.mDatabase) {
                    sQLiteDatabase2.close();
                }
            }
        }
        throw new IllegalStateException("getDatabase called recursively");
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        }
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public String getDatabaseName() {
        return this.mName;
    }

    public SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    public SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                if (this.mDatabase != null && this.mDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                }
                this.mEnableWriteAheadLogging = z;
            }
        }
    }
}
