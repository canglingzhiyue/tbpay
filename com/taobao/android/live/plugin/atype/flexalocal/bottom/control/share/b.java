package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnResponse;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnResponseData;
import com.taobao.android.live.plugin.proxy.bottom.IBottomProxy;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.pmd;

/* loaded from: classes5.dex */
public class b implements IBottomProxy.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVE_SHARE_ACTION_INFO_PARAMS = "liveShareActionInfoParams";

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f13590a = new HashSet();

    static {
        kge.a(688352096);
        kge.a(-1300183396);
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            q.b("ShareFission", "[shareFissionReturn] url is empty");
        } else if (TextUtils.isEmpty(str2)) {
            q.b("ShareFission", "[shareFissionReturn] liveId is empty");
        } else {
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put(LIVE_SHARE_ACTION_INFO_PARAMS, parse.getQueryParameter(LIVE_SHARE_ACTION_INFO_PARAMS));
            a(hashMap, str2);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.bottom.IBottomProxy.a
    public void a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
        } else if (map == null) {
            q.b("ShareFission", "[shareFissionReturn] params is empty");
        } else if (TextUtils.isEmpty(str)) {
            q.b("ShareFission", "[shareFissionReturn] liveId is empty");
        } else {
            if (this.f13590a == null) {
                this.f13590a = new HashSet();
            }
            String str2 = map.get(LIVE_SHARE_ACTION_INFO_PARAMS);
            if (TextUtils.isEmpty(str2)) {
                q.b("ShareFission", "[shareFissionReturn] liveShareActionInfoParams is empty");
            } else if (this.f13590a.contains(str2)) {
            } else {
                ShareReturnRequest shareReturnRequest = new ShareReturnRequest();
                shareReturnRequest.setParams(str2);
                try {
                    shareReturnRequest.setLiveId(Long.parseLong(str));
                } catch (NumberFormatException unused) {
                }
                new com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.b(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                            return;
                        }
                        q.b("ShareFission", "[onSuccess]  type: " + i);
                        if (!(netBaseOutDo instanceof ShareReturnResponse) || !(netBaseOutDo.mo1437getData() instanceof ShareReturnResponseData)) {
                            return;
                        }
                        ShareReturnResponseData shareReturnResponseData = (ShareReturnResponseData) netBaseOutDo.mo1437getData();
                        if (shareReturnResponseData != null && "true".equals(shareReturnResponseData.result) && !TextUtils.isEmpty(shareReturnResponseData.toast)) {
                            Toast.makeText(pmd.a().u().c(), TextUtils.isEmpty(shareReturnResponseData.toast) ? "助力成功" : shareReturnResponseData.toast, 1).show();
                            q.b("ShareFission", "[onSuccess]  showToast  data.result: " + shareReturnResponseData.result + ", data.toast: " + shareReturnResponseData.toast);
                            return;
                        }
                        Toast.makeText(pmd.a().u().c(), TextUtils.isEmpty(shareReturnResponseData.toast) ? "助力失败" : shareReturnResponseData.toast, 1).show();
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                            return;
                        }
                        q.b("ShareFission", "[onError]  type: " + i);
                    }

                    @Override // com.taobao.taolive.sdk.adapter.network.d
                    public void onSystemError(int i, NetResponse netResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        } else {
                            onError(i, netResponse, obj);
                        }
                    }
                }).a(shareReturnRequest);
                this.f13590a.add(str2);
            }
        }
    }
}
