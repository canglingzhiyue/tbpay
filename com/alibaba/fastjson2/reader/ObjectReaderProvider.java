package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.sql.DataSource;
import javax.sql.RowSet;
import tb.aai;
import tb.aak;
import tb.adb;
import tb.dra;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class ObjectReaderProvider {
    static a f;
    public final cd l;
    private ConcurrentMap<Type, Map<Type, com.alibaba.fastjson2.function.d>> n;
    private JSONReader.a q;
    private com.alibaba.fastjson2.function.c<Class> r;
    final ConcurrentMap<Type, bu> g = new ConcurrentHashMap();
    final ConcurrentMap<Type, bu> h = new ConcurrentHashMap();
    final ConcurrentMap<Long, bu> i = new ConcurrentHashMap();
    final ConcurrentMap<Class, Class> j = new ConcurrentHashMap();
    final LRUAutoTypeCache k = new LRUAutoTypeCache(1024);
    private long[] o = {-9164606388214699518L, -8754006975464705441L, -8720046426850100497L, -8649961213709896794L, -8614556368991373401L, -8382625455832334425L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6149130139291498841L, -6149093380703242441L, -6088208984980396913L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5767141746063564198L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4836620931940850535L, -4733542790109620528L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3967588558552655563L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -803541446955902575L, -731978084025273882L, -666475508176557463L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 744602970950881621L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1268707909007641340L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3058452313624178956L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3740226159580918099L, 3794316665763266033L, 3977090344859527316L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4215053018660518963L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5120543992130540564L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5916409771425455946L, 5944107969236155580L, 6007332606592876737L, 6090377589998869205L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6800727078373023163L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7164889056054194741L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8064026652676081192L, 8389032537095247355L, 8488266005336625107L, 8537233257283452655L, 8735538376409180149L, 8838294710098435315L, 8861402923078831179L, 9140390920032557669L, 9140416208800006522L, 9144212112462101475L};
    private long[] p = {-6293031534589903644L};

    /* loaded from: classes2.dex */
    public static final class LRUAutoTypeCache extends LinkedHashMap<String, Date> {
        private final int maxSize;

        static {
            kge.a(-1675049807);
        }

        public LRUAutoTypeCache(int i) {
            super(16, 0.75f, false);
            this.maxSize = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, Date> entry) {
            return size() > this.maxSize;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        final long f2948a;
        final bu b;
        volatile int c;

        static {
            kge.a(-1652825485);
        }

        public a(long j, bu buVar) {
            this.f2948a = j;
            this.b = buVar;
        }
    }

    static {
        kge.a(1523996989);
    }

    public ObjectReaderProvider() {
        this.i.put(Long.valueOf((long) br.TYPE_HASH_CODE), br.INSTANCE);
        this.i.put(-4834614249632438472L, ee.f3010a);
        this.i.put(77L, du.d);
        this.l = cd.INSTANCE;
    }

    static com.alibaba.fastjson2.function.d a(ConcurrentMap<Type, Map<Type, com.alibaba.fastjson2.function.d>> concurrentMap, Type type, Type type2, com.alibaba.fastjson2.function.d dVar) {
        Map<Type, com.alibaba.fastjson2.function.d> map = concurrentMap.get(type);
        if (map == null) {
            concurrentMap.put(type, new ConcurrentHashMap());
            map = concurrentMap.get(type);
        }
        return map.put(type2, dVar);
    }

    public static bu a(Class cls, Class cls2, Type type, Type type2) {
        return ((type == null || type == String.class) && type2 == String.class) ? new dx(cls, cls2, 0L) : new dy(cls, cls2, type, type2, 0L, null);
    }

    private bu a(boolean z, Type type, bu buVar) {
        return (z ? this.h : this.g).put(type, buVar);
    }

    public static /* synthetic */ Object a(Object obj) {
        if (obj == null || "null".equals(obj) || "".equals(obj)) {
            return null;
        }
        return UUID.fromString((String) obj);
    }

    public static /* synthetic */ InetAddress a(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException e) {
            throw new JSONException("create address error", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x002c, code lost:
        if (r1 == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002f, code lost:
        r6 = (java.lang.String) r9.invoke(r6, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
        if (r6.isEmpty() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003d, code lost:
        r7.e = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(java.lang.annotation.Annotation r6, tb.aai r7, java.lang.Class r8, java.lang.reflect.Method r9) {
        /*
            java.lang.String r0 = r9.getName()     // Catch: java.lang.Throwable -> L4e
            r1 = -1
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L4e
            r3 = 2068281583(0x7b4778ef, float:1.0357199E36)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L21
            r3 = 2092901112(0x7cbf22f8, float:7.9395036E36)
            if (r2 == r3) goto L16
            goto L2a
        L16:
            java.lang.String r2 = "withPrefix"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L2a
            r1 = 1
            goto L2a
        L21:
            java.lang.String r2 = "buildMethod"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L2a
            r1 = 0
        L2a:
            if (r1 == 0) goto L40
            if (r1 == r4) goto L2f
            goto L3f
        L2f:
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r9.invoke(r6, r8)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L4e
            boolean r8 = r6.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r8 != 0) goto L3f
            r7.e = r6     // Catch: java.lang.Throwable -> L4e
        L3f:
            return
        L40:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L4e
            java.lang.reflect.Method r6 = com.alibaba.fastjson2.util.BeanUtils.d(r8, r6)     // Catch: java.lang.Throwable -> L4e
            r7.d = r6     // Catch: java.lang.Throwable -> L4e
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.a(java.lang.annotation.Annotation, tb.aai, java.lang.Class, java.lang.reflect.Method):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(java.lang.annotation.Annotation r5, tb.aai r6, java.lang.reflect.Method r7) {
        /*
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L29
            r1 = -1
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L29
            r3 = 1117066527(0x4295151f, float:74.54125)
            r4 = 0
            if (r2 == r3) goto L10
            goto L19
        L10:
            java.lang.String r2 = "parameterNames"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L19
            r1 = 0
        L19:
            if (r1 == 0) goto L1c
            goto L29
        L1c:
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L29
            int r7 = r5.length     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L29
            r6.l = r5     // Catch: java.lang.Throwable -> L29
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.a(java.lang.annotation.Annotation, tb.aai, java.lang.reflect.Method):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00dc A[Catch: Throwable -> 0x0174, TryCatch #0 {Throwable -> 0x0174, blocks: (B:124:0x0007, B:125:0x0014, B:155:0x0074, B:157:0x0079, B:159:0x0083, B:160:0x0087, B:162:0x008d, B:187:0x00e1, B:183:0x00cd, B:184:0x00d1, B:185:0x00d7, B:186:0x00dc, B:169:0x00a7, B:172:0x00b1, B:175:0x00bb, B:188:0x00e4, B:190:0x00ec, B:191:0x00f0, B:193:0x00f8, B:194:0x0100, B:196:0x0105, B:198:0x0109, B:199:0x010c, B:200:0x0130, B:202:0x0138, B:203:0x013b, B:205:0x0143, B:206:0x0146, B:208:0x014e, B:210:0x015a, B:212:0x0160, B:213:0x0166, B:214:0x0169, B:216:0x0171, B:127:0x0018, B:130:0x0022, B:133:0x002d, B:136:0x0037, B:139:0x0041, B:142:0x004b, B:145:0x0055, B:148:0x005f, B:151:0x0069), top: B:219:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(java.lang.annotation.Annotation r10, tb.aak r11, java.lang.reflect.Method r12) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.a(java.lang.annotation.Annotation, tb.aak, java.lang.reflect.Method):void");
    }

    private void a(final aai aaiVar, final Class<?> cls, final Annotation annotation, Class<? extends Annotation> cls2) {
        BeanUtils.d(cls2, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$BZXeLBkorkIZmCGcA8hMO3Wc9mM
            @Override // com.alibaba.fastjson2.function.c
            public final void accept(Object obj) {
                ObjectReaderProvider.lambda$BZXeLBkorkIZmCGcA8hMO3Wc9mM(annotation, aaiVar, cls, (Method) obj);
            }
        });
    }

    /* renamed from: a */
    public void c(final aai aaiVar, Class<?> cls, Constructor constructor) {
        Annotation[] declaredAnnotations;
        if (cls.isEnum()) {
            return;
        }
        boolean z = false;
        for (final Annotation annotation : constructor.getDeclaredAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONCreator jSONCreator = (JSONCreator) BeanUtils.a(annotation, (Class<Annotation>) JSONCreator.class);
            if (jSONCreator != null) {
                String[] parameterNames = jSONCreator.parameterNames();
                if (parameterNames.length != 0) {
                    aaiVar.l = parameterNames;
                }
                if (jSONCreator != annotation) {
                    z = true;
                }
                z = true;
            }
            String name = annotationType.getName();
            if (name.equals("com.alibaba.fastjson.annotation.JSONCreator") || name.equals("com.alibaba.fastjson2.annotation.JSONCreator")) {
                BeanUtils.d(annotationType, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$xkIsOSErSwK6OzD0TRyCML1AhBE
                    @Override // com.alibaba.fastjson2.function.c
                    public final void accept(Object obj) {
                        ObjectReaderProvider.lambda$xkIsOSErSwK6OzD0TRyCML1AhBE(annotation, aaiVar, (Method) obj);
                    }
                });
                z = true;
            }
        }
        if (!z) {
            return;
        }
        Constructor<?> constructor2 = null;
        try {
            constructor2 = cls.getDeclaredConstructor(constructor.getParameterTypes());
        } catch (NoSuchMethodException unused) {
        }
        if (constructor2 == null) {
            return;
        }
        aaiVar.i = constructor2;
    }

    /* renamed from: a */
    public void c(final aai aaiVar, Class<?> cls, Method method) {
        if (method.getDeclaringClass() == Enum.class) {
            return;
        }
        String name = method.getName();
        if (cls.isEnum() && name.equals("values")) {
            return;
        }
        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
        int length = declaredAnnotations.length;
        Method method2 = null;
        int i = 0;
        JSONCreator jSONCreator = null;
        boolean z = false;
        while (i < length) {
            final Annotation annotation = declaredAnnotations[i];
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONCreator jSONCreator2 = (JSONCreator) BeanUtils.a(annotation, (Class<Annotation>) JSONCreator.class);
            if (jSONCreator2 != annotation && annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                BeanUtils.d(annotationType, new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$HchXI46DVtOx7Yy4HPee06aAboc
                    @Override // com.alibaba.fastjson2.function.c
                    public final void accept(Object obj) {
                        ObjectReaderProvider.lambda$HchXI46DVtOx7Yy4HPee06aAboc(annotation, aaiVar, (Method) obj);
                    }
                });
                z = true;
            }
            i++;
            jSONCreator = jSONCreator2;
        }
        if (jSONCreator != null) {
            String[] parameterNames = jSONCreator.parameterNames();
            if (parameterNames.length != 0) {
                aaiVar.l = parameterNames;
            }
            z = true;
        }
        if (!z) {
            return;
        }
        try {
            method2 = cls.getDeclaredMethod(name, method.getParameterTypes());
        } catch (NoSuchMethodException unused) {
        }
        if (method2 == null) {
            return;
        }
        aaiVar.k = method2;
    }

    private void a(final aai aaiVar, Annotation[] annotationArr) {
        for (final Annotation annotation : annotationArr) {
            BeanUtils.d(annotation.annotationType(), new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$7MfxVZC53F2znhM7L9FKI6w8BYI
                @Override // com.alibaba.fastjson2.function.c
                public final void accept(Object obj) {
                    ObjectReaderProvider.lambda$7MfxVZC53F2znhM7L9FKI6w8BYI(annotation, aaiVar, (Method) obj);
                }
            });
        }
    }

    private void a(aak aakVar, JSONField jSONField) {
        if (jSONField == null) {
            return;
        }
        String name = jSONField.name();
        if (!name.isEmpty()) {
            aakVar.f25184a = name;
        }
        String format = jSONField.format();
        if (!format.isEmpty()) {
            String trim = format.trim();
            if (trim.indexOf(84) != -1 && !trim.contains("'T'")) {
                trim = trim.replaceAll("T", "'T'");
            }
            aakVar.b = trim;
        }
        String label = jSONField.label();
        if (!label.isEmpty()) {
            aakVar.c = label.trim();
        }
        String defaultValue = jSONField.defaultValue();
        if (!defaultValue.isEmpty()) {
            aakVar.n = defaultValue;
        }
        String locale = jSONField.locale();
        if (!locale.isEmpty()) {
            String[] split = locale.split("_");
            if (split.length == 2) {
                aakVar.o = new Locale(split[0], split[1]);
            }
        }
        String[] alternateNames = jSONField.alternateNames();
        if (alternateNames.length != 0) {
            if (aakVar.g == null) {
                aakVar.g = alternateNames;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Collections.addAll(linkedHashSet, alternateNames);
                linkedHashSet.addAll(Arrays.asList(aakVar.g));
                aakVar.g = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
            }
        }
        if (!aakVar.f) {
            aakVar.f = !jSONField.deserialize();
        }
        for (JSONReader.Feature feature : jSONField.deserializeFeatures()) {
            aakVar.e |= feature.mask;
        }
        int ordinal = jSONField.ordinal();
        if (ordinal != 0) {
            aakVar.d = ordinal;
        }
        if (jSONField.value()) {
            aakVar.e |= aak.VALUE_MASK;
        }
        if (jSONField.unwrapped()) {
            aakVar.e |= aak.UNWRAPPED_MASK;
        }
        if (jSONField.required()) {
            aakVar.p = true;
        }
        Class<?> deserializeUsing = jSONField.deserializeUsing();
        if (!bu.class.isAssignableFrom(deserializeUsing)) {
            return;
        }
        aakVar.k = deserializeUsing;
    }

    private void a(final aak aakVar, final Annotation annotation) {
        BeanUtils.d(annotation.getClass(), new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$Lvz165kxCorLautRL2SYTTfM4xA
            @Override // com.alibaba.fastjson2.function.c
            public final void accept(Object obj) {
                ObjectReaderProvider.lambda$Lvz165kxCorLautRL2SYTTfM4xA(annotation, aakVar, (Method) obj);
            }
        });
    }

    private void a(aak aakVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.a(annotation, (Class<Annotation>) JSONField.class);
            if (jSONField != null) {
                a(aakVar, jSONField);
                if (jSONField == annotation) {
                }
            }
            if (annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                a(aakVar, annotation);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1149:0x0543, code lost:
        if (r3.equals("java.sql.Time") != false) goto L496;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.fastjson2.reader.bu b(java.lang.reflect.Type r17) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.b(java.lang.reflect.Type):com.alibaba.fastjson2.reader.bu");
    }

    public static /* synthetic */ Object b(Object obj) {
        return obj;
    }

    protected static ConcurrentMap<Type, Map<Type, com.alibaba.fastjson2.function.d>> b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a(concurrentHashMap, Character.class, Character.TYPE, $$Lambda$ObjectReaderProvider$00czEvUoesk7pPVBEn8f30e5UnY.INSTANCE);
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Number.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class};
        adb adbVar = new adb(Boolean.class, null);
        for (Class cls : clsArr) {
            a(concurrentHashMap, cls, Boolean.class, adbVar);
        }
        adb adbVar2 = new adb(Boolean.class, Boolean.FALSE);
        for (Class cls2 : clsArr) {
            a(concurrentHashMap, cls2, Boolean.TYPE, adbVar2);
        }
        adb adbVar3 = new adb(String.class);
        for (Class cls3 : clsArr) {
            a(concurrentHashMap, cls3, String.class, adbVar3);
        }
        adb adbVar4 = new adb(BigDecimal.class);
        for (Class cls4 : clsArr) {
            a(concurrentHashMap, cls4, BigDecimal.class, adbVar4);
        }
        adb adbVar5 = new adb(BigInteger.class);
        for (Class cls5 : clsArr) {
            a(concurrentHashMap, cls5, BigInteger.class, adbVar5);
        }
        adb adbVar6 = new adb(Byte.class);
        for (Class cls6 : clsArr) {
            a(concurrentHashMap, cls6, Byte.class, adbVar6);
        }
        adb adbVar7 = new adb(Byte.class, (byte) 0);
        for (Class cls7 : clsArr) {
            a(concurrentHashMap, cls7, Byte.TYPE, adbVar7);
        }
        adb adbVar8 = new adb(Short.class);
        for (Class cls8 : clsArr) {
            a(concurrentHashMap, cls8, Short.class, adbVar8);
        }
        adb adbVar9 = new adb(Short.class, (short) 0);
        for (Class cls9 : clsArr) {
            a(concurrentHashMap, cls9, Short.TYPE, adbVar9);
        }
        adb adbVar10 = new adb(Integer.class);
        for (Class cls10 : clsArr) {
            a(concurrentHashMap, cls10, Integer.class, adbVar10);
        }
        adb adbVar11 = new adb(Integer.class, 0);
        for (Class cls11 : clsArr) {
            a(concurrentHashMap, cls11, Integer.TYPE, adbVar11);
        }
        adb adbVar12 = new adb(Long.class);
        for (Class cls12 : clsArr) {
            a(concurrentHashMap, cls12, Long.class, adbVar12);
        }
        adb adbVar13 = new adb(Long.class, 0L);
        for (Class cls13 : clsArr) {
            a(concurrentHashMap, cls13, Long.TYPE, adbVar13);
        }
        adb adbVar14 = new adb(Float.class);
        for (Class cls14 : clsArr) {
            a(concurrentHashMap, cls14, Float.class, adbVar14);
        }
        adb adbVar15 = new adb(Float.class, Float.valueOf(0.0f));
        for (Class cls15 : clsArr) {
            a(concurrentHashMap, cls15, Float.TYPE, adbVar15);
        }
        adb adbVar16 = new adb(Double.class);
        for (Class cls16 : clsArr) {
            a(concurrentHashMap, cls16, Double.class, adbVar16);
        }
        adb adbVar17 = new adb(Double.class, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        for (Class cls17 : clsArr) {
            a(concurrentHashMap, cls17, Double.TYPE, adbVar17);
        }
        adb adbVar18 = new adb(Number.class, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        for (Class cls18 : clsArr) {
            a(concurrentHashMap, cls18, Number.class, adbVar18);
        }
        a(concurrentHashMap, String.class, Character.TYPE, new dra(Character.TYPE, '0'));
        a(concurrentHashMap, String.class, Boolean.TYPE, new dra(Boolean.TYPE, false));
        a(concurrentHashMap, String.class, Float.TYPE, new dra(Float.TYPE, Float.valueOf(0.0f)));
        a(concurrentHashMap, String.class, Double.TYPE, new dra(Double.TYPE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT)));
        a(concurrentHashMap, String.class, Byte.TYPE, new dra(Byte.TYPE, (byte) 0));
        a(concurrentHashMap, String.class, Short.TYPE, new dra(Short.TYPE, (short) 0));
        a(concurrentHashMap, String.class, Integer.TYPE, new dra(Integer.TYPE, 0));
        a(concurrentHashMap, String.class, Long.TYPE, new dra(Long.TYPE, 0L));
        a(concurrentHashMap, String.class, Character.class, new dra(Character.class, null));
        a(concurrentHashMap, String.class, Boolean.class, new dra(Boolean.class, null));
        a(concurrentHashMap, String.class, Double.class, new dra(Double.class, null));
        a(concurrentHashMap, String.class, Float.class, new dra(Float.class, null));
        a(concurrentHashMap, String.class, Byte.class, new dra(Byte.class, null));
        a(concurrentHashMap, String.class, Short.class, new dra(Short.class, null));
        a(concurrentHashMap, String.class, Integer.class, new dra(Integer.class, null));
        a(concurrentHashMap, String.class, Long.class, new dra(Long.class, null));
        a(concurrentHashMap, String.class, BigDecimal.class, new dra(BigDecimal.class, null));
        a(concurrentHashMap, String.class, BigInteger.class, new dra(BigInteger.class, null));
        a(concurrentHashMap, String.class, Number.class, new dra(BigDecimal.class, null));
        a(concurrentHashMap, String.class, Collection.class, new dra(Collection.class, null));
        a(concurrentHashMap, String.class, List.class, new dra(List.class, null));
        a(concurrentHashMap, String.class, JSONArray.class, new dra(JSONArray.class, null));
        a(concurrentHashMap, Boolean.class, Boolean.TYPE, $$Lambda$ObjectReaderProvider$fvBbmd4JduQ6SxbvgoLcfoqCc.INSTANCE);
        a(concurrentHashMap, String.class, UUID.class, $$Lambda$ObjectReaderProvider$M63pklDagVZcOAVJuP6G8YfL4Dw.INSTANCE);
        return concurrentHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void b(java.lang.annotation.Annotation r5, tb.aai r6, java.lang.reflect.Method r7) {
        /*
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L29
            r1 = -1
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L29
            r3 = 1117066527(0x4295151f, float:74.54125)
            r4 = 0
            if (r2 == r3) goto L10
            goto L19
        L10:
            java.lang.String r2 = "parameterNames"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L19
            r1 = 0
        L19:
            if (r1 == 0) goto L1c
            goto L29
        L1c:
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L29
            int r7 = r5.length     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L29
            r6.l = r5     // Catch: java.lang.Throwable -> L29
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.b(java.lang.annotation.Annotation, tb.aai, java.lang.reflect.Method):void");
    }

    private void b(aai aaiVar, Class<?> cls) {
        Class cls2 = this.j.get(cls);
        if (cls2 != null && cls2 != cls) {
            aaiVar.t = true;
            a(aaiVar, cls2.getDeclaredAnnotations());
        }
        a(aaiVar, cls.getDeclaredAnnotations());
    }

    public static /* synthetic */ Object c(Object obj) {
        return obj;
    }

    public static /* synthetic */ void c(Annotation annotation, aai aaiVar, Method method) {
        String name = method.getName();
        try {
            Object invoke = method.invoke(annotation, new Object[0]);
            if (!name.equals("typeName")) {
                return;
            }
            String str = (String) invoke;
            if (str.isEmpty()) {
                return;
            }
            aaiVar.b = str;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new JSONException("read URL error", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:307:0x01e5 A[Catch: Throwable -> 0x0220, TryCatch #0 {Throwable -> 0x0220, blocks: (B:182:0x0005, B:183:0x0013, B:228:0x00b1, B:230:0x00b6, B:232:0x00c0, B:233:0x00c4, B:235:0x00ce, B:236:0x00d2, B:240:0x00dc, B:242:0x00e5, B:244:0x00f7, B:250:0x011b, B:245:0x00fb, B:247:0x0105, B:249:0x0119, B:251:0x011e, B:253:0x0122, B:254:0x012a, B:256:0x012e, B:257:0x0138, B:258:0x013a, B:260:0x013d, B:261:0x0149, B:262:0x014c, B:264:0x014f, B:265:0x0159, B:288:0x01a1, B:284:0x018d, B:285:0x0191, B:286:0x0197, B:287:0x019c, B:267:0x015d, B:270:0x0167, B:273:0x0171, B:276:0x017b, B:289:0x01a4, B:292:0x01b0, B:294:0x01b5, B:295:0x01b8, B:297:0x01bd, B:298:0x01c0, B:299:0x01c9, B:301:0x01d1, B:302:0x01d4, B:304:0x01db, B:305:0x01dd, B:307:0x01e5, B:308:0x01e8, B:310:0x01ed, B:311:0x01f4, B:313:0x01f7, B:315:0x0205, B:318:0x020f, B:317:0x020b, B:319:0x0216, B:185:0x0018, B:188:0x0023, B:191:0x002e, B:194:0x003a, B:197:0x0046, B:200:0x0051, B:203:0x005c, B:206:0x0067, B:209:0x0071, B:212:0x007c, B:215:0x0087, B:218:0x0091, B:221:0x009b, B:224:0x00a6), top: B:322:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void d(java.lang.annotation.Annotation r11, tb.aai r12, java.lang.reflect.Method r13) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.d(java.lang.annotation.Annotation, tb.aai, java.lang.reflect.Method):void");
    }

    public static /* synthetic */ File e(String str) {
        return new File(str);
    }

    public static /* synthetic */ void lambda$7MfxVZC53F2znhM7L9FKI6w8BYI(Annotation annotation, aai aaiVar, Method method) {
        c(annotation, aaiVar, method);
    }

    public static /* synthetic */ void lambda$BZXeLBkorkIZmCGcA8hMO3Wc9mM(Annotation annotation, aai aaiVar, Class cls, Method method) {
        a(annotation, aaiVar, cls, method);
    }

    public static /* synthetic */ void lambda$F00vHPe4ujHKj9EuTyPvwrFahtg(ObjectReaderProvider objectReaderProvider, aai aaiVar, Class cls, Method method) {
        objectReaderProvider.c(aaiVar, cls, method);
    }

    public static /* synthetic */ void lambda$HchXI46DVtOx7Yy4HPee06aAboc(Annotation annotation, aai aaiVar, Method method) {
        a(annotation, aaiVar, method);
    }

    public static /* synthetic */ void lambda$J7as5BA8rHIsyUmV3FM5Mb3tjoU(ObjectReaderProvider objectReaderProvider, aai aaiVar, Class cls, Constructor constructor) {
        objectReaderProvider.c(aaiVar, cls, constructor);
    }

    public static /* synthetic */ void lambda$Lvz165kxCorLautRL2SYTTfM4xA(Annotation annotation, aak aakVar, Method method) {
        a(annotation, aakVar, method);
    }

    public static /* synthetic */ void lambda$NufS2e9l782GnNgLOdxnu87WB5I(ObjectReaderProvider objectReaderProvider, aai aaiVar, Class cls, Method method) {
        objectReaderProvider.b(aaiVar, cls, method);
    }

    public static /* synthetic */ void lambda$RLDMoKm1bN5twipN9KhWNaPqJqg(ObjectReaderProvider objectReaderProvider, Annotation annotation, aai aaiVar, Method method) {
        objectReaderProvider.d(annotation, aaiVar, method);
    }

    public static /* synthetic */ void lambda$dWFhriQwaViQgudT2eKU_AVYSA4(ObjectReaderProvider objectReaderProvider, aai aaiVar, Class cls, Constructor constructor) {
        objectReaderProvider.b(aaiVar, cls, constructor);
    }

    public static /* synthetic */ void lambda$xkIsOSErSwK6OzD0TRyCML1AhBE(Annotation annotation, aai aaiVar, Method method) {
        b(annotation, aaiVar, method);
    }

    public com.alibaba.fastjson2.function.d a(Type type, Type type2) {
        ConcurrentMap<Type, Map<Type, com.alibaba.fastjson2.function.d>> concurrentMap = this.n;
        if (concurrentMap == null) {
            concurrentMap = b();
            this.n = concurrentMap;
        }
        Map<Type, com.alibaba.fastjson2.function.d> map = concurrentMap.get(type);
        if (map == null) {
            return null;
        }
        return map.get(type2);
    }

    public bu a(long j) {
        a aVar = f;
        if (aVar != null) {
            if (aVar.f2948a == j) {
                return aVar.b;
            }
            int i = aVar.c;
            aVar.c = i + 1;
            if (i > 16) {
                f = null;
            }
        }
        bu buVar = this.i.get(new Long(j));
        if (buVar != null && f == null) {
            f = new a(j, buVar);
        }
        return buVar;
    }

    public bu a(String str, Class<?> cls, long j) {
        Class<?> b = b(str, cls, j);
        if (b == null) {
            return null;
        }
        bu a2 = a(b, (j & JSONReader.Feature.FieldBased.mask) != 0);
        if (b != cls) {
            a(com.alibaba.fastjson2.util.c.b(str), a2);
        }
        return a2;
    }

    public bu a(Type type) {
        return a(type, false);
    }

    public bu a(Type type, boolean z) {
        bu a2;
        bu a3;
        if (type == null) {
            type = Object.class;
        }
        bu buVar = (z ? this.h : this.g).get(type);
        boolean z2 = true;
        if (buVar == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                buVar = (z ? this.h : this.g).get(upperBounds[0]);
            }
        }
        if (buVar != null) {
            return buVar;
        }
        bu b = b(type);
        if (b != null) {
            bu put = (z ? this.h : this.g).put(type, b);
            return put != null ? put : b;
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type2 = bounds[0];
                if ((type2 instanceof Class) && (a3 = a(type2, z)) != null) {
                    bu a4 = a(z, type, a3);
                    return a4 != null ? a4 : a3;
                }
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                Class cls2 = cls;
                while (true) {
                    if (cls2 == Object.class) {
                        z2 = false;
                        break;
                    } else if (cls2.getTypeParameters().length > 0) {
                        break;
                    } else {
                        cls2 = cls2.getSuperclass();
                    }
                }
                if ((actualTypeArguments.length == 0 || !z2) && (a2 = a(cls, z)) != null) {
                    bu a5 = a(z, type, a2);
                    return a5 != null ? a5 : a2;
                }
            }
        }
        bu a6 = a().a(TypeUtils.b(type), type, z, this);
        bu a7 = a(z, type, a6);
        return a7 != null ? a7 : a6;
    }

    public cd a() {
        return this.l;
    }

    public Class a(Class cls) {
        return this.j.get(cls);
    }

    public void a(long j, bu buVar) {
        this.i.put(Long.valueOf(j), buVar);
    }

    final void a(String str, Class cls) {
        com.alibaba.fastjson2.function.c<Class> cVar = this.r;
        if (cVar != null) {
            cVar.accept(cls);
        }
        synchronized (this.k) {
            this.k.put(str, new Date());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x006d, code lost:
        a(r11, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(final tb.aai r11, final java.lang.Class<?> r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.a(tb.aai, java.lang.Class):void");
    }

    void a(final aai aaiVar, final Annotation annotation) {
        BeanUtils.d(annotation.getClass(), new com.alibaba.fastjson2.function.c() { // from class: com.alibaba.fastjson2.reader.-$$Lambda$ObjectReaderProvider$RLDMoKm1bN5twipN9KhWNaPqJqg
            @Override // com.alibaba.fastjson2.function.c
            public final void accept(Object obj) {
                ObjectReaderProvider.lambda$RLDMoKm1bN5twipN9KhWNaPqJqg(ObjectReaderProvider.this, annotation, aaiVar, (Method) obj);
            }
        });
    }

    public void a(aak aakVar, Class cls, Constructor constructor, int i, Annotation[][] annotationArr) {
        Class cls2;
        Constructor constructor2;
        Annotation[] annotationArr2 = null;
        if (cls != null && (cls2 = this.j.get(cls)) != null && cls2 != cls) {
            try {
                constructor2 = cls2.getDeclaredConstructor(constructor.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                constructor2 = null;
            }
            if (constructor2 != null) {
                a(aakVar, constructor2.getParameterAnnotations()[i]);
            }
        }
        if (annotationArr == null) {
            annotationArr = constructor.getParameterAnnotations();
        }
        if (annotationArr.length != constructor.getParameterTypes().length) {
            i--;
        }
        if (i >= 0 && i < annotationArr.length) {
            annotationArr2 = annotationArr[i];
        }
        if (annotationArr2 == null || annotationArr2.length <= 0) {
            return;
        }
        a(aakVar, annotationArr2);
    }

    public void a(aak aakVar, Class cls, Field field) {
        Class cls2;
        if (cls != null && (cls2 = this.j.get(cls)) != null && cls2 != cls) {
            Field field2 = null;
            try {
                field2 = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
            }
            if (field2 != null) {
                a(aakVar, cls2, field2);
            }
        }
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations.length > 0) {
            a(aakVar, declaredAnnotations);
        }
    }

    public void a(aak aakVar, Class cls, Method method) {
        Annotation[] declaredAnnotations;
        String str;
        char charAt;
        char charAt2;
        Class<?>[] interfaces;
        Method method2;
        Method a2;
        Method a3;
        String name = method.getName();
        String str2 = null;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            if (superclass != Object.class && superclass != null && (a3 = BeanUtils.a(superclass, method)) != null) {
                a(aakVar, superclass, a3);
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (cls2 != Serializable.class && (a2 = BeanUtils.a((Class) cls2, method)) != null && superclass != null) {
                    a(aakVar, superclass, a2);
                }
            }
            Class cls3 = this.j.get(cls);
            if (cls3 != null && cls3 != cls) {
                try {
                    method2 = cls3.getDeclaredMethod(name, method.getParameterTypes());
                } catch (Exception unused) {
                    method2 = null;
                }
                if (method2 != null) {
                    a(aakVar, cls3, method2);
                }
            }
        }
        String str3 = null;
        for (Annotation annotation : method.getDeclaredAnnotations()) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.a(annotation, (Class<Annotation>) JSONField.class);
            if (jSONField != null) {
                a(aakVar, jSONField);
                str3 = jSONField.name();
                if (jSONField == annotation) {
                }
            }
            if (annotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                a(aakVar, annotation);
            }
        }
        String a4 = name.startsWith("set", 0) ? BeanUtils.a(name, (String) null) : BeanUtils.b(name, (String) null);
        if (a4.length() <= 1 || (charAt = a4.charAt(0)) < 'A' || charAt > 'Z' || (charAt2 = a4.charAt(1)) < 'A' || charAt2 > 'Z' || (str3 != null && !str3.isEmpty())) {
            str = null;
        } else {
            char[] charArray = a4.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            str2 = new String(charArray);
            charArray[1] = (char) (charArray[1] + ' ');
            str = new String(charArray);
        }
        BeanUtils.a(cls, aakVar, this, a4, str2, str);
        if (str2 != null && aakVar.f25184a == null && aakVar.g == null) {
            aakVar.g = new String[]{str2, str};
        }
    }

    public void a(aak aakVar, Class cls, Method method, int i) {
        Class cls2;
        if (cls != null && (cls2 = this.j.get(cls)) != null && cls2 != cls) {
            Method method2 = null;
            try {
                method2 = cls2.getMethod(method.getName(), method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
            }
            if (method2 != null) {
                a(aakVar, method2.getParameterAnnotations()[i]);
            }
        }
        a(aakVar, method.getParameterAnnotations()[i]);
    }

    public Class<?> b(String str, Class<?> cls, long j) {
        int i;
        Class<?> c;
        Class<?> a2;
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.a aVar = this.q;
        if (aVar != null && (a2 = aVar.a(str, cls, j)) != null) {
            a(str, a2);
            return a2;
        }
        int length = str.length();
        if (length >= 192) {
            throw new JSONException("autoType is not support. " + str);
        }
        boolean z = true;
        if (str.charAt(0) == '[') {
            b(str.substring(1), (Class<?>) null, j);
        }
        if (cls != null && cls.getName().equals(str)) {
            a(str, cls);
            return cls;
        }
        if ((JSONReader.Feature.SupportAutoType.mask & j) == 0) {
            z = false;
        }
        char c2 = '$';
        long j2 = com.alibaba.fastjson2.util.c.MAGIC_HASH_CODE;
        if (z) {
            long j3 = -3750763034362895579L;
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == '$') {
                    i = length;
                    charAt = '.';
                } else {
                    i = length;
                }
                long j4 = (j3 ^ charAt) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
                if (Arrays.binarySearch(this.p, j4) >= 0 && (c = TypeUtils.c(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(c)) {
                        a(str, c);
                        return c;
                    }
                    throw new JSONException("type not match. " + str + " -> " + cls.getName());
                } else if (Arrays.binarySearch(this.o, j4) >= 0 && TypeUtils.a(str) == null) {
                    throw new JSONException("autoType is not support. " + str);
                } else {
                    i2++;
                    j3 = j4;
                    length = i;
                }
            }
        }
        int i3 = length;
        if (!z) {
            int i4 = 0;
            while (i4 < i3) {
                char charAt2 = str.charAt(i4);
                if (charAt2 == c2) {
                    charAt2 = '.';
                }
                long j5 = (j2 ^ charAt2) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
                if (Arrays.binarySearch(this.o, j5) >= 0) {
                    throw new JSONException("autoType is not support. " + str);
                } else if (Arrays.binarySearch(this.p, j5) >= 0) {
                    Class<?> c3 = TypeUtils.c(str);
                    if (c3 == null || cls == null || cls.isAssignableFrom(c3)) {
                        a(str, c3);
                        return c3;
                    }
                    throw new JSONException("type not match. " + str + " -> " + cls.getName());
                } else {
                    i4++;
                    j2 = j5;
                    c2 = '$';
                }
            }
        }
        if (!z) {
            return null;
        }
        Class<?> a3 = TypeUtils.a(str);
        if (a3 != null) {
            if (cls == null || cls == Object.class || a3 == HashMap.class || cls.isAssignableFrom(a3)) {
                a(str, a3);
                return a3;
            }
            throw new JSONException("type not match. " + str + " -> " + cls.getName());
        }
        Class<?> c4 = TypeUtils.c(str);
        if (c4 != null) {
            if (ClassLoader.class.isAssignableFrom(c4) || DataSource.class.isAssignableFrom(c4) || RowSet.class.isAssignableFrom(c4)) {
                throw new JSONException("autoType is not support. " + str);
            } else if (cls != null) {
                if (cls.isAssignableFrom(c4)) {
                    a(str, c4);
                    return c4;
                } else if ((j & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) != 0) {
                    return cls;
                } else {
                    throw new JSONException("type not match. " + str + " -> " + cls.getName());
                }
            }
        }
        a(str, c4);
        return c4;
    }
}
