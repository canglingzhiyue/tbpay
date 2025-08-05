package com.taobao.tao.remotebusiness;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class RemoteBusiness extends MtopBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2053758959);
    }

    public static /* synthetic */ Object ipc$super(RemoteBusiness remoteBusiness, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1931929077:
                return super.registerListener((IRemoteListener) objArr[0]);
            case -1497372228:
                return super.mo1341setErrorNotifyAfterCache(((Boolean) objArr[0]).booleanValue());
            case -1208834137:
                return super.mo1342showLoginUI(((Boolean) objArr[0]).booleanValue());
            case 417391968:
                return super.mo1338reqContext(objArr[0]);
            case 781246143:
                return super.mo1337addListener((MtopListener) objArr[0]);
            case 940088749:
                return super.mo1339retryTime(((Number) objArr[0]).intValue());
            case 1096526948:
                return super.mo1340setBizId(((Number) objArr[0]).intValue());
            case 1554030333:
                return super.registerListener((MtopListener) objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public RemoteBusiness(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        super(mtop, iMTOPDataObject, str);
    }

    public RemoteBusiness(Mtop mtop, MtopRequest mtopRequest, String str) {
        super(mtop, mtopRequest, str);
    }

    @Deprecated
    public static void init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
        } else {
            Mtop.instance(context, str);
        }
    }

    public static RemoteBusiness build(IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("d69745f9", new Object[]{iMTOPDataObject, str}) : new RemoteBusiness(Mtop.instance((Context) null, str), iMTOPDataObject, str);
    }

    public static RemoteBusiness build(IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("be1048c3", new Object[]{iMTOPDataObject}) : build(iMTOPDataObject, (String) null);
    }

    public static RemoteBusiness build(MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("d091bbc6", new Object[]{mtopRequest, str}) : new RemoteBusiness(Mtop.instance((Context) null, str), mtopRequest, str);
    }

    public static RemoteBusiness build(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("cf9587d0", new Object[]{mtopRequest}) : build(mtopRequest, (String) null);
    }

    @Deprecated
    public static RemoteBusiness build(Context context, IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("9d51a077", new Object[]{context, iMTOPDataObject, str});
        }
        init(context, str);
        return build(iMTOPDataObject, str);
    }

    @Deprecated
    public static RemoteBusiness build(Context context, MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("af290544", new Object[]{context, mtopRequest, str});
        }
        init(context, str);
        return build(mtopRequest, str);
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness
    @Deprecated
    /* renamed from: setErrorNotifyAfterCache  reason: collision with other method in class */
    public RemoteBusiness mo1341setErrorNotifyAfterCache(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("f38e46be", new Object[]{this, new Boolean(z)}) : (RemoteBusiness) super.mo1341setErrorNotifyAfterCache(z);
    }

    @Deprecated
    public RemoteBusiness registeListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("1fb52f33", new Object[]{this, mtopListener}) : (RemoteBusiness) super.registerListener(mtopListener);
    }

    @Deprecated
    public RemoteBusiness registeListener(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("fcc3dc59", new Object[]{this, iRemoteListener}) : (RemoteBusiness) super.registerListener(iRemoteListener);
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness, mtopsdk.mtop.intf.MtopBuilder
    /* renamed from: retryTime  reason: collision with other method in class */
    public RemoteBusiness mo1339retryTime(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("5579c26f", new Object[]{this, new Integer(i)}) : (RemoteBusiness) super.mo1339retryTime(i);
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness
    @Deprecated
    /* renamed from: showLoginUI  reason: collision with other method in class */
    public RemoteBusiness mo1342showLoginUI(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("830935e9", new Object[]{this, new Boolean(z)}) : (RemoteBusiness) super.mo1342showLoginUI(z);
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness, mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    /* renamed from: setBizId  reason: collision with other method in class */
    public RemoteBusiness mo1340setBizId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("5643ff66", new Object[]{this, new Integer(i)}) : (RemoteBusiness) super.mo1340setBizId(i);
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness, mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    /* renamed from: addListener  reason: collision with other method in class */
    public RemoteBusiness mo1337addListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("caf60701", new Object[]{this, mtopListener}) : (RemoteBusiness) super.mo1337addListener(mtopListener);
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness
    @Deprecated
    public void setErrorNotifyNeedAfterCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8462a42", new Object[]{this, new Boolean(z)});
        } else {
            super.mo1341setErrorNotifyAfterCache(z);
        }
    }

    @Override // com.taobao.tao.remotebusiness.MtopBusiness, mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    /* renamed from: reqContext  reason: collision with other method in class */
    public RemoteBusiness mo1338reqContext(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("615ee962", new Object[]{this, obj}) : (RemoteBusiness) super.mo1338reqContext(obj);
    }
}
