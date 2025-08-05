package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.activity.base.BaseActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.detail.core.event.video.c;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fdb implements j<eoh> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27818a;
    private ITrackAdapter b;
    private String c = b.a(R.string.x_detail_app_busy_system_tired);

    static {
        kge.a(-1770127908);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(fdb fdbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("19f1c3ff", new Object[]{fdbVar}) : fdbVar.f27818a;
    }

    public static /* synthetic */ ITrackAdapter b(fdb fdbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrackAdapter) ipChange.ipc$dispatch("377f121b", new Object[]{fdbVar}) : fdbVar.b;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eoh eohVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eohVar}) : a(eohVar);
    }

    public fdb(DetailCoreActivity detailCoreActivity) {
        this.f27818a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.UpdateItemIdSubscriber");
    }

    public i a(eoh eohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("92976b55", new Object[]{this, eohVar});
        }
        dya y = this.f27818a.y();
        this.b = epj.j();
        a(y, eohVar);
        com.taobao.android.detail.core.utils.i.d("UpdateItemIdSubscriber", "remoteRefresh finish");
        c.a((Context) this.f27818a, (com.taobao.android.trade.event.c) null, false);
        return a.SUCCESS;
    }

    private void a(final dya dyaVar, final eoh eohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c936d9e", new Object[]{this, dyaVar, eohVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DetailCoreActivity.DETAIL_ITEM_ID, eohVar.a());
        if (eohVar.b() != null && eohVar.b().f10058a != null) {
            List<String> list = eohVar.b().f10058a;
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(str);
                sb.append(";");
            }
            hashMap.put("pvStr", sb.toString());
        }
        hashMap.put("appReqFrom", "detail");
        hashMap.put("params", eohVar.c());
        dyaVar.a(new e.c() { // from class: tb.fdb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                fdb fdbVar = fdb.this;
                fdbVar.a(mtopResponse, fdb.a(fdbVar));
            }

            @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
            public void a(enh enhVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e72cc599", new Object[]{this, enhVar});
                } else if (enhVar == null || enhVar.b == null) {
                } else {
                    if (fdb.b(fdb.this) != null) {
                        fdb.b(fdb.this).pageLeave(fdb.a(fdb.this), fdb.a(fdb.this).aa(), null);
                        fdb.b(fdb.this).pageEnter(fdb.a(fdb.this), fdb.a(fdb.this).aa(), fdb.a(fdb.this).ab(), null);
                    }
                    String m = enhVar.c.f27459a.m();
                    String a2 = eohVar.a();
                    if (!TextUtils.isEmpty(m)) {
                        dyaVar.a(a2, eqf.a(m, "spm", "a2141.7631564"));
                        return;
                    }
                    String h = enhVar.c.f27459a.h();
                    HashMap hashMap2 = new HashMap();
                    dyaVar.f.b(eohVar.a());
                    hashMap2.put("item_id", a2);
                    hashMap2.put("seller_id", h);
                    hashMap2.put("spm", "a2141.7631564");
                    eps.a((Activity) fdb.a(fdb.this), fdb.a(fdb.this).aa(), (Map<String, String>) hashMap2);
                    dyaVar.a(enhVar.c, false);
                    if (fdb.a(fdb.this) instanceof DetailActivity) {
                        DetailActivity detailActivity = (DetailActivity) fdb.a(fdb.this);
                        if (detailActivity.v != null) {
                            detailActivity.v.j();
                            detailActivity.v.i();
                            detailActivity.v.b(detailActivity.b());
                        }
                    }
                    if (dyaVar.f.l) {
                        f.a(fdb.a(fdb.this), new fcy(CollectionParams.DONE));
                        return;
                    }
                    final HashMap hashMap3 = new HashMap();
                    hashMap3.put("itemId", a2);
                    ecg.b(fdb.a(fdb.this), "check_collect", hashMap3);
                    com.taobao.android.msoa.c.a().a(new ffn("taobao_detail", hashMap3), new MSOAServiceListener() { // from class: tb.fdb.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                        public void onSuccess(Map<String, Object> map) {
                            Boolean bool;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("93e51c7a", new Object[]{this, map});
                                return;
                            }
                            if (map != null && map.containsKey("isFavorite") && (bool = (Boolean) map.get("isFavorite")) != null) {
                                if (bool.booleanValue()) {
                                    f.a(fdb.a(fdb.this), new fcy(CollectionParams.DONE));
                                } else {
                                    f.a(fdb.a(fdb.this), new fcy(CollectionParams.NORMAL));
                                }
                            }
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("requestParam", hashMap3);
                            hashMap4.put(InputFrame3.TYPE_RESPONSE, map);
                            ecg.b(fdb.a(fdb.this), "check_collect", hashMap4);
                        }

                        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                        public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                                return;
                            }
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("requestParam", hashMap3);
                            hashMap4.put(InputFrame3.TYPE_RESPONSE, map);
                            ecg.b(eohVar.a(), str2, str3);
                            ecg.c(fdb.a(fdb.this), "check_collect", str2, str3, hashMap4);
                        }
                    });
                }
            }
        }, hashMap);
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public boolean a(MtopResponse mtopResponse, BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db408649", new Object[]{this, mtopResponse, baseActivity})).booleanValue();
        }
        if (mtopResponse == null) {
            epo.a(this.c);
            return true;
        } else if (mtopResponse.isApiSuccess()) {
            return false;
        } else {
            if (mtopResponse.isSessionInvalid()) {
                return true;
            }
            if (mtopResponse.isNetworkError() && !NetworkUtils.a(epo.a())) {
                com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = new com.taobao.android.detail.core.detail.kit.view.widget.base.a(baseActivity, baseActivity);
                aVar.a((String) null);
                aVar.a();
                return true;
            }
            epo.a(b.a(R.string.x_detail_app_busy_system_tired));
            return true;
        }
    }
}
