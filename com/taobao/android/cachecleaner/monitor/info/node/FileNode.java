package com.taobao.android.cachecleaner.monitor.info.node;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class FileNode implements a, Serializable, Comparable<FileNode> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTORY_TYPE = 0;
    private static final String FIELD_SEPARATOR = "_&&_";
    public static final int FILE_TYPE = 1;
    private static final String TAG = "FileNode";
    public static final int UNKNOWN_TYPE = 2;
    private final List<a> mChildren;
    private final boolean mIsDir;
    private final long mLastModifiedTime;
    private final String mName;
    private final a mParent;
    private long mSize;
    private final int mType;

    static {
        kge.a(-1611869145);
        kge.a(-698394023);
        kge.a(1028243835);
        kge.a(415966670);
    }

    public FileNode(a aVar, File file) {
        this(aVar, (String) null, file);
    }

    public FileNode(String str, File file) {
        this((a) null, str, file);
    }

    public FileNode(a aVar, String str, File file) {
        String str2;
        this.mChildren = new ArrayList();
        this.mParent = aVar;
        int i = 0;
        if (file == null) {
            this.mName = null;
            this.mType = 2;
            this.mIsDir = false;
            this.mLastModifiedTime = -1L;
            return;
        }
        if (str == null) {
            str2 = file.getName();
        } else {
            str2 = str + File.separator + file.getName();
        }
        this.mName = str2;
        this.mIsDir = file.isDirectory();
        this.mType = !file.isDirectory() ? file.isFile() ? 1 : 2 : i;
        this.mLastModifiedTime = file.lastModified();
        if (!this.mIsDir) {
            this.mSize = file.length();
        } else {
            this.mSize = 0L;
        }
    }

    public FileNode(a aVar, String str) {
        this(aVar, (String) null, str);
    }

    public FileNode(String str, String str2) {
        this((a) null, str, str2);
    }

    public FileNode(a aVar, String str, String str2) {
        String str3;
        this.mChildren = new ArrayList();
        this.mParent = aVar;
        boolean z = false;
        if (StringUtils.isEmpty(str2) || str2.length() < 2) {
            TLog.logd(CacheCleaner.MODULE, TAG, "FileNode: serialStr is wrong, input string is " + str2);
            this.mName = null;
            this.mType = 2;
            this.mIsDir = false;
            this.mLastModifiedTime = -1L;
            return;
        }
        String[] split = str2.substring(1, str2.length() - 1).split(FIELD_SEPARATOR);
        if (split.length != 4) {
            TLog.logd(CacheCleaner.MODULE, TAG, "FileNode: serial string parse error, input string is " + str2);
            this.mName = null;
            this.mType = 2;
            this.mIsDir = false;
            this.mLastModifiedTime = -1L;
            return;
        }
        if (str == null) {
            str3 = split[0];
        } else {
            str3 = str + File.separator + split[0];
        }
        this.mName = str3;
        this.mType = safeParseInt(split[1], 2);
        this.mIsDir = this.mType == 0 ? true : z;
        this.mSize = safeParseLong(split[2], -1L);
        this.mLastModifiedTime = safeParseLong(split[3], -1L);
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mName;
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public long getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b972", new Object[]{this})).longValue() : this.mSize;
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public void setSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7687ad7a", new Object[]{this, new Long(j)});
        } else {
            this.mSize = j;
        }
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public boolean isDirectory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4b5fb6e", new Object[]{this})).booleanValue() : this.mIsDir;
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public int type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue() : this.mType;
    }

    public long getModifiedTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("adb79e27", new Object[]{this})).longValue() : this.mLastModifiedTime;
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public String path() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dd143f4", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mName);
        for (a aVar = this.mParent; aVar != null; aVar = aVar.parent()) {
            sb.insert(0, aVar.getName() + File.separator);
        }
        return sb.toString();
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public List<a> children() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("740eda81", new Object[]{this}) : this.mChildren;
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public a parent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("1b80f7ca", new Object[]{this}) : this.mParent;
    }

    @Override // com.taobao.android.cachecleaner.monitor.info.node.a
    public void addChild(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("913ed167", new Object[]{this, aVar});
        } else {
            this.mChildren.add(aVar);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return riy.BLOCK_START_STR + this.mName + FIELD_SEPARATOR + this.mType + FIELD_SEPARATOR + this.mSize + FIELD_SEPARATOR + this.mLastModifiedTime + riy.BLOCK_END_STR;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FileNode fileNode = (FileNode) obj;
            if (this.mIsDir == fileNode.mIsDir && this.mSize == fileNode.mSize && this.mLastModifiedTime == fileNode.mLastModifiedTime && StringUtils.equals(this.mName, fileNode.mName)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Build.VERSION.SDK_INT >= 19 ? Objects.hash(this.mName, Boolean.valueOf(this.mIsDir), Long.valueOf(this.mSize), Long.valueOf(this.mLastModifiedTime)) : hash(this.mName, Boolean.valueOf(this.mIsDir), Long.valueOf(this.mSize), Long.valueOf(this.mLastModifiedTime));
    }

    private static int hash(Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f836026f", new Object[]{objArr})).intValue() : hashCode(objArr);
    }

    private static int hashCode(Object[] objArr) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a54f8c2", new Object[]{objArr})).intValue();
        }
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            i = (i * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }

    private static int safeParseInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf01e97c", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            TLog.loge(CacheCleaner.MODULE, TAG, "safeParseInt: parse int with exception " + e);
            return i;
        }
    }

    private static long safeParseLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("920e4145", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            TLog.loge(CacheCleaner.MODULE, TAG, "safeParseLong: parse int with exception " + e);
            return j;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(FileNode fileNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd036ae2", new Object[]{this, fileNode})).intValue();
        }
        long j = this.mSize;
        long j2 = fileNode.mSize;
        if (j > j2) {
            return 1;
        }
        return j == j2 ? 0 : -1;
    }
}
