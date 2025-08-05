package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.e;
import java.util.Map;

/* loaded from: classes7.dex */
public interface njx {

    /* loaded from: classes7.dex */
    public static final class a extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31524a;
        public int b;
        public int c;
        public String d;
        public String e;
        public String f;
        public int g;
        public String h;
        public String i;
        public int j;
        public C1160a k;
        public int l;
        public Map<String, String> m;
        public Map<String, String> n;
        public long o;
        public String p;

        /* renamed from: tb.njx$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C1160a extends MessageNano {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f31525a;
            public int b;

            static {
                kge.a(769038345);
            }

            public C1160a() {
                a();
            }

            public static /* synthetic */ Object ipc$super(C1160a c1160a, String str, Object... objArr) {
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

            public C1160a a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C1160a) ipChange.ipc$dispatch("f164cfe8", new Object[]{this});
                }
                this.f31525a = 0;
                this.b = 0;
                this.cachedSize = -1;
                return this;
            }

            public C1160a a(com.google.protobuf.nano.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C1160a) ipChange.ipc$dispatch("3b50a61b", new Object[]{this, aVar});
                }
                while (true) {
                    int a2 = aVar.a();
                    if (a2 == 0) {
                        return this;
                    }
                    if (a2 == 8) {
                        this.f31525a = aVar.g();
                    } else if (a2 == 16) {
                        this.b = aVar.g();
                    } else if (!e.a(aVar, a2)) {
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
                int i = this.f31525a;
                if (i != 0) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, i);
                }
                int i2 = this.b;
                return i2 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.g(2, i2) : computeSerializedSize;
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
                int i = this.f31525a;
                if (i != 0) {
                    codedOutputByteBufferNano.a(1, i);
                }
                int i2 = this.b;
                if (i2 != 0) {
                    codedOutputByteBufferNano.a(2, i2);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        static {
            kge.a(405653981);
        }

        public a() {
            a();
        }

        public static a a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("76641c9e", new Object[]{bArr}) : MessageNano.mergeFrom(new a(), bArr));
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
                return (a) ipChange.ipc$dispatch("6e00e785", new Object[]{this});
            }
            this.f31524a = "";
            this.b = 0;
            this.c = 0;
            this.d = "";
            this.e = "";
            this.f = "";
            this.g = 0;
            this.h = "";
            this.i = "";
            this.j = 0;
            this.k = null;
            this.l = 0;
            this.m = null;
            this.n = null;
            this.o = 0L;
            this.p = "";
            this.cachedSize = -1;
            return this;
        }

        public a a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (!(ipChange instanceof IpChange)) {
                c.b a2 = c.a();
                while (true) {
                    int a3 = aVar.a();
                    switch (a3) {
                        case 0:
                            return this;
                        case 10:
                            this.f31524a = aVar.k();
                            break;
                        case 16:
                            this.b = aVar.g();
                            break;
                        case 24:
                            this.c = aVar.g();
                            break;
                        case 34:
                            this.d = aVar.k();
                            break;
                        case 42:
                            this.e = aVar.k();
                            break;
                        case 50:
                            this.f = aVar.k();
                            break;
                        case 56:
                            this.g = aVar.g();
                            break;
                        case 66:
                            this.h = aVar.k();
                            break;
                        case 74:
                            this.i = aVar.k();
                            break;
                        case 80:
                            this.j = aVar.g();
                            break;
                        case 90:
                            if (this.k == null) {
                                this.k = new C1160a();
                            }
                            aVar.a(this.k);
                            break;
                        case 96:
                            this.l = aVar.g();
                            break;
                        case 106:
                            this.m = b.a(aVar, this.m, a2, 9, 9, null, 10, 18);
                            break;
                        case 114:
                            this.n = b.a(aVar, this.n, a2, 9, 9, null, 10, 18);
                            break;
                        case 120:
                            this.o = aVar.f();
                            break;
                        case 130:
                            this.p = aVar.k();
                            break;
                        default:
                            if (e.a(aVar, a3)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            } else {
                return (a) ipChange.ipc$dispatch("8142ae78", new Object[]{this, aVar});
            }
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            if (!this.f31524a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f31524a);
            }
            int i = this.b;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(3, i2);
            }
            if (!this.d.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(4, this.d);
            }
            if (!this.e.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(5, this.e);
            }
            if (!this.f.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(6, this.f);
            }
            int i3 = this.g;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(7, i3);
            }
            if (!this.h.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(8, this.h);
            }
            if (!this.i.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(9, this.i);
            }
            int i4 = this.j;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(10, i4);
            }
            C1160a c1160a = this.k;
            if (c1160a != null) {
                computeSerializedSize += CodedOutputByteBufferNano.d(11, c1160a);
            }
            int i5 = this.l;
            if (i5 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(12, i5);
            }
            Map<String, String> map = this.m;
            if (map != null) {
                computeSerializedSize += b.a(map, 13, 9, 9);
            }
            Map<String, String> map2 = this.n;
            if (map2 != null) {
                computeSerializedSize += b.a(map2, 14, 9, 9);
            }
            long j = this.o;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(15, j);
            }
            return !this.p.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.b(16, this.p) : computeSerializedSize;
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
            if (!this.f31524a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31524a);
            }
            int i = this.b;
            if (i != 0) {
                codedOutputByteBufferNano.a(2, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(3, i2);
            }
            if (!this.d.equals("")) {
                codedOutputByteBufferNano.a(4, this.d);
            }
            if (!this.e.equals("")) {
                codedOutputByteBufferNano.a(5, this.e);
            }
            if (!this.f.equals("")) {
                codedOutputByteBufferNano.a(6, this.f);
            }
            int i3 = this.g;
            if (i3 != 0) {
                codedOutputByteBufferNano.a(7, i3);
            }
            if (!this.h.equals("")) {
                codedOutputByteBufferNano.a(8, this.h);
            }
            if (!this.i.equals("")) {
                codedOutputByteBufferNano.a(9, this.i);
            }
            int i4 = this.j;
            if (i4 != 0) {
                codedOutputByteBufferNano.a(10, i4);
            }
            C1160a c1160a = this.k;
            if (c1160a != null) {
                codedOutputByteBufferNano.b(11, c1160a);
            }
            int i5 = this.l;
            if (i5 != 0) {
                codedOutputByteBufferNano.a(12, i5);
            }
            Map<String, String> map = this.m;
            if (map != null) {
                b.a(codedOutputByteBufferNano, map, 13, 9, 9);
            }
            Map<String, String> map2 = this.n;
            if (map2 != null) {
                b.a(codedOutputByteBufferNano, map2, 14, 9, 9);
            }
            long j = this.o;
            if (j != 0) {
                codedOutputByteBufferNano.b(15, j);
            }
            if (!this.p.equals("")) {
                codedOutputByteBufferNano.a(16, this.p);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
