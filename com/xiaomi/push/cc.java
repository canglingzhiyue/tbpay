package com.xiaomi.push;

import com.xiaomi.push.cg;

/* loaded from: classes9.dex */
public class cc extends cg.d {

    /* renamed from: a  reason: collision with root package name */
    protected String f24391a;

    public cc(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f24391a = "MessageDeleteJob";
        this.f24391a = str3;
    }

    public static cc a(String str) {
        return new cc(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
