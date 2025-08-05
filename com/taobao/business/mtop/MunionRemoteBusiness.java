package com.taobao.business.mtop;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class MunionRemoteBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Application mApplication;
    private Integer mBizId;
    private IRemoteBaseListener mMtopListener;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(1473414963);
    }

    public MunionRemoteBusiness(Application application) {
        this.mApplication = application;
    }

    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
        } else {
            this.mBizId = Integer.valueOf(str);
        }
    }

    public void startRequest(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f58ffc4", new Object[]{this, new Integer(i), iMTOPDataObject, cls});
        } else {
            startRequest(i, iMTOPDataObject, cls, this.mMtopListener);
        }
    }

    private void startRequest(int i, IMTOPDataObject iMTOPDataObject, Class<?> cls, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d26732", new Object[]{this, new Integer(i), iMTOPDataObject, cls, iRemoteBaseListener});
            return;
        }
        this.mRemoteBusiness = RemoteBusiness.build(this.mApplication, iMTOPDataObject, (String) null);
        this.mRemoteBusiness.mo1342showLoginUI(false);
        Integer num = this.mBizId;
        if (num != null) {
            this.mRemoteBusiness.mo1340setBizId(num.intValue());
        }
        if (iRemoteBaseListener != null) {
            this.mRemoteBusiness.registeListener((IRemoteListener) iRemoteBaseListener);
        }
        this.mRemoteBusiness.startRequest(i, cls);
    }

    public void registeListener(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("133d70ac", new Object[]{this, iRemoteBaseListener});
        } else {
            this.mMtopListener = iRemoteBaseListener;
        }
    }
}
