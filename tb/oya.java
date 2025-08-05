package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateRequest;
import com.taobao.taobao.scancode.encode.longtoshort.data.ComTaobaoXcodeQrcodeCreateResponse;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes8.dex */
public class oya {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32476a = "bundle";

    static {
        kge.a(1707146969);
    }

    public void a(String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934bf004", new Object[]{this, str, iRemoteBaseListener});
        } else if (TextUtils.isEmpty(str) || iRemoteBaseListener == null) {
        } else {
            oys.a().a("Encode_REQ_getShorturl");
            ComTaobaoXcodeQrcodeCreateRequest comTaobaoXcodeQrcodeCreateRequest = new ComTaobaoXcodeQrcodeCreateRequest();
            comTaobaoXcodeQrcodeCreateRequest.setContent(str);
            comTaobaoXcodeQrcodeCreateRequest.setBizCode(this.f32476a);
            RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) comTaobaoXcodeQrcodeCreateRequest).registeListener((MtopListener) iRemoteBaseListener);
            registeListener.mo1305reqMethod(MethodEnum.POST);
            registeListener.startRequest(ComTaobaoXcodeQrcodeCreateResponse.class);
        }
    }
}
