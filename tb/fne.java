package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class fne {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NAME = "key";
    public static final String KEY_OP = "op";
    public static final String KEY_TYPE = "type";
    public static final String KEY_VALUE = "value";
    public static final String OP_EQUAL = "==";
    public static final String OP_GREATER = ">";
    public static final String OP_GREATER_EQUAL = ">=";
    public static final String OP_IN = "IN";
    public static final String OP_LESS = "<";
    public static final String OP_LESS_EQUAL = "<=";
    public static final String OP_LIKE = "LIKE";
    public static final String OP_NOT_EQUAL = "!=";
    public static final String OP_NOT_IN = "NOT_IN";
    public static final String OP_UNLIKE = "UNLIKE";
    public static final String TYPE_BOOLEAN = "BOOL";
    public static final String TYPE_DOUBLE = "DOUBLE";
    public static final String TYPE_DOUBLE_ARRAY = "DOUBLE[]";
    public static final String TYPE_INT = "INT";
    public static final String TYPE_INT_ARRAY = "INT[]";
    public static final String TYPE_STRING = "STRING";
    public static final String TYPE_STRING_ARRAY = "STRING[]";

    static {
        kge.a(-544416797);
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v20, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v24, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Double] */
    public static List<fng<?>> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (str != null && !str.isEmpty()) {
                JSONArray parseArray = JSON.parseArray(str);
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    String string = jSONObject.getString("key");
                    String string2 = jSONObject.getString(KEY_OP);
                    String string3 = jSONObject.getString("type");
                    char c = 65535;
                    switch (string3.hashCode()) {
                        case -1838656495:
                            if (string3.equals(TYPE_STRING)) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1717330125:
                            if (string3.equals(TYPE_STRING_ARRAY)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 72655:
                            if (string3.equals(TYPE_INT)) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2044650:
                            if (string3.equals(TYPE_BOOLEAN)) {
                                c = 1;
                                break;
                            }
                            break;
                        case 69824369:
                            if (string3.equals(TYPE_INT_ARRAY)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 2022338513:
                            if (string3.equals(TYPE_DOUBLE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 2142096115:
                            if (string3.equals(TYPE_DOUBLE_ARRAY)) {
                                c = 6;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            fng fngVar = new fng();
                            ?? integer = jSONObject.getInteger("value");
                            if (integer == 0) {
                                return null;
                            }
                            fngVar.d = integer;
                            fngVar.f28073a = string;
                            fngVar.c = string3;
                            fngVar.b = string2;
                            arrayList.add(fngVar);
                            break;
                        case 1:
                            fng fngVar2 = new fng();
                            ?? r5 = jSONObject.getBoolean("value");
                            if (r5 == 0) {
                                return null;
                            }
                            fngVar2.d = r5;
                            fngVar2.f28073a = string;
                            fngVar2.c = string3;
                            fngVar2.b = string2;
                            arrayList.add(fngVar2);
                            break;
                        case 2:
                            fng fngVar3 = new fng();
                            ?? string4 = jSONObject.getString("value");
                            if (string4 == 0) {
                                return null;
                            }
                            fngVar3.d = string4;
                            fngVar3.f28073a = string;
                            fngVar3.c = string3;
                            fngVar3.b = string2;
                            arrayList.add(fngVar3);
                            break;
                        case 3:
                            fng fngVar4 = new fng();
                            ?? r52 = jSONObject.getDouble("value");
                            if (r52 == 0) {
                                return null;
                            }
                            fngVar4.d = r52;
                            fngVar4.f28073a = string;
                            fngVar4.c = string3;
                            fngVar4.b = string2;
                            arrayList.add(fngVar4);
                            break;
                        case 4:
                            fng fngVar5 = new fng();
                            JSONArray jSONArray = jSONObject.getJSONArray("value");
                            fngVar5.d = new ArrayList();
                            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                String string5 = jSONArray.getString(i2);
                                if (string5 == null) {
                                    return null;
                                }
                                ((List) fngVar5.d).add(string5);
                            }
                            fngVar5.f28073a = string;
                            fngVar5.c = string3;
                            fngVar5.b = string2;
                            arrayList.add(fngVar5);
                            break;
                        case 5:
                            fng fngVar6 = new fng();
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            fngVar6.d = new ArrayList();
                            for (int i3 = 0; i3 < jSONArray2.size(); i3++) {
                                Integer integer2 = jSONArray2.getInteger(i3);
                                if (integer2 == null) {
                                    return null;
                                }
                                ((List) fngVar6.d).add(integer2);
                            }
                            fngVar6.f28073a = string;
                            fngVar6.c = string3;
                            fngVar6.b = string2;
                            arrayList.add(fngVar6);
                            break;
                        case 6:
                            fng fngVar7 = new fng();
                            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                            fngVar7.d = new ArrayList();
                            for (int i4 = 0; i4 < jSONArray3.size(); i4++) {
                                Double d = jSONArray3.getDouble(i4);
                                if (d == null) {
                                    return null;
                                }
                                ((List) fngVar7.d).add(d);
                            }
                            fngVar7.f28073a = string;
                            fngVar7.c = string3;
                            fngVar7.b = string2;
                            arrayList.add(fngVar7);
                            break;
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            v.a("ELV1", "compileExpression", e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03a0, code lost:
        if (r6.b().equals(r2.d) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0117, code lost:
        if (r6.b().toString().contains(r2.d.toString()) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013c, code lost:
        if (r6.b().toString().contains(r2.d.toString()) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0180 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c0 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0201 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0217 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0254 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026a A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a7 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bd A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02fa A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0310 A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x035a A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03a8 A[LOOP:0: B:12:0x002c->B:269:0x03a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7 A[Catch: Exception -> 0x03ac, TRY_ENTER, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f A[Catch: Exception -> 0x03ac, TryCatch #0 {Exception -> 0x03ac, blocks: (B:8:0x0021, B:11:0x0028, B:12:0x002c, B:14:0x0032, B:17:0x0041, B:72:0x00f7, B:74:0x00ff, B:76:0x0105, B:79:0x011c, B:81:0x0124, B:83:0x012a, B:86:0x013f, B:105:0x0170, B:91:0x014c, B:94:0x0156, B:97:0x0160, B:106:0x0180, B:125:0x01b2, B:111:0x018d, B:114:0x0197, B:117:0x01a1, B:126:0x01c0, B:141:0x01e5, B:146:0x0201, B:131:0x01ce, B:134:0x01d6, B:149:0x0217, B:164:0x023c, B:167:0x0254, B:154:0x0225, B:157:0x022d, B:170:0x026a, B:185:0x028f, B:188:0x02a7, B:175:0x0278, B:178:0x0280, B:191:0x02bd, B:206:0x02e2, B:209:0x02fa, B:196:0x02cb, B:199:0x02d3, B:212:0x0310, B:213:0x0316, B:234:0x0346, B:236:0x034c, B:215:0x031a, B:218:0x0322, B:221:0x032a, B:224:0x0332, B:239:0x035a, B:240:0x0360, B:261:0x0390, B:263:0x0396, B:242:0x0364, B:245:0x036c, B:248:0x0374, B:251:0x037c, B:38:0x0074, B:41:0x007f, B:44:0x0089, B:47:0x0093, B:50:0x009d, B:53:0x00a7, B:56:0x00b1, B:59:0x00bb, B:62:0x00c5, B:65:0x00d0), top: B:274:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(tb.fmx r16, java.util.List<tb.fng<?>> r17) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fne.a(tb.fmx, java.util.List):boolean");
    }
}
