package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;

/* loaded from: classes.dex */
public class DBConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dbName;
    private a dbOpenCallback;
    private String journalMode;
    private String key;
    private int maxConnectionsCount;
    private String path;
    private SQLTrace sqlTrace;
    private int userVersion;

    public DBConfig(String str) {
        this.path = str;
        String[] split = str.split(File.pathSeparator);
        if (split.length > 0) {
            this.dbName = split[split.length - 1];
        } else {
            this.dbName = "";
        }
    }

    public DBConfig(String str, String str2) {
        this.path = str;
        this.dbName = str2;
    }

    public void setProperty(Property property, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b621edbb", new Object[]{this, property, str});
        } else if (property == Property.Key) {
            this.key = str;
        } else if (property == Property.UserVersion) {
            this.userVersion = Integer.valueOf(str).intValue();
        } else if (property != Property.JournalMode) {
        } else {
            this.journalMode = str;
        }
    }

    public void onDatabaseOpenedCallback(long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95220455", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)});
        } else if (this.dbOpenCallback == null) {
        } else {
            new DBConnection(j);
        }
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this}) : this.path;
    }

    public String getDbName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3ea793a", new Object[]{this}) : this.dbName;
    }

    public void setKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b06c2d6e", new Object[]{this, str});
        } else {
            this.key = str;
        }
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16c52370", new Object[]{this}) : this.key;
    }

    public void setJournalMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f1c449", new Object[]{this, str});
        } else {
            this.journalMode = str;
        }
    }

    public String getJournalMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6db79135", new Object[]{this}) : this.journalMode;
    }

    public void setUserVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c38d71", new Object[]{this, new Integer(i)});
        } else {
            this.userVersion = i;
        }
    }

    public int getUserVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f824651", new Object[]{this})).intValue() : this.userVersion;
    }

    public void setMaxConnectionsCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2512de60", new Object[]{this, new Integer(i)});
        } else {
            this.maxConnectionsCount = i;
        }
    }

    public int getMaxConnectionsCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3444f82", new Object[]{this})).intValue() : this.maxConnectionsCount;
    }

    public void setSqlTrace(SQLTrace sQLTrace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e351f1", new Object[]{this, sQLTrace});
        } else {
            this.sqlTrace = sQLTrace;
        }
    }

    public SQLTrace getSqlTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SQLTrace) ipChange.ipc$dispatch("1f73cc93", new Object[]{this}) : this.sqlTrace;
    }

    public a getDbOpenCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f9a143e1", new Object[]{this}) : this.dbOpenCallback;
    }

    public void setDbOpenCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153f9511", new Object[]{this, aVar});
        } else {
            this.dbOpenCallback = aVar;
        }
    }
}
