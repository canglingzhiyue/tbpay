package com.taobao.android.weex_uikit.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class FunctionParser<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char SPACE = ' ';

    /* renamed from: a  reason: collision with root package name */
    private b<K, V> f16153a;
    private a b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum Token {
        FUNC_NAME,
        PARAM_VALUE,
        LEFT_PARENT,
        RIGHT_PARENT,
        COMMA
    }

    /* loaded from: classes6.dex */
    public static class WXInterpretationException extends RuntimeException {
        static {
            kge.a(1603594062);
        }

        private WXInterpretationException(String str) {
            super(str);
        }
    }

    /* loaded from: classes6.dex */
    public interface b<K, V> {
        Map<K, V> a(String str, List<String> list);
    }

    static {
        kge.a(1809387244);
    }

    public FunctionParser(String str, b<K, V> bVar) {
        this.b = new a(str);
        this.f16153a = bVar;
    }

    public LinkedHashMap<K, V> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("c2be5284", new Object[]{this});
        }
        a.a(this.b);
        return b();
    }

    private LinkedHashMap<K, V> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("ec0e3705", new Object[]{this});
        }
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>();
        do {
            linkedHashMap.putAll(c());
        } while (a.b(this.b) == Token.FUNC_NAME);
        return linkedHashMap;
    }

    private Map<K, V> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        String a2 = a(Token.FUNC_NAME);
        a(Token.LEFT_PARENT);
        linkedList.add(a(Token.PARAM_VALUE));
        while (a.b(this.b) == Token.COMMA) {
            a(Token.COMMA);
            linkedList.add(a(Token.PARAM_VALUE));
        }
        a(Token.RIGHT_PARENT);
        return this.f16153a.a(a2, linkedList);
    }

    private String a(Token token) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("233db008", new Object[]{this, token});
        }
        try {
            if (token != a.b(this.b)) {
                return "";
            }
            String c = a.c(this.b);
            a.a(this.b);
            return c;
        } catch (Exception unused) {
            g.d(token + "Token doesn't match" + a.d(this.b));
            return "";
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f16154a;
        private Token b;
        private String c;
        private int d;

        static {
            kge.a(39999284);
        }

        private boolean a(char c) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{this, new Character(c)})).booleanValue() : ('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28755094", new Object[]{aVar})).booleanValue() : aVar.c();
        }

        public static /* synthetic */ Token b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Token) ipChange.ipc$dispatch("47818adf", new Object[]{aVar}) : aVar.a();
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97a2b92", new Object[]{aVar}) : aVar.b();
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d285653", new Object[]{aVar}) : aVar.f16154a;
        }

        private a(String str) {
            this.d = 0;
            this.f16154a = str;
        }

        private Token a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Token) ipChange.ipc$dispatch("69aa1098", new Object[]{this}) : this.b;
        }

        private String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
        }

        private boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            int i = this.d;
            while (true) {
                if (this.d >= this.f16154a.length()) {
                    break;
                }
                char charAt = this.f16154a.charAt(this.d);
                if (charAt == ' ') {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    if (i != i2) {
                        break;
                    }
                    i++;
                } else if (a(charAt) || charAt == '.' || charAt == '%' || charAt == '-' || charAt == '+') {
                    this.d++;
                } else {
                    int i3 = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                    }
                }
            }
            int i4 = this.d;
            if (i != i4) {
                a(this.f16154a.substring(i, i4));
                return true;
            }
            this.b = null;
            this.c = null;
            return false;
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (riy.BRACKET_START_STR.equals(str)) {
                this.b = Token.LEFT_PARENT;
                this.c = riy.BRACKET_START_STR;
            } else if (riy.BRACKET_END_STR.equals(str)) {
                this.b = Token.RIGHT_PARENT;
                this.c = riy.BRACKET_END_STR;
            } else if (",".equals(str)) {
                this.b = Token.COMMA;
                this.c = ",";
            } else if (a((CharSequence) str)) {
                this.b = Token.FUNC_NAME;
                this.c = str;
            } else {
                this.b = Token.PARAM_VALUE;
                this.c = str;
            }
        }

        private boolean a(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{this, charSequence})).booleanValue();
            }
            for (int i = 0; i < charSequence.length(); i++) {
                char charAt = charSequence.charAt(i);
                if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && charAt != '-')) {
                    return false;
                }
            }
            return true;
        }
    }
}
