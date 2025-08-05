package android.taobao.windvane.extra.storage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import tb.kge;

/* loaded from: classes2.dex */
public class ProtoDBStorageImpl implements IStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LSDB mLSDB;

    static {
        kge.a(-979226548);
        kge.a(-1729238039);
    }

    public ProtoDBStorageImpl(String str) {
        LSDB lsdb;
        Config config = new Config();
        config.walSize = 2097152;
        try {
            lsdb = LSDB.open(str, config);
        } catch (Exception e) {
            RVLLevel rVLLevel = RVLLevel.Error;
            e.a(rVLLevel, "WindVane/Storage", "open error: " + e.getMessage());
            lsdb = null;
        }
        this.mLSDB = lsdb;
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean write(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6c0efe", new Object[]{this, str, str2})).booleanValue();
        }
        LSDB lsdb = this.mLSDB;
        if (lsdb == null) {
            return false;
        }
        return lsdb.insertString(new com.taobao.android.protodb.e(str), str2);
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public String read(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a0eb7d9", new Object[]{this, str});
        }
        LSDB lsdb = this.mLSDB;
        if (lsdb == null) {
            return null;
        }
        return lsdb.getString(new com.taobao.android.protodb.e(str));
    }

    @Override // android.taobao.windvane.extra.storage.IStorage
    public boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        LSDB lsdb = this.mLSDB;
        if (lsdb == null) {
            return false;
        }
        return lsdb.delete(new com.taobao.android.protodb.e(str));
    }
}
