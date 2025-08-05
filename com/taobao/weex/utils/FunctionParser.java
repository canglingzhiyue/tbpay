package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class FunctionParser<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char SPACE = ' ';

    /* renamed from: a  reason: collision with root package name */
    private Mapper<K, V> f23529a;
    private Lexer b;

    /* loaded from: classes9.dex */
    public interface Mapper<K, V> {
        Map<K, V> map(String str, List<String> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum Token {
        FUNC_NAME,
        PARAM_VALUE,
        LEFT_PARENT,
        RIGHT_PARENT,
        COMMA
    }

    /* loaded from: classes9.dex */
    public static class WXInterpretationException extends RuntimeException {
        static {
            kge.a(1247702322);
        }

        private WXInterpretationException(String str) {
            super(str);
        }
    }

    static {
        kge.a(1685858768);
    }

    public FunctionParser(String str, Mapper<K, V> mapper) {
        this.b = new Lexer(str);
        this.f23529a = mapper;
    }

    public LinkedHashMap<K, V> parse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("ade29dd6", new Object[]{this});
        }
        Lexer.a(this.b);
        return a();
    }

    private LinkedHashMap<K, V> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("c2be5284", new Object[]{this});
        }
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>();
        do {
            linkedHashMap.putAll(b());
        } while (Lexer.b(this.b) == Token.FUNC_NAME);
        return linkedHashMap;
    }

    private Map<K, V> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        String a2 = a(Token.FUNC_NAME);
        a(Token.LEFT_PARENT);
        linkedList.add(a(Token.PARAM_VALUE));
        while (Lexer.b(this.b) == Token.COMMA) {
            a(Token.COMMA);
            linkedList.add(a(Token.PARAM_VALUE));
        }
        a(Token.RIGHT_PARENT);
        return this.f23529a.map(a2, linkedList);
    }

    private String a(Token token) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c55966e", new Object[]{this, token});
        }
        try {
            if (token != Lexer.b(this.b)) {
                return "";
            }
            String c = Lexer.c(this.b);
            Lexer.a(this.b);
            return c;
        } catch (Exception unused) {
            WXLogUtils.e(token + "Token doesn't match" + Lexer.d(this.b));
            return "";
        }
    }

    /* loaded from: classes9.dex */
    public static class Lexer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f23530a;
        private Token b;
        private String c;
        private int d;

        static {
            kge.a(869709592);
        }

        private boolean a(char c) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8217d19", new Object[]{this, new Character(c)})).booleanValue() : ('0' <= c && c <= '9') || ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
        }

        public static /* synthetic */ boolean a(Lexer lexer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27c62a83", new Object[]{lexer})).booleanValue() : lexer.c();
        }

        public static /* synthetic */ Token b(Lexer lexer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Token) ipChange.ipc$dispatch("2c2440a0", new Object[]{lexer}) : lexer.a();
        }

        public static /* synthetic */ String c(Lexer lexer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e0b483f", new Object[]{lexer}) : lexer.b();
        }

        public static /* synthetic */ String d(Lexer lexer) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("983ad05e", new Object[]{lexer}) : lexer.f23530a;
        }

        private Lexer(String str) {
            this.d = 0;
            this.f23530a = str;
        }

        private Token a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Token) ipChange.ipc$dispatch("f384b7b8", new Object[]{this}) : this.b;
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
                if (this.d >= this.f23530a.length()) {
                    break;
                }
                char charAt = this.f23530a.charAt(this.d);
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
                a(this.f23530a.substring(i, i4));
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
