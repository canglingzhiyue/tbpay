package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.json.ModelConfig;
import com.taobao.android.alinnkit.net.AliNNKitBaseNet;
import com.taobao.android.alinnkit.net.FaceDetectionNet;
import com.taobao.downloader.b;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.kml;

/* loaded from: classes4.dex */
public class dpr<T extends AliNNKitBaseNet> extends AsyncTask<String, Integer, a<T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f26895a = new Object();
    private final Object b = new Object();
    private volatile boolean c;
    private volatile boolean d;
    private volatile String e;
    private Map<String, List<String>> f;
    private final Context g;
    private dpt<T> h;
    private final dpu<T> i;
    private ModelConfig j;

    /* loaded from: classes4.dex */
    public static class a<R extends AliNNKitBaseNet> {

        /* renamed from: a  reason: collision with root package name */
        public R f26898a;
        public Throwable b;

        static {
            kge.a(-664097270);
        }
    }

    static {
        kge.a(-1829562375);
    }

    public static /* synthetic */ Object ipc$super(dpr dprVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Object a(dpr dprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2bd089c0", new Object[]{dprVar}) : dprVar.f26895a;
    }

    public static /* synthetic */ String a(dpr dprVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68b8324", new Object[]{dprVar, str});
        }
        dprVar.e = str;
        return str;
    }

    public static /* synthetic */ void a(dpr dprVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb5123f", new Object[]{dprVar, objArr});
        } else {
            dprVar.publishProgress(objArr);
        }
    }

    public static /* synthetic */ boolean a(dpr dprVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd7d0166", new Object[]{dprVar, new Boolean(z)})).booleanValue();
        }
        dprVar.c = z;
        return z;
    }

    public static /* synthetic */ String b(dpr dprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f4012cd", new Object[]{dprVar}) : dprVar.e;
    }

    public static /* synthetic */ boolean b(dpr dprVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af5acb05", new Object[]{dprVar, new Boolean(z)})).booleanValue();
        }
        dprVar.d = z;
        return z;
    }

    public static /* synthetic */ Object c(dpr dprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2d29e0fe", new Object[]{dprVar}) : dprVar.b;
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ Object doInBackground(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onPostExecute(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, obj});
        } else {
            a((a) obj);
        }
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9c3295", new Object[]{this, numArr});
        } else {
            a(numArr);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add("fd_00002_1");
        arrayList.add("fd_00002_2");
        arrayList.add("fd_00002_4");
        arrayList.add("fd_00002_5");
        this.f.put(FaceDetectionNet.BIZ_NAME, arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("hr_00018_1");
        arrayList2.add("hr_00018_2");
        arrayList2.add("hr_00018_3");
        arrayList2.add("resource");
        this.f.put("HandGesture", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("dn_00023_1");
        arrayList3.add("resource");
        this.f.put("doodleRecognition", arrayList3);
    }

    public static ModelConfig a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ModelConfig) ipChange.ipc$dispatch("c918458b", new Object[]{str});
        }
        ModelConfig modelConfig = new ModelConfig();
        if (FaceDetectionNet.BIZ_NAME.equals(str)) {
            modelConfig.m = "347";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "2e0604b637433ad4ee0ff1f90435e443";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/347/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap = new HashMap();
            hashMap.put("fd_00002_12", "8a4f2cb230a822c3911686f65c8a30bd");
            hashMap.put("fd_00002_6", "dc6cb91661a35eb507c379c314d4b24f");
            hashMap.put("fd_00002_2", "9412d0e0d3222258687a5b61ff8a9636");
            hashMap.put("fd_00002_3", "39ac15930206880e410b3c87a52640af");
            hashMap.put("fd_00002_4", "01abf23eba082606b2b4f385ed8db13c");
            hashMap.put("fd_00002_5", "86139486e21ec0e35c8f24266b2bb582");
            hashMap.put("fd_00002_1", "2a99bf5dc7fc14275377587bafa03cc1");
            modelConfig.models = hashMap;
        } else if ("HandGesture".equals(str)) {
            modelConfig.m = "243";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "86b72ab033e411d59e75607429c4c74b";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/243/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap2 = new HashMap();
            hashMap2.put("resource", "51b4b5faad052455a2206e596ab6d8d3");
            hashMap2.put("hr_00018_3", "5e2dada28eafec8c11b157ee6c26bba5");
            hashMap2.put("hr_00018_1", "8c07eeb4b4526884db7d02cec1e4db67");
            hashMap2.put("hr_00018_2", "091f0cfb27b8191049212090592adf31");
            modelConfig.models = hashMap2;
        } else if ("doodleRecognition".equals(str)) {
            modelConfig.m = "189";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "e959f9b12f6de640183f5aa7b6509157";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/189/0_3.zip";
            modelConfig.unpacked = "1";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap3 = new HashMap();
            hashMap3.put("resource", "660e142ac183023c6010c9f1cd31e27e");
            hashMap3.put("dn_00023_1", "dd7aea0838c72ed1c6935aac83362e34");
            modelConfig.models = hashMap3;
        } else if ("PostureDetection".equals(str)) {
            modelConfig.m = "272";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "dcbe72de65868ff94e51aa35e09ff17b";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/272/0_3.zip";
            modelConfig.unpacked = "0";
        } else if ("HairDetection".equals(str)) {
            modelConfig.m = "240";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "e1da93190044407c7e137a5c454f6249";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/240/0_3.zip";
            modelConfig.unpacked = "0";
        } else if ("DetectGraph".equals(str)) {
            modelConfig.m = "367";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "88ce06d263dd164078e334a2c609d236";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/367/0_3.zip";
            modelConfig.unpacked = "0";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap4 = new HashMap();
            hashMap4.put("dg_00041_1", "88ce06d263dd164078e334a2c609d236");
            modelConfig.models = hashMap4;
        } else if ("GenericObjectTrack".equals(str)) {
            modelConfig.m = "385";
            modelConfig.s = "";
            modelConfig.t = "";
            modelConfig.allNet = "1";
            modelConfig.md5 = "400c2ad38a6236094d27909b37612c94";
            modelConfig.url = "https://ossgw.alicdn.com/fregata-open/static/files/385/0_3.zip";
            modelConfig.unpacked = "0";
            modelConfig.urlPrefix = "https://ossgw.alicdn.com/fregata-open/";
            HashMap hashMap5 = new HashMap();
            hashMap5.put("ot_00043_1", "400c2ad38a6236094d27909b37612c94");
            modelConfig.models = hashMap5;
        }
        return modelConfig;
    }

    public dpr(Context context, dpu<T> dpuVar, dpt<T> dptVar, ModelConfig modelConfig) {
        this.g = context;
        this.i = dpuVar;
        this.h = dptVar;
        this.j = modelConfig;
        a();
    }

    public a<T> a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4cb989ac", new Object[]{this, strArr});
        }
        a<T> aVar = new a<>();
        String str = strArr[0];
        if (strArr.length > 1) {
            List<String> list = this.f.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.f.put(str, list);
            }
            list.clear();
            for (int i = 1; i < strArr.length; i++) {
                list.add(strArr[i]);
            }
            dpq.a("AliNNJava", "biz explicitly use this models: %s", String.valueOf(Arrays.asList(list)));
        }
        File filesDir = this.g.getFilesDir();
        File file = new File(filesDir, "alinn_files_cache/" + str);
        if (!file.exists() && !file.mkdirs()) {
            aVar.b = new Exception("AlinnNet fail to create model dir");
            return aVar;
        }
        a(str, file, aVar);
        dpq.a("AliNNJava", "init net model result=%s, error=%s", aVar.f26898a, aVar.b);
        return aVar;
    }

    private void a(String str, File file, a<T> aVar) {
        ModelConfig a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a2a7d6", new Object[]{this, str, file, aVar});
            return;
        }
        String b = b("android_alinn_" + str + "_v01_config");
        dpq.a("AliNNJava", "fetch orange config v3: %s", b);
        try {
            a2 = (ModelConfig) JSON.parseObject(b, ModelConfig.class);
            dpn.a(str, a2.m);
        } catch (JSONException unused) {
            dpq.a("AliNNJava", "fail to parse json config", new Object[0]);
            ModelConfig modelConfig = this.j;
            if (modelConfig != null && modelConfig.url != null && this.j.md5 != null && this.j.m != null) {
                a2 = this.j;
                dpq.a("AliNNJava", "use user default config, url: %s, md5:%s m: %s allNet: %s unpacked: %s", a2.url, this.j.md5, this.j.m, this.j.allNet, this.j.unpacked);
            } else {
                a2 = a(str);
                dpq.a("AliNNJava", "use local default config, url: %s, md5:%s m: %s allNet: %s unpacked: %s", a2.url, a2.md5, a2.m, a2.allNet, a2.unpacked);
            }
        }
        if (a2 == null || a2.url == null || a2.md5 == null || a2.m == null) {
            String str2 = "fail to get model url config, modelConfig = " + b;
            dpq.a("AliNNJava", str2, new Object[0]);
            aVar.b = new NullPointerException(str2);
            return;
        }
        publishProgress(10);
        if (a2.unpacked != null && a2.unpacked.equals("1")) {
            b(str, a2, file, aVar);
        } else {
            a(str, a2, file, aVar);
        }
    }

    private void a(String str, ModelConfig modelConfig, File file, a<T> aVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcff83d", new Object[]{this, str, modelConfig, file, aVar});
            return;
        }
        File file2 = new File(file, modelConfig.md5 + ".zip");
        String str3 = "0";
        if (!file2.exists()) {
            dpq.a("AliNNJava", "packed file not exist: " + file2.getAbsolutePath(), new Object[0]);
            HashSet hashSet = new HashSet(Arrays.asList(file.list()));
            boolean z = modelConfig.allNet == null || Integer.parseInt(modelConfig.allNet) == 0;
            if (z && !dps.a(this.g)) {
                dpq.a("AliNNJava", "only download model in wifi status", new Object[0]);
                aVar.b = new Exception("fail to download, only enable in wifi env");
                dpn.a(str, modelConfig.m, "1", "20001", false, 0.0f);
                return;
            }
            ArrayList arrayList = new ArrayList();
            kmo kmoVar = new kmo();
            kmoVar.f30167a = modelConfig.url;
            kmoVar.c = modelConfig.md5;
            kmoVar.d = file2.getName();
            arrayList.add(kmoVar);
            long currentTimeMillis = System.currentTimeMillis();
            boolean a2 = a(arrayList, file.getPath(), z, aVar);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str4 = a2 ? str3 : "1";
            str2 = "AliNNJava";
            dpn.a(str, modelConfig.m, str4, this.e, a2, (float) currentTimeMillis2);
            dpq.a(str2, "download model url: %s, md5: %s, status: %s, cost: %d", modelConfig.url, modelConfig.md5, str4, Long.valueOf(currentTimeMillis2));
            if (a2) {
                dps.a(file, new ArrayList(hashSet));
                dpq.a(str2, "delete cache files: " + String.valueOf(Arrays.asList(hashSet)), new Object[0]);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(file2);
                a(arrayList2, aVar);
                dpq.a(str2, "success to download and exact model: " + String.valueOf(Arrays.asList(file.list())), new Object[0]);
            }
        } else {
            str2 = "AliNNJava";
            dpq.a(str2, "zip file exist: " + modelConfig.md5 + ".zip", new Object[0]);
            if (file.list().length < 2) {
                dpq.a(str2, "zip file exist, but unzip fail last time!", new Object[0]);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(file2);
                a(arrayList3, aVar);
            }
        }
        if (file.list() != null && file.list().length != 0) {
            long currentTimeMillis3 = System.currentTimeMillis();
            boolean a3 = a(file, aVar);
            long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
            String valueOf = String.valueOf(Arrays.asList(file.list()));
            if (a3) {
                aVar.f26898a.mModelId = modelConfig.m;
                aVar.f26898a.mModelFiles = valueOf;
                aVar.f26898a.mBizName = str;
                dpq.b(str2, "success to load model, model id is " + modelConfig.m + ", md5 is " + modelConfig.md5, new Object[0]);
                publishProgress(100);
            } else {
                aVar.b = new Exception("fail to load model");
            }
            if (!a3) {
                str3 = "ALINN_UNCOMMIT_VALUE";
            }
            dpn.b(str, modelConfig.m, valueOf, str3, a3, (float) currentTimeMillis4);
            return;
        }
        aVar.b = new Exception("modelDir is empty, fail to load model");
    }

    private void b(String str, ModelConfig modelConfig, File file, a<T> aVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517b54be", new Object[]{this, str, modelConfig, file, aVar});
            return;
        }
        Map<String, String> map = modelConfig.models;
        HashSet<String> hashSet = new HashSet();
        List<String> list = this.f.get(str);
        if (list == null || list.size() == 0) {
            aVar.b = new Exception("");
            return;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            String str6 = ".zip";
            if (it.hasNext()) {
                String str7 = map.get(it.next());
                if (str7 == null) {
                    aVar.b = new Exception("designated model names not in default/orange config models");
                    return;
                }
                hashSet.add(str7 + str6);
            } else {
                HashSet hashSet2 = new HashSet(Arrays.asList(file.list()));
                HashSet hashSet3 = new HashSet(Arrays.asList(file.list()));
                HashSet hashSet4 = new HashSet();
                HashMap hashMap = new HashMap();
                Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, String> next = it2.next();
                    String value = next.getValue();
                    hashSet4.add(value + str6);
                    StringBuilder sb = new StringBuilder();
                    Iterator<Map.Entry<String, String>> it3 = it2;
                    sb.append(modelConfig.urlPrefix);
                    sb.append("static/files/");
                    sb.append(modelConfig.m);
                    sb.append("/0_3/");
                    sb.append(next.getKey());
                    sb.append(str6);
                    String sb2 = sb.toString();
                    hashMap.put(value + str6, sb2);
                    it2 = it3;
                }
                String str8 = "0";
                if (!hashSet2.containsAll(hashSet)) {
                    hashSet4.retainAll(hashSet);
                    hashSet4.removeAll(hashSet2);
                    if (hashSet4.size() > 0) {
                        boolean z = modelConfig.allNet == null || Integer.parseInt(modelConfig.allNet) == 0;
                        if (z && !dps.a(this.g)) {
                            dpq.a("AliNNJava", "only download model in wifi status", new Object[0]);
                            aVar.b = new Exception("fail to download, only enable in wifi env");
                            dpn.a(str, modelConfig.m, "1", "20001", false, 0.0f);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            String str9 = (String) it4.next();
                            if (str9.endsWith(str6)) {
                                str4 = str8;
                                str3 = str6;
                                str5 = str9.substring(0, str9.indexOf(str6));
                            } else {
                                str3 = str6;
                                str4 = str8;
                                str5 = "";
                            }
                            HashMap hashMap2 = hashMap;
                            kmo kmoVar = new kmo();
                            kmoVar.f30167a = (String) hashMap.get(str9);
                            kmoVar.c = str5;
                            kmoVar.d = new File(file, str9).getName();
                            arrayList.add(kmoVar);
                            str8 = str4;
                            it4 = it5;
                            str6 = str3;
                            hashMap = hashMap2;
                        }
                        str2 = str8;
                        long currentTimeMillis = System.currentTimeMillis();
                        boolean a2 = a(arrayList, file.getPath(), z, aVar);
                        dpn.a(str, modelConfig.m, a2 ? str2 : "1", this.e, a2, (float) (System.currentTimeMillis() - currentTimeMillis));
                        if (a2) {
                            dpq.a("AliNNJava", "success download: " + String.valueOf(Arrays.asList(hashSet4)), new Object[0]);
                            hashSet3.removeAll(hashSet);
                            dps.a(file, new ArrayList(hashSet3));
                            dpq.a("AliNNJava", "delete cache files: " + String.valueOf(Arrays.asList(hashSet3)), new Object[0]);
                            ArrayList arrayList2 = new ArrayList();
                            for (String str10 : hashSet) {
                                arrayList2.add(new File(file, str10));
                            }
                            a(arrayList2, aVar);
                            dpq.a("AliNNJava", "success to download and exact model" + String.valueOf(Arrays.asList(file.list())), new Object[0]);
                        }
                    } else {
                        str2 = str8;
                    }
                } else {
                    str2 = str8;
                    dpq.a("AliNNJava", "zip file exist: " + String.valueOf(Arrays.asList(hashSet)), new Object[0]);
                    if (hashSet2.size() < (hashSet.size() << 1)) {
                        dpq.a("AliNNJava", "zip file exist, but unzip fail last time!", new Object[0]);
                        ArrayList arrayList3 = new ArrayList();
                        for (String str11 : hashSet) {
                            arrayList3.add(new File(file, str11));
                        }
                        a(arrayList3, aVar);
                    }
                }
                if (file.list() != null && file.list().length != 0) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    boolean a3 = a(file, aVar);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    String valueOf = String.valueOf(Arrays.asList(file.list()));
                    if (a3) {
                        aVar.f26898a.mModelId = modelConfig.m;
                        aVar.f26898a.mModelFiles = valueOf;
                        aVar.f26898a.mBizName = str;
                        dpq.b("AliNNJava", "success to load model, model id is " + modelConfig.m + ", md5 is " + modelConfig.md5, new Object[0]);
                        publishProgress(100);
                    } else {
                        aVar.b = new Exception("fail to load model");
                    }
                    if (!a3) {
                        str2 = "ALINN_UNCOMMIT_VALUE";
                    }
                    dpn.b(str, modelConfig.m, valueOf, str2, a3, (float) currentTimeMillis3);
                    return;
                }
                aVar.b = new Exception("modelDir is empty, fail to load model");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.android.alinnkit.net.AliNNKitBaseNet, R extends com.taobao.android.alinnkit.net.AliNNKitBaseNet] */
    private boolean a(File file, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2390610", new Object[]{this, file, aVar})).booleanValue();
        }
        T a2 = this.h.a(file);
        if (a2 != 0) {
            aVar.f26898a = a2;
            return true;
        }
        aVar.b = new NullPointerException("fail to load alinn model from files");
        return false;
    }

    private boolean a(List<File> list, a<T> aVar) {
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a30c7f0a", new Object[]{this, list, aVar})).booleanValue();
        }
        for (File file : list) {
            ZipFile zipFile2 = null;
            try {
                try {
                    zipFile = new ZipFile(file.getPath());
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            String name = nextElement.getName();
                            if (!Pattern.matches(".*__MACOSX.*", name) && !name.contains("..")) {
                                String path = new File(file.getParent(), name).getPath();
                                dps.a(zipFile, nextElement, path);
                                dpq.a("AliNNJava", "exact file " + path, new Object[0]);
                            }
                        }
                        try {
                            zipFile.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException e) {
                        e = e;
                        zipFile2 = zipFile;
                        e.printStackTrace();
                        aVar.b = e;
                        if (zipFile2 != null) {
                            try {
                                zipFile2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
            }
        }
        publishProgress(80);
        return true;
    }

    private String b(String str) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String[] strArr = {str};
        d dVar = new d() { // from class: tb.dpr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str2, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str2, map});
                    return;
                }
                synchronized (dpr.a(dpr.this)) {
                    dpr.a(dpr.this, true);
                    dpr.a(dpr.this).notifyAll();
                }
            }
        };
        this.c = false;
        OrangeConfig.getInstance().registerListener(strArr, dVar, true);
        try {
            OrangeConfig.getInstance().forceCheckUpdate();
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                synchronized (this.f26895a) {
                    config = OrangeConfig.getInstance().getConfig(str, "config_0_3", "NO_MODEL_CONFIG_GET");
                    if (this.c || System.currentTimeMillis() - currentTimeMillis > 60000 || "NO_MODEL_CONFIG_GET".equals(config)) {
                        break;
                    }
                    try {
                        this.f26895a.wait(60000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            return config;
        } finally {
            OrangeConfig.getInstance().unregisterListener(strArr, dVar);
        }
    }

    private boolean a(List<kmo> list, String str, boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        int i = 4;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8358002", new Object[]{this, list, str, new Boolean(z), aVar})).booleanValue();
        }
        if (!z) {
            i = 7;
        }
        kmm kmmVar = new kmm();
        kmmVar.b.s = true;
        kmmVar.b.h = str;
        kmmVar.b.f30169a = "AliNNJava";
        kmmVar.b.d = i;
        kmmVar.b.g = true;
        for (kmo kmoVar : list) {
            kmmVar.f30166a.add(kmoVar);
        }
        this.d = false;
        this.e = "ALINN_UNCOMMIT_VALUE";
        b.a().a(kmmVar, new kml() { // from class: tb.dpr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kml
            public void onDownloadStateChange(String str2, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str2, new Boolean(z2)});
                }
            }

            @Override // tb.kml
            public void onDownloadProgress(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i2)});
                    return;
                }
                dpr.a(dpr.this, new Integer[]{Integer.valueOf(((i2 * 50) / 100) + 10)});
            }

            @Override // tb.kml
            public void onDownloadError(String str2, int i2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str2, new Integer(i2), str3});
                    return;
                }
                dpq.c("AliNNJava", " download error: " + str3, new Object[0]);
                dpr.a(dpr.this, String.valueOf(i2));
                a aVar2 = aVar;
                aVar2.b = new Exception(str3 + " code=" + dpr.b(dpr.this));
                synchronized (dpr.c(dpr.this)) {
                    dpr.b(dpr.this, true);
                    dpr.c(dpr.this).notifyAll();
                }
            }

            @Override // tb.kml
            public void onDownloadFinish(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str2, str3});
                    return;
                }
                dpq.b("AliNNJava", str2 + " is finished", new Object[0]);
            }

            @Override // tb.kml
            public void onFinish(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z2)});
                    return;
                }
                synchronized (dpr.c(dpr.this)) {
                    dpq.b("AliNNJava", "download finish, success: " + String.valueOf(z2), new Object[0]);
                    dpr.b(dpr.this, true);
                    dpr.c(dpr.this).notifyAll();
                }
            }

            @Override // tb.kml
            public void onNetworkLimit(int i2, kmq kmqVar, kml.a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i2), kmqVar, aVar2});
                    return;
                }
                kmqVar.d = 7;
                aVar2.a(true);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this.b) {
                if (this.d || System.currentTimeMillis() - currentTimeMillis > 60000) {
                    break;
                }
                try {
                    this.b.wait(60000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        publishProgress(60);
        Boolean bool = true;
        Iterator<kmo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!new File(str, it.next().d).exists()) {
                bool = false;
                break;
            }
        }
        return bool.booleanValue();
    }

    public void a(a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e27b55", new Object[]{this, aVar});
        } else if (aVar.f26898a != null) {
            this.i.a((dpu<T>) aVar.f26898a);
        } else {
            this.i.a(aVar.b);
        }
    }

    public void a(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e57122a", new Object[]{this, numArr});
        } else {
            this.i.a(numArr[0].intValue());
        }
    }
}
