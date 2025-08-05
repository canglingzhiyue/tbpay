package com.taobao.live.home.dinamic.business;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.live.home.dinamic.model.TemplateObject;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mfg;
import tb.mfi;
import tb.mfj;
import tb.mfn;
import tb.mfo;

/* loaded from: classes7.dex */
public abstract class TemplateCardListOwner {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FULL = 1;
    public static final int REQUEST = 2;

    /* renamed from: a  reason: collision with root package name */
    private static List<TemplateObject> f17736a = new ArrayList();
    private static List<TemplateObject> b = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LoadTemplateMode {
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(String str);

        void a(List<TemplateObject> list);
    }

    public abstract TemplateRequest a();

    public abstract List<TemplateObject> a(String str);

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ String a(TemplateCardListOwner templateCardListOwner, TemplateRequest templateRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96e05b62", new Object[]{templateCardListOwner, templateRequest}) : templateCardListOwner.a(templateRequest);
    }

    public static /* synthetic */ List a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        f17736a = list;
        return list;
    }

    public static /* synthetic */ void a(TemplateCardListOwner templateCardListOwner, TemplateRequest templateRequest, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5dd2c9", new Object[]{templateCardListOwner, templateRequest, bVar});
        } else {
            templateCardListOwner.b(templateRequest, bVar);
        }
    }

    public static /* synthetic */ void a(TemplateCardListOwner templateCardListOwner, TemplateRequest templateRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9eb9b48", new Object[]{templateCardListOwner, templateRequest, str});
        } else {
            templateCardListOwner.a(templateRequest, str);
        }
    }

    public static /* synthetic */ List b(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b5ee42d", new Object[]{list});
        }
        b = list;
        return list;
    }

    public static /* synthetic */ List e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[0]) : b;
    }

    public List<TemplateObject> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str}) : a(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(1, (b) null);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a(i, (b) null);
        }
    }

    public void a(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("821e548c", new Object[]{this, new Integer(i), bVar});
            return;
        }
        f();
        TemplateRequest a2 = a();
        if (a2 == null) {
            mfj.c("TemplateCardListOwner", "TemplateRequest is Null");
            if (bVar == null) {
                return;
            }
            bVar.a("TemplateRequest is Null");
        } else if (!mfn.a(f17736a)) {
            mfj.b("TemplateCardListOwner", "loadTemplateFromMemory success");
            if (bVar != null) {
                bVar.a(f17736a);
            }
            if (i == 2) {
                return;
            }
            b(a2, bVar);
        } else {
            a(a2, new a(a2, i, bVar));
        }
    }

    /* loaded from: classes7.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private b b;
        private TemplateRequest c;
        private int d;

        public a(TemplateRequest templateRequest, int i, b bVar) {
            this.c = templateRequest;
            this.b = bVar;
            this.d = i;
        }

        @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner.b
        public void a(List<TemplateObject> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(list);
            }
            if (this.d == 2) {
                return;
            }
            TemplateCardListOwner.a(TemplateCardListOwner.this, this.c, this.b);
        }

        @Override // com.taobao.live.home.dinamic.business.TemplateCardListOwner.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(str);
            }
            TemplateCardListOwner.a(TemplateCardListOwner.this, this.c, this.b);
        }
    }

    public TemplateObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("c10161a6", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TemplateObject a2 = a(f17736a, str);
        return a2 == null ? a(b, str) : a2;
    }

    private TemplateObject a(List<TemplateObject> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateObject) ipChange.ipc$dispatch("bbac6815", new Object[]{this, list, str});
        }
        if (mfn.a(list)) {
            return null;
        }
        for (TemplateObject templateObject : list) {
            if (mfn.a(str, templateObject.name)) {
                return templateObject;
            }
        }
        return null;
    }

    public List<TemplateObject> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this}) : f17736a;
    }

    private void a(final TemplateRequest templateRequest, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b48414", new Object[]{this, templateRequest, bVar});
            return;
        }
        mfj.c("TemplateCardListOwner", "loadTemplateFromFile 0");
        Coordinator.postTask(new Coordinator.TaggedRunnable("loadTemplate") { // from class: com.taobao.live.home.dinamic.business.TemplateCardListOwner.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mfj.c("TemplateCardListOwner", "loadTemplateFromFile 1");
                Object a2 = mfi.a(TemplateCardListOwner.a(TemplateCardListOwner.this, templateRequest));
                if (a2 instanceof String) {
                    List<TemplateObject> list = null;
                    try {
                        list = TemplateCardListOwner.this.a((String) a2);
                    } catch (Exception unused) {
                    }
                    if (!mfn.a(list)) {
                        TemplateCardListOwner.a(list);
                        mfj.c("TemplateCardListOwner", "loadTemplateFromFile 1");
                        mfg.a().b("com.taobao.live.home.template_list_ready");
                        b bVar2 = bVar;
                        if (bVar2 == null) {
                            return;
                        }
                        bVar2.a(list);
                        return;
                    }
                }
                mfj.c("TemplateCardListOwner", "dxTemplate localCache fail");
                b bVar3 = bVar;
                if (bVar3 == null) {
                    return;
                }
                bVar3.a("No file cache");
            }
        });
    }

    private void b(final TemplateRequest templateRequest, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec63c8d5", new Object[]{this, templateRequest, bVar});
            return;
        }
        mfj.c("TemplateCardListOwner", "loadTemplateFromRemote 0");
        com.taobao.taolive.uikit.mtop.a aVar = new com.taobao.taolive.uikit.mtop.a(new IRemoteBaseListener() { // from class: com.taobao.live.home.dinamic.business.TemplateCardListOwner.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                b bVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("dxTemplate Mtop response fail, onSystemError MtopResponse:");
                sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
                mfj.c("TemplateCardListOwner", sb.toString());
                if (mtopResponse == null || (bVar2 = bVar) == null) {
                    return;
                }
                bVar2.a(mtopResponse.getRetMsg());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null && mtopResponse.getBytedata() != null) {
                    String str = new String(mtopResponse.getBytedata());
                    if (!TextUtils.isEmpty(str)) {
                        List<TemplateObject> list = null;
                        try {
                            list = TemplateCardListOwner.this.a(str);
                        } catch (Exception e) {
                            mfj.a("TemplateCardListOwner", "dxTemplate Mtop response success, parse template list exp", e);
                        }
                        if (!mfn.a(list)) {
                            mfj.c("TemplateCardListOwner", "loadTemplateFromRemote 1");
                            TemplateCardListOwner.a(list);
                            mfj.b("TemplateCardListOwner", "dxTemplate Mtop response success: onSuccess " + mtopResponse.getApi());
                            mfg.a().b("com.taobao.live.home.template_list_ready");
                            b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.a(list);
                            }
                            TemplateCardListOwner.a(TemplateCardListOwner.this, templateRequest, str);
                            return;
                        }
                    }
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a("Remote template load error");
                }
                mfj.c("TemplateCardListOwner", "dxTemplate Mtop response success: onSuccess errorMsg: Remote template load error");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                b bVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("dxTemplate Mtop response fail, onSystemError MtopResponse:");
                sb.append(mtopResponse != null ? mtopResponse.toString() : "null");
                mfj.c("TemplateCardListOwner", sb.toString());
                if (mtopResponse == null || (bVar2 = bVar) == null) {
                    return;
                }
                bVar2.a(mtopResponse.getRetMsg());
            }
        });
        mfj.b("TemplateCardListOwner", "dxTemplate Mtop request start, requestInfo:" + templateRequest.toString());
        aVar.a(100, templateRequest, null);
    }

    private String a(TemplateRequest templateRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7a147ed", new Object[]{this, templateRequest}) : templateRequest != null ? mfo.a(templateRequest.toString()) : "";
    }

    private void a(final TemplateRequest templateRequest, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c148401d", new Object[]{this, templateRequest, str});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("cacheTemplate") { // from class: com.taobao.live.home.dinamic.business.TemplateCardListOwner.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        mfi.a(TemplateCardListOwner.a(TemplateCardListOwner.this, templateRequest), str);
                    }
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        mfj.c("TemplateCardListOwner", "loadBailoutTemplateInternal 0");
        if (!mfn.a(b)) {
            mfj.c("TemplateCardListOwner", "loadBailoutTemplateInternal 1");
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("loadBailoutTemplate") { // from class: com.taobao.live.home.dinamic.business.TemplateCardListOwner.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        TemplateCardListOwner.b(TemplateCardListOwner.this.b(TemplateCardListOwner.this.b()));
                    } catch (Exception e) {
                        mfj.a("TemplateCardListOwner", "loadBailoutTemplateInternal parse template list exp.", e);
                    }
                    mfj.c("TemplateCardListOwner", "loadBailoutTemplateInternal 2");
                    if (!mfn.a(TemplateCardListOwner.e())) {
                        return;
                    }
                    mfj.c("TemplateCardListOwner", "load bailout template list error.");
                }
            });
        }
    }
}
