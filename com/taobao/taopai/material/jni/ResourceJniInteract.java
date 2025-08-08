package com.taobao.taopai.material.jni;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.jni.ResourceJniInteract;
import com.taobao.taopai.material.request.materialfile.b;
import com.taobao.taopai2.material.MaterialDataServer;
import com.taobao.taopai2.material.business.maires.MaiResResponseModel;
import com.taobao.taopai2.material.business.materialdetail.MaterialDetailBean;
import com.taobao.taopai2.material.business.res.d;
import com.taobao.taopai2.material.business.specified.SpecifiedFilterResultBean;
import com.taobao.taopai2.material.task.a;
import com.taobao.vessel.utils.c;
import java.io.File;
import java.util.ArrayList;
import tb.kge;
import tb.pza;
import tb.pzc;
import tb.qbr;
import tb.qbs;
import tb.qbt;
import tb.qcf;
import tb.rsk;

/* loaded from: classes8.dex */
public class ResourceJniInteract {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_BIZ_LINE = "guangguang";
    private static final String DEFAULT_BIZ_SCENE = "guangguang";
    private static final String TAG = "Material-Resource";

    static {
        kge.a(691318081);
    }

    public static native void onResourcePathResult(long j, long j2, String str, String str2, String str3);

    public static /* synthetic */ void access$000(String str, String str2, long j, long j2, qbt qbtVar, MaterialDetailBean materialDetailBean, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a54d85f", new Object[]{str, str2, new Long(j), new Long(j2), qbtVar, materialDetailBean, str3});
        } else {
            downloadFile(str, str2, j, j2, qbtVar, materialDetailBean, str3);
        }
    }

    public static String getResourceFromCacheWithIdOrTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2377ead", new Object[]{str});
        }
        if (a.a().a(str)) {
            return "";
        }
        String b = qbs.b(str, false);
        if (StringUtils.isEmpty(b)) {
            return "";
        }
        File file = new File(b);
        if (file.exists()) {
            return qbr.b(file);
        }
        String str2 = "getResourceFromCacheWithIdOrTag not found " + str;
        return "";
    }

    public static void getResourcePathForMaterialWithId(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e3abb9", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        String resourceFromCacheWithIdOrTag = getResourceFromCacheWithIdOrTag(str);
        if (StringUtils.isEmpty(resourceFromCacheWithIdOrTag)) {
            downloadMaterialById(str, j2, j);
        } else {
            onResourcePathResult(j, j2, str, resourceFromCacheWithIdOrTag, "");
        }
    }

    public static void getResourcePathForMaterialWithTag(String str, qbt<String> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9422754b", new Object[]{str, qbtVar});
        } else if (StringUtils.isEmpty(str)) {
            Log.e(TAG, "getResourcePathForMaterialWithTag  Tag is null");
        } else {
            getResourcePathForMaterialWithTag(str, -1L, -1L, qbtVar);
        }
    }

    public static void getResourcePathForMaterialWithTag(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5045913e", new Object[]{str, new Long(j), new Long(j2)});
        } else {
            getResourcePathForMaterialWithTag(str, j, j2, null);
        }
    }

    public static void getResourcePathForMaterialWithTag(String str, long j, long j2, final qbt<String> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edad364b", new Object[]{str, new Long(j), new Long(j2), qbtVar});
            return;
        }
        final String resourceFromCacheWithIdOrTag = getResourceFromCacheWithIdOrTag(str);
        if (StringUtils.isEmpty(resourceFromCacheWithIdOrTag)) {
            downloadByTag(str, j, j2, qbtVar);
        } else if (j != -1) {
            onResourcePathResult(j, j2, str, resourceFromCacheWithIdOrTag, "");
        } else if (qbtVar == null) {
        } else {
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$vnQ9kCLFIT7a4z_OlgvwFQ5WPYo
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceJniInteract.lambda$getResourcePathForMaterialWithTag$33(qbt.this, resourceFromCacheWithIdOrTag);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getResourcePathForMaterialWithTag$33(qbt qbtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b3fa12", new Object[]{qbtVar, str});
        } else {
            qbtVar.a(str);
        }
    }

    private static void downloadByTag(final String str, final long j, final long j2, final qbt<String> qbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de888cf9", new Object[]{str, new Long(j), new Long(j2), qbtVar});
        } else {
            MaterialDataServer.a("guangguang", "guangguang", 1).a(158001, 104, str).subscribe(new rsk() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$6JqC3eEvMOfAH9tkVbOGL_1XS9g
                public final void accept(Object obj) {
                    ResourceJniInteract.lambda$downloadByTag$35(str, j, j2, qbtVar, (MaiResResponseModel) obj);
                }
            }, new rsk() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$wD--UTodeTMTUuT0wHC_jf6m7OM
                public final void accept(Object obj) {
                    ResourceJniInteract.lambda$downloadByTag$37(qbt.this, j, j2, str, (Throwable) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$downloadByTag$35(String str, long j, long j2, final qbt qbtVar, MaiResResponseModel maiResResponseModel) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ff4295", new Object[]{str, new Long(j), new Long(j2), qbtVar, maiResResponseModel});
        } else if (maiResResponseModel != null && !StringUtils.isEmpty(maiResResponseModel.resourceUrl)) {
            String str2 = "getMaterialWithTag success url = " + maiResResponseModel.resourceUrl;
            downloadFile("getMaterialWithTag", str, j, j2, qbtVar, maiResResponseModel, str);
        } else {
            String str3 = "getMaterialWithTag fail " + c.LOAD_DATA_NULL;
            if (qbtVar != null) {
                pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$h7v2WJ3hB3GNJAx28jJNIopNgSE
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourceJniInteract.lambda$null$34(qbt.this, r2);
                    }
                });
            } else if (j == -1) {
            } else {
                onResourcePathResult(j, j2, str, "", c.LOAD_DATA_NULL);
            }
        }
    }

    public static /* synthetic */ void lambda$null$34(qbt qbtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff81e85f", new Object[]{qbtVar, str});
        } else {
            qbtVar.a("100", str);
        }
    }

    public static /* synthetic */ void lambda$downloadByTag$37(final qbt qbtVar, long j, long j2, String str, Throwable th) throws Exception {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53994d", new Object[]{qbtVar, new Long(j), new Long(j2), str, th});
            return;
        }
        String str3 = "getMaterialWithTag fail " + th.getMessage();
        if (th.getMessage() != null) {
            str2 = "get url error " + th.getMessage();
        } else {
            str2 = "get url error";
        }
        final String str4 = str2;
        if (qbtVar != null) {
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$j_f2NLBEDcsuHf5oCSK__RYOLtU
                @Override // java.lang.Runnable
                public final void run() {
                    ResourceJniInteract.lambda$null$36(qbt.this, str4);
                }
            });
        } else if (j == -1) {
        } else {
            onResourcePathResult(j, j2, str, "", str4);
        }
    }

    public static /* synthetic */ void lambda$null$36(qbt qbtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("295378e1", new Object[]{qbtVar, str});
        } else {
            qbtVar.a("100", str);
        }
    }

    private static void downloadMaterialById(final String str, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24f1a12", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        com.taobao.taopai2.material.business.specified.a aVar = new com.taobao.taopai2.material.business.specified.a() { // from class: com.taobao.taopai.material.jni.ResourceJniInteract.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taopai2.material.business.specified.a
            public void a(SpecifiedFilterResultBean specifiedFilterResultBean) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f6315f6e", new Object[]{this, specifiedFilterResultBean});
                    return;
                }
                if (specifiedFilterResultBean.mMaterialList != null && specifiedFilterResultBean.mMaterialList.size() > 0) {
                    ResourceJniInteract.access$000("getMaterialWithId", str, j, j2, null, specifiedFilterResultBean.mMaterialList.get(0), "");
                } else {
                    long j3 = j;
                    if (j3 != -1) {
                        ResourceJniInteract.onResourcePathResult(j3, j2, str, "", "data is empty");
                    }
                }
                String str2 = "getMaterialWithId success " + specifiedFilterResultBean.toString();
            }

            @Override // tb.qbu
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                String str4 = "getMaterialWithId fail " + str2 + ", errorInfo = " + str3;
                long j3 = j;
                if (j3 == -1) {
                    return;
                }
                ResourceJniInteract.onResourcePathResult(j3, j2, str, "", str3);
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(pza.a(str, 0L)));
        new com.taobao.taopai.material.a().a("guangguang", "guangguang", 720, arrayList, aVar);
    }

    private static void downloadFile(String str, String str2, long j, long j2, qbt<String> qbtVar, MaterialDetailBean materialDetailBean, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67739d93", new Object[]{str, str2, new Long(j), new Long(j2), qbtVar, materialDetailBean, str3});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a.a().a(str2, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, str2, j, j2, qbtVar, currentTimeMillis);
        b bVar = new b(materialDetailBean.materialType, materialDetailBean.getVersion(), String.valueOf(materialDetailBean.getTid()), materialDetailBean.getResourceUrl());
        if (!StringUtils.isEmpty(str3)) {
            bVar.c(str3);
        }
        bVar.a(false);
        bVar.d(qbs.a(str2, materialDetailBean.resourceUrl));
        new d(bVar, anonymousClass2).a();
    }

    /* renamed from: com.taobao.taopai.material.jni.ResourceJniInteract$2 */
    /* loaded from: classes8.dex */
    public static class AnonymousClass2 implements com.taobao.taopai.material.request.materialfile.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f22066a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ qbt e;
        public final /* synthetic */ long f;

        /* renamed from: lambda$-Ja6uz_UkheVq1kAQai5UyqE8-w */
        public static /* synthetic */ void m1408lambda$Ja6uz_UkheVq1kAQai5UyqE8w(qbt qbtVar, String str) {
            a(qbtVar, str);
        }

        public static /* synthetic */ void lambda$2RuMs0b872XHWUDdyFKSqzU6RBg(qbt qbtVar, String str, String str2) {
            a(qbtVar, str, str2);
        }

        public static /* synthetic */ void lambda$AeCjXowAqjwEgl0zKGB5OMR48Eo(long j, long j2, String str, String str2) {
            b(j, j2, str, str2);
        }

        /* renamed from: lambda$G9N66RTX1wHhkTSZ-TzrLYJRnV0 */
        public static /* synthetic */ void m1409lambda$G9N66RTX1wHhkTSZTzrLYJRnV0(long j, long j2, String str, String str2) {
            a(j, j2, str, str2);
        }

        public AnonymousClass2(String str, String str2, long j, long j2, qbt qbtVar, long j3) {
            this.f22066a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
            this.e = qbtVar;
            this.f = j3;
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            String str3 = this.f22066a + " success path = " + str2;
            a.a().c(this.b);
            final long j = this.c;
            if (j != -1) {
                final long j2 = this.d;
                final String str4 = this.b;
                pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$2$AeCjXowAqjwEgl0zKGB5OMR48Eo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourceJniInteract.AnonymousClass2.lambda$AeCjXowAqjwEgl0zKGB5OMR48Eo(j, j2, str4, str2);
                    }
                });
            } else {
                final qbt qbtVar = this.e;
                if (qbtVar != null) {
                    pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$2$-Ja6uz_UkheVq1kAQai5UyqE8-w
                        @Override // java.lang.Runnable
                        public final void run() {
                            ResourceJniInteract.AnonymousClass2.m1408lambda$Ja6uz_UkheVq1kAQai5UyqE8w(qbt.this, str2);
                        }
                    });
                }
            }
            qcf.a(this.b, "0", "", System.currentTimeMillis() - this.f);
        }

        public static /* synthetic */ void b(long j, long j2, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da311abd", new Object[]{new Long(j), new Long(j2), str, str2});
            } else {
                ResourceJniInteract.onResourcePathResult(j, j2, str, str2, "");
            }
        }

        public static /* synthetic */ void a(qbt qbtVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23035dff", new Object[]{qbtVar, str});
            } else {
                qbtVar.a(str);
            }
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            String str2 = this.f22066a + " progress = " + i;
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            final String str4 = "download error " + str2 + "|" + str3;
            String str5 = this.f22066a + " fail = " + str4;
            final long j = this.c;
            if (j != -1) {
                final long j2 = this.d;
                final String str6 = this.b;
                pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$2$G9N66RTX1wHhkTSZ-TzrLYJRnV0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ResourceJniInteract.AnonymousClass2.m1409lambda$G9N66RTX1wHhkTSZTzrLYJRnV0(j, j2, str6, str4);
                    }
                });
            } else {
                final qbt qbtVar = this.e;
                if (qbtVar != null) {
                    pzc.a(new Runnable() { // from class: com.taobao.taopai.material.jni.-$$Lambda$ResourceJniInteract$2$2RuMs0b872XHWUDdyFKSqzU6RBg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ResourceJniInteract.AnonymousClass2.lambda$2RuMs0b872XHWUDdyFKSqzU6RBg(qbt.this, str2, str3);
                        }
                    });
                }
            }
            a.a().c(this.b);
            qcf.a(this.b, str2, str3, System.currentTimeMillis() - this.f);
        }

        public static /* synthetic */ void a(long j, long j2, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4efabfc", new Object[]{new Long(j), new Long(j2), str, str2});
            } else {
                ResourceJniInteract.onResourcePathResult(j, j2, str, "", str2);
            }
        }

        public static /* synthetic */ void a(qbt qbtVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42a609", new Object[]{qbtVar, str, str2});
            } else {
                qbtVar.a(str, str2);
            }
        }
    }
}
