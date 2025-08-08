package tb;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.utils.c;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.mly;

/* loaded from: classes7.dex */
public class mlw implements mly {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PATH_SAVE_TYPE = "retention_type_use_parse_key_type";
    private final String b;
    private final Application c;
    private final File d;
    private boolean e;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f31099a = !mlw.class.desiredAssertionStatus();
    public static final String SLICE_DATA_DIR = "metrickit" + File.separator + "upload";

    @Override // tb.mly
    public /* synthetic */ void b(String str) {
        mly.CC.$default$b(this, str);
    }

    @Override // tb.mly
    public /* synthetic */ void c(String str) {
        mly.CC.$default$c(this, str);
    }

    public static /* synthetic */ File a(mlw mlwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("8b4febed", new Object[]{mlwVar}) : mlwVar.d;
    }

    public static /* synthetic */ Application b(mlw mlwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("9592e470", new Object[]{mlwVar}) : mlwVar.c;
    }

    public static /* synthetic */ boolean c(mlw mlwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1c43a26", new Object[]{mlwVar})).booleanValue() : mlwVar.e;
    }

    public static /* synthetic */ String d(mlw mlwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e13dae5d", new Object[]{mlwVar}) : mlwVar.b;
    }

    public mlw(Application application, String str, long j) {
        this(application, str, new File(a(application) + b(SIMPLE_DATE_FORMAT.format(new Date()), j)));
    }

    public mlw(Application application, String str, File file) {
        this.e = false;
        this.c = application;
        this.d = file;
        if (StringUtils.equals(KEY_PATH_SAVE_TYPE, str)) {
            this.b = "";
            this.e = true;
        } else if (StringUtils.isEmpty(str)) {
            this.b = "";
        } else {
            this.b = str + "^";
        }
    }

    @Override // tb.mly
    public mly a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly) ipChange.ipc$dispatch("7c727e9a", new Object[]{this, str});
        }
        if (this.e) {
            throw new RuntimeException("KEY_PATH_SAVE_TYPE cannot getSubDomain!");
        }
        b(str);
        Application application = this.c;
        return new mlw(application, this.b + str, this.d);
    }

    @Override // tb.mly
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.mly
    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.mly
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.mly
    public float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{this, str, new Float(f)})).floatValue();
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    @Override // tb.mly
    public Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        throw new RuntimeException("FileDomainStorage cannot be read!");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Map<String, ?> b() {
        String[] split;
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        String a2 = c.a(this.d);
        if (StringUtils.isEmpty(a2)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        if (!f31099a && a2 == null) {
            throw new AssertionError();
        }
        for (String str : a2.split("\n")) {
            if (!StringUtils.isEmpty(str)) {
                String[] split2 = str.split(" ", 2);
                if (split2.length == 2) {
                    String[] split3 = split2[1].split("=", 2);
                    if (split3.length == 2 && !StringUtils.isEmpty(split3[0])) {
                        String str2 = split2[0];
                        switch (str2.hashCode()) {
                            case -1808118735:
                                if (str2.equals(com.taobao.android.weex_framework.util.a.ATOM_String)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -713217536:
                                if (str2.equals("incrementInt")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -634816885:
                                if (str2.equals("incrementLong")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 104431:
                                if (str2.equals("int")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3327612:
                                if (str2.equals("long")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 64711720:
                                if (str2.equals(com.taobao.android.weex_framework.util.a.ATOM_boolean)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 97526364:
                                if (str2.equals(PopStrategy.IDENTIFIER_FLOAT)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 245397275:
                                if (str2.equals("addElement")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                hashMap.put(split3[0], split3[1]);
                                continue;
                            case 1:
                                hashMap.put(split3[0], Boolean.valueOf(Boolean.parseBoolean(split3[1])));
                                continue;
                            case 2:
                                hashMap.put(split3[0], Integer.valueOf(Integer.parseInt(split3[1])));
                                continue;
                            case 3:
                                hashMap.put(split3[0], Long.valueOf(Long.parseLong(split3[1])));
                                continue;
                            case 4:
                                hashMap.put(split3[0], Float.valueOf(Float.parseFloat(split3[1])));
                                continue;
                            case 5:
                                Object obj = hashMap.get(split3[0]);
                                int a3 = mqe.a(split3[1], 1);
                                if (obj instanceof Integer) {
                                    hashMap.put(split3[0], Integer.valueOf(((Integer) obj).intValue() + a3));
                                    continue;
                                } else {
                                    hashMap.put(split3[0], Integer.valueOf(a3));
                                    break;
                                }
                            case 6:
                                Object obj2 = hashMap.get(split3[0]);
                                long a4 = mqe.a((Object) split3[1], 1L);
                                if (obj2 instanceof Long) {
                                    hashMap.put(split3[0], Long.valueOf(((Long) obj2).longValue() + a4));
                                    continue;
                                } else {
                                    hashMap.put(split3[0], Long.valueOf(a4));
                                    break;
                                }
                            case 7:
                                Object obj3 = hashMap.get(split3[0]);
                                String str3 = split3[1];
                                if (obj3 instanceof String) {
                                    hashMap.put(split3[0], obj3 + "," + str3);
                                    continue;
                                } else {
                                    hashMap.put(split3[0], split3[1]);
                                    break;
                                }
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static String a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f08209", new Object[]{application});
        }
        return application.getCacheDir().getPath() + File.separator + SLICE_DATA_DIR + File.separator;
    }

    public static String b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea37ed0f", new Object[]{str, new Long(j)});
        }
        return "metrickit_V1_" + j + "_" + str + ".txt";
    }

    @Override // tb.mly
    public mly.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mly.a) ipChange.ipc$dispatch("30244585", new Object[]{this}) : new a();
    }

    /* loaded from: classes7.dex */
    public class a implements mly.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Set<String> b;
        private boolean c;

        @Override // tb.mly.a
        public /* synthetic */ mly.a b(String str, String str2) {
            return mly.a.CC.$default$b(this, str, str2);
        }

        private a() {
            this.b = new HashSet();
            this.c = true;
        }

        @Override // tb.mly.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (!mlw.a(mlw.this).exists()) {
                mlw.b(mlw.b(mlw.this));
            }
            StringBuilder sb = new StringBuilder(200);
            for (String str : this.b) {
                sb.append(str);
                sb.append("\n");
            }
            c.a(mlw.a(mlw.this).getPath(), sb.toString(), this.c);
            this.b.clear();
        }

        @Override // tb.mly.a
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !this.b.isEmpty();
        }

        private String b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
            }
            if (mlw.c(mlw.this)) {
                return mly.CC.e(str);
            }
            return mly.CC.d(str);
        }

        @Override // tb.mly.a
        public mly.a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("3a4f87b3", new Object[]{this, str, str2});
            }
            String b = b(str);
            mlw.this.c(b);
            a(com.taobao.android.weex_framework.util.a.ATOM_String, mlw.d(mlw.this) + b, str2);
            return this;
        }

        @Override // tb.mly.a
        public mly.a a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("52211b0d", new Object[]{this, str, new Boolean(z)});
            }
            String b = b(str);
            mlw.this.c(b);
            a(com.taobao.android.weex_framework.util.a.ATOM_boolean, mlw.d(mlw.this) + b, String.valueOf(z));
            return this;
        }

        @Override // tb.mly.a
        public mly.a a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("cf551fbe", new Object[]{this, str, new Integer(i)});
            }
            String b = b(str);
            mlw.this.c(b);
            a("int", mlw.d(mlw.this) + b, String.valueOf(i));
            return this;
        }

        @Override // tb.mly.a
        public mly.a a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("d706c51d", new Object[]{this, str, new Long(j)});
            }
            String b = b(str);
            mlw.this.c(b);
            a("long", mlw.d(mlw.this) + b, String.valueOf(j));
            return this;
        }

        @Override // tb.mly.a
        public mly.a a(String str, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("b8402fa1", new Object[]{this, str, new Float(f)});
            }
            String b = b(str);
            mlw.this.c(b);
            a(PopStrategy.IDENTIFIER_FLOAT, mlw.d(mlw.this) + b, String.valueOf(f));
            return this;
        }

        @Override // tb.mly.a
        public mly.a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("29ccf5bd", new Object[]{this, str});
            }
            String b = b(str);
            mlw.this.c(b);
            a("incrementInt", mlw.d(mlw.this) + b, null);
            return this;
        }

        @Override // tb.mly.a
        public mly.a b(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("54de811e", new Object[]{this, str, new Long(j)});
            }
            String b = b(str);
            mlw.this.c(b);
            a("incrementLong", mlw.d(mlw.this) + b, String.valueOf(j));
            return this;
        }

        @Override // tb.mly.a
        public mly.a c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("1da2d3f1", new Object[]{this, str, str2});
            }
            String b = b(str);
            mlw.this.c(b);
            a("addElement", mlw.d(mlw.this) + b, str2);
            return this;
        }

        private void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            Set<String> set = this.b;
            set.add(str + " " + str2 + "=" + str3);
        }

        @Override // tb.mly.a
        public mly.a a(Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mly.a) ipChange.ipc$dispatch("c509a832", new Object[]{this, map});
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    if (!StringUtils.isEmpty(entry.getKey())) {
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            a(entry.getKey(), (String) value);
                        }
                        if (value instanceof Boolean) {
                            a(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                        }
                        if (value instanceof Integer) {
                            a(entry.getKey(), ((Integer) entry.getValue()).intValue());
                        }
                        if (value instanceof Long) {
                            a(entry.getKey(), ((Long) entry.getValue()).longValue());
                        }
                        if (value instanceof Float) {
                            a(entry.getKey(), ((Float) entry.getValue()).floatValue());
                        }
                    }
                }
            }
            return this;
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
            return;
        }
        File[] listFiles = new File(application.getCacheDir().getPath() + File.separator + SLICE_DATA_DIR + File.separator).listFiles();
        if (listFiles == null || listFiles.length < 10) {
            return;
        }
        Arrays.sort(listFiles, $$Lambda$mlw$LITn6brX2LTq81w3ubXtAVJS1JU.INSTANCE);
        for (int i = 0; i < (listFiles.length - 10) + 1; i++) {
            listFiles[i].delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(File file, File file2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a3abf709", new Object[]{file, file2})).intValue() : Long.compare(file2.lastModified(), file.lastModified());
    }
}
