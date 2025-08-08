package com.taobao.android.festival.skin;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.utils.TrackUtils;
import com.taobao.android.festival.utils.d;
import java.util.List;
import java.util.Map;
import tb.gja;
import tb.gjc;
import tb.gjd;
import tb.gje;
import tb.gjg;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends AsyncTask<Void, Void, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SkinConfig f12357a;
    private String b;
    private gjg c;

    static {
        kge.a(-594139912);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ea93ffc", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ gjg b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gjg) ipChange.ipc$dispatch("836bf35d", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ SkinConfig c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SkinConfig) ipChange.ipc$dispatch("d06518aa", new Object[]{aVar}) : aVar.f12357a;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ Void doInBackground(Void[] voidArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
    }

    public a(String str, SkinConfig skinConfig, gjg gjgVar) {
        this.f12357a = skinConfig;
        this.b = str;
        this.c = gjgVar;
    }

    public Void a(Void... voidArr) {
        byte[] a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
        }
        try {
            gje.a().h();
            a2 = gjc.a(this.f12357a.skinUrl);
        } catch (Throwable th) {
            TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_FILE_ERROR, th.getMessage());
            this.c.a(this.b, "DOWNLOAD_ERROR", "Download failed.");
        }
        if (a2 != null && a2.length > 0) {
            Map map = (Map) JSON.parseObject(new String(a2), new TypeReference<Map<String, Map<String, String>>>() { // from class: com.taobao.android.festival.skin.a.1
            }, new Feature[0]);
            if (map != null && !map.isEmpty()) {
                List<String> a3 = d.a(map);
                if (a3.isEmpty()) {
                    gja<Void> a4 = gje.a().a(this.f12357a, a2);
                    if (a4.a()) {
                        TrackUtils.a.a("DownloadSkin");
                        this.c.a(this.b);
                    } else {
                        TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_WRITE_ERROR, a4.f28337a);
                        this.c.a(this.b, "IO_ERROR", "updateFile file error.");
                    }
                } else {
                    gjd gjdVar = new gjd();
                    C0485a c0485a = new C0485a(a2, a3);
                    if (!StringUtils.isEmpty(this.f12357a.skinZipUrl)) {
                        gjdVar.a(this.f12357a.skinCode, this.f12357a.skinZipUrl, c0485a);
                    } else {
                        gjdVar.a(a3, c0485a);
                    }
                }
                return null;
            }
            TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_FILE_ERROR, "json parse error. empty skinData.");
            this.c.a(this.b, "DOWNLOAD_ERROR", "json parse error. empty skinData.");
            return null;
        }
        TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_FILE_ERROR, "Download failed. Empty Bytes.");
        this.c.a(this.b, "DOWNLOAD_ERROR", "Download failed. Empty Bytes.");
        return null;
    }

    /* renamed from: com.taobao.android.festival.skin.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0485a implements gjd.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private byte[] b;
        private List<String> c;

        static {
            kge.a(-560131482);
            kge.a(-768465082);
        }

        public static /* synthetic */ byte[] a(C0485a c0485a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ad402976", new Object[]{c0485a}) : c0485a.b;
        }

        public C0485a(byte[] bArr, List<String> list) {
            this.b = bArr;
            this.c = list;
        }

        @Override // tb.gjd.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                new b(this.b).execute(new Void[0]);
            }
        }

        @Override // tb.gjd.c
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else if (gjd.TYPE_PHENIX.equals(str)) {
                TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_PHENIX_PREFETCH_ERROR, str2);
                gjg b = a.b(a.this);
                String a2 = a.a(a.this);
                b.a(a2, "DOWNLOAD_ERROR", "Download failed, please retry." + str2);
            } else {
                new gjd().a(this.c, new gjd.c() { // from class: com.taobao.android.festival.skin.a.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.gjd.c
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            new b(C0485a.a(C0485a.this)).execute(new Void[0]);
                        }
                    }

                    @Override // tb.gjd.c
                    public void a(String str3, String str4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str3, str4});
                            return;
                        }
                        gjg b2 = a.b(a.this);
                        String a3 = a.a(a.this);
                        b2.a(a3, "DOWNLOAD_ERROR", "Download failed, please retry." + str4);
                        TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_PHENIX_PREFETCH_ERROR, str4);
                    }
                });
                TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_ZIP_PREFETCH_ERROR, str2);
            }
        }
    }

    /* loaded from: classes5.dex */
    public class b extends AsyncTask<Void, Void, gja<Void>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private byte[] b;

        static {
            kge.a(-2045901478);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, tb.gja<java.lang.Void>] */
        @Override // android.os.AsyncTask
        public /* synthetic */ gja<Void> doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(gja<Void> gjaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, gjaVar});
            } else {
                a(gjaVar);
            }
        }

        public b(byte[] bArr) {
            this.b = bArr;
        }

        public gja<Void> a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (gja) ipChange.ipc$dispatch("d6898894", new Object[]{this, voidArr}) : gje.a().a(a.c(a.this), this.b);
        }

        public void a(gja<Void> gjaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea5aea3a", new Object[]{this, gjaVar});
            } else if (gjaVar.a()) {
                TrackUtils.a.a("DownloadSkin");
                a.b(a.this).a(a.a(a.this));
            } else {
                TrackUtils.a.a(TrackUtils.ErrorType.DOWNLOAD_SKIN_WRITE_ERROR, gjaVar.f28337a);
                a.b(a.this).a(a.a(a.this), "IO_ERROR", "updateFile file error.");
            }
        }
    }
}
