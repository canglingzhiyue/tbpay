package tb;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.bean.MaterialResource;
import com.taobao.taopai.material.request.materialdetail.MaterialDetailBusiness;
import com.taobao.taopai.material.request.materialdetail.a;
import com.taobao.taopai.material.request.materialdetail.b;
import com.taobao.taopai.material.request.materialfile.MaterialFileBusiness;
import java.io.File;
import tb.qca;

/* loaded from: classes8.dex */
public class qca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f32899a;
    private long b;

    static {
        kge.a(-300436735);
    }

    public static /* synthetic */ void lambda$8GwjbmJrGKn_0x0bfzf9WHhSMcM(qby qbyVar, MaterialResource materialResource) {
        a(qbyVar, materialResource);
    }

    public static /* synthetic */ long a(qca qcaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb08bbdd", new Object[]{qcaVar})).longValue() : qcaVar.b;
    }

    public static /* synthetic */ void a(qca qcaVar, MaterialDetail materialDetail, b bVar, qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94615919", new Object[]{qcaVar, materialDetail, bVar, qbyVar});
        } else {
            qcaVar.a(materialDetail, bVar, qbyVar);
        }
    }

    public static /* synthetic */ void a(qca qcaVar, MaterialDetail materialDetail, String str, qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2a66f5", new Object[]{qcaVar, materialDetail, str, qbyVar});
        } else {
            qcaVar.a(materialDetail, str, qbyVar);
        }
    }

    public qca(Context context) {
        this.f32899a = context;
    }

    public void a(b bVar, qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf962d4", new Object[]{this, bVar, qbyVar});
            return;
        }
        this.b = SystemClock.elapsedRealtime();
        new MaterialDetailBusiness(bVar, new AnonymousClass1(bVar, qbyVar)).request();
    }

    /* renamed from: tb.qca$1 */
    /* loaded from: classes8.dex */
    public class AnonymousClass1 implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ b f32900a;
        public final /* synthetic */ qby b;

        public static /* synthetic */ void lambda$o9SIE8xSx7Rbr0PYuWwz_oHfL1c(qby qbyVar, String str, String str2) {
            a(qbyVar, str, str2);
        }

        public AnonymousClass1(b bVar, qby qbyVar) {
            qca.this = r1;
            this.f32900a = bVar;
            this.b = qbyVar;
        }

        @Override // com.taobao.taopai.material.request.materialdetail.a
        public void a(MaterialDetail materialDetail) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23a98282", new Object[]{this, materialDetail});
                return;
            }
            String str = "MaterialRes Success " + this.f32900a.g();
            if (!materialDetail.getResourceUrl().startsWith("http")) {
                qca.a(qca.this, materialDetail, "", this.b);
            } else {
                qca.a(qca.this, materialDetail, this.f32900a, this.b);
            }
        }

        @Override // tb.qbu
        public void a(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            Log.e("TPMaterial", "MaterialRes Fail " + this.f32900a.g() + ", " + str + "|" + str2);
            final qby qbyVar = this.b;
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qca$1$o9SIE8xSx7Rbr0PYuWwz_oHfL1c
                @Override // java.lang.Runnable
                public final void run() {
                    qca.AnonymousClass1.lambda$o9SIE8xSx7Rbr0PYuWwz_oHfL1c(qby.this, str, str2);
                }
            });
        }

        public static /* synthetic */ void a(qby qbyVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80d85a64", new Object[]{qbyVar, str, str2});
            } else {
                qbyVar.a(str, str2);
            }
        }
    }

    private void a(MaterialDetail materialDetail, b bVar, qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2cb62fa", new Object[]{this, materialDetail, bVar, qbyVar});
            return;
        }
        com.taobao.taopai.material.request.materialfile.b bVar2 = new com.taobao.taopai.material.request.materialfile.b(bVar.b(), materialDetail.getMaterialType(), bVar.h(), String.valueOf(bVar.g()), materialDetail.getResourceUrl(), materialDetail.getModifiedTime());
        bVar2.a(bVar.a());
        bVar2.c(bVar.i());
        a(bVar2, materialDetail, qbyVar);
    }

    /* renamed from: tb.qca$2 */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 implements com.taobao.taopai.material.request.materialfile.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ MaterialDetail f32901a;
        public final /* synthetic */ qby b;
        public final /* synthetic */ com.taobao.taopai.material.request.materialfile.b c;
        public final /* synthetic */ long d;

        public static /* synthetic */ void lambda$bWRtAJGUm1HYJFNZ3zvecy7NwHs(qby qbyVar, int i) {
            a(qbyVar, i);
        }

        /* renamed from: lambda$qcAH8fquD4kFMWLM-ptKGU6Pn7g */
        public static /* synthetic */ void m2478lambda$qcAH8fquD4kFMWLMptKGU6Pn7g(qby qbyVar, String str, String str2) {
            a(qbyVar, str, str2);
        }

        public AnonymousClass2(MaterialDetail materialDetail, qby qbyVar, com.taobao.taopai.material.request.materialfile.b bVar, long j) {
            qca.this = r1;
            this.f32901a = materialDetail;
            this.b = qbyVar;
            this.c = bVar;
            this.d = j;
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.qca.2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    AnonymousClass2.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        qca.a(qca.this, AnonymousClass2.this.f32901a, str2, AnonymousClass2.this.b);
                    }
                }
            });
            qcf.a(this.c.b(), Constants.SEND_TYPE_RES, SystemClock.elapsedRealtime() - qca.a(qca.this));
        }

        public static /* synthetic */ void a(qby qbyVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65ac8fb3", new Object[]{qbyVar, new Integer(i)});
            } else {
                qbyVar.a(i);
            }
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(String str, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            final qby qbyVar = this.b;
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qca$2$bWRtAJGUm1HYJFNZ3zvecy7NwHs
                @Override // java.lang.Runnable
                public final void run() {
                    qca.AnonymousClass2.lambda$bWRtAJGUm1HYJFNZ3zvecy7NwHs(qby.this, i);
                }
            });
        }

        public static /* synthetic */ void a(qby qbyVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80d85a64", new Object[]{qbyVar, str, str2});
            } else {
                qbyVar.a(str, str2);
            }
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            final qby qbyVar = this.b;
            pzc.a(new Runnable() { // from class: tb.-$$Lambda$qca$2$qcAH8fquD4kFMWLM-ptKGU6Pn7g
                @Override // java.lang.Runnable
                public final void run() {
                    qca.AnonymousClass2.m2478lambda$qcAH8fquD4kFMWLMptKGU6Pn7g(qby.this, str2, str3);
                }
            });
            qcf.a(this.c.b(), Constants.SEND_TYPE_RES, this.c.toString(), str2, str3, SystemClock.elapsedRealtime() - this.d);
        }
    }

    private void a(com.taobao.taopai.material.request.materialfile.b bVar, MaterialDetail materialDetail, qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b917ba3", new Object[]{this, bVar, materialDetail, qbyVar});
        } else {
            new MaterialFileBusiness(this.f32899a, bVar, new AnonymousClass2(materialDetail, qbyVar, bVar, SystemClock.elapsedRealtime())).getMaterialFile();
        }
    }

    private void a(MaterialDetail materialDetail, String str, final qby qbyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994cb4", new Object[]{this, materialDetail, str, qbyVar});
            return;
        }
        final MaterialResource materialResource = new MaterialResource();
        materialResource.setName(materialDetail.getName());
        materialResource.setCreatorName(materialDetail.getCreatorName());
        materialResource.setLogoUrl(materialDetail.getLogoUrl());
        materialResource.setMaterialType(materialDetail.getMaterialType());
        materialResource.setModifiedTime(materialDetail.getModifiedTime());
        materialResource.setResourceUrl(materialDetail.getResourceUrl());
        materialResource.setExtend(materialDetail.getExtend());
        materialResource.setTid(materialDetail.getTid());
        materialResource.setVersion(materialDetail.getVersion());
        if (!StringUtils.isEmpty(str) && str.endsWith(".png")) {
            materialResource.setDirPath(new File(str).getParentFile().getPath());
        } else {
            materialResource.setDirPath(str);
        }
        materialResource.setMaterialJsonPath(qbz.a(str));
        pzc.a(new Runnable() { // from class: tb.-$$Lambda$qca$8GwjbmJrGKn_0x0bfzf9WHhSMcM
            @Override // java.lang.Runnable
            public final void run() {
                qca.lambda$8GwjbmJrGKn_0x0bfzf9WHhSMcM(qby.this, materialResource);
            }
        });
    }

    public static /* synthetic */ void a(qby qbyVar, MaterialResource materialResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b39cd", new Object[]{qbyVar, materialResource});
        } else {
            qbyVar.a(materialResource);
        }
    }
}
