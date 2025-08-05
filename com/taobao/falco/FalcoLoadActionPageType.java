package com.taobao.falco;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public interface FalcoLoadActionPageType {
    public static final String APP = "app";
    public static final String EMBED = "embed";
    public static final String PAGE = "page";
    public static final String POP = "pop";
    public static final String SWIPER = "swiper";
    public static final String TAB = "tab";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Definition {
    }
}
