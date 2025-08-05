package com.taobao.android.detail.ttdetail.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import tb.kge;

/* loaded from: classes5.dex */
public class IOUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(556491418);
    }

    public static byte[] a(InputStream inputStream) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bfed3712", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8efb2ad0", new Object[]{inputStream, outputStream})).intValue();
        }
        long b = b(inputStream, outputStream);
        if (b <= 2147483647L) {
            return (int) b;
        }
        return -1;
    }

    private static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8c5ccb0", new Object[]{inputStream, outputStream})).longValue() : a(inputStream, outputStream, new byte[4096]);
    }

    private static long a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcf25c58", new Object[]{inputStream, outputStream, bArr})).longValue();
        }
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* loaded from: classes5.dex */
    public static class StringBuilderWriter extends Writer implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final StringBuilder builder = new StringBuilder();

        static {
            kge.a(1921536563);
            kge.a(1028243835);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            }
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            }
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo890append(char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("29d0c7fa", new Object[]{this, new Character(c)});
            }
            this.builder.append(c);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo891append(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("d009be91", new Object[]{this, charSequence});
            }
            this.builder.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo892append(CharSequence charSequence, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("2d25b771", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
            }
            this.builder.append(charSequence, i, i2);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc66d130", new Object[]{this, str});
            } else if (str == null) {
            } else {
                this.builder.append(str);
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ba2c8ce", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            } else if (cArr == null) {
            } else {
                this.builder.append(cArr, i, i2);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.builder.toString();
        }
    }
}
