package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class DateCodec implements ObjectDeserializer, ObjectSerializer {
    public static final DateCodec instance;

    static {
        kge.a(652507413);
        kge.a(1456819588);
        kge.a(-1627011960);
        instance = new DateCodec();
    }

    private DateCodec() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Calendar, T] */
    protected <T> T cast(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2, String str) {
        if (obj2 == 0) {
            return null;
        }
        if (obj2 instanceof Date) {
            return obj2;
        }
        if (obj2 instanceof Number) {
            return (T) new Date(((Number) obj2).longValue());
        }
        if (!(obj2 instanceof String)) {
            throw new JSONException("parse error");
        }
        String str2 = (String) obj2;
        if (str2.length() == 0) {
            return null;
        }
        JSONLexer jSONLexer = new JSONLexer(str2);
        try {
            if (jSONLexer.scanISO8601DateIfMatch(false)) {
                ?? r3 = (T) jSONLexer.calendar;
                return type == Calendar.class ? r3 : (T) r3.getTime();
            }
            jSONLexer.close();
            if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                return null;
            }
            try {
                return (T) (str != null ? new SimpleDateFormat(str) : defaultJSONParser.getDateFormat()).parse(str2);
            } catch (ParseException unused) {
                return (T) new Date(Long.parseLong(str2));
            }
        } finally {
            jSONLexer.close();
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, null);
    }

    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Calendar, T] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Calendar, T] */
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str) {
        Long l;
        int i;
        Object obj2;
        T t;
        Long l2;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i2 = jSONLexer.token();
        if (i2 == 2) {
            Long valueOf = Long.valueOf(jSONLexer.longValue());
            jSONLexer.nextToken(16);
            l2 = valueOf;
        } else if (i2 == 4) {
            String stringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            l2 = stringVal;
            if ((jSONLexer.features & Feature.AllowISO8601DateFormat.mask) != 0) {
                JSONLexer jSONLexer2 = new JSONLexer(stringVal);
                Date date = stringVal;
                if (jSONLexer2.scanISO8601DateIfMatch(true)) {
                    ?? r1 = (T) jSONLexer2.calendar;
                    if (type == Calendar.class) {
                        jSONLexer2.close();
                        return r1;
                    }
                    date = r1.getTime();
                }
                jSONLexer2.close();
                l2 = date;
            }
        } else if (i2 == 8) {
            jSONLexer.nextToken();
            obj2 = null;
            t = (T) cast(defaultJSONParser, type, obj, obj2, str);
            if (type != Calendar.class && !(t instanceof Calendar)) {
                Date date2 = (Date) t;
                if (date2 == null) {
                    return null;
                }
                ?? r12 = (T) Calendar.getInstance(jSONLexer.timeZone, jSONLexer.locale);
                r12.setTime(date2);
                return r12;
            }
        } else {
            if (i2 == 12) {
                jSONLexer.nextToken();
                if (jSONLexer.token() != 4) {
                    throw new JSONException("syntax error");
                }
                if (JSON.DEFAULT_TYPE_KEY.equals(jSONLexer.stringVal())) {
                    jSONLexer.nextToken();
                    defaultJSONParser.accept(17);
                    Class<?> checkAutoType = defaultJSONParser.config.checkAutoType(jSONLexer.stringVal(), null, jSONLexer.features);
                    if (checkAutoType != null) {
                        type = checkAutoType;
                    }
                    defaultJSONParser.accept(4);
                    defaultJSONParser.accept(16);
                }
                jSONLexer.nextTokenWithChar(riy.CONDITION_IF_MIDDLE);
                if (jSONLexer.token() != 2) {
                    throw new JSONException("syntax error : " + JSONToken.name(i));
                }
                long longValue = jSONLexer.longValue();
                jSONLexer.nextToken();
                l = Long.valueOf(longValue);
            } else if (defaultJSONParser.resolveStatus == 2) {
                defaultJSONParser.resolveStatus = 0;
                defaultJSONParser.accept(16);
                if (jSONLexer.token() != 4) {
                    throw new JSONException("syntax error");
                }
                if (!"val".equals(jSONLexer.stringVal())) {
                    throw new JSONException("syntax error");
                }
                jSONLexer.nextToken();
                defaultJSONParser.accept(17);
                l = defaultJSONParser.parse();
            } else {
                l2 = defaultJSONParser.parse();
            }
            defaultJSONParser.accept(13);
            l2 = l;
        }
        obj2 = l2;
        t = (T) cast(defaultJSONParser, type, obj, obj2, str);
        return type != Calendar.class ? t : t;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        char[] charArray;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
        } else if ((serializeWriter.features & SerializerFeature.WriteClassName.mask) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                serializeWriter.write("new Date(");
                serializeWriter.writeLong(((Date) obj).getTime());
                serializeWriter.write(41);
                return;
            }
            serializeWriter.write(123);
            serializeWriter.writeFieldName(JSON.DEFAULT_TYPE_KEY, false);
            jSONSerializer.write(obj.getClass().getName());
            serializeWriter.write(44);
            serializeWriter.writeFieldName("val", false);
            serializeWriter.writeLong(((Date) obj).getTime());
            serializeWriter.write(125);
        } else {
            Date time = obj instanceof Calendar ? ((Calendar) obj).getTime() : (Date) obj;
            if ((serializeWriter.features & SerializerFeature.WriteDateUseDateFormat.mask) != 0) {
                DateFormat dateFormat = jSONSerializer.getDateFormat();
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(JSON.DEFFAULT_DATE_FORMAT, jSONSerializer.locale);
                    dateFormat.setTimeZone(jSONSerializer.timeZone);
                }
                serializeWriter.writeString(dateFormat.format(time));
                return;
            }
            long time2 = time.getTime();
            if ((serializeWriter.features & SerializerFeature.UseISO8601DateFormat.mask) == 0) {
                serializeWriter.writeLong(time2);
                return;
            }
            if ((serializeWriter.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
                serializeWriter.write(39);
            } else {
                serializeWriter.write(34);
            }
            Calendar calendar = Calendar.getInstance(jSONSerializer.timeZone, jSONSerializer.locale);
            calendar.setTimeInMillis(time2);
            int i = calendar.get(1);
            int i2 = calendar.get(2) + 1;
            int i3 = calendar.get(5);
            int i4 = calendar.get(11);
            int i5 = calendar.get(12);
            int i6 = calendar.get(13);
            int i7 = calendar.get(14);
            if (i7 != 0) {
                charArray = "0000-00-00T00:00:00.000".toCharArray();
                SerializeWriter.getChars(i7, 23, charArray);
                SerializeWriter.getChars(i6, 19, charArray);
                SerializeWriter.getChars(i5, 16, charArray);
                SerializeWriter.getChars(i4, 13, charArray);
                SerializeWriter.getChars(i3, 10, charArray);
                SerializeWriter.getChars(i2, 7, charArray);
                SerializeWriter.getChars(i, 4, charArray);
            } else if (i6 == 0 && i5 == 0 && i4 == 0) {
                charArray = "0000-00-00".toCharArray();
                SerializeWriter.getChars(i3, 10, charArray);
                SerializeWriter.getChars(i2, 7, charArray);
                SerializeWriter.getChars(i, 4, charArray);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                SerializeWriter.getChars(i6, 19, charArray);
                SerializeWriter.getChars(i5, 16, charArray);
                SerializeWriter.getChars(i4, 13, charArray);
                SerializeWriter.getChars(i3, 10, charArray);
                SerializeWriter.getChars(i2, 7, charArray);
                SerializeWriter.getChars(i, 4, charArray);
            }
            serializeWriter.write(charArray);
            if ((serializeWriter.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
                serializeWriter.write(39);
            } else {
                serializeWriter.write(34);
            }
        }
    }
}
