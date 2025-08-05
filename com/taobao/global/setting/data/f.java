package com.taobao.global.setting.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.mtop.model.UserProfile;
import com.taobao.global.setting.mtop.response.UserProfileDataResponse;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ktb;
import tb.ktc;
import tb.ktf;
import tb.ktg;

/* loaded from: classes7.dex */
public class f implements ktb, ktc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ktf f17215a = new ktg();

    public static /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42fbd53e", new Object[]{fVar});
        } else {
            fVar.a();
        }
    }

    @Override // tb.ktb
    public void a(String str, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5903e56b", new Object[]{this, str, cVar});
        } else {
            this.f17215a.a(str, new IRemoteBaseListener() { // from class: com.taobao.global.setting.data.RemoteDataManager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    UserProfile simpleInfo = ((UserProfileDataResponse) baseOutDo).mo2429getData().getSimpleInfo();
                    if (simpleInfo == null) {
                        return;
                    }
                    String str2 = "Global_User_Profile" + Login.getUserId();
                    e.a().c(str2);
                    if (e.a().b()) {
                        e.a().b(str2, simpleInfo);
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(simpleInfo);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        onError(i, mtopResponse, obj);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    c cVar2 = cVar;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(c.ERROR_MTOP_SERVICE_EXCEPTION, mtopResponse.getRetMsg());
                }
            });
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e.a().c("Global_User_Profile" + Login.getUserId());
    }
}
