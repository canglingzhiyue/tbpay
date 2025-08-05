package com.taobao.live.ubee.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.cgl;
import tb.kge;

/* loaded from: classes7.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-464777048);
    }

    public static void a(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Class<? extends BaseOutDo> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab80007", new Object[]{iMTOPDataObject, iRemoteBaseListener, cls});
        } else {
            a(iMTOPDataObject, iRemoteBaseListener, cls, false, false);
        }
    }

    public static void a(IMTOPDataObject iMTOPDataObject, IRemoteBaseListener iRemoteBaseListener, Class<? extends BaseOutDo> cls, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecce74c7", new Object[]{iMTOPDataObject, iRemoteBaseListener, cls, new Boolean(z), new Boolean(z2)});
        } else if (iRemoteBaseListener == null) {
        } else {
            MtopBusiness registerListener = MtopBusiness.build(Mtop.instance((String) null, cgl.g().a()), iMTOPDataObject).registerListener((IRemoteListener) new ABDyeRemoteBaseListener(iRemoteBaseListener));
            registerListener.mo1309setBizId(String.valueOf(59));
            if (z) {
                registerListener.mo1305reqMethod(MethodEnum.POST);
            }
            if (z2) {
                registerListener.mo1335useWua();
            }
            registerListener.startRequest(cls);
        }
    }
}
