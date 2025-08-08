package com.taobao.themis.utils.io;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/utils/io/FileUtils;", "", "()V", "containsRelativeParentPath", "", "path", "", com.alibaba.alibity.container.file.a.API_EXISTS, "absPath", "getCreateTime", "", "getExtension", "fileName", "getFileExtensionFromUrl", "url", "getMimeType", "normalizeWritePath", "referPath", "size", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    static {
        kge.a(1941947648);
        INSTANCE = new c();
    }

    private c() {
    }

    @JvmStatic
    public static final boolean a(String path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{path})).booleanValue();
        }
        q.d(path, "path");
        String str = path;
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return n.b(path, "../", false, 2, (Object) null) || n.c(path, "/..", false, 2, (Object) null) || n.b((CharSequence) str, (CharSequence) "/../", false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean b(String absPath) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{absPath})).booleanValue();
        }
        q.d(absPath, "absPath");
        if (absPath.length() != 0) {
            z = false;
        }
        if (!z) {
            return new File(absPath).exists();
        }
        return false;
    }

    @JvmStatic
    public static final long e(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{str})).longValue();
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (!z) {
            return a.b(new File(str));
        }
        return 0L;
    }
}
