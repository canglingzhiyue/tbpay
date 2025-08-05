package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    public ParserConfig config;
    protected ParseContext contex;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    protected List<ExtraProcessor> extraProcessors;
    protected List<ExtraTypeProvider> extraTypeProviders;
    public FieldTypeResolver fieldTypeResolver;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    /* loaded from: classes.dex */
    public static class ResolveTask {
        private final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        private final String referenceValue;

        static {
            kge.a(-1900825265);
        }

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }

    static {
        kge.a(-1147819646);
        kge.a(-1811054506);
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.global);
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        int i;
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.contextArrayIndex = 0;
        this.resolveStatus = 0;
        this.extraTypeProviders = null;
        this.extraProcessors = null;
        this.fieldTypeResolver = null;
        this.lexer = jSONLexer;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char c = jSONLexer.ch;
        char c2 = JSONLexer.EOI;
        if (c == '{') {
            int i2 = jSONLexer.bp + 1;
            jSONLexer.bp = i2;
            jSONLexer.ch = i2 < jSONLexer.len ? jSONLexer.text.charAt(i2) : c2;
            i = 12;
        } else if (jSONLexer.ch != '[') {
            jSONLexer.nextToken();
            return;
        } else {
            int i3 = jSONLexer.bp + 1;
            jSONLexer.bp = i3;
            jSONLexer.ch = i3 < jSONLexer.len ? jSONLexer.text.charAt(i3) : c2;
            i = 14;
        }
        jSONLexer.token = i;
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(new JSONLexer(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i) {
        this(new JSONLexer(str, i), parserConfig);
    }

    public DefaultJSONParser(char[] cArr, int i, ParserConfig parserConfig, int i2) {
        this(new JSONLexer(cArr, i, i2), parserConfig);
    }

    public final void accept(int i) {
        if (this.lexer.token == i) {
            this.lexer.nextToken();
            return;
        }
        throw new JSONException("syntax error, expect " + JSONToken.name(i) + ", actual " + JSONToken.name(this.lexer.token));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void checkListResolve(Collection collection) {
        ResolveTask lastResolveTask;
        ResolveFieldDeserializer resolveFieldDeserializer;
        if (collection instanceof List) {
            lastResolveTask = getLastResolveTask();
            resolveFieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, collection.size() - 1);
        } else {
            lastResolveTask = getLastResolveTask();
            resolveFieldDeserializer = new ResolveFieldDeserializer(collection);
        }
        lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
        lastResolveTask.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void checkMapResolve(Map map, Object obj) {
        ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
        ResolveTask lastResolveTask = getLastResolveTask();
        lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
        lastResolveTask.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.lexer.token == 20) {
                return;
            }
            throw new JSONException("not close json text, token : " + JSONToken.name(this.lexer.token));
        } finally {
            this.lexer.close();
        }
    }

    public void config(Feature feature, boolean z) {
        this.lexer.config(feature, z);
    }

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            this.dateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.locale);
            this.dateFormat.setTimeZone(this.lexer.timeZone);
        }
        return this.dateFormat;
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ResolveTask getLastResolveTask() {
        List<ResolveTask> list = this.resolveTaskList;
        return list.get(list.size() - 1);
    }

    public void handleResovleTask(Object obj) {
        List<ResolveTask> list = this.resolveTaskList;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ResolveTask resolveTask = this.resolveTaskList.get(i);
            FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
            if (fieldDeserializer != null) {
                Object obj2 = null;
                Object obj3 = resolveTask.ownerContext != null ? resolveTask.ownerContext.object : null;
                String str = resolveTask.referenceValue;
                if (str.startsWith("$")) {
                    for (int i2 = 0; i2 < this.contextArrayIndex; i2++) {
                        if (str.equals(this.contextArray[i2].toString())) {
                            obj2 = this.contextArray[i2].object;
                        }
                    }
                } else {
                    obj2 = resolveTask.context.object;
                }
                fieldDeserializer.setValue(obj3, obj2);
            }
        }
    }

    public Object parse() {
        return parse(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Object parse(Object obj) {
        Collection jSONArray;
        int i = this.lexer.token;
        if (i == 2) {
            Number integerValue = this.lexer.integerValue();
            this.lexer.nextToken();
            return integerValue;
        }
        boolean z = true;
        if (i == 3) {
            if ((this.lexer.features & Feature.UseBigDecimal.mask) == 0) {
                z = false;
            }
            Number decimalValue = this.lexer.decimalValue(z);
            this.lexer.nextToken();
            return decimalValue;
        } else if (i == 4) {
            String stringVal = this.lexer.stringVal();
            this.lexer.nextToken(16);
            if ((this.lexer.features & Feature.AllowISO8601DateFormat.mask) != 0) {
                JSONLexer jSONLexer = new JSONLexer(stringVal);
                try {
                    if (jSONLexer.scanISO8601DateIfMatch(true)) {
                        return jSONLexer.calendar.getTime();
                    }
                } finally {
                    jSONLexer.close();
                }
            }
            return stringVal;
        } else if (i == 12) {
            return parseObject((this.lexer.features & Feature.OrderedField.mask) != 0 ? new JSONObject(new LinkedHashMap()) : new JSONObject(), obj);
        } else {
            if (i != 14) {
                switch (i) {
                    case 6:
                        this.lexer.nextToken(16);
                        return Boolean.TRUE;
                    case 7:
                        this.lexer.nextToken(16);
                        return Boolean.FALSE;
                    case 8:
                        break;
                    case 9:
                        this.lexer.nextToken(18);
                        if (this.lexer.token != 18) {
                            throw new JSONException("syntax error, " + this.lexer.info());
                        }
                        this.lexer.nextToken(10);
                        accept(10);
                        long longValue = this.lexer.integerValue().longValue();
                        accept(2);
                        accept(11);
                        return new Date(longValue);
                    default:
                        switch (i) {
                            case 20:
                                if (this.lexer.isBlankInput()) {
                                    return null;
                                }
                                throw new JSONException("syntax error, " + this.lexer.info());
                            case 21:
                                this.lexer.nextToken();
                                jSONArray = new HashSet();
                                break;
                            case 22:
                                this.lexer.nextToken();
                                jSONArray = new TreeSet();
                                break;
                            case 23:
                                break;
                            default:
                                throw new JSONException("syntax error, " + this.lexer.info());
                        }
                }
                this.lexer.nextToken();
                return null;
            }
            jSONArray = new JSONArray();
            parseArray(jSONArray, obj);
            return jSONArray;
        }
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #0 {all -> 0x00cf, blocks: (B:21:0x0050, B:23:0x0058, B:24:0x005e, B:26:0x0066, B:28:0x006b, B:29:0x0071, B:47:0x00b9, B:49:0x00bf, B:32:0x0079, B:34:0x007f, B:35:0x008b, B:38:0x0092, B:40:0x0098, B:42:0x00a0, B:44:0x00ae, B:46:0x00b6, B:43:0x00a6), top: B:58:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void parseArray(java.lang.reflect.Type r8, java.util.Collection r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.lang.reflect.Type, java.util.Collection, java.lang.Object):void");
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f5 A[Catch: all -> 0x026f, TryCatch #0 {all -> 0x026f, blocks: (B:12:0x002a, B:15:0x003e, B:20:0x004f, B:24:0x0067, B:33:0x008b, B:35:0x0091, B:37:0x009f, B:41:0x00b7, B:43:0x00c0, B:45:0x00c5, B:40:0x00af, B:49:0x00d3, B:53:0x00eb, B:55:0x00f4, B:56:0x00f7, B:52:0x00e3, B:60:0x0101, B:61:0x0106, B:62:0x0108, B:64:0x010c, B:85:0x0139, B:118:0x0201, B:120:0x0208, B:121:0x020b, B:123:0x0211, B:125:0x0217, B:130:0x022e, B:133:0x0241, B:137:0x025d, B:136:0x0255, B:138:0x0260, B:87:0x0141, B:91:0x014b, B:92:0x0158, B:93:0x015c, B:94:0x0160, B:95:0x0168, B:96:0x0169, B:98:0x0176, B:100:0x0186, B:99:0x0181, B:101:0x018f, B:102:0x0194, B:103:0x019a, B:104:0x019e, B:105:0x01a5, B:107:0x01bd, B:109:0x01c8, B:110:0x01ce, B:111:0x01d3, B:113:0x01e0, B:115:0x01ef, B:116:0x01f1, B:114:0x01e8, B:117:0x01f5, B:23:0x005f, B:25:0x006e, B:27:0x0075, B:30:0x0082), top: B:146:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0208 A[Catch: all -> 0x026f, TryCatch #0 {all -> 0x026f, blocks: (B:12:0x002a, B:15:0x003e, B:20:0x004f, B:24:0x0067, B:33:0x008b, B:35:0x0091, B:37:0x009f, B:41:0x00b7, B:43:0x00c0, B:45:0x00c5, B:40:0x00af, B:49:0x00d3, B:53:0x00eb, B:55:0x00f4, B:56:0x00f7, B:52:0x00e3, B:60:0x0101, B:61:0x0106, B:62:0x0108, B:64:0x010c, B:85:0x0139, B:118:0x0201, B:120:0x0208, B:121:0x020b, B:123:0x0211, B:125:0x0217, B:130:0x022e, B:133:0x0241, B:137:0x025d, B:136:0x0255, B:138:0x0260, B:87:0x0141, B:91:0x014b, B:92:0x0158, B:93:0x015c, B:94:0x0160, B:95:0x0168, B:96:0x0169, B:98:0x0176, B:100:0x0186, B:99:0x0181, B:101:0x018f, B:102:0x0194, B:103:0x019a, B:104:0x019e, B:105:0x01a5, B:107:0x01bd, B:109:0x01c8, B:110:0x01ce, B:111:0x01d3, B:113:0x01e0, B:115:0x01ef, B:116:0x01f1, B:114:0x01e8, B:117:0x01f5, B:23:0x005f, B:25:0x006e, B:27:0x0075, B:30:0x0082), top: B:146:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0211 A[Catch: all -> 0x026f, TryCatch #0 {all -> 0x026f, blocks: (B:12:0x002a, B:15:0x003e, B:20:0x004f, B:24:0x0067, B:33:0x008b, B:35:0x0091, B:37:0x009f, B:41:0x00b7, B:43:0x00c0, B:45:0x00c5, B:40:0x00af, B:49:0x00d3, B:53:0x00eb, B:55:0x00f4, B:56:0x00f7, B:52:0x00e3, B:60:0x0101, B:61:0x0106, B:62:0x0108, B:64:0x010c, B:85:0x0139, B:118:0x0201, B:120:0x0208, B:121:0x020b, B:123:0x0211, B:125:0x0217, B:130:0x022e, B:133:0x0241, B:137:0x025d, B:136:0x0255, B:138:0x0260, B:87:0x0141, B:91:0x014b, B:92:0x0158, B:93:0x015c, B:94:0x0160, B:95:0x0168, B:96:0x0169, B:98:0x0176, B:100:0x0186, B:99:0x0181, B:101:0x018f, B:102:0x0194, B:103:0x019a, B:104:0x019e, B:105:0x01a5, B:107:0x01bd, B:109:0x01c8, B:110:0x01ce, B:111:0x01d3, B:113:0x01e0, B:115:0x01ef, B:116:0x01f1, B:114:0x01e8, B:117:0x01f5, B:23:0x005f, B:25:0x006e, B:27:0x0075, B:30:0x0082), top: B:146:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0114 A[EDGE_INSN: B:153:0x0114->B:65:0x0114 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f A[Catch: all -> 0x026f, TryCatch #0 {all -> 0x026f, blocks: (B:12:0x002a, B:15:0x003e, B:20:0x004f, B:24:0x0067, B:33:0x008b, B:35:0x0091, B:37:0x009f, B:41:0x00b7, B:43:0x00c0, B:45:0x00c5, B:40:0x00af, B:49:0x00d3, B:53:0x00eb, B:55:0x00f4, B:56:0x00f7, B:52:0x00e3, B:60:0x0101, B:61:0x0106, B:62:0x0108, B:64:0x010c, B:85:0x0139, B:118:0x0201, B:120:0x0208, B:121:0x020b, B:123:0x0211, B:125:0x0217, B:130:0x022e, B:133:0x0241, B:137:0x025d, B:136:0x0255, B:138:0x0260, B:87:0x0141, B:91:0x014b, B:92:0x0158, B:93:0x015c, B:94:0x0160, B:95:0x0168, B:96:0x0169, B:98:0x0176, B:100:0x0186, B:99:0x0181, B:101:0x018f, B:102:0x0194, B:103:0x019a, B:104:0x019e, B:105:0x01a5, B:107:0x01bd, B:109:0x01c8, B:110:0x01ce, B:111:0x01d3, B:113:0x01e0, B:115:0x01ef, B:116:0x01f1, B:114:0x01e8, B:117:0x01f5, B:23:0x005f, B:25:0x006e, B:27:0x0075, B:30:0x0082), top: B:146:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c A[Catch: all -> 0x026f, LOOP:1: B:62:0x0108->B:64:0x010c, LOOP_END, TryCatch #0 {all -> 0x026f, blocks: (B:12:0x002a, B:15:0x003e, B:20:0x004f, B:24:0x0067, B:33:0x008b, B:35:0x0091, B:37:0x009f, B:41:0x00b7, B:43:0x00c0, B:45:0x00c5, B:40:0x00af, B:49:0x00d3, B:53:0x00eb, B:55:0x00f4, B:56:0x00f7, B:52:0x00e3, B:60:0x0101, B:61:0x0106, B:62:0x0108, B:64:0x010c, B:85:0x0139, B:118:0x0201, B:120:0x0208, B:121:0x020b, B:123:0x0211, B:125:0x0217, B:130:0x022e, B:133:0x0241, B:137:0x025d, B:136:0x0255, B:138:0x0260, B:87:0x0141, B:91:0x014b, B:92:0x0158, B:93:0x015c, B:94:0x0160, B:95:0x0168, B:96:0x0169, B:98:0x0176, B:100:0x0186, B:99:0x0181, B:101:0x018f, B:102:0x0194, B:103:0x019a, B:104:0x019e, B:105:0x01a5, B:107:0x01bd, B:109:0x01c8, B:110:0x01ce, B:111:0x01d3, B:113:0x01e0, B:115:0x01ef, B:116:0x01f1, B:114:0x01e8, B:117:0x01f5, B:23:0x005f, B:25:0x006e, B:27:0x0075, B:30:0x0082), top: B:146:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void parseArray(java.util.Collection r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.util.Collection, java.lang.Object):void");
    }

    public Object[] parseArray(Type[] typeArr) {
        Object cast;
        Class<?> cls;
        boolean z;
        Object cast2;
        int i = 8;
        if (this.lexer.token == 8) {
            this.lexer.nextToken(16);
            return null;
        } else if (this.lexer.token != 14) {
            throw new JSONException("syntax error, " + this.lexer.info());
        } else {
            Object[] objArr = new Object[typeArr.length];
            if (typeArr.length == 0) {
                this.lexer.nextToken(15);
                if (this.lexer.token == 15) {
                    this.lexer.nextToken(16);
                    return new Object[0];
                }
                throw new JSONException("syntax error, " + this.lexer.info());
            }
            this.lexer.nextToken(2);
            int i2 = 0;
            while (i2 < typeArr.length) {
                if (this.lexer.token == i) {
                    this.lexer.nextToken(16);
                    cast = null;
                } else {
                    Type type = typeArr[i2];
                    if (type == Integer.TYPE || type == Integer.class) {
                        if (this.lexer.token == 2) {
                            cast = Integer.valueOf(this.lexer.intValue());
                            this.lexer.nextToken(16);
                        } else {
                            cast = TypeUtils.cast(parse(), type, this.config);
                        }
                    } else if (type == String.class) {
                        if (this.lexer.token == 4) {
                            cast2 = this.lexer.stringVal();
                            this.lexer.nextToken(16);
                        } else {
                            cast2 = TypeUtils.cast(parse(), type, this.config);
                        }
                        cast = cast2;
                    } else {
                        if (i2 != typeArr.length - 1 || !(type instanceof Class)) {
                            cls = null;
                            z = false;
                        } else {
                            Class cls2 = (Class) type;
                            z = cls2.isArray();
                            cls = cls2.getComponentType();
                        }
                        if (!z || this.lexer.token == 14) {
                            cast = this.config.getDeserializer(type).deserialze(this, type, null);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ObjectDeserializer deserializer = this.config.getDeserializer(cls);
                            if (this.lexer.token != 15) {
                                while (true) {
                                    arrayList.add(deserializer.deserialze(this, type, null));
                                    if (this.lexer.token != 16) {
                                        break;
                                    }
                                    this.lexer.nextToken(12);
                                }
                                if (this.lexer.token != 15) {
                                    throw new JSONException("syntax error, " + this.lexer.info());
                                }
                            }
                            cast = TypeUtils.cast(arrayList, type, this.config);
                        }
                    }
                }
                objArr[i2] = cast;
                if (this.lexer.token == 15) {
                    break;
                } else if (this.lexer.token != 16) {
                    throw new JSONException("syntax error, " + this.lexer.info());
                } else {
                    if (i2 == typeArr.length - 1) {
                        this.lexer.nextToken(15);
                    } else {
                        this.lexer.nextToken(2);
                    }
                    i2++;
                    i = 8;
                }
            }
            if (this.lexer.token == 15) {
                this.lexer.nextToken(16);
                return objArr;
            }
            throw new JSONException("syntax error, " + this.lexer.info());
        }
    }

    public Object parseArrayWithType(Type type) {
        if (this.lexer.token == 8) {
            this.lexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 1) {
            throw new JSONException("not support type " + type);
        }
        Type type2 = actualTypeArguments[0];
        if (type2 instanceof Class) {
            ArrayList arrayList = new ArrayList();
            parseArray((Class) type2, (Collection) arrayList);
            return arrayList;
        } else if (type2 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type2;
            Type type3 = wildcardType.getUpperBounds()[0];
            if (!Object.class.equals(type3)) {
                ArrayList arrayList2 = new ArrayList();
                parseArray((Class) type3, (Collection) arrayList2);
                return arrayList2;
            } else if (wildcardType.getLowerBounds().length == 0) {
                return parse();
            } else {
                throw new JSONException("not support type : " + type);
            }
        } else {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type2;
                Type[] bounds = typeVariable.getBounds();
                if (bounds.length != 1) {
                    throw new JSONException("not support : " + typeVariable);
                }
                Type type4 = bounds[0];
                if (type4 instanceof Class) {
                    ArrayList arrayList3 = new ArrayList();
                    parseArray((Class) type4, (Collection) arrayList3);
                    return arrayList3;
                }
            }
            if (type2 instanceof ParameterizedType) {
                ArrayList arrayList4 = new ArrayList();
                parseArray((ParameterizedType) type2, arrayList4);
                return arrayList4;
            }
            throw new JSONException("TODO : " + type);
        }
    }

    public JSONObject parseObject() {
        return (JSONObject) parseObject((this.lexer.features & Feature.OrderedField.mask) != 0 ? new JSONObject(new LinkedHashMap()) : new JSONObject(), (Object) null);
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    public <T> T parseObject(Type type, Object obj) {
        if (this.lexer.token == 8) {
            this.lexer.nextToken();
            return null;
        }
        if (this.lexer.token == 4) {
            if (type == byte[].class) {
                T t = (T) this.lexer.bytesValue();
                this.lexer.nextToken();
                return t;
            } else if (type == char[].class) {
                String stringVal = this.lexer.stringVal();
                this.lexer.nextToken();
                return (T) stringVal.toCharArray();
            }
        }
        try {
            return (T) this.config.getDeserializer(type).deserialze(this, type, obj);
        } catch (JSONException e) {
            throw e;
        } catch (Exception e2) {
            throw new JSONException(e2.getMessage(), e2);
        }
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0236, code lost:
        r3.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023d, code lost:
        if (r3.token != 13) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023f, code lost:
        r3.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0242, code lost:
        r2 = r18.config.getDeserializer(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024a, code lost:
        if ((r2 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024c, code lost:
        r2 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r2;
        r3 = r2.createInstance(r18, r6);
        r0 = r19.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x025e, code lost:
        if (r0.hasNext() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0260, code lost:
        r4 = (java.util.Map.Entry) r0.next();
        r7 = r4.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x026c, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026e, code lost:
        r7 = r2.getFieldDeserializer((java.lang.String) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0274, code lost:
        if (r7 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0276, code lost:
        r7.setValue(r3, r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x027e, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027f, code lost:
        if (r3 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0283, code lost:
        if (r6 != java.lang.Cloneable.class) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0285, code lost:
        r3 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0292, code lost:
        if ("java.util.Collections$EmptyMap".equals(r5) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0294, code lost:
        r3 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0299, code lost:
        r3 = r6.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x029d, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x029f, code lost:
        r18.contex = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a1, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02aa, code lost:
        throw new com.alibaba.fastjson.JSONException("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02ab, code lost:
        r18.resolveStatus = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b0, code lost:
        if (r18.contex == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b4, code lost:
        if ((r20 instanceof java.lang.Integer) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b6, code lost:
        popContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02bd, code lost:
        if (r19.size() <= 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02bf, code lost:
        r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r19, (java.lang.Class<java.lang.Object>) r6, r18.config);
        parseObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c8, code lost:
        if (r13 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ca, code lost:
        r18.contex = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02cc, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02cd, code lost:
        r0 = r18.config.getDeserializer(r6).deserialze(r18, r6, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02d7, code lost:
        if (r13 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d9, code lost:
        r18.contex = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02db, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0362 A[Catch: all -> 0x06ae, TRY_LEAVE, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036c A[Catch: all -> 0x06ae, TRY_ENTER, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03b8 A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04d2 A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04e1 A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ea A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04ee A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04f3 A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x057a A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x060e A[Catch: all -> 0x06ae, TRY_LEAVE, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8 A[Catch: all -> 0x06ae, TryCatch #2 {all -> 0x06ae, blocks: (B:21:0x0064, B:24:0x006e, B:25:0x0071, B:28:0x0077, B:32:0x008a, B:34:0x0094, B:37:0x009c, B:38:0x00ba, B:97:0x01c8, B:101:0x01db, B:117:0x01fa, B:120:0x0207, B:122:0x020e, B:124:0x0216, B:126:0x0229, B:128:0x0236, B:130:0x023f, B:131:0x0242, B:133:0x024c, B:134:0x025a, B:136:0x0260, B:138:0x026e, B:140:0x0276, B:145:0x0285, B:146:0x028b, B:148:0x0294, B:149:0x0299, B:154:0x02a3, B:155:0x02aa, B:156:0x02ab, B:158:0x02b2, B:160:0x02b6, B:161:0x02b9, B:163:0x02bf, B:167:0x02cd, B:174:0x02e3, B:176:0x02eb, B:178:0x02f2, B:180:0x0301, B:182:0x0309, B:185:0x030e, B:187:0x0312, B:207:0x035e, B:209:0x0362, B:213:0x036c, B:214:0x0384, B:188:0x0317, B:190:0x031f, B:192:0x0323, B:193:0x0326, B:194:0x032f, B:195:0x0332, B:198:0x033b, B:200:0x033f, B:201:0x0342, B:203:0x0346, B:204:0x0349, B:205:0x0353, B:215:0x0385, B:216:0x03a2, B:219:0x03a7, B:225:0x03b8, B:227:0x03be, B:229:0x03ca, B:230:0x03d0, B:241:0x03ea, B:333:0x0567, B:337:0x0571, B:340:0x057a, B:344:0x058d, B:343:0x0587, B:348:0x0599, B:352:0x05ac, B:354:0x05b5, B:358:0x05c8, B:359:0x05cc, B:376:0x060e, B:357:0x05c2, B:362:0x05d3, B:366:0x05e6, B:365:0x05e0, B:369:0x05ef, B:373:0x0602, B:372:0x05fc, B:374:0x0609, B:351:0x05a6, B:380:0x0618, B:381:0x0630, B:233:0x03d6, B:240:0x03e6, B:245:0x03f5, B:249:0x040c, B:251:0x0415, B:256:0x0422, B:257:0x0425, B:259:0x042f, B:261:0x0436, B:263:0x043a, B:270:0x044c, B:271:0x0464, B:260:0x0433, B:248:0x0406, B:274:0x0469, B:278:0x047c, B:280:0x048d, B:284:0x04a1, B:286:0x04a7, B:289:0x04ad, B:291:0x04b7, B:293:0x04bf, B:297:0x04d2, B:300:0x04da, B:301:0x04dc, B:303:0x04e1, B:305:0x04ea, B:308:0x04f3, B:309:0x04f6, B:311:0x04fc, B:313:0x0503, B:320:0x0510, B:321:0x0528, B:306:0x04ee, B:281:0x0498, B:277:0x0476, B:324:0x052f, B:326:0x053c, B:327:0x0547, B:330:0x054f, B:332:0x055c, B:382:0x0631, B:384:0x0642, B:385:0x0646, B:387:0x064f, B:392:0x065b, B:395:0x0663, B:396:0x067b, B:100:0x01d5, B:119:0x0203, B:42:0x00c3, B:46:0x00d4, B:45:0x00ce, B:52:0x00e7, B:54:0x00f3, B:55:0x00f6, B:58:0x00fb, B:59:0x0111, B:69:0x0124, B:70:0x012a, B:72:0x012f, B:75:0x013c, B:76:0x0140, B:79:0x0146, B:80:0x0161, B:73:0x0134, B:81:0x0162, B:82:0x017d, B:88:0x0187, B:91:0x0196, B:92:0x019c, B:93:0x01ba, B:94:0x01bb, B:397:0x067c, B:398:0x0694, B:399:0x0695, B:400:0x06ad), top: B:408:0x0064, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseObject(java.util.Map r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public void parseObject(Object obj) {
        Object deserialze;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        int i = this.lexer.token;
        if (i != 12 && i != 16) {
            throw new JSONException("syntax error, expect {, actual " + JSONToken.name(i));
        }
        while (true) {
            String scanSymbol = this.lexer.scanSymbol(this.symbolTable);
            if (scanSymbol == null) {
                if (this.lexer.token == 13) {
                    this.lexer.nextToken(16);
                    return;
                } else if (this.lexer.token == 16) {
                    continue;
                }
            }
            FieldDeserializer fieldDeserializer = javaBeanDeserializer != null ? javaBeanDeserializer.getFieldDeserializer(scanSymbol) : null;
            if (fieldDeserializer != null) {
                Class<?> cls2 = fieldDeserializer.fieldInfo.fieldClass;
                Type type = fieldDeserializer.fieldInfo.fieldType;
                if (cls2 != Integer.TYPE) {
                    if (cls2 == String.class) {
                        this.lexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
                        deserialze = parseString();
                    } else if (cls2 != Long.TYPE) {
                        ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                        this.lexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
                        deserialze = deserializer2.deserialze(this, type, null);
                    }
                    fieldDeserializer.setValue(obj, deserialze);
                    if (this.lexer.token != 16 && this.lexer.token == 13) {
                        this.lexer.nextToken(16);
                        return;
                    }
                }
                this.lexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
                deserialze = IntegerCodec.instance.deserialze(this, type, null);
                fieldDeserializer.setValue(obj, deserialze);
                if (this.lexer.token != 16) {
                    this.lexer.nextToken(16);
                    return;
                }
                continue;
            } else if ((this.lexer.features & Feature.IgnoreNotMatch.mask) == 0) {
                throw new JSONException("setter not found, class " + cls.getName() + ", property " + scanSymbol);
            } else {
                this.lexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
                parse();
                if (this.lexer.token == 13) {
                    this.lexer.nextToken();
                    return;
                }
            }
        }
    }

    public String parseString() {
        JSONLexer jSONLexer;
        int i;
        int i2 = this.lexer.token;
        if (i2 != 4) {
            if (i2 == 2) {
                String numberString = this.lexer.numberString();
                this.lexer.nextToken(16);
                return numberString;
            }
            Object parse = parse();
            if (parse != null) {
                return parse.toString();
            }
            return null;
        }
        String stringVal = this.lexer.stringVal();
        char c = this.lexer.ch;
        char c2 = JSONLexer.EOI;
        if (c == ',') {
            JSONLexer jSONLexer2 = this.lexer;
            int i3 = jSONLexer2.bp + 1;
            jSONLexer2.bp = i3;
            JSONLexer jSONLexer3 = this.lexer;
            if (i3 < jSONLexer3.len) {
                c2 = this.lexer.text.charAt(i3);
            }
            jSONLexer3.ch = c2;
            this.lexer.token = 16;
        } else {
            if (this.lexer.ch == ']') {
                JSONLexer jSONLexer4 = this.lexer;
                int i4 = jSONLexer4.bp + 1;
                jSONLexer4.bp = i4;
                JSONLexer jSONLexer5 = this.lexer;
                if (i4 < jSONLexer5.len) {
                    c2 = this.lexer.text.charAt(i4);
                }
                jSONLexer5.ch = c2;
                jSONLexer = this.lexer;
                i = 15;
            } else if (this.lexer.ch == '}') {
                JSONLexer jSONLexer6 = this.lexer;
                int i5 = jSONLexer6.bp + 1;
                jSONLexer6.bp = i5;
                JSONLexer jSONLexer7 = this.lexer;
                if (i5 < jSONLexer7.len) {
                    c2 = this.lexer.text.charAt(i5);
                }
                jSONLexer7.ch = c2;
                jSONLexer = this.lexer;
                i = 13;
            } else {
                this.lexer.nextToken();
            }
            jSONLexer.token = i;
        }
        return stringVal;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void popContext() {
        this.contex = this.contex.parent;
        ParseContext[] parseContextArr = this.contextArray;
        int i = this.contextArrayIndex;
        parseContextArr[i - 1] = null;
        this.contextArrayIndex = i - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.disableCircularReferenceDetect) {
            return null;
        }
        this.contex = new ParseContext(parseContext, obj, obj2);
        int i = this.contextArrayIndex;
        this.contextArrayIndex = i + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[(parseContextArr.length * 3) / 2];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        ParseContext[] parseContextArr3 = this.contextArray;
        ParseContext parseContext2 = this.contex;
        parseContextArr3[i] = parseContext2;
        return parseContext2;
    }

    public void setContext(ParseContext parseContext) {
        if (this.lexer.disableCircularReferenceDetect) {
            return;
        }
        this.contex = parseContext;
    }

    public void setDateFomrat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }
}
