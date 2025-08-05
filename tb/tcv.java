package tb;

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
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes4.dex */
public class tcv implements XmlSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f34032a;
    private static String b;
    private final int c;
    private final char[] d;
    private int e;
    private Writer f;
    private OutputStream g;
    private CharsetEncoder h;
    private ByteBuffer i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;

    static {
        kge.a(539694071);
        kge.a(1477900275);
        f34032a = new String[]{"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
        b = "                                                              ";
    }

    public tcv() {
        this(32768);
    }

    public tcv(int i) {
        this.j = false;
        this.l = 0;
        this.m = true;
        this.c = i <= 0 ? 32768 : i;
        int i2 = this.c;
        this.d = new char[i2];
        this.i = ByteBuffer.allocate(i2);
    }

    private void a(char c) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217d15", new Object[]{this, new Character(c)});
            return;
        }
        int i = this.e;
        if (i >= this.c - 1) {
            flush();
            i = this.e;
        }
        this.d[i] = c;
        this.e = i + 1;
    }

    private void a(String str, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.c;
        if (i2 <= i3) {
            int i4 = this.e;
            if (i4 + i2 > i3) {
                flush();
                i4 = this.e;
            }
            str.getChars(i, i + i2, this.d, i4);
            this.e = i4 + i2;
            return;
        }
        int i5 = i2 + i;
        while (i < i5) {
            int i6 = this.c;
            int i7 = i + i6;
            if (i7 >= i5) {
                i6 = i5 - i;
            }
            a(str, i, i6);
            i = i7;
        }
    }

    private void a(char[] cArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb78cf50", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.c;
        if (i2 <= i3) {
            int i4 = this.e;
            if (i4 + i2 > i3) {
                flush();
                i4 = this.e;
            }
            System.arraycopy(cArr, i, this.d, i4, i2);
            this.e = i4 + i2;
            return;
        }
        int i5 = i2 + i;
        while (i < i5) {
            int i6 = this.c;
            int i7 = i + i6;
            if (i7 >= i5) {
                i6 = i5 - i;
            }
            a(cArr, i, i6);
            i = i7;
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

    private void a(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = i << 2;
        if (i2 > b.length()) {
            i2 = b.length();
        }
        a(b, 0, i2);
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
        String[] strArr = f34032a;
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
        String[] strArr = f34032a;
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
        this.m = false;
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
        this.l--;
        if (this.k) {
            a(" />\n");
        } else {
            if (this.j && this.m) {
                a(this.l);
            }
            a("</");
            if (str != null) {
                a(str);
                a(riy.CONDITION_IF_MIDDLE);
            }
            a(str2);
            a(">\n");
        }
        this.m = true;
        this.k = false;
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
        int position = this.i.position();
        if (position <= 0) {
            return;
        }
        this.i.flip();
        this.g.write(this.i.array(), 0, position);
        this.i.clear();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        int i = this.e;
        if (i <= 0) {
            return;
        }
        if (this.g != null) {
            CharBuffer wrap = CharBuffer.wrap(this.d, 0, i);
            CoderResult encode = this.h.encode(wrap, this.i, true);
            while (!encode.isError()) {
                if (encode.isOverflow()) {
                    a();
                    encode = this.h.encode(wrap, this.i, true);
                } else {
                    a();
                    this.g.flush();
                }
            }
            throw new IOException(encode.toString());
        }
        this.f.write(this.d, 0, i);
        this.f.flush();
        this.e = 0;
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
        } else if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.j = true;
        } else {
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
                this.h = Charset.forName(str).newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
                this.g = outputStream;
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
            this.f = writer;
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
        this.m = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("bda5c15f", new Object[]{this, str, str2});
        }
        if (this.k) {
            a(">\n");
        }
        if (this.j) {
            a(this.l);
        }
        this.l++;
        a('<');
        if (str != null) {
            a(str);
            a(riy.CONDITION_IF_MIDDLE);
        }
        a(str2);
        this.k = true;
        this.m = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("99458fd6", new Object[]{this, cArr, new Integer(i), new Integer(i2)});
        }
        if (this.k) {
            a(">");
            this.k = false;
        }
        b(cArr, i, i2);
        if (this.j) {
            if (cArr[(i + i2) - 1] != '\n') {
                z = false;
            }
            this.m = z;
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (XmlSerializer) ipChange.ipc$dispatch("e0764b34", new Object[]{this, str});
        }
        if (this.k) {
            a(">");
            this.k = false;
        }
        b(str);
        if (this.j) {
            if (str.length() <= 0 || str.charAt(str.length() - 1) != '\n') {
                z = false;
            }
            this.m = z;
        }
        return this;
    }
}
