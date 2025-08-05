package com.google.protobuf.nano;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f7245a = new a();

    /* loaded from: classes4.dex */
    private static class a implements b {
        private a() {
        }

        @Override // com.google.protobuf.nano.c.b
        public <K, V> Map<K, V> a(Map<K, V> map) {
            return map == null ? new HashMap() : map;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        <K, V> Map<K, V> a(Map<K, V> map);
    }

    public static b a() {
        return f7245a;
    }
}
