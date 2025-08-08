package com.hihonor.push.sdk;

import mtopsdk.common.util.StringUtils;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f7285a;
    public final int b;

    public q(String str) {
        this.f7285a = str;
        this.b = a(str);
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static q a(String str) {
        return new q(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return StringUtils.equals(this.f7285a, ((q) obj).f7285a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
