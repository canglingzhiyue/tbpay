package com.alibaba.ariver.kernel.api.bytedata;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ByteArrayPools {
    static {
        kge.a(-1020245569);
    }

    /* loaded from: classes2.dex */
    public static abstract class ByteArrayPool extends Pool<byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-365139032);
        }

        public static /* synthetic */ Object ipc$super(ByteArrayPool byteArrayPool, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -710787569) {
                super.free((ByteArrayPool) objArr[0]);
                return null;
            } else if (hashCode != -232228346) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.obtain();
            }
        }

        private ByteArrayPool() {
            super(1, 8);
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public synchronized byte[] obtain() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("f598bb1", new Object[]{this});
            }
            return (byte[]) super.obtain();
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public synchronized void free(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("874588fa", new Object[]{this, bArr});
            } else {
                super.free((ByteArrayPool) bArr);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteArray2Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1536962946);
        }

        public ByteArray2Pool() {
            super();
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[2];
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteArray4Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1538809988);
        }

        public ByteArray4Pool() {
            super();
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[4];
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteArray8Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1542504072);
        }

        public ByteArray8Pool() {
            super();
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[8];
        }
    }

    /* loaded from: classes2.dex */
    public static class ByteArray127Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2048596102);
        }

        public ByteArray127Pool() {
            super();
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[127];
        }
    }
}
