package com.xiaomi.push;

import mtopsdk.common.util.StringUtils;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes9.dex */
class bs implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !StringUtils.isEmpty(str) && !str.toLowerCase().endsWith(".lock");
    }
}
