package com.huawei.agconnect.core.a;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cwq;

/* loaded from: classes.dex */
public class a extends cwq {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Object> f7296a = new CopyOnWriteArrayList();

    public static void a() {
        Iterator<Object> it = f7296a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
