package com.squareup.wire;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.ByteString;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class UnknownFieldMap {

    /* renamed from: a  reason: collision with root package name */
    Map<Integer, List<a>> f8118a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.squareup.wire.UnknownFieldMap$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8119a = new int[WireType.values().length];

        static {
            try {
                f8119a[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8119a[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8119a[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8119a[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes4.dex */
    enum UnknownFieldType {
        VARINT,
        FIXED32,
        FIXED64,
        LENGTH_DELIMITED;

        public static UnknownFieldType of(String str) {
            if ("varint".equals(str)) {
                return VARINT;
            }
            if ("fixed32".equals(str)) {
                return FIXED32;
            }
            if ("fixed64".equals(str)) {
                return FIXED64;
            }
            if ("length-delimited".equals(str)) {
                return LENGTH_DELIMITED;
            }
            throw new IllegalArgumentException("Unknown type " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f8120a;
        private final WireType b;

        public a(int i, WireType wireType) {
            this.f8120a = i;
            this.b = wireType;
        }

        public static b a(int i, Integer num) {
            return new b(i, num);
        }

        public static d a(int i, ByteString byteString) {
            return new d(i, byteString);
        }

        public static e a(int i, Long l) {
            return new e(i, l);
        }

        public static c b(int i, Long l) {
            return new c(i, l);
        }

        public abstract int a();

        public abstract void a(int i, k kVar) throws IOException;

        public WireType b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final Integer f8121a;

        public b(int i, Integer num) {
            super(i, WireType.FIXED32);
            this.f8121a = num;
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public int a() {
            return 4;
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public void a(int i, k kVar) throws IOException {
            kVar.b(i, WireType.FIXED32);
            kVar.g(this.f8121a.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final Long f8122a;

        public c(int i, Long l) {
            super(i, WireType.FIXED64);
            this.f8122a = l;
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public int a() {
            return 8;
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public void a(int i, k kVar) throws IOException {
            kVar.b(i, WireType.FIXED64);
            kVar.c(this.f8122a.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        private final ByteString f8123a;

        public d(int i, ByteString byteString) {
            super(i, WireType.LENGTH_DELIMITED);
            this.f8123a = byteString;
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public int a() {
            return k.c(this.f8123a.size()) + this.f8123a.size();
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public void a(int i, k kVar) throws IOException {
            kVar.b(i, WireType.LENGTH_DELIMITED);
            kVar.f(this.f8123a.size());
            kVar.b(this.f8123a.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        private final Long f8124a;

        public e(int i, Long l) {
            super(i, WireType.VARINT);
            this.f8124a = l;
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public int a() {
            return k.a(this.f8124a.longValue());
        }

        @Override // com.squareup.wire.UnknownFieldMap.a
        public void a(int i, k kVar) throws IOException {
            kVar.b(i, WireType.VARINT);
            kVar.b(this.f8124a.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnknownFieldMap() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnknownFieldMap(UnknownFieldMap unknownFieldMap) {
        if (unknownFieldMap.f8118a != null) {
            b().putAll(unknownFieldMap.f8118a);
        }
    }

    private <T> void a(Map<Integer, List<a>> map, int i, T t, WireType wireType) throws IOException {
        a a2;
        List<a> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        int i2 = AnonymousClass1.f8119a[wireType.ordinal()];
        if (i2 == 1) {
            a2 = a.a(i, (Long) t);
        } else if (i2 == 2) {
            a2 = a.a(i, (Integer) t);
        } else if (i2 == 3) {
            a2 = a.b(i, (Long) t);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("Unsupported wireType = " + wireType);
        } else {
            a2 = a.a(i, (ByteString) t);
        }
        if (list.size() <= 0 || list.get(0).b() == a2.b()) {
            list.add(a2);
            return;
        }
        throw new IOException(String.format("Wire type %s differs from previous type %s for tag %s", a2.b(), list.get(0).b(), Integer.valueOf(i)));
    }

    private Map<Integer, List<a>> b() {
        if (this.f8118a == null) {
            this.f8118a = new TreeMap();
        }
        return this.f8118a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        Map<Integer, List<a>> map = this.f8118a;
        int i = 0;
        if (map != null) {
            for (Map.Entry<Integer, List<a>> entry : map.entrySet()) {
                for (a aVar : entry.getValue()) {
                    i = i + k.b(entry.getKey().intValue()) + aVar.a();
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, Integer num) throws IOException {
        a(b(), i, num, WireType.FIXED32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, Long l) throws IOException {
        a(b(), i, l, WireType.VARINT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, ByteString byteString) throws IOException {
        a(b(), i, byteString, WireType.LENGTH_DELIMITED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k kVar) throws IOException {
        Map<Integer, List<a>> map = this.f8118a;
        if (map != null) {
            for (Map.Entry<Integer, List<a>> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                for (a aVar : entry.getValue()) {
                    aVar.a(intValue, kVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i, Long l) throws IOException {
        a(b(), i, l, WireType.FIXED64);
    }
}
