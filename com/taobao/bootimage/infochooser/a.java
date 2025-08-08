package com.taobao.bootimage.infochooser;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageBrandCreativeJson;
import com.taobao.bootimage.data.BootImageBrandHubInfo;
import com.taobao.bootimage.data.BootImageBrandHubRequest;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.data.BootImageInfoBrandResponse;
import com.taobao.bootimage.f;
import com.taobao.bootimage.infochooser.a;
import com.taobao.bootimage.infochooser.b;
import com.taobao.login4android.api.Login;
import com.taobao.munion.taosdk.CpmIfsCommitter;
import com.taobao.munion.taosdk.MunionCommitterFactory;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import tb.kej;
import tb.kek;
import tb.kem;
import tb.kge;

/* loaded from: classes6.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f16686a;
    private boolean b;
    private BootImageBrandHubInfo c;
    private boolean d = false;

    /* renamed from: com.taobao.bootimage.infochooser.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0638a {
        void a(List<BootImageBrandHubInfo> list, int i, String str);
    }

    static {
        kge.a(-1941988108);
        kge.a(973626783);
    }

    public static /* synthetic */ BootImageBrandHubInfo a(a aVar, BootImageBrandHubInfo bootImageBrandHubInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageBrandHubInfo) ipChange.ipc$dispatch("b7fd3cef", new Object[]{aVar, bootImageBrandHubInfo});
        }
        aVar.c = bootImageBrandHubInfo;
        return bootImageBrandHubInfo;
    }

    public static /* synthetic */ BootImageInfo a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("c34845e1", new Object[]{aVar, str}) : aVar.a(str);
    }

    public a(boolean z) {
        this.b = z;
    }

    @Override // com.taobao.bootimage.infochooser.b
    public void a(final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efba1433", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (!Login.checkSessionValid()) {
                kej.a(kem.TAG, "没有登录");
                aVar.a(null, 101, "没有登录");
            } else if (!a()) {
                kej.a(kem.TAG, "本地没有合适的品牌广告");
                aVar.a(null, 102, "没有有效的品牌广告");
            } else {
                kej.a(kem.TAG, "开始请求brand接口");
                a(new InterfaceC0638a() { // from class: com.taobao.bootimage.infochooser.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.bootimage.infochooser.a.InterfaceC0638a
                    public void a(List<BootImageBrandHubInfo> list, int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f121c014", new Object[]{this, list, new Integer(i), str});
                            return;
                        }
                        kej.a(kem.TAG, "请求brand结果 code:" + i + ",msg:" + str);
                        if (i != 0 || list == null || list.size() <= 0) {
                            kej.a(kem.TAG, "接口没有返回可用的品牌广告contentId");
                            aVar.a(null, 104, "无可显示的品牌广告");
                            return;
                        }
                        Iterator<BootImageBrandHubInfo> it = list.iterator();
                        BootImageInfo bootImageInfo = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            BootImageBrandHubInfo next = it.next();
                            if (next.getCreativeJson() != null) {
                                String str2 = next.getCreativeJson().feedid;
                                if (!StringUtils.isEmpty(str2) && (bootImageInfo = a.a(a.this, str2)) != null) {
                                    a.a(a.this, next);
                                    break;
                                }
                            }
                        }
                        if (bootImageInfo != null) {
                            kej.a(kem.TAG, "request find valid info");
                            aVar.a(bootImageInfo, 0, ResultCode.MSG_SUCCESS);
                            return;
                        }
                        kej.a(kem.TAG, "request no find valid info");
                        aVar.a(null, 103, "没找到合适的Info");
                    }
                });
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        BootImageData f = BootImageDataMgr.a().f();
        if (f != null && f.result != null && f.result.size() > 0) {
            for (BootImageInfo bootImageInfo : f.result) {
                if (bootImageInfo.getFromType() == BootImageInfo.FromType.BRAND && kek.a(bootImageInfo, this.f16686a, this.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    private BootImageInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("720da3d8", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        BootImageData f = BootImageDataMgr.a().f();
        if (f != null && f.result != null && f.result.size() > 0) {
            for (BootImageInfo bootImageInfo : f.result) {
                if (bootImageInfo.getFromType() == BootImageInfo.FromType.BRAND && StringUtils.equals(str, bootImageInfo.contentId) && kek.a(bootImageInfo, this.f16686a, this.b)) {
                    return bootImageInfo;
                }
            }
        } else {
            kej.a(kem.TAG, "findBrandImageInfoWithContentId 本地的投放列表为空");
        }
        return null;
    }

    private void a(final InterfaceC0638a interfaceC0638a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee053b94", new Object[]{this, interfaceC0638a});
            return;
        }
        BootImageBrandHubRequest bootImageBrandHubRequest = new BootImageBrandHubRequest();
        if (!kem.a().h()) {
            bootImageBrandHubRequest.API_NAME = "mtop.alimama.brandhub.get";
        }
        bootImageBrandHubRequest.userNick = Login.getNick();
        bootImageBrandHubRequest.itemIds = f.b().getSharedPreferences(BootImageDataMgr.CACHE_MODULE, 0).getString("itemIds", "");
        RemoteBusiness.build((IMTOPDataObject) bootImageBrandHubRequest).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.bootimage.infochooser.BootImageBrandInfoChooser$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a.InterfaceC0638a interfaceC0638a2 = interfaceC0638a;
                if (interfaceC0638a2 == null) {
                    return;
                }
                interfaceC0638a2.a(null, 105, "系统错误");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || !mtopResponse.isApiSuccess() || mtopResponse.getBytedata() == null) {
                    kej.a(kem.TAG, "update bootimage failed: mtop data");
                    interfaceC0638a.a(null, 108, "brandhub接口请求失败");
                } else {
                    kej.a(kem.TAG, InputFrame3.TYPE_RESPONSE + mtopResponse.getDataJsonObject());
                    BootImageInfoBrandResponse bootImageInfoBrandResponse = (BootImageInfoBrandResponse) MtopConvert.convertMtopResponseToOutputDO(mtopResponse, BootImageInfoBrandResponse.class);
                    if (bootImageInfoBrandResponse != null && bootImageInfoBrandResponse.mo2429getData() != null && bootImageInfoBrandResponse.mo2429getData().model != null) {
                        interfaceC0638a.a(bootImageInfoBrandResponse.mo2429getData().model, 0, ResultCode.MSG_SUCCESS);
                    } else {
                        interfaceC0638a.a(null, 106, "model转换失败");
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                a.InterfaceC0638a interfaceC0638a2 = interfaceC0638a;
                if (interfaceC0638a2 == null) {
                    return;
                }
                interfaceC0638a2.a(null, 107, "网络请求失败");
            }
        }).startRequest();
    }

    @Override // com.taobao.bootimage.infochooser.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        BootImageBrandHubInfo bootImageBrandHubInfo = this.c;
        if (bootImageBrandHubInfo != null && bootImageBrandHubInfo.getCreativeJson() != null && !StringUtils.isEmpty(this.c.getCreativeJson().ifs) && !StringUtils.isEmpty(this.c.bidid)) {
            kej.a(kem.TAG, "ifs埋点上报成功");
            MunionCommitterFactory.createIfsCommitter(f.b(), CpmIfsCommitter.class).commitEvent(this.c.bidid, this.c.getCreativeJson().ifs);
            return;
        }
        kej.a(kem.TAG, "ifs埋点上报失败");
    }

    @Override // com.taobao.bootimage.infochooser.b
    public Properties c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Properties) ipChange.ipc$dispatch("ec83bba8", new Object[]{this});
        }
        if (this.c == null) {
            return null;
        }
        Properties properties = new Properties();
        if (!StringUtils.isEmpty(this.c.bidid)) {
            properties.setProperty("bidid", this.c.bidid);
        }
        BootImageBrandCreativeJson creativeJson = this.c.getCreativeJson();
        if (creativeJson != null && !StringUtils.isEmpty(creativeJson.feedid)) {
            properties.setProperty("feedid", creativeJson.feedid);
        }
        return properties;
    }
}
