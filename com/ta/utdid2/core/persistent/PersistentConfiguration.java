package com.ta.utdid2.core.persistent;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.utils.UtdidLogger;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import com.ta.utdid2.android.utils.StringUtils;
import com.ta.utdid2.core.persistent.MySharedPreferences;
import java.io.File;
import tb.kge;

/* loaded from: classes.dex */
public class PersistentConfiguration {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_TIMESTAMP2 = "t2";
    private static final String KEY_TYPE = "type";
    private static final String KEY_UTDID2 = "UTDID2";
    private static final String TAG = "PersistentConfiguration";
    private MySharedPreferences mMySp;
    private SharedPreferences mSp;

    static {
        kge.a(1423420654);
    }

    public PersistentConfiguration(Context context, String str, String str2) {
        String str3 = null;
        this.mSp = null;
        this.mMySp = null;
        if (context == null) {
            return;
        }
        this.mSp = context.getSharedPreferences(str2, 0);
        try {
            str3 = Environment.getExternalStorageState();
        } catch (Exception e) {
            UtdidLogger.e(TAG, e, new Object[0]);
        }
        boolean z = PhoneInfoUtils.isSdcardPrivacyMode() ? false : !StringUtils.isEmpty(str3) && (str3.equals("mounted") || str3.equals("mounted_ro"));
        UtdidLogger.d(TAG, "PersistentConfiguration canRead", Boolean.valueOf(z));
        if (!z || StringUtils.isEmpty(str)) {
            return;
        }
        try {
            TransactionXMLFile transactionXMLFile = getTransactionXMLFile(str);
            if (transactionXMLFile == null) {
                return;
            }
            this.mMySp = transactionXMLFile.getMySharedPreferences(str2, 0);
        } catch (Exception unused) {
        }
    }

    public String getUtdidFromSp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("394ba388", new Object[]{this});
        }
        SharedPreferences sharedPreferences = this.mSp;
        String str = "";
        if (sharedPreferences != null) {
            str = sharedPreferences.getString(KEY_UTDID2, str);
        }
        UtdidLogger.d(TAG, "getUtdidFromSp utdid", str);
        return str;
    }

    public int getTypeFromSp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16123071", new Object[]{this})).intValue();
        }
        SharedPreferences sharedPreferences = this.mSp;
        int i = sharedPreferences != null ? sharedPreferences.getInt("type", 0) : 0;
        UtdidLogger.d(TAG, "getTypeFromSp type", Integer.valueOf(i));
        return i;
    }

    public String getUtdidFromMySp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6683493c", new Object[]{this});
        }
        MySharedPreferences mySharedPreferences = this.mMySp;
        String str = "";
        if (mySharedPreferences != null) {
            str = mySharedPreferences.getString(KEY_UTDID2, str);
        }
        UtdidLogger.d(TAG, "getUtdidFromMySp utdid", str);
        return str;
    }

    private TransactionXMLFile getTransactionXMLFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransactionXMLFile) ipChange.ipc$dispatch("86a0cc3", new Object[]{this, str});
        }
        File rootFolder = getRootFolder(str);
        if (rootFolder == null) {
            return null;
        }
        return new TransactionXMLFile(rootFolder.getAbsolutePath());
    }

    private File getRootFolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b767b476", new Object[]{this, str});
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return null;
        }
        File file = new File(String.format("%s%s%s", externalStorageDirectory.getAbsolutePath(), File.separator, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void updateUtdidToSp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("674f4660", new Object[]{this, str});
        } else if (this.mSp == null) {
        } else {
            UtdidLogger.d(TAG, "updateUtdidToSp utdid", str);
            SharedPreferences.Editor edit = this.mSp.edit();
            edit.putString(KEY_UTDID2, str);
            if (this.mSp.getLong("t2", 0L) == 0) {
                edit.putLong("t2", System.currentTimeMillis());
            }
            try {
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public void writeUtdidToSp(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23aa3fb9", new Object[]{this, str, new Integer(i)});
        } else if (this.mSp == null) {
        } else {
            UtdidLogger.d(TAG, "writeUtdidToSp utdid", str);
            SharedPreferences.Editor edit = this.mSp.edit();
            edit.putString(KEY_UTDID2, str);
            edit.putInt("type", i);
            if (this.mSp.getLong("t2", 0L) == 0) {
                edit.putLong("t2", System.currentTimeMillis());
            }
            try {
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public void writeUtdidToMySp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60434b56", new Object[]{this, str});
        } else if (this.mMySp == null) {
        } else {
            UtdidLogger.d(TAG, "writeUtdidToMySp utdid", str);
            MySharedPreferences.MyEditor edit = this.mMySp.edit();
            edit.putString(KEY_UTDID2, str);
            if (this.mMySp.getLong("t2", 0L) == 0) {
                edit.putLong("t2", System.currentTimeMillis());
            }
            try {
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public boolean copySPToMySP() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8037ae1", new Object[]{this})).booleanValue();
        }
        if (this.mSp != null && this.mMySp != null) {
            UtdidLogger.d(TAG, "copySPToMySP");
            MySharedPreferences.MyEditor edit = this.mMySp.edit();
            if (edit != null) {
                edit.clear();
                edit.putString(KEY_UTDID2, this.mSp.getString(KEY_UTDID2, ""));
                edit.putLong("t2", this.mSp.getLong("t2", 0L));
                try {
                    z = edit.commit();
                } catch (Exception unused) {
                }
                UtdidLogger.d(TAG, "copySPToMySP", Boolean.valueOf(z));
                return z;
            }
        }
        z = false;
        UtdidLogger.d(TAG, "copySPToMySP", Boolean.valueOf(z));
        return z;
    }

    public boolean copyMySPToSP(int i) {
        boolean z;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72178bca", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.mMySp != null && (sharedPreferences = this.mSp) != null && (edit = sharedPreferences.edit()) != null) {
            edit.clear();
            edit.putString(KEY_UTDID2, this.mMySp.getString(KEY_UTDID2, ""));
            edit.putInt("type", i);
            edit.putLong("t2", this.mMySp.getLong("t2", 0L));
            try {
                z = edit.commit();
            } catch (Exception unused) {
            }
            UtdidLogger.d(TAG, "copyMySPToSP", Boolean.valueOf(z));
            return z;
        }
        z = false;
        UtdidLogger.d(TAG, "copyMySPToSP", Boolean.valueOf(z));
        return z;
    }
}
