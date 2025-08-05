package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class JavaBeanSerializer implements ObjectSerializer {
    private static final char[] false_chars;
    private static final char[] true_chars;
    protected int features;
    private final FieldSerializer[] getters;
    private final FieldSerializer[] sortedGetters;
    protected final String typeKey;
    protected final String typeName;

    static {
        kge.a(-570741065);
        kge.a(1456819588);
        true_chars = new char[]{'t', 'r', 'u', 'e'};
        false_chars = new char[]{'f', 'a', 'l', 's', 'e'};
    }

    public JavaBeanSerializer(Class<?> cls) {
        this(cls, (PropertyNamingStrategy) null);
    }

    public JavaBeanSerializer(Class<?> cls, int i, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
        PropertyNamingStrategy propertyNamingStrategy2;
        String str;
        String str2;
        PropertyNamingStrategy naming;
        this.features = 0;
        String[] strArr = null;
        JSONType jSONType = z2 ? (JSONType) cls.getAnnotation(JSONType.class) : null;
        if (jSONType != null) {
            this.features = SerializerFeature.of(jSONType.serialzeFeatures());
            str = jSONType.typeName();
            if (str.length() == 0) {
                str = null;
                str2 = null;
            } else {
                String str3 = null;
                for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    JSONType jSONType2 = (JSONType) superclass.getAnnotation(JSONType.class);
                    if (jSONType2 == null) {
                        break;
                    }
                    str3 = jSONType2.typeKey();
                    if (str3.length() != 0) {
                        break;
                    }
                }
                str2 = str3;
                for (Class<?> cls2 : cls.getInterfaces()) {
                    JSONType jSONType3 = (JSONType) cls2.getAnnotation(JSONType.class);
                    if (jSONType3 != null) {
                        str2 = jSONType3.typeKey();
                        if (str2.length() != 0) {
                            break;
                        }
                    }
                }
                if (str2 != null && str2.length() == 0) {
                    str2 = null;
                }
            }
            propertyNamingStrategy2 = (propertyNamingStrategy != null || (naming = jSONType.naming()) == PropertyNamingStrategy.CamelCase) ? propertyNamingStrategy : naming;
        } else {
            propertyNamingStrategy2 = propertyNamingStrategy;
            str = null;
            str2 = null;
        }
        this.typeName = str;
        this.typeKey = str2;
        List<FieldInfo> computeGetters = TypeUtils.computeGetters(cls, i, z, jSONType, map, false, z3, z4, propertyNamingStrategy2);
        ArrayList arrayList = new ArrayList();
        for (FieldInfo fieldInfo : computeGetters) {
            arrayList.add(new FieldSerializer(fieldInfo));
        }
        this.getters = (FieldSerializer[]) arrayList.toArray(new FieldSerializer[arrayList.size()]);
        strArr = jSONType != null ? jSONType.orders() : strArr;
        if (strArr != null && strArr.length != 0) {
            List<FieldInfo> computeGetters2 = TypeUtils.computeGetters(cls, i, z, jSONType, map, true, z3, z4, propertyNamingStrategy2);
            ArrayList arrayList2 = new ArrayList();
            for (FieldInfo fieldInfo2 : computeGetters2) {
                arrayList2.add(new FieldSerializer(fieldInfo2));
            }
            this.sortedGetters = (FieldSerializer[]) arrayList2.toArray(new FieldSerializer[arrayList2.size()]);
            return;
        }
        FieldSerializer[] fieldSerializerArr = this.getters;
        FieldSerializer[] fieldSerializerArr2 = new FieldSerializer[fieldSerializerArr.length];
        System.arraycopy(fieldSerializerArr, 0, fieldSerializerArr2, 0, fieldSerializerArr.length);
        Arrays.sort(fieldSerializerArr2);
        if (Arrays.equals(fieldSerializerArr2, this.getters)) {
            this.sortedGetters = this.getters;
        } else {
            this.sortedGetters = fieldSerializerArr2;
        }
    }

    public JavaBeanSerializer(Class<?> cls, PropertyNamingStrategy propertyNamingStrategy) {
        this(cls, cls.getModifiers(), null, false, true, true, true, propertyNamingStrategy);
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
        this(cls, cls.getModifiers(), map(strArr), false, true, true, true, null);
    }

    private static Map<String, String> map(String... strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, str);
        }
        return hashMap;
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        FieldSerializer[] fieldSerializerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            linkedHashMap.put(fieldSerializer.fieldInfo.name, fieldSerializer.getPropertyValue(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(7:91|92|(3:(3:107|(3:110|(2:112|113)|108)|394)|395|(9:115|(10:117|(1:119)(2:385|(1:387)(2:388|(8:390|121|(6:(7:124|(1:126)(2:376|(1:378)(2:379|(1:381)))|127|128|(3:131|(2:134|135)(1:133)|129)|373|374)(1:383)|382|128|(1:129)|373|374)(1:384)|375|(6:(6:(7:140|(1:142)(2:364|(1:366)(2:367|(1:369)))|143|144|(2:147|145)|148|149)|370|144|(1:145)|148|149)(1:371)|(5:(3:153|(1:155)(2:157|(1:159)(2:160|(1:162)))|156)|163|(3:166|167|164)|168|169)(1:363)|170|(1:362)(3:173|174|(4:176|(1:316)(2:180|(1:182))|183|(1:315))(2:317|(2:319|(2:325|(1:329)))(2:330|(2:332|(2:338|(1:342)))(2:343|(2:345|(2:351|(1:355)))(1:(2:357|(2:359|(1:361))))))))|187|(7:(1:314)(4:214|(2:216|(1:218)(1:219))|220|(1:222))|(1:(1:225))(1:(1:(1:232))(6:(1:(4:235|(2:237|(1:239)(5:240|(1:241)|243|244|245))|246|245)(1:247))|(5:(3:284|(2:286|(3:288|(1:293)|294)(2:295|(1:298)))(2:299|(4:(2:302|(3:304|(1:306)(1:310)|(1:308)(1:309))(1:311))(1:312)|228|229|101))|297)|313|228|229|101)(2:250|(2:252|(1:254)(10:(1:256)(1:274)|257|(2:260|258)|261|262|(1:264)|265|(2:267|(1:269)(2:270|(1:272)))|273|(0)))(2:275|(1:277)(2:278|(1:(1:281)(1:282)))))|227|228|229|101))|226|227|228|229|101))(1:372)|99|100|101)(1:391)))|120|121|(0)(0)|375|(0)(0)|99|100|101)(1:393)|392|(0)(0)|375|(0)(0)|99|100|101))|98|99|100|101)|88|89) */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0623, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0624, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0627, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0628, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0631, code lost:
        r4 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0148 A[Catch: all -> 0x00a0, Exception -> 0x00a5, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a5, all -> 0x00a0, blocks: (B:41:0x0093, B:43:0x0097, B:44:0x009b, B:52:0x00b5, B:54:0x00be, B:58:0x00cd, B:61:0x00d8, B:63:0x00e1, B:65:0x00e5, B:71:0x00f1, B:73:0x00f7, B:75:0x00fb, B:77:0x0102, B:79:0x0109, B:80:0x0111, B:89:0x0123, B:90:0x0129, B:92:0x012f, B:100:0x0148, B:76:0x00fe), top: B:463:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0249 A[Catch: all -> 0x05b7, Exception -> 0x05bd, TryCatch #7 {Exception -> 0x05bd, all -> 0x05b7, blocks: (B:117:0x017e, B:119:0x0199, B:121:0x019d, B:123:0x01a1, B:125:0x01a5, B:128:0x01af, B:129:0x01b3, B:131:0x01b9, B:136:0x01ca, B:138:0x01d1, B:140:0x01d5, B:154:0x021a, B:156:0x0220, B:166:0x023f, B:167:0x0243, B:169:0x0249, B:180:0x0272, B:182:0x0276, B:191:0x0291, B:192:0x0298, B:194:0x029e, B:200:0x02bb, B:202:0x02bf, B:204:0x02c6, B:206:0x02ca, B:207:0x02cf, B:209:0x02d3, B:210:0x02d8, B:211:0x02de, B:213:0x02e4, B:221:0x0304, B:223:0x0310, B:225:0x031d, B:227:0x0321, B:231:0x032b, B:233:0x032e, B:286:0x03d4, B:288:0x03d8, B:290:0x03dc, B:292:0x03e0, B:294:0x03e4, B:296:0x03e8, B:302:0x03f9, B:304:0x03fd, B:306:0x0401, B:298:0x03ec, B:300:0x03f0, B:309:0x040c, B:311:0x0415, B:313:0x0419, B:314:0x041d, B:315:0x0421, B:317:0x0434, B:321:0x043e, B:322:0x0442, B:326:0x044c, B:329:0x0454, B:331:0x045f, B:333:0x0463, B:335:0x0469, B:339:0x048a, B:340:0x0494, B:343:0x049b, B:347:0x04a3, B:352:0x04af, B:354:0x04b5, B:356:0x04b9, B:357:0x04bb, B:359:0x04c3, B:361:0x04c7, B:362:0x04cb, B:365:0x04db, B:366:0x04e5, B:367:0x04e8, B:369:0x04ec, B:370:0x04f5, B:373:0x04fb, B:374:0x0508, B:378:0x051b, B:380:0x0522, B:382:0x052b, B:385:0x0533, B:386:0x0538, B:387:0x053f, B:389:0x0543, B:390:0x0548, B:391:0x054f, B:394:0x0557, B:396:0x0560, B:402:0x0575, B:403:0x057a, B:404:0x0585, B:405:0x058a, B:235:0x0333, B:238:0x0342, B:240:0x034d, B:242:0x0351, B:244:0x0356, B:246:0x0359, B:249:0x0362, B:251:0x036a, B:253:0x0375, B:255:0x0379, B:257:0x037e, B:259:0x0381, B:261:0x0386, B:262:0x038c, B:264:0x0394, B:266:0x039f, B:268:0x03a3, B:270:0x03a8, B:272:0x03ab, B:274:0x03b0, B:276:0x03b9, B:278:0x03bd, B:184:0x027d, B:186:0x0281, B:187:0x0286, B:189:0x028a, B:158:0x0229, B:160:0x022d, B:161:0x0232, B:163:0x0236, B:143:0x01e3, B:145:0x01e7, B:146:0x01f2, B:148:0x01f6, B:149:0x0203, B:150:0x020a, B:421:0x05d1, B:422:0x05d9, B:424:0x05df, B:429:0x05f1, B:431:0x05fa, B:434:0x060a, B:436:0x060e, B:437:0x0612), top: B:467:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029e A[Catch: all -> 0x05b7, Exception -> 0x05bd, LOOP:4: B:192:0x0298->B:194:0x029e, LOOP_END, TryCatch #7 {Exception -> 0x05bd, all -> 0x05b7, blocks: (B:117:0x017e, B:119:0x0199, B:121:0x019d, B:123:0x01a1, B:125:0x01a5, B:128:0x01af, B:129:0x01b3, B:131:0x01b9, B:136:0x01ca, B:138:0x01d1, B:140:0x01d5, B:154:0x021a, B:156:0x0220, B:166:0x023f, B:167:0x0243, B:169:0x0249, B:180:0x0272, B:182:0x0276, B:191:0x0291, B:192:0x0298, B:194:0x029e, B:200:0x02bb, B:202:0x02bf, B:204:0x02c6, B:206:0x02ca, B:207:0x02cf, B:209:0x02d3, B:210:0x02d8, B:211:0x02de, B:213:0x02e4, B:221:0x0304, B:223:0x0310, B:225:0x031d, B:227:0x0321, B:231:0x032b, B:233:0x032e, B:286:0x03d4, B:288:0x03d8, B:290:0x03dc, B:292:0x03e0, B:294:0x03e4, B:296:0x03e8, B:302:0x03f9, B:304:0x03fd, B:306:0x0401, B:298:0x03ec, B:300:0x03f0, B:309:0x040c, B:311:0x0415, B:313:0x0419, B:314:0x041d, B:315:0x0421, B:317:0x0434, B:321:0x043e, B:322:0x0442, B:326:0x044c, B:329:0x0454, B:331:0x045f, B:333:0x0463, B:335:0x0469, B:339:0x048a, B:340:0x0494, B:343:0x049b, B:347:0x04a3, B:352:0x04af, B:354:0x04b5, B:356:0x04b9, B:357:0x04bb, B:359:0x04c3, B:361:0x04c7, B:362:0x04cb, B:365:0x04db, B:366:0x04e5, B:367:0x04e8, B:369:0x04ec, B:370:0x04f5, B:373:0x04fb, B:374:0x0508, B:378:0x051b, B:380:0x0522, B:382:0x052b, B:385:0x0533, B:386:0x0538, B:387:0x053f, B:389:0x0543, B:390:0x0548, B:391:0x054f, B:394:0x0557, B:396:0x0560, B:402:0x0575, B:403:0x057a, B:404:0x0585, B:405:0x058a, B:235:0x0333, B:238:0x0342, B:240:0x034d, B:242:0x0351, B:244:0x0356, B:246:0x0359, B:249:0x0362, B:251:0x036a, B:253:0x0375, B:255:0x0379, B:257:0x037e, B:259:0x0381, B:261:0x0386, B:262:0x038c, B:264:0x0394, B:266:0x039f, B:268:0x03a3, B:270:0x03a8, B:272:0x03ab, B:274:0x03b0, B:276:0x03b9, B:278:0x03bd, B:184:0x027d, B:186:0x0281, B:187:0x0286, B:189:0x028a, B:158:0x0229, B:160:0x022d, B:161:0x0232, B:163:0x0236, B:143:0x01e3, B:145:0x01e7, B:146:0x01f2, B:148:0x01f6, B:149:0x0203, B:150:0x020a, B:421:0x05d1, B:422:0x05d9, B:424:0x05df, B:429:0x05f1, B:431:0x05fa, B:434:0x060a, B:436:0x060e, B:437:0x0612), top: B:467:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x04db A[Catch: all -> 0x05b7, Exception -> 0x05bd, TryCatch #7 {Exception -> 0x05bd, all -> 0x05b7, blocks: (B:117:0x017e, B:119:0x0199, B:121:0x019d, B:123:0x01a1, B:125:0x01a5, B:128:0x01af, B:129:0x01b3, B:131:0x01b9, B:136:0x01ca, B:138:0x01d1, B:140:0x01d5, B:154:0x021a, B:156:0x0220, B:166:0x023f, B:167:0x0243, B:169:0x0249, B:180:0x0272, B:182:0x0276, B:191:0x0291, B:192:0x0298, B:194:0x029e, B:200:0x02bb, B:202:0x02bf, B:204:0x02c6, B:206:0x02ca, B:207:0x02cf, B:209:0x02d3, B:210:0x02d8, B:211:0x02de, B:213:0x02e4, B:221:0x0304, B:223:0x0310, B:225:0x031d, B:227:0x0321, B:231:0x032b, B:233:0x032e, B:286:0x03d4, B:288:0x03d8, B:290:0x03dc, B:292:0x03e0, B:294:0x03e4, B:296:0x03e8, B:302:0x03f9, B:304:0x03fd, B:306:0x0401, B:298:0x03ec, B:300:0x03f0, B:309:0x040c, B:311:0x0415, B:313:0x0419, B:314:0x041d, B:315:0x0421, B:317:0x0434, B:321:0x043e, B:322:0x0442, B:326:0x044c, B:329:0x0454, B:331:0x045f, B:333:0x0463, B:335:0x0469, B:339:0x048a, B:340:0x0494, B:343:0x049b, B:347:0x04a3, B:352:0x04af, B:354:0x04b5, B:356:0x04b9, B:357:0x04bb, B:359:0x04c3, B:361:0x04c7, B:362:0x04cb, B:365:0x04db, B:366:0x04e5, B:367:0x04e8, B:369:0x04ec, B:370:0x04f5, B:373:0x04fb, B:374:0x0508, B:378:0x051b, B:380:0x0522, B:382:0x052b, B:385:0x0533, B:386:0x0538, B:387:0x053f, B:389:0x0543, B:390:0x0548, B:391:0x054f, B:394:0x0557, B:396:0x0560, B:402:0x0575, B:403:0x057a, B:404:0x0585, B:405:0x058a, B:235:0x0333, B:238:0x0342, B:240:0x034d, B:242:0x0351, B:244:0x0356, B:246:0x0359, B:249:0x0362, B:251:0x036a, B:253:0x0375, B:255:0x0379, B:257:0x037e, B:259:0x0381, B:261:0x0386, B:262:0x038c, B:264:0x0394, B:266:0x039f, B:268:0x03a3, B:270:0x03a8, B:272:0x03ab, B:274:0x03b0, B:276:0x03b9, B:278:0x03bd, B:184:0x027d, B:186:0x0281, B:187:0x0286, B:189:0x028a, B:158:0x0229, B:160:0x022d, B:161:0x0232, B:163:0x0236, B:143:0x01e3, B:145:0x01e7, B:146:0x01f2, B:148:0x01f6, B:149:0x0203, B:150:0x020a, B:421:0x05d1, B:422:0x05d9, B:424:0x05df, B:429:0x05f1, B:431:0x05fa, B:434:0x060a, B:436:0x060e, B:437:0x0612), top: B:467:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x05f1 A[Catch: all -> 0x05b7, Exception -> 0x05bd, TRY_ENTER, TryCatch #7 {Exception -> 0x05bd, all -> 0x05b7, blocks: (B:117:0x017e, B:119:0x0199, B:121:0x019d, B:123:0x01a1, B:125:0x01a5, B:128:0x01af, B:129:0x01b3, B:131:0x01b9, B:136:0x01ca, B:138:0x01d1, B:140:0x01d5, B:154:0x021a, B:156:0x0220, B:166:0x023f, B:167:0x0243, B:169:0x0249, B:180:0x0272, B:182:0x0276, B:191:0x0291, B:192:0x0298, B:194:0x029e, B:200:0x02bb, B:202:0x02bf, B:204:0x02c6, B:206:0x02ca, B:207:0x02cf, B:209:0x02d3, B:210:0x02d8, B:211:0x02de, B:213:0x02e4, B:221:0x0304, B:223:0x0310, B:225:0x031d, B:227:0x0321, B:231:0x032b, B:233:0x032e, B:286:0x03d4, B:288:0x03d8, B:290:0x03dc, B:292:0x03e0, B:294:0x03e4, B:296:0x03e8, B:302:0x03f9, B:304:0x03fd, B:306:0x0401, B:298:0x03ec, B:300:0x03f0, B:309:0x040c, B:311:0x0415, B:313:0x0419, B:314:0x041d, B:315:0x0421, B:317:0x0434, B:321:0x043e, B:322:0x0442, B:326:0x044c, B:329:0x0454, B:331:0x045f, B:333:0x0463, B:335:0x0469, B:339:0x048a, B:340:0x0494, B:343:0x049b, B:347:0x04a3, B:352:0x04af, B:354:0x04b5, B:356:0x04b9, B:357:0x04bb, B:359:0x04c3, B:361:0x04c7, B:362:0x04cb, B:365:0x04db, B:366:0x04e5, B:367:0x04e8, B:369:0x04ec, B:370:0x04f5, B:373:0x04fb, B:374:0x0508, B:378:0x051b, B:380:0x0522, B:382:0x052b, B:385:0x0533, B:386:0x0538, B:387:0x053f, B:389:0x0543, B:390:0x0548, B:391:0x054f, B:394:0x0557, B:396:0x0560, B:402:0x0575, B:403:0x057a, B:404:0x0585, B:405:0x058a, B:235:0x0333, B:238:0x0342, B:240:0x034d, B:242:0x0351, B:244:0x0356, B:246:0x0359, B:249:0x0362, B:251:0x036a, B:253:0x0375, B:255:0x0379, B:257:0x037e, B:259:0x0381, B:261:0x0386, B:262:0x038c, B:264:0x0394, B:266:0x039f, B:268:0x03a3, B:270:0x03a8, B:272:0x03ab, B:274:0x03b0, B:276:0x03b9, B:278:0x03bd, B:184:0x027d, B:186:0x0281, B:187:0x0286, B:189:0x028a, B:158:0x0229, B:160:0x022d, B:161:0x0232, B:163:0x0236, B:143:0x01e3, B:145:0x01e7, B:146:0x01f2, B:148:0x01f6, B:149:0x0203, B:150:0x020a, B:421:0x05d1, B:422:0x05d9, B:424:0x05df, B:429:0x05f1, B:431:0x05fa, B:434:0x060a, B:436:0x060e, B:437:0x0612), top: B:467:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x060a A[Catch: all -> 0x05b7, Exception -> 0x05bd, TRY_ENTER, TryCatch #7 {Exception -> 0x05bd, all -> 0x05b7, blocks: (B:117:0x017e, B:119:0x0199, B:121:0x019d, B:123:0x01a1, B:125:0x01a5, B:128:0x01af, B:129:0x01b3, B:131:0x01b9, B:136:0x01ca, B:138:0x01d1, B:140:0x01d5, B:154:0x021a, B:156:0x0220, B:166:0x023f, B:167:0x0243, B:169:0x0249, B:180:0x0272, B:182:0x0276, B:191:0x0291, B:192:0x0298, B:194:0x029e, B:200:0x02bb, B:202:0x02bf, B:204:0x02c6, B:206:0x02ca, B:207:0x02cf, B:209:0x02d3, B:210:0x02d8, B:211:0x02de, B:213:0x02e4, B:221:0x0304, B:223:0x0310, B:225:0x031d, B:227:0x0321, B:231:0x032b, B:233:0x032e, B:286:0x03d4, B:288:0x03d8, B:290:0x03dc, B:292:0x03e0, B:294:0x03e4, B:296:0x03e8, B:302:0x03f9, B:304:0x03fd, B:306:0x0401, B:298:0x03ec, B:300:0x03f0, B:309:0x040c, B:311:0x0415, B:313:0x0419, B:314:0x041d, B:315:0x0421, B:317:0x0434, B:321:0x043e, B:322:0x0442, B:326:0x044c, B:329:0x0454, B:331:0x045f, B:333:0x0463, B:335:0x0469, B:339:0x048a, B:340:0x0494, B:343:0x049b, B:347:0x04a3, B:352:0x04af, B:354:0x04b5, B:356:0x04b9, B:357:0x04bb, B:359:0x04c3, B:361:0x04c7, B:362:0x04cb, B:365:0x04db, B:366:0x04e5, B:367:0x04e8, B:369:0x04ec, B:370:0x04f5, B:373:0x04fb, B:374:0x0508, B:378:0x051b, B:380:0x0522, B:382:0x052b, B:385:0x0533, B:386:0x0538, B:387:0x053f, B:389:0x0543, B:390:0x0548, B:391:0x054f, B:394:0x0557, B:396:0x0560, B:402:0x0575, B:403:0x057a, B:404:0x0585, B:405:0x058a, B:235:0x0333, B:238:0x0342, B:240:0x034d, B:242:0x0351, B:244:0x0356, B:246:0x0359, B:249:0x0362, B:251:0x036a, B:253:0x0375, B:255:0x0379, B:257:0x037e, B:259:0x0381, B:261:0x0386, B:262:0x038c, B:264:0x0394, B:266:0x039f, B:268:0x03a3, B:270:0x03a8, B:272:0x03ab, B:274:0x03b0, B:276:0x03b9, B:278:0x03bd, B:184:0x027d, B:186:0x0281, B:187:0x0286, B:189:0x028a, B:158:0x0229, B:160:0x022d, B:161:0x0232, B:163:0x0236, B:143:0x01e3, B:145:0x01e7, B:146:0x01f2, B:148:0x01f6, B:149:0x0203, B:150:0x020a, B:421:0x05d1, B:422:0x05d9, B:424:0x05df, B:429:0x05f1, B:431:0x05fa, B:434:0x060a, B:436:0x060e, B:437:0x0612), top: B:467:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0639 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0123 A[Catch: all -> 0x00a0, Exception -> 0x00a5, TRY_ENTER, TryCatch #9 {Exception -> 0x00a5, all -> 0x00a0, blocks: (B:41:0x0093, B:43:0x0097, B:44:0x009b, B:52:0x00b5, B:54:0x00be, B:58:0x00cd, B:61:0x00d8, B:63:0x00e1, B:65:0x00e5, B:71:0x00f1, B:73:0x00f7, B:75:0x00fb, B:77:0x0102, B:79:0x0109, B:80:0x0111, B:89:0x0123, B:90:0x0129, B:92:0x012f, B:100:0x0148, B:76:0x00fe), top: B:463:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r36, java.lang.Object r37, java.lang.Object r38, java.lang.reflect.Type r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }
}
