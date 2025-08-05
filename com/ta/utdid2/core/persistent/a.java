package com.ta.utdid2.core.persistent;

import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class a implements XmlSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f8139a;
    private int c;
    private Writer d;
    private OutputStream e;
    private CharsetEncoder f;
    private boolean h;
    private final char[] b = new char[8192];
    private ByteBuffer g = ByteBuffer.allocate(8192);

    static {
        kge.a(-912077156);
        kge.a(1477900275);
        f8139a = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    }

    private void a(char c) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217d15", new Object[]{this, new Character(c)});
            return;
        }
        int i = this.c;
        if (i >= 8191) {
            flush();
            i = this.c;
        }
        this.b[i] = c;
        this.c = i + 1;
    }

    private void a(String str, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
        } else {
            int i5 = this.c;
            if (i5 + i2 > 8192) {
                flush();
                i5 = this.c;
            }
            str.getChars(i, i + i2, this.b, i5);
            this.c = i5 + i2;
        }
    }

    private void a(char[] cArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb78cf50", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
        } else if (i2 > 8192) {
            int i3 = i2 + i;
            while (i < i3) {
                int i4 = i + 8192;
                a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
        } else {
            int i5 = this.c;
            if (i5 + i2 > 8192) {
                flush();
                i5 = this.c;
            }
            System.arraycopy(cArr, i, this.b, i5, i2);
            this.c = i5 + i2;
        }
    }

    private void a(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, 0, str.length());
        }
    }

    private void b(String str) throws IOException {
        String str2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        int length = str.length();
        String[] strArr = f8139a;
        char length2 = (char) strArr.length;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    a(str, i2, i - i2);
                }
                i2 = i + 1;
                a(str2);
            }
            i++;
        }
        if (i2 >= i) {
            return;
        }
        a(str, i2, i - i2);
    }

    private void b(char[] cArr, int i, int i2) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbd3e51", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            return;
        }
        String[] strArr = f8139a;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    a(cArr, i4, i - i4);
                }
                i4 = i + 1;
                a(str);
            }
            i++;
        }
        if (i4 >= i) {
            return;
        }
        a(cArr, i4, i - i4);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("f9decb51", new Object[]{this, str, str2, str3});
        }
        a(' ');
        if (str != null) {
            a(str);
            a(riy.CONDITION_IF_MIDDLE);
        }
        a(str2);
        a("=\"");
        b(str3);
        a('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a1e09b5", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa287b0", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3085eaf3", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df5bc9d", new Object[]{this});
        } else {
            flush();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("6298b4d8", new Object[]{this, str, str2});
        }
        if (this.h) {
            a(" />\n");
        } else {
            a("</");
            if (str != null) {
                a(str);
                a(riy.CONDITION_IF_MIDDLE);
            }
            a(str2);
            a(">\n");
        }
        this.h = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b208441", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int position = this.g.position();
        if (position <= 0) {
            return;
        }
        this.g.flip();
        this.e.write(this.g.array(), 0, position);
        this.g.clear();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i <= 0) {
            return;
        }
        if (this.e != null) {
            CharBuffer wrap = CharBuffer.wrap(this.b, 0, i);
            CoderResult encode = this.f.encode(wrap, this.g, true);
            while (!encode.isError()) {
                if (encode.isOverflow()) {
                    a();
                    encode = this.f.encode(wrap, this.g, true);
                } else {
                    a();
                    this.e.flush();
                }
            }
            throw new IOException(encode.toString());
        }
        this.d.write(this.b, 0, i);
        this.d.flush();
        this.c = 0;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public int getDepth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d67aa707", new Object[]{this})).intValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public boolean getFeature(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5316155", new Object[]{this, str})).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b8e8a25", new Object[]{this, str, new Boolean(z)});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public Object getProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("955d4716", new Object[]{this, str});
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56f7a3b", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5719e7cc", new Object[]{this, str});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97184baf", new Object[]{this, str, new Boolean(z)});
        } else if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3b3846", new Object[]{this, outputStream, str});
        } else if (outputStream == null) {
            throw new IllegalArgumentException();
        } else {
            try {
                this.f = Charset.forName(str).newEncoder();
                this.e = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7170b6a", new Object[]{this, writer});
        } else {
            this.d = writer;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678427af", new Object[]{this, str, str2});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda92184", new Object[]{this, str, obj});
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2173be1f", new Object[]{this, str, bool});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? Constants.VAL_YES : "no");
        sb.append("' ?>\n");
        a(sb.toString());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("bda5c15f", new Object[]{this, str, str2});
        }
        if (this.h) {
            a(">\n");
        }
        a('<');
        if (str != null) {
            a(str);
            a(riy.CONDITION_IF_MIDDLE);
        }
        a(str2);
        this.h = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("99458fd6", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
        }
        if (this.h) {
            a(">");
            this.h = false;
        }
        b(cArr, i, i2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("e0764b34", new Object[]{this, str});
        }
        if (this.h) {
            a(">");
            this.h = false;
        }
        b(str);
        return this;
    }
}
