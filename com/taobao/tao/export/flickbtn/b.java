package com.taobao.tao.export.flickbtn;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.export.flickbtn.mtop.MtopTaobaoSharepasswordQueryEntryRequest;
import com.taobao.tao.export.flickbtn.mtop.MtopTaobaoSharepasswordQueryEntryResponse;
import com.taobao.tao.export.flickbtn.mtop.MtopTaobaoSharepasswordQueryEntryResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.utils.ShareMemoryCache;
import com.ut.share.utils.UIHandler;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nzt;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19919a;
    public String b;
    public String c;
    public String d;
    private boolean e;
    private MtopTaobaoSharepasswordQueryEntryResponseData f;
    private final FlickingShareButton g;

    static {
        kge.a(288712407);
    }

    public static /* synthetic */ MtopTaobaoSharepasswordQueryEntryResponseData a(b bVar, MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopTaobaoSharepasswordQueryEntryResponseData) ipChange.ipc$dispatch("ab0e0550", new Object[]{bVar, mtopTaobaoSharepasswordQueryEntryResponseData});
        }
        bVar.f = mtopTaobaoSharepasswordQueryEntryResponseData;
        return mtopTaobaoSharepasswordQueryEntryResponseData;
    }

    public b(FlickingShareButton flickingShareButton) {
        this.g = flickingShareButton;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "downgradeShareBtnAni", "false"));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f19919a) || this.f == null) {
        } else {
            HashMap hashMap = new HashMap();
            String shareIconType = this.f.getShareIconType();
            if (!StringUtils.isEmpty(shareIconType)) {
                hashMap.put("shareIconType", shareIconType);
            }
            String shareChannel = this.f.getShareChannel();
            if (!StringUtils.isEmpty(shareChannel)) {
                hashMap.put("shareChannel", shareChannel);
            }
            String shareUid = this.f.getShareUid();
            if (!StringUtils.isEmpty(shareUid)) {
                hashMap.put("shareUid", shareUid);
            }
            ShareMemoryCache.put(this.f19919a, hashMap, 1000L);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f19919a)) {
        } else {
            MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData = this.f;
            ShareBusiness.traceShareBtnClick(this.f19919a, this.b, mtopTaobaoSharepasswordQueryEntryResponseData == null ? null : mtopTaobaoSharepasswordQueryEntryResponseData.getExtendMap());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f19919a)) {
        } else {
            MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData = this.f;
            ShareBusiness.traceShareBtnExpose(this.f19919a, this.b, mtopTaobaoSharepasswordQueryEntryResponseData == null ? null : mtopTaobaoSharepasswordQueryEntryResponseData.getExtendMap());
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : !f() && !StringUtils.isEmpty(this.f19919a) && !StringUtils.isEmpty(this.d) && !StringUtils.isEmpty(this.c) && !this.e;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!d()) {
        } else {
            this.e = true;
            MtopTaobaoSharepasswordQueryEntryRequest mtopTaobaoSharepasswordQueryEntryRequest = new MtopTaobaoSharepasswordQueryEntryRequest();
            mtopTaobaoSharepasswordQueryEntryRequest.setBizcode(this.f19919a);
            mtopTaobaoSharepasswordQueryEntryRequest.setTargetType(this.d);
            mtopTaobaoSharepasswordQueryEntryRequest.setId(this.c);
            RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoSharepasswordQueryEntryRequest, nzt.b());
            build.registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.export.flickbtn.DXFlickingSharePresenter$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        final MtopTaobaoSharepasswordQueryEntryResponseData mo2429getData = ((MtopTaobaoSharepasswordQueryEntryResponse) baseOutDo).mo2429getData();
                        b.a(b.this, mo2429getData);
                        UIHandler.runMain(new Runnable() { // from class: com.taobao.tao.export.flickbtn.DXFlickingSharePresenter$1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                MtopTaobaoSharepasswordQueryEntryResponseData mtopTaobaoSharepasswordQueryEntryResponseData = mo2429getData;
                                if (mtopTaobaoSharepasswordQueryEntryResponseData == null || StringUtils.equals(mtopTaobaoSharepasswordQueryEntryResponseData.getShareIconType(), "commonIconType")) {
                                    return;
                                }
                                b bVar = b.this;
                                b.$ipChange.setCustomImageAndPlayAnim(mo2429getData.getIcon());
                            }
                        });
                        b.this.c();
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        b.this.c();
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        b.this.c();
                    }
                }
            });
            build.startRequest(MtopTaobaoSharepasswordQueryEntryResponse.class);
        }
    }
}
