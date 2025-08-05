package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class JavaBeanDeserializer implements ObjectDeserializer {
    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    public final JavaBeanInfo beanInfo;
    protected final Class<?> clazz;
    private ConcurrentMap<String, Object> extraFieldDeserializers;
    private final FieldDeserializer[] fieldDeserializers;
    private transient long[] smartMatchHashArray;
    private transient int[] smartMatchHashArrayMapping;
    private final FieldDeserializer[] sortedFieldDeserializers;

    static {
        kge.a(192837451);
        kge.a(-1627011960);
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type) {
        this(parserConfig, cls, type, JavaBeanInfo.build(cls, cls.getModifiers(), type, false, true, true, true, parserConfig.propertyNamingStrategy));
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type, JavaBeanInfo javaBeanInfo) {
        String[] strArr;
        this.clazz = cls;
        this.beanInfo = javaBeanInfo;
        this.sortedFieldDeserializers = new FieldDeserializer[javaBeanInfo.sortedFields.length];
        int length = javaBeanInfo.sortedFields.length;
        HashMap hashMap = null;
        int i = 0;
        while (i < length) {
            FieldInfo fieldInfo = javaBeanInfo.sortedFields[i];
            FieldDeserializer createFieldDeserializer = parserConfig.createFieldDeserializer(parserConfig, cls, fieldInfo);
            this.sortedFieldDeserializers[i] = createFieldDeserializer;
            HashMap hashMap2 = hashMap;
            for (String str : fieldInfo.alternateNames) {
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                }
                hashMap2.put(str, createFieldDeserializer);
            }
            i++;
            hashMap = hashMap2;
        }
        this.alterNameFieldDeserializers = hashMap;
        this.fieldDeserializers = new FieldDeserializer[javaBeanInfo.fields.length];
        int length2 = javaBeanInfo.fields.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.fieldDeserializers[i2] = getFieldDeserializer(javaBeanInfo.fields[i2].name);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x02b3, code lost:
        if (r2 != 16) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x02c6, code lost:
        r10.nextTokenWithChar(tb.riy.CONDITION_IF_MIDDLE);
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02cc, code lost:
        if (r10.token != 4) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x02ce, code lost:
        r0 = r10.stringVal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x02d8, code lost:
        if ("@".equals(r0) == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x02dc, code lost:
        r6 = (T) r14.object;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x02e6, code lost:
        if ("..".equals(r0) == false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02e8, code lost:
        r1 = r14.parent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02ec, code lost:
        if (r1.object == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02ee, code lost:
        r6 = (T) r1.object;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02f1, code lost:
        r35.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r1, r0));
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02fa, code lost:
        r35.resolveStatus = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0303, code lost:
        if ("$".equals(r0) == false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0305, code lost:
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0308, code lost:
        if (r1.parent == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x030a, code lost:
        r1 = r1.parent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x030f, code lost:
        if (r1.object == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0312, code lost:
        r35.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r1, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x031a, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x031c, code lost:
        r35.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r14, r0));
        r35.resolveStatus = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0328, code lost:
        r10.nextToken(13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x032d, code lost:
        if (r10.token != 13) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x032f, code lost:
        r10.nextToken(16);
        r35.setContext(r14, r6, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0337, code lost:
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0339, code lost:
        if (r1 == null) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x033b, code lost:
        r1.object = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x033d, code lost:
        r35.setContext(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0340, code lost:
        return (T) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x034b, code lost:
        throw new com.alibaba.fastjson.JSONException("illegal ref");
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0369, code lost:
        throw new com.alibaba.fastjson.JSONException("illegal ref, " + com.alibaba.fastjson.parser.JSONToken.name(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x036a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x036f, code lost:
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x037a, code lost:
        if (r3.equals(r15) == false) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x037e, code lost:
        if (com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY == r15) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0380, code lost:
        r10.nextTokenWithChar(tb.riy.CONDITION_IF_MIDDLE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0388, code lost:
        if (r10.token != 4) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x038a, code lost:
        r1 = r10.stringVal();
        r10.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0395, code lost:
        if ((r36 instanceof java.lang.Class) == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x03a2, code lost:
        if (r1.equals(((java.lang.Class) r36).getName()) == false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x03a8, code lost:
        if (r10.token != 13) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x03aa, code lost:
        r10.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x03ad, code lost:
        r12 = r2;
        r13 = r6;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x03bf, code lost:
        r4 = getSeeAlso(r35.config, r34.beanInfo, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03c7, code lost:
        if (r4 != null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c9, code lost:
        r12 = r35.config.checkAutoType(r1, r34.clazz, r10.features);
        r0 = com.alibaba.fastjson.util.TypeUtils.getClass(r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03d7, code lost:
        if (r0 == null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03d9, code lost:
        if (r12 == null) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03df, code lost:
        if (r0.isAssignableFrom(r12) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03ea, code lost:
        throw new com.alibaba.fastjson.JSONException("type not match");
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x03eb, code lost:
        r4 = r35.config.getDeserializer(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03f2, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03f5, code lost:
        if ((r4 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03f7, code lost:
        r4 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r4;
        r0 = (T) r4.deserialze(r35, r12, r37, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x03fe, code lost:
        if (r3 == null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0400, code lost:
        r4.getFieldDeserializer(r3).setValue(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0408, code lost:
        r0 = (T) r4.deserialze(r35, r12, r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x040c, code lost:
        if (r2 == null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x040e, code lost:
        r2.object = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0410, code lost:
        r35.setContext(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0413, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x041c, code lost:
        throw new com.alibaba.fastjson.JSONException("syntax error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x06cb, code lost:
        throw new com.alibaba.fastjson.JSONException("syntax error, unexpect token " + com.alibaba.fastjson.parser.JSONToken.name(r10.token));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x042e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:17:0x0030, B:19:0x0035, B:28:0x004a, B:30:0x0050, B:36:0x005f, B:42:0x006e, B:47:0x007a, B:49:0x0084, B:52:0x008b, B:54:0x00a1, B:55:0x00a9, B:56:0x00b2, B:60:0x00b8), top: B:524:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0576 A[Catch: all -> 0x06e6, TryCatch #4 {all -> 0x06e6, blocks: (B:344:0x0461, B:440:0x05a9, B:442:0x05af, B:444:0x05b5, B:502:0x06a3, B:504:0x06a9, B:507:0x06ae, B:508:0x06cb, B:346:0x0470, B:351:0x0479, B:356:0x0482, B:361:0x048b, B:372:0x04b1, B:427:0x0562, B:367:0x0497, B:368:0x049f, B:369:0x04a7, B:370:0x04ac, B:376:0x04c6, B:381:0x04d0, B:386:0x04d9, B:391:0x04e2, B:396:0x04eb, B:397:0x04f2, B:399:0x04f6, B:401:0x04fa, B:402:0x04fe, B:403:0x0503, B:404:0x0507, B:406:0x050b, B:408:0x050f, B:409:0x0513, B:410:0x051c, B:412:0x0520, B:414:0x0524, B:415:0x052a, B:416:0x0531, B:418:0x0535, B:420:0x0539, B:421:0x053d, B:426:0x055d, B:424:0x0543, B:425:0x055c, B:431:0x0576, B:433:0x0592, B:435:0x0598, B:438:0x05a3, B:512:0x06dd, B:513:0x06e5), top: B:530:0x0461, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x05af A[Catch: all -> 0x06e6, TryCatch #4 {all -> 0x06e6, blocks: (B:344:0x0461, B:440:0x05a9, B:442:0x05af, B:444:0x05b5, B:502:0x06a3, B:504:0x06a9, B:507:0x06ae, B:508:0x06cb, B:346:0x0470, B:351:0x0479, B:356:0x0482, B:361:0x048b, B:372:0x04b1, B:427:0x0562, B:367:0x0497, B:368:0x049f, B:369:0x04a7, B:370:0x04ac, B:376:0x04c6, B:381:0x04d0, B:386:0x04d9, B:391:0x04e2, B:396:0x04eb, B:397:0x04f2, B:399:0x04f6, B:401:0x04fa, B:402:0x04fe, B:403:0x0503, B:404:0x0507, B:406:0x050b, B:408:0x050f, B:409:0x0513, B:410:0x051c, B:412:0x0520, B:414:0x0524, B:415:0x052a, B:416:0x0531, B:418:0x0535, B:420:0x0539, B:421:0x053d, B:426:0x055d, B:424:0x0543, B:425:0x055c, B:431:0x0576, B:433:0x0592, B:435:0x0598, B:438:0x05a3, B:512:0x06dd, B:513:0x06e5), top: B:530:0x0461, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r35v0, types: [com.alibaba.fastjson.parser.DefaultJSONParser] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r35, java.lang.reflect.Type r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 1787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private <T> T deserialzeArrayMapping(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        Enum r8;
        String str;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        T t = (T) createInstance(defaultJSONParser, type);
        int length = this.sortedFieldDeserializers.length;
        int i = 0;
        while (i < length) {
            char c = i == length + (-1) ? ']' : ',';
            FieldDeserializer fieldDeserializer = this.sortedFieldDeserializers[i];
            FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
            Class<?> cls = fieldInfo.fieldClass;
            try {
                if (cls == Integer.TYPE) {
                    int scanLongValue = (int) jSONLexer.scanLongValue();
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.setInt(t, scanLongValue);
                    } else {
                        fieldDeserializer.setValue(t, new Integer(scanLongValue));
                    }
                    if (jSONLexer.ch == ',') {
                        int i2 = jSONLexer.bp + 1;
                        jSONLexer.bp = i2;
                        jSONLexer.ch = i2 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i2);
                        jSONLexer.token = 16;
                    } else {
                        if (jSONLexer.ch == ']') {
                            int i3 = jSONLexer.bp + 1;
                            jSONLexer.bp = i3;
                            jSONLexer.ch = i3 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i3);
                            jSONLexer.token = 15;
                        }
                        jSONLexer.nextToken();
                    }
                } else if (cls == String.class) {
                    if (jSONLexer.ch == '\"') {
                        str = jSONLexer.scanStringValue('\"');
                    } else if (jSONLexer.ch != 'n' || !jSONLexer.text.startsWith("null", jSONLexer.bp)) {
                        throw new JSONException("not match string. feild : " + obj);
                    } else {
                        jSONLexer.bp += 4;
                        jSONLexer.ch = jSONLexer.bp >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(jSONLexer.bp);
                        str = null;
                    }
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.set(t, str);
                    } else {
                        fieldDeserializer.setValue(t, str);
                    }
                    if (jSONLexer.ch == ',') {
                        int i4 = jSONLexer.bp + 1;
                        jSONLexer.bp = i4;
                        jSONLexer.ch = i4 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i4);
                        jSONLexer.token = 16;
                    } else {
                        if (jSONLexer.ch == ']') {
                            int i5 = jSONLexer.bp + 1;
                            jSONLexer.bp = i5;
                            jSONLexer.ch = i5 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i5);
                            jSONLexer.token = 15;
                        }
                        jSONLexer.nextToken();
                    }
                } else {
                    if (cls == Long.TYPE) {
                        long scanLongValue2 = jSONLexer.scanLongValue();
                        if (fieldInfo.fieldAccess) {
                            fieldInfo.field.setLong(t, scanLongValue2);
                        } else {
                            fieldDeserializer.setValue(t, new Long(scanLongValue2));
                        }
                        if (jSONLexer.ch == ',') {
                            int i6 = jSONLexer.bp + 1;
                            jSONLexer.bp = i6;
                            jSONLexer.ch = i6 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i6);
                            jSONLexer.token = 16;
                        } else {
                            if (jSONLexer.ch == ']') {
                                int i7 = jSONLexer.bp + 1;
                                jSONLexer.bp = i7;
                                jSONLexer.ch = i7 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i7);
                                jSONLexer.token = 15;
                            }
                            jSONLexer.nextToken();
                        }
                    } else if (cls == Boolean.TYPE) {
                        boolean scanBoolean = jSONLexer.scanBoolean();
                        if (fieldInfo.fieldAccess) {
                            fieldInfo.field.setBoolean(t, scanBoolean);
                        } else {
                            fieldDeserializer.setValue(t, Boolean.valueOf(scanBoolean));
                        }
                        if (jSONLexer.ch == ',') {
                            int i8 = jSONLexer.bp + 1;
                            jSONLexer.bp = i8;
                            jSONLexer.ch = i8 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i8);
                            jSONLexer.token = 16;
                        } else {
                            if (jSONLexer.ch == ']') {
                                int i9 = jSONLexer.bp + 1;
                                jSONLexer.bp = i9;
                                jSONLexer.ch = i9 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i9);
                                jSONLexer.token = 15;
                            }
                            jSONLexer.nextToken();
                        }
                    } else if (cls.isEnum()) {
                        char c2 = jSONLexer.ch;
                        if (c2 == '\"') {
                            String scanSymbol = jSONLexer.scanSymbol(defaultJSONParser.symbolTable);
                            r8 = scanSymbol == null ? null : Enum.valueOf(cls, scanSymbol);
                        } else if (c2 < '0' || c2 > '9') {
                            throw new JSONException("illegal enum." + jSONLexer.info());
                        } else {
                            r8 = ((EnumDeserializer) ((DefaultFieldDeserializer) fieldDeserializer).getFieldValueDeserilizer(defaultJSONParser.config)).ordinalEnums[(int) jSONLexer.scanLongValue()];
                        }
                        fieldDeserializer.setValue(t, r8);
                        if (jSONLexer.ch == ',') {
                            int i10 = jSONLexer.bp + 1;
                            jSONLexer.bp = i10;
                            jSONLexer.ch = i10 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i10);
                            jSONLexer.token = 16;
                        } else {
                            if (jSONLexer.ch == ']') {
                                int i11 = jSONLexer.bp + 1;
                                jSONLexer.bp = i11;
                                jSONLexer.ch = i11 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i11);
                                jSONLexer.token = 15;
                            }
                            jSONLexer.nextToken();
                        }
                    } else if (cls == Date.class && jSONLexer.ch == '1') {
                        fieldDeserializer.setValue(t, new Date(jSONLexer.scanLongValue()));
                        if (jSONLexer.ch == ',') {
                            int i12 = jSONLexer.bp + 1;
                            jSONLexer.bp = i12;
                            jSONLexer.ch = i12 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i12);
                            jSONLexer.token = 16;
                        } else {
                            if (jSONLexer.ch == ']') {
                                int i13 = jSONLexer.bp + 1;
                                jSONLexer.bp = i13;
                                jSONLexer.ch = i13 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i13);
                                jSONLexer.token = 15;
                            }
                            jSONLexer.nextToken();
                        }
                    } else {
                        if (jSONLexer.ch == '[') {
                            int i14 = jSONLexer.bp + 1;
                            jSONLexer.bp = i14;
                            jSONLexer.ch = i14 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i14);
                            jSONLexer.token = 14;
                        } else if (jSONLexer.ch == '{') {
                            int i15 = jSONLexer.bp + 1;
                            jSONLexer.bp = i15;
                            jSONLexer.ch = i15 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i15);
                            jSONLexer.token = 12;
                        } else {
                            jSONLexer.nextToken();
                        }
                        fieldDeserializer.parseField(defaultJSONParser, t, fieldInfo.fieldType, null);
                        if (c == ']') {
                            if (jSONLexer.token != 15) {
                                throw new JSONException("syntax error");
                            }
                        } else if (c == ',' && jSONLexer.token != 16) {
                            throw new JSONException("syntax error");
                        }
                    }
                    i++;
                }
                i++;
            } catch (IllegalAccessException e) {
                throw new JSONException("set " + fieldInfo.name + "error", e);
            }
        }
        if (jSONLexer.ch == ',') {
            int i16 = jSONLexer.bp + 1;
            jSONLexer.bp = i16;
            jSONLexer.ch = i16 >= jSONLexer.len ? JSONLexer.EOI : jSONLexer.text.charAt(i16);
            jSONLexer.token = 16;
        } else {
            jSONLexer.nextToken();
        }
        return t;
    }

    private boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map) {
        Field[] declaredFields;
        boolean z;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        FieldDeserializer fieldDeserializer = getFieldDeserializer(str);
        if (fieldDeserializer == null) {
            long fnv_64_lower = TypeUtils.fnv_64_lower(str);
            if (this.smartMatchHashArray == null) {
                long[] jArr = new long[this.sortedFieldDeserializers.length];
                int i = 0;
                while (true) {
                    FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                    if (i >= fieldDeserializerArr.length) {
                        break;
                    }
                    jArr[i] = TypeUtils.fnv_64_lower(fieldDeserializerArr[i].fieldInfo.name);
                    i++;
                }
                Arrays.sort(jArr);
                this.smartMatchHashArray = jArr;
            }
            int binarySearch = Arrays.binarySearch(this.smartMatchHashArray, fnv_64_lower);
            if (binarySearch < 0) {
                z = str.startsWith("is");
                if (z) {
                    binarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv_64_lower(str.substring(2)));
                }
            } else {
                z = false;
            }
            if (binarySearch >= 0) {
                if (this.smartMatchHashArrayMapping == null) {
                    int[] iArr = new int[this.smartMatchHashArray.length];
                    Arrays.fill(iArr, -1);
                    int i2 = 0;
                    while (true) {
                        FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                        if (i2 >= fieldDeserializerArr2.length) {
                            break;
                        }
                        int binarySearch2 = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv_64_lower(fieldDeserializerArr2[i2].fieldInfo.name));
                        if (binarySearch2 >= 0) {
                            iArr[binarySearch2] = i2;
                        }
                        i2++;
                    }
                    this.smartMatchHashArrayMapping = iArr;
                }
                int i3 = this.smartMatchHashArrayMapping[binarySearch];
                if (i3 != -1) {
                    fieldDeserializer = this.sortedFieldDeserializers[i3];
                    Class<?> cls = fieldDeserializer.fieldInfo.fieldClass;
                    if (z && cls != Boolean.TYPE && cls != Boolean.class) {
                        fieldDeserializer = null;
                    }
                }
            }
        }
        int i4 = Feature.SupportNonPublicField.mask;
        if (fieldDeserializer == null && ((defaultJSONParser.lexer.features & i4) != 0 || (i4 & this.beanInfo.parserFeatures) != 0)) {
            if (this.extraFieldDeserializers == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1, 0.75f, 1);
                for (Class<?> cls2 = this.clazz; cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                    for (Field field : cls2.getDeclaredFields()) {
                        String name = field.getName();
                        if (getFieldDeserializer(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentHashMap.put(name, field);
                            }
                        }
                    }
                }
                this.extraFieldDeserializers = concurrentHashMap;
            }
            Object obj2 = this.extraFieldDeserializers.get(str);
            if (obj2 != null) {
                if (obj2 instanceof FieldDeserializer) {
                    fieldDeserializer = (FieldDeserializer) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    fieldDeserializer = new DefaultFieldDeserializer(defaultJSONParser.config, this.clazz, new FieldInfo(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.extraFieldDeserializers.put(str, fieldDeserializer);
                }
            }
        }
        if (fieldDeserializer == null) {
            parseExtra(defaultJSONParser, obj, str);
            return false;
        }
        jSONLexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
        fieldDeserializer.parseField(defaultJSONParser, obj, type, map);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object createInstance(DefaultJSONParser defaultJSONParser, Type type) {
        FieldInfo[] fieldInfoArr;
        if ((type instanceof Class) && this.clazz.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new JSONObject((defaultJSONParser.lexer.features & Feature.OrderedField.mask) != 0));
        } else if (this.beanInfo.defaultConstructor == null && this.beanInfo.factoryMethod == null) {
            return null;
        } else {
            if (this.beanInfo.factoryMethod != null && this.beanInfo.defaultConstructorParameterSize > 0) {
                return null;
            }
            try {
                Constructor<?> constructor = this.beanInfo.defaultConstructor;
                Object newInstance = this.beanInfo.defaultConstructorParameterSize == 0 ? constructor != null ? constructor.newInstance(new Object[0]) : this.beanInfo.factoryMethod.invoke(null, new Object[0]) : constructor.newInstance(defaultJSONParser.contex.object);
                if (defaultJSONParser != null && (defaultJSONParser.lexer.features & Feature.InitStringFieldAsEmpty.mask) != 0) {
                    for (FieldInfo fieldInfo : this.beanInfo.fields) {
                        if (fieldInfo.fieldClass == String.class) {
                            fieldInfo.set(newInstance, "");
                        }
                    }
                }
                return newInstance;
            } catch (Exception e) {
                throw new JSONException("create instance error, class " + this.clazz.getName(), e);
            }
        }
    }

    public Object createInstance(Map<String, Object> map, ParserConfig parserConfig) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object cast;
        if (this.beanInfo.creatorConstructor != null) {
            FieldInfo[] fieldInfoArr = this.beanInfo.fields;
            int length = fieldInfoArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                FieldInfo fieldInfo = fieldInfoArr[i];
                Object obj = map.get(fieldInfo.name);
                if (obj == null) {
                    obj = TypeUtils.defaultValue(fieldInfo.fieldClass);
                }
                objArr[i] = obj;
            }
            if (this.beanInfo.creatorConstructor == null) {
                return null;
            }
            try {
                return this.beanInfo.creatorConstructor.newInstance(objArr);
            } catch (Exception e) {
                throw new JSONException("create instance error, " + this.beanInfo.creatorConstructor.toGenericString(), e);
            }
        }
        Object createInstance = createInstance((DefaultJSONParser) null, this.clazz);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            FieldDeserializer fieldDeserializer = getFieldDeserializer(entry.getKey());
            if (fieldDeserializer != null) {
                Object value = entry.getValue();
                Method method = fieldDeserializer.fieldInfo.method;
                if (method != null) {
                    method.invoke(createInstance, TypeUtils.cast(value, method.getGenericParameterTypes()[0], parserConfig));
                } else {
                    Field field = fieldDeserializer.fieldInfo.field;
                    Type type = fieldDeserializer.fieldInfo.fieldType;
                    String str = fieldDeserializer.fieldInfo.format;
                    if (str == null || type != Date.class || !(value instanceof String)) {
                        cast = TypeUtils.cast(value, type, parserConfig);
                    } else {
                        try {
                            cast = new SimpleDateFormat(str).parse((String) value);
                        } catch (ParseException unused) {
                            cast = null;
                        }
                    }
                    field.set(createInstance, cast);
                }
            }
        }
        return createInstance;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FieldDeserializer getFieldDeserializer(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        if (!this.beanInfo.ordered) {
            int length = this.sortedFieldDeserializers.length - 1;
            while (i <= length) {
                int i2 = (i + length) >>> 1;
                int compareTo = this.sortedFieldDeserializers[i2].fieldInfo.name.compareTo(str);
                if (compareTo < 0) {
                    i = i2 + 1;
                } else if (compareTo <= 0) {
                    return this.sortedFieldDeserializers[i2];
                } else {
                    length = i2 - 1;
                }
            }
            Map<String, FieldDeserializer> map = this.alterNameFieldDeserializers;
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
        while (true) {
            FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
            if (i >= fieldDeserializerArr.length) {
                return null;
            }
            FieldDeserializer fieldDeserializer = fieldDeserializerArr[i];
            if (fieldDeserializer.fieldInfo.name.equalsIgnoreCase(str)) {
                return fieldDeserializer;
            }
            i++;
        }
    }

    protected FieldDeserializer getFieldDeserializerByHash(long j) {
        int i = 0;
        while (true) {
            FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
            if (i < fieldDeserializerArr.length) {
                FieldDeserializer fieldDeserializer = fieldDeserializerArr[i];
                if (fieldDeserializer.fieldInfo.nameHashCode == j) {
                    return fieldDeserializer;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    protected JavaBeanDeserializer getSeeAlso(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, String str) {
        if (javaBeanInfo.jsonType == null) {
            return null;
        }
        for (Class<?> cls : javaBeanInfo.jsonType.seeAlso()) {
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            if (deserializer instanceof JavaBeanDeserializer) {
                JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                JavaBeanInfo javaBeanInfo2 = javaBeanDeserializer.beanInfo;
                if (javaBeanInfo2.typeName.equals(str)) {
                    return javaBeanDeserializer;
                }
                JavaBeanDeserializer seeAlso = getSeeAlso(parserConfig, javaBeanInfo2, str);
                if (seeAlso != null) {
                    return seeAlso;
                }
            }
        }
        return null;
    }

    void parseExtra(DefaultJSONParser defaultJSONParser, Object obj, String str) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if ((defaultJSONParser.lexer.features & Feature.IgnoreNotMatch.mask) == 0) {
            throw new JSONException("setter not found, class " + this.clazz.getName() + ", property " + str);
        }
        jSONLexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
        Type type = null;
        List<ExtraTypeProvider> list = defaultJSONParser.extraTypeProviders;
        if (list != null) {
            for (ExtraTypeProvider extraTypeProvider : list) {
                type = extraTypeProvider.getExtraType(obj, str);
            }
        }
        Object parse = type == null ? defaultJSONParser.parse() : defaultJSONParser.parseObject(type);
        if (obj instanceof ExtraProcessable) {
            ((ExtraProcessable) obj).processExtra(str, parse);
            return;
        }
        List<ExtraProcessor> list2 = defaultJSONParser.extraProcessors;
        if (list2 == null) {
            return;
        }
        for (ExtraProcessor extraProcessor : list2) {
            extraProcessor.processExtra(obj, str, parse);
        }
    }
}
