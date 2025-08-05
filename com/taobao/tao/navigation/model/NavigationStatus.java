package com.taobao.tao.navigation.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes8.dex */
public class NavigationStatus {
    public static final int STATUS_CLICKED = 13;
    public static final int STATUS_SET = 14;
    public static final int STATUS_UNSET = 15;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface Status {
    }

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f20814a;
        public String b;
        public String c;
        public String d;
    }
}
