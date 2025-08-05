package com.taobao.pexode;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes7.dex */
public @interface AnimImage {
    public static final int APNG = 1;
    public static final int GIF = 0;
    public static final int HEIC = 3;
    public static final int NULL = -1;
    public static final int WEBP = 2;
}
