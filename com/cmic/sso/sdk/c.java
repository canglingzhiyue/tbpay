package com.cmic.sso.sdk;

import com.mobile.auth.O0O000o;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f6473a = "LockManager";
    private final Object b = new Object();
    private volatile boolean c = false;

    public void a() {
        O0O000o.O00000Oo("LockManager", "unLockPre");
        synchronized (this.b) {
            try {
                this.c = false;
                this.b.notify();
            } catch (Exception e) {
                e.printStackTrace();
                O0O000o.O000000o("LockManager", "unLock error ");
            }
        }
    }

    public void a(long j) {
        synchronized (this.b) {
            if (this.c) {
                O0O000o.O00000Oo("LockManager", "wait for pre");
                try {
                    this.b.wait(j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.c = true;
        }
    }
}
