package com.taobao.android.detail.ttdetail.skeleton.navbar.search.search;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchRequestParams;
import com.taobao.android.detail.ttdetail.utils.ao;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class SearchInfoController {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context d;
    private com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.a e;
    private a f;
    private boolean g;
    private b i;

    /* renamed from: a  reason: collision with root package name */
    private final String f10933a = "SearchInfoController";
    private Handler b = new Handler(Looper.getMainLooper());
    private boolean h = false;

    /* loaded from: classes5.dex */
    public interface a {
        void a(b bVar);
    }

    static {
        kge.a(106551650);
    }

    public static /* synthetic */ Handler a(SearchInfoController searchInfoController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ca9e706f", new Object[]{searchInfoController}) : searchInfoController.b;
    }

    public static /* synthetic */ b a(SearchInfoController searchInfoController, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("7dada2df", new Object[]{searchInfoController, bVar});
        }
        searchInfoController.i = bVar;
        return bVar;
    }

    public static /* synthetic */ b b(SearchInfoController searchInfoController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d2e32edd", new Object[]{searchInfoController}) : searchInfoController.i;
    }

    public static /* synthetic */ void b(SearchInfoController searchInfoController, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abd3f73", new Object[]{searchInfoController, bVar});
        } else {
            searchInfoController.a(bVar);
        }
    }

    public SearchInfoController(Context context, Boolean bool) {
        this.d = context;
        this.g = bool.booleanValue();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        SearchRequestParams.Params params = new SearchRequestParams.Params();
        params.itemId = str;
        params.utdid = UTDevice.getUtdid(this.d);
        params.userId = ao.a();
        params.nick = ao.b();
        params.ttid = e.c();
        params.area = "detail_hintq_new";
        SearchRequestParams searchRequestParams = new SearchRequestParams();
        searchRequestParams.appId = "35522";
        searchRequestParams.params = params;
        this.e = new com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.a(searchRequestParams);
        this.e.a(new SearchRequestCallback());
    }

    /* loaded from: classes5.dex */
    public class SearchRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1121326922);
            kge.a(-525336021);
        }

        private void reportMtopError(boolean z, MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6709be6", new Object[]{this, new Boolean(z), mtopResponse});
            }
        }

        private SearchRequestCallback() {
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else {
                bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController.SearchRequestCallback.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        final b a2 = b.a(mtopResponse);
                        SearchInfoController.a(SearchInfoController.this).post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController.SearchRequestCallback.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                boolean z = false;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (a2 != null) {
                                    z = true;
                                }
                                SearchInfoController.a(SearchInfoController.this, a2);
                                if (!z) {
                                    return;
                                }
                                SearchInfoController.b(SearchInfoController.this, a2);
                            }
                        });
                    }
                });
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                reportMtopError(false, mtopResponse);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                reportMtopError(true, mtopResponse);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.g) {
        } else {
            if (this.i != null) {
                Context context = this.d;
                if (!(context instanceof Activity)) {
                    return;
                }
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        SearchInfoController searchInfoController = SearchInfoController.this;
                        SearchInfoController.b(searchInfoController, SearchInfoController.b(searchInfoController));
                    }
                });
            } else if (this.h) {
            } else {
                this.h = true;
                this.e.k();
            }
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74909e85", new Object[]{this, bVar});
            return;
        }
        a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.a(bVar);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e2b5a", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }
}
