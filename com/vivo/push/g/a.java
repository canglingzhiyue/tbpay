package com.vivo.push.g;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f24204a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test"};
    private ArrayList<String> b;

    /* renamed from: com.vivo.push.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    private static class C1052a {

        /* renamed from: a  reason: collision with root package name */
        private static a f24205a = new a((byte) 0);
    }

    private a() {
        this.b = null;
        this.b = new ArrayList<>();
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C1052a.f24205a;
    }

    public final boolean b() {
        ArrayList<String> arrayList = this.b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }
}
