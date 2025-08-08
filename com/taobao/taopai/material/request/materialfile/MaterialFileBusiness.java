package com.taobao.taopai.material.request.materialfile;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.material.bean.funny.bean.FunnyBean;
import com.taobao.taopai.material.bean.funny.bean.FunnyDecorationBean;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.materialfile.MaterialFileBusiness;
import java.io.File;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.pzb;
import tb.pzc;
import tb.qbq;
import tb.qbr;
import tb.qbu;
import tb.qcf;
import tb.qcg;

/* loaded from: classes8.dex */
public class MaterialFileBusiness extends BaseMaterialBusiness<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REQUIRE_JSON = "require.json";
    private static final String TAG = "MaterialFileBusiness";
    private static final String TEMPLATE_JSON = "template.json";
    private Context mContext;
    private qbq mDownloadTask;
    private b mFileParams;
    private a mListener;

    static {
        kge.a(1724845933);
    }

    public static /* synthetic */ Object ipc$super(MaterialFileBusiness materialFileBusiness, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "file";
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void handleCacheLoaded(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c2c30", new Object[]{this, str});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public String mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27955b36", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.taopai.material.request.base.b
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
        }
    }

    public static /* synthetic */ b access$000(MaterialFileBusiness materialFileBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1a2d4512", new Object[]{materialFileBusiness}) : materialFileBusiness.mFileParams;
    }

    public static /* synthetic */ Context access$100(MaterialFileBusiness materialFileBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fbf2cc92", new Object[]{materialFileBusiness}) : materialFileBusiness.mContext;
    }

    public static /* synthetic */ void access$200(MaterialFileBusiness materialFileBusiness, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb591daf", new Object[]{materialFileBusiness, str, str2});
        } else {
            materialFileBusiness.checkMaiDependDownload(str, str2);
        }
    }

    public static /* synthetic */ a access$300(MaterialFileBusiness materialFileBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("735439b6", new Object[]{materialFileBusiness}) : materialFileBusiness.mListener;
    }

    public static /* synthetic */ void access$400(MaterialFileBusiness materialFileBusiness, String str, com.taobao.taopai.material.maires.a aVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8986925", new Object[]{materialFileBusiness, str, aVar, str2});
        } else {
            materialFileBusiness.parseFunnyFile(str, aVar, str2);
        }
    }

    public MaterialFileBusiness(Context context, final b bVar, final a aVar) {
        super(bVar, new qbu() { // from class: com.taobao.taopai.material.request.materialfile.MaterialFileBusiness.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qbu
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    aVar.a(bVar.j(), str, str2);
                }
            }
        });
        this.mContext = context;
        this.mFileParams = bVar;
        this.mListener = aVar;
    }

    public void getMaterialFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d475c0", new Object[]{this});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$tssjEtLytnpK8RjLDlQLrjA2s4c
                {
                    MaterialFileBusiness.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.this.lambda$getMaterialFile$6$MaterialFileBusiness();
                }
            });
        }
    }

    public /* synthetic */ void lambda$getMaterialFile$6$MaterialFileBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd65e9f5", new Object[]{this});
        } else if (this.mFileParams.a()) {
            final String a2 = qbr.a(this.mFileParams.j(), this.mFileParams.i(), this.mFileParams.k());
            if (!StringUtils.isEmpty(this.mFileParams.m())) {
                a2 = a2 + File.separator + this.mFileParams.m();
            }
            if (!isCacheInvalid(a2)) {
                if (pzb.e()) {
                    checkMaiDependDownload(this.mFileParams.j(), a2);
                } else {
                    pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$ryqfNGKQkAEulgBwGxN6hAQuCbg
                        {
                            MaterialFileBusiness.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MaterialFileBusiness.this.lambda$null$3$MaterialFileBusiness(a2);
                        }
                    });
                }
                qcf.a(this.mFileParams.b(), getUtRequestKey());
                String str = "MaterialFile Success From Cache , tid = " + this.mFileParams.j();
                return;
            }
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$sEjZa8YeV4MKM4hNnvp8cicXZ8A
                {
                    MaterialFileBusiness.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.this.lambda$null$4$MaterialFileBusiness();
                }
            });
        } else {
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$evj_dZmNDs54_DXk_ZWrbGG92HY
                {
                    MaterialFileBusiness.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.this.lambda$null$5$MaterialFileBusiness();
                }
            });
        }
    }

    public /* synthetic */ void lambda$null$3$MaterialFileBusiness(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6475224", new Object[]{this, str});
        } else {
            this.mListener.a(this.mFileParams.j(), str);
        }
    }

    public /* synthetic */ void lambda$null$4$MaterialFileBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3f825b", new Object[]{this});
        } else {
            requestByNet();
        }
    }

    public /* synthetic */ void lambda$null$5$MaterialFileBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4d99dc", new Object[]{this});
        } else {
            requestByNet();
        }
    }

    /* renamed from: com.taobao.taopai.material.request.materialfile.MaterialFileBusiness$2 */
    /* loaded from: classes8.dex */
    public class AnonymousClass2 implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$7uON6TbuH4U57tm0F_6HgWm4QOc(AnonymousClass2 anonymousClass2, String str, String str2, String str3) {
            anonymousClass2.b(str, str2, str3);
        }

        public static /* synthetic */ void lambda$9wdP4BXb3TWo15uMUrqFMJF0Hwk(AnonymousClass2 anonymousClass2, String str, int i) {
            anonymousClass2.b(str, i);
        }

        /* renamed from: lambda$_pwO-VD9i46-_sUyDwOfkwZNBJU */
        public static /* synthetic */ void m1417lambda$_pwOVD9i46_sUyDwOfkwZNBJU(AnonymousClass2 anonymousClass2, String str, String str2) {
            anonymousClass2.b(str, str2);
        }

        public AnonymousClass2() {
            MaterialFileBusiness.this = r1;
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            String str3 = "MaterialFile Success From Net , tid = " + MaterialFileBusiness.access$000(MaterialFileBusiness.this).j();
            com.taobao.taopai2.material.task.a.a().c(MaterialFileBusiness.access$000(MaterialFileBusiness.this).j());
            if (!pzb.e() || MaterialFileBusiness.access$100(MaterialFileBusiness.this) == null) {
                pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$2$_pwO-VD9i46-_sUyDwOfkwZNBJU
                    {
                        MaterialFileBusiness.AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialFileBusiness.AnonymousClass2.m1417lambda$_pwOVD9i46_sUyDwOfkwZNBJU(MaterialFileBusiness.AnonymousClass2.this, str, str2);
                    }
                });
            } else {
                MaterialFileBusiness.access$200(MaterialFileBusiness.this, str, str2);
            }
        }

        public /* synthetic */ void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, str2);
            }
        }

        public /* synthetic */ void b(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, i);
            }
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(final String str, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            } else {
                pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$2$9wdP4BXb3TWo15uMUrqFMJF0Hwk
                    {
                        MaterialFileBusiness.AnonymousClass2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialFileBusiness.AnonymousClass2.lambda$9wdP4BXb3TWo15uMUrqFMJF0Hwk(MaterialFileBusiness.AnonymousClass2.this, str, i);
                    }
                });
            }
        }

        @Override // com.taobao.taopai.material.request.materialfile.a
        public void a(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                return;
            }
            com.taobao.taopai2.material.task.a.a().c(MaterialFileBusiness.access$000(MaterialFileBusiness.this).j());
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$2$7uON6TbuH4U57tm0F_6HgWm4QOc
                {
                    MaterialFileBusiness.AnonymousClass2.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.AnonymousClass2.lambda$7uON6TbuH4U57tm0F_6HgWm4QOc(MaterialFileBusiness.AnonymousClass2.this, str, str2, str3);
                }
            });
            Log.e("TPMaterial", "MaterialFile Fail From Net , tid = " + MaterialFileBusiness.access$000(MaterialFileBusiness.this).j());
        }

        public /* synthetic */ void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, str2, str3);
            }
        }
    }

    private void requestByNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c72017e", new Object[]{this});
            return;
        }
        this.mDownloadTask = new qbq(this.mFileParams.h(), new AnonymousClass2());
        this.mDownloadTask.a(this.mFileParams.b(), this.mFileParams.j(), this.mFileParams.k(), this.mFileParams.i(), this.mFileParams.m());
    }

    /* renamed from: com.taobao.taopai.material.request.materialfile.MaterialFileBusiness$3 */
    /* loaded from: classes8.dex */
    public class AnonymousClass3 implements com.taobao.taopai.material.maires.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f22077a;
        public final /* synthetic */ String b;

        /* renamed from: lambda$-PUzvAPy2IFkt9yJmOAWtPQBTkU */
        public static /* synthetic */ void m1418lambda$PUzvAPy2IFkt9yJmOAWtPQBTkU(AnonymousClass3 anonymousClass3, String str, String str2) {
            anonymousClass3.a(str, str2);
        }

        public static /* synthetic */ void lambda$QsYyIrK3ot1QjjKjw945VxJcOK8(AnonymousClass3 anonymousClass3, String str, int i, String str2) {
            anonymousClass3.a(str, i, str2);
        }

        public AnonymousClass3(String str, String str2) {
            MaterialFileBusiness.this = r1;
            this.f22077a = str;
            this.b = str2;
        }

        public /* synthetic */ void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, str2);
            }
        }

        @Override // com.taobao.taopai.material.maires.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            final String str = this.f22077a;
            final String str2 = this.b;
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$3$-PUzvAPy2IFkt9yJmOAWtPQBTkU
                {
                    MaterialFileBusiness.AnonymousClass3.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.AnonymousClass3.m1418lambda$PUzvAPy2IFkt9yJmOAWtPQBTkU(MaterialFileBusiness.AnonymousClass3.this, str, str2);
                }
            });
        }

        public /* synthetic */ void a(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            } else {
                MaterialFileBusiness.access$300(MaterialFileBusiness.this).a(str, String.valueOf(i), str2);
            }
        }

        @Override // com.taobao.taopai.material.maires.a
        public void a(final int i, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            final String str2 = this.f22077a;
            pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$3$QsYyIrK3ot1QjjKjw945VxJcOK8
                {
                    MaterialFileBusiness.AnonymousClass3.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MaterialFileBusiness.AnonymousClass3.lambda$QsYyIrK3ot1QjjKjw945VxJcOK8(MaterialFileBusiness.AnonymousClass3.this, str2, i, str);
                }
            });
            Log.e(MaterialFileBusiness.TAG, "onMaiResDependFail " + i + " , msg = " + str);
        }
    }

    private void checkMaiDependDownload(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d45a8bc", new Object[]{this, str, str2});
        } else {
            handleMaiDepend(str2, new AnonymousClass3(str, str2));
        }
    }

    private void handleMaiDepend(String str, com.taobao.taopai.material.maires.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdfe4f8", new Object[]{this, str, aVar});
        } else if (StringUtils.isEmpty(str)) {
            aVar.a();
        } else {
            String d = qcg.d(str + File.separator + TEMPLATE_JSON);
            if (!StringUtils.isEmpty(d)) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new AnonymousClass4(str, aVar, d));
            } else {
                aVar.a();
            }
        }
    }

    /* renamed from: com.taobao.taopai.material.request.materialfile.MaterialFileBusiness$4 */
    /* loaded from: classes8.dex */
    public class AnonymousClass4 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f22078a;
        public final /* synthetic */ com.taobao.taopai.material.maires.a b;
        public final /* synthetic */ String c;

        public static /* synthetic */ void lambda$V7oAW4lLbHvTUZ37XBHuKF08HsU(com.taobao.taopai.material.maires.a aVar) {
            a(aVar);
        }

        public AnonymousClass4(String str, com.taobao.taopai.material.maires.a aVar, String str2) {
            MaterialFileBusiness.this = r1;
            this.f22078a = str;
            this.b = aVar;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MaterialFileBusiness.access$400(MaterialFileBusiness.this, this.f22078a, this.b, this.c);
            } catch (Exception e) {
                e.printStackTrace();
                final com.taobao.taopai.material.maires.a aVar = this.b;
                pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$4$V7oAW4lLbHvTUZ37XBHuKF08HsU
                    @Override // java.lang.Runnable
                    public final void run() {
                        MaterialFileBusiness.AnonymousClass4.lambda$V7oAW4lLbHvTUZ37XBHuKF08HsU(com.taobao.taopai.material.maires.a.this);
                    }
                });
            }
        }

        public static /* synthetic */ void a(com.taobao.taopai.material.maires.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9868abfa", new Object[]{aVar});
            } else {
                aVar.a();
            }
        }
    }

    private void parseFunnyFile(String str, final com.taobao.taopai.material.maires.a aVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df556b28", new Object[]{this, str, aVar, str2});
            return;
        }
        FunnyBean funnyBean = (FunnyBean) JSON.parseObject(str2, FunnyBean.class);
        if (funnyBean != null && funnyBean.stage != null && funnyBean.stage.decorators != null && !funnyBean.stage.decorators.isEmpty()) {
            for (FunnyDecorationBean funnyDecorationBean : funnyBean.stage.decorators) {
                if (StringUtils.equals(funnyDecorationBean.type, "2")) {
                    String str3 = str + File.separator + funnyDecorationBean.resourcePath + File.separator + REQUIRE_JSON;
                    if (new File(str3).exists()) {
                        new com.taobao.taopai.material.maires.b(this.mContext).a(this.mFileParams.b(), str3, 30, aVar);
                        return;
                    } else {
                        pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$onjZgmYoPAgBcDuX_IQws2qDPy4
                            @Override // java.lang.Runnable
                            public final void run() {
                                MaterialFileBusiness.lambda$parseFunnyFile$13(com.taobao.taopai.material.maires.a.this);
                            }
                        });
                        return;
                    }
                }
            }
        }
        pzc.a(new Runnable() { // from class: com.taobao.taopai.material.request.materialfile.-$$Lambda$MaterialFileBusiness$Jro0a9nJD8tqsJyNMuXw7HTT_xA
            @Override // java.lang.Runnable
            public final void run() {
                MaterialFileBusiness.lambda$parseFunnyFile$14(com.taobao.taopai.material.maires.a.this);
            }
        });
    }

    public static /* synthetic */ void lambda$parseFunnyFile$13(com.taobao.taopai.material.maires.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e959fde5", new Object[]{aVar});
        } else {
            aVar.a();
        }
    }

    public static /* synthetic */ void lambda$parseFunnyFile$14(com.taobao.taopai.material.maires.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0bf3304", new Object[]{aVar});
        } else {
            aVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a4, code lost:
        if (r8[0].getName().endsWith(tb.qbs.c()) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isCacheInvalid(java.lang.String r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.taopai.material.request.materialfile.MaterialFileBusiness.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r8 = "50434fb4"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            com.taobao.taopai2.material.task.a r0 = com.taobao.taopai2.material.task.a.a()
            com.taobao.taopai.material.request.materialfile.b r1 = r7.mFileParams
            java.lang.String r1 = r1.j()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L2d
            return r3
        L2d:
            boolean r0 = android.text.StringUtils.isEmpty(r8)
            if (r0 == 0) goto L34
            return r3
        L34:
            com.taobao.taopai.material.request.materialfile.b r0 = r7.mFileParams
            java.lang.String r0 = r0.k()
            com.taobao.taopai.material.request.materialfile.b r1 = r7.mFileParams
            java.lang.String r1 = r1.j()
            com.taobao.taopai.material.request.materialfile.b r4 = r7.mFileParams
            int r4 = r4.i()
            com.taobao.taopai.material.request.materialfile.b r5 = r7.mFileParams
            long r5 = r5.l()
            boolean r0 = tb.qbr.a(r0, r1, r4, r5)
            if (r0 != 0) goto L53
            return r3
        L53:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            com.taobao.taopai.material.request.materialfile.b r8 = r7.mFileParams
            java.lang.String r8 = r8.m()
            boolean r8 = android.text.StringUtils.isEmpty(r8)
            if (r8 == 0) goto La7
            java.io.File[] r8 = r0.listFiles()
            if (r8 == 0) goto La6
            int r1 = r8.length
            if (r1 != 0) goto L6e
            goto La6
        L6e:
            com.taobao.taopai.material.request.materialfile.b r1 = r7.mFileParams
            java.lang.String r1 = r1.g()
            com.taobao.taopai.material.request.materialfile.b r4 = r7.mFileParams
            int r4 = r4.h()
            r5 = 7
            if (r4 != r5) goto L86
            boolean r4 = android.text.StringUtils.isEmpty(r1)
            if (r4 == 0) goto L86
            java.lang.String r1 = "marvel.json"
        L86:
            boolean r4 = android.text.StringUtils.isEmpty(r1)
            if (r4 != 0) goto L93
            boolean r8 = r7.isExistFile(r8, r1)
            if (r8 != 0) goto Lb8
            return r3
        L93:
            int r1 = r8.length
            if (r1 != r3) goto Lb8
            r8 = r8[r2]
            java.lang.String r8 = r8.getName()
            java.lang.String r1 = tb.qbs.c()
            boolean r8 = r8.endsWith(r1)
            if (r8 == 0) goto Lb8
        La6:
            return r3
        La7:
            java.lang.String r8 = r0.getPath()
            com.taobao.taopai.material.request.materialfile.b r1 = r7.mFileParams
            java.lang.String r1 = r1.m()
            boolean r8 = r8.endsWith(r1)
            if (r8 != 0) goto Lb8
            return r3
        Lb8:
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0.lastModified()
            long r4 = r4 - r0
            long r0 = r7.getCacheTime()
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto Lca
            return r3
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taopai.material.request.materialfile.MaterialFileBusiness.isCacheInvalid(java.lang.String):boolean");
    }

    private boolean isExistFile(File[] fileArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5dd8d0a", new Object[]{this, fileArr, str})).booleanValue();
        }
        for (File file : fileArr) {
            if (file.getName() != null && file.getName().endsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        qbq qbqVar = this.mDownloadTask;
        if (qbqVar == null) {
            return;
        }
        qbqVar.c();
        this.mDownloadTask.b();
    }
}
