package com.taobao.alivfssdk.fresco.cache.disk;

import com.taobao.alivfssdk.fresco.cache.common.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import tb.dij;

/* loaded from: classes.dex */
public interface a extends Closeable {

    /* renamed from: com.taobao.alivfssdk.fresco.cache.disk.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0334a {
        String a();

        long c();

        long d();
    }

    /* loaded from: classes.dex */
    public interface b {
        dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException;

        void a(g gVar, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException;

        boolean a();
    }

    long a(InterfaceC0334a interfaceC0334a) throws IOException;

    b a(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException;

    List<String> a(String str);

    boolean a();

    long b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar) throws IOException;

    String b();

    dij b(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException;

    void c() throws IOException;

    boolean c(String str, com.taobao.alivfssdk.fresco.cache.common.b bVar, Object obj) throws IOException;

    Collection<InterfaceC0334a> f() throws IOException;
}
