package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.c;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes8.dex */
public interface oms {

    /* loaded from: classes8.dex */
    public static final class a extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Long> f32181a;

        static {
            kge.a(1148162263);
        }

        public a() {
            a();
        }

        public static a a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7840f5e5", new Object[]{bArr}) : MessageNano.mergeFrom(new a(), bArr));
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode != 1607980598) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.computeSerializedSize());
            }
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6fddc0cc", new Object[]{this});
            }
            this.f32181a = null;
            this.cachedSize = -1;
            return this;
        }

        public a a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("831f87bf", new Object[]{this, aVar});
            }
            c.b a2 = com.google.protobuf.nano.c.a();
            while (true) {
                int a3 = aVar.a();
                if (a3 == 0) {
                    return this;
                }
                if (a3 == 10) {
                    this.f32181a = com.google.protobuf.nano.b.a(aVar, this.f32181a, a2, 9, 3, null, 10, 16);
                } else if (!com.google.protobuf.nano.e.a(aVar, a3)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            Map<String, Long> map = this.f32181a;
            return map != null ? computeSerializedSize + com.google.protobuf.nano.b.a(map, 1, 9, 3) : computeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                return;
            }
            Map<String, Long> map = this.f32181a;
            if (map != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map, 1, 9, 3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes8.dex */
    public static final class b extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32182a;
        public int b;
        public Map<String, String> c;
        public long d;

        static {
            kge.a(-633822759);
        }

        public b() {
            a();
        }

        public static b a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (b) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7840f604", new Object[]{bArr}) : MessageNano.mergeFrom(new b(), bArr));
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode != 1607980598) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.computeSerializedSize());
            }
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6fddc0eb", new Object[]{this});
            }
            this.f32182a = 0;
            this.b = 0;
            this.c = null;
            this.d = 0L;
            this.cachedSize = -1;
            return this;
        }

        public b a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("831f87de", new Object[]{this, aVar});
            }
            c.b a2 = com.google.protobuf.nano.c.a();
            while (true) {
                int a3 = aVar.a();
                if (a3 == 0) {
                    return this;
                }
                if (a3 == 8) {
                    this.f32182a = aVar.g();
                } else if (a3 == 16) {
                    this.b = aVar.g();
                } else if (a3 == 26) {
                    this.c = com.google.protobuf.nano.b.a(aVar, this.c, a2, 9, 9, null, 10, 18);
                } else if (a3 == 32) {
                    this.d = aVar.f();
                } else if (!com.google.protobuf.nano.e.a(aVar, a3)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f32182a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(1, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i2);
            }
            Map<String, String> map = this.c;
            if (map != null) {
                computeSerializedSize += com.google.protobuf.nano.b.a(map, 3, 9, 9);
            }
            long j = this.d;
            return j != 0 ? computeSerializedSize + CodedOutputByteBufferNano.g(4, j) : computeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                return;
            }
            int i = this.f32182a;
            if (i != 0) {
                codedOutputByteBufferNano.a(1, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(2, i2);
            }
            Map<String, String> map = this.c;
            if (map != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map, 3, 9, 9);
            }
            long j = this.d;
            if (j != 0) {
                codedOutputByteBufferNano.b(4, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes8.dex */
    public static final class c extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f32183a;
        public int b;
        public int c;
        public a[] d;

        /* loaded from: classes8.dex */
        public static final class a extends MessageNano {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private static volatile a[] c;

            /* renamed from: a  reason: collision with root package name */
            public long f32184a;
            public byte[] b;

            static {
                kge.a(-554243076);
            }

            public a() {
                b();
            }

            public static a[] a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a[]) ipChange.ipc$dispatch("ec0fd86c", new Object[0]);
                }
                if (c == null) {
                    synchronized (com.google.protobuf.nano.b.LAZY_INIT_LOCK) {
                        if (c == null) {
                            c = new a[0];
                        }
                    }
                }
                return c;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1282848581) {
                    super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                    return null;
                } else if (hashCode != 1607980598) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    return new Integer(super.computeSerializedSize());
                }
            }

            public a a(com.google.protobuf.nano.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("395d3260", new Object[]{this, aVar});
                }
                while (true) {
                    int a2 = aVar.a();
                    if (a2 == 0) {
                        return this;
                    }
                    if (a2 == 8) {
                        this.f32184a = aVar.f();
                    } else if (a2 == 18) {
                        this.b = aVar.l();
                    } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        return this;
                    }
                }
            }

            public a b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("d1033a0c", new Object[]{this});
                }
                this.f32184a = 0L;
                this.b = com.google.protobuf.nano.e.EMPTY_BYTES;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.MessageNano
            public int computeSerializedSize() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
                }
                int computeSerializedSize = super.computeSerializedSize();
                long j = this.f32184a;
                if (j != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, j);
                }
                return !Arrays.equals(this.b, com.google.protobuf.nano.e.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.b(2, this.b) : computeSerializedSize;
            }

            @Override // com.google.protobuf.nano.MessageNano
            public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
            }

            @Override // com.google.protobuf.nano.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                    return;
                }
                long j = this.f32184a;
                if (j != 0) {
                    codedOutputByteBufferNano.b(1, j);
                }
                if (!Arrays.equals(this.b, com.google.protobuf.nano.e.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.a(2, this.b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        static {
            kge.a(1646455236);
        }

        public c() {
            a();
        }

        public static c a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (c) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7840f623", new Object[]{bArr}) : MessageNano.mergeFrom(new c(), bArr));
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode != 1607980598) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.computeSerializedSize());
            }
        }

        public c a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("6fddc10a", new Object[]{this});
            }
            this.f32183a = 0L;
            this.b = 0;
            this.c = 0;
            this.d = a.a();
            this.cachedSize = -1;
            return this;
        }

        public c a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("831f87fd", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    this.f32183a = aVar.f();
                } else if (a2 == 16) {
                    this.b = aVar.g();
                } else if (a2 == 24) {
                    this.c = aVar.g();
                } else if (a2 == 34) {
                    int b = com.google.protobuf.nano.e.b(aVar, 34);
                    a[] aVarArr = this.d;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    a[] aVarArr2 = new a[b + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, aVarArr2, 0, length);
                    }
                    while (length < aVarArr2.length - 1) {
                        aVarArr2[length] = new a();
                        aVar.a(aVarArr2[length]);
                        aVar.a();
                        length++;
                    }
                    aVarArr2[length] = new a();
                    aVar.a(aVarArr2[length]);
                    this.d = aVarArr2;
                } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            long j = this.f32183a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(1, j);
            }
            int i2 = this.b;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i2);
            }
            int i3 = this.c;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(3, i3);
            }
            a[] aVarArr = this.d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.d(4, aVar);
                    }
                    i++;
                }
            }
            return computeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                return;
            }
            long j = this.f32183a;
            if (j != 0) {
                codedOutputByteBufferNano.b(1, j);
            }
            int i2 = this.b;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(2, i2);
            }
            int i3 = this.c;
            if (i3 != 0) {
                codedOutputByteBufferNano.a(3, i3);
            }
            a[] aVarArr = this.d;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.d;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.b(4, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes8.dex */
    public static final class d extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f32185a;
        public Map<String, String> b;

        static {
            kge.a(-1942657516);
        }

        public d() {
            a();
        }

        public static d a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (d) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7840f642", new Object[]{bArr}) : MessageNano.mergeFrom(new d(), bArr));
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode != 1607980598) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.computeSerializedSize());
            }
        }

        public d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("6fddc129", new Object[]{this});
            }
            this.f32185a = "";
            this.b = null;
            this.cachedSize = -1;
            return this;
        }

        public d a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("831f881c", new Object[]{this, aVar});
            }
            c.b a2 = com.google.protobuf.nano.c.a();
            while (true) {
                int a3 = aVar.a();
                if (a3 == 0) {
                    return this;
                }
                if (a3 == 10) {
                    this.f32185a = aVar.k();
                } else if (a3 == 18) {
                    this.b = com.google.protobuf.nano.b.a(aVar, this.b, a2, 9, 9, null, 10, 18);
                } else if (!com.google.protobuf.nano.e.a(aVar, a3)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f32185a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f32185a);
            }
            Map<String, String> map = this.b;
            return map != null ? computeSerializedSize + com.google.protobuf.nano.b.a(map, 2, 9, 9) : computeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                return;
            }
            if (!this.f32185a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f32185a);
            }
            Map<String, String> map = this.b;
            if (map != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map, 2, 9, 9);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes8.dex */
    public static final class e extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32186a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(185114269);
        }

        public e() {
            a();
        }

        public static e a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (e) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7840f661", new Object[]{bArr}) : MessageNano.mergeFrom(new e(), bArr));
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode != 1607980598) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.computeSerializedSize());
            }
        }

        public e a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("6fddc148", new Object[]{this});
            }
            this.f32186a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.cachedSize = -1;
            return this;
        }

        public e a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("831f883b", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    this.f32186a = aVar.g();
                } else if (a2 == 16) {
                    this.b = aVar.g();
                } else if (a2 == 24) {
                    this.c = aVar.g();
                } else if (a2 == 32) {
                    this.d = aVar.g();
                } else if (a2 == 40) {
                    this.e = aVar.g();
                } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            int i = this.f32186a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(1, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i2);
            }
            int i3 = this.c;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(3, i3);
            }
            int i4 = this.d;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(4, i4);
            }
            int i5 = this.e;
            return i5 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.g(5, i5) : computeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                return;
            }
            int i = this.f32186a;
            if (i != 0) {
                codedOutputByteBufferNano.a(1, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(2, i2);
            }
            int i3 = this.c;
            if (i3 != 0) {
                codedOutputByteBufferNano.a(3, i3);
            }
            int i4 = this.d;
            if (i4 != 0) {
                codedOutputByteBufferNano.a(4, i4);
            }
            int i5 = this.e;
            if (i5 != 0) {
                codedOutputByteBufferNano.a(5, i5);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes8.dex */
    public static final class f extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public a[] f32187a;

        /* loaded from: classes8.dex */
        public static final class a extends MessageNano {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private static volatile a[] d;

            /* renamed from: a  reason: collision with root package name */
            public String f32188a;
            public String b;
            public long c;

            static {
                kge.a(-695363973);
            }

            public a() {
                b();
            }

            public static a[] a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a[]) ipChange.ipc$dispatch("ec113589", new Object[0]);
                }
                if (d == null) {
                    synchronized (com.google.protobuf.nano.b.LAZY_INIT_LOCK) {
                        if (d == null) {
                            d = new a[0];
                        }
                    }
                }
                return d;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1282848581) {
                    super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                    return null;
                } else if (hashCode != 1607980598) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    return new Integer(super.computeSerializedSize());
                }
            }

            public a a(com.google.protobuf.nano.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("395e8f7d", new Object[]{this, aVar});
                }
                while (true) {
                    int a2 = aVar.a();
                    if (a2 == 0) {
                        return this;
                    }
                    if (a2 == 10) {
                        this.f32188a = aVar.k();
                    } else if (a2 == 18) {
                        this.b = aVar.k();
                    } else if (a2 == 24) {
                        this.c = aVar.f();
                    } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        return this;
                    }
                }
            }

            public a b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("d1049729", new Object[]{this});
                }
                this.f32188a = "";
                this.b = "";
                this.c = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.MessageNano
            public int computeSerializedSize() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
                }
                int computeSerializedSize = super.computeSerializedSize();
                if (!this.f32188a.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f32188a);
                }
                if (!this.b.equals("")) {
                    computeSerializedSize += CodedOutputByteBufferNano.b(2, this.b);
                }
                long j = this.c;
                return j != 0 ? computeSerializedSize + CodedOutputByteBufferNano.g(3, j) : computeSerializedSize;
            }

            @Override // com.google.protobuf.nano.MessageNano
            public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
            }

            @Override // com.google.protobuf.nano.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                    return;
                }
                if (!this.f32188a.equals("")) {
                    codedOutputByteBufferNano.a(1, this.f32188a);
                }
                if (!this.b.equals("")) {
                    codedOutputByteBufferNano.a(2, this.b);
                }
                long j = this.c;
                if (j != 0) {
                    codedOutputByteBufferNano.b(3, j);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        static {
            kge.a(185173012);
        }

        public f() {
            a();
        }

        public static f a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (f) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7840f680", new Object[]{bArr}) : MessageNano.mergeFrom(new f(), bArr));
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode != 1607980598) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Integer(super.computeSerializedSize());
            }
        }

        public f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("6fddc167", new Object[]{this});
            }
            this.f32187a = a.a();
            this.cachedSize = -1;
            return this;
        }

        public f a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("831f885a", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    int b = com.google.protobuf.nano.e.b(aVar, 10);
                    a[] aVarArr = this.f32187a;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    a[] aVarArr2 = new a[b + length];
                    if (length != 0) {
                        System.arraycopy(this.f32187a, 0, aVarArr2, 0, length);
                    }
                    while (length < aVarArr2.length - 1) {
                        aVarArr2[length] = new a();
                        aVar.a(aVarArr2[length]);
                        aVar.a();
                        length++;
                    }
                    aVarArr2[length] = new a();
                    aVar.a(aVarArr2[length]);
                    this.f32187a = aVarArr2;
                } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                    return this;
                }
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            a[] aVarArr = this.f32187a;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f32187a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.d(1, aVar);
                    }
                    i++;
                }
            }
            return computeSerializedSize;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public /* synthetic */ MessageNano mergeFrom(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MessageNano) ipChange.ipc$dispatch("68405ab3", new Object[]{this, aVar}) : a(aVar);
        }

        @Override // com.google.protobuf.nano.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
                return;
            }
            a[] aVarArr = this.f32187a;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    a[] aVarArr2 = this.f32187a;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    a aVar = aVarArr2[i];
                    if (aVar != null) {
                        codedOutputByteBufferNano.b(1, aVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
