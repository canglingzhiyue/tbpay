package com.taobao.android.detail.wrapper.ext.event.subscriber.fav;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.detail.core.utils.n;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.ecg;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.fcx;
import tb.fcy;
import tb.ffl;
import tb.ffm;
import tb.ffo;
import tb.kge;

/* loaded from: classes5.dex */
public class DoFavSubscriber implements j<fcx>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DoFavSubscriber";
    public DetailCoreActivity mActivity;
    public String NET_ERROR = b.a(R.string.x_detail_app_network_error);
    public String UNKNOW_ERR = b.a(R.string.x_detail_app_busy_system_tired);
    public String ADD_COLLECT_SUCCESS = b.a(R.string.x_detail_app_congratulations_collection_success);
    public String REMOVE_COLLECT_SUCCESS = b.a(R.string.x_detail_app_cancel_collection_success);

    static {
        kge.a(-1984882457);
        kge.a(-1453870097);
        kge.a(1028243835);
    }

    public DoFavSubscriber(DetailCoreActivity detailCoreActivity) {
        this.mActivity = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.fav.DoFavSubscriber");
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(fcx fcxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("84b269e1", new Object[]{this, fcxVar});
        }
        if (fcxVar == null) {
            return a.FAILURE;
        }
        com.taobao.android.detail.core.event.params.b bVar = fcxVar.f27812a;
        if (bVar.f9715a) {
            msoaAddFav(bVar);
        } else {
            msoaDelFav(bVar);
        }
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void msoaAddFav(final com.taobao.android.detail.core.event.params.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb9daf5", new Object[]{this, bVar});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("itemId", bVar.b);
        com.taobao.android.detail.core.utils.i.a(TAG, "msoaAddFav");
        ecg.b(this.mActivity, "add_favorite", hashMap);
        c.a().a(new ffl("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.fav.DoFavSubscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "msoaAddFav onSuccess");
                if (map != null && map.containsKey("addResult") && ((Boolean) map.get("addResult")).booleanValue()) {
                    f.a(DoFavSubscriber.this.mActivity, new fcy(CollectionParams.DONE));
                    n.a("AddCollectItem");
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.put("itemId", bVar.b);
                    hashMap2.put("x", Integer.valueOf(bVar.e));
                    hashMap2.put("y", Integer.valueOf(bVar.f));
                    if (!bVar.c) {
                        return;
                    }
                    ecg.b(DoFavSubscriber.this.mActivity, "show_category", hashMap2);
                    if (!b.c()) {
                        c.a().a(new ffo(null, hashMap2), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.fav.DoFavSubscriber.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                            public void onSuccess(Map<String, Object> map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("93e51c7a", new Object[]{this, map2});
                                    return;
                                }
                                if (map2 != null && map2.containsKey(aw.PARAM_ACTIVITY_URL) && !StringUtils.isEmpty((String) map2.get(aw.PARAM_ACTIVITY_URL))) {
                                    String str = (String) map2.get(aw.PARAM_ACTIVITY_URL);
                                    if (DoFavSubscriber.this.mActivity.hasWindowFocus()) {
                                        epj.f().navigateTo(DoFavSubscriber.this.mActivity, str, null);
                                    }
                                } else {
                                    epo.a(DoFavSubscriber.this.ADD_COLLECT_SUCCESS);
                                }
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("requestParam", hashMap2);
                                hashMap3.put(InputFrame3.TYPE_RESPONSE, map2);
                                ecg.b(DoFavSubscriber.this.mActivity, "show_category", hashMap3);
                            }

                            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                            public void onFail(String str, String str2, boolean z, Map<String, Object> map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map2});
                                    return;
                                }
                                epo.a(DoFavSubscriber.this.ADD_COLLECT_SUCCESS);
                                ecg.i(DoFavSubscriber.this.mActivity, bVar.b, str, str2);
                                ecg.c(DoFavSubscriber.this.mActivity, "show_category", str, str2, hashMap2);
                            }
                        });
                    }
                } else {
                    epo.a(DoFavSubscriber.this.UNKNOW_ERR);
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("requestParam", hashMap);
                hashMap3.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.b(DoFavSubscriber.this.mActivity, "add_favorite", hashMap3);
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "msoaAddFav onFail");
                n.a("AddCollectItem", "80003", str2);
                f.a(DoFavSubscriber.this.mActivity, new fcy(CollectionParams.NORMAL));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestParam", hashMap);
                hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.c(DoFavSubscriber.this.mActivity, "add_favorite", str, str2, hashMap2);
                ecg.j(DoFavSubscriber.this.mActivity, bVar.b, str, str2);
                if (!StringUtils.isEmpty(str2) && z) {
                    if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                        epo.a(b.a(R.string.x_detail_app_not_login));
                        com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "收藏失败，没有登陆");
                        return;
                    }
                    epo.a(str2);
                    com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "收藏失败," + str2);
                    return;
                }
                epo.a(DoFavSubscriber.this.UNKNOW_ERR);
                com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "收藏失败,原因未知");
            }
        });
    }

    private void msoaDelFav(final com.taobao.android.detail.core.event.params.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4ef2df", new Object[]{this, bVar});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("itemId", bVar.b);
        ecg.b(this.mActivity, "cancel_favorite", hashMap);
        c.a().a(new ffm("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.fav.DoFavSubscriber.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                if (map != null && map.containsKey("deleteResult") && ((Boolean) map.get("deleteResult")).booleanValue()) {
                    epo.a(DoFavSubscriber.this.REMOVE_COLLECT_SUCCESS);
                    f.a(DoFavSubscriber.this.mActivity, new fcy(CollectionParams.NORMAL));
                    n.a("DelCollectItem");
                } else {
                    epo.a(DoFavSubscriber.this.UNKNOW_ERR);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestParam", hashMap);
                hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.b(DoFavSubscriber.this.mActivity, "cancel_favorite", hashMap2);
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                f.a(DoFavSubscriber.this.mActivity, new fcy(CollectionParams.DONE));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestParam", hashMap);
                hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.c(DoFavSubscriber.this.mActivity, "cancel_favorite", str, str2, hashMap2);
                ecg.k(DoFavSubscriber.this.mActivity, bVar.b, str, str2);
                n.a("DelCollectItem", "80004", str2);
                if (!StringUtils.isEmpty(str2) && z) {
                    if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                        epo.a(b.a(R.string.x_detail_app_not_login));
                        com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "取消收藏失败,没有登录");
                        return;
                    }
                    epo.a(str2);
                    com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "取消收藏失败" + str2);
                    return;
                }
                epo.a(DoFavSubscriber.this.UNKNOW_ERR);
                com.taobao.android.detail.core.utils.i.a(DoFavSubscriber.TAG, "取消收藏失败,原因未知");
            }
        });
    }
}
