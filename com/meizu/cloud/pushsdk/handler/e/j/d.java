package com.meizu.cloud.pushsdk.handler.e.j;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private String f7989a;
    private String b;
    private String c;
    private String d;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f7990a;
        private String b;
        private String c;
        private String d;

        public a a(String str) {
            this.d = str;
            return this;
        }

        public d a() {
            return new d(this);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a c(String str) {
            this.b = str;
            return this;
        }

        public a d(String str) {
            this.f7990a = str;
            return this;
        }
    }

    public d() {
    }

    public d(a aVar) {
        String str = "";
        this.f7989a = !TextUtils.isEmpty(aVar.f7990a) ? aVar.f7990a : str;
        this.b = !TextUtils.isEmpty(aVar.b) ? aVar.b : str;
        this.c = !TextUtils.isEmpty(aVar.c) ? aVar.c : str;
        this.d = !TextUtils.isEmpty(aVar.d) ? aVar.d : str;
    }

    public static a a() {
        return new a();
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f7989a;
    }

    public String f() {
        com.meizu.cloud.pushsdk.f.b.c cVar = new com.meizu.cloud.pushsdk.f.b.c();
        cVar.a("task_id", this.f7989a);
        cVar.a(PushConstants.SEQ_ID, this.b);
        cVar.a(PushConstants.PUSH_TIMESTAMP, this.c);
        cVar.a(PushConstants.DEVICE_ID, this.d);
        return cVar.toString();
    }
}
