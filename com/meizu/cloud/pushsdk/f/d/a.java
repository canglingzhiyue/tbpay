package com.meizu.cloud.pushsdk.f.d;

import com.meizu.cloud.pushsdk.f.b.c;
import com.meizu.cloud.pushsdk.f.g.d;
import com.meizu.cloud.pushsdk.f.g.e;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.meizu.cloud.pushsdk.f.b.b> f7962a;
    private final long b;
    private final String c;

    /* renamed from: com.meizu.cloud.pushsdk.f.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0283a<T extends AbstractC0283a<T>> {

        /* renamed from: a  reason: collision with root package name */
        private List<com.meizu.cloud.pushsdk.f.b.b> f7963a = new LinkedList();
        private long b = System.currentTimeMillis();
        private String c = e.a();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract T a();

        public T a(long j) {
            this.b = j;
            return a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(AbstractC0283a<?> abstractC0283a) {
        d.a(((AbstractC0283a) abstractC0283a).f7963a);
        d.a(((AbstractC0283a) abstractC0283a).c);
        d.a(!((AbstractC0283a) abstractC0283a).c.isEmpty(), "eventId cannot be empty");
        this.f7962a = ((AbstractC0283a) abstractC0283a).f7963a;
        this.b = ((AbstractC0283a) abstractC0283a).b;
        this.c = ((AbstractC0283a) abstractC0283a).c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c a(c cVar) {
        cVar.a(NotificationStyle.EXPANDABLE_IMAGE_URL, a());
        cVar.a("ts", Long.toString(c()));
        return cVar;
    }

    public String a() {
        return this.c;
    }

    public List<com.meizu.cloud.pushsdk.f.b.b> b() {
        return new ArrayList(this.f7962a);
    }

    public long c() {
        return this.b;
    }
}
