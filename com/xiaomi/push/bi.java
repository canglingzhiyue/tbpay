package com.xiaomi.push;

import java.util.LinkedList;

/* loaded from: classes9.dex */
public class bi {

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<a> f24376a = new LinkedList<>();

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final bi f24377a = new bi();

        /* renamed from: a  reason: collision with other field name */
        public int f137a;

        /* renamed from: a  reason: collision with other field name */
        public Object f138a;

        /* renamed from: a  reason: collision with other field name */
        public String f139a;

        a(int i, Object obj) {
            this.f137a = i;
            this.f138a = obj;
        }
    }

    public static bi a() {
        return a.f24377a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m1737a() {
        if (this.f24376a.size() > 100) {
            this.f24376a.removeFirst();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized int m1738a() {
        return this.f24376a.size();
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized LinkedList<a> m1739a() {
        LinkedList<a> linkedList;
        linkedList = this.f24376a;
        this.f24376a = new LinkedList<>();
        return linkedList;
    }

    public synchronized void a(Object obj) {
        this.f24376a.add(new a(0, obj));
        m1737a();
    }
}
