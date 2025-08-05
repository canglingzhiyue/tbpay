package com.taobao.android.sku.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.io.Writer;
import tb.kge;

/* loaded from: classes6.dex */
public class IOUtils {
    static {
        kge.a(-48001048);
    }

    /* loaded from: classes6.dex */
    public static class StringBuilderWriter extends Writer implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final StringBuilder builder = new StringBuilder();

        static {
            kge.a(1547881601);
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
        public Writer mo1018append(char c) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("29d0c7fa", new Object[]{this, new Character(c)});
            }
            this.builder.append(c);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo1019append(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Writer) ipChange.ipc$dispatch("d009be91", new Object[]{this, charSequence});
            }
            this.builder.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo1020append(CharSequence charSequence, int i, int i2) {
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
