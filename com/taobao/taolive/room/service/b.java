package com.taobao.taolive.room.service;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.fxb;
import tb.kge;
import tb.plx;
import tb.pmd;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21676a;
    public static final String suffixName = ".png";
    private HashMap<String, ArrayList<Drawable>> b;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(ArrayList<Drawable> arrayList);
    }

    /* renamed from: com.taobao.taolive.room.service.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0901b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f21680a;

        static {
            kge.a(-1420030600);
            f21680a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bf03031", new Object[0]) : f21680a;
        }
    }

    public static /* synthetic */ ArrayList a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("9c7fa515", new Object[]{bVar, str}) : bVar.a(str);
    }

    public static /* synthetic */ HashMap a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e79d7854", new Object[]{bVar}) : bVar.b;
    }

    static {
        kge.a(-106672475);
        f21676a = b.class.getSimpleName();
    }

    private b() {
        this.b = new HashMap<>();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bf03031", new Object[0]) : C0901b.a();
    }

    public void a(final String str, final a aVar) {
        ArrayList<Drawable> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfa538a", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str)) {
            if (aVar == null) {
                return;
            }
            aVar.a();
        } else {
            HashMap<String, ArrayList<Drawable>> hashMap = this.b;
            if (hashMap != null && hashMap.containsKey(str) && (arrayList = this.b.get(str)) != null && aVar != null) {
                aVar.a(arrayList);
            } else {
                b(str, new a() { // from class: com.taobao.taolive.room.service.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.room.service.b.a
                    public void a(ArrayList<Drawable> arrayList2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList2});
                            return;
                        }
                        if (arrayList2 != null) {
                            aVar.a(arrayList2);
                        }
                        b.a(b.this).put(str, arrayList2);
                    }

                    @Override // com.taobao.taolive.room.service.b.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a();
                    }
                });
            }
        }
    }

    private ArrayList<Drawable> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str});
        }
        String a2 = l.a(pmd.a().u().c(), "taolive");
        ArrayList<Drawable> arrayList = new ArrayList<>();
        File file = new File(str);
        FileInputStream fileInputStream = null;
        try {
            if (!TextUtils.isEmpty(str) && !str.endsWith(".zip")) {
                FileInputStream fileInputStream2 = new FileInputStream(new File(str));
                try {
                    arrayList.add(new BitmapDrawable(BitmapFactory.decodeStream(fileInputStream2)));
                    fileInputStream2.close();
                    return arrayList;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                }
            }
        } catch (Exception unused2) {
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String name = nextElement.getName();
                if (!TextUtils.isEmpty(name) && name.endsWith(".png") && !name.contains("../")) {
                    File file2 = new File(a2 + fxb.DIR + l.a(name));
                    if (file2.isHidden()) {
                        file2.delete();
                    } else {
                        file2.delete();
                        if (nextElement.getSize() != 0 && !nextElement.isDirectory() && (fileInputStream = zipFile.getInputStream(nextElement)) != null) {
                            arrayList.add(new BitmapDrawable(BitmapFactory.decodeStream(fileInputStream)));
                            fileInputStream.close();
                        }
                    }
                }
            }
            zipFile.close();
        } catch (Exception e) {
            String str2 = f21676a;
            plx.b(str2, "fetchFromFile = " + e.getMessage());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private void b(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fe1ee9", new Object[]{this, str, aVar});
            return;
        }
        if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
            str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizId", "my3dZone");
        hashMap.put(MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, true);
        hashMap.put("fileStorePath", l.a(pmd.a().u().c(), "taolive"));
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONArray.add(jSONObject);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("downloadList", jSONArray);
        hashMap2.put("downloadParam", hashMap);
        pmd.a().o().a(hashMap2, new com.taobao.taolive.sdk.adapter.network.a() { // from class: com.taobao.taolive.room.service.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.a
            public void a(String str2, int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed88149b", new Object[]{this, str2, new Integer(i), str3});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.taolive.room.service.b$2$1] */
            @Override // com.taobao.taolive.sdk.adapter.network.a
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                } else {
                    new AsyncTask<String, Integer, Object>() { // from class: com.taobao.taolive.room.service.b.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str4, Object... objArr) {
                            if (str4.hashCode() == -1325021319) {
                                super.onPostExecute(objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str4));
                        }

                        @Override // android.os.AsyncTask
                        public /* synthetic */ Object doInBackground(String[] strArr) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
                        }

                        public Object a(String... strArr) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("b2592c5b", new Object[]{this, strArr}) : b.a(b.this, strArr[0]);
                        }

                        @Override // android.os.AsyncTask
                        public void onPostExecute(Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b105c779", new Object[]{this, obj});
                                return;
                            }
                            super.onPostExecute(obj);
                            if (obj != null) {
                                if (aVar == null) {
                                    return;
                                }
                                aVar.a((ArrayList) obj);
                            } else if (aVar == null) {
                            } else {
                                aVar.a();
                            }
                        }
                    }.execute(str3);
                }
            }
        });
    }
}
