package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private long f7480a = android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE;
    private volatile boolean b = false;
    private a c = null;

    /* loaded from: classes4.dex */
    private class a {

        /* renamed from: a  reason: collision with root package name */
        String f7481a = UUID.randomUUID().toString().replace("-", "");
        boolean b = true;
        private long c;

        a(long j) {
            this.f7481a += "_" + j;
            this.c = j;
            p0.this.b = false;
        }

        private boolean a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private void b(long j) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f7481a = uuid;
            this.f7481a = uuid.replace("-", "");
            this.f7481a += "_" + j;
            this.c = j;
            this.b = true;
        }

        private boolean b(long j, long j2) {
            return j2 - j >= p0.this.f7480a;
        }

        void a(long j) {
            if (p0.this.b) {
                p0.this.b = false;
                b(j);
            } else if (b(this.c, j) || a(this.c, j)) {
                b(j);
            } else {
                this.c = j;
                this.b = false;
            }
        }
    }

    public String a() {
        a aVar = this.c;
        if (aVar == null) {
            v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
            return "";
        }
        return aVar.f7481a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(j);
            return;
        }
        v.c("hmsSdk", "Session is first flush");
        this.c = new a(j);
    }

    public boolean b() {
        a aVar = this.c;
        if (aVar == null) {
            v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
            return false;
        }
        return aVar.b;
    }
}
