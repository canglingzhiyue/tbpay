package com.taobao.alivfssdk.fresco.cache.disk;

import com.taobao.alivfssdk.fresco.cache.common.g;
import com.taobao.alivfssdk.fresco.cache.disk.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import tb.dij;

/* loaded from: classes.dex */
public interface e extends Closeable {
    Collection<a.InterfaceC0334a> a() throws IOException;

    dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar);

    dij a(com.taobao.alivfssdk.fresco.cache.common.b bVar, g gVar) throws IOException;

    void b();

    boolean b(com.taobao.alivfssdk.fresco.cache.common.b bVar);

    boolean d(com.taobao.alivfssdk.fresco.cache.common.b bVar);

    List<String> e(com.taobao.alivfssdk.fresco.cache.common.b bVar);
}
