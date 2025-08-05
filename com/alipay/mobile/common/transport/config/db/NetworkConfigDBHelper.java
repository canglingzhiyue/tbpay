package com.alipay.mobile.common.transport.config.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkConfigDBHelper extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TB_NAME = "nw_conf_mng_table";

    /* renamed from: a  reason: collision with root package name */
    private static NetworkConfigDBHelper f5528a;

    public static /* synthetic */ Object ipc$super(NetworkConfigDBHelper networkConfigDBHelper, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static synchronized NetworkConfigDBHelper getInstance(Context context) {
        synchronized (NetworkConfigDBHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkConfigDBHelper) ipChange.ipc$dispatch("ab494eb", new Object[]{context});
            } else if (f5528a != null) {
                return f5528a;
            } else {
                synchronized (NetworkConfigDBHelper.class) {
                    if (f5528a == null) {
                        NetworkConfigDBHelper networkConfigDBHelper = new NetworkConfigDBHelper(context, "nw_conf_mng.db", null, 1);
                        f5528a = networkConfigDBHelper;
                        return networkConfigDBHelper;
                    }
                    return f5528a;
                }
            }
        }
    }

    private NetworkConfigDBHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            return;
        }
        LogCatUtil.debug("NetworkConfigDBHelper", "onCreate.");
        a(sQLiteDatabase);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cd8c21", new Object[]{this, sQLiteDatabase});
            return;
        }
        sQLiteDatabase.execSQL(SqlConstants.DROP_TABLE);
        sQLiteDatabase.execSQL(SqlConstants.CREATE_TABLE_SQL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            a(sQLiteDatabase);
            LogCatUtil.debug("NetworkConfigDBHelper", "onUpgrade from " + i + " to " + i2);
        }
    }
}
