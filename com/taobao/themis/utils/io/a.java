package com.taobao.themis.utils.io;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0007*\u00020\u0002\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0002¨\u0006\f"}, d2 = {"deleteRecursive", "", "Ljava/io/File;", "deleteSafely", "getCreateTime", "", "getDigest", "", Constants.CodeCache.BANNER_DIGEST, "getMD5", "getSha1", "size", "themis_utils_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1927300025);
    }

    public static final boolean a(File deleteSafely) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{deleteSafely})).booleanValue();
        }
        q.d(deleteSafely, "$this$deleteSafely");
        if (!deleteSafely.exists()) {
            return false;
        }
        try {
            if (StringUtils.equals(deleteSafely.getCanonicalPath(), "/")) {
                return false;
            }
            if (!StringUtils.equals(deleteSafely.getAbsolutePath(), "/")) {
                return deleteSafely.delete();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final long b(File size) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58420194", new Object[]{size})).longValue();
        }
        q.d(size, "$this$size");
        long j = 0;
        if (!size.exists()) {
            return 0L;
        }
        if (size.isFile()) {
            return size.length();
        }
        File[] listFiles = size.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                q.b(file, "file");
                j += b(file);
            }
        }
        return j;
    }

    public static final long c(File getCreateTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25ec6355", new Object[]{getCreateTime})).longValue();
        }
        q.d(getCreateTime, "$this$getCreateTime");
        if (getCreateTime.exists()) {
            return new Date(getCreateTime.lastModified()).getTime();
        }
        return 0L;
    }
}
