package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.c;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public interface njw {
    public static final int ACK = 1;
    public static final int Android = 0;
    public static final int Js = 2;
    public static final int NONE = 0;
    public static final int STATUS = 0;
    public static final int SUBSCRIBED = 1;
    public static final int UN_SUB = 2;
    public static final int iOS = 1;

    /* loaded from: classes7.dex */
    public static final class a extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d[] f31509a;
        public d[] b;

        static {
            kge.a(655917687);
        }

        public a() {
            a();
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
                return (a) ipChange.ipc$dispatch("6e007326", new Object[]{this});
            }
            this.f31509a = d.a();
            this.b = d.a();
            this.cachedSize = -1;
            return this;
        }

        public a a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81423a19", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    int b = com.google.protobuf.nano.e.b(aVar, 10);
                    d[] dVarArr = this.f31509a;
                    int length = dVarArr == null ? 0 : dVarArr.length;
                    d[] dVarArr2 = new d[b + length];
                    if (length != 0) {
                        System.arraycopy(this.f31509a, 0, dVarArr2, 0, length);
                    }
                    while (length < dVarArr2.length - 1) {
                        dVarArr2[length] = new d();
                        aVar.a(dVarArr2[length]);
                        aVar.a();
                        length++;
                    }
                    dVarArr2[length] = new d();
                    aVar.a(dVarArr2[length]);
                    this.f31509a = dVarArr2;
                } else if (a2 == 18) {
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    d[] dVarArr3 = this.b;
                    int length2 = dVarArr3 == null ? 0 : dVarArr3.length;
                    d[] dVarArr4 = new d[b2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.b, 0, dVarArr4, 0, length2);
                    }
                    while (length2 < dVarArr4.length - 1) {
                        dVarArr4[length2] = new d();
                        aVar.a(dVarArr4[length2]);
                        aVar.a();
                        length2++;
                    }
                    dVarArr4[length2] = new d();
                    aVar.a(dVarArr4[length2]);
                    this.b = dVarArr4;
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
            d[] dVarArr = this.f31509a;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = computeSerializedSize;
                int i3 = 0;
                while (true) {
                    d[] dVarArr2 = this.f31509a;
                    if (i3 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i3];
                    if (dVar != null) {
                        i2 += CodedOutputByteBufferNano.d(1, dVar);
                    }
                    i3++;
                }
                computeSerializedSize = i2;
            }
            d[] dVarArr3 = this.b;
            if (dVarArr3 != null && dVarArr3.length > 0) {
                while (true) {
                    d[] dVarArr4 = this.b;
                    if (i >= dVarArr4.length) {
                        break;
                    }
                    d dVar2 = dVarArr4[i];
                    if (dVar2 != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.d(2, dVar2);
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
            d[] dVarArr = this.f31509a;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    d[] dVarArr2 = this.f31509a;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        codedOutputByteBufferNano.b(1, dVar);
                    }
                    i2++;
                }
            }
            d[] dVarArr3 = this.b;
            if (dVarArr3 != null && dVarArr3.length > 0) {
                while (true) {
                    d[] dVarArr4 = this.b;
                    if (i >= dVarArr4.length) {
                        break;
                    }
                    d dVar2 = dVarArr4[i];
                    if (dVar2 != null) {
                        codedOutputByteBufferNano.b(2, dVar2);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f31510a;
        public int b;
        public int c;
        public int d;
        public Map<String, String> e;

        static {
            kge.a(101777701);
        }

        public b() {
            a();
        }

        public static b a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (b) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a85e", new Object[]{bArr}) : MessageNano.mergeFrom(new b(), bArr));
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
                return (b) ipChange.ipc$dispatch("6e007345", new Object[]{this});
            }
            this.f31510a = 0;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = null;
            this.cachedSize = -1;
            return this;
        }

        public b a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("81423a38", new Object[]{this, aVar});
            }
            c.b a2 = com.google.protobuf.nano.c.a();
            while (true) {
                int a3 = aVar.a();
                if (a3 == 0) {
                    return this;
                }
                if (a3 == 16) {
                    this.f31510a = aVar.g();
                } else if (a3 == 24) {
                    this.b = aVar.g();
                } else if (a3 == 32) {
                    this.c = aVar.g();
                } else if (a3 == 40) {
                    this.d = aVar.g();
                } else if (a3 == 50) {
                    this.e = com.google.protobuf.nano.b.a(aVar, this.e, a2, 9, 9, null, 10, 18);
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
            int i = this.f31510a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(3, i2);
            }
            int i3 = this.c;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(4, i3);
            }
            int i4 = this.d;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(5, i4);
            }
            Map<String, String> map = this.e;
            return map != null ? computeSerializedSize + com.google.protobuf.nano.b.a(map, 6, 9, 9) : computeSerializedSize;
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
            int i = this.f31510a;
            if (i != 0) {
                codedOutputByteBufferNano.a(2, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(3, i2);
            }
            int i3 = this.c;
            if (i3 != 0) {
                codedOutputByteBufferNano.a(4, i3);
            }
            int i4 = this.d;
            if (i4 != 0) {
                codedOutputByteBufferNano.a(5, i4);
            }
            Map<String, String> map = this.e;
            if (map != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map, 6, 9, 9);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class c extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Double> f31511a;

        static {
            kge.a(-1018879639);
        }

        public c() {
            a();
        }

        public static c a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (c) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a87d", new Object[]{bArr}) : MessageNano.mergeFrom(new c(), bArr));
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
                return (c) ipChange.ipc$dispatch("6e007364", new Object[]{this});
            }
            this.f31511a = null;
            this.cachedSize = -1;
            return this;
        }

        public c a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("81423a57", new Object[]{this, aVar});
            }
            c.b a2 = com.google.protobuf.nano.c.a();
            while (true) {
                int a3 = aVar.a();
                if (a3 == 0) {
                    return this;
                }
                if (a3 == 10) {
                    this.f31511a = com.google.protobuf.nano.b.a(aVar, this.f31511a, a2, 9, 1, null, 10, 17);
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
            Map<String, Double> map = this.f31511a;
            return map != null ? computeSerializedSize + com.google.protobuf.nano.b.a(map, 1, 9, 1) : computeSerializedSize;
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
            Map<String, Double> map = this.f31511a;
            if (map != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map, 1, 9, 1);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class d extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static volatile d[] c;

        /* renamed from: a  reason: collision with root package name */
        public o f31512a;
        public e[] b;

        static {
            kge.a(45387895);
        }

        public d() {
            b();
        }

        public static d[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d[]) ipChange.ipc$dispatch("3ef382", new Object[0]);
            }
            if (c == null) {
                synchronized (com.google.protobuf.nano.b.LAZY_INIT_LOCK) {
                    if (c == null) {
                        c = new d[0];
                    }
                }
            }
            return c;
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

        public d a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("81423a76", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    if (this.f31512a == null) {
                        this.f31512a = new o();
                    }
                    aVar.a(this.f31512a);
                } else if (a2 == 18) {
                    int b = com.google.protobuf.nano.e.b(aVar, 18);
                    e[] eVarArr = this.b;
                    int length = eVarArr == null ? 0 : eVarArr.length;
                    e[] eVarArr2 = new e[b + length];
                    if (length != 0) {
                        System.arraycopy(this.b, 0, eVarArr2, 0, length);
                    }
                    while (length < eVarArr2.length - 1) {
                        eVarArr2[length] = new e();
                        aVar.a(eVarArr2[length]);
                        aVar.a();
                        length++;
                    }
                    eVarArr2[length] = new e();
                    aVar.a(eVarArr2[length]);
                    this.b = eVarArr2;
                } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                    return this;
                }
            }
        }

        public d b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4fde3d22", new Object[]{this});
            }
            this.f31512a = null;
            this.b = e.a();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.MessageNano
        public int computeSerializedSize() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
            }
            int computeSerializedSize = super.computeSerializedSize();
            o oVar = this.f31512a;
            if (oVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.d(1, oVar);
            }
            e[] eVarArr = this.b;
            if (eVarArr != null && eVarArr.length > 0) {
                while (true) {
                    e[] eVarArr2 = this.b;
                    if (i >= eVarArr2.length) {
                        break;
                    }
                    e eVar = eVarArr2[i];
                    if (eVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.d(2, eVar);
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
            o oVar = this.f31512a;
            if (oVar != null) {
                codedOutputByteBufferNano.b(1, oVar);
            }
            e[] eVarArr = this.b;
            if (eVarArr != null && eVarArr.length > 0) {
                while (true) {
                    e[] eVarArr2 = this.b;
                    if (i >= eVarArr2.length) {
                        break;
                    }
                    e eVar = eVarArr2[i];
                    if (eVar != null) {
                        codedOutputByteBufferNano.b(2, eVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class e extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static volatile e[] j;

        /* renamed from: a  reason: collision with root package name */
        public String f31513a;
        public String b;
        public int c;
        public long d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public String i;

        static {
            kge.a(1709576537);
        }

        public e() {
            b();
        }

        public static e[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e[]) ipChange.ipc$dispatch("3ef3a1", new Object[0]);
            }
            if (j == null) {
                synchronized (com.google.protobuf.nano.b.LAZY_INIT_LOCK) {
                    if (j == null) {
                        j = new e[0];
                    }
                }
            }
            return j;
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

        public e a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("81423a95", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    this.f31513a = aVar.k();
                } else if (a2 == 18) {
                    this.b = aVar.k();
                } else if (a2 == 24) {
                    this.c = aVar.m();
                } else if (a2 == 32) {
                    this.d = aVar.e();
                } else if (a2 == 40) {
                    this.e = aVar.m();
                } else if (a2 == 48) {
                    this.f = aVar.j();
                } else if (a2 == 56) {
                    this.g = aVar.m();
                } else if (a2 == 64) {
                    this.h = aVar.m();
                } else if (a2 == 74) {
                    this.i = aVar.k();
                } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                    return this;
                }
            }
        }

        public e b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("4fde3d41", new Object[]{this});
            }
            this.f31513a = "";
            this.b = "";
            this.c = 0;
            this.d = 0L;
            this.e = 0;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = "";
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
            if (!this.f31513a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f31513a);
            }
            if (!this.b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(2, this.b);
            }
            int i = this.c;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(3, i);
            }
            long j2 = this.d;
            if (j2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.f(4, j2);
            }
            int i2 = this.e;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(5, i2);
            }
            boolean z = this.f;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.b(6, z);
            }
            int i3 = this.g;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(7, i3);
            }
            int i4 = this.h;
            if (i4 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(8, i4);
            }
            return !this.i.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.b(9, this.i) : computeSerializedSize;
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
            if (!this.f31513a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31513a);
            }
            if (!this.b.equals("")) {
                codedOutputByteBufferNano.a(2, this.b);
            }
            int i = this.c;
            if (i != 0) {
                codedOutputByteBufferNano.c(3, i);
            }
            long j2 = this.d;
            if (j2 != 0) {
                codedOutputByteBufferNano.a(4, j2);
            }
            int i2 = this.e;
            if (i2 != 0) {
                codedOutputByteBufferNano.c(5, i2);
            }
            boolean z = this.f;
            if (z) {
                codedOutputByteBufferNano.a(6, z);
            }
            int i3 = this.g;
            if (i3 != 0) {
                codedOutputByteBufferNano.c(7, i3);
            }
            int i4 = this.h;
            if (i4 != 0) {
                codedOutputByteBufferNano.c(8, i4);
            }
            if (!this.i.equals("")) {
                codedOutputByteBufferNano.a(9, this.i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class f extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public g[] f31514a;

        static {
            kge.a(1398316044);
        }

        public f() {
            a();
        }

        public static f a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (f) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a8da", new Object[]{bArr}) : MessageNano.mergeFrom(new f(), bArr));
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
                return (f) ipChange.ipc$dispatch("6e0073c1", new Object[]{this});
            }
            this.f31514a = g.a();
            this.cachedSize = -1;
            return this;
        }

        public f a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("81423ab4", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    int b = com.google.protobuf.nano.e.b(aVar, 10);
                    g[] gVarArr = this.f31514a;
                    int length = gVarArr == null ? 0 : gVarArr.length;
                    g[] gVarArr2 = new g[b + length];
                    if (length != 0) {
                        System.arraycopy(this.f31514a, 0, gVarArr2, 0, length);
                    }
                    while (length < gVarArr2.length - 1) {
                        gVarArr2[length] = new g();
                        aVar.a(gVarArr2[length]);
                        aVar.a();
                        length++;
                    }
                    gVarArr2[length] = new g();
                    aVar.a(gVarArr2[length]);
                    this.f31514a = gVarArr2;
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
            g[] gVarArr = this.f31514a;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    g[] gVarArr2 = this.f31514a;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.d(1, gVar);
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
            g[] gVarArr = this.f31514a;
            if (gVarArr != null && gVarArr.length > 0) {
                while (true) {
                    g[] gVarArr2 = this.f31514a;
                    if (i >= gVarArr2.length) {
                        break;
                    }
                    g gVar = gVarArr2[i];
                    if (gVar != null) {
                        codedOutputByteBufferNano.b(1, gVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class g extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static volatile g[] g;

        /* renamed from: a  reason: collision with root package name */
        public String f31515a;
        public int b;
        public byte[] c;
        public Map<String, String> d;
        public Map<String, String> e;
        public long f;

        static {
            kge.a(-810961584);
        }

        public g() {
            b();
        }

        public static g[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g[]) ipChange.ipc$dispatch("3ef3df", new Object[0]);
            }
            if (g == null) {
                synchronized (com.google.protobuf.nano.b.LAZY_INIT_LOCK) {
                    if (g == null) {
                        g = new g[0];
                    }
                }
            }
            return g;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
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

        public g a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("81423ad3", new Object[]{this, aVar});
            }
            c.b a2 = com.google.protobuf.nano.c.a();
            while (true) {
                int a3 = aVar.a();
                if (a3 == 0) {
                    return this;
                }
                if (a3 == 10) {
                    this.f31515a = aVar.k();
                } else if (a3 == 16) {
                    this.b = aVar.g();
                } else if (a3 == 26) {
                    this.c = aVar.l();
                } else if (a3 == 34) {
                    this.d = com.google.protobuf.nano.b.a(aVar, this.d, a2, 9, 9, null, 10, 18);
                } else if (a3 == 42) {
                    this.e = com.google.protobuf.nano.b.a(aVar, this.e, a2, 9, 9, null, 10, 18);
                } else if (a3 == 48) {
                    this.f = aVar.f();
                } else if (!com.google.protobuf.nano.e.a(aVar, a3)) {
                    return this;
                }
            }
        }

        public g b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("4fde3d7f", new Object[]{this});
            }
            this.f31515a = "";
            this.b = 0;
            this.c = com.google.protobuf.nano.e.EMPTY_BYTES;
            this.d = null;
            this.e = null;
            this.f = 0L;
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
            if (!this.f31515a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f31515a);
            }
            int i = this.b;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i);
            }
            if (!Arrays.equals(this.c, com.google.protobuf.nano.e.EMPTY_BYTES)) {
                computeSerializedSize += CodedOutputByteBufferNano.b(3, this.c);
            }
            Map<String, String> map = this.d;
            if (map != null) {
                computeSerializedSize += com.google.protobuf.nano.b.a(map, 4, 9, 9);
            }
            Map<String, String> map2 = this.e;
            if (map2 != null) {
                computeSerializedSize += com.google.protobuf.nano.b.a(map2, 5, 9, 9);
            }
            long j = this.f;
            return j != 0 ? computeSerializedSize + CodedOutputByteBufferNano.g(6, j) : computeSerializedSize;
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
            if (!this.f31515a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31515a);
            }
            int i = this.b;
            if (i != 0) {
                codedOutputByteBufferNano.a(2, i);
            }
            if (!Arrays.equals(this.c, com.google.protobuf.nano.e.EMPTY_BYTES)) {
                codedOutputByteBufferNano.a(3, this.c);
            }
            Map<String, String> map = this.d;
            if (map != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map, 4, 9, 9);
            }
            Map<String, String> map2 = this.e;
            if (map2 != null) {
                com.google.protobuf.nano.b.a(codedOutputByteBufferNano, map2, 5, 9, 9);
            }
            long j = this.f;
            if (j != 0) {
                codedOutputByteBufferNano.b(6, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class h extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31516a;
        public String b;
        public int c;
        public int d;
        public int e;
        public m f;
        public a g;

        static {
            kge.a(387702580);
        }

        public h() {
            a();
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
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

        public h a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("6e0073ff", new Object[]{this});
            }
            this.f31516a = "";
            this.b = "";
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
            this.cachedSize = -1;
            return this;
        }

        public h a(com.google.protobuf.nano.a aVar) {
            MessageNano messageNano;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("81423af2", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    this.f31516a = aVar.k();
                } else if (a2 == 18) {
                    this.b = aVar.k();
                } else if (a2 == 24) {
                    this.c = aVar.m();
                } else if (a2 == 32) {
                    int g = aVar.g();
                    if (g == 0 || g == 1) {
                        this.d = g;
                    }
                } else if (a2 != 40) {
                    if (a2 == 50) {
                        if (this.f == null) {
                            this.f = new m();
                        }
                        messageNano = this.f;
                    } else if (a2 == 58) {
                        if (this.g == null) {
                            this.g = new a();
                        }
                        messageNano = this.g;
                    } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        return this;
                    }
                    aVar.a(messageNano);
                } else {
                    int g2 = aVar.g();
                    if (g2 == 0 || g2 == 1 || g2 == 2) {
                        this.e = g2;
                    }
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
            if (!this.f31516a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f31516a);
            }
            if (!this.b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(2, this.b);
            }
            int i = this.c;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(3, i);
            }
            int i2 = this.d;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(4, i2);
            }
            int i3 = this.e;
            if (i3 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(5, i3);
            }
            m mVar = this.f;
            if (mVar != null) {
                computeSerializedSize += CodedOutputByteBufferNano.d(6, mVar);
            }
            a aVar = this.g;
            return aVar != null ? computeSerializedSize + CodedOutputByteBufferNano.d(7, aVar) : computeSerializedSize;
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
            if (!this.f31516a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31516a);
            }
            if (!this.b.equals("")) {
                codedOutputByteBufferNano.a(2, this.b);
            }
            int i = this.c;
            if (i != 0) {
                codedOutputByteBufferNano.c(3, i);
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(4, i2);
            }
            int i3 = this.e;
            if (i3 != 0) {
                codedOutputByteBufferNano.a(5, i3);
            }
            m mVar = this.f;
            if (mVar != null) {
                codedOutputByteBufferNano.b(6, mVar);
            }
            a aVar = this.g;
            if (aVar != null) {
                codedOutputByteBufferNano.b(7, aVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class i extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31517a;
        public String b;
        public long c;
        public boolean d;
        public String[] e;

        static {
            kge.a(-5519781);
        }

        public i() {
            a();
        }

        public static i a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (i) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a937", new Object[]{bArr}) : MessageNano.mergeFrom(new i(), bArr));
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
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

        public i a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("6e00741e", new Object[]{this});
            }
            this.f31517a = "";
            this.b = "";
            this.c = 0L;
            this.d = false;
            this.e = com.google.protobuf.nano.e.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        public i a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("81423b11", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 18) {
                    this.f31517a = aVar.k();
                } else if (a2 == 26) {
                    this.b = aVar.k();
                } else if (a2 == 32) {
                    this.c = aVar.f();
                } else if (a2 == 40) {
                    this.d = aVar.j();
                } else if (a2 == 50) {
                    int b = com.google.protobuf.nano.e.b(aVar, 50);
                    String[] strArr = this.e;
                    int length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[b + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = aVar.k();
                        aVar.a();
                        length++;
                    }
                    strArr2[length] = aVar.k();
                    this.e = strArr2;
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
            if (!this.f31517a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(2, this.f31517a);
            }
            if (!this.b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(3, this.b);
            }
            long j = this.c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(4, j);
            }
            boolean z = this.d;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.b(5, z);
            }
            String[] strArr = this.e;
            if (strArr == null || strArr.length <= 0) {
                return computeSerializedSize;
            }
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.e;
                if (i >= strArr2.length) {
                    return computeSerializedSize + i2 + (i3 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
                i++;
            }
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
            if (!this.f31517a.equals("")) {
                codedOutputByteBufferNano.a(2, this.f31517a);
            }
            if (!this.b.equals("")) {
                codedOutputByteBufferNano.a(3, this.b);
            }
            long j = this.c;
            if (j != 0) {
                codedOutputByteBufferNano.b(4, j);
            }
            boolean z = this.d;
            if (z) {
                codedOutputByteBufferNano.a(5, z);
            }
            String[] strArr = this.e;
            if (strArr != null && strArr.length > 0) {
                while (true) {
                    String[] strArr2 = this.e;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        codedOutputByteBufferNano.a(6, str);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class j extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31518a;

        static {
            kge.a(-5518904);
        }

        public j() {
            a();
        }

        public static j a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (j) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a956", new Object[]{bArr}) : MessageNano.mergeFrom(new j(), bArr));
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
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

        public j a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("6e00743d", new Object[]{this});
            }
            this.f31518a = "";
            this.cachedSize = -1;
            return this;
        }

        public j a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j) ipChange.ipc$dispatch("81423b30", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    this.f31518a = aVar.k();
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
            return !this.f31518a.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.b(1, this.f31518a) : computeSerializedSize;
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
            if (!this.f31518a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31518a);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class k extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31519a;
        public int b;
        public int c;
        public long d;
        public String e;

        static {
            kge.a(-1100443622);
        }

        public k() {
            a();
        }

        public static k a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (k) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a975", new Object[]{bArr}) : MessageNano.mergeFrom(new k(), bArr));
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
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

        public k a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("6e00745c", new Object[]{this});
            }
            this.f31519a = "";
            this.b = 0;
            this.c = 0;
            this.d = 0L;
            this.e = "";
            this.cachedSize = -1;
            return this;
        }

        public k a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("81423b4f", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    this.f31519a = aVar.k();
                } else if (a2 == 16) {
                    this.b = aVar.g();
                } else if (a2 == 24) {
                    this.c = aVar.g();
                } else if (a2 == 32) {
                    this.d = aVar.f();
                } else if (a2 == 42) {
                    this.e = aVar.k();
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
            if (!this.f31519a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f31519a);
            }
            int i = this.b;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(3, i2);
            }
            long j = this.d;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(4, j);
            }
            return !this.e.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.b(5, this.e) : computeSerializedSize;
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
            if (!this.f31519a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31519a);
            }
            int i = this.b;
            if (i != 0) {
                codedOutputByteBufferNano.a(2, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(3, i2);
            }
            long j = this.d;
            if (j != 0) {
                codedOutputByteBufferNano.b(4, j);
            }
            if (!this.e.equals("")) {
                codedOutputByteBufferNano.a(5, this.e);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class l extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f31520a;
        public int b;
        public int c;
        public String d;

        static {
            kge.a(247075945);
        }

        public l() {
            a();
        }

        public static l a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (l) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a994", new Object[]{bArr}) : MessageNano.mergeFrom(new l(), bArr));
        }

        public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
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

        public l a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("6e00747b", new Object[]{this});
            }
            this.f31520a = 0L;
            this.b = 0;
            this.c = 0;
            this.d = "";
            this.cachedSize = -1;
            return this;
        }

        public l a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l) ipChange.ipc$dispatch("81423b6e", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    this.f31520a = aVar.f();
                } else if (a2 == 16) {
                    this.b = aVar.g();
                } else if (a2 == 24) {
                    this.c = aVar.g();
                } else if (a2 == 34) {
                    this.d = aVar.k();
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
            long j = this.f31520a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(1, j);
            }
            int i = this.b;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i);
            }
            int i2 = this.c;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(3, i2);
            }
            return !this.d.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.b(4, this.d) : computeSerializedSize;
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
            long j = this.f31520a;
            if (j != 0) {
                codedOutputByteBufferNano.b(1, j);
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
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class m extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public o[] f31521a;

        static {
            kge.a(464374316);
        }

        public m() {
            a();
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
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

        public m a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("6e00749a", new Object[]{this});
            }
            this.f31521a = o.a();
            this.cachedSize = -1;
            return this;
        }

        public m a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m) ipChange.ipc$dispatch("81423b8d", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 26) {
                    int b = com.google.protobuf.nano.e.b(aVar, 26);
                    o[] oVarArr = this.f31521a;
                    int length = oVarArr == null ? 0 : oVarArr.length;
                    o[] oVarArr2 = new o[b + length];
                    if (length != 0) {
                        System.arraycopy(this.f31521a, 0, oVarArr2, 0, length);
                    }
                    while (length < oVarArr2.length - 1) {
                        oVarArr2[length] = new o();
                        aVar.a(oVarArr2[length]);
                        aVar.a();
                        length++;
                    }
                    oVarArr2[length] = new o();
                    aVar.a(oVarArr2[length]);
                    this.f31521a = oVarArr2;
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
            o[] oVarArr = this.f31521a;
            if (oVarArr != null && oVarArr.length > 0) {
                while (true) {
                    o[] oVarArr2 = this.f31521a;
                    if (i >= oVarArr2.length) {
                        break;
                    }
                    o oVar = oVarArr2[i];
                    if (oVar != null) {
                        computeSerializedSize += CodedOutputByteBufferNano.d(3, oVar);
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
            o[] oVarArr = this.f31521a;
            if (oVarArr != null && oVarArr.length > 0) {
                while (true) {
                    o[] oVarArr2 = this.f31521a;
                    if (i >= oVarArr2.length) {
                        break;
                    }
                    o oVar = oVarArr2[i];
                    if (oVar != null) {
                        codedOutputByteBufferNano.b(3, oVar);
                    }
                    i++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class n extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31522a;
        public int b;
        public String c;
        public int d;
        public String e;
        public long f;
        public String g;
        public String h;
        public String i;

        static {
            kge.a(1037693092);
        }

        public n() {
            a();
        }

        public static n a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return (n) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("7663a9d2", new Object[]{bArr}) : MessageNano.mergeFrom(new n(), bArr));
        }

        public static /* synthetic */ Object ipc$super(n nVar, String str, Object... objArr) {
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

        public n a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("6e0074b9", new Object[]{this});
            }
            this.f31522a = "";
            this.b = 0;
            this.c = "";
            this.d = 0;
            this.e = "";
            this.f = 0L;
            this.g = "";
            this.h = "";
            this.i = "";
            this.cachedSize = -1;
            return this;
        }

        public n a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("81423bac", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 10) {
                    this.f31522a = aVar.k();
                } else if (a2 == 16) {
                    this.b = aVar.g();
                } else if (a2 == 26) {
                    this.c = aVar.k();
                } else if (a2 == 32) {
                    this.d = aVar.g();
                } else if (a2 == 42) {
                    this.e = aVar.k();
                } else if (a2 == 48) {
                    this.f = aVar.f();
                } else if (a2 == 58) {
                    this.g = aVar.k();
                } else if (a2 == 66) {
                    this.h = aVar.k();
                } else if (a2 == 74) {
                    this.i = aVar.k();
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
            if (!this.f31522a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(1, this.f31522a);
            }
            int i = this.b;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(2, i);
            }
            if (!this.c.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(3, this.c);
            }
            int i2 = this.d;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(4, i2);
            }
            if (!this.e.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(5, this.e);
            }
            long j = this.f;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.g(6, j);
            }
            if (!this.g.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(7, this.g);
            }
            if (!this.h.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(8, this.h);
            }
            return !this.i.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.b(9, this.i) : computeSerializedSize;
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
            if (!this.f31522a.equals("")) {
                codedOutputByteBufferNano.a(1, this.f31522a);
            }
            int i = this.b;
            if (i != 0) {
                codedOutputByteBufferNano.a(2, i);
            }
            if (!this.c.equals("")) {
                codedOutputByteBufferNano.a(3, this.c);
            }
            int i2 = this.d;
            if (i2 != 0) {
                codedOutputByteBufferNano.a(4, i2);
            }
            if (!this.e.equals("")) {
                codedOutputByteBufferNano.a(5, this.e);
            }
            long j = this.f;
            if (j != 0) {
                codedOutputByteBufferNano.b(6, j);
            }
            if (!this.g.equals("")) {
                codedOutputByteBufferNano.a(7, this.g);
            }
            if (!this.h.equals("")) {
                codedOutputByteBufferNano.a(8, this.h);
            }
            if (!this.i.equals("")) {
                codedOutputByteBufferNano.a(9, this.i);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* loaded from: classes7.dex */
    public static final class o extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static volatile o[] h;

        /* renamed from: a  reason: collision with root package name */
        public int f31523a;
        public String b;
        public long c;
        public String d;
        public boolean e;
        public int f;
        public int g;

        static {
            kge.a(-1246212221);
        }

        public o() {
            b();
        }

        public static o[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o[]) ipChange.ipc$dispatch("3ef4d7", new Object[0]);
            }
            if (h == null) {
                synchronized (com.google.protobuf.nano.b.LAZY_INIT_LOCK) {
                    if (h == null) {
                        h = new o[0];
                    }
                }
            }
            return h;
        }

        public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
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

        public o a(com.google.protobuf.nano.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o) ipChange.ipc$dispatch("81423bcb", new Object[]{this, aVar});
            }
            while (true) {
                int a2 = aVar.a();
                if (a2 == 0) {
                    return this;
                }
                if (a2 == 8) {
                    this.f31523a = aVar.m();
                } else if (a2 == 18) {
                    this.b = aVar.k();
                } else if (a2 == 24) {
                    this.c = aVar.e();
                } else if (a2 == 34) {
                    this.d = aVar.k();
                } else if (a2 == 40) {
                    this.e = aVar.j();
                } else if (a2 == 48) {
                    this.f = aVar.m();
                } else if (a2 == 56) {
                    this.g = aVar.m();
                } else if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                    return this;
                }
            }
        }

        public o b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o) ipChange.ipc$dispatch("4fde3e77", new Object[]{this});
            }
            this.f31523a = 0;
            this.b = "";
            this.c = 0L;
            this.d = "";
            this.e = false;
            this.f = 0;
            this.g = 0;
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
            int i = this.f31523a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(1, i);
            }
            if (!this.b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(2, this.b);
            }
            long j = this.c;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.f(3, j);
            }
            if (!this.d.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.b(4, this.d);
            }
            boolean z = this.e;
            if (z) {
                computeSerializedSize += CodedOutputByteBufferNano.b(5, z);
            }
            int i2 = this.f;
            if (i2 != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.i(6, i2);
            }
            int i3 = this.g;
            return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.i(7, i3) : computeSerializedSize;
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
            int i = this.f31523a;
            if (i != 0) {
                codedOutputByteBufferNano.c(1, i);
            }
            if (!this.b.equals("")) {
                codedOutputByteBufferNano.a(2, this.b);
            }
            long j = this.c;
            if (j != 0) {
                codedOutputByteBufferNano.a(3, j);
            }
            if (!this.d.equals("")) {
                codedOutputByteBufferNano.a(4, this.d);
            }
            boolean z = this.e;
            if (z) {
                codedOutputByteBufferNano.a(5, z);
            }
            int i2 = this.f;
            if (i2 != 0) {
                codedOutputByteBufferNano.c(6, i2);
            }
            int i3 = this.g;
            if (i3 != 0) {
                codedOutputByteBufferNano.c(7, i3);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
